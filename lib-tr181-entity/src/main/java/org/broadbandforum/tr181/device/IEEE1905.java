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
package org.broadbandforum.tr181.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.ieee1905.AL;

	/**
	 * This object represents the management functions for the 1905 capabilities as defined in {{bibref|IEEE1905.1a}}.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IEEE1905.")
@XmlRootElement(name = "Device.IEEE1905")
@XmlType(name = "Device.IEEE1905")
@XmlAccessorType(XmlAccessType.FIELD)
public class IEEE1905 {

	/**
	 * 1905 profile version number of the AL as would be sent in a Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Version")
	public String version;
	/**
	 * This object represents the management functions for the 1905 Abstraction Layer as defined in {{bibref|IEEE1905.1a|Section 4.4 Abstraction Layer}}.
	 */
	@XmlElement(name = "AL")
	public AL al;

	public IEEE1905() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the 1905 profile version number of the AL as would be sent in a Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the 1905 profile version number of the AL as would be sent in a Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the 1905 profile version number of the AL as would be sent in a Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @param version the input value
	 * @return this instance
	 */
	public IEEE1905 withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the this object represents the management functions for the 1905 Abstraction Layer as defined in {{bibref|IEEE1905.1a|Section 4.4 Abstraction Layer}}.
	 *
	 * @return the value
	 */
	public AL getAl() {
		return al;
	}

	/**
	 * Set the this object represents the management functions for the 1905 Abstraction Layer as defined in {{bibref|IEEE1905.1a|Section 4.4 Abstraction Layer}}.
	 *
	 * @param al the input value
	 */
	public void  setAl(AL al) {
		this.al = al;
	}

	/**
	 * Set the this object represents the management functions for the 1905 Abstraction Layer as defined in {{bibref|IEEE1905.1a|Section 4.4 Abstraction Layer}}.
	 *
	 * @param al the input value
	 * @return this instance
	 */
	public IEEE1905 withAl(AL al) {
		this.al = al;
		return this;
	}

	//</editor-fold>

}