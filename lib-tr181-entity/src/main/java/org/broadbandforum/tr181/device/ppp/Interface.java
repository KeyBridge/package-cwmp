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
package org.broadbandforum.tr181.device.ppp;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.ppp._interface.IPCP;
import org.broadbandforum.tr181.device.ppp._interface.IPv6CP;
import org.broadbandforum.tr181.device.ppp._interface.PPPoA;
import org.broadbandforum.tr181.device.ppp._interface.PPPoE;
import org.broadbandforum.tr181.device.ppp._interface.Stats;

	/**
	 * PPP interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.PPP.Interface.{i}.")
public class Interface {

	/**
	 * Enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Down";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * When set to {{true}}, the device MUST tear down the existing PPP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset = false;
	/**
	 * Current status of the connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConnectionStatus")
	public String connectionStatus;
	/**
	 * The cause of failure for the last connection setup attempt.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastConnectionError")
	public String lastConnectionError;
	/**
	 * The time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoDisconnectTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long autoDisconnectTime;
	/**
	 * The time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A  value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IdleDisconnectTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long idleDisconnectTime;
	/**
	 * Time in seconds the {{param|ConnectionStatus}} remains in the {{enum|PendingDisconnect|ConnectionStatus}} state  before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WarnDisconnectDelay")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long warnDisconnectDelay;
	/**
	 * Username to be used for authentication.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String username;
	/**
	 * Password to be used for authentication.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String password;
	/**
	 * Describes the PPP encryption protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EncryptionProtocol")
	public String encryptionProtocol;
	/**
	 * Describes the PPP compression protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CompressionProtocol")
	public String compressionProtocol;
	/**
	 * Describes the PPP authentication protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthenticationProtocol")
	public String authenticationProtocol;
	/**
	 * The maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMRUSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 65535)
	public Long maxMRUSize = 1500L;
	/**
	 * The current MRU in use over this connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentMRUSize")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 64, max = 65535)
	public Long currentMRUSize;
	/**
	 * Trigger used to establish the PPP connection.  {{enum}}

          Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as  termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the  {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConnectionTrigger")
	@CWMPParameter(access = "readWrite")
	public String connectionTrigger;
	/**
	 * PPP LCP Echo period in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LCPEcho")
	public Long lcpEcho;
	/**
	 * Number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LCPEchoRetry")
	public Long lcpEchoRetry;
	/**
	 * Enables or disables IPCP ({{bibref|RFC1332}}) on this interface.  If this parameter is present, {{enum|IPCP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPCPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipcPEnable;
	/**
	 * Enables or disables IPv6CP ({{bibref|RFC5072}}) on this interface.  If this parameter is present, {{enum|IPv6CP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv6CPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipv6CPEnable;
	/**
	 * PPPoA object that functionally groups PPPoA related parameters.
	 */
	@XmlElement(name = "PPPoA")
	public PPPoA pppoA;
	/**
	 * PPPoE object that functionally groups PPPoE related parameters.
	 */
	@XmlElement(name = "PPPoE")
	public PPPoE pppoE;
	/**
	 * IP Control Protocol (IPCP) client object for this PPP interface {{bibref|RFC1332}}. {{object}} only applies to IPv4.
	 */
	@XmlElement(name = "IPCP")
	public IPCP ipcP;
	/**
	 * IPv6 Control Protocol (IPv6CP) client object for this PPP interface {{bibref|RFC5072}}. {{object}} only applies to IPv6.
	 */
	@XmlElement(name = "IPv6CP")
	public IPv6CP ipv6CP;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
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
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the when set to {{true}}, the device MUST tear down the existing PPP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing PPP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing PPP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public Interface withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the current status of the connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * Set the current status of the connection.
	 *
	 * @since 2.0
	 * @param connectionStatus the input value
	 */
	public void  setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	/**
	 * Set the current status of the connection.
	 *
	 * @since 2.0
	 * @param connectionStatus the input value
	 * @return this instance
	 */
	public Interface withConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
		return this;
	}

	/**
	 * Get the cause of failure for the last connection setup attempt.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLastConnectionError() {
		return lastConnectionError;
	}

	/**
	 * Set the cause of failure for the last connection setup attempt.
	 *
	 * @since 2.0
	 * @param lastConnectionError the input value
	 */
	public void  setLastConnectionError(String lastConnectionError) {
		this.lastConnectionError = lastConnectionError;
	}

	/**
	 * Set the cause of failure for the last connection setup attempt.
	 *
	 * @since 2.0
	 * @param lastConnectionError the input value
	 * @return this instance
	 */
	public Interface withLastConnectionError(String lastConnectionError) {
		this.lastConnectionError = lastConnectionError;
		return this;
	}

	/**
	 * Get the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAutoDisconnectTime() {
		return autoDisconnectTime;
	}

	/**
	 * Set the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @param autoDisconnectTime the input value
	 */
	public void  setAutoDisconnectTime(Long autoDisconnectTime) {
		this.autoDisconnectTime = autoDisconnectTime;
	}

	/**
	 * Set the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @param autoDisconnectTime the input value
	 * @return this instance
	 */
	public Interface withAutoDisconnectTime(Long autoDisconnectTime) {
		this.autoDisconnectTime = autoDisconnectTime;
		return this;
	}

	/**
	 * Get the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A  value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIdleDisconnectTime() {
		return idleDisconnectTime;
	}

	/**
	 * Set the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A  value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @param idleDisconnectTime the input value
	 */
	public void  setIdleDisconnectTime(Long idleDisconnectTime) {
		this.idleDisconnectTime = idleDisconnectTime;
	}

	/**
	 * Set the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A  value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 2.0
	 * @param idleDisconnectTime the input value
	 * @return this instance
	 */
	public Interface withIdleDisconnectTime(Long idleDisconnectTime) {
		this.idleDisconnectTime = idleDisconnectTime;
		return this;
	}

	/**
	 * Get the time in seconds the {{param|ConnectionStatus}} remains in the {{enum|PendingDisconnect|ConnectionStatus}} state  before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWarnDisconnectDelay() {
		return warnDisconnectDelay;
	}

	/**
	 * Set the time in seconds the {{param|ConnectionStatus}} remains in the {{enum|PendingDisconnect|ConnectionStatus}} state  before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 2.0
	 * @param warnDisconnectDelay the input value
	 */
	public void  setWarnDisconnectDelay(Long warnDisconnectDelay) {
		this.warnDisconnectDelay = warnDisconnectDelay;
	}

	/**
	 * Set the time in seconds the {{param|ConnectionStatus}} remains in the {{enum|PendingDisconnect|ConnectionStatus}} state  before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 2.0
	 * @param warnDisconnectDelay the input value
	 * @return this instance
	 */
	public Interface withWarnDisconnectDelay(Long warnDisconnectDelay) {
		this.warnDisconnectDelay = warnDisconnectDelay;
		return this;
	}

	/**
	 * Get the username to be used for authentication.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username to be used for authentication.
	 *
	 * @since 2.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username to be used for authentication.
	 *
	 * @since 2.0
	 * @param username the input value
	 * @return this instance
	 */
	public Interface withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password to be used for authentication.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password to be used for authentication.
	 *
	 * @since 2.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password to be used for authentication.
	 *
	 * @since 2.0
	 * @param password the input value
	 * @return this instance
	 */
	public Interface withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the describes the PPP encryption protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEncryptionProtocol() {
		return encryptionProtocol;
	}

	/**
	 * Set the describes the PPP encryption protocol.
	 *
	 * @since 2.0
	 * @param encryptionProtocol the input value
	 */
	public void  setEncryptionProtocol(String encryptionProtocol) {
		this.encryptionProtocol = encryptionProtocol;
	}

	/**
	 * Set the describes the PPP encryption protocol.
	 *
	 * @since 2.0
	 * @param encryptionProtocol the input value
	 * @return this instance
	 */
	public Interface withEncryptionProtocol(String encryptionProtocol) {
		this.encryptionProtocol = encryptionProtocol;
		return this;
	}

	/**
	 * Get the describes the PPP compression protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCompressionProtocol() {
		return compressionProtocol;
	}

	/**
	 * Set the describes the PPP compression protocol.
	 *
	 * @since 2.0
	 * @param compressionProtocol the input value
	 */
	public void  setCompressionProtocol(String compressionProtocol) {
		this.compressionProtocol = compressionProtocol;
	}

	/**
	 * Set the describes the PPP compression protocol.
	 *
	 * @since 2.0
	 * @param compressionProtocol the input value
	 * @return this instance
	 */
	public Interface withCompressionProtocol(String compressionProtocol) {
		this.compressionProtocol = compressionProtocol;
		return this;
	}

	/**
	 * Get the describes the PPP authentication protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthenticationProtocol() {
		return authenticationProtocol;
	}

	/**
	 * Set the describes the PPP authentication protocol.
	 *
	 * @since 2.0
	 * @param authenticationProtocol the input value
	 */
	public void  setAuthenticationProtocol(String authenticationProtocol) {
		this.authenticationProtocol = authenticationProtocol;
	}

	/**
	 * Set the describes the PPP authentication protocol.
	 *
	 * @since 2.0
	 * @param authenticationProtocol the input value
	 * @return this instance
	 */
	public Interface withAuthenticationProtocol(String authenticationProtocol) {
		this.authenticationProtocol = authenticationProtocol;
		return this;
	}

	/**
	 * Get the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMRUSize() {
		return maxMRUSize;
	}

	/**
	 * Set the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 2.0
	 * @param maxMRUSize the input value
	 */
	public void  setMaxMRUSize(Long maxMRUSize) {
		this.maxMRUSize = maxMRUSize;
	}

	/**
	 * Set the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 2.0
	 * @param maxMRUSize the input value
	 * @return this instance
	 */
	public Interface withMaxMRUSize(Long maxMRUSize) {
		this.maxMRUSize = maxMRUSize;
		return this;
	}

	/**
	 * Get the current MRU in use over this connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCurrentMRUSize() {
		return currentMRUSize;
	}

	/**
	 * Set the current MRU in use over this connection.
	 *
	 * @since 2.0
	 * @param currentMRUSize the input value
	 */
	public void  setCurrentMRUSize(Long currentMRUSize) {
		this.currentMRUSize = currentMRUSize;
	}

	/**
	 * Set the current MRU in use over this connection.
	 *
	 * @since 2.0
	 * @param currentMRUSize the input value
	 * @return this instance
	 */
	public Interface withCurrentMRUSize(Long currentMRUSize) {
		this.currentMRUSize = currentMRUSize;
		return this;
	}

	/**
	 * Get the trigger used to establish the PPP connection.  {{enum}}

          Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as  termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the  {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getConnectionTrigger() {
		return connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the PPP connection.  {{enum}}

          Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as  termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the  {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 2.0
	 * @param connectionTrigger the input value
	 */
	public void  setConnectionTrigger(String connectionTrigger) {
		this.connectionTrigger = connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the PPP connection.  {{enum}}

          Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as  termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the  {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 2.0
	 * @param connectionTrigger the input value
	 * @return this instance
	 */
	public Interface withConnectionTrigger(String connectionTrigger) {
		this.connectionTrigger = connectionTrigger;
		return this;
	}

	/**
	 * Get the ppp LCP Echo period in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLcpEcho() {
		return lcpEcho;
	}

	/**
	 * Set the ppp LCP Echo period in seconds.
	 *
	 * @since 2.0
	 * @param lcpEcho the input value
	 */
	public void  setLcpEcho(Long lcpEcho) {
		this.lcpEcho = lcpEcho;
	}

	/**
	 * Set the ppp LCP Echo period in seconds.
	 *
	 * @since 2.0
	 * @param lcpEcho the input value
	 * @return this instance
	 */
	public Interface withLcpEcho(Long lcpEcho) {
		this.lcpEcho = lcpEcho;
		return this;
	}

	/**
	 * Get the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLcpEchoRetry() {
		return lcpEchoRetry;
	}

	/**
	 * Set the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 2.0
	 * @param lcpEchoRetry the input value
	 */
	public void  setLcpEchoRetry(Long lcpEchoRetry) {
		this.lcpEchoRetry = lcpEchoRetry;
	}

	/**
	 * Set the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 2.0
	 * @param lcpEchoRetry the input value
	 * @return this instance
	 */
	public Interface withLcpEchoRetry(Long lcpEchoRetry) {
		this.lcpEchoRetry = lcpEchoRetry;
		return this;
	}

	/**
	 * Get the enables or disables IPCP ({{bibref|RFC1332}}) on this interface.  If this parameter is present, {{enum|IPCP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpcPEnable() {
		return ipcPEnable;
	}

	/**
	 * Set the enables or disables IPCP ({{bibref|RFC1332}}) on this interface.  If this parameter is present, {{enum|IPCP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @param ipcPEnable the input value
	 */
	public void  setIpcPEnable(Boolean ipcPEnable) {
		this.ipcPEnable = ipcPEnable;
	}

	/**
	 * Set the enables or disables IPCP ({{bibref|RFC1332}}) on this interface.  If this parameter is present, {{enum|IPCP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @param ipcPEnable the input value
	 * @return this instance
	 */
	public Interface withIpcPEnable(Boolean ipcPEnable) {
		this.ipcPEnable = ipcPEnable;
		return this;
	}

	/**
	 * Get the enables or disables IPv6CP ({{bibref|RFC5072}}) on this interface.  If this parameter is present, {{enum|IPv6CP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv6CPEnable() {
		return ipv6CPEnable;
	}

	/**
	 * Set the enables or disables IPv6CP ({{bibref|RFC5072}}) on this interface.  If this parameter is present, {{enum|IPv6CP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @param ipv6CPEnable the input value
	 */
	public void  setIpv6CPEnable(Boolean ipv6CPEnable) {
		this.ipv6CPEnable = ipv6CPEnable;
	}

	/**
	 * Set the enables or disables IPv6CP ({{bibref|RFC5072}}) on this interface.  If this parameter is present, {{enum|IPv6CP|#.SupportedNCPs}} MUST be included in {{param|#.SupportedNCPs}}.
	 *
	 * @since 2.2
	 * @param ipv6CPEnable the input value
	 * @return this instance
	 */
	public Interface withIpv6CPEnable(Boolean ipv6CPEnable) {
		this.ipv6CPEnable = ipv6CPEnable;
		return this;
	}

	/**
	 * Get the pppoA object that functionally groups PPPoA related parameters.
	 *
	 * @return the value
	 */
	public PPPoA getPppoA() {
		return pppoA;
	}

	/**
	 * Set the pppoA object that functionally groups PPPoA related parameters.
	 *
	 * @param pppoA the input value
	 */
	public void  setPppoA(PPPoA pppoA) {
		this.pppoA = pppoA;
	}

	/**
	 * Set the pppoA object that functionally groups PPPoA related parameters.
	 *
	 * @param pppoA the input value
	 * @return this instance
	 */
	public Interface withPppoA(PPPoA pppoA) {
		this.pppoA = pppoA;
		return this;
	}

	/**
	 * Get the pppoE object that functionally groups PPPoE related parameters.
	 *
	 * @return the value
	 */
	public PPPoE getPppoE() {
		return pppoE;
	}

	/**
	 * Set the pppoE object that functionally groups PPPoE related parameters.
	 *
	 * @param pppoE the input value
	 */
	public void  setPppoE(PPPoE pppoE) {
		this.pppoE = pppoE;
	}

	/**
	 * Set the pppoE object that functionally groups PPPoE related parameters.
	 *
	 * @param pppoE the input value
	 * @return this instance
	 */
	public Interface withPppoE(PPPoE pppoE) {
		this.pppoE = pppoE;
		return this;
	}

	/**
	 * Get the ip Control Protocol (IPCP) client object for this PPP interface {{bibref|RFC1332}}. {{object}} only applies to IPv4.
	 *
	 * @return the value
	 */
	public IPCP getIpcP() {
		return ipcP;
	}

	/**
	 * Set the ip Control Protocol (IPCP) client object for this PPP interface {{bibref|RFC1332}}. {{object}} only applies to IPv4.
	 *
	 * @param ipcP the input value
	 */
	public void  setIpcP(IPCP ipcP) {
		this.ipcP = ipcP;
	}

	/**
	 * Set the ip Control Protocol (IPCP) client object for this PPP interface {{bibref|RFC1332}}. {{object}} only applies to IPv4.
	 *
	 * @param ipcP the input value
	 * @return this instance
	 */
	public Interface withIpcP(IPCP ipcP) {
		this.ipcP = ipcP;
		return this;
	}

	/**
	 * Get the ipv6 Control Protocol (IPv6CP) client object for this PPP interface {{bibref|RFC5072}}. {{object}} only applies to IPv6.
	 *
	 * @return the value
	 */
	public IPv6CP getIpv6CP() {
		return ipv6CP;
	}

	/**
	 * Set the ipv6 Control Protocol (IPv6CP) client object for this PPP interface {{bibref|RFC5072}}. {{object}} only applies to IPv6.
	 *
	 * @param ipv6CP the input value
	 */
	public void  setIpv6CP(IPv6CP ipv6CP) {
		this.ipv6CP = ipv6CP;
	}

	/**
	 * Set the ipv6 Control Protocol (IPv6CP) client object for this PPP interface {{bibref|RFC5072}}. {{object}} only applies to IPv6.
	 *
	 * @param ipv6CP the input value
	 * @return this instance
	 */
	public Interface withIpv6CP(IPv6CP ipv6CP) {
		this.ipv6CP = ipv6CP;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}