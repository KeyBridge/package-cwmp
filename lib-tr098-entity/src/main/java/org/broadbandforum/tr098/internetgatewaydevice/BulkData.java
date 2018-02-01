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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.bulkdata.Profile;

	/**
	 * Bulk Data collection utilizes the IPDR solution to collect data from devices based on a service specification described in {{bibref|TR-232}}.

Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.

This object provides bulk data collection capabilities and global collection settings that affect the entire device.
	 *
	 * @since 1.11
	 */
@CWMPObject(name = "InternetGatewayDevice.BulkData.")
public class BulkData {

	/**
	 * Enables or disables all collection profiles.

If {{false}}, bulk data will not be collected or reported.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the Bulk Data Collection mechanism.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Minimum reporting interval in seconds that the CPE is capable of supporting.

A value of 0 indicates no minimum reporting interval.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "MinReportingInterval")
	public Long minReportingInterval;
	/**
	 * Represents the IPDR Protocols that this device is capable of supporting.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Protocols")
	@XmlList
	public Collection<String> protocols;
	/**
	 * Represents the IPDR Encoding Types that this device is capable of supporting.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "EncodingTypes")
	@XmlList
	public Collection<String> encodingTypes;
	/**
	 * The maximum number of profiles that can exist at any given time.  Specifically, the maximum number of {{object|Profile.{i}.}} instances that the ACS can create.

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of profiles that can exist.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "MaxNumberOfProfiles")
	@Size(min = -1)
	public Integer maxNumberOfProfiles;
	/**
	 * The maximum number of parameters that can be referenced via the bulk data collection mechanism.  Specifically, the maximum number of parameters that can be referenced via {{param|Profile.{i}.Parameter.{i}.Reference}} across all Profile and Parameter instances (including the expansion of partial paths within the Reference parameter).

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of parameter that can be referenced via the bulk data collection mechanism.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "MaxNumberOfParameterReferences")
	@Size(min = -1)
	public Integer maxNumberOfParameterReferences;
	/**
	 * A set of Bulk Data Collection profiles.  

Each profile represents a bulk data report, including its own timing configuration, communications configuration, and set of parameters.  This allows the ACS to configure multiple reports to be generated at different times for different sets of data.
	 */
	@XmlElementWrapper(name = "Profiles")
	@XmlElement(name = "Profile")
	@CWMPParameter(access = "readWrite")
	public Collection<Profile> profiles;

	public BulkData() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables all collection profiles.

If {{false}}, bulk data will not be collected or reported.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables all collection profiles.

If {{false}}, bulk data will not be collected or reported.
	 *
	 * @since 1.11
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables all collection profiles.

If {{false}}, bulk data will not be collected or reported.
	 *
	 * @since 1.11
	 * @param enable the input value
	 * @return this instance
	 */
	public BulkData withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the Bulk Data Collection mechanism.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the Bulk Data Collection mechanism.
	 *
	 * @since 1.11
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the Bulk Data Collection mechanism.
	 *
	 * @since 1.11
	 * @param status the input value
	 * @return this instance
	 */
	public BulkData withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the minimum reporting interval in seconds that the CPE is capable of supporting.

A value of 0 indicates no minimum reporting interval.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Long getMinReportingInterval() {
		return minReportingInterval;
	}

	/**
	 * Set the minimum reporting interval in seconds that the CPE is capable of supporting.

A value of 0 indicates no minimum reporting interval.
	 *
	 * @since 1.11
	 * @param minReportingInterval the input value
	 */
	public void  setMinReportingInterval(Long minReportingInterval) {
		this.minReportingInterval = minReportingInterval;
	}

	/**
	 * Set the minimum reporting interval in seconds that the CPE is capable of supporting.

A value of 0 indicates no minimum reporting interval.
	 *
	 * @since 1.11
	 * @param minReportingInterval the input value
	 * @return this instance
	 */
	public BulkData withMinReportingInterval(Long minReportingInterval) {
		this.minReportingInterval = minReportingInterval;
		return this;
	}

	/**
	 * Get the represents the IPDR Protocols that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Collection<String> getProtocols() {
		if (this.protocols == null){ this.protocols=new ArrayList<>();}
		return protocols;
	}

	/**
	 * Set the represents the IPDR Protocols that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @param protocols the input value
	 */
	public void  setProtocols(Collection<String> protocols) {
		this.protocols = protocols;
	}

	/**
	 * Set the represents the IPDR Protocols that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @param string the input value
	 * @return this instance
	 */
	public BulkData withProtocols(String string) {
		getProtocols().add(string);
		return this;
	}

	/**
	 * Get the represents the IPDR Encoding Types that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Collection<String> getEncodingTypes() {
		if (this.encodingTypes == null){ this.encodingTypes=new ArrayList<>();}
		return encodingTypes;
	}

	/**
	 * Set the represents the IPDR Encoding Types that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @param encodingTypes the input value
	 */
	public void  setEncodingTypes(Collection<String> encodingTypes) {
		this.encodingTypes = encodingTypes;
	}

