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
package org.apache.bigtop.manager.server.model.converter;

import org.apache.bigtop.manager.dao.po.ClusterPO;
import org.apache.bigtop.manager.server.config.MapStructSharedConfig;
import org.apache.bigtop.manager.server.model.dto.ClusterDTO;
import org.apache.bigtop.manager.server.model.dto.command.ClusterCommandDTO;
import org.apache.bigtop.manager.server.model.req.ClusterReq;
import org.apache.bigtop.manager.server.model.vo.ClusterVO;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = MapStructSharedConfig.class)
public interface ClusterConverter {

    ClusterConverter INSTANCE = Mappers.getMapper(ClusterConverter.class);

    ClusterDTO fromReq2DTO(ClusterReq clusterReq);

    ClusterDTO fromCommand2DTO(ClusterCommandDTO clusterCommandDTO);

    ClusterPO fromDTO2PO(ClusterDTO clusterDTO);

    ClusterDTO fromPO2DTO(ClusterPO clusterPO);

    ClusterVO fromPO2VO(ClusterPO clusterPO);

    List<ClusterVO> fromPO2VO(List<ClusterPO> clusterPOList);
}
