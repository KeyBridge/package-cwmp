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
package org.broadbandforum.tr181.device.lldp.discovery;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.lldp.discovery.device.DeviceInformation;
import org.broadbandforum.tr181.device.lldp.discovery.device.Port;

	/**
	 * This table contains information about discovered LLDP devices.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.Device.{i}.")
public class Device {

	/**
	 * {{reference|the interface via which the LLDP device was discovered}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Interface")
	public String _interface;
	/**
	 * The chassis identifier subtype, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Chassis component)

          * ''2'' (Interface alias)

          * ''3'' (Port component)

          * ''4'' (MAC address)

          * ''5'' (Network address)

          * ''6'' (Interface name)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)

          Note: It is assumed that this integer might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address (chassis ID subtype = 4) for ''HTIP-Ethernet Bridge''.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ChassisIDSubtype")
	@Size(max = 255)
	public Long chassisIDSubtype;
	/**
	 * The chassis identifier, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address. If ''LLDPDU''s are sent and received from two or more LLDP agents of the same ''HTIP-Ethernet Bridge'', this value is same in all ''LLDPDU''s.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ChassisID")
	@Size(min = 1, max = 255)
	public String chassisID;
	/**
	 * {{list}}Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this device.

          When the entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;
	/**
	 * This table contains information about ports on discovered LLDP devices.
	 */
	@XmlElementWrapper(name = "ports")
	@XmlElement(name = "Port")
	public Collection<Port> ports;
	/**
	 * The device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 1 (''Device Information'').
	 */
	@XmlElement(name = "DeviceInformation")
	public DeviceInformation deviceInformation;

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference|the interface via which the LLDP device was discovered}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference|the interface via which the LLDP device was discovered}}
	 *
	 * @since 2.8
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference|the interface via which the LLDP device was discovered}}
	 *
	 * @since 2.8
	 * @param _interface the input value
	 * @return this instance
	 */
	public Device with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the chassis identifier subtype, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Chassis component)

          * ''2'' (Interface alias)

          * ''3'' (Port component)

          * ''4'' (MAC address)

          * ''5'' (Network address)

          * ''6'' (Interface name)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)

          Note: It is assumed that this integer might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address (chassis ID subtype = 4) for ''HTIP-Ethernet Bridge''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getChassisIDSubtype() {
		return chassisIDSubtype;
	}

	/**
	 * Set the chassis identifier subtype, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Chassis component)

          * ''2'' (Interface alias)

          * ''3'' (Port component)

          * ''4'' (MAC address)

          * ''5'' (Network address)

          * ''6'' (Interface name)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)

          Note: It is assumed that this integer might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address (chassis ID subtype = 4) for ''HTIP-Ethernet Bridge''.
	 *
	 * @since 2.8
	 * @param chassisIDSubtype the input value
	 */
	public void  setChassisIDSubtype(Long chassisIDSubtype) {
		this.chassisIDSubtype = chassisIDSubtype;
	}

	/**
	 * Set the chassis identifier subtype, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Chassis component)

          * ''2'' (Interface alias)

          * ''3'' (Port component)

          * ''4'' (MAC address)

          * ''5'' (Network address)

          * ''6'' (Interface name)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)

          Note: It is assumed that this integer might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address (chassis ID subtype = 4) for ''HTIP-Ethernet Bridge''.
	 *
	 * @since 2.8
	 * @param chassisIDSubtype the input value
	 * @return this instance
	 */
	public Device withChassisIDSubtype(Long chassisIDSubtype) {
		this.chassisIDSubtype = chassisIDSubtype;
		return this;
	}

	/**
	 * Get the chassis identifier, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address. If ''LLDPDU''s are sent and received from two or more LLDP agents of the same ''HTIP-Ethernet Bridge'', this value is same in all ''LLDPDU''s.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getChassisID() {
		return chassisID;
	}

	/**
	 * Set the chassis identifier, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address. If ''LLDPDU''s are sent and received from two or more LLDP agents of the same ''HTIP-Ethernet Bridge'', this value is same in all ''LLDPDU''s.
	 *
	 * @since 2.8
	 * @param chassisID the input value
	 */
	public void  setChassisID(String chassisID) {
		this.chassisID = chassisID;
	}

	/**
	 * Set the chassis identifier, which is included in the value of the ''LLDPDU's'' Chassis ID TLV (TLV Type = 1).

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the Chassis ID is set to the representative MAC address. If ''LLDPDU''s are sent and received from two or more LLDP agents of the same ''HTIP-Ethernet Bridge'', this value is same in all ''LLDPDU''s.
	 *
	 * @since 2.8
	 * @param chassisID the input value
	 * @return this instance
	 */
	public Device withChassisID(String chassisID) {
		this.chassisID = chassisID;
		return this;
	}

	/**
	 * Get the {{list}}Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this device.

          When the entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}}Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this device.

          When the entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.8
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}}Indicates the full path names of all Host table entries, whether active or inactive, that correspond to this device.

          When the entries are added to or removed from the Host tables, the value of this parameter MUST be updated accordingly.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Device withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the this table contains information about ports on discovered LLDP devices.
	 *
	 * @return the value
	 */
	public Collection<Port> getPorts() {
		if (this.ports == null){ this.ports=new ArrayList<>();}
		return ports;
	}

	/**
	 * Set the this table contains information about ports on discovered LLDP devices.
	 *
	 * @param ports the input value
	 */
	public void  setPorts(Collection<Port> ports) {
		this.ports = ports;
	}

	/**
	 * Set the this table contains information about ports on discovered LLDP devices.
	 *
	 * @param port the input value
	 * @return this instance
	 */
	public Device withPort(Port port) {
		getPorts().add(port);
		return this;
	}

	/**
	 * Get the device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 1 (''Device Information'').
	 *
	 * @return the value
	 */
	public DeviceInformation getDeviceInformation() {
		return deviceInformation;
	}

	/**
	 * Set the device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 1 (''Device Information'').
	 *
	 * @param deviceInformation the input value
	 */
	public void  setDeviceInformation(DeviceInformation deviceInformation) {
		this.deviceInformation = deviceInformation;
	}

	/**
	 * Set the device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 1 (''Device Information'').
	 *
	 * @param deviceInformation the input value
	 * @return this instance
	 */
	public Device withDeviceInformation(DeviceInformation deviceInformation) {
		this.deviceInformation = deviceInformation;
		return this;
	}

	//</editor-fold>

}