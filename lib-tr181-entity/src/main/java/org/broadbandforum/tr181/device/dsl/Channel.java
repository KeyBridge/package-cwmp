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
package org.broadbandforum.tr181.device.dsl;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dsl.channel.Stats;

	/**
	 * DSL Channel table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models DSL channel(s) on top of physical DSL lines.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Channel.{i}.")
@XmlRootElement(name = "Device.DSL.Channel")
@XmlType(name = "Device.DSL.Channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Channel {

	/**
	 * Enables or disables the channel.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the channel (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the channel as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the channel entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * {{list}} List items indicate which link encapsulation standards and recommendations are supported by the {{object}} instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LinkEncapsulationSupported")
	@XmlList
	public Collection<String> linkEncapsulationSupported;
	/**
	 * Indicates the link encapsulation standard that the {{object}} instance is using for the connection.  {{enum}}

          When ATM encapsulation is identified then an upper-layer {{object|.ATM.Link}} interface MUST be used.

          When PTM encapsulation is identified then an upper-layer {{object|.PTM.Link}} interface MUST be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LinkEncapsulationUsed")
	public String linkEncapsulationUsed;
	/**
	 * Reports the index of the latency path supporting the bearer channel.

          Note:  See ITU-T Recommendation {{bibref|G.997.1|Section 7.5.2.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LPATH")
	@Size(max = 3)
	public Long lpaTH;
	/**
	 * Reports the interleaver depth D for the latency path indicated in {{param|LPATH}}. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTLVDEPTH")
	public Long intLVDEPTH;
	/**
	 * Reports the interleaver block length in use on the latency path indicated in {{param|LPATH}}.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INTLVBLOCK")
	public Integer intLVBLOCK;
	/**
	 * Reports the actual delay, in milliseconds, of the latency path due to interleaving. 

          Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActualInterleavingDelay")
	public Long actualInterleavingDelay;
	/**
	 * Reports the actual impulse noise protection (INP) provided by the latency path indicated in {{param|LPATH}}.  The value is  the actual INP in the L0 (i.e., Showtime) state.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTINP")
	public Integer actINP;
	/**
	 * Reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.   Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding  capabilities of receiver).

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the  value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INPREPORT")
	public Boolean inpREPORT;
	/**
	 * Reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NFEC")
	public Integer nfeC;
	/**
	 * Reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFEC")
	public Integer rfeC;
	/**
	 * Reports the number of bits per symbol assigned to the latency path indicated in {{param|LPATH}}.  This value does not  include overhead due to trellis coding.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LSYMB")
	public Integer lsyMB;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Kbps")
	public Long upstreamCurrRate;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Kbps")
	public Long downstreamCurrRate;
	/**
	 * Actual net data rate expressed in Kbps. Independent whether retransmission is used or not in a given transmit direction:

          * In L0 state, this parameter reports the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) at which the bearer channel is operating.

          * In L2 state, the parameter contains the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) in the previous L0 state.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTNDR")
	public Long actNDR;
	/**
	 * Actual impulse noise protection against REIN, expressed in 0.1 DMT symbols.

          If retransmission is used in a given transmit direction, this parameter reports the actual impulse noise protection (INP) against REIN (under specific conditions detailed in [ITU T G.998.4]) on the bearer channel in the L0 state. In the L2 state, the parameter contains the INP in the previous L0 state.

          The value is coded in fractions of DMT symbols with a granularity of 0.1 symbols.

          The range is from 0 to 25.4. A special value of 25.5 indicates an ACTINP_REIN of 25.5 or higher.

          Note: This parameter is defined as ACTINP_REIN in Clause 7.5.2.9 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTINPREIN")
	@Size(min = 0, max = 255)
	public Long actINPREIN;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Channel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the channel.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the channel.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the channel.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Channel withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the channel (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the channel (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the channel (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Channel withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public Channel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the channel as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the channel as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the channel as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Channel withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the channel entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the channel entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the channel entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Channel withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Channel withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which link encapsulation standards and recommendations are supported by the {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLinkEncapsulationSupported() {
		if (this.linkEncapsulationSupported == null){ this.linkEncapsulationSupported=new ArrayList<>();}
		return linkEncapsulationSupported;
	}

	/**
	 * Set the {{list}} List items indicate which link encapsulation standards and recommendations are supported by the {{object}} instance.
	 *
	 * @since 2.0
	 * @param linkEncapsulationSupported the input value
	 */
	public void  setLinkEncapsulationSupported(Collection<String> linkEncapsulationSupported) {
		this.linkEncapsulationSupported = linkEncapsulationSupported;
	}

	/**
	 * Set the {{list}} List items indicate which link encapsulation standards and recommendations are supported by the {{object}} instance.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Channel withLinkEncapsulationSupported(String string) {
		getLinkEncapsulationSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates the link encapsulation standard that the {{object}} instance is using for the connection.  {{enum}}

          When ATM encapsulation is identified then an upper-layer {{object|.ATM.Link}} interface MUST be used.

          When PTM encapsulation is identified then an upper-layer {{object|.PTM.Link}} interface MUST be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLinkEncapsulationUsed() {
		return linkEncapsulationUsed;
	}

	/**
	 * Set the indicates the link encapsulation standard that the {{object}} instance is using for the connection.  {{enum}}

          When ATM encapsulation is identified then an upper-layer {{object|.ATM.Link}} interface MUST be used.

          When PTM encapsulation is identified then an upper-layer {{object|.PTM.Link}} interface MUST be used.
	 *
	 * @since 2.0
	 * @param linkEncapsulationUsed the input value
	 */
	public void  setLinkEncapsulationUsed(String linkEncapsulationUsed) {
		this.linkEncapsulationUsed = linkEncapsulationUsed;
	}

	/**
	 * Set the indicates the link encapsulation standard that the {{object}} instance is using for the connection.  {{enum}}

          When ATM encapsulation is identified then an upper-layer {{object|.ATM.Link}} interface MUST be used.

          When PTM encapsulation is identified then an upper-layer {{object|.PTM.Link}} interface MUST be used.
	 *
	 * @since 2.0
	 * @param linkEncapsulationUsed the input value
	 * @return this instance
	 */
	public Channel withLinkEncapsulationUsed(String linkEncapsulationUsed) {
		this.linkEncapsulationUsed = linkEncapsulationUsed;
		return this;
	}

	/**
	 * Get the reports the index of the latency path supporting the bearer channel.

          Note:  See ITU-T Recommendation {{bibref|G.997.1|Section 7.5.2.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLpaTH() {
		return lpaTH;
	}

	/**
	 * Set the reports the index of the latency path supporting the bearer channel.

          Note:  See ITU-T Recommendation {{bibref|G.997.1|Section 7.5.2.7}}.
	 *
	 * @since 2.0
	 * @param lpaTH the input value
	 */
	public void  setLpaTH(Long lpaTH) {
		this.lpaTH = lpaTH;
	}

	/**
	 * Set the reports the index of the latency path supporting the bearer channel.

          Note:  See ITU-T Recommendation {{bibref|G.997.1|Section 7.5.2.7}}.
	 *
	 * @since 2.0
	 * @param lpaTH the input value
	 * @return this instance
	 */
	public Channel withLpaTH(Long lpaTH) {
		this.lpaTH = lpaTH;
		return this;
	}

	/**
	 * Get the reports the interleaver depth D for the latency path indicated in {{param|LPATH}}. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntLVDEPTH() {
		return intLVDEPTH;
	}

	/**
	 * Set the reports the interleaver depth D for the latency path indicated in {{param|LPATH}}. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param intLVDEPTH the input value
	 */
	public void  setIntLVDEPTH(Long intLVDEPTH) {
		this.intLVDEPTH = intLVDEPTH;
	}

	/**
	 * Set the reports the interleaver depth D for the latency path indicated in {{param|LPATH}}. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param intLVDEPTH the input value
	 * @return this instance
	 */
	public Channel withIntLVDEPTH(Long intLVDEPTH) {
		this.intLVDEPTH = intLVDEPTH;
		return this;
	}

	/**
	 * Get the reports the interleaver block length in use on the latency path indicated in {{param|LPATH}}.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getIntLVBLOCK() {
		return intLVBLOCK;
	}

	/**
	 * Set the reports the interleaver block length in use on the latency path indicated in {{param|LPATH}}.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param intLVBLOCK the input value
	 */
	public void  setIntLVBLOCK(Integer intLVBLOCK) {
		this.intLVBLOCK = intLVBLOCK;
	}

	/**
	 * Set the reports the interleaver block length in use on the latency path indicated in {{param|LPATH}}.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param intLVBLOCK the input value
	 * @return this instance
	 */
	public Channel withIntLVBLOCK(Integer intLVBLOCK) {
		this.intLVBLOCK = intLVBLOCK;
		return this;
	}

	/**
	 * Get the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

          Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getActualInterleavingDelay() {
		return actualInterleavingDelay;
	}

	/**
	 * Set the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

          Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actualInterleavingDelay the input value
	 */
	public void  setActualInterleavingDelay(Long actualInterleavingDelay) {
		this.actualInterleavingDelay = actualInterleavingDelay;
	}

	/**
	 * Set the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

          Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param actualInterleavingDelay the input value
	 * @return this instance
	 */
	public Channel withActualInterleavingDelay(Long actualInterleavingDelay) {
		this.actualInterleavingDelay = actualInterleavingDelay;
		return this;
	}

	/**
	 * Get the reports the actual impulse noise protection (INP) provided by the latency path indicated in {{param|LPATH}}.  The value is  the actual INP in the L0 (i.e., Showtime) state.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getActINP() {
		return actINP;
	}

	/**
	 * Set the reports the actual impulse noise protection (INP) provided by the latency path indicated in {{param|LPATH}}.  The value is  the actual INP in the L0 (i.e., Showtime) state.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param actINP the input value
	 */
	public void  setActINP(Integer actINP) {
		this.actINP = actINP;
	}

	/**
	 * Set the reports the actual impulse noise protection (INP) provided by the latency path indicated in {{param|LPATH}}.  The value is  the actual INP in the L0 (i.e., Showtime) state.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param actINP the input value
	 * @return this instance
	 */
	public Channel withActINP(Integer actINP) {
		this.actINP = actINP;
		return this;
	}

	/**
	 * Get the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.   Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding  capabilities of receiver).

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the  value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isInpREPORT() {
		return inpREPORT;
	}

	/**
	 * Set the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.   Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding  capabilities of receiver).

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the  value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 2.0
	 * @param inpREPORT the input value
	 */
	public void  setInpREPORT(Boolean inpREPORT) {
		this.inpREPORT = inpREPORT;
	}

	/**
	 * Set the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.   Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding  capabilities of receiver).

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.  For a multimode device operating in a mode in which this parameter does not apply, the  value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 2.0
	 * @param inpREPORT the input value
	 * @return this instance
	 */
	public Channel withInpREPORT(Boolean inpREPORT) {
		this.inpREPORT = inpREPORT;
		return this;
	}

	/**
	 * Get the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getNfeC() {
		return nfeC;
	}

	/**
	 * Set the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param nfeC the input value
	 */
	public void  setNfeC(Integer nfeC) {
		this.nfeC = nfeC;
	}

	/**
	 * Set the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param nfeC the input value
	 * @return this instance
	 */
	public Channel withNfeC(Integer nfeC) {
		this.nfeC = nfeC;
		return this;
	}

	/**
	 * Get the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRfeC() {
		return rfeC;
	}

	/**
	 * Set the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param rfeC the input value
	 */
	public void  setRfeC(Integer rfeC) {
		this.rfeC = rfeC;
	}

	/**
	 * Set the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in {{param|LPATH}}.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param rfeC the input value
	 * @return this instance
	 */
	public Channel withRfeC(Integer rfeC) {
		this.rfeC = rfeC;
		return this;
	}

	/**
	 * Get the reports the number of bits per symbol assigned to the latency path indicated in {{param|LPATH}}.  This value does not  include overhead due to trellis coding.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLsyMB() {
		return lsyMB;
	}

	/**
	 * Set the reports the number of bits per symbol assigned to the latency path indicated in {{param|LPATH}}.  This value does not  include overhead due to trellis coding.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param lsyMB the input value
	 */
	public void  setLsyMB(Integer lsyMB) {
		this.lsyMB = lsyMB;
	}

	/**
	 * Set the reports the number of bits per symbol assigned to the latency path indicated in {{param|LPATH}}.  This value does not  include overhead due to trellis coding.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param lsyMB the input value
	 * @return this instance
	 */
	public Channel withLsyMB(Integer lsyMB) {
		this.lsyMB = lsyMB;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamCurrRate() {
		return upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param upstreamCurrRate the input value
	 */
	public void  setUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param upstreamCurrRate the input value
	 * @return this instance
	 */
	public Channel withUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamCurrRate() {
		return downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param downstreamCurrRate the input value
	 */
	public void  setDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

          Note: If the parameter is implemented but no value is  available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param downstreamCurrRate the input value
	 * @return this instance
	 */
	public Channel withDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
		return this;
	}

	/**
	 * Get actual net data rate expressed in Kbps. Independent whether retransmission is used or not in a given transmit direction:

          * In L0 state, this parameter reports the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) at which the bearer channel is operating.

          * In L2 state, the parameter contains the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) in the previous L0 state.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActNDR() {
		return actNDR;
	}

	/**
	 * Set actual net data rate expressed in Kbps. Independent whether retransmission is used or not in a given transmit direction:

          * In L0 state, this parameter reports the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) at which the bearer channel is operating.

          * In L2 state, the parameter contains the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) in the previous L0 state.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actNDR the input value
	 */
	public void  setActNDR(Long actNDR) {
		this.actNDR = actNDR;
	}

	/**
	 * Set actual net data rate expressed in Kbps. Independent whether retransmission is used or not in a given transmit direction:

          * In L0 state, this parameter reports the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) at which the bearer channel is operating.

          * In L2 state, the parameter contains the net data rate (as specified in [ITU T G.992.3], [ITU T G.992.5] or [ITU T G.993.2]) in the previous L0 state.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actNDR the input value
	 * @return this instance
	 */
	public Channel withActNDR(Long actNDR) {
		this.actNDR = actNDR;
		return this;
	}

	/**
	 * Get actual impulse noise protection against REIN, expressed in 0.1 DMT symbols.

          If retransmission is used in a given transmit direction, this parameter reports the actual impulse noise protection (INP) against REIN (under specific conditions detailed in [ITU T G.998.4]) on the bearer channel in the L0 state. In the L2 state, the parameter contains the INP in the previous L0 state.

          The value is coded in fractions of DMT symbols with a granularity of 0.1 symbols.

          The range is from 0 to 25.4. A special value of 25.5 indicates an ACTINP_REIN of 25.5 or higher.

          Note: This parameter is defined as ACTINP_REIN in Clause 7.5.2.9 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActINPREIN() {
		return actINPREIN;
	}

	/**
	 * Set actual impulse noise protection against REIN, expressed in 0.1 DMT symbols.

          If retransmission is used in a given transmit direction, this parameter reports the actual impulse noise protection (INP) against REIN (under specific conditions detailed in [ITU T G.998.4]) on the bearer channel in the L0 state. In the L2 state, the parameter contains the INP in the previous L0 state.

          The value is coded in fractions of DMT symbols with a granularity of 0.1 symbols.

          The range is from 0 to 25.4. A special value of 25.5 indicates an ACTINP_REIN of 25.5 or higher.

          Note: This parameter is defined as ACTINP_REIN in Clause 7.5.2.9 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPREIN the input value
	 */
	public void  setActINPREIN(Long actINPREIN) {
		this.actINPREIN = actINPREIN;
	}

	/**
	 * Set actual impulse noise protection against REIN, expressed in 0.1 DMT symbols.

          If retransmission is used in a given transmit direction, this parameter reports the actual impulse noise protection (INP) against REIN (under specific conditions detailed in [ITU T G.998.4]) on the bearer channel in the L0 state. In the L2 state, the parameter contains the INP in the previous L0 state.

          The value is coded in fractions of DMT symbols with a granularity of 0.1 symbols.

          The range is from 0 to 25.4. A special value of 25.5 indicates an ACTINP_REIN of 25.5 or higher.

          Note: This parameter is defined as ACTINP_REIN in Clause 7.5.2.9 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPREIN the input value
	 * @return this instance
	 */
	public Channel withActINPREIN(Long actINPREIN) {
		this.actINPREIN = actINPREIN;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Channel withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}