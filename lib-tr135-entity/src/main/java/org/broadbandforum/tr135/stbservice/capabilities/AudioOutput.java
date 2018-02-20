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
	 * Audio output capabilities. The audio output stage may include selecting output formats, selecting output connectors, and copy protection.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.AudioOutput.")
@XmlRootElement(name = "STBService.Capabilities.AudioOutput")
@XmlType(name = "STBService.Capabilities.AudioOutput")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioOutput {

	/**
	 * Supported audio output formats.  

Enumerated value must be one of [ANALOG-MONO, ANALOG-2-CHANNELS, ANALOG-5.1-CHANNELS, DIGITAL-OPTICAL-SP/DIF, DIGITAL-COAXIAL-SP/DIF, HDMI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioFormats")
	@XmlList
	public Collection<String> audioFormats;

	public AudioOutput() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the supported audio output formats.  

Enumerated value must be one of [ANALOG-MONO, ANALOG-2-CHANNELS, ANALOG-5.1-CHANNELS, DIGITAL-OPTICAL-SP/DIF, DIGITAL-COAXIAL-SP/DIF, HDMI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioFormats() {
		if (this.audioFormats == null){ this.audioFormats=new ArrayList<>();}
		return audioFormats;
	}

	/**
	 * Set the supported audio output formats.  

Enumerated value must be one of [ANALOG-MONO, ANALOG-2-CHANNELS, ANALOG-5.1-CHANNELS, DIGITAL-OPTICAL-SP/DIF, DIGITAL-COAXIAL-SP/DIF, HDMI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param audioFormats the input value
	 */
	public void  setAudioFormats(Collection<String> audioFormats) {
		this.audioFormats = audioFormats;
	}

	/**
	 * Set the supported audio output formats.  

Enumerated value must be one of [ANALOG-MONO, ANALOG-2-CHANNELS, ANALOG-5.1-CHANNELS, DIGITAL-OPTICAL-SP/DIF, DIGITAL-COAXIAL-SP/DIF, HDMI, RF]

Note that these refer to supported output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AudioOutput withAudioFormats(String string) {
		getAudioFormats().add(string);
		return this;
	}

	//</editor-fold>

}