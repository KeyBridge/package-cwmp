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
import org.broadbandforum.tr181.device.gre.Filter;
import org.broadbandforum.tr181.device.gre.Tunnel;

	/**
	 * This object contains parameters associated with the Generic Routing Encapsulation (GRE) Tunnel ({{bibref|RFC2784}}) with Key and Sequence Number extensions ({{bibref|RFC2890}}). This object also provides a means to treat packets that are encapsulated within a GRE Tunnel by using a set of {{object|Filter}} objects to determine the treatment of the packet.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.GRE.")
@XmlRootElement(name = "Device.GRE")
@XmlType(name = "Device.GRE")
@XmlAccessorType(XmlAccessType.FIELD)
public class GRE {

	/**
	 * GRE Tunnel table, models the GRE Tunnel instance and represents the entry point and exit point of the tunnel in relation to the WAN interface. A {{object}} object has one or more {{object|Interface}} objects that further define the sessions or flows within the tunnel.
	 */
	@XmlElementWrapper(name = "Tunnels")
	@XmlElement(name = "Tunnel")
	@CWMPParameter(access = "readWrite")
	public Collection<Tunnel> tunnels;
	/**
	 * GRE Filter table. Entries in this table are applied against the packets that are to be encapsulated within the GRE Tunnel based on the following conditions:

        * If the value of the {{param|AllInterfaces}} is {{true}}, then this entry will be applied to all {{object|#.Tunnel}} and {{object|#.Tunnel.{i}.Interface}} instances.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel}} table then this entry is applied to all {{object|#.Tunnel.{i}.Interface}} instances of the {{object|#.Tunnel}} reference.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel.{i}.Interface}} table then this entry is applied to the {{object|#.Tunnel.{i}.Interface}} reference.

        * If no entries are matched for the packet, then the default treatment (e.g., {{param|#.Tunnel.{i}.DefaultDSCPMark}}) is applied to the packet.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;

	public GRE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the gre Tunnel table, models the GRE Tunnel instance and represents the entry point and exit point of the tunnel in relation to the WAN interface. A {{object}} object has one or more {{object|Interface}} objects that further define the sessions or flows within the tunnel.
	 *
	 * @return the value
	 */
	public Collection<Tunnel> getTunnels() {
		if (this.tunnels == null){ this.tunnels=new ArrayList<>();}
		return tunnels;
	}

	/**
	 * Set the gre Tunnel table, models the GRE Tunnel instance and represents the entry point and exit point of the tunnel in relation to the WAN interface. A {{object}} object has one or more {{object|Interface}} objects that further define the sessions or flows within the tunnel.
	 *
	 * @param tunnels the input value
	 */
	public void  setTunnels(Collection<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}

	/**
	 * Set the gre Tunnel table, models the GRE Tunnel instance and represents the entry point and exit point of the tunnel in relation to the WAN interface. A {{object}} object has one or more {{object|Interface}} objects that further define the sessions or flows within the tunnel.
	 *
	 * @param tunnel the input value
	 * @return this instance
	 */
	public GRE withTunnel(Tunnel tunnel) {
		getTunnels().add(tunnel);
		return this;
	}

	/**
	 * Get the gre Filter table. Entries in this table are applied against the packets that are to be encapsulated within the GRE Tunnel based on the following conditions:

        * If the value of the {{param|AllInterfaces}} is {{true}}, then this entry will be applied to all {{object|#.Tunnel}} and {{object|#.Tunnel.{i}.Interface}} instances.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel}} table then this entry is applied to all {{object|#.Tunnel.{i}.Interface}} instances of the {{object|#.Tunnel}} reference.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel.{i}.Interface}} table then this entry is applied to the {{object|#.Tunnel.{i}.Interface}} reference.

        * If no entries are matched for the packet, then the default treatment (e.g., {{param|#.Tunnel.{i}.DefaultDSCPMark}}) is applied to the packet.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the gre Filter table. Entries in this table are applied against the packets that are to be encapsulated within the GRE Tunnel based on the following conditions:

        * If the value of the {{param|AllInterfaces}} is {{true}}, then this entry will be applied to all {{object|#.Tunnel}} and {{object|#.Tunnel.{i}.Interface}} instances.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel}} table then this entry is applied to all {{object|#.Tunnel.{i}.Interface}} instances of the {{object|#.Tunnel}} reference.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel.{i}.Interface}} table then this entry is applied to the {{object|#.Tunnel.{i}.Interface}} reference.

        * If no entries are matched for the packet, then the default treatment (e.g., {{param|#.Tunnel.{i}.DefaultDSCPMark}}) is applied to the packet.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the gre Filter table. Entries in this table are applied against the packets that are to be encapsulated within the GRE Tunnel based on the following conditions:

        * If the value of the {{param|AllInterfaces}} is {{true}}, then this entry will be applied to all {{object|#.Tunnel}} and {{object|#.Tunnel.{i}.Interface}} instances.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel}} table then this entry is applied to all {{object|#.Tunnel.{i}.Interface}} instances of the {{object|#.Tunnel}} reference.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel.{i}.Interface}} table then this entry is applied to the {{object|#.Tunnel.{i}.Interface}} reference.

        * If no entries are matched for the packet, then the default treatment (e.g., {{param|#.Tunnel.{i}.DefaultDSCPMark}}) is applied to the packet.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public GRE withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	//</editor-fold>

}