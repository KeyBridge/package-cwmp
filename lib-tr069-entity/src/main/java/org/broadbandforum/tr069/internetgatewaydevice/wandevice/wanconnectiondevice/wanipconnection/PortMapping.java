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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Port mapping table.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.PortMapping.{i}.")
public class PortMapping {

	/**
	 * Enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean portMappingEnabled;
	/**
	 * Determines the time to live, in seconds, of a port-mapping lease. A value of 0 means the port mapping is static. Static port mappings do not necessarily mean persistence of these mappings across device resets or reboots.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingLeaseDuration")
	@CWMPParameter(access = "readWrite")
	public Long portMappingLeaseDuration;
	/**
	 * This parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are required only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RemoteHost")
	@CWMPParameter(access = "readWrite")
	public String remoteHost;
	/**
	 * The external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface should be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExternalPort")
	@CWMPParameter(access = "readWrite")
	public Long externalPort;
	/**
	 * The port on {{param|InternalClient}} that the gateway should forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InternalPort")
	@CWMPParameter(access = "readWrite")
	public Long internalPort;
	/**
	 * The protocol of the port mapping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingProtocol")
	@CWMPParameter(access = "readWrite")
	public String portMappingProtocol;
	/**
	 * The IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory, while support for DNS host names is optional.

This value cannot be {{empty}}.

It must be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InternalClient")
	@CWMPParameter(access = "readWrite")
	public String internalClient;
	/**
	 * User-readable description of this port mapping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingDescription")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String portMappingDescription;

	public PortMapping() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPortMappingEnabled() {
		return portMappingEnabled;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param portMappingEnabled the input value
	 */
	public void  setPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param portMappingEnabled the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
		return this;
	}

	/**
	 * Get the determines the time to live, in seconds, of a port-mapping lease. A value of 0 means the port mapping is static. Static port mappings do not necessarily mean persistence of these mappings across device resets or reboots.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPortMappingLeaseDuration() {
		return portMappingLeaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port-mapping lease. A value of 0 means the port mapping is static. Static port mappings do not necessarily mean persistence of these mappings across device resets or reboots.
	 *
	 * @since 1.0
	 * @param portMappingLeaseDuration the input value
	 */
	public void  setPortMappingLeaseDuration(Long portMappingLeaseDuration) {
		this.portMappingLeaseDuration = portMappingLeaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port-mapping lease. A value of 0 means the port mapping is static. Static port mappings do not necessarily mean persistence of these mappings across device resets or reboots.
	 *
	 * @since 1.0
	 * @param portMappingLeaseDuration the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingLeaseDuration(Long portMappingLeaseDuration) {
		this.portMappingLeaseDuration = portMappingLeaseDuration;
		return this;
	}

	/**
	 * Get the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are required only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are required only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped.
	 *
	 * @since 1.0
	 * @param remoteHost the input value
	 */
	public void  setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are required only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped.
	 *
	 * @since 1.0
	 * @param remoteHost the input value
	 * @return this instance
	 */
	public PortMapping withRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
		return this;
	}

	/**
	 * Get the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface should be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getExternalPort() {
		return externalPort;
	}

	/**
	 * Set the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface should be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.
	 *
	 * @since 1.0
	 * @param externalPort the input value
	 */
	public void  setExternalPort(Long externalPort) {
		this.externalPort = externalPort;
	}

	/**
	 * Set the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface should be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.
	 *
	 * @since 1.0
	 * @param externalPort the input value
	 * @return this instance
	 */
	public PortMapping withExternalPort(Long externalPort) {
		this.externalPort = externalPort;
		return this;
	}

	/**
	 * Get the port on {{param|InternalClient}} that the gateway should forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInternalPort() {
		return internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway should forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @param internalPort the input value
	 */
	public void  setInternalPort(Long internalPort) {
		this.internalPort = internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway should forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @param internalPort the input value
	 * @return this instance
	 */
	public PortMapping withInternalPort(Long internalPort) {
		this.internalPort = internalPort;
		return this;
	}

	/**
	 * Get the protocol of the port mapping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPortMappingProtocol() {
		return portMappingProtocol;
	}

	/**
	 * Set the protocol of the port mapping.
	 *
	 * @since 1.0
	 * @param portMappingProtocol the input value
	 */
	public void  setPortMappingProtocol(String portMappingProtocol) {
		this.portMappingProtocol = portMappingProtocol;
	}

	/**
	 * Set the protocol of the port mapping.
	 *
	 * @since 1.0
	 * @param portMappingProtocol the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingProtocol(String portMappingProtocol) {
		this.portMappingProtocol = portMappingProtocol;
		return this;
	}

	/**
	 * Get the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory, while support for DNS host names is optional.

This value cannot be {{empty}}.

It must be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getInternalClient() {
		return internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory, while support for DNS host names is optional.

This value cannot be {{empty}}.

It must be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @param internalClient the input value
	 */
	public void  setInternalClient(String internalClient) {
		this.internalClient = internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory, while support for DNS host names is optional.

This value cannot be {{empty}}.

It must be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @param internalClient the input value
	 * @return this instance
	 */
	public PortMapping withInternalClient(String internalClient) {
		this.internalClient = internalClient;
		return this;
	}

	/**
	 * Get the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPortMappingDescription() {
		return portMappingDescription;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @param portMappingDescription the input value
	 */
	public void  setPortMappingDescription(String portMappingDescription) {
		this.portMappingDescription = portMappingDescription;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @param portMappingDescription the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingDescription(String portMappingDescription) {
		this.portMappingDescription = portMappingDescription;
		return this;
	}

	//</editor-fold>

}