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
import org.broadbandforum.tr181.device.zigbee.zdo.nodemanager.RoutingTable;

	/**
	 * The {{object}} object describes the configuration capabilities related for remote management of the ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.6 Node Manager}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.NodeManager.")
@XmlRootElement(name = "Device.ZigBee.ZDO.NodeManager")
@XmlType(name = "Device.ZigBee.ZDO.NodeManager")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeManager {

	/**
	 * The {{object}} object describes the route table as defined in {{bibref|ZigBee2007|table 3.51 Routing Table Entry}}.
	 */
	@XmlElementWrapper(name = "RoutingTables")
	@XmlElement(name = "RoutingTable")
	public Collection<RoutingTable> routingTables;

	public NodeManager() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{object}} object describes the route table as defined in {{bibref|ZigBee2007|table 3.51 Routing Table Entry}}.
	 *
	 * @return the value
	 */
	public Collection<RoutingTable> getRoutingTables() {
		if (this.routingTables == null){ this.routingTables=new ArrayList<>();}
		return routingTables;
	}

	/**
	 * Set the {{object}} object describes the route table as defined in {{bibref|ZigBee2007|table 3.51 Routing Table Entry}}.
	 *
	 * @param routingTables the input value
	 */
	public void  setRoutingTables(Collection<RoutingTable> routingTables) {
		this.routingTables = routingTables;
	}

	/**
	 * Set the {{object}} object describes the route table as defined in {{bibref|ZigBee2007|table 3.51 Routing Table Entry}}.
	 *
	 * @param routingTable the input value
	 * @return this instance
	 */
	public NodeManager withRoutingTable(RoutingTable routingTable) {
		getRoutingTables().add(routingTable);
		return this;
	}

	//</editor-fold>

}