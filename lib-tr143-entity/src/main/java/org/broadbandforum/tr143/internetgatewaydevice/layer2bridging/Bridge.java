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
package org.broadbandforum.tr143.internetgatewaydevice.layer2bridging;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Bridge table.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Bridge.{i}.")
@XmlRootElement(name = "Bridge")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.Bridge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bridge {

	/**
	 * Unique key for each Bridge table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BridgeKey")
	public Long bridgeKey;
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
	 * The 802.1Q VLAN ID associated with this Bridge.

A value of 0 indicates either Untagged or PriorityOnly tagging, which are treated identically.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4094)
	public Long vlaNID = 0L;

	public Bridge() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	 * Get the 802.1Q VLAN ID associated with this Bridge.

A value of 0 indicates either Untagged or PriorityOnly tagging, which are treated identically.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getVlaNID() {
		return vlaNID;
	}

	/**
	 * Set the 802.1Q VLAN ID associated with this Bridge.

A value of 0 indicates either Untagged or PriorityOnly tagging, which are treated identically.
	 *
	 * @since 1.1
	 * @param vlaNID the input value
	 */
	public void  setVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
	}

	/**
	 * Set the 802.1Q VLAN ID associated with this Bridge.

A value of 0 indicates either Untagged or PriorityOnly tagging, which are treated identically.
	 *
	 * @since 1.1
	 * @param vlaNID the input value
	 * @return this instance
	 */
	public Bridge withVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
		return this;
	}

	//</editor-fold>

}