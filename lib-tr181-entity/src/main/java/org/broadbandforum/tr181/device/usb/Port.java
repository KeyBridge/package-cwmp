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
package org.broadbandforum.tr181.device.usb;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * USB Port table. This table models master and slave USB physical ports on the device.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.USB.Port.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"})})
@XmlRootElement(name = "Device.USB.Port")
@XmlType(name = "Device.USB.Port")
@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * USB specification version supported by the Port. Example: "1.1"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Standard")
	@Size(max = 4)
	public String standard;
	/**
	 * Type of the USB connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * Receptacle of the port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Receptacle")
	public String receptacle;
	/**
	 * Current speed of the USB connection. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Rate")
	public String rate;
	/**
	 * Power configuration of the USB connection. {{enum}}

          Only applies when {{param|Type}} is {{enum|Device|Type}}. In other cases value is {{enum|Unknown}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Power")
	public String power;

	public Port() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Port withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the port.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the port.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Port withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the usb specification version supported by the Port. Example: "1.1"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Set the usb specification version supported by the Port. Example: "1.1"
	 *
	 * @since 2.0
	 * @param standard the input value
	 */
	public void  setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * Set the usb specification version supported by the Port. Example: "1.1"
	 *
	 * @since 2.0
	 * @param standard the input value
	 * @return this instance
	 */
	public Port withStandard(String standard) {
		this.standard = standard;
		return this;
	}

	/**
	 * Get the type of the USB connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of the USB connection.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of the USB connection.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Port withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the receptacle of the port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getReceptacle() {
		return receptacle;
	}

	/**
	 * Set the receptacle of the port.
	 *
	 * @since 2.0
	 * @param receptacle the input value
	 */
	public void  setReceptacle(String receptacle) {
		this.receptacle = receptacle;
	}

	/**
	 * Set the receptacle of the port.
	 *
	 * @since 2.0
	 * @param receptacle the input value
	 * @return this instance
	 */
	public Port withReceptacle(String receptacle) {
		this.receptacle = receptacle;
		return this;
	}

	/**
	 * Get the current speed of the USB connection. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * Set the current speed of the USB connection. {{enum}}
	 *
	 * @since 2.0
	 * @param rate the input value
	 */
	public void  setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * Set the current speed of the USB connection. {{enum}}
	 *
	 * @since 2.0
	 * @param rate the input value
	 * @return this instance
	 */
	public Port withRate(String rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get the power configuration of the USB connection. {{enum}}

          Only applies when {{param|Type}} is {{enum|Device|Type}}. In other cases value is {{enum|Unknown}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPower() {
		return power;
	}

	/**
	 * Set the power configuration of the USB connection. {{enum}}

          Only applies when {{param|Type}} is {{enum|Device|Type}}. In other cases value is {{enum|Unknown}}.
	 *
	 * @since 2.0
	 * @param power the input value
	 */
	public void  setPower(String power) {
		this.power = power;
	}

	/**
	 * Set the power configuration of the USB connection. {{enum}}

          Only applies when {{param|Type}} is {{enum|Device|Type}}. In other cases value is {{enum|Unknown}}.
	 *
	 * @since 2.0
	 * @param power the input value
	 * @return this instance
	 */
	public Port withPower(String power) {
		this.power = power;
		return this;
	}

	//</editor-fold>

}