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
package org.broadbandforum.tr262.fap.tunnel;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr262.datatypes.IPAddress;

	/**
	 * IKE IPsec Security Association Table. This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.Tunnel.IKESA.{i}.")
public class IKESA {

	/**
	 * The status of this IKE SA entry.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The IP address of the peer SecGW.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeerAddress")
	public IPAddress peerAddress;
	/**
	 * The time that the current IKE SA was set up.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CreationTime")
	public LocalDateTime creationTime;
	/**
	 * The current IP address assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public IPAddress ipaddress;
	/**
	 * The current subnet mask assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubnetMask")
	public String subnetMask;
	/**
	 * {{list}} Each item is an IP Address of a DNS server for this interface assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSServers")
	public IPAddress dnsServers;
	/**
	 * {{list}} Each item is an IP address of a DHCP server for this interface. 

A non empty list instructs the CPE to send any internal DHCP request to the address contained within this parameter.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPServers")
	public IPAddress dhcPServers;
	/**
	 * The number of inbound packets discarded by the IKE SA due to Integrity checking errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IntegrityErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long integrityErrors;
	/**
	 * The number of inbound packets discarded by the IKE SA due to other errors, such as anti-replay errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "OtherErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long otherErrors;
	/**
	 * The number of inbound packets discarded by the IKE SA due to authentication errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AuthErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long authErrors;

	public IKESA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this IKE SA entry.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this IKE SA entry.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this IKE SA entry.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public IKESA withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the IP address of the peer SecGW.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getPeerAddress() {
		return peerAddress;
	}

	/**
	 * Set the IP address of the peer SecGW.
	 *
	 * @since 1.0
	 * @param peerAddress the input value
	 */
	public void  setPeerAddress(IPAddress peerAddress) {
		this.peerAddress = peerAddress;
	}

	/**
	 * Set the IP address of the peer SecGW.
	 *
	 * @since 1.0
	 * @param peerAddress the input value
	 * @return this instance
	 */
	public IKESA withPeerAddress(IPAddress peerAddress) {
		this.peerAddress = peerAddress;
		return this;
	}

	/**
	 * Get the time that the current IKE SA was set up.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Set the time that the current IKE SA was set up.
	 *
	 * @since 1.0
	 * @param creationTime the input value
	 */
	public void  setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * Set the time that the current IKE SA was set up.
	 *
	 * @since 1.0
	 * @param creationTime the input value
	 * @return this instance
	 */
	public IKESA withCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	/**
	 * Get the current IP address assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the current IP address assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the current IP address assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IKESA withIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the current subnet mask assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the current subnet mask assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the current subnet mask assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public IKESA withSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an IP Address of a DNS server for this interface assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the {{list}} Each item is an IP Address of a DNS server for this interface assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the {{list}} Each item is an IP Address of a DNS server for this interface assigned to this interface by IKEv2.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public IKESA withDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an IP address of a DHCP server for this interface. 

A non empty list instructs the CPE to send any internal DHCP request to the address contained within this parameter.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDhcPServers() {
		return dhcPServers;
	}

	/**
	 * Set the {{list}} Each item is an IP address of a DHCP server for this interface. 

A non empty list instructs the CPE to send any internal DHCP request to the address contained within this parameter.
	 *
	 * @since 1.0
	 * @param dhcPServers the input value
	 */
	public void  setDhcPServers(IPAddress dhcPServers) {
		this.dhcPServers = dhcPServers;
	}

	/**
	 * Set the {{list}} Each item is an IP address of a DHCP server for this interface. 

A non empty list instructs the CPE to send any internal DHCP request to the address contained within this parameter.
	 *
	 * @since 1.0
	 * @param dhcPServers the input value
	 * @return this instance
	 */
	public IKESA withDhcPServers(IPAddress dhcPServers) {
		this.dhcPServers = dhcPServers;
		return this;
	}

	/**
	 * Get the number of inbound packets discarded by the IKE SA due to Integrity checking errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIntegrityErrors() {
		return integrityErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to Integrity checking errors.
	 *
	 * @since 1.0
	 * @param integrityErrors the input value
	 */
	public void  setIntegrityErrors(Long integrityErrors) {
		this.integrityErrors = integrityErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to Integrity checking errors.
	 *
	 * @since 1.0
	 * @param integrityErrors the input value
	 * @return this instance
	 */
	public IKESA withIntegrityErrors(Long integrityErrors) {
		this.integrityErrors = integrityErrors;
		return this;
	}

	/**
	 * Get the number of inbound packets discarded by the IKE SA due to other errors, such as anti-replay errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getOtherErrors() {
		return otherErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to other errors, such as anti-replay errors.
	 *
	 * @since 1.0
	 * @param otherErrors the input value
	 */
	public void  setOtherErrors(Long otherErrors) {
		this.otherErrors = otherErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to other errors, such as anti-replay errors.
	 *
	 * @since 1.0
	 * @param otherErrors the input value
	 * @return this instance
	 */
	public IKESA withOtherErrors(Long otherErrors) {
		this.otherErrors = otherErrors;
		return this;
	}

	/**
	 * Get the number of inbound packets discarded by the IKE SA due to authentication errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAuthErrors() {
		return authErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to authentication errors.
	 *
	 * @since 1.0
	 * @param authErrors the input value
	 */
	public void  setAuthErrors(Long authErrors) {
		this.authErrors = authErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the IKE SA due to authentication errors.
	 *
	 * @since 1.0
	 * @param authErrors the input value
	 * @return this instance
	 */
	public IKESA withAuthErrors(Long authErrors) {
		this.authErrors = authErrors;
		return this;
	}

	//</editor-fold>

}