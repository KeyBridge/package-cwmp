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
package org.broadbandforum.tr181.device.wifi;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.wifi.endpoint.AC;
import org.broadbandforum.tr181.device.wifi.endpoint.Profile;
import org.broadbandforum.tr181.device.wifi.endpoint.Security;
import org.broadbandforum.tr181.device.wifi.endpoint.Stats;
import org.broadbandforum.tr181.device.wifi.endpoint.WPS;

	/**
	 * This object models an 802.11 connection from the perspective of a wireless end point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter, and an associated active {{object|Profile}} instance via the {{param|ProfileReference}} parameter. The active profile is responsible for specifying the actual SSID and security settings used by the end point.

        For enabled table entries, if {{param|SSIDReference}} or {{param|ProfileReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.")
public class EndPoint {

	/**
	 * Enables or disables this end point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates the status of this end point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}} This is the currently active profile, which specifies the SSID and security settings to be used by the end point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProfileReference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String profileReference;
	/**
	 * {{reference}} {{param}} is determined based on the {{param|Profile.{i}.SSID}} within the associated {{param|ProfileReference}}) endpoint profile. {{param}} MUST be {{empty}} if {{param|ProfileReference}} is {{empty}} (i.e. only when an active profile is assigned can the associated SSID interface be determined).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSIDReference")
	@Size(max = 256)
	public String ssiDReference;
	/**
	 * Throughput statistics for this end point.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This object contains security related parameters that apply to a WiFi end point {{bibref|802.11-2007}}.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * EndPoint Profile table.
	 */
	@XmlElementWrapper(name = "Profiles")
	@XmlElement(name = "Profile")
	@CWMPParameter(access = "readWrite")
	public Collection<Profile> profiles;
	/**
	 * This object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this end point.
	 */
	@XmlElement(name = "WPS")
	public WPS wps;
	/**
	 * This object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 */
	@XmlElementWrapper(name = "ACs")
	@XmlElement(name = "AC")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<AC> acs;

	public EndPoint() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this end point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this end point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this end point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public EndPoint withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this end point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this end point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this end point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public EndPoint withStatus(String status) {
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
	public EndPoint withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} This is the currently active profile, which specifies the SSID and security settings to be used by the end point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProfileReference() {
		return profileReference;
	}

	/**
	 * Set the {{reference}} This is the currently active profile, which specifies the SSID and security settings to be used by the end point.
	 *
	 * @since 2.0
	 * @param profileReference the input value
	 */
	public void  setProfileReference(String profileReference) {
		this.profileReference = profileReference;
	}

	/**
	 * Set the {{reference}} This is the currently active profile, which specifies the SSID and security settings to be used by the end point.
	 *
	 * @since 2.0
	 * @param profileReference the input value
	 * @return this instance
	 */
	public EndPoint withProfileReference(String profileReference) {
		this.profileReference = profileReference;
		return this;
	}

	/**
	 * Get the {{reference}} {{param}} is determined based on the {{param|Profile.{i}.SSID}} within the associated {{param|ProfileReference}}) endpoint profile. {{param}} MUST be {{empty}} if {{param|ProfileReference}} is {{empty}} (i.e. only when an active profile is assigned can the associated SSID interface be determined).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSsiDReference() {
		return ssiDReference;
	}

	/**
	 * Set the {{reference}} {{param}} is determined based on the {{param|Profile.{i}.SSID}} within the associated {{param|ProfileReference}}) endpoint profile. {{param}} MUST be {{empty}} if {{param|ProfileReference}} is {{empty}} (i.e. only when an active profile is assigned can the associated SSID interface be determined).
	 *
	 * @since 2.0
	 * @param ssiDReference the input value
	 */
	public void  setSsiDReference(String ssiDReference) {
		this.ssiDReference = ssiDReference;
	}

	/**
	 * Set the {{reference}} {{param}} is determined based on the {{param|Profile.{i}.SSID}} within the associated {{param|ProfileReference}}) endpoint profile. {{param}} MUST be {{empty}} if {{param|ProfileReference}} is {{empty}} (i.e. only when an active profile is assigned can the associated SSID interface be determined).
	 *
	 * @since 2.0
	 * @param ssiDReference the input value
	 * @return this instance
	 */
	public EndPoint withSsiDReference(String ssiDReference) {
		this.ssiDReference = ssiDReference;
		return this;
	}

	/**
	 * Get the throughput statistics for this end point.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this end point.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this end point.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public EndPoint withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this object contains security related parameters that apply to a WiFi end point {{bibref|802.11-2007}}.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a WiFi end point {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a WiFi end point {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public EndPoint withSecurity(Security security) {
		this.security = security;
		return this;
	}

	/**
	 * Get the endPoint Profile table.
	 *
	 * @return the value
	 */
	public Collection<Profile> getProfiles() {
		if (this.profiles == null){ this.profiles=new ArrayList<>();}
		return profiles;
	}

	/**
	 * Set the endPoint Profile table.
	 *
	 * @param profiles the input value
	 */
	public void  setProfiles(Collection<Profile> profiles) {
		this.profiles = profiles;
	}

	/**
	 * Set the endPoint Profile table.
	 *
	 * @param profile the input value
	 * @return this instance
	 */
	public EndPoint withProfile(Profile profile) {
		getProfiles().add(profile);
		return this;
	}

	/**
	 * Get the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this end point.
	 *
	 * @return the value
	 */
	public WPS getWps() {
		return wps;
	}

	/**
	 * Set the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this end point.
	 *
	 * @param wps the input value
	 */
	public void  setWps(WPS wps) {
		this.wps = wps;
	}

	/**
	 * Set the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this end point.
	 *
	 * @param wps the input value
	 * @return this instance
	 */
	public EndPoint withWps(WPS wps) {
		this.wps = wps;
		return this;
	}

	/**
	 * Get the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @return the value
	 */
	public Collection<AC> getAcs() {
		if (this.acs == null){ this.acs=new ArrayList<>();}
		return acs;
	}

	/**
	 * Set the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @param acs the input value
	 */
	public void  setAcs(Collection<AC> acs) {
		this.acs = acs;
	}

	/**
	 * Set the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @param ac the input value
	 * @return this instance
	 */
	public EndPoint withAC(AC ac) {
		getAcs().add(ac);
		return this;
	}

	//</editor-fold>

}