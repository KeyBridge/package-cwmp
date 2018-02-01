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
package org.broadbandforum.tr135.stbservice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.capabilities.AudienceStats;
import org.broadbandforum.tr135.stbservice.capabilities.AudioDecoder;
import org.broadbandforum.tr135.stbservice.capabilities.AudioOutput;
import org.broadbandforum.tr135.stbservice.capabilities.CA;
import org.broadbandforum.tr135.stbservice.capabilities.CDS;
import org.broadbandforum.tr135.stbservice.capabilities.DRM;
import org.broadbandforum.tr135.stbservice.capabilities.FrontEnd;
import org.broadbandforum.tr135.stbservice.capabilities.HDMI;
import org.broadbandforum.tr135.stbservice.capabilities.PVR;
import org.broadbandforum.tr135.stbservice.capabilities.ServiceMonitoring;
import org.broadbandforum.tr135.stbservice.capabilities.VideoDecoder;
import org.broadbandforum.tr135.stbservice.capabilities.VideoOutput;

	/**
	 * The overall capabilities of the STB CPE.  This is a constant read-only object, meaning that only a firmware update will cause these values to be altered.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.")
public class Capabilities {

	/**
	 * Maximum number of simultaneously active AV streams supported by the STB.

A value of -1 indicates no specific limit on the number of active streams.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV streams, which is extremely unlikely.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveAVStreams")
	@Size(min = -1)
	public Integer maxActiveAVStreams;
	/**
	 * Maximum number of simultaneously active AV players supported by the STB.  An AV player is associated with a presentation device (such as a TV set).

Note that this is the strict maximum but, depending on the AV streams to be decoded, a given STB may not always have the resources to run all of these AV players, e.g. it might be able to decode one main picture and one PIP in standard definition, but just a main picture and no PIP in high definition.

A value of -1 indicates no specific limit on the number of active players.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV players, which is extremely unlikely.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveAVPlayers")
	@Size(min = -1)
	public Integer maxActiveAVPlayers;
	/**
	 * Front-end capabilities.
	 */
	@XmlElement(name = "FrontEnd")
	public FrontEnd frontEnd;
	/**
	 * PVR capabilities.
	 */
	@XmlElement(name = "PVR")
	public PVR pvr;
	/**
	 * Audio decoder capabilities.
	 */
	@XmlElement(name = "AudioDecoder")
	public AudioDecoder audioDecoder;
	/**
	 * Video decoder capabilities.
	 */
	@XmlElement(name = "VideoDecoder")
	public VideoDecoder videoDecoder;
	/**
	 * Audio output capabilities. The audio output stage may include selecting output formats, selecting output connectors, and copy protection.
	 */
	@XmlElement(name = "AudioOutput")
	public AudioOutput audioOutput;
	/**
	 * Video output capabilities. The video output stage may include selecting output formats, selecting output connectors, and copy protection.
	 */
	@XmlElement(name = "VideoOutput")
	public VideoOutput videoOutput;
	/**
	 * This object describes the characteristics of the HDMI interface, if any.
	 */
	@XmlElement(name = "HDMI")
	public HDMI hdmI;
	/**
	 * This object describes the characteristics of the Content Download System, if any.
	 */
	@XmlElement(name = "CDS")
	public CDS cds;
	/**
	 * This object describes the characteristics of the Conditional Access, if any.
	 */
	@XmlElement(name = "CA")
	public CA ca;
	/**
	 * This object describes the characteristics of the Digital Rights Management, if any.
	 */
	@XmlElement(name = "DRM")
	public DRM drm;
	/**
	 * This object describes the capabilities of the {{object|.ServiceMonitoring}} object.
	 */
	@XmlElement(name = "ServiceMonitoring")
	public ServiceMonitoring serviceMonitoring;
	/**
	 * This object describes the capabilities of the {{object|.Applications.AudienceStats}} object.
	 */
	@XmlElement(name = "AudienceStats")
	public AudienceStats audienceStats;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of simultaneously active AV streams supported by the STB.

