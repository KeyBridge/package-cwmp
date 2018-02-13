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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr140.datatypes.Alias;

	/**
	 * This object provides information about each storage array (RAID) configured on this device.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}. Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.StorageArray.{i}.")
@XmlRootElement(name = "StorageService.StorageArray")
@XmlType(name = "StorageService.StorageArray")
@XmlAccessorType(XmlAccessType.FIELD)
public class StorageArray {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * A user-friendly name for this Storage Array.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * The current status of this StorageArray.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status = "Offline";
	/**
	 * Enables or disables this StorageArray instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Note that after creation of the Storage Array, any subsequent writes to this parameter MUST be ignored as array type migration is not supported.  To identify which RAID Types are supported, see {{param|.Capabilities.SupportedRaidTypes}}.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RaidType")
	@CWMPParameter(access = "readWrite")
	public String raidType = "Linear";
	/**
	 * The total Usable Capacity of the Storage Array in MB. This is computed by the system based on {{param|PhysicalMediumReference}} and {{param|RaidType}}.  Disk size is a consideration, as many RAID Types use the smallest drive in the group for calculations.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UsableCapacity")
	public Long usableCapacity;
	/**
	 * Represents the physical medium used by this RAID.  Each Physical Medium referenced by this parameter MUST exist within the same StorageService instance. A {{object|.PhysicalMedium.{i}.}} MUST only be referenced by one {{object|.StorageArray.{i}.}} instance. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PhysicalMediumReference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> physicalMediumReference;

	public StorageArray() {
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
	public StorageArray withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get a user-friendly name for this Storage Array.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set a user-friendly name for this Storage Array.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set a user-friendly name for this Storage Array.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public StorageArray withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the current status of this StorageArray.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current status of this StorageArray.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current status of this StorageArray.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public StorageArray withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the enables or disables this StorageArray instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this StorageArray instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this StorageArray instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public StorageArray withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the note that after creation of the Storage Array, any subsequent writes to this parameter MUST be ignored as array type migration is not supported.  To identify which RAID Types are supported, see {{param|.Capabilities.SupportedRaidTypes}}.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRaidType() {
		return raidType;
	}

	/**
	 * Set the note that after creation of the Storage Array, any subsequent writes to this parameter MUST be ignored as array type migration is not supported.  To identify which RAID Types are supported, see {{param|.Capabilities.SupportedRaidTypes}}.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param raidType the input value
	 */
	public void  setRaidType(String raidType) {
		this.raidType = raidType;
	}

	/**
	 * Set the note that after creation of the Storage Array, any subsequent writes to this parameter MUST be ignored as array type migration is not supported.  To identify which RAID Types are supported, see {{param|.Capabilities.SupportedRaidTypes}}.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param raidType the input value
	 * @return this instance
	 */
	public StorageArray withRaidType(String raidType) {
		this.raidType = raidType;
		return this;
	}

	/**
	 * Get the total Usable Capacity of the Storage Array in MB. This is computed by the system based on {{param|PhysicalMediumReference}} and {{param|RaidType}}.  Disk size is a consideration, as many RAID Types use the smallest drive in the group for calculations.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUsableCapacity() {
		return usableCapacity;
	}

	/**
	 * Set the total Usable Capacity of the Storage Array in MB. This is computed by the system based on {{param|PhysicalMediumReference}} and {{param|RaidType}}.  Disk size is a consideration, as many RAID Types use the smallest drive in the group for calculations.
	 *
	 * @since 1.0
	 * @param usableCapacity the input value
	 */
	public void  setUsableCapacity(Long usableCapacity) {
		this.usableCapacity = usableCapacity;
	}

	/**
	 * Set the total Usable Capacity of the Storage Array in MB. This is computed by the system based on {{param|PhysicalMediumReference}} and {{param|RaidType}}.  Disk size is a consideration, as many RAID Types use the smallest drive in the group for calculations.
	 *
	 * @since 1.0
	 * @param usableCapacity the input value
	 * @return this instance
	 */
	public StorageArray withUsableCapacity(Long usableCapacity) {
		this.usableCapacity = usableCapacity;
		return this;
	}

	/**
	 * Get the represents the physical medium used by this RAID.  Each Physical Medium referenced by this parameter MUST exist within the same StorageService instance. A {{object|.PhysicalMedium.{i}.}} MUST only be referenced by one {{object|.StorageArray.{i}.}} instance. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getPhysicalMediumReference() {
		if (this.physicalMediumReference == null){ this.physicalMediumReference=new ArrayList<>();}
		return physicalMediumReference;
	}

	/**
	 * Set the represents the physical medium used by this RAID.  Each Physical Medium referenced by this parameter MUST exist within the same StorageService instance. A {{object|.PhysicalMedium.{i}.}} MUST only be referenced by one {{object|.StorageArray.{i}.}} instance. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param physicalMediumReference the input value
	 */
	public void  setPhysicalMediumReference(Collection<String> physicalMediumReference) {
		this.physicalMediumReference = physicalMediumReference;
	}

	/**
	 * Set the represents the physical medium used by this RAID.  Each Physical Medium referenced by this parameter MUST exist within the same StorageService instance. A {{object|.PhysicalMedium.{i}.}} MUST only be referenced by one {{object|.StorageArray.{i}.}} instance. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public StorageArray withPhysicalMediumReference(String string) {
		getPhysicalMediumReference().add(string);
		return this;
	}

	//</editor-fold>

}