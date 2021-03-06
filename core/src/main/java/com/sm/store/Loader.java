/*
 *
 *  * Copyright 2012-2015 Viant.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License. You may obtain a copy of
 *  * the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 *
 */

package com.sm.store;


import com.sm.message.Invoker;
import com.sm.store.loader.ServiceClass;

import java.util.concurrent.ConcurrentMap;

public interface Loader {
    /**
     *
     * @param className
     * @return instance of ServiceClass
     */
    public Object loadClass(ConcurrentMap<String, ServiceClass> serviceMap, String className);

    /**
     *
     * @param serviceClass
     * @param invoker
     * @return
     */
    public Object invoke(ServiceClass serviceClass, Invoker invoker);

}
