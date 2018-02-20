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
	 * Each entry in the table defines a single phase in an overall tone pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Tone.Pattern.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.Tone.Pattern")
@XmlType(name = "VoiceService.Tone.Pattern")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pattern {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Whether or not a tone is on during this phase of the pattern.  If the value is {{false}}, the frequency and power parameters in this entry MUST be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneOn")
	@CWMPParameter(access = "readWrite")
	public Boolean toneOn;
	/**
	 * First tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Frequency1")
	@CWMPParameter(access = "readWrite", units = "hertz")
	@Size(min = 0, max = 4095)
	public Long frequency1 = 0L;
	/**
	 * First tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Power1")
	@CWMPParameter(access = "readWrite", units = "dBm0")
	public Integer power1;
	/**
	 * Second tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Frequency2")
	@CWMPParameter(access = "readWrite", units = "hertz")
	@Size(min = 0, max = 4095)
	public Long frequency2 = 0L;
	/**
	 * Second tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Power2")
	@CWMPParameter(access = "readWrite", units = "dBm0")
	public Integer power2;
	/**
	 * Third tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Frequency3")
	@CWMPParameter(access = "readWrite", units = "hertz")
	@Size(min = 0, max = 4095)
	public Long frequency3 = 0L;
	/**
	 * Third tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Power3")
	@CWMPParameter(access = "readWrite", units = "dBm0")
	public Integer power3;
	/**
	 * Fourth tone frequency in herts.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Frequency4")
	@CWMPParameter(access = "readWrite", units = "herts")
	@Size(min = 0, max = 4095)
	public Long frequency4 = 0L;
	/**
	 * Fourth tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Power4")
	@CWMPParameter(access = "readWrite", units = "dBm0")
	public Integer power4;
	/**
	 * Modulation frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModulationFrequency")
	@CWMPParameter(access = "readWrite", units = "hertz")
	@Size(min = 0, max = 4095)
	public Long modulationFrequency = 0L;
	/**
	 * Modulation power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModulationPower")
	@CWMPParameter(access = "readWrite", units = "dBm0")
	public Integer modulationPower;
	/**
	 * The duration of this phase of the tone pattern, in milliseconds.

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long duration = 0L;
	/**
	 * The {{object}} for the next phase of the tone pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the tone pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NextPattern")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String nextPattern;

	public Pattern() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Pattern withEnable(Boolean enable) {
		this.enable = enable;
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
	public Pattern withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the whether or not a tone is on during this phase of the pattern.  If the value is {{false}}, the frequency and power parameters in this entry MUST be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isToneOn() {
		return toneOn;
	}

	/**
	 * Set the whether or not a tone is on during this phase of the pattern.  If the value is {{false}}, the frequency and power parameters in this entry MUST be ignored.
	 *
	 * @since 2.0
	 * @param toneOn the input value
	 */
	public void  setToneOn(Boolean toneOn) {
		this.toneOn = toneOn;
	}

	/**
	 * Set the whether or not a tone is on during this phase of the pattern.  If the value is {{false}}, the frequency and power parameters in this entry MUST be ignored.
	 *
	 * @since 2.0
	 * @param toneOn the input value
	 * @return this instance
	 */
	public Pattern withToneOn(Boolean toneOn) {
		this.toneOn = toneOn;
		return this;
	}

	/**
	 * Get the first tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFrequency1() {
		return frequency1;
	}

	/**
	 * Set the first tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency1 the input value
	 */
	public void  setFrequency1(Long frequency1) {
		this.frequency1 = frequency1;
	}

	/**
	 * Set the first tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency1 the input value
	 * @return this instance
	 */
	public Pattern withFrequency1(Long frequency1) {
		this.frequency1 = frequency1;
		return this;
	}

	/**
	 * Get the first tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPower1() {
		return power1;
	}

	/**
	 * Set the first tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power1 the input value
	 */
	public void  setPower1(Integer power1) {
		this.power1 = power1;
	}

	/**
	 * Set the first tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power1 the input value
	 * @return this instance
	 */
	public Pattern withPower1(Integer power1) {
		this.power1 = power1;
		return this;
	}

	/**
	 * Get the second tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFrequency2() {
		return frequency2;
	}

	/**
	 * Set the second tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency2 the input value
	 */
	public void  setFrequency2(Long frequency2) {
		this.frequency2 = frequency2;
	}

	/**
	 * Set the second tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency2 the input value
	 * @return this instance
	 */
	public Pattern withFrequency2(Long frequency2) {
		this.frequency2 = frequency2;
		return this;
	}

	/**
	 * Get the second tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPower2() {
		return power2;
	}

	/**
	 * Set the second tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power2 the input value
	 */
	public void  setPower2(Integer power2) {
		this.power2 = power2;
	}

	/**
	 * Set the second tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power2 the input value
	 * @return this instance
	 */
	public Pattern withPower2(Integer power2) {
		this.power2 = power2;
		return this;
	}

	/**
	 * Get the third tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFrequency3() {
		return frequency3;
	}

	/**
	 * Set the third tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency3 the input value
	 */
	public void  setFrequency3(Long frequency3) {
		this.frequency3 = frequency3;
	}

	/**
	 * Set the third tone frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency3 the input value
	 * @return this instance
	 */
	public Pattern withFrequency3(Long frequency3) {
		this.frequency3 = frequency3;
		return this;
	}

	/**
	 * Get the third tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPower3() {
		return power3;
	}

	/**
	 * Set the third tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power3 the input value
	 */
	public void  setPower3(Integer power3) {
		this.power3 = power3;
	}

	/**
	 * Set the third tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power3 the input value
	 * @return this instance
	 */
	public Pattern withPower3(Integer power3) {
		this.power3 = power3;
		return this;
	}

	/**
	 * Get the fourth tone frequency in herts.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFrequency4() {
		return frequency4;
	}

	/**
	 * Set the fourth tone frequency in herts.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency4 the input value
	 */
	public void  setFrequency4(Long frequency4) {
		this.frequency4 = frequency4;
	}

	/**
	 * Set the fourth tone frequency in herts.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param frequency4 the input value
	 * @return this instance
	 */
	public Pattern withFrequency4(Long frequency4) {
		this.frequency4 = frequency4;
		return this;
	}

	/**
	 * Get the fourth tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPower4() {
		return power4;
	}

	/**
	 * Set the fourth tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power4 the input value
	 */
	public void  setPower4(Integer power4) {
		this.power4 = power4;
	}

	/**
	 * Set the fourth tone power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param power4 the input value
	 * @return this instance
	 */
	public Pattern withPower4(Integer power4) {
		this.power4 = power4;
		return this;
	}

	/**
	 * Get the modulation frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getModulationFrequency() {
		return modulationFrequency;
	}

	/**
	 * Set the modulation frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param modulationFrequency the input value
	 */
	public void  setModulationFrequency(Long modulationFrequency) {
		this.modulationFrequency = modulationFrequency;
	}

	/**
	 * Set the modulation frequency in hertz.

A value of zero indicates this tone component is not used.
	 *
	 * @since 2.0
	 * @param modulationFrequency the input value
	 * @return this instance
	 */
	public Pattern withModulationFrequency(Long modulationFrequency) {
		this.modulationFrequency = modulationFrequency;
		return this;
	}

	/**
	 * Get the modulation power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getModulationPower() {
		return modulationPower;
	}

	/**
	 * Set the modulation power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param modulationPower the input value
	 */
	public void  setModulationPower(Integer modulationPower) {
		this.modulationPower = modulationPower;
	}

	/**
	 * Set the modulation power level in units of 0.1 dBm0.
	 *
	 * @since 2.0
	 * @param modulationPower the input value
	 * @return this instance
	 */
	public Pattern withModulationPower(Integer modulationPower) {
		this.modulationPower = modulationPower;
		return this;
	}

	/**
	 * Get the duration of this phase of the tone pattern, in milliseconds.

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the duration of this phase of the tone pattern, in milliseconds.

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the duration of this phase of the tone pattern, in milliseconds.

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public Pattern withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the {{object}} for the next phase of the tone pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the tone pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNextPattern() {
		return nextPattern;
	}

	/**
	 * Set the {{object}} for the next phase of the tone pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the tone pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @param nextPattern the input value
	 */
	public void  setNextPattern(String nextPattern) {
		this.nextPattern = nextPattern;
	}

	/**
	 * Set the {{object}} for the next phase of the tone pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the tone pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @param nextPattern the input value
	 * @return this instance
	 */
	public Pattern withNextPattern(String nextPattern) {
		this.nextPattern = nextPattern;
		return this;
	}

	//</editor-fold>

}