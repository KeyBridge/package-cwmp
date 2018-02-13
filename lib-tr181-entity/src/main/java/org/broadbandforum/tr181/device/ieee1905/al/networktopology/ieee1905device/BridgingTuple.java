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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values come from the 1905 Device’s Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-11: Device bridging capability TLV}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.BridgingTuple.{i}.")
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.BridgingTuple")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.BridgingTuple")
@XmlAccessorType(XmlAccessType.FIELD)
public class BridgingTuple {

	/**
	 * {{list}} {{reference}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceList")
	@XmlList
	public Collection<String> interfaceList;

	public BridgingTuple() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} {{reference}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getInterfaceList() {
		if (this.interfaceList == null){ this.interfaceList=new ArrayList<>();}
		return interfaceList;
	}

	/**
	 * Set the {{list}} {{reference}}
	 *
	 * @since 2.9
	 * @param interfaceList the input value
	 */
	public void  setInterfaceList(Collection<String> interfaceList) {
		this.interfaceList = interfaceList;
	}

	/**
	 * Set the {{list}} {{reference}}
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public BridgingTuple withInterfaceList(String string) {
		getInterfaceList().add(string);
		return this;
	}

	//</editor-fold>

}