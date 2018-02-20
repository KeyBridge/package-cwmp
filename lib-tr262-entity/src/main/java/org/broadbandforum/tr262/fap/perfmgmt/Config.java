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
package org.broadbandforum.tr262.fap.perfmgmt;

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
	 * This object contains parameters relating to File Management configuration for uploading of Performance Files to a designated File Server. Each table entry can be referenced by zero or more radio-specific objects contained in the FAPService instances. The periodic upload will upload data for all of the radio-specific objects that reference it.
	 *
	 * @since TR262 v1.0
	 */
@CWMPObject(name = "FAP.PerfMgmt.Config.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"URL", "PeriodicUploadInterval", "PeriodicUploadTime"})})
@XmlRootElement(name = "FAP.PerfMgmt.Config")
@XmlType(name = "FAP.PerfMgmt.Config")
@XmlAccessorType(XmlAccessType.FIELD)
public class Config {

	/**
	 * Enables or disables this entry.  If this entry is disabled then its periodic uploads are not performed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * URL specifying the destination file location. HTTP and HTTPS transports MUST be supported. Other transports MAY be supported.

This argument specifies only the destination file location, and does not indicate in any way the name or location of the local file to be uploaded.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String url;
	/**
	 * Username to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * The duration in seconds of the interval for which the device MUST create a Performance File and attempt to upload the file to {{param|URL}} if {{param|Enable}} is {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicUploadInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long periodicUploadInterval;
	/**
	 * An absolute time reference in UTC to determine when the device will initiate the periodic file upload. Each file upload MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicUploadInterval}}. 

{{param}} is used only to set the "phase" of the periodic uploads. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicUploadInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic file uploads will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value as defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the device MAY locally choose the time reference, and is REQUIRED only to adhere to the specified {{param|PeriodicUploadInterval}}.

If absolute time is not available to the device, its periodic file upload behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicUploadTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicUploadTime;

	public Config() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.  If this entry is disabled then its periodic uploads are not performed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.  If this entry is disabled then its periodic uploads are not performed.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.  If this entry is disabled then its periodic uploads are not performed.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Config withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Config withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the url specifying the destination file location. HTTP and HTTPS transports MUST be supported. Other transports MAY be supported.

This argument specifies only the destination file location, and does not indicate in any way the name or location of the local file to be uploaded.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url specifying the destination file location. HTTP and HTTPS transports MUST be supported. Other transports MAY be supported.

This argument specifies only the destination file location, and does not indicate in any way the name or location of the local file to be uploaded.
	 *
	 * @since 1.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url specifying the destination file location. HTTP and HTTPS transports MUST be supported. Other transports MAY be supported.

This argument specifies only the destination file location, and does not indicate in any way the name or location of the local file to be uploaded.
	 *
	 * @since 1.0
	 * @param url the input value
	 * @return this instance
	 */
	public Config withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the username to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public Config withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password to be used by the device to authenticate with the file server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public Config withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the duration in seconds of the interval for which the device MUST create a Performance File and attempt to upload the file to {{param|URL}} if {{param|Enable}} is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPeriodicUploadInterval() {
		return periodicUploadInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the device MUST create a Performance File and attempt to upload the file to {{param|URL}} if {{param|Enable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicUploadInterval the input value
	 */
	public void  setPeriodicUploadInterval(Long periodicUploadInterval) {
		this.periodicUploadInterval = periodicUploadInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the device MUST create a Performance File and attempt to upload the file to {{param|URL}} if {{param|Enable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicUploadInterval the input value
	 * @return this instance
	 */
	public Config withPeriodicUploadInterval(Long periodicUploadInterval) {
		this.periodicUploadInterval = periodicUploadInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the device will initiate the periodic file upload. Each file upload MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicUploadInterval}}. 

{{param}} is used only to set the "phase" of the periodic uploads. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicUploadInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic file uploads will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value as defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the device MAY locally choose the time reference, and is REQUIRED only to adhere to the specified {{param|PeriodicUploadInterval}}.

If absolute time is not available to the device, its periodic file upload behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicUploadTime() {
		return periodicUploadTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the device will initiate the periodic file upload. Each file upload MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicUploadInterval}}. 

{{param}} is used only to set the "phase" of the periodic uploads. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicUploadInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic file uploads will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value as defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the device MAY locally choose the time reference, and is REQUIRED only to adhere to the specified {{param|PeriodicUploadInterval}}.

If absolute time is not available to the device, its periodic file upload behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicUploadTime the input value
	 */
	public void  setPeriodicUploadTime(LocalDateTime periodicUploadTime) {
		this.periodicUploadTime = periodicUploadTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the device will initiate the periodic file upload. Each file upload MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicUploadInterval}}. 

{{param}} is used only to set the "phase" of the periodic uploads. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicUploadInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic file uploads will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value as defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the device MAY locally choose the time reference, and is REQUIRED only to adhere to the specified {{param|PeriodicUploadInterval}}.

If absolute time is not available to the device, its periodic file upload behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicUploadTime the input value
	 * @return this instance
	 */
	public Config withPeriodicUploadTime(LocalDateTime periodicUploadTime) {
		this.periodicUploadTime = periodicUploadTime;
		return this;
	}

	//</editor-fold>

}