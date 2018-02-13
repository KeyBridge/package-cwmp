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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Video output instance table.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.VideoOutput.{i}.")
@XmlRootElement(name = "VideoOutput")
@XmlType(name = "STBService.Components.VideoOutput")
@XmlAccessorType(XmlAccessType.FIELD)
public class VideoOutput {

	/**
	 * Enables or disables this video output.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this video output.  {{enum}}

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
	 * Enables or disables the color bar display.

When set to {{true}}, the CPE MUST suspend the running service currently using the video output (e.g. IPTV broadcast reception) and MUST display the color bar.

When set to {{false}}, the CPE MUST resume the previousely running service.

This parameter MUST be always initialized with the value {{false}} on STB boot.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ColorbarEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean colorbarEnable;
	/**
	 * Human-readable name associated with this Video output.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * The type of analog video standard currently in use or {{empty}} if no analog video standard is currently in use. 

Note that this parameter applies only to the CVBS output format.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CompositeVideoStandard")
	public String compositeVideoStandard;
	/**
	 * Currently active video output format, or {{empty}} if no video output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VideoFormat")
	@CWMPParameter(access = "readWrite")
	public String videoFormat;
	/**
	 * Indicates the aspect ratio behaviour for display on monitors with an aspect ratio different from that of the content, which is specified in {{param|.Components.VideoDecoder.{i}.ContentAspectRatio}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AspectRatioBehaviour")
	public String aspectRatioBehaviour;
	/**
	 * Display format being connected to this VideoOutput.

This parameter is used by the STB to determine whether an aspect ratio conversion is required.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DisplayFormat")
	@CWMPParameter(access = "readWrite")
	public String displayFormat;
	/**
	 * Indicates whether Macrovision analog protection is being used on this video output.

The Macrovision version supported is indicated in {{param|.Capabilities.VideoOutput.Macrovision}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Macrovision")
	public Boolean macrovision;
	/**
	 * Indicates whether HDCP is being used on this video output.

The HDCP version supported is indicated in {{param|.Capabilities.VideoOutput.HDCP}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HDCP")
	public Boolean hdcP;
	/**
	 * SCART object instances associated with this video output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SCARTs")
	@Size(max = 1024)
	@XmlList
	public Collection<String> scaRTs;

	public VideoOutput() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this video output.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this video output.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this video output.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VideoOutput withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this video output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this video output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this video output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public VideoOutput withStatus(String status) {
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
	public VideoOutput withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables the color bar display.

When set to {{true}}, the CPE MUST suspend the running service currently using the video output (e.g. IPTV broadcast reception) and MUST display the color bar.

When set to {{false}}, the CPE MUST resume the previousely running service.

This parameter MUST be always initialized with the value {{false}} on STB boot.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isColorbarEnable() {
		return colorbarEnable;
	}

	/**
	 * Set the enables or disables the color bar display.

When set to {{true}}, the CPE MUST suspend the running service currently using the video output (e.g. IPTV broadcast reception) and MUST display the color bar.

When set to {{false}}, the CPE MUST resume the previousely running service.

This parameter MUST be always initialized with the value {{false}} on STB boot.
	 *
	 * @since 1.1
	 * @param colorbarEnable the input value
	 */
	public void  setColorbarEnable(Boolean colorbarEnable) {
		this.colorbarEnable = colorbarEnable;
	}

	/**
	 * Set the enables or disables the color bar display.

When set to {{true}}, the CPE MUST suspend the running service currently using the video output (e.g. IPTV broadcast reception) and MUST display the color bar.

When set to {{false}}, the CPE MUST resume the previousely running service.

This parameter MUST be always initialized with the value {{false}} on STB boot.
	 *
	 * @since 1.1
	 * @param colorbarEnable the input value
	 * @return this instance
	 */
	public VideoOutput withColorbarEnable(Boolean colorbarEnable) {
		this.colorbarEnable = colorbarEnable;
		return this;
	}

	/**
	 * Get the human-readable name associated with this Video output.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this Video output.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this Video output.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public VideoOutput withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the type of analog video standard currently in use or {{empty}} if no analog video standard is currently in use. 

Note that this parameter applies only to the CVBS output format.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getCompositeVideoStandard() {
		return compositeVideoStandard;
	}

	/**
	 * Set the type of analog video standard currently in use or {{empty}} if no analog video standard is currently in use. 

Note that this parameter applies only to the CVBS output format.
	 *
	 * @since 1.0
	 * @param compositeVideoStandard the input value
	 */
	public void  setCompositeVideoStandard(String compositeVideoStandard) {
		this.compositeVideoStandard = compositeVideoStandard;
	}

	/**
	 * Set the type of analog video standard currently in use or {{empty}} if no analog video standard is currently in use. 

Note that this parameter applies only to the CVBS output format.
	 *
	 * @since 1.0
	 * @param compositeVideoStandard the input value
	 * @return this instance
	 */
	public VideoOutput withCompositeVideoStandard(String compositeVideoStandard) {
		this.compositeVideoStandard = compositeVideoStandard;
		return this;
	}

