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
package org.broadbandforum.tr181.device.zigbee.zdo;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.zigbee.zdo.network.Neighbor;

	/**
	 * The {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.Network.")
@XmlRootElement(name = "Network")
@XmlType(name = "Device.ZigBee.ZDO.Network")
@XmlAccessorType(XmlAccessType.FIELD)
public class Network {

	/**
	 * The {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 */
	@XmlElementWrapper(name = "Neighbors")
	@XmlElement(name = "Neighbor")
	public Collection<Neighbor> neighbors;

	public Network() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @return the value
	 */
	public Collection<Neighbor> getNeighbors() {
		if (this.neighbors == null){ this.neighbors=new ArrayList<>();}
		return neighbors;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @param neighbors the input value
	 */
	public void  setNeighbors(Collection<Neighbor> neighbors) {
		this.neighbors = neighbors;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @param neighbor the input value
	 * @return this instance
	 */
	public Network withNeighbor(Neighbor neighbor) {
		getNeighbors().add(neighbor);
		return this;
	}

	//</editor-fold>

}