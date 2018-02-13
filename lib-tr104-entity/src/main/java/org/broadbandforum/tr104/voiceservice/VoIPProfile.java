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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.voipprofile.FaxT38;
import org.broadbandforum.tr104.voiceservice.voipprofile.RTP;

	/**
	 * Configuration profile that can be shared by VoIP components.

A VoIP Profile contains media transport configuration parameters that are common to different VoIP protocols.

VoIP Profiles could be used by {{object|.SIP.Network.}}, {{object|.SIP.Proxy.}}, {{object|.SIP.Network.}}, {{object|.H323.Network.}} and {{object|.MGCP.Network.}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.")
@XmlRootElement(name = "VoIPProfile")
@XmlType(name = "VoiceService.VoIPProfile")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoIPProfile {

	/**
	 * Enables or disables this VoIP profile. If the value is set to {{false}}, all components using the profile are disabled, whatever their status is.
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
	 * Human-readable string to identify the profile instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{list}}  Method by which DTMF digits MUST be passed. 

Enumerated value must be one of [InBand, RFC4733, SIPInfo]

If {{param|DTMFMethodG711}} is non-empty, then this parameter applies only when the current codec is not G.711.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DTMFMethod")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> dtmFMethod;
	/**
	 * Method by which DTMF digits MUST be passed if the the current codec is G.711.  {{enum}}

If {{empty}} indicates that the value of {{param|DTMFMethod}} is to apply whether or not the the the current codec is G.711.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DTMFMethodG711")
	@CWMPParameter(access = "readWrite")
	public String dtmFMethodG711;
	/**
	 * Quality model which the CPE shall use to calculate the parameters {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}. The value MUST be a member of the list reported by the {{param|.Capabilities.QualityIndicator.QIModelsSupported}} parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QIModelUsed")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String qimodelUsed;
	/**
	 * The interval between successive calculations of {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}} values (in seconds). If {{param}} is not set then only one final quality value covering the complete session is reported in {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QICalculationInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long qicalculationInterval;
	/**
	 * The maximum number of worst quality indicators to store for each call.

The CPE MUST permit {{param}} to be set to any value in the range from 0 to {{param|.Capabilities.QualityIndicator.MaxWorstQIValues}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfWorstQIValues")
	@CWMPParameter(access = "readWrite")
	public Long numberOfWorstQIValues;
	/**
	 * VoIP profile parameters related to the voice stream sent via RTP.
	 */
	@XmlElement(name = "RTP")
	public RTP rtp;
	/**
	 * T.38 Fax information for devices that support T.38 relay.
	 */
	@XmlElement(name = "FaxT38")
	public FaxT38 faxT38;

	public VoIPProfile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this VoIP profile. If the value is set to {{false}}, all components using the profile are disabled, whatever their status is.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this VoIP profile. If the value is set to {{false}}, all components using the profile are disabled, whatever their status is.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this VoIP profile. If the value is set to {{false}}, all components using the profile are disabled, whatever their status is.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VoIPProfile withEnable(Boolean enable) {
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
	public VoIPProfile withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the human-readable string to identify the profile instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable string to identify the profile instance.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable string to identify the profile instance.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public VoIPProfile withName(String name) {
		this.name = name;
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
	public VoIPProfile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}}  Method by which DTMF digits MUST be passed. 

Enumerated value must be one of [InBand, RFC4733, SIPInfo]

