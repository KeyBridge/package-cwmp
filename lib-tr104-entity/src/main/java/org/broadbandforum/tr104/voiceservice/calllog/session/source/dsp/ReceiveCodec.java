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
package org.broadbandforum.tr104.voiceservice.calllog.session.source.dsp;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The receive codec used in this session.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.Source.DSP.ReceiveCodec.")
@XmlRootElement(name = "VoiceService.CallLog.Session.Source.DSP.ReceiveCodec")
@XmlType(name = "VoiceService.CallLog.Session.Source.DSP.ReceiveCodec")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReceiveCodec {

	/**
	 * The codec in use for the incoming voice stream.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Codec")
	@Size(max = 256)
	public String codec;
	/**
	 * Whether or not silence suppression is in use for the incoming voice stream.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SilenceSuppression")
	public Boolean silenceSuppression;
	/**
	 * Total number of times the receive jitter buffer has overrun for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Overruns")
	public Long overruns;
	/**
	 * Total number of times the receive jitter buffer has underrun for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Underruns")
	public Long underruns;

	public ReceiveCodec() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the codec in use for the incoming voice stream.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCodec() {
		return codec;
	}

	/**
	 * Set the codec in use for the incoming voice stream.

{{reference}}
	 *
	 * @since 2.0
	 * @param codec the input value
	 */
	public void  setCodec(String codec) {
		this.codec = codec;
	}

	/**
	 * Set the codec in use for the incoming voice stream.

{{reference}}
	 *
	 * @since 2.0
	 * @param codec the input value
	 * @return this instance
	 */
	public ReceiveCodec withCodec(String codec) {
		this.codec = codec;
		return this;
	}

	/**
	 * Get the whether or not silence suppression is in use for the incoming voice stream.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSilenceSuppression() {
		return silenceSuppression;
	}

	/**
	 * Set the whether or not silence suppression is in use for the incoming voice stream.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 */
	public void  setSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
	}

	/**
	 * Set the whether or not silence suppression is in use for the incoming voice stream.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 * @return this instance
	 */
	public ReceiveCodec withSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has overrun for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOverruns() {
		return overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun for this session.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 */
	public void  setOverruns(Long overruns) {
		this.overruns = overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun for this session.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 * @return this instance
	 */
	public ReceiveCodec withOverruns(Long overruns) {
		this.overruns = overruns;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has underrun for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnderruns() {
		return underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for this session.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 */
	public void  setUnderruns(Long underruns) {
		this.underruns = underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for this session.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 * @return this instance
	 */
	public ReceiveCodec withUnderruns(Long underruns) {
		this.underruns = underruns;
		return this;
	}

	//</editor-fold>

}