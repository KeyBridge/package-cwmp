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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Audio decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.AudioDecoderStats.")
@XmlRootElement(name = "AudioDecoderStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.AudioDecoderStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioDecoderStats {

	/**
	 * Each entry is the number of seconds during which audio decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Audio decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DecodedFrames")
	public Long decodedFrames;
	/**
	 * Each entry is the number of audio decoding errors detected by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DecodingErrors")
	public Long decodingErrors;

	public AudioDecoderStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which audio decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Audio decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which audio decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Audio decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which audio decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Audio decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public AudioDecoderStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDecodedFrames() {
		return decodedFrames;
	}

	/**
	 * Set the each entry is the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param decodedFrames the input value
	 */
	public void  setDecodedFrames(Long decodedFrames) {
		this.decodedFrames = decodedFrames;
	}

	/**
	 * Set the each entry is the number of audio frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
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
	 * Get the each entry is the number of audio decoding errors detected by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDecodingErrors() {
		return decodingErrors;
	}

	/**
	 * Set the each entry is the number of audio decoding errors detected by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param decodingErrors the input value
	 */
	public void  setDecodingErrors(Long decodingErrors) {
		this.decodingErrors = decodingErrors;
	}

	/**
	 * Set the each entry is the number of audio decoding errors detected by the STB for this AV stream during the sample interval.
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