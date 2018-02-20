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

import java.time.LocalDateTime;
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
	 * Every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor  Configuration File.

        This table of Vendor Configuration Files is for information only and does not allow the ACS to operate on these files in any way.

        Whenever the CPE successfully downloads a configuration file as a result of the Download RPC with the FileType argument of ''3 Vendor Configuration File'', the CPE MUST update this table.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.VendorConfigFile.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"})})
@XmlRootElement(name = "Device.DeviceInfo.VendorConfigFile")
@XmlType(name = "Device.DeviceInfo.VendorConfigFile")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorConfigFile {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Name of the vendor configuration file.

          If the CPE is able to obtain the name of the configuration file from the file itself, then the value of this parameter MUST be set to that name.

          Otherwise, if the CPE can extract the file name from the URL used to download the configuration file, then the value of this  parameter MUST be set to that name.

          Otherwise, the value of this parameter MUST be set to the value of the TargetFileName argument of the Download RPC used to download this configuration file.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * A string identifying the configuration file version currently used in the CPE.

          If the CPE is able to obtain the version of the configuration file from the file itself, then the value of this parameter MUST be set to the obtained value.

          Otherwise, the value of this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Version")
	@Size(max = 16)
	public String version;
	/**
	 * Date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Date")
	public LocalDateTime date;
	/**
	 * A description of the vendor configuration file (human-readable string).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Description")
	@Size(max = 256)
	public String description;
	/**
	 * When {{true}}, this parameter indicates that this {{object}} instance is to be used for backup and restoration purposes.

          Note: The backup and restore operations may require the use of multiple {{object}} instances. In this scenario the mechanism for detemining the order and combination of {{object}} instances used for backup and restoration purposes is implementation specific.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UseForBackupRestore")
	public Boolean useForBackupRestore;

	public VendorConfigFile() {
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
	public VendorConfigFile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the vendor configuration file.

          If the CPE is able to obtain the name of the configuration file from the file itself, then the value of this parameter MUST be set to that name.

          Otherwise, if the CPE can extract the file name from the URL used to download the configuration file, then the value of this  parameter MUST be set to that name.

          Otherwise, the value of this parameter MUST be set to the value of the TargetFileName argument of the Download RPC used to download this configuration file.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the vendor configuration file.

          If the CPE is able to obtain the name of the configuration file from the file itself, then the value of this parameter MUST be set to that name.

          Otherwise, if the CPE can extract the file name from the URL used to download the configuration file, then the value of this  parameter MUST be set to that name.

          Otherwise, the value of this parameter MUST be set to the value of the TargetFileName argument of the Download RPC used to download this configuration file.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the vendor configuration file.

          If the CPE is able to obtain the name of the configuration file from the file itself, then the value of this parameter MUST be set to that name.

          Otherwise, if the CPE can extract the file name from the URL used to download the configuration file, then the value of this  parameter MUST be set to that name.

          Otherwise, the value of this parameter MUST be set to the value of the TargetFileName argument of the Download RPC used to download this configuration file.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public VendorConfigFile withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get a string identifying the configuration file version currently used in the CPE.

          If the CPE is able to obtain the version of the configuration file from the file itself, then the value of this parameter MUST be set to the obtained value.

          Otherwise, the value of this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set a string identifying the configuration file version currently used in the CPE.

          If the CPE is able to obtain the version of the configuration file from the file itself, then the value of this parameter MUST be set to the obtained value.

          Otherwise, the value of this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set a string identifying the configuration file version currently used in the CPE.

          If the CPE is able to obtain the version of the configuration file from the file itself, then the value of this parameter MUST be set to the obtained value.

          Otherwise, the value of this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param version the input value
	 * @return this instance
	 */
	public VendorConfigFile withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Set the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 2.0
	 * @param date the input value
	 */
	public void  setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Set the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 2.0
	 * @param date the input value
	 * @return this instance
	 */
	public VendorConfigFile withDate(LocalDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get a description of the vendor configuration file (human-readable string).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set a description of the vendor configuration file (human-readable string).
	 *
	 * @since 2.0
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set a description of the vendor configuration file (human-readable string).
	 *
	 * @since 2.0
	 * @param description the input value
	 * @return this instance
	 */
	public VendorConfigFile withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the when {{true}}, this parameter indicates that this {{object}} instance is to be used for backup and restoration purposes.

          Note: The backup and restore operations may require the use of multiple {{object}} instances. In this scenario the mechanism for detemining the order and combination of {{object}} instances used for backup and restoration purposes is implementation specific.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isUseForBackupRestore() {
		return useForBackupRestore;
	}

	/**
	 * Set the when {{true}}, this parameter indicates that this {{object}} instance is to be used for backup and restoration purposes.

          Note: The backup and restore operations may require the use of multiple {{object}} instances. In this scenario the mechanism for detemining the order and combination of {{object}} instances used for backup and restoration purposes is implementation specific.
	 *
	 * @since 2.7
	 * @param useForBackupRestore the input value
	 */
	public void  setUseForBackupRestore(Boolean useForBackupRestore) {
		this.useForBackupRestore = useForBackupRestore;
	}

	/**
	 * Set the when {{true}}, this parameter indicates that this {{object}} instance is to be used for backup and restoration purposes.

          Note: The backup and restore operations may require the use of multiple {{object}} instances. In this scenario the mechanism for detemining the order and combination of {{object}} instances used for backup and restoration purposes is implementation specific.
	 *
	 * @since 2.7
	 * @param useForBackupRestore the input value
	 * @return this instance
	 */
	public VendorConfigFile withUseForBackupRestore(Boolean useForBackupRestore) {
		this.useForBackupRestore = useForBackupRestore;
		return this;
	}

	//</editor-fold>

}