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
package org.broadbandforum.tr104.voiceservice.interwork;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Each table entry references a row in the {{object|.SIP.Registrar}} table to identify the User IP address and listening port for the Device and the Network to route calls to.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Interwork.{i}.UserInterface.{i}.")
@XmlRootElement(name = "VoiceService.Interwork.UserInterface")
@XmlType(name = "VoiceService.Interwork.UserInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInterface {

	/**
	 * Enable ({{true}}) or disable ({{false}}) {{object}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The {{object|.SIP.Registrar}} to use with this {{object|#}}. The value of {{param}} MUST be unique over all {{object|.Interwork.{i}.}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Registrar")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String registrar;
	/**
	 * If not null this provides the appropriate {{object|.SIP.Network}} to route calls from this User server to.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String network;

	public UserInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable ({{true}}) or disable ({{false}}) {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable ({{true}}) or disable ({{false}}) {{object}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable ({{true}}) or disable ({{false}}) {{object}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public UserInterface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public UserInterface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{object|.SIP.Registrar}} to use with this {{object|#}}. The value of {{param}} MUST be unique over all {{object|.Interwork.{i}.}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegistrar() {
		return registrar;
	}

	/**
	 * Set the {{object|.SIP.Registrar}} to use with this {{object|#}}. The value of {{param}} MUST be unique over all {{object|.Interwork.{i}.}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param registrar the input value
	 */
	public void  setRegistrar(String registrar) {
		this.registrar = registrar;
	}

	/**
	 * Set the {{object|.SIP.Registrar}} to use with this {{object|#}}. The value of {{param}} MUST be unique over all {{object|.Interwork.{i}.}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param registrar the input value
	 * @return this instance
	 */
	public UserInterface withRegistrar(String registrar) {
		this.registrar = registrar;
		return this;
	}

	/**
	 * Get the if not null this provides the appropriate {{object|.SIP.Network}} to route calls from this User server to.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * Set the if not null this provides the appropriate {{object|.SIP.Network}} to route calls from this User server to.

{{reference}}
	 *
	 * @since 2.0
	 * @param network the input value
	 */
	public void  setNetwork(String network) {
		this.network = network;
	}

	/**
	 * Set the if not null this provides the appropriate {{object|.SIP.Network}} to route calls from this User server to.

{{reference}}
	 *
	 * @since 2.0
	 * @param network the input value
	 * @return this instance
	 */
	public UserInterface withNetwork(String network) {
		this.network = network;
		return this;
	}

	//</editor-fold>

}