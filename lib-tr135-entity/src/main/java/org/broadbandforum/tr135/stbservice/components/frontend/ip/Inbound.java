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
package org.broadbandforum.tr135.stbservice.components.frontend.ip;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;
import org.broadbandforum.tr135.datatypes.IPAddress;

	/**
	 * Inbound IP streams currently entering the STB via this front-end.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.Inbound.{i}.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.Inbound")
@XmlType(name = "STBService.Components.FrontEnd.IP.Inbound")
@XmlAccessorType(XmlAccessType.FIELD)
public class Inbound {

	/**
	 * The status of this Inbound stream.  {{enum}}

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
	 * Unique human-readable name associated with this inbound IP instance.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Network protocol currently used for controlling streaming of the source content, or {{empty}} if the content is not being streamed or is being streamed but is not being controlled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingControlProtocol")
	public String streamingControlProtocol;
	/**
	 * Network protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingTransportProtocol")
	public String streamingTransportProtocol;
	/**
	 * Transport control protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StreamingTransportControlProtocol")
	public String streamingTransportControlProtocol;
	/**
	 * AV multiplex type currently used for the source content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MultiplexType")
	public String multiplexType;
	/**
	 * Network protocol currently used for downloading the source content, or an empty string if the content is not being downloaded.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownloadTransportProtocol")
	public String downloadTransportProtocol;
	/**
	 * IP address of the source of the current stream content.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourceAddress")
	public IPAddress sourceAddress;
	/**
	 * TCP or UDP port number of the source of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourcePort")
	@Size(min = 0, max = 65535)
	public Long sourcePort;
	/**
	 * IP address of the destination of the current stream content, or {{empty}} if the content is not being delivered via IP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestinationAddress")
	public IPAddress destinationAddress;
	/**
	 * TCP or UDP port number of the destination of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestinationPort")
	@Size(min = 0, max = 65535)
	public Long destinationPort;
	/**
	 * RFC 3986 URI that indicates the current source (possibly including Multicast group and port, if relevant) of the stream content, or {{empty}} if the source is not known or cannot be represented as a URI.

For example, for a WAN-delivered stream this might be a content provider's URL, or for a LAN-delivered stream it might be an UPnP AV URN.

If specified, the URI MUST be consistent with the other source-related parameters.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URI")
	@Size(max = 256)
	public String uri;

	public Inbound() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this Inbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Inbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Inbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public Inbound withStatus(String status) {
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
	public Inbound withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique human-readable name associated with this inbound IP instance.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the unique human-readable name associated with this inbound IP instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the unique human-readable name associated with this inbound IP instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public Inbound withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the network protocol currently used for controlling streaming of the source content, or {{empty}} if the content is not being streamed or is being streamed but is not being controlled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStreamingControlProtocol() {
		return streamingControlProtocol;
	}

	/**
	 * Set the network protocol currently used for controlling streaming of the source content, or {{empty}} if the content is not being streamed or is being streamed but is not being controlled.
	 *
	 * @since 1.0
	 * @param streamingControlProtocol the input value
	 */
	public void  setStreamingControlProtocol(String streamingControlProtocol) {
		this.streamingControlProtocol = streamingControlProtocol;
	}

	/**
	 * Set the network protocol currently used for controlling streaming of the source content, or {{empty}} if the content is not being streamed or is being streamed but is not being controlled.
	 *
	 * @since 1.0
	 * @param streamingControlProtocol the input value
	 * @return this instance
	 */
	public Inbound withStreamingControlProtocol(String streamingControlProtocol) {
		this.streamingControlProtocol = streamingControlProtocol;
		return this;
	}

	/**
	 * Get the network protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStreamingTransportProtocol() {
		return streamingTransportProtocol;
	}

	/**
	 * Set the network protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @param streamingTransportProtocol the input value
	 */
	public void  setStreamingTransportProtocol(String streamingTransportProtocol) {
		this.streamingTransportProtocol = streamingTransportProtocol;
	}

	/**
	 * Set the network protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @param streamingTransportProtocol the input value
	 * @return this instance
	 */
	public Inbound withStreamingTransportProtocol(String streamingTransportProtocol) {
		this.streamingTransportProtocol = streamingTransportProtocol;
		return this;
	}

	/**
	 * Get the transport control protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStreamingTransportControlProtocol() {
		return streamingTransportControlProtocol;
	}

	/**
	 * Set the transport control protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @param streamingTransportControlProtocol the input value
	 */
	public void  setStreamingTransportControlProtocol(String streamingTransportControlProtocol) {
		this.streamingTransportControlProtocol = streamingTransportControlProtocol;
	}

	/**
	 * Set the transport control protocol currently used for streaming the source content, or an empty string if the content is not being streamed.
	 *
	 * @since 1.0
	 * @param streamingTransportControlProtocol the input value
	 * @return this instance
	 */
	public Inbound withStreamingTransportControlProtocol(String streamingTransportControlProtocol) {
		this.streamingTransportControlProtocol = streamingTransportControlProtocol;
		return this;
	}

	/**
	 * Get av multiplex type currently used for the source content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMultiplexType() {
		return multiplexType;
	}

	/**
	 * Set av multiplex type currently used for the source content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @param multiplexType the input value
	 */
	public void  setMultiplexType(String multiplexType) {
		this.multiplexType = multiplexType;
	}

	/**
	 * Set av multiplex type currently used for the source content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @param multiplexType the input value
	 * @return this instance
	 */
	public Inbound withMultiplexType(String multiplexType) {
		this.multiplexType = multiplexType;
		return this;
	}

	/**
	 * Get the network protocol currently used for downloading the source content, or an empty string if the content is not being downloaded.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDownloadTransportProtocol() {
		return downloadTransportProtocol;
	}

	/**
	 * Set the network protocol currently used for downloading the source content, or an empty string if the content is not being downloaded.
	 *
	 * @since 1.0
	 * @param downloadTransportProtocol the input value
	 */
	public void  setDownloadTransportProtocol(String downloadTransportProtocol) {
		this.downloadTransportProtocol = downloadTransportProtocol;
	}

	/**
	 * Set the network protocol currently used for downloading the source content, or an empty string if the content is not being downloaded.
	 *
	 * @since 1.0
	 * @param downloadTransportProtocol the input value
	 * @return this instance
	 */
	public Inbound withDownloadTransportProtocol(String downloadTransportProtocol) {
		this.downloadTransportProtocol = downloadTransportProtocol;
		return this;
	}

	/**
	 * Get the ip address of the source of the current stream content.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * Set the ip address of the source of the current stream content.
	 *
	 * @since 1.0
	 * @param sourceAddress the input value
	 */
	public void  setSourceAddress(IPAddress sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	/**
	 * Set the ip address of the source of the current stream content.
	 *
	 * @since 1.0
	 * @param sourceAddress the input value
	 * @return this instance
	 */
	public Inbound withSourceAddress(IPAddress sourceAddress) {
		this.sourceAddress = sourceAddress;
		return this;
	}

	/**
	 * Get the tcp or UDP port number of the source of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the tcp or UDP port number of the source of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Long sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the tcp or UDP port number of the source of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Inbound withSourcePort(Long sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the ip address of the destination of the current stream content, or {{empty}} if the content is not being delivered via IP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * Set the ip address of the destination of the current stream content, or {{empty}} if the content is not being delivered via IP.
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 */
	public void  setDestinationAddress(IPAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * Set the ip address of the destination of the current stream content, or {{empty}} if the content is not being delivered via IP.
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 * @return this instance
	 */
	public Inbound withDestinationAddress(IPAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
		return this;
	}

	/**
	 * Get the tcp or UDP port number of the destination of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDestinationPort() {
		return destinationPort;
	}

	/**
	 * Set the tcp or UDP port number of the destination of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @param destinationPort the input value
	 */
	public void  setDestinationPort(Long destinationPort) {
		this.destinationPort = destinationPort;
	}

	/**
	 * Set the tcp or UDP port number of the destination of the current stream content, or 0 if the content is not being delivered via IP or if not applicable.
	 *
	 * @since 1.0
	 * @param destinationPort the input value
	 * @return this instance
	 */
	public Inbound withDestinationPort(Long destinationPort) {
		this.destinationPort = destinationPort;
		return this;
	}

	/**
	 * Get the rfc 3986 URI that indicates the current source (possibly including Multicast group and port, if relevant) of the stream content, or {{empty}} if the source is not known or cannot be represented as a URI.

For example, for a WAN-delivered stream this might be a content provider's URL, or for a LAN-delivered stream it might be an UPnP AV URN.

If specified, the URI MUST be consistent with the other source-related parameters.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the rfc 3986 URI that indicates the current source (possibly including Multicast group and port, if relevant) of the stream content, or {{empty}} if the source is not known or cannot be represented as a URI.

For example, for a WAN-delivered stream this might be a content provider's URL, or for a LAN-delivered stream it might be an UPnP AV URN.

If specified, the URI MUST be consistent with the other source-related parameters.
	 *
	 * @since 1.0
	 * @param uri the input value
	 */
	public void  setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Set the rfc 3986 URI that indicates the current source (possibly including Multicast group and port, if relevant) of the stream content, or {{empty}} if the source is not known or cannot be represented as a URI.

For example, for a WAN-delivered stream this might be a content provider's URL, or for a LAN-delivered stream it might be an UPnP AV URN.

If specified, the URI MUST be consistent with the other source-related parameters.
	 *
	 * @since 1.0
	 * @param uri the input value
	 * @return this instance
	 */
	public Inbound withUri(String uri) {
		this.uri = uri;
		return this;
	}

	//</editor-fold>

}