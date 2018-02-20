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
package org.broadbandforum.tr181.device.etsim2m.scl.areanwkdeviceinfoinstance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkDeviceInfoInstance}} instance.

        For example, if the {{param|##.AreaNwkInstance.{i}.AreaNwkType}} value is ZigBee, this {{object|##.AreaNwkDeviceInfoInstance}} contains ZigBee-specific parameters that are not formally modeled for this {{object|##.AreaNwkDeviceInfoInstance}} instance.
	 *
	 * @since TR181 v2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.{i}.Property.{i}.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.AreaNwkDeviceInfoInstance.Property")
@XmlType(name = "Device.ETSIM2M.SCL.AreaNwkDeviceInfoInstance.Property")
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