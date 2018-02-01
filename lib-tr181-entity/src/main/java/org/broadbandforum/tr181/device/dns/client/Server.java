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
package org.broadbandforum.tr181.device.dns.client;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * This table contains the DNS Server IP address to be used by the DHCP Client (it does ''not'' model a DNS Server). Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.Client.Server.{i}.")
public class Server {

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
	 * DNS server IP addresses.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServer")
	@CWMPParameter(access = "readWrite")
	public IPAddress dnsServer;
	/**
	 * {{reference}} This parameter specifies the IP interface over which the DNS query is sent.

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Method used to assign the {{param|DNSServer}} address.  {{enum}}

          Table entries that are automatically created as result of DHCP, IPCP, or RA received DNS server information will have {{param}} set to {{enum|DHCPv4}}, {{enum|DHCPv6}}, {{enum|IPCP}}, or {{enum|RouterAdvertisement}}, as the case may be. Manually created table entires will have their {{param}} set to {{enum|Static}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type = "Static";

	public Server() {
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
	public Server withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

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

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Server withStatus(String status) {
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
	public Server withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the dns server IP addresses.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getDnsServer() {
		return dnsServer;
	}

	/**
	 * Set the dns server IP addresses.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @param dnsServer the input value
	 */
	public void  setDnsServer(IPAddress dnsServer) {
		this.dnsServer = dnsServer;
	}

	/**
	 * Set the dns server IP addresses.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @param dnsServer the input value
	 * @return this instance
	 */
	public Server withDnsServer(IPAddress dnsServer) {
		this.dnsServer = dnsServer;
		return this;
	}

	/**
	 * Get the {{reference}} This parameter specifies the IP interface over which the DNS query is sent.

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} This parameter specifies the IP interface over which the DNS query is sent.

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} This parameter specifies the IP interface over which the DNS query is sent.

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.

          Note: {{param}} is only writable when {{param|Type}} is {{enum|Static|Type}}; otherwise, {{param}} is automatically configured as result of DHCP, IPCP, or RA received DNS server information.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Server with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the method used to assign the {{param|DNSServer}} address.  {{enum}}

          Table entries that are automatically created as result of DHCP, IPCP, or RA received DNS server information will have {{param}} set to {{enum|DHCPv4}}, {{enum|DHCPv6}}, {{enum|IPCP}}, or {{enum|RouterAdvertisement}}, as the case may be. Manually created table entires will have their {{param}} set to {{enum|Static}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the method used to assign the {{param|DNSServer}} address.  {{enum}}

          Table entries that are automatically created as result of DHCP, IPCP, or RA received DNS server information will have {{param}} set to {{enum|DHCPv4}}, {{enum|DHCPv6}}, {{enum|IPCP}}, or {{enum|RouterAdvertisement}}, as the case may be. Manually created table entires will have their {{param}} set to {{enum|Static}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the method used to assign the {{param|DNSServer}} address.  {{enum}}

          Table entries that are automatically created as result of DHCP, IPCP, or RA received DNS server information will have {{param}} set to {{enum|DHCPv4}}, {{enum|DHCPv6}}, {{enum|IPCP}}, or {{enum|RouterAdvertisement}}, as the case may be. Manually created table entires will have their {{param}} set to {{enum|Static}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Server withType(String type) {
		this.type = type;
		return this;
	}

	//</editor-fold>

}