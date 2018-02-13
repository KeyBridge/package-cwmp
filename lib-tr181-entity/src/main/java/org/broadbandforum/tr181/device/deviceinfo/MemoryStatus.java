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
package org.broadbandforum.tr181.device.deviceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Status of the device's volatile physical memory.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.MemoryStatus.")
@XmlRootElement(name = "MemoryStatus")
@XmlType(name = "Device.DeviceInfo.MemoryStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemoryStatus {

	/**
	 * The total physical RAM, in kilobytes, installed on the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Total")
	public Long total;
	/**
	 * The free physical RAM, in kilobytes, currently available on the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Free")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	public Long free;

	public MemoryStatus() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total physical RAM, in kilobytes, installed on the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * Set the total physical RAM, in kilobytes, installed on the device.
	 *
	 * @since 2.0
	 * @param total the input value
	 */
	public void  setTotal(Long total) {
		this.total = total;
	}

	/**
	 * Set the total physical RAM, in kilobytes, installed on the device.
	 *
	 * @since 2.0
	 * @param total the input value
	 * @return this instance
	 */
	public MemoryStatus withTotal(Long total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the free physical RAM, in kilobytes, currently available on the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFree() {
		return free;
	}

	/**
	 * Set the free physical RAM, in kilobytes, currently available on the device.
	 *
	 * @since 2.0
	 * @param free the input value
	 */
	public void  setFree(Long free) {
		this.free = free;
	}

	/**
	 * Set the free physical RAM, in kilobytes, currently available on the device.
	 *
	 * @since 2.0
	 * @param free the input value
	 * @return this instance
	 */
	public MemoryStatus withFree(Long free) {
		this.free = free;
		return this;
	}

	//</editor-fold>

}