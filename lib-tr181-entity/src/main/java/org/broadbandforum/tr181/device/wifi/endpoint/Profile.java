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
package org.broadbandforum.tr181.device.wifi.endpoint;

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
import org.broadbandforum.tr181.device.wifi.endpoint.profile.Security;

	/**
	 * EndPoint Profile table.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.Profile.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"SSID", "Location", "Priority"})})
@XmlRootElement(name = "Device.WiFi.EndPoint.Profile")
@XmlType(name = "Device.WiFi.EndPoint.Profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {

	/**
	 * Enables or disables this Profile.

          When there are multiple WiFi EndPoint Profiles, e.g. each instance supports a different SSID and/or different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this Profile.  {{enum}}

          The {{enum|Active}} value is reserved for the instance that is actively connected. The {{enum|Available}} value represents an instance that is not currently active, but is also not disabled or in error. The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The profile identifier in use by the connection. The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as an ID for joining a particular radio network (BSS).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String ssiD;
	/**
	 * Location of the profile. This value serves as a reminder from the user, describing the location of the profile. For example: "Home", "Office", "Neighbor House", "Airport", etc. An empty string is also valid.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Location")
	@CWMPParameter(access = "readWrite")
	public String location;
	/**
	 * The profile Priority defines one of the criteria used by the End Point to automatically select the "best" AP when several APs with known profiles are simultaneously available for association.

          In this situation, the End Point has to select the AP with the higher priority in its profile. If there are several APs with the same priority, providing different SSID or the same SSID, then the wireless end point has to select the APs according to other criteria like signal quality, SNR, etc.

          0 is the highest priority.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public Long priority = 0L;
	/**
	 * This object contains security related parameters that apply to a WiFi End Point profile {{bibref|802.11-2007}}.
	 */
	@XmlElement(name = "Security")
	public Security security;

	public Profile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Profile.

          When there are multiple WiFi EndPoint Profiles, e.g. each instance supports a different SSID and/or different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Profile.

          When there are multiple WiFi EndPoint Profiles, e.g. each instance supports a different SSID and/or different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Profile.

          When there are multiple WiFi EndPoint Profiles, e.g. each instance supports a different SSID and/or different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Profile withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this Profile.  {{enum}}

          The {{enum|Active}} value is reserved for the instance that is actively connected. The {{enum|Available}} value represents an instance that is not currently active, but is also not disabled or in error. The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this Profile.  {{enum}}

          The {{enum|Active}} value is reserved for the instance that is actively connected. The {{enum|Available}} value represents an instance that is not currently active, but is also not disabled or in error. The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this Profile.  {{enum}}

          The {{enum|Active}} value is reserved for the instance that is actively connected. The {{enum|Available}} value represents an instance that is not currently active, but is also not disabled or in error. The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Profile withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public Profile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the profile identifier in use by the connection. The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as an ID for joining a particular radio network (BSS).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSsiD() {
		return ssiD;
	}

	/**
	 * Set the profile identifier in use by the connection. The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as an ID for joining a particular radio network (BSS).
	 *
	 * @since 2.0
	 * @param ssiD the input value
	 */
	public void  setSsiD(String ssiD) {
		this.ssiD = ssiD;
	}

	/**
	 * Set the profile identifier in use by the connection. The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as an ID for joining a particular radio network (BSS).
	 *
	 * @since 2.0
	 * @param ssiD the input value
	 * @return this instance
	 */
	public Profile withSsiD(String ssiD) {
		this.ssiD = ssiD;
		return this;
	}

	/**
	 * Get the location of the profile. This value serves as a reminder from the user, describing the location of the profile. For example: "Home", "Office", "Neighbor House", "Airport", etc. An empty string is also valid.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the location of the profile. This value serves as a reminder from the user, describing the location of the profile. For example: "Home", "Office", "Neighbor House", "Airport", etc. An empty string is also valid.
	 *
	 * @since 2.0
	 * @param location the input value
	 */
	public void  setLocation(String location) {
		this.location = location;
	}

	/**
	 * Set the location of the profile. This value serves as a reminder from the user, describing the location of the profile. For example: "Home", "Office", "Neighbor House", "Airport", etc. An empty string is also valid.
	 *
	 * @since 2.0
	 * @param location the input value
	 * @return this instance
	 */
	public Profile withLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * Get the profile Priority defines one of the criteria used by the End Point to automatically select the "best" AP when several APs with known profiles are simultaneously available for association.

          In this situation, the End Point has to select the AP with the higher priority in its profile. If there are several APs with the same priority, providing different SSID or the same SSID, then the wireless end point has to select the APs according to other criteria like signal quality, SNR, etc.

          0 is the highest priority.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the profile Priority defines one of the criteria used by the End Point to automatically select the "best" AP when several APs with known profiles are simultaneously available for association.

          In this situation, the End Point has to select the AP with the higher priority in its profile. If there are several APs with the same priority, providing different SSID or the same SSID, then the wireless end point has to select the APs according to other criteria like signal quality, SNR, etc.

          0 is the highest priority.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the profile Priority defines one of the criteria used by the End Point to automatically select the "best" AP when several APs with known profiles are simultaneously available for association.

          In this situation, the End Point has to select the AP with the higher priority in its profile. If there are several APs with the same priority, providing different SSID or the same SSID, then the wireless end point has to select the APs according to other criteria like signal quality, SNR, etc.

          0 is the highest priority.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public Profile withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the this object contains security related parameters that apply to a WiFi End Point profile {{bibref|802.11-2007}}.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a WiFi End Point profile {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a WiFi End Point profile {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public Profile withSecurity(Security security) {
		this.security = security;
		return this;
	}

	//</editor-fold>

}