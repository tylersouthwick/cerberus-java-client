/*
 * Copyright (c) 2018 Nike, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nike.cerberus.client.model;

import java.util.Map;
import java.util.Set;

/**
 * Represents an authentication client token response from Cerberus
 */
public class CerberusClientTokenResponse {

    private String id;

    private Set<String> policies;

    private String path;

    private Map<String, String> meta;

    private String displayName;

    private int numUses;

    public String getId() {
        return id;
    }

    public CerberusClientTokenResponse setId(String id) {
        this.id = id;
        return this;
    }

    public Set<String> getPolicies() {
        return policies;
    }

    public CerberusClientTokenResponse setPolicies(Set<String> policies) {
        this.policies = policies;
        return this;
    }

    public String getPath() {
        return path;
    }

    public CerberusClientTokenResponse setPath(String path) {
        this.path = path;
        return this;
    }

    public Map<String, String> getMeta() {
        return meta;
    }

    public CerberusClientTokenResponse setMeta(Map<String, String> meta) {
        this.meta = meta;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public CerberusClientTokenResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public int getNumUses() {
        return numUses;
    }

    public CerberusClientTokenResponse setNumUses(int numUses) {
        this.numUses = numUses;
        return this;
    }
}
