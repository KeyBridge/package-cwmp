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
package org.broadbandforum.tr135.stbservice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.MPEG2Part2;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.MPEG4Part10;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.MPEG4Part2;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.SMPTEVC1;

	/**
	 * Video decoder capabilities.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.")
@XmlRootElement(name = "STBService.Capabilities.VideoDecoder")
@XmlType(name = "STBService.Capabilities.VideoDecoder")
@XmlAccessorType(XmlAccessType.FIELD)
public class VideoDecoder {

	/**
	 * Video standards supported by this STB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VideoStandards")
	@XmlList
	public Collection<String> videoStandards;
	/**
	 * Object describing the set of supported MPEG2 profiles and levels for this STB. It also describes the set of audio standards supported when MPEG2 Part 2 is used as the video standard.
	 */
	@XmlElement(name = "MPEG2Part2")
	public MPEG2Part2 mpeG2Part2;
	/**
	 * Object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 2 is used as the video standard.
	 */
	@XmlElement(name = "MPEG4Part2")
	public MPEG4Part2 mpeG4Part2;
	/**
	 * Object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 10 is used as the video standard.
	 */
	@XmlElement(name = "MPEG4Part10")
	public MPEG4Part10 mpeG4Part10;
	/**
	 * Object describing the set of supported SMPTE-VC-1 profiles and levels for this STB. It also describes the set of audio standards supported when SMPTE-VC-1 is used as the video standard.
	 */
	@XmlElement(name = "SMPTEVC1")
	public SMPTEVC1 smpTEVC1;

	public VideoDecoder() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the video standards supported by this STB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getVideoStandards() {
		if (this.videoStandards == null){ this.videoStandards=new ArrayList<>();}
		return videoStandards;
	}

	/**
	 * Set the video standards supported by this STB.
	 *
	 * @since 1.0
	 * @param videoStandards the input value
	 */
	public void  setVideoStandards(Collection<String> videoStandards) {
		this.videoStandards = videoStandards;
	}

	/**
	 * Set the video standards supported by this STB.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public VideoDecoder withVideoStandards(String string) {
		getVideoStandards().add(string);
		return this;
	}

	/**
	 * Get the object describing the set of supported MPEG2 profiles and levels for this STB. It also describes the set of audio standards supported when MPEG2 Part 2 is used as the video standard.
	 *
	 * @return the value
	 */
	public MPEG2Part2 getMpeG2Part2() {
		return mpeG2Part2;
	}

	/**
	 * Set the object describing the set of supported MPEG2 profiles and levels for this STB. It also describes the set of audio standards supported when MPEG2 Part 2 is used as the video standard.
	 *
	 * @param mpeG2Part2 the input value
	 */
	public void  setMpeG2Part2(MPEG2Part2 mpeG2Part2) {
		this.mpeG2Part2 = mpeG2Part2;
	}

	/**
	 * Set the object describing the set of supported MPEG2 profiles and levels for this STB. It also describes the set of audio standards supported when MPEG2 Part 2 is used as the video standard.
	 *
	 * @param mpeG2Part2 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG2Part2(MPEG2Part2 mpeG2Part2) {
		this.mpeG2Part2 = mpeG2Part2;
		return this;
	}

	/**
	 * Get the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 2 is used as the video standard.
	 *
	 * @return the value
	 */
	public MPEG4Part2 getMpeG4Part2() {
		return mpeG4Part2;
	}

	/**
	 * Set the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 2 is used as the video standard.
	 *
	 * @param mpeG4Part2 the input value
	 */
	public void  setMpeG4Part2(MPEG4Part2 mpeG4Part2) {
		this.mpeG4Part2 = mpeG4Part2;
	}

	/**
	 * Set the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 2 is used as the video standard.
	 *
	 * @param mpeG4Part2 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG4Part2(MPEG4Part2 mpeG4Part2) {
		this.mpeG4Part2 = mpeG4Part2;
		return this;
	}

	/**
	 * Get the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 10 is used as the video standard.
	 *
	 * @return the value
	 */
	public MPEG4Part10 getMpeG4Part10() {
		return mpeG4Part10;
	}

	/**
	 * Set the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 10 is used as the video standard.
	 *
	 * @param mpeG4Part10 the input value
	 */
	public void  setMpeG4Part10(MPEG4Part10 mpeG4Part10) {
		this.mpeG4Part10 = mpeG4Part10;
	}

	/**
	 * Set the object describing the set of supported profiles and levels for this STB. It also describes the set of audio standards supported when MPEG4 Part 10 is used as the video standard.
	 *
	 * @param mpeG4Part10 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG4Part10(MPEG4Part10 mpeG4Part10) {
		this.mpeG4Part10 = mpeG4Part10;
		return this;
	}

	/**
	 * Get the object describing the set of supported SMPTE-VC-1 profiles and levels for this STB. It also describes the set of audio standards supported when SMPTE-VC-1 is used as the video standard.
	 *
	 * @return the value
	 */
	public SMPTEVC1 getSmpTEVC1() {
		return smpTEVC1;
	}

	/**
	 * Set the object describing the set of supported SMPTE-VC-1 profiles and levels for this STB. It also describes the set of audio standards supported when SMPTE-VC-1 is used as the video standard.
	 *
	 * @param smpTEVC1 the input value
	 */
	public void  setSmpTEVC1(SMPTEVC1 smpTEVC1) {
		this.smpTEVC1 = smpTEVC1;
	}

	/**
	 * Set the object describing the set of supported SMPTE-VC-1 profiles and levels for this STB. It also describes the set of audio standards supported when SMPTE-VC-1 is used as the video standard.
	 *
	 * @param smpTEVC1 the input value
	 * @return this instance
	 */
	public VideoDecoder withSmpTEVC1(SMPTEVC1 smpTEVC1) {
		this.smpTEVC1 = smpTEVC1;
		return this;
	}

	//</editor-fold>

}