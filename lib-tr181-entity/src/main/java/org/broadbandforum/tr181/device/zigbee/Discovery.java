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
package org.broadbandforum.tr181.device.zigbee;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.zigbee.discovery.AreaNetwork;

	/**
	 * This object is used for managing the discovery of ZigBee devices within a ZigBee Area Network. ZigBee Devices are discovered via the {{object|#.ZDO}} instance associated with the ZigBee Coordinator of an Area Network.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.Discovery.")
public class Discovery {

	/**
	 * This object specifies the ZigBee devices that are discovered by the {{param|Coordinator}}.

        As the ZigBee specification does not provide a discovery protocol between the CWMP proxy and the ZigBee coordinator, the {{object}} object is provisioned and not discovered.
	 */
	@XmlElementWrapper(name = "AreaNetworks")
	@XmlElement(name = "AreaNetwork")
	@CWMPParameter(access = "readWrite")
	public Collection<AreaNetwork> areaNetworks;

	public Discovery() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object specifies the ZigBee devices that are discovered by the {{param|Coordinator}}.

        As the ZigBee specification does not provide a discovery protocol between the CWMP proxy and the ZigBee coordinator, the {{object}} object is provisioned and not discovered.
	 *
	 * @return the value
	 */
	public Collection<AreaNetwork> getAreaNetworks() {
		if (this.areaNetworks == null){ this.areaNetworks=new ArrayList<>();}
		return areaNetworks;
	}

	/**
	 * Set the this object specifies the ZigBee devices that are discovered by the {{param|Coordinator}}.

        As the ZigBee specification does not provide a discovery protocol between the CWMP proxy and the ZigBee coordinator, the {{object}} object is provisioned and not discovered.
	 *
	 * @param areaNetworks the input value
	 */
	public void  setAreaNetworks(Collection<AreaNetwork> areaNetworks) {
		this.areaNetworks = areaNetworks;
	}

	/**
	 * Set the this object specifies the ZigBee devices that are discovered by the {{param|Coordinator}}.

        As the ZigBee specification does not provide a discovery protocol between the CWMP proxy and the ZigBee coordinator, the {{object}} object is provisioned and not discovered.
	 *
	 * @param areaNetwork the input value
	 * @return this instance
	 */
	public Discovery withAreaNetwork(AreaNetwork areaNetwork) {
		getAreaNetworks().add(areaNetwork);
		return this;
	}

	//</editor-fold>

}