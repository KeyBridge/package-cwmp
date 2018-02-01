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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr140.datatypes.Alias;
import org.broadbandforum.tr140.storageservice.logicalvolume.Folder;

	/**
	 * This object provides information about each logical volume configured on this device.  A logical volume can reside either on an instance of a single {{object|.PhysicalMedium.{i}.}} or on an instance of a single {{object|.StorageArray.{i}.}} instance, but it can not span multiple instances of either. {{param|PhysicalReference}} is used to define where this {{object}} instance resides.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.  Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.LogicalVolume.{i}.")
public class LogicalVolume {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The name of the partition for this logical volume.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance. This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances to use the same {{param}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * The current status of this Logical Volume. {{enum}}

The default {{enum|Offline}} status will exist until this {{object}} is enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status = "Offline";
	/**
	 * Enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Represents the physical medium or RAID where this {{object}} resides.  The {{object|.PhysicalMedium.{i}.}} or {{object|.StorageArray.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.

An AddObject followed by an enabling SetParameterValues on {{param|Name}}, {{param}}, and {{param|Capacity}} will cause the formatting of this logical partition and these parameters to become immutable for the life of this instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PhysicalReference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String physicalReference;
	/**
	 * The file system for this {{object}} as it is currently formatted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FileSystem")
	public String fileSystem;
	/**
	 * The Capacity of the Logical Volume in MB. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Capacity")
	@CWMPParameter(access = "readWrite", units = "MB")
	public Long capacity;
	/**
	 * The Amount of Used Space on the Logical Volume in MB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UsedSpace")
	@CWMPParameter(activeNotify = "canDeny", units = "MB")
	public Long usedSpace;
	/**
	 * This value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of {{param}}r is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ThresholdLimit")
	@CWMPParameter(access = "readWrite", units = "MB")
	public Long thresholdLimit = 0L;
	/**
	 * When {{param|ThresholdLimit}} > 0 and {{param|UsedSpace}} + {{param|ThresholdLimit}} >= {{param|Capacity}} this will be {{true}}, else {{false}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ThresholdReached")
	public Boolean thresholdReached = false;
	/**
	 * Is the Volume Encrypted?  The type of encryption will be handled by the device internally and is not a matter for remote management.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Encrypted")
	public Boolean encrypted;
	/**
	 * This object provides information about each top-level folder configured on this logical volume.  Each top-level folder allows the configuration of quotas and access permissions.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the {{param|Name}} configured.  Folder instances are unique per {{object|.LogicalVolume.{i}.}} and the unique key for this object is {{param|Name}} which also means that once an instance is enabled {{param|Name}} becomes immutable for the life of the instance.
	 */
	@XmlElementWrapper(name = "folders")
	@XmlElement(name = "Folder")
	@CWMPParameter(access = "readWrite")
	public Collection<Folder> folders;

	public LogicalVolume() {
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
	public LogicalVolume withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the partition for this logical volume.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance. This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances to use the same {{param}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the partition for this logical volume.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance. This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances to use the same {{param}}.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the partition for this logical volume.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance. This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances to use the same {{param}}.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public LogicalVolume withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the current status of this Logical Volume. {{enum}}

The default {{enum|Offline}} status will exist until this {{object}} is enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current status of this Logical Volume. {{enum}}

The default {{enum|Offline}} status will exist until this {{object}} is enabled.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current status of this Logical Volume. {{enum}}

The default {{enum|Offline}} status will exist until this {{object}} is enabled.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public LogicalVolume withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public LogicalVolume withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the represents the physical medium or RAID where this {{object}} resides.  The {{object|.PhysicalMedium.{i}.}} or {{object|.StorageArray.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.

An AddObject followed by an enabling SetParameterValues on {{param|Name}}, {{param}}, and {{param|Capacity}} will cause the formatting of this logical partition and these parameters to become immutable for the life of this instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPhysicalReference() {
		return physicalReference;
	}

	/**
	 * Set the represents the physical medium or RAID where this {{object}} resides.  The {{object|.PhysicalMedium.{i}.}} or {{object|.StorageArray.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.

An AddObject followed by an enabling SetParameterValues on {{param|Name}}, {{param}}, and {{param|Capacity}} will cause the formatting of this logical partition and these parameters to become immutable for the life of this instance.
	 *
	 * @since 1.0
	 * @param physicalReference the input value
	 */
	public void  setPhysicalReference(String physicalReference) {
		this.physicalReference = physicalReference;
	}

	/**
	 * Set the represents the physical medium or RAID where this {{object}} resides.  The {{object|.PhysicalMedium.{i}.}} or {{object|.StorageArray.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.

An AddObject followed by an enabling SetParameterValues on {{param|Name}}, {{param}}, and {{param|Capacity}} will cause the formatting of this logical partition and these parameters to become immutable for the life of this instance.
	 *
	 * @since 1.0
	 * @param physicalReference the input value
	 * @return this instance
	 */
	public LogicalVolume withPhysicalReference(String physicalReference) {
		this.physicalReference = physicalReference;
		return this;
	}

	/**
	 * Get the file system for this {{object}} as it is currently formatted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getFileSystem() {
		return fileSystem;
	}

	/**
	 * Set the file system for this {{object}} as it is currently formatted.
	 *
	 * @since 1.0
	 * @param fileSystem the input value
	 */
	public void  setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}

	/**
	 * Set the file system for this {{object}} as it is currently formatted.
	 *
	 * @since 1.0
	 * @param fileSystem the input value
	 * @return this instance
	 */
	public LogicalVolume withFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
		return this;
	}

	/**
	 * Get the Capacity of the Logical Volume in MB. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * Set the Capacity of the Logical Volume in MB. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 */
	public void  setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	/**
	 * Set the Capacity of the Logical Volume in MB. 

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 * @return this instance
	 */
	public LogicalVolume withCapacity(Long capacity) {
		this.capacity = capacity;
		return this;
	}

	/**
	 * Get the Amount of Used Space on the Logical Volume in MB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUsedSpace() {
		return usedSpace;
	}

	/**
	 * Set the Amount of Used Space on the Logical Volume in MB.
	 *
	 * @since 1.0
	 * @param usedSpace the input value
	 */
	public void  setUsedSpace(Long usedSpace) {
		this.usedSpace = usedSpace;
	}

	/**
	 * Set the Amount of Used Space on the Logical Volume in MB.
	 *
	 * @since 1.0
	 * @param usedSpace the input value
	 * @return this instance
	 */
	public LogicalVolume withUsedSpace(Long usedSpace) {
		this.usedSpace = usedSpace;
		return this;
	}

	/**
	 * Get the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of {{param}}r is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getThresholdLimit() {
		return thresholdLimit;
	}

	/**
	 * Set the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of {{param}}r is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @param thresholdLimit the input value
	 */
	public void  setThresholdLimit(Long thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
	}

	/**
	 * Set the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of {{param}}r is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @param thresholdLimit the input value
	 * @return this instance
	 */
	public LogicalVolume withThresholdLimit(Long thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
		return this;
	}

	/**
	 * Get the when {{param|ThresholdLimit}} > 0 and {{param|UsedSpace}} + {{param|ThresholdLimit}} >= {{param|Capacity}} this will be {{true}}, else {{false}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isThresholdReached() {
		return thresholdReached;
	}

	/**
	 * Set the when {{param|ThresholdLimit}} > 0 and {{param|UsedSpace}} + {{param|ThresholdLimit}} >= {{param|Capacity}} this will be {{true}}, else {{false}}.
	 *
	 * @since 1.0
	 * @param thresholdReached the input value
	 */
	public void  setThresholdReached(Boolean thresholdReached) {
		this.thresholdReached = thresholdReached;
	}

	/**
	 * Set the when {{param|ThresholdLimit}} > 0 and {{param|UsedSpace}} + {{param|ThresholdLimit}} >= {{param|Capacity}} this will be {{true}}, else {{false}}.
	 *
	 * @since 1.0
	 * @param thresholdReached the input value
	 * @return this instance
	 */
	public LogicalVolume withThresholdReached(Boolean thresholdReached) {
		this.thresholdReached = thresholdReached;
		return this;
	}

	/**
	 * Get the is the Volume Encrypted?  The type of encryption will be handled by the device internally and is not a matter for remote management.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEncrypted() {
		return encrypted;
	}

	/**
	 * Set the is the Volume Encrypted?  The type of encryption will be handled by the device internally and is not a matter for remote management.
	 *
	 * @since 1.0
	 * @param encrypted the input value
	 */
	public void  setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	/**
	 * Set the is the Volume Encrypted?  The type of encryption will be handled by the device internally and is not a matter for remote management.
	 *
	 * @since 1.0
	 * @param encrypted the input value
	 * @return this instance
	 */
	public LogicalVolume withEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		return this;
	}

	/**
	 * Get the this object provides information about each top-level folder configured on this logical volume.  Each top-level folder allows the configuration of quotas and access permissions.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the {{param|Name}} configured.  Folder instances are unique per {{object|.LogicalVolume.{i}.}} and the unique key for this object is {{param|Name}} which also means that once an instance is enabled {{param|Name}} becomes immutable for the life of the instance.
	 *
	 * @return the value
	 */
	public Collection<Folder> getFolders() {
		if (this.folders == null){ this.folders=new ArrayList<>();}
		return folders;
	}

	/**
	 * Set the this object provides information about each top-level folder configured on this logical volume.  Each top-level folder allows the configuration of quotas and access permissions.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the {{param|Name}} configured.  Folder instances are unique per {{object|.LogicalVolume.{i}.}} and the unique key for this object is {{param|Name}} which also means that once an instance is enabled {{param|Name}} becomes immutable for the life of the instance.
	 *
	 * @param folders the input value
	 */
	public void  setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}

	/**
	 * Set the this object provides information about each top-level folder configured on this logical volume.  Each top-level folder allows the configuration of quotas and access permissions.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the {{param|Name}} configured.  Folder instances are unique per {{object|.LogicalVolume.{i}.}} and the unique key for this object is {{param|Name}} which also means that once an instance is enabled {{param|Name}} becomes immutable for the life of the instance.
	 *
	 * @param folder the input value
	 * @return this instance
	 */
	public LogicalVolume withFolder(Folder folder) {
		getFolders().add(folder);
		return this;
	}

	//</editor-fold>

}