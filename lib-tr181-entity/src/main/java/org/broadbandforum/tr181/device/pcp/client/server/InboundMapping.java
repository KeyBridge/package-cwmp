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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.device.pcp.client.server.inboundmapping.Filter;

	/**
	 * Inbound Mapping table.

        This table contains all Inbound Mappings requested by this PCP Client on this PCP Server. Such a mapping is created by a PCP request with OpCode MAP, as described in {{bibref|RFC6887|Section 11}}.

        These requests can be issued from internal device applications, from static configuration or from other LAN device applications via interworking functions such as UPnP IGD or PCP proxies.  The {{param|Origin}} parameter indicates which mechanism requested the mapping.

        For non-{{enum|Static|Origin}} mappings (here ''Static'' refers to the mechanism that created the mapping, not to the {{param|Lifetime}}), the ACS MAY modify the {{param||Enable}} parameter but MUST NOT modify any other parameters in the mapping or its sub-objects.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.Server.{i}.InboundMapping.{i}.")
public class InboundMapping {

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
	 * Provides the PCP error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
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
	 * Determines the time to live, in seconds, of this Inbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Inbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Lifetime")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "seconds")
	public Long lifetime;
	/**
	 * The external IPv4 or IPv6 Address that the PCP-controlled device will listen on for incoming packets to be forwarded to the PCP Client.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SuggestedExternalIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress suggestedExternalIPAddress;
	/**
	 * The external port (or the first port of a range of external ports) that the PCP-controlled device will listen on for incoming packets. Those inbound packets will be forwarded to {{param|InternalPort}}. If the PCP client does not know the external port, or does not have a preference, it MUST use 0.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SuggestedExternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long suggestedExternalPort = 0L;
	/**
	 * Indicates the last port of the external port range that starts with {{param|SuggestedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|SuggestedExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|SuggestedExternalPort}}. 

          If {{param|SuggestedExternalPort}} is zero (wildcard), the value of {{param}} MUST be ignored.

          If specified, the value of this parameter MUST be zero or be greater than or equal to the value of {{param|SuggestedExternalPort}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SuggestedExternalPortEndRange")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long suggestedExternalPortEndRange = 0L;
	/**
	 * The port on this PCP Client's {{param|##.WANInterface}} that the PCP-controlled device forwards incoming packets to.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "InternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long internalPort;
	/**
	 * The protocol number of the {{object}}. Values are taken from {{bibref|IANA-protocolnumbers}}.

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
	 * The external IPAddress returned by the PCP Server. The IP address that the PCP-controlled device is listening on for incoming packets to a corresponding PCP Client.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AssignedExternalIPAddress")
	public IPAddress assignedExternalIPAddress;
	/**
	 * The external port returned by the PCP Server. The external port (or the first port of a range of external ports) that the PCP-controlled device is listening on for incoming packets to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the External interface of the PCP-controlled device is forwarded to the on the {{param|InternalPort}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AssignedExternalPort")
	@Size(min = 0, max = 65535)
	public Long assignedExternalPort;
	/**
	 * Indicates the last port of the external port range that starts with {{param|AssignedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|AssignedExternalPort}} applies to all ports within the range. 

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|AssignedExternalPort}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AssignedExternalPortEndRange")
	@Size(min = 0, max = 65535)
	public Long assignedExternalPortEndRange = 0L;
	/**
	 * Filter table.

        This table contains all Filters restricting this Inbound Mapping, as defined in {{bibref|RFC6887|}}.
	 */
	@XmlElementWrapper(name = "filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;

	public InboundMapping() {
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
	public InboundMapping withEnable(Boolean enable) {
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
	public InboundMapping withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the provides the PCP error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getErrorCode() {
		return errorCode;
	}

	/**
	 * Set the provides the PCP error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @param errorCode the input value
	 */
	public void  setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Set the provides the PCP error code when {{param|Status}} is {{enum|Error_PCPErrorCodeReceived|Status}}. Error code values are defined in {{bibref|RFC6887|Section 7.4}}.
	 *
	 * @since 2.8
	 * @param errorCode the input value
	 * @return this instance
	 */
	public InboundMapping withErrorCode(Long errorCode) {
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
	public InboundMapping withAlias(Alias alias) {
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
	public InboundMapping withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the determines the time to live, in seconds, of this Inbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Inbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLifetime() {
		return lifetime;
	}

	/**
	 * Set the determines the time to live, in seconds, of this Inbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Inbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @param lifetime the input value
	 */
	public void  setLifetime(Long lifetime) {
		this.lifetime = lifetime;
	}

	/**
	 * Set the determines the time to live, in seconds, of this Inbound Mapping lease, i.e. the remaining time before this port mapping expires.

          A value of 0 means that the port mapping is permanent (referred to as a static mapping in {{bibref|RFC6887}}).

          When a dynamic Inbound Mapping lease expires, the CPE MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.8
	 * @param lifetime the input value
	 * @return this instance
	 */
	public InboundMapping withLifetime(Long lifetime) {
		this.lifetime = lifetime;
		return this;
	}

	/**
	 * Get the external IPv4 or IPv6 Address that the PCP-controlled device will listen on for incoming packets to be forwarded to the PCP Client.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getSuggestedExternalIPAddress() {
		return suggestedExternalIPAddress;
	}

	/**
	 * Set the external IPv4 or IPv6 Address that the PCP-controlled device will listen on for incoming packets to be forwarded to the PCP Client.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalIPAddress the input value
	 */
	public void  setSuggestedExternalIPAddress(IPAddress suggestedExternalIPAddress) {
		this.suggestedExternalIPAddress = suggestedExternalIPAddress;
	}

	/**
	 * Set the external IPv4 or IPv6 Address that the PCP-controlled device will listen on for incoming packets to be forwarded to the PCP Client.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP client does not know the external address, or does not have a preference, it MUST use {{empty}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalIPAddress the input value
	 * @return this instance
	 */
	public InboundMapping withSuggestedExternalIPAddress(IPAddress suggestedExternalIPAddress) {
		this.suggestedExternalIPAddress = suggestedExternalIPAddress;
		return this;
	}

	/**
	 * Get the external port (or the first port of a range of external ports) that the PCP-controlled device will listen on for incoming packets. Those inbound packets will be forwarded to {{param|InternalPort}}. If the PCP client does not know the external port, or does not have a preference, it MUST use 0.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSuggestedExternalPort() {
		return suggestedExternalPort;
	}

	/**
	 * Set the external port (or the first port of a range of external ports) that the PCP-controlled device will listen on for incoming packets. Those inbound packets will be forwarded to {{param|InternalPort}}. If the PCP client does not know the external port, or does not have a preference, it MUST use 0.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @param suggestedExternalPort the input value
	 */
	public void  setSuggestedExternalPort(Long suggestedExternalPort) {
		this.suggestedExternalPort = suggestedExternalPort;
	}

	/**
	 * Set the external port (or the first port of a range of external ports) that the PCP-controlled device will listen on for incoming packets. Those inbound packets will be forwarded to {{param|InternalPort}}. If the PCP client does not know the external port, or does not have a preference, it MUST use 0.

          This is useful for refreshing an Inbound Mapping, especially after the PCP Server loses state. If the PCP Client does not know the external port, or does not have a preference, it MUST use 0.
	 *
	 * @since 2.8
	 * @param suggestedExternalPort the input value
	 * @return this instance
	 */
	public InboundMapping withSuggestedExternalPort(Long suggestedExternalPort) {
		this.suggestedExternalPort = suggestedExternalPort;
		return this;
	}

	/**
	 * Get the indicates the last port of the external port range that starts with {{param|SuggestedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|SuggestedExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|SuggestedExternalPort}}. 

          If {{param|SuggestedExternalPort}} is zero (wildcard), the value of {{param}} MUST be ignored.

          If specified, the value of this parameter MUST be zero or be greater than or equal to the value of {{param|SuggestedExternalPort}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSuggestedExternalPortEndRange() {
		return suggestedExternalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|SuggestedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|SuggestedExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|SuggestedExternalPort}}. 

          If {{param|SuggestedExternalPort}} is zero (wildcard), the value of {{param}} MUST be ignored.

          If specified, the value of this parameter MUST be zero or be greater than or equal to the value of {{param|SuggestedExternalPort}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalPortEndRange the input value
	 */
	public void  setSuggestedExternalPortEndRange(Long suggestedExternalPortEndRange) {
		this.suggestedExternalPortEndRange = suggestedExternalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|SuggestedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|SuggestedExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|SuggestedExternalPort}}. 

          If {{param|SuggestedExternalPort}} is zero (wildcard), the value of {{param}} MUST be ignored.

          If specified, the value of this parameter MUST be zero or be greater than or equal to the value of {{param|SuggestedExternalPort}}.
	 *
	 * @since 2.8
	 * @param suggestedExternalPortEndRange the input value
	 * @return this instance
	 */
	public InboundMapping withSuggestedExternalPortEndRange(Long suggestedExternalPortEndRange) {
		this.suggestedExternalPortEndRange = suggestedExternalPortEndRange;
		return this;
	}

	/**
	 * Get the port on this PCP Client's {{param|##.WANInterface}} that the PCP-controlled device forwards incoming packets to.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getInternalPort() {
		return internalPort;
	}

	/**
	 * Set the port on this PCP Client's {{param|##.WANInterface}} that the PCP-controlled device forwards incoming packets to.
	 *
	 * @since 2.8
	 * @param internalPort the input value
	 */
	public void  setInternalPort(Long internalPort) {
		this.internalPort = internalPort;
	}

	/**
	 * Set the port on this PCP Client's {{param|##.WANInterface}} that the PCP-controlled device forwards incoming packets to.
	 *
	 * @since 2.8
	 * @param internalPort the input value
	 * @return this instance
	 */
	public InboundMapping withInternalPort(Long internalPort) {
		this.internalPort = internalPort;
		return this;
	}

	/**
	 * Get the protocol number of the {{object}}. Values are taken from {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getProtocolNumber() {
		return protocolNumber;
	}

	/**
	 * Set the protocol number of the {{object}}. Values are taken from {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @param protocolNumber the input value
	 */
	public void  setProtocolNumber(Integer protocolNumber) {
		this.protocolNumber = protocolNumber;
	}

	/**
	 * Set the protocol number of the {{object}}. Values are taken from {{bibref|IANA-protocolnumbers}}.

          The value -1 means ''all protocols''.
	 *
	 * @since 2.8
	 * @param protocolNumber the input value
	 * @return this instance
	 */
	public InboundMapping withProtocolNumber(Integer protocolNumber) {
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
	public InboundMapping withThirdPartyAddress(IPAddress thirdPartyAddress) {
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
	public InboundMapping withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the external IPAddress returned by the PCP Server. The IP address that the PCP-controlled device is listening on for incoming packets to a corresponding PCP Client.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getAssignedExternalIPAddress() {
		return assignedExternalIPAddress;
	}

	/**
	 * Set the external IPAddress returned by the PCP Server. The IP address that the PCP-controlled device is listening on for incoming packets to a corresponding PCP Client.
	 *
	 * @since 2.8
	 * @param assignedExternalIPAddress the input value
	 */
	public void  setAssignedExternalIPAddress(IPAddress assignedExternalIPAddress) {
		this.assignedExternalIPAddress = assignedExternalIPAddress;
	}

	/**
	 * Set the external IPAddress returned by the PCP Server. The IP address that the PCP-controlled device is listening on for incoming packets to a corresponding PCP Client.
	 *
	 * @since 2.8
	 * @param assignedExternalIPAddress the input value
	 * @return this instance
	 */
	public InboundMapping withAssignedExternalIPAddress(IPAddress assignedExternalIPAddress) {
		this.assignedExternalIPAddress = assignedExternalIPAddress;
		return this;
	}

	/**
	 * Get the external port returned by the PCP Server. The external port (or the first port of a range of external ports) that the PCP-controlled device is listening on for incoming packets to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the External interface of the PCP-controlled device is forwarded to the on the {{param|InternalPort}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getAssignedExternalPort() {
		return assignedExternalPort;
	}

	/**
	 * Set the external port returned by the PCP Server. The external port (or the first port of a range of external ports) that the PCP-controlled device is listening on for incoming packets to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the External interface of the PCP-controlled device is forwarded to the on the {{param|InternalPort}}.
	 *
	 * @since 2.8
	 * @param assignedExternalPort the input value
	 */
	public void  setAssignedExternalPort(Long assignedExternalPort) {
		this.assignedExternalPort = assignedExternalPort;
	}

	/**
	 * Set the external port returned by the PCP Server. The external port (or the first port of a range of external ports) that the PCP-controlled device is listening on for incoming packets to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the External interface of the PCP-controlled device is forwarded to the on the {{param|InternalPort}}.
	 *
	 * @since 2.8
	 * @param assignedExternalPort the input value
	 * @return this instance
	 */
	public InboundMapping withAssignedExternalPort(Long assignedExternalPort) {
		this.assignedExternalPort = assignedExternalPort;
		return this;
	}

	/**
	 * Get the indicates the last port of the external port range that starts with {{param|AssignedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|AssignedExternalPort}} applies to all ports within the range. 

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|AssignedExternalPort}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getAssignedExternalPortEndRange() {
		return assignedExternalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|AssignedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|AssignedExternalPort}} applies to all ports within the range. 

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|AssignedExternalPort}}.
	 *
	 * @since 2.8
	 * @param assignedExternalPortEndRange the input value
	 */
	public void  setAssignedExternalPortEndRange(Long assignedExternalPortEndRange) {
		this.assignedExternalPortEndRange = assignedExternalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|AssignedExternalPort}}. 

          If an external port range is specified, then the behavior described for {{param|AssignedExternalPort}} applies to all ports within the range. 

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|AssignedExternalPort}}.
	 *
	 * @since 2.8
	 * @param assignedExternalPortEndRange the input value
	 * @return this instance
	 */
	public InboundMapping withAssignedExternalPortEndRange(Long assignedExternalPortEndRange) {
		this.assignedExternalPortEndRange = assignedExternalPortEndRange;
		return this;
	}

	/**
	 * Get the filter table.

        This table contains all Filters restricting this Inbound Mapping, as defined in {{bibref|RFC6887|}}.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the filter table.

        This table contains all Filters restricting this Inbound Mapping, as defined in {{bibref|RFC6887|}}.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the filter table.

        This table contains all Filters restricting this Inbound Mapping, as defined in {{bibref|RFC6887|}}.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public InboundMapping withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	//</editor-fold>

}