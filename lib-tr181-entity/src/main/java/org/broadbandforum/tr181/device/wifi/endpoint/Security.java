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
package org.broadbandforum.tr181.device.wifi.endpoint;

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
	 * This object contains security related parameters that apply to a WiFi end point {{bibref|802.11-2007}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.Security.")
@XmlRootElement(name = "Security")
@XmlType(name = "Device.WiFi.EndPoint.Security")
@XmlAccessorType(XmlAccessType.FIELD)
public class Security {

	/**
	 * {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModesSupported")
	@XmlList
	public Collection<String> modesSupported;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getModesSupported() {
		if (this.modesSupported == null){ this.modesSupported=new ArrayList<>();}
		return modesSupported;
	}

	/**
	 * Set the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @param modesSupported the input value
	 */
	public void  setModesSupported(Collection<String> modesSupported) {
		this.modesSupported = modesSupported;
	}

	/**
	 * Set the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Security withModesSupported(String string) {
		getModesSupported().add(string);
		return this;
	}

	//</editor-fold>

}