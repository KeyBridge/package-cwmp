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
package org.broadbandforum.tr181.device.neighbordiscovery;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Per-interface Neighbor Discovery Protocol (NDP) configuration {{bibref|RFC4861}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.NeighborDiscovery.InterfaceSetting.{i}.")
public class InterfaceSetting {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;
	/**
	 * Retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Neighbor Solicitation transmissions performed during Duplicate Address Detection (DAD) {{bibref|RFC4862|Section 5.4}}, as well as the time a node waits after sending the last Neighbor Solicitation before ending the DAD process.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RetransTimer")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long retransTimer = 1000L;
	/**
	 * Retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Router Solicitation transmissions.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RtrSolicitationInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long rtrSolicitationInterval = 4L;
	/**
	 * Maximum Number of Router Solicitation Transmission messages, as defined in {{bibref|RFC4861}}. For auto-configuration purposes {{param}} specifies the Maximum Number of Router Solicitation Transmission messages to help the host to conclude that there are no routers on the link.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "MaxRtrSolicitations")
	@CWMPParameter(access = "readWrite")
	public Long maxRtrSolicitations = 3L;
	/**
	 * Enables or disables Neighbor Unreachability Detection (NUD) {{bibref|RFC4861|Section 7}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "NUDEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean nudEnable;
	/**
	 * Enables or disables Router Solicitation (RS) on {{param|Interface}} {{bibref|RFC4861|Section 4.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RSEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean rsenable;

	public InterfaceSetting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public InterfaceSetting withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public InterfaceSetting withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public InterfaceSetting withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the this is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the this is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 * @return this instance
	 */
	public InterfaceSetting with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Neighbor Solicitation transmissions performed during Duplicate Address Detection (DAD) {{bibref|RFC4862|Section 5.4}}, as well as the time a node waits after sending the last Neighbor Solicitation before ending the DAD process.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getRetransTimer() {
		return retransTimer;
	}

	/**
	 * Set the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Neighbor Solicitation transmissions performed during Duplicate Address Detection (DAD) {{bibref|RFC4862|Section 5.4}}, as well as the time a node waits after sending the last Neighbor Solicitation before ending the DAD process.
	 *
	 * @since 2.2
	 * @param retransTimer the input value
	 */
	public void  setRetransTimer(Long retransTimer) {
		this.retransTimer = retransTimer;
	}

	/**
	 * Set the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Neighbor Solicitation transmissions performed during Duplicate Address Detection (DAD) {{bibref|RFC4862|Section 5.4}}, as well as the time a node waits after sending the last Neighbor Solicitation before ending the DAD process.
	 *
	 * @since 2.2
	 * @param retransTimer the input value
	 * @return this instance
	 */
	public InterfaceSetting withRetransTimer(Long retransTimer) {
		this.retransTimer = retransTimer;
		return this;
	}

	/**
	 * Get the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Router Solicitation transmissions.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getRtrSolicitationInterval() {
		return rtrSolicitationInterval;
	}

	/**
	 * Set the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Router Solicitation transmissions.
	 *
	 * @since 2.2
	 * @param rtrSolicitationInterval the input value
	 */
	public void  setRtrSolicitationInterval(Long rtrSolicitationInterval) {
		this.rtrSolicitationInterval = rtrSolicitationInterval;
	}

	/**
	 * Set the retransmission interval in milliseconds, as defined in {{bibref|RFC4861}}. For auto-configuration purposes, {{param}} specifies the delay between consecutive Router Solicitation transmissions.
	 *
	 * @since 2.2
	 * @param rtrSolicitationInterval the input value
	 * @return this instance
	 */
	public InterfaceSetting withRtrSolicitationInterval(Long rtrSolicitationInterval) {
		this.rtrSolicitationInterval = rtrSolicitationInterval;
		return this;
	}

	/**
	 * Get the maximum Number of Router Solicitation Transmission messages, as defined in {{bibref|RFC4861}}. For auto-configuration purposes {{param}} specifies the Maximum Number of Router Solicitation Transmission messages to help the host to conclude that there are no routers on the link.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getMaxRtrSolicitations() {
		return maxRtrSolicitations;
	}

	/**
	 * Set the maximum Number of Router Solicitation Transmission messages, as defined in {{bibref|RFC4861}}. For auto-configuration purposes {{param}} specifies the Maximum Number of Router Solicitation Transmission messages to help the host to conclude that there are no routers on the link.
	 *
	 * @since 2.2
	 * @param maxRtrSolicitations the input value
	 */
	public void  setMaxRtrSolicitations(Long maxRtrSolicitations) {
		this.maxRtrSolicitations = maxRtrSolicitations;
	}

	/**
	 * Set the maximum Number of Router Solicitation Transmission messages, as defined in {{bibref|RFC4861}}. For auto-configuration purposes {{param}} specifies the Maximum Number of Router Solicitation Transmission messages to help the host to conclude that there are no routers on the link.
	 *
	 * @since 2.2
	 * @param maxRtrSolicitations the input value
	 * @return this instance
	 */
	public InterfaceSetting withMaxRtrSolicitations(Long maxRtrSolicitations) {
		this.maxRtrSolicitations = maxRtrSolicitations;
		return this;
	}

	/**
	 * Get the enables or disables Neighbor Unreachability Detection (NUD) {{bibref|RFC4861|Section 7}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isNudEnable() {
		return nudEnable;
	}

	/**
	 * Set the enables or disables Neighbor Unreachability Detection (NUD) {{bibref|RFC4861|Section 7}}.
	 *
	 * @since 2.2
	 * @param nudEnable the input value
	 */
	public void  setNudEnable(Boolean nudEnable) {
		this.nudEnable = nudEnable;
	}

	/**
	 * Set the enables or disables Neighbor Unreachability Detection (NUD) {{bibref|RFC4861|Section 7}}.
	 *
	 * @since 2.2
	 * @param nudEnable the input value
	 * @return this instance
	 */
	public InterfaceSetting withNudEnable(Boolean nudEnable) {
		this.nudEnable = nudEnable;
		return this;
	}

	/**
	 * Get the enables or disables Router Solicitation (RS) on {{param|Interface}} {{bibref|RFC4861|Section 4.1}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isRsenable() {
		return rsenable;
	}

	/**
	 * Set the enables or disables Router Solicitation (RS) on {{param|Interface}} {{bibref|RFC4861|Section 4.1}}.
	 *
	 * @since 2.2
	 * @param rsenable the input value
	 */
	public void  setRsenable(Boolean rsenable) {
		this.rsenable = rsenable;
	}

	/**
	 * Set the enables or disables Router Solicitation (RS) on {{param|Interface}} {{bibref|RFC4861|Section 4.1}}.
	 *
	 * @since 2.2
	 * @param rsenable the input value
	 * @return this instance
	 */
	public InterfaceSetting withRsenable(Boolean rsenable) {
		this.rsenable = rsenable;
		return this;
	}

	//</editor-fold>

}