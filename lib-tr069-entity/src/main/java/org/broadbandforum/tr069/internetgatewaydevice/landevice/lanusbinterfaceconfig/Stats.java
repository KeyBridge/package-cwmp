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
package org.broadbandforum.tr069.internetgatewaydevice.landevice.lanusbinterfaceconfig;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains statistics for a USB LAN interface on a CPE device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}.Stats.")
public class Stats {

	/**
	 * Total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BytesSent")
	public Long bytesSent;
	/**
	 * Total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BytesReceived")
	public Long bytesReceived;
	/**
	 * Total number of cells sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CellsSent")
	public Long cellsSent;
	/**
	 * Total number of cells received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CellsReceived")
	public Long cellsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of cells sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCellsSent() {
		return cellsSent;
	}

	/**
	 * Set the total number of cells sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param cellsSent the input value
	 */
	public void  setCellsSent(Long cellsSent) {
		this.cellsSent = cellsSent;
	}

	/**
	 * Set the total number of cells sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param cellsSent the input value
	 * @return this instance
	 */
	public Stats withCellsSent(Long cellsSent) {
		this.cellsSent = cellsSent;
		return this;
	}

	/**
	 * Get the total number of cells received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCellsReceived() {
		return cellsReceived;
	}

	/**
	 * Set the total number of cells received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param cellsReceived the input value
	 */
	public void  setCellsReceived(Long cellsReceived) {
		this.cellsReceived = cellsReceived;
	}

	/**
	 * Set the total number of cells received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param cellsReceived the input value
	 * @return this instance
	 */
	public Stats withCellsReceived(Long cellsReceived) {
		this.cellsReceived = cellsReceived;
		return this;
	}

	//</editor-fold>

}