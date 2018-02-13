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
import org.broadbandforum.tr181.device.atm.Diagnostics;
import org.broadbandforum.tr181.device.atm.Link;

	/**
	 * Asynchronous Transfer Mode (ATM) object that contains the {{object|Link}} interface and {{object|Diagnostics.F5Loopback}} diagnostics.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.ATM.")
@XmlRootElement(name = "Device.ATM")
@XmlType(name = "Device.ATM")
@XmlAccessorType(XmlAccessType.FIELD)
public class ATM {

	/**
	 * ATM link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models an ATM PVC virtual circuit and the ATM Adaption Layer (AAL). An ATM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object. 

        When an ''ATM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with ATM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 */
	@XmlElementWrapper(name = "Links")
	@XmlElement(name = "Link")
	@CWMPParameter(access = "readWrite")
	public Collection<Link> links;
	/**
	 * The ATM Diagnostics object.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;

	public ATM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get atm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models an ATM PVC virtual circuit and the ATM Adaption Layer (AAL). An ATM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object. 

        When an ''ATM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with ATM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @return the value
	 */
	public Collection<Link> getLinks() {
		if (this.links == null){ this.links=new ArrayList<>();}
		return links;
	}

	/**
	 * Set atm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models an ATM PVC virtual circuit and the ATM Adaption Layer (AAL). An ATM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object. 

        When an ''ATM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with ATM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @param links the input value
	 */
	public void  setLinks(Collection<Link> links) {
		this.links = links;
	}

	/**
	 * Set atm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models an ATM PVC virtual circuit and the ATM Adaption Layer (AAL). An ATM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object. 

        When an ''ATM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with ATM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @param link the input value
	 * @return this instance
	 */
	public ATM withLink(Link link) {
		getLinks().add(link);
		return this;
	}

	/**
	 * Get the ATM Diagnostics object.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the ATM Diagnostics object.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the ATM Diagnostics object.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public ATM withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

	//</editor-fold>

}