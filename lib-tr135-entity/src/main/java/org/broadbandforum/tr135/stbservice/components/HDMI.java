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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr135.stbservice.components.hdmi.DisplayDevice;

	/**
	 * HDMI instance table. This object allows configuration of the STB’s HDMI output.
	 *
	 * @since TR135 v1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.HDMI.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.Components.HDMI")
@XmlType(name = "STBService.Components.HDMI")
@XmlAccessorType(XmlAccessType.FIELD)
public class HDMI {

	/**
	 * Enables or disables the HDMI output.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of HDMI output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
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
	 * Human-readable name associated with this output.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * The resolution mode of the HDMI output.

In {{enum|Auto}} mode, the resolution is automatically set at the best format via HDMI protocols. 

In {{enum|Manual}} mode, the resolution to be applied to the HDMI output is given by the ResolutionValue parameter.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ResolutionMode")
	@CWMPParameter(access = "readWrite")
	public String resolutionMode;
	/**
	 * When {{param|ResolutionMode}} is set to {{enum|Manual|ResolutionMode}} mode, a write action configures the resolution to be applied to the HDMI output, 

When {{param|ResolutionMode}} is set to {{enum|Auto|ResolutionMode}}, a write action as no effect.

A read action provides the current resolution of the HDMI output.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ResolutionValue")
	@CWMPParameter(access = "readWrite")
	public String resolutionValue;
	/**
	 * HDMI connected display device configuration. This object provides parameters from the HDMI connected device if any.
	 */
	@XmlElement(name = "DisplayDevice")
	public DisplayDevice displayDevice;

	public HDMI() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the HDMI output.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the HDMI output.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the HDMI output.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public HDMI withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of HDMI output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of HDMI output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of HDMI output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 * @return this instance
	 */
	public HDMI withStatus(String status) {
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
	public HDMI withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public HDMI withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the resolution mode of the HDMI output.

In {{enum|Auto}} mode, the resolution is automatically set at the best format via HDMI protocols. 

In {{enum|Manual}} mode, the resolution to be applied to the HDMI output is given by the ResolutionValue parameter.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getResolutionMode() {
		return resolutionMode;
	}

	/**
	 * Set the resolution mode of the HDMI output.

In {{enum|Auto}} mode, the resolution is automatically set at the best format via HDMI protocols. 

In {{enum|Manual}} mode, the resolution to be applied to the HDMI output is given by the ResolutionValue parameter.
	 *
	 * @since 1.1
	 * @param resolutionMode the input value
	 */
	public void  setResolutionMode(String resolutionMode) {
		this.resolutionMode = resolutionMode;
	}

	/**
	 * Set the resolution mode of the HDMI output.

In {{enum|Auto}} mode, the resolution is automatically set at the best format via HDMI protocols. 

In {{enum|Manual}} mode, the resolution to be applied to the HDMI output is given by the ResolutionValue parameter.
	 *
	 * @since 1.1
	 * @param resolutionMode the input value
	 * @return this instance
	 */
	public HDMI withResolutionMode(String resolutionMode) {
		this.resolutionMode = resolutionMode;
		return this;
	}

	/**
	 * Get the when {{param|ResolutionMode}} is set to {{enum|Manual|ResolutionMode}} mode, a write action configures the resolution to be applied to the HDMI output, 

When {{param|ResolutionMode}} is set to {{enum|Auto|ResolutionMode}}, a write action as no effect.

A read action provides the current resolution of the HDMI output.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getResolutionValue() {
		return resolutionValue;
	}

	/**
	 * Set the when {{param|ResolutionMode}} is set to {{enum|Manual|ResolutionMode}} mode, a write action configures the resolution to be applied to the HDMI output, 

When {{param|ResolutionMode}} is set to {{enum|Auto|ResolutionMode}}, a write action as no effect.

A read action provides the current resolution of the HDMI output.
	 *
	 * @since 1.1
	 * @param resolutionValue the input value
	 */
	public void  setResolutionValue(String resolutionValue) {
		this.resolutionValue = resolutionValue;
	}

	/**
	 * Set the when {{param|ResolutionMode}} is set to {{enum|Manual|ResolutionMode}} mode, a write action configures the resolution to be applied to the HDMI output, 

When {{param|ResolutionMode}} is set to {{enum|Auto|ResolutionMode}}, a write action as no effect.

A read action provides the current resolution of the HDMI output.
	 *
	 * @since 1.1
	 * @param resolutionValue the input value
	 * @return this instance
	 */
	public HDMI withResolutionValue(String resolutionValue) {
		this.resolutionValue = resolutionValue;
		return this;
	}

	/**
	 * Get the hdmI connected display device configuration. This object provides parameters from the HDMI connected device if any.
	 *
	 * @return the value
	 */
	public DisplayDevice getDisplayDevice() {
		return displayDevice;
	}

	/**
	 * Set the hdmI connected display device configuration. This object provides parameters from the HDMI connected device if any.
	 *
	 * @param displayDevice the input value
	 */
	public void  setDisplayDevice(DisplayDevice displayDevice) {
		this.displayDevice = displayDevice;
	}

	/**
	 * Set the hdmI connected display device configuration. This object provides parameters from the HDMI connected device if any.
	 *
	 * @param displayDevice the input value
	 * @return this instance
	 */
	public HDMI withDisplayDevice(DisplayDevice displayDevice) {
		this.displayDevice = displayDevice;
		return this;
	}

	//</editor-fold>

}