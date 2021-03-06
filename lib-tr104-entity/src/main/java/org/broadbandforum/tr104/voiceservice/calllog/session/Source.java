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
package org.broadbandforum.tr104.voiceservice.calllog.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.calllog.session.source.DSP;
import org.broadbandforum.tr104.voiceservice.calllog.session.source.RTP;
import org.broadbandforum.tr104.voiceservice.calllog.session.source.VoiceQuality;

	/**
	 * The source of the session information within one call.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.Source.")
@XmlRootElement(name = "VoiceService.CallLog.Session.Source")
@XmlType(name = "VoiceService.CallLog.Session.Source")
@XmlAccessorType(XmlAccessType.FIELD)
public class Source {

	/**
	 * The RTP part of the source session information.
	 */
	@XmlElement(name = "RTP")
	public RTP rtp;
	/**
	 * The DSP part of the line session information.
	 */
	@XmlElement(name = "DSP")
	public DSP dsp;
	/**
	 * VoIP Statistics for current session instance.
	 */
	@XmlElement(name = "VoiceQuality")
	public VoiceQuality voiceQuality;

	public Source() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the RTP part of the source session information.
	 *
	 * @return the value
	 */
	public RTP getRtp() {
		return rtp;
	}

	/**
	 * Set the RTP part of the source session information.
	 *
	 * @param rtp the input value
	 */
	public void  setRtp(RTP rtp) {
		this.rtp = rtp;
	}

	/**
	 * Set the RTP part of the source session information.
	 *
	 * @param rtp the input value
	 * @return this instance
	 */
	public Source withRtp(RTP rtp) {
		this.rtp = rtp;
		return this;
	}

	/**
	 * Get the DSP part of the line session information.
	 *
	 * @return the value
	 */
	public DSP getDsp() {
		return dsp;
	}

	/**
	 * Set the DSP part of the line session information.
	 *
	 * @param dsp the input value
	 */
	public void  setDsp(DSP dsp) {
		this.dsp = dsp;
	}

	/**
	 * Set the DSP part of the line session information.
	 *
	 * @param dsp the input value
	 * @return this instance
	 */
	public Source withDsp(DSP dsp) {
		this.dsp = dsp;
		return this;
	}

	/**
	 * Get the voiP Statistics for current session instance.
	 *
	 * @return the value
	 */
	public VoiceQuality getVoiceQuality() {
		return voiceQuality;
	}

	/**
	 * Set the voiP Statistics for current session instance.
	 *
	 * @param voiceQuality the input value
	 */
	public void  setVoiceQuality(VoiceQuality voiceQuality) {
		this.voiceQuality = voiceQuality;
	}

	/**
	 * Set the voiP Statistics for current session instance.
	 *
	 * @param voiceQuality the input value
	 * @return this instance
	 */
	public Source withVoiceQuality(VoiceQuality voiceQuality) {
		this.voiceQuality = voiceQuality;
		return this;
	}

	//</editor-fold>

}