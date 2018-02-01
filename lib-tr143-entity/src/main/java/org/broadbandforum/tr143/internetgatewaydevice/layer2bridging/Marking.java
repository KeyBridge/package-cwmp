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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Marking table identifying non-default layer-2 marking behavior for packets on egress from the specified interfaces.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Marking.{i}.")
public class Marking {

	/**
	 * Unique key for each Marking table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MarkingKey")
	public Long markingKey;
	/**
	 * Enables or disables this Marking table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MarkingEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean markingEnable = false;
	/**
	 * The status of this Marking table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MarkingStatus")
	public String markingStatus = "Disabled";
	/**
	 * The ''BridgeKey'' value of the Bridge table entry associated with this Marking table entry.  A value of -1 indicates the Marking table entry is not associated with a Bridge (and has no effect).

The effect of a Marking table entry applies only to packets that have been admitted to the specified bridge (regardless of the ingress interface).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MarkingBridgeReference")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer markingBridgeReference = -1;
	/**
	 * The interface or interfaces associated with this Marking table entry for which the specified marking behavior is to apply on egress from the associated bridge.  The following values are defined.

To associate this Marking table entry with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Marking table entry is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').

* ''LANInterfaces'' indicates that this Marking table entry is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').

* ''WANInterfaces'' indicates that this Marking table entry is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').

* {{empty}} indicates the Marking table entry table entry is not associated with any interface (and has no effect)

If there is more than one enabled Marking table entry that specifies one or more of the same interfaces for the same bridge (identical values of {{param|MarkingBridgeReference}}), then for packets on egress from the specified bridge to those interfaces, the applied marking MUST be that specified in the Marking table entry among those in conflict with the lowest {{param|MarkingKey}} value.

If an interface in a given bridge does not have a corresponding Marking table entry, the marking is left unchanged on egress.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MarkingInterface")
	@CWMPParameter(access = "readWrite")
	public String markingInterface;
	/**
	 * If {{true}}, on egress to the interfaces associated with this Marking table entry, all packets are Untagged.  That is, the VLAN tag is stripped from the packet.

If {{false}}, on egress to the interfaces associated with this Marking table entry, all VLAN tags are left intact (including those added on ingress).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANIDUntag")
	@CWMPParameter(access = "readWrite")
	public Boolean vlaNIDUntag = false;
	/**
	 * The 802.1Q VLAN ID to be used on egress to the interfaces associated with this Marking table entry (if {{param|VLANIDUntag}} is {{false}}).

A value of -1 indicates that the default VLAN ID for the Bridge SHOULD be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Marking table entry).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 4095)
	public Integer vlaNIDMark = -1;
	/**
	 * Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this Bridge on egress to the interfaces associated with this Marking table entry. A value of -1 indicates no change from the incoming packet or the mark assigned by the classifier.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 7)
	public Integer ethernetPriorityMark = -1;
	/**
	 * If {{false}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is applied only to packets of priority 0.

If {{true}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is to be applied to all packets on this Bridge.

If {{param|VLANIDUntag}} is {{true}}, then no priority marking is done since the tag containing the Ethernet priority is removed.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthernetPriorityOverride")
	@CWMPParameter(access = "readWrite")
	public Boolean ethernetPriorityOverride = false;

	public Marking() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each Marking table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMarkingKey() {
		return markingKey;
	}

	/**
	 * Set the unique key for each Marking table entry.
	 *
	 * @since 1.1
	 * @param markingKey the input value
	 */
	public void  setMarkingKey(Long markingKey) {
		this.markingKey = markingKey;
	}

	/**
	 * Set the unique key for each Marking table entry.
	 *
	 * @since 1.1
	 * @param markingKey the input value
	 * @return this instance
	 */
	public Marking withMarkingKey(Long markingKey) {
		this.markingKey = markingKey;
		return this;
	}

	/**
	 * Get the enables or disables this Marking table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isMarkingEnable() {
		return markingEnable;
	}

	/**
	 * Set the enables or disables this Marking table entry.
	 *
	 * @since 1.1
	 * @param markingEnable the input value
	 */
	public void  setMarkingEnable(Boolean markingEnable) {
		this.markingEnable = markingEnable;
	}

	/**
	 * Set the enables or disables this Marking table entry.
	 *
	 * @since 1.1
	 * @param markingEnable the input value
	 * @return this instance
	 */
	public Marking withMarkingEnable(Boolean markingEnable) {
		this.markingEnable = markingEnable;
		return this;
	}

	/**
	 * Get the status of this Marking table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getMarkingStatus() {
		return markingStatus;
	}

	/**
	 * Set the status of this Marking table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param markingStatus the input value
	 */
	public void  setMarkingStatus(String markingStatus) {
		this.markingStatus = markingStatus;
	}

