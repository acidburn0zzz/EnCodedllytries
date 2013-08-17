/*
 *
 * CODENVY CONFIDENTIAL
 * ________________
 *
 * [2012] - [2013] Codenvy, S.A.
 * All Rights Reserved.
 * NOTICE: All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */


package com.codenvy.analytics.metrics.value;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/** @author <a href="mailto:abazko@codenvy.com">Anatoliy Bazko</a> */
public class MapStringFixedLongListValueData extends MapValueData<String, FixedListLongValueData> {

    public static final  MapStringFixedLongListValueData DEFAULT          =
            new MapStringFixedLongListValueData(new HashMap<String, FixedListLongValueData>(0));

    public MapStringFixedLongListValueData(ObjectInputStream in) throws IOException {
        super(readFrom(in));
    }

    public MapStringFixedLongListValueData(Map<String, FixedListLongValueData> value) {
        super(value);
    }

    /** {@inheritDoc} */
    @Override
    protected FixedListLongValueData unionValues(FixedListLongValueData v1, FixedListLongValueData v2) {
        return (FixedListLongValueData)v1.union(v2);
    }

    /** {@inheritDoc} */
    @Override
    protected ValueData createInstance(Map<String, FixedListLongValueData> value) {
        return new MapStringFixedLongListValueData(value);
    }

    /** {@inheritDoc} */
    @Override
    protected void writeKey(ObjectOutputStream out, String key) throws IOException {
        out.writeUTF(key);
    }

    /** {@inheritDoc} */
    @Override
    protected void writeValue(ObjectOutputStream out, FixedListLongValueData value) throws IOException {
        value.writeTo(out);
    }

    /** Deserialization. */
    private static Map<String, FixedListLongValueData> readFrom(ObjectInputStream in) throws IOException {
        int count = in.readInt();

        Map<String, FixedListLongValueData> result = new HashMap<>(count);
        for (int i = 0; i < count; i++) {
            result.put(in.readUTF(), new FixedListLongValueData(in));
        }

        return result;
    }
}
