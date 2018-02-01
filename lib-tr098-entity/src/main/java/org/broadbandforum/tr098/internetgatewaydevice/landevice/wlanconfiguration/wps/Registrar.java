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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.wps;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This table lists the Registrars associated with the Access Point.

This table MUST persist across CPE reboots.  The registrar UUID is the unique key.

This object corresponds directly to the "Registrar List" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.WPS.Registrar.{i}.")
public class Registrar {

	/**
	 * If {{true}}, the registrar can be used by the Access Point for WPS procedures.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * UUID of the registrar. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. ''f81d4fae-7dec-11d0-a765-00a0c91e6bf6''.

This parameter corresponds directly to the "UUID-R" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UUID")
	@Size(max = 36)
	@Pattern(regexp = "[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}")
	public String uuiD;
	/**
	 * Device Name of the registrar.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DeviceName")
	@Size(max = 32)
	public String deviceName;

	public Registrar() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the if {{true}}, the registrar can be used by the Access Point for WPS procedures.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the if {{true}}, the registrar can be used by the Access Point for WPS procedures.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the if {{true}}, the registrar can be used by the Access Point for WPS procedures.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public Registrar withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public Registrar withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the uuiD of the registrar. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. ''f81d4fae-7dec-11d0-a765-00a0c91e6bf6''.

This parameter corresponds directly to the "UUID-R" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getUuiD() {
		return uuiD;
	}

	/**
	 * Set the uuiD of the registrar. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. ''f81d4fae-7dec-11d0-a765-00a0c91e6bf6''.

This parameter corresponds directly to the "UUID-R" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param uuiD the input value
	 */
	public void  setUuiD(String uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set the uuiD of the registrar. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. ''f81d4fae-7dec-11d0-a765-00a0c91e6bf6''.

This parameter corresponds directly to the "UUID-R" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param uuiD the input value
	 * @return this instance
	 */
	public Registrar withUuiD(String uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the device Name of the registrar.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * Set the device Name of the registrar.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param deviceName the input value
	 */
	public void  setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * Set the device Name of the registrar.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param deviceName the input value
	 * @return this instance
	 */
	public Registrar withDeviceName(String deviceName) {
		this.deviceName = deviceName;
		return this;
	}

	//</editor-fold>

}