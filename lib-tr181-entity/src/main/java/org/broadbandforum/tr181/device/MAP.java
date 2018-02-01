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
import org.broadbandforum.tr181.device.map.Domain;

	/**
	 * The Mapping of Address and Port (MAP) object {{bibref|RFC7597}} {{bibref|RFC7599}} {{bibref|RFC7598}}. This object applies only to gateway devices that support IPv4 on the LAN side, include a {{object|#.NAT}}, and typically have only IPv6 connectivity on the WAN side.

        See the MAP Theory of Operation {{bibref|TR-181i2a8|Appendix XV}} for a description of the working of this MAP data model.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.MAP.")
public class MAP {

	/**
	 * Enables or disables MAP.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * MAP domain settings {{bibref|RFC7597}} {{bibref|RFC7599}}.  Each instance models a MAP domain.

        MAP supports two transport modes, both of which use NAPT44 (modified to use a restricted port range):

        * MAP-E ({{param|TransportMode}} = {{enum|Encapsulation|TransportMode}}) uses an IPv4-in-IPv6 tunnel.

        * MAP-T ({{param|TransportMode}} = {{enum|Translation|TransportMode}}) uses stateless NAT64.

        Note: There is an n:1 relationship between a MAP domain and the associated {{param|WANInterface}}, i.e. in theory multiple MAP domains can be associated with a single WAN IP interface (each domain would have its own ''End-user IPv6 prefix'' and ''MAP IPv6 address'').

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "domains")
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	public Collection<Domain> domains;

	public MAP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables MAP.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables MAP.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables MAP.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public MAP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the map domain settings {{bibref|RFC7597}} {{bibref|RFC7599}}.  Each instance models a MAP domain.

        MAP supports two transport modes, both of which use NAPT44 (modified to use a restricted port range):

        * MAP-E ({{param|TransportMode}} = {{enum|Encapsulation|TransportMode}}) uses an IPv4-in-IPv6 tunnel.

        * MAP-T ({{param|TransportMode}} = {{enum|Translation|TransportMode}}) uses stateless NAT64.

        Note: There is an n:1 relationship between a MAP domain and the associated {{param|WANInterface}}, i.e. in theory multiple MAP domains can be associated with a single WAN IP interface (each domain would have its own ''End-user IPv6 prefix'' and ''MAP IPv6 address'').

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<Domain> getDomains() {
		if (this.domains == null){ this.domains=new ArrayList<>();}
		return domains;
	}

	/**
	 * Set the map domain settings {{bibref|RFC7597}} {{bibref|RFC7599}}.  Each instance models a MAP domain.

        MAP supports two transport modes, both of which use NAPT44 (modified to use a restricted port range):

        * MAP-E ({{param|TransportMode}} = {{enum|Encapsulation|TransportMode}}) uses an IPv4-in-IPv6 tunnel.

        * MAP-T ({{param|TransportMode}} = {{enum|Translation|TransportMode}}) uses stateless NAT64.

        Note: There is an n:1 relationship between a MAP domain and the associated {{param|WANInterface}}, i.e. in theory multiple MAP domains can be associated with a single WAN IP interface (each domain would have its own ''End-user IPv6 prefix'' and ''MAP IPv6 address'').

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param domains the input value
	 */
	public void  setDomains(Collection<Domain> domains) {
		this.domains = domains;
	}

	/**
	 * Set the map domain settings {{bibref|RFC7597}} {{bibref|RFC7599}}.  Each instance models a MAP domain.

        MAP supports two transport modes, both of which use NAPT44 (modified to use a restricted port range):

        * MAP-E ({{param|TransportMode}} = {{enum|Encapsulation|TransportMode}}) uses an IPv4-in-IPv6 tunnel.

        * MAP-T ({{param|TransportMode}} = {{enum|Translation|TransportMode}}) uses stateless NAT64.

        Note: There is an n:1 relationship between a MAP domain and the associated {{param|WANInterface}}, i.e. in theory multiple MAP domains can be associated with a single WAN IP interface (each domain would have its own ''End-user IPv6 prefix'' and ''MAP IPv6 address'').

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param domain the input value
	 * @return this instance
	 */
	public MAP withDomain(Domain domain) {
		getDomains().add(domain);
		return this;
	}

	//</editor-fold>

}