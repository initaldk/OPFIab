/*
 * Copyright 2012-2015 One Platform Foundation
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

package org.onepf.opfiab.model.event.billing;

public enum Status {

    /**
     * Everything is OK.
     */
    SUCCESS,
    /**
     * Request was handled, but takes considerable time to process.
     */
    PENDING,
    /**
     * Billing provider requires authorisation.
     */
    UNAUTHORISED,
    /**
     * Library is busy with another request.
     */
    BUSY,
    /**
     * User canceled billing request.
     */
    USER_CANCELED,
    /**
     * Billing provider reported it can't handle billing.
     */
    BILLING_UNAVAILABLE,
    /**
     * Library has no working billing provider.
     */
    NO_BILLING_PROVIDER,
    /**
     * Request can't be handled at a time.<br>
     * For example: connection is down.
     */
    SERVICE_UNAVAILABLE,
    /**
     * Requested sku is unavailable from current billing provider.
     */
    ITEM_UNAVAILABLE,
    /**
     * Item is already owned by user.<br>
     * If it's consumable - consume() must be called.
     */
    ITEM_ALREADY_OWNED,
    /**
     * For some reason billing provider refused to handle request.
     */
    UNKNOWN_ERROR,
}