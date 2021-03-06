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
package org.broadbandforum.tr181.device.upnp.discovery;

import java.time.LocalDateTime;
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
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * UPnP root device table. This table contains an entry for each UPnP root device that has been discovered via SSDP.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPnP.Discovery.RootDevice.{i}.", uniqueConstraints = {@CWMPUnique(names = {"UUID"})})
@XmlRootElement(name = "Device.UPnP.Discovery.RootDevice")
@XmlType(name = "Device.UPnP.Discovery.RootDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootDevice {

	/**
	 * The status of the UPnP root device. {{enum}}

          The ability to list inactive UPnP root devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * This UPnP root device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

          : ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

          {{pattern}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UUID")
	@Size(max = 36)
	@Pattern(regexp = "[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}")
	public String uuiD;
	/**
	 * The value of the USN (Unique Service Name) header for this UPnP root device. Three discovery messages are sent for root devices, and this SHOULD be the value of the USN header of the following form:

          : ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

          SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, one of the other two forms MAY be used:

          : ''uuid:device-UUID::upnp:rootdevice''

          : ''uuid:device-UUID'' (for root device UUID)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "USN")
	@Size(max = 256)
	public String usn;
	/**
	 * The UPnP root device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTime")
	public Long leaseTime;
	/**
	 * The value of the LOCATION header for this UPnP root device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Location")
	@Size(max = 256)
	public String location;
	/**
	 * The value of the SERVER header for this UPnP root device, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Server")
	@Size(max = 256)
	public String server;
	/**
	 * {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP root device.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;
	/**
	 * The date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;

	public RootDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the UPnP root device. {{enum}}

          The ability to list inactive UPnP root devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the UPnP root device. {{enum}}

          The ability to list inactive UPnP root devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the UPnP root device. {{enum}}

          The ability to list inactive UPnP root devices is OPTIONAL. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public RootDevice withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the this UPnP root device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

          : ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

          {{pattern}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUuiD() {
		return uuiD;
	}

	/**
	 * Set the this UPnP root device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

          : ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

          {{pattern}}
	 *
	 * @since 2.0
	 * @param uuiD the input value
	 */
	public void  setUuiD(String uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set the this UPnP root device's UUID (Universally Unique IDentifier) {{bibref|RFC4122}}, extracted from any of its USN (Unique Service Name) headers. This is a 36-byte string that uniquely identifies the device, the following is an example:

          : ''02c29d2a-dbfd-2d91-99c9-306d537e9856''

          {{pattern}}
	 *
	 * @since 2.0
	 * @param uuiD the input value
	 * @return this instance
	 */
	public RootDevice withUuiD(String uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the value of the USN (Unique Service Name) header for this UPnP root device. Three discovery messages are sent for root devices, and this SHOULD be the value of the USN header of the following form:

          : ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

          SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, one of the other two forms MAY be used:

          : ''uuid:device-UUID::upnp:rootdevice''

          : ''uuid:device-UUID'' (for root device UUID)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsn() {
		return usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP root device. Three discovery messages are sent for root devices, and this SHOULD be the value of the USN header of the following form:

          : ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

          SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, one of the other two forms MAY be used:

          : ''uuid:device-UUID::upnp:rootdevice''

          : ''uuid:device-UUID'' (for root device UUID)
	 *
	 * @since 2.0
	 * @param usn the input value
	 */
	public void  setUsn(String usn) {
		this.usn = usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP root device. Three discovery messages are sent for root devices, and this SHOULD be the value of the USN header of the following form:

          : ''uuid:device-UUID::urn:domain-name:device:deviceType:v''

          SSDP is an unreliable protocol and it is possible that no discovery message containing the USN header of the above form was ever received. If so, one of the other two forms MAY be used:

          : ''uuid:device-UUID::upnp:rootdevice''

          : ''uuid:device-UUID'' (for root device UUID)
	 *
	 * @since 2.0
	 * @param usn the input value
	 * @return this instance
	 */
	public RootDevice withUsn(String usn) {
		this.usn = usn;
		return this;
	}

	/**
	 * Get the UPnP root device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLeaseTime() {
		return leaseTime;
	}

	/**
	 * Set the UPnP root device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 */
	public void  setLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * Set the UPnP root device lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 * @return this instance
	 */
	public RootDevice withLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
		return this;
	}

	/**
	 * Get the value of the LOCATION header for this UPnP root device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP root device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @param location the input value
	 */
	public void  setLocation(String location) {
		this.location = location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP root device, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @param location the input value
	 * @return this instance
	 */
	public RootDevice withLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * Get the value of the SERVER header for this UPnP root device, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getServer() {
		return server;
	}

	/**
	 * Set the value of the SERVER header for this UPnP root device, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 * @param server the input value
	 */
	public void  setServer(String server) {
		this.server = server;
	}

	/**
	 * Set the value of the SERVER header for this UPnP root device, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 * @param server the input value
	 * @return this instance
	 */
	public RootDevice withServer(String server) {
		this.server = server;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP root device.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP root device.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP root device.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RootDevice withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 2.6
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement from this {{object}} was received.
	 *
	 * @since 2.6
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public RootDevice withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	//</editor-fold>

}