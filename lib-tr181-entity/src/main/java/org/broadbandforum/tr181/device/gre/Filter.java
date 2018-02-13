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
package org.broadbandforum.tr181.device.gre;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * GRE Filter table. Entries in this table are applied against the packets that are to be encapsulated within the GRE Tunnel based on the following conditions:

        * If the value of the {{param|AllInterfaces}} is {{true}}, then this entry will be applied to all {{object|#.Tunnel}} and {{object|#.Tunnel.{i}.Interface}} instances.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel}} table then this entry is applied to all {{object|#.Tunnel.{i}.Interface}} instances of the {{object|#.Tunnel}} reference.

        * If the value of {{param|AllInterfaces}} is {{false}} and the value of {{param|Interface}} parameter is a reference to a row in the {{object|#.Tunnel.{i}.Interface}} table then this entry is applied to the {{object|#.Tunnel.{i}.Interface}} reference.

        * If no entries are matched for the packet, then the default treatment (e.g., {{param|#.Tunnel.{i}.DefaultDSCPMark}}) is applied to the packet.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.GRE.Filter.{i}.")
@XmlRootElement(name = "Filter")
@XmlType(name = "Device.GRE.Filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Filter {

	/**
	 * Enables or disables this filter.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this filter.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * A non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String alias;
	/**
	 * Filter criterion. {{reference}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Filter criterion. This specifies that all ingress GRE tunnel interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress GRE tunnel interfaces are indicated.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean allInterfaces = false;
	/**
	 * Filter criterion.

          Current outer Ethernet VLAN ID as defined in 802.1Q. A value of -1 indicates this criterion is not used for filtering.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "VLANIDCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDCheck = -1;
	/**
	 * If {{false}}, the filter includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the filter includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "VLANIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vlaNIDExclude = false;
	/**
	 * DSCP with which to mark the outer IP header for traffic that is associated with the interface criterion.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the upstream packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DSCPMarkPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2, max = 63)
	public Integer dscPMarkPolicy;

	public Filter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this filter.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this filter.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this filter.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Filter withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this filter.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this filter.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this filter.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Filter withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.8
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.8
	 * @param order the input value
	 * @return this instance
	 */
	public Filter withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Filter withAlias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the filter criterion. {{reference}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the filter criterion. {{reference}}
	 *
	 * @since 2.8
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the filter criterion. {{reference}}
	 *
	 * @since 2.8
	 * @param _interface the input value
	 * @return this instance
	 */
	public Filter with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the filter criterion. This specifies that all ingress GRE tunnel interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress GRE tunnel interfaces are indicated.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isAllInterfaces() {
		return allInterfaces;
	}

	/**
	 * Set the filter criterion. This specifies that all ingress GRE tunnel interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress GRE tunnel interfaces are indicated.
	 *
	 * @since 2.8
	 * @param allInterfaces the input value
	 */
	public void  setAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
	}

	/**
	 * Set the filter criterion. This specifies that all ingress GRE tunnel interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress GRE tunnel interfaces are indicated.
	 *
	 * @since 2.8
	 * @param allInterfaces the input value
	 * @return this instance
	 */
	public Filter withAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
		return this;
	}

	/**
	 * Get the filter criterion.

          Current outer Ethernet VLAN ID as defined in 802.1Q. A value of -1 indicates this criterion is not used for filtering.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getVlaNIDCheck() {
		return vlaNIDCheck;
	}

	/**
	 * Set the filter criterion.

          Current outer Ethernet VLAN ID as defined in 802.1Q. A value of -1 indicates this criterion is not used for filtering.
	 *
	 * @since 2.8
	 * @param vlaNIDCheck the input value
	 */
	public void  setVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
	}

	/**
	 * Set the filter criterion.

          Current outer Ethernet VLAN ID as defined in 802.1Q. A value of -1 indicates this criterion is not used for filtering.
	 *
	 * @since 2.8
	 * @param vlaNIDCheck the input value
	 * @return this instance
	 */
	public Filter withVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the filter includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the filter includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isVlaNIDExclude() {
		return vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the filter includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the filter includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.8
	 * @param vlaNIDExclude the input value
	 */
	public void  setVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the filter includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the filter includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.8
	 * @param vlaNIDExclude the input value
	 * @return this instance
	 */
	public Filter withVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
		return this;
	}

	/**
	 * Get the dscP with which to mark the outer IP header for traffic that is associated with the interface criterion.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the upstream packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getDscPMarkPolicy() {
		return dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with the interface criterion.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the upstream packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @param dscPMarkPolicy the input value
	 */
	public void  setDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with the interface criterion.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the upstream packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @param dscPMarkPolicy the input value
	 * @return this instance
	 */
	public Filter withDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
		return this;
	}

	//</editor-fold>

}