	/**
	 * Set the status of this Marking table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param markingStatus the input value
	 * @return this instance
	 */
	public Marking withMarkingStatus(String markingStatus) {
		this.markingStatus = markingStatus;
		return this;
	}

	/**
	 * Get the ''BridgeKey'' value of the Bridge table entry associated with this Marking table entry.  A value of -1 indicates the Marking table entry is not associated with a Bridge (and has no effect).

The effect of a Marking table entry applies only to packets that have been admitted to the specified bridge (regardless of the ingress interface).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getMarkingBridgeReference() {
		return markingBridgeReference;
	}

	/**
	 * Set the ''BridgeKey'' value of the Bridge table entry associated with this Marking table entry.  A value of -1 indicates the Marking table entry is not associated with a Bridge (and has no effect).

The effect of a Marking table entry applies only to packets that have been admitted to the specified bridge (regardless of the ingress interface).
	 *
	 * @since 1.1
	 * @param markingBridgeReference the input value
	 */
	public void  setMarkingBridgeReference(Integer markingBridgeReference) {
		this.markingBridgeReference = markingBridgeReference;
	}

	/**
	 * Set the ''BridgeKey'' value of the Bridge table entry associated with this Marking table entry.  A value of -1 indicates the Marking table entry is not associated with a Bridge (and has no effect).

The effect of a Marking table entry applies only to packets that have been admitted to the specified bridge (regardless of the ingress interface).
	 *
	 * @since 1.1
	 * @param markingBridgeReference the input value
	 * @return this instance
	 */
	public Marking withMarkingBridgeReference(Integer markingBridgeReference) {
		this.markingBridgeReference = markingBridgeReference;
		return this;
	}

	/**
	 * Get the interface or interfaces associated with this Marking table entry for which the specified marking behavior is to apply on egress from the associated bridge.  The following values are defined.

To associate this Marking table entry with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Marking table entry is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').

* ''LANInterfaces'' indicates that this Marking table entry is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').

* ''WANInterfaces'' indicates that this Marking table entry is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').

* {{empty}} indicates the Marking table entry table entry is not associated with any interface (and has no effect)

If there is more than one enabled Marking table entry that specifies one or more of the same interfaces for the same bridge (identical values of {{param|MarkingBridgeReference}}), then for packets on egress from the specified bridge to those interfaces, the applied marking MUST be that specified in the Marking table entry among those in conflict with the lowest {{param|MarkingKey}} value.

If an interface in a given bridge does not have a corresponding Marking table entry, the marking is left unchanged on egress.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getMarkingInterface() {
		return markingInterface;
	}

	/**
	 * Set the interface or interfaces associated with this Marking table entry for which the specified marking behavior is to apply on egress from the associated bridge.  The following values are defined.

To associate this Marking table entry with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Marking table entry is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').

* ''LANInterfaces'' indicates that this Marking table entry is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').

* ''WANInterfaces'' indicates that this Marking table entry is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').

* {{empty}} indicates the Marking table entry table entry is not associated with any interface (and has no effect)

If there is more than one enabled Marking table entry that specifies one or more of the same interfaces for the same bridge (identical values of {{param|MarkingBridgeReference}}), then for packets on egress from the specified bridge to those interfaces, the applied marking MUST be that specified in the Marking table entry among those in conflict with the lowest {{param|MarkingKey}} value.

If an interface in a given bridge does not have a corresponding Marking table entry, the marking is left unchanged on egress.
	 *
	 * @since 1.1
	 * @param markingInterface the input value
	 */
	public void  setMarkingInterface(String markingInterface) {
		this.markingInterface = markingInterface;
	}

	/**
	 * Set the interface or interfaces associated with this Marking table entry for which the specified marking behavior is to apply on egress from the associated bridge.  The following values are defined.

To associate this Marking table entry with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Marking table entry is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').

* ''LANInterfaces'' indicates that this Marking table entry is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').

* ''WANInterfaces'' indicates that this Marking table entry is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').

* {{empty}} indicates the Marking table entry table entry is not associated with any interface (and has no effect)

If there is more than one enabled Marking table entry that specifies one or more of the same interfaces for the same bridge (identical values of {{param|MarkingBridgeReference}}), then for packets on egress from the specified bridge to those interfaces, the applied marking MUST be that specified in the Marking table entry among those in conflict with the lowest {{param|MarkingKey}} value.

If an interface in a given bridge does not have a corresponding Marking table entry, the marking is left unchanged on egress.
	 *
	 * @since 1.1
	 * @param markingInterface the input value
	 * @return this instance
	 */
	public Marking withMarkingInterface(String markingInterface) {
		this.markingInterface = markingInterface;
		return this;
	}

