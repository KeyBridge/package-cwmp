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
package org.broadbandforum.tr135.stbservice.avstreams;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Details of each AVStream. AV streams are created statically. Each AV stream corresponds to a valid ''{FrontEnd, AudioDecoder, VideoDecoder}'' instance combination (although if the PVR is active for this stream, only ''{FrontEnd}'' or ''{AudioDecoder, VideoDecoder}'' will be in use).
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.AVStreams.AVStream.{i}.")
public class AVStream {

	/**
	 * The status of this AV stream.  {{enum}}

An AV stream is disabled if any of the referenced objects are disabled.

If an AV stream is disabled then the values of other AV stream parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this stream, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Indicates whether this stream is using the PVR and, if so, the PVR state.  {{enum}}

PVR record state can be inferred from whether the stream has an input FrontEnd: if so and {{param}} is not {{enum|Disabled}}, the PVR is recording.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PVRState")
	public String pvrState;
	/**
	 * Input FrontEnd object instance associated with this AV stream, or {{empty}} if not associated with a FrontEnd object).  For example:

''.Components.FrontEnd.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FrontEnd")
	@Size(max = 256)
	public String frontEnd;
	/**
	 * Inbound IP stream object instance associated with the FrontEnd for this AV stream, or {{empty}} if the inbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Inbound.3''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Inbound")
	@Size(max = 256)
	public String inbound;
	/**
	 * Outbound IP stream object instance associated with the output FrontEnd for this AV stream (which is always the IP FrontEnd), or {{empty}} if the outbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Outbound.3''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Outbound")
	@Size(max = 256)
	public String outbound;
	/**
	 * Audio Decoder object instance associated with this AV stream, or {{empty}} if not associated with an Audio Decoder object.  For example:

''.Components.AudioDecoder.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioDecoder")
	@Size(max = 256)
	public String audioDecoder;
	/**
	 * Video Decoder object instance associated with this AV stream, or {{empty}} if not associated with a Video Decoder object.  For example:

''.Components.VideoDecoder.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VideoDecoder")
	@Size(max = 256)
	public String videoDecoder;
	/**
	 * CA system object instance associated with this AV stream, or {{empty}} if not associated with a CA object.  For example:

''.Components.CA.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CA")
	@Size(max = 256)
	public String ca;
	/**
	 * DRM system object instance associated with this AV stream, or {{empty}} if not associated with a DRM object.  For example:

''.Components.DRM.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DRM")
	@Size(max = 256)
	public String drm;

	public AVStream() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this AV stream.  {{enum}}

An AV stream is disabled if any of the referenced objects are disabled.

If an AV stream is disabled then the values of other AV stream parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this AV stream.  {{enum}}

An AV stream is disabled if any of the referenced objects are disabled.

If an AV stream is disabled then the values of other AV stream parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this AV stream.  {{enum}}

An AV stream is disabled if any of the referenced objects are disabled.

If an AV stream is disabled then the values of other AV stream parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public AVStream withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public AVStream withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this stream, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this stream, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this stream, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public AVStream withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the indicates whether this stream is using the PVR and, if so, the PVR state.  {{enum}}

PVR record state can be inferred from whether the stream has an input FrontEnd: if so and {{param}} is not {{enum|Disabled}}, the PVR is recording.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPvrState() {
		return pvrState;
	}

	/**
	 * Set the indicates whether this stream is using the PVR and, if so, the PVR state.  {{enum}}

PVR record state can be inferred from whether the stream has an input FrontEnd: if so and {{param}} is not {{enum|Disabled}}, the PVR is recording.
	 *
	 * @since 1.0
	 * @param pvrState the input value
	 */
	public void  setPvrState(String pvrState) {
		this.pvrState = pvrState;
	}

	/**
	 * Set the indicates whether this stream is using the PVR and, if so, the PVR state.  {{enum}}

PVR record state can be inferred from whether the stream has an input FrontEnd: if so and {{param}} is not {{enum|Disabled}}, the PVR is recording.
	 *
	 * @since 1.0
	 * @param pvrState the input value
	 * @return this instance
	 */
	public AVStream withPvrState(String pvrState) {
		this.pvrState = pvrState;
		return this;
	}

	/**
	 * Get the input FrontEnd object instance associated with this AV stream, or {{empty}} if not associated with a FrontEnd object).  For example:

''.Components.FrontEnd.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getFrontEnd() {
		return frontEnd;
	}

	/**
	 * Set the input FrontEnd object instance associated with this AV stream, or {{empty}} if not associated with a FrontEnd object).  For example:

''.Components.FrontEnd.2''
	 *
	 * @since 1.0
	 * @param frontEnd the input value
	 */
	public void  setFrontEnd(String frontEnd) {
		this.frontEnd = frontEnd;
	}

	/**
	 * Set the input FrontEnd object instance associated with this AV stream, or {{empty}} if not associated with a FrontEnd object).  For example:

''.Components.FrontEnd.2''
	 *
	 * @since 1.0
	 * @param frontEnd the input value
	 * @return this instance
	 */
	public AVStream withFrontEnd(String frontEnd) {
		this.frontEnd = frontEnd;
		return this;
	}

