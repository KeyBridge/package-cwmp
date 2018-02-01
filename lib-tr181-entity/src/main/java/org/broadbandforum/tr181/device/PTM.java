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
import org.broadbandforum.tr181.device.ptm.Link;

	/**
	 * Packet Transfer Mode ({{bibref|G.993.1|Annex H}}). This object contains the {{object|Link}} interface.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.PTM.")
public class PTM {

	/**
	 * PTM link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models a layer 2 variable-sized packet interface. A PTM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object.

        When a ''PTM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with PTM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 */
	@XmlElementWrapper(name = "Links")
	@XmlElement(name = "Link")
	@CWMPParameter(access = "readWrite")
	public Collection<Link> links;

	public PTM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ptm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models a layer 2 variable-sized packet interface. A PTM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object.

        When a ''PTM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with PTM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @return the value
	 */
	public Collection<Link> getLinks() {
		if (this.links == null){ this.links=new ArrayList<>();}
		return links;
	}

	/**
	 * Set the ptm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models a layer 2 variable-sized packet interface. A PTM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object.

        When a ''PTM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with PTM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @param links the input value
	 */
	public void  setLinks(Collection<Link> links) {
		this.links = links;
	}

	/**
	 * Set the ptm link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models a layer 2 variable-sized packet interface. A PTM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object.

        When a ''PTM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with PTM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @param link the input value
	 * @return this instance
	 */
	public PTM withLink(Link link) {
		getLinks().add(link);
		return this;
	}

	//</editor-fold>

}