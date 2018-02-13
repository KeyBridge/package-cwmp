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
package org.broadbandforum.tr181.device.lldp.discovery.device;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.lldp.discovery.device.port.LinkInformation;

	/**
	 * This table contains information about ports on discovered LLDP devices.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.Device.{i}.Port.{i}.")
@XmlRootElement(name = "Port")
@XmlType(name = "Device.LLDP.Discovery.Device.Port")
@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

	/**
	 * The port identifier subtype, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Interface alias)

          * ''2'' (Port component)

          * ''3'' (MAC address)

          * ''4'' (Network address)

          * ''5'' (Interface name)

          * ''6'' (Agent circuit ID)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PortIDSubtype")
	@Size(max = 255)
	public Long portIDSubtype;
	/**
	 * The port identifier, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PortID")
	@Size(min = 1, max = 255)
	public String portID;
	/**
	 * The ''LLDPDU'' lifetime (in seconds), which is the value of the latest TimeToLive TLV (TLV Type = 3).

          If this value is 0, it means that the LLDP agent or the MAC service function of the port is stopped.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TTL")
	@Size(max = 65535)
	public Long ttl;
	/**
	 * The port description, which is the value of the latest Port Description TLV (TLV Type = 4), or {{empty}} if no Port Description TLV has been received.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the parameter value is likely to be one of the names defined in {{bibref|JJ-300.00|Appendix A (''List of Interface Standard Names'')}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PortDescription")
	@Size(max = 255)
	public String portDescription;
	/**
	 * The device's MAC addresses, which are included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no list of MAC addresses has been received.

          The parameter is relevant when there is a LLDP device which has a MAC copy function and has two or more MAC addresses.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 3 (''MAC Address List'').
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MACAddressList")
	public MACAddress macAddressList;
	/**
	 * The date and time at which the last LLDPDU was received for this ({{object|#}},{{object}}).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;
	/**
	 * The port's link information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 2 (''Link Information'').
	 */
	@XmlElement(name = "LinkInformation")
	public LinkInformation linkInformation;

	public Port() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the port identifier subtype, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Interface alias)

          * ''2'' (Port component)

          * ''3'' (MAC address)

          * ''4'' (Network address)

          * ''5'' (Interface name)

          * ''6'' (Agent circuit ID)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPortIDSubtype() {
		return portIDSubtype;
	}

	/**
	 * Set the port identifier subtype, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Interface alias)

          * ''2'' (Port component)

          * ''3'' (MAC address)

          * ''4'' (Network address)

          * ''5'' (Interface name)

          * ''6'' (Agent circuit ID)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)
	 *
	 * @since 2.8
	 * @param portIDSubtype the input value
	 */
	public void  setPortIDSubtype(Long portIDSubtype) {
		this.portIDSubtype = portIDSubtype;
	}

	/**
	 * Set the port identifier subtype, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).  The following subtype values are defined:

          * ''0'' (Reserved)

          * ''1'' (Interface alias)

          * ''2'' (Port component)

          * ''3'' (MAC address)

          * ''4'' (Network address)

          * ''5'' (Interface name)

          * ''6'' (Agent circuit ID)

          * ''7'' (Locally assigned)

          * ''8-255'' (Reserved)
	 *
	 * @since 2.8
	 * @param portIDSubtype the input value
	 * @return this instance
	 */
	public Port withPortIDSubtype(Long portIDSubtype) {
		this.portIDSubtype = portIDSubtype;
		return this;
	}

	/**
	 * Get the port identifier, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPortID() {
		return portID;
	}

	/**
	 * Set the port identifier, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).
	 *
	 * @since 2.8
	 * @param portID the input value
	 */
	public void  setPortID(String portID) {
		this.portID = portID;
	}

	/**
	 * Set the port identifier, which is included in the value of the ''LLDPDU's'' Port ID TLV (TLV Type = 2).
	 *
	 * @since 2.8
	 * @param portID the input value
	 * @return this instance
	 */
	public Port withPortID(String portID) {
		this.portID = portID;
		return this;
	}

	/**
	 * Get the ''LLDPDU'' lifetime (in seconds), which is the value of the latest TimeToLive TLV (TLV Type = 3).

          If this value is 0, it means that the LLDP agent or the MAC service function of the port is stopped.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getTtl() {
		return ttl;
	}

	/**
	 * Set the ''LLDPDU'' lifetime (in seconds), which is the value of the latest TimeToLive TLV (TLV Type = 3).

          If this value is 0, it means that the LLDP agent or the MAC service function of the port is stopped.
	 *
	 * @since 2.8
	 * @param ttl the input value
	 */
	public void  setTtl(Long ttl) {
		this.ttl = ttl;
	}

	/**
	 * Set the ''LLDPDU'' lifetime (in seconds), which is the value of the latest TimeToLive TLV (TLV Type = 3).

          If this value is 0, it means that the LLDP agent or the MAC service function of the port is stopped.
	 *
	 * @since 2.8
	 * @param ttl the input value
	 * @return this instance
	 */
	public Port withTtl(Long ttl) {
		this.ttl = ttl;
		return this;
	}

	/**
	 * Get the port description, which is the value of the latest Port Description TLV (TLV Type = 4), or {{empty}} if no Port Description TLV has been received.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the parameter value is likely to be one of the names defined in {{bibref|JJ-300.00|Appendix A (''List of Interface Standard Names'')}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPortDescription() {
		return portDescription;
	}

	/**
	 * Set the port description, which is the value of the latest Port Description TLV (TLV Type = 4), or {{empty}} if no Port Description TLV has been received.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the parameter value is likely to be one of the names defined in {{bibref|JJ-300.00|Appendix A (''List of Interface Standard Names'')}}.
	 *
	 * @since 2.8
	 * @param portDescription the input value
	 */
	public void  setPortDescription(String portDescription) {
		this.portDescription = portDescription;
	}

	/**
	 * Set the port description, which is the value of the latest Port Description TLV (TLV Type = 4), or {{empty}} if no Port Description TLV has been received.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the parameter value is likely to be one of the names defined in {{bibref|JJ-300.00|Appendix A (''List of Interface Standard Names'')}}.
	 *
	 * @since 2.8
	 * @param portDescription the input value
	 * @return this instance
	 */
	public Port withPortDescription(String portDescription) {
		this.portDescription = portDescription;
		return this;
	}

	/**
	 * Get the device's MAC addresses, which are included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no list of MAC addresses has been received.

          The parameter is relevant when there is a LLDP device which has a MAC copy function and has two or more MAC addresses.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 3 (''MAC Address List'').
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getMacAddressList() {
		return macAddressList;
	}

	/**
	 * Set the device's MAC addresses, which are included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no list of MAC addresses has been received.

          The parameter is relevant when there is a LLDP device which has a MAC copy function and has two or more MAC addresses.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 3 (''MAC Address List'').
	 *
	 * @since 2.8
	 * @param macAddressList the input value
	 */
	public void  setMacAddressList(MACAddress macAddressList) {
		this.macAddressList = macAddressList;
	}

	/**
	 * Set the device's MAC addresses, which are included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no list of MAC addresses has been received.

          The parameter is relevant when there is a LLDP device which has a MAC copy function and has two or more MAC addresses.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 3 (''MAC Address List'').
	 *
	 * @since 2.8
	 * @param macAddressList the input value
	 * @return this instance
	 */
	public Port withMacAddressList(MACAddress macAddressList) {
		this.macAddressList = macAddressList;
		return this;
	}

	/**
	 * Get the date and time at which the last LLDPDU was received for this ({{object|#}},{{object}}).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date and time at which the last LLDPDU was received for this ({{object|#}},{{object}}).
	 *
	 * @since 2.8
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date and time at which the last LLDPDU was received for this ({{object|#}},{{object}}).
	 *
	 * @since 2.8
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public Port withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get the port's link information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 2 (''Link Information'').
	 *
	 * @return the value
	 */
	public LinkInformation getLinkInformation() {
		return linkInformation;
	}

	/**
	 * Set the port's link information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 2 (''Link Information'').
	 *
	 * @param linkInformation the input value
	 */
	public void  setLinkInformation(LinkInformation linkInformation) {
		this.linkInformation = linkInformation;
	}

	/**
	 * Set the port's link information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 2 (''Link Information'').
	 *
	 * @param linkInformation the input value
	 * @return this instance
	 */
	public Port withLinkInformation(LinkInformation linkInformation) {
		this.linkInformation = linkInformation;
		return this;
	}

	//</editor-fold>

}