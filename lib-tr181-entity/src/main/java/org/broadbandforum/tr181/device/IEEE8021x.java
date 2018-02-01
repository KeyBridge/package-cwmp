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
import org.broadbandforum.tr181.device.ieee8021x.Supplicant;

	/**
	 * IEEE 802.1x object {{bibref|802.1x-2004}}, where {{object|Supplicant}} models authentication supplicants.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IEEE8021x.")
public class IEEE8021x {

	/**
	 * 802.1x supplicant authentication provisioning and status information associated with an interface to be authenticated (e.g. an {{object|.Ethernet.Link}} instance).

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "Supplicants")
	@XmlElement(name = "Supplicant")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<Supplicant> supplicants;

	public IEEE8021x() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the 802.1x supplicant authentication provisioning and status information associated with an interface to be authenticated (e.g. an {{object|.Ethernet.Link}} instance).

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<Supplicant> getSupplicants() {
		if (this.supplicants == null){ this.supplicants=new ArrayList<>();}
		return supplicants;
	}

	/**
	 * Set the 802.1x supplicant authentication provisioning and status information associated with an interface to be authenticated (e.g. an {{object|.Ethernet.Link}} instance).

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param supplicants the input value
	 */
	public void  setSupplicants(Collection<Supplicant> supplicants) {
		this.supplicants = supplicants;
	}

	/**
	 * Set the 802.1x supplicant authentication provisioning and status information associated with an interface to be authenticated (e.g. an {{object|.Ethernet.Link}} instance).

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param supplicant the input value
	 * @return this instance
	 */
	public IEEE8021x withSupplicant(Supplicant supplicant) {
		getSupplicants().add(supplicant);
		return this;
	}

	//</editor-fold>

}