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
package org.broadbandforum.tr181.device.dhcpv6;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dhcpv6.server.Pool;

	/**
	 * DHCPv6 server configuration.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.")
public class Server {

	/**
	 * Enables or disables the DHCPv6 server function.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * DHCPv6 server pool table.

        Each instance of this object defines a DHCPv6 server pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCPv6 options, and source address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack) then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Pools")
	@XmlElement(name = "Pool")
	@CWMPParameter(access = "readWrite")
	public Collection<Pool> pools;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCPv6 server function.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCPv6 server function.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCPv6 server function.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public Server withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the dhcPv6 server pool table.

        Each instance of this object defines a DHCPv6 server pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCPv6 options, and source address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack) then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Pool> getPools() {
		if (this.pools == null){ this.pools=new ArrayList<>();}
		return pools;
	}

	/**
	 * Set the dhcPv6 server pool table.

        Each instance of this object defines a DHCPv6 server pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCPv6 options, and source address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack) then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param pools the input value
	 */
	public void  setPools(Collection<Pool> pools) {
		this.pools = pools;
	}

	/**
	 * Set the dhcPv6 server pool table.

        Each instance of this object defines a DHCPv6 server pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCPv6 options, and source address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack) then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
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