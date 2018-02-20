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
package org.broadbandforum.tr181.device.etsim2m.scl.areanwkinstance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkInstance}} instance.

        For example, if the {{param|#.AreaNwkType}} is ZigBee the {{object|##.AreaNwkInstance}} will contain ZigBee specific parameters that have not been modeled for the M2M Area network. 

        At a minimum, a property instance MUST exist that defines  an attribute that describes the IP layer address type (e.g., IPv4, IPv6, non-IP) of this M2M Area Network.
	 *
	 * @since TR181 v2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.AreaNwkInstance.{i}.Property.{i}.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.AreaNwkInstance.Property")
@XmlType(name = "Device.ETSIM2M.SCL.AreaNwkInstance.Property")
@XmlAccessorType(XmlAccessType.FIELD)
public class Property {

	/**
	 * The name of the property
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Name")
	public String name;
	/**
	 * The value of the property.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Value")
	public String value;

	public Property() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the name of the property
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the property
	 *
	 * @since 2.6
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the property
	 *
	 * @since 2.6
	 * @param name the input value
	 * @return this instance
	 */
	public Property withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the value of the property.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the value of the property.
	 *
	 * @since 2.6
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 * Set the value of the property.
	 *
	 * @since 2.6
	 * @param value the input value
	 * @return this instance
	 */
	public Property withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}