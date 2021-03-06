/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.rest.metrics;

import org.apache.hadoop.hbase.metrics.BaseMetricsSource;

/**
 * Interface of the Metrics Source that will export data to Hadoop's Metrics2 system.
 */
public interface RESTMetricsSource extends BaseMetricsSource {

  public static String METRICS_NAME = "Rest";

  public static String CONTEXT = "rest";

  public static String JMX_CONTEXT = "Rest";

  public static String METRICS_DESCRIPTION = "Metrics about the HBase REST server";

  static String REQUEST_KEY = "requests";

  static String SUCCESSFUL_GET_KEY = "successfulGet";

  static String SUCCESSFUL_PUT_KEY = "successfulPut";

  static String SUCCESSFUL_DELETE_KEY = "successfulDelete";

  static String FAILED_GET_KEY = "failedGet";

  static String FAILED_PUT_KEY = "failedPut";

  static String FAILED_DELETE_KEY = "failedDelete";

  /**
   * Increment the number of requests
   * @param inc Ammount to increment by
   */
  void incrementRequests(int inc);

  /**
   * Increment the number of successful Get requests.
   * @param inc Number of successful get requests.
   */
  void incrementSucessfulGetRequests(int inc);

  /**
   * Increment the number of successful Put requests.
   * @param inc Number of successful put requests.
   */
  void incrementSucessfulPutRequests(int inc);

  /**
   * Increment the number of successful Delete requests.
   * @param inc
   */
  void incrementSucessfulDeleteRequests(int inc);

  /**
   * Increment the number of failed Put Requests.
   * @param inc Number of failed Put requests.
   */
  void incrementFailedPutRequests(int inc);

  /**
   * Increment the number of failed Get requests.
   * @param inc The number of failed Get Requests.
   */
  void incrementFailedGetRequests(int inc);

  /**
   * Increment the number of failed Delete requests.
   * @param inc The number of failed delete requests.
   */
  void incrementFailedDeleteRequests(int inc);
}
