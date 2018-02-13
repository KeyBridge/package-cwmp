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
package org.broadbandforum.tr181.device.upa._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This table contains information about PLC connections running between this UPA interface and other UPA devices.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.UPA.Interface.{i}.AssociatedDevice.{i}.")
@XmlRootElement(name = "AssociatedDevice")
@XmlType(name = "Device.UPA.Interface.AssociatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class AssociatedDevice {

	/**
	 * Remote UPA device MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The PLC port number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@Size(min = 0, max = 65535)
	public Long port;
	/**
	 * The name of the logical PLC network (human readable string).

          In the case where the associated device belongs to a different powerline network than the UPA interface, the actual network identifier of the neighboring network is not shown in {{param}}. Rather, only a generic string, e.g. "Network 1", "Network 2", etc is stored here due to security/privacy implications.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LogicalNetwork")
	@Size(max = 20)
	public String logicalNetwork;
	/**
	 * Physical transmission throughput (in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhyTxThroughput")
	public Long phyTxThroughput;
	/**
	 * Physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhyRxThroughput")
	public Long phyRxThroughput;
	/**
	 * Real Physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RealPhyRxThroughput")
	public Long realPhyRxThroughput;
	/**
	 * Estimated PDU Loss Rate measurement between two devices (i.e. estimated percent of MPDUs that have been  received with errors).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EstimatedPLR")
	@Size(min = 0, max = 100)
	public Long estimatedPLR;
	/**
	 * Mean estimated attenuation (i.e. channel loss between the local interface and the remote device). It is measured  in dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeanEstimatedAtt")
	public Long meanEstimatedAtt;
	/**
	 * Intermediate UPA adapter MAC address of the device that is acting as a relay to increase coverage in mesh scenarios. This is the MAC address of a third UPA device, with which the UPA interface is doing smart repeating in order to transmit data to the associated {{param|MACAddress}} UPA device. {{param}} will be empty when {{param|DirectRoute}} is {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SmartRouteIntermediatePLCMAC")
	public MACAddress smartRouteIntermediatePLCMAC;
	/**
	 * Route status, where {{true}} indicates ''direct'' and {{false}} indicates ''indirect''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DirectRoute")
	public Boolean directRoute;
	/**
	 * Whether or not this node is currently present in the UPA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the remote UPA device MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the remote UPA device MAC address.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the remote UPA device MAC address.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the PLC port number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the PLC port number.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the PLC port number.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public AssociatedDevice withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the name of the logical PLC network (human readable string).

          In the case where the associated device belongs to a different powerline network than the UPA interface, the actual network identifier of the neighboring network is not shown in {{param}}. Rather, only a generic string, e.g. "Network 1", "Network 2", etc is stored here due to security/privacy implications.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLogicalNetwork() {
		return logicalNetwork;
	}

	/**
	 * Set the name of the logical PLC network (human readable string).

          In the case where the associated device belongs to a different powerline network than the UPA interface, the actual network identifier of the neighboring network is not shown in {{param}}. Rather, only a generic string, e.g. "Network 1", "Network 2", etc is stored here due to security/privacy implications.
	 *
	 * @since 2.0
	 * @param logicalNetwork the input value
	 */
	public void  setLogicalNetwork(String logicalNetwork) {
		this.logicalNetwork = logicalNetwork;
	}

	/**
	 * Set the name of the logical PLC network (human readable string).

          In the case where the associated device belongs to a different powerline network than the UPA interface, the actual network identifier of the neighboring network is not shown in {{param}}. Rather, only a generic string, e.g. "Network 1", "Network 2", etc is stored here due to security/privacy implications.
	 *
	 * @since 2.0
	 * @param logicalNetwork the input value
	 * @return this instance
	 */
	public AssociatedDevice withLogicalNetwork(String logicalNetwork) {
		this.logicalNetwork = logicalNetwork;
		return this;
	}

	/**
	 * Get the physical transmission throughput (in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyTxThroughput() {
		return phyTxThroughput;
	}

	/**
	 * Set the physical transmission throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param phyTxThroughput the input value
	 */
	public void  setPhyTxThroughput(Long phyTxThroughput) {
		this.phyTxThroughput = phyTxThroughput;
	}

	/**
	 * Set the physical transmission throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param phyTxThroughput the input value
	 * @return this instance
	 */
	public AssociatedDevice withPhyTxThroughput(Long phyTxThroughput) {
		this.phyTxThroughput = phyTxThroughput;
		return this;
	}

	/**
	 * Get the physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyRxThroughput() {
		return phyRxThroughput;
	}

	/**
	 * Set the physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param phyRxThroughput the input value
	 */
	public void  setPhyRxThroughput(Long phyRxThroughput) {
		this.phyRxThroughput = phyRxThroughput;
	}

	/**
	 * Set the physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param phyRxThroughput the input value
	 * @return this instance
	 */
	public AssociatedDevice withPhyRxThroughput(Long phyRxThroughput) {
		this.phyRxThroughput = phyRxThroughput;
		return this;
	}

	/**
	 * Get the real Physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRealPhyRxThroughput() {
		return realPhyRxThroughput;
	}

	/**
	 * Set the real Physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param realPhyRxThroughput the input value
	 */
	public void  setRealPhyRxThroughput(Long realPhyRxThroughput) {
		this.realPhyRxThroughput = realPhyRxThroughput;
	}

	/**
	 * Set the real Physical reception throughput (in Mbps).
	 *
	 * @since 2.0
	 * @param realPhyRxThroughput the input value
	 * @return this instance
	 */
	public AssociatedDevice withRealPhyRxThroughput(Long realPhyRxThroughput) {
		this.realPhyRxThroughput = realPhyRxThroughput;
		return this;
	}

	/**
	 * Get the estimated PDU Loss Rate measurement between two devices (i.e. estimated percent of MPDUs that have been  received with errors).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEstimatedPLR() {
		return estimatedPLR;
	}

	/**
	 * Set the estimated PDU Loss Rate measurement between two devices (i.e. estimated percent of MPDUs that have been  received with errors).
	 *
	 * @since 2.0
	 * @param estimatedPLR the input value
	 */
	public void  setEstimatedPLR(Long estimatedPLR) {
		this.estimatedPLR = estimatedPLR;
	}

	/**
	 * Set the estimated PDU Loss Rate measurement between two devices (i.e. estimated percent of MPDUs that have been  received with errors).
	 *
	 * @since 2.0
	 * @param estimatedPLR the input value
	 * @return this instance
	 */
	public AssociatedDevice withEstimatedPLR(Long estimatedPLR) {
		this.estimatedPLR = estimatedPLR;
		return this;
	}

	/**
	 * Get the mean estimated attenuation (i.e. channel loss between the local interface and the remote device). It is measured  in dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMeanEstimatedAtt() {
		return meanEstimatedAtt;
	}

	/**
	 * Set the mean estimated attenuation (i.e. channel loss between the local interface and the remote device). It is measured  in dB.
	 *
	 * @since 2.0
	 * @param meanEstimatedAtt the input value
	 */
	public void  setMeanEstimatedAtt(Long meanEstimatedAtt) {
		this.meanEstimatedAtt = meanEstimatedAtt;
	}

	/**
	 * Set the mean estimated attenuation (i.e. channel loss between the local interface and the remote device). It is measured  in dB.
	 *
	 * @since 2.0
	 * @param meanEstimatedAtt the input value
	 * @return this instance
	 */
	public AssociatedDevice withMeanEstimatedAtt(Long meanEstimatedAtt) {
		this.meanEstimatedAtt = meanEstimatedAtt;
		return this;
	}

	/**
	 * Get the intermediate UPA adapter MAC address of the device that is acting as a relay to increase coverage in mesh scenarios. This is the MAC address of a third UPA device, with which the UPA interface is doing smart repeating in order to transmit data to the associated {{param|MACAddress}} UPA device. {{param}} will be empty when {{param|DirectRoute}} is {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getSmartRouteIntermediatePLCMAC() {
		return smartRouteIntermediatePLCMAC;
	}

	/**
	 * Set the intermediate UPA adapter MAC address of the device that is acting as a relay to increase coverage in mesh scenarios. This is the MAC address of a third UPA device, with which the UPA interface is doing smart repeating in order to transmit data to the associated {{param|MACAddress}} UPA device. {{param}} will be empty when {{param|DirectRoute}} is {{true}}.
	 *
	 * @since 2.0
	 * @param smartRouteIntermediatePLCMAC the input value
	 */
	public void  setSmartRouteIntermediatePLCMAC(MACAddress smartRouteIntermediatePLCMAC) {
		this.smartRouteIntermediatePLCMAC = smartRouteIntermediatePLCMAC;
	}

	/**
	 * Set the intermediate UPA adapter MAC address of the device that is acting as a relay to increase coverage in mesh scenarios. This is the MAC address of a third UPA device, with which the UPA interface is doing smart repeating in order to transmit data to the associated {{param|MACAddress}} UPA device. {{param}} will be empty when {{param|DirectRoute}} is {{true}}.
	 *
	 * @since 2.0
	 * @param smartRouteIntermediatePLCMAC the input value
	 * @return this instance
	 */
	public AssociatedDevice withSmartRouteIntermediatePLCMAC(MACAddress smartRouteIntermediatePLCMAC) {
		this.smartRouteIntermediatePLCMAC = smartRouteIntermediatePLCMAC;
		return this;
	}

	/**
	 * Get the route status, where {{true}} indicates ''direct'' and {{false}} indicates ''indirect''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDirectRoute() {
		return directRoute;
	}

	/**
	 * Set the route status, where {{true}} indicates ''direct'' and {{false}} indicates ''indirect''.
	 *
	 * @since 2.0
	 * @param directRoute the input value
	 */
	public void  setDirectRoute(Boolean directRoute) {
		this.directRoute = directRoute;
	}

	/**
	 * Set the route status, where {{true}} indicates ''direct'' and {{false}} indicates ''indirect''.
	 *
	 * @since 2.0
	 * @param directRoute the input value
	 * @return this instance
	 */
	public AssociatedDevice withDirectRoute(Boolean directRoute) {
		this.directRoute = directRoute;
		return this;
	}

	/**
	 * Get the whether or not this node is currently present in the UPA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this node is currently present in the UPA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this node is currently present in the UPA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public AssociatedDevice withActive(Boolean active) {
		this.active = active;
		return this;
	}

	//</editor-fold>

}