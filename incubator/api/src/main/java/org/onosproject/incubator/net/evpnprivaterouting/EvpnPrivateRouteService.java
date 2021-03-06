/*
 * Copyright 2016-present Open Networking Laboratory
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
 */

package org.onosproject.incubator.net.evpnprivaterouting;

import java.util.Collection;

import org.onosproject.event.ListenerService;

/**
 * Unicast IP route service.
 */
public interface EvpnPrivateRouteService
        extends ListenerService<EvpnPrivateRouteEvent, EvpnPrivateRouteListener> {

    /**
     * Returns all routes for all route tables in the system.
     *
     * @return map of route table name to routes in that table
     */
    Collection<EvpnPrivateRoute> getAllRoutes();

}
