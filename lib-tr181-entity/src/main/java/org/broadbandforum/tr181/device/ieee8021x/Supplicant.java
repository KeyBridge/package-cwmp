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
package org.broadbandforum.tr181.device.ieee8021x;

import java.util.ArrayList;
import java.util.Collection;
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
import org.broadbandforum.tr181.device.ieee8021x.supplicant.EAPMD5;
import org.broadbandforum.tr181.device.ieee8021x.supplicant.EAPTLS;
import org.broadbandforum.tr181.device.ieee8021x.supplicant.Stats;

	/**
	 * 802.1x supplicant authentication provisioning and status information associated with an interface to be authenticated (e.g. an {{object|.Ethernet.Link}} instance).

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IEEE8021x.Supplicant.{i}.")
@XmlRootElement(name = "Supplicant")
@XmlType(name = "Device.IEEE8021x.Supplicant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplicant {

	/**
	 * This parameter controls whether this resource will utilize the 802.1x protocol as a supplicant for device  authentication purposes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The current operational status of this 802.1x supplicant.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}} The interface on which authentication is to be performed. Example:  Device.Ethernet.Link.1
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The current supplicant state machine as defined in {{bibref|802.1x-2004|9.5.1}}, Supplicant PAE (Port Access Entity) State.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAEState")
	public String paeState;
	/**
	 * The identity to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EAPIdentity")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String eapIdentity;
	/**
	 * The maximum number of times the device will attempt to send an EAP start message before authentication fails as defined in {{bibref|802.1x-2004|9.5.1}}, maxStart.

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxStart")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 10)
	public Long maxStart;
	/**
	 * The period in seconds a supplicant will wait before the device will attempt to re-send an EAP start message as defined in {{bibref|802.1x-2004|9.5.1}}, startPeriod.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long startPeriod;
	/**
	 * The hold-off period in seconds a supplicant will wait before re-attempting authentication as defined in {{bibref|802.1x-2004|9.5.1}}, heldPeriod.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HeldPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long heldPeriod;
	/**
	 * The period in seconds after which a request will be considered timed out as defined in {{bibref|802.1x-2004|9.5.1}}, authPeriod.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long authPeriod;
	/**
	 * {{list}} Indicates the authentication methods supported by the device.  

Enumerated value must be one of [EAP-TLS, EAP-MD5]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthenticationCapabilities")
	@XmlList
	public Collection<String> authenticationCapabilities;
	/**
	 * The action to be taken when authentication has failed, when the network fails to respond to the supplicant's start message, and the retries have been exceeded (since network does not yet support 802.1x).  {{enum}}

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartFailurePolicy")
	@CWMPParameter(access = "readWrite")
	public String startFailurePolicy;
	/**
	 * The action to be taken when authentication succeeds and a connection has already received an address and/or policy settings.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthenticationSuccessPolicy")
	@CWMPParameter(access = "readWrite")
	public String authenticationSuccessPolicy;
	/**
	 * When set to {{true}}, the device MUST reset the session by performing an initial authentication attempt as defined in {{bibref|802.1x-2004|9.6.1.3}}, Initialize Port by sending out the EAP start message.

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the resource in  order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * When set to {{true}}, the device MUST disconnect (forced unauthentication) the resource.

          The device MUST initiate the disconnect after completion of the current CWMP session.  The device MAY delay re-authentication of the  resource in order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Disconnect")
	@CWMPParameter(access = "readWrite")
	public Boolean disconnect;
	/**
	 * 802.1x Authentication Supplicant EAP statistics information for this resource.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * 802.1x Authentication Supplicant provisioning information used for MD5 shared secret exchange. This object will not exist if EAP-MD5 is not a supported authentication type.
	 */
	@XmlElement(name = "EAPMD5")
	public EAPMD5 eapMD5;
	/**
	 * 802.1x Authentication Supplicant provisioning information used for TLS certificate authentication. This object will not exist if the EAP-TLS is not a supported authentication type.
	 */
	@XmlElement(name = "EAPTLS")
	public EAPTLS eapTLS;

	public Supplicant() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter controls whether this resource will utilize the 802.1x protocol as a supplicant for device  authentication purposes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the this parameter controls whether this resource will utilize the 802.1x protocol as a supplicant for device  authentication purposes.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the this parameter controls whether this resource will utilize the 802.1x protocol as a supplicant for device  authentication purposes.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Supplicant withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational status of this 802.1x supplicant.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational status of this 802.1x supplicant.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational status of this 802.1x supplicant.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Supplicant withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Supplicant withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} The interface on which authentication is to be performed. Example:  Device.Ethernet.Link.1
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The interface on which authentication is to be performed. Example:  Device.Ethernet.Link.1
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The interface on which authentication is to be performed. Example:  Device.Ethernet.Link.1
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Supplicant with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the current supplicant state machine as defined in {{bibref|802.1x-2004|9.5.1}}, Supplicant PAE (Port Access Entity) State.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPaeState() {
		return paeState;
	}

	/**
	 * Set the current supplicant state machine as defined in {{bibref|802.1x-2004|9.5.1}}, Supplicant PAE (Port Access Entity) State.  {{enum}}
	 *
	 * @since 2.0
	 * @param paeState the input value
	 */
	public void  setPaeState(String paeState) {
		this.paeState = paeState;
	}

	/**
	 * Set the current supplicant state machine as defined in {{bibref|802.1x-2004|9.5.1}}, Supplicant PAE (Port Access Entity) State.  {{enum}}
	 *
	 * @since 2.0
	 * @param paeState the input value
	 * @return this instance
	 */
	public Supplicant withPaeState(String paeState) {
		this.paeState = paeState;
		return this;
	}

	/**
	 * Get the identity to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEapIdentity() {
		return eapIdentity;
	}

	/**
	 * Set the identity to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @param eapIdentity the input value
	 */
	public void  setEapIdentity(String eapIdentity) {
		this.eapIdentity = eapIdentity;
	}

	/**
	 * Set the identity to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @param eapIdentity the input value
	 * @return this instance
	 */
	public Supplicant withEapIdentity(String eapIdentity) {
		this.eapIdentity = eapIdentity;
		return this;
	}

	/**
	 * Get the maximum number of times the device will attempt to send an EAP start message before authentication fails as defined in {{bibref|802.1x-2004|9.5.1}}, maxStart.

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxStart() {
		return maxStart;
	}

	/**
	 * Set the maximum number of times the device will attempt to send an EAP start message before authentication fails as defined in {{bibref|802.1x-2004|9.5.1}}, maxStart.

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @param maxStart the input value
	 */
	public void  setMaxStart(Long maxStart) {
		this.maxStart = maxStart;
	}

	/**
	 * Set the maximum number of times the device will attempt to send an EAP start message before authentication fails as defined in {{bibref|802.1x-2004|9.5.1}}, maxStart.

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @param maxStart the input value
	 * @return this instance
	 */
	public Supplicant withMaxStart(Long maxStart) {
		this.maxStart = maxStart;
		return this;
	}

	/**
	 * Get the period in seconds a supplicant will wait before the device will attempt to re-send an EAP start message as defined in {{bibref|802.1x-2004|9.5.1}}, startPeriod.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getStartPeriod() {
		return startPeriod;
	}

	/**
	 * Set the period in seconds a supplicant will wait before the device will attempt to re-send an EAP start message as defined in {{bibref|802.1x-2004|9.5.1}}, startPeriod.
	 *
	 * @since 2.0
	 * @param startPeriod the input value
	 */
	public void  setStartPeriod(Long startPeriod) {
		this.startPeriod = startPeriod;
	}

	/**
	 * Set the period in seconds a supplicant will wait before the device will attempt to re-send an EAP start message as defined in {{bibref|802.1x-2004|9.5.1}}, startPeriod.
	 *
	 * @since 2.0
	 * @param startPeriod the input value
	 * @return this instance
	 */
	public Supplicant withStartPeriod(Long startPeriod) {
		this.startPeriod = startPeriod;
		return this;
	}

	/**
	 * Get the hold-off period in seconds a supplicant will wait before re-attempting authentication as defined in {{bibref|802.1x-2004|9.5.1}}, heldPeriod.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHeldPeriod() {
		return heldPeriod;
	}

	/**
	 * Set the hold-off period in seconds a supplicant will wait before re-attempting authentication as defined in {{bibref|802.1x-2004|9.5.1}}, heldPeriod.
	 *
	 * @since 2.0
	 * @param heldPeriod the input value
	 */
	public void  setHeldPeriod(Long heldPeriod) {
		this.heldPeriod = heldPeriod;
	}

	/**
	 * Set the hold-off period in seconds a supplicant will wait before re-attempting authentication as defined in {{bibref|802.1x-2004|9.5.1}}, heldPeriod.
	 *
	 * @since 2.0
	 * @param heldPeriod the input value
	 * @return this instance
	 */
	public Supplicant withHeldPeriod(Long heldPeriod) {
		this.heldPeriod = heldPeriod;
		return this;
	}

	/**
	 * Get the period in seconds after which a request will be considered timed out as defined in {{bibref|802.1x-2004|9.5.1}}, authPeriod.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuthPeriod() {
		return authPeriod;
	}

	/**
	 * Set the period in seconds after which a request will be considered timed out as defined in {{bibref|802.1x-2004|9.5.1}}, authPeriod.
	 *
	 * @since 2.0
	 * @param authPeriod the input value
	 */
	public void  setAuthPeriod(Long authPeriod) {
		this.authPeriod = authPeriod;
	}

	/**
	 * Set the period in seconds after which a request will be considered timed out as defined in {{bibref|802.1x-2004|9.5.1}}, authPeriod.
	 *
	 * @since 2.0
	 * @param authPeriod the input value
	 * @return this instance
	 */
	public Supplicant withAuthPeriod(Long authPeriod) {
		this.authPeriod = authPeriod;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the authentication methods supported by the device.  

Enumerated value must be one of [EAP-TLS, EAP-MD5]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAuthenticationCapabilities() {
		if (this.authenticationCapabilities == null){ this.authenticationCapabilities=new ArrayList<>();}
		return authenticationCapabilities;
	}

	/**
	 * Set the {{list}} Indicates the authentication methods supported by the device.  

Enumerated value must be one of [EAP-TLS, EAP-MD5]
	 *
	 * @since 2.0
	 * @param authenticationCapabilities the input value
	 */
	public void  setAuthenticationCapabilities(Collection<String> authenticationCapabilities) {
		this.authenticationCapabilities = authenticationCapabilities;
	}

	/**
	 * Set the {{list}} Indicates the authentication methods supported by the device.  

Enumerated value must be one of [EAP-TLS, EAP-MD5]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Supplicant withAuthenticationCapabilities(String string) {
		getAuthenticationCapabilities().add(string);
		return this;
	}

	/**
	 * Get the action to be taken when authentication has failed, when the network fails to respond to the supplicant's start message, and the retries have been exceeded (since network does not yet support 802.1x).  {{enum}}

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStartFailurePolicy() {
		return startFailurePolicy;
	}

	/**
	 * Set the action to be taken when authentication has failed, when the network fails to respond to the supplicant's start message, and the retries have been exceeded (since network does not yet support 802.1x).  {{enum}}

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @param startFailurePolicy the input value
	 */
	public void  setStartFailurePolicy(String startFailurePolicy) {
		this.startFailurePolicy = startFailurePolicy;
	}

	/**
	 * Set the action to be taken when authentication has failed, when the network fails to respond to the supplicant's start message, and the retries have been exceeded (since network does not yet support 802.1x).  {{enum}}

          This is in support of {{bibref|802.1x-2004|Section 8.4.6}}, Migration Considerations.
	 *
	 * @since 2.0
	 * @param startFailurePolicy the input value
	 * @return this instance
	 */
	public Supplicant withStartFailurePolicy(String startFailurePolicy) {
		this.startFailurePolicy = startFailurePolicy;
		return this;
	}

	/**
	 * Get the action to be taken when authentication succeeds and a connection has already received an address and/or policy settings.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthenticationSuccessPolicy() {
		return authenticationSuccessPolicy;
	}

	/**
	 * Set the action to be taken when authentication succeeds and a connection has already received an address and/or policy settings.  {{enum}}
	 *
	 * @since 2.0
	 * @param authenticationSuccessPolicy the input value
	 */
	public void  setAuthenticationSuccessPolicy(String authenticationSuccessPolicy) {
		this.authenticationSuccessPolicy = authenticationSuccessPolicy;
	}

	/**
	 * Set the action to be taken when authentication succeeds and a connection has already received an address and/or policy settings.  {{enum}}
	 *
	 * @since 2.0
	 * @param authenticationSuccessPolicy the input value
	 * @return this instance
	 */
	public Supplicant withAuthenticationSuccessPolicy(String authenticationSuccessPolicy) {
		this.authenticationSuccessPolicy = authenticationSuccessPolicy;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the device MUST reset the session by performing an initial authentication attempt as defined in {{bibref|802.1x-2004|9.6.1.3}}, Initialize Port by sending out the EAP start message.

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the resource in  order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST reset the session by performing an initial authentication attempt as defined in {{bibref|802.1x-2004|9.6.1.3}}, Initialize Port by sending out the EAP start message.

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the resource in  order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST reset the session by performing an initial authentication attempt as defined in {{bibref|802.1x-2004|9.6.1.3}}, Initialize Port by sending out the EAP start message.

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the resource in  order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public Supplicant withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the device MUST disconnect (forced unauthentication) the resource.

          The device MUST initiate the disconnect after completion of the current CWMP session.  The device MAY delay re-authentication of the  resource in order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDisconnect() {
		return disconnect;
	}

	/**
	 * Set the when set to {{true}}, the device MUST disconnect (forced unauthentication) the resource.

          The device MUST initiate the disconnect after completion of the current CWMP session.  The device MAY delay re-authentication of the  resource in order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @param disconnect the input value
	 */
	public void  setDisconnect(Boolean disconnect) {
		this.disconnect = disconnect;
	}

	/**
	 * Set the when set to {{true}}, the device MUST disconnect (forced unauthentication) the resource.

          The device MUST initiate the disconnect after completion of the current CWMP session.  The device MAY delay re-authentication of the  resource in order to avoid interruption of a user service such as an ongoing voice call.
	 *
	 * @since 2.0
	 * @param disconnect the input value
	 * @return this instance
	 */
	public Supplicant withDisconnect(Boolean disconnect) {
		this.disconnect = disconnect;
		return this;
	}

	/**
	 * Get the 802.1x Authentication Supplicant EAP statistics information for this resource.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the 802.1x Authentication Supplicant EAP statistics information for this resource.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the 802.1x Authentication Supplicant EAP statistics information for this resource.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Supplicant withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the 802.1x Authentication Supplicant provisioning information used for MD5 shared secret exchange. This object will not exist if EAP-MD5 is not a supported authentication type.
	 *
	 * @return the value
	 */
	public EAPMD5 getEapMD5() {
		return eapMD5;
	}

	/**
	 * Set the 802.1x Authentication Supplicant provisioning information used for MD5 shared secret exchange. This object will not exist if EAP-MD5 is not a supported authentication type.
	 *
	 * @param eapMD5 the input value
	 */
	public void  setEapMD5(EAPMD5 eapMD5) {
		this.eapMD5 = eapMD5;
	}

	/**
	 * Set the 802.1x Authentication Supplicant provisioning information used for MD5 shared secret exchange. This object will not exist if EAP-MD5 is not a supported authentication type.
	 *
	 * @param eapMD5 the input value
	 * @return this instance
	 */
	public Supplicant withEapMD5(EAPMD5 eapMD5) {
		this.eapMD5 = eapMD5;
		return this;
	}

	/**
	 * Get the 802.1x Authentication Supplicant provisioning information used for TLS certificate authentication. This object will not exist if the EAP-TLS is not a supported authentication type.
	 *
	 * @return the value
	 */
	public EAPTLS getEapTLS() {
		return eapTLS;
	}

	/**
	 * Set the 802.1x Authentication Supplicant provisioning information used for TLS certificate authentication. This object will not exist if the EAP-TLS is not a supported authentication type.
	 *
	 * @param eapTLS the input value
	 */
	public void  setEapTLS(EAPTLS eapTLS) {
		this.eapTLS = eapTLS;
	}

	/**
	 * Set the 802.1x Authentication Supplicant provisioning information used for TLS certificate authentication. This object will not exist if the EAP-TLS is not a supported authentication type.
	 *
	 * @param eapTLS the input value
	 * @return this instance
	 */
	public Supplicant withEapTLS(EAPTLS eapTLS) {
		this.eapTLS = eapTLS;
		return this;
	}

	//</editor-fold>

}