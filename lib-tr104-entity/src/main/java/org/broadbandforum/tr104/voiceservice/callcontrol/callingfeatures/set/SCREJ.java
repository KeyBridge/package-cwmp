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
package org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * This object defines a Selective Call Rejection (SCREJ) that permit the user to selectively reject calls depending on the calling number.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.Set.{i}.SCREJ.{i}.")
@XmlRootElement(name = "SCREJ")
@XmlType(name = "VoiceService.CallControl.CallingFeatures.Set.SCREJ")
@XmlAccessorType(XmlAccessType.FIELD)
public class SCREJ {

	/**
	 * Enables or disables this Selective Call Rejection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Calling number concerned by the reject.

The CPE SHOULD perform an exact match with this string without any attempts at number normalization.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallingNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String callingNumber;

	public SCREJ() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Selective Call Rejection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Selective Call Rejection.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Selective Call Rejection.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SCREJ withEnable(Boolean enable) {
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
	public SCREJ withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the calling number concerned by the reject.

The CPE SHOULD perform an exact match with this string without any attempts at number normalization.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallingNumber() {
		return callingNumber;
	}

	/**
	 * Set the calling number concerned by the reject.

The CPE SHOULD perform an exact match with this string without any attempts at number normalization.
	 *
	 * @since 2.0
	 * @param callingNumber the input value
	 */
	public void  setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
	}

	/**
	 * Set the calling number concerned by the reject.

The CPE SHOULD perform an exact match with this string without any attempts at number normalization.
	 *
	 * @since 2.0
	 * @param callingNumber the input value
	 * @return this instance
	 */
	public SCREJ withCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		return this;
	}

	//</editor-fold>

}