If {{param|DTMFMethodG711}} is non-empty, then this parameter applies only when the current codec is not G.711.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDtmFMethod() {
		if (this.dtmFMethod == null){ this.dtmFMethod=new ArrayList<>();}
		return dtmFMethod;
	}

	/**
	 * Set the {{list}}  Method by which DTMF digits MUST be passed. 

Enumerated value must be one of [InBand, RFC4733, SIPInfo]

If {{param|DTMFMethodG711}} is non-empty, then this parameter applies only when the current codec is not G.711.
	 *
	 * @since 2.0
	 * @param dtmFMethod the input value
	 */
	public void  setDtmFMethod(Collection<String> dtmFMethod) {
		this.dtmFMethod = dtmFMethod;
	}

	/**
	 * Set the {{list}}  Method by which DTMF digits MUST be passed. 

Enumerated value must be one of [InBand, RFC4733, SIPInfo]

If {{param|DTMFMethodG711}} is non-empty, then this parameter applies only when the current codec is not G.711.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public VoIPProfile withDtmFMethod(String string) {
		getDtmFMethod().add(string);
		return this;
	}

	/**
	 * Get the method by which DTMF digits MUST be passed if the the current codec is G.711.  {{enum}}

If {{empty}} indicates that the value of {{param|DTMFMethod}} is to apply whether or not the the the current codec is G.711.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDtmFMethodG711() {
		return dtmFMethodG711;
	}

	/**
	 * Set the method by which DTMF digits MUST be passed if the the current codec is G.711.  {{enum}}

If {{empty}} indicates that the value of {{param|DTMFMethod}} is to apply whether or not the the the current codec is G.711.
	 *
	 * @since 2.0
	 * @param dtmFMethodG711 the input value
	 */
	public void  setDtmFMethodG711(String dtmFMethodG711) {
		this.dtmFMethodG711 = dtmFMethodG711;
	}

	/**
	 * Set the method by which DTMF digits MUST be passed if the the current codec is G.711.  {{enum}}

If {{empty}} indicates that the value of {{param|DTMFMethod}} is to apply whether or not the the the current codec is G.711.
	 *
	 * @since 2.0
	 * @param dtmFMethodG711 the input value
	 * @return this instance
	 */
	public VoIPProfile withDtmFMethodG711(String dtmFMethodG711) {
		this.dtmFMethodG711 = dtmFMethodG711;
		return this;
	}

	/**
	 * Get the quality model which the CPE shall use to calculate the parameters {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}. The value MUST be a member of the list reported by the {{param|.Capabilities.QualityIndicator.QIModelsSupported}} parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getQimodelUsed() {
		return qimodelUsed;
	}

	/**
	 * Set the quality model which the CPE shall use to calculate the parameters {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}. The value MUST be a member of the list reported by the {{param|.Capabilities.QualityIndicator.QIModelsSupported}} parameter.
	 *
	 * @since 2.0
	 * @param qimodelUsed the input value
	 */
	public void  setQimodelUsed(String qimodelUsed) {
		this.qimodelUsed = qimodelUsed;
	}

	/**
	 * Set the quality model which the CPE shall use to calculate the parameters {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}. The value MUST be a member of the list reported by the {{param|.Capabilities.QualityIndicator.QIModelsSupported}} parameter.
	 *
	 * @since 2.0
	 * @param qimodelUsed the input value
	 * @return this instance
	 */
	public VoIPProfile withQimodelUsed(String qimodelUsed) {
		this.qimodelUsed = qimodelUsed;
		return this;
	}

	/**
	 * Get the interval between successive calculations of {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}} values (in seconds). If {{param}} is not set then only one final quality value covering the complete session is reported in {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQicalculationInterval() {
		return qicalculationInterval;
	}

	/**
	 * Set the interval between successive calculations of {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}} values (in seconds). If {{param}} is not set then only one final quality value covering the complete session is reported in {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}.
	 *
	 * @since 2.0
	 * @param qicalculationInterval the input value
	 */
	public void  setQicalculationInterval(Long qicalculationInterval) {
		this.qicalculationInterval = qicalculationInterval;
	}

	/**
	 * Set the interval between successive calculations of {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}} values (in seconds). If {{param}} is not set then only one final quality value covering the complete session is reported in {{param|.CallLog.{i}.Session.{i}.Source.VoiceQuality.VoIPQualityIndicator}} and {{param|.CallLog.{i}.Session.{i}.Destination.VoiceQuality.VoIPQualityIndicator}}.
	 *
	 * @since 2.0
	 * @param qicalculationInterval the input value
	 * @return this instance
	 */
	public VoIPProfile withQicalculationInterval(Long qicalculationInterval) {
		this.qicalculationInterval = qicalculationInterval;
		return this;
	}

	/**
	 * Get the maximum number of worst quality indicators to store for each call.

The CPE MUST permit {{param}} to be set to any value in the range from 0 to {{param|.Capabilities.QualityIndicator.MaxWorstQIValues}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfWorstQIValues() {
		return numberOfWorstQIValues;
	}

	/**
	 * Set the maximum number of worst quality indicators to store for each call.

The CPE MUST permit {{param}} to be set to any value in the range from 0 to {{param|.Capabilities.QualityIndicator.MaxWorstQIValues}}.
	 *
	 * @since 2.0
	 * @param numberOfWorstQIValues the input value
	 */
	public void  setNumberOfWorstQIValues(Long numberOfWorstQIValues) {
		this.numberOfWorstQIValues = numberOfWorstQIValues;
	}

	/**
	 * Set the maximum number of worst quality indicators to store for each call.

The CPE MUST permit {{param}} to be set to any value in the range from 0 to {{param|.Capabilities.QualityIndicator.MaxWorstQIValues}}.
	 *
	 * @since 2.0
	 * @param numberOfWorstQIValues the input value
	 * @return this instance
	 */
	public VoIPProfile withNumberOfWorstQIValues(Long numberOfWorstQIValues) {
		this.numberOfWorstQIValues = numberOfWorstQIValues;
		return this;
	}

	/**
	 * Get the voiP profile parameters related to the voice stream sent via RTP.
	 *
	 * @return the value
	 */
	public RTP getRtp() {
		return rtp;
	}

	/**
	 * Set the voiP profile parameters related to the voice stream sent via RTP.
	 *
	 * @param rtp the input value
	 */
	public void  setRtp(RTP rtp) {
		this.rtp = rtp;
	}

	/**
	 * Set the voiP profile parameters related to the voice stream sent via RTP.
	 *
	 * @param rtp the input value
	 * @return this instance
	 */
	public VoIPProfile withRtp(RTP rtp) {
		this.rtp = rtp;
		return this;
	}

	/**
	 * Get the t.38 Fax information for devices that support T.38 relay.
	 *
	 * @return the value
	 */
	public FaxT38 getFaxT38() {
		return faxT38;
	}

	/**
	 * Set the t.38 Fax information for devices that support T.38 relay.
	 *
	 * @param faxT38 the input value
	 */
	public void  setFaxT38(FaxT38 faxT38) {
		this.faxT38 = faxT38;
	}

	/**
	 * Set the t.38 Fax information for devices that support T.38 relay.
	 *
	 * @param faxT38 the input value
	 * @return this instance
	 */
	public VoIPProfile withFaxT38(FaxT38 faxT38) {
		this.faxT38 = faxT38;
		return this;
	}

	//</editor-fold>

}