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
import org.broadbandforum.tr181.device.ethernet.Interface;
import org.broadbandforum.tr181.device.ethernet.Link;
import org.broadbandforum.tr181.device.ethernet.RMONStats;
import org.broadbandforum.tr181.device.ethernet.VLANTermination;

	/**
	 * Ethernet object. This object models several Ethernet interface objects, each representing a different stack layer, including: {{object|Interface}}, {{object|Link}}, and {{object|VLANTermination}}. {{object|Interface}} is media-specific and models a port, the PHY layer, and the MAC layer. {{object|Link}} is media-independent and models the Logical Link Control (LLC) layer. An "outer" {{object|VLANTermination}}, when present, is expected to be stacked on top of {{object|Link}} objects to receive and send frames with a configured VLANID.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Ethernet.")
@XmlRootElement(name = "Ethernet")
@XmlType(name = "Device.Ethernet")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ethernet {

	/**
	 * Ethernet statistics based on the {{bibref|RFC2819}} ''RMON-MIB'' ''etherStatsTable'', with some extensions inspired by {{bibref|G.988|Section 9.3.32}}.

        Each instance is associated with an interface capable of transporting Ethernet-encapsulated packets, and contains a set of unidirectional Ethernet statistics.

        The statistics are sampled either on ingress or on egress.  This is determined as follows:

        * If the instance is associated with an egress queue (or queues) via the {{param|Queue}} parameter or by setting {{param|AllQueues}} to {{true}} then data is sampled on egress.  In this case {{param|Bytes}} etc measure the data that has been sent on the interface, possibly filtered by {{param|Queue}} or {{param|VLANID}}.

        * Otherwise data is sampled on ingress.  In this case {{param|Bytes}} etc measure the data that has been received on the interface, possibly filtered by {{param|VLANID}}.

        When sampling on egress, the term ''received'' means ''received by the queuing sub-system''.

        Multiple instances can be associated with a single interface: individual instances can be configured to collect data associated with the entire interface, or with a particular VLAN and/or queue.

        The CPE MUST reset each instances's Stats parameters whenever the instance is disabled and re-enabled.  Whether this reset occurs when the instance becomes operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) or administratively enabled ({{param|Enable}} = {{true}}) is a local matter to the CPE.  This is similar to the behavior of interface statistics, e.g. as specified for {{object|Device.Ethernet.Interface.{i}.Stats}}.  Furthermore, this instance's Stats parameters MUST be reset whenever the referenced interface's Stats parameters are reset, or when the referenced queue or VLAN is disabled and re-enabled.

        For enabled table entries, if {{param|Interface}} references an interface that is not capable of transporting Ethernet-encapsulated packets, or if {{param|Queue}} references a queue that is not instantiated on {{param|Interface}}, or if {{param|Queue}} is not a valid reference and {{param|AllQueues}} is {{false}}, the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "RMONStatss")
	@XmlElement(name = "RMONStats")
	@CWMPParameter(access = "readWrite")
	public Collection<RMONStats> rmoNStatss;
	/**
	 * Ethernet interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models physical Ethernet ports, but in terms of the interface stack it also models the PHY and MAC level Ethernet interface.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * Ethernet link layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Table entries model the Logical Link Control (LLC) layer. It is expected that an ''Ethernet Link'' interface can be stacked above any lower-layer interface object capable of carrying Ethernet frames.
	 */
	@XmlElementWrapper(name = "Links")
	@XmlElement(name = "Link")
	@CWMPParameter(access = "readWrite")
	public Collection<Link> links;
	/**
	 * VLAN Termination table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). A VLAN Termination entry is typically stacked on top of a {{object|#.Link}} object to receive and send frames with the configured {{param|VLANID}}.
	 */
	@XmlElementWrapper(name = "VLANTerminations")
	@XmlElement(name = "VLANTermination")
	@CWMPParameter(access = "readWrite")
	public Collection<VLANTermination> vlaNTerminations;

	public Ethernet() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ethernet statistics based on the {{bibref|RFC2819}} ''RMON-MIB'' ''etherStatsTable'', with some extensions inspired by {{bibref|G.988|Section 9.3.32}}.

        Each instance is associated with an interface capable of transporting Ethernet-encapsulated packets, and contains a set of unidirectional Ethernet statistics.

        The statistics are sampled either on ingress or on egress.  This is determined as follows:

        * If the instance is associated with an egress queue (or queues) via the {{param|Queue}} parameter or by setting {{param|AllQueues}} to {{true}} then data is sampled on egress.  In this case {{param|Bytes}} etc measure the data that has been sent on the interface, possibly filtered by {{param|Queue}} or {{param|VLANID}}.

        * Otherwise data is sampled on ingress.  In this case {{param|Bytes}} etc measure the data that has been received on the interface, possibly filtered by {{param|VLANID}}.

        When sampling on egress, the term ''received'' means ''received by the queuing sub-system''.

        Multiple instances can be associated with a single interface: individual instances can be configured to collect data associated with the entire interface, or with a particular VLAN and/or queue.

        The CPE MUST reset each instances's Stats parameters whenever the instance is disabled and re-enabled.  Whether this reset occurs when the instance becomes operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) or administratively enabled ({{param|Enable}} = {{true}}) is a local matter to the CPE.  This is similar to the behavior of interface statistics, e.g. as specified for {{object|Device.Ethernet.Interface.{i}.Stats}}.  Furthermore, this instance's Stats parameters MUST be reset whenever the referenced interface's Stats parameters are reset, or when the referenced queue or VLAN is disabled and re-enabled.

        For enabled table entries, if {{param|Interface}} references an interface that is not capable of transporting Ethernet-encapsulated packets, or if {{param|Queue}} references a queue that is not instantiated on {{param|Interface}}, or if {{param|Queue}} is not a valid reference and {{param|AllQueues}} is {{false}}, the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<RMONStats> getRmoNStatss() {
		if (this.rmoNStatss == null){ this.rmoNStatss=new ArrayList<>();}
		return rmoNStatss;
	}

	/**
	 * Set the ethernet statistics based on the {{bibref|RFC2819}} ''RMON-MIB'' ''etherStatsTable'', with some extensions inspired by {{bibref|G.988|Section 9.3.32}}.

        Each instance is associated with an interface capable of transporting Ethernet-encapsulated packets, and contains a set of unidirectional Ethernet statistics.

        The statistics are sampled either on ingress or on egress.  This is determined as follows:

        * If the instance is associated with an egress queue (or queues) via the {{param|Queue}} parameter or by setting {{param|AllQueues}} to {{true}} then data is sampled on egress.  In this case {{param|Bytes}} etc measure the data that has been sent on the interface, possibly filtered by {{param|Queue}} or {{param|VLANID}}.

        * Otherwise data is sampled on ingress.  In this case {{param|Bytes}} etc measure the data that has been received on the interface, possibly filtered by {{param|VLANID}}.

        When sampling on egress, the term ''received'' means ''received by the queuing sub-system''.

        Multiple instances can be associated with a single interface: individual instances can be configured to collect data associated with the entire interface, or with a particular VLAN and/or queue.

        The CPE MUST reset each instances's Stats parameters whenever the instance is disabled and re-enabled.  Whether this reset occurs when the instance becomes operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) or administratively enabled ({{param|Enable}} = {{true}}) is a local matter to the CPE.  This is similar to the behavior of interface statistics, e.g. as specified for {{object|Device.Ethernet.Interface.{i}.Stats}}.  Furthermore, this instance's Stats parameters MUST be reset whenever the referenced interface's Stats parameters are reset, or when the referenced queue or VLAN is disabled and re-enabled.

        For enabled table entries, if {{param|Interface}} references an interface that is not capable of transporting Ethernet-encapsulated packets, or if {{param|Queue}} references a queue that is not instantiated on {{param|Interface}}, or if {{param|Queue}} is not a valid reference and {{param|AllQueues}} is {{false}}, the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param rmoNStatss the input value
	 */
	public void  setRmoNStatss(Collection<RMONStats> rmoNStatss) {
		this.rmoNStatss = rmoNStatss;
	}

	/**
	 * Set the ethernet statistics based on the {{bibref|RFC2819}} ''RMON-MIB'' ''etherStatsTable'', with some extensions inspired by {{bibref|G.988|Section 9.3.32}}.

        Each instance is associated with an interface capable of transporting Ethernet-encapsulated packets, and contains a set of unidirectional Ethernet statistics.

        The statistics are sampled either on ingress or on egress.  This is determined as follows:

        * If the instance is associated with an egress queue (or queues) via the {{param|Queue}} parameter or by setting {{param|AllQueues}} to {{true}} then data is sampled on egress.  In this case {{param|Bytes}} etc measure the data that has been sent on the interface, possibly filtered by {{param|Queue}} or {{param|VLANID}}.

        * Otherwise data is sampled on ingress.  In this case {{param|Bytes}} etc measure the data that has been received on the interface, possibly filtered by {{param|VLANID}}.

        When sampling on egress, the term ''received'' means ''received by the queuing sub-system''.

        Multiple instances can be associated with a single interface: individual instances can be configured to collect data associated with the entire interface, or with a particular VLAN and/or queue.

        The CPE MUST reset each instances's Stats parameters whenever the instance is disabled and re-enabled.  Whether this reset occurs when the instance becomes operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) or administratively enabled ({{param|Enable}} = {{true}}) is a local matter to the CPE.  This is similar to the behavior of interface statistics, e.g. as specified for {{object|Device.Ethernet.Interface.{i}.Stats}}.  Furthermore, this instance's Stats parameters MUST be reset whenever the referenced interface's Stats parameters are reset, or when the referenced queue or VLAN is disabled and re-enabled.

        For enabled table entries, if {{param|Interface}} references an interface that is not capable of transporting Ethernet-encapsulated packets, or if {{param|Queue}} references a queue that is not instantiated on {{param|Interface}}, or if {{param|Queue}} is not a valid reference and {{param|AllQueues}} is {{false}}, the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param rmoNStats the input value
	 * @return this instance
	 */
	public Ethernet withRMONStats(RMONStats rmoNStats) {
		getRmoNStatss().add(rmoNStats);
		return this;
	}

	/**
	 * Get the ethernet interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models physical Ethernet ports, but in terms of the interface stack it also models the PHY and MAC level Ethernet interface.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the ethernet interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models physical Ethernet ports, but in terms of the interface stack it also models the PHY and MAC level Ethernet interface.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the ethernet interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models physical Ethernet ports, but in terms of the interface stack it also models the PHY and MAC level Ethernet interface.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Ethernet withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the ethernet link layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Table entries model the Logical Link Control (LLC) layer. It is expected that an ''Ethernet Link'' interface can be stacked above any lower-layer interface object capable of carrying Ethernet frames.
	 *
	 * @return the value
	 */
	public Collection<Link> getLinks() {
		if (this.links == null){ this.links=new ArrayList<>();}
		return links;
	}

	/**
	 * Set the ethernet link layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Table entries model the Logical Link Control (LLC) layer. It is expected that an ''Ethernet Link'' interface can be stacked above any lower-layer interface object capable of carrying Ethernet frames.
	 *
	 * @param links the input value
	 */
	public void  setLinks(Collection<Link> links) {
		this.links = links;
	}

	/**
	 * Set the ethernet link layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Table entries model the Logical Link Control (LLC) layer. It is expected that an ''Ethernet Link'' interface can be stacked above any lower-layer interface object capable of carrying Ethernet frames.
	 *
	 * @param link the input value
	 * @return this instance
	 */
	public Ethernet withLink(Link link) {
		getLinks().add(link);
		return this;
	}

	/**
	 * Get the vlaN Termination table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). A VLAN Termination entry is typically stacked on top of a {{object|#.Link}} object to receive and send frames with the configured {{param|VLANID}}.
	 *
	 * @return the value
	 */
	public Collection<VLANTermination> getVlaNTerminations() {
		if (this.vlaNTerminations == null){ this.vlaNTerminations=new ArrayList<>();}
		return vlaNTerminations;
	}

	/**
	 * Set the vlaN Termination table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). A VLAN Termination entry is typically stacked on top of a {{object|#.Link}} object to receive and send frames with the configured {{param|VLANID}}.
	 *
	 * @param vlaNTerminations the input value
	 */
	public void  setVlaNTerminations(Collection<VLANTermination> vlaNTerminations) {
		this.vlaNTerminations = vlaNTerminations;
	}

	/**
	 * Set the vlaN Termination table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). A VLAN Termination entry is typically stacked on top of a {{object|#.Link}} object to receive and send frames with the configured {{param|VLANID}}.
	 *
	 * @param vlaNTermination the input value
	 * @return this instance
	 */
	public Ethernet withVLANTermination(VLANTermination vlaNTermination) {
		getVlaNTerminations().add(vlaNTermination);
		return this;
	}

	//</editor-fold>

}