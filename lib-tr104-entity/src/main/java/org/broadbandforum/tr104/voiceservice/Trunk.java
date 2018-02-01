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
package org.broadbandforum.tr104.voiceservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Trunk table.

The {{object}} holds all parameters a CPE needs to set up a trunk connection with an NGN, as defined in {{bibref|ETSI_TS_181_019}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Trunk.{i}.")
public class Trunk {

	/**
	 * Enables or disables this trunk.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this trunk.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Mechanism via which the {{object}} was assigned. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * Name of the trunk.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String name;
	/**
	 * {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Examples:

:0123456789

:0123456700-0123456720

Each time this value is changed, the table of Lines managed by the {{object|.Trunk}} is automatically adapted and each value of the {{param}} MUST be represented in corresponding {{param|.CallControl.Line.{i}.DirectoryNumber}} parameter.

If this trunk has a {{object|.SIP.Client.}} provider and {{param|.SIP.Client.{i}.E164Format}} is set to {{true}}, full E.164 numbers with country code (but without "+" prefix) MUST be used.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DDIRange")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ddiRange;
	/**
	 * When {{true}}, a {{object|.CallControl.Line.{i}.}} instance SHOULD be created automatically for each identity within the ranges specified by {{param|DDIRange}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LineObjectCreation")
	@CWMPParameter(access = "readWrite")
	public Boolean lineObjectCreation;
	/**
	 * Defines the maximum number of simultaneous communication channels handled by this trunk. A channel is used to convey an information signal, for example a digital bit stream, from one or several senders to one or several receivers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxChannels")
	@CWMPParameter(access = "readWrite")
	public Long maxChannels;
	/**
	 * Maximal number of simultaneous communication channels in outbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxInboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by outbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxOutboundChannelCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxOutboundChannelCount = -1;
	/**
	 * Maximal number of simultaneous communication channels in inbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxOutboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by inbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxInboundChannelCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxInboundChannelCount = -1;
	/**
	 * The {{param}} option controls which end of an inbound call leg will have priority over the negotiation of codecs.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CodecPriority")
	@CWMPParameter(access = "readWrite")
	public String codecPriority;
	/**
	 * SIP client or ISDN interface associated with the identities represented by this trunk.

{{reference}}

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Provider")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String provider;

	public Trunk() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this trunk.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this trunk.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this trunk.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Trunk withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQuiescentMode() {
		return quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 */
	public void  setQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 * @return this instance
	 */
	public Trunk withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this trunk.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this trunk.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this trunk.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Trunk withStatus(String status) {
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
	public Trunk withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} was assigned. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was assigned. {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was assigned. {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Trunk withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the name of the trunk.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the trunk.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the trunk.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Trunk withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Examples:

:0123456789

:0123456700-0123456720

Each time this value is changed, the table of Lines managed by the {{object|.Trunk}} is automatically adapted and each value of the {{param}} MUST be represented in corresponding {{param|.CallControl.Line.{i}.DirectoryNumber}} parameter.

If this trunk has a {{object|.SIP.Client.}} provider and {{param|.SIP.Client.{i}.E164Format}} is set to {{true}}, full E.164 numbers with country code (but without "+" prefix) MUST be used.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDdiRange() {
		if (this.ddiRange == null){ this.ddiRange=new ArrayList<>();}
		return ddiRange;
	}

	/**
	 * Set the {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Examples:

:0123456789

:0123456700-0123456720

Each time this value is changed, the table of Lines managed by the {{object|.Trunk}} is automatically adapted and each value of the {{param}} MUST be represented in corresponding {{param|.CallControl.Line.{i}.DirectoryNumber}} parameter.

If this trunk has a {{object|.SIP.Client.}} provider and {{param|.SIP.Client.{i}.E164Format}} is set to {{true}}, full E.164 numbers with country code (but without "+" prefix) MUST be used.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ddiRange the input value
	 */
	public void  setDdiRange(Collection<String> ddiRange) {
		this.ddiRange = ddiRange;
	}

	/**
	 * Set the {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Examples:

:0123456789

:0123456700-0123456720

Each time this value is changed, the table of Lines managed by the {{object|.Trunk}} is automatically adapted and each value of the {{param}} MUST be represented in corresponding {{param|.CallControl.Line.{i}.DirectoryNumber}} parameter.

If this trunk has a {{object|.SIP.Client.}} provider and {{param|.SIP.Client.{i}.E164Format}} is set to {{true}}, full E.164 numbers with country code (but without "+" prefix) MUST be used.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Trunk withDdiRange(String string) {
		getDdiRange().add(string);
		return this;
	}

	/**
	 * Get the when {{true}}, a {{object|.CallControl.Line.{i}.}} instance SHOULD be created automatically for each identity within the ranges specified by {{param|DDIRange}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLineObjectCreation() {
		return lineObjectCreation;
	}

	/**
	 * Set the when {{true}}, a {{object|.CallControl.Line.{i}.}} instance SHOULD be created automatically for each identity within the ranges specified by {{param|DDIRange}}.
	 *
	 * @since 2.0
	 * @param lineObjectCreation the input value
	 */
	public void  setLineObjectCreation(Boolean lineObjectCreation) {
		this.lineObjectCreation = lineObjectCreation;
	}

	/**
	 * Set the when {{true}}, a {{object|.CallControl.Line.{i}.}} instance SHOULD be created automatically for each identity within the ranges specified by {{param|DDIRange}}.
	 *
	 * @since 2.0
	 * @param lineObjectCreation the input value
	 * @return this instance
	 */
	public Trunk withLineObjectCreation(Boolean lineObjectCreation) {
		this.lineObjectCreation = lineObjectCreation;
		return this;
	}

	/**
	 * Get the defines the maximum number of simultaneous communication channels handled by this trunk. A channel is used to convey an information signal, for example a digital bit stream, from one or several senders to one or several receivers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxChannels() {
		return maxChannels;
	}

	/**
	 * Set the defines the maximum number of simultaneous communication channels handled by this trunk. A channel is used to convey an information signal, for example a digital bit stream, from one or several senders to one or several receivers.
	 *
	 * @since 2.0
	 * @param maxChannels the input value
	 */
	public void  setMaxChannels(Long maxChannels) {
		this.maxChannels = maxChannels;
	}

	/**
	 * Set the defines the maximum number of simultaneous communication channels handled by this trunk. A channel is used to convey an information signal, for example a digital bit stream, from one or several senders to one or several receivers.
	 *
	 * @since 2.0
	 * @param maxChannels the input value
	 * @return this instance
	 */
	public Trunk withMaxChannels(Long maxChannels) {
		this.maxChannels = maxChannels;
		return this;
	}

	/**
	 * Get the maximal number of simultaneous communication channels in outbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxInboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by outbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxOutboundChannelCount() {
		return maxOutboundChannelCount;
	}

	/**
	 * Set the maximal number of simultaneous communication channels in outbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxInboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by outbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @param maxOutboundChannelCount the input value
	 */
	public void  setMaxOutboundChannelCount(Integer maxOutboundChannelCount) {
		this.maxOutboundChannelCount = maxOutboundChannelCount;
	}

	/**
	 * Set the maximal number of simultaneous communication channels in outbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxInboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by outbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @param maxOutboundChannelCount the input value
	 * @return this instance
	 */
	public Trunk withMaxOutboundChannelCount(Integer maxOutboundChannelCount) {
		this.maxOutboundChannelCount = maxOutboundChannelCount;
		return this;
	}

	/**
	 * Get the maximal number of simultaneous communication channels in inbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxOutboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by inbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxInboundChannelCount() {
		return maxInboundChannelCount;
	}

	/**
	 * Set the maximal number of simultaneous communication channels in inbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxOutboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by inbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @param maxInboundChannelCount the input value
	 */
	public void  setMaxInboundChannelCount(Integer maxInboundChannelCount) {
		this.maxInboundChannelCount = maxInboundChannelCount;
	}

	/**
	 * Set the maximal number of simultaneous communication channels in inbound direction supported across this trunk. The maximum number cannot exceed {{param|MaxChannels}} - {{param|MaxOutboundChannelCount}}. A value n>0 means, that there are no more than n channels allowed, which are used by inbound calls. A value of -1 means that there are no restrictions in this direction.
	 *
	 * @since 2.0
	 * @param maxInboundChannelCount the input value
	 * @return this instance
	 */
	public Trunk withMaxInboundChannelCount(Integer maxInboundChannelCount) {
		this.maxInboundChannelCount = maxInboundChannelCount;
		return this;
	}

	/**
	 * Get the {{param}} option controls which end of an inbound call leg will have priority over the negotiation of codecs.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCodecPriority() {
		return codecPriority;
	}

	/**
	 * Set the {{param}} option controls which end of an inbound call leg will have priority over the negotiation of codecs.
	 *
	 * @since 2.0
	 * @param codecPriority the input value
	 */
	public void  setCodecPriority(String codecPriority) {
		this.codecPriority = codecPriority;
	}

	/**
	 * Set the {{param}} option controls which end of an inbound call leg will have priority over the negotiation of codecs.
	 *
	 * @since 2.0
	 * @param codecPriority the input value
	 * @return this instance
	 */
	public Trunk withCodecPriority(String codecPriority) {
		this.codecPriority = codecPriority;
		return this;
	}

	/**
	 * Get the sip client or ISDN interface associated with the identities represented by this trunk.

{{reference}}

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * Set the sip client or ISDN interface associated with the identities represented by this trunk.

{{reference}}

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param provider the input value
	 */
	public void  setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Set the sip client or ISDN interface associated with the identities represented by this trunk.

{{reference}}

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param provider the input value
	 * @return this instance
	 */
	public Trunk withProvider(String provider) {
		this.provider = provider;
		return this;
	}

	//</editor-fold>

}