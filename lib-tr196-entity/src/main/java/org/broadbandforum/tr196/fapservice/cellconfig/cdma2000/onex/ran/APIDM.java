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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APIDM.")
public class APIDM {

	/**
	 * The FAP shall set this field to the value shown in {{bibref|3GPP2-C.S0005}} corresponding to the configuration of the base station.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AssociationType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long associationType;
	/**
	 * The FAP shall set this field to the length of the access point identification in units of 16 bits. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDLEN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long apiDLEN;
	/**
	 * Access Point Identification. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APID")
	@CWMPParameter(access = "readWrite")
	public byte[] apiD;
	/**
	 * Access Point identification Mask. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDMASK")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long apiDMASK;
	/**
	 * MSC_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IOSMSCID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 16777215)
	public Long iosMSCID;
	/**
	 * CELL_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IOSCELLID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long iosCELLID;
	/**
	 * This field indicates whether the INTRAFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTRAFREQHOHYSINCL")
	@CWMPParameter(access = "readWrite")
	public Boolean intRAFREQHOHYSINCL;
	/**
	 * Intra Frequency Handoff Hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTRAFREQHOHYS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 127)
	public Long intRAFREQHOHYS;
	/**
	 * This field indicates whether the INTRAFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTRAFREQHOSLOPEINCL")
	@CWMPParameter(access = "readWrite")
	public Boolean intRAFREQHOSLOPEINCL;
	/**
	 * Intra Frequency Handoff Slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTRAFREQHOSLOPE")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long intRAFREQHOSLOPE;
	/**
	 * This field indicates whether the INTERFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQHOHYSINCL")
	@CWMPParameter(access = "readWrite")
	public Boolean intERFREQHOHYSINCL;
	/**
	 * Inter frequency handoff hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQHOHYS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 127)
	public Long intERFREQHOHYS;
	/**
	 * This field indicates whether the INTERFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQHOSLOPEINCL")
	@CWMPParameter(access = "readWrite")
	public Boolean intERFREQHOSLOPEINCL;
	/**
	 * Inter frequency handoff slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQHOSLOPE")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long intERFREQHOSLOPE;
	/**
	 * This field indicates whether the INTERFREQSRCHTH field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQSRCHTHINCL")
	@CWMPParameter(access = "readWrite")
	public Boolean intERFREQSRCHTHINCL;
	/**
	 * Inter-frequency search threshold. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTERFREQSRCHTH")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long intERFREQSRCHTH;

	public APIDM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the FAP shall set this field to the value shown in {{bibref|3GPP2-C.S0005}} corresponding to the configuration of the base station.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAssociationType() {
		return associationType;
	}

	/**
	 * Set the FAP shall set this field to the value shown in {{bibref|3GPP2-C.S0005}} corresponding to the configuration of the base station.
	 *
	 * @since 2.0
	 * @param associationType the input value
	 */
	public void  setAssociationType(Long associationType) {
		this.associationType = associationType;
	}

	/**
	 * Set the FAP shall set this field to the value shown in {{bibref|3GPP2-C.S0005}} corresponding to the configuration of the base station.
	 *
	 * @since 2.0
	 * @param associationType the input value
	 * @return this instance
	 */
	public APIDM withAssociationType(Long associationType) {
		this.associationType = associationType;
		return this;
	}

	/**
	 * Get the FAP shall set this field to the length of the access point identification in units of 16 bits. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApiDLEN() {
		return apiDLEN;
	}

	/**
	 * Set the FAP shall set this field to the length of the access point identification in units of 16 bits. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDLEN the input value
	 */
	public void  setApiDLEN(Long apiDLEN) {
		this.apiDLEN = apiDLEN;
	}

	/**
	 * Set the FAP shall set this field to the length of the access point identification in units of 16 bits. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDLEN the input value
	 * @return this instance
	 */
	public APIDM withApiDLEN(Long apiDLEN) {
		this.apiDLEN = apiDLEN;
		return this;
	}

	/**
	 * Get access Point Identification. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getApiD() {
		return apiD;
	}

	/**
	 * Set access Point Identification. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param apiD the input value
	 */
	public void  setApiD(byte[] apiD) {
		this.apiD = apiD;
	}

	/**
	 * Set access Point Identification. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param apiD the input value
	 * @return this instance
	 */
	public APIDM withApiD(byte[] apiD) {
		this.apiD = apiD;
		return this;
	}

