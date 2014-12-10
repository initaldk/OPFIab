/*
 * Copyright 2012-2014 One Platform Foundation
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

package org.onepf.opfiab.model.response;

import android.support.annotation.NonNull;

import org.onepf.opfiab.model.billing.Purchase;

public abstract class PurchaseResponse extends Response {

    @NonNull
    private final Purchase purchase;

    public PurchaseResponse(@NonNull final Status status, @NonNull final Purchase purchase) {
        super(Type.PURCHASE, status);
        this.purchase = purchase;
    }

    @NonNull
    public Purchase getPurchase() {
        return purchase;
    }
}
