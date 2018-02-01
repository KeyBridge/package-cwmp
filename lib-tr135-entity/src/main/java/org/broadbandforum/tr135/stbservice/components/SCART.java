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
package org.broadbandforum.tr135.stbservice.components;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * SCART configuration. This object allows configuration of the STB's AV switching.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.SCART.{i}.")
public class SCART {

	/**
	 * Enables or disables this SCART connector.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this SCART connector.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this connector.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Enables or disables the Presence control signal (pin 8 of the SCART connector), an output from the STB to control the display device connected to the SCART.

When enabled (set to {{true}}) the STB MUST drive pin 8 to the appropriate level to indicate the output video format (SD or HD) to the connected device. 

When disabled (set to {{false}}) the STB MUST NOT drive pin 8.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Presence")
	@CWMPParameter(access = "readWrite")
	public Boolean presence;

	public SCART() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this SCART connector.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this SCART connector.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this SCART connector.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SCART withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this SCART connector.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this SCART connector.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this SCART connector.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public SCART withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public SCART withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this connector.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this connector.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this connector.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public SCART withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the enables or disables the Presence control signal (pin 8 of the SCART connector), an output from the STB to control the display device connected to the SCART.

When enabled (set to {{true}}) the STB MUST drive pin 8 to the appropriate level to indicate the output video format (SD or HD) to the connected device. 

When disabled (set to {{false}}) the STB MUST NOT drive pin 8.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPresence() {
		return presence;
	}

	/**
	 * Set the enables or disables the Presence control signal (pin 8 of the SCART connector), an output from the STB to control the display device connected to the SCART.

When enabled (set to {{true}}) the STB MUST drive pin 8 to the appropriate level to indicate the output video format (SD or HD) to the connected device. 

When disabled (set to {{false}}) the STB MUST NOT drive pin 8.
	 *
	 * @since 1.0
	 * @param presence the input value
	 */
	public void  setPresence(Boolean presence) {
		this.presence = presence;
	}

	/**
	 * Set the enables or disables the Presence control signal (pin 8 of the SCART connector), an output from the STB to control the display device connected to the SCART.

When enabled (set to {{true}}) the STB MUST drive pin 8 to the appropriate level to indicate the output video format (SD or HD) to the connected device. 

When disabled (set to {{false}}) the STB MUST NOT drive pin 8.
	 *
	 * @since 1.0
	 * @param presence the input value
	 * @return this instance
	 */
	public SCART withPresence(Boolean presence) {
		this.presence = presence;
		return this;
	}

	//</editor-fold>

}