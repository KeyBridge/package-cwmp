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
import org.broadbandforum.tr181.device.dsl.BondingGroup;
import org.broadbandforum.tr181.device.dsl.Channel;
import org.broadbandforum.tr181.device.dsl.Diagnostics;
import org.broadbandforum.tr181.device.dsl.Line;

	/**
	 * This object models DSL lines, DSL channels, DSL bonding, and DSL diagnostics. The specific interface objects defined here are {{object|Line}}, {{object|Channel}}, and {{object|BondingGroup}}. Each {{object|Line}} models a layer 1 DSL Line interface, and each {{object|Channel}} models a layer 1 DSL Channel interface where multiple channels can run over a DSL line. In the case where bonding is configured, it is expected that {{object|BondingGroup}} is stacked above the {{object|Channel}} instances within its group.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DSL.")
@XmlRootElement(name = "Device.DSL")
@XmlType(name = "Device.DSL")
@XmlAccessorType(XmlAccessType.FIELD)
public class DSL {

	/**
	 * DSL Line table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models physical DSL lines.
	 */
	@XmlElementWrapper(name = "Lines")
	@XmlElement(name = "Line")
	public Collection<Line> lines;
	/**
	 * DSL Channel table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models DSL channel(s) on top of physical DSL lines.
	 */
	@XmlElementWrapper(name = "Channels")
	@XmlElement(name = "Channel")
	public Collection<Channel> channels;
	/**
	 * DSL bonding group table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each instance is a bonding group, and is expected to be stacked above a {{object|#.Channel}} instance for each bonded channel in the group.

        Many of the parameters within this object, including {{param|LowerLayers}}, are read-only because bonding is not expected to be configured via {{bibref|TR-069}}.

        The DSL bonding data model is closely aligned with {{bibref|TR-159}}. Corresponds to {{bibref|TR-159}} ''oBondingGroup''.
	 */
	@XmlElementWrapper(name = "BondingGroups")
	@XmlElement(name = "BondingGroup")
	public Collection<BondingGroup> bondingGroups;
	/**
	 * The DSL Diagnostics object.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;

	public DSL() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the dsl Line table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models physical DSL lines.
	 *
	 * @return the value
	 */
	public Collection<Line> getLines() {
		if (this.lines == null){ this.lines=new ArrayList<>();}
		return lines;
	}

	/**
	 * Set the dsl Line table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models physical DSL lines.
	 *
	 * @param lines the input value
	 */
	public void  setLines(Collection<Line> lines) {
		this.lines = lines;
	}

	/**
	 * Set the dsl Line table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models physical DSL lines.
	 *
	 * @param line the input value
	 * @return this instance
	 */
	public DSL withLine(Line line) {
		getLines().add(line);
		return this;
	}

	/**
	 * Get the dsl Channel table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models DSL channel(s) on top of physical DSL lines.
	 *
	 * @return the value
	 */
	public Collection<Channel> getChannels() {
		if (this.channels == null){ this.channels=new ArrayList<>();}
		return channels;
	}

	/**
	 * Set the dsl Channel table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models DSL channel(s) on top of physical DSL lines.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * Set the dsl Channel table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models DSL channel(s) on top of physical DSL lines.
	 *
	 * @param channel the input value
	 * @return this instance
	 */
	public DSL withChannel(Channel channel) {
		getChannels().add(channel);
		return this;
	}

	/**
	 * Get the dsl bonding group table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each instance is a bonding group, and is expected to be stacked above a {{object|#.Channel}} instance for each bonded channel in the group.

        Many of the parameters within this object, including {{param|LowerLayers}}, are read-only because bonding is not expected to be configured via {{bibref|TR-069}}.

        The DSL bonding data model is closely aligned with {{bibref|TR-159}}. Corresponds to {{bibref|TR-159}} ''oBondingGroup''.
	 *
	 * @return the value
	 */
	public Collection<BondingGroup> getBondingGroups() {
		if (this.bondingGroups == null){ this.bondingGroups=new ArrayList<>();}
		return bondingGroups;
	}

	/**
	 * Set the dsl bonding group table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each instance is a bonding group, and is expected to be stacked above a {{object|#.Channel}} instance for each bonded channel in the group.

        Many of the parameters within this object, including {{param|LowerLayers}}, are read-only because bonding is not expected to be configured via {{bibref|TR-069}}.

        The DSL bonding data model is closely aligned with {{bibref|TR-159}}. Corresponds to {{bibref|TR-159}} ''oBondingGroup''.
	 *
	 * @param bondingGroups the input value
	 */
	public void  setBondingGroups(Collection<BondingGroup> bondingGroups) {
		this.bondingGroups = bondingGroups;
	}

	/**
	 * Set the dsl bonding group table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each instance is a bonding group, and is expected to be stacked above a {{object|#.Channel}} instance for each bonded channel in the group.

        Many of the parameters within this object, including {{param|LowerLayers}}, are read-only because bonding is not expected to be configured via {{bibref|TR-069}}.

        The DSL bonding data model is closely aligned with {{bibref|TR-159}}. Corresponds to {{bibref|TR-159}} ''oBondingGroup''.
	 *
	 * @param bondingGroup the input value
	 * @return this instance
	 */
	public DSL withBondingGroup(BondingGroup bondingGroup) {
		getBondingGroups().add(bondingGroup);
		return this;
	}

	/**
	 * Get the DSL Diagnostics object.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the DSL Diagnostics object.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the DSL Diagnostics object.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public DSL withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

	//</editor-fold>

}