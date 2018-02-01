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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dslite.InterfaceSetting;

	/**
	 * Settings allowing a CPE to configure and route IPv6 Dual-Stack Lite (DSLite) as specified in {{bibref|DSLite}}. The DS-Lite mechanism is intended to be implemented only on gateway devices that support IPv4 on the LAN side and only have IPv6 connectivity on the WAN side.

        See the Dual-Stack Lite Theory of Operation {{bibref|TR-181i2a2|Appendix VII}} for a description of the working of this DS-Lite data model.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DSLite.")
public class DSLite {

	/**
	 * Enables or disables DSLite.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * DSLite {{bibref|DSLite}} settings.
	 */
	@XmlElementWrapper(name = "InterfaceSettings")
	@XmlElement(name = "InterfaceSetting")
	public Collection<InterfaceSetting> interfaceSettings;

	public DSLite() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables DSLite.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables DSLite.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables DSLite.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public DSLite withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the dslite {{bibref|DSLite}} settings.
	 *
	 * @return the value
	 */
	public Collection<InterfaceSetting> getInterfaceSettings() {
		if (this.interfaceSettings == null){ this.interfaceSettings=new ArrayList<>();}
		return interfaceSettings;
	}

	/**
	 * Set the dslite {{bibref|DSLite}} settings.
	 *
	 * @param interfaceSettings the input value
	 */
	public void  setInterfaceSettings(Collection<InterfaceSetting> interfaceSettings) {
		this.interfaceSettings = interfaceSettings;
	}

	/**
	 * Set the dslite {{bibref|DSLite}} settings.
	 *
	 * @param interfaceSetting the input value
	 * @return this instance
	 */
	public DSLite withInterfaceSetting(InterfaceSetting interfaceSetting) {
		getInterfaceSettings().add(interfaceSetting);
		return this;
	}

	//</editor-fold>

}