	/**
	 * Get the inbound IP stream object instance associated with the FrontEnd for this AV stream, or {{empty}} if the inbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Inbound.3''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getInbound() {
		return inbound;
	}

	/**
	 * Set the inbound IP stream object instance associated with the FrontEnd for this AV stream, or {{empty}} if the inbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Inbound.3''
	 *
	 * @since 1.0
	 * @param inbound the input value
	 */
	public void  setInbound(String inbound) {
		this.inbound = inbound;
	}

	/**
	 * Set the inbound IP stream object instance associated with the FrontEnd for this AV stream, or {{empty}} if the inbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Inbound.3''
	 *
	 * @since 1.0
	 * @param inbound the input value
	 * @return this instance
	 */
	public AVStream withInbound(String inbound) {
		this.inbound = inbound;
		return this;
	}

	/**
	 * Get the outbound IP stream object instance associated with the output FrontEnd for this AV stream (which is always the IP FrontEnd), or {{empty}} if the outbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Outbound.3''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getOutbound() {
		return outbound;
	}

	/**
	 * Set the outbound IP stream object instance associated with the output FrontEnd for this AV stream (which is always the IP FrontEnd), or {{empty}} if the outbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Outbound.3''
	 *
	 * @since 1.0
	 * @param outbound the input value
	 */
	public void  setOutbound(String outbound) {
		this.outbound = outbound;
	}

	/**
	 * Set the outbound IP stream object instance associated with the output FrontEnd for this AV stream (which is always the IP FrontEnd), or {{empty}} if the outbound stream is not delivered over IP.  For example:

''.Components.FrontEnd.2.IP.Outbound.3''
	 *
	 * @since 1.0
	 * @param outbound the input value
	 * @return this instance
	 */
	public AVStream withOutbound(String outbound) {
		this.outbound = outbound;
		return this;
	}

	/**
	 * Get audio Decoder object instance associated with this AV stream, or {{empty}} if not associated with an Audio Decoder object.  For example:

''.Components.AudioDecoder.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAudioDecoder() {
		return audioDecoder;
	}

	/**
	 * Set audio Decoder object instance associated with this AV stream, or {{empty}} if not associated with an Audio Decoder object.  For example:

''.Components.AudioDecoder.2''
	 *
	 * @since 1.0
	 * @param audioDecoder the input value
	 */
	public void  setAudioDecoder(String audioDecoder) {
		this.audioDecoder = audioDecoder;
	}

	/**
	 * Set audio Decoder object instance associated with this AV stream, or {{empty}} if not associated with an Audio Decoder object.  For example:

''.Components.AudioDecoder.2''
	 *
	 * @since 1.0
	 * @param audioDecoder the input value
	 * @return this instance
	 */
	public AVStream withAudioDecoder(String audioDecoder) {
		this.audioDecoder = audioDecoder;
		return this;
	}

	/**
	 * Get the video Decoder object instance associated with this AV stream, or {{empty}} if not associated with a Video Decoder object.  For example:

''.Components.VideoDecoder.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getVideoDecoder() {
		return videoDecoder;
	}

	/**
	 * Set the video Decoder object instance associated with this AV stream, or {{empty}} if not associated with a Video Decoder object.  For example:

''.Components.VideoDecoder.2''
	 *
	 * @since 1.0
	 * @param videoDecoder the input value
	 */
	public void  setVideoDecoder(String videoDecoder) {
		this.videoDecoder = videoDecoder;
	}

	/**
	 * Set the video Decoder object instance associated with this AV stream, or {{empty}} if not associated with a Video Decoder object.  For example:

''.Components.VideoDecoder.2''
	 *
	 * @since 1.0
	 * @param videoDecoder the input value
	 * @return this instance
	 */
	public AVStream withVideoDecoder(String videoDecoder) {
		this.videoDecoder = videoDecoder;
		return this;
	}

	/**
	 * Get the ca system object instance associated with this AV stream, or {{empty}} if not associated with a CA object.  For example:

''.Components.CA.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getCa() {
		return ca;
	}

	/**
	 * Set the ca system object instance associated with this AV stream, or {{empty}} if not associated with a CA object.  For example:

''.Components.CA.2''
	 *
	 * @since 1.0
	 * @param ca the input value
	 */
	public void  setCa(String ca) {
		this.ca = ca;
	}

	/**
	 * Set the ca system object instance associated with this AV stream, or {{empty}} if not associated with a CA object.  For example:

''.Components.CA.2''
	 *
	 * @since 1.0
	 * @param ca the input value
	 * @return this instance
	 */
	public AVStream withCa(String ca) {
		this.ca = ca;
		return this;
	}

	/**
	 * Get the drm system object instance associated with this AV stream, or {{empty}} if not associated with a DRM object.  For example:

''.Components.DRM.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDrm() {
		return drm;
	}

	/**
	 * Set the drm system object instance associated with this AV stream, or {{empty}} if not associated with a DRM object.  For example:

''.Components.DRM.2''
	 *
	 * @since 1.0
	 * @param drm the input value
	 */
	public void  setDrm(String drm) {
		this.drm = drm;
	}

	/**
	 * Set the drm system object instance associated with this AV stream, or {{empty}} if not associated with a DRM object.  For example:

''.Components.DRM.2''
	 *
	 * @since 1.0
	 * @param drm the input value
	 * @return this instance
	 */
	public AVStream withDrm(String drm) {
		this.drm = drm;
		return this;
	}

	//</editor-fold>

}