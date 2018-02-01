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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Audio decoder capabilities.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.AudioDecoder.")
public class AudioDecoder {

	/**
	 * Audio standards supported by this STB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioStandards")
	@XmlList
	public Collection<String> audioStandards;

	public AudioDecoder() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get audio standards supported by this STB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioStandards() {
		if (this.audioStandards == null){ this.audioStandards=new ArrayList<>();}
		return audioStandards;
	}

	/**
	 * Set audio standards supported by this STB.
	 *
	 * @since 1.0
	 * @param audioStandards the input value
	 */
	public void  setAudioStandards(Collection<String> audioStandards) {
		this.audioStandards = audioStandards;
	}

	/**
	 * Set audio standards supported by this STB.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AudioDecoder withAudioStandards(String string) {
		getAudioStandards().add(string);
		return this;
	}

	//</editor-fold>

}