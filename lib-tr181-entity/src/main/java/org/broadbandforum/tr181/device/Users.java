/*
 * Copyright 2018 Key Bridge.
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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.users.User;

	/**
	 * Users object that contains the {{object|User}} table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Users.")
@XmlRootElement(name = "Users")
@XmlType(name = "Device.Users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {

	/**
	 * This object contains parameters relating to the user characteristics.
	 */
	@XmlElementWrapper(name = "Users")
	@XmlElement(name = "User")
	@CWMPParameter(access = "readWrite")
	public Collection<User> users;

	public Users() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the user characteristics.
	 *
	 * @return the value
	 */
	public Collection<User> getUsers() {
		if (this.users == null){ this.users=new ArrayList<>();}
		return users;
	}

	/**
	 * Set the this object contains parameters relating to the user characteristics.
	 *
	 * @param users the input value
	 */
	public void  setUsers(Collection<User> users) {
		this.users = users;
	}

	/**
	 * Set the this object contains parameters relating to the user characteristics.
	 *
	 * @param user the input value
	 * @return this instance
	 */
	public Users withUser(User user) {
		getUsers().add(user);
		return this;
	}

	//</editor-fold>

}