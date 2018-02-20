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
import org.broadbandforum.tr181.device.ipv6rd.InterfaceSetting;

	/**
	 * Settings allowing a CPE to derive and route IPv6 Rapid Deployment (6rd) delegated prefixes as specified in {{bibref|RFC5969}}.  The 6rd mechanism is intended to be implemented only on what {{bibref|RFC5969}} refers to as ''Customer Edge Routers'', i.e. on gateway devices, that support IPv6 on the LAN side and only have IPv4 connectivity on the WAN side.

        See the 6rd Theory of Operation {{bibref|TR-181i2a2|Appendix VI}} for a description of the working of this 6rd data model.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.IPv6rd.")
@XmlRootElement(name = "Device.IPv6rd")
@XmlType(name = "Device.IPv6rd")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6rd {

	/**
	 * Enables or disables IPv6rd.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * 6rd {{bibref|RFC5969}} settings.

        A 6rd delegated prefix is expected to be of maximum length 64 bits, and is the concatenation of the following two items:

        * Service provider IPv6 prefix: specified via the {{param|SPIPv6Prefix}} parameter

        * IPv4 address suffix: the IPv4 address with the first {{param|IPv4MaskLength}} bits removed

        This object definition is derived from {{bibref|RFC5969}} with some minor nomenclature changes.
	 */
	@XmlElementWrapper(name = "InterfaceSettings")
	@XmlElement(name = "InterfaceSetting")
	public Collection<InterfaceSetting> interfaceSettings;

	public IPv6rd() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables IPv6rd.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables IPv6rd.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables IPv6rd.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public IPv6rd withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the 6rd {{bibref|RFC5969}} settings.

        A 6rd delegated prefix is expected to be of maximum length 64 bits, and is the concatenation of the following two items:

        * Service provider IPv6 prefix: specified via the {{param|SPIPv6Prefix}} parameter

        * IPv4 address suffix: the IPv4 address with the first {{param|IPv4MaskLength}} bits removed

        This object definition is derived from {{bibref|RFC5969}} with some minor nomenclature changes.
	 *
	 * @return the value
	 */
	public Collection<InterfaceSetting> getInterfaceSettings() {
		if (this.interfaceSettings == null){ this.interfaceSettings=new ArrayList<>();}
		return interfaceSettings;
	}

	/**
	 * Set the 6rd {{bibref|RFC5969}} settings.

        A 6rd delegated prefix is expected to be of maximum length 64 bits, and is the concatenation of the following two items:

        * Service provider IPv6 prefix: specified via the {{param|SPIPv6Prefix}} parameter

        * IPv4 address suffix: the IPv4 address with the first {{param|IPv4MaskLength}} bits removed

        This object definition is derived from {{bibref|RFC5969}} with some minor nomenclature changes.
	 *
	 * @param interfaceSettings the input value
	 */
	public void  setInterfaceSettings(Collection<InterfaceSetting> interfaceSettings) {
		this.interfaceSettings = interfaceSettings;
	}

	/**
	 * Set the 6rd {{bibref|RFC5969}} settings.

        A 6rd delegated prefix is expected to be of maximum length 64 bits, and is the concatenation of the following two items:

        * Service provider IPv6 prefix: specified via the {{param|SPIPv6Prefix}} parameter

        * IPv4 address suffix: the IPv4 address with the first {{param|IPv4MaskLength}} bits removed

        This object definition is derived from {{bibref|RFC5969}} with some minor nomenclature changes.
	 *
	 * @param interfaceSetting the input value
	 * @return this instance
	 */
	public IPv6rd withInterfaceSetting(InterfaceSetting interfaceSetting) {
		getInterfaceSettings().add(interfaceSetting);
		return this;
	}

	//</editor-fold>

}