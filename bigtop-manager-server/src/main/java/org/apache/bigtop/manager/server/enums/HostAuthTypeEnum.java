/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.bigtop.manager.server.enums;

import lombok.Getter;

@Getter
public enum HostAuthTypeEnum {
    PASSWORD(1),
    KEY(2),
    NO_AUTH(3),
    ;

    private final Integer code;

    HostAuthTypeEnum(Integer code) {
        this.code = code;
    }

    public static HostAuthTypeEnum fromCode(Integer code) {
        for (HostAuthTypeEnum status : HostAuthTypeEnum.values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }

        throw new IllegalArgumentException("Invalid HostAuthTypeEnum code: " + code);
    }
}
