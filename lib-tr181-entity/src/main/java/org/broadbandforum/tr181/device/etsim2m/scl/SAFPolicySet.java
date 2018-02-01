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
package org.broadbandforum.tr181.device.etsim2m.scl;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.ANPPolicy;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.M2MSPPolicy;

	/**
	 * This object describes the parameters necessary to administer the store-and-forward (SAF) handling policies applied to requests to access remotely hosted resources.

        Policies are described by instances of {{object}}. Which instances of {{object}} are used by the SCL is determined by the {{param|PolicyScope}} parameter.

        Section 9.3.1.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describe the behavior for SAF processing.

        There is at most one {{object}} instance with the {{param|PolicyScope}} containing a specific application id (APP-ID) URI value within the list.

        There is exactly one {{object}} instance with a {{param|PolicyScope}} value of "default".
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.")
public class SAFPolicySet {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The parameter defines the scope of the policies contained in this instance of a {{object|#.SAFPolicySet}}.

          The parameter value is:

          *a list of unordered set of URIs {{bibref|RFC3986}} that represents an M2M application id (APP-ID)

          *the value of  "default"

          *{{empty}}

          When this parameter is set to a list of application id (APP-ID) URIs {{bibref|RFC3986}}, the scope indicates that the policies are applicable to requests coming from any specific application on that list. 

          When this parameter is set to a string with the value "default", the scope indicates that the policies are the default policies for this {{object|##.SCL}} instance.

          When this parameter is set to {{empty}}, the value represents an unknown {{object|#.SAFPolicySet}} and the {{object|#.SAFPolicySet}} is not to be used.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "PolicyScope")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> policyScope;
	/**
	 * This table contains the SAF-handling policies which are controlled by the Access Network Provider(s).

        {{keys}}
	 */
	@XmlElementWrapper(name = "ANPPolicies")
	@XmlElement(name = "ANPPolicy")
	@CWMPParameter(access = "readWrite")
	public Collection<ANPPolicy> anpPolicies;
	/**
	 * This object maintains the SAF handling policies' properties that are controlled by the M2M service provider for a request.
	 */
	@XmlElement(name = "M2MSPPolicy")
	public M2MSPPolicy m2mSPPolicy;

	public SAFPolicySet() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public SAFPolicySet withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public SAFPolicySet withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the parameter defines the scope of the policies contained in this instance of a {{object|#.SAFPolicySet}}.

          The parameter value is:

          *a list of unordered set of URIs {{bibref|RFC3986}} that represents an M2M application id (APP-ID)

          *the value of  "default"

          *{{empty}}

          When this parameter is set to a list of application id (APP-ID) URIs {{bibref|RFC3986}}, the scope indicates that the policies are applicable to requests coming from any specific application on that list. 

          When this parameter is set to a string with the value "default", the scope indicates that the policies are the default policies for this {{object|##.SCL}} instance.

          When this parameter is set to {{empty}}, the value represents an unknown {{object|#.SAFPolicySet}} and the {{object|#.SAFPolicySet}} is not to be used.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getPolicyScope() {
		if (this.policyScope == null){ this.policyScope=new ArrayList<>();}
		return policyScope;
	}

	/**
	 * Set the parameter defines the scope of the policies contained in this instance of a {{object|#.SAFPolicySet}}.

          The parameter value is:

          *a list of unordered set of URIs {{bibref|RFC3986}} that represents an M2M application id (APP-ID)

          *the value of  "default"

          *{{empty}}

          When this parameter is set to a list of application id (APP-ID) URIs {{bibref|RFC3986}}, the scope indicates that the policies are applicable to requests coming from any specific application on that list. 

          When this parameter is set to a string with the value "default", the scope indicates that the policies are the default policies for this {{object|##.SCL}} instance.

          When this parameter is set to {{empty}}, the value represents an unknown {{object|#.SAFPolicySet}} and the {{object|#.SAFPolicySet}} is not to be used.
	 *
	 * @since 2.6
	 * @param policyScope the input value
	 */
	public void  setPolicyScope(Collection<String> policyScope) {
		this.policyScope = policyScope;
	}

	/**
	 * Set the parameter defines the scope of the policies contained in this instance of a {{object|#.SAFPolicySet}}.

          The parameter value is:

          *a list of unordered set of URIs {{bibref|RFC3986}} that represents an M2M application id (APP-ID)

          *the value of  "default"

          *{{empty}}

          When this parameter is set to a list of application id (APP-ID) URIs {{bibref|RFC3986}}, the scope indicates that the policies are applicable to requests coming from any specific application on that list. 

          When this parameter is set to a string with the value "default", the scope indicates that the policies are the default policies for this {{object|##.SCL}} instance.

          When this parameter is set to {{empty}}, the value represents an unknown {{object|#.SAFPolicySet}} and the {{object|#.SAFPolicySet}} is not to be used.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public SAFPolicySet withPolicyScope(String string) {
		getPolicyScope().add(string);
		return this;
	}

	/**
	 * Get the this table contains the SAF-handling policies which are controlled by the Access Network Provider(s).

        {{keys}}
	 *
	 * @return the value
	 */
	public Collection<ANPPolicy> getAnpPolicies() {
		if (this.anpPolicies == null){ this.anpPolicies=new ArrayList<>();}
		return anpPolicies;
	}

	/**
	 * Set the this table contains the SAF-handling policies which are controlled by the Access Network Provider(s).

        {{keys}}
	 *
	 * @param anpPolicies the input value
	 */
	public void  setAnpPolicies(Collection<ANPPolicy> anpPolicies) {
		this.anpPolicies = anpPolicies;
	}

	/**
	 * Set the this table contains the SAF-handling policies which are controlled by the Access Network Provider(s).

        {{keys}}
	 *
	 * @param anpPolicy the input value
	 * @return this instance
	 */
	public SAFPolicySet withANPPolicy(ANPPolicy anpPolicy) {
		getAnpPolicies().add(anpPolicy);
		return this;
	}

	/**
	 * Get the this object maintains the SAF handling policies' properties that are controlled by the M2M service provider for a request.
	 *
	 * @return the value
	 */
	public M2MSPPolicy getM2mSPPolicy() {
		return m2mSPPolicy;
	}

	/**
	 * Set the this object maintains the SAF handling policies' properties that are controlled by the M2M service provider for a request.
	 *
	 * @param m2mSPPolicy the input value
	 */
	public void  setM2mSPPolicy(M2MSPPolicy m2mSPPolicy) {
		this.m2mSPPolicy = m2mSPPolicy;
	}

	/**
	 * Set the this object maintains the SAF handling policies' properties that are controlled by the M2M service provider for a request.
	 *
	 * @param m2mSPPolicy the input value
	 * @return this instance
	 */
	public SAFPolicySet withM2mSPPolicy(M2MSPPolicy m2mSPPolicy) {
		this.m2mSPPolicy = m2mSPPolicy;
		return this;
	}

	//</editor-fold>

}