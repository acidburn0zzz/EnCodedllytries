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

package com.codenvy.analytics.metrics;

import java.util.Map;

/** @author <a href="mailto:abazko@codenvy.com">Anatoliy Bazko</a> */
public enum MetricFilter {
    WS,
    USER,
    DOMAIN,
    COMPANY,

    ORG_ID,
    AFFILIATE_ID,
    REFERRER,
    CONVERTED_FACTORY_SESSION,
    AUTHENTICATED_FACTORY_SESSION;


    /** Puts value into execution context */
    public void put(Map<String, String> context, String value) {
        context.put(name(), value);
    }

    /** Gets value from execution context */
    public String get(Map<String, String> context) {
        return context.get(name());
    }

    /** @return true if context contains given parameter */
    public boolean exists(Map<String, String> context) {
        return context.get(name()) != null;
    }
}

