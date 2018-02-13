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
package org.broadbandforum.tr181.device.fap.applicationplatform;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters related to the capabilities of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.ApplicationPlatform.Capabilities.")
@XmlRootElement(name = "Capabilities")
@XmlType(name = "Device.FAP.ApplicationPlatform.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * Specifies whether the Femto Application Platform supports Presence-Based Femtozone Applications
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "PresenceApplicationSupport")
	public Boolean presenceApplicationSupport;
	/**
	 * Specifies whether the Femto Awareness API is supported on this device.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "FemtoAwarenessAPISupport")
	public Boolean femtoAwarenessAPISupport;
	/**
	 * Specifies whether the SMS API is supported on this device.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SMSAPISupport")
	public Boolean smsAPISupport;
	/**
	 * Specifies whether the SubscribeToNotificationsOfSMSSentToApplication functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SubscribeToNotificationsOfSMSSentToApplicationSupport")
	public Boolean subscribeToNotificationsOfSMSSentToApplicationSupport;
	/**
	 * Specifies whether the QuerySMSDeliveryStatus functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "QuerySMSDeliveryStatusSupport")
	public Boolean querySMSDeliveryStatusSupport;
	/**
	 * Specifies whether the MMS API is supported on this device.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MMSAPISupport")
	public Boolean mmsAPISupport;
	/**
	 * Specifies whether the QueryMMSDeliveryStatus functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "QueryMMSDeliveryStatusSupport")
	public Boolean queryMMSDeliveryStatusSupport;
	/**
	 * Specifies whether the SubscribeToNotificationsOfMMSSentToApplication functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SubscribeToNotificationsOfMMSSentToApplicationSupport")
	public Boolean subscribeToNotificationsOfMMSSentToApplicationSupport;
	/**
	 * Specifies whether the Terminal Location API is supported on this device.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "TerminalLocationAPISupport")
	public Boolean terminalLocationAPISupport;
	/**
	 * Specifies the supported methods that 3rd Party Applications can use to authenticate with the Femto Application Platform at initialization. Comma separated list of strings.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AuthenticationMethodsSupported")
	@XmlList
	public Collection<String> authenticationMethodsSupported;
	/**
	 * Specifies the supported access levels that 3rd Party Applications can request when authenticating with the Femto Application Platform at initialization. This access level is with respect to resources within the Femto Application Platform only (not to be confused with Access Mode parameter in .FAPService.{i}.AccessMgmt).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AccessLevelsSupported")
	@XmlList
	public Collection<String> accessLevelsSupported;
	/**
	 * Specifies the supported types of addresses SMSs can be sent to.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SendSMSTargetAddressType")
	@XmlList
	public Collection<String> sendSMSTargetAddressType;
	/**
	 * Specifies the supported types of addresses MMSs can be sent to.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SendMMSTargetAddressType")
	@XmlList
	public Collection<String> sendMMSTargetAddressType;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies whether the Femto Application Platform supports Presence-Based Femtozone Applications
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isPresenceApplicationSupport() {
		return presenceApplicationSupport;
	}

	/**
	 * Set the specifies whether the Femto Application Platform supports Presence-Based Femtozone Applications
	 *
	 * @since 2.4
	 * @param presenceApplicationSupport the input value
	 */
	public void  setPresenceApplicationSupport(Boolean presenceApplicationSupport) {
		this.presenceApplicationSupport = presenceApplicationSupport;
	}

	/**
	 * Set the specifies whether the Femto Application Platform supports Presence-Based Femtozone Applications
	 *
	 * @since 2.4
	 * @param presenceApplicationSupport the input value
	 * @return this instance
	 */
	public Capabilities withPresenceApplicationSupport(Boolean presenceApplicationSupport) {
		this.presenceApplicationSupport = presenceApplicationSupport;
		return this;
	}

	/**
	 * Get the specifies whether the Femto Awareness API is supported on this device.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isFemtoAwarenessAPISupport() {
		return femtoAwarenessAPISupport;
	}

	/**
	 * Set the specifies whether the Femto Awareness API is supported on this device.
	 *
	 * @since 2.4
	 * @param femtoAwarenessAPISupport the input value
	 */
	public void  setFemtoAwarenessAPISupport(Boolean femtoAwarenessAPISupport) {
		this.femtoAwarenessAPISupport = femtoAwarenessAPISupport;
	}

	/**
	 * Set the specifies whether the Femto Awareness API is supported on this device.
	 *
	 * @since 2.4
	 * @param femtoAwarenessAPISupport the input value
	 * @return this instance
	 */
	public Capabilities withFemtoAwarenessAPISupport(Boolean femtoAwarenessAPISupport) {
		this.femtoAwarenessAPISupport = femtoAwarenessAPISupport;
		return this;
	}

	/**
	 * Get the specifies whether the SMS API is supported on this device.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isSmsAPISupport() {
		return smsAPISupport;
	}

	/**
	 * Set the specifies whether the SMS API is supported on this device.
	 *
	 * @since 2.4
	 * @param smsAPISupport the input value
	 */
	public void  setSmsAPISupport(Boolean smsAPISupport) {
		this.smsAPISupport = smsAPISupport;
	}

	/**
	 * Set the specifies whether the SMS API is supported on this device.
	 *
	 * @since 2.4
	 * @param smsAPISupport the input value
	 * @return this instance
	 */
	public Capabilities withSmsAPISupport(Boolean smsAPISupport) {
		this.smsAPISupport = smsAPISupport;
		return this;
	}

	/**
	 * Get the specifies whether the SubscribeToNotificationsOfSMSSentToApplication functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isSubscribeToNotificationsOfSMSSentToApplicationSupport() {
		return subscribeToNotificationsOfSMSSentToApplicationSupport;
	}

	/**
	 * Set the specifies whether the SubscribeToNotificationsOfSMSSentToApplication functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsOfSMSSentToApplicationSupport the input value
	 */
	public void  setSubscribeToNotificationsOfSMSSentToApplicationSupport(Boolean subscribeToNotificationsOfSMSSentToApplicationSupport) {
		this.subscribeToNotificationsOfSMSSentToApplicationSupport = subscribeToNotificationsOfSMSSentToApplicationSupport;
	}

	/**
	 * Set the specifies whether the SubscribeToNotificationsOfSMSSentToApplication functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsOfSMSSentToApplicationSupport the input value
	 * @return this instance
	 */
	public Capabilities withSubscribeToNotificationsOfSMSSentToApplicationSupport(Boolean subscribeToNotificationsOfSMSSentToApplicationSupport) {
		this.subscribeToNotificationsOfSMSSentToApplicationSupport = subscribeToNotificationsOfSMSSentToApplicationSupport;
		return this;
	}

	/**
	 * Get the specifies whether the QuerySMSDeliveryStatus functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isQuerySMSDeliveryStatusSupport() {
		return querySMSDeliveryStatusSupport;
	}

	/**
	 * Set the specifies whether the QuerySMSDeliveryStatus functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @param querySMSDeliveryStatusSupport the input value
	 */
	public void  setQuerySMSDeliveryStatusSupport(Boolean querySMSDeliveryStatusSupport) {
		this.querySMSDeliveryStatusSupport = querySMSDeliveryStatusSupport;
	}

	/**
	 * Set the specifies whether the QuerySMSDeliveryStatus functionality is supported by the FAP SMS API.
	 *
	 * @since 2.4
	 * @param querySMSDeliveryStatusSupport the input value
	 * @return this instance
	 */
	public Capabilities withQuerySMSDeliveryStatusSupport(Boolean querySMSDeliveryStatusSupport) {
		this.querySMSDeliveryStatusSupport = querySMSDeliveryStatusSupport;
		return this;
	}

	/**
	 * Get the specifies whether the MMS API is supported on this device.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isMmsAPISupport() {
		return mmsAPISupport;
	}

	/**
	 * Set the specifies whether the MMS API is supported on this device.
	 *
	 * @since 2.4
	 * @param mmsAPISupport the input value
	 */
	public void  setMmsAPISupport(Boolean mmsAPISupport) {
		this.mmsAPISupport = mmsAPISupport;
	}

	/**
	 * Set the specifies whether the MMS API is supported on this device.
	 *
	 * @since 2.4
	 * @param mmsAPISupport the input value
	 * @return this instance
	 */
	public Capabilities withMmsAPISupport(Boolean mmsAPISupport) {
		this.mmsAPISupport = mmsAPISupport;
		return this;
	}

	/**
	 * Get the specifies whether the QueryMMSDeliveryStatus functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isQueryMMSDeliveryStatusSupport() {
		return queryMMSDeliveryStatusSupport;
	}

	/**
	 * Set the specifies whether the QueryMMSDeliveryStatus functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @param queryMMSDeliveryStatusSupport the input value
	 */
	public void  setQueryMMSDeliveryStatusSupport(Boolean queryMMSDeliveryStatusSupport) {
		this.queryMMSDeliveryStatusSupport = queryMMSDeliveryStatusSupport;
	}

	/**
	 * Set the specifies whether the QueryMMSDeliveryStatus functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @param queryMMSDeliveryStatusSupport the input value
	 * @return this instance
	 */
	public Capabilities withQueryMMSDeliveryStatusSupport(Boolean queryMMSDeliveryStatusSupport) {
		this.queryMMSDeliveryStatusSupport = queryMMSDeliveryStatusSupport;
		return this;
	}

	/**
	 * Get the specifies whether the SubscribeToNotificationsOfMMSSentToApplication functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isSubscribeToNotificationsOfMMSSentToApplicationSupport() {
		return subscribeToNotificationsOfMMSSentToApplicationSupport;
	}

	/**
	 * Set the specifies whether the SubscribeToNotificationsOfMMSSentToApplication functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsOfMMSSentToApplicationSupport the input value
	 */
	public void  setSubscribeToNotificationsOfMMSSentToApplicationSupport(Boolean subscribeToNotificationsOfMMSSentToApplicationSupport) {
		this.subscribeToNotificationsOfMMSSentToApplicationSupport = subscribeToNotificationsOfMMSSentToApplicationSupport;
	}

	/**
	 * Set the specifies whether the SubscribeToNotificationsOfMMSSentToApplication functionality is supported by the FAP MMS API.
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsOfMMSSentToApplicationSupport the input value
	 * @return this instance
	 */
	public Capabilities withSubscribeToNotificationsOfMMSSentToApplicationSupport(Boolean subscribeToNotificationsOfMMSSentToApplicationSupport) {
		this.subscribeToNotificationsOfMMSSentToApplicationSupport = subscribeToNotificationsOfMMSSentToApplicationSupport;
		return this;
	}

	/**
	 * Get the specifies whether the Terminal Location API is supported on this device.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isTerminalLocationAPISupport() {
		return terminalLocationAPISupport;
	}

	/**
	 * Set the specifies whether the Terminal Location API is supported on this device.
	 *
	 * @since 2.4
	 * @param terminalLocationAPISupport the input value
	 */
	public void  setTerminalLocationAPISupport(Boolean terminalLocationAPISupport) {
		this.terminalLocationAPISupport = terminalLocationAPISupport;
	}

	/**
	 * Set the specifies whether the Terminal Location API is supported on this device.
	 *
	 * @since 2.4
	 * @param terminalLocationAPISupport the input value
	 * @return this instance
	 */
	public Capabilities withTerminalLocationAPISupport(Boolean terminalLocationAPISupport) {
		this.terminalLocationAPISupport = terminalLocationAPISupport;
		return this;
	}

	/**
	 * Get the specifies the supported methods that 3rd Party Applications can use to authenticate with the Femto Application Platform at initialization. Comma separated list of strings.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getAuthenticationMethodsSupported() {
		if (this.authenticationMethodsSupported == null){ this.authenticationMethodsSupported=new ArrayList<>();}
		return authenticationMethodsSupported;
	}

	/**
	 * Set the specifies the supported methods that 3rd Party Applications can use to authenticate with the Femto Application Platform at initialization. Comma separated list of strings.
	 *
	 * @since 2.4
	 * @param authenticationMethodsSupported the input value
	 */
	public void  setAuthenticationMethodsSupported(Collection<String> authenticationMethodsSupported) {
		this.authenticationMethodsSupported = authenticationMethodsSupported;
	}

	/**
	 * Set the specifies the supported methods that 3rd Party Applications can use to authenticate with the Femto Application Platform at initialization. Comma separated list of strings.
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withAuthenticationMethodsSupported(String string) {
		getAuthenticationMethodsSupported().add(string);
		return this;
	}

	/**
	 * Get the specifies the supported access levels that 3rd Party Applications can request when authenticating with the Femto Application Platform at initialization. This access level is with respect to resources within the Femto Application Platform only (not to be confused with Access Mode parameter in .FAPService.{i}.AccessMgmt).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getAccessLevelsSupported() {
		if (this.accessLevelsSupported == null){ this.accessLevelsSupported=new ArrayList<>();}
		return accessLevelsSupported;
	}

	/**
	 * Set the specifies the supported access levels that 3rd Party Applications can request when authenticating with the Femto Application Platform at initialization. This access level is with respect to resources within the Femto Application Platform only (not to be confused with Access Mode parameter in .FAPService.{i}.AccessMgmt).
	 *
	 * @since 2.4
	 * @param accessLevelsSupported the input value
	 */
	public void  setAccessLevelsSupported(Collection<String> accessLevelsSupported) {
		this.accessLevelsSupported = accessLevelsSupported;
	}

	/**
	 * Set the specifies the supported access levels that 3rd Party Applications can request when authenticating with the Femto Application Platform at initialization. This access level is with respect to resources within the Femto Application Platform only (not to be confused with Access Mode parameter in .FAPService.{i}.AccessMgmt).
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withAccessLevelsSupported(String string) {
		getAccessLevelsSupported().add(string);
		return this;
	}

	/**
	 * Get the specifies the supported types of addresses SMSs can be sent to.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getSendSMSTargetAddressType() {
		if (this.sendSMSTargetAddressType == null){ this.sendSMSTargetAddressType=new ArrayList<>();}
		return sendSMSTargetAddressType;
	}

	/**
	 * Set the specifies the supported types of addresses SMSs can be sent to.
	 *
	 * @since 2.4
	 * @param sendSMSTargetAddressType the input value
	 */
	public void  setSendSMSTargetAddressType(Collection<String> sendSMSTargetAddressType) {
		this.sendSMSTargetAddressType = sendSMSTargetAddressType;
	}

	/**
	 * Set the specifies the supported types of addresses SMSs can be sent to.
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSendSMSTargetAddressType(String string) {
		getSendSMSTargetAddressType().add(string);
		return this;
	}

	/**
	 * Get the specifies the supported types of addresses MMSs can be sent to.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getSendMMSTargetAddressType() {
		if (this.sendMMSTargetAddressType == null){ this.sendMMSTargetAddressType=new ArrayList<>();}
		return sendMMSTargetAddressType;
	}

	/**
	 * Set the specifies the supported types of addresses MMSs can be sent to.
	 *
	 * @since 2.4
	 * @param sendMMSTargetAddressType the input value
	 */
	public void  setSendMMSTargetAddressType(Collection<String> sendMMSTargetAddressType) {
		this.sendMMSTargetAddressType = sendMMSTargetAddressType;
	}

	/**
	 * Set the specifies the supported types of addresses MMSs can be sent to.
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSendMMSTargetAddressType(String string) {
		getSendMMSTargetAddressType().add(string);
		return this;
	}

	//</editor-fold>

}