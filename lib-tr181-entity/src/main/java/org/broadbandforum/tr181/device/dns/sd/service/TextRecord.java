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
package org.broadbandforum.tr181.device.dns.sd.service;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object maintains an instance of a (key/value pairs) of the service. The information is extracted from DNS TXT records {{bibref|RFC1035}} of the discovered service.

        When multiple instances of the {{object}} table have the same value for the {{param|Key}} parameter, the implementation is CPE specific.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.DNS.SD.Service.{i}.TextRecord.{i}.")
@XmlRootElement(name = "Device.DNS.SD.Service.TextRecord")
@XmlType(name = "Device.DNS.SD.Service.TextRecord")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextRecord {

	/**
	 * The key that identifies the text record
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Key")
	@Size(max = 255)
	public String key;
	/**
	 * The value of the text record.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Value")
	@Size(max = 255)
	public String value;

	public TextRecord() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the key that identifies the text record
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Set the key that identifies the text record
	 *
	 * @since 2.6
	 * @param key the input value
	 */
	public void  setKey(String key) {
		this.key = key;
	}

	/**
	 * Set the key that identifies the text record
	 *
	 * @since 2.6
	 * @param key the input value
	 * @return this instance
	 */
	public TextRecord withKey(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get the value of the text record.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the value of the text record.
	 *
	 * @since 2.6
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 * Set the value of the text record.
	 *
	 * @since 2.6
	 * @param value the input value
	 * @return this instance
	 */
	public TextRecord withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}