	/**
	 * Get the currently active video output format, or {{empty}} if no video output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getVideoFormat() {
		return videoFormat;
	}

	/**
	 * Set the currently active video output format, or {{empty}} if no video output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param videoFormat the input value
	 */
	public void  setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}

	/**
	 * Set the currently active video output format, or {{empty}} if no video output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param videoFormat the input value
	 * @return this instance
	 */
	public VideoOutput withVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
		return this;
	}

	/**
	 * Get the indicates the aspect ratio behaviour for display on monitors with an aspect ratio different from that of the content, which is specified in {{param|.Components.VideoDecoder.{i}.ContentAspectRatio}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAspectRatioBehaviour() {
		return aspectRatioBehaviour;
	}

	/**
	 * Set the indicates the aspect ratio behaviour for display on monitors with an aspect ratio different from that of the content, which is specified in {{param|.Components.VideoDecoder.{i}.ContentAspectRatio}}.
	 *
	 * @since 1.0
	 * @param aspectRatioBehaviour the input value
	 */
	public void  setAspectRatioBehaviour(String aspectRatioBehaviour) {
		this.aspectRatioBehaviour = aspectRatioBehaviour;
	}

	/**
	 * Set the indicates the aspect ratio behaviour for display on monitors with an aspect ratio different from that of the content, which is specified in {{param|.Components.VideoDecoder.{i}.ContentAspectRatio}}.
	 *
	 * @since 1.0
	 * @param aspectRatioBehaviour the input value
	 * @return this instance
	 */
	public VideoOutput withAspectRatioBehaviour(String aspectRatioBehaviour) {
		this.aspectRatioBehaviour = aspectRatioBehaviour;
		return this;
	}

	/**
	 * Get the display format being connected to this VideoOutput.

This parameter is used by the STB to determine whether an aspect ratio conversion is required.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDisplayFormat() {
		return displayFormat;
	}

	/**
	 * Set the display format being connected to this VideoOutput.

This parameter is used by the STB to determine whether an aspect ratio conversion is required.
	 *
	 * @since 1.1
	 * @param displayFormat the input value
	 */
	public void  setDisplayFormat(String displayFormat) {
		this.displayFormat = displayFormat;
	}

	/**
	 * Set the display format being connected to this VideoOutput.

This parameter is used by the STB to determine whether an aspect ratio conversion is required.
	 *
	 * @since 1.1
	 * @param displayFormat the input value
	 * @return this instance
	 */
	public VideoOutput withDisplayFormat(String displayFormat) {
		this.displayFormat = displayFormat;
		return this;
	}

	/**
	 * Get the indicates whether Macrovision analog protection is being used on this video output.

The Macrovision version supported is indicated in {{param|.Capabilities.VideoOutput.Macrovision}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacrovision() {
		return macrovision;
	}

	/**
	 * Set the indicates whether Macrovision analog protection is being used on this video output.

The Macrovision version supported is indicated in {{param|.Capabilities.VideoOutput.Macrovision}}.
	 *
	 * @since 1.0
	 * @param macrovision the input value
	 */
	public void  setMacrovision(Boolean macrovision) {
		this.macrovision = macrovision;
	}

	/**
	 * Set the indicates whether Macrovision analog protection is being used on this video output.

The Macrovision version supported is indicated in {{param|.Capabilities.VideoOutput.Macrovision}}.
	 *
	 * @since 1.0
	 * @param macrovision the input value
	 * @return this instance
	 */
	public VideoOutput withMacrovision(Boolean macrovision) {
		this.macrovision = macrovision;
		return this;
	}

	/**
	 * Get the indicates whether HDCP is being used on this video output.

The HDCP version supported is indicated in {{param|.Capabilities.VideoOutput.HDCP}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHdcP() {
		return hdcP;
	}

	/**
	 * Set the indicates whether HDCP is being used on this video output.

The HDCP version supported is indicated in {{param|.Capabilities.VideoOutput.HDCP}}.
	 *
	 * @since 1.0
	 * @param hdcP the input value
	 */
	public void  setHdcP(Boolean hdcP) {
		this.hdcP = hdcP;
	}

	/**
	 * Set the indicates whether HDCP is being used on this video output.

The HDCP version supported is indicated in {{param|.Capabilities.VideoOutput.HDCP}}.
	 *
	 * @since 1.0
	 * @param hdcP the input value
	 * @return this instance
	 */
	public VideoOutput withHdcP(Boolean hdcP) {
		this.hdcP = hdcP;
		return this;
	}

	/**
	 * Get the scaRT object instances associated with this video output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getScaRTs() {
		if (this.scaRTs == null){ this.scaRTs=new ArrayList<>();}
		return scaRTs;
	}

	/**
	 * Set the scaRT object instances associated with this video output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @param scaRTs the input value
	 */
	public void  setScaRTs(Collection<String> scaRTs) {
		this.scaRTs = scaRTs;
	}

	/**
	 * Set the scaRT object instances associated with this video output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public VideoOutput withScaRTs(String string) {
		getScaRTs().add(string);
		return this;
	}

	//</editor-fold>

}