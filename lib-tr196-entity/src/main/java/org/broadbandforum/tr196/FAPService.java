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
package org.broadbandforum.tr196;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.fapservice.AccessMgmt;
import org.broadbandforum.tr196.fapservice.Capabilities;
import org.broadbandforum.tr196.fapservice.CellConfig;
import org.broadbandforum.tr196.fapservice.FAPControl;
import org.broadbandforum.tr196.fapservice.REM;
import org.broadbandforum.tr196.fapservice.Transport;

	/**
	 * The Femto Access Point (FAP) Service Object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.")
@XmlRootElement(name = "FAPService")
@XmlType(name = "FAPService")
@XmlAccessorType(XmlAccessType.FIELD)
public class FAPService {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The type of FAP device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceType")
	public String deviceType;
	/**
	 * The Distinguished Name prefix (DNPrefix) is an operator-configurable prefix string that is pre-pended to object distinguished names in the {{bibref|TR-157a5}} alarm object. See {{bibref|3GPP-TS.32.300}} for the formal definition and examples of DNPrefix as applied to 3GPP alarm objects
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNPrefix")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String dnprefix;
	/**
	 * This object contains parameters relating to the hardware capabilities of the FAP device.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * This object contains parameters relating to state management and provisioning aspects of the FAP.
	 */
	@XmlElement(name = "FAPControl")
	public FAPControl fapControl;
	/**
	 * This object contains parameters relating to Access Management for the different radio technologies.
	 */
	@XmlElement(name = "AccessMgmt")
	public AccessMgmt accessMgmt;
	/**
	 * This object contains parameters relating to configuring the FAP.
	 */
	@XmlElement(name = "CellConfig")
	public CellConfig cellConfig;
	/**
	 * This object contains parameters relating to REM (Radio Environment Measurement).
	 */
	@XmlElement(name = "REM")
	public REM rem;
	/**
	 * This object contains parameters relating to the transport.
	 */
	@XmlElement(name = "Transport")
	public Transport transport;

	public FAPService() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public FAPService withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the type of FAP device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * Set the type of FAP device.
	 *
	 * @since 2.0
	 * @param deviceType the input value
	 */
	public void  setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * Set the type of FAP device.
	 *
	 * @since 2.0
	 * @param deviceType the input value
	 * @return this instance
	 */
	public FAPService withDeviceType(String deviceType) {
		this.deviceType = deviceType;
		return this;
	}

	/**
	 * Get the Distinguished Name prefix (DNPrefix) is an operator-configurable prefix string that is pre-pended to object distinguished names in the {{bibref|TR-157a5}} alarm object. See {{bibref|3GPP-TS.32.300}} for the formal definition and examples of DNPrefix as applied to 3GPP alarm objects
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDnprefix() {
		return dnprefix;
	}

	/**
	 * Set the Distinguished Name prefix (DNPrefix) is an operator-configurable prefix string that is pre-pended to object distinguished names in the {{bibref|TR-157a5}} alarm object. See {{bibref|3GPP-TS.32.300}} for the formal definition and examples of DNPrefix as applied to 3GPP alarm objects
	 *
	 * @since 2.0
	 * @param dnprefix the input value
	 */
	public void  setDnprefix(String dnprefix) {
		this.dnprefix = dnprefix;
	}

	/**
	 * Set the Distinguished Name prefix (DNPrefix) is an operator-configurable prefix string that is pre-pended to object distinguished names in the {{bibref|TR-157a5}} alarm object. See {{bibref|3GPP-TS.32.300}} for the formal definition and examples of DNPrefix as applied to 3GPP alarm objects
	 *
	 * @since 2.0
	 * @param dnprefix the input value
	 * @return this instance
	 */
	public FAPService withDnprefix(String dnprefix) {
		this.dnprefix = dnprefix;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the hardware capabilities of the FAP device.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the this object contains parameters relating to the hardware capabilities of the FAP device.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the this object contains parameters relating to the hardware capabilities of the FAP device.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public FAPService withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to state management and provisioning aspects of the FAP.
	 *
	 * @return the value
	 */
	public FAPControl getFapControl() {
		return fapControl;
	}

	/**
	 * Set the this object contains parameters relating to state management and provisioning aspects of the FAP.
	 *
	 * @param fapControl the input value
	 */
	public void  setFapControl(FAPControl fapControl) {
		this.fapControl = fapControl;
	}

	/**
	 * Set the this object contains parameters relating to state management and provisioning aspects of the FAP.
	 *
	 * @param fapControl the input value
	 * @return this instance
	 */
	public FAPService withFapControl(FAPControl fapControl) {
		this.fapControl = fapControl;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Access Management for the different radio technologies.
	 *
	 * @return the value
	 */
	public AccessMgmt getAccessMgmt() {
		return accessMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Access Management for the different radio technologies.
	 *
	 * @param accessMgmt the input value
	 */
	public void  setAccessMgmt(AccessMgmt accessMgmt) {
		this.accessMgmt = accessMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Access Management for the different radio technologies.
	 *
	 * @param accessMgmt the input value
	 * @return this instance
	 */
	public FAPService withAccessMgmt(AccessMgmt accessMgmt) {
		this.accessMgmt = accessMgmt;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the FAP.
	 *
	 * @return the value
	 */
	public CellConfig getCellConfig() {
		return cellConfig;
	}

	/**
	 * Set the this object contains parameters relating to configuring the FAP.
	 *
	 * @param cellConfig the input value
	 */
	public void  setCellConfig(CellConfig cellConfig) {
		this.cellConfig = cellConfig;
	}

	/**
	 * Set the this object contains parameters relating to configuring the FAP.
	 *
	 * @param cellConfig the input value
	 * @return this instance
	 */
	public FAPService withCellConfig(CellConfig cellConfig) {
		this.cellConfig = cellConfig;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to REM (Radio Environment Measurement).
	 *
	 * @return the value
	 */
	public REM getRem() {
		return rem;
	}

	/**
	 * Set the this object contains parameters relating to REM (Radio Environment Measurement).
	 *
	 * @param rem the input value
	 */
	public void  setRem(REM rem) {
		this.rem = rem;
	}

	/**
	 * Set the this object contains parameters relating to REM (Radio Environment Measurement).
	 *
	 * @param rem the input value
	 * @return this instance
	 */
	public FAPService withRem(REM rem) {
		this.rem = rem;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the transport.
	 *
	 * @return the value
	 */
	public Transport getTransport() {
		return transport;
	}

	/**
	 * Set the this object contains parameters relating to the transport.
	 *
	 * @param transport the input value
	 */
	public void  setTransport(Transport transport) {
		this.transport = transport;
	}

	/**
	 * Set the this object contains parameters relating to the transport.
	 *
	 * @param transport the input value
	 * @return this instance
	 */
	public FAPService withTransport(Transport transport) {
		this.transport = transport;
		return this;
	}

	//</editor-fold>

}