	/**
	 * Get the if {{true}}, on egress to the interfaces associated with this Marking table entry, all packets are Untagged.  That is, the VLAN tag is stripped from the packet.

If {{false}}, on egress to the interfaces associated with this Marking table entry, all VLAN tags are left intact (including those added on ingress).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isVlaNIDUntag() {
		return vlaNIDUntag;
	}

	/**
	 * Set the if {{true}}, on egress to the interfaces associated with this Marking table entry, all packets are Untagged.  That is, the VLAN tag is stripped from the packet.

If {{false}}, on egress to the interfaces associated with this Marking table entry, all VLAN tags are left intact (including those added on ingress).
	 *
	 * @since 1.1
	 * @param vlaNIDUntag the input value
	 */
	public void  setVlaNIDUntag(Boolean vlaNIDUntag) {
		this.vlaNIDUntag = vlaNIDUntag;
	}

	/**
	 * Set the if {{true}}, on egress to the interfaces associated with this Marking table entry, all packets are Untagged.  That is, the VLAN tag is stripped from the packet.

If {{false}}, on egress to the interfaces associated with this Marking table entry, all VLAN tags are left intact (including those added on ingress).
	 *
	 * @since 1.1
	 * @param vlaNIDUntag the input value
	 * @return this instance
	 */
	public Marking withVlaNIDUntag(Boolean vlaNIDUntag) {
		this.vlaNIDUntag = vlaNIDUntag;
		return this;
	}

	/**
	 * Get the 802.1Q VLAN ID to be used on egress to the interfaces associated with this Marking table entry (if {{param|VLANIDUntag}} is {{false}}).

A value of -1 indicates that the default VLAN ID for the Bridge SHOULD be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Marking table entry).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the 802.1Q VLAN ID to be used on egress to the interfaces associated with this Marking table entry (if {{param|VLANIDUntag}} is {{false}}).

A value of -1 indicates that the default VLAN ID for the Bridge SHOULD be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Marking table entry).
	 *
	 * @since 1.1
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the 802.1Q VLAN ID to be used on egress to the interfaces associated with this Marking table entry (if {{param|VLANIDUntag}} is {{false}}).

A value of -1 indicates that the default VLAN ID for the Bridge SHOULD be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Marking table entry).
	 *
	 * @since 1.1
	 * @param vlaNIDMark the input value
	 * @return this instance
	 */
	public Marking withVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this Bridge on egress to the interfaces associated with this Marking table entry. A value of -1 indicates no change from the incoming packet or the mark assigned by the classifier.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this Bridge on egress to the interfaces associated with this Marking table entry. A value of -1 indicates no change from the incoming packet or the mark assigned by the classifier.
	 *
	 * @since 1.1
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this Bridge on egress to the interfaces associated with this Marking table entry. A value of -1 indicates no change from the incoming packet or the mark assigned by the classifier.
	 *
	 * @since 1.1
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public Marking withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the if {{false}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is applied only to packets of priority 0.

If {{true}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is to be applied to all packets on this Bridge.

If {{param|VLANIDUntag}} is {{true}}, then no priority marking is done since the tag containing the Ethernet priority is removed.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEthernetPriorityOverride() {
		return ethernetPriorityOverride;
	}

	/**
	 * Set the if {{false}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is applied only to packets of priority 0.

If {{true}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is to be applied to all packets on this Bridge.

If {{param|VLANIDUntag}} is {{true}}, then no priority marking is done since the tag containing the Ethernet priority is removed.
	 *
	 * @since 1.1
	 * @param ethernetPriorityOverride the input value
	 */
	public void  setEthernetPriorityOverride(Boolean ethernetPriorityOverride) {
		this.ethernetPriorityOverride = ethernetPriorityOverride;
	}

	/**
	 * Set the if {{false}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is applied only to packets of priority 0.

If {{true}}, on egress to the interfaces associated with this Marking table entry, the {{param|EthernetPriorityMark}}, if specified, is to be applied to all packets on this Bridge.

If {{param|VLANIDUntag}} is {{true}}, then no priority marking is done since the tag containing the Ethernet priority is removed.
	 *
	 * @since 1.1
	 * @param ethernetPriorityOverride the input value
	 * @return this instance
	 */
	public Marking withEthernetPriorityOverride(Boolean ethernetPriorityOverride) {
		this.ethernetPriorityOverride = ethernetPriorityOverride;
		return this;
	}

	//</editor-fold>

}