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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object describes the characteristics of the HDMI interface, if any.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.HDMI.")
@XmlRootElement(name = "HDMI")
@XmlType(name = "STBService.Capabilities.HDMI")
@XmlAccessorType(XmlAccessType.FIELD)
public class HDMI {

	/**
	 * Video resolutions supported for the HDMI video output. 

Enumerated value must be one of [640x480p/60Hz, 1280x720p/60Hz, 1920x1080i/60Hz, 720x480p/60Hz, 720(1440)x480i/60Hz, 1280x720p/50Hz, 1920x1080i/50Hz, 720x576p/50Hz, 720(1440)x240p/60Hz, 2880x480i/60Hz, 2880x240p/60Hz, 1440x480p/60Hz, 1920x1080p/60Hz, 720(1440)x288p/50Hz, 2880x576i/50Hz, 2880x288p/50Hz, 1440x576p/50Hz, 1920x1080p/50Hz, 1920x1080p/24Hz, 1920x1080p/25Hz, 1920x1080p/30Hz, 2880x480p/60Hz, 2880x576p/50Hz, 1920x1080i (1250 total)/50Hz, 720(1440)x480i/120Hz, 720x480p/120Hz, 1920x1080i/120Hz, 1280x720p/120Hz, 720(1440)x480i/240Hz, 720x480p/240Hz, 720(1440)x576i/100Hz, 720x576p/100Hz, 1920x1080i/100Hz, 1280x720p/100Hz, 720(1440)x576i/200Hz, 720x576p/200Hz, 1280x720p/24Hz, 1280x720p/25Hz, 1280x720p/30Hz, 1920x1080p/120Hz, 1920x1080p/100Hz]
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SupportedResolutions")
	@XmlList
	public Collection<String> supportedResolutions;
	/**
	 * Indicates whether the STB is supporting HDMI-CEC features as described in {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CECSupport")
	public Boolean cecSupport;
	/**
	 * Indicates whether the STB is supporting the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "HDMI3D")
	public Boolean hdmI3D;

	public HDMI() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the video resolutions supported for the HDMI video output. 

Enumerated value must be one of [640x480p/60Hz, 1280x720p/60Hz, 1920x1080i/60Hz, 720x480p/60Hz, 720(1440)x480i/60Hz, 1280x720p/50Hz, 1920x1080i/50Hz, 720x576p/50Hz, 720(1440)x240p/60Hz, 2880x480i/60Hz, 2880x240p/60Hz, 1440x480p/60Hz, 1920x1080p/60Hz, 720(1440)x288p/50Hz, 2880x576i/50Hz, 2880x288p/50Hz, 1440x576p/50Hz, 1920x1080p/50Hz, 1920x1080p/24Hz, 1920x1080p/25Hz, 1920x1080p/30Hz, 2880x480p/60Hz, 2880x576p/50Hz, 1920x1080i (1250 total)/50Hz, 720(1440)x480i/120Hz, 720x480p/120Hz, 1920x1080i/120Hz, 1280x720p/120Hz, 720(1440)x480i/240Hz, 720x480p/240Hz, 720(1440)x576i/100Hz, 720x576p/100Hz, 1920x1080i/100Hz, 1280x720p/100Hz, 720(1440)x576i/200Hz, 720x576p/200Hz, 1280x720p/24Hz, 1280x720p/25Hz, 1280x720p/30Hz, 1920x1080p/120Hz, 1920x1080p/100Hz]
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getSupportedResolutions() {
		if (this.supportedResolutions == null){ this.supportedResolutions=new ArrayList<>();}
		return supportedResolutions;
	}

	/**
	 * Set the video resolutions supported for the HDMI video output. 

Enumerated value must be one of [640x480p/60Hz, 1280x720p/60Hz, 1920x1080i/60Hz, 720x480p/60Hz, 720(1440)x480i/60Hz, 1280x720p/50Hz, 1920x1080i/50Hz, 720x576p/50Hz, 720(1440)x240p/60Hz, 2880x480i/60Hz, 2880x240p/60Hz, 1440x480p/60Hz, 1920x1080p/60Hz, 720(1440)x288p/50Hz, 2880x576i/50Hz, 2880x288p/50Hz, 1440x576p/50Hz, 1920x1080p/50Hz, 1920x1080p/24Hz, 1920x1080p/25Hz, 1920x1080p/30Hz, 2880x480p/60Hz, 2880x576p/50Hz, 1920x1080i (1250 total)/50Hz, 720(1440)x480i/120Hz, 720x480p/120Hz, 1920x1080i/120Hz, 1280x720p/120Hz, 720(1440)x480i/240Hz, 720x480p/240Hz, 720(1440)x576i/100Hz, 720x576p/100Hz, 1920x1080i/100Hz, 1280x720p/100Hz, 720(1440)x576i/200Hz, 720x576p/200Hz, 1280x720p/24Hz, 1280x720p/25Hz, 1280x720p/30Hz, 1920x1080p/120Hz, 1920x1080p/100Hz]
	 *
	 * @since 1.1
	 * @param supportedResolutions the input value
	 */
	public void  setSupportedResolutions(Collection<String> supportedResolutions) {
		this.supportedResolutions = supportedResolutions;
	}

