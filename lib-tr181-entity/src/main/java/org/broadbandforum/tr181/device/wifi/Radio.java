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
package org.broadbandforum.tr181.device.wifi;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.wifi.radio.Stats;

	/**
	 * This object models an 802.11 wireless radio on a device (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        If the device can establish more than one connection simultaneously (e.g. a dual radio device), a separate {{object}} instance MUST be used for each physical radio of the device. See {{bibref|TR-181i2|Appendix III.1}} for additional information.

        Note: A dual-band single-radio device (e.g. an 802.11a/b/g radio) can be configured to operate at 2.4 or 5 GHz frequency bands, but only a single frequency band is used to transmit/receive at a given time. Therefore, a single {{object}} instance is used even for a dual-band radio.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.Radio.{i}.")
public class Radio {

	/**
	 * Enables or disables the radio.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the radio (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the radio as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the radio entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * The maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * {{list}} List items indicate the frequency bands at which the radio can operate.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SupportedFrequencyBands")
	@XmlList
	public Collection<String> supportedFrequencyBands;
	/**
	 * Indicates the frequency band at which the radio is operating. 

          If the radio supports multiple bands, and {{param}} is changed, then all parameters whose value is not valid for the new frequency band (e.g. {{param|Channel}}) MUST be set to a valid value (according to some CPE vendor-specific behavior).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperatingFrequencyBand")
	@CWMPParameter(access = "readWrite")
	public String operatingFrequencyBand;
	/**
	 * {{list}} List items indicate which IEEE 802.11 standards this {{object}} instance can support simultaneously, in the frequency band specified by {{param|OperatingFrequencyBand}}.  

Enumerated value must be one of [a, b, g, n, ac]

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SupportedStandards")
	@XmlList
	public Collection<String> supportedStandards;
	/**
	 * {{list}} List items indicate which IEEE 802.11 standard this {{object}} instance is configured for.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperatingStandards")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> operatingStandards;
	/**
	 * {{list}} List items represent possible radio channels for the wireless standard (a, b, g, n) and the regulatory domain. 

          Ranges in the form "n-m" are permitted.

          For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PossibleChannels")
	@Size(max = 1024)
	@XmlList
	public Collection<String> possibleChannels;
	/**
	 * {{list}} List items represent channels that the radio determines to be currently in use (including any that it is using itself).

          Ranges in the form "n-m" are permitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChannelsInUse")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 1024)
	@XmlList
	public Collection<String> channelsInUse;
	/**
	 * The current radio channel used by the connection. To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

          Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.

          Note: Valid {{param}} values depend on the {{param|OperatingFrequencyBand}} and {{param|RegulatoryDomain}} values specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Channel")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 255)
	public Long channel;
	/**
	 * Indicates whether automatic channel selection is supported by this radio. If {{false}}, then {{param|AutoChannelEnable}} MUST be {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoChannelSupported")
	public Boolean autoChannelSupported;
	/**
	 * Enable or disable automatic channel selection.

          Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

          Set to {{true}} to enable the automatic channel selection procedure. This procedure MUST automatically select the channel, and MAY also change it subsequently.

          {{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

          Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoChannelEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean autoChannelEnable;
	/**
	 * The time period in seconds between two consecutive automatic channel selections. A value of 0 means that the automatic channel selection is done only at boot time.

          This parameter is significant only if {{param|AutoChannelEnable}} is set to {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoChannelRefreshPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long autoChannelRefreshPeriod;
	/**
	 * The channel bandwidth (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperatingChannelBandwidth")
	@CWMPParameter(access = "readWrite")
	public String operatingChannelBandwidth;
	/**
	 * The secondary extension channel position, applicable when operating in wide channel mode (i.e. when {{param|OperatingChannelBandwidth}} is set to {{enum|40MHz|OperatingChannelBandwidth}} or {{enum|Auto|OperatingChannelBandwidth}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExtensionChannel")
	@CWMPParameter(access = "readWrite")
	public String extensionChannel;
	/**
	 * The guard interval value between OFDM symbols (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GuardInterval")
	@CWMPParameter(access = "readWrite")
	public String guardInterval;
	/**
	 * The Modulation Coding Scheme index (applicable to 802.11n and 802.11ac specifications only). Values from 0 to 15 MUST be supported ({{bibref|802.11n-2009}}). Values from 0 to 9 MUST be supported for {{bibref|802.11ac-2013}}.  A value of -1 indicates automatic selection of the MCS index.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MCS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 16, max = 31)
	public Integer mcs;
	/**
	 * {{list}} List items represent supported transmit power levels as percentage of full power. For example, "0,25,50,75,100". 

          A -1 item indicates auto mode (automatic decision by CPE). Auto mode allows the ''Radio'' to adjust transmit power accordingly. For example, this can be useful for power-save modes such as EU-CoC, where the ''Radio'' can adjust power according to activity in the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmitPowerSupported")
	@Size(min = -1, max = 100)
	public Integer transmitPowerSupported;
	/**
	 * Indicates the current transmit power level as a percentage of full power. The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter. A value of -1 indicates auto mode (automatic decision by CPE).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmitPower")
	@CWMPParameter(access = "readWrite", units = "percentage")
	@Size(min = -1, max = 100)
	public Integer transmitPower;
	/**
	 * Indicates whether IEEE 802.11h {{bibref|802.11h-2003}} functionality is supported by this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported (i.e. {{param|SupportedFrequencyBands}} includes {{enum|5GHz|SupportedFrequencyBands}} and {{param|SupportedStandards}} includes {{enum|a|SupportedStandards}} and/or {{enum|n|SupportedStandards}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IEEE80211hSupported")
	public Boolean ieeE80211hSupported;
	/**
	 * Indicates whether IEEE 802.11h functionality is enabled on this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported and enabled (i.e. {{param|OperatingFrequencyBand}} is {{enum|5GHz|OperatingFrequencyBand}} and {{param|OperatingStandards}} includes {{enum|a|OperatingStandards}} and/or {{enum|n|OperatingStandards}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IEEE80211hEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean ieeE80211hEnabled;
	/**
	 * The 802.11d Regulatory Domain. First two octets are {{bibref|ISO3166-1}} two-character country code. The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegulatoryDomain")
	@CWMPParameter(access = "readWrite")
	@Size(min = 3, max = 3)
	@Pattern(regexp = "[A-Z][A-Z][ OI]")
	public String regulatoryDomain;
	/**
	 * The maximum number of retransmissions of a short packet i.e. a packet that is no longer than the {{param|RTSThreshold}}. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''  {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RetryLimit")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long retryLimit;
	/**
	 * A request for the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.3}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CCARequest")
	@CWMPParameter(access = "readWrite")
	public byte[] ccaRequest;
	/**
	 * The clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.3}}.

          When read, the value of this parameter MUST correspond to {{param|CCARequest}}.  How this is achieved is a local matter to the CPE.

          If this parameter is read before a CCARequest has been issued, then its value is {{empty}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CCAReport")
	public byte[] ccaReport;
	/**
	 * A request for a received power indicator (RPI) histogram in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.4}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RPIHistogramRequest")
	@CWMPParameter(access = "readWrite")
	public byte[] rpiHistogramRequest;
	/**
	 * Received power indicator (RPI) histogram report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.4}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RPIHistogramReport")
	public byte[] rpiHistogramReport;
	/**
	 * This specifies the current maximum size, in octets, of the MPDU that can be delivered to the PHY. This parameter is based on ''dot11FragmentationThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "FragmentationThreshold")
	@CWMPParameter(access = "readWrite", units = "octets")
	public Long fragmentationThreshold;
	/**
	 * This indicates the number of octets in an MPDU, below which an RTS/CTS handshake is not performed. This parameter is based on ''dot11RTSThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RTSThreshold")
	@CWMPParameter(access = "readWrite", units = "octets")
	public Long rtsThreshold;
	/**
	 * This indicates the maximum number of transmission attempts of a frame, the length of which is greater than {{param|RTSThreshold}}, that will be made before a failure condition is indicated. This parameter is based on ''dot11LongRetryLimit'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LongRetryLimit")
	@CWMPParameter(access = "readWrite")
	public Long longRetryLimit;
	/**
	 * Time interval between transmitting beacons (expressed in milliseconds). This parameter is based on ''dot11BeaconPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BeaconPeriod")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long beaconPeriod;
	/**
	 * This specifies the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM Count field is 0. This parameter is based on ''dot11DTIMPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DTIMPeriod")
	@CWMPParameter(access = "readWrite")
	public Long dtiMPeriod;
	/**
	 * This determines whether or not packet aggregation (commonly called "frame aggregation") is enabled. This applies only to 802.11n.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketAggregationEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean packetAggregationEnable;
	/**
	 * The type of preamble. Longer preambles (more overhead) are needed by 802.11g to coexist with legacy systems 802.11 and 802.11b.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PreambleType")
	@CWMPParameter(access = "readWrite")
	public String preambleType;
	/**
	 * {{list}} The set of data rates, in ''Mbps'', that have to be supported by all stations that desire to join this BSS. The stations have to be able to receive and transmit at each of the data rates listed in {{param}}. For example, a value of "1,2", indicates that stations support 1 Mbps and 2 Mbps. Most control packets use a data rate in {{param}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BasicDataTransmitRates")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> basicDataTransmitRates;
	/**
	 * {{list}} Maximum access point data transmit rates in ''Mbps'' for unicast frames (a superset of {{param|BasicDataTransmitRates}}). Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OperationalDataTransmitRates")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> operationalDataTransmitRates;
	/**
	 * {{list}} Data transmit rates in ''Mbps'' for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}). Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SupportedDataTransmitRates")
	@XmlList
	public Collection<String> supportedDataTransmitRates;
	/**
	 * Throughput statistics for this interface. Packet counters here count 802.11 WiFi frames. See {{bibref|TR-181i2a5|Appendix III}} for further details. The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2a5|Section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Radio() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the radio.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the radio.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the radio.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Radio withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the radio (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the radio (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the radio (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Radio withStatus(String status) {
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
	public Radio withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the radio as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the radio as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the radio as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Radio withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the radio entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the radio entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the radio entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Radio withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withLowerLayers(String string) {
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @param upstream the input value
	 * @return this instance
	 */
	public Radio withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public Radio withMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate the frequency bands at which the radio can operate.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSupportedFrequencyBands() {
		if (this.supportedFrequencyBands == null){ this.supportedFrequencyBands=new ArrayList<>();}
		return supportedFrequencyBands;
	}

	/**
	 * Set the {{list}} List items indicate the frequency bands at which the radio can operate.
	 *
	 * @since 2.0
	 * @param supportedFrequencyBands the input value
	 */
	public void  setSupportedFrequencyBands(Collection<String> supportedFrequencyBands) {
		this.supportedFrequencyBands = supportedFrequencyBands;
	}

	/**
	 * Set the {{list}} List items indicate the frequency bands at which the radio can operate.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withSupportedFrequencyBands(String string) {
		getSupportedFrequencyBands().add(string);
		return this;
	}

	/**
	 * Get the indicates the frequency band at which the radio is operating. 

          If the radio supports multiple bands, and {{param}} is changed, then all parameters whose value is not valid for the new frequency band (e.g. {{param|Channel}}) MUST be set to a valid value (according to some CPE vendor-specific behavior).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOperatingFrequencyBand() {
		return operatingFrequencyBand;
	}

	/**
	 * Set the indicates the frequency band at which the radio is operating. 

          If the radio supports multiple bands, and {{param}} is changed, then all parameters whose value is not valid for the new frequency band (e.g. {{param|Channel}}) MUST be set to a valid value (according to some CPE vendor-specific behavior).
	 *
	 * @since 2.0
	 * @param operatingFrequencyBand the input value
	 */
	public void  setOperatingFrequencyBand(String operatingFrequencyBand) {
		this.operatingFrequencyBand = operatingFrequencyBand;
	}

	/**
	 * Set the indicates the frequency band at which the radio is operating. 

          If the radio supports multiple bands, and {{param}} is changed, then all parameters whose value is not valid for the new frequency band (e.g. {{param|Channel}}) MUST be set to a valid value (according to some CPE vendor-specific behavior).
	 *
	 * @since 2.0
	 * @param operatingFrequencyBand the input value
	 * @return this instance
	 */
	public Radio withOperatingFrequencyBand(String operatingFrequencyBand) {
		this.operatingFrequencyBand = operatingFrequencyBand;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which IEEE 802.11 standards this {{object}} instance can support simultaneously, in the frequency band specified by {{param|OperatingFrequencyBand}}.  

Enumerated value must be one of [a, b, g, n, ac]

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSupportedStandards() {
		if (this.supportedStandards == null){ this.supportedStandards=new ArrayList<>();}
		return supportedStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standards this {{object}} instance can support simultaneously, in the frequency band specified by {{param|OperatingFrequencyBand}}.  

Enumerated value must be one of [a, b, g, n, ac]

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.
	 *
	 * @since 2.0
	 * @param supportedStandards the input value
	 */
	public void  setSupportedStandards(Collection<String> supportedStandards) {
		this.supportedStandards = supportedStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standards this {{object}} instance can support simultaneously, in the frequency band specified by {{param|OperatingFrequencyBand}}.  

Enumerated value must be one of [a, b, g, n, ac]

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withSupportedStandards(String string) {
		getSupportedStandards().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which IEEE 802.11 standard this {{object}} instance is configured for.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getOperatingStandards() {
		if (this.operatingStandards == null){ this.operatingStandards=new ArrayList<>();}
		return operatingStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standard this {{object}} instance is configured for.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.0
	 * @param operatingStandards the input value
	 */
	public void  setOperatingStandards(Collection<String> operatingStandards) {
		this.operatingStandards = operatingStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standard this {{object}} instance is configured for.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withOperatingStandards(String string) {
		getOperatingStandards().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent possible radio channels for the wireless standard (a, b, g, n) and the regulatory domain. 

          Ranges in the form "n-m" are permitted.

          For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPossibleChannels() {
		if (this.possibleChannels == null){ this.possibleChannels=new ArrayList<>();}
		return possibleChannels;
	}

	/**
	 * Set the {{list}} List items represent possible radio channels for the wireless standard (a, b, g, n) and the regulatory domain. 

          Ranges in the form "n-m" are permitted.

          For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 2.0
	 * @param possibleChannels the input value
	 */
	public void  setPossibleChannels(Collection<String> possibleChannels) {
		this.possibleChannels = possibleChannels;
	}

	/**
	 * Set the {{list}} List items represent possible radio channels for the wireless standard (a, b, g, n) and the regulatory domain. 

          Ranges in the form "n-m" are permitted.

          For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withPossibleChannels(String string) {
		getPossibleChannels().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items represent channels that the radio determines to be currently in use (including any that it is using itself).

          Ranges in the form "n-m" are permitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getChannelsInUse() {
		if (this.channelsInUse == null){ this.channelsInUse=new ArrayList<>();}
		return channelsInUse;
	}

	/**
	 * Set the {{list}} List items represent channels that the radio determines to be currently in use (including any that it is using itself).

          Ranges in the form "n-m" are permitted.
	 *
	 * @since 2.0
	 * @param channelsInUse the input value
	 */
	public void  setChannelsInUse(Collection<String> channelsInUse) {
		this.channelsInUse = channelsInUse;
	}

	/**
	 * Set the {{list}} List items represent channels that the radio determines to be currently in use (including any that it is using itself).

          Ranges in the form "n-m" are permitted.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withChannelsInUse(String string) {
		getChannelsInUse().add(string);
		return this;
	}

	/**
	 * Get the current radio channel used by the connection. To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

          Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.

          Note: Valid {{param}} values depend on the {{param|OperatingFrequencyBand}} and {{param|RegulatoryDomain}} values specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getChannel() {
		return channel;
	}

	/**
	 * Set the current radio channel used by the connection. To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

          Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.

          Note: Valid {{param}} values depend on the {{param|OperatingFrequencyBand}} and {{param|RegulatoryDomain}} values specified.
	 *
	 * @since 2.0
	 * @param channel the input value
	 */
	public void  setChannel(Long channel) {
		this.channel = channel;
	}

	/**
	 * Set the current radio channel used by the connection. To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

          Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.

          Note: Valid {{param}} values depend on the {{param|OperatingFrequencyBand}} and {{param|RegulatoryDomain}} values specified.
	 *
	 * @since 2.0
	 * @param channel the input value
	 * @return this instance
	 */
	public Radio withChannel(Long channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * Get the indicates whether automatic channel selection is supported by this radio. If {{false}}, then {{param|AutoChannelEnable}} MUST be {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAutoChannelSupported() {
		return autoChannelSupported;
	}

	/**
	 * Set the indicates whether automatic channel selection is supported by this radio. If {{false}}, then {{param|AutoChannelEnable}} MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param autoChannelSupported the input value
	 */
	public void  setAutoChannelSupported(Boolean autoChannelSupported) {
		this.autoChannelSupported = autoChannelSupported;
	}

	/**
	 * Set the indicates whether automatic channel selection is supported by this radio. If {{false}}, then {{param|AutoChannelEnable}} MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param autoChannelSupported the input value
	 * @return this instance
	 */
	public Radio withAutoChannelSupported(Boolean autoChannelSupported) {
		this.autoChannelSupported = autoChannelSupported;
		return this;
	}

	/**
	 * Get the enable or disable automatic channel selection.

          Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

          Set to {{true}} to enable the automatic channel selection procedure. This procedure MUST automatically select the channel, and MAY also change it subsequently.

          {{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

          Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAutoChannelEnable() {
		return autoChannelEnable;
	}

	/**
	 * Set the enable or disable automatic channel selection.

          Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

          Set to {{true}} to enable the automatic channel selection procedure. This procedure MUST automatically select the channel, and MAY also change it subsequently.

          {{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

          Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 2.0
	 * @param autoChannelEnable the input value
	 */
	public void  setAutoChannelEnable(Boolean autoChannelEnable) {
		this.autoChannelEnable = autoChannelEnable;
	}

	/**
	 * Set the enable or disable automatic channel selection.

          Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

          Set to {{true}} to enable the automatic channel selection procedure. This procedure MUST automatically select the channel, and MAY also change it subsequently.

          {{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

          Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 2.0
	 * @param autoChannelEnable the input value
	 * @return this instance
	 */
	public Radio withAutoChannelEnable(Boolean autoChannelEnable) {
		this.autoChannelEnable = autoChannelEnable;
		return this;
	}

	/**
	 * Get the time period in seconds between two consecutive automatic channel selections. A value of 0 means that the automatic channel selection is done only at boot time.

          This parameter is significant only if {{param|AutoChannelEnable}} is set to {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAutoChannelRefreshPeriod() {
		return autoChannelRefreshPeriod;
	}

	/**
	 * Set the time period in seconds between two consecutive automatic channel selections. A value of 0 means that the automatic channel selection is done only at boot time.

          This parameter is significant only if {{param|AutoChannelEnable}} is set to {{true}}.
	 *
	 * @since 2.0
	 * @param autoChannelRefreshPeriod the input value
	 */
	public void  setAutoChannelRefreshPeriod(Long autoChannelRefreshPeriod) {
		this.autoChannelRefreshPeriod = autoChannelRefreshPeriod;
	}

	/**
	 * Set the time period in seconds between two consecutive automatic channel selections. A value of 0 means that the automatic channel selection is done only at boot time.

          This parameter is significant only if {{param|AutoChannelEnable}} is set to {{true}}.
	 *
	 * @since 2.0
	 * @param autoChannelRefreshPeriod the input value
	 * @return this instance
	 */
	public Radio withAutoChannelRefreshPeriod(Long autoChannelRefreshPeriod) {
		this.autoChannelRefreshPeriod = autoChannelRefreshPeriod;
		return this;
	}

	/**
	 * Get the channel bandwidth (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOperatingChannelBandwidth() {
		return operatingChannelBandwidth;
	}

	/**
	 * Set the channel bandwidth (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @param operatingChannelBandwidth the input value
	 */
	public void  setOperatingChannelBandwidth(String operatingChannelBandwidth) {
		this.operatingChannelBandwidth = operatingChannelBandwidth;
	}

	/**
	 * Set the channel bandwidth (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @param operatingChannelBandwidth the input value
	 * @return this instance
	 */
	public Radio withOperatingChannelBandwidth(String operatingChannelBandwidth) {
		this.operatingChannelBandwidth = operatingChannelBandwidth;
		return this;
	}

	/**
	 * Get the secondary extension channel position, applicable when operating in wide channel mode (i.e. when {{param|OperatingChannelBandwidth}} is set to {{enum|40MHz|OperatingChannelBandwidth}} or {{enum|Auto|OperatingChannelBandwidth}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getExtensionChannel() {
		return extensionChannel;
	}

	/**
	 * Set the secondary extension channel position, applicable when operating in wide channel mode (i.e. when {{param|OperatingChannelBandwidth}} is set to {{enum|40MHz|OperatingChannelBandwidth}} or {{enum|Auto|OperatingChannelBandwidth}}).
	 *
	 * @since 2.0
	 * @param extensionChannel the input value
	 */
	public void  setExtensionChannel(String extensionChannel) {
		this.extensionChannel = extensionChannel;
	}

	/**
	 * Set the secondary extension channel position, applicable when operating in wide channel mode (i.e. when {{param|OperatingChannelBandwidth}} is set to {{enum|40MHz|OperatingChannelBandwidth}} or {{enum|Auto|OperatingChannelBandwidth}}).
	 *
	 * @since 2.0
	 * @param extensionChannel the input value
	 * @return this instance
	 */
	public Radio withExtensionChannel(String extensionChannel) {
		this.extensionChannel = extensionChannel;
		return this;
	}

	/**
	 * Get the guard interval value between OFDM symbols (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getGuardInterval() {
		return guardInterval;
	}

	/**
	 * Set the guard interval value between OFDM symbols (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @param guardInterval the input value
	 */
	public void  setGuardInterval(String guardInterval) {
		this.guardInterval = guardInterval;
	}

	/**
	 * Set the guard interval value between OFDM symbols (applicable to 802.11n and 802.11ac specifications only).
	 *
	 * @since 2.0
	 * @param guardInterval the input value
	 * @return this instance
	 */
	public Radio withGuardInterval(String guardInterval) {
		this.guardInterval = guardInterval;
		return this;
	}

	/**
	 * Get the Modulation Coding Scheme index (applicable to 802.11n and 802.11ac specifications only). Values from 0 to 15 MUST be supported ({{bibref|802.11n-2009}}). Values from 0 to 9 MUST be supported for {{bibref|802.11ac-2013}}.  A value of -1 indicates automatic selection of the MCS index.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMcs() {
		return mcs;
	}

	/**
	 * Set the Modulation Coding Scheme index (applicable to 802.11n and 802.11ac specifications only). Values from 0 to 15 MUST be supported ({{bibref|802.11n-2009}}). Values from 0 to 9 MUST be supported for {{bibref|802.11ac-2013}}.  A value of -1 indicates automatic selection of the MCS index.
	 *
	 * @since 2.0
	 * @param mcs the input value
	 */
	public void  setMcs(Integer mcs) {
		this.mcs = mcs;
	}

	/**
	 * Set the Modulation Coding Scheme index (applicable to 802.11n and 802.11ac specifications only). Values from 0 to 15 MUST be supported ({{bibref|802.11n-2009}}). Values from 0 to 9 MUST be supported for {{bibref|802.11ac-2013}}.  A value of -1 indicates automatic selection of the MCS index.
	 *
	 * @since 2.0
	 * @param mcs the input value
	 * @return this instance
	 */
	public Radio withMcs(Integer mcs) {
		this.mcs = mcs;
		return this;
	}

	/**
	 * Get the {{list}} List items represent supported transmit power levels as percentage of full power. For example, "0,25,50,75,100". 

          A -1 item indicates auto mode (automatic decision by CPE). Auto mode allows the ''Radio'' to adjust transmit power accordingly. For example, this can be useful for power-save modes such as EU-CoC, where the ''Radio'' can adjust power according to activity in the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTransmitPowerSupported() {
		return transmitPowerSupported;
	}

	/**
	 * Set the {{list}} List items represent supported transmit power levels as percentage of full power. For example, "0,25,50,75,100". 

          A -1 item indicates auto mode (automatic decision by CPE). Auto mode allows the ''Radio'' to adjust transmit power accordingly. For example, this can be useful for power-save modes such as EU-CoC, where the ''Radio'' can adjust power according to activity in the CPE.
	 *
	 * @since 2.0
	 * @param transmitPowerSupported the input value
	 */
	public void  setTransmitPowerSupported(Integer transmitPowerSupported) {
		this.transmitPowerSupported = transmitPowerSupported;
	}

	/**
	 * Set the {{list}} List items represent supported transmit power levels as percentage of full power. For example, "0,25,50,75,100". 

          A -1 item indicates auto mode (automatic decision by CPE). Auto mode allows the ''Radio'' to adjust transmit power accordingly. For example, this can be useful for power-save modes such as EU-CoC, where the ''Radio'' can adjust power according to activity in the CPE.
	 *
	 * @since 2.0
	 * @param transmitPowerSupported the input value
	 * @return this instance
	 */
	public Radio withTransmitPowerSupported(Integer transmitPowerSupported) {
		this.transmitPowerSupported = transmitPowerSupported;
		return this;
	}

	/**
	 * Get the indicates the current transmit power level as a percentage of full power. The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter. A value of -1 indicates auto mode (automatic decision by CPE).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTransmitPower() {
		return transmitPower;
	}

	/**
	 * Set the indicates the current transmit power level as a percentage of full power. The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter. A value of -1 indicates auto mode (automatic decision by CPE).
	 *
	 * @since 2.0
	 * @param transmitPower the input value
	 */
	public void  setTransmitPower(Integer transmitPower) {
		this.transmitPower = transmitPower;
	}

	/**
	 * Set the indicates the current transmit power level as a percentage of full power. The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter. A value of -1 indicates auto mode (automatic decision by CPE).
	 *
	 * @since 2.0
	 * @param transmitPower the input value
	 * @return this instance
	 */
	public Radio withTransmitPower(Integer transmitPower) {
		this.transmitPower = transmitPower;
		return this;
	}

	/**
	 * Get the indicates whether IEEE 802.11h {{bibref|802.11h-2003}} functionality is supported by this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported (i.e. {{param|SupportedFrequencyBands}} includes {{enum|5GHz|SupportedFrequencyBands}} and {{param|SupportedStandards}} includes {{enum|a|SupportedStandards}} and/or {{enum|n|SupportedStandards}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIeeE80211hSupported() {
		return ieeE80211hSupported;
	}

	/**
	 * Set the indicates whether IEEE 802.11h {{bibref|802.11h-2003}} functionality is supported by this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported (i.e. {{param|SupportedFrequencyBands}} includes {{enum|5GHz|SupportedFrequencyBands}} and {{param|SupportedStandards}} includes {{enum|a|SupportedStandards}} and/or {{enum|n|SupportedStandards}}).
	 *
	 * @since 2.0
	 * @param ieeE80211hSupported the input value
	 */
	public void  setIeeE80211hSupported(Boolean ieeE80211hSupported) {
		this.ieeE80211hSupported = ieeE80211hSupported;
	}

	/**
	 * Set the indicates whether IEEE 802.11h {{bibref|802.11h-2003}} functionality is supported by this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported (i.e. {{param|SupportedFrequencyBands}} includes {{enum|5GHz|SupportedFrequencyBands}} and {{param|SupportedStandards}} includes {{enum|a|SupportedStandards}} and/or {{enum|n|SupportedStandards}}).
	 *
	 * @since 2.0
	 * @param ieeE80211hSupported the input value
	 * @return this instance
	 */
	public Radio withIeeE80211hSupported(Boolean ieeE80211hSupported) {
		this.ieeE80211hSupported = ieeE80211hSupported;
		return this;
	}

	/**
	 * Get the indicates whether IEEE 802.11h functionality is enabled on this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported and enabled (i.e. {{param|OperatingFrequencyBand}} is {{enum|5GHz|OperatingFrequencyBand}} and {{param|OperatingStandards}} includes {{enum|a|OperatingStandards}} and/or {{enum|n|OperatingStandards}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIeeE80211hEnabled() {
		return ieeE80211hEnabled;
	}

	/**
	 * Set the indicates whether IEEE 802.11h functionality is enabled on this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported and enabled (i.e. {{param|OperatingFrequencyBand}} is {{enum|5GHz|OperatingFrequencyBand}} and {{param|OperatingStandards}} includes {{enum|a|OperatingStandards}} and/or {{enum|n|OperatingStandards}}).
	 *
	 * @since 2.0
	 * @param ieeE80211hEnabled the input value
	 */
	public void  setIeeE80211hEnabled(Boolean ieeE80211hEnabled) {
		this.ieeE80211hEnabled = ieeE80211hEnabled;
	}

	/**
	 * Set the indicates whether IEEE 802.11h functionality is enabled on this radio. The value can be {{true}} only if the 802.11a or the 802.11n@5GHz standard is supported and enabled (i.e. {{param|OperatingFrequencyBand}} is {{enum|5GHz|OperatingFrequencyBand}} and {{param|OperatingStandards}} includes {{enum|a|OperatingStandards}} and/or {{enum|n|OperatingStandards}}).
	 *
	 * @since 2.0
	 * @param ieeE80211hEnabled the input value
	 * @return this instance
	 */
	public Radio withIeeE80211hEnabled(Boolean ieeE80211hEnabled) {
		this.ieeE80211hEnabled = ieeE80211hEnabled;
		return this;
	}

	/**
	 * Get the 802.11d Regulatory Domain. First two octets are {{bibref|ISO3166-1}} two-character country code. The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegulatoryDomain() {
		return regulatoryDomain;
	}

	/**
	 * Set the 802.11d Regulatory Domain. First two octets are {{bibref|ISO3166-1}} two-character country code. The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 2.0
	 * @param regulatoryDomain the input value
	 */
	public void  setRegulatoryDomain(String regulatoryDomain) {
		this.regulatoryDomain = regulatoryDomain;
	}

	/**
	 * Set the 802.11d Regulatory Domain. First two octets are {{bibref|ISO3166-1}} two-character country code. The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 2.0
	 * @param regulatoryDomain the input value
	 * @return this instance
	 */
	public Radio withRegulatoryDomain(String regulatoryDomain) {
		this.regulatoryDomain = regulatoryDomain;
		return this;
	}

	/**
	 * Get the maximum number of retransmissions of a short packet i.e. a packet that is no longer than the {{param|RTSThreshold}}. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''  {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRetryLimit() {
		return retryLimit;
	}

	/**
	 * Set the maximum number of retransmissions of a short packet i.e. a packet that is no longer than the {{param|RTSThreshold}}. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''  {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param retryLimit the input value
	 */
	public void  setRetryLimit(Long retryLimit) {
		this.retryLimit = retryLimit;
	}

	/**
	 * Set the maximum number of retransmissions of a short packet i.e. a packet that is no longer than the {{param|RTSThreshold}}. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''  {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param retryLimit the input value
	 * @return this instance
	 */
	public Radio withRetryLimit(Long retryLimit) {
		this.retryLimit = retryLimit;
		return this;
	}

	/**
	 * Get a request for the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.3}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getCcaRequest() {
		return ccaRequest;
	}

	/**
	 * Set a request for the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.3}}.
	 *
	 * @since 2.8
	 * @param ccaRequest the input value
	 */
	public void  setCcaRequest(byte[] ccaRequest) {
		this.ccaRequest = ccaRequest;
	}

	/**
	 * Set a request for the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.3}}.
	 *
	 * @since 2.8
	 * @param ccaRequest the input value
	 * @return this instance
	 */
	public Radio withCcaRequest(byte[] ccaRequest) {
		this.ccaRequest = ccaRequest;
		return this;
	}

	/**
	 * Get the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.3}}.

          When read, the value of this parameter MUST correspond to {{param|CCARequest}}.  How this is achieved is a local matter to the CPE.

          If this parameter is read before a CCARequest has been issued, then its value is {{empty}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getCcaReport() {
		return ccaReport;
	}

	/**
	 * Set the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.3}}.

          When read, the value of this parameter MUST correspond to {{param|CCARequest}}.  How this is achieved is a local matter to the CPE.

          If this parameter is read before a CCARequest has been issued, then its value is {{empty}}.
	 *
	 * @since 2.8
	 * @param ccaReport the input value
	 */
	public void  setCcaReport(byte[] ccaReport) {
		this.ccaReport = ccaReport;
	}

	/**
	 * Set the clear channel assessment (CCA) report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.3}}.

          When read, the value of this parameter MUST correspond to {{param|CCARequest}}.  How this is achieved is a local matter to the CPE.

          If this parameter is read before a CCARequest has been issued, then its value is {{empty}}.
	 *
	 * @since 2.8
	 * @param ccaReport the input value
	 * @return this instance
	 */
	public Radio withCcaReport(byte[] ccaReport) {
		this.ccaReport = ccaReport;
		return this;
	}

	/**
	 * Get a request for a received power indicator (RPI) histogram in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.4}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getRpiHistogramRequest() {
		return rpiHistogramRequest;
	}

	/**
	 * Set a request for a received power indicator (RPI) histogram in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.4}}.
	 *
	 * @since 2.8
	 * @param rpiHistogramRequest the input value
	 */
	public void  setRpiHistogramRequest(byte[] rpiHistogramRequest) {
		this.rpiHistogramRequest = rpiHistogramRequest;
	}

	/**
	 * Set a request for a received power indicator (RPI) histogram in the format specified in {{bibref|802.11-2012|Clause 8.4.2.23.4}}.
	 *
	 * @since 2.8
	 * @param rpiHistogramRequest the input value
	 * @return this instance
	 */
	public Radio withRpiHistogramRequest(byte[] rpiHistogramRequest) {
		this.rpiHistogramRequest = rpiHistogramRequest;
		return this;
	}

	/**
	 * Get the received power indicator (RPI) histogram report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.4}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getRpiHistogramReport() {
		return rpiHistogramReport;
	}

	/**
	 * Set the received power indicator (RPI) histogram report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.4}}.
	 *
	 * @since 2.8
	 * @param rpiHistogramReport the input value
	 */
	public void  setRpiHistogramReport(byte[] rpiHistogramReport) {
		this.rpiHistogramReport = rpiHistogramReport;
	}

	/**
	 * Set the received power indicator (RPI) histogram report in the format specified in {{bibref|802.11-2012|Clause 8.4.2.24.4}}.
	 *
	 * @since 2.8
	 * @param rpiHistogramReport the input value
	 * @return this instance
	 */
	public Radio withRpiHistogramReport(byte[] rpiHistogramReport) {
		this.rpiHistogramReport = rpiHistogramReport;
		return this;
	}

	/**
	 * Get the this specifies the current maximum size, in octets, of the MPDU that can be delivered to the PHY. This parameter is based on ''dot11FragmentationThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getFragmentationThreshold() {
		return fragmentationThreshold;
	}

	/**
	 * Set the this specifies the current maximum size, in octets, of the MPDU that can be delivered to the PHY. This parameter is based on ''dot11FragmentationThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param fragmentationThreshold the input value
	 */
	public void  setFragmentationThreshold(Long fragmentationThreshold) {
		this.fragmentationThreshold = fragmentationThreshold;
	}

	/**
	 * Set the this specifies the current maximum size, in octets, of the MPDU that can be delivered to the PHY. This parameter is based on ''dot11FragmentationThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param fragmentationThreshold the input value
	 * @return this instance
	 */
	public Radio withFragmentationThreshold(Long fragmentationThreshold) {
		this.fragmentationThreshold = fragmentationThreshold;
		return this;
	}

	/**
	 * Get the this indicates the number of octets in an MPDU, below which an RTS/CTS handshake is not performed. This parameter is based on ''dot11RTSThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRtsThreshold() {
		return rtsThreshold;
	}

	/**
	 * Set the this indicates the number of octets in an MPDU, below which an RTS/CTS handshake is not performed. This parameter is based on ''dot11RTSThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param rtsThreshold the input value
	 */
	public void  setRtsThreshold(Long rtsThreshold) {
		this.rtsThreshold = rtsThreshold;
	}

	/**
	 * Set the this indicates the number of octets in an MPDU, below which an RTS/CTS handshake is not performed. This parameter is based on ''dot11RTSThreshold'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param rtsThreshold the input value
	 * @return this instance
	 */
	public Radio withRtsThreshold(Long rtsThreshold) {
		this.rtsThreshold = rtsThreshold;
		return this;
	}

	/**
	 * Get the this indicates the maximum number of transmission attempts of a frame, the length of which is greater than {{param|RTSThreshold}}, that will be made before a failure condition is indicated. This parameter is based on ''dot11LongRetryLimit'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLongRetryLimit() {
		return longRetryLimit;
	}

	/**
	 * Set the this indicates the maximum number of transmission attempts of a frame, the length of which is greater than {{param|RTSThreshold}}, that will be made before a failure condition is indicated. This parameter is based on ''dot11LongRetryLimit'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param longRetryLimit the input value
	 */
	public void  setLongRetryLimit(Long longRetryLimit) {
		this.longRetryLimit = longRetryLimit;
	}

	/**
	 * Set the this indicates the maximum number of transmission attempts of a frame, the length of which is greater than {{param|RTSThreshold}}, that will be made before a failure condition is indicated. This parameter is based on ''dot11LongRetryLimit'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param longRetryLimit the input value
	 * @return this instance
	 */
	public Radio withLongRetryLimit(Long longRetryLimit) {
		this.longRetryLimit = longRetryLimit;
		return this;
	}

	/**
	 * Get the time interval between transmitting beacons (expressed in milliseconds). This parameter is based on ''dot11BeaconPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getBeaconPeriod() {
		return beaconPeriod;
	}

	/**
	 * Set the time interval between transmitting beacons (expressed in milliseconds). This parameter is based on ''dot11BeaconPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param beaconPeriod the input value
	 */
	public void  setBeaconPeriod(Long beaconPeriod) {
		this.beaconPeriod = beaconPeriod;
	}

	/**
	 * Set the time interval between transmitting beacons (expressed in milliseconds). This parameter is based on ''dot11BeaconPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param beaconPeriod the input value
	 * @return this instance
	 */
	public Radio withBeaconPeriod(Long beaconPeriod) {
		this.beaconPeriod = beaconPeriod;
		return this;
	}

	/**
	 * Get the this specifies the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM Count field is 0. This parameter is based on ''dot11DTIMPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getDtiMPeriod() {
		return dtiMPeriod;
	}

	/**
	 * Set the this specifies the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM Count field is 0. This parameter is based on ''dot11DTIMPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param dtiMPeriod the input value
	 */
	public void  setDtiMPeriod(Long dtiMPeriod) {
		this.dtiMPeriod = dtiMPeriod;
	}

	/**
	 * Set the this specifies the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM Count field is 0. This parameter is based on ''dot11DTIMPeriod'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param dtiMPeriod the input value
	 * @return this instance
	 */
	public Radio withDtiMPeriod(Long dtiMPeriod) {
		this.dtiMPeriod = dtiMPeriod;
		return this;
	}

	/**
	 * Get the this determines whether or not packet aggregation (commonly called "frame aggregation") is enabled. This applies only to 802.11n.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isPacketAggregationEnable() {
		return packetAggregationEnable;
	}

	/**
	 * Set the this determines whether or not packet aggregation (commonly called "frame aggregation") is enabled. This applies only to 802.11n.
	 *
	 * @since 2.8
	 * @param packetAggregationEnable the input value
	 */
	public void  setPacketAggregationEnable(Boolean packetAggregationEnable) {
		this.packetAggregationEnable = packetAggregationEnable;
	}

	/**
	 * Set the this determines whether or not packet aggregation (commonly called "frame aggregation") is enabled. This applies only to 802.11n.
	 *
	 * @since 2.8
	 * @param packetAggregationEnable the input value
	 * @return this instance
	 */
	public Radio withPacketAggregationEnable(Boolean packetAggregationEnable) {
		this.packetAggregationEnable = packetAggregationEnable;
		return this;
	}

	/**
	 * Get the type of preamble. Longer preambles (more overhead) are needed by 802.11g to coexist with legacy systems 802.11 and 802.11b.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPreambleType() {
		return preambleType;
	}

	/**
	 * Set the type of preamble. Longer preambles (more overhead) are needed by 802.11g to coexist with legacy systems 802.11 and 802.11b.
	 *
	 * @since 2.8
	 * @param preambleType the input value
	 */
	public void  setPreambleType(String preambleType) {
		this.preambleType = preambleType;
	}

	/**
	 * Set the type of preamble. Longer preambles (more overhead) are needed by 802.11g to coexist with legacy systems 802.11 and 802.11b.
	 *
	 * @since 2.8
	 * @param preambleType the input value
	 * @return this instance
	 */
	public Radio withPreambleType(String preambleType) {
		this.preambleType = preambleType;
		return this;
	}

	/**
	 * Get the {{list}} The set of data rates, in ''Mbps'', that have to be supported by all stations that desire to join this BSS. The stations have to be able to receive and transmit at each of the data rates listed in {{param}}. For example, a value of "1,2", indicates that stations support 1 Mbps and 2 Mbps. Most control packets use a data rate in {{param}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getBasicDataTransmitRates() {
		if (this.basicDataTransmitRates == null){ this.basicDataTransmitRates=new ArrayList<>();}
		return basicDataTransmitRates;
	}

	/**
	 * Set the {{list}} The set of data rates, in ''Mbps'', that have to be supported by all stations that desire to join this BSS. The stations have to be able to receive and transmit at each of the data rates listed in {{param}}. For example, a value of "1,2", indicates that stations support 1 Mbps and 2 Mbps. Most control packets use a data rate in {{param}}.
	 *
	 * @since 2.8
	 * @param basicDataTransmitRates the input value
	 */
	public void  setBasicDataTransmitRates(Collection<String> basicDataTransmitRates) {
		this.basicDataTransmitRates = basicDataTransmitRates;
	}

	/**
	 * Set the {{list}} The set of data rates, in ''Mbps'', that have to be supported by all stations that desire to join this BSS. The stations have to be able to receive and transmit at each of the data rates listed in {{param}}. For example, a value of "1,2", indicates that stations support 1 Mbps and 2 Mbps. Most control packets use a data rate in {{param}}.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withBasicDataTransmitRates(String string) {
		getBasicDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Maximum access point data transmit rates in ''Mbps'' for unicast frames (a superset of {{param|BasicDataTransmitRates}}). Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getOperationalDataTransmitRates() {
		if (this.operationalDataTransmitRates == null){ this.operationalDataTransmitRates=new ArrayList<>();}
		return operationalDataTransmitRates;
	}

	/**
	 * Set the {{list}} Maximum access point data transmit rates in ''Mbps'' for unicast frames (a superset of {{param|BasicDataTransmitRates}}). Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 2.8
	 * @param operationalDataTransmitRates the input value
	 */
	public void  setOperationalDataTransmitRates(Collection<String> operationalDataTransmitRates) {
		this.operationalDataTransmitRates = operationalDataTransmitRates;
	}

	/**
	 * Set the {{list}} Maximum access point data transmit rates in ''Mbps'' for unicast frames (a superset of {{param|BasicDataTransmitRates}}). Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withOperationalDataTransmitRates(String string) {
		getOperationalDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Data transmit rates in ''Mbps'' for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}). Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getSupportedDataTransmitRates() {
		if (this.supportedDataTransmitRates == null){ this.supportedDataTransmitRates=new ArrayList<>();}
		return supportedDataTransmitRates;
	}

	/**
	 * Set the {{list}} Data transmit rates in ''Mbps'' for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}). Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 2.8
	 * @param supportedDataTransmitRates the input value
	 */
	public void  setSupportedDataTransmitRates(Collection<String> supportedDataTransmitRates) {
		this.supportedDataTransmitRates = supportedDataTransmitRates;
	}

	/**
	 * Set the {{list}} Data transmit rates in ''Mbps'' for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}). Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Radio withSupportedDataTransmitRates(String string) {
		getSupportedDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the throughput statistics for this interface. Packet counters here count 802.11 WiFi frames. See {{bibref|TR-181i2a5|Appendix III}} for further details. The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2a5|Section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface. Packet counters here count 802.11 WiFi frames. See {{bibref|TR-181i2a5|Appendix III}} for further details. The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2a5|Section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface. Packet counters here count 802.11 WiFi frames. See {{bibref|TR-181i2a5|Appendix III}} for further details. The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2a5|Section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Radio withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}