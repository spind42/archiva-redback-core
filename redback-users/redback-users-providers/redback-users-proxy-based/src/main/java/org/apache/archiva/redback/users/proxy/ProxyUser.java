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

package org.apache.archiva.redback.users.proxy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.archiva.redback.users.User;

/**
 * TODO: das wird ein einfacher DB user sein...der beim login automatisch kreiert wird
 * 
 * @author {@literal Stephan Spindler <stephan@spindler.priv.at>}
 */
public class ProxyUser implements User {

    private String username;
    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String name) {
        
    }

    @Override
    public String getFullName() {
        return username;
    }

    @Override
    public void setFullName(String name) {
        
    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public void setEmail(String address) {
        
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword(String rawPassword) {
        
    }

    @Override
    public String getEncodedPassword() {
        return "";
    }

    @Override
    public void setEncodedPassword(String encodedPassword) {
        
    }

    @Override
    public Date getLastPasswordChange() {
        return new Date();
    }

    @Override
    public void setLastPasswordChange(Date passwordChangeDate) {
        
    }

    @Override
    public List<String> getPreviousEncodedPasswords() {
        return new ArrayList<String>();
    }

    @Override
    public void setPreviousEncodedPasswords(List<String> encodedPasswordList) {
        
    }

    @Override
    public void addPreviousEncodedPassword(String encodedPassword) {
        
    }

    @Override
    public boolean isPermanent() {
        return true;
    }

    @Override
    public void setPermanent(boolean permanent) {
        
    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public void setLocked(boolean locked) {
        
    }

    @Override
    public boolean isPasswordChangeRequired() {
        return false;
    }

    @Override
    public void setPasswordChangeRequired(boolean changeRequired) {
        
    }

    @Override
    public boolean isValidated() {
        return true;
    }

    @Override
    public void setValidated(boolean valid) {
        
    }

    @Override
    public int getCountFailedLoginAttempts() {
        return 0;
    }

    @Override
    public void setCountFailedLoginAttempts(int count) {
        
    }

    @Override
    public Date getAccountCreationDate() {
        return new Date();
    }

    @Override
    public void setAccountCreationDate(Date date) {
        
    }

    @Override
    public Date getLastLoginDate() {
        return new Date();
    }

    @Override
    public void setLastLoginDate(Date date) {
        
    }

    @Override
    public String getUserManagerId() {
        return ProxyUserManager.ID;
    }

}
