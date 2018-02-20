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
package org.broadbandforum.tr181.device.upa._interface;

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
	 * This object contains the list of active notches of the UPA interface. 

        A UPA device can have notches in its spectrum, where no power is transmitted in a given part of the spectrum. These notches are typically located in amateur radio bands, to avoid interference.

        Note: All {{object}} entries can be enabled/disabled as a group using the {{param|#.ActiveNotchEnable}} parameter.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPA.Interface.{i}.ActiveNotch.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.UPA.Interface.ActiveNotch")
@XmlType(name = "Device.UPA.Interface.ActiveNotch")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActiveNotch {

	/**
	 * Enables or disables the active notch entry.
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
	 * The initial frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartFreq")
	@CWMPParameter(access = "readWrite", units = "kHz")
	public Long startFreq;
	/**
	 * The final frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StopFreq")
	@CWMPParameter(access = "readWrite", units = "kHz")
	public Long stopFreq;
	/**
	 * The depth (in dB) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Depth")
	@CWMPParameter(access = "readWrite", units = "dB")
	public Long depth;

	public ActiveNotch() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the active notch entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the active notch entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the active notch entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public ActiveNotch withEnable(Boolean enable) {
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
	public ActiveNotch withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the initial frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getStartFreq() {
		return startFreq;
	}

	/**
	 * Set the initial frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param startFreq the input value
	 */
	public void  setStartFreq(Long startFreq) {
		this.startFreq = startFreq;
	}

	/**
	 * Set the initial frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param startFreq the input value
	 * @return this instance
	 */
	public ActiveNotch withStartFreq(Long startFreq) {
		this.startFreq = startFreq;
		return this;
	}

	/**
	 * Get the final frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getStopFreq() {
		return stopFreq;
	}

	/**
	 * Set the final frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param stopFreq the input value
	 */
	public void  setStopFreq(Long stopFreq) {
		this.stopFreq = stopFreq;
	}

	/**
	 * Set the final frequency (in kHz) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param stopFreq the input value
	 * @return this instance
	 */
	public ActiveNotch withStopFreq(Long stopFreq) {
		this.stopFreq = stopFreq;
		return this;
	}

	/**
	 * Get the depth (in dB) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDepth() {
		return depth;
	}

	/**
	 * Set the depth (in dB) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param depth the input value
	 */
	public void  setDepth(Long depth) {
		this.depth = depth;
	}

	/**
	 * Set the depth (in dB) of a notch enabled in the spectrum of the local interface.
	 *
	 * @since 2.0
	 * @param depth the input value
	 * @return this instance
	 */
	public ActiveNotch withDepth(Long depth) {
		this.depth = depth;
		return this;
	}

	//</editor-fold>

}