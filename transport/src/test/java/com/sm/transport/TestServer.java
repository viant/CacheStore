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

package com.sm.transport;

import com.sm.transport.netty.ServerHandler;
import com.sm.transport.netty.TCPServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestServer {
    private static Log logger = LogFactory.getLog(TestServer.class);

    public static void main(String[] main){
        TCPServer s =  TCPServer.start(7120, new ServerHandler());
        logger.info(s.toString());
    }
}
