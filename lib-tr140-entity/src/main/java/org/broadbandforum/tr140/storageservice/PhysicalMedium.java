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
package org.broadbandforum.tr140.storageservice;

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
	 * This object provides information about each physical medium connected to this device.
	 *
	 * @since TR140 v1.0
	 */
@CWMPObject(name = "StorageService.{i}.PhysicalMedium.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"}),
	@CWMPUnique(names = {"Vendor", "Model", "SerialNumber"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "StorageService.PhysicalMedium")
@XmlType(name = "StorageService.PhysicalMedium")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhysicalMedium {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * A user-friendly name for this physical storage medium.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * The vendor of this physical storage medium.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Vendor")
	@Size(max = 64)
	public String vendor;
	/**
	 * The model name/number of this physical storage medium.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Model")
	@Size(max = 128)
	public String model;
	/**
	 * The serial number of this physical storage medium.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * The firmware version for firmware contained within the physical medium's controller.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * The method of connection to this storage device.  {{enum}}

The parameter MAY instead be a vendor-specific connection type, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyConnType"
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionType")
	public String connectionType;
	/**
	 * Is this physical storage medium removable?  Removable storage implies that the removal action is part of normal operations and is expected to leave the data on the removable storage intact.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Removable")
	public Boolean removable;
	/**
	 * The formatted capacity of the physical storage medium in MB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Capacity")
	public Long capacity;
	/**
	 * The general activity status of this physical storage medium.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Time since boot in hours. This MAY reflect S.M.A.R.T. PowerOnHours.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Uptime")
	@CWMPParameter(activeNotify = "canDeny", units = "hours")
	public Long uptime;
	/**
	 * Is this physical medium capable of reporting S.M.A.R.T. statistics?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SMARTCapable")
	public Boolean smaRTCapable;
	/**
	 * The general health of this physical storage medium.  {{enum}}

Note: Health MAY be obtained from S.M.A.R.T. data where available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Health")
	public String health;
	/**
	 * Is this physical medium capable of being removed while the device is powered up?  Hot-Swappable storage does not imply Removable storage; hot-swappable is an operation taken only when the disk has failed and needs to be replaced.  The data on the hot-swapped storage will not remain intact.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HotSwappable")
	public Boolean hotSwappable;

	public PhysicalMedium() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public PhysicalMedium withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get a user-friendly name for this physical storage medium.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set a user-friendly name for this physical storage medium.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set a user-friendly name for this physical storage medium.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public PhysicalMedium withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the vendor of this physical storage medium.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Set the vendor of this physical storage medium.
	 *
	 * @since 1.0
	 * @param vendor the input value
	 */
	public void  setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Set the vendor of this physical storage medium.
	 *
	 * @since 1.0
	 * @param vendor the input value
	 * @return this instance
	 */
	public PhysicalMedium withVendor(String vendor) {
		this.vendor = vendor;
		return this;
	}

	/**
	 * Get the model name/number of this physical storage medium.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Set the model name/number of this physical storage medium.
	 *
	 * @since 1.0
	 * @param model the input value
	 */
	public void  setModel(String model) {
		this.model = model;
	}

	/**
	 * Set the model name/number of this physical storage medium.
	 *
	 * @since 1.0
	 * @param model the input value
	 * @return this instance
	 */
	public PhysicalMedium withModel(String model) {
		this.model = model;
		return this;
	}

	/**
	 * Get the serial number of this physical storage medium.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of this physical storage medium.
	 *
	 * @since 1.0
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of this physical storage medium.
	 *
	 * @since 1.0
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public PhysicalMedium withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the firmware version for firmware contained within the physical medium's controller.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the firmware version for firmware contained within the physical medium's controller.
	 *
	 * @since 1.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the firmware version for firmware contained within the physical medium's controller.
	 *
	 * @since 1.0
	 * @param firmwareVersion the input value
	 * @return this instance
	 */
	public PhysicalMedium withFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}

	/**
	 * Get the method of connection to this storage device.  {{enum}}

The parameter MAY instead be a vendor-specific connection type, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyConnType"
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Set the method of connection to this storage device.  {{enum}}

The parameter MAY instead be a vendor-specific connection type, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyConnType"
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 */
	public void  setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * Set the method of connection to this storage device.  {{enum}}

The parameter MAY instead be a vendor-specific connection type, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyConnType"
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 * @return this instance
	 */
	public PhysicalMedium withConnectionType(String connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	/**
	 * Get the is this physical storage medium removable?  Removable storage implies that the removal action is part of normal operations and is expected to leave the data on the removable storage intact.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isRemovable() {
		return removable;
	}

	/**
	 * Set the is this physical storage medium removable?  Removable storage implies that the removal action is part of normal operations and is expected to leave the data on the removable storage intact.
	 *
	 * @since 1.0
	 * @param removable the input value
	 */
	public void  setRemovable(Boolean removable) {
		this.removable = removable;
	}

	/**
	 * Set the is this physical storage medium removable?  Removable storage implies that the removal action is part of normal operations and is expected to leave the data on the removable storage intact.
	 *
	 * @since 1.0
	 * @param removable the input value
	 * @return this instance
	 */
	public PhysicalMedium withRemovable(Boolean removable) {
		this.removable = removable;
		return this;
	}

	/**
	 * Get the formatted capacity of the physical storage medium in MB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * Set the formatted capacity of the physical storage medium in MB.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 */
	public void  setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	/**
	 * Set the formatted capacity of the physical storage medium in MB.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 * @return this instance
	 */
	public PhysicalMedium withCapacity(Long capacity) {
		this.capacity = capacity;
		return this;
	}

	/**
	 * Get the general activity status of this physical storage medium.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the general activity status of this physical storage medium.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the general activity status of this physical storage medium.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public PhysicalMedium withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the time since boot in hours. This MAY reflect S.M.A.R.T. PowerOnHours.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUptime() {
		return uptime;
	}

	/**
	 * Set the time since boot in hours. This MAY reflect S.M.A.R.T. PowerOnHours.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 */
	public void  setUptime(Long uptime) {
		this.uptime = uptime;
	}

	/**
	 * Set the time since boot in hours. This MAY reflect S.M.A.R.T. PowerOnHours.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 * @return this instance
	 */
	public PhysicalMedium withUptime(Long uptime) {
		this.uptime = uptime;
		return this;
	}

	/**
	 * Get the is this physical medium capable of reporting S.M.A.R.T. statistics?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isSmaRTCapable() {
		return smaRTCapable;
	}

	/**
	 * Set the is this physical medium capable of reporting S.M.A.R.T. statistics?
	 *
	 * @since 1.0
	 * @param smaRTCapable the input value
	 */
	public void  setSmaRTCapable(Boolean smaRTCapable) {
		this.smaRTCapable = smaRTCapable;
	}

	/**
	 * Set the is this physical medium capable of reporting S.M.A.R.T. statistics?
	 *
	 * @since 1.0
	 * @param smaRTCapable the input value
	 * @return this instance
	 */
	public PhysicalMedium withSmaRTCapable(Boolean smaRTCapable) {
		this.smaRTCapable = smaRTCapable;
		return this;
	}

	/**
	 * Get the general health of this physical storage medium.  {{enum}}

Note: Health MAY be obtained from S.M.A.R.T. data where available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHealth() {
		return health;
	}

	/**
	 * Set the general health of this physical storage medium.  {{enum}}

Note: Health MAY be obtained from S.M.A.R.T. data where available.
	 *
	 * @since 1.0
	 * @param health the input value
	 */
	public void  setHealth(String health) {
		this.health = health;
	}

	/**
	 * Set the general health of this physical storage medium.  {{enum}}

Note: Health MAY be obtained from S.M.A.R.T. data where available.
	 *
	 * @since 1.0
	 * @param health the input value
	 * @return this instance
	 */
	public PhysicalMedium withHealth(String health) {
		this.health = health;
		return this;
	}

	/**
	 * Get the is this physical medium capable of being removed while the device is powered up?  Hot-Swappable storage does not imply Removable storage; hot-swappable is an operation taken only when the disk has failed and needs to be replaced.  The data on the hot-swapped storage will not remain intact.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHotSwappable() {
		return hotSwappable;
	}

	/**
	 * Set the is this physical medium capable of being removed while the device is powered up?  Hot-Swappable storage does not imply Removable storage; hot-swappable is an operation taken only when the disk has failed and needs to be replaced.  The data on the hot-swapped storage will not remain intact.
	 *
	 * @since 1.0
	 * @param hotSwappable the input value
	 */
	public void  setHotSwappable(Boolean hotSwappable) {
		this.hotSwappable = hotSwappable;
	}

	/**
	 * Set the is this physical medium capable of being removed while the device is powered up?  Hot-Swappable storage does not imply Removable storage; hot-swappable is an operation taken only when the disk has failed and needs to be replaced.  The data on the hot-swapped storage will not remain intact.
	 *
	 * @since 1.0
	 * @param hotSwappable the input value
	 * @return this instance
	 */
	public PhysicalMedium withHotSwappable(Boolean hotSwappable) {
		this.hotSwappable = hotSwappable;
		return this;
	}

	//</editor-fold>

}