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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.components.AudioDecoder;
import org.broadbandforum.tr135.stbservice.components.AudioOutput;
import org.broadbandforum.tr135.stbservice.components.CA;
import org.broadbandforum.tr135.stbservice.components.DRM;
import org.broadbandforum.tr135.stbservice.components.FrontEnd;
import org.broadbandforum.tr135.stbservice.components.HDMI;
import org.broadbandforum.tr135.stbservice.components.PVR;
import org.broadbandforum.tr135.stbservice.components.SCART;
import org.broadbandforum.tr135.stbservice.components.SPDIF;
import org.broadbandforum.tr135.stbservice.components.VideoDecoder;
import org.broadbandforum.tr135.stbservice.components.VideoOutput;

	/**
	 * Details of STB logical or physical internal components. Unlike the {{object|.Capabilities}} object, which is read-only and which doesn't describe individual instances, this object contains some writeable parameters.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.")
@XmlRootElement(name = "Components")
@XmlType(name = "STBService.Components")
@XmlAccessorType(XmlAccessType.FIELD)
public class Components {

	/**
	 * FrontEnd instance table. Each front-end instance, including vendor-specific front-end types, will normally have a sub-object that corresponds to the front-end type (e.g. DVB-T or IP).
	 */
	@XmlElementWrapper(name = "FrontEnds")
	@XmlElement(name = "FrontEnd")
	public Collection<FrontEnd> frontEnds;
	/**
	 * PVR details.  This is a read-only object that exists only to reference PVR storage objects.
	 */
	@XmlElement(name = "PVR")
	public PVR pvr;
	/**
	 * Audio decoder instance table. It contains data representing the current status of the Audio decoder.
	 */
	@XmlElementWrapper(name = "AudioDecoders")
	@XmlElement(name = "AudioDecoder")
	public Collection<AudioDecoder> audioDecoders;
	/**
	 * Video decoder instance table. It contains data representing the current status of the video decoder.
	 */
	@XmlElementWrapper(name = "VideoDecoders")
	@XmlElement(name = "VideoDecoder")
	public Collection<VideoDecoder> videoDecoders;
	/**
	 * Audio output instance table.
	 */
	@XmlElementWrapper(name = "AudioOutputs")
	@XmlElement(name = "AudioOutput")
	public Collection<AudioOutput> audioOutputs;
	/**
	 * S/PDIF output instance table configuration. This object, if present, is connected to the audio ouput instance currently delivering S/PDIF audio format as described in {{bibref|SPDIF}}.
	 */
	@XmlElementWrapper(name = "SPDIFs")
	@XmlElement(name = "SPDIF")
	public Collection<SPDIF> spdIFs;
	/**
	 * Video output instance table.
	 */
	@XmlElementWrapper(name = "VideoOutputs")
	@XmlElement(name = "VideoOutput")
	public Collection<VideoOutput> videoOutputs;
	/**
	 * SCART configuration. This object allows configuration of the STB's AV switching.
	 */
	@XmlElementWrapper(name = "SCARTs")
	@XmlElement(name = "SCART")
	public Collection<SCART> scaRTs;
	/**
	 * HDMI instance table. This object allows configuration of the STB’s HDMI output.
	 */
	@XmlElementWrapper(name = "HDMIs")
	@XmlElement(name = "HDMI")
	public Collection<HDMI> hdmIs;
	/**
	 * This object describes the characteristics of the Conditional Access, if any.
	 */
	@XmlElementWrapper(name = "CAs")
	@XmlElement(name = "CA")
	public Collection<CA> cas;
	/**
	 * This object describes the characteristics of the Digital Rights Management, if any.
	 */
	@XmlElementWrapper(name = "DRMs")
	@XmlElement(name = "DRM")
	public Collection<DRM> drms;

	public Components() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the frontEnd instance table. Each front-end instance, including vendor-specific front-end types, will normally have a sub-object that corresponds to the front-end type (e.g. DVB-T or IP).
	 *
	 * @return the value
	 */
	public Collection<FrontEnd> getFrontEnds() {
		if (this.frontEnds == null){ this.frontEnds=new ArrayList<>();}
		return frontEnds;
	}

	/**
	 * Set the frontEnd instance table. Each front-end instance, including vendor-specific front-end types, will normally have a sub-object that corresponds to the front-end type (e.g. DVB-T or IP).
	 *
	 * @param frontEnds the input value
	 */
	public void  setFrontEnds(Collection<FrontEnd> frontEnds) {
		this.frontEnds = frontEnds;
	}

	/**
	 * Set the frontEnd instance table. Each front-end instance, including vendor-specific front-end types, will normally have a sub-object that corresponds to the front-end type (e.g. DVB-T or IP).
	 *
	 * @param frontEnd the input value
	 * @return this instance
	 */
	public Components withFrontEnd(FrontEnd frontEnd) {
		getFrontEnds().add(frontEnd);
		return this;
	}

	/**
	 * Get the pvr details.  This is a read-only object that exists only to reference PVR storage objects.
	 *
	 * @return the value
	 */
	public PVR getPvr() {
		return pvr;
	}

	/**
	 * Set the pvr details.  This is a read-only object that exists only to reference PVR storage objects.
	 *
	 * @param pvr the input value
	 */
	public void  setPvr(PVR pvr) {
		this.pvr = pvr;
	}

	/**
	 * Set the pvr details.  This is a read-only object that exists only to reference PVR storage objects.
	 *
	 * @param pvr the input value
	 * @return this instance
	 */
	public Components withPvr(PVR pvr) {
		this.pvr = pvr;
		return this;
	}

	/**
	 * Get audio decoder instance table. It contains data representing the current status of the Audio decoder.
	 *
	 * @return the value
	 */
	public Collection<AudioDecoder> getAudioDecoders() {
		if (this.audioDecoders == null){ this.audioDecoders=new ArrayList<>();}
		return audioDecoders;
	}

	/**
	 * Set audio decoder instance table. It contains data representing the current status of the Audio decoder.
	 *
	 * @param audioDecoders the input value
	 */
	public void  setAudioDecoders(Collection<AudioDecoder> audioDecoders) {
		this.audioDecoders = audioDecoders;
	}

	/**
	 * Set audio decoder instance table. It contains data representing the current status of the Audio decoder.
	 *
	 * @param audioDecoder the input value
	 * @return this instance
	 */
	public Components withAudioDecoder(AudioDecoder audioDecoder) {
		getAudioDecoders().add(audioDecoder);
		return this;
	}

	/**
	 * Get the video decoder instance table. It contains data representing the current status of the video decoder.
	 *
	 * @return the value
	 */
	public Collection<VideoDecoder> getVideoDecoders() {
		if (this.videoDecoders == null){ this.videoDecoders=new ArrayList<>();}
		return videoDecoders;
	}

	/**
	 * Set the video decoder instance table. It contains data representing the current status of the video decoder.
	 *
	 * @param videoDecoders the input value
	 */
	public void  setVideoDecoders(Collection<VideoDecoder> videoDecoders) {
		this.videoDecoders = videoDecoders;
	}

	/**
	 * Set the video decoder instance table. It contains data representing the current status of the video decoder.
	 *
	 * @param videoDecoder the input value
	 * @return this instance
	 */
	public Components withVideoDecoder(VideoDecoder videoDecoder) {
		getVideoDecoders().add(videoDecoder);
		return this;
	}

	/**
	 * Get audio output instance table.
	 *
	 * @return the value
	 */
	public Collection<AudioOutput> getAudioOutputs() {
		if (this.audioOutputs == null){ this.audioOutputs=new ArrayList<>();}
		return audioOutputs;
	}

	/**
	 * Set audio output instance table.
	 *
	 * @param audioOutputs the input value
	 */
	public void  setAudioOutputs(Collection<AudioOutput> audioOutputs) {
		this.audioOutputs = audioOutputs;
	}

	/**
	 * Set audio output instance table.
	 *
	 * @param audioOutput the input value
	 * @return this instance
	 */
	public Components withAudioOutput(AudioOutput audioOutput) {
		getAudioOutputs().add(audioOutput);
		return this;
	}

	/**
	 * Get the s/pDIF output instance table configuration. This object, if present, is connected to the audio ouput instance currently delivering S/PDIF audio format as described in {{bibref|SPDIF}}.
	 *
	 * @return the value
	 */
	public Collection<SPDIF> getSpdIFs() {
		if (this.spdIFs == null){ this.spdIFs=new ArrayList<>();}
		return spdIFs;
	}

	/**
	 * Set the s/pDIF output instance table configuration. This object, if present, is connected to the audio ouput instance currently delivering S/PDIF audio format as described in {{bibref|SPDIF}}.
	 *
	 * @param spdIFs the input value
	 */
	public void  setSpdIFs(Collection<SPDIF> spdIFs) {
		this.spdIFs = spdIFs;
	}

	/**
	 * Set the s/pDIF output instance table configuration. This object, if present, is connected to the audio ouput instance currently delivering S/PDIF audio format as described in {{bibref|SPDIF}}.
	 *
	 * @param spdIF the input value
	 * @return this instance
	 */
	public Components withSPDIF(SPDIF spdIF) {
		getSpdIFs().add(spdIF);
		return this;
	}

	/**
	 * Get the video output instance table.
	 *
	 * @return the value
	 */
	public Collection<VideoOutput> getVideoOutputs() {
		if (this.videoOutputs == null){ this.videoOutputs=new ArrayList<>();}
		return videoOutputs;
	}

	/**
	 * Set the video output instance table.
	 *
	 * @param videoOutputs the input value
	 */
	public void  setVideoOutputs(Collection<VideoOutput> videoOutputs) {
		this.videoOutputs = videoOutputs;
	}

	/**
	 * Set the video output instance table.
	 *
	 * @param videoOutput the input value
	 * @return this instance
	 */
	public Components withVideoOutput(VideoOutput videoOutput) {
		getVideoOutputs().add(videoOutput);
		return this;
	}

	/**
	 * Get the scaRT configuration. This object allows configuration of the STB's AV switching.
	 *
	 * @return the value
	 */
	public Collection<SCART> getScaRTs() {
		if (this.scaRTs == null){ this.scaRTs=new ArrayList<>();}
		return scaRTs;
	}

	/**
	 * Set the scaRT configuration. This object allows configuration of the STB's AV switching.
	 *
	 * @param scaRTs the input value
	 */
	public void  setScaRTs(Collection<SCART> scaRTs) {
		this.scaRTs = scaRTs;
	}

	/**
	 * Set the scaRT configuration. This object allows configuration of the STB's AV switching.
	 *
	 * @param scaRT the input value
	 * @return this instance
	 */
	public Components withSCART(SCART scaRT) {
		getScaRTs().add(scaRT);
		return this;
	}

	/**
	 * Get the hdmI instance table. This object allows configuration of the STB’s HDMI output.
	 *
	 * @return the value
	 */
	public Collection<HDMI> getHdmIs() {
		if (this.hdmIs == null){ this.hdmIs=new ArrayList<>();}
		return hdmIs;
	}

	/**
	 * Set the hdmI instance table. This object allows configuration of the STB’s HDMI output.
	 *
	 * @param hdmIs the input value
	 */
	public void  setHdmIs(Collection<HDMI> hdmIs) {
		this.hdmIs = hdmIs;
	}

	/**
	 * Set the hdmI instance table. This object allows configuration of the STB’s HDMI output.
	 *
	 * @param hdmI the input value
	 * @return this instance
	 */
	public Components withHDMI(HDMI hdmI) {
		getHdmIs().add(hdmI);
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @return the value
	 */
	public Collection<CA> getCas() {
		if (this.cas == null){ this.cas=new ArrayList<>();}
		return cas;
	}

	/**
	 * Set the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @param cas the input value
	 */
	public void  setCas(Collection<CA> cas) {
		this.cas = cas;
	}

	/**
	 * Set the this object describes the characteristics of the Conditional Access, if any.
	 *
	 * @param ca the input value
	 * @return this instance
	 */
	public Components withCA(CA ca) {
		getCas().add(ca);
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @return the value
	 */
	public Collection<DRM> getDrms() {
		if (this.drms == null){ this.drms=new ArrayList<>();}
		return drms;
	}

	/**
	 * Set the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @param drms the input value
	 */
	public void  setDrms(Collection<DRM> drms) {
		this.drms = drms;
	}

	/**
	 * Set the this object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @param drm the input value
	 * @return this instance
	 */
	public Components withDRM(DRM drm) {
		getDrms().add(drm);
		return this;
	}

	//</editor-fold>

}