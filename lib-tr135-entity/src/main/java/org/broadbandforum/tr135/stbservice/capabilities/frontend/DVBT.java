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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Capabilities of the DVB-T receiver.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.FrontEnd.DVBT.")
@XmlRootElement(name = "STBService.Capabilities.FrontEnd.DVBT")
@XmlType(name = "STBService.Capabilities.FrontEnd.DVBT")
@XmlAccessorType(XmlAccessType.FIELD)
public class DVBT {

	/**
	 * Maximum number of simultaneous active AV streams supported by the DVB-T FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveDVBTStreams")
	@Size(min = -1)
	public Integer maxActiveDVBTStreams;
	/**
	 * Maximum number of logical channels that can be contained in a Service List Database.

A value of -1 indicates no specific limit on the number of logical channels.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxLogicalChannels")
	@Size(min = -1)
	public Integer maxLogicalChannels;

	public DVBT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of simultaneous active AV streams supported by the DVB-T FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveDVBTStreams() {
		return maxActiveDVBTStreams;
	}

	/**
	 * Set the maximum number of simultaneous active AV streams supported by the DVB-T FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveDVBTStreams the input value
	 */
	public void  setMaxActiveDVBTStreams(Integer maxActiveDVBTStreams) {
		this.maxActiveDVBTStreams = maxActiveDVBTStreams;
	}

	/**
	 * Set the maximum number of simultaneous active AV streams supported by the DVB-T FrontEnd.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveDVBTStreams the input value
	 * @return this instance
	 */
	public DVBT withMaxActiveDVBTStreams(Integer maxActiveDVBTStreams) {
		this.maxActiveDVBTStreams = maxActiveDVBTStreams;
		return this;
	}

	/**
	 * Get the maximum number of logical channels that can be contained in a Service List Database.

A value of -1 indicates no specific limit on the number of logical channels.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxLogicalChannels() {
		return maxLogicalChannels;
	}

	/**
	 * Set the maximum number of logical channels that can be contained in a Service List Database.

A value of -1 indicates no specific limit on the number of logical channels.
	 *
	 * @since 1.0
	 * @param maxLogicalChannels the input value
	 */
	public void  setMaxLogicalChannels(Integer maxLogicalChannels) {
		this.maxLogicalChannels = maxLogicalChannels;
	}

	/**
	 * Set the maximum number of logical channels that can be contained in a Service List Database.

A value of -1 indicates no specific limit on the number of logical channels.
	 *
	 * @since 1.0
	 * @param maxLogicalChannels the input value
	 * @return this instance
	 */
	public DVBT withMaxLogicalChannels(Integer maxLogicalChannels) {
		this.maxLogicalChannels = maxLogicalChannels;
		return this;
	}

	//</editor-fold>

}