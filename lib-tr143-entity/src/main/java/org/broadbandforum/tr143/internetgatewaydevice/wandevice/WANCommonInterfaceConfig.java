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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice;

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
import org.broadbandforum.tr143.internetgatewaydevice.wandevice.wancommoninterfaceconfig.Connection;

	/**
	 * This object models WAN interface properties common across all connection instances.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANCommonInterfaceConfig.")
@XmlRootElement(name = "WANCommonInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANCommonInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANCommonInterfaceConfig {

	/**
	 * Used to enable or disable access to and from the Internet across all connection instances.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EnabledForInternet")
	@CWMPParameter(access = "readWrite")
	public Boolean enabledForInternet;
	/**
	 * Specifies the WAN access (modem) type.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WANAccessType")
	public String wanAccessType;
	/**
	 * Specifies the maximum upstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Layer1UpstreamMaxBitRate")
	public Long layer1UpstreamMaxBitRate;
	/**
	 * Specifies the maximum downstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Layer1DownstreamMaxBitRate")
	public Long layer1DownstreamMaxBitRate;
	/**
	 * Indicates the state of the physical connection (link) from WANDevice to a connected entity.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PhysicalLinkStatus")
	public String physicalLinkStatus;
	/**
	 * Name of the Service Provider providing link connectivity on the WAN.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WANAccessProvider")
	@Size(max = 256)
	public String wanAccessProvider;
	/**
	 * The cumulative counter for total number of bytes sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesSent;
	/**
	 * The cumulative counter for total number of bytes received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesReceived;
	/**
	 * The cumulative counter for total number of packets (IP or PPP) sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsSent;
	/**
	 * The cumulative counter for total number of packets (IP or PPP) received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsReceived;
	/**
	 * Indicates the maximum number of active connections the CPE can simultaneously support.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumActiveConnections")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maximumActiveConnections;
	/**
	 * Number of WAN connection service instances currently active on this WAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfActiveConnections")
	public Long numberOfActiveConnections;
	/**
	 * Active connection table.
	 */
	@XmlElementWrapper(name = "Connections")
	@XmlElement(name = "Connection")
	public Collection<Connection> connections;

	public WANCommonInterfaceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the used to enable or disable access to and from the Internet across all connection instances.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnabledForInternet() {
		return enabledForInternet;
	}

	/**
	 * Set the used to enable or disable access to and from the Internet across all connection instances.
	 *
	 * @since 1.0
	 * @param enabledForInternet the input value
	 */
	public void  setEnabledForInternet(Boolean enabledForInternet) {
		this.enabledForInternet = enabledForInternet;
	}

	/**
	 * Set the used to enable or disable access to and from the Internet across all connection instances.
	 *
	 * @since 1.0
	 * @param enabledForInternet the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withEnabledForInternet(Boolean enabledForInternet) {
		this.enabledForInternet = enabledForInternet;
		return this;
	}

	/**
	 * Get the specifies the WAN access (modem) type.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWanAccessType() {
		return wanAccessType;
	}

	/**
	 * Set the specifies the WAN access (modem) type.
	 *
	 * @since 1.0
	 * @param wanAccessType the input value
	 */
	public void  setWanAccessType(String wanAccessType) {
		this.wanAccessType = wanAccessType;
	}

	/**
	 * Set the specifies the WAN access (modem) type.
	 *
	 * @since 1.0
	 * @param wanAccessType the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withWanAccessType(String wanAccessType) {
		this.wanAccessType = wanAccessType;
		return this;
	}

	/**
	 * Get the specifies the maximum upstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLayer1UpstreamMaxBitRate() {
		return layer1UpstreamMaxBitRate;
	}

	/**
	 * Set the specifies the maximum upstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @param layer1UpstreamMaxBitRate the input value
	 */
	public void  setLayer1UpstreamMaxBitRate(Long layer1UpstreamMaxBitRate) {
		this.layer1UpstreamMaxBitRate = layer1UpstreamMaxBitRate;
	}

	/**
	 * Set the specifies the maximum upstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @param layer1UpstreamMaxBitRate the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withLayer1UpstreamMaxBitRate(Long layer1UpstreamMaxBitRate) {
		this.layer1UpstreamMaxBitRate = layer1UpstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the specifies the maximum downstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLayer1DownstreamMaxBitRate() {
		return layer1DownstreamMaxBitRate;
	}

	/**
	 * Set the specifies the maximum downstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @param layer1DownstreamMaxBitRate the input value
	 */
	public void  setLayer1DownstreamMaxBitRate(Long layer1DownstreamMaxBitRate) {
		this.layer1DownstreamMaxBitRate = layer1DownstreamMaxBitRate;
	}

	/**
	 * Set the specifies the maximum downstream theoretical bit rate for the WAN device in bits per second.  This describes the maximum possible rate given the type of interface assuming the best-case operating environment, regardless of the current operating rate.

For example, if the physical interface is 100BaseT, this value would be 100000000, regardless of the current operating rate.
	 *
	 * @since 1.0
	 * @param layer1DownstreamMaxBitRate the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withLayer1DownstreamMaxBitRate(Long layer1DownstreamMaxBitRate) {
		this.layer1DownstreamMaxBitRate = layer1DownstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the indicates the state of the physical connection (link) from WANDevice to a connected entity.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPhysicalLinkStatus() {
		return physicalLinkStatus;
	}

	/**
	 * Set the indicates the state of the physical connection (link) from WANDevice to a connected entity.
	 *
	 * @since 1.0
	 * @param physicalLinkStatus the input value
	 */
	public void  setPhysicalLinkStatus(String physicalLinkStatus) {
		this.physicalLinkStatus = physicalLinkStatus;
	}

	/**
	 * Set the indicates the state of the physical connection (link) from WANDevice to a connected entity.
	 *
	 * @since 1.0
	 * @param physicalLinkStatus the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withPhysicalLinkStatus(String physicalLinkStatus) {
		this.physicalLinkStatus = physicalLinkStatus;
		return this;
	}

	/**
	 * Get the name of the Service Provider providing link connectivity on the WAN.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWanAccessProvider() {
		return wanAccessProvider;
	}

	/**
	 * Set the name of the Service Provider providing link connectivity on the WAN.
	 *
	 * @since 1.0
	 * @param wanAccessProvider the input value
	 */
	public void  setWanAccessProvider(String wanAccessProvider) {
		this.wanAccessProvider = wanAccessProvider;
	}

	/**
	 * Set the name of the Service Provider providing link connectivity on the WAN.
	 *
	 * @since 1.0
	 * @param wanAccessProvider the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withWanAccessProvider(String wanAccessProvider) {
		this.wanAccessProvider = wanAccessProvider;
		return this;
	}

	/**
	 * Get the cumulative counter for total number of bytes sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the cumulative counter for total number of bytes sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the cumulative counter for total number of bytes sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the cumulative counter for total number of bytes received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the cumulative counter for total number of bytes received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the cumulative counter for total number of bytes received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the cumulative counter for total number of packets (IP or PPP) sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsSent() {
		return totalPacketsSent;
	}

	/**
	 * Set the cumulative counter for total number of packets (IP or PPP) sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 */
	public void  setTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
	}

	/**
	 * Set the cumulative counter for total number of packets (IP or PPP) sent upstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
		return this;
	}

	/**
	 * Get the cumulative counter for total number of packets (IP or PPP) received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsReceived() {
		return totalPacketsReceived;
	}

	/**
	 * Set the cumulative counter for total number of packets (IP or PPP) received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 */
	public void  setTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
	}

	/**
	 * Set the cumulative counter for total number of packets (IP or PPP) received downstream across all connection service instances on the WAN device.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
		return this;
	}

	/**
	 * Get the indicates the maximum number of active connections the CPE can simultaneously support.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumActiveConnections() {
		return maximumActiveConnections;
	}

	/**
	 * Set the indicates the maximum number of active connections the CPE can simultaneously support.
	 *
	 * @since 1.0
	 * @param maximumActiveConnections the input value
	 */
	public void  setMaximumActiveConnections(Long maximumActiveConnections) {
		this.maximumActiveConnections = maximumActiveConnections;
	}

	/**
	 * Set the indicates the maximum number of active connections the CPE can simultaneously support.
	 *
	 * @since 1.0
	 * @param maximumActiveConnections the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withMaximumActiveConnections(Long maximumActiveConnections) {
		this.maximumActiveConnections = maximumActiveConnections;
		return this;
	}

	/**
	 * Get the number of WAN connection service instances currently active on this WAN interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfActiveConnections() {
		return numberOfActiveConnections;
	}

	/**
	 * Set the number of WAN connection service instances currently active on this WAN interface.
	 *
	 * @since 1.0
	 * @param numberOfActiveConnections the input value
	 */
	public void  setNumberOfActiveConnections(Long numberOfActiveConnections) {
		this.numberOfActiveConnections = numberOfActiveConnections;
	}

	/**
	 * Set the number of WAN connection service instances currently active on this WAN interface.
	 *
	 * @since 1.0
	 * @param numberOfActiveConnections the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withNumberOfActiveConnections(Long numberOfActiveConnections) {
		this.numberOfActiveConnections = numberOfActiveConnections;
		return this;
	}

	/**
	 * Get active connection table.
	 *
	 * @return the value
	 */
	public Collection<Connection> getConnections() {
		if (this.connections == null){ this.connections=new ArrayList<>();}
		return connections;
	}

	/**
	 * Set active connection table.
	 *
	 * @param connections the input value
	 */
	public void  setConnections(Collection<Connection> connections) {
		this.connections = connections;
	}

	/**
	 * Set active connection table.
	 *
	 * @param connection the input value
	 * @return this instance
	 */
	public WANCommonInterfaceConfig withConnection(Connection connection) {
		getConnections().add(connection);
		return this;
	}

	//</editor-fold>

}