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
package org.broadbandforum.tr181.device.dsl.line;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains the DSL line test parameters that are available during the L0 (i.e., Showtime)  state.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Line.{i}.TestParams.")
public class TestParams {

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
	 * {{list}} Indicates the downstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

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
	 * {{list}} Indicates the upstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

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
	 * {{list}} Indicates the downstream quiet line noise per subcarrier group.  The maximum number of elements is 256 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer qlnpsds;
	/**
	 * {{list}} Indicates the upstream quiet line noise per subcarrier group.  The maximum number of elements is 64 for  G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QLNpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 2047)
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
	 * {{list}} Indicates the downstream SNR per subcarrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRpsds")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer snrpsds;
	/**
	 * {{list}} Indicates the upstream SNR per subcarrier group.  The maximum number of elements is 64 for G.992.3 and  G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRpsus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 2047)
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
	 * {{list}} Indicates the downstream line attenuation per usable band, as computed during initialization.  Number  of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LATNds")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> latNds;
	/**
	 * {{list}} Indicates the upstream line attenuation per usable band, as computed during initialization.  Number of  elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LATNus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> latNus;
	/**
	 * {{list}} Indicates the downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime)  state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of  {{param}} is as defined in ITU-T Rec. G.997.1.

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
	 * {{list}} Indicates the upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SATNus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 24)
	@XmlList
	public Collection<String> satNus;

	public TestParams() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public TestParams withHloGGds(Long hloGGds) {
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
	public TestParams withHloGGus(Long hloGGus) {
		this.hloGGus = hloGGus;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the downstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

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
	 * Set the {{list}} Indicates the downstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

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
	 * Set the {{list}} Indicates the downstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of  {{param|HLOGGds}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''. 

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withHloGpsds(String string) {
		getHloGpsds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the upstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

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
	 * Set the {{list}} Indicates the upstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

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
	 * Set the {{list}} Indicates the upstream logarithmic line characteristics per sub-carrier group.  The maximum number of elements is 64 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|HLOGGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withHloGpsus(String string) {
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
	public TestParams withHloGMTds(Long hloGMTds) {
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
	public TestParams withHloGMTus(Long hloGMTus) {
		this.hloGMTus = hloGMTus;
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
	public TestParams withQlnGds(Long qlnGds) {
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
	public TestParams withQlnGus(Long qlnGus) {
		this.qlnGus = qlnGus;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the downstream quiet line noise per subcarrier group.  The maximum number of elements is 256 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQlnpsds() {
		return qlnpsds;
	}

	/**
	 * Set the {{list}} Indicates the downstream quiet line noise per subcarrier group.  The maximum number of elements is 256 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param qlnpsds the input value
	 */
	public void  setQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
	}

	/**
	 * Set the {{list}} Indicates the downstream quiet line noise per subcarrier group.  The maximum number of elements is 256 for G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param qlnpsds the input value
	 * @return this instance
	 */
	public TestParams withQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the upstream quiet line noise per subcarrier group.  The maximum number of elements is 64 for  G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQlnpsus() {
		if (this.qlnpsus == null){ this.qlnpsus=new ArrayList<>();}
		return qlnpsus;
	}

	/**
	 * Set the {{list}} Indicates the upstream quiet line noise per subcarrier group.  The maximum number of elements is 64 for  G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param qlnpsus the input value
	 */
	public void  setQlnpsus(Collection<String> qlnpsus) {
		this.qlnpsus = qlnpsus;
	}

	/**
	 * Set the {{list}} Indicates the upstream quiet line noise per subcarrier group.  The maximum number of elements is 64 for  G.992.3 and G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|QLNGus}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.

          Note: {{param}} is measured during initialization and is not updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withQlnpsus(String string) {
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
	public TestParams withQlnMTds(Long qlnMTds) {
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
	public TestParams withQlnMTus(Long qlnMTus) {
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
	public TestParams withSnrGds(Long snrGds) {
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
	public TestParams withSnrGus(Long snrGus) {
		this.snrGus = snrGus;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the downstream SNR per subcarrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSnrpsds() {
		return snrpsds;
	}

	/**
	 * Set the {{list}} Indicates the downstream SNR per subcarrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @param snrpsds the input value
	 */
	public void  setSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
	}

	/**
	 * Set the {{list}} Indicates the downstream SNR per subcarrier group.  The maximum number of elements is 256 for G.992.3, and 512 for G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGds}} but will not exceed 512.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @param snrpsds the input value
	 * @return this instance
	 */
	public TestParams withSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the upstream SNR per subcarrier group.  The maximum number of elements is 64 for G.992.3 and  G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSnrpsus() {
		if (this.snrpsus == null){ this.snrpsus=new ArrayList<>();}
		return snrpsus;
	}

	/**
	 * Set the {{list}} Indicates the upstream SNR per subcarrier group.  The maximum number of elements is 64 for G.992.3 and  G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @param snrpsus the input value
	 */
	public void  setSnrpsus(Collection<String> snrpsus) {
		this.snrpsus = snrpsus;
	}

	/**
	 * Set the {{list}} Indicates the upstream SNR per subcarrier group.  The maximum number of elements is 64 for G.992.3 and  G.992.5.  For G.993.2, the number of elements will depend on the value of {{param|SNRGus}} but will not exceed 512. Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to ''None''.   

          Note: {{param}} is first measured during initialization and is updated during Showtime.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withSnrpsus(String string) {
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
	public TestParams withSnrMTds(Long snrMTds) {
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
	public TestParams withSnrMTus(Long snrMTus) {
		this.snrMTus = snrMTus;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the downstream line attenuation per usable band, as computed during initialization.  Number  of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLatNds() {
		if (this.latNds == null){ this.latNds=new ArrayList<>();}
		return latNds;
	}

	/**
	 * Set the {{list}} Indicates the downstream line attenuation per usable band, as computed during initialization.  Number  of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param latNds the input value
	 */
	public void  setLatNds(Collection<String> latNds) {
		this.latNds = latNds;
	}

	/**
	 * Set the {{list}} Indicates the downstream line attenuation per usable band, as computed during initialization.  Number  of elements is dependent on the number of downstream bands but will exceed one only for G.993.2. Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withLatNds(String string) {
		getLatNds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the upstream line attenuation per usable band, as computed during initialization.  Number of  elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLatNus() {
		if (this.latNus == null){ this.latNus=new ArrayList<>();}
		return latNus;
	}

	/**
	 * Set the {{list}} Indicates the upstream line attenuation per usable band, as computed during initialization.  Number of  elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param latNus the input value
	 */
	public void  setLatNus(Collection<String> latNus) {
		this.latNus = latNus;
	}

	/**
	 * Set the {{list}} Indicates the upstream line attenuation per usable band, as computed during initialization.  Number of  elements is dependent on the number of upstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withLatNus(String string) {
		getLatNus().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime)  state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of  {{param}} is as defined in ITU-T Rec. G.997.1.

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
	 * Set the {{list}} Indicates the downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime)  state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of  {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param satNds the input value
	 */
	public void  setSatNds(Collection<String> satNds) {
		this.satNds = satNds;
	}

	/**
	 * Set the {{list}} Indicates the downstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime)  state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of  {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withSatNds(String string) {
		getSatNds().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

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
	 * Set the {{list}} Indicates the upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param satNus the input value
	 */
	public void  setSatNus(Collection<String> satNus) {
		this.satNus = satNus;
	}

	/**
	 * Set the {{list}} Indicates the upstream signal attenuation per usable band, as computed during the L0 (i.e., Showtime) state.  Number of elements is dependent on the number of downstream bands but will exceed one only for G.993.2.  Interpretation of {{param}} is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public TestParams withSatNus(String string) {
		getSatNus().add(string);
		return this;
	}

	//</editor-fold>

}