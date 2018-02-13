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
package org.broadbandforum.tr181.device.lldp.discovery.device.port;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * The port's link information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 2 (''Link Information'').
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.Device.{i}.Port.{i}.LinkInformation.")
@XmlRootElement(name = "LinkInformation")
@XmlType(name = "Device.LLDP.Discovery.Device.Port.LinkInformation")
@XmlAccessorType(XmlAccessType.FIELD)
public class LinkInformation {

	/**
	 * The port's interface type, or 0 if no interface type has been received.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, it's an IANA interface type {{bibref|IANAifType}}. 

          For example, IANAifType defines the following interface types for wired line (UTP cable), wireless line, power line, and coaxial cable:

          * ''6'' (Wired line)

          * ''71'' (Wireless)

          * ''174'' (PLC)

          * ''236'' (Coaxial cable)
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "InterfaceType")
	public Long interfaceType;
	/**
	 * The port's MAC forwarding table, or the value is {{empty}} if no forwarding table was supplied.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MACForwardingTable")
	public MACAddress macForwardingTable;

	public LinkInformation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the port's interface type, or 0 if no interface type has been received.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, it's an IANA interface type {{bibref|IANAifType}}. 

          For example, IANAifType defines the following interface types for wired line (UTP cable), wireless line, power line, and coaxial cable:

          * ''6'' (Wired line)

          * ''71'' (Wireless)

          * ''174'' (PLC)

          * ''236'' (Coaxial cable)
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Set the port's interface type, or 0 if no interface type has been received.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, it's an IANA interface type {{bibref|IANAifType}}. 

          For example, IANAifType defines the following interface types for wired line (UTP cable), wireless line, power line, and coaxial cable:

          * ''6'' (Wired line)

          * ''71'' (Wireless)

          * ''174'' (PLC)

          * ''236'' (Coaxial cable)
	 *
	 * @since 2.8
	 * @param interfaceType the input value
	 */
	public void  setInterfaceType(Long interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * Set the port's interface type, or 0 if no interface type has been received.

          Note: It is assumed that it might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, it's an IANA interface type {{bibref|IANAifType}}. 

          For example, IANAifType defines the following interface types for wired line (UTP cable), wireless line, power line, and coaxial cable:

          * ''6'' (Wired line)

          * ''71'' (Wireless)

          * ''174'' (PLC)

          * ''236'' (Coaxial cable)
	 *
	 * @since 2.8
	 * @param interfaceType the input value
	 * @return this instance
	 */
	public LinkInformation withInterfaceType(Long interfaceType) {
		this.interfaceType = interfaceType;
		return this;
	}

	/**
	 * Get the port's MAC forwarding table, or the value is {{empty}} if no forwarding table was supplied.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getMacForwardingTable() {
		return macForwardingTable;
	}

	/**
	 * Set the port's MAC forwarding table, or the value is {{empty}} if no forwarding table was supplied.
	 *
	 * @since 2.8
	 * @param macForwardingTable the input value
	 */
	public void  setMacForwardingTable(MACAddress macForwardingTable) {
		this.macForwardingTable = macForwardingTable;
	}

	/**
	 * Set the port's MAC forwarding table, or the value is {{empty}} if no forwarding table was supplied.
	 *
	 * @since 2.8
	 * @param macForwardingTable the input value
	 * @return this instance
	 */
	public LinkInformation withMacForwardingTable(MACAddress macForwardingTable) {
		this.macForwardingTable = macForwardingTable;
		return this;
	}

	//</editor-fold>

}