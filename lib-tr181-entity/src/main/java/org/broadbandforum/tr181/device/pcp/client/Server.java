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
package org.broadbandforum.tr181.device.pcp.client;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.device.pcp.client.server.InboundMapping;
import org.broadbandforum.tr181.device.pcp.client.server.OutboundMapping;

	/**
	 * This table contains the PCP Servers to be used by the PCP Client. Entries are either statically configured or automatically created via DHCP options OPTION_V4_PCP_SERVER and OPTION_V6_PCP_SERVER, as per {{bibref|RFC7291}}.

        Each OPTION_V4_PCP_SERVER or OPTION_V6_PCP_SERVER option corresponds to a {{object}} instance.  If an option returns multiple addresses then that {{object}} instance has multiple addresses.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.Server.{i}.")
@XmlRootElement(name = "Device.PCP.Client.Server")
@XmlType(name = "Device.PCP.Client.Server")
@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

	/**
	 * Enables or disables this PCP Server.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = true;
	/**
	 * The status of the PCP Server. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Method used to assign {{param|ServerNameOrAddress}} and create this table entry. {{enum}}

          Note: In the {{enum|DHCPv4}} and {{enum|DHCPv6}} cases, if more than one IP address is received {{param|ServerNameOrAddress}} will be the first address and {{param|AdditionalServerAddresses}} will be the remaining addresses.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * The FQDN or IP address of the PCP Server, assigned as described under {{param|Origin}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ServerNameOrAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serverNameOrAddress;
	/**
	 * The IP address currently in use for the PCP Server, derived from the value of {{param|ServerNameOrAddress}}.

          {{empty}} indicates that no PCP Server address is currently known.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ServerAddressInUse")
	public IPAddress serverAddressInUse;
	/**
	 * PCP Server addresses in addition to {{param|ServerNameOrAddress}}.  This can be non-empty only if {{param|Origin}} is {{enum|DHCPv4|Origin}} or {{enum|DHCPv6|Origin}} and if more than one PCP Server address was received.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AdditionalServerAddresses")
	public IPAddress additionalServerAddresses;
	/**
	 * The external IP address of the PCP-controlled device hosting this server.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ExternalIPAddress")
	public IPAddress externalIPAddress;
	/**
	 * This is the version of PCP resulting from client-server Version Negotiation.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CurrentVersion")
	@Size(min = 0, max = 65535)
	public Long currentVersion;
	/**
	 * Indicates the maximum number of inbound filters allowed to be associated with a mapping entry on this server.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MaximumFilters")
	@CWMPParameter(access = "readWrite")
	public Long maximumFilters;
	/**
	 * Indicates the maximum number of ports allocated to this PCP Client on this server.

          A value of 0 means that there is no limitation.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PortQuota")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long portQuota = 0L;
	/**
	 * Indicates the preferred lifetime (in seconds) to be used for mappings with this server when no preference is selected by an application/user.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PreferredLifetime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long preferredLifetime;
	/**
	 * Indicates the capabilities supported by the PCP Server. 

Enumerated value must be one of [NAT44, StatelessNAT64, StatefulNAT64, A+PPortRangeRouter, SupportsPORTSETOption, IPv4Firewall, IPv6Firewall, NPTv6, DSCPReMarkingFunction, FLOWDATAAwareFunction, ILNPTranslator]
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Capabilities")
	@XmlList
	public Collection<String> capabilities;
	/**
	 * Inbound Mapping table.

        This table contains all Inbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode MAP, as described in {{bibref|RFC6887|Section 11}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies.  The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 */
	@XmlElementWrapper(name = "InboundMappings")
	@XmlElement(name = "InboundMapping")
	@CWMPParameter(access = "readWrite")
	public Collection<InboundMapping> inboundMappings;
	/**
	 * Outbound Mapping table.

        This table contains all Outbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode PEER, as described in {{bibref|RFC6887|Section 12}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies. The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 */
	@XmlElementWrapper(name = "OutboundMappings")
	@XmlElement(name = "OutboundMapping")
	@CWMPParameter(access = "readWrite")
	public Collection<OutboundMapping> outboundMappings;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this PCP Server.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this PCP Server.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this PCP Server.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Server withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the PCP Server. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the PCP Server. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the PCP Server. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
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
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Server withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the method used to assign {{param|ServerNameOrAddress}} and create this table entry. {{enum}}

          Note: In the {{enum|DHCPv4}} and {{enum|DHCPv6}} cases, if more than one IP address is received {{param|ServerNameOrAddress}} will be the first address and {{param|AdditionalServerAddresses}} will be the remaining addresses.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the method used to assign {{param|ServerNameOrAddress}} and create this table entry. {{enum}}

          Note: In the {{enum|DHCPv4}} and {{enum|DHCPv6}} cases, if more than one IP address is received {{param|ServerNameOrAddress}} will be the first address and {{param|AdditionalServerAddresses}} will be the remaining addresses.
	 *
	 * @since 2.8
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the method used to assign {{param|ServerNameOrAddress}} and create this table entry. {{enum}}

          Note: In the {{enum|DHCPv4}} and {{enum|DHCPv6}} cases, if more than one IP address is received {{param|ServerNameOrAddress}} will be the first address and {{param|AdditionalServerAddresses}} will be the remaining addresses.
	 *
	 * @since 2.8
	 * @param origin the input value
	 * @return this instance
	 */
	public Server withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the FQDN or IP address of the PCP Server, assigned as described under {{param|Origin}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getServerNameOrAddress() {
		return serverNameOrAddress;
	}

	/**
	 * Set the FQDN or IP address of the PCP Server, assigned as described under {{param|Origin}}.
	 *
	 * @since 2.8
	 * @param serverNameOrAddress the input value
	 */
	public void  setServerNameOrAddress(String serverNameOrAddress) {
		this.serverNameOrAddress = serverNameOrAddress;
	}

	/**
	 * Set the FQDN or IP address of the PCP Server, assigned as described under {{param|Origin}}.
	 *
	 * @since 2.8
	 * @param serverNameOrAddress the input value
	 * @return this instance
	 */
	public Server withServerNameOrAddress(String serverNameOrAddress) {
		this.serverNameOrAddress = serverNameOrAddress;
		return this;
	}

	/**
	 * Get the IP address currently in use for the PCP Server, derived from the value of {{param|ServerNameOrAddress}}.

          {{empty}} indicates that no PCP Server address is currently known.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getServerAddressInUse() {
		return serverAddressInUse;
	}

	/**
	 * Set the IP address currently in use for the PCP Server, derived from the value of {{param|ServerNameOrAddress}}.

          {{empty}} indicates that no PCP Server address is currently known.
	 *
	 * @since 2.8
	 * @param serverAddressInUse the input value
	 */
	public void  setServerAddressInUse(IPAddress serverAddressInUse) {
		this.serverAddressInUse = serverAddressInUse;
	}

	/**
	 * Set the IP address currently in use for the PCP Server, derived from the value of {{param|ServerNameOrAddress}}.

          {{empty}} indicates that no PCP Server address is currently known.
	 *
	 * @since 2.8
	 * @param serverAddressInUse the input value
	 * @return this instance
	 */
	public Server withServerAddressInUse(IPAddress serverAddressInUse) {
		this.serverAddressInUse = serverAddressInUse;
		return this;
	}

	/**
	 * Get the pcp Server addresses in addition to {{param|ServerNameOrAddress}}.  This can be non-empty only if {{param|Origin}} is {{enum|DHCPv4|Origin}} or {{enum|DHCPv6|Origin}} and if more than one PCP Server address was received.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getAdditionalServerAddresses() {
		return additionalServerAddresses;
	}

	/**
	 * Set the pcp Server addresses in addition to {{param|ServerNameOrAddress}}.  This can be non-empty only if {{param|Origin}} is {{enum|DHCPv4|Origin}} or {{enum|DHCPv6|Origin}} and if more than one PCP Server address was received.
	 *
	 * @since 2.8
	 * @param additionalServerAddresses the input value
	 */
	public void  setAdditionalServerAddresses(IPAddress additionalServerAddresses) {
		this.additionalServerAddresses = additionalServerAddresses;
	}

	/**
	 * Set the pcp Server addresses in addition to {{param|ServerNameOrAddress}}.  This can be non-empty only if {{param|Origin}} is {{enum|DHCPv4|Origin}} or {{enum|DHCPv6|Origin}} and if more than one PCP Server address was received.
	 *
	 * @since 2.8
	 * @param additionalServerAddresses the input value
	 * @return this instance
	 */
	public Server withAdditionalServerAddresses(IPAddress additionalServerAddresses) {
		this.additionalServerAddresses = additionalServerAddresses;
		return this;
	}

	/**
	 * Get the external IP address of the PCP-controlled device hosting this server.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getExternalIPAddress() {
		return externalIPAddress;
	}

	/**
	 * Set the external IP address of the PCP-controlled device hosting this server.
	 *
	 * @since 2.8
	 * @param externalIPAddress the input value
	 */
	public void  setExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
	}

	/**
	 * Set the external IP address of the PCP-controlled device hosting this server.
	 *
	 * @since 2.8
	 * @param externalIPAddress the input value
	 * @return this instance
	 */
	public Server withExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
		return this;
	}

	/**
	 * Get the this is the version of PCP resulting from client-server Version Negotiation.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getCurrentVersion() {
		return currentVersion;
	}

	/**
	 * Set the this is the version of PCP resulting from client-server Version Negotiation.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param currentVersion the input value
	 */
	public void  setCurrentVersion(Long currentVersion) {
		this.currentVersion = currentVersion;
	}

	/**
	 * Set the this is the version of PCP resulting from client-server Version Negotiation.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param currentVersion the input value
	 * @return this instance
	 */
	public Server withCurrentVersion(Long currentVersion) {
		this.currentVersion = currentVersion;
		return this;
	}

	/**
	 * Get the indicates the maximum number of inbound filters allowed to be associated with a mapping entry on this server.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMaximumFilters() {
		return maximumFilters;
	}

	/**
	 * Set the indicates the maximum number of inbound filters allowed to be associated with a mapping entry on this server.
	 *
	 * @since 2.8
	 * @param maximumFilters the input value
	 */
	public void  setMaximumFilters(Long maximumFilters) {
		this.maximumFilters = maximumFilters;
	}

	/**
	 * Set the indicates the maximum number of inbound filters allowed to be associated with a mapping entry on this server.
	 *
	 * @since 2.8
	 * @param maximumFilters the input value
	 * @return this instance
	 */
	public Server withMaximumFilters(Long maximumFilters) {
		this.maximumFilters = maximumFilters;
		return this;
	}

	/**
	 * Get the indicates the maximum number of ports allocated to this PCP Client on this server.

          A value of 0 means that there is no limitation.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPortQuota() {
		return portQuota;
	}

	/**
	 * Set the indicates the maximum number of ports allocated to this PCP Client on this server.

          A value of 0 means that there is no limitation.
	 *
	 * @since 2.8
	 * @param portQuota the input value
	 */
	public void  setPortQuota(Long portQuota) {
		this.portQuota = portQuota;
	}

	/**
	 * Set the indicates the maximum number of ports allocated to this PCP Client on this server.

          A value of 0 means that there is no limitation.
	 *
	 * @since 2.8
	 * @param portQuota the input value
	 * @return this instance
	 */
	public Server withPortQuota(Long portQuota) {
		this.portQuota = portQuota;
		return this;
	}

	/**
	 * Get the indicates the preferred lifetime (in seconds) to be used for mappings with this server when no preference is selected by an application/user.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPreferredLifetime() {
		return preferredLifetime;
	}

	/**
	 * Set the indicates the preferred lifetime (in seconds) to be used for mappings with this server when no preference is selected by an application/user.
	 *
	 * @since 2.8
	 * @param preferredLifetime the input value
	 */
	public void  setPreferredLifetime(Long preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
	}

	/**
	 * Set the indicates the preferred lifetime (in seconds) to be used for mappings with this server when no preference is selected by an application/user.
	 *
	 * @since 2.8
	 * @param preferredLifetime the input value
	 * @return this instance
	 */
	public Server withPreferredLifetime(Long preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
		return this;
	}

	/**
	 * Get the indicates the capabilities supported by the PCP Server. 

Enumerated value must be one of [NAT44, StatelessNAT64, StatefulNAT64, A+PPortRangeRouter, SupportsPORTSETOption, IPv4Firewall, IPv6Firewall, NPTv6, DSCPReMarkingFunction, FLOWDATAAwareFunction, ILNPTranslator]
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getCapabilities() {
		if (this.capabilities == null){ this.capabilities=new ArrayList<>();}
		return capabilities;
	}

	/**
	 * Set the indicates the capabilities supported by the PCP Server. 

Enumerated value must be one of [NAT44, StatelessNAT64, StatefulNAT64, A+PPortRangeRouter, SupportsPORTSETOption, IPv4Firewall, IPv6Firewall, NPTv6, DSCPReMarkingFunction, FLOWDATAAwareFunction, ILNPTranslator]
	 *
	 * @since 2.8
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Collection<String> capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the indicates the capabilities supported by the PCP Server. 

Enumerated value must be one of [NAT44, StatelessNAT64, StatefulNAT64, A+PPortRangeRouter, SupportsPORTSETOption, IPv4Firewall, IPv6Firewall, NPTv6, DSCPReMarkingFunction, FLOWDATAAwareFunction, ILNPTranslator]
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Server withCapabilities(String string) {
		getCapabilities().add(string);
		return this;
	}

	/**
	 * Get the inbound Mapping table.

        This table contains all Inbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode MAP, as described in {{bibref|RFC6887|Section 11}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies.  The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @return the value
	 */
	public Collection<InboundMapping> getInboundMappings() {
		if (this.inboundMappings == null){ this.inboundMappings=new ArrayList<>();}
		return inboundMappings;
	}

	/**
	 * Set the inbound Mapping table.

        This table contains all Inbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode MAP, as described in {{bibref|RFC6887|Section 11}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies.  The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @param inboundMappings the input value
	 */
	public void  setInboundMappings(Collection<InboundMapping> inboundMappings) {
		this.inboundMappings = inboundMappings;
	}

	/**
	 * Set the inbound Mapping table.

        This table contains all Inbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode MAP, as described in {{bibref|RFC6887|Section 11}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies.  The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @param inboundMapping the input value
	 * @return this instance
	 */
	public Server withInboundMapping(InboundMapping inboundMapping) {
		getInboundMappings().add(inboundMapping);
		return this;
	}

	/**
	 * Get the outbound Mapping table.

        This table contains all Outbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode PEER, as described in {{bibref|RFC6887|Section 12}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies. The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @return the value
	 */
	public Collection<OutboundMapping> getOutboundMappings() {
		if (this.outboundMappings == null){ this.outboundMappings=new ArrayList<>();}
		return outboundMappings;
	}

	/**
	 * Set the outbound Mapping table.

        This table contains all Outbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode PEER, as described in {{bibref|RFC6887|Section 12}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies. The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @param outboundMappings the input value
	 */
	public void  setOutboundMappings(Collection<OutboundMapping> outboundMappings) {
		this.outboundMappings = outboundMappings;
	}

	/**
	 * Set the outbound Mapping table.

        This table contains all Outbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode PEER, as described in {{bibref|RFC6887|Section 12}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies. The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @param outboundMapping the input value
	 * @return this instance
	 */
	public Server withOutboundMapping(OutboundMapping outboundMapping) {
		getOutboundMappings().add(outboundMapping);
		return this;
	}

	//</editor-fold>

}