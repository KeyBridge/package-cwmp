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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * ISDN BRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ISDN.BRI.{i}.")
@XmlRootElement(name = "VoiceService.ISDN.BRI")
@XmlType(name = "VoiceService.ISDN.BRI")
@XmlAccessorType(XmlAccessType.FIELD)
public class BRI {

	/**
	 * Enables or disables this ISDN BRI interface.
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
	 * Protocol emulation for the interface.
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
	 * Maintain the ISDN layer 1 up; it is useful for clocking and management.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PermanentLayer1")
	@CWMPParameter(access = "readWrite")
	public Boolean permanentLayer1;
	/**
	 * Avoid the disconnection of the ISDN layer 1 or 2 up when there is no call in progress in dynamic TEI mode.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LapdDisconnectionTimeout")
	@CWMPParameter(access = "readWrite")
	public Boolean lapdDisconnectionTimeout;
	/**
	 * TEI management mode. It MUST be set to {{enum|Dynamic}} for ISDN phones or connection to an ISDN network and {{enum|Static}} for PBX.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TEINegotiation")
	@CWMPParameter(access = "readWrite")
	public String teiNegotiation;
	/**
	 * TEI value in static mode.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StaticTEI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 63)
	public Long staticTEI;
	/**
	 * Enable or disable the lifeline bypass on the BRI S0 voice module. If the interface is used by the VoIP gateway, the bypass is enabled if the CPE is not registered on registration server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LifeLineHold")
	@CWMPParameter(access = "readWrite")
	public Boolean lifeLineHold;
	/**
	 * To enable (disable) the power source one (PS1) on the BRI interfaces.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerSourceOne")
	@CWMPParameter(access = "readWrite")
	public Boolean powerSourceOne;
	/**
	 * Maximum number of simultaneous B channels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(max = 2)
	public Long maxNumBChannels;
	/**
	 * {{list|reserved B-channels which can be used only for outbound calls}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundOnlyBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 2)
	public Long outboundOnlyBChannels;
	/**
	 * {{list|reserved B-channels which can be used only for inbound calls}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InboundOnlyBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 2)
	public Long inboundOnlyBChannels;
	/**
	 * {{list|reserved B-channels which can be used bidirectional}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BidirectionalBChannels")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 2)
	public Long bidirectionalBChannels;

	public BRI() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this ISDN BRI interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this ISDN BRI interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this ISDN BRI interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public BRI withEnable(Boolean enable) {
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
	public BRI withStatus(String status) {
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
	public BRI withAlias(Alias alias) {
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
	public BRI withName(String name) {
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
	public BRI withToneEventProfile(String toneEventProfile) {
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
	public BRI withApplicationInterface(String applicationInterface) {
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
	public BRI withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the protocol emulation for the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocolEmulation() {
		return protocolEmulation;
	}

	/**
	 * Set the protocol emulation for the interface.
	 *
	 * @since 2.0
	 * @param protocolEmulation the input value
	 */
	public void  setProtocolEmulation(String protocolEmulation) {
		this.protocolEmulation = protocolEmulation;
	}

