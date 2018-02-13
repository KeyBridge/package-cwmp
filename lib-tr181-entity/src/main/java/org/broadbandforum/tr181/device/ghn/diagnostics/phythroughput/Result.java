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
package org.broadbandforum.tr181.device.ghn.diagnostics.phythroughput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * PHY throughput diagnostics results.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PHYThroughput.Result.{i}.")
@XmlRootElement(name = "Device.Ghn.Diagnostics.PHYThroughput.Result")
@XmlType(name = "Device.Ghn.Diagnostics.PHYThroughput.Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	/**
	 * MAC address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DestinationMACAddress")
	public MACAddress destinationMACAddress;
	/**
	 * Indicates the state of the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LinkState")
	public String linkState;
	/**
	 * PHY data rate in transmit direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TxPhyRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Mbps")
	public Long txphyRate;
	/**
	 * PHY data rate in receive direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}}  and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RxPhyRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Mbps")
	public Long rxphyRate;

	public Result() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getDestinationMACAddress() {
		return destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 */
	public void  setDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 * @return this instance
	 */
	public Result withDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
		return this;
	}

	/**
	 * Get the indicates the state of the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getLinkState() {
		return linkState;
	}

	/**
	 * Set the indicates the state of the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}.
	 *
	 * @since 2.8
	 * @param linkState the input value
	 */
	public void  setLinkState(String linkState) {
		this.linkState = linkState;
	}

	/**
	 * Set the indicates the state of the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}.
	 *
	 * @since 2.8
	 * @param linkState the input value
	 * @return this instance
	 */
	public Result withLinkState(String linkState) {
		this.linkState = linkState;
		return this;
	}

	/**
	 * Get the phy data rate in transmit direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getTxphyRate() {
		return txphyRate;
	}

	/**
	 * Set the phy data rate in transmit direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @param txphyRate the input value
	 */
	public void  setTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
	}

	/**
	 * Set the phy data rate in transmit direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}} and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @param txphyRate the input value
	 * @return this instance
	 */
	public Result withTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
		return this;
	}

	/**
	 * Get the phy data rate in receive direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}}  and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRxphyRate() {
		return rxphyRate;
	}

	/**
	 * Set the phy data rate in receive direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}}  and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @param rxphyRate the input value
	 */
	public void  setRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
	}

	/**
	 * Set the phy data rate in receive direction in the link between the G.hn Interface with MAC address {{param|#.DiagnoseMACAddress}}  and the G.hn Interface with MAC address {{param|DestinationMACAddress}}. It is represented in Mbps as defined in Note 1 to {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.8
	 * @param rxphyRate the input value
	 * @return this instance
	 */
	public Result withRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
		return this;
	}

	//</editor-fold>

}