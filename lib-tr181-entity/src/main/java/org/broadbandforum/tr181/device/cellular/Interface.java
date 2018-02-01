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
package org.broadbandforum.tr181.device.cellular;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.cellular._interface.Stats;
import org.broadbandforum.tr181.device.cellular._interface.USIM;

	/**
	 * Cellular interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  Each instance of this object models a cellular modem with a single radio and a single {{object|USIM}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Cellular.Interface.{i}.")
public class Interface {

	/**
	 * Enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface).

          When {{param|Enable}} is changed to {{true}} then {{param}} 

          * SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic.

          * SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed)

          * SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface

          * SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          Because the interface includes layer 1 the {{enum|LowerLayerDown}} value SHOULD never be used.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	@CWMPParameter(activeNotify = "canDeny")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * Indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * International Mobile Station Equipment Identity number, represented as a 15 digit string (digits 0-9).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IMEI")
	@Size(min = 15, max = 15)
	@Pattern(regexp = "[0-9]{15,15}")
	public String imeI;
	/**
	 * Access technologies supported by the interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SupportedAccessTechnologies")
	@XmlList
	public Collection<String> supportedAccessTechnologies;
	/**
	 * Preferred access technology.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PreferredAccessTechnology")
	@CWMPParameter(access = "readWrite")
	public String preferredAccessTechnology = "Auto";
	/**
	 * Access technology that is currently in use.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CurrentAccessTechnology")
	public String currentAccessTechnology;
	/**
	 * List of available networks.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AvailableNetworks")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> availableNetworks;
	/**
	 * Name of the network which will be used, or {{empty}} if the network is selected automatically.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "NetworkRequested")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String networkRequested;
	/**
	 * The value is {{empty}} if no network is found, or if the network specified in {{param|NetworkRequested}} is not found.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "NetworkInUse")
	@Size(max = 64)
	public String networkInUse;
	/**
	 * The received signal strength in dBm. The allowed values depend on {{param|CurrentAccessTechnology}}:

          * For {{enum|GPRS|SupportedAccessTechnologies}}, {{enum|EDGE|SupportedAccessTechnologies}} the range is -111 dBm to -49 dBm

          * For {{enum|UMTS|SupportedAccessTechnologies}}, {{enum|UMTSHSPA|SupportedAccessTechnologies}} the range is -117 dBm to -54 dBm

          * For {{enum|LTE|SupportedAccessTechnologies}} the range is -117 dBm to -25 dBm

          Note: An undetectable signal is indicated by the appropriate lower limit, e.g. -117 dBm for LTE.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RSSI")
	@CWMPParameter(activeNotify = "canDeny", units = "dBm")
	public Integer rssI;
	/**
	 * The current maximum attainable data rate upstream (expressed in Kbps).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UpstreamMaxBitRate")
	public Long upstreamMaxBitRate;
	/**
	 * The current maximum attainable data rate downstream (expressed in Kbps).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DownstreamMaxBitRate")
	public Long downstreamMaxBitRate;
	/**
	 * USIM (Universal Subscriber Identity Module or SIM card) parameters for the interface.
	 */
	@XmlElement(name = "USIM")
	public USIM usiM;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface).

          When {{param|Enable}} is changed to {{true}} then {{param}} 

          * SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic.

          * SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed)

          * SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface

          * SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          Because the interface includes layer 1 the {{enum|LowerLayerDown}} value SHOULD never be used.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface).

          When {{param|Enable}} is changed to {{true}} then {{param}} 

          * SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic.

          * SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed)

          * SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface

          * SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          Because the interface includes layer 1 the {{enum|LowerLayerDown}} value SHOULD never be used.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface).

          When {{param|Enable}} is changed to {{true}} then {{param}} 

          * SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic.

          * SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed)

          * SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface

          * SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          Because the interface includes layer 1 the {{enum|LowerLayerDown}} value SHOULD never be used.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.8
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isUpstream() {
		return upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.8
	 * @param upstream the input value
	 */
	public void  setUpstream(Boolean upstream) {
		this.upstream = upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.8
	 * @param upstream the input value
	 * @return this instance
	 */
	public Interface withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get the international Mobile Station Equipment Identity number, represented as a 15 digit string (digits 0-9).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getImeI() {
		return imeI;
	}

	/**
	 * Set the international Mobile Station Equipment Identity number, represented as a 15 digit string (digits 0-9).
	 *
	 * @since 2.8
	 * @param imeI the input value
	 */
	public void  setImeI(String imeI) {
		this.imeI = imeI;
	}

	/**
	 * Set the international Mobile Station Equipment Identity number, represented as a 15 digit string (digits 0-9).
	 *
	 * @since 2.8
	 * @param imeI the input value
	 * @return this instance
	 */
	public Interface withImeI(String imeI) {
		this.imeI = imeI;
		return this;
	}

	/**
	 * Get access technologies supported by the interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getSupportedAccessTechnologies() {
		if (this.supportedAccessTechnologies == null){ this.supportedAccessTechnologies=new ArrayList<>();}
		return supportedAccessTechnologies;
	}

	/**
	 * Set access technologies supported by the interface.
	 *
	 * @since 2.8
	 * @param supportedAccessTechnologies the input value
	 */
	public void  setSupportedAccessTechnologies(Collection<String> supportedAccessTechnologies) {
		this.supportedAccessTechnologies = supportedAccessTechnologies;
	}

	/**
	 * Set access technologies supported by the interface.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withSupportedAccessTechnologies(String string) {
		getSupportedAccessTechnologies().add(string);
		return this;
	}

	/**
	 * Get the preferred access technology.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPreferredAccessTechnology() {
		return preferredAccessTechnology;
	}

	/**
	 * Set the preferred access technology.
	 *
	 * @since 2.8
	 * @param preferredAccessTechnology the input value
	 */
	public void  setPreferredAccessTechnology(String preferredAccessTechnology) {
		this.preferredAccessTechnology = preferredAccessTechnology;
	}

	/**
	 * Set the preferred access technology.
	 *
	 * @since 2.8
	 * @param preferredAccessTechnology the input value
	 * @return this instance
	 */
	public Interface withPreferredAccessTechnology(String preferredAccessTechnology) {
		this.preferredAccessTechnology = preferredAccessTechnology;
		return this;
	}

	/**
	 * Get access technology that is currently in use.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getCurrentAccessTechnology() {
		return currentAccessTechnology;
	}

	/**
	 * Set access technology that is currently in use.
	 *
	 * @since 2.8
	 * @param currentAccessTechnology the input value
	 */
	public void  setCurrentAccessTechnology(String currentAccessTechnology) {
		this.currentAccessTechnology = currentAccessTechnology;
	}

	/**
	 * Set access technology that is currently in use.
	 *
	 * @since 2.8
	 * @param currentAccessTechnology the input value
	 * @return this instance
	 */
	public Interface withCurrentAccessTechnology(String currentAccessTechnology) {
		this.currentAccessTechnology = currentAccessTechnology;
		return this;
	}

	/**
	 * Get the list of available networks.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getAvailableNetworks() {
		if (this.availableNetworks == null){ this.availableNetworks=new ArrayList<>();}
		return availableNetworks;
	}

	/**
	 * Set the list of available networks.
	 *
	 * @since 2.8
	 * @param availableNetworks the input value
	 */
	public void  setAvailableNetworks(Collection<String> availableNetworks) {
		this.availableNetworks = availableNetworks;
	}

	/**
	 * Set the list of available networks.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withAvailableNetworks(String string) {
		getAvailableNetworks().add(string);
		return this;
	}

	/**
	 * Get the name of the network which will be used, or {{empty}} if the network is selected automatically.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getNetworkRequested() {
		return networkRequested;
	}

	/**
	 * Set the name of the network which will be used, or {{empty}} if the network is selected automatically.
	 *
	 * @since 2.8
	 * @param networkRequested the input value
	 */
	public void  setNetworkRequested(String networkRequested) {
		this.networkRequested = networkRequested;
	}

	/**
	 * Set the name of the network which will be used, or {{empty}} if the network is selected automatically.
	 *
	 * @since 2.8
	 * @param networkRequested the input value
	 * @return this instance
	 */
	public Interface withNetworkRequested(String networkRequested) {
		this.networkRequested = networkRequested;
		return this;
	}

	/**
	 * Get the value is {{empty}} if no network is found, or if the network specified in {{param|NetworkRequested}} is not found.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getNetworkInUse() {
		return networkInUse;
	}

	/**
	 * Set the value is {{empty}} if no network is found, or if the network specified in {{param|NetworkRequested}} is not found.
	 *
	 * @since 2.8
	 * @param networkInUse the input value
	 */
	public void  setNetworkInUse(String networkInUse) {
		this.networkInUse = networkInUse;
	}

	/**
	 * Set the value is {{empty}} if no network is found, or if the network specified in {{param|NetworkRequested}} is not found.
	 *
	 * @since 2.8
	 * @param networkInUse the input value
	 * @return this instance
	 */
	public Interface withNetworkInUse(String networkInUse) {
		this.networkInUse = networkInUse;
		return this;
	}

	/**
	 * Get the received signal strength in dBm. The allowed values depend on {{param|CurrentAccessTechnology}}:

          * For {{enum|GPRS|SupportedAccessTechnologies}}, {{enum|EDGE|SupportedAccessTechnologies}} the range is -111 dBm to -49 dBm

          * For {{enum|UMTS|SupportedAccessTechnologies}}, {{enum|UMTSHSPA|SupportedAccessTechnologies}} the range is -117 dBm to -54 dBm

          * For {{enum|LTE|SupportedAccessTechnologies}} the range is -117 dBm to -25 dBm

          Note: An undetectable signal is indicated by the appropriate lower limit, e.g. -117 dBm for LTE.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getRssI() {
		return rssI;
	}

	/**
	 * Set the received signal strength in dBm. The allowed values depend on {{param|CurrentAccessTechnology}}:

          * For {{enum|GPRS|SupportedAccessTechnologies}}, {{enum|EDGE|SupportedAccessTechnologies}} the range is -111 dBm to -49 dBm

          * For {{enum|UMTS|SupportedAccessTechnologies}}, {{enum|UMTSHSPA|SupportedAccessTechnologies}} the range is -117 dBm to -54 dBm

          * For {{enum|LTE|SupportedAccessTechnologies}} the range is -117 dBm to -25 dBm

          Note: An undetectable signal is indicated by the appropriate lower limit, e.g. -117 dBm for LTE.
	 *
	 * @since 2.8
	 * @param rssI the input value
	 */
	public void  setRssI(Integer rssI) {
		this.rssI = rssI;
	}

	/**
	 * Set the received signal strength in dBm. The allowed values depend on {{param|CurrentAccessTechnology}}:

          * For {{enum|GPRS|SupportedAccessTechnologies}}, {{enum|EDGE|SupportedAccessTechnologies}} the range is -111 dBm to -49 dBm

          * For {{enum|UMTS|SupportedAccessTechnologies}}, {{enum|UMTSHSPA|SupportedAccessTechnologies}} the range is -117 dBm to -54 dBm

          * For {{enum|LTE|SupportedAccessTechnologies}} the range is -117 dBm to -25 dBm

          Note: An undetectable signal is indicated by the appropriate lower limit, e.g. -117 dBm for LTE.
	 *
	 * @since 2.8
	 * @param rssI the input value
	 * @return this instance
	 */
	public Interface withRssI(Integer rssI) {
		this.rssI = rssI;
		return this;
	}

	/**
	 * Get the current maximum attainable data rate upstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getUpstreamMaxBitRate() {
		return upstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate upstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @param upstreamMaxBitRate the input value
	 */
	public void  setUpstreamMaxBitRate(Long upstreamMaxBitRate) {
		this.upstreamMaxBitRate = upstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate upstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @param upstreamMaxBitRate the input value
	 * @return this instance
	 */
	public Interface withUpstreamMaxBitRate(Long upstreamMaxBitRate) {
		this.upstreamMaxBitRate = upstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the current maximum attainable data rate downstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getDownstreamMaxBitRate() {
		return downstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate downstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @param downstreamMaxBitRate the input value
	 */
	public void  setDownstreamMaxBitRate(Long downstreamMaxBitRate) {
		this.downstreamMaxBitRate = downstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate downstream (expressed in Kbps).
	 *
	 * @since 2.8
	 * @param downstreamMaxBitRate the input value
	 * @return this instance
	 */
	public Interface withDownstreamMaxBitRate(Long downstreamMaxBitRate) {
		this.downstreamMaxBitRate = downstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the usiM (Universal Subscriber Identity Module or SIM card) parameters for the interface.
	 *
	 * @return the value
	 */
	public USIM getUsiM() {
		return usiM;
	}

	/**
	 * Set the usiM (Universal Subscriber Identity Module or SIM card) parameters for the interface.
	 *
	 * @param usiM the input value
	 */
	public void  setUsiM(USIM usiM) {
		this.usiM = usiM;
	}

	/**
	 * Set the usiM (Universal Subscriber Identity Module or SIM card) parameters for the interface.
	 *
	 * @param usiM the input value
	 * @return this instance
	 */
	public Interface withUsiM(USIM usiM) {
		this.usiM = usiM;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}