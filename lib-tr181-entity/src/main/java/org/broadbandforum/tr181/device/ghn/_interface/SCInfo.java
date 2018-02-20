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
package org.broadbandforum.tr181.device.ghn._interface;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object specifies management parameters pertaining to the Security Controller functionality (Security Controller function; see {{bibref|G.9961|Clause 9.2}}). The object exists only on G.hn interfaces that are currently the Security Controller, i.e. for which parameter {{param|#.IsSC}} is {{true}}.
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.SCInfo.")
@XmlRootElement(name = "Device.Ghn.Interface.SCInfo")
@XmlType(name = "Device.Ghn.Interface.SCInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class SCInfo {

	/**
	 * The security modes that the Security Controller can support.  Refer to {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ModesSupported")
	@XmlList
	public Collection<String> modesSupported;
	/**
	 * The security mode in which the Security Controller is operating.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ModeEnabled")
	@CWMPParameter(access = "readWrite")
	public String modeEnabled;
	/**
	 * The selected MIC size used in the domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MICSize")
	@CWMPParameter(access = "readWrite")
	public String micSize;
	/**
	 * Indicates whether the Security Controller is above the L1 reference point. It is set to {{true}} if the Security Controller is above the L1 reference point, and set to {{false}} otherwise.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Location")
	public Boolean location;

	public SCInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the security modes that the Security Controller can support.  Refer to {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getModesSupported() {
		if (this.modesSupported == null){ this.modesSupported=new ArrayList<>();}
		return modesSupported;
	}

	/**
	 * Set the security modes that the Security Controller can support.  Refer to {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param modesSupported the input value
	 */
	public void  setModesSupported(Collection<String> modesSupported) {
		this.modesSupported = modesSupported;
	}

	/**
	 * Set the security modes that the Security Controller can support.  Refer to {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public SCInfo withModesSupported(String string) {
		getModesSupported().add(string);
		return this;
	}

	/**
	 * Get the security mode in which the Security Controller is operating.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getModeEnabled() {
		return modeEnabled;
	}

	/**
	 * Set the security mode in which the Security Controller is operating.
	 *
	 * @since 2.8
	 * @param modeEnabled the input value
	 */
	public void  setModeEnabled(String modeEnabled) {
		this.modeEnabled = modeEnabled;
	}

	/**
	 * Set the security mode in which the Security Controller is operating.
	 *
	 * @since 2.8
	 * @param modeEnabled the input value
	 * @return this instance
	 */
	public SCInfo withModeEnabled(String modeEnabled) {
		this.modeEnabled = modeEnabled;
		return this;
	}

	/**
	 * Get the selected MIC size used in the domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getMicSize() {
		return micSize;
	}

	/**
	 * Set the selected MIC size used in the domain.
	 *
	 * @since 2.8
	 * @param micSize the input value
	 */
	public void  setMicSize(String micSize) {
		this.micSize = micSize;
	}

	/**
	 * Set the selected MIC size used in the domain.
	 *
	 * @since 2.8
	 * @param micSize the input value
	 * @return this instance
	 */
	public SCInfo withMicSize(String micSize) {
		this.micSize = micSize;
		return this;
	}

	/**
	 * Get the indicates whether the Security Controller is above the L1 reference point. It is set to {{true}} if the Security Controller is above the L1 reference point, and set to {{false}} otherwise.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isLocation() {
		return location;
	}

	/**
	 * Set the indicates whether the Security Controller is above the L1 reference point. It is set to {{true}} if the Security Controller is above the L1 reference point, and set to {{false}} otherwise.
	 *
	 * @since 2.8
	 * @param location the input value
	 */
	public void  setLocation(Boolean location) {
		this.location = location;
	}

	/**
	 * Set the indicates whether the Security Controller is above the L1 reference point. It is set to {{true}} if the Security Controller is above the L1 reference point, and set to {{false}} otherwise.
	 *
	 * @since 2.8
	 * @param location the input value
	 * @return this instance
	 */
	public SCInfo withLocation(Boolean location) {
		this.location = location;
		return this;
	}

	//</editor-fold>

}