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
package org.broadbandforum.tr181.device.ppp._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.IPv4Address;

	/**
	 * IP Control Protocol (IPCP) client object for this PPP interface {{bibref|RFC1332}}. {{object}} only applies to IPv4.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.PPP.Interface.{i}.IPCP.")
@XmlRootElement(name = "Device.PPP.Interface.IPCP")
@XmlType(name = "Device.PPP.Interface.IPCP")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPCP {

	/**
	 * The local IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalIPAddress")
	public IPv4Address localIPAddress;
	/**
	 * The remote IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteIPAddress")
	public IPv4Address remoteIPAddress;
	/**
	 * {{list}} Items represent DNS Server IPv4 address(es) received via IPCP {{bibref|RFC1877}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServers")
	public IPv4Address dnsServers;
	/**
	 * If {{false}}, the PPP Interface retrieved information is configured on the IP Interface stacked on top of this PPP Interface.

          If {{true}}, the PPP Interface retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
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

	public IPCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the local IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getLocalIPAddress() {
		return localIPAddress;
	}

	/**
	 * Set the local IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @param localIPAddress the input value
	 */
	public void  setLocalIPAddress(IPv4Address localIPAddress) {
		this.localIPAddress = localIPAddress;
	}

	/**
	 * Set the local IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @param localIPAddress the input value
	 * @return this instance
	 */
	public IPCP withLocalIPAddress(IPv4Address localIPAddress) {
		this.localIPAddress = localIPAddress;
		return this;
	}

	/**
	 * Get the remote IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getRemoteIPAddress() {
		return remoteIPAddress;
	}

	/**
	 * Set the remote IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @param remoteIPAddress the input value
	 */
	public void  setRemoteIPAddress(IPv4Address remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
	}

	/**
	 * Set the remote IPv4 address for this connection received via IPCP.
	 *
	 * @since 2.0
	 * @param remoteIPAddress the input value
	 * @return this instance
	 */
	public IPCP withRemoteIPAddress(IPv4Address remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
		return this;
	}

	/**
	 * Get the {{list}} Items represent DNS Server IPv4 address(es) received via IPCP {{bibref|RFC1877}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the {{list}} Items represent DNS Server IPv4 address(es) received via IPCP {{bibref|RFC1877}}.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the {{list}} Items represent DNS Server IPv4 address(es) received via IPCP {{bibref|RFC1877}}.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public IPCP withDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the if {{false}}, the PPP Interface retrieved information is configured on the IP Interface stacked on top of this PPP Interface.

          If {{true}}, the PPP Interface retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPassthroughEnable() {
		return passthroughEnable;
	}

	/**
	 * Set the if {{false}}, the PPP Interface retrieved information is configured on the IP Interface stacked on top of this PPP Interface.

          If {{true}}, the PPP Interface retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @param passthroughEnable the input value
	 */
	public void  setPassthroughEnable(Boolean passthroughEnable) {
		this.passthroughEnable = passthroughEnable;
	}

	/**
	 * Set the if {{false}}, the PPP Interface retrieved information is configured on the IP Interface stacked on top of this PPP Interface.

          If {{true}}, the PPP Interface retrieved information is propagated to the parameters in the referenced {{param|PassthroughDHCPPool}} object, replacing any existing configuration (including ''MinAddress'', ''MaxAddress'', ''SubnetMask'', ''IPRouters'', and ''DNSServers'').
	 *
	 * @since 2.0
	 * @param passthroughEnable the input value
	 * @return this instance
	 */
	public IPCP withPassthroughEnable(Boolean passthroughEnable) {
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
	public IPCP withPassthroughDHCPPool(String passthroughDHCPPool) {
		this.passthroughDHCPPool = passthroughDHCPPool;
		return this;
	}

	//</editor-fold>

}