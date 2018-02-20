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
import org.broadbandforum.tr135.stbservice.avstreams.AVStream;

	/**
	 * AV Streams object.  If more than one AV stream can be active at a time, it may contain several {{object|AVStream}} instances.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.AVStreams.")
@XmlRootElement(name = "STBService.AVStreams")
@XmlType(name = "STBService.AVStreams")
@XmlAccessorType(XmlAccessType.FIELD)
public class AVStreams {

	/**
	 * Number of AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveAVStreams")
	public Long activeAVStreams;
	/**
	 * Details of each AVStream. AV streams are created statically. Each AV stream corresponds to a valid ''{FrontEnd, AudioDecoder, VideoDecoder}'' instance combination (although if the PVR is active for this stream, only ''{FrontEnd}'' or ''{AudioDecoder, VideoDecoder}'' will be in use).
	 */
	@XmlElementWrapper(name = "AVStreams")
	@XmlElement(name = "AVStream")
	public Collection<AVStream> avstreams;

	public AVStreams() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getActiveAVStreams() {
		return activeAVStreams;
	}

	/**
	 * Set the number of AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeAVStreams the input value
	 */
	public void  setActiveAVStreams(Long activeAVStreams) {
		this.activeAVStreams = activeAVStreams;
	}

	/**
	 * Set the number of AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeAVStreams the input value
	 * @return this instance
	 */
	public AVStreams withActiveAVStreams(Long activeAVStreams) {
		this.activeAVStreams = activeAVStreams;
		return this;
	}

	/**
	 * Get the details of each AVStream. AV streams are created statically. Each AV stream corresponds to a valid ''{FrontEnd, AudioDecoder, VideoDecoder}'' instance combination (although if the PVR is active for this stream, only ''{FrontEnd}'' or ''{AudioDecoder, VideoDecoder}'' will be in use).
	 *
	 * @return the value
	 */
	public Collection<AVStream> getAvstreams() {
		if (this.avstreams == null){ this.avstreams=new ArrayList<>();}
		return avstreams;
	}

	/**
	 * Set the details of each AVStream. AV streams are created statically. Each AV stream corresponds to a valid ''{FrontEnd, AudioDecoder, VideoDecoder}'' instance combination (although if the PVR is active for this stream, only ''{FrontEnd}'' or ''{AudioDecoder, VideoDecoder}'' will be in use).
	 *
	 * @param avstreams the input value
	 */
	public void  setAvstreams(Collection<AVStream> avstreams) {
		this.avstreams = avstreams;
	}

	/**
	 * Set the details of each AVStream. AV streams are created statically. Each AV stream corresponds to a valid ''{FrontEnd, AudioDecoder, VideoDecoder}'' instance combination (although if the PVR is active for this stream, only ''{FrontEnd}'' or ''{AudioDecoder, VideoDecoder}'' will be in use).
	 *
	 * @param avstream the input value
	 * @return this instance
	 */
	public AVStreams withAVStream(AVStream avstream) {
		getAvstreams().add(avstream);
		return this;
	}

	//</editor-fold>

}