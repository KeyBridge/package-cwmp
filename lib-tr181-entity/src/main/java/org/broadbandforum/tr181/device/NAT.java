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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.nat.InterfaceSetting;
import org.broadbandforum.tr181.device.nat.PortMapping;

	/**
	 * Properties for Network Address Translation (NAT).

        The entire {{object}} object only applies to IPv4.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.NAT.")
@XmlRootElement(name = "Device.NAT")
@XmlType(name = "Device.NAT")
@XmlAccessorType(XmlAccessType.FIELD)
public class NAT {

	/**
	 * NAT settings for an associated IP Interface on which NAT is enabled.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "InterfaceSettings")
	@XmlElement(name = "InterfaceSetting")
	@CWMPParameter(access = "readWrite")
	public Collection<InterfaceSetting> interfaceSettings;
	/**
	 * Port mapping table.

        This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

        This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

        If the CPE hosts a firewall, it is assumed that it will appropriately configure the firewall for the port mapping.

        For enabled table entries, if {{param|InternalClient}} is {{empty}}, or if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "PortMappings")
	@XmlElement(name = "PortMapping")
	@CWMPParameter(access = "readWrite")
	public Collection<PortMapping> portMappings;

	public NAT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the nat settings for an associated IP Interface on which NAT is enabled.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<InterfaceSetting> getInterfaceSettings() {
		if (this.interfaceSettings == null){ this.interfaceSettings=new ArrayList<>();}
		return interfaceSettings;
	}

	/**
	 * Set the nat settings for an associated IP Interface on which NAT is enabled.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param interfaceSettings the input value
	 */
	public void  setInterfaceSettings(Collection<InterfaceSetting> interfaceSettings) {
		this.interfaceSettings = interfaceSettings;
	}

	/**
	 * Set the nat settings for an associated IP Interface on which NAT is enabled.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param interfaceSetting the input value
	 * @return this instance
	 */
	public NAT withInterfaceSetting(InterfaceSetting interfaceSetting) {
		getInterfaceSettings().add(interfaceSetting);
		return this;
	}

	/**
	 * Get the port mapping table.

        This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

        This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

        If the CPE hosts a firewall, it is assumed that it will appropriately configure the firewall for the port mapping.

        For enabled table entries, if {{param|InternalClient}} is {{empty}}, or if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<PortMapping> getPortMappings() {
		if (this.portMappings == null){ this.portMappings=new ArrayList<>();}
		return portMappings;
	}

	/**
	 * Set the port mapping table.

        This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

        This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

        If the CPE hosts a firewall, it is assumed that it will appropriately configure the firewall for the port mapping.

        For enabled table entries, if {{param|InternalClient}} is {{empty}}, or if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param portMappings the input value
	 */
	public void  setPortMappings(Collection<PortMapping> portMappings) {
		this.portMappings = portMappings;
	}

	/**
	 * Set the port mapping table.

        This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

        This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

        If the CPE hosts a firewall, it is assumed that it will appropriately configure the firewall for the port mapping.

        For enabled table entries, if {{param|InternalClient}} is {{empty}}, or if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param portMapping the input value
	 * @return this instance
	 */
	public NAT withPortMapping(PortMapping portMapping) {
		getPortMappings().add(portMapping);
		return this;
	}

	//</editor-fold>

}