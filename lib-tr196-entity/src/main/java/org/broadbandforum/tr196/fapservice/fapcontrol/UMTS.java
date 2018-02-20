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
package org.broadbandforum.tr196.fapservice.fapcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.umts.Gateway;
import org.broadbandforum.tr196.fapservice.fapcontrol.umts.SelfConfig;

	/**
	 * This object contains parameters relating to the UMTS system specific information.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.UMTS.")
@XmlRootElement(name = "FAPService.FAPControl.UMTS")
@XmlType(name = "FAPService.FAPControl.UMTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class UMTS {

	/**
	 * Current operational state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} the UMTS FAP is currently enabled.

If {{false}} the UMTS FAP is currently disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OpState")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public Boolean opstate;
	/**
	 * Lock or unlock the UMTS FAP. This controls the administrative state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)).

If {{false}} Locked. Transition UMTS FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled.

Given that this command controls the UMTS FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as:

# location verification (including meeting the governing regulatory requirements)

# verifying the UMTS FAP configuration

# if physical tampering is supported and no physical tampering is detected.

The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdminState")
	@CWMPParameter(access = "readWrite")
	public Boolean adminState;
	/**
	 * Current status of this UMTS FAP RF transmitter.

{{true}} indicates that the UMTS FAP Tx transmitter is on.

{{false}} indicates that the UMTS FAP Tx transmitter is off.

This state is tied to the Administrative state which is controlled by the ACS.

:When the ACS sets {{param|AdminState}} to {{true}}, then the UMTS FAP has permission to turn on the RF transmitter.

:When the ACS sets {{param|AdminState}} to {{false}}, then the UMTS FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFTxStatus")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public Boolean rftxStatus;
	/**
	 * The value MUST be the path name of a row in the optional ''FAP.PerfMgmt.Config.'' table (see {{bibref|TR-262}}).

This is the performance management related configuration for the UMTS FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PMConfig")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String pmconfig;
	/**
	 * This object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;
	/**
	 * This object contains parameters relating to the Gateways that FAP is connected to.
	 */
	@XmlElement(name = "Gateway")
	public Gateway gateway;

	public UMTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current operational state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} the UMTS FAP is currently enabled.

