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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.ConnMode;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.IdleMode;

	/**
	 * This object contains parameters relating to the UE's mobility configuration. It covers both idle mode and connected mode.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.")
@XmlRootElement(name = "Mobility")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mobility {

	/**
	 * This object contains parameters relating to the UE's mobility while it is in idle mode (cell (re-)selection). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 */
	@XmlElement(name = "IdleMode")
	public IdleMode idleMode;
	/**
	 * This object contains parameters relating to the UE's mobility while it is in connected mode (handover). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 */
	@XmlElement(name = "ConnMode")
	public ConnMode connMode;

	public Mobility() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the UE's mobility while it is in idle mode (cell (re-)selection). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @return the value
	 */
	public IdleMode getIdleMode() {
		return idleMode;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility while it is in idle mode (cell (re-)selection). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @param idleMode the input value
	 */
	public void  setIdleMode(IdleMode idleMode) {
		this.idleMode = idleMode;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility while it is in idle mode (cell (re-)selection). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @param idleMode the input value
	 * @return this instance
	 */
	public Mobility withIdleMode(IdleMode idleMode) {
		this.idleMode = idleMode;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the UE's mobility while it is in connected mode (handover). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @return the value
	 */
	public ConnMode getConnMode() {
		return connMode;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility while it is in connected mode (handover). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @param connMode the input value
	 */
	public void  setConnMode(ConnMode connMode) {
		this.connMode = connMode;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility while it is in connected mode (handover). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @param connMode the input value
	 * @return this instance
	 */
	public Mobility withConnMode(ConnMode connMode) {
		this.connMode = connMode;
		return this;
	}

	//</editor-fold>

}