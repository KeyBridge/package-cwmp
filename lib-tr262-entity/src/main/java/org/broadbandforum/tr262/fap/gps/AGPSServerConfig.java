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
package org.broadbandforum.tr262.fap.gps;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters for the configuration of the Assisted Global Positioning System (A-GPS) server. See also {{bibref|3GPP-TS.25.171|Section 3.2}}
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.GPS.AGPSServerConfig.")
public class AGPSServerConfig {

	/**
	 * Enables or disables the {{object}} entry.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * A-GPS server host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ServerURL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serverURL;
	/**
	 * The port to use when communicating to the A-GPS Server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long serverPort;
	/**
	 * Username to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String username;
	/**
	 * Password to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String password;
	/**
	 * This parameter specifies the reference latitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50d00.00' S would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReferenceLatitude")
	@CWMPParameter(access = "readWrite")
	@Size(min = -90000000, max = 90000000)
	public Integer referenceLatitude;
	/**
	 * This parameter specifies the reference longitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00'00'' W would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReferenceLongitude")
	@CWMPParameter(access = "readWrite")
	@Size(min = -180000000, max = 180000000)
	public Integer referenceLongitude;
	/**
	 * The value is {{true}} if the device has successfully contacted and received A-GPS info from the A-GPS server, otherwise the value is {{false}}.

After a reboot the value is {{false}} until the server could be contacted again.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ServerInUse")
	public Boolean serverInUse;

	public AGPSServerConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}} entry.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AGPSServerConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get a-gPS server host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getServerURL() {
		return serverURL;
	}

	/**
	 * Set a-gPS server host name or IP address.
	 *
	 * @since 1.0
	 * @param serverURL the input value
	 */
	public void  setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}

	/**
	 * Set a-gPS server host name or IP address.
	 *
	 * @since 1.0
	 * @param serverURL the input value
	 * @return this instance
	 */
	public AGPSServerConfig withServerURL(String serverURL) {
		this.serverURL = serverURL;
		return this;
	}

	/**
	 * Get the port to use when communicating to the A-GPS Server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getServerPort() {
		return serverPort;
	}

	/**
	 * Set the port to use when communicating to the A-GPS Server.
	 *
	 * @since 1.0
	 * @param serverPort the input value
	 */
	public void  setServerPort(Long serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * Set the port to use when communicating to the A-GPS Server.
	 *
	 * @since 1.0
	 * @param serverPort the input value
	 * @return this instance
	 */
	public AGPSServerConfig withServerPort(Long serverPort) {
		this.serverPort = serverPort;
		return this;
	}

	/**
	 * Get the username to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public AGPSServerConfig withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password to be used by the device to authenticate with the A-GPS server. This string is set to {{empty}} if no authentication is used.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public AGPSServerConfig withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the this parameter specifies the reference latitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50d00.00' S would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getReferenceLatitude() {
		return referenceLatitude;
	}

	/**
	 * Set the this parameter specifies the reference latitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50d00.00' S would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @param referenceLatitude the input value
	 */
	public void  setReferenceLatitude(Integer referenceLatitude) {
		this.referenceLatitude = referenceLatitude;
	}

	/**
	 * Set the this parameter specifies the reference latitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50d00.00' S would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @param referenceLatitude the input value
	 * @return this instance
	 */
	public AGPSServerConfig withReferenceLatitude(Integer referenceLatitude) {
		this.referenceLatitude = referenceLatitude;
		return this;
	}

	/**
	 * Get the this parameter specifies the reference longitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00'00'' W would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getReferenceLongitude() {
		return referenceLongitude;
	}

	/**
	 * Set the this parameter specifies the reference longitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00'00'' W would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @param referenceLongitude the input value
	 */
	public void  setReferenceLongitude(Integer referenceLongitude) {
		this.referenceLongitude = referenceLongitude;
	}

	/**
	 * Set the this parameter specifies the reference longitude for an A-GPS request position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00'00'' W would be represented as value -50,000,000.
	 *
	 * @since 1.0
	 * @param referenceLongitude the input value
	 * @return this instance
	 */
	public AGPSServerConfig withReferenceLongitude(Integer referenceLongitude) {
		this.referenceLongitude = referenceLongitude;
		return this;
	}

	/**
	 * Get the value is {{true}} if the device has successfully contacted and received A-GPS info from the A-GPS server, otherwise the value is {{false}}.

After a reboot the value is {{false}} until the server could be contacted again.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isServerInUse() {
		return serverInUse;
	}

	/**
	 * Set the value is {{true}} if the device has successfully contacted and received A-GPS info from the A-GPS server, otherwise the value is {{false}}.

After a reboot the value is {{false}} until the server could be contacted again.
	 *
	 * @since 1.0
	 * @param serverInUse the input value
	 */
	public void  setServerInUse(Boolean serverInUse) {
		this.serverInUse = serverInUse;
	}

	/**
	 * Set the value is {{true}} if the device has successfully contacted and received A-GPS info from the A-GPS server, otherwise the value is {{false}}.

After a reboot the value is {{false}} until the server could be contacted again.
	 *
	 * @since 1.0
	 * @param serverInUse the input value
	 * @return this instance
	 */
	public AGPSServerConfig withServerInUse(Boolean serverInUse) {
		this.serverInUse = serverInUse;
		return this;
	}

	//</editor-fold>

}