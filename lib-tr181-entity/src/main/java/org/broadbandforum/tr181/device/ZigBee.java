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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.zigbee.Discovery;
import org.broadbandforum.tr181.device.zigbee.Interface;
import org.broadbandforum.tr181.device.zigbee.ZDO;

	/**
	 * Top level object for ZigBee capabilities based on the {{bibref|ZigBee2007}} specification.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.")
@XmlRootElement(name = "Device.ZigBee")
@XmlType(name = "Device.ZigBee")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZigBee {

	/**
	 * ZigBee interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the ZigBee interface of a ZigBee end device, ZigBee router or ZigBee coordinator.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * ZigBee Device Object (ZDO) provides management capabilities of the ZigBee Application Support  (APS) and Network (NWK) layers of a ZigBee Device as defined in {{bibref|ZigBee2007|section 2.5}}.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined
	 */
	@XmlElementWrapper(name = "ZDOs")
	@XmlElement(name = "ZDO")
	public Collection<ZDO> zdos;
	/**
	 * This object is used for managing the discovery of ZigBee devices within a ZigBee Area Network. ZigBee Devices are discovered via the {{object|#.ZDO}} instance associated with the ZigBee Coordinator of an Area Network.
	 */
	@XmlElement(name = "Discovery")
	public Discovery discovery;

	public ZigBee() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the zigBee interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the ZigBee interface of a ZigBee end device, ZigBee router or ZigBee coordinator.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the zigBee interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the ZigBee interface of a ZigBee end device, ZigBee router or ZigBee coordinator.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the zigBee interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the ZigBee interface of a ZigBee end device, ZigBee router or ZigBee coordinator.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public ZigBee withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the zigBee Device Object (ZDO) provides management capabilities of the ZigBee Application Support  (APS) and Network (NWK) layers of a ZigBee Device as defined in {{bibref|ZigBee2007|section 2.5}}.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined
	 *
	 * @return the value
	 */
	public Collection<ZDO> getZdos() {
		if (this.zdos == null){ this.zdos=new ArrayList<>();}
		return zdos;
	}

	/**
	 * Set the zigBee Device Object (ZDO) provides management capabilities of the ZigBee Application Support  (APS) and Network (NWK) layers of a ZigBee Device as defined in {{bibref|ZigBee2007|section 2.5}}.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined
	 *
	 * @param zdos the input value
	 */
	public void  setZdos(Collection<ZDO> zdos) {
		this.zdos = zdos;
	}

	/**
	 * Set the zigBee Device Object (ZDO) provides management capabilities of the ZigBee Application Support  (APS) and Network (NWK) layers of a ZigBee Device as defined in {{bibref|ZigBee2007|section 2.5}}.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined
	 *
	 * @param zdo the input value
	 * @return this instance
	 */
	public ZigBee withZDO(ZDO zdo) {
		getZdos().add(zdo);
		return this;
	}

	/**
	 * Get the this object is used for managing the discovery of ZigBee devices within a ZigBee Area Network. ZigBee Devices are discovered via the {{object|#.ZDO}} instance associated with the ZigBee Coordinator of an Area Network.
	 *
	 * @return the value
	 */
	public Discovery getDiscovery() {
		return discovery;
	}

	/**
	 * Set the this object is used for managing the discovery of ZigBee devices within a ZigBee Area Network. ZigBee Devices are discovered via the {{object|#.ZDO}} instance associated with the ZigBee Coordinator of an Area Network.
	 *
	 * @param discovery the input value
	 */
	public void  setDiscovery(Discovery discovery) {
		this.discovery = discovery;
	}

	/**
	 * Set the this object is used for managing the discovery of ZigBee devices within a ZigBee Area Network. ZigBee Devices are discovered via the {{object|#.ZDO}} instance associated with the ZigBee Coordinator of an Area Network.
	 *
	 * @param discovery the input value
	 * @return this instance
	 */
	public ZigBee withDiscovery(Discovery discovery) {
		this.discovery = discovery;
		return this;
	}

	//</editor-fold>

}