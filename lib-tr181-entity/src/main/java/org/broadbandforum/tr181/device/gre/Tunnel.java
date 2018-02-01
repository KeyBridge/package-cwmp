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
package org.broadbandforum.tr181.device.gre;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.gre.tunnel.Interface;
import org.broadbandforum.tr181.device.gre.tunnel.Stats;

	/**
	 * GRE Tunnel table, models the GRE Tunnel instance and represents the entry point and exit point of the tunnel in relation to the WAN interface. A {{object}} object has one or more {{object|Interface}} objects that further define the sessions or flows within the tunnel.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.GRE.Tunnel.{i}.")
public class Tunnel {

	/**
	 * Enables or disables the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The Fully Qualified Domain Name (FQDN) or IP address of the remote GRE tunnel endpoint. If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemoteEndpoints")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> remoteEndpoints;
	/**
	 * The mechanism used to keep the tunnel from timing out at the {{param|ConnectedRemoteEndpoint}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeepAlivePolicy")
	@CWMPParameter(access = "readWrite")
	public String keepAlivePolicy = "None";
	/**
	 * The tunnel keepalive timeout in seconds.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeepAliveTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long keepAliveTimeout = 10L;
	/**
	 * Number of KeepAlive messages unacknowledged by the {{param|ConnectedRemoteEndpoint}} before the {{object}} is perceived failed.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeepAliveThreshold")
	@CWMPParameter(access = "readWrite")
	public Long keepAliveThreshold = 3L;
	/**
	 * The protocol used for the delivery header.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DeliveryHeaderProtocol")
	@CWMPParameter(access = "readWrite")
	public String deliveryHeaderProtocol;
	/**
	 * If the specified entries in the {{object|#.Filter}} table do not match this {{object}} object or an instance of the {{object|Interface}} object for this {{object}} object, then the value of this parameter is applied to the delivery header of the packets in this {{object}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DefaultDSCPMark")
	@CWMPParameter(access = "readWrite")
	public Long defaultDSCPMark = 0L;
	/**
	 * The Fully Qualified Domain Name (FQDN) name or IP address of the connected remote GRE tunnel endpoint.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ConnectedRemoteEndpoint")
	@Size(max = 256)
	public String connectedRemoteEndpoint;
	/**
	 * Statistics for this GRE tunnel, i.e. all traffic that has passed through the tunnel.

        The device MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e., Status parameter transitions to a disabled state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * GRE Interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). The {{object}} object models the GRE Header as defined in {{bibref|RFC2784}} and extensions to the GRE Header as defined in {{bibref|RFC2890}}. The {{object}} object provides a way to discriminate how sessions or flows are encapsulated within the GRE Tunnel. In addition the {{object}} object represents the entry point and exit point of the tunnel in relation to the LAN interface. Unless the Key Identifier of {{bibref|RFC2890}} is supported there is only one instance of this {{object}} object per tunnel.
	 */
	@XmlElementWrapper(name = "interfaces")
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public Collection<Interface> interfaces;

	public Tunnel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the tunnel.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the tunnel.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Tunnel withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the tunnel.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the tunnel.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Tunnel withStatus(String status) {
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
	public Tunnel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the Fully Qualified Domain Name (FQDN) or IP address of the remote GRE tunnel endpoint. If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getRemoteEndpoints() {
		if (this.remoteEndpoints == null){ this.remoteEndpoints=new ArrayList<>();}
		return remoteEndpoints;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP address of the remote GRE tunnel endpoint. If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.8
	 * @param remoteEndpoints the input value
	 */
	public void  setRemoteEndpoints(Collection<String> remoteEndpoints) {
		this.remoteEndpoints = remoteEndpoints;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP address of the remote GRE tunnel endpoint. If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Tunnel withRemoteEndpoints(String string) {
		getRemoteEndpoints().add(string);
		return this;
	}

	/**
	 * Get the mechanism used to keep the tunnel from timing out at the {{param|ConnectedRemoteEndpoint}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getKeepAlivePolicy() {
		return keepAlivePolicy;
	}

	/**
	 * Set the mechanism used to keep the tunnel from timing out at the {{param|ConnectedRemoteEndpoint}}.
	 *
	 * @since 2.8
	 * @param keepAlivePolicy the input value
	 */
	public void  setKeepAlivePolicy(String keepAlivePolicy) {
		this.keepAlivePolicy = keepAlivePolicy;
	}

	/**
	 * Set the mechanism used to keep the tunnel from timing out at the {{param|ConnectedRemoteEndpoint}}.
	 *
	 * @since 2.8
	 * @param keepAlivePolicy the input value
	 * @return this instance
	 */
	public Tunnel withKeepAlivePolicy(String keepAlivePolicy) {
		this.keepAlivePolicy = keepAlivePolicy;
		return this;
	}

	/**
	 * Get the tunnel keepalive timeout in seconds.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getKeepAliveTimeout() {
		return keepAliveTimeout;
	}

	/**
	 * Set the tunnel keepalive timeout in seconds.
	 *
	 * @since 2.8
	 * @param keepAliveTimeout the input value
	 */
	public void  setKeepAliveTimeout(Long keepAliveTimeout) {
		this.keepAliveTimeout = keepAliveTimeout;
	}

	/**
	 * Set the tunnel keepalive timeout in seconds.
	 *
	 * @since 2.8
	 * @param keepAliveTimeout the input value
	 * @return this instance
	 */
	public Tunnel withKeepAliveTimeout(Long keepAliveTimeout) {
		this.keepAliveTimeout = keepAliveTimeout;
		return this;
	}

	/**
	 * Get the number of KeepAlive messages unacknowledged by the {{param|ConnectedRemoteEndpoint}} before the {{object}} is perceived failed.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getKeepAliveThreshold() {
		return keepAliveThreshold;
	}

	/**
	 * Set the number of KeepAlive messages unacknowledged by the {{param|ConnectedRemoteEndpoint}} before the {{object}} is perceived failed.
	 *
	 * @since 2.8
	 * @param keepAliveThreshold the input value
	 */
	public void  setKeepAliveThreshold(Long keepAliveThreshold) {
		this.keepAliveThreshold = keepAliveThreshold;
	}

	/**
	 * Set the number of KeepAlive messages unacknowledged by the {{param|ConnectedRemoteEndpoint}} before the {{object}} is perceived failed.
	 *
	 * @since 2.8
	 * @param keepAliveThreshold the input value
	 * @return this instance
	 */
	public Tunnel withKeepAliveThreshold(Long keepAliveThreshold) {
		this.keepAliveThreshold = keepAliveThreshold;
		return this;
	}

	/**
	 * Get the protocol used for the delivery header.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getDeliveryHeaderProtocol() {
		return deliveryHeaderProtocol;
	}

	/**
	 * Set the protocol used for the delivery header.
	 *
	 * @since 2.8
	 * @param deliveryHeaderProtocol the input value
	 */
	public void  setDeliveryHeaderProtocol(String deliveryHeaderProtocol) {
		this.deliveryHeaderProtocol = deliveryHeaderProtocol;
	}

	/**
	 * Set the protocol used for the delivery header.
	 *
	 * @since 2.8
	 * @param deliveryHeaderProtocol the input value
	 * @return this instance
	 */
	public Tunnel withDeliveryHeaderProtocol(String deliveryHeaderProtocol) {
		this.deliveryHeaderProtocol = deliveryHeaderProtocol;
		return this;
	}

	/**
	 * Get the if the specified entries in the {{object|#.Filter}} table do not match this {{object}} object or an instance of the {{object|Interface}} object for this {{object}} object, then the value of this parameter is applied to the delivery header of the packets in this {{object}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getDefaultDSCPMark() {
		return defaultDSCPMark;
	}

	/**
	 * Set the if the specified entries in the {{object|#.Filter}} table do not match this {{object}} object or an instance of the {{object|Interface}} object for this {{object}} object, then the value of this parameter is applied to the delivery header of the packets in this {{object}}.
	 *
	 * @since 2.8
	 * @param defaultDSCPMark the input value
	 */
	public void  setDefaultDSCPMark(Long defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
	}

	/**
	 * Set the if the specified entries in the {{object|#.Filter}} table do not match this {{object}} object or an instance of the {{object|Interface}} object for this {{object}} object, then the value of this parameter is applied to the delivery header of the packets in this {{object}}.
	 *
	 * @since 2.8
	 * @param defaultDSCPMark the input value
	 * @return this instance
	 */
	public Tunnel withDefaultDSCPMark(Long defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
		return this;
	}

	/**
	 * Get the Fully Qualified Domain Name (FQDN) name or IP address of the connected remote GRE tunnel endpoint.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getConnectedRemoteEndpoint() {
		return connectedRemoteEndpoint;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) name or IP address of the connected remote GRE tunnel endpoint.
	 *
	 * @since 2.8
	 * @param connectedRemoteEndpoint the input value
	 */
	public void  setConnectedRemoteEndpoint(String connectedRemoteEndpoint) {
		this.connectedRemoteEndpoint = connectedRemoteEndpoint;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) name or IP address of the connected remote GRE tunnel endpoint.
	 *
	 * @since 2.8
	 * @param connectedRemoteEndpoint the input value
	 * @return this instance
	 */
	public Tunnel withConnectedRemoteEndpoint(String connectedRemoteEndpoint) {
		this.connectedRemoteEndpoint = connectedRemoteEndpoint;
		return this;
	}

	/**
	 * Get the statistics for this GRE tunnel, i.e. all traffic that has passed through the tunnel.

        The device MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e., Status parameter transitions to a disabled state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this GRE tunnel, i.e. all traffic that has passed through the tunnel.

        The device MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e., Status parameter transitions to a disabled state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this GRE tunnel, i.e. all traffic that has passed through the tunnel.

        The device MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e., Status parameter transitions to a disabled state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Tunnel withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the gre Interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). The {{object}} object models the GRE Header as defined in {{bibref|RFC2784}} and extensions to the GRE Header as defined in {{bibref|RFC2890}}. The {{object}} object provides a way to discriminate how sessions or flows are encapsulated within the GRE Tunnel. In addition the {{object}} object represents the entry point and exit point of the tunnel in relation to the LAN interface. Unless the Key Identifier of {{bibref|RFC2890}} is supported there is only one instance of this {{object}} object per tunnel.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the gre Interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). The {{object}} object models the GRE Header as defined in {{bibref|RFC2784}} and extensions to the GRE Header as defined in {{bibref|RFC2890}}. The {{object}} object provides a way to discriminate how sessions or flows are encapsulated within the GRE Tunnel. In addition the {{object}} object represents the entry point and exit point of the tunnel in relation to the LAN interface. Unless the Key Identifier of {{bibref|RFC2890}} is supported there is only one instance of this {{object}} object per tunnel.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the gre Interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). The {{object}} object models the GRE Header as defined in {{bibref|RFC2784}} and extensions to the GRE Header as defined in {{bibref|RFC2890}}. The {{object}} object provides a way to discriminate how sessions or flows are encapsulated within the GRE Tunnel. In addition the {{object}} object represents the entry point and exit point of the tunnel in relation to the LAN interface. Unless the Key Identifier of {{bibref|RFC2890}} is supported there is only one instance of this {{object}} object per tunnel.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Tunnel withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	//</editor-fold>

}