If {{false}} the UMTS FAP is currently disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isOpstate() {
		return opstate;
	}

	/**
	 * Set the current operational state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} the UMTS FAP is currently enabled.

If {{false}} the UMTS FAP is currently disabled.
	 *
	 * @since 2.0
	 * @param opstate the input value
	 */
	public void  setOpstate(Boolean opstate) {
		this.opstate = opstate;
	}

	/**
	 * Set the current operational state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} the UMTS FAP is currently enabled.

If {{false}} the UMTS FAP is currently disabled.
	 *
	 * @since 2.0
	 * @param opstate the input value
	 * @return this instance
	 */
	public UMTS withOpstate(Boolean opstate) {
		this.opstate = opstate;
		return this;
	}

	/**
	 * Get the lock or unlock the UMTS FAP. This controls the administrative state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)).

If {{false}} Locked. Transition UMTS FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled.

Given that this command controls the UMTS FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as:

# location verification (including meeting the governing regulatory requirements)

# verifying the UMTS FAP configuration

# if physical tampering is supported and no physical tampering is detected.

The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAdminState() {
		return adminState;
	}

	/**
	 * Set the lock or unlock the UMTS FAP. This controls the administrative state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)).

If {{false}} Locked. Transition UMTS FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled.

Given that this command controls the UMTS FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as:

# location verification (including meeting the governing regulatory requirements)

# verifying the UMTS FAP configuration

# if physical tampering is supported and no physical tampering is detected.

The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @param adminState the input value
	 */
	public void  setAdminState(Boolean adminState) {
		this.adminState = adminState;
	}

	/**
	 * Set the lock or unlock the UMTS FAP. This controls the administrative state of the UMTS FAP as defined in {{bibref|ITU-X.731}}.

If {{true}} Unlocked with permission to serve traffic (and enable RF transmitter(s)).

If {{false}} Locked. Transition UMTS FAP to state where it is NOT permitted to serve traffic. RF transmitter is disabled.

Given that this command controls the UMTS FAP's RF transmitter, the underlying expectation is that the unlock is done when all necessary conditions are met to allow the transmitter to key on and provide service, including aspects such as:

# location verification (including meeting the governing regulatory requirements)

# verifying the UMTS FAP configuration

# if physical tampering is supported and no physical tampering is detected.

The default value after power-on is {{false}}.
	 *
	 * @since 2.0
	 * @param adminState the input value
	 * @return this instance
	 */
	public UMTS withAdminState(Boolean adminState) {
		this.adminState = adminState;
		return this;
	}

	/**
	 * Get the current status of this UMTS FAP RF transmitter.

{{true}} indicates that the UMTS FAP Tx transmitter is on.

{{false}} indicates that the UMTS FAP Tx transmitter is off.

This state is tied to the Administrative state which is controlled by the ACS.

:When the ACS sets {{param|AdminState}} to {{true}}, then the UMTS FAP has permission to turn on the RF transmitter.

:When the ACS sets {{param|AdminState}} to {{false}}, then the UMTS FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRftxStatus() {
		return rftxStatus;
	}

	/**
	 * Set the current status of this UMTS FAP RF transmitter.

{{true}} indicates that the UMTS FAP Tx transmitter is on.

{{false}} indicates that the UMTS FAP Tx transmitter is off.

This state is tied to the Administrative state which is controlled by the ACS.

:When the ACS sets {{param|AdminState}} to {{true}}, then the UMTS FAP has permission to turn on the RF transmitter.

:When the ACS sets {{param|AdminState}} to {{false}}, then the UMTS FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 */
	public void  setRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
	}

	/**
	 * Set the current status of this UMTS FAP RF transmitter.

{{true}} indicates that the UMTS FAP Tx transmitter is on.

{{false}} indicates that the UMTS FAP Tx transmitter is off.

This state is tied to the Administrative state which is controlled by the ACS.

:When the ACS sets {{param|AdminState}} to {{true}}, then the UMTS FAP has permission to turn on the RF transmitter.

:When the ACS sets {{param|AdminState}} to {{false}}, then the UMTS FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 * @return this instance
	 */
	public UMTS withRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
		return this;
	}

	/**
	 * Get the value MUST be the path name of a row in the optional ''FAP.PerfMgmt.Config.'' table (see {{bibref|TR-262}}).

This is the performance management related configuration for the UMTS FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPmconfig() {
		return pmconfig;
	}

	/**
	 * Set the value MUST be the path name of a row in the optional ''FAP.PerfMgmt.Config.'' table (see {{bibref|TR-262}}).

This is the performance management related configuration for the UMTS FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @param pmconfig the input value
	 */
	public void  setPmconfig(String pmconfig) {
		this.pmconfig = pmconfig;
	}

	/**
	 * Set the value MUST be the path name of a row in the optional ''FAP.PerfMgmt.Config.'' table (see {{bibref|TR-262}}).

This is the performance management related configuration for the UMTS FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @param pmconfig the input value
	 * @return this instance
	 */
	public UMTS withPmconfig(String pmconfig) {
		this.pmconfig = pmconfig;
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
	public UMTS withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the Gateways that FAP is connected to.
	 *
	 * @return the value
	 */
	public Gateway getGateway() {
		return gateway;
	}

	/**
	 * Set the this object contains parameters relating to the Gateways that FAP is connected to.
	 *
	 * @param gateway the input value
	 */
	public void  setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	/**
	 * Set the this object contains parameters relating to the Gateways that FAP is connected to.
	 *
	 * @param gateway the input value
	 * @return this instance
	 */
	public UMTS withGateway(Gateway gateway) {
		this.gateway = gateway;
		return this;
	}

	//</editor-fold>

}