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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.A13;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.SelfConfig;

	/**
	 * Operational parameters for the HRPD portion of a CDMA2000 FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.HRPD.")
@XmlRootElement(name = "HRPD")
@XmlType(name = "FAPService.FAPControl.CDMA2000.HRPD")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPD {

	/**
	 * Current operational state of the FAP as defined in ITU-X.731 [32]. If {{true}} the FAP is currently enabled. If {{false}} the FAP is currently disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OpState")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public Boolean opstate;
	/**
	 * Lock or unlock the FAP. This controls the administrative state of the FAP as defined in ITU-X.731 [32]. If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)). If {{false}} Locked. Transition FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled. Given that this command controls the FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as: location verification (including meeting the governing regulatory requirements) verifying the FAP configuration if physical tampering is supported and no physical tampering is detected. The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdminState")
	@CWMPParameter(access = "readWrite")
	public Boolean adminState;
	/**
	 * Current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS.  When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFTxStatus")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public Boolean rftxStatus;
	/**
	 * Indicates whether the FAP performs A13 session transfer. If {{true}} A13 session transfer is enabled; if {{false}} A13 session transfer is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A13SessionTransferEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean a13SessionTransferEnable;
	/**
	 * Indicates whether the FAP can assign local IP address to capable ATs. If {{true}} local IP address is assigned.; if {{false}} local IP address is not assigned.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalIPAccessEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean localIPAccessEnable;
	/**
	 * This object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;
	/**
	 * This object contains attributes related to A13 Session Transfer
	 */
	@XmlElement(name = "A13")
	public A13 a13;

	public HRPD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current operational state of the FAP as defined in ITU-X.731 [32]. If {{true}} the FAP is currently enabled. If {{false}} the FAP is currently disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isOpstate() {
		return opstate;
	}

	/**
	 * Set the current operational state of the FAP as defined in ITU-X.731 [32]. If {{true}} the FAP is currently enabled. If {{false}} the FAP is currently disabled.
	 *
	 * @since 2.0
	 * @param opstate the input value
	 */
	public void  setOpstate(Boolean opstate) {
		this.opstate = opstate;
	}

	/**
	 * Set the current operational state of the FAP as defined in ITU-X.731 [32]. If {{true}} the FAP is currently enabled. If {{false}} the FAP is currently disabled.
	 *
	 * @since 2.0
	 * @param opstate the input value
	 * @return this instance
	 */
	public HRPD withOpstate(Boolean opstate) {
		this.opstate = opstate;
		return this;
	}

	/**
	 * Get the lock or unlock the FAP. This controls the administrative state of the FAP as defined in ITU-X.731 [32]. If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)). If {{false}} Locked. Transition FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled. Given that this command controls the FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as: location verification (including meeting the governing regulatory requirements) verifying the FAP configuration if physical tampering is supported and no physical tampering is detected. The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAdminState() {
		return adminState;
	}

	/**
	 * Set the lock or unlock the FAP. This controls the administrative state of the FAP as defined in ITU-X.731 [32]. If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)). If {{false}} Locked. Transition FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled. Given that this command controls the FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as: location verification (including meeting the governing regulatory requirements) verifying the FAP configuration if physical tampering is supported and no physical tampering is detected. The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @param adminState the input value
	 */
	public void  setAdminState(Boolean adminState) {
		this.adminState = adminState;
	}

	/**
	 * Set the lock or unlock the FAP. This controls the administrative state of the FAP as defined in ITU-X.731 [32]. If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)). If {{false}} Locked. Transition FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled. Given that this command controls the FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as: location verification (including meeting the governing regulatory requirements) verifying the FAP configuration if physical tampering is supported and no physical tampering is detected. The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @param adminState the input value
	 * @return this instance
	 */
	public HRPD withAdminState(Boolean adminState) {
		this.adminState = adminState;
		return this;
	}

	/**
	 * Get the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS.  When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRftxStatus() {
		return rftxStatus;
	}

	/**
	 * Set the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS.  When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 */
	public void  setRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
	}

	/**
	 * Set the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS.  When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 * @return this instance
	 */
	public HRPD withRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
		return this;
	}

	/**
	 * Get the indicates whether the FAP performs A13 session transfer. If {{true}} A13 session transfer is enabled; if {{false}} A13 session transfer is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isA13SessionTransferEnable() {
		return a13SessionTransferEnable;
	}

	/**
	 * Set the indicates whether the FAP performs A13 session transfer. If {{true}} A13 session transfer is enabled; if {{false}} A13 session transfer is disabled.
	 *
	 * @since 2.0
	 * @param a13SessionTransferEnable the input value
	 */
	public void  setA13SessionTransferEnable(Boolean a13SessionTransferEnable) {
		this.a13SessionTransferEnable = a13SessionTransferEnable;
	}

	/**
	 * Set the indicates whether the FAP performs A13 session transfer. If {{true}} A13 session transfer is enabled; if {{false}} A13 session transfer is disabled.
	 *
	 * @since 2.0
	 * @param a13SessionTransferEnable the input value
	 * @return this instance
	 */
	public HRPD withA13SessionTransferEnable(Boolean a13SessionTransferEnable) {
		this.a13SessionTransferEnable = a13SessionTransferEnable;
		return this;
	}

	/**
	 * Get the indicates whether the FAP can assign local IP address to capable ATs. If {{true}} local IP address is assigned.; if {{false}} local IP address is not assigned.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLocalIPAccessEnable() {
		return localIPAccessEnable;
	}

	/**
	 * Set the indicates whether the FAP can assign local IP address to capable ATs. If {{true}} local IP address is assigned.; if {{false}} local IP address is not assigned.
	 *
	 * @since 2.0
	 * @param localIPAccessEnable the input value
	 */
	public void  setLocalIPAccessEnable(Boolean localIPAccessEnable) {
		this.localIPAccessEnable = localIPAccessEnable;
	}

	/**
	 * Set the indicates whether the FAP can assign local IP address to capable ATs. If {{true}} local IP address is assigned.; if {{false}} local IP address is not assigned.
	 *
	 * @since 2.0
	 * @param localIPAccessEnable the input value
	 * @return this instance
	 */
	public HRPD withLocalIPAccessEnable(Boolean localIPAccessEnable) {
		this.localIPAccessEnable = localIPAccessEnable;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @return the value
	 */
	public SelfConfig getSelfConfig() {
		return selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @param selfConfig the input value
	 */
	public void  setSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @param selfConfig the input value
	 * @return this instance
	 */
	public HRPD withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	/**
	 * Get the this object contains attributes related to A13 Session Transfer
	 *
	 * @return the value
	 */
	public A13 getA13() {
		return a13;
	}

	/**
	 * Set the this object contains attributes related to A13 Session Transfer
	 *
	 * @param a13 the input value
	 */
	public void  setA13(A13 a13) {
		this.a13 = a13;
	}

	/**
	 * Set the this object contains attributes related to A13 Session Transfer
	 *
	 * @param a13 the input value
	 * @return this instance
	 */
	public HRPD withA13(A13 a13) {
		this.a13 = a13;
		return this;
	}

	//</editor-fold>

}