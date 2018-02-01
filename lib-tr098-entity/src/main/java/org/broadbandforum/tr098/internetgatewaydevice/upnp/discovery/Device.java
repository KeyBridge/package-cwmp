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
package org.broadbandforum.tr098.internetgatewaydevice.upnp.discovery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * UPnP embedded device table. This table contains an entry for each UPnP embedded device that has been discovered via SSDP.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.UPnP.Discovery.Device.{i}.")
public class Device {

	/**
	 * The status of the UPnP embedded device. {{enum}}

The ability to list inactive UPnP embedded devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * This UPnP embedded device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

: ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

{{pattern}}
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UUID")
	@Size(max = 36)
	@Pattern(regexp = "[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}")
	public String uuiD;
	/**
	 * The value of the USN (Unique Service Name) header for this UPnP embedded device. Two discovery messages are sent for embedded devices, and this SHOULD be the value of the USN header of the following form:

: ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, the other form MAY be used:

: ''uuid:device-UUID''
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "USN")
	@Size(max = 256)
	public String usn;
	/**
	 * The UPnP embedded device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "LeaseTime")
	public Long leaseTime;
	/**
	 * The value of the LOCATION header for this UPnP embedded device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Location")
	@Size(max = 256)
	public String location;
	/**
	 * The value of the SERVER header for this UPnP embedded device, which is a string of the following form:

: ''OS/version UPnP/udaversion product/version''

where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Server")
	@Size(max = 256)
	public String server;
	/**
	 * {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded device.

As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;
	/**
	 * The date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the UPnP embedded device. {{enum}}

The ability to list inactive UPnP embedded devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the UPnP embedded device. {{enum}}

The ability to list inactive UPnP embedded devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the UPnP embedded device. {{enum}}

The ability to list inactive UPnP embedded devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.5
	 * @param status the input value
	 * @return this instance
	 */
	public Device withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the this UPnP embedded device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

: ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

{{pattern}}
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getUuiD() {
		return uuiD;
	}

	/**
	 * Set the this UPnP embedded device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

: ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

{{pattern}}
	 *
	 * @since 1.5
	 * @param uuiD the input value
	 */
	public void  setUuiD(String uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set the this UPnP embedded device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

: ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

{{pattern}}
	 *
	 * @since 1.5
	 * @param uuiD the input value
	 * @return this instance
	 */
	public Device withUuiD(String uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the value of the USN (Unique Service Name) header for this UPnP embedded device. Two discovery messages are sent for embedded devices, and this SHOULD be the value of the USN header of the following form:

: ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, the other form MAY be used:

: ''uuid:device-UUID''
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getUsn() {
		return usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP embedded device. Two discovery messages are sent for embedded devices, and this SHOULD be the value of the USN header of the following form:

: ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, the other form MAY be used:

: ''uuid:device-UUID''
	 *
	 * @since 1.5
	 * @param usn the input value
	 */
	public void  setUsn(String usn) {
		this.usn = usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP embedded device. Two discovery messages are sent for embedded devices, and this SHOULD be the value of the USN header of the following form:

: ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, the other form MAY be used:

: ''uuid:device-UUID''
	 *
	 * @since 1.5
	 * @param usn the input value
	 * @return this instance
	 */
	public Device withUsn(String usn) {
		this.usn = usn;
		return this;
	}

	/**
	 * Get the UPnP embedded device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getLeaseTime() {
		return leaseTime;
	}

	/**
	 * Set the UPnP embedded device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 1.5
	 * @param leaseTime the input value
	 */
	public void  setLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * Set the UPnP embedded device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 1.5
	 * @param leaseTime the input value
	 * @return this instance
	 */
	public Device withLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
		return this;
	}

	/**
	 * Get the value of the LOCATION header for this UPnP embedded device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP embedded device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 1.5
	 * @param location the input value
	 */
	public void  setLocation(String location) {
		this.location = location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP embedded device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 1.5
	 * @param location the input value
	 * @return this instance
	 */
	public Device withLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * Get the value of the SERVER header for this UPnP embedded device, which is a string of the following form:

: ''OS/version UPnP/udaversion product/version''

where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getServer() {
		return server;
	}

	/**
	 * Set the value of the SERVER header for this UPnP embedded device, which is a string of the following form:

: ''OS/version UPnP/udaversion product/version''

where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 1.5
	 * @param server the input value
	 */
	public void  setServer(String server) {
		this.server = server;
	}

	/**
	 * Set the value of the SERVER header for this UPnP embedded device, which is a string of the following form:

: ''OS/version UPnP/udaversion product/version''

where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 1.5
	 * @param server the input value
	 * @return this instance
	 */
	public Device withServer(String server) {
		this.server = server;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded device.

As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded device.

As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 1.5
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded device.

As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 1.5
	 * @param string the input value
	 * @return this instance
	 */
	public Device withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 1.12
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 1.12
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public Device withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	//</editor-fold>

}