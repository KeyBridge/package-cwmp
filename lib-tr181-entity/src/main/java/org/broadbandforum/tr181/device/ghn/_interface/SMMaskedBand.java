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
package org.broadbandforum.tr181.device.ghn._interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Specifies the list of masked bands to be applied to the G.hn interface.  This information is conveyed by the Domain Master in the SM descriptor as specified in {{bibref|G.9961|Table 8-77}}.

        Instances of this object are expected to exist only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.SMMaskedBand.{i}.")
@XmlRootElement(name = "SMMaskedBand")
@XmlType(name = "Device.Ghn.Interface.SMMaskedBand")
@XmlAccessorType(XmlAccessType.FIELD)
public class SMMaskedBand {

	/**
	 * Enables or disables the {{object}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The masked band number.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BandNumber")
	@CWMPParameter(access = "readWrite")
	public Long bandNumber;
	/**
	 * Index of the lowest frequency sub-carrier in the band to be masked as specified in {{bibref|G.9961|Table 8-79}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "StartSubCarrier")
	@CWMPParameter(access = "readWrite")
	public Long startSubCarrier;
	/**
	 * Index of the highest frequency sub-carrier in the band to be masked as specified in Table 8-79 in {{bibref|G.9961}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "StopSubCarrier")
	@CWMPParameter(access = "readWrite")
	public Long stopSubCarrier;

	public SMMaskedBand() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public SMMaskedBand withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the masked band number.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getBandNumber() {
		return bandNumber;
	}

	/**
	 * Set the masked band number.
	 *
	 * @since 2.8
	 * @param bandNumber the input value
	 */
	public void  setBandNumber(Long bandNumber) {
		this.bandNumber = bandNumber;
	}

	/**
	 * Set the masked band number.
	 *
	 * @since 2.8
	 * @param bandNumber the input value
	 * @return this instance
	 */
	public SMMaskedBand withBandNumber(Long bandNumber) {
		this.bandNumber = bandNumber;
		return this;
	}

	/**
	 * Get the index of the lowest frequency sub-carrier in the band to be masked as specified in {{bibref|G.9961|Table 8-79}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getStartSubCarrier() {
		return startSubCarrier;
	}

	/**
	 * Set the index of the lowest frequency sub-carrier in the band to be masked as specified in {{bibref|G.9961|Table 8-79}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @param startSubCarrier the input value
	 */
	public void  setStartSubCarrier(Long startSubCarrier) {
		this.startSubCarrier = startSubCarrier;
	}

	/**
	 * Set the index of the lowest frequency sub-carrier in the band to be masked as specified in {{bibref|G.9961|Table 8-79}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @param startSubCarrier the input value
	 * @return this instance
	 */
	public SMMaskedBand withStartSubCarrier(Long startSubCarrier) {
		this.startSubCarrier = startSubCarrier;
		return this;
	}

	/**
	 * Get the index of the highest frequency sub-carrier in the band to be masked as specified in Table 8-79 in {{bibref|G.9961}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getStopSubCarrier() {
		return stopSubCarrier;
	}

	/**
	 * Set the index of the highest frequency sub-carrier in the band to be masked as specified in Table 8-79 in {{bibref|G.9961}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @param stopSubCarrier the input value
	 */
	public void  setStopSubCarrier(Long stopSubCarrier) {
		this.stopSubCarrier = stopSubCarrier;
	}

	/**
	 * Set the index of the highest frequency sub-carrier in the band to be masked as specified in Table 8-79 in {{bibref|G.9961}}. This parameter is writable only on the interface which acts as the Domain Master.
	 *
	 * @since 2.8
	 * @param stopSubCarrier the input value
	 * @return this instance
	 */
	public SMMaskedBand withStopSubCarrier(Long stopSubCarrier) {
		this.stopSubCarrier = stopSubCarrier;
		return this;
	}

	//</editor-fold>

}