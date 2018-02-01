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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Video decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.VideoDecoderStats.")
public class VideoDecoderStats {

	/**
	 * Each entry is the number of seconds during which video decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the last frame rate at which the STB played out the video content for this AV stream during the sample interval. . Also the reported rate will be rounded off to the nearest integer.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FrameRate")
	public Long frameRate;
	/**
	 * Each entry is the number of video frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DecodedFrames")
	public Long decodedFrames;
	/**
	 * Each entry is the number of video frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LostFrames")
	public Long lostFrames;
	/**
	 * Each entry is the number of video frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment was applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConcealedFrames")
	public Long concealedFrames;
	/**
	 * Each entry is the number of I frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IDecodedFrames")
	public Long idecodedFrames;
	/**
	 * Each entry is the number of I frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ILostFrames")
	public Long ilostFrames;
	/**
	 * Each entry is the number of I frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IConcealedFrames")
	public Long iconcealedFrames;
	/**
	 * Each entry is the number of P frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PDecodedFrames")
	public Long pdecodedFrames;
	/**
	 * Each entry is the number of P frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PLostFrames")
	public Long plostFrames;
	/**
	 * Each entry is the number of P frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PConcealedFrames")
	public Long pconcealedFrames;
	/**
	 * Each entry is the number of B frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BDecodedFrames")
	public Long bdecodedFrames;
	/**
	 * Each entry is the number of B frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BLostFrames")
	public Long blostFrames;
	/**
	 * Each entry is the number of B frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BConcealedFrames")
	public Long bconcealedFrames;
	/**
	 * Each entry is the number of AV resynchronizations that were performed by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AVResynchCounter")
	public Long avresynchCounter;

	public VideoDecoderStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which video decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which video decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which video decoder data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video Decoder data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public VideoDecoderStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the last frame rate at which the STB played out the video content for this AV stream during the sample interval. . Also the reported rate will be rounded off to the nearest integer.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFrameRate() {
		return frameRate;
	}

	/**
	 * Set the each entry is the last frame rate at which the STB played out the video content for this AV stream during the sample interval. . Also the reported rate will be rounded off to the nearest integer.
	 *
	 * @since 1.0
	 * @param frameRate the input value
	 */
	public void  setFrameRate(Long frameRate) {
		this.frameRate = frameRate;
	}

	/**
	 * Set the each entry is the last frame rate at which the STB played out the video content for this AV stream during the sample interval. . Also the reported rate will be rounded off to the nearest integer.
	 *
	 * @since 1.0
	 * @param frameRate the input value
	 * @return this instance
	 */
	public VideoDecoderStats withFrameRate(Long frameRate) {
		this.frameRate = frameRate;
		return this;
	}

	/**
	 * Get the each entry is the number of video frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDecodedFrames() {
		return decodedFrames;
	}

	/**
	 * Set the each entry is the number of video frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param decodedFrames the input value
	 */
	public void  setDecodedFrames(Long decodedFrames) {
		this.decodedFrames = decodedFrames;
	}

	/**
	 * Set the each entry is the number of video frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param decodedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withDecodedFrames(Long decodedFrames) {
		this.decodedFrames = decodedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of video frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLostFrames() {
		return lostFrames;
	}

	/**
	 * Set the each entry is the number of video frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param lostFrames the input value
	 */
	public void  setLostFrames(Long lostFrames) {
		this.lostFrames = lostFrames;
	}

	/**
	 * Set the each entry is the number of video frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param lostFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withLostFrames(Long lostFrames) {
		this.lostFrames = lostFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of video frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment was applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getConcealedFrames() {
		return concealedFrames;
	}

	/**
	 * Set the each entry is the number of video frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment was applied.
	 *
	 * @since 1.0
	 * @param concealedFrames the input value
	 */
	public void  setConcealedFrames(Long concealedFrames) {
		this.concealedFrames = concealedFrames;
	}

	/**
	 * Set the each entry is the number of video frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment was applied.
	 *
	 * @since 1.0
	 * @param concealedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withConcealedFrames(Long concealedFrames) {
		this.concealedFrames = concealedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of I frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIdecodedFrames() {
		return idecodedFrames;
	}

	/**
	 * Set the each entry is the number of I frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param idecodedFrames the input value
	 */
	public void  setIdecodedFrames(Long idecodedFrames) {
		this.idecodedFrames = idecodedFrames;
	}

