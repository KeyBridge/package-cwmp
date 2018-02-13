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
package org.broadbandforum.tr181.device.pcp.client.server;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * Outbound Mapping table.

        This table contains all Outbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode PEER, as described in {{bibref|RFC6887|Section 12}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies. The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.Server.{i}.OutboundMapping.{i}.")
@XmlRootElement(name = "OutboundMapping")
@XmlType(name = "Device.PCP.Client.Server.OutboundMapping")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutboundMapping {

	/**
	 * Enables or disables this {{object}} instance.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry. {{enum}}

          The {{enum|Error_PCPErrorCodeReceived}} value indicates that the PCP Client received an error code from the PCP Server.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * Provides the PCP Error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorCode")
	@Size(min = 1, max = 255)
	public Long errorCode;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Mechanism via which the mapping was requested. {{enum}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * Determines the time to live, in seconds, of this Outbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Outbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Lifetime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long lifetime;
	/**
	 * The external IPv4 or IPv6 Address that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SuggestedExternalIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress suggestedExternalIPAddress;
	/**
	 * The external port that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SuggestedExternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long suggestedExternalPort = 0L;
	/**
	 * The remote peer's IP address, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemoteHostIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress remoteHostIPAddress;
	/**
	 * The port on PCP Client WAN Interface that the PCP-controlled device SHOULD listen to for this mapping.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "InternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long internalPort;
	/**
	 * The remote peer's port, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemotePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long remotePort;
	/**
	 * The protocol number of the {{object}}. Values are taken from the {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ProtocolNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 255)
	public Integer protocolNumber;
	/**
	 * Under certain conditions, the PCP Client can create a PCP mapping on behalf of another device, by using the THIRD_PARTY option, as specified in {{bibref|RFC6887|Section 7.3}}. In that case, {{param}} is the IP address of the device for which the PCP operation is requested.

          For non-third-party mappings, {{param}} SHOULD be {{empty}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ThirdPartyAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress thirdPartyAddress;
	/**
	 * User-readable description of this {{object}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Description")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String description;
	/**
	 * The external IP address returned by the PCP Server. The IP address that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AssignedExternalIPAddress")
	public IPAddress assignedExternalIPAddress;
	/**
	 * The external port returned by the PCP Server. The port that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AssignedExternalPort")
	@Size(min = 0, max = 65535)
	public Long assignedExternalPort;

	public OutboundMapping() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} instance.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public OutboundMapping withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry. {{enum}}

          The {{enum|Error_PCPErrorCodeReceived}} value indicates that the PCP Client received an error code from the PCP Server.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry. {{enum}}

          The {{enum|Error_PCPErrorCodeReceived}} value indicates that the PCP Client received an error code from the PCP Server.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry. {{enum}}

          The {{enum|Error_PCPErrorCodeReceived}} value indicates that the PCP Client received an error code from the PCP Server.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public OutboundMapping withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the provides the PCP Error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getErrorCode() {
		return errorCode;
	}

	/**
	 * Set the provides the PCP Error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @param errorCode the input value
	 */
	public void  setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Set the provides the PCP Error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @param errorCode the input value
	 * @return this instance
	 */
	public OutboundMapping withErrorCode(Long errorCode) {
		this.errorCode = errorCode;
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
	public OutboundMapping withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the mapping was requested. {{enum}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the mapping was requested. {{enum}}
	 *
	 * @since 2.8
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the mapping was requested. {{enum}}
	 *
	 * @since 2.8
	 * @param origin the input value
	 * @return this instance
	 */
	public OutboundMapping withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the determines the time to live, in seconds, of this Outbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Outbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLifetime() {
		return lifetime;
	}

	/**
	 * Set the determines the time to live, in seconds, of this Outbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Outbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @param lifetime the input value
	 */
	public void  setLifetime(Long lifetime) {
		this.lifetime = lifetime;
	}

	/**
	 * Set the determines the time to live, in seconds, of this Outbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Outbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @param lifetime the input value
	 * @return this instance
	 */
	public OutboundMapping withLifetime(Long lifetime) {
		this.lifetime = lifetime;
		return this;
	}

	/**
	 * Get the external IPv4 or IPv6 Address that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getSuggestedExternalIPAddress() {
		return suggestedExternalIPAddress;
	}

	/**
	 * Set the external IPv4 or IPv6 Address that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalIPAddress the input value
	 */
	public void  setSuggestedExternalIPAddress(IPAddress suggestedExternalIPAddress) {
		this.suggestedExternalIPAddress = suggestedExternalIPAddress;
	}

	/**
	 * Set the external IPv4 or IPv6 Address that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalIPAddress the input value
	 * @return this instance
	 */
	public OutboundMapping withSuggestedExternalIPAddress(IPAddress suggestedExternalIPAddress) {
		this.suggestedExternalIPAddress = suggestedExternalIPAddress;
		return this;
	}

	/**
	 * Get the external port that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSuggestedExternalPort() {
		return suggestedExternalPort;
	}

	/**
	 * Set the external port that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @param suggestedExternalPort the input value
	 */
	public void  setSuggestedExternalPort(Long suggestedExternalPort) {
		this.suggestedExternalPort = suggestedExternalPort;
	}

	/**
	 * Set the external port that the PCP-controlled device will use to send outgoing packets covered by this mapping.

          This is useful for refreshing a mapping, especially after the PCP Server has lost state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @param suggestedExternalPort the input value
	 * @return this instance
	 */
	public OutboundMapping withSuggestedExternalPort(Long suggestedExternalPort) {
		this.suggestedExternalPort = suggestedExternalPort;
		return this;
	}

	/**
	 * Get the remote peer's IP address, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getRemoteHostIPAddress() {
		return remoteHostIPAddress;
	}

	/**
	 * Set the remote peer's IP address, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @param remoteHostIPAddress the input value
	 */
	public void  setRemoteHostIPAddress(IPAddress remoteHostIPAddress) {
		this.remoteHostIPAddress = remoteHostIPAddress;
	}

	/**
	 * Set the remote peer's IP address, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @param remoteHostIPAddress the input value
	 * @return this instance
	 */
	public OutboundMapping withRemoteHostIPAddress(IPAddress remoteHostIPAddress) {
		this.remoteHostIPAddress = remoteHostIPAddress;
		return this;
	}

	/**
	 * Get the port on PCP Client WAN Interface that the PCP-controlled device SHOULD listen to for this mapping.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getInternalPort() {
		return internalPort;
	}

	/**
	 * Set the port on PCP Client WAN Interface that the PCP-controlled device SHOULD listen to for this mapping.
	 *
	 * @since 2.8
	 * @param internalPort the input value
	 */
	public void  setInternalPort(Long internalPort) {
		this.internalPort = internalPort;
	}

	/**
	 * Set the port on PCP Client WAN Interface that the PCP-controlled device SHOULD listen to for this mapping.
	 *
	 * @since 2.8
	 * @param internalPort the input value
	 * @return this instance
	 */
	public OutboundMapping withInternalPort(Long internalPort) {
		this.internalPort = internalPort;
		return this;
	}

	/**
	 * Get the remote peer's port, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRemotePort() {
		return remotePort;
	}

	/**
	 * Set the remote peer's port, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @param remotePort the input value
	 */
	public void  setRemotePort(Long remotePort) {
		this.remotePort = remotePort;
	}

	/**
	 * Set the remote peer's port, as seen from the PCP Client, for this Outbound Mapping.
	 *
	 * @since 2.8
	 * @param remotePort the input value
	 * @return this instance
	 */
	public OutboundMapping withRemotePort(Long remotePort) {
		this.remotePort = remotePort;
		return this;
	}

	/**
	 * Get the protocol number of the {{object}}. Values are taken from the {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getProtocolNumber() {
		return protocolNumber;
	}

	/**
	 * Set the protocol number of the {{object}}. Values are taken from the {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @param protocolNumber the input value
	 */
	public void  setProtocolNumber(Integer protocolNumber) {
		this.protocolNumber = protocolNumber;
	}

	/**
	 * Set the protocol number of the {{object}}. Values are taken from the {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @param protocolNumber the input value
	 * @return this instance
	 */
	public OutboundMapping withProtocolNumber(Integer protocolNumber) {
		this.protocolNumber = protocolNumber;
		return this;
	}

	/**
	 * Get the under certain conditions, the PCP Client can create a PCP mapping on behalf of another device, by using the THIRD_PARTY option, as specified in {{bibref|RFC6887|Section 7.3}}. In that case, {{param}} is the IP address of the device for which the PCP operation is requested.

          For non-third-party mappings, {{param}} SHOULD be {{empty}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getThirdPartyAddress() {
		return thirdPartyAddress;
	}

	/**
	 * Set the under certain conditions, the PCP Client can create a PCP mapping on behalf of another device, by using the THIRD_PARTY option, as specified in {{bibref|RFC6887|Section 7.3}}. In that case, {{param}} is the IP address of the device for which the PCP operation is requested.

          For non-third-party mappings, {{param}} SHOULD be {{empty}}.
	 *
	 * @since 2.8
	 * @param thirdPartyAddress the input value
	 */
	public void  setThirdPartyAddress(IPAddress thirdPartyAddress) {
		this.thirdPartyAddress = thirdPartyAddress;
	}

	/**
	 * Set the under certain conditions, the PCP Client can create a PCP mapping on behalf of another device, by using the THIRD_PARTY option, as specified in {{bibref|RFC6887|Section 7.3}}. In that case, {{param}} is the IP address of the device for which the PCP operation is requested.

          For non-third-party mappings, {{param}} SHOULD be {{empty}}.
	 *
	 * @since 2.8
	 * @param thirdPartyAddress the input value
	 * @return this instance
	 */
	public OutboundMapping withThirdPartyAddress(IPAddress thirdPartyAddress) {
		this.thirdPartyAddress = thirdPartyAddress;
		return this;
	}

	/**
	 * Get the user-readable description of this {{object}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the user-readable description of this {{object}}.
	 *
	 * @since 2.8
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the user-readable description of this {{object}}.
	 *
	 * @since 2.8
	 * @param description the input value
	 * @return this instance
	 */
	public OutboundMapping withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the external IP address returned by the PCP Server. The IP address that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getAssignedExternalIPAddress() {
		return assignedExternalIPAddress;
	}

	/**
	 * Set the external IP address returned by the PCP Server. The IP address that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @param assignedExternalIPAddress the input value
	 */
	public void  setAssignedExternalIPAddress(IPAddress assignedExternalIPAddress) {
		this.assignedExternalIPAddress = assignedExternalIPAddress;
	}

	/**
	 * Set the external IP address returned by the PCP Server. The IP address that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @param assignedExternalIPAddress the input value
	 * @return this instance
	 */
	public OutboundMapping withAssignedExternalIPAddress(IPAddress assignedExternalIPAddress) {
		this.assignedExternalIPAddress = assignedExternalIPAddress;
		return this;
	}

	/**
	 * Get the external port returned by the PCP Server. The port that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getAssignedExternalPort() {
		return assignedExternalPort;
	}

	/**
	 * Set the external port returned by the PCP Server. The port that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @param assignedExternalPort the input value
	 */
	public void  setAssignedExternalPort(Long assignedExternalPort) {
		this.assignedExternalPort = assignedExternalPort;
	}

	/**
	 * Set the external port returned by the PCP Server. The port that the PCP-controlled device uses to send outgoing packets corresponding to this mapping.
	 *
	 * @since 2.8
	 * @param assignedExternalPort the input value
	 * @return this instance
	 */
	public OutboundMapping withAssignedExternalPort(Long assignedExternalPort) {
		this.assignedExternalPort = assignedExternalPort;
		return this;
	}

	//</editor-fold>

}