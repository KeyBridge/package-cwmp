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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Connect to a DVB-T service.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.ServiceConnect.")
public class ServiceConnect {

	/**
	 * DvbId of the service to connect to.

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DvbId")
	@CWMPParameter(access = "readWrite")
	@Size(max = 12)
	public String dvbId;

	public ServiceConnect() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the dvbId of the service to connect to.

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDvbId() {
		return dvbId;
	}

	/**
	 * Set the dvbId of the service to connect to.

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param dvbId the input value
	 */
	public void  setDvbId(String dvbId) {
		this.dvbId = dvbId;
	}

	/**
	 * Set the dvbId of the service to connect to.

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''DTT'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param dvbId the input value
	 * @return this instance
	 */
	public ServiceConnect withDvbId(String dvbId) {
		this.dvbId = dvbId;
		return this;
	}

	//</editor-fold>

}