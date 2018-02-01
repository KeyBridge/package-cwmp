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
package org.broadbandforum.tr098.internetgatewaydevice.deviceinfo;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Each table entry represents a Vendor Log File. 

This table of log files is informational only and does not allow the ACS to operate on these files in any way.
	 *
	 * @since 1.8
	 */
@CWMPObject(name = "InternetGatewayDevice.DeviceInfo.VendorLogFile.{i}.")
public class VendorLogFile {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Name of the log file.

Typically this will be the full file system path, but provided that it is guaranteed to be unique across current and future log files, it MAY be a shorter name derived from the file system path, or be derived via another mechanism.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The maximum size of the log file in bytes.  If the device doesn't know the maximum file size then {{param}} will be 0.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "MaximumSize")
	public Long maximumSize;
	/**
	 * When {{true}}, the log file contents are preserved across a device reboot.

When {{false}}, the log file contents will be purged when the device is rebooted.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Persistent")
	public Boolean persistent;

	public VendorLogFile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @param alias the input value
	 * @return this instance
	 */
	public VendorLogFile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the log file.

Typically this will be the full file system path, but provided that it is guaranteed to be unique across current and future log files, it MAY be a shorter name derived from the file system path, or be derived via another mechanism.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the log file.

Typically this will be the full file system path, but provided that it is guaranteed to be unique across current and future log files, it MAY be a shorter name derived from the file system path, or be derived via another mechanism.
	 *
	 * @since 1.8
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the log file.

Typically this will be the full file system path, but provided that it is guaranteed to be unique across current and future log files, it MAY be a shorter name derived from the file system path, or be derived via another mechanism.
	 *
	 * @since 1.8
	 * @param name the input value
	 * @return this instance
	 */
	public VendorLogFile withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the maximum size of the log file in bytes.  If the device doesn't know the maximum file size then {{param}} will be 0.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Long getMaximumSize() {
		return maximumSize;
	}

	/**
	 * Set the maximum size of the log file in bytes.  If the device doesn't know the maximum file size then {{param}} will be 0.
	 *
	 * @since 1.8
	 * @param maximumSize the input value
	 */
	public void  setMaximumSize(Long maximumSize) {
		this.maximumSize = maximumSize;
	}

	/**
	 * Set the maximum size of the log file in bytes.  If the device doesn't know the maximum file size then {{param}} will be 0.
	 *
	 * @since 1.8
	 * @param maximumSize the input value
	 * @return this instance
	 */
	public VendorLogFile withMaximumSize(Long maximumSize) {
		this.maximumSize = maximumSize;
		return this;
	}

	/**
	 * Get the when {{true}}, the log file contents are preserved across a device reboot.

When {{false}}, the log file contents will be purged when the device is rebooted.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Boolean isPersistent() {
		return persistent;
	}

	/**
	 * Set the when {{true}}, the log file contents are preserved across a device reboot.

When {{false}}, the log file contents will be purged when the device is rebooted.
	 *
	 * @since 1.8
	 * @param persistent the input value
	 */
	public void  setPersistent(Boolean persistent) {
		this.persistent = persistent;
	}

	/**
	 * Set the when {{true}}, the log file contents are preserved across a device reboot.

When {{false}}, the log file contents will be purged when the device is rebooted.
	 *
	 * @since 1.8
	 * @param persistent the input value
	 * @return this instance
	 */
	public VendorLogFile withPersistent(Boolean persistent) {
		this.persistent = persistent;
		return this;
	}

	//</editor-fold>

}