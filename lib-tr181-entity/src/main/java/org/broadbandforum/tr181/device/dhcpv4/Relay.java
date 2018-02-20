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
package org.broadbandforum.tr181.device.dhcpv4;

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
import org.broadbandforum.tr181.device.dhcpv4.relay.Forwarding;

	/**
	 * DHCP Relay Agent (conditional relaying).
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Relay.")
@XmlRootElement(name = "Device.DHCPv4.Relay")
@XmlType(name = "Device.DHCPv4.Relay")
@XmlAccessorType(XmlAccessType.FIELD)
public class Relay {

	/**
	 * Enables or disables the DHCP Relay Agent function.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the DHCP relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * DHCP Relay Agent Forwarding table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Forwardings")
	@XmlElement(name = "Forwarding")
	@CWMPParameter(access = "readWrite")
	public Collection<Forwarding> forwardings;

	public Relay() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCP Relay Agent function.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCP Relay Agent function.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCP Relay Agent function.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Relay withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the DHCP relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the DHCP relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the DHCP relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Relay withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the dhcP Relay Agent Forwarding table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Forwarding> getForwardings() {
		if (this.forwardings == null){ this.forwardings=new ArrayList<>();}
		return forwardings;
	}

	/**
	 * Set the dhcP Relay Agent Forwarding table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param forwardings the input value
	 */
	public void  setForwardings(Collection<Forwarding> forwardings) {
		this.forwardings = forwardings;
	}

	/**
	 * Set the dhcP Relay Agent Forwarding table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param forwarding the input value
	 * @return this instance
	 */
	public Relay withForwarding(Forwarding forwarding) {
		getForwardings().add(forwarding);
		return this;
	}

	//</editor-fold>

}