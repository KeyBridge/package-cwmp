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
package org.broadbandforum.tr181.device.usb.usbhosts.host.device.configuration;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * Table of device interface descriptors.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.USB.USBHosts.Host.{i}.Device.{i}.Configuration.{i}.Interface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"InterfaceNumber"})})
@XmlRootElement(name = "Device.USB.USBHosts.Host.Device.Configuration.Interface")
@XmlType(name = "Device.USB.USBHosts.Host.Device.Configuration.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * Number of this interface (from USB interface descriptor).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterfaceNumber")
	@Size(max = 255)
	public Long interfaceNumber;
	/**
	 * Class Code as assigned by USB-IF. 

          When 0x00, each interface specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterfaceClass")
	public byte[] interfaceClass;
	/**
	 * Subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterfaceSubClass")
	public byte[] interfaceSubClass;
	/**
	 * Protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterfaceProtocol")
	public byte[] interfaceProtocol;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of this interface (from USB interface descriptor).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInterfaceNumber() {
		return interfaceNumber;
	}

	/**
	 * Set the number of this interface (from USB interface descriptor).
	 *
	 * @since 2.0
	 * @param interfaceNumber the input value
	 */
	public void  setInterfaceNumber(Long interfaceNumber) {
		this.interfaceNumber = interfaceNumber;
	}

	/**
	 * Set the number of this interface (from USB interface descriptor).
	 *
	 * @since 2.0
	 * @param interfaceNumber the input value
	 * @return this instance
	 */
	public Interface withInterfaceNumber(Long interfaceNumber) {
		this.interfaceNumber = interfaceNumber;
		return this;
	}

	/**
	 * Get the class Code as assigned by USB-IF. 

          When 0x00, each interface specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getInterfaceClass() {
		return interfaceClass;
	}

	/**
	 * Set the class Code as assigned by USB-IF. 

          When 0x00, each interface specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @param interfaceClass the input value
	 */
	public void  setInterfaceClass(byte[] interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

	/**
	 * Set the class Code as assigned by USB-IF. 

          When 0x00, each interface specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @param interfaceClass the input value
	 * @return this instance
	 */
	public Interface withInterfaceClass(byte[] interfaceClass) {
		this.interfaceClass = interfaceClass;
		return this;
	}

	/**
	 * Get the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getInterfaceSubClass() {
		return interfaceSubClass;
	}

	/**
	 * Set the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param interfaceSubClass the input value
	 */
	public void  setInterfaceSubClass(byte[] interfaceSubClass) {
		this.interfaceSubClass = interfaceSubClass;
	}

	/**
	 * Set the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param interfaceSubClass the input value
	 * @return this instance
	 */
	public Interface withInterfaceSubClass(byte[] interfaceSubClass) {
		this.interfaceSubClass = interfaceSubClass;
		return this;
	}

	/**
	 * Get the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getInterfaceProtocol() {
		return interfaceProtocol;
	}

	/**
	 * Set the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param interfaceProtocol the input value
	 */
	public void  setInterfaceProtocol(byte[] interfaceProtocol) {
		this.interfaceProtocol = interfaceProtocol;
	}

	/**
	 * Set the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param interfaceProtocol the input value
	 * @return this instance
	 */
	public Interface withInterfaceProtocol(byte[] interfaceProtocol) {
		this.interfaceProtocol = interfaceProtocol;
		return this;
	}

	//</editor-fold>

}