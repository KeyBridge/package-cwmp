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
package org.broadbandforum.tr181.device.deviceinfo;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * This object contains Location information.
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.DeviceInfo.Location.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Source", "ExternalSource"})})
@XmlRootElement(name = "Device.DeviceInfo.Location")
@XmlType(name = "Device.DeviceInfo.Location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {

	/**
	 * Identifies the source of the location data.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Source")
	public String source;
	/**
	 * The time when the location was acquired.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AcquiredTime")
	public LocalDateTime acquiredTime;
	/**
	 * URL, MAC address, or other identifier that identifies an "External" source of this location.

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.

          If {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}},  this is the URL or IP address of the ACS.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ExternalSource")
	public String externalSource;
	/**
	 * Protocol used to acquire a location from an "External" source. {{enum}}

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ExternalProtocol")
	public String externalProtocol;
	/**
	 * The currently valid location information.

          Writable only when {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}}.

          If obtained through the local GPS/AGPS then the location information is formatted according to {{bibref|RFC5491}}.

          If manually configured then location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          If obtained by an external source this is the location information as received.

          If it's an XML document (e.g. CWMP, OMA-DM, UPnP, HELD, MLP) the location information will be represented as-is, otherwise it will be converted to base64.

          CWMP configured location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          Only zero or one Location object instance with value {{enum|CWMP|ExternalProtocol}} MUST exist at any given time.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DataObject")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1200)
	public String dataObject;

	public Location() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the identifies the source of the location data.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Set the identifies the source of the location data.
	 *
	 * @since 2.4
	 * @param source the input value
	 */
	public void  setSource(String source) {
		this.source = source;
	}

	/**
	 * Set the identifies the source of the location data.
	 *
	 * @since 2.4
	 * @param source the input value
	 * @return this instance
	 */
	public Location withSource(String source) {
		this.source = source;
		return this;
	}

	/**
	 * Get the time when the location was acquired.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public LocalDateTime getAcquiredTime() {
		return acquiredTime;
	}

	/**
	 * Set the time when the location was acquired.
	 *
	 * @since 2.4
	 * @param acquiredTime the input value
	 */
	public void  setAcquiredTime(LocalDateTime acquiredTime) {
		this.acquiredTime = acquiredTime;
	}

	/**
	 * Set the time when the location was acquired.
	 *
	 * @since 2.4
	 * @param acquiredTime the input value
	 * @return this instance
	 */
	public Location withAcquiredTime(LocalDateTime acquiredTime) {
		this.acquiredTime = acquiredTime;
		return this;
	}

	/**
	 * Get the url, MAC address, or other identifier that identifies an "External" source of this location.

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.

          If {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}},  this is the URL or IP address of the ACS.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getExternalSource() {
		return externalSource;
	}

	/**
	 * Set the url, MAC address, or other identifier that identifies an "External" source of this location.

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.

          If {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}},  this is the URL or IP address of the ACS.
	 *
	 * @since 2.4
	 * @param externalSource the input value
	 */
	public void  setExternalSource(String externalSource) {
		this.externalSource = externalSource;
	}

	/**
	 * Set the url, MAC address, or other identifier that identifies an "External" source of this location.

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.

          If {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}},  this is the URL or IP address of the ACS.
	 *
	 * @since 2.4
	 * @param externalSource the input value
	 * @return this instance
	 */
	public Location withExternalSource(String externalSource) {
		this.externalSource = externalSource;
		return this;
	}

	/**
	 * Get the protocol used to acquire a location from an "External" source. {{enum}}

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getExternalProtocol() {
		return externalProtocol;
	}

	/**
	 * Set the protocol used to acquire a location from an "External" source. {{enum}}

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.
	 *
	 * @since 2.4
	 * @param externalProtocol the input value
	 */
	public void  setExternalProtocol(String externalProtocol) {
		this.externalProtocol = externalProtocol;
	}

	/**
	 * Set the protocol used to acquire a location from an "External" source. {{enum}}

          Meaningful only if {{param|Source}} has a value of {{enum|External|Source}}, otherwise it MUST be {{empty}}.
	 *
	 * @since 2.4
	 * @param externalProtocol the input value
	 * @return this instance
	 */
	public Location withExternalProtocol(String externalProtocol) {
		this.externalProtocol = externalProtocol;
		return this;
	}

	/**
	 * Get the currently valid location information.

          Writable only when {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}}.

          If obtained through the local GPS/AGPS then the location information is formatted according to {{bibref|RFC5491}}.

          If manually configured then location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          If obtained by an external source this is the location information as received.

          If it's an XML document (e.g. CWMP, OMA-DM, UPnP, HELD, MLP) the location information will be represented as-is, otherwise it will be converted to base64.

          CWMP configured location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          Only zero or one Location object instance with value {{enum|CWMP|ExternalProtocol}} MUST exist at any given time.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getDataObject() {
		return dataObject;
	}

	/**
	 * Set the currently valid location information.

          Writable only when {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}}.

          If obtained through the local GPS/AGPS then the location information is formatted according to {{bibref|RFC5491}}.

          If manually configured then location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          If obtained by an external source this is the location information as received.

          If it's an XML document (e.g. CWMP, OMA-DM, UPnP, HELD, MLP) the location information will be represented as-is, otherwise it will be converted to base64.

          CWMP configured location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          Only zero or one Location object instance with value {{enum|CWMP|ExternalProtocol}} MUST exist at any given time.
	 *
	 * @since 2.4
	 * @param dataObject the input value
	 */
	public void  setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

	/**
	 * Set the currently valid location information.

          Writable only when {{param|ExternalProtocol}} has a value of {{enum|CWMP|ExternalProtocol}}.

          If obtained through the local GPS/AGPS then the location information is formatted according to {{bibref|RFC5491}}.

          If manually configured then location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          If obtained by an external source this is the location information as received.

          If it's an XML document (e.g. CWMP, OMA-DM, UPnP, HELD, MLP) the location information will be represented as-is, otherwise it will be converted to base64.

          CWMP configured location information will be XML-formatted according to {{bibref|RFC5491}} (geographical information) and {{bibref|RFC5139}} (civic addresses).

          Only zero or one Location object instance with value {{enum|CWMP|ExternalProtocol}} MUST exist at any given time.
	 *
	 * @since 2.4
	 * @param dataObject the input value
	 * @return this instance
	 */
	public Location withDataObject(String dataObject) {
		this.dataObject = dataObject;
		return this;
	}

	//</editor-fold>

}