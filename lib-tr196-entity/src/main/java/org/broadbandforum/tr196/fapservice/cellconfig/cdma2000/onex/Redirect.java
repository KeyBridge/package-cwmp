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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * CDMA2000 1x service redirection parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.Redirect.")
@XmlRootElement(name = "Redirect")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.Redirect")
@XmlAccessorType(XmlAccessType.FIELD)
public class Redirect {

	/**
	 * The channel number set from ACS that the FAP uses to redirect the MS in case of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the AT. The supported range is 0..2047.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RedirectChannelNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2047)
	public Long redirectChannelNumber;
	/**
	 * The bandclass set from ACS that the FAP uses to redirect the MS incase of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the MS. The supported range is 0..9.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RedirectBandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long redirectBandClass;

	public Redirect() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the channel number set from ACS that the FAP uses to redirect the MS in case of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the AT. The supported range is 0..2047.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRedirectChannelNumber() {
		return redirectChannelNumber;
	}

	/**
	 * Set the channel number set from ACS that the FAP uses to redirect the MS in case of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the AT. The supported range is 0..2047.
	 *
	 * @since 2.0
	 * @param redirectChannelNumber the input value
	 */
	public void  setRedirectChannelNumber(Long redirectChannelNumber) {
		this.redirectChannelNumber = redirectChannelNumber;
	}

	/**
	 * Set the channel number set from ACS that the FAP uses to redirect the MS in case of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the AT. The supported range is 0..2047.
	 *
	 * @since 2.0
	 * @param redirectChannelNumber the input value
	 * @return this instance
	 */
	public Redirect withRedirectChannelNumber(Long redirectChannelNumber) {
		this.redirectChannelNumber = redirectChannelNumber;
		return this;
	}

	/**
	 * Get the bandclass set from ACS that the FAP uses to redirect the MS incase of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the MS. The supported range is 0..9.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRedirectBandClass() {
		return redirectBandClass;
	}

	/**
	 * Set the bandclass set from ACS that the FAP uses to redirect the MS incase of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the MS. The supported range is 0..9.
	 *
	 * @since 2.0
	 * @param redirectBandClass the input value
	 */
	public void  setRedirectBandClass(Long redirectBandClass) {
		this.redirectBandClass = redirectBandClass;
	}

	/**
	 * Set the bandclass set from ACS that the FAP uses to redirect the MS incase of closed access or when exceeding session capacity. The ACS shall push this if the the operator has provided this information in a configuration file. If this is not configured, the FAP rejects the MS. The supported range is 0..9.
	 *
	 * @since 2.0
	 * @param redirectBandClass the input value
	 * @return this instance
	 */
	public Redirect withRedirectBandClass(Long redirectBandClass) {
		this.redirectBandClass = redirectBandClass;
		return this;
	}

	//</editor-fold>

}