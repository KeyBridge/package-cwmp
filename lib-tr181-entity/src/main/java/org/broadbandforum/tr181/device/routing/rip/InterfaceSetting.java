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
package org.broadbandforum.tr181.device.routing.rip;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * IP Interface RIP configuration table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.

        Note: This object only applies to RIP2; i.e. version 2 of the RIP protocol is used to accept or send over the specified {{param|Interface}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Routing.RIP.InterfaceSetting.{i}.")
public class InterfaceSetting {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * When set to {{true}}, RIP route advertisements received over {{param|Interface}} are accepted.

          When set to {{false}}, RIP route advertisements received over {{param|Interface}} are rejected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AcceptRA")
	@CWMPParameter(access = "readWrite")
	public Boolean acceptRA;
	/**
	 * When set to {{true}}, RIP route advertisements are to be sent over {{param|Interface}}.

          When set to {{false}}, no RIP route advertisements will be sent over {{param|Interface}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SendRA")
	@CWMPParameter(access = "readWrite")
	public Boolean sendRA;

	public InterfaceSetting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public InterfaceSetting withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public InterfaceSetting withStatus(String status) {
		this.status = status;
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
	public InterfaceSetting withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public InterfaceSetting with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the when set to {{true}}, RIP route advertisements received over {{param|Interface}} are accepted.

          When set to {{false}}, RIP route advertisements received over {{param|Interface}} are rejected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAcceptRA() {
		return acceptRA;
	}

	/**
	 * Set the when set to {{true}}, RIP route advertisements received over {{param|Interface}} are accepted.

          When set to {{false}}, RIP route advertisements received over {{param|Interface}} are rejected.
	 *
	 * @since 2.0
	 * @param acceptRA the input value
	 */
	public void  setAcceptRA(Boolean acceptRA) {
		this.acceptRA = acceptRA;
	}

	/**
	 * Set the when set to {{true}}, RIP route advertisements received over {{param|Interface}} are accepted.

          When set to {{false}}, RIP route advertisements received over {{param|Interface}} are rejected.
	 *
	 * @since 2.0
	 * @param acceptRA the input value
	 * @return this instance
	 */
	public InterfaceSetting withAcceptRA(Boolean acceptRA) {
		this.acceptRA = acceptRA;
		return this;
	}

	/**
	 * Get the when set to {{true}}, RIP route advertisements are to be sent over {{param|Interface}}.

          When set to {{false}}, no RIP route advertisements will be sent over {{param|Interface}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSendRA() {
		return sendRA;
	}

	/**
	 * Set the when set to {{true}}, RIP route advertisements are to be sent over {{param|Interface}}.

          When set to {{false}}, no RIP route advertisements will be sent over {{param|Interface}}.
	 *
	 * @since 2.0
	 * @param sendRA the input value
	 */
	public void  setSendRA(Boolean sendRA) {
		this.sendRA = sendRA;
	}

	/**
	 * Set the when set to {{true}}, RIP route advertisements are to be sent over {{param|Interface}}.

          When set to {{false}}, no RIP route advertisements will be sent over {{param|Interface}}.
	 *
	 * @since 2.0
	 * @param sendRA the input value
	 * @return this instance
	 */
	public InterfaceSetting withSendRA(Boolean sendRA) {
		this.sendRA = sendRA;
		return this;
	}

	//</editor-fold>

}