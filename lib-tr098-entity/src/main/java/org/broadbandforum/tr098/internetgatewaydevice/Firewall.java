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

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Firewall configuration object.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.Firewall.")
@XmlRootElement(name = "Firewall")
@XmlType(name = "InternetGatewayDevice.Firewall")
@XmlAccessorType(XmlAccessType.FIELD)
public class Firewall {

	/**
	 * How this firewall is configured. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Config")
	@CWMPParameter(access = "readWrite")
	public String config;
	/**
	 * A string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Version")
	@Size(max = 16)
	public String version;
	/**
	 * The time at which the firewall settings most recently changed.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "LastChange")
	public LocalDateTime lastChange;

	public Firewall() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the how this firewall is configured. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getConfig() {
		return config;
	}

	/**
	 * Set the how this firewall is configured. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param config the input value
	 */
	public void  setConfig(String config) {
		this.config = config;
	}

	/**
	 * Set the how this firewall is configured. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param config the input value
	 * @return this instance
	 */
	public Firewall withConfig(String config) {
		this.config = config;
		return this;
	}

	/**
	 * Get a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 1.5
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 1.5
	 * @param version the input value
	 * @return this instance
	 */
	public Firewall withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the time at which the firewall settings most recently changed.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public LocalDateTime getLastChange() {
		return lastChange;
	}

	/**
	 * Set the time at which the firewall settings most recently changed.
	 *
	 * @since 1.5
	 * @param lastChange the input value
	 */
	public void  setLastChange(LocalDateTime lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the time at which the firewall settings most recently changed.
	 *
	 * @since 1.5
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Firewall withLastChange(LocalDateTime lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	//</editor-fold>

}