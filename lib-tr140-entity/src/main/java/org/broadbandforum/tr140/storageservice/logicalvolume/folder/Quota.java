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
package org.broadbandforum.tr140.storageservice.logicalvolume.folder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object allows the configuration of per-folder storage quota management.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.LogicalVolume.{i}.Folder.{i}.Quota.")
@XmlRootElement(name = "StorageService.LogicalVolume.Folder.Quota")
@XmlType(name = "StorageService.LogicalVolume.Folder.Quota")
@XmlAccessorType(XmlAccessType.FIELD)
public class Quota {

	/**
	 * Enables or disables quota management for this folder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Maximum size in MB of the quota for this folder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Capacity")
	@CWMPParameter(access = "readWrite", units = "MB")
	public Long capacity;
	/**
	 * Current size in MB of this folder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UsedSpace")
	@CWMPParameter(activeNotify = "canDeny", units = "MB")
	public Long usedSpace;
	/**
	 * This value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of this parameter is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
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

	public Quota() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables quota management for this folder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables quota management for this folder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables quota management for this folder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Quota withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the maximum size in MB of the quota for this folder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * Set the maximum size in MB of the quota for this folder.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 */
	public void  setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	/**
	 * Set the maximum size in MB of the quota for this folder.
	 *
	 * @since 1.0
	 * @param capacity the input value
	 * @return this instance
	 */
	public Quota withCapacity(Long capacity) {
		this.capacity = capacity;
		return this;
	}

	/**
	 * Get the current size in MB of this folder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUsedSpace() {
		return usedSpace;
	}

	/**
	 * Set the current size in MB of this folder.
	 *
	 * @since 1.0
	 * @param usedSpace the input value
	 */
	public void  setUsedSpace(Long usedSpace) {
		this.usedSpace = usedSpace;
	}

	/**
	 * Set the current size in MB of this folder.
	 *
	 * @since 1.0
	 * @param usedSpace the input value
	 * @return this instance
	 */
	public Quota withUsedSpace(Long usedSpace) {
		this.usedSpace = usedSpace;
		return this;
	}

	/**
	 * Get the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of this parameter is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getThresholdLimit() {
		return thresholdLimit;
	}

	/**
	 * Set the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of this parameter is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @param thresholdLimit the input value
	 */
	public void  setThresholdLimit(Long thresholdLimit) {
		this.thresholdLimit = thresholdLimit;
	}

	/**
	 * Set the this value is specified in MB and controls when {{param|ThresholdReached}} will have its value altered.  If the value of {{param|UsedSpace}} plus the value of this parameter is greater than or equal to the value of {{param|Capacity}} then the value of {{param|ThresholdReached}} will be {{true}}, otherwise it will be {{false}}.  Setting the value of this parameter to 0 will disable the Thresholding mechanism.
	 *
	 * @since 1.0
	 * @param thresholdLimit the input value
	 * @return this instance
	 */
	public Quota withThresholdLimit(Long thresholdLimit) {
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
	public Quota withThresholdReached(Boolean thresholdReached) {
		this.thresholdReached = thresholdReached;
		return this;
	}

	//</editor-fold>

}