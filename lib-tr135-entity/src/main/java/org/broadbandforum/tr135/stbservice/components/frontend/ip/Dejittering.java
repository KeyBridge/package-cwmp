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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to the de-jittering buffer configuration for all inbound IP streams.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.Dejittering.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.Dejittering")
@XmlType(name = "STBService.Components.FrontEnd.IP.Dejittering")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dejittering {

	/**
	 * De-jittering buffer size, measured in milliseconds, on the receiver side of the CPE.  The STB is responsible for converting this into the actual buffer size in ''bytes''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BufferSize")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long bufferSize;
	/**
	 * Describes the number of milliseconds worth of data that should be in the receiver side dejittering buffer before play-out can start.  Typically this would be half of the buffer size.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BufferInitialLevel")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long bufferInitialLevel;

	public Dejittering() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the de-jittering buffer size, measured in milliseconds, on the receiver side of the CPE.  The STB is responsible for converting this into the actual buffer size in ''bytes''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBufferSize() {
		return bufferSize;
	}

	/**
	 * Set the de-jittering buffer size, measured in milliseconds, on the receiver side of the CPE.  The STB is responsible for converting this into the actual buffer size in ''bytes''.
	 *
	 * @since 1.0
	 * @param bufferSize the input value
	 */
	public void  setBufferSize(Long bufferSize) {
		this.bufferSize = bufferSize;
	}

	/**
	 * Set the de-jittering buffer size, measured in milliseconds, on the receiver side of the CPE.  The STB is responsible for converting this into the actual buffer size in ''bytes''.
	 *
	 * @since 1.0
	 * @param bufferSize the input value
	 * @return this instance
	 */
	public Dejittering withBufferSize(Long bufferSize) {
		this.bufferSize = bufferSize;
		return this;
	}

	/**
	 * Get the describes the number of milliseconds worth of data that should be in the receiver side dejittering buffer before play-out can start.  Typically this would be half of the buffer size.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBufferInitialLevel() {
		return bufferInitialLevel;
	}

	/**
	 * Set the describes the number of milliseconds worth of data that should be in the receiver side dejittering buffer before play-out can start.  Typically this would be half of the buffer size.
	 *
	 * @since 1.0
	 * @param bufferInitialLevel the input value
	 */
	public void  setBufferInitialLevel(Long bufferInitialLevel) {
		this.bufferInitialLevel = bufferInitialLevel;
	}

	/**
	 * Set the describes the number of milliseconds worth of data that should be in the receiver side dejittering buffer before play-out can start.  Typically this would be half of the buffer size.
	 *
	 * @since 1.0
	 * @param bufferInitialLevel the input value
	 * @return this instance
	 */
	public Dejittering withBufferInitialLevel(Long bufferInitialLevel) {
		this.bufferInitialLevel = bufferInitialLevel;
		return this;
	}

	//</editor-fold>

}