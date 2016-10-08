/*
 * Copyright 2015-present Open Networking Laboratory
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

/**
 * Implementation of RouteDistinguisher.
 */
package org.onosproject.incubator.net.evpnrouting;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Objects;

import org.onosproject.net.ElementId;

/**
 * Represents Route Distinguisher of device in the network.
 */
public final class RouteDistinguisher  extends ElementId {
    private final String routeDistinguisher;

    /**
     * Constructor to initialize parameters.
     *
     * @param routeDistinguisher route distinguisher
     */
    private RouteDistinguisher(String routeDistinguisher) {
        this.routeDistinguisher = routeDistinguisher;
    }

    public static RouteDistinguisher routeDistinguisher(String routeDistinguisher) {
        return new RouteDistinguisher(routeDistinguisher);
    }

    public String getRouteDistinguisher() {
        return routeDistinguisher;
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeDistinguisher);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof RouteDistinguisher) {
            RouteDistinguisher other = (RouteDistinguisher) obj;
            return Objects.equals(routeDistinguisher, other.routeDistinguisher);
        }
        return false;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("routeDistinguisher", routeDistinguisher)
                .toString();
    }
}