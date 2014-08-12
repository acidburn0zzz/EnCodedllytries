/*
 * CODENVY CONFIDENTIAL
 * __________________
 *
 *  [2012] - [2014] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.cdec.artifacts;

import com.codenvy.cdec.server.InstallationManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Anatoliy Bazko
 */
@Singleton
public class InstallManagerArtifact extends AbstractArtifact {
    public static final String NAME = "installation-manager";

    @Inject
    public InstallManagerArtifact() {
        super(NAME);
    }

    @Override
    public void install(Path pathToBinaries) throws IOException {
        unpack(pathToBinaries);

        // TODO LOG
    }

    // TODO move to abstract?
    private void unpack(Path pathToBinaries) throws IOException {
        Path unpackDir;
        try {
            unpackDir = getCurrentInstalledPath().resolve("update");
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }

        FileUtils.deleteDirectory(unpackDir.toFile());
        Files.createDirectories(unpackDir);

        try (ZipInputStream in = new ZipInputStream(Files.newInputStream(pathToBinaries))) {
            ZipEntry entry;
            while ((entry = in.getNextEntry()) != null) {
                FileUtils.copyInputStreamToFile(in, unpackDir.resolve(entry.getName()).toFile());
            }
        }
    }

    @Override
    public String getCurrentVersion() throws IOException {
        try (InputStream in = Artifact.class.getClassLoader().getResourceAsStream("codenvy/BuildInfo.properties")) {
            Properties props = new Properties();
            props.load(in);

            if (props.containsKey("version")) {
                return (String)props.get("version");
            } else {
                throw new IOException("Property version not found");
            }
        }
    }

    @Override
    public boolean isValidSubscriptionRequired() {
        return false;
    }

    private Path getCurrentInstalledPath() throws URISyntaxException {
        URL location = InstallationManager.class.getClass().getProtectionDomain().getCodeSource().getLocation();
        return Paths.get(location.toURI());
    }
}
