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
package org.broadbandforum.tr098.internetgatewaydevice.layer2bridging;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.bridge.Port;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.bridge.VLAN;

	/**
	 * Bridge table.  Each entry in this table represents a single physical 802.1D {{bibref|802.1D-2004}} or 802.1Q {{bibref|802.1Q-2005}} bridge.

If the Bridge Port table is supported, it explicitly defines the Bridge's interfaces.  Otherwise, they are implicitly defined via the union of the FilterInterface / MarkingInterface parameters for all the Filter and Marking table entries that are associated with the Bridge.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Bridge.{i}.")
@XmlRootElement(name = "Bridge")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.Bridge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bridge {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Unique key for each Bridge table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BridgeKey")
	public Long bridgeKey;
	/**
	 * Selects the standard supported by this Bridge table entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "BridgeStandard")
	@CWMPParameter(access = "readWrite")
	public String bridgeStandard = "802.1D";
	/**
	 * Enables or disables this Bridge table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BridgeEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean bridgeEnable = false;
	/**
	 * The status of this Bridge table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BridgeStatus")
	public String bridgeStatus = "Disabled";
	/**
	 * Human-readable name for this Bridge table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BridgeName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String bridgeName;
	/**
	 * For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be 0.

For an 802.1Q {{bibref|802.1Q-2005}} Bridge, this is the Bridge's default VLAN ID, i.e. the VLAN ID that applies to Filter table entries with ''VLANIDFilter''=-1.  For an 802.1Q Bridge, the value of this parameter MUST NOT be 0.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4094)
	public Long vlaNID = 0L;
	/**
	 * Bridge Port table.  If this table is supported, it MUST contain an entry for each Bridge Port.
	 */
	@XmlElementWrapper(name = "Ports")
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	public Collection<Port> ports;
	/**
	 * Bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

This table only applies to an 802.1Q {{bibref|802.1Q-2005}} Bridge.
	 */
	@XmlElementWrapper(name = "VLANs")
	@XmlElement(name = "VLAN")
	@CWMPParameter(access = "readWrite")
	public Collection<VLAN> vlaNs;

	public Bridge() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public Bridge withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique key for each Bridge table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getBridgeKey() {
		return bridgeKey;
	}

	/**
	 * Set the unique key for each Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeKey the input value
	 */
	public void  setBridgeKey(Long bridgeKey) {
		this.bridgeKey = bridgeKey;
	}

	/**
	 * Set the unique key for each Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeKey the input value
	 * @return this instance
	 */
	public Bridge withBridgeKey(Long bridgeKey) {
		this.bridgeKey = bridgeKey;
		return this;
	}

	/**
	 * Get the selects the standard supported by this Bridge table entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getBridgeStandard() {
		return bridgeStandard;
	}

	/**
	 * Set the selects the standard supported by this Bridge table entry.
	 *
	 * @since 1.4
	 * @param bridgeStandard the input value
	 */
	public void  setBridgeStandard(String bridgeStandard) {
		this.bridgeStandard = bridgeStandard;
	}

	/**
	 * Set the selects the standard supported by this Bridge table entry.
	 *
	 * @since 1.4
	 * @param bridgeStandard the input value
	 * @return this instance
	 */
	public Bridge withBridgeStandard(String bridgeStandard) {
		this.bridgeStandard = bridgeStandard;
		return this;
	}

	/**
	 * Get the enables or disables this Bridge table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isBridgeEnable() {
		return bridgeEnable;
	}

	/**
	 * Set the enables or disables this Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeEnable the input value
	 */
	public void  setBridgeEnable(Boolean bridgeEnable) {
		this.bridgeEnable = bridgeEnable;
	}

	/**
	 * Set the enables or disables this Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeEnable the input value
	 * @return this instance
	 */
	public Bridge withBridgeEnable(Boolean bridgeEnable) {
		this.bridgeEnable = bridgeEnable;
		return this;
	}

	/**
	 * Get the status of this Bridge table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getBridgeStatus() {
		return bridgeStatus;
	}

	/**
	 * Set the status of this Bridge table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param bridgeStatus the input value
	 */
	public void  setBridgeStatus(String bridgeStatus) {
		this.bridgeStatus = bridgeStatus;
	}

	/**
	 * Set the status of this Bridge table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param bridgeStatus the input value
	 * @return this instance
	 */
	public Bridge withBridgeStatus(String bridgeStatus) {
		this.bridgeStatus = bridgeStatus;
		return this;
	}

	/**
	 * Get the human-readable name for this Bridge table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getBridgeName() {
		return bridgeName;
	}

	/**
	 * Set the human-readable name for this Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeName the input value
	 */
	public void  setBridgeName(String bridgeName) {
		this.bridgeName = bridgeName;
	}

	/**
	 * Set the human-readable name for this Bridge table entry.
	 *
	 * @since 1.1
	 * @param bridgeName the input value
	 * @return this instance
	 */
	public Bridge withBridgeName(String bridgeName) {
		this.bridgeName = bridgeName;
		return this;
	}

	/**
	 * Get the for an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be 0.

For an 802.1Q {{bibref|802.1Q-2005}} Bridge, this is the Bridge's default VLAN ID, i.e. the VLAN ID that applies to Filter table entries with ''VLANIDFilter''=-1.  For an 802.1Q Bridge, the value of this parameter MUST NOT be 0.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getVlaNID() {
		return vlaNID;
	}

	/**
	 * Set the for an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be 0.

For an 802.1Q {{bibref|802.1Q-2005}} Bridge, this is the Bridge's default VLAN ID, i.e. the VLAN ID that applies to Filter table entries with ''VLANIDFilter''=-1.  For an 802.1Q Bridge, the value of this parameter MUST NOT be 0.
	 *
	 * @since 1.1
	 * @param vlaNID the input value
	 */
	public void  setVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
	}

	/**
	 * Set the for an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be 0.

For an 802.1Q {{bibref|802.1Q-2005}} Bridge, this is the Bridge's default VLAN ID, i.e. the VLAN ID that applies to Filter table entries with ''VLANIDFilter''=-1.  For an 802.1Q Bridge, the value of this parameter MUST NOT be 0.
	 *
	 * @since 1.1
	 * @param vlaNID the input value
	 * @return this instance
	 */
	public Bridge withVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
		return this;
	}

	/**
	 * Get the bridge Port table.  If this table is supported, it MUST contain an entry for each Bridge Port.
	 *
	 * @return the value
	 */
	public Collection<Port> getPorts() {
		if (this.ports == null){ this.ports=new ArrayList<>();}
		return ports;
	}

	/**
	 * Set the bridge Port table.  If this table is supported, it MUST contain an entry for each Bridge Port.
	 *
	 * @param ports the input value
	 */
	public void  setPorts(Collection<Port> ports) {
		this.ports = ports;
	}

	/**
	 * Set the bridge Port table.  If this table is supported, it MUST contain an entry for each Bridge Port.
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

This table only applies to an 802.1Q {{bibref|802.1Q-2005}} Bridge.
	 *
	 * @return the value
	 */
	public Collection<VLAN> getVlaNs() {
		if (this.vlaNs == null){ this.vlaNs=new ArrayList<>();}
		return vlaNs;
	}

	/**
	 * Set the bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

This table only applies to an 802.1Q {{bibref|802.1Q-2005}} Bridge.
	 *
	 * @param vlaNs the input value
	 */
	public void  setVlaNs(Collection<VLAN> vlaNs) {
		this.vlaNs = vlaNs;
	}

	/**
	 * Set the bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

This table only applies to an 802.1Q {{bibref|802.1Q-2005}} Bridge.
	 *
	 * @param vlaN the input value
	 * @return this instance
	 */
	public Bridge withVLAN(VLAN vlaN) {
		getVlaNs().add(vlaN);
		return this;
	}

	//</editor-fold>

}