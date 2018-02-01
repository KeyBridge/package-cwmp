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
package org.broadbandforum.tr181.device.lldp;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.lldp.discovery.Device;

	/**
	 * This object is used for managing the discovery of LLDP devices.

        The CPE MAY, but need not, retain some or all of the information in this object across reboot.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.")
public class Discovery {

	/**
	 * This table contains information about discovered LLDP devices.
	 */
	@XmlElementWrapper(name = "Devices")
	@XmlElement(name = "Device")
	public Collection<Device> devices;

	public Discovery() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this table contains information about discovered LLDP devices.
	 *
	 * @return the value
	 */
	public Collection<Device> getDevices() {
		if (this.devices == null){ this.devices=new ArrayList<>();}
		return devices;
	}

	/**
	 * Set the this table contains information about discovered LLDP devices.
	 *
	 * @param devices the input value
	 */
	public void  setDevices(Collection<Device> devices) {
		this.devices = devices;
	}

	/**
	 * Set the this table contains information about discovered LLDP devices.
	 *
	 * @param device the input value
	 * @return this instance
	 */
	public Discovery withDevice(Device device) {
		getDevices().add(device);
		return this;
	}

	//</editor-fold>

}