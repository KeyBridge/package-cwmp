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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Connect to a DVB-T logical channel.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.LogicalChannelConnect.")
@XmlRootElement(name = "STBService.Components.FrontEnd.DVBT.LogicalChannelConnect")
@XmlType(name = "STBService.Components.FrontEnd.DVBT.LogicalChannelConnect")
@XmlAccessorType(XmlAccessType.FIELD)
public class LogicalChannelConnect {

	/**
	 * Logical channel number to connect to (the logical channel's preferred service will be connected to).

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LogicalChannelNumber")
	@CWMPParameter(access = "readWrite")
	public Long logicalChannelNumber;

	public LogicalChannelConnect() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the logical channel number to connect to (the logical channel's preferred service will be connected to).

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLogicalChannelNumber() {
		return logicalChannelNumber;
	}

	/**
	 * Set the logical channel number to connect to (the logical channel's preferred service will be connected to).

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param logicalChannelNumber the input value
	 */
	public void  setLogicalChannelNumber(Long logicalChannelNumber) {
		this.logicalChannelNumber = logicalChannelNumber;
	}

	/**
	 * Set the logical channel number to connect to (the logical channel's preferred service will be connected to).

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param logicalChannelNumber the input value
	 * @return this instance
	 */
	public LogicalChannelConnect withLogicalChannelNumber(Long logicalChannelNumber) {
		this.logicalChannelNumber = logicalChannelNumber;
		return this;
	}

	//</editor-fold>

}