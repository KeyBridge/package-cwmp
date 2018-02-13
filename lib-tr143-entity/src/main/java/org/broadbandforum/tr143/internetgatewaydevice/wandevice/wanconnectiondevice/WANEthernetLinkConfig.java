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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object models the Ethernet link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANEthernetLinkConfig.")
@XmlRootElement(name = "WANEthernetLinkConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANEthernetLinkConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANEthernetLinkConfig {

	/**
	 * Status of the Ethernet link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetLinkStatus")
	public String ethernetLinkStatus;

	public WANEthernetLinkConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the Ethernet link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getEthernetLinkStatus() {
		return ethernetLinkStatus;
	}

	/**
	 * Set the status of the Ethernet link.
	 *
	 * @since 1.0
	 * @param ethernetLinkStatus the input value
	 */
	public void  setEthernetLinkStatus(String ethernetLinkStatus) {
		this.ethernetLinkStatus = ethernetLinkStatus;
	}

	/**
	 * Set the status of the Ethernet link.
	 *
	 * @since 1.0
	 * @param ethernetLinkStatus the input value
	 * @return this instance
	 */
	public WANEthernetLinkConfig withEthernetLinkStatus(String ethernetLinkStatus) {
		this.ethernetLinkStatus = ethernetLinkStatus;
		return this;
	}

	//</editor-fold>

}