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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

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
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.appim.APPIREC;

	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.")
@XmlRootElement(name = "APPIM")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.APPIM")
@XmlAccessorType(XmlAccessType.FIELD)
public class APPIM {

	/**
	 * Lifetime of the information in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LIFETIME")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long lifETIME;
	/**
	 * The number of entries for {{object|.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NUMAPPIREC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 511)
	public Long numAPPIREC;
	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 */
	@XmlElementWrapper(name = "APPIRECs")
	@XmlElement(name = "APPIREC")
	@CWMPParameter(access = "readWrite")
	public Collection<APPIREC> appIRECs;

	public APPIM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the lifetime of the information in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLifETIME() {
		return lifETIME;
	}

	/**
	 * Set the lifetime of the information in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param lifETIME the input value
	 */
	public void  setLifETIME(Long lifETIME) {
		this.lifETIME = lifETIME;
	}

	/**
	 * Set the lifetime of the information in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param lifETIME the input value
	 * @return this instance
	 */
	public APPIM withLifETIME(Long lifETIME) {
		this.lifETIME = lifETIME;
		return this;
	}

	/**
	 * Get the number of entries for {{object|.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumAPPIREC() {
		return numAPPIREC;
	}

	/**
	 * Set the number of entries for {{object|.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.}}
	 *
	 * @since 2.0
	 * @param numAPPIREC the input value
	 */
	public void  setNumAPPIREC(Long numAPPIREC) {
		this.numAPPIREC = numAPPIREC;
	}

	/**
	 * Set the number of entries for {{object|.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.}}
	 *
	 * @since 2.0
	 * @param numAPPIREC the input value
	 * @return this instance
	 */
	public APPIM withNumAPPIREC(Long numAPPIREC) {
		this.numAPPIREC = numAPPIREC;
		return this;
	}

	/**
	 * Get the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @return the value
	 */
	public Collection<APPIREC> getAppIRECs() {
		if (this.appIRECs == null){ this.appIRECs=new ArrayList<>();}
		return appIRECs;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param appIRECs the input value
	 */
	public void  setAppIRECs(Collection<APPIREC> appIRECs) {
		this.appIRECs = appIRECs;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param appIREC the input value
	 * @return this instance
	 */
	public APPIM withAPPIREC(APPIREC appIREC) {
		getAppIRECs().add(appIREC);
		return this;
	}

	//</editor-fold>

}