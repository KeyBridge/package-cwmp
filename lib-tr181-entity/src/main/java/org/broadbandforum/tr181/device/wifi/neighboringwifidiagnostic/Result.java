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
package org.broadbandforum.tr181.device.wifi.neighboringwifidiagnostic;

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
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * Neighboring SSID table. This table models the other WiFi SSIDs that this device is able to receive.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.WiFi.NeighboringWiFiDiagnostic.Result.{i}.")
@XmlRootElement(name = "Device.WiFi.NeighboringWiFiDiagnostic.Result")
@XmlType(name = "Device.WiFi.NeighboringWiFiDiagnostic.Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	/**
	 * The Radio that detected the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Radio")
	public String radio;
	/**
	 * The current service set identifier in use by the neighboring WiFi SSID. The value MAY be empty for hidden SSIDs.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SSID")
	@Size(max = 32)
	public String ssiD;
	/**
	 * The BSSID used for the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BSSID")
	public MACAddress bssID;
	/**
	 * The mode the neighboring WiFi radio is operating in.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Mode")
	public String mode;
	/**
	 * The current radio channel used by the neighboring WiFi radio.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Channel")
	@Size(min = 1, max = 255)
	public Long channel;
	/**
	 * An indicator of radio signal strength (RSSI) of the neighboring WiFi radio measured in dBm, as an average of the last 100 packets received.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SignalStrength")
	@Size(min = -200, max = 0)
	public Integer signalStrength;
	/**
	 * The type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SecurityModeEnabled")
	public String securityModeEnabled;
	/**
	 * The type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "EncryptionMode")
	@XmlList
	public Collection<String> encryptionMode;
	/**
	 * Indicates the frequency band at which the radio this SSID instance is operating.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "OperatingFrequencyBand")
	public String operatingFrequencyBand;
	/**
	 * {{list}} List items indicate which IEEE 802.11 standards this {{object}} instance can support simultaneously, in the frequency band specified by {{param|OperatingFrequencyBand}}. 

Enumerated value must be one of [a, b, g, n, ac]

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|OperatingFrequencyBand}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|OperatingFrequencyBand}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SupportedStandards")
	@XmlList
	public Collection<String> supportedStandards;
	/**
	 * {{list}} List items indicate which IEEE 802.11 standard that is detected for this {{object}}.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "OperatingStandards")
	@XmlList
	public Collection<String> operatingStandards;
	/**
	 * Indicates the bandwidth at which the channel is operating.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "OperatingChannelBandwidth")
	public String operatingChannelBandwidth;
	/**
	 * Time interval (in ms) between transmitting beacons.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BeaconPeriod")
	public Long beaconPeriod;
	/**
	 * Indicator of average noise strength (in dBm) received from the neighboring WiFi radio.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Noise")
	@Size(min = -200, max = 0)
	public Integer noise;
	/**
	 * {{list}} Basic data transmit rates (in Mbps) for the SSID.  For example, if {{param}} is "1,2", this indicates that the SSID is operating with basic rates of 1 Mbps and 2 Mbps.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BasicDataTransferRates")
	@Size(max = 256)
	@XmlList
	public Collection<String> basicDataTransferRates;
	/**
	 * {{list}} Data transmit rates (in Mbps) for unicast frames at which the SSID will permit a station to connect. For example, if {{param}} is "1,2,5.5", this indicates that the SSID will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SupportedDataTransferRates")
	@Size(max = 256)
	@XmlList
	public Collection<String> supportedDataTransferRates;
	/**
	 * The number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM count field is 0. This value is transmitted in the DTIM Period field of beacon frames. {{bibref|802.11-2012}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DTIMPeriod")
	public Long dtiMPeriod;

	public Result() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the Radio that detected the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * Set the Radio that detected the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @param radio the input value
	 */
	public void  setRadio(String radio) {
		this.radio = radio;
	}

	/**
	 * Set the Radio that detected the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @param radio the input value
	 * @return this instance
	 */
	public Result withRadio(String radio) {
		this.radio = radio;
		return this;
	}

	/**
	 * Get the current service set identifier in use by the neighboring WiFi SSID. The value MAY be empty for hidden SSIDs.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getSsiD() {
		return ssiD;
	}

	/**
	 * Set the current service set identifier in use by the neighboring WiFi SSID. The value MAY be empty for hidden SSIDs.
	 *
	 * @since 2.7
	 * @param ssiD the input value
	 */
	public void  setSsiD(String ssiD) {
		this.ssiD = ssiD;
	}

	/**
	 * Set the current service set identifier in use by the neighboring WiFi SSID. The value MAY be empty for hidden SSIDs.
	 *
	 * @since 2.7
	 * @param ssiD the input value
	 * @return this instance
	 */
	public Result withSsiD(String ssiD) {
		this.ssiD = ssiD;
		return this;
	}

	/**
	 * Get the BSSID used for the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public MACAddress getBssID() {
		return bssID;
	}

	/**
	 * Set the BSSID used for the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @param bssID the input value
	 */
	public void  setBssID(MACAddress bssID) {
		this.bssID = bssID;
	}

	/**
	 * Set the BSSID used for the neighboring WiFi SSID.
	 *
	 * @since 2.7
	 * @param bssID the input value
	 * @return this instance
	 */
	public Result withBssID(MACAddress bssID) {
		this.bssID = bssID;
		return this;
	}

	/**
	 * Get the mode the neighboring WiFi radio is operating in.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Set the mode the neighboring WiFi radio is operating in.
	 *
	 * @since 2.7
	 * @param mode the input value
	 */
	public void  setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * Set the mode the neighboring WiFi radio is operating in.
	 *
	 * @since 2.7
	 * @param mode the input value
	 * @return this instance
	 */
	public Result withMode(String mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * Get the current radio channel used by the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getChannel() {
		return channel;
	}

	/**
	 * Set the current radio channel used by the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @param channel the input value
	 */
	public void  setChannel(Long channel) {
		this.channel = channel;
	}

	/**
	 * Set the current radio channel used by the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @param channel the input value
	 * @return this instance
	 */
	public Result withChannel(Long channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * Get an indicator of radio signal strength (RSSI) of the neighboring WiFi radio measured in dBm, as an average of the last 100 packets received.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength (RSSI) of the neighboring WiFi radio measured in dBm, as an average of the last 100 packets received.
	 *
	 * @since 2.7
	 * @param signalStrength the input value
	 */
	public void  setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength (RSSI) of the neighboring WiFi radio measured in dBm, as an average of the last 100 packets received.
	 *
	 * @since 2.7
	 * @param signalStrength the input value
	 * @return this instance
	 */
	public Result withSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
		return this;
	}

	/**
	 * Get the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getSecurityModeEnabled() {
		return securityModeEnabled;
	}

	/**
	 * Set the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @param securityModeEnabled the input value
	 */
	public void  setSecurityModeEnabled(String securityModeEnabled) {
		this.securityModeEnabled = securityModeEnabled;
	}

	/**
	 * Set the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @param securityModeEnabled the input value
	 * @return this instance
	 */
	public Result withSecurityModeEnabled(String securityModeEnabled) {
		this.securityModeEnabled = securityModeEnabled;
		return this;
	}

	/**
	 * Get the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getEncryptionMode() {
		if (this.encryptionMode == null){ this.encryptionMode=new ArrayList<>();}
		return encryptionMode;
	}

	/**
	 * Set the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @param encryptionMode the input value
	 */
	public void  setEncryptionMode(Collection<String> encryptionMode) {
		this.encryptionMode = encryptionMode;
	}

	/**
	 * Set the type of encryption the neighboring WiFi SSID advertises.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Result withEncryptionMode(String string) {
		getEncryptionMode().add(string);
		return this;
	}

	/**
	 * Get the indicates the frequency band at which the radio this SSID instance is operating.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getOperatingFrequencyBand() {
		return operatingFrequencyBand;
	}

	/**
	 * Set the indicates the frequency band at which the radio this SSID instance is operating.
	 *
	 * @since 2.7
	 * @param operatingFrequencyBand the input value
	 */
	public void  setOperatingFrequencyBand(String operatingFrequencyBand) {
		this.operatingFrequencyBand = operatingFrequencyBand;
	}

	/**
	 * Set the indicates the frequency band at which the radio this SSID instance is operating.
	 *
	 * @since 2.7
	 * @param operatingFrequencyBand the input value
	 * @return this instance
	 */
	public Result withOperatingFrequencyBand(String operatingFrequencyBand) {
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
	 * @since 2.7
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
	 * @since 2.7
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
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Result withSupportedStandards(String string) {
		getSupportedStandards().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which IEEE 802.11 standard that is detected for this {{object}}.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getOperatingStandards() {
		if (this.operatingStandards == null){ this.operatingStandards=new ArrayList<>();}
		return operatingStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standard that is detected for this {{object}}.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.7
	 * @param operatingStandards the input value
	 */
	public void  setOperatingStandards(Collection<String> operatingStandards) {
		this.operatingStandards = operatingStandards;
	}

	/**
	 * Set the {{list}} List items indicate which IEEE 802.11 standard that is detected for this {{object}}.

          Each value indicates support for the indicated standard.

          If {{param|OperatingFrequencyBand}} is set to {{enum|2.4GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|b}}, {{enum|g}}, {{enum|n}} are allowed.

          If {{param|OperatingFrequencyBand}} is set to {{enum|5GHz|##.Radio.{i}.SupportedFrequencyBands}}, only values {{enum|a}}, {{enum|n}}, {{enum|ac}} are allowed.

          For example, a value of "g,b" (or "b,g" - order is not important) means that the 802.11g standard {{bibref|802.11g-2003}} is used with a backwards-compatible mode for 802.11b {{bibref|802.11b-1999}}. A value of "g" means that only the 802.11g standard can be used.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Result withOperatingStandards(String string) {
		getOperatingStandards().add(string);
		return this;
	}

	/**
	 * Get the indicates the bandwidth at which the channel is operating.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getOperatingChannelBandwidth() {
		return operatingChannelBandwidth;
	}

	/**
	 * Set the indicates the bandwidth at which the channel is operating.
	 *
	 * @since 2.7
	 * @param operatingChannelBandwidth the input value
	 */
	public void  setOperatingChannelBandwidth(String operatingChannelBandwidth) {
		this.operatingChannelBandwidth = operatingChannelBandwidth;
	}

	/**
	 * Set the indicates the bandwidth at which the channel is operating.
	 *
	 * @since 2.7
	 * @param operatingChannelBandwidth the input value
	 * @return this instance
	 */
	public Result withOperatingChannelBandwidth(String operatingChannelBandwidth) {
		this.operatingChannelBandwidth = operatingChannelBandwidth;
		return this;
	}

	/**
	 * Get the time interval (in ms) between transmitting beacons.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getBeaconPeriod() {
		return beaconPeriod;
	}

	/**
	 * Set the time interval (in ms) between transmitting beacons.
	 *
	 * @since 2.7
	 * @param beaconPeriod the input value
	 */
	public void  setBeaconPeriod(Long beaconPeriod) {
		this.beaconPeriod = beaconPeriod;
	}

	/**
	 * Set the time interval (in ms) between transmitting beacons.
	 *
	 * @since 2.7
	 * @param beaconPeriod the input value
	 * @return this instance
	 */
	public Result withBeaconPeriod(Long beaconPeriod) {
		this.beaconPeriod = beaconPeriod;
		return this;
	}

	/**
	 * Get the indicator of average noise strength (in dBm) received from the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getNoise() {
		return noise;
	}

	/**
	 * Set the indicator of average noise strength (in dBm) received from the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @param noise the input value
	 */
	public void  setNoise(Integer noise) {
		this.noise = noise;
	}

	/**
	 * Set the indicator of average noise strength (in dBm) received from the neighboring WiFi radio.
	 *
	 * @since 2.7
	 * @param noise the input value
	 * @return this instance
	 */
	public Result withNoise(Integer noise) {
		this.noise = noise;
		return this;
	}

	/**
	 * Get the {{list}} Basic data transmit rates (in Mbps) for the SSID.  For example, if {{param}} is "1,2", this indicates that the SSID is operating with basic rates of 1 Mbps and 2 Mbps.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getBasicDataTransferRates() {
		if (this.basicDataTransferRates == null){ this.basicDataTransferRates=new ArrayList<>();}
		return basicDataTransferRates;
	}

	/**
	 * Set the {{list}} Basic data transmit rates (in Mbps) for the SSID.  For example, if {{param}} is "1,2", this indicates that the SSID is operating with basic rates of 1 Mbps and 2 Mbps.
	 *
	 * @since 2.7
	 * @param basicDataTransferRates the input value
	 */
	public void  setBasicDataTransferRates(Collection<String> basicDataTransferRates) {
		this.basicDataTransferRates = basicDataTransferRates;
	}

	/**
	 * Set the {{list}} Basic data transmit rates (in Mbps) for the SSID.  For example, if {{param}} is "1,2", this indicates that the SSID is operating with basic rates of 1 Mbps and 2 Mbps.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Result withBasicDataTransferRates(String string) {
		getBasicDataTransferRates().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Data transmit rates (in Mbps) for unicast frames at which the SSID will permit a station to connect. For example, if {{param}} is "1,2,5.5", this indicates that the SSID will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getSupportedDataTransferRates() {
		if (this.supportedDataTransferRates == null){ this.supportedDataTransferRates=new ArrayList<>();}
		return supportedDataTransferRates;
	}

	/**
	 * Set the {{list}} Data transmit rates (in Mbps) for unicast frames at which the SSID will permit a station to connect. For example, if {{param}} is "1,2,5.5", this indicates that the SSID will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps.
	 *
	 * @since 2.7
	 * @param supportedDataTransferRates the input value
	 */
	public void  setSupportedDataTransferRates(Collection<String> supportedDataTransferRates) {
		this.supportedDataTransferRates = supportedDataTransferRates;
	}

	/**
	 * Set the {{list}} Data transmit rates (in Mbps) for unicast frames at which the SSID will permit a station to connect. For example, if {{param}} is "1,2,5.5", this indicates that the SSID will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Result withSupportedDataTransferRates(String string) {
		getSupportedDataTransferRates().add(string);
		return this;
	}

	/**
	 * Get the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM count field is 0. This value is transmitted in the DTIM Period field of beacon frames. {{bibref|802.11-2012}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getDtiMPeriod() {
		return dtiMPeriod;
	}

	/**
	 * Set the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM count field is 0. This value is transmitted in the DTIM Period field of beacon frames. {{bibref|802.11-2012}}
	 *
	 * @since 2.7
	 * @param dtiMPeriod the input value
	 */
	public void  setDtiMPeriod(Long dtiMPeriod) {
		this.dtiMPeriod = dtiMPeriod;
	}

	/**
	 * Set the number of beacon intervals that elapse between transmission of Beacon frames containing a TIM element whose DTIM count field is 0. This value is transmitted in the DTIM Period field of beacon frames. {{bibref|802.11-2012}}
	 *
	 * @since 2.7
	 * @param dtiMPeriod the input value
	 * @return this instance
	 */
	public Result withDtiMPeriod(Long dtiMPeriod) {
		this.dtiMPeriod = dtiMPeriod;
		return this;
	}

	//</editor-fold>

}