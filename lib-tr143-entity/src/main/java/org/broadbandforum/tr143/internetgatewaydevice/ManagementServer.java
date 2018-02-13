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
package org.broadbandforum.tr143.internetgatewaydevice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.internetgatewaydevice.managementserver.ManageableDevice;

	/**
	 * This object contains parameters relating to the CPE's association with an ACS.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.ManagementServer.")
@XmlRootElement(name = "ManagementServer")
@XmlType(name = "InternetGatewayDevice.ManagementServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManagementServer {

	/**
	 * URL, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String url;
	/**
	 * Username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean periodicInformEnable;
	/**
	 * The duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformInterval")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long periodicInformInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a1|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicInformTime;
	/**
	 * {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ParameterKey")
	@CWMPParameter(activeNotify = "canDeny", forcedInform = true)
	@Size(max = 32)
	public String parameterKey;
	/**
	 * HTTP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestURL")
	@CWMPParameter(activeNotify = "forceEnabled", forcedInform = true)
	@Size(max = 256)
	public String connectionRequestURL;
	/**
	 * Username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String connectionRequestUsername;
	/**
	 * Password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String connectionRequestPassword;
	/**
	 * Indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpgradesManaged")
	@CWMPParameter(access = "readWrite")
	public Boolean upgradesManaged;
	/**
	 * Present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "KickURL")
	@Size(max = 256)
	public String kickURL;
	/**
	 * Present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownloadProgressURL")
	@Size(max = 256)
	public String downloadProgressURL;
	/**
	 * Address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a1|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "UDPConnectionRequestAddress")
	@Size(max = 256)
	public String udpConnectionRequestAddress;
	/**
	 * The minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "UDPConnectionRequestAddressNotificationLimit")
	@CWMPParameter(access = "readWrite")
	public Long udpConnectionRequestAddressNotificationLimit;
	/**
	 * Enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean stuNEnable;
	/**
	 * Host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNServerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNServerAddress;
	/**
	 * Port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long stuNServerPort;
	/**
	 * If not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNUsername;
	/**
	 * The value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNPassword;
	/**
	 * If STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNMaximumKeepAlivePeriod")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer stuNMaximumKeepAlivePeriod;
	/**
	 * If STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNMinimumKeepAlivePeriod")
	@CWMPParameter(access = "readWrite")
	public Long stuNMinimumKeepAlivePeriod;
	/**
	 * When STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "NATDetected")
	public Boolean natDetected;
	/**
	 * The minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "ManageableDeviceNotificationLimit")
	@CWMPParameter(access = "readWrite")
	public Long manageableDeviceNotificationLimit;
	/**
	 * Each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a1|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 */
	@XmlElementWrapper(name = "ManageableDevices")
	@XmlElement(name = "ManageableDevice")
	public Collection<ManageableDevice> manageableDevices;

	public ManagementServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param url the input value
	 * @return this instance
	 */
	public ManagementServer withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public ManagementServer withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public ManagementServer withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPeriodicInformEnable() {
		return periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @param periodicInformEnable the input value
	 */
	public void  setPeriodicInformEnable(Boolean periodicInformEnable) {
		this.periodicInformEnable = periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @param periodicInformEnable the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformEnable(Boolean periodicInformEnable) {
		this.periodicInformEnable = periodicInformEnable;
		return this;
	}

	/**
	 * Get the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPeriodicInformInterval() {
		return periodicInformInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicInformInterval the input value
	 */
	public void  setPeriodicInformInterval(Long periodicInformInterval) {
		this.periodicInformInterval = periodicInformInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicInformInterval the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformInterval(Long periodicInformInterval) {
		this.periodicInformInterval = periodicInformInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a1|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicInformTime() {
		return periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a1|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicInformTime the input value
	 */
	public void  setPeriodicInformTime(LocalDateTime periodicInformTime) {
		this.periodicInformTime = periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a1|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicInformTime the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformTime(LocalDateTime periodicInformTime) {
		this.periodicInformTime = periodicInformTime;
		return this;
	}

	/**
	 * Get the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getParameterKey() {
		return parameterKey;
	}

	/**
	 * Set the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @param parameterKey the input value
	 */
	public void  setParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
	}

	/**
	 * Set the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @param parameterKey the input value
	 * @return this instance
	 */
	public ManagementServer withParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
		return this;
	}

	/**
	 * Get the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestURL() {
		return connectionRequestURL;
	}

	/**
	 * Set the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @param connectionRequestURL the input value
	 */
	public void  setConnectionRequestURL(String connectionRequestURL) {
		this.connectionRequestURL = connectionRequestURL;
	}

	/**
	 * Set the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @param connectionRequestURL the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestURL(String connectionRequestURL) {
		this.connectionRequestURL = connectionRequestURL;
		return this;
	}

	/**
	 * Get the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestUsername() {
		return connectionRequestUsername;
	}

	/**
	 * Set the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestUsername the input value
	 */
	public void  setConnectionRequestUsername(String connectionRequestUsername) {
		this.connectionRequestUsername = connectionRequestUsername;
	}

	/**
	 * Set the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestUsername the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestUsername(String connectionRequestUsername) {
		this.connectionRequestUsername = connectionRequestUsername;
		return this;
	}

	/**
	 * Get the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestPassword() {
		return connectionRequestPassword;
	}

	/**
	 * Set the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestPassword the input value
	 */
	public void  setConnectionRequestPassword(String connectionRequestPassword) {
		this.connectionRequestPassword = connectionRequestPassword;
	}

	/**
	 * Set the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestPassword the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestPassword(String connectionRequestPassword) {
		this.connectionRequestPassword = connectionRequestPassword;
		return this;
	}

	/**
	 * Get the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isUpgradesManaged() {
		return upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 * @param upgradesManaged the input value
	 */
	public void  setUpgradesManaged(Boolean upgradesManaged) {
		this.upgradesManaged = upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 * @param upgradesManaged the input value
	 * @return this instance
	 */
	public ManagementServer withUpgradesManaged(Boolean upgradesManaged) {
		this.upgradesManaged = upgradesManaged;
		return this;
	}

	/**
	 * Get the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getKickURL() {
		return kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @param kickURL the input value
	 */
	public void  setKickURL(String kickURL) {
		this.kickURL = kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @param kickURL the input value
	 * @return this instance
	 */
	public ManagementServer withKickURL(String kickURL) {
		this.kickURL = kickURL;
		return this;
	}

	/**
	 * Get the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDownloadProgressURL() {
		return downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 */
	public void  setDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 * @return this instance
	 */
	public ManagementServer withDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
		return this;
	}

	/**
	 * Get address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a1|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getUdpConnectionRequestAddress() {
		return udpConnectionRequestAddress;
	}

	/**
	 * Set address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a1|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddress the input value
	 */
	public void  setUdpConnectionRequestAddress(String udpConnectionRequestAddress) {
		this.udpConnectionRequestAddress = udpConnectionRequestAddress;
	}

	/**
	 * Set address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a1|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddress the input value
	 * @return this instance
	 */
	public ManagementServer withUdpConnectionRequestAddress(String udpConnectionRequestAddress) {
		this.udpConnectionRequestAddress = udpConnectionRequestAddress;
		return this;
	}

	/**
	 * Get the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getUdpConnectionRequestAddressNotificationLimit() {
		return udpConnectionRequestAddressNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddressNotificationLimit the input value
	 */
	public void  setUdpConnectionRequestAddressNotificationLimit(Long udpConnectionRequestAddressNotificationLimit) {
		this.udpConnectionRequestAddressNotificationLimit = udpConnectionRequestAddressNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddressNotificationLimit the input value
	 * @return this instance
	 */
	public ManagementServer withUdpConnectionRequestAddressNotificationLimit(Long udpConnectionRequestAddressNotificationLimit) {
		this.udpConnectionRequestAddressNotificationLimit = udpConnectionRequestAddressNotificationLimit;
		return this;
	}

	/**
	 * Get the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Boolean isStuNEnable() {
		return stuNEnable;
	}

	/**
	 * Set the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @param stuNEnable the input value
	 */
	public void  setStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
	}

	/**
	 * Set the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @param stuNEnable the input value
	 * @return this instance
	 */
	public ManagementServer withStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
		return this;
	}

	/**
	 * Get the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNServerAddress() {
		return stuNServerAddress;
	}

	/**
	 * Set the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @param stuNServerAddress the input value
	 */
	public void  setStuNServerAddress(String stuNServerAddress) {
		this.stuNServerAddress = stuNServerAddress;
	}

	/**
	 * Set the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @param stuNServerAddress the input value
	 * @return this instance
	 */
	public ManagementServer withStuNServerAddress(String stuNServerAddress) {
		this.stuNServerAddress = stuNServerAddress;
		return this;
	}

	/**
	 * Get the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getStuNServerPort() {
		return stuNServerPort;
	}

	/**
	 * Set the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @param stuNServerPort the input value
	 */
	public void  setStuNServerPort(Long stuNServerPort) {
		this.stuNServerPort = stuNServerPort;
	}

	/**
	 * Set the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @param stuNServerPort the input value
	 * @return this instance
	 */
	public ManagementServer withStuNServerPort(Long stuNServerPort) {
		this.stuNServerPort = stuNServerPort;
		return this;
	}

	/**
	 * Get the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNUsername() {
		return stuNUsername;
	}

	/**
	 * Set the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @param stuNUsername the input value
	 */
	public void  setStuNUsername(String stuNUsername) {
		this.stuNUsername = stuNUsername;
	}

	/**
	 * Set the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @param stuNUsername the input value
	 * @return this instance
	 */
	public ManagementServer withStuNUsername(String stuNUsername) {
		this.stuNUsername = stuNUsername;
		return this;
	}

	/**
	 * Get the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNPassword() {
		return stuNPassword;
	}

	/**
	 * Set the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @param stuNPassword the input value
	 */
	public void  setStuNPassword(String stuNPassword) {
		this.stuNPassword = stuNPassword;
	}

	/**
	 * Set the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @param stuNPassword the input value
	 * @return this instance
	 */
	public ManagementServer withStuNPassword(String stuNPassword) {
		this.stuNPassword = stuNPassword;
		return this;
	}

	/**
	 * Get the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Integer getStuNMaximumKeepAlivePeriod() {
		return stuNMaximumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @param stuNMaximumKeepAlivePeriod the input value
	 */
	public void  setStuNMaximumKeepAlivePeriod(Integer stuNMaximumKeepAlivePeriod) {
		this.stuNMaximumKeepAlivePeriod = stuNMaximumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @param stuNMaximumKeepAlivePeriod the input value
	 * @return this instance
	 */
	public ManagementServer withStuNMaximumKeepAlivePeriod(Integer stuNMaximumKeepAlivePeriod) {
		this.stuNMaximumKeepAlivePeriod = stuNMaximumKeepAlivePeriod;
		return this;
	}

	/**
	 * Get the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getStuNMinimumKeepAlivePeriod() {
		return stuNMinimumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @param stuNMinimumKeepAlivePeriod the input value
	 */
	public void  setStuNMinimumKeepAlivePeriod(Long stuNMinimumKeepAlivePeriod) {
		this.stuNMinimumKeepAlivePeriod = stuNMinimumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @param stuNMinimumKeepAlivePeriod the input value
	 * @return this instance
	 */
	public ManagementServer withStuNMinimumKeepAlivePeriod(Long stuNMinimumKeepAlivePeriod) {
		this.stuNMinimumKeepAlivePeriod = stuNMinimumKeepAlivePeriod;
		return this;
	}

	/**
	 * Get the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Boolean isNatDetected() {
		return natDetected;
	}

	/**
	 * Set the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @param natDetected the input value
	 */
	public void  setNatDetected(Boolean natDetected) {
		this.natDetected = natDetected;
	}

	/**
	 * Set the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @param natDetected the input value
	 * @return this instance
	 */
	public ManagementServer withNatDetected(Boolean natDetected) {
		this.natDetected = natDetected;
		return this;
	}

	/**
	 * Get the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getManageableDeviceNotificationLimit() {
		return manageableDeviceNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param manageableDeviceNotificationLimit the input value
	 */
	public void  setManageableDeviceNotificationLimit(Long manageableDeviceNotificationLimit) {
		this.manageableDeviceNotificationLimit = manageableDeviceNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param manageableDeviceNotificationLimit the input value
	 * @return this instance
	 */
	public ManagementServer withManageableDeviceNotificationLimit(Long manageableDeviceNotificationLimit) {
		this.manageableDeviceNotificationLimit = manageableDeviceNotificationLimit;
		return this;
	}

	/**
	 * Get the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a1|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @return the value
	 */
	public Collection<ManageableDevice> getManageableDevices() {
		if (this.manageableDevices == null){ this.manageableDevices=new ArrayList<>();}
		return manageableDevices;
	}

	/**
	 * Set the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a1|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @param manageableDevices the input value
	 */
	public void  setManageableDevices(Collection<ManageableDevice> manageableDevices) {
		this.manageableDevices = manageableDevices;
	}

	/**
	 * Set the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a1|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @param manageableDevice the input value
	 * @return this instance
	 */
	public ManagementServer withManageableDevice(ManageableDevice manageableDevice) {
		getManageableDevices().add(manageableDevice);
		return this;
	}

	//</editor-fold>

}