	/**
	 * Set the protocol emulation for the interface.
	 *
	 * @since 2.0
	 * @param protocolEmulation the input value
	 * @return this instance
	 */
	public BRI withProtocolEmulation(String protocolEmulation) {
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
	public BRI withPermanentLayer2(Boolean permanentLayer2) {
		this.permanentLayer2 = permanentLayer2;
		return this;
	}

	/**
	 * Get the maintain the ISDN layer 1 up; it is useful for clocking and management.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPermanentLayer1() {
		return permanentLayer1;
	}

	/**
	 * Set the maintain the ISDN layer 1 up; it is useful for clocking and management.
	 *
	 * @since 2.0
	 * @param permanentLayer1 the input value
	 */
	public void  setPermanentLayer1(Boolean permanentLayer1) {
		this.permanentLayer1 = permanentLayer1;
	}

	/**
	 * Set the maintain the ISDN layer 1 up; it is useful for clocking and management.
	 *
	 * @since 2.0
	 * @param permanentLayer1 the input value
	 * @return this instance
	 */
	public BRI withPermanentLayer1(Boolean permanentLayer1) {
		this.permanentLayer1 = permanentLayer1;
		return this;
	}

	/**
	 * Get avoid the disconnection of the ISDN layer 1 or 2 up when there is no call in progress in dynamic TEI mode.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLapdDisconnectionTimeout() {
		return lapdDisconnectionTimeout;
	}

	/**
	 * Set avoid the disconnection of the ISDN layer 1 or 2 up when there is no call in progress in dynamic TEI mode.
	 *
	 * @since 2.0
	 * @param lapdDisconnectionTimeout the input value
	 */
	public void  setLapdDisconnectionTimeout(Boolean lapdDisconnectionTimeout) {
		this.lapdDisconnectionTimeout = lapdDisconnectionTimeout;
	}

	/**
	 * Set avoid the disconnection of the ISDN layer 1 or 2 up when there is no call in progress in dynamic TEI mode.
	 *
	 * @since 2.0
	 * @param lapdDisconnectionTimeout the input value
	 * @return this instance
	 */
	public BRI withLapdDisconnectionTimeout(Boolean lapdDisconnectionTimeout) {
		this.lapdDisconnectionTimeout = lapdDisconnectionTimeout;
		return this;
	}

	/**
	 * Get the tei management mode. It MUST be set to {{enum|Dynamic}} for ISDN phones or connection to an ISDN network and {{enum|Static}} for PBX.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTeiNegotiation() {
		return teiNegotiation;
	}

	/**
	 * Set the tei management mode. It MUST be set to {{enum|Dynamic}} for ISDN phones or connection to an ISDN network and {{enum|Static}} for PBX.
	 *
	 * @since 2.0
	 * @param teiNegotiation the input value
	 */
	public void  setTeiNegotiation(String teiNegotiation) {
		this.teiNegotiation = teiNegotiation;
	}

	/**
	 * Set the tei management mode. It MUST be set to {{enum|Dynamic}} for ISDN phones or connection to an ISDN network and {{enum|Static}} for PBX.
	 *
	 * @since 2.0
	 * @param teiNegotiation the input value
	 * @return this instance
	 */
	public BRI withTeiNegotiation(String teiNegotiation) {
		this.teiNegotiation = teiNegotiation;
		return this;
	}

	/**
	 * Get the tei value in static mode.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getStaticTEI() {
		return staticTEI;
	}

	/**
	 * Set the tei value in static mode.
	 *
	 * @since 2.0
	 * @param staticTEI the input value
	 */
	public void  setStaticTEI(Long staticTEI) {
		this.staticTEI = staticTEI;
	}

	/**
	 * Set the tei value in static mode.
	 *
	 * @since 2.0
	 * @param staticTEI the input value
	 * @return this instance
	 */
	public BRI withStaticTEI(Long staticTEI) {
		this.staticTEI = staticTEI;
		return this;
	}

	/**
	 * Get the enable or disable the lifeline bypass on the BRI S0 voice module. If the interface is used by the VoIP gateway, the bypass is enabled if the CPE is not registered on registration server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLifeLineHold() {
		return lifeLineHold;
	}

	/**
	 * Set the enable or disable the lifeline bypass on the BRI S0 voice module. If the interface is used by the VoIP gateway, the bypass is enabled if the CPE is not registered on registration server.
	 *
	 * @since 2.0
	 * @param lifeLineHold the input value
	 */
	public void  setLifeLineHold(Boolean lifeLineHold) {
		this.lifeLineHold = lifeLineHold;
	}

	/**
	 * Set the enable or disable the lifeline bypass on the BRI S0 voice module. If the interface is used by the VoIP gateway, the bypass is enabled if the CPE is not registered on registration server.
	 *
	 * @since 2.0
	 * @param lifeLineHold the input value
	 * @return this instance
	 */
	public BRI withLifeLineHold(Boolean lifeLineHold) {
		this.lifeLineHold = lifeLineHold;
		return this;
	}

	/**
	 * Get the to enable (disable) the power source one (PS1) on the BRI interfaces.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPowerSourceOne() {
		return powerSourceOne;
	}

	/**
	 * Set the to enable (disable) the power source one (PS1) on the BRI interfaces.
	 *
	 * @since 2.0
	 * @param powerSourceOne the input value
	 */
	public void  setPowerSourceOne(Boolean powerSourceOne) {
		this.powerSourceOne = powerSourceOne;
	}

	/**
	 * Set the to enable (disable) the power source one (PS1) on the BRI interfaces.
	 *
	 * @since 2.0
	 * @param powerSourceOne the input value
	 * @return this instance
	 */
	public BRI withPowerSourceOne(Boolean powerSourceOne) {
		this.powerSourceOne = powerSourceOne;
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
	public BRI withMaxNumBChannels(Long maxNumBChannels) {
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
	public BRI withOutboundOnlyBChannels(Long outboundOnlyBChannels) {
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
	public BRI withInboundOnlyBChannels(Long inboundOnlyBChannels) {
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
	public BRI withBidirectionalBChannels(Long bidirectionalBChannels) {
		this.bidirectionalBChannels = bidirectionalBChannels;
		return this;
	}

	//</editor-fold>

}