	/**
	 * Set the video resolutions supported for the HDMI video output. 

Enumerated value must be one of [640x480p/60Hz, 1280x720p/60Hz, 1920x1080i/60Hz, 720x480p/60Hz, 720(1440)x480i/60Hz, 1280x720p/50Hz, 1920x1080i/50Hz, 720x576p/50Hz, 720(1440)x240p/60Hz, 2880x480i/60Hz, 2880x240p/60Hz, 1440x480p/60Hz, 1920x1080p/60Hz, 720(1440)x288p/50Hz, 2880x576i/50Hz, 2880x288p/50Hz, 1440x576p/50Hz, 1920x1080p/50Hz, 1920x1080p/24Hz, 1920x1080p/25Hz, 1920x1080p/30Hz, 2880x480p/60Hz, 2880x576p/50Hz, 1920x1080i (1250 total)/50Hz, 720(1440)x480i/120Hz, 720x480p/120Hz, 1920x1080i/120Hz, 1280x720p/120Hz, 720(1440)x480i/240Hz, 720x480p/240Hz, 720(1440)x576i/100Hz, 720x576p/100Hz, 1920x1080i/100Hz, 1280x720p/100Hz, 720(1440)x576i/200Hz, 720x576p/200Hz, 1280x720p/24Hz, 1280x720p/25Hz, 1280x720p/30Hz, 1920x1080p/120Hz, 1920x1080p/100Hz]
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public HDMI withSupportedResolutions(String string) {
		getSupportedResolutions().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the STB is supporting HDMI-CEC features as described in {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isCecSupport() {
		return cecSupport;
	}

	/**
	 * Set the indicates whether the STB is supporting HDMI-CEC features as described in {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param cecSupport the input value
	 */
	public void  setCecSupport(Boolean cecSupport) {
		this.cecSupport = cecSupport;
	}

	/**
	 * Set the indicates whether the STB is supporting HDMI-CEC features as described in {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param cecSupport the input value
	 * @return this instance
	 */
	public HDMI withCecSupport(Boolean cecSupport) {
		this.cecSupport = cecSupport;
		return this;
	}

	/**
	 * Get the indicates whether the STB is supporting the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isHdmI3D() {
		return hdmI3D;
	}

	/**
	 * Set the indicates whether the STB is supporting the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param hdmI3D the input value
	 */
	public void  setHdmI3D(Boolean hdmI3D) {
		this.hdmI3D = hdmI3D;
	}

	/**
	 * Set the indicates whether the STB is supporting the 3D video formats mandated by {{bibref|HDMI}}.
	 *
	 * @since 1.1
	 * @param hdmI3D the input value
	 * @return this instance
	 */
	public HDMI withHdmI3D(Boolean hdmI3D) {
		this.hdmI3D = hdmI3D;
		return this;
	}

	//</editor-fold>

}