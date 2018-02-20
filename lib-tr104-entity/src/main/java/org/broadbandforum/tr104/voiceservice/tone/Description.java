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
package org.broadbandforum.tr104.voiceservice.tone;

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

	/**
	 * Each entry in this table defines the contents of an individual tone.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Tone.Description.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.Tone.Description")
@XmlType(name = "VoiceService.Tone.Description")
@XmlAccessorType(XmlAccessType.FIELD)
public class Description {

	/**
	 * Enables or disables the tone entry.  If a disabled tone entry is referenced, the result is that no tone is played.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean toneEnable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Name of the tone.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String toneName;
	/**
	 * This is the {{object|#.Pattern.{i}.}} object that begins this tone. If the tone is specified by a tone file instead of a tone pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TonePattern")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tonePattern;
	/**
	 * The file name of a tone file locally present on the CPE.

An ACS MUST use the Download method with FileType="4 Tone File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a tone file.

If the tone is specified by a tone pattern instead of a tone file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneFile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String toneFile;
	/**
	 * The default number of times the data in {{param|ToneFile}} is repeated. If the value is 0 (zero) then {{param|ToneFile}} is played indefinitely.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneRepetitions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long toneRepetitions = 0L;
	/**
	 * The text to be displayed by on the screen of the VoIP device when the tone is played and no specific error message has been provided.

This parameter is applicable only for VoIP devices capable text display.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneText")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String toneText;

	public Description() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the tone entry.  If a disabled tone entry is referenced, the result is that no tone is played.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isToneEnable() {
		return toneEnable;
	}

	/**
	 * Set the enables or disables the tone entry.  If a disabled tone entry is referenced, the result is that no tone is played.
	 *
	 * @since 2.0
	 * @param toneEnable the input value
	 */
	public void  setToneEnable(Boolean toneEnable) {
		this.toneEnable = toneEnable;
	}

	/**
	 * Set the enables or disables the tone entry.  If a disabled tone entry is referenced, the result is that no tone is played.
	 *
	 * @since 2.0
	 * @param toneEnable the input value
	 * @return this instance
	 */
	public Description withToneEnable(Boolean toneEnable) {
		this.toneEnable = toneEnable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Description withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the tone.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getToneName() {
		return toneName;
	}

	/**
	 * Set the name of the tone.
	 *
	 * @since 2.0
	 * @param toneName the input value
	 */
	public void  setToneName(String toneName) {
		this.toneName = toneName;
	}

	/**
	 * Set the name of the tone.
	 *
	 * @since 2.0
	 * @param toneName the input value
	 * @return this instance
	 */
	public Description withToneName(String toneName) {
		this.toneName = toneName;
		return this;
	}

	/**
	 * Get the this is the {{object|#.Pattern.{i}.}} object that begins this tone. If the tone is specified by a tone file instead of a tone pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTonePattern() {
		return tonePattern;
	}

	/**
	 * Set the this is the {{object|#.Pattern.{i}.}} object that begins this tone. If the tone is specified by a tone file instead of a tone pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param tonePattern the input value
	 */
	public void  setTonePattern(String tonePattern) {
		this.tonePattern = tonePattern;
	}

	/**
	 * Set the this is the {{object|#.Pattern.{i}.}} object that begins this tone. If the tone is specified by a tone file instead of a tone pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param tonePattern the input value
	 * @return this instance
	 */
	public Description withTonePattern(String tonePattern) {
		this.tonePattern = tonePattern;
		return this;
	}

	/**
	 * Get the file name of a tone file locally present on the CPE.

An ACS MUST use the Download method with FileType="4 Tone File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a tone file.

If the tone is specified by a tone pattern instead of a tone file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getToneFile() {
		return toneFile;
	}

	/**
	 * Set the file name of a tone file locally present on the CPE.

An ACS MUST use the Download method with FileType="4 Tone File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a tone file.

If the tone is specified by a tone pattern instead of a tone file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param toneFile the input value
	 */
	public void  setToneFile(String toneFile) {
		this.toneFile = toneFile;
	}

	/**
	 * Set the file name of a tone file locally present on the CPE.

An ACS MUST use the Download method with FileType="4 Tone File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a tone file.

If the tone is specified by a tone pattern instead of a tone file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param toneFile the input value
	 * @return this instance
	 */
	public Description withToneFile(String toneFile) {
		this.toneFile = toneFile;
		return this;
	}

	/**
	 * Get the default number of times the data in {{param|ToneFile}} is repeated. If the value is 0 (zero) then {{param|ToneFile}} is played indefinitely.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getToneRepetitions() {
		return toneRepetitions;
	}

	/**
	 * Set the default number of times the data in {{param|ToneFile}} is repeated. If the value is 0 (zero) then {{param|ToneFile}} is played indefinitely.
	 *
	 * @since 2.0
	 * @param toneRepetitions the input value
	 */
	public void  setToneRepetitions(Long toneRepetitions) {
		this.toneRepetitions = toneRepetitions;
	}

	/**
	 * Set the default number of times the data in {{param|ToneFile}} is repeated. If the value is 0 (zero) then {{param|ToneFile}} is played indefinitely.
	 *
	 * @since 2.0
	 * @param toneRepetitions the input value
	 * @return this instance
	 */
	public Description withToneRepetitions(Long toneRepetitions) {
		this.toneRepetitions = toneRepetitions;
		return this;
	}

	/**
	 * Get the text to be displayed by on the screen of the VoIP device when the tone is played and no specific error message has been provided.

This parameter is applicable only for VoIP devices capable text display.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getToneText() {
		return toneText;
	}

	/**
	 * Set the text to be displayed by on the screen of the VoIP device when the tone is played and no specific error message has been provided.

This parameter is applicable only for VoIP devices capable text display.
	 *
	 * @since 2.0
	 * @param toneText the input value
	 */
	public void  setToneText(String toneText) {
		this.toneText = toneText;
	}

	/**
	 * Set the text to be displayed by on the screen of the VoIP device when the tone is played and no specific error message has been provided.

This parameter is applicable only for VoIP devices capable text display.
	 *
	 * @since 2.0
	 * @param toneText the input value
	 * @return this instance
	 */
	public Description withToneText(String toneText) {
		this.toneText = toneText;
		return this;
	}

	//</editor-fold>

}