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
package org.broadbandforum.tr104.voiceservice.callcontrol.extension.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * DSP statistic parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Extension.{i}.Stats.DSP.")
@XmlRootElement(name = "DSP")
@XmlType(name = "VoiceService.CallControl.Extension.Stats.DSP")
@XmlAccessorType(XmlAccessType.FIELD)
public class DSP {

	/**
	 * Total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Overruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long overruns;
	/**
	 * Total number of times the receive jitter buffer has underrun.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Underruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long underruns;

	public DSP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOverruns() {
		return overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 */
	public void  setOverruns(Long overruns) {
		this.overruns = overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 * @return this instance
	 */
	public DSP withOverruns(Long overruns) {
		this.overruns = overruns;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has underrun.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnderruns() {
		return underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 */
	public void  setUnderruns(Long underruns) {
		this.underruns = underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 * @return this instance
	 */
	public DSP withUnderruns(Long underruns) {
		this.underruns = underruns;
		return this;
	}

	//</editor-fold>

}