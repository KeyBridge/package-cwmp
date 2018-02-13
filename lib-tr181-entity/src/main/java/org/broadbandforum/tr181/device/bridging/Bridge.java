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
package org.broadbandforum.tr181.device.bridging;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.bridging.bridge.Port;
import org.broadbandforum.tr181.device.bridging.bridge.VLAN;
import org.broadbandforum.tr181.device.bridging.bridge.VLANPort;

	/**
	 * Bridge table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Bridging.Bridge.{i}.")
@XmlRootElement(name = "Bridge")
@XmlType(name = "Device.Bridging.Bridge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bridge {

	/**
	 * Enables or disables this {{object}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this {{object}}.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Selects the standard supported by this Bridge table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Standard")
	@CWMPParameter(access = "readWrite")
	public String standard;
	/**
	 * Bridge Port table, which MUST contain an entry for each bridge port (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        There are two types of bridge ports: management (upward facing) and non-management (downward facing). This is determined by configuring the Boolean {{param|ManagementPort}} parameter. The CPE will automatically configure each management bridge port to appear in the interface stack above all non-management bridge ports that share the same {{object|##.Bridge}} instance.
	 */
	@XmlElementWrapper(name = "Ports")
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	public Collection<Port> ports;
	/**
	 * Bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.
	 */
	@XmlElementWrapper(name = "VLANs")
	@XmlElement(name = "VLAN")
	@CWMPParameter(access = "readWrite")
	public Collection<VLAN> vlaNs;
	/**
	 * Bridge VLAN egress port and untagged port membership table.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "VLANPorts")
	@XmlElement(name = "VLANPort")
	@CWMPParameter(access = "readWrite")
	public Collection<VLANPort> vlaNPorts;

	public Bridge() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Bridge withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}}.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this {{object}}.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this {{object}}.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Bridge withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Bridge withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the selects the standard supported by this Bridge table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Set the selects the standard supported by this Bridge table entry.
	 *
	 * @since 2.0
	 * @param standard the input value
	 */
	public void  setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * Set the selects the standard supported by this Bridge table entry.
	 *
	 * @since 2.0
	 * @param standard the input value
	 * @return this instance
	 */
	public Bridge withStandard(String standard) {
		this.standard = standard;
		return this;
	}

	/**
	 * Get the bridge Port table, which MUST contain an entry for each bridge port (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        There are two types of bridge ports: management (upward facing) and non-management (downward facing). This is determined by configuring the Boolean {{param|ManagementPort}} parameter. The CPE will automatically configure each management bridge port to appear in the interface stack above all non-management bridge ports that share the same {{object|##.Bridge}} instance.
	 *
	 * @return the value
	 */
	public Collection<Port> getPorts() {
		if (this.ports == null){ this.ports=new ArrayList<>();}
		return ports;
	}

	/**
	 * Set the bridge Port table, which MUST contain an entry for each bridge port (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        There are two types of bridge ports: management (upward facing) and non-management (downward facing). This is determined by configuring the Boolean {{param|ManagementPort}} parameter. The CPE will automatically configure each management bridge port to appear in the interface stack above all non-management bridge ports that share the same {{object|##.Bridge}} instance.
	 *
	 * @param ports the input value
	 */
	public void  setPorts(Collection<Port> ports) {
		this.ports = ports;
	}

	/**
	 * Set the bridge Port table, which MUST contain an entry for each bridge port (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        There are two types of bridge ports: management (upward facing) and non-management (downward facing). This is determined by configuring the Boolean {{param|ManagementPort}} parameter. The CPE will automatically configure each management bridge port to appear in the interface stack above all non-management bridge ports that share the same {{object|##.Bridge}} instance.
	 *
	 * @param port the input value
	 * @return this instance
	 */
	public Bridge withPort(Port port) {
		getPorts().add(port);
		return this;
	}

	/**
	 * Get the bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.
	 *
	 * @return the value
	 */
	public Collection<VLAN> getVlaNs() {
		if (this.vlaNs == null){ this.vlaNs=new ArrayList<>();}
		return vlaNs;
	}

	/**
	 * Set the bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.
	 *
	 * @param vlaNs the input value
	 */
	public void  setVlaNs(Collection<VLAN> vlaNs) {
		this.vlaNs = vlaNs;
	}

	/**
	 * Set the bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.
	 *
	 * @param vlaN the input value
	 * @return this instance
	 */
	public Bridge withVLAN(VLAN vlaN) {
		getVlaNs().add(vlaN);
		return this;
	}

	/**
	 * Get the bridge VLAN egress port and untagged port membership table.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<VLANPort> getVlaNPorts() {
		if (this.vlaNPorts == null){ this.vlaNPorts=new ArrayList<>();}
		return vlaNPorts;
	}

	/**
	 * Set the bridge VLAN egress port and untagged port membership table.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param vlaNPorts the input value
	 */
	public void  setVlaNPorts(Collection<VLANPort> vlaNPorts) {
		this.vlaNPorts = vlaNPorts;
	}

	/**
	 * Set the bridge VLAN egress port and untagged port membership table.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param vlaNPort the input value
	 * @return this instance
	 */
	public Bridge withVLANPort(VLANPort vlaNPort) {
		getVlaNPorts().add(vlaNPort);
		return this;
	}

	//</editor-fold>

}