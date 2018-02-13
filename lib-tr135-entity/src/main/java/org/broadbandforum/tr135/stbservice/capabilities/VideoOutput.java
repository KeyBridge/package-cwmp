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
package org.broadbandforum.tr135.stbservice.capabilities;

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
	 * Video output capabilities. The video output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoOutput.")
@XmlRootElement(name = "VideoOutput")
@XmlType(name = "STBService.Capabilities.VideoOutput")
@XmlAccessorType(XmlAccessType.FIELD)
public class VideoOutput {

	/**
	 * Analog composite video standards supported for video output.  This applies only to CVBS video output.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CompositeVideoStandards")
	@XmlList
	public Collection<String> compositeVideoStandards;
	/**
	 * Supported video output formats.  

Enumerated value must be one of [CVBS, S-Video, YPrPb, RGsB, RGB, HDMI, DVI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VideoFormats")
	@XmlList
	public Collection<String> videoFormats;
	/**
	 * Supported version of Macrovision digital content protection standard.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Macrovision")
	@Size(max = 32)
	public String macrovision;
	/**
	 * Supported version of HDCP digital content protection standard.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HDCP")
	@Size(max = 32)
	public String hdcP;
	/**
	 * Each entry is a supported display format and MUST be in the form of “x:y”, such as for example “4:3, 16:9, 14:9". {{nopattern}}
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DisplayFormats")
	@XmlList
	public Collection<String> displayFormats;

	public VideoOutput() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get analog composite video standards supported for video output.  This applies only to CVBS video output.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getCompositeVideoStandards() {
		if (this.compositeVideoStandards == null){ this.compositeVideoStandards=new ArrayList<>();}
		return compositeVideoStandards;
	}

	/**
	 * Set analog composite video standards supported for video output.  This applies only to CVBS video output.
	 *
	 * @since 1.0
	 * @param compositeVideoStandards the input value
	 */
	public void  setCompositeVideoStandards(Collection<String> compositeVideoStandards) {
		this.compositeVideoStandards = compositeVideoStandards;
	}

	/**
	 * Set analog composite video standards supported for video output.  This applies only to CVBS video output.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public VideoOutput withCompositeVideoStandards(String string) {
		getCompositeVideoStandards().add(string);
		return this;
	}

	/**
	 * Get the supported video output formats.  

Enumerated value must be one of [CVBS, S-Video, YPrPb, RGsB, RGB, HDMI, DVI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getVideoFormats() {
		if (this.videoFormats == null){ this.videoFormats=new ArrayList<>();}
		return videoFormats;
	}

	/**
	 * Set the supported video output formats.  

Enumerated value must be one of [CVBS, S-Video, YPrPb, RGsB, RGB, HDMI, DVI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param videoFormats the input value
	 */
	public void  setVideoFormats(Collection<String> videoFormats) {
		this.videoFormats = videoFormats;
	}

	/**
	 * Set the supported video output formats.  

Enumerated value must be one of [CVBS, S-Video, YPrPb, RGsB, RGB, HDMI, DVI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public VideoOutput withVideoFormats(String string) {
		getVideoFormats().add(string);
		return this;
	}

	/**
	 * Get the supported version of Macrovision digital content protection standard.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMacrovision() {
		return macrovision;
	}

	/**
	 * Set the supported version of Macrovision digital content protection standard.
	 *
	 * @since 1.0
	 * @param macrovision the input value
	 */
	public void  setMacrovision(String macrovision) {
		this.macrovision = macrovision;
	}

	/**
	 * Set the supported version of Macrovision digital content protection standard.
	 *
	 * @since 1.0
	 * @param macrovision the input value
	 * @return this instance
	 */
	public VideoOutput withMacrovision(String macrovision) {
		this.macrovision = macrovision;
		return this;
	}

	/**
	 * Get the supported version of HDCP digital content protection standard.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHdcP() {
		return hdcP;
	}

	/**
	 * Set the supported version of HDCP digital content protection standard.
	 *
	 * @since 1.0
	 * @param hdcP the input value
	 */
	public void  setHdcP(String hdcP) {
		this.hdcP = hdcP;
	}

	/**
	 * Set the supported version of HDCP digital content protection standard.
	 *
	 * @since 1.0
	 * @param hdcP the input value
	 * @return this instance
	 */
	public VideoOutput withHdcP(String hdcP) {
		this.hdcP = hdcP;
		return this;
	}

	/**
	 * Get the each entry is a supported display format and MUST be in the form of “x:y”, such as for example “4:3, 16:9, 14:9". {{nopattern}}
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getDisplayFormats() {
		if (this.displayFormats == null){ this.displayFormats=new ArrayList<>();}
		return displayFormats;
	}

	/**
	 * Set the each entry is a supported display format and MUST be in the form of “x:y”, such as for example “4:3, 16:9, 14:9". {{nopattern}}
	 *
	 * @since 1.1
	 * @param displayFormats the input value
	 */
	public void  setDisplayFormats(Collection<String> displayFormats) {
		this.displayFormats = displayFormats;
	}

	/**
	 * Set the each entry is a supported display format and MUST be in the form of “x:y”, such as for example “4:3, 16:9, 14:9". {{nopattern}}
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public VideoOutput withDisplayFormats(String string) {
		getDisplayFormats().add(string);
		return this;
	}

	//</editor-fold>

}