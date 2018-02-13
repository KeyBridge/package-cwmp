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
package org.broadbandforum.tr181.device.ieee1905.al.forwardingtable;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * The 1905 fowarding rule for the ALME-SET-FWD-RULE.request and ALME-GET-FWD-RULES.response with classification criteria as defined in {{bibref|IEEE1905.1a|Table 5-9: ClassificationSet elements}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.ForwardingTable.ForwardingRule.{i}.")
@XmlRootElement(name = "Device.IEEE1905.AL.ForwardingTable.ForwardingRule")
@XmlType(name = "Device.IEEE1905.AL.ForwardingTable.ForwardingRule")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForwardingRule {

	/**
	 * The list of interfaces to which a frame satisfying the following classification criteria should be forwarded (intfAddressList parameter as defined in {{bibref|IEEE1905.1a|Table 5-8: ALME-SET-FWD-RULE.request parameters and Table 5-12: fwdRuleList elements}}). {{list}} Each list item MUST be the path name of an object, which MUST be a row of an {{object|##.Interface}} object. If the referenced item is deleted, the corresponding item MUST be removed from the list. {{noreference}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> interfaceList;
	/**
	 * Classification criterion.

          The destination MAC address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACDestinationAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress macDestinationAddress;
	/**
	 * If {{false}}, the classification criterion {{param|MACDestinationAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACDestinationAddress}} is used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACDestinationAddressFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean macDestinationAddressFlag = false;
	/**
	 * Classification criterion.

          The source MAC address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACSourceAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress macSourceAddress;
	/**
	 * If {{false}}, the classification criterion {{param|MACSourceAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACSourceAddress}} is used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACSourceAddressFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean macSourceAddressFlag = false;
	/**
	 * Classification criterion.

          Ether Type Field in a frame.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EtherType")
	@CWMPParameter(access = "readWrite")
	public Long etherType;
	/**
	 * If {{false}}, the classification criterion {{param|EtherType}} is ignored.  If {{true}}, the classification {{param|EtherType}} is used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EtherTypeFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean etherTypeFlag = false;
	/**
	 * Classification criterion.

          IEEE 802.1Q VLAN ID in a frame.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Vid")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4095)
	public Long vid;
	/**
	 * If {{false}}, the classification criterion {{param|Vid}} is ignored.  If {{true}}, the classification {{param|Vid}} is used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "VidFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean vidFlag = false;
	/**
	 * Classification criterion.

          IEEE 802.1Q Priority Code Point field.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long pcp;
	/**
	 * If {{false}}, the classification criterion {{param|PCP}} is ignored.  If {{true}}, the classification {{param|PCP}} is used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PCPFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean pcpFlag = false;

	public ForwardingRule() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the list of interfaces to which a frame satisfying the following classification criteria should be forwarded (intfAddressList parameter as defined in {{bibref|IEEE1905.1a|Table 5-8: ALME-SET-FWD-RULE.request parameters and Table 5-12: fwdRuleList elements}}). {{list}} Each list item MUST be the path name of an object, which MUST be a row of an {{object|##.Interface}} object. If the referenced item is deleted, the corresponding item MUST be removed from the list. {{noreference}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getInterfaceList() {
		if (this.interfaceList == null){ this.interfaceList=new ArrayList<>();}
		return interfaceList;
	}

	/**
	 * Set the list of interfaces to which a frame satisfying the following classification criteria should be forwarded (intfAddressList parameter as defined in {{bibref|IEEE1905.1a|Table 5-8: ALME-SET-FWD-RULE.request parameters and Table 5-12: fwdRuleList elements}}). {{list}} Each list item MUST be the path name of an object, which MUST be a row of an {{object|##.Interface}} object. If the referenced item is deleted, the corresponding item MUST be removed from the list. {{noreference}}
	 *
	 * @since 2.9
	 * @param interfaceList the input value
	 */
	public void  setInterfaceList(Collection<String> interfaceList) {
		this.interfaceList = interfaceList;
	}

	/**
	 * Set the list of interfaces to which a frame satisfying the following classification criteria should be forwarded (intfAddressList parameter as defined in {{bibref|IEEE1905.1a|Table 5-8: ALME-SET-FWD-RULE.request parameters and Table 5-12: fwdRuleList elements}}). {{list}} Each list item MUST be the path name of an object, which MUST be a row of an {{object|##.Interface}} object. If the referenced item is deleted, the corresponding item MUST be removed from the list. {{noreference}}
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public ForwardingRule withInterfaceList(String string) {
		getInterfaceList().add(string);
		return this;
	}

	/**
	 * Get the classification criterion.

          The destination MAC address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getMacDestinationAddress() {
		return macDestinationAddress;
	}

	/**
	 * Set the classification criterion.

          The destination MAC address.
	 *
	 * @since 2.9
	 * @param macDestinationAddress the input value
	 */
	public void  setMacDestinationAddress(MACAddress macDestinationAddress) {
		this.macDestinationAddress = macDestinationAddress;
	}

	/**
	 * Set the classification criterion.

          The destination MAC address.
	 *
	 * @since 2.9
	 * @param macDestinationAddress the input value
	 * @return this instance
	 */
	public ForwardingRule withMacDestinationAddress(MACAddress macDestinationAddress) {
		this.macDestinationAddress = macDestinationAddress;
		return this;
	}

	/**
	 * Get the if {{false}}, the classification criterion {{param|MACDestinationAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACDestinationAddress}} is used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isMacDestinationAddressFlag() {
		return macDestinationAddressFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|MACDestinationAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACDestinationAddress}} is used.
	 *
	 * @since 2.9
	 * @param macDestinationAddressFlag the input value
	 */
	public void  setMacDestinationAddressFlag(Boolean macDestinationAddressFlag) {
		this.macDestinationAddressFlag = macDestinationAddressFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|MACDestinationAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACDestinationAddress}} is used.
	 *
	 * @since 2.9
	 * @param macDestinationAddressFlag the input value
	 * @return this instance
	 */
	public ForwardingRule withMacDestinationAddressFlag(Boolean macDestinationAddressFlag) {
		this.macDestinationAddressFlag = macDestinationAddressFlag;
		return this;
	}

	/**
	 * Get the classification criterion.

          The source MAC address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getMacSourceAddress() {
		return macSourceAddress;
	}

	/**
	 * Set the classification criterion.

          The source MAC address.
	 *
	 * @since 2.9
	 * @param macSourceAddress the input value
	 */
	public void  setMacSourceAddress(MACAddress macSourceAddress) {
		this.macSourceAddress = macSourceAddress;
	}

	/**
	 * Set the classification criterion.

          The source MAC address.
	 *
	 * @since 2.9
	 * @param macSourceAddress the input value
	 * @return this instance
	 */
	public ForwardingRule withMacSourceAddress(MACAddress macSourceAddress) {
		this.macSourceAddress = macSourceAddress;
		return this;
	}

	/**
	 * Get the if {{false}}, the classification criterion {{param|MACSourceAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACSourceAddress}} is used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isMacSourceAddressFlag() {
		return macSourceAddressFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|MACSourceAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACSourceAddress}} is used.
	 *
	 * @since 2.9
	 * @param macSourceAddressFlag the input value
	 */
	public void  setMacSourceAddressFlag(Boolean macSourceAddressFlag) {
		this.macSourceAddressFlag = macSourceAddressFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|MACSourceAddress}} is ignored.  If {{true}}, the classification criterion {{param|MACSourceAddress}} is used.
	 *
	 * @since 2.9
	 * @param macSourceAddressFlag the input value
	 * @return this instance
	 */
	public ForwardingRule withMacSourceAddressFlag(Boolean macSourceAddressFlag) {
		this.macSourceAddressFlag = macSourceAddressFlag;
		return this;
	}

	/**
	 * Get the classification criterion.

          Ether Type Field in a frame.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getEtherType() {
		return etherType;
	}

	/**
	 * Set the classification criterion.

          Ether Type Field in a frame.
	 *
	 * @since 2.9
	 * @param etherType the input value
	 */
	public void  setEtherType(Long etherType) {
		this.etherType = etherType;
	}

	/**
	 * Set the classification criterion.

          Ether Type Field in a frame.
	 *
	 * @since 2.9
	 * @param etherType the input value
	 * @return this instance
	 */
	public ForwardingRule withEtherType(Long etherType) {
		this.etherType = etherType;
		return this;
	}

	/**
	 * Get the if {{false}}, the classification criterion {{param|EtherType}} is ignored.  If {{true}}, the classification {{param|EtherType}} is used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isEtherTypeFlag() {
		return etherTypeFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|EtherType}} is ignored.  If {{true}}, the classification {{param|EtherType}} is used.
	 *
	 * @since 2.9
	 * @param etherTypeFlag the input value
	 */
	public void  setEtherTypeFlag(Boolean etherTypeFlag) {
		this.etherTypeFlag = etherTypeFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|EtherType}} is ignored.  If {{true}}, the classification {{param|EtherType}} is used.
	 *
	 * @since 2.9
	 * @param etherTypeFlag the input value
	 * @return this instance
	 */
	public ForwardingRule withEtherTypeFlag(Boolean etherTypeFlag) {
		this.etherTypeFlag = etherTypeFlag;
		return this;
	}

	/**
	 * Get the classification criterion.

          IEEE 802.1Q VLAN ID in a frame.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getVid() {
		return vid;
	}

	/**
	 * Set the classification criterion.

          IEEE 802.1Q VLAN ID in a frame.
	 *
	 * @since 2.9
	 * @param vid the input value
	 */
	public void  setVid(Long vid) {
		this.vid = vid;
	}

	/**
	 * Set the classification criterion.

          IEEE 802.1Q VLAN ID in a frame.
	 *
	 * @since 2.9
	 * @param vid the input value
	 * @return this instance
	 */
	public ForwardingRule withVid(Long vid) {
		this.vid = vid;
		return this;
	}

	/**
	 * Get the if {{false}}, the classification criterion {{param|Vid}} is ignored.  If {{true}}, the classification {{param|Vid}} is used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isVidFlag() {
		return vidFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|Vid}} is ignored.  If {{true}}, the classification {{param|Vid}} is used.
	 *
	 * @since 2.9
	 * @param vidFlag the input value
	 */
	public void  setVidFlag(Boolean vidFlag) {
		this.vidFlag = vidFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|Vid}} is ignored.  If {{true}}, the classification {{param|Vid}} is used.
	 *
	 * @since 2.9
	 * @param vidFlag the input value
	 * @return this instance
	 */
	public ForwardingRule withVidFlag(Boolean vidFlag) {
		this.vidFlag = vidFlag;
		return this;
	}

	/**
	 * Get the classification criterion.

          IEEE 802.1Q Priority Code Point field.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getPcp() {
		return pcp;
	}

	/**
	 * Set the classification criterion.

          IEEE 802.1Q Priority Code Point field.
	 *
	 * @since 2.9
	 * @param pcp the input value
	 */
	public void  setPcp(Long pcp) {
		this.pcp = pcp;
	}

	/**
	 * Set the classification criterion.

          IEEE 802.1Q Priority Code Point field.
	 *
	 * @since 2.9
	 * @param pcp the input value
	 * @return this instance
	 */
	public ForwardingRule withPcp(Long pcp) {
		this.pcp = pcp;
		return this;
	}

	/**
	 * Get the if {{false}}, the classification criterion {{param|PCP}} is ignored.  If {{true}}, the classification {{param|PCP}} is used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isPcpFlag() {
		return pcpFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|PCP}} is ignored.  If {{true}}, the classification {{param|PCP}} is used.
	 *
	 * @since 2.9
	 * @param pcpFlag the input value
	 */
	public void  setPcpFlag(Boolean pcpFlag) {
		this.pcpFlag = pcpFlag;
	}

	/**
	 * Set the if {{false}}, the classification criterion {{param|PCP}} is ignored.  If {{true}}, the classification {{param|PCP}} is used.
	 *
	 * @since 2.9
	 * @param pcpFlag the input value
	 * @return this instance
	 */
	public ForwardingRule withPcpFlag(Boolean pcpFlag) {
		this.pcpFlag = pcpFlag;
		return this;
	}

	//</editor-fold>

}