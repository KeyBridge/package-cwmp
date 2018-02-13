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
package org.broadbandforum.tr069.internetgatewaydevice;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

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
	 * URL for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.  An HTTPS URL indicates that the ACS supports SSL.

The ''host'' portion of this URL is used by the CPE for validating the certificate from the ACS when using certificate-based authentication.
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
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Whether or not the CPE must periodically send CPE information to Server using the Inform method call.
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
	 * An absolute time reference in UTC to determine when the CPE should initiate the Inform method calls.  Each Inform call must occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

A zero dateTime value (0000-00-00T00:00:00) indicates that no particular time reference is specified.  That is, the CPE may locally choose the time reference, required only to adhere to the specified {{param|PeriodicInformInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicInformTime;
	/**
	 * The value of the ParameterKey argument from the most recent SetParameterValues, AddObject, or DeleteObject method call from the Server.  If there have been no such calls, this value is empty.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ParameterKey")
	@Size(max = 32)
	public String parameterKey;
	/**
	 * HTTP URL for an ACS to make a Connection Request notification to the CPE.

In the form:

: http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestURL")
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
	 * Indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD not use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpgradesManaged")
	@CWMPParameter(access = "readWrite")
	public Boolean upgradesManaged;
	/**
	 * Present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "KickURL")
	@Size(max = 256)
	public String kickURL;
	/**
	 * Present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL to which a web-server associated with the ACS may redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownloadProgressURL")
	@Size(max = 256)
	public String downloadProgressURL;

	public ManagementServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the url for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.  An HTTPS URL indicates that the ACS supports SSL.

The ''host'' portion of this URL is used by the CPE for validating the certificate from the ACS when using certificate-based authentication.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.  An HTTPS URL indicates that the ACS supports SSL.

The ''host'' portion of this URL is used by the CPE for validating the certificate from the ACS when using certificate-based authentication.
	 *
	 * @since 1.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.  An HTTPS URL indicates that the ACS supports SSL.

The ''host'' portion of this URL is used by the CPE for validating the certificate from the ACS when using certificate-based authentication.
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
	 * Get the whether or not the CPE must periodically send CPE information to Server using the Inform method call.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPeriodicInformEnable() {
		return periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE must periodically send CPE information to Server using the Inform method call.
	 *
	 * @since 1.0
	 * @param periodicInformEnable the input value
	 */
	public void  setPeriodicInformEnable(Boolean periodicInformEnable) {
		this.periodicInformEnable = periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE must periodically send CPE information to Server using the Inform method call.
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
	 * Get an absolute time reference in UTC to determine when the CPE should initiate the Inform method calls.  Each Inform call must occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

A zero dateTime value (0000-00-00T00:00:00) indicates that no particular time reference is specified.  That is, the CPE may locally choose the time reference, required only to adhere to the specified {{param|PeriodicInformInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicInformTime() {
		return periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE should initiate the Inform method calls.  Each Inform call must occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

A zero dateTime value (0000-00-00T00:00:00) indicates that no particular time reference is specified.  That is, the CPE may locally choose the time reference, required only to adhere to the specified {{param|PeriodicInformInterval}}.
	 *
	 * @since 1.0
	 * @param periodicInformTime the input value
	 */
	public void  setPeriodicInformTime(LocalDateTime periodicInformTime) {
		this.periodicInformTime = periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE should initiate the Inform method calls.  Each Inform call must occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

A zero dateTime value (0000-00-00T00:00:00) indicates that no particular time reference is specified.  That is, the CPE may locally choose the time reference, required only to adhere to the specified {{param|PeriodicInformInterval}}.
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
	 * Get the value of the ParameterKey argument from the most recent SetParameterValues, AddObject, or DeleteObject method call from the Server.  If there have been no such calls, this value is empty.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getParameterKey() {
		return parameterKey;
	}

	/**
	 * Set the value of the ParameterKey argument from the most recent SetParameterValues, AddObject, or DeleteObject method call from the Server.  If there have been no such calls, this value is empty.
	 *
	 * @since 1.0
	 * @param parameterKey the input value
	 */
	public void  setParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
	}

	/**
	 * Set the value of the ParameterKey argument from the most recent SetParameterValues, AddObject, or DeleteObject method call from the Server.  If there have been no such calls, this value is empty.
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
	 * Get the httP URL for an ACS to make a Connection Request notification to the CPE.

In the form:

: http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestURL() {
		return connectionRequestURL;
	}

	/**
	 * Set the httP URL for an ACS to make a Connection Request notification to the CPE.

In the form:

: http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @param connectionRequestURL the input value
	 */
	public void  setConnectionRequestURL(String connectionRequestURL) {
		this.connectionRequestURL = connectionRequestURL;
	}

	/**
	 * Set the httP URL for an ACS to make a Connection Request notification to the CPE.

In the form:

: http://host:port/path

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
	 * Get the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD not use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isUpgradesManaged() {
		return upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD not use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
	 *
	 * @since 1.0
	 * @param upgradesManaged the input value
	 */
	public void  setUpgradesManaged(Boolean upgradesManaged) {
		this.upgradesManaged = upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD not use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.
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

LAN-accessible URL from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getKickURL() {
		return kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @param kickURL the input value
	 */
	public void  setKickURL(String kickURL) {
		this.kickURL = kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
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

LAN-accessible URL to which a web-server associated with the ACS may redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDownloadProgressURL() {
		return downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL to which a web-server associated with the ACS may redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 */
	public void  setDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL to which a web-server associated with the ACS may redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 * @return this instance
	 */
	public ManagementServer withDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
		return this;
	}

	//</editor-fold>

}