	/**
	 * Set the represents the IPDR Encoding Types that this device is capable of supporting.
	 *
	 * @since 1.11
	 * @param string the input value
	 * @return this instance
	 */
	public BulkData withEncodingTypes(String string) {
		getEncodingTypes().add(string);
		return this;
	}

	/**
	 * Get the maximum number of profiles that can exist at any given time.  Specifically, the maximum number of {{object|Profile.{i}.}} instances that the ACS can create.

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of profiles that can exist.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Integer getMaxNumberOfProfiles() {
		return maxNumberOfProfiles;
	}

	/**
	 * Set the maximum number of profiles that can exist at any given time.  Specifically, the maximum number of {{object|Profile.{i}.}} instances that the ACS can create.

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of profiles that can exist.
	 *
	 * @since 1.11
	 * @param maxNumberOfProfiles the input value
	 */
	public void  setMaxNumberOfProfiles(Integer maxNumberOfProfiles) {
		this.maxNumberOfProfiles = maxNumberOfProfiles;
	}

	/**
	 * Set the maximum number of profiles that can exist at any given time.  Specifically, the maximum number of {{object|Profile.{i}.}} instances that the ACS can create.

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of profiles that can exist.
	 *
	 * @since 1.11
	 * @param maxNumberOfProfiles the input value
	 * @return this instance
	 */
	public BulkData withMaxNumberOfProfiles(Integer maxNumberOfProfiles) {
		this.maxNumberOfProfiles = maxNumberOfProfiles;
		return this;
	}

	/**
	 * Get the maximum number of parameters that can be referenced via the bulk data collection mechanism.  Specifically, the maximum number of parameters that can be referenced via {{param|Profile.{i}.Parameter.{i}.Reference}} across all Profile and Parameter instances (including the expansion of partial paths within the Reference parameter).

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of parameter that can be referenced via the bulk data collection mechanism.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Integer getMaxNumberOfParameterReferences() {
		return maxNumberOfParameterReferences;
	}

	/**
	 * Set the maximum number of parameters that can be referenced via the bulk data collection mechanism.  Specifically, the maximum number of parameters that can be referenced via {{param|Profile.{i}.Parameter.{i}.Reference}} across all Profile and Parameter instances (including the expansion of partial paths within the Reference parameter).

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of parameter that can be referenced via the bulk data collection mechanism.
	 *
	 * @since 1.11
	 * @param maxNumberOfParameterReferences the input value
	 */
	public void  setMaxNumberOfParameterReferences(Integer maxNumberOfParameterReferences) {
		this.maxNumberOfParameterReferences = maxNumberOfParameterReferences;
	}

	/**
	 * Set the maximum number of parameters that can be referenced via the bulk data collection mechanism.  Specifically, the maximum number of parameters that can be referenced via {{param|Profile.{i}.Parameter.{i}.Reference}} across all Profile and Parameter instances (including the expansion of partial paths within the Reference parameter).

If the value of this parameter is -1, then it means that the CPE doesn't have a limit to the number of parameter that can be referenced via the bulk data collection mechanism.
	 *
	 * @since 1.11
	 * @param maxNumberOfParameterReferences the input value
	 * @return this instance
	 */
	public BulkData withMaxNumberOfParameterReferences(Integer maxNumberOfParameterReferences) {
		this.maxNumberOfParameterReferences = maxNumberOfParameterReferences;
		return this;
	}

	/**
	 * Get a set of Bulk Data Collection profiles.  

Each profile represents a bulk data report, including its own timing configuration, communications configuration, and set of parameters.  This allows the ACS to configure multiple reports to be generated at different times for different sets of data.
	 *
	 * @return the value
	 */
	public Collection<Profile> getProfiles() {
		if (this.profiles == null){ this.profiles=new ArrayList<>();}
		return profiles;
	}

	/**
	 * Set a set of Bulk Data Collection profiles.  

Each profile represents a bulk data report, including its own timing configuration, communications configuration, and set of parameters.  This allows the ACS to configure multiple reports to be generated at different times for different sets of data.
	 *
	 * @param profiles the input value
	 */
	public void  setProfiles(Collection<Profile> profiles) {
		this.profiles = profiles;
	}

	/**
	 * Set a set of Bulk Data Collection profiles.  

Each profile represents a bulk data report, including its own timing configuration, communications configuration, and set of parameters.  This allows the ACS to configure multiple reports to be generated at different times for different sets of data.
	 *
	 * @param profile the input value
	 * @return this instance
	 */
	public BulkData withProfile(Profile profile) {
		getProfiles().add(profile);
		return this;
	}

	//</editor-fold>

}