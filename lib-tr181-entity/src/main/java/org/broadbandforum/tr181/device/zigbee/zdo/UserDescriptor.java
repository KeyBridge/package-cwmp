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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The {{object}} object is an optional descriptor that describes user defined capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.7 User Descriptor}}. The {{object}} object contains information that allows the user to identify the device using a user-friendly character string, such as "Bedroom TV" or "Stairs Light".
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.UserDescriptor.")
@XmlRootElement(name = "Device.ZigBee.ZDO.UserDescriptor")
@XmlType(name = "Device.ZigBee.ZDO.UserDescriptor")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDescriptor {

	/**
	 * When {{true}}, the User Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DescriptorAvailable")
	public Boolean descriptorAvailable;
	/**
	 * Specifies the information that allows the user to identify the ZigBee device using a user-friendly character string, such as "Bedroom TV" or "Stairs light".
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Description")
	@Size(max = 16)
	public String description;

	public UserDescriptor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when {{true}}, the User Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isDescriptorAvailable() {
		return descriptorAvailable;
	}

	/**
	 * Set the when {{true}}, the User Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @param descriptorAvailable the input value
	 */
	public void  setDescriptorAvailable(Boolean descriptorAvailable) {
		this.descriptorAvailable = descriptorAvailable;
	}

	/**
	 * Set the when {{true}}, the User Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @param descriptorAvailable the input value
	 * @return this instance
	 */
	public UserDescriptor withDescriptorAvailable(Boolean descriptorAvailable) {
		this.descriptorAvailable = descriptorAvailable;
		return this;
	}

	/**
	 * Get the specifies the information that allows the user to identify the ZigBee device using a user-friendly character string, such as "Bedroom TV" or "Stairs light".
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the specifies the information that allows the user to identify the ZigBee device using a user-friendly character string, such as "Bedroom TV" or "Stairs light".
	 *
	 * @since 2.7
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the specifies the information that allows the user to identify the ZigBee device using a user-friendly character string, such as "Bedroom TV" or "Stairs light".
	 *
	 * @since 2.7
	 * @param description the input value
	 * @return this instance
	 */
	public UserDescriptor withDescription(String description) {
		this.description = description;
		return this;
	}

	//</editor-fold>

}