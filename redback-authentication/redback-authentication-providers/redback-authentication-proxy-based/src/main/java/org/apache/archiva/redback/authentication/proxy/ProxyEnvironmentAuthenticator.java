/*
 * Copyright 2016 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.archiva.redback.authentication.proxy;

import org.apache.archiva.redback.authentication.AbstractAuthenticator;
import org.apache.archiva.redback.authentication.AuthenticationDataSource;
import org.apache.archiva.redback.authentication.AuthenticationException;
import org.apache.archiva.redback.authentication.AuthenticationResult;
import org.apache.archiva.redback.authentication.Authenticator;
import org.apache.archiva.redback.policy.AccountLockedException;
import org.apache.archiva.redback.policy.MustChangePasswordException;

/**
 *
 * @author {@literal Stephan Spindler <stephan@spindler.priv.at>}
 */
public class ProxyEnvironmentAuthenticator 
    //extends AbstractAuthenticator
    implements Authenticator
{
    
    public final static String AUTHENTICATION_PROVIDER_ID = "Proxy Environment Authenticator";

    @Override
    public String getId() {
        return AUTHENTICATION_PROVIDER_ID;
    }

    @Override
    public boolean supportsDataSource(AuthenticationDataSource source) {
        return true;
    }

    @Override
    public AuthenticationResult authenticate(AuthenticationDataSource source) throws AccountLockedException, AuthenticationException, MustChangePasswordException {
        return new AuthenticationResult( true, source.getUsername(), null );
    }

    @Override
    public void initialize() throws AuthenticationException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
