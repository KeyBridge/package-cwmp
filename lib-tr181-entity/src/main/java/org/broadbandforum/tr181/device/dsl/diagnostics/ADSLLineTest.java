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
package org.broadbandforum.tr181.device.dsl.diagnostics;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;

	/**
	 * This object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Diagnostics.ADSLLineTest.")
@XmlRootElement(name = "Device.DSL.Diagnostics.ADSLLineTest")
@XmlType(name = "Device.DSL.Diagnostics.ADSLLineTest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ADSLLineTest {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTPSDds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer actPSDds;
	/**
	 * Upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTPSDus")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer actPSDus;
	/**
	 * Downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTATPds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer actATPds;
	/**
	 * Upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTATPus")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer actATPus;
	/**
	 * Downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINSCds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer hliNSCds;
	/**
	 * Scaling used to represent the upstream linear channel characteristics.  Interpretation of the value is as  defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINSCus")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer hliNSCus;
	/**
	 * Number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINGds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hliNGds;
	/**
	 * Number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsus}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINGus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hliNGus;
	/**
	 * Number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLOGpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGGds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hloGGds;
	/**
	 * Number of sub-carriers per sub-carrier group in the upstream direction for {{param|HLOGpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGGus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hloGGus;
	/**
	 * {{list}} List items represent downstream logarithmic channel characteristics per sub-carrier group.  The maximum  number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGpsds")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 2559)
	@XmlList
	public Collection<String> hloGpsds;
	/**
	 * {{list}} List items represent upstream logarithmic channel characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.  

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 2559)
	@XmlList
	public Collection<String> hloGpsus;
	/**
	 * Indicates the number of symbols over which {{param|HLOGpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGMTds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hloGMTds;
	/**
	 * Indicates the number of symbols over which {{param|HLOGpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLOGMTus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hloGMTus;
	/**
	 * {{list}} List items represent downstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LATNpbds")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> latNpbds;
	/**
	 * {{list}} List items represent upstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LATNpbus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> latNpbus;
	/**
	 * {{list}} List items represent downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SATNds")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> satNds;
	/**
	 * {{list}} List items represent upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SATNus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> satNus;
	/**
	 * {{list}} List items represent downstream linear channel characteristics per subcarrier group.  Maximum number of  complex pairs is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGds}} but will not exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note: HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer hliNpsds;
	/**
	 * {{list}} List items represent upstream linear channel characteristics per sub-carrier group.  Maximum number of  complex pairs is 64 for G.992.3, and G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGus}} but  will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HLINpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = -4106)
	@XmlList
	public Collection<String> hliNpsus;
	/**
	 * Number of sub-carriers per sub-carrier group in the downstream direction for {{param|QLNpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNGds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long qlnGds;
	/**
	 * Number of sub-carriers per sub-carrier group in the upstream direction for {{param|QLNpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNGus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long qlnGus;
	/**
	 * {{list}} List items represent downstream quiet line noise per subcarrier group.  Maximum number of elements is  256 for G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not  exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer qlnpsds;
	/**
	 * {{list}} List items represent upstream quiet line noise per subcarrier group.  The maximum number of elements is  64 for G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed  512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = -4106)
	@XmlList
	public Collection<String> qlnpsus;
	/**
	 * Indicates the number of symbols over which {{param|QLNpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNMTds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long qlnMTds;
	/**
	 * Indicates the number of symbols over which {{param|QLNpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNMTus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long qlnMTus;
	/**
	 * Number of sub-carriers per sub-carrier group in the downstream direction for {{param|SNRpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRGds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snrGds;
	/**
	 * Number of sub-carriers per sub-carrier group in the upstream direction for {{param|SNRpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRGus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snrGus;
	/**
	 * {{list}} List items represent downstream SNR per subcarrier group.  Maximum number of elements is 256 for  G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.    Interpretation of the value is as defined in ITU-T Rec. G.997.1.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer snrpsds;
	/**
	 * {{list}} List items represent upstream SNR per subcarrier group.  The maximum number of elements is 64 for  G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = -4106)
	@XmlList
	public Collection<String> snrpsus;
	/**
	 * Indicates the number of symbols over which {{param|SNRpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRMTds")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snrMTds;
	/**
	 * Indicates the number of symbols over which {{param|SNRpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRMTus")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snrMTus;
	/**
	 * {{list}} List items represent downstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BITSpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer bitSpsds;
	/**
	 * {{list}} List items represent upstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BITSpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = -4106)
	@XmlList
	public Collection<String> bitSpsus;

	public ADSLLineTest() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public ADSLLineTest withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public ADSLLineTest with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getActPSDds() {
		return actPSDds;
	}

	/**
	 * Set the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actPSDds the input value
	 */
	public void  setActPSDds(Integer actPSDds) {
		this.actPSDds = actPSDds;
	}

	/**
	 * Set the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actPSDds the input value
	 * @return this instance
	 */
	public ADSLLineTest withActPSDds(Integer actPSDds) {
		this.actPSDds = actPSDds;
		return this;
	}

	/**
	 * Get the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getActPSDus() {
		return actPSDus;
	}

	/**
	 * Set the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actPSDus the input value
	 */
	public void  setActPSDus(Integer actPSDus) {
		this.actPSDus = actPSDus;
	}

	/**
	 * Set the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actPSDus the input value
	 * @return this instance
	 */
	public ADSLLineTest withActPSDus(Integer actPSDus) {
		this.actPSDus = actPSDus;
		return this;
	}

	/**
	 * Get the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getActATPds() {
		return actATPds;
	}

	/**
	 * Set the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actATPds the input value
	 */
	public void  setActATPds(Integer actATPds) {
		this.actATPds = actATPds;
	}

	/**
	 * Set the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actATPds the input value
	 * @return this instance
	 */
	public ADSLLineTest withActATPds(Integer actATPds) {
		this.actATPds = actATPds;
		return this;
	}

	/**
	 * Get the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getActATPus() {
		return actATPus;
	}

	/**
	 * Set the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actATPus the input value
	 */
	public void  setActATPus(Integer actATPus) {
		this.actATPus = actATPus;
	}

	/**
	 * Set the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actATPus the input value
	 * @return this instance
	 */
	public ADSLLineTest withActATPus(Integer actATPus) {
		this.actATPus = actATPus;
		return this;
	}

	/**
	 * Get the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHliNSCds() {
		return hliNSCds;
	}

	/**
	 * Set the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hliNSCds the input value
	 */
	public void  setHliNSCds(Integer hliNSCds) {
		this.hliNSCds = hliNSCds;
	}

	/**
	 * Set the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hliNSCds the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNSCds(Integer hliNSCds) {
		this.hliNSCds = hliNSCds;
		return this;
	}

	/**
	 * Get the scaling used to represent the upstream linear channel characteristics.  Interpretation of the value is as  defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHliNSCus() {
		return hliNSCus;
	}

	/**
	 * Set the scaling used to represent the upstream linear channel characteristics.  Interpretation of the value is as  defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hliNSCus the input value
	 */
	public void  setHliNSCus(Integer hliNSCus) {
		this.hliNSCus = hliNSCus;
	}

	/**
	 * Set the scaling used to represent the upstream linear channel characteristics.  Interpretation of the value is as  defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hliNSCus the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNSCus(Integer hliNSCus) {
		this.hliNSCus = hliNSCus;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHliNGds() {
		return hliNGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hliNGds the input value
	 */
	public void  setHliNGds(Long hliNGds) {
		this.hliNGds = hliNGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hliNGds the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNGds(Long hliNGds) {
		this.hliNGds = hliNGds;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsus}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHliNGus() {
		return hliNGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsus}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hliNGus the input value
	 */
	public void  setHliNGus(Long hliNGus) {
		this.hliNGus = hliNGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLINpsus}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hliNGus the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNGus(Long hliNGus) {
		this.hliNGus = hliNGus;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLOGpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHloGGds() {
		return hloGGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLOGpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hloGGds the input value
	 */
	public void  setHloGGds(Long hloGGds) {
		this.hloGGds = hloGGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|HLOGpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hloGGds the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGGds(Long hloGGds) {
		this.hloGGds = hloGGds;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the upstream direction for {{param|HLOGpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHloGGus() {
		return hloGGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|HLOGpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hloGGus the input value
	 */
	public void  setHloGGus(Long hloGGus) {
		this.hloGGus = hloGGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|HLOGpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param hloGGus the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGGus(Long hloGGus) {
		this.hloGGus = hloGGus;
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream logarithmic channel characteristics per sub-carrier group.  The maximum  number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHloGpsds() {
		if (this.hloGpsds == null){ this.hloGpsds=new ArrayList<>();}
		return hloGpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream logarithmic channel characteristics per sub-carrier group.  The maximum  number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param hloGpsds the input value
	 */
	public void  setHloGpsds(Collection<String> hloGpsds) {
		this.hloGpsds = hloGpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream logarithmic channel characteristics per sub-carrier group.  The maximum  number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGpsds(String string) {
		getHloGpsds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream logarithmic channel characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.  

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHloGpsus() {
		if (this.hloGpsus == null){ this.hloGpsus=new ArrayList<>();}
		return hloGpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream logarithmic channel characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.  

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param hloGpsus the input value
	 */
	public void  setHloGpsus(Collection<String> hloGpsus) {
		this.hloGpsus = hloGpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream logarithmic channel characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.  

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGpsus(String string) {
		getHloGpsus().add(string);
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|HLOGpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHloGMTds() {
		return hloGMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|HLOGpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hloGMTds the input value
	 */
	public void  setHloGMTds(Long hloGMTds) {
		this.hloGMTds = hloGMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|HLOGpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hloGMTds the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGMTds(Long hloGMTds) {
		this.hloGMTds = hloGMTds;
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|HLOGpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHloGMTus() {
		return hloGMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|HLOGpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hloGMTus the input value
	 */
	public void  setHloGMTus(Long hloGMTus) {
		this.hloGMTus = hloGMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|HLOGpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param hloGMTus the input value
	 * @return this instance
	 */
	public ADSLLineTest withHloGMTus(Long hloGMTus) {
		this.hloGMTus = hloGMTus;
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLatNpbds() {
		if (this.latNpbds == null){ this.latNpbds=new ArrayList<>();}
		return latNpbds;
	}

	/**
	 * Set the {{list}} List items represent downstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param latNpbds the input value
	 */
	public void  setLatNpbds(Collection<String> latNpbds) {
		this.latNpbds = latNpbds;
	}

	/**
	 * Set the {{list}} List items represent downstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withLatNpbds(String string) {
		getLatNpbds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLatNpbus() {
		if (this.latNpbus == null){ this.latNpbus=new ArrayList<>();}
		return latNpbus;
	}

	/**
	 * Set the {{list}} List items represent upstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param latNpbus the input value
	 */
	public void  setLatNpbus(Collection<String> latNpbus) {
		this.latNpbus = latNpbus;
	}

	/**
	 * Set the {{list}} List items represent upstream line attenuation per usable band, as computed during initialization.  Number of elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withLatNpbus(String string) {
		getLatNpbus().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSatNds() {
		if (this.satNds == null){ this.satNds=new ArrayList<>();}
		return satNds;
	}

	/**
	 * Set the {{list}} List items represent downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param satNds the input value
	 */
	public void  setSatNds(Collection<String> satNds) {
		this.satNds = satNds;
	}

	/**
	 * Set the {{list}} List items represent downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withSatNds(String string) {
		getSatNds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSatNus() {
		if (this.satNus == null){ this.satNus=new ArrayList<>();}
		return satNus;
	}

	/**
	 * Set the {{list}} List items represent upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param satNus the input value
	 */
	public void  setSatNus(Collection<String> satNus) {
		this.satNus = satNus;
	}

	/**
	 * Set the {{list}} List items represent upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withSatNus(String string) {
		getSatNus().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream linear channel characteristics per subcarrier group.  Maximum number of  complex pairs is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGds}} but will not exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note: HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHliNpsds() {
		return hliNpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream linear channel characteristics per subcarrier group.  Maximum number of  complex pairs is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGds}} but will not exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note: HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param hliNpsds the input value
	 */
	public void  setHliNpsds(Integer hliNpsds) {
		this.hliNpsds = hliNpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream linear channel characteristics per subcarrier group.  Maximum number of  complex pairs is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGds}} but will not exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note: HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param hliNpsds the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNpsds(Integer hliNpsds) {
		this.hliNpsds = hliNpsds;
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream linear channel characteristics per sub-carrier group.  Maximum number of  complex pairs is 64 for G.992.3, and G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGus}} but  will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHliNpsus() {
		if (this.hliNpsus == null){ this.hliNpsus=new ArrayList<>();}
		return hliNpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream linear channel characteristics per sub-carrier group.  Maximum number of  complex pairs is 64 for G.992.3, and G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGus}} but  will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param hliNpsus the input value
	 */
	public void  setHliNpsus(Collection<String> hliNpsus) {
		this.hliNpsus = hliNpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream linear channel characteristics per sub-carrier group.  Maximum number of  complex pairs is 64 for G.992.3, and G.992.5.  For G.993.2, the number of pairs will depend on the value of {{param|HLINGus}} but  will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  HLIN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withHliNpsus(String string) {
		getHliNpsus().add(string);
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the downstream direction for {{param|QLNpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQlnGds() {
		return qlnGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|QLNpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param qlnGds the input value
	 */
	public void  setQlnGds(Long qlnGds) {
		this.qlnGds = qlnGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|QLNpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param qlnGds the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnGds(Long qlnGds) {
		this.qlnGds = qlnGds;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the upstream direction for {{param|QLNpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQlnGus() {
		return qlnGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|QLNpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param qlnGus the input value
	 */
	public void  setQlnGus(Long qlnGus) {
		this.qlnGus = qlnGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|QLNpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param qlnGus the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnGus(Long qlnGus) {
		this.qlnGus = qlnGus;
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream quiet line noise per subcarrier group.  Maximum number of elements is  256 for G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not  exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQlnpsds() {
		return qlnpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream quiet line noise per subcarrier group.  Maximum number of elements is  256 for G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not  exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param qlnpsds the input value
	 */
	public void  setQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream quiet line noise per subcarrier group.  Maximum number of elements is  256 for G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not  exceed 512.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param qlnpsds the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream quiet line noise per subcarrier group.  The maximum number of elements is  64 for G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed  512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQlnpsus() {
		if (this.qlnpsus == null){ this.qlnpsus=new ArrayList<>();}
		return qlnpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream quiet line noise per subcarrier group.  The maximum number of elements is  64 for G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed  512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param qlnpsus the input value
	 */
	public void  setQlnpsus(Collection<String> qlnpsus) {
		this.qlnpsus = qlnpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream quiet line noise per subcarrier group.  The maximum number of elements is  64 for G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed  512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  QLN is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnpsus(String string) {
		getQlnpsus().add(string);
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|QLNpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQlnMTds() {
		return qlnMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|QLNpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param qlnMTds the input value
	 */
	public void  setQlnMTds(Long qlnMTds) {
		this.qlnMTds = qlnMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|QLNpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param qlnMTds the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnMTds(Long qlnMTds) {
		this.qlnMTds = qlnMTds;
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|QLNpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQlnMTus() {
		return qlnMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|QLNpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param qlnMTus the input value
	 */
	public void  setQlnMTus(Long qlnMTus) {
		this.qlnMTus = qlnMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|QLNpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param qlnMTus the input value
	 * @return this instance
	 */
	public ADSLLineTest withQlnMTus(Long qlnMTus) {
		this.qlnMTus = qlnMTus;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the downstream direction for {{param|SNRpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnrGds() {
		return snrGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|SNRpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param snrGds the input value
	 */
	public void  setSnrGds(Long snrGds) {
		this.snrGds = snrGds;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the downstream direction for {{param|SNRpsds}}.  Valid values  are 1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param snrGds the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrGds(Long snrGds) {
		this.snrGds = snrGds;
		return this;
	}

	/**
	 * Get the number of sub-carriers per sub-carrier group in the upstream direction for {{param|SNRpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnrGus() {
		return snrGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|SNRpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param snrGus the input value
	 */
	public void  setSnrGus(Long snrGus) {
		this.snrGus = snrGus;
	}

	/**
	 * Set the number of sub-carriers per sub-carrier group in the upstream direction for {{param|SNRpsus}}.  Valid values are  1, 2, 4, and 8.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 1.
	 *
	 * @since 2.0
	 * @param snrGus the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrGus(Long snrGus) {
		this.snrGus = snrGus;
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream SNR per subcarrier group.  Maximum number of elements is 256 for  G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.    Interpretation of the value is as defined in ITU-T Rec. G.997.1.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSnrpsds() {
		return snrpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream SNR per subcarrier group.  Maximum number of elements is 256 for  G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.    Interpretation of the value is as defined in ITU-T Rec. G.997.1.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param snrpsds the input value
	 */
	public void  setSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream SNR per subcarrier group.  Maximum number of elements is 256 for  G.992.3, 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.    Interpretation of the value is as defined in ITU-T Rec. G.997.1.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param snrpsds the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream SNR per subcarrier group.  The maximum number of elements is 64 for  G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSnrpsus() {
		if (this.snrpsus == null){ this.snrpsus=new ArrayList<>();}
		return snrpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream SNR per subcarrier group.  The maximum number of elements is 64 for  G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param snrpsus the input value
	 */
	public void  setSnrpsus(Collection<String> snrpsus) {
		this.snrpsus = snrpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream SNR per subcarrier group.  The maximum number of elements is 64 for  G.992.3, and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  SNRps is not applicable in PLOAM for G.992.1 or G.992.2. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrpsus(String string) {
		getSnrpsus().add(string);
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|SNRpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnrMTds() {
		return snrMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|SNRpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param snrMTds the input value
	 */
	public void  setSnrMTds(Long snrMTds) {
		this.snrMTds = snrMTds;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|SNRpsds}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param snrMTds the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrMTds(Long snrMTds) {
		this.snrMTds = snrMTds;
		return this;
	}

	/**
	 * Get the indicates the number of symbols over which {{param|SNRpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnrMTus() {
		return snrMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|SNRpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param snrMTus the input value
	 */
	public void  setSnrMTus(Long snrMTus) {
		this.snrMTus = snrMTus;
	}

	/**
	 * Set the indicates the number of symbols over which {{param|SNRpsus}} was measured.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param snrMTus the input value
	 * @return this instance
	 */
	public ADSLLineTest withSnrMTus(Long snrMTus) {
		this.snrMTus = snrMTus;
		return this;
	}

	/**
	 * Get the {{list}} List items represent downstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBitSpsds() {
		return bitSpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param bitSpsds the input value
	 */
	public void  setBitSpsds(Integer bitSpsds) {
		this.bitSpsds = bitSpsds;
	}

	/**
	 * Set the {{list}} List items represent downstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param bitSpsds the input value
	 * @return this instance
	 */
	public ADSLLineTest withBitSpsds(Integer bitSpsds) {
		this.bitSpsds = bitSpsds;
		return this;
	}

	/**
	 * Get the {{list}} List items represent upstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getBitSpsus() {
		if (this.bitSpsus == null){ this.bitSpsus=new ArrayList<>();}
		return bitSpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param bitSpsus the input value
	 */
	public void  setBitSpsus(Collection<String> bitSpsus) {
		this.bitSpsus = bitSpsus;
	}

	/**
	 * Set the {{list}} List items represent upstream bit allocation per subcarrier group.  Maximum number of elements is 256 for G.992.3, 512 for G.992.5.  Interpretation of the value is as defined in ITU-T Rec. {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ADSLLineTest withBitSpsus(String string) {
		getBitSpsus().add(string);
		return this;
	}

	//</editor-fold>

}