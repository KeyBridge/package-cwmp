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
package org.broadbandforum.tr135.stbservice.capabilities.frontend;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * IP front-end capabilities.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.FrontEnd.IP.")
public class IP {

	/**
	 * Maximum number of simultaneous active AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveIPStreams")
	@Size(min = -1)
	public Integer maxActiveIPStreams;
	/**
	 * Maximum number of simultaneous active Inbound AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveInboundIPStreams")
	@Size(min = -1)
	public Integer maxActiveInboundIPStreams;
	/**
	 * Maximum number of simultaneous active Outbound AV streams supported by the IP FrontEnd. 

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveOutboundIPStreams")
	@Size(min = -1)
	public Integer maxActiveOutboundIPStreams;
	/**
	 * Supported streaming control protocols.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingControlProtocols")
	@XmlList
	public Collection<String> streamingControlProtocols;
	/**
	 * Network protocols supported for AV streaming.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingTransportProtocols")
	@XmlList
	public Collection<String> streamingTransportProtocols;
	/**
	 * Transport control protocols supported for AV streaming in combination with RTP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingTransportControlProtocols")
	@XmlList
	public Collection<String> streamingTransportControlProtocols;
	/**
	 * Network protocols supported for AV download.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownloadTransportProtocols")
	@XmlList
	public Collection<String> downloadTransportProtocols;
	/**
	 * AV multiplex types supported by the front end.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MultiplexTypes")
	@XmlList
	public Collection<String> multiplexTypes;
	/**
	 * Describes the maximum de-jittering buffer size, in bytes, supported by the STB.

A value of -1 indicates no specific limit on the buffer size.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxDejitteringBufferSize")
	@Size(min = -1)
	public Integer maxDejitteringBufferSize;

	public IP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of simultaneous active AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveIPStreams() {
		return maxActiveIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveIPStreams the input value
	 */
	public void  setMaxActiveIPStreams(Integer maxActiveIPStreams) {
		this.maxActiveIPStreams = maxActiveIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveIPStreams the input value
	 * @return this instance
	 */
	public IP withMaxActiveIPStreams(Integer maxActiveIPStreams) {
		this.maxActiveIPStreams = maxActiveIPStreams;
		return this;
	}

	/**
	 * Get the maximum number of simultaneous active Inbound AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveInboundIPStreams() {
		return maxActiveInboundIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active Inbound AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveInboundIPStreams the input value
	 */
	public void  setMaxActiveInboundIPStreams(Integer maxActiveInboundIPStreams) {
		this.maxActiveInboundIPStreams = maxActiveInboundIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active Inbound AV streams supported by the IP FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveInboundIPStreams the input value
	 * @return this instance
	 */
	public IP withMaxActiveInboundIPStreams(Integer maxActiveInboundIPStreams) {
		this.maxActiveInboundIPStreams = maxActiveInboundIPStreams;
		return this;
	}

	/**
	 * Get the maximum number of simultaneous active Outbound AV streams supported by the IP FrontEnd. 

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveOutboundIPStreams() {
		return maxActiveOutboundIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active Outbound AV streams supported by the IP FrontEnd. 

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveOutboundIPStreams the input value
	 */
	public void  setMaxActiveOutboundIPStreams(Integer maxActiveOutboundIPStreams) {
		this.maxActiveOutboundIPStreams = maxActiveOutboundIPStreams;
	}

	/**
	 * Set the maximum number of simultaneous active Outbound AV streams supported by the IP FrontEnd. 

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveOutboundIPStreams the input value
	 * @return this instance
	 */
	public IP withMaxActiveOutboundIPStreams(Integer maxActiveOutboundIPStreams) {
		this.maxActiveOutboundIPStreams = maxActiveOutboundIPStreams;
		return this;
	}

	/**
	 * Get the supported streaming control protocols.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getStreamingControlProtocols() {
		if (this.streamingControlProtocols == null){ this.streamingControlProtocols=new ArrayList<>();}
		return streamingControlProtocols;
	}

	/**
	 * Set the supported streaming control protocols.
	 *
	 * @since 1.0
	 * @param streamingControlProtocols the input value
	 */
	public void  setStreamingControlProtocols(Collection<String> streamingControlProtocols) {
		this.streamingControlProtocols = streamingControlProtocols;
	}

	/**
	 * Set the supported streaming control protocols.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public IP withStreamingControlProtocols(String string) {
		getStreamingControlProtocols().add(string);
		return this;
	}

	/**
	 * Get the network protocols supported for AV streaming.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getStreamingTransportProtocols() {
		if (this.streamingTransportProtocols == null){ this.streamingTransportProtocols=new ArrayList<>();}
		return streamingTransportProtocols;
	}

	/**
	 * Set the network protocols supported for AV streaming.
	 *
	 * @since 1.0
	 * @param streamingTransportProtocols the input value
	 */
	public void  setStreamingTransportProtocols(Collection<String> streamingTransportProtocols) {
		this.streamingTransportProtocols = streamingTransportProtocols;
	}

	/**
	 * Set the network protocols supported for AV streaming.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public IP withStreamingTransportProtocols(String string) {
		getStreamingTransportProtocols().add(string);
		return this;
	}

	/**
	 * Get the transport control protocols supported for AV streaming in combination with RTP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getStreamingTransportControlProtocols() {
		if (this.streamingTransportControlProtocols == null){ this.streamingTransportControlProtocols=new ArrayList<>();}
		return streamingTransportControlProtocols;
	}

	/**
	 * Set the transport control protocols supported for AV streaming in combination with RTP.
	 *
	 * @since 1.0
	 * @param streamingTransportControlProtocols the input value
	 */
	public void  setStreamingTransportControlProtocols(Collection<String> streamingTransportControlProtocols) {
		this.streamingTransportControlProtocols = streamingTransportControlProtocols;
	}

	/**
	 * Set the transport control protocols supported for AV streaming in combination with RTP.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public IP withStreamingTransportControlProtocols(String string) {
		getStreamingTransportControlProtocols().add(string);
		return this;
	}

	/**
	 * Get the network protocols supported for AV download.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getDownloadTransportProtocols() {
		if (this.downloadTransportProtocols == null){ this.downloadTransportProtocols=new ArrayList<>();}
		return downloadTransportProtocols;
	}

	/**
	 * Set the network protocols supported for AV download.
	 *
	 * @since 1.0
	 * @param downloadTransportProtocols the input value
	 */
	public void  setDownloadTransportProtocols(Collection<String> downloadTransportProtocols) {
		this.downloadTransportProtocols = downloadTransportProtocols;
	}

	/**
	 * Set the network protocols supported for AV download.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public IP withDownloadTransportProtocols(String string) {
		getDownloadTransportProtocols().add(string);
		return this;
	}

	/**
	 * Get av multiplex types supported by the front end.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getMultiplexTypes() {
		if (this.multiplexTypes == null){ this.multiplexTypes=new ArrayList<>();}
		return multiplexTypes;
	}

	/**
	 * Set av multiplex types supported by the front end.
	 *
	 * @since 1.0
	 * @param multiplexTypes the input value
	 */
	public void  setMultiplexTypes(Collection<String> multiplexTypes) {
		this.multiplexTypes = multiplexTypes;
	}

	/**
	 * Set av multiplex types supported by the front end.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public IP withMultiplexTypes(String string) {
		getMultiplexTypes().add(string);
		return this;
	}

	/**
	 * Get the describes the maximum de-jittering buffer size, in bytes, supported by the STB.

A value of -1 indicates no specific limit on the buffer size.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxDejitteringBufferSize() {
		return maxDejitteringBufferSize;
	}

	/**
	 * Set the describes the maximum de-jittering buffer size, in bytes, supported by the STB.

A value of -1 indicates no specific limit on the buffer size.
	 *
	 * @since 1.0
	 * @param maxDejitteringBufferSize the input value
	 */
	public void  setMaxDejitteringBufferSize(Integer maxDejitteringBufferSize) {
		this.maxDejitteringBufferSize = maxDejitteringBufferSize;
	}

	/**
	 * Set the describes the maximum de-jittering buffer size, in bytes, supported by the STB.

A value of -1 indicates no specific limit on the buffer size.
	 *
	 * @since 1.0
	 * @param maxDejitteringBufferSize the input value
	 * @return this instance
	 */
	public IP withMaxDejitteringBufferSize(Integer maxDejitteringBufferSize) {
		this.maxDejitteringBufferSize = maxDejitteringBufferSize;
		return this;
	}

	//</editor-fold>

}