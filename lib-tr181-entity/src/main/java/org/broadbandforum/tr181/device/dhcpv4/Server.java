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
package org.broadbandforum.tr181.device.dhcpv4;

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
import org.broadbandforum.tr181.device.dhcpv4.server.Pool;

	/**
	 * DHCP server configuration.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Server.")
@XmlRootElement(name = "Device.DHCPv4.Server")
@XmlType(name = "Device.DHCPv4.Server")
@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

	/**
	 * Enables or disables the DHCP server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * DHCP conditional serving pool table. 

        Each instance of this object defines a DHCP conditional serving pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference, or {{param|MinAddress}}, {{param|MaxAddress}}, or {{param|SubnetMask}} is not a valid value, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Pools")
	@XmlElement(name = "Pool")
	@CWMPParameter(access = "readWrite")
	public Collection<Pool> pools;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCP server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCP server.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCP server.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Server withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the dhcP conditional serving pool table. 

        Each instance of this object defines a DHCP conditional serving pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference, or {{param|MinAddress}}, {{param|MaxAddress}}, or {{param|SubnetMask}} is not a valid value, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Pool> getPools() {
		if (this.pools == null){ this.pools=new ArrayList<>();}
		return pools;
	}

	/**
	 * Set the dhcP conditional serving pool table. 

        Each instance of this object defines a DHCP conditional serving pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference, or {{param|MinAddress}}, {{param|MaxAddress}}, or {{param|SubnetMask}} is not a valid value, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param pools the input value
	 */
	public void  setPools(Collection<Pool> pools) {
		this.pools = pools;
	}

	/**
	 * Set the dhcP conditional serving pool table. 

        Each instance of this object defines a DHCP conditional serving pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference, or {{param|MinAddress}}, {{param|MaxAddress}}, or {{param|SubnetMask}} is not a valid value, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param pool the input value
	 * @return this instance
	 */
	public Server withPool(Pool pool) {
		getPools().add(pool);
		return this;
	}

	//</editor-fold>

}