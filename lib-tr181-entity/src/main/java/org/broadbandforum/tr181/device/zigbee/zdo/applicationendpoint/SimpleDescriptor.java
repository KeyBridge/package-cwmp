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
package org.broadbandforum.tr181.device.zigbee.zdo.applicationendpoint;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The {{object}} object contains the attributes of the Simple Descriptor of an application endpoint, as defined in {{bibref|ZigBee2007|section 2.3.2.5 Simple Descriptor}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.ApplicationEndpoint.{i}.SimpleDescriptor.")
@XmlRootElement(name = "SimpleDescriptor")
@XmlType(name = "Device.ZigBee.ZDO.ApplicationEndpoint.SimpleDescriptor")
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleDescriptor {

	/**
	 * Specifies the application profile that is supported on this endpoint. Application profiles are agreements for messages, message formats, andprocessing actions that enable developers to create an interoperable, distributed application employing application entities that reside on separate ZigBee devices. These application profiles enable applications to send commands, request data, and process commands and requests as defined in {{bibref|ZigBee2007|section 2.1.2.1 Application Profiles}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ProfileId")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long profileId;
	/**
	 * Application device identifier, as defined in {{bibref|ZigBee2007|section 2.3.2.5.3 Application Device Identifier Field}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DeviceId")
	@Size(max = 65535)
	public Long deviceId;
	/**
	 * Application device version, as defined in {{bibref|ZigBee2007|section 2.3.2.5.4 Application Device Version Field}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DeviceVersion")
	@Size(max = 15)
	public Long deviceVersion;
	/**
	 * {{list}} Specifies the input cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's output cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InputClusterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long inputClusterList;
	/**
	 * {{list}} Specifies the output cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's input cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "OutputClusterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long outputClusterList;

	public SimpleDescriptor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies the application profile that is supported on this endpoint. Application profiles are agreements for messages, message formats, andprocessing actions that enable developers to create an interoperable, distributed application employing application entities that reside on separate ZigBee devices. These application profiles enable applications to send commands, request data, and process commands and requests as defined in {{bibref|ZigBee2007|section 2.1.2.1 Application Profiles}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * Set the specifies the application profile that is supported on this endpoint. Application profiles are agreements for messages, message formats, andprocessing actions that enable developers to create an interoperable, distributed application employing application entities that reside on separate ZigBee devices. These application profiles enable applications to send commands, request data, and process commands and requests as defined in {{bibref|ZigBee2007|section 2.1.2.1 Application Profiles}}.
	 *
	 * @since 2.7
	 * @param profileId the input value
	 */
	public void  setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	/**
	 * Set the specifies the application profile that is supported on this endpoint. Application profiles are agreements for messages, message formats, andprocessing actions that enable developers to create an interoperable, distributed application employing application entities that reside on separate ZigBee devices. These application profiles enable applications to send commands, request data, and process commands and requests as defined in {{bibref|ZigBee2007|section 2.1.2.1 Application Profiles}}.
	 *
	 * @since 2.7
	 * @param profileId the input value
	 * @return this instance
	 */
	public SimpleDescriptor withProfileId(Long profileId) {
		this.profileId = profileId;
		return this;
	}

	/**
	 * Get application device identifier, as defined in {{bibref|ZigBee2007|section 2.3.2.5.3 Application Device Identifier Field}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getDeviceId() {
		return deviceId;
	}

	/**
	 * Set application device identifier, as defined in {{bibref|ZigBee2007|section 2.3.2.5.3 Application Device Identifier Field}}.
	 *
	 * @since 2.7
	 * @param deviceId the input value
	 */
	public void  setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Set application device identifier, as defined in {{bibref|ZigBee2007|section 2.3.2.5.3 Application Device Identifier Field}}.
	 *
	 * @since 2.7
	 * @param deviceId the input value
	 * @return this instance
	 */
	public SimpleDescriptor withDeviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Get application device version, as defined in {{bibref|ZigBee2007|section 2.3.2.5.4 Application Device Version Field}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getDeviceVersion() {
		return deviceVersion;
	}

	/**
	 * Set application device version, as defined in {{bibref|ZigBee2007|section 2.3.2.5.4 Application Device Version Field}}.
	 *
	 * @since 2.7
	 * @param deviceVersion the input value
	 */
	public void  setDeviceVersion(Long deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	/**
	 * Set application device version, as defined in {{bibref|ZigBee2007|section 2.3.2.5.4 Application Device Version Field}}.
	 *
	 * @since 2.7
	 * @param deviceVersion the input value
	 * @return this instance
	 */
	public SimpleDescriptor withDeviceVersion(Long deviceVersion) {
		this.deviceVersion = deviceVersion;
		return this;
	}

	/**
	 * Get the {{list}} Specifies the input cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's output cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getInputClusterList() {
		return inputClusterList;
	}

	/**
	 * Set the {{list}} Specifies the input cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's output cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @param inputClusterList the input value
	 */
	public void  setInputClusterList(Long inputClusterList) {
		this.inputClusterList = inputClusterList;
	}

	/**
	 * Set the {{list}} Specifies the input cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's output cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @param inputClusterList the input value
	 * @return this instance
	 */
	public SimpleDescriptor withInputClusterList(Long inputClusterList) {
		this.inputClusterList = inputClusterList;
		return this;
	}

	/**
	 * Get the {{list}} Specifies the output cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's input cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getOutputClusterList() {
		return outputClusterList;
	}

	/**
	 * Set the {{list}} Specifies the output cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's input cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @param outputClusterList the input value
	 */
	public void  setOutputClusterList(Long outputClusterList) {
		this.outputClusterList = outputClusterList;
	}

	/**
	 * Set the {{list}} Specifies the output cluster identifiers to be matched by the ZigBee coordinator by remote Zigbee device's input cluster list for this {{object}} object.
	 *
	 * @since 2.7
	 * @param outputClusterList the input value
	 * @return this instance
	 */
	public SimpleDescriptor withOutputClusterList(Long outputClusterList) {
		this.outputClusterList = outputClusterList;
		return this;
	}

	//</editor-fold>

}