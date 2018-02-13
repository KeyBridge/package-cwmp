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
package org.broadbandforum.tr181.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.lldp.Discovery;

	/**
	 * This object contains Link Layer Discovery Protocol (LLDP) {{bibref|802.1AB-2009}} related objects and parameters.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.")
@XmlRootElement(name = "LLDP")
@XmlType(name = "Device.LLDP")
@XmlAccessorType(XmlAccessType.FIELD)
public class LLDP {

	/**
	 * This object is used for managing the discovery of LLDP devices.

        The CPE MAY, but need not, retain some or all of the information in this object across reboot.
	 */
	@XmlElement(name = "Discovery")
	public Discovery discovery;

	public LLDP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object is used for managing the discovery of LLDP devices.

        The CPE MAY, but need not, retain some or all of the information in this object across reboot.
	 *
	 * @return the value
	 */
	public Discovery getDiscovery() {
		return discovery;
	}

	/**
	 * Set the this object is used for managing the discovery of LLDP devices.

        The CPE MAY, but need not, retain some or all of the information in this object across reboot.
	 *
	 * @param discovery the input value
	 */
	public void  setDiscovery(Discovery discovery) {
		this.discovery = discovery;
	}

	/**
	 * Set the this object is used for managing the discovery of LLDP devices.

        The CPE MAY, but need not, retain some or all of the information in this object across reboot.
	 *
	 * @param discovery the input value
	 * @return this instance
	 */
	public LLDP withDiscovery(Discovery discovery) {
		this.discovery = discovery;
		return this;
	}

	//</editor-fold>

}