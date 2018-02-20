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
package org.broadbandforum.tr181.device.optical;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.Dbm1000;
import org.broadbandforum.tr181.device.optical._interface.Stats;

	/**
	 * Optical interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  This table models physical optical interfaces.
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.Optical.Interface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"}, functional = false)})
@XmlRootElement(name = "Device.Optical.Interface")
@XmlType(name = "Device.Optical.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * Enables or disables the optical interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the optical interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The textual name of the optical interface as assigned by the CPE.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the optical interface entered its current operational state.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
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
	 * @since 2.4
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * Current measurement of total downstream optical signal level.

          {{datatype|expand}}

          Valid values are -65.536 dBm (coded as -65536), to 65.534 dBm (coded as 65534) in 0.002 dB increments.

          This parameter is based on ''Optical signal level'' from {{bibref|G.988|Section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "OpticalSignalLevel")
	public Dbm1000 opticalSignalLevel;
	/**
	 * Optical level that is used to declare the downstream low received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Lower optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "LowerOpticalThreshold")
	public Dbm1000 lowerOpticalThreshold;
	/**
	 * Optical level that is used to declare the downstream high received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Upper optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "UpperOpticalThreshold")
	public Dbm1000 upperOpticalThreshold;
	/**
	 * Current measurement of mean optical launch power.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Transmit optical level'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "TransmitOpticalLevel")
	public Dbm1000 transmitOpticalLevel;
	/**
	 * Minimum mean optical launch power that is used to declare the low transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Lower transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "LowerTransmitPowerThreshold")
	public Dbm1000 lowerTransmitPowerThreshold;
	/**
	 * Maximum mean optical launch power that is used to declare the high transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Upper transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "UpperTransmitPowerThreshold")
	public Dbm1000 upperTransmitPowerThreshold;
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
	 * Get the enables or disables the optical interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the optical interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the optical interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the optical interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the optical interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the optical interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
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
	 * @since 2.4
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 * @return this instance
	 */
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the optical interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the optical interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the optical interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the optical interface entered its current operational state.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the optical interface entered its current operational state.
	 *
	 * @since 2.4
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the optical interface entered its current operational state.
	 *
	 * @since 2.4
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
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
	 * @since 2.4
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
	 * @since 2.4
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
	 * @since 2.4
	 * @param upstream the input value
	 * @return this instance
	 */
	public Interface withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get the current measurement of total downstream optical signal level.

          {{datatype|expand}}

          Valid values are -65.536 dBm (coded as -65536), to 65.534 dBm (coded as 65534) in 0.002 dB increments.

          This parameter is based on ''Optical signal level'' from {{bibref|G.988|Section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getOpticalSignalLevel() {
		return opticalSignalLevel;
	}

	/**
	 * Set the current measurement of total downstream optical signal level.

          {{datatype|expand}}

          Valid values are -65.536 dBm (coded as -65536), to 65.534 dBm (coded as 65534) in 0.002 dB increments.

          This parameter is based on ''Optical signal level'' from {{bibref|G.988|Section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param opticalSignalLevel the input value
	 */
	public void  setOpticalSignalLevel(Dbm1000 opticalSignalLevel) {
		this.opticalSignalLevel = opticalSignalLevel;
	}

	/**
	 * Set the current measurement of total downstream optical signal level.

          {{datatype|expand}}

          Valid values are -65.536 dBm (coded as -65536), to 65.534 dBm (coded as 65534) in 0.002 dB increments.

          This parameter is based on ''Optical signal level'' from {{bibref|G.988|Section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param opticalSignalLevel the input value
	 * @return this instance
	 */
	public Interface withOpticalSignalLevel(Dbm1000 opticalSignalLevel) {
		this.opticalSignalLevel = opticalSignalLevel;
		return this;
	}

	/**
	 * Get the optical level that is used to declare the downstream low received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Lower optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getLowerOpticalThreshold() {
		return lowerOpticalThreshold;
	}

	/**
	 * Set the optical level that is used to declare the downstream low received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Lower optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param lowerOpticalThreshold the input value
	 */
	public void  setLowerOpticalThreshold(Dbm1000 lowerOpticalThreshold) {
		this.lowerOpticalThreshold = lowerOpticalThreshold;
	}

	/**
	 * Set the optical level that is used to declare the downstream low received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Lower optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param lowerOpticalThreshold the input value
	 * @return this instance
	 */
	public Interface withLowerOpticalThreshold(Dbm1000 lowerOpticalThreshold) {
		this.lowerOpticalThreshold = lowerOpticalThreshold;
		return this;
	}

	/**
	 * Get the optical level that is used to declare the downstream high received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Upper optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getUpperOpticalThreshold() {
		return upperOpticalThreshold;
	}

	/**
	 * Set the optical level that is used to declare the downstream high received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Upper optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param upperOpticalThreshold the input value
	 */
	public void  setUpperOpticalThreshold(Dbm1000 upperOpticalThreshold) {
		this.upperOpticalThreshold = upperOpticalThreshold;
	}

	/**
	 * Set the optical level that is used to declare the downstream high received optical power alarm.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Upper optical threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param upperOpticalThreshold the input value
	 * @return this instance
	 */
	public Interface withUpperOpticalThreshold(Dbm1000 upperOpticalThreshold) {
		this.upperOpticalThreshold = upperOpticalThreshold;
		return this;
	}

	/**
	 * Get the current measurement of mean optical launch power.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Transmit optical level'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getTransmitOpticalLevel() {
		return transmitOpticalLevel;
	}

	/**
	 * Set the current measurement of mean optical launch power.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Transmit optical level'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param transmitOpticalLevel the input value
	 */
	public void  setTransmitOpticalLevel(Dbm1000 transmitOpticalLevel) {
		this.transmitOpticalLevel = transmitOpticalLevel;
	}

	/**
	 * Set the current measurement of mean optical launch power.

          {{datatype|expand}}

          Valid values are -127.5 dBm (coded as -127500) to 0 dBm (coded as 0) in 0.5 dB increments.  The value -127500 indicates the device's internal policy.

          This parameter is based on ''Transmit optical level'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param transmitOpticalLevel the input value
	 * @return this instance
	 */
	public Interface withTransmitOpticalLevel(Dbm1000 transmitOpticalLevel) {
		this.transmitOpticalLevel = transmitOpticalLevel;
		return this;
	}

	/**
	 * Get the minimum mean optical launch power that is used to declare the low transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Lower transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getLowerTransmitPowerThreshold() {
		return lowerTransmitPowerThreshold;
	}

	/**
	 * Set the minimum mean optical launch power that is used to declare the low transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Lower transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param lowerTransmitPowerThreshold the input value
	 */
	public void  setLowerTransmitPowerThreshold(Dbm1000 lowerTransmitPowerThreshold) {
		this.lowerTransmitPowerThreshold = lowerTransmitPowerThreshold;
	}

	/**
	 * Set the minimum mean optical launch power that is used to declare the low transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Lower transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param lowerTransmitPowerThreshold the input value
	 * @return this instance
	 */
	public Interface withLowerTransmitPowerThreshold(Dbm1000 lowerTransmitPowerThreshold) {
		this.lowerTransmitPowerThreshold = lowerTransmitPowerThreshold;
		return this;
	}

	/**
	 * Get the maximum mean optical launch power that is used to declare the high transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Upper transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Dbm1000 getUpperTransmitPowerThreshold() {
		return upperTransmitPowerThreshold;
	}

	/**
	 * Set the maximum mean optical launch power that is used to declare the high transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Upper transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param upperTransmitPowerThreshold the input value
	 */
	public void  setUpperTransmitPowerThreshold(Dbm1000 upperTransmitPowerThreshold) {
		this.upperTransmitPowerThreshold = upperTransmitPowerThreshold;
	}

	/**
	 * Set the maximum mean optical launch power that is used to declare the high transmit optical power alarm.

          {{datatype|expand}}

          Valid values are -63.5 dBm (coded as -63500) to +63.5 dBm (coded as 63500) in 0.5 dB increments.  The value -63500 indicates the device's internal policy.

          This parameter is based on ''Upper transmit power threshold'' from {{bibref|G.988|section 9.2.1}}.
	 *
	 * @since 2.4
	 * @param upperTransmitPowerThreshold the input value
	 * @return this instance
	 */
	public Interface withUpperTransmitPowerThreshold(Dbm1000 upperTransmitPowerThreshold) {
		this.upperTransmitPowerThreshold = upperTransmitPowerThreshold;
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