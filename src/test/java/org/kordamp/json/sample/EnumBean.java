/*
 * Copyright 2006-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This product includes software developed by Douglas Crockford
 * (http://www.crockford.com) and released under the Apache Software
 * License version 2.0 in 2006.
 */
package org.kordamp.json.sample;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Andres Almiray
 */
public class EnumBean {
    private JsonEnum jsonEnum;
    private String string;
    private Set<JsonEnum> enums = new HashSet<JsonEnum>();

    public JsonEnum getJsonEnum() {
        return jsonEnum;
    }

    public String getString() {
        return string;
    }

    public Set<JsonEnum> getEnums() {
        return enums;
    }

    public void setJsonEnum(JsonEnum jsonEnum) {
        this.jsonEnum = jsonEnum;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setEnums(Set<JsonEnum> enums) {
        this.enums = enums;
    }
}