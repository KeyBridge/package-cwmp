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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * UPnP embedded service table. This table contains an entry for each UPnP embedded service that has been discovered via SSDP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.UPnP.Discovery.Service.{i}.")
public class Service {

	/**
	 * The status of the UPnP embedded service. {{enum}}

          The ability to list inactive UPnP embedded services is OPTIONAL. The length of time an inactive service remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The value of the USN (Unique Service Name) header for this UPnP embedded service. This is of the following form:

          : ''uuid:device-UUID::urn:domain-name:service:serviceType:v''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "USN")
	@Size(max = 256)
	public String usn;
	/**
	 * The UPnP embedded service lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTime")
	public Long leaseTime;
	/**
	 * The value of the LOCATION header for this UPnP embedded service, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Location")
	@Size(max = 256)
	public String location;
	/**
	 * The value of the SERVER header for this UPnP embedded service, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Server")
	@Size(max = 256)
	public String server;
	/**
	 * {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded service.

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
	/**
	 * {{reference|the {{object|#.RootDevice}} or {{object|#.Device}} table entries that embeds this {{object}}}} This parameter is populated by extracting the "device-UUID" from the service's USN and matching the value against the root device or embedded device UUID value.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ParentDevice")
	@Size(max = 256)
	public String parentDevice;

	public Service() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the UPnP embedded service. {{enum}}

          The ability to list inactive UPnP embedded services is OPTIONAL. The length of time an inactive service remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the UPnP embedded service. {{enum}}

          The ability to list inactive UPnP embedded services is OPTIONAL. The length of time an inactive service remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the UPnP embedded service. {{enum}}

          The ability to list inactive UPnP embedded services is OPTIONAL. The length of time an inactive service remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Service withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the value of the USN (Unique Service Name) header for this UPnP embedded service. This is of the following form:

          : ''uuid:device-UUID::urn:domain-name:service:serviceType:v''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsn() {
		return usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP embedded service. This is of the following form:

          : ''uuid:device-UUID::urn:domain-name:service:serviceType:v''
	 *
	 * @since 2.0
	 * @param usn the input value
	 */
	public void  setUsn(String usn) {
		this.usn = usn;
	}

	/**
	 * Set the value of the USN (Unique Service Name) header for this UPnP embedded service. This is of the following form:

          : ''uuid:device-UUID::urn:domain-name:service:serviceType:v''
	 *
	 * @since 2.0
	 * @param usn the input value
	 * @return this instance
	 */
	public Service withUsn(String usn) {
		this.usn = usn;
		return this;
	}

	/**
	 * Get the UPnP embedded service lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLeaseTime() {
		return leaseTime;
	}

	/**
	 * Set the UPnP embedded service lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 */
	public void  setLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * Set the UPnP embedded service lease time in seconds, extracted from the CACHE-CONTROL header.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 * @return this instance
	 */
	public Service withLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
		return this;
	}

	/**
	 * Get the value of the LOCATION header for this UPnP embedded service, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP embedded service, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @param location the input value
	 */
	public void  setLocation(String location) {
		this.location = location;
	}

	/**
	 * Set the value of the LOCATION header for this UPnP embedded service, which is the URL of the root device's DDD (Device Description Document).
	 *
	 * @since 2.0
	 * @param location the input value
	 * @return this instance
	 */
	public Service withLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * Get the value of the SERVER header for this UPnP embedded service, which is a string of the following form:

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
	 * Set the value of the SERVER header for this UPnP embedded service, which is a string of the following form:

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
	 * Set the value of the SERVER header for this UPnP embedded service, which is a string of the following form:

          : ''OS/version UPnP/udaversion product/version''

          where '''UPnP''' is a literal string, '''udaversion''' is the version of the UPnP Device Architecture.
	 *
	 * @since 2.0
	 * @param server the input value
	 * @return this instance
	 */
	public Service withServer(String server) {
		this.server = server;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded service.

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
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded service.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this UPnP embedded service.

          As such entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Service withHost(String string) {
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
	public Service withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get the {{reference|the {{object|#.RootDevice}} or {{object|#.Device}} table entries that embeds this {{object}}}} This parameter is populated by extracting the "device-UUID" from the service's USN and matching the value against the root device or embedded device UUID value.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getParentDevice() {
		return parentDevice;
	}

	/**
	 * Set the {{reference|the {{object|#.RootDevice}} or {{object|#.Device}} table entries that embeds this {{object}}}} This parameter is populated by extracting the "device-UUID" from the service's USN and matching the value against the root device or embedded device UUID value.
	 *
	 * @since 2.6
	 * @param parentDevice the input value
	 */
	public void  setParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
	}

	/**
	 * Set the {{reference|the {{object|#.RootDevice}} or {{object|#.Device}} table entries that embeds this {{object}}}} This parameter is populated by extracting the "device-UUID" from the service's USN and matching the value against the root device or embedded device UUID value.
	 *
	 * @since 2.6
	 * @param parentDevice the input value
	 * @return this instance
	 */
	public Service withParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
		return this;
	}

	//</editor-fold>

}