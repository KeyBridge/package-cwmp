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
package org.broadbandforum.tr135.stbservice.components.hdmi;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * HDMI connected display device configuration. This object provides parameters from the HDMI connected device if any.
	 *
	 * @since TR135 v1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.HDMI.{i}.DisplayDevice.")
@XmlRootElement(name = "STBService.Components.HDMI.DisplayDevice")
@XmlType(name = "STBService.Components.HDMI.DisplayDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class DisplayDevice {

	/**
	 * The status of the connected HDMI Display device.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Human-readable name associated with this display device.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Enhanced Extended Display Information Data (E-EDID) retrieved from the connected HDMI device.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EEDID")
	public byte[] eedID;
	/**
	 * Each entry is a supported resolution of the connected HDMI device and MUST be one element of  {{param|.Capabilities.HDMI.SupportedResolutions}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SupportedResolutions")
	@XmlList
	public Collection<String> supportedResolutions;
	/**
	 * Preferred connected HDMI device resolution format.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PreferredResolution")
	public String preferredResolution;
	/**
	 * Video latency, in milliseconds, being applied in the connected HDMI device. This parameter is extracted from the E-EDID and can be used to compensate the video latency to preserve lipsync.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VideoLatency")
	public Long videoLatency;
	/**
	 * When set to {{true}}, indicates the connected HDMI device is supporting HDMI-CEC features.

When set to {{false}}, indicates the connected HDMI device does not support HDMI CEC.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CECSupport")
	public Boolean cecSupport;
	/**
	 * When set to {{true}}, indicates the connected display device supports auto lip synchronization. This mode consists in communicating over HDMI, the delay to be applied by the STB to the audio in order to preserve the lip sync.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AutoLipSyncSupport")
	public Boolean autoLipSyncSupport;
	/**
	 * When set to {{true}}, indicates the connected display device supports the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "HDMI3DPresent")
	public Boolean hdmI3DPresent;

	public DisplayDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the connected HDMI Display device.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the connected HDMI Display device.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the connected HDMI Display device.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 * @return this instance
	 */
	public DisplayDevice withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the human-readable name associated with this display device.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this display device.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this display device.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public DisplayDevice withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the enhanced Extended Display Information Data (E-EDID) retrieved from the connected HDMI device.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public byte[] getEedID() {
		return eedID;
	}

	/**
	 * Set the enhanced Extended Display Information Data (E-EDID) retrieved from the connected HDMI device.
	 *
	 * @since 1.1
	 * @param eedID the input value
	 */
	public void  setEedID(byte[] eedID) {
		this.eedID = eedID;
	}

	/**
	 * Set the enhanced Extended Display Information Data (E-EDID) retrieved from the connected HDMI device.
	 *
	 * @since 1.1
	 * @param eedID the input value
	 * @return this instance
	 */
	public DisplayDevice withEedID(byte[] eedID) {
		this.eedID = eedID;
		return this;
	}

	/**
	 * Get the each entry is a supported resolution of the connected HDMI device and MUST be one element of  {{param|.Capabilities.HDMI.SupportedResolutions}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getSupportedResolutions() {
		if (this.supportedResolutions == null){ this.supportedResolutions=new ArrayList<>();}
		return supportedResolutions;
	}

	/**
	 * Set the each entry is a supported resolution of the connected HDMI device and MUST be one element of  {{param|.Capabilities.HDMI.SupportedResolutions}}.
	 *
	 * @since 1.1
	 * @param supportedResolutions the input value
	 */
	public void  setSupportedResolutions(Collection<String> supportedResolutions) {
		this.supportedResolutions = supportedResolutions;
	}

	/**
	 * Set the each entry is a supported resolution of the connected HDMI device and MUST be one element of  {{param|.Capabilities.HDMI.SupportedResolutions}}.
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public DisplayDevice withSupportedResolutions(String string) {
		getSupportedResolutions().add(string);
		return this;
	}

	/**
	 * Get the preferred connected HDMI device resolution format.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getPreferredResolution() {
		return preferredResolution;
	}

	/**
	 * Set the preferred connected HDMI device resolution format.
	 *
	 * @since 1.1
	 * @param preferredResolution the input value
	 */
	public void  setPreferredResolution(String preferredResolution) {
		this.preferredResolution = preferredResolution;
	}

	/**
	 * Set the preferred connected HDMI device resolution format.
	 *
	 * @since 1.1
	 * @param preferredResolution the input value
	 * @return this instance
	 */
	public DisplayDevice withPreferredResolution(String preferredResolution) {
		this.preferredResolution = preferredResolution;
		return this;
	}

	/**
	 * Get the video latency, in milliseconds, being applied in the connected HDMI device. This parameter is extracted from the E-EDID and can be used to compensate the video latency to preserve lipsync.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getVideoLatency() {
		return videoLatency;
	}

	/**
	 * Set the video latency, in milliseconds, being applied in the connected HDMI device. This parameter is extracted from the E-EDID and can be used to compensate the video latency to preserve lipsync.
	 *
	 * @since 1.1
	 * @param videoLatency the input value
	 */
	public void  setVideoLatency(Long videoLatency) {
		this.videoLatency = videoLatency;
	}

	/**
	 * Set the video latency, in milliseconds, being applied in the connected HDMI device. This parameter is extracted from the E-EDID and can be used to compensate the video latency to preserve lipsync.
	 *
	 * @since 1.1
	 * @param videoLatency the input value
	 * @return this instance
	 */
	public DisplayDevice withVideoLatency(Long videoLatency) {
		this.videoLatency = videoLatency;
		return this;
	}

	/**
	 * Get the when set to {{true}}, indicates the connected HDMI device is supporting HDMI-CEC features.

When set to {{false}}, indicates the connected HDMI device does not support HDMI CEC.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isCecSupport() {
		return cecSupport;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected HDMI device is supporting HDMI-CEC features.

When set to {{false}}, indicates the connected HDMI device does not support HDMI CEC.
	 *
	 * @since 1.1
	 * @param cecSupport the input value
	 */
	public void  setCecSupport(Boolean cecSupport) {
		this.cecSupport = cecSupport;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected HDMI device is supporting HDMI-CEC features.

When set to {{false}}, indicates the connected HDMI device does not support HDMI CEC.
	 *
	 * @since 1.1
	 * @param cecSupport the input value
	 * @return this instance
	 */
	public DisplayDevice withCecSupport(Boolean cecSupport) {
		this.cecSupport = cecSupport;
		return this;
	}

	/**
	 * Get the when set to {{true}}, indicates the connected display device supports auto lip synchronization. This mode consists in communicating over HDMI, the delay to be applied by the STB to the audio in order to preserve the lip sync.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isAutoLipSyncSupport() {
		return autoLipSyncSupport;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected display device supports auto lip synchronization. This mode consists in communicating over HDMI, the delay to be applied by the STB to the audio in order to preserve the lip sync.
	 *
	 * @since 1.1
	 * @param autoLipSyncSupport the input value
	 */
	public void  setAutoLipSyncSupport(Boolean autoLipSyncSupport) {
		this.autoLipSyncSupport = autoLipSyncSupport;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected display device supports auto lip synchronization. This mode consists in communicating over HDMI, the delay to be applied by the STB to the audio in order to preserve the lip sync.
	 *
	 * @since 1.1
	 * @param autoLipSyncSupport the input value
	 * @return this instance
	 */
	public DisplayDevice withAutoLipSyncSupport(Boolean autoLipSyncSupport) {
		this.autoLipSyncSupport = autoLipSyncSupport;
		return this;
	}

	/**
	 * Get the when set to {{true}}, indicates the connected display device supports the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isHdmI3DPresent() {
		return hdmI3DPresent;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected display device supports the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param hdmI3DPresent the input value
	 */
	public void  setHdmI3DPresent(Boolean hdmI3DPresent) {
		this.hdmI3DPresent = hdmI3DPresent;
	}

	/**
	 * Set the when set to {{true}}, indicates the connected display device supports the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param hdmI3DPresent the input value
	 * @return this instance
	 */
	public DisplayDevice withHdmI3DPresent(Boolean hdmI3DPresent) {
		this.hdmI3DPresent = hdmI3DPresent;
		return this;
	}

	//</editor-fold>

}