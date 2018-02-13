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
package org.broadbandforum.tr181.device.zigbee.zdo;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.zigbee.zdo.applicationendpoint.SimpleDescriptor;

	/**
	 * The {{object}} object describes the application endpoint as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.ApplicationEndpoint.{i}.")
@XmlRootElement(name = "ApplicationEndpoint")
@XmlType(name = "Device.ZigBee.ZDO.ApplicationEndpoint")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationEndpoint {

	/**
	 * Enables or disables the use of this application endpoint on the device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The Endpoint Identifier for this object as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.

          An {{object}} with an {{param}} value of 0 is designated as the device application: This is a special application that is responsible for device operation and contains logic to manage the device's networking and general maintenance features.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "EndpointId")
	@CWMPParameter(access = "readWrite")
	@Size(max = 240)
	public Long endpointId;
	/**
	 * The {{object}} object contains the attributes of the Simple Descriptor of an application endpoint, as defined in {{bibref|ZigBee2007|section 2.3.2.5 Simple Descriptor}}.
	 */
	@XmlElement(name = "SimpleDescriptor")
	public SimpleDescriptor simpleDescriptor;

	public ApplicationEndpoint() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the use of this application endpoint on the device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the use of this application endpoint on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the use of this application endpoint on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public ApplicationEndpoint withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public ApplicationEndpoint withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the Endpoint Identifier for this object as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.

          An {{object}} with an {{param}} value of 0 is designated as the device application: This is a special application that is responsible for device operation and contains logic to manage the device's networking and general maintenance features.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getEndpointId() {
		return endpointId;
	}

	/**
	 * Set the Endpoint Identifier for this object as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.

          An {{object}} with an {{param}} value of 0 is designated as the device application: This is a special application that is responsible for device operation and contains logic to manage the device's networking and general maintenance features.
	 *
	 * @since 2.7
	 * @param endpointId the input value
	 */
	public void  setEndpointId(Long endpointId) {
		this.endpointId = endpointId;
	}

	/**
	 * Set the Endpoint Identifier for this object as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.

          An {{object}} with an {{param}} value of 0 is designated as the device application: This is a special application that is responsible for device operation and contains logic to manage the device's networking and general maintenance features.
	 *
	 * @since 2.7
	 * @param endpointId the input value
	 * @return this instance
	 */
	public ApplicationEndpoint withEndpointId(Long endpointId) {
		this.endpointId = endpointId;
		return this;
	}

	/**
	 * Get the {{object}} object contains the attributes of the Simple Descriptor of an application endpoint, as defined in {{bibref|ZigBee2007|section 2.3.2.5 Simple Descriptor}}.
	 *
	 * @return the value
	 */
	public SimpleDescriptor getSimpleDescriptor() {
		return simpleDescriptor;
	}

	/**
	 * Set the {{object}} object contains the attributes of the Simple Descriptor of an application endpoint, as defined in {{bibref|ZigBee2007|section 2.3.2.5 Simple Descriptor}}.
	 *
	 * @param simpleDescriptor the input value
	 */
	public void  setSimpleDescriptor(SimpleDescriptor simpleDescriptor) {
		this.simpleDescriptor = simpleDescriptor;
	}

	/**
	 * Set the {{object}} object contains the attributes of the Simple Descriptor of an application endpoint, as defined in {{bibref|ZigBee2007|section 2.3.2.5 Simple Descriptor}}.
	 *
	 * @param simpleDescriptor the input value
	 * @return this instance
	 */
	public ApplicationEndpoint withSimpleDescriptor(SimpleDescriptor simpleDescriptor) {
		this.simpleDescriptor = simpleDescriptor;
		return this;
	}

	//</editor-fold>

}