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
package org.broadbandforum.tr069.internetgatewaydevice.layer3forwarding;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr069.datatypes.IPAddress;

	/**
	 * Layer-3 forwarding table.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer3Forwarding.Forwarding.{i}.")
public class Forwarding {

	/**
	 * Enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the forwarding entry.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Indicates the type of route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type;
	/**
	 * Destination address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIPAddress;
	/**
	 * Destination subnet mask.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destSubnetMask;
	/**
	 * Source address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourceIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIPAddress;
	/**
	 * Source subnet mask.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourceSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceSubnetMask;
	/**
	 * IP address of the gateway.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GatewayIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress gatewayIPAddress;
	/**
	 * Specifies the WAN interface associated with this entry.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;
	/**
	 * Forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ForwardingMetric")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingMetric;
	/**
	 * The maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MTU")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1540)
	public Long mtu;

	public Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Forwarding withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the forwarding entry.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public Forwarding withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates the type of route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the indicates the type of route.
	 *
	 * @since 1.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the indicates the type of route.
	 *
	 * @since 1.0
	 * @param type the input value
	 * @return this instance
	 */
	public Forwarding withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the destination address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDestIPAddress() {
		return destIPAddress;
	}

	/**
	 * Set the destination address.
	 *
	 * @since 1.0
	 * @param destIPAddress the input value
	 */
	public void  setDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
	}

	/**
	 * Set the destination address.
	 *
	 * @since 1.0
	 * @param destIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
		return this;
	}

	/**
	 * Get the destination subnet mask.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDestSubnetMask() {
		return destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.
	 *
	 * @since 1.0
	 * @param destSubnetMask the input value
	 */
	public void  setDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.
	 *
	 * @since 1.0
	 * @param destSubnetMask the input value
	 * @return this instance
	 */
	public Forwarding withDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
		return this;
	}

	/**
	 * Get the source address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSourceIPAddress() {
		return sourceIPAddress;
	}

	/**
	 * Set the source address.
	 *
	 * @since 1.0
	 * @param sourceIPAddress the input value
	 */
	public void  setSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
	}

	/**
	 * Set the source address.
	 *
	 * @since 1.0
	 * @param sourceIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
		return this;
	}

	/**
	 * Get the source subnet mask.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSourceSubnetMask() {
		return sourceSubnetMask;
	}

	/**
	 * Set the source subnet mask.
	 *
	 * @since 1.0
	 * @param sourceSubnetMask the input value
	 */
	public void  setSourceSubnetMask(IPAddress sourceSubnetMask) {
		this.sourceSubnetMask = sourceSubnetMask;
	}

	/**
	 * Set the source subnet mask.
	 *
	 * @since 1.0
	 * @param sourceSubnetMask the input value
	 * @return this instance
	 */
	public Forwarding withSourceSubnetMask(IPAddress sourceSubnetMask) {
		this.sourceSubnetMask = sourceSubnetMask;
		return this;
	}

	/**
	 * Get the ip address of the gateway.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getGatewayIPAddress() {
		return gatewayIPAddress;
	}

	/**
	 * Set the ip address of the gateway.
	 *
	 * @since 1.0
	 * @param gatewayIPAddress the input value
	 */
	public void  setGatewayIPAddress(IPAddress gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
	}

	/**
	 * Set the ip address of the gateway.
	 *
	 * @since 1.0
	 * @param gatewayIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withGatewayIPAddress(IPAddress gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
		return this;
	}

	/**
	 * Get the specifies the WAN interface associated with this entry.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the specifies the WAN interface associated with this entry.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the specifies the WAN interface associated with this entry.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Forwarding with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getForwardingMetric() {
		return forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @param forwardingMetric the input value
	 */
	public void  setForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @param forwardingMetric the input value
	 * @return this instance
	 */
	public Forwarding withForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
		return this;
	}

	/**
	 * Get the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMtu() {
		return mtu;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @param mtu the input value
	 */
	public void  setMtu(Long mtu) {
		this.mtu = mtu;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @param mtu the input value
	 * @return this instance
	 */
	public Forwarding withMtu(Long mtu) {
		this.mtu = mtu;
		return this;
	}

	//</editor-fold>

}