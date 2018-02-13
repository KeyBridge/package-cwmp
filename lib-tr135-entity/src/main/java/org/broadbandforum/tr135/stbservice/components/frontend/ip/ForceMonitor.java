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

	/**
	 * Parameters used to describe the force monitoring operation.

When running in the force monitoring mode, the STB MUST automatically connect to a test URI  defined by the {{param|URI}} parameter whenever it detects that the IP tuner is not not receiving any data from the WAN.

When running in normal mode, the STB does not perform any action when it does not receive any data from the IP tuner coming from the WAN.

The force monitor mode allows to maintain an active stream coming from the network so as to keep collecting statistics.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.ForceMonitor.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.ForceMonitor")
@XmlType(name = "STBService.Components.FrontEnd.IP.ForceMonitor")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForceMonitor {

	/**
	 * When set to {{true}}, forces the operation mode in ForceMonitor mode

When set to {{false}}, forces operation mode in Normal mode.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the statistic mode of operation. {{enum}}
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * describes the service to connect to for force monitoring purposes with the same syntaxt as {{param|#.ServiceConnect.URI}}

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''TEST'' or ''IP-All'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "URI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String uri;

	public ForceMonitor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when set to {{true}}, forces the operation mode in ForceMonitor mode

When set to {{false}}, forces operation mode in Normal mode.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the when set to {{true}}, forces the operation mode in ForceMonitor mode

When set to {{false}}, forces operation mode in Normal mode.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the when set to {{true}}, forces the operation mode in ForceMonitor mode

When set to {{false}}, forces operation mode in Normal mode.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public ForceMonitor withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the statistic mode of operation. {{enum}}
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the statistic mode of operation. {{enum}}
	 *
	 * @since 1.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the statistic mode of operation. {{enum}}
	 *
	 * @since 1.1
	 * @param status the input value
	 * @return this instance
	 */
	public ForceMonitor withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the describes the service to connect to for force monitoring purposes with the same syntaxt as {{param|#.ServiceConnect.URI}}

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''TEST'' or ''IP-All'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the describes the service to connect to for force monitoring purposes with the same syntaxt as {{param|#.ServiceConnect.URI}}

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''TEST'' or ''IP-All'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.1
	 * @param uri the input value
	 */
	public void  setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Set the describes the service to connect to for force monitoring purposes with the same syntaxt as {{param|#.ServiceConnect.URI}}

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''TEST'' or ''IP-All'' is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.1
	 * @param uri the input value
	 * @return this instance
	 */
	public ForceMonitor withUri(String uri) {
		this.uri = uri;
		return this;
	}

	//</editor-fold>

}