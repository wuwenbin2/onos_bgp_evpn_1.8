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

package org.onosproject.incubator.net.evpnrouting;

import java.util.Collection;

import org.onosproject.store.Store;

/**
 * Unicast route store.
 */
public interface EvpnRouteStore
        extends Store<EvpnRouteEvent, EvpnRouteStoreDelegate> {

    /**
     * Adds or updates the given route in the store.
     *
     * @param route route to add or update
     */
    void updateEvpnRoute(EvpnRoute route);

    /**
     * Removes the given route from the store.
     *
     * @param route route to remove
     */
    void removeEvpnRoute(EvpnRoute route);

    Collection<EvpnRoute> getEvpnRoutes();

}
