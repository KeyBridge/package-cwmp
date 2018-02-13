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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is applicable to TDD mode only. This object contains parameters relating to the TDD frame structure configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.TDDFrame.")
@XmlRootElement(name = "TDDFrame")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.TDDFrame")
@XmlAccessorType(XmlAccessType.FIELD)
public class TDDFrame {

	/**
	 * Defines the DL/UL sub-frame configuration. Corresponds to subframAssignment specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubFrameAssignment")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 6)
	public Long subFrameAssignment;
	/**
	 * Defines the configuration of the special sub-frame that contains the guard period between the downlink and uplink transmissions. Corresponds to the specialSubframePatterns specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SpecialSubframePatterns")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 8)
	public Long specialSubframePatterns;

	public TDDFrame() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the DL/UL sub-frame configuration. Corresponds to subframAssignment specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSubFrameAssignment() {
		return subFrameAssignment;
	}

	/**
	 * Set the defines the DL/UL sub-frame configuration. Corresponds to subframAssignment specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.2}}.
	 *
	 * @since 2.0
	 * @param subFrameAssignment the input value
	 */
	public void  setSubFrameAssignment(Long subFrameAssignment) {
		this.subFrameAssignment = subFrameAssignment;
	}

	/**
	 * Set the defines the DL/UL sub-frame configuration. Corresponds to subframAssignment specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.2}}.
	 *
	 * @since 2.0
	 * @param subFrameAssignment the input value
	 * @return this instance
	 */
	public TDDFrame withSubFrameAssignment(Long subFrameAssignment) {
		this.subFrameAssignment = subFrameAssignment;
		return this;
	}

	/**
	 * Get the defines the configuration of the special sub-frame that contains the guard period between the downlink and uplink transmissions. Corresponds to the specialSubframePatterns specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSpecialSubframePatterns() {
		return specialSubframePatterns;
	}

	/**
	 * Set the defines the configuration of the special sub-frame that contains the guard period between the downlink and uplink transmissions. Corresponds to the specialSubframePatterns specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.1}}.
	 *
	 * @since 2.0
	 * @param specialSubframePatterns the input value
	 */
	public void  setSpecialSubframePatterns(Long specialSubframePatterns) {
		this.specialSubframePatterns = specialSubframePatterns;
	}

	/**
	 * Set the defines the configuration of the special sub-frame that contains the guard period between the downlink and uplink transmissions. Corresponds to the specialSubframePatterns specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Table 4.2.1}}.
	 *
	 * @since 2.0
	 * @param specialSubframePatterns the input value
	 * @return this instance
	 */
	public TDDFrame withSpecialSubframePatterns(Long specialSubframePatterns) {
		this.specialSubframePatterns = specialSubframePatterns;
		return this;
	}

	//</editor-fold>

}