package org.codehaus.redback.integration.model;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.archiva.redback.users.User;

/**
 * AdminEditUserCredentials
 *
 * @author <a href="mailto:joakim@erdfelt.com">Joakim Erdfelt</a>
 * @version $Id$
 */
public class AdminEditUserCredentials
    extends EditUserCredentials
{
    private boolean locked;

    private boolean passwordChangeRequired;

    public AdminEditUserCredentials()
    {
        super();
    }

    public AdminEditUserCredentials( User user )
    {
        super( user );
        this.locked = user.isLocked();
        this.passwordChangeRequired = user.isPasswordChangeRequired();
    }

    public boolean isLocked()
    {
        return locked;
    }

    public void setLocked( boolean locked )
    {
        this.locked = locked;
    }

    public boolean isPasswordChangeRequired()
    {
        return passwordChangeRequired;
    }

    public void setPasswordChangeRequired( boolean passwordChangeRequired )
    {
        this.passwordChangeRequired = passwordChangeRequired;
    }
}
