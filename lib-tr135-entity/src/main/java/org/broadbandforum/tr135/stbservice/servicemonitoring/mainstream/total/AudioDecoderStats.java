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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Total audio decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.AudioDecoderStats.")
@XmlRootElement(name = "AudioDecoderStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Total.AudioDecoderStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioDecoderStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Audio Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * The number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DecodedFrames")
	@CWMPParameter(activeNotify = "canDeny")
	public Long decodedFrames;
	/**
	 * The number of audio decoding errors detected for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DecodingErrors")
	public Long decodingErrors;

	public AudioDecoderStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Audio Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getTotalSeconds() {
		return totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Audio Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 */
	public void  setTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Audio Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public AudioDecoderStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDecodedFrames() {
		return decodedFrames;
	}

	/**
	 * Set the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) for this AV stream.
	 *
	 * @since 1.0
	 * @param decodedFrames the input value
	 */
	public void  setDecodedFrames(Long decodedFrames) {
		this.decodedFrames = decodedFrames;
	}

	/**
	 * Set the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) for this AV stream.
	 *
	 * @since 1.0
	 * @param decodedFrames the input value
	 * @return this instance
	 */
	public AudioDecoderStats withDecodedFrames(Long decodedFrames) {
		this.decodedFrames = decodedFrames;
		return this;
	}

	/**
	 * Get the number of audio decoding errors detected for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDecodingErrors() {
		return decodingErrors;
	}

	/**
	 * Set the number of audio decoding errors detected for this AV stream.
	 *
	 * @since 1.0
	 * @param decodingErrors the input value
	 */
	public void  setDecodingErrors(Long decodingErrors) {
		this.decodingErrors = decodingErrors;
	}

	/**
	 * Set the number of audio decoding errors detected for this AV stream.
	 *
	 * @since 1.0
	 * @param decodingErrors the input value
	 * @return this instance
	 */
	public AudioDecoderStats withDecodingErrors(Long decodingErrors) {
		this.decodingErrors = decodingErrors;
		return this;
	}

	//</editor-fold>

}