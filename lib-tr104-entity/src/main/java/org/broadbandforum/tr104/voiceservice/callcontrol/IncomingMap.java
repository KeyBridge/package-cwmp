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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * The {{object}} is a table that is used to control which extensions ring when an incoming call is received.

The map approach separates the call routing aspects from the configuration of the lines and extensions. It support PBX concepts such as DDI (one extension per line) and groups (parallel dialing if extensions have same priority and hunting when extensions have different priority).
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.IncomingMap.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Line", "Extension"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.CallControl.IncomingMap")
@XmlType(name = "VoiceService.CallControl.IncomingMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class IncomingMap {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{object|#.Line}} used by the call.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Line")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String line;
	/**
	 * {{object|#.Extension}} that rings on incoming call.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Extension")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String extension;
	/**
	 * Indicates the order in which extensions ring.

First all extensions with the lowest order value will ring.

When all these extensions have rejected the call or did not reply, the next order value will be attempted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order = 1L;
	/**
	 * The time in seconds the extension will ring before it is considered that there was no reply.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timeout;

	public IncomingMap() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IncomingMap withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public IncomingMap withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{object|#.Line}} used by the call.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLine() {
		return line;
	}

	/**
	 * Set the {{object|#.Line}} used by the call.

{{reference}}
	 *
	 * @since 2.0
	 * @param line the input value
	 */
	public void  setLine(String line) {
		this.line = line;
	}

	/**
	 * Set the {{object|#.Line}} used by the call.

{{reference}}
	 *
	 * @since 2.0
	 * @param line the input value
	 * @return this instance
	 */
	public IncomingMap withLine(String line) {
		this.line = line;
		return this;
	}

	/**
	 * Get the {{object|#.Extension}} that rings on incoming call.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * Set the {{object|#.Extension}} that rings on incoming call.

{{reference}}
	 *
	 * @since 2.0
	 * @param extension the input value
	 */
	public void  setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Set the {{object|#.Extension}} that rings on incoming call.

{{reference}}
	 *
	 * @since 2.0
	 * @param extension the input value
	 * @return this instance
	 */
	public IncomingMap withExtension(String extension) {
		this.extension = extension;
		return this;
	}

	/**
	 * Get the indicates the order in which extensions ring.

First all extensions with the lowest order value will ring.

When all these extensions have rejected the call or did not reply, the next order value will be attempted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the indicates the order in which extensions ring.

First all extensions with the lowest order value will ring.

When all these extensions have rejected the call or did not reply, the next order value will be attempted.
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the indicates the order in which extensions ring.

First all extensions with the lowest order value will ring.

When all these extensions have rejected the call or did not reply, the next order value will be attempted.
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public IncomingMap withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the time in seconds the extension will ring before it is considered that there was no reply.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the time in seconds the extension will ring before it is considered that there was no reply.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the time in seconds the extension will ring before it is considered that there was no reply.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public IncomingMap withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	//</editor-fold>

}