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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Parameters related to an outbound IP stream.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.Outbound.{i}.")
public class Outbound {

	/**
	 * The status of this Outbound stream.  {{enum}}

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
	 * Unique human-readable name associated with this outbound IP instance.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * AV multiplex type currently used for the destination content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MultiplexType")
	public String multiplexType;
	/**
	 * RFC 3986 URI that indicates the current destination (possibly including Multicast group and port, if relevant) of the stream content, or an empty string if the destination is not known or cannot be represented as a URI.

For example, this might be an UPnP AV URN.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URI")
	@Size(max = 256)
	public String uri;

	public Outbound() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this Outbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Outbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Outbound stream.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public Outbound withStatus(String status) {
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
	public Outbound withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique human-readable name associated with this outbound IP instance.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the unique human-readable name associated with this outbound IP instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the unique human-readable name associated with this outbound IP instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public Outbound withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get av multiplex type currently used for the destination content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMultiplexType() {
		return multiplexType;
	}

	/**
	 * Set av multiplex type currently used for the destination content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @param multiplexType the input value
	 */
	public void  setMultiplexType(String multiplexType) {
		this.multiplexType = multiplexType;
	}

	/**
	 * Set av multiplex type currently used for the destination content, or an empty string if the content is not being demultiplexed.
	 *
	 * @since 1.0
	 * @param multiplexType the input value
	 * @return this instance
	 */
	public Outbound withMultiplexType(String multiplexType) {
		this.multiplexType = multiplexType;
		return this;
	}

	/**
	 * Get the rfc 3986 URI that indicates the current destination (possibly including Multicast group and port, if relevant) of the stream content, or an empty string if the destination is not known or cannot be represented as a URI.

For example, this might be an UPnP AV URN.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the rfc 3986 URI that indicates the current destination (possibly including Multicast group and port, if relevant) of the stream content, or an empty string if the destination is not known or cannot be represented as a URI.

For example, this might be an UPnP AV URN.
	 *
	 * @since 1.0
	 * @param uri the input value
	 */
	public void  setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Set the rfc 3986 URI that indicates the current destination (possibly including Multicast group and port, if relevant) of the stream content, or an empty string if the destination is not known or cannot be represented as a URI.

For example, this might be an UPnP AV URN.
	 *
	 * @since 1.0
	 * @param uri the input value
	 * @return this instance
	 */
	public Outbound withUri(String uri) {
		this.uri = uri;
		return this;
	}

	//</editor-fold>

}