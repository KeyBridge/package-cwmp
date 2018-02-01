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
package org.broadbandforum.tr181.device.routing;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.routing.rip.InterfaceSetting;

	/**
	 * Routing Information Protocol (RIP) object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Routing.RIP.")
public class RIP {

	/**
	 * Enables or disables RIP on the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The supported RIP protocol modes.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SupportedModes")
	public String supportedModes;
	/**
	 * IP Interface RIP configuration table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.

        Note: This object only applies to RIP2; i.e. version 2 of the RIP protocol is used to accept or send over the specified {{param|Interface}}.
	 */
	@XmlElementWrapper(name = "interfaceSettings")
	@XmlElement(name = "InterfaceSetting")
	@CWMPParameter(access = "readWrite")
	public Collection<InterfaceSetting> interfaceSettings;

	public RIP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables RIP on the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables RIP on the device.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables RIP on the device.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public RIP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the supported RIP protocol modes.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSupportedModes() {
		return supportedModes;
	}

	/**
	 * Set the supported RIP protocol modes.  {{enum}}
	 *
	 * @since 2.0
	 * @param supportedModes the input value
	 */
	public void  setSupportedModes(String supportedModes) {
		this.supportedModes = supportedModes;
	}

	/**
	 * Set the supported RIP protocol modes.  {{enum}}
	 *
	 * @since 2.0
	 * @param supportedModes the input value
	 * @return this instance
	 */
	public RIP withSupportedModes(String supportedModes) {
		this.supportedModes = supportedModes;
		return this;
	}

	/**
	 * Get the ip Interface RIP configuration table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.

        Note: This object only applies to RIP2; i.e. version 2 of the RIP protocol is used to accept or send over the specified {{param|Interface}}.
	 *
	 * @return the value
	 */
	public Collection<InterfaceSetting> getInterfaceSettings() {
		if (this.interfaceSettings == null){ this.interfaceSettings=new ArrayList<>();}
		return interfaceSettings;
	}

	/**
	 * Set the ip Interface RIP configuration table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.

        Note: This object only applies to RIP2; i.e. version 2 of the RIP protocol is used to accept or send over the specified {{param|Interface}}.
	 *
	 * @param interfaceSettings the input value
	 */
	public void  setInterfaceSettings(Collection<InterfaceSetting> interfaceSettings) {
		this.interfaceSettings = interfaceSettings;
	}

	/**
	 * Set the ip Interface RIP configuration table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.

        Note: This object only applies to RIP2; i.e. version 2 of the RIP protocol is used to accept or send over the specified {{param|Interface}}.
	 *
	 * @param interfaceSetting the input value
	 * @return this instance
	 */
	public RIP withInterfaceSetting(InterfaceSetting interfaceSetting) {
		getInterfaceSettings().add(interfaceSetting);
		return this;
	}

	//</editor-fold>

}