A value of -1 indicates no specific limit on the number of active streams.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV streams, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveAVStreams() {
		return maxActiveAVStreams;
	}

	/**
	 * Set the maximum number of simultaneously active AV streams supported by the STB.

A value of -1 indicates no specific limit on the number of active streams.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV streams, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @param maxActiveAVStreams the input value
	 */
	public void  setMaxActiveAVStreams(Integer maxActiveAVStreams) {
		this.maxActiveAVStreams = maxActiveAVStreams;
	}

	/**
	 * Set the maximum number of simultaneously active AV streams supported by the STB.

A value of -1 indicates no specific limit on the number of active streams.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV streams, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @param maxActiveAVStreams the input value
	 * @return this instance
	 */
	public Capabilities withMaxActiveAVStreams(Integer maxActiveAVStreams) {
		this.maxActiveAVStreams = maxActiveAVStreams;
		return this;
	}

	/**
	 * Get the maximum number of simultaneously active AV players supported by the STB.  An AV player is associated with a presentation device (such as a TV set).

Note that this is the strict maximum but, depending on the AV streams to be decoded, a given STB may not always have the resources to run all of these AV players, e.g. it might be able to decode one main picture and one PIP in standard definition, but just a main picture and no PIP in high definition.

A value of -1 indicates no specific limit on the number of active players.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV players, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveAVPlayers() {
		return maxActiveAVPlayers;
	}

	/**
	 * Set the maximum number of simultaneously active AV players supported by the STB.  An AV player is associated with a presentation device (such as a TV set).

Note that this is the strict maximum but, depending on the AV streams to be decoded, a given STB may not always have the resources to run all of these AV players, e.g. it might be able to decode one main picture and one PIP in standard definition, but just a main picture and no PIP in high definition.

A value of -1 indicates no specific limit on the number of active players.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV players, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @param maxActiveAVPlayers the input value
	 */
	public void  setMaxActiveAVPlayers(Integer maxActiveAVPlayers) {
		this.maxActiveAVPlayers = maxActiveAVPlayers;
	}

	/**
	 * Set the maximum number of simultaneously active AV players supported by the STB.  An AV player is associated with a presentation device (such as a TV set).

Note that this is the strict maximum but, depending on the AV streams to be decoded, a given STB may not always have the resources to run all of these AV players, e.g. it might be able to decode one main picture and one PIP in standard definition, but just a main picture and no PIP in high definition.

A value of -1 indicates no specific limit on the number of active players.

A value of 0, while not strictly illegal, would indicate an STB that doesn't support AV players, which is extremely unlikely.
	 *
	 * @since 1.0
	 * @param maxActiveAVPlayers the input value
	 * @return this instance
	 */
	public Capabilities withMaxActiveAVPlayers(Integer maxActiveAVPlayers) {
		this.maxActiveAVPlayers = maxActiveAVPlayers;
		return this;
	}

	/**
	 * Get the front-end capabilities.
	 *
	 * @return the value
	 */
	public FrontEnd getFrontEnd() {
		return frontEnd;
	}

	/**
	 * Set the front-end capabilities.
	 *
	 * @param frontEnd the input value
	 */
	public void  setFrontEnd(FrontEnd frontEnd) {
		this.frontEnd = frontEnd;
	}

	/**
	 * Set the front-end capabilities.
	 *
	 * @param frontEnd the input value
	 * @return this instance
	 */
	public Capabilities withFrontEnd(FrontEnd frontEnd) {
		this.frontEnd = frontEnd;
		return this;
	}

	/**
	 * Get the pvr capabilities.
	 *
	 * @return the value
	 */
	public PVR getPvr() {
		return pvr;
	}

	/**
	 * Set the pvr capabilities.
	 *
	 * @param pvr the input value
	 */
	public void  setPvr(PVR pvr) {
		this.pvr = pvr;
	}

	/**
	 * Set the pvr capabilities.
	 *
	 * @param pvr the input value
	 * @return this instance
	 */
	public Capabilities withPvr(PVR pvr) {
		this.pvr = pvr;
		return this;
	}

	/**
	 * Get audio decoder capabilities.
	 *
	 * @return the value
	 */
	public AudioDecoder getAudioDecoder() {
		return audioDecoder;
	}

	/**
	 * Set audio decoder capabilities.
	 *
	 * @param audioDecoder the input value
	 */
	public void  setAudioDecoder(AudioDecoder audioDecoder) {
		this.audioDecoder = audioDecoder;
	}

	/**
	 * Set audio decoder capabilities.
	 *
	 * @param audioDecoder the input value
	 * @return this instance
	 */
	public Capabilities withAudioDecoder(AudioDecoder audioDecoder) {
		this.audioDecoder = audioDecoder;
		return this;
	}

	/**
	 * Get the video decoder capabilities.
	 *
	 * @return the value
	 */
	public VideoDecoder getVideoDecoder() {
		return videoDecoder;
	}

	/**
	 * Set the video decoder capabilities.
	 *
	 * @param videoDecoder the input value
	 */
	public void  setVideoDecoder(VideoDecoder videoDecoder) {
		this.videoDecoder = videoDecoder;
	}

	/**
	 * Set the video decoder capabilities.
	 *
	 * @param videoDecoder the input value
	 * @return this instance
	 */
	public Capabilities withVideoDecoder(VideoDecoder videoDecoder) {
		this.videoDecoder = videoDecoder;
		return this;
	}

	/**
	 * Get audio output capabilities. The audio output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @return the value
	 */
	public AudioOutput getAudioOutput() {
		return audioOutput;
	}

	/**
	 * Set audio output capabilities. The audio output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @param audioOutput the input value
	 */
	public void  setAudioOutput(AudioOutput audioOutput) {
		this.audioOutput = audioOutput;
	}

	/**
	 * Set audio output capabilities. The audio output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @param audioOutput the input value
	 * @return this instance
	 */
	public Capabilities withAudioOutput(AudioOutput audioOutput) {
		this.audioOutput = audioOutput;
		return this;
	}

	/**
	 * Get the video output capabilities. The video output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @return the value
	 */
	public VideoOutput getVideoOutput() {
		return videoOutput;
	}

	/**
	 * Set the video output capabilities. The video output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @param videoOutput the input value
	 */
	public void  setVideoOutput(VideoOutput videoOutput) {
		this.videoOutput = videoOutput;
	}

	/**
	 * Set the video output capabilities. The video output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @param videoOutput the input value
	 * @return this instance
	 */
	public Capabilities withVideoOutput(VideoOutput videoOutput) {
		this.videoOutput = videoOutput;
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the HDMI interface, if any.
	 *
	 * @return the value
	 */
	public HDMI getHdmI() {
		return hdmI;
	}

	/**
	 * Set the this object describes the characteristics of the HDMI interface, if any.
	 *
	 * @param hdmI the input value
	 */
	public void  setHdmI(HDMI hdmI) {
		this.hdmI = hdmI;
	}

	/**
	 * Set the this object describes the characteristics of the HDMI interface, if any.
	 *
	 * @param hdmI the input value
	 * @return this instance
	 */
	public Capabilities withHdmI(HDMI hdmI) {
		this.hdmI = hdmI;
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the Content Download System, if any.
	 *
	 * @return the value
	 */
	public CDS getCds() {
		return cds;
	}

	/**
	 * Set the this object describes the characteristics of the Content Download System, if any.
	 *
	 * @param cds the input value
	 */
	public void  setCds(CDS cds) {
		this.cds = cds;
	}

	/**
	 * Set the this object describes the characteristics of the Content Download System, if any.
	 *
	 * @param cds the input value
	 * @return this instance
	 */
	public Capabilities withCds(CDS cds) {
		this.cds = cds;
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @return the value
	 */
	public CA getCa() {
		return ca;
	}

	/**
	 * Set the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @param ca the input value
	 */
	public void  setCa(CA ca) {
		this.ca = ca;
	}

	/**
	 * Set the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @param ca the input value
	 * @return this instance
	 */
	public Capabilities withCa(CA ca) {
		this.ca = ca;
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @return the value
	 */
	public DRM getDrm() {
		return drm;
	}

	/**
	 * Set the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @param drm the input value
	 */
	public void  setDrm(DRM drm) {
		this.drm = drm;
	}

	/**
	 * Set the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @param drm the input value
	 * @return this instance
	 */
	public Capabilities withDrm(DRM drm) {
		this.drm = drm;
		return this;
	}

	/**
	 * Get the this object describes the capabilities of the {{object|.ServiceMonitoring}} object.
	 *
	 * @return the value
	 */
	public ServiceMonitoring getServiceMonitoring() {
		return serviceMonitoring;
	}

	/**
	 * Set the this object describes the capabilities of the {{object|.ServiceMonitoring}} object.
	 *
	 * @param serviceMonitoring the input value
	 */
	public void  setServiceMonitoring(ServiceMonitoring serviceMonitoring) {
		this.serviceMonitoring = serviceMonitoring;
	}

	/**
	 * Set the this object describes the capabilities of the {{object|.ServiceMonitoring}} object.
	 *
	 * @param serviceMonitoring the input value
	 * @return this instance
	 */
	public Capabilities withServiceMonitoring(ServiceMonitoring serviceMonitoring) {
		this.serviceMonitoring = serviceMonitoring;
		return this;
	}

	/**
	 * Get the this object describes the capabilities of the {{object|.Applications.AudienceStats}} object.
	 *
	 * @return the value
	 */
	public AudienceStats getAudienceStats() {
		return audienceStats;
	}

	/**
	 * Set the this object describes the capabilities of the {{object|.Applications.AudienceStats}} object.
	 *
	 * @param audienceStats the input value
	 */
	public void  setAudienceStats(AudienceStats audienceStats) {
		this.audienceStats = audienceStats;
	}

	/**
	 * Set the this object describes the capabilities of the {{object|.Applications.AudienceStats}} object.
	 *
	 * @param audienceStats the input value
	 * @return this instance
	 */
	public Capabilities withAudienceStats(AudienceStats audienceStats) {
		this.audienceStats = audienceStats;
		return this;
	}

	//</editor-fold>

}