	/**
	 * Set the each entry is the number of I frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param idecodedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withIdecodedFrames(Long idecodedFrames) {
		this.idecodedFrames = idecodedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of I frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIlostFrames() {
		return ilostFrames;
	}

	/**
	 * Set the each entry is the number of I frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param ilostFrames the input value
	 */
	public void  setIlostFrames(Long ilostFrames) {
		this.ilostFrames = ilostFrames;
	}

	/**
	 * Set the each entry is the number of I frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param ilostFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withIlostFrames(Long ilostFrames) {
		this.ilostFrames = ilostFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of I frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIconcealedFrames() {
		return iconcealedFrames;
	}

	/**
	 * Set the each entry is the number of I frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param iconcealedFrames the input value
	 */
	public void  setIconcealedFrames(Long iconcealedFrames) {
		this.iconcealedFrames = iconcealedFrames;
	}

	/**
	 * Set the each entry is the number of I frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param iconcealedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withIconcealedFrames(Long iconcealedFrames) {
		this.iconcealedFrames = iconcealedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of P frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPdecodedFrames() {
		return pdecodedFrames;
	}

	/**
	 * Set the each entry is the number of P frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param pdecodedFrames the input value
	 */
	public void  setPdecodedFrames(Long pdecodedFrames) {
		this.pdecodedFrames = pdecodedFrames;
	}

	/**
	 * Set the each entry is the number of P frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param pdecodedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withPdecodedFrames(Long pdecodedFrames) {
		this.pdecodedFrames = pdecodedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of P frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPlostFrames() {
		return plostFrames;
	}

	/**
	 * Set the each entry is the number of P frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param plostFrames the input value
	 */
	public void  setPlostFrames(Long plostFrames) {
		this.plostFrames = plostFrames;
	}

	/**
	 * Set the each entry is the number of P frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param plostFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withPlostFrames(Long plostFrames) {
		this.plostFrames = plostFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of P frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPconcealedFrames() {
		return pconcealedFrames;
	}

	/**
	 * Set the each entry is the number of P frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param pconcealedFrames the input value
	 */
	public void  setPconcealedFrames(Long pconcealedFrames) {
		this.pconcealedFrames = pconcealedFrames;
	}

	/**
	 * Set the each entry is the number of P frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param pconcealedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withPconcealedFrames(Long pconcealedFrames) {
		this.pconcealedFrames = pconcealedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of B frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBdecodedFrames() {
		return bdecodedFrames;
	}

	/**
	 * Set the each entry is the number of B frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param bdecodedFrames the input value
	 */
	public void  setBdecodedFrames(Long bdecodedFrames) {
		this.bdecodedFrames = bdecodedFrames;
	}

	/**
	 * Set the each entry is the number of B frames that were decoded completely (errorless frames) or partially (corrupted frames) by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param bdecodedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withBdecodedFrames(Long bdecodedFrames) {
		this.bdecodedFrames = bdecodedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of B frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBlostFrames() {
		return blostFrames;
	}

	/**
	 * Set the each entry is the number of B frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param blostFrames the input value
	 */
	public void  setBlostFrames(Long blostFrames) {
		this.blostFrames = blostFrames;
	}

	/**
	 * Set the each entry is the number of B frames that could not be reproduced by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param blostFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withBlostFrames(Long blostFrames) {
		this.blostFrames = blostFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of B frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBconcealedFrames() {
		return bconcealedFrames;
	}

	/**
	 * Set the each entry is the number of B frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param bconcealedFrames the input value
	 */
	public void  setBconcealedFrames(Long bconcealedFrames) {
		this.bconcealedFrames = bconcealedFrames;
	}

	/**
	 * Set the each entry is the number of B frames that were reproduced by the STB for which some information was missing for this AV stream during the sample interval and loss concealment applied.
	 *
	 * @since 1.0
	 * @param bconcealedFrames the input value
	 * @return this instance
	 */
	public VideoDecoderStats withBconcealedFrames(Long bconcealedFrames) {
		this.bconcealedFrames = bconcealedFrames;
		return this;
	}

	/**
	 * Get the each entry is the number of AV resynchronizations that were performed by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAvresynchCounter() {
		return avresynchCounter;
	}

	/**
	 * Set the each entry is the number of AV resynchronizations that were performed by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param avresynchCounter the input value
	 */
	public void  setAvresynchCounter(Long avresynchCounter) {
		this.avresynchCounter = avresynchCounter;
	}

	/**
	 * Set the each entry is the number of AV resynchronizations that were performed by the STB for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param avresynchCounter the input value
	 * @return this instance
	 */
	public VideoDecoderStats withAvresynchCounter(Long avresynchCounter) {
		this.avresynchCounter = avresynchCounter;
		return this;
	}

	//</editor-fold>

}