package org.codehaus.plexus.redback.authorization;

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
 * @author Jason van Zyl
 */
public class AuthorizationDataSource
{
    Object principal;

    User user;

    Object permission;

    Object resource;

    public AuthorizationDataSource( Object principal, User user, Object permission )
    {
        this.principal = principal;
        this.user = user;
        this.permission = permission;
    }

    public AuthorizationDataSource( Object principal, User user, Object permission, Object resource )
    {
        this.principal = principal;
        this.user = user;
        this.permission = permission;
        this.resource = resource;
    }

    public Object getPrincipal()
    {
        return principal;
    }

    public void setPrincipal( String principal )
    {
        this.principal = principal;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

    public Object getPermission()
    {
        return permission;
    }

    public void setPermission( Object permission )
    {
        this.permission = permission;
    }

    public Object getResource()
    {
        return resource;
    }

    public void setResource( Object resource )
    {
        this.resource = resource;
    }
}
