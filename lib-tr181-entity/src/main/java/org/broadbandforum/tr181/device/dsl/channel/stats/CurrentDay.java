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
package org.broadbandforum.tr181.device.dsl.channel.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains DSL channel statistics accumulated during the current day {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Channel.{i}.Stats.CurrentDay.")
@XmlRootElement(name = "CurrentDay")
@XmlType(name = "Device.DSL.Channel.Stats.CurrentDay")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrentDay {

	/**
	 * Number of FEC errors detected since the second most recent DSL Showtime (FEC-C as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURFECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuRFECErrors;
	/**
	 * Number of FEC errors detected by the ATU-C since the second most recent DSL Showtime (FEC-CFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCFECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuCFECErrors;
	/**
	 * Number of HEC errors detected since the second most recent DSL Showtime (HEC-P as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURHECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuRHECErrors;
	/**
	 * Number of HEC errors detected by the ATU-C since the second most recent DSL Showtime (HEC-PFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCHECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuCHECErrors;
	/**
	 * Number of CRC errors detected since the second most recent DSL Showtime (CV-C as defined in ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURCRCErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuRCRCErrors;
	/**
	 * Number of CRC errors detected by the ATU-C since the second most recent DSL Showtime (CV-CFE as defined in ITU-T  Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCCRCErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long xtuCCRCErrors;

	public CurrentDay() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of FEC errors detected since the second most recent DSL Showtime (FEC-C as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuRFECErrors() {
		return xtuRFECErrors;
	}

	/**
	 * Set the number of FEC errors detected since the second most recent DSL Showtime (FEC-C as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRFECErrors the input value
	 */
	public void  setXtuRFECErrors(Long xtuRFECErrors) {
		this.xtuRFECErrors = xtuRFECErrors;
	}

	/**
	 * Set the number of FEC errors detected since the second most recent DSL Showtime (FEC-C as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRFECErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuRFECErrors(Long xtuRFECErrors) {
		this.xtuRFECErrors = xtuRFECErrors;
		return this;
	}

	/**
	 * Get the number of FEC errors detected by the ATU-C since the second most recent DSL Showtime (FEC-CFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuCFECErrors() {
		return xtuCFECErrors;
	}

	/**
	 * Set the number of FEC errors detected by the ATU-C since the second most recent DSL Showtime (FEC-CFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCFECErrors the input value
	 */
	public void  setXtuCFECErrors(Long xtuCFECErrors) {
		this.xtuCFECErrors = xtuCFECErrors;
	}

	/**
	 * Set the number of FEC errors detected by the ATU-C since the second most recent DSL Showtime (FEC-CFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCFECErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuCFECErrors(Long xtuCFECErrors) {
		this.xtuCFECErrors = xtuCFECErrors;
		return this;
	}

	/**
	 * Get the number of HEC errors detected since the second most recent DSL Showtime (HEC-P as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuRHECErrors() {
		return xtuRHECErrors;
	}

	/**
	 * Set the number of HEC errors detected since the second most recent DSL Showtime (HEC-P as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRHECErrors the input value
	 */
	public void  setXtuRHECErrors(Long xtuRHECErrors) {
		this.xtuRHECErrors = xtuRHECErrors;
	}

	/**
	 * Set the number of HEC errors detected since the second most recent DSL Showtime (HEC-P as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRHECErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuRHECErrors(Long xtuRHECErrors) {
		this.xtuRHECErrors = xtuRHECErrors;
		return this;
	}

	/**
	 * Get the number of HEC errors detected by the ATU-C since the second most recent DSL Showtime (HEC-PFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuCHECErrors() {
		return xtuCHECErrors;
	}

	/**
	 * Set the number of HEC errors detected by the ATU-C since the second most recent DSL Showtime (HEC-PFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCHECErrors the input value
	 */
	public void  setXtuCHECErrors(Long xtuCHECErrors) {
		this.xtuCHECErrors = xtuCHECErrors;
	}

	/**
	 * Set the number of HEC errors detected by the ATU-C since the second most recent DSL Showtime (HEC-PFE as defined in  ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCHECErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuCHECErrors(Long xtuCHECErrors) {
		this.xtuCHECErrors = xtuCHECErrors;
		return this;
	}

	/**
	 * Get the number of CRC errors detected since the second most recent DSL Showtime (CV-C as defined in ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuRCRCErrors() {
		return xtuRCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected since the second most recent DSL Showtime (CV-C as defined in ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRCRCErrors the input value
	 */
	public void  setXtuRCRCErrors(Long xtuRCRCErrors) {
		this.xtuRCRCErrors = xtuRCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected since the second most recent DSL Showtime (CV-C as defined in ITU-T Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuRCRCErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuRCRCErrors(Long xtuRCRCErrors) {
		this.xtuRCRCErrors = xtuRCRCErrors;
		return this;
	}

	/**
	 * Get the number of CRC errors detected by the ATU-C since the second most recent DSL Showtime (CV-CFE as defined in ITU-T  Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuCCRCErrors() {
		return xtuCCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected by the ATU-C since the second most recent DSL Showtime (CV-CFE as defined in ITU-T  Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCCRCErrors the input value
	 */
	public void  setXtuCCRCErrors(Long xtuCCRCErrors) {
		this.xtuCCRCErrors = xtuCCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected by the ATU-C since the second most recent DSL Showtime (CV-CFE as defined in ITU-T  Rec. {{bibref|G.997.1}}). 

          Note: If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param xtuCCRCErrors the input value
	 * @return this instance
	 */
	public CurrentDay withXtuCCRCErrors(Long xtuCCRCErrors) {
		this.xtuCCRCErrors = xtuCCRCErrors;
		return this;
	}

	//</editor-fold>

}