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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Address;
import org.broadbandforum.tr181.device.dhcpv4.client.ReqOption;
import org.broadbandforum.tr181.device.dhcpv4.client.SentOption;

	/**
	 * This object contains DHCP client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Client.{i}.")
@XmlRootElement(name = "Client")
@XmlType(name = "Device.DHCPv4.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * Enables or disables the DHCP Client entry.
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
	 * {{reference}} The IP Interface associated with the ''Client'' entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * The DHCP Client status as defined in {{bibref|RFC2131}}. {{enum}}

          Note: This value is only relevant when the DHCP Client is operationally enabled (i.e. when {{param|Status}} is {{enum|Enabled|Status}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DHCPStatus")
	public String dhcPStatus;
	/**
	 * When set to {{true}}, the DHCP client will renew its DHCP lease.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Renew")
	@CWMPParameter(access = "readWrite")
	public Boolean renew = false;
	/**
	 * IPv4 Address option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddress")
	public IPv4Address ipaddress;
	/**
	 * Subnet mask option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMask")
	public IPv4Address subnetMask;
	/**
	 * {{list}} Items represent IP Router IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Options 3, 33 or 121.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPRouters")
	public IPv4Address iprouters;
	/**
	 * {{list}} Items represent DNS Server IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 6.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServers")
	public IPv4Address dnsServers;
	/**
	 * DHCP lease time remaining in seconds. A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTimeRemaining")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	@Size(min = -1)
	public Integer leaseTimeRemaining = 0;
	/**
	 * The IPv4 address of the current DHCP server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DHCPServer")
	public IPv4Address dhcPServer;
	/**
	 * If {{false}}, the DHCP Client retrieved IP address information is configured on the referenced  {{param|Interface}} object.

          If {{true}}, the DHCP Client retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PassthroughEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean passthroughEnable = false;
	/**
	 * {{reference}}When {{param}} is set to {{empty}}, {{param|PassthroughEnable}} MUST be set to {{false}} (i.e. passthrough can not be enabled without a pool reference specified).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PassthroughDHCPPool")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String passthroughDHCPPool;
	/**
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All  sent DHCP options MUST be listed.
	 */
	@XmlElementWrapper(name = "SentOptions")
	@XmlElement(name = "SentOption")
	@CWMPParameter(access = "readWrite")
	public Collection<SentOption> sentOptions;
	/**
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests.  All requested DHCP options MUST be listed.
	 */
	@XmlElementWrapper(name = "ReqOptions")
	@XmlElement(name = "ReqOption")
	@CWMPParameter(access = "readWrite")
	public Collection<ReqOption> reqOptions;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCP Client entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCP Client entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCP Client entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
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
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} The IP Interface associated with the ''Client'' entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Client'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Client'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Client with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the status of this table entry. {{enum}}

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
	 * Set the status of this table entry. {{enum}}

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
	 * Set the status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the DHCP Client status as defined in {{bibref|RFC2131}}. {{enum}}

          Note: This value is only relevant when the DHCP Client is operationally enabled (i.e. when {{param|Status}} is {{enum|Enabled|Status}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDhcPStatus() {
		return dhcPStatus;
	}

	/**
	 * Set the DHCP Client status as defined in {{bibref|RFC2131}}. {{enum}}

          Note: This value is only relevant when the DHCP Client is operationally enabled (i.e. when {{param|Status}} is {{enum|Enabled|Status}}).
	 *
	 * @since 2.0
	 * @param dhcPStatus the input value
	 */
	public void  setDhcPStatus(String dhcPStatus) {
		this.dhcPStatus = dhcPStatus;
	}

	/**
	 * Set the DHCP Client status as defined in {{bibref|RFC2131}}. {{enum}}

          Note: This value is only relevant when the DHCP Client is operationally enabled (i.e. when {{param|Status}} is {{enum|Enabled|Status}}).
	 *
	 * @since 2.0
	 * @param dhcPStatus the input value
	 * @return this instance
	 */
	public Client withDhcPStatus(String dhcPStatus) {
		this.dhcPStatus = dhcPStatus;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the DHCP client will renew its DHCP lease.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRenew() {
		return renew;
	}

	/**
	 * Set the when set to {{true}}, the DHCP client will renew its DHCP lease.
	 *
	 * @since 2.0
	 * @param renew the input value
	 */
	public void  setRenew(Boolean renew) {
		this.renew = renew;
	}

	/**
	 * Set the when set to {{true}}, the DHCP client will renew its DHCP lease.
	 *
	 * @since 2.0
	 * @param renew the input value
	 * @return this instance
	 */
	public Client withRenew(Boolean renew) {
		this.renew = renew;
		return this;
	}

	/**
	 * Get the ipv4 Address option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv4 Address option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv4 Address option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public Client withIpaddress(IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the subnet mask option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the subnet mask option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 1.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the subnet mask option received from the DHCP Server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 1.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public Client withSubnetMask(IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the {{list}} Items represent IP Router IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Options 3, 33 or 121.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getIprouters() {
		return iprouters;
	}

	/**
	 * Set the {{list}} Items represent IP Router IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Options 3, 33 or 121.
	 *
	 * @since 2.0
	 * @param iprouters the input value
	 */
	public void  setIprouters(IPv4Address iprouters) {
		this.iprouters = iprouters;
	}

	/**
	 * Set the {{list}} Items represent IP Router IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Options 3, 33 or 121.
	 *
	 * @since 2.0
	 * @param iprouters the input value
	 * @return this instance
	 */
	public Client withIprouters(IPv4Address iprouters) {
		this.iprouters = iprouters;
		return this;
	}

	/**
	 * Get the {{list}} Items represent DNS Server IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 6.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the {{list}} Items represent DNS Server IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 6.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the {{list}} Items represent DNS Server IPv4 Address(es) received from the DHCP server. {{empty}} when {{param|Status}} is not equal to {{enum|Bound|DHCPStatus}}.

          Value is information received via DHCP Option 6.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public Client withDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the dhcP lease time remaining in seconds. A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLeaseTimeRemaining() {
		return leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds. A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @param leaseTimeRemaining the input value
	 */
	public void  setLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds. A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @param leaseTimeRemaining the input value
	 * @return this instance
	 */
	public Client withLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
		return this;
	}

	/**
	 * Get the IPv4 address of the current DHCP server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDhcPServer() {
		return dhcPServer;
	}

	/**
	 * Set the IPv4 address of the current DHCP server.
	 *
	 * @since 2.0
	 * @param dhcPServer the input value
	 */
	public void  setDhcPServer(IPv4Address dhcPServer) {
		this.dhcPServer = dhcPServer;
	}

	/**
	 * Set the IPv4 address of the current DHCP server.
	 *
	 * @since 2.0
	 * @param dhcPServer the input value
	 * @return this instance
	 */
	public Client withDhcPServer(IPv4Address dhcPServer) {
		this.dhcPServer = dhcPServer;
		return this;
	}

	/**
	 * Get the if {{false}}, the DHCP Client retrieved IP address information is configured on the referenced  {{param|Interface}} object.

          If {{true}}, the DHCP Client retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPassthroughEnable() {
		return passthroughEnable;
	}

	/**
	 * Set the if {{false}}, the DHCP Client retrieved IP address information is configured on the referenced  {{param|Interface}} object.

          If {{true}}, the DHCP Client retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @param passthroughEnable the input value
	 */
	public void  setPassthroughEnable(Boolean passthroughEnable) {
		this.passthroughEnable = passthroughEnable;
	}

	/**
	 * Set the if {{false}}, the DHCP Client retrieved IP address information is configured on the referenced  {{param|Interface}} object.

          If {{true}}, the DHCP Client retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @param passthroughEnable the input value
	 * @return this instance
	 */
	public Client withPassthroughEnable(Boolean passthroughEnable) {
		this.passthroughEnable = passthroughEnable;
		return this;
	}

	/**
	 * Get the {{reference}}When {{param}} is set to {{empty}}, {{param|PassthroughEnable}} MUST be set to {{false}} (i.e. passthrough can not be enabled without a pool reference specified).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPassthroughDHCPPool() {
		return passthroughDHCPPool;
	}

	/**
	 * Set the {{reference}}When {{param}} is set to {{empty}}, {{param|PassthroughEnable}} MUST be set to {{false}} (i.e. passthrough can not be enabled without a pool reference specified).
	 *
	 * @since 2.0
	 * @param passthroughDHCPPool the input value
	 */
	public void  setPassthroughDHCPPool(String passthroughDHCPPool) {
		this.passthroughDHCPPool = passthroughDHCPPool;
	}

	/**
	 * Set the {{reference}}When {{param}} is set to {{empty}}, {{param|PassthroughEnable}} MUST be set to {{false}} (i.e. passthrough can not be enabled without a pool reference specified).
	 *
	 * @since 2.0
	 * @param passthroughDHCPPool the input value
	 * @return this instance
	 */
	public Client withPassthroughDHCPPool(String passthroughDHCPPool) {
		this.passthroughDHCPPool = passthroughDHCPPool;
		return this;
	}

	/**
	 * Get the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All  sent DHCP options MUST be listed.
	 *
	 * @return the value
	 */
	public Collection<SentOption> getSentOptions() {
		if (this.sentOptions == null){ this.sentOptions=new ArrayList<>();}
		return sentOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All  sent DHCP options MUST be listed.
	 *
	 * @param sentOptions the input value
	 */
	public void  setSentOptions(Collection<SentOption> sentOptions) {
		this.sentOptions = sentOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All  sent DHCP options MUST be listed.
	 *
	 * @param sentOption the input value
	 * @return this instance
	 */
	public Client withSentOption(SentOption sentOption) {
		getSentOptions().add(sentOption);
		return this;
	}

	/**
	 * Get the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests.  All requested DHCP options MUST be listed.
	 *
	 * @return the value
	 */
	public Collection<ReqOption> getReqOptions() {
		if (this.reqOptions == null){ this.reqOptions=new ArrayList<>();}
		return reqOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests.  All requested DHCP options MUST be listed.
	 *
	 * @param reqOptions the input value
	 */
	public void  setReqOptions(Collection<ReqOption> reqOptions) {
		this.reqOptions = reqOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests.  All requested DHCP options MUST be listed.
	 *
	 * @param reqOption the input value
	 * @return this instance
	 */
	public Client withReqOption(ReqOption reqOption) {
		getReqOptions().add(reqOption);
		return this;
	}

	//</editor-fold>

}