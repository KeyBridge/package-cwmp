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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.m2msppolicy;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This object maintains a list of properties to be used for forwarding requests with a specified {{param|RCAT}}.

        Processing behavior for the use of M2M Service Provider policies is defined in section 10.3.1.2.2.1 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.M2MSPPolicy.RequestCategory.{i}.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.SAFPolicySet.M2MSPPolicy.RequestCategory")
@XmlType(name = "Device.ETSIM2M.SCL.SAFPolicySet.M2MSPPolicy.RequestCategory")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestCategory {

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
	 * An RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RCAT")
	@CWMPParameter(access = "readWrite")
	public String rcaT;
	/**
	 * The tolerable duration, in seconds, that a request of the given RCAT category can be pending in SAF handling when a request from an M2M Application does not specify a tolerable delay.

          A value of -1 represents an infinite duration.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "TolerableDelay")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer tolerableDelay = 0;
	/**
	 * The threshold of maximum number of pending requests permitted to be held for a specified RCAT. 

          A value of 0 indicates that the request should be transmitted immediately.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Thresh")
	@CWMPParameter(access = "readWrite")
	public Long thresh = 0L;
	/**
	 * This parameter defines the maximum size of the request queue for pending requests permitted to be held for a specified RCAT. 

          The format of the string is an integer with an appended memory unit (B - Bytes, K - 1024 Bytes, M - 1048576 Bytes, G -1073741824, T - 1099511627776 Bytes).

          When the value is {{empty}}  the memory threshold criteria for the associated RCATList will be ignored in SAF handling.

          {{pattern}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Mem")
	@CWMPParameter(access = "readWrite")
	@Pattern(regexp = "([0-9]{1,15}?[BKMGT])")
	public String mem;
	/**
	 * The list is a prioritized set of Access Networks where the preference of using an Access Network is based on order of the list items with the lowest order list item as the most preferred Access Network.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RankedANList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> rankedANList;

	public RequestCategory() {
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
	public RequestCategory withEnable(Boolean enable) {
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
	public RequestCategory withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getRcaT() {
		return rcaT;
	}

	/**
	 * Set an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @param rcaT the input value
	 */
	public void  setRcaT(String rcaT) {
		this.rcaT = rcaT;
	}

	/**
	 * Set an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @param rcaT the input value
	 * @return this instance
	 */
	public RequestCategory withRcaT(String rcaT) {
		this.rcaT = rcaT;
		return this;
	}

	/**
	 * Get the tolerable duration, in seconds, that a request of the given RCAT category can be pending in SAF handling when a request from an M2M Application does not specify a tolerable delay.

          A value of -1 represents an infinite duration.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getTolerableDelay() {
		return tolerableDelay;
	}

	/**
	 * Set the tolerable duration, in seconds, that a request of the given RCAT category can be pending in SAF handling when a request from an M2M Application does not specify a tolerable delay.

          A value of -1 represents an infinite duration.
	 *
	 * @since 2.6
	 * @param tolerableDelay the input value
	 */
	public void  setTolerableDelay(Integer tolerableDelay) {
		this.tolerableDelay = tolerableDelay;
	}

	/**
	 * Set the tolerable duration, in seconds, that a request of the given RCAT category can be pending in SAF handling when a request from an M2M Application does not specify a tolerable delay.

          A value of -1 represents an infinite duration.
	 *
	 * @since 2.6
	 * @param tolerableDelay the input value
	 * @return this instance
	 */
	public RequestCategory withTolerableDelay(Integer tolerableDelay) {
		this.tolerableDelay = tolerableDelay;
		return this;
	}

	/**
	 * Get the threshold of maximum number of pending requests permitted to be held for a specified RCAT. 

          A value of 0 indicates that the request should be transmitted immediately.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getThresh() {
		return thresh;
	}

	/**
	 * Set the threshold of maximum number of pending requests permitted to be held for a specified RCAT. 

          A value of 0 indicates that the request should be transmitted immediately.
	 *
	 * @since 2.6
	 * @param thresh the input value
	 */
	public void  setThresh(Long thresh) {
		this.thresh = thresh;
	}

	/**
	 * Set the threshold of maximum number of pending requests permitted to be held for a specified RCAT. 

          A value of 0 indicates that the request should be transmitted immediately.
	 *
	 * @since 2.6
	 * @param thresh the input value
	 * @return this instance
	 */
	public RequestCategory withThresh(Long thresh) {
		this.thresh = thresh;
		return this;
	}

	/**
	 * Get the this parameter defines the maximum size of the request queue for pending requests permitted to be held for a specified RCAT. 

          The format of the string is an integer with an appended memory unit (B - Bytes, K - 1024 Bytes, M - 1048576 Bytes, G -1073741824, T - 1099511627776 Bytes).

          When the value is {{empty}}  the memory threshold criteria for the associated RCATList will be ignored in SAF handling.

          {{pattern}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getMem() {
		return mem;
	}

	/**
	 * Set the this parameter defines the maximum size of the request queue for pending requests permitted to be held for a specified RCAT. 

          The format of the string is an integer with an appended memory unit (B - Bytes, K - 1024 Bytes, M - 1048576 Bytes, G -1073741824, T - 1099511627776 Bytes).

          When the value is {{empty}}  the memory threshold criteria for the associated RCATList will be ignored in SAF handling.

          {{pattern}}
	 *
	 * @since 2.6
	 * @param mem the input value
	 */
	public void  setMem(String mem) {
		this.mem = mem;
	}

	/**
	 * Set the this parameter defines the maximum size of the request queue for pending requests permitted to be held for a specified RCAT. 

          The format of the string is an integer with an appended memory unit (B - Bytes, K - 1024 Bytes, M - 1048576 Bytes, G -1073741824, T - 1099511627776 Bytes).

          When the value is {{empty}}  the memory threshold criteria for the associated RCATList will be ignored in SAF handling.

          {{pattern}}
	 *
	 * @since 2.6
	 * @param mem the input value
	 * @return this instance
	 */
	public RequestCategory withMem(String mem) {
		this.mem = mem;
		return this;
	}

	/**
	 * Get the list is a prioritized set of Access Networks where the preference of using an Access Network is based on order of the list items with the lowest order list item as the most preferred Access Network.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getRankedANList() {
		if (this.rankedANList == null){ this.rankedANList=new ArrayList<>();}
		return rankedANList;
	}

	/**
	 * Set the list is a prioritized set of Access Networks where the preference of using an Access Network is based on order of the list items with the lowest order list item as the most preferred Access Network.
	 *
	 * @since 2.6
	 * @param rankedANList the input value
	 */
	public void  setRankedANList(Collection<String> rankedANList) {
		this.rankedANList = rankedANList;
	}

	/**
	 * Set the list is a prioritized set of Access Networks where the preference of using an Access Network is based on order of the list items with the lowest order list item as the most preferred Access Network.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public RequestCategory withRankedANList(String string) {
		getRankedANList().add(string);
		return this;
	}

	//</editor-fold>

}