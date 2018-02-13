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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.onex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.onex.cell.ControlChannel;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.onex.cell.RF;

	/**
	 * Table indicating the components of the discovered cells.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.")
@XmlRootElement(name = "Cell")
@XmlType(name = "FAPService.REM.CDMA2000.OneX.Cell")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cell {

	/**
	 * RF REM results for each detected cell.
	 */
	@XmlElement(name = "RF")
	public RF rf;
	/**
	 * Table containing information broadcast on control channel.
	 */
	@XmlElement(name = "ControlChannel")
	public ControlChannel controlChannel;

	public Cell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the rf REM results for each detected cell.
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the rf REM results for each detected cell.
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the rf REM results for each detected cell.
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public Cell withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	/**
	 * Get the table containing information broadcast on control channel.
	 *
	 * @return the value
	 */
	public ControlChannel getControlChannel() {
		return controlChannel;
	}

	/**
	 * Set the table containing information broadcast on control channel.
	 *
	 * @param controlChannel the input value
	 */
	public void  setControlChannel(ControlChannel controlChannel) {
		this.controlChannel = controlChannel;
	}

	/**
	 * Set the table containing information broadcast on control channel.
	 *
	 * @param controlChannel the input value
	 * @return this instance
	 */
	public Cell withControlChannel(ControlChannel controlChannel) {
		this.controlChannel = controlChannel;
		return this;
	}

	//</editor-fold>

}