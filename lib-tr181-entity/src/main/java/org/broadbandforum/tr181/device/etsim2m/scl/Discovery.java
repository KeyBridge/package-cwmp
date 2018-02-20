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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is represents the administration properties used when a NSCL requests discovery of resources within this {{object|##.SCL}} instance.

        Section 9.3.2.27 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the process of discovery of resources within a SCL.
	 *
	 * @since TR181 v2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.Discovery.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.Discovery")
@XmlType(name = "Device.ETSIM2M.SCL.Discovery")
@XmlAccessorType(XmlAccessType.FIELD)
public class Discovery {

	/**
	 * The maximum number of URIs {{bibref|RFC3986}} for discovered resources contained in a discovery result.

          This parameter and the {{param|MaxSizeOfDiscovAnswer}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "MaxNumberOfDiscovRecords")
	@CWMPParameter(access = "readWrite")
	public Long maxNumberOfDiscovRecords;
	/**
	 * The maximum size in bytes of the Discovery Answer.

          This parameter and the {{param|MaxNumberOfDiscovRecords}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "MaxSizeOfDiscovAnswer")
	@CWMPParameter(access = "readWrite")
	public Long maxSizeOfDiscovAnswer;

	public Discovery() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of URIs {{bibref|RFC3986}} for discovered resources contained in a discovery result.

          This parameter and the {{param|MaxSizeOfDiscovAnswer}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getMaxNumberOfDiscovRecords() {
		return maxNumberOfDiscovRecords;
	}

	/**
	 * Set the maximum number of URIs {{bibref|RFC3986}} for discovered resources contained in a discovery result.

          This parameter and the {{param|MaxSizeOfDiscovAnswer}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @param maxNumberOfDiscovRecords the input value
	 */
	public void  setMaxNumberOfDiscovRecords(Long maxNumberOfDiscovRecords) {
		this.maxNumberOfDiscovRecords = maxNumberOfDiscovRecords;
	}

	/**
	 * Set the maximum number of URIs {{bibref|RFC3986}} for discovered resources contained in a discovery result.

          This parameter and the {{param|MaxSizeOfDiscovAnswer}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @param maxNumberOfDiscovRecords the input value
	 * @return this instance
	 */
	public Discovery withMaxNumberOfDiscovRecords(Long maxNumberOfDiscovRecords) {
		this.maxNumberOfDiscovRecords = maxNumberOfDiscovRecords;
		return this;
	}

	/**
	 * Get the maximum size in bytes of the Discovery Answer.

          This parameter and the {{param|MaxNumberOfDiscovRecords}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getMaxSizeOfDiscovAnswer() {
		return maxSizeOfDiscovAnswer;
	}

	/**
	 * Set the maximum size in bytes of the Discovery Answer.

          This parameter and the {{param|MaxNumberOfDiscovRecords}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @param maxSizeOfDiscovAnswer the input value
	 */
	public void  setMaxSizeOfDiscovAnswer(Long maxSizeOfDiscovAnswer) {
		this.maxSizeOfDiscovAnswer = maxSizeOfDiscovAnswer;
	}

	/**
	 * Set the maximum size in bytes of the Discovery Answer.

          This parameter and the {{param|MaxNumberOfDiscovRecords}} parameter are mutually exclusive in that a result can be limited due to the bounds of either parameter.

          A value of 0 indicates that the SCL does not have a limit for this parameter.
	 *
	 * @since 2.6
	 * @param maxSizeOfDiscovAnswer the input value
	 * @return this instance
	 */
	public Discovery withMaxSizeOfDiscovAnswer(Long maxSizeOfDiscovAnswer) {
		this.maxSizeOfDiscovAnswer = maxSizeOfDiscovAnswer;
		return this;
	}

	//</editor-fold>

}