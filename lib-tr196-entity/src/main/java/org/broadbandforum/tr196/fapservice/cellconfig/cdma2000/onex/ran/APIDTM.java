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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APIDTM.")
@XmlRootElement(name = "APIDTM")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.APIDTM")
@XmlAccessorType(XmlAccessType.FIELD)
public class APIDTM {

	/**
	 * Access Point identification Text CHARi field Length ({{param|APIDTEXTCHARi}}). Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDTEXTCHARiLEN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 256)
	public Long apiDTEXTCHARiLEN;
	/**
	 * Access Point identification Text message encoding. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDTEXTMSGENCODING")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long apiDTEXTMSGENCODING;
	/**
	 * Access Point Identification Text. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDTEXTCHARi")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String apiDTEXTCHARi;

	public APIDTM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get access Point identification Text CHARi field Length ({{param|APIDTEXTCHARi}}). Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApiDTEXTCHARiLEN() {
		return apiDTEXTCHARiLEN;
	}

	/**
	 * Set access Point identification Text CHARi field Length ({{param|APIDTEXTCHARi}}). Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apiDTEXTCHARiLEN the input value
	 */
	public void  setApiDTEXTCHARiLEN(Long apiDTEXTCHARiLEN) {
		this.apiDTEXTCHARiLEN = apiDTEXTCHARiLEN;
	}

	/**
	 * Set access Point identification Text CHARi field Length ({{param|APIDTEXTCHARi}}). Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apiDTEXTCHARiLEN the input value
	 * @return this instance
	 */
	public APIDTM withApiDTEXTCHARiLEN(Long apiDTEXTCHARiLEN) {
		this.apiDTEXTCHARiLEN = apiDTEXTCHARiLEN;
		return this;
	}

	/**
	 * Get access Point identification Text message encoding. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApiDTEXTMSGENCODING() {
		return apiDTEXTMSGENCODING;
	}

	/**
	 * Set access Point identification Text message encoding. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions
	 *
	 * @since 2.0
	 * @param apiDTEXTMSGENCODING the input value
	 */
	public void  setApiDTEXTMSGENCODING(Long apiDTEXTMSGENCODING) {
		this.apiDTEXTMSGENCODING = apiDTEXTMSGENCODING;
	}

	/**
	 * Set access Point identification Text message encoding. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions
	 *
	 * @since 2.0
	 * @param apiDTEXTMSGENCODING the input value
	 * @return this instance
	 */
	public APIDTM withApiDTEXTMSGENCODING(Long apiDTEXTMSGENCODING) {
		this.apiDTEXTMSGENCODING = apiDTEXTMSGENCODING;
		return this;
	}

	/**
	 * Get access Point Identification Text. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApiDTEXTCHARi() {
		return apiDTEXTCHARi;
	}

	/**
	 * Set access Point Identification Text. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions.
	 *
	 * @since 2.0
	 * @param apiDTEXTCHARi the input value
	 */
	public void  setApiDTEXTCHARi(String apiDTEXTCHARi) {
		this.apiDTEXTCHARi = apiDTEXTCHARi;
	}

	/**
	 * Set access Point Identification Text. Refer {{bibref|3GPP2-C.S0005}} and {{bibref|3GPP2-C.R1001}} for definitions.
	 *
	 * @since 2.0
	 * @param apiDTEXTCHARi the input value
	 * @return this instance
	 */
	public APIDTM withApiDTEXTCHARi(String apiDTEXTCHARi) {
		this.apiDTEXTCHARi = apiDTEXTCHARi;
		return this;
	}

	//</editor-fold>

}