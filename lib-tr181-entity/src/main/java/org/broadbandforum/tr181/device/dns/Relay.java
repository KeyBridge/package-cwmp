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
package org.broadbandforum.tr181.device.dns;

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
import org.broadbandforum.tr181.device.dns.relay.Forwarding;

	/**
	 * DNS Relay object. The DNS proxy (or relay) function allows the forwarding of local network DNS queries to local or external DNS server(s) {{bibref|RFC5625}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.Relay.")
@XmlRootElement(name = "Relay")
@XmlType(name = "Device.DNS.Relay")
@XmlAccessorType(XmlAccessType.FIELD)
public class Relay {

	/**
	 * Enables or disables the DNS Relay function.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the DNS relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * DNS Server forwarding policy to be used by the DNS Relay.  Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.

        Note: Management of re-directing queries to the device embedded DNS server is not defined in this version of the specification.
	 */
	@XmlElementWrapper(name = "Forwardings")
	@XmlElement(name = "Forwarding")
	@CWMPParameter(access = "readWrite")
	public Collection<Forwarding> forwardings;

	public Relay() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DNS Relay function.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DNS Relay function.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DNS Relay function.
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
	 * Get the status of the DNS relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the DNS relay. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the DNS relay. {{enum}}

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
	 * Get the dns Server forwarding policy to be used by the DNS Relay.  Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.

        Note: Management of re-directing queries to the device embedded DNS server is not defined in this version of the specification.
	 *
	 * @return the value
	 */
	public Collection<Forwarding> getForwardings() {
		if (this.forwardings == null){ this.forwardings=new ArrayList<>();}
		return forwardings;
	}

	/**
	 * Set the dns Server forwarding policy to be used by the DNS Relay.  Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.

        Note: Management of re-directing queries to the device embedded DNS server is not defined in this version of the specification.
	 *
	 * @param forwardings the input value
	 */
	public void  setForwardings(Collection<Forwarding> forwardings) {
		this.forwardings = forwardings;
	}

	/**
	 * Set the dns Server forwarding policy to be used by the DNS Relay.  Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.

        Note: Management of re-directing queries to the device embedded DNS server is not defined in this version of the specification.
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