	/**
	 * Get access Point identification Mask. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApiDMASK() {
		return apiDMASK;
	}

	/**
	 * Set access Point identification Mask. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param apiDMASK the input value
	 */
	public void  setApiDMASK(Long apiDMASK) {
		this.apiDMASK = apiDMASK;
	}

	/**
	 * Set access Point identification Mask. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param apiDMASK the input value
	 * @return this instance
	 */
	public APIDM withApiDMASK(Long apiDMASK) {
		this.apiDMASK = apiDMASK;
		return this;
	}

	/**
	 * Get the msc_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIosMSCID() {
		return iosMSCID;
	}

	/**
	 * Set the msc_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param iosMSCID the input value
	 */
	public void  setIosMSCID(Long iosMSCID) {
		this.iosMSCID = iosMSCID;
	}

	/**
	 * Set the msc_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param iosMSCID the input value
	 * @return this instance
	 */
	public APIDM withIosMSCID(Long iosMSCID) {
		this.iosMSCID = iosMSCID;
		return this;
	}

	/**
	 * Get the celL_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIosCELLID() {
		return iosCELLID;
	}

	/**
	 * Set the celL_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param iosCELLID the input value
	 */
	public void  setIosCELLID(Long iosCELLID) {
		this.iosCELLID = iosCELLID;
	}

	/**
	 * Set the celL_ID of the base station. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param iosCELLID the input value
	 * @return this instance
	 */
	public APIDM withIosCELLID(Long iosCELLID) {
		this.iosCELLID = iosCELLID;
		return this;
	}

	/**
	 * Get the this field indicates whether the INTRAFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntRAFREQHOHYSINCL() {
		return intRAFREQHOHYSINCL;
	}

	/**
	 * Set the this field indicates whether the INTRAFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOHYSINCL the input value
	 */
	public void  setIntRAFREQHOHYSINCL(Boolean intRAFREQHOHYSINCL) {
		this.intRAFREQHOHYSINCL = intRAFREQHOHYSINCL;
	}

	/**
	 * Set the this field indicates whether the INTRAFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOHYSINCL the input value
	 * @return this instance
	 */
	public APIDM withIntRAFREQHOHYSINCL(Boolean intRAFREQHOHYSINCL) {
		this.intRAFREQHOHYSINCL = intRAFREQHOHYSINCL;
		return this;
	}

	/**
	 * Get the intra Frequency Handoff Hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntRAFREQHOHYS() {
		return intRAFREQHOHYS;
	}

	/**
	 * Set the intra Frequency Handoff Hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOHYS the input value
	 */
	public void  setIntRAFREQHOHYS(Long intRAFREQHOHYS) {
		this.intRAFREQHOHYS = intRAFREQHOHYS;
	}

	/**
	 * Set the intra Frequency Handoff Hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOHYS the input value
	 * @return this instance
	 */
	public APIDM withIntRAFREQHOHYS(Long intRAFREQHOHYS) {
		this.intRAFREQHOHYS = intRAFREQHOHYS;
		return this;
	}

	/**
	 * Get the this field indicates whether the INTRAFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntRAFREQHOSLOPEINCL() {
		return intRAFREQHOSLOPEINCL;
	}

	/**
	 * Set the this field indicates whether the INTRAFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOSLOPEINCL the input value
	 */
	public void  setIntRAFREQHOSLOPEINCL(Boolean intRAFREQHOSLOPEINCL) {
		this.intRAFREQHOSLOPEINCL = intRAFREQHOSLOPEINCL;
	}

	/**
	 * Set the this field indicates whether the INTRAFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOSLOPEINCL the input value
	 * @return this instance
	 */
	public APIDM withIntRAFREQHOSLOPEINCL(Boolean intRAFREQHOSLOPEINCL) {
		this.intRAFREQHOSLOPEINCL = intRAFREQHOSLOPEINCL;
		return this;
	}

	/**
	 * Get the intra Frequency Handoff Slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntRAFREQHOSLOPE() {
		return intRAFREQHOSLOPE;
	}

	/**
	 * Set the intra Frequency Handoff Slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOSLOPE the input value
	 */
	public void  setIntRAFREQHOSLOPE(Long intRAFREQHOSLOPE) {
		this.intRAFREQHOSLOPE = intRAFREQHOSLOPE;
	}

	/**
	 * Set the intra Frequency Handoff Slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intRAFREQHOSLOPE the input value
	 * @return this instance
	 */
	public APIDM withIntRAFREQHOSLOPE(Long intRAFREQHOSLOPE) {
		this.intRAFREQHOSLOPE = intRAFREQHOSLOPE;
		return this;
	}

	/**
	 * Get the this field indicates whether the INTERFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntERFREQHOHYSINCL() {
		return intERFREQHOHYSINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOHYSINCL the input value
	 */
	public void  setIntERFREQHOHYSINCL(Boolean intERFREQHOHYSINCL) {
		this.intERFREQHOHYSINCL = intERFREQHOHYSINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQHOHYS field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOHYSINCL the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQHOHYSINCL(Boolean intERFREQHOHYSINCL) {
		this.intERFREQHOHYSINCL = intERFREQHOHYSINCL;
		return this;
	}

	/**
	 * Get the inter frequency handoff hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntERFREQHOHYS() {
		return intERFREQHOHYS;
	}

	/**
	 * Set the inter frequency handoff hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOHYS the input value
	 */
	public void  setIntERFREQHOHYS(Long intERFREQHOHYS) {
		this.intERFREQHOHYS = intERFREQHOHYS;
	}

	/**
	 * Set the inter frequency handoff hysteresis. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOHYS the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQHOHYS(Long intERFREQHOHYS) {
		this.intERFREQHOHYS = intERFREQHOHYS;
		return this;
	}

	/**
	 * Get the this field indicates whether the INTERFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntERFREQHOSLOPEINCL() {
		return intERFREQHOSLOPEINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOSLOPEINCL the input value
	 */
	public void  setIntERFREQHOSLOPEINCL(Boolean intERFREQHOSLOPEINCL) {
		this.intERFREQHOSLOPEINCL = intERFREQHOSLOPEINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQHOSLOPE field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOSLOPEINCL the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQHOSLOPEINCL(Boolean intERFREQHOSLOPEINCL) {
		this.intERFREQHOSLOPEINCL = intERFREQHOSLOPEINCL;
		return this;
	}

	/**
	 * Get the inter frequency handoff slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntERFREQHOSLOPE() {
		return intERFREQHOSLOPE;
	}

	/**
	 * Set the inter frequency handoff slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOSLOPE the input value
	 */
	public void  setIntERFREQHOSLOPE(Long intERFREQHOSLOPE) {
		this.intERFREQHOSLOPE = intERFREQHOSLOPE;
	}

	/**
	 * Set the inter frequency handoff slope. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQHOSLOPE the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQHOSLOPE(Long intERFREQHOSLOPE) {
		this.intERFREQHOSLOPE = intERFREQHOSLOPE;
		return this;
	}

	/**
	 * Get the this field indicates whether the INTERFREQSRCHTH field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntERFREQSRCHTHINCL() {
		return intERFREQSRCHTHINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQSRCHTH field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQSRCHTHINCL the input value
	 */
	public void  setIntERFREQSRCHTHINCL(Boolean intERFREQSRCHTHINCL) {
		this.intERFREQSRCHTHINCL = intERFREQSRCHTHINCL;
	}

	/**
	 * Set the this field indicates whether the INTERFREQSRCHTH field is valid and included in Access Point Identification message. Refer {{bibref|3GPP2-C.S0005}} for definition.
	 *
	 * @since 2.0
	 * @param intERFREQSRCHTHINCL the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQSRCHTHINCL(Boolean intERFREQSRCHTHINCL) {
		this.intERFREQSRCHTHINCL = intERFREQSRCHTHINCL;
		return this;
	}

	/**
	 * Get the inter-frequency search threshold. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntERFREQSRCHTH() {
		return intERFREQSRCHTH;
	}

	/**
	 * Set the inter-frequency search threshold. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param intERFREQSRCHTH the input value
	 */
	public void  setIntERFREQSRCHTH(Long intERFREQSRCHTH) {
		this.intERFREQSRCHTH = intERFREQSRCHTH;
	}

	/**
	 * Set the inter-frequency search threshold. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param intERFREQSRCHTH the input value
	 * @return this instance
	 */
	public APIDM withIntERFREQSRCHTH(Long intERFREQSRCHTH) {
		this.intERFREQSRCHTH = intERFREQSRCHTH;
		return this;
	}

	//</editor-fold>

}