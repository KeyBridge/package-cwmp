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
package org.broadbandforum.tr104.voiceservice.isdn;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * ISDN PRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ISDN.PRI.{i}.")
public class PRI {

	/**
	 * Enables or disables this ISDN PRI interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this physical interface.
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
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * Reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneEventProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String toneEventProfile;
	/**
	 * Specify the type of application that uses the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ApplicationInterface")
	@CWMPParameter(access = "readWrite")
	public String applicationInterface;
	/**
	 * Specifies the protocol variant used for the interface.  {{enum}}

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;
	/**
	 * Specify the protocol emulation for this interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProtocolEmulation")
	@CWMPParameter(access = "readWrite")
	public String protocolEmulation;
	/**
	 * If {{true}}, avoid the disconnection of the ISDN layer 2 when the ISDN terminal or the ISDN network disconnects the layer 2 (in static TEI mode); it will be maintained established.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PermanentLayer2")
	@CWMPParameter(access = "readWrite")
	public Boolean permanentLayer2;
	/**
	 * Specify the physical line coding to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Linecode")
	@CWMPParameter(access = "readWrite")
	public String linecode;
	/**
	 * Specify the framing type.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ESF")
	@CWMPParameter(access = "readWrite")
	public String esf;
	/**
	 * {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhysicalInterfaceType")
	@CWMPParameter(access = "readWrite")
	public String physicalInterfaceType;
	/**
	 * Maximum number of simultaneous B channels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(max = 30)
	public Long maxNumBChannels;
	/**
	 * {{list|reserved B-channels which can be used only for outbound calls}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundOnlyBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long outboundOnlyBChannels;
	/**
	 * {{list|reserved B-channels which can be used only for inbound calls}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InboundOnlyBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long inboundOnlyBChannels;
	/**
	 * {{list|reserved B-channels which can be used bidirectional}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BidirectionalBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long bidirectionalBChannels;
	/**
	 * Determines the role of the CPE for the purpose of clock synchronisation on this interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClockMode")
	@CWMPParameter(access = "readWrite")
	public String clockMode;

	public PRI() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this ISDN PRI interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this ISDN PRI interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this ISDN PRI interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public PRI withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public PRI withStatus(String status) {
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
	public PRI withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public PRI withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getToneEventProfile() {
		return toneEventProfile;
	}

	/**
	 * Set the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @param toneEventProfile the input value
	 */
	public void  setToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
	}

	/**
	 * Set the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @param toneEventProfile the input value
	 * @return this instance
	 */
	public PRI withToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
		return this;
	}

	/**
	 * Get the specify the type of application that uses the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApplicationInterface() {
		return applicationInterface;
	}

	/**
	 * Set the specify the type of application that uses the interface.
	 *
	 * @since 2.0
	 * @param applicationInterface the input value
	 */
	public void  setApplicationInterface(String applicationInterface) {
		this.applicationInterface = applicationInterface;
	}

	/**
	 * Set the specify the type of application that uses the interface.
	 *
	 * @since 2.0
	 * @param applicationInterface the input value
	 * @return this instance
	 */
	public PRI withApplicationInterface(String applicationInterface) {
		this.applicationInterface = applicationInterface;
		return this;
	}

	/**
	 * Get the specifies the protocol variant used for the interface.  {{enum}}

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the specifies the protocol variant used for the interface.  {{enum}}

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the specifies the protocol variant used for the interface.  {{enum}}

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public PRI withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the specify the protocol emulation for this interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocolEmulation() {
		return protocolEmulation;
	}

	/**
	 * Set the specify the protocol emulation for this interface.
	 *
	 * @since 2.0
	 * @param protocolEmulation the input value
	 */
	public void  setProtocolEmulation(String protocolEmulation) {
		this.protocolEmulation = protocolEmulation;
	}

	/**
	 * Set the specify the protocol emulation for this interface.
	 *
	 * @since 2.0
	 * @param protocolEmulation the input value
	 * @return this instance
	 */
	public PRI withProtocolEmulation(String protocolEmulation) {
		this.protocolEmulation = protocolEmulation;
		return this;
	}

	/**
	 * Get the if {{true}}, avoid the disconnection of the ISDN layer 2 when the ISDN terminal or the ISDN network disconnects the layer 2 (in static TEI mode); it will be maintained established.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPermanentLayer2() {
		return permanentLayer2;
	}

	/**
	 * Set the if {{true}}, avoid the disconnection of the ISDN layer 2 when the ISDN terminal or the ISDN network disconnects the layer 2 (in static TEI mode); it will be maintained established.
	 *
	 * @since 2.0
	 * @param permanentLayer2 the input value
	 */
	public void  setPermanentLayer2(Boolean permanentLayer2) {
		this.permanentLayer2 = permanentLayer2;
	}

	/**
	 * Set the if {{true}}, avoid the disconnection of the ISDN layer 2 when the ISDN terminal or the ISDN network disconnects the layer 2 (in static TEI mode); it will be maintained established.
	 *
	 * @since 2.0
	 * @param permanentLayer2 the input value
	 * @return this instance
	 */
	public PRI withPermanentLayer2(Boolean permanentLayer2) {
		this.permanentLayer2 = permanentLayer2;
		return this;
	}

	/**
	 * Get the specify the physical line coding to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLinecode() {
		return linecode;
	}

	/**
	 * Set the specify the physical line coding to be used.
	 *
	 * @since 2.0
	 * @param linecode the input value
	 */
	public void  setLinecode(String linecode) {
		this.linecode = linecode;
	}

	/**
	 * Set the specify the physical line coding to be used.
	 *
	 * @since 2.0
	 * @param linecode the input value
	 * @return this instance
	 */
	public PRI withLinecode(String linecode) {
		this.linecode = linecode;
		return this;
	}

	/**
	 * Get the specify the framing type.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEsf() {
		return esf;
	}

	/**
	 * Set the specify the framing type.
	 *
	 * @since 2.0
	 * @param esf the input value
	 */
	public void  setEsf(String esf) {
		this.esf = esf;
	}

	/**
	 * Set the specify the framing type.
	 *
	 * @since 2.0
	 * @param esf the input value
	 * @return this instance
	 */
	public PRI withEsf(String esf) {
		this.esf = esf;
		return this;
	}

	/**
	 * Get the {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPhysicalInterfaceType() {
		return physicalInterfaceType;
	}

	/**
	 * Set the {{enum}}
	 *
	 * @since 2.0
	 * @param physicalInterfaceType the input value
	 */
	public void  setPhysicalInterfaceType(String physicalInterfaceType) {
		this.physicalInterfaceType = physicalInterfaceType;
	}

	/**
	 * Set the {{enum}}
	 *
	 * @since 2.0
	 * @param physicalInterfaceType the input value
	 * @return this instance
	 */
	public PRI withPhysicalInterfaceType(String physicalInterfaceType) {
		this.physicalInterfaceType = physicalInterfaceType;
		return this;
	}

	/**
	 * Get the maximum number of simultaneous B channels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNumBChannels() {
		return maxNumBChannels;
	}

	/**
	 * Set the maximum number of simultaneous B channels.
	 *
	 * @since 2.0
	 * @param maxNumBChannels the input value
	 */
	public void  setMaxNumBChannels(Long maxNumBChannels) {
		this.maxNumBChannels = maxNumBChannels;
	}

	/**
	 * Set the maximum number of simultaneous B channels.
	 *
	 * @since 2.0
	 * @param maxNumBChannels the input value
	 * @return this instance
	 */
	public PRI withMaxNumBChannels(Long maxNumBChannels) {
		this.maxNumBChannels = maxNumBChannels;
		return this;
	}

	/**
	 * Get the {{list|reserved B-channels which can be used only for outbound calls}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutboundOnlyBChannels() {
		return outboundOnlyBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used only for outbound calls}}
	 *
	 * @since 2.0
	 * @param outboundOnlyBChannels the input value
	 */
	public void  setOutboundOnlyBChannels(Long outboundOnlyBChannels) {
		this.outboundOnlyBChannels = outboundOnlyBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used only for outbound calls}}
	 *
	 * @since 2.0
	 * @param outboundOnlyBChannels the input value
	 * @return this instance
	 */
	public PRI withOutboundOnlyBChannels(Long outboundOnlyBChannels) {
		this.outboundOnlyBChannels = outboundOnlyBChannels;
		return this;
	}

	/**
	 * Get the {{list|reserved B-channels which can be used only for inbound calls}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInboundOnlyBChannels() {
		return inboundOnlyBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used only for inbound calls}}
	 *
	 * @since 2.0
	 * @param inboundOnlyBChannels the input value
	 */
	public void  setInboundOnlyBChannels(Long inboundOnlyBChannels) {
		this.inboundOnlyBChannels = inboundOnlyBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used only for inbound calls}}
	 *
	 * @since 2.0
	 * @param inboundOnlyBChannels the input value
	 * @return this instance
	 */
	public PRI withInboundOnlyBChannels(Long inboundOnlyBChannels) {
		this.inboundOnlyBChannels = inboundOnlyBChannels;
		return this;
	}

	/**
	 * Get the {{list|reserved B-channels which can be used bidirectional}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBidirectionalBChannels() {
		return bidirectionalBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used bidirectional}}
	 *
	 * @since 2.0
	 * @param bidirectionalBChannels the input value
	 */
	public void  setBidirectionalBChannels(Long bidirectionalBChannels) {
		this.bidirectionalBChannels = bidirectionalBChannels;
	}

	/**
	 * Set the {{list|reserved B-channels which can be used bidirectional}}
	 *
	 * @since 2.0
	 * @param bidirectionalBChannels the input value
	 * @return this instance
	 */
	public PRI withBidirectionalBChannels(Long bidirectionalBChannels) {
		this.bidirectionalBChannels = bidirectionalBChannels;
		return this;
	}

	/**
	 * Get the determines the role of the CPE for the purpose of clock synchronisation on this interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getClockMode() {
		return clockMode;
	}

	/**
	 * Set the determines the role of the CPE for the purpose of clock synchronisation on this interface.
	 *
	 * @since 2.0
	 * @param clockMode the input value
	 */
	public void  setClockMode(String clockMode) {
		this.clockMode = clockMode;
	}

	/**
	 * Set the determines the role of the CPE for the purpose of clock synchronisation on this interface.
	 *
	 * @since 2.0
	 * @param clockMode the input value
	 * @return this instance
	 */
	public PRI withClockMode(String clockMode) {
		this.clockMode = clockMode;
		return this;
	}

	//</editor-fold>

}