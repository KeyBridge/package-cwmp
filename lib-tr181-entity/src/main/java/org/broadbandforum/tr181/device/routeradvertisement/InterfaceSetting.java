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
package org.broadbandforum.tr181.device.routeradvertisement;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.routeradvertisement.interfacesetting.Option;

	/**
	 * Per-interface Router Advertisement (RA) configuration {{bibref|RFC4861}}. Table entries are created for use in sending Router Advertisements. 

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.RouterAdvertisement.InterfaceSetting.{i}.")
public class InterfaceSetting {

	/**
	 * Enables or disables this {{object}} entry.

          Defines the value of the ''IsRouter'' and ''AdvSendAdvertisements'' flags from {{bibref|RFC4861|Section 4.2}}
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
	 * {{list}} {{reference}}

          Manually-configured prefixes that will be sent in Router Advertisement messages.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  Router Advertisement messages MUST include Prefix Information Options {{bibref|RFC4861}} for all ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ManualPrefixes")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> manualPrefixes;
	/**
	 * {{list}} {{reference}}

          All prefixes that will be included in Router Advertisement (RA) messages sent out this interface. This list can include:

          * Prefixes from {{param|ManualPrefixes}} that are included in RA messages.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Prefixes")
	@Size
	@XmlList
	public Collection<String> prefixes;
	/**
	 * The maximum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "MaxRtrAdvInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 4, max = 1800)
	public Long maxRtrAdvInterval = 600L;
	/**
	 * The minimum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value MUST be no greater than 3/4 * {{param|MaxRtrAdvInterval}}.

          Note: The ''1350'' maximum was derived from the RFC, based on 3/4 times the maximum value of {{param|MaxRtrAdvInterval}}. Similarly, the ''200'' default was derived from the RFC, based on 1/3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "MinRtrAdvInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 3, max = 1350)
	public Long minRtrAdvInterval = 200L;
	/**
	 * The value placed in the "Router Lifetime" field of Router Advertisement messages on this interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value can be zero or between {{param|MaxRtrAdvInterval}} and 9000 seconds, but these limits can be overridden by specific documents that describe how IPv6 operates over different link layers. 

          A value of zero indicates that the router is not to be used as a default router.

          Note: The ''1800'' default was derived from the RFC, based on 3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvDefaultLifetime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(max = 65535)
	public Long advDefaultLifetime = 1800L;
	/**
	 * The value placed in the "Managed address configuration" (M) flag field of Router Advertisement messages on this interafce (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvManagedFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean advManagedFlag = false;
	/**
	 * The value placed in the "Other configuration" (O) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvOtherConfigFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean advOtherConfigFlag = false;
	/**
	 * The value placed in the "Home agent" (H) flag field of Router Advertisement messages on this interface (see {{bibref|RFC3775|Section 7.1}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvMobileAgentFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean advMobileAgentFlag = false;
	/**
	 * The value placed in the "Default Router Preference" (Prf) field of Router Advertisement messages on this interface, as defined in {{bibref|RFC4191|Section 2.2}}. {{enum}}

          Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvPreferredRouterFlag")
	@CWMPParameter(access = "readWrite")
	public String advPreferredRouterFlag = "Medium";
	/**
	 * The value placed in the "Proxy" (P) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4389|Section 4.1.3.3}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvNDProxyFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean advNDProxyFlag = false;
	/**
	 * The value placed in MTU options of Router Advertisement messages on this interface. A value of zero indicates that no MTU options are included (see {{bibref|RFC4861|Section 4.6.4}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvLinkMTU")
	@CWMPParameter(access = "readWrite")
	public Long advLinkMTU = 0L;
	/**
	 * The value placed in the "Reachable Time" field of Router Advertisement messages on this interface, in milliseconds (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvReachableTime")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(max = 3600000)
	public Long advReachableTime = 0L;
	/**
	 * The value placed in the "Retrans Timer" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvRetransTimer")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long advRetransTimer = 0L;
	/**
	 * The value placed in the "Cur Hop Limit" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).

          Note: The default can be overridden with the value specified in {{bibref|RFC3232}} that was in effect at the time of implementation.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvCurHopLimit")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public Long advCurHopLimit = 0L;
	/**
	 * This object specifies the options in a Router Advertisement (RA) message {{bibref|RFC4861|Section 4.6}}. {{object}} entries are created for use in sending Router Advertisements (enabled options MUST be included in RA messages sent). This includes support for sending DNS information in the RA message as described in {{bibref|RFC6106}}.

        This table is intended only for options that are not modeled elsewhere. For example, it is not appropriate for the MTU option (which is modeled via {{param|#.AdvLinkMTU}}).
	 */
	@XmlElementWrapper(name = "Options")
	@XmlElement(name = "Option")
	@CWMPParameter(access = "readWrite")
	public Collection<Option> options;

	public InterfaceSetting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.

          Defines the value of the ''IsRouter'' and ''AdvSendAdvertisements'' flags from {{bibref|RFC4861|Section 4.2}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.

          Defines the value of the ''IsRouter'' and ''AdvSendAdvertisements'' flags from {{bibref|RFC4861|Section 4.2}}
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.

          Defines the value of the ''IsRouter'' and ''AdvSendAdvertisements'' flags from {{bibref|RFC4861|Section 4.2}}
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
	 * Get the {{list}} {{reference}}

          Manually-configured prefixes that will be sent in Router Advertisement messages.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  Router Advertisement messages MUST include Prefix Information Options {{bibref|RFC4861}} for all ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getManualPrefixes() {
		if (this.manualPrefixes == null){ this.manualPrefixes=new ArrayList<>();}
		return manualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes that will be sent in Router Advertisement messages.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  Router Advertisement messages MUST include Prefix Information Options {{bibref|RFC4861}} for all ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param manualPrefixes the input value
	 */
	public void  setManualPrefixes(Collection<String> manualPrefixes) {
		this.manualPrefixes = manualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes that will be sent in Router Advertisement messages.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  Router Advertisement messages MUST include Prefix Information Options {{bibref|RFC4861}} for all ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public InterfaceSetting withManualPrefixes(String string) {
		getManualPrefixes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          All prefixes that will be included in Router Advertisement (RA) messages sent out this interface. This list can include:

          * Prefixes from {{param|ManualPrefixes}} that are included in RA messages.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getPrefixes() {
		if (this.prefixes == null){ this.prefixes=new ArrayList<>();}
		return prefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes that will be included in Router Advertisement (RA) messages sent out this interface. This list can include:

          * Prefixes from {{param|ManualPrefixes}} that are included in RA messages.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param prefixes the input value
	 */
	public void  setPrefixes(Collection<String> prefixes) {
		this.prefixes = prefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes that will be included in Router Advertisement (RA) messages sent out this interface. This list can include:

          * Prefixes from {{param|ManualPrefixes}} that are included in RA messages.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public InterfaceSetting withPrefixes(String string) {
		getPrefixes().add(string);
		return this;
	}

	/**
	 * Get the maximum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getMaxRtrAdvInterval() {
		return maxRtrAdvInterval;
	}

	/**
	 * Set the maximum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).
	 *
	 * @since 2.2
	 * @param maxRtrAdvInterval the input value
	 */
	public void  setMaxRtrAdvInterval(Long maxRtrAdvInterval) {
		this.maxRtrAdvInterval = maxRtrAdvInterval;
	}

	/**
	 * Set the maximum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).
	 *
	 * @since 2.2
	 * @param maxRtrAdvInterval the input value
	 * @return this instance
	 */
	public InterfaceSetting withMaxRtrAdvInterval(Long maxRtrAdvInterval) {
		this.maxRtrAdvInterval = maxRtrAdvInterval;
		return this;
	}

	/**
	 * Get the minimum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value MUST be no greater than 3/4 * {{param|MaxRtrAdvInterval}}.

          Note: The ''1350'' maximum was derived from the RFC, based on 3/4 times the maximum value of {{param|MaxRtrAdvInterval}}. Similarly, the ''200'' default was derived from the RFC, based on 1/3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getMinRtrAdvInterval() {
		return minRtrAdvInterval;
	}

	/**
	 * Set the minimum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value MUST be no greater than 3/4 * {{param|MaxRtrAdvInterval}}.

          Note: The ''1350'' maximum was derived from the RFC, based on 3/4 times the maximum value of {{param|MaxRtrAdvInterval}}. Similarly, the ''200'' default was derived from the RFC, based on 1/3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @param minRtrAdvInterval the input value
	 */
	public void  setMinRtrAdvInterval(Long minRtrAdvInterval) {
		this.minRtrAdvInterval = minRtrAdvInterval;
	}

	/**
	 * Set the minimum time allowed between sending unsolicited multicast Router Advertisements from the interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value MUST be no greater than 3/4 * {{param|MaxRtrAdvInterval}}.

          Note: The ''1350'' maximum was derived from the RFC, based on 3/4 times the maximum value of {{param|MaxRtrAdvInterval}}. Similarly, the ''200'' default was derived from the RFC, based on 1/3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @param minRtrAdvInterval the input value
	 * @return this instance
	 */
	public InterfaceSetting withMinRtrAdvInterval(Long minRtrAdvInterval) {
		this.minRtrAdvInterval = minRtrAdvInterval;
		return this;
	}

	/**
	 * Get the value placed in the "Router Lifetime" field of Router Advertisement messages on this interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value can be zero or between {{param|MaxRtrAdvInterval}} and 9000 seconds, but these limits can be overridden by specific documents that describe how IPv6 operates over different link layers. 

          A value of zero indicates that the router is not to be used as a default router.

          Note: The ''1800'' default was derived from the RFC, based on 3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getAdvDefaultLifetime() {
		return advDefaultLifetime;
	}

	/**
	 * Set the value placed in the "Router Lifetime" field of Router Advertisement messages on this interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value can be zero or between {{param|MaxRtrAdvInterval}} and 9000 seconds, but these limits can be overridden by specific documents that describe how IPv6 operates over different link layers. 

          A value of zero indicates that the router is not to be used as a default router.

          Note: The ''1800'' default was derived from the RFC, based on 3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @param advDefaultLifetime the input value
	 */
	public void  setAdvDefaultLifetime(Long advDefaultLifetime) {
		this.advDefaultLifetime = advDefaultLifetime;
	}

	/**
	 * Set the value placed in the "Router Lifetime" field of Router Advertisement messages on this interface, in seconds (see {{bibref|RFC4861|Section 4.2}}).

          The value can be zero or between {{param|MaxRtrAdvInterval}} and 9000 seconds, but these limits can be overridden by specific documents that describe how IPv6 operates over different link layers. 

          A value of zero indicates that the router is not to be used as a default router.

          Note: The ''1800'' default was derived from the RFC, based on 3 times the default value of {{param|MaxRtrAdvInterval}}.
	 *
	 * @since 2.2
	 * @param advDefaultLifetime the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvDefaultLifetime(Long advDefaultLifetime) {
		this.advDefaultLifetime = advDefaultLifetime;
		return this;
	}

	/**
	 * Get the value placed in the "Managed address configuration" (M) flag field of Router Advertisement messages on this interafce (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAdvManagedFlag() {
		return advManagedFlag;
	}

	/**
	 * Set the value placed in the "Managed address configuration" (M) flag field of Router Advertisement messages on this interafce (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @param advManagedFlag the input value
	 */
	public void  setAdvManagedFlag(Boolean advManagedFlag) {
		this.advManagedFlag = advManagedFlag;
	}

	/**
	 * Set the value placed in the "Managed address configuration" (M) flag field of Router Advertisement messages on this interafce (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @param advManagedFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvManagedFlag(Boolean advManagedFlag) {
		this.advManagedFlag = advManagedFlag;
		return this;
	}

	/**
	 * Get the value placed in the "Other configuration" (O) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAdvOtherConfigFlag() {
		return advOtherConfigFlag;
	}

	/**
	 * Set the value placed in the "Other configuration" (O) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @param advOtherConfigFlag the input value
	 */
	public void  setAdvOtherConfigFlag(Boolean advOtherConfigFlag) {
		this.advOtherConfigFlag = advOtherConfigFlag;
	}

	/**
	 * Set the value placed in the "Other configuration" (O) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}, and {{bibref|RFC4862}}).
	 *
	 * @since 2.2
	 * @param advOtherConfigFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvOtherConfigFlag(Boolean advOtherConfigFlag) {
		this.advOtherConfigFlag = advOtherConfigFlag;
		return this;
	}

	/**
	 * Get the value placed in the "Home agent" (H) flag field of Router Advertisement messages on this interface (see {{bibref|RFC3775|Section 7.1}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAdvMobileAgentFlag() {
		return advMobileAgentFlag;
	}

	/**
	 * Set the value placed in the "Home agent" (H) flag field of Router Advertisement messages on this interface (see {{bibref|RFC3775|Section 7.1}}).
	 *
	 * @since 2.2
	 * @param advMobileAgentFlag the input value
	 */
	public void  setAdvMobileAgentFlag(Boolean advMobileAgentFlag) {
		this.advMobileAgentFlag = advMobileAgentFlag;
	}

	/**
	 * Set the value placed in the "Home agent" (H) flag field of Router Advertisement messages on this interface (see {{bibref|RFC3775|Section 7.1}}).
	 *
	 * @since 2.2
	 * @param advMobileAgentFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvMobileAgentFlag(Boolean advMobileAgentFlag) {
		this.advMobileAgentFlag = advMobileAgentFlag;
		return this;
	}

	/**
	 * Get the value placed in the "Default Router Preference" (Prf) field of Router Advertisement messages on this interface, as defined in {{bibref|RFC4191|Section 2.2}}. {{enum}}

          Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getAdvPreferredRouterFlag() {
		return advPreferredRouterFlag;
	}

	/**
	 * Set the value placed in the "Default Router Preference" (Prf) field of Router Advertisement messages on this interface, as defined in {{bibref|RFC4191|Section 2.2}}. {{enum}}

          Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @param advPreferredRouterFlag the input value
	 */
	public void  setAdvPreferredRouterFlag(String advPreferredRouterFlag) {
		this.advPreferredRouterFlag = advPreferredRouterFlag;
	}

	/**
	 * Set the value placed in the "Default Router Preference" (Prf) field of Router Advertisement messages on this interface, as defined in {{bibref|RFC4191|Section 2.2}}. {{enum}}

          Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @param advPreferredRouterFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvPreferredRouterFlag(String advPreferredRouterFlag) {
		this.advPreferredRouterFlag = advPreferredRouterFlag;
		return this;
	}

	/**
	 * Get the value placed in the "Proxy" (P) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4389|Section 4.1.3.3}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAdvNDProxyFlag() {
		return advNDProxyFlag;
	}

	/**
	 * Set the value placed in the "Proxy" (P) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4389|Section 4.1.3.3}}).
	 *
	 * @since 2.2
	 * @param advNDProxyFlag the input value
	 */
	public void  setAdvNDProxyFlag(Boolean advNDProxyFlag) {
		this.advNDProxyFlag = advNDProxyFlag;
	}

	/**
	 * Set the value placed in the "Proxy" (P) flag field of Router Advertisement messages on this interface (see {{bibref|RFC4389|Section 4.1.3.3}}).
	 *
	 * @since 2.2
	 * @param advNDProxyFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvNDProxyFlag(Boolean advNDProxyFlag) {
		this.advNDProxyFlag = advNDProxyFlag;
		return this;
	}

	/**
	 * Get the value placed in MTU options of Router Advertisement messages on this interface. A value of zero indicates that no MTU options are included (see {{bibref|RFC4861|Section 4.6.4}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getAdvLinkMTU() {
		return advLinkMTU;
	}

	/**
	 * Set the value placed in MTU options of Router Advertisement messages on this interface. A value of zero indicates that no MTU options are included (see {{bibref|RFC4861|Section 4.6.4}}).
	 *
	 * @since 2.2
	 * @param advLinkMTU the input value
	 */
	public void  setAdvLinkMTU(Long advLinkMTU) {
		this.advLinkMTU = advLinkMTU;
	}

	/**
	 * Set the value placed in MTU options of Router Advertisement messages on this interface. A value of zero indicates that no MTU options are included (see {{bibref|RFC4861|Section 4.6.4}}).
	 *
	 * @since 2.2
	 * @param advLinkMTU the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvLinkMTU(Long advLinkMTU) {
		this.advLinkMTU = advLinkMTU;
		return this;
	}

	/**
	 * Get the value placed in the "Reachable Time" field of Router Advertisement messages on this interface, in milliseconds (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getAdvReachableTime() {
		return advReachableTime;
	}

	/**
	 * Set the value placed in the "Reachable Time" field of Router Advertisement messages on this interface, in milliseconds (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @param advReachableTime the input value
	 */
	public void  setAdvReachableTime(Long advReachableTime) {
		this.advReachableTime = advReachableTime;
	}

	/**
	 * Set the value placed in the "Reachable Time" field of Router Advertisement messages on this interface, in milliseconds (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @param advReachableTime the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvReachableTime(Long advReachableTime) {
		this.advReachableTime = advReachableTime;
		return this;
	}

	/**
	 * Get the value placed in the "Retrans Timer" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getAdvRetransTimer() {
		return advRetransTimer;
	}

	/**
	 * Set the value placed in the "Retrans Timer" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @param advRetransTimer the input value
	 */
	public void  setAdvRetransTimer(Long advRetransTimer) {
		this.advRetransTimer = advRetransTimer;
	}

	/**
	 * Set the value placed in the "Retrans Timer" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).
	 *
	 * @since 2.2
	 * @param advRetransTimer the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvRetransTimer(Long advRetransTimer) {
		this.advRetransTimer = advRetransTimer;
		return this;
	}

	/**
	 * Get the value placed in the "Cur Hop Limit" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).

          Note: The default can be overridden with the value specified in {{bibref|RFC3232}} that was in effect at the time of implementation.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getAdvCurHopLimit() {
		return advCurHopLimit;
	}

	/**
	 * Set the value placed in the "Cur Hop Limit" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).

          Note: The default can be overridden with the value specified in {{bibref|RFC3232}} that was in effect at the time of implementation.
	 *
	 * @since 2.2
	 * @param advCurHopLimit the input value
	 */
	public void  setAdvCurHopLimit(Long advCurHopLimit) {
		this.advCurHopLimit = advCurHopLimit;
	}

	/**
	 * Set the value placed in the "Cur Hop Limit" field of Router Advertisement messages on this interface (see {{bibref|RFC4861|Section 4.2}}).

          The value zero means unspecified (by the router).

          Note: The default can be overridden with the value specified in {{bibref|RFC3232}} that was in effect at the time of implementation.
	 *
	 * @since 2.2
	 * @param advCurHopLimit the input value
	 * @return this instance
	 */
	public InterfaceSetting withAdvCurHopLimit(Long advCurHopLimit) {
		this.advCurHopLimit = advCurHopLimit;
		return this;
	}

	/**
	 * Get the this object specifies the options in a Router Advertisement (RA) message {{bibref|RFC4861|Section 4.6}}. {{object}} entries are created for use in sending Router Advertisements (enabled options MUST be included in RA messages sent). This includes support for sending DNS information in the RA message as described in {{bibref|RFC6106}}.

        This table is intended only for options that are not modeled elsewhere. For example, it is not appropriate for the MTU option (which is modeled via {{param|#.AdvLinkMTU}}).
	 *
	 * @return the value
	 */
	public Collection<Option> getOptions() {
		if (this.options == null){ this.options=new ArrayList<>();}
		return options;
	}

	/**
	 * Set the this object specifies the options in a Router Advertisement (RA) message {{bibref|RFC4861|Section 4.6}}. {{object}} entries are created for use in sending Router Advertisements (enabled options MUST be included in RA messages sent). This includes support for sending DNS information in the RA message as described in {{bibref|RFC6106}}.

        This table is intended only for options that are not modeled elsewhere. For example, it is not appropriate for the MTU option (which is modeled via {{param|#.AdvLinkMTU}}).
	 *
	 * @param options the input value
	 */
	public void  setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * Set the this object specifies the options in a Router Advertisement (RA) message {{bibref|RFC4861|Section 4.6}}. {{object}} entries are created for use in sending Router Advertisements (enabled options MUST be included in RA messages sent). This includes support for sending DNS information in the RA message as described in {{bibref|RFC6106}}.

        This table is intended only for options that are not modeled elsewhere. For example, it is not appropriate for the MTU option (which is modeled via {{param|#.AdvLinkMTU}}).
	 *
	 * @param option the input value
	 * @return this instance
	 */
	public InterfaceSetting withOption(Option option) {
		getOptions().add(option);
		return this;
	}

	//</editor-fold>

}