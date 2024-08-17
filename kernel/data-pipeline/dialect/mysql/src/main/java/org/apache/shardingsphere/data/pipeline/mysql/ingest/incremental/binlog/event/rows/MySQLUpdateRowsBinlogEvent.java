/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.mysql.ingest.incremental.binlog.event.rows;

import lombok.Getter;

import java.io.Serializable;
import java.util.List;

/**
 * MySQL update rows binlog event.
 */
@Getter
public final class MySQLUpdateRowsBinlogEvent extends MySQLBaseRowsBinlogEvent {
    
    private final List<Serializable[]> beforeRows;
    
    private final List<Serializable[]> afterRows;
    
    public MySQLUpdateRowsBinlogEvent(final String databaseName, final String tableName, final List<Serializable[]> beforeRows, final List<Serializable[]> afterRows) {
        super(databaseName, tableName);
        this.beforeRows = beforeRows;
        this.afterRows = afterRows;
    }
}
