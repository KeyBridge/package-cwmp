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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.m2msppolicy.RequestCategory;

	/**
	 * This object maintains the SAF handling policies' properties that are controlled by the M2M service provider for a request.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.M2MSPPolicy.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.SAFPolicySet.M2MSPPolicy")
@XmlType(name = "Device.ETSIM2M.SCL.SAFPolicySet.M2MSPPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
public class M2MSPPolicy {

	/**
	 * The default RCAT value to use for requests to remotely hosted resources during SAF-handling when no RCAT value was specified in the request.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DefaultRCATValue")
	@CWMPParameter(access = "readWrite")
	public String defaultRCATValue;
	/**
	 * This object maintains a list of properties to be used for forwarding requests with a specified {{param|RCAT}}.

        Processing behavior for the use of M2M Service Provider policies is defined in section 10.3.1.2.2.1 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 */
	@XmlElementWrapper(name = "RequestCategories")
	@XmlElement(name = "RequestCategory")
	@CWMPParameter(access = "readWrite")
	public Collection<RequestCategory> requestCategories;

	public M2MSPPolicy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the default RCAT value to use for requests to remotely hosted resources during SAF-handling when no RCAT value was specified in the request.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getDefaultRCATValue() {
		return defaultRCATValue;
	}

	/**
	 * Set the default RCAT value to use for requests to remotely hosted resources during SAF-handling when no RCAT value was specified in the request.
	 *
	 * @since 2.6
	 * @param defaultRCATValue the input value
	 */
	public void  setDefaultRCATValue(String defaultRCATValue) {
		this.defaultRCATValue = defaultRCATValue;
	}

	/**
	 * Set the default RCAT value to use for requests to remotely hosted resources during SAF-handling when no RCAT value was specified in the request.
	 *
	 * @since 2.6
	 * @param defaultRCATValue the input value
	 * @return this instance
	 */
	public M2MSPPolicy withDefaultRCATValue(String defaultRCATValue) {
		this.defaultRCATValue = defaultRCATValue;
		return this;
	}

	/**
	 * Get the this object maintains a list of properties to be used for forwarding requests with a specified {{param|RCAT}}.

        Processing behavior for the use of M2M Service Provider policies is defined in section 10.3.1.2.2.1 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @return the value
	 */
	public Collection<RequestCategory> getRequestCategories() {
		if (this.requestCategories == null){ this.requestCategories=new ArrayList<>();}
		return requestCategories;
	}

	/**
	 * Set the this object maintains a list of properties to be used for forwarding requests with a specified {{param|RCAT}}.

        Processing behavior for the use of M2M Service Provider policies is defined in section 10.3.1.2.2.1 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @param requestCategories the input value
	 */
	public void  setRequestCategories(Collection<RequestCategory> requestCategories) {
		this.requestCategories = requestCategories;
	}

	/**
	 * Set the this object maintains a list of properties to be used for forwarding requests with a specified {{param|RCAT}}.

        Processing behavior for the use of M2M Service Provider policies is defined in section 10.3.1.2.2.1 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @param requestCategory the input value
	 * @return this instance
	 */
	public M2MSPPolicy withRequestCategory(RequestCategory requestCategory) {
		getRequestCategories().add(requestCategory);
		return this;
	}

	//</editor-fold>

}