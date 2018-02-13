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
package org.broadbandforum.tr143.internetgatewaydevice.landevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.internetgatewaydevice.landevice.wlanconfiguration.AssociatedDevice;
import org.broadbandforum.tr143.internetgatewaydevice.landevice.wlanconfiguration.PreSharedKey;
import org.broadbandforum.tr143.internetgatewaydevice.landevice.wlanconfiguration.WEPKey;

	/**
	 * This object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.")
@XmlRootElement(name = "WLANConfiguration")
@XmlType(name = "InternetGatewayDevice.LANDevice.WLANConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
public class WLANConfiguration {

	/**
	 * Enables or disables this interface.

When there are multiple ''WLANConfiguration'' instances, e.g. each instance supports a different 802.11 standard or has a different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The MAC address of the interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BSSID")
	public String bssID;
	/**
	 * The maximum upstream and downstream bit rate available to this connection in Mbps.  Either ''Auto'', or the largest of the {{param|OperationalDataTransmitRates}} values.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxBitRate")
	@CWMPParameter(access = "readWrite")
	@Size(max = 4)
	public String maxBitRate;
	/**
	 * The current radio channel used by the connection.  Note: There is currently no way of requesting automatic selection of a channel.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Channel")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long channel;
	/**
	 * The current service set identifier in use by the connection.  The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as a "password" for joining a particular radio network (BSS).  Note: If an access point wishes to be known by more than one SSID, it MUST provide a ''WLANConfiguration'' instance for each SSID.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SSID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String ssiD;
	/**
	 * The capabilities that are currently enabled on the access point (and that are announced via beacons if {{param|BeaconAdvertisementEnabled}} is {{true}}). Write access to this parameter enables and disables such capabilities.

An attempt to set this parameter to one of the required (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this ''WLANConfiguration'' instance but is available on another ''WLANConfiguration'' instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

A value of {{enum|None}} means that no capabilities are currently enabled on the access point and that no stations will be able to associate with it.  {{enum}}

{{enum|11i}} SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The OBSOLETED values are those for Basic + WPA/WPA2  mixed modes, which are not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BeaconType")
	@CWMPParameter(access = "readWrite")
	public String beaconType;
	/**
	 * Indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddressControlEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressControlEnabled;
	/**
	 * Indicates which IEEE 802.11 standard this ''WLANConfiguration'' instance is configured for.  {{enum}}

Where each value indicates support for only the indicated standard.

If the device is configured simultaneously for more than one standard, a separate ''WLANConfiguration'' instance MUST be used for each supported standard.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Standard")
	public String standard;
	/**
	 * The index of the default WEP key.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WEPKeyIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4)
	public Long wepKeyIndex;
	/**
	 * A passphrase from which the WEP keys are to be generated.

This parameter is the same as the parameter ''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.KeyPassphrase'' for the same instance of ''WLANConfiguration''.  When either parameter is changed, the value of the other is changed as well.

If {{param}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).

This MUST either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else MUST consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

Note: If a passphrase is used, all four WEP keys will be the same.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "KeyPassphrase")
	@CWMPParameter(access = "readWrite")
	@Size(max = 63)
	public String keyPassphrase;
	/**
	 * Supported key lengths.  

Enumerated value must be one of [Disabled, 40-bit, 104-bit]

Any additional vendor-specific values MUST start with the key length in bits.

This parameter does not enforce a given encryption level but only indicates capabilities.  The WEP encryption level for a given key is inferred from the key length.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WEPEncryptionLevel")
	@Size(max = 64)
	@XmlList
	public Collection<String> wepEncryptionLevel;
	/**
	 * Encryption modes that are available when basic 802.11 is enabled. {{enum|WEPEncryption}} implies that all wireless clients can use WEP for data encryption.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BasicEncryptionModes")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String basicEncryptionModes;
	/**
	 * Authentication modes that are available when basic 802.11 is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BasicAuthenticationMode")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String basicAuthenticationMode;
	/**
	 * Encryption modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WPAEncryptionModes")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String wpaEncryptionModes;
	/**
	 * Authentication modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WPAAuthenticationMode")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String wpaAuthenticationMode;
	/**
	 * Encryption modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA2 specifications.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IEEE11iEncryptionModes")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String ieeE11iEncryptionModes;
	/**
	 * Authentication modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IEEE11iAuthenticationMode")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String ieeE11iAuthenticationMode;
	/**
	 * Possible radio channels for the wireless standard (a, b or g) and the regulatory domain. 

Ranges in the form "n-m" are permitted.

For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PossibleChannels")
	@Size(max = 1024)
	@XmlList
	public Collection<String> possibleChannels;
	/**
	 * Maximum access point data transmit rates in Mbps for unicast, multicast and broadcast frames.

For example, a value of "1,2", indicates that unicast, multicast and broadcast frames can be transmitted at 1 Mbps and 2 Mbps.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BasicDataTransmitRates")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> basicDataTransmitRates;
	/**
	 * Maximum access point data transmit rates in Mbps for unicast frames (a superset of {{param|BasicDataTransmitRates}}).

Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "OperationalDataTransmitRates")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> operationalDataTransmitRates;
	/**
	 * Data transmit rates for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}).

Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PossibleDataTransmitRates")
	@Size(max = 256)
	@XmlList
	public Collection<String> possibleDataTransmitRates;
	/**
	 * Indicates whether insecure write access via mechanisms other than the CPE WAN Management Protocol is permitted to the parameters in this object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InsecureOOBAccessEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean insecureOOBAccessEnabled;
	/**
	 * Indicates whether or not the access point is sending out beacons.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BeaconAdvertisementEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean beaconAdvertisementEnabled;
	/**
	 * Indicates whether or not the access point radio is enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RadioEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean radioEnabled;
	/**
	 * Indicates whether the access point can automatically reduce the data rate in the event of undue noise or contention.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AutoRateFallBackEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean autoRateFallBackEnabled;
	/**
	 * An XML description of information used to identify the access point by name and physical location.  The CPE is not expected to parse this string, but simply to treat it as an opaque string.  {{empty}} indicates no location has been set.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LocationDescription")
	@CWMPParameter(access = "readWrite")
	@Size(max = 4096)
	public String locationDescription;
	/**
	 * 802.11d Regulatory Domain String.  First two octets are ISO/IEC 3166-1 two-character country code.  The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RegulatoryDomain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 3)
	public String regulatoryDomain;
	/**
	 * The number of times pre-shared key (PSK) authentication has failed (relevant only to WPA and 802.11i).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPSKFailures")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPSKFailures;
	/**
	 * The number of times the MICHAEL integrity check has failed (relevant only to WPA and 802.11i)
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalIntegrityFailures")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalIntegrityFailures;
	/**
	 * Channels that the access point determines to be currently in use (including any that it is using itself).

Ranges in the form "n-m" are permitted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ChannelsInUse")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 1024)
	@XmlList
	public Collection<String> channelsInUse;
	/**
	 * The current access-point operating mode.  The optional modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DeviceOperationMode")
	@CWMPParameter(access = "readWrite")
	@Size(max = 31)
	public String deviceOperationMode;
	/**
	 * The number of hops from the root access point to the wireless repeater or bridge.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DistanceFromRoot")
	@CWMPParameter(access = "readWrite")
	public Long distanceFromRoot;
	/**
	 * The MAC address of the peer in wireless repeater or bridge mode.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeerBSSID")
	@CWMPParameter(access = "readWrite")
	public String peerBSSID;
	/**
	 * Indicates whether another service is involved in client authentication ({{enum|LinkAuthentication}} for a co-located authentication server; {{enum|RadiusClient}} for an external RADIUS server).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AuthenticationServiceMode")
	@CWMPParameter(access = "readWrite")
	public String authenticationServiceMode;
	/**
	 * Total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesSent;
	/**
	 * Total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesReceived;
	/**
	 * Total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsSent;
	/**
	 * Total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsReceived;
	/**
	 * The number of devices currently associated with the access point.  This corresponds to the number of entries in the {{object|AssociatedDeivce}} table.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalAssociations")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalAssociations;
	/**
	 * A table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "AssociatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;
	/**
	 * This is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "WEPKeies")
	@XmlElement(name = "WEPKey")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<WEPKey> wepKeies;
	/**
	 * This is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "PreSharedKeies")
	@XmlElement(name = "PreSharedKey")
	@CWMPParameter(minEntries = 10, maxEntries = 10)
	public Collection<PreSharedKey> preSharedKeies;

	public WLANConfiguration() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this interface.

When there are multiple ''WLANConfiguration'' instances, e.g. each instance supports a different 802.11 standard or has a different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this interface.

When there are multiple ''WLANConfiguration'' instances, e.g. each instance supports a different 802.11 standard or has a different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this interface.

When there are multiple ''WLANConfiguration'' instances, e.g. each instance supports a different 802.11 standard or has a different security configuration, this parameter can be used to control which of the instances are currently enabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WLANConfiguration withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public WLANConfiguration withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the MAC address of the interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getBssID() {
		return bssID;
	}

	/**
	 * Set the MAC address of the interface.
	 *
	 * @since 1.0
	 * @param bssID the input value
	 */
	public void  setBssID(String bssID) {
		this.bssID = bssID;
	}

	/**
	 * Set the MAC address of the interface.
	 *
	 * @since 1.0
	 * @param bssID the input value
	 * @return this instance
	 */
	public WLANConfiguration withBssID(String bssID) {
		this.bssID = bssID;
		return this;
	}

	/**
	 * Get the maximum upstream and downstream bit rate available to this connection in Mbps.  Either ''Auto'', or the largest of the {{param|OperationalDataTransmitRates}} values.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection in Mbps.  Either ''Auto'', or the largest of the {{param|OperationalDataTransmitRates}} values.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection in Mbps.  Either ''Auto'', or the largest of the {{param|OperationalDataTransmitRates}} values.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public WLANConfiguration withMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the current radio channel used by the connection.  Note: There is currently no way of requesting automatic selection of a channel.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getChannel() {
		return channel;
	}

	/**
	 * Set the current radio channel used by the connection.  Note: There is currently no way of requesting automatic selection of a channel.
	 *
	 * @since 1.0
	 * @param channel the input value
	 */
	public void  setChannel(Long channel) {
		this.channel = channel;
	}

	/**
	 * Set the current radio channel used by the connection.  Note: There is currently no way of requesting automatic selection of a channel.
	 *
	 * @since 1.0
	 * @param channel the input value
	 * @return this instance
	 */
	public WLANConfiguration withChannel(Long channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * Get the current service set identifier in use by the connection.  The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as a "password" for joining a particular radio network (BSS).  Note: If an access point wishes to be known by more than one SSID, it MUST provide a ''WLANConfiguration'' instance for each SSID.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSsiD() {
		return ssiD;
	}

	/**
	 * Set the current service set identifier in use by the connection.  The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as a "password" for joining a particular radio network (BSS).  Note: If an access point wishes to be known by more than one SSID, it MUST provide a ''WLANConfiguration'' instance for each SSID.
	 *
	 * @since 1.0
	 * @param ssiD the input value
	 */
	public void  setSsiD(String ssiD) {
		this.ssiD = ssiD;
	}

	/**
	 * Set the current service set identifier in use by the connection.  The SSID is an identifier that is attached to packets sent over the wireless LAN that functions as a "password" for joining a particular radio network (BSS).  Note: If an access point wishes to be known by more than one SSID, it MUST provide a ''WLANConfiguration'' instance for each SSID.
	 *
	 * @since 1.0
	 * @param ssiD the input value
	 * @return this instance
	 */
	public WLANConfiguration withSsiD(String ssiD) {
		this.ssiD = ssiD;
		return this;
	}

	/**
	 * Get the capabilities that are currently enabled on the access point (and that are announced via beacons if {{param|BeaconAdvertisementEnabled}} is {{true}}). Write access to this parameter enables and disables such capabilities.

An attempt to set this parameter to one of the required (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this ''WLANConfiguration'' instance but is available on another ''WLANConfiguration'' instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

A value of {{enum|None}} means that no capabilities are currently enabled on the access point and that no stations will be able to associate with it.  {{enum}}

{{enum|11i}} SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The OBSOLETED values are those for Basic + WPA/WPA2  mixed modes, which are not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getBeaconType() {
		return beaconType;
	}

	/**
	 * Set the capabilities that are currently enabled on the access point (and that are announced via beacons if {{param|BeaconAdvertisementEnabled}} is {{true}}). Write access to this parameter enables and disables such capabilities.

An attempt to set this parameter to one of the required (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this ''WLANConfiguration'' instance but is available on another ''WLANConfiguration'' instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

A value of {{enum|None}} means that no capabilities are currently enabled on the access point and that no stations will be able to associate with it.  {{enum}}

{{enum|11i}} SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The OBSOLETED values are those for Basic + WPA/WPA2  mixed modes, which are not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @param beaconType the input value
	 */
	public void  setBeaconType(String beaconType) {
		this.beaconType = beaconType;
	}

	/**
	 * Set the capabilities that are currently enabled on the access point (and that are announced via beacons if {{param|BeaconAdvertisementEnabled}} is {{true}}). Write access to this parameter enables and disables such capabilities.

An attempt to set this parameter to one of the required (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this ''WLANConfiguration'' instance but is available on another ''WLANConfiguration'' instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

A value of {{enum|None}} means that no capabilities are currently enabled on the access point and that no stations will be able to associate with it.  {{enum}}

{{enum|11i}} SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The OBSOLETED values are those for Basic + WPA/WPA2  mixed modes, which are not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @param beaconType the input value
	 * @return this instance
	 */
	public WLANConfiguration withBeaconType(String beaconType) {
		this.beaconType = beaconType;
		return this;
	}

	/**
	 * Get the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacAddressControlEnabled() {
		return macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @param macAddressControlEnabled the input value
	 */
	public void  setMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @param macAddressControlEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
		return this;
	}

	/**
	 * Get the indicates which IEEE 802.11 standard this ''WLANConfiguration'' instance is configured for.  {{enum}}

Where each value indicates support for only the indicated standard.

If the device is configured simultaneously for more than one standard, a separate ''WLANConfiguration'' instance MUST be used for each supported standard.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Set the indicates which IEEE 802.11 standard this ''WLANConfiguration'' instance is configured for.  {{enum}}

Where each value indicates support for only the indicated standard.

If the device is configured simultaneously for more than one standard, a separate ''WLANConfiguration'' instance MUST be used for each supported standard.
	 *
	 * @since 1.0
	 * @param standard the input value
	 */
	public void  setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * Set the indicates which IEEE 802.11 standard this ''WLANConfiguration'' instance is configured for.  {{enum}}

Where each value indicates support for only the indicated standard.

If the device is configured simultaneously for more than one standard, a separate ''WLANConfiguration'' instance MUST be used for each supported standard.
	 *
	 * @since 1.0
	 * @param standard the input value
	 * @return this instance
	 */
	public WLANConfiguration withStandard(String standard) {
		this.standard = standard;
		return this;
	}

	/**
	 * Get the index of the default WEP key.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getWepKeyIndex() {
		return wepKeyIndex;
	}

	/**
	 * Set the index of the default WEP key.
	 *
	 * @since 1.0
	 * @param wepKeyIndex the input value
	 */
	public void  setWepKeyIndex(Long wepKeyIndex) {
		this.wepKeyIndex = wepKeyIndex;
	}

	/**
	 * Set the index of the default WEP key.
	 *
	 * @since 1.0
	 * @param wepKeyIndex the input value
	 * @return this instance
	 */
	public WLANConfiguration withWepKeyIndex(Long wepKeyIndex) {
		this.wepKeyIndex = wepKeyIndex;
		return this;
	}

	/**
	 * Get a passphrase from which the WEP keys are to be generated.

This parameter is the same as the parameter ''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.KeyPassphrase'' for the same instance of ''WLANConfiguration''.  When either parameter is changed, the value of the other is changed as well.

If {{param}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).

This MUST either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else MUST consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

Note: If a passphrase is used, all four WEP keys will be the same.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getKeyPassphrase() {
		return keyPassphrase;
	}

	/**
	 * Set a passphrase from which the WEP keys are to be generated.

This parameter is the same as the parameter ''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.KeyPassphrase'' for the same instance of ''WLANConfiguration''.  When either parameter is changed, the value of the other is changed as well.

If {{param}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).

This MUST either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else MUST consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

Note: If a passphrase is used, all four WEP keys will be the same.
	 *
	 * @since 1.0
	 * @param keyPassphrase the input value
	 */
	public void  setKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
	}

	/**
	 * Set a passphrase from which the WEP keys are to be generated.

This parameter is the same as the parameter ''InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.PreSharedKey.1.KeyPassphrase'' for the same instance of ''WLANConfiguration''.  When either parameter is changed, the value of the other is changed as well.

If {{param}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).

This MUST either be a valid key length divided by 8, in which case each byte contributes 8 bits to the key, or else MUST consist of Hex digits and be a valid key length divided by 4, in which case each byte contributes 4 bits to the key.

Note: If a passphrase is used, all four WEP keys will be the same.
	 *
	 * @since 1.0
	 * @param keyPassphrase the input value
	 * @return this instance
	 */
	public WLANConfiguration withKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
		return this;
	}

	/**
	 * Get the supported key lengths.  

Enumerated value must be one of [Disabled, 40-bit, 104-bit]

Any additional vendor-specific values MUST start with the key length in bits.

This parameter does not enforce a given encryption level but only indicates capabilities.  The WEP encryption level for a given key is inferred from the key length.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getWepEncryptionLevel() {
		if (this.wepEncryptionLevel == null){ this.wepEncryptionLevel=new ArrayList<>();}
		return wepEncryptionLevel;
	}

	/**
	 * Set the supported key lengths.  

Enumerated value must be one of [Disabled, 40-bit, 104-bit]

Any additional vendor-specific values MUST start with the key length in bits.

This parameter does not enforce a given encryption level but only indicates capabilities.  The WEP encryption level for a given key is inferred from the key length.
	 *
	 * @since 1.0
	 * @param wepEncryptionLevel the input value
	 */
	public void  setWepEncryptionLevel(Collection<String> wepEncryptionLevel) {
		this.wepEncryptionLevel = wepEncryptionLevel;
	}

	/**
	 * Set the supported key lengths.  

Enumerated value must be one of [Disabled, 40-bit, 104-bit]

Any additional vendor-specific values MUST start with the key length in bits.

This parameter does not enforce a given encryption level but only indicates capabilities.  The WEP encryption level for a given key is inferred from the key length.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withWepEncryptionLevel(String string) {
		getWepEncryptionLevel().add(string);
		return this;
	}

	/**
	 * Get the encryption modes that are available when basic 802.11 is enabled. {{enum|WEPEncryption}} implies that all wireless clients can use WEP for data encryption.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getBasicEncryptionModes() {
		return basicEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when basic 802.11 is enabled. {{enum|WEPEncryption}} implies that all wireless clients can use WEP for data encryption.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param basicEncryptionModes the input value
	 */
	public void  setBasicEncryptionModes(String basicEncryptionModes) {
		this.basicEncryptionModes = basicEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when basic 802.11 is enabled. {{enum|WEPEncryption}} implies that all wireless clients can use WEP for data encryption.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param basicEncryptionModes the input value
	 * @return this instance
	 */
	public WLANConfiguration withBasicEncryptionModes(String basicEncryptionModes) {
		this.basicEncryptionModes = basicEncryptionModes;
		return this;
	}

	/**
	 * Get authentication modes that are available when basic 802.11 is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getBasicAuthenticationMode() {
		return basicAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when basic 802.11 is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param basicAuthenticationMode the input value
	 */
	public void  setBasicAuthenticationMode(String basicAuthenticationMode) {
		this.basicAuthenticationMode = basicAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when basic 802.11 is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param basicAuthenticationMode the input value
	 * @return this instance
	 */
	public WLANConfiguration withBasicAuthenticationMode(String basicAuthenticationMode) {
		this.basicAuthenticationMode = basicAuthenticationMode;
		return this;
	}

	/**
	 * Get the encryption modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWpaEncryptionModes() {
		return wpaEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @param wpaEncryptionModes the input value
	 */
	public void  setWpaEncryptionModes(String wpaEncryptionModes) {
		this.wpaEncryptionModes = wpaEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA specifications.
	 *
	 * @since 1.0
	 * @param wpaEncryptionModes the input value
	 * @return this instance
	 */
	public WLANConfiguration withWpaEncryptionModes(String wpaEncryptionModes) {
		this.wpaEncryptionModes = wpaEncryptionModes;
		return this;
	}

	/**
	 * Get authentication modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWpaAuthenticationMode() {
		return wpaAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param wpaAuthenticationMode the input value
	 */
	public void  setWpaAuthenticationMode(String wpaAuthenticationMode) {
		this.wpaAuthenticationMode = wpaAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 * @param wpaAuthenticationMode the input value
	 * @return this instance
	 */
	public WLANConfiguration withWpaAuthenticationMode(String wpaAuthenticationMode) {
		this.wpaAuthenticationMode = wpaAuthenticationMode;
		return this;
	}

	/**
	 * Get the encryption modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA2 specifications.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIeeE11iEncryptionModes() {
		return ieeE11iEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA2 specifications.
	 *
	 * @since 1.0
	 * @param ieeE11iEncryptionModes the input value
	 */
	public void  setIeeE11iEncryptionModes(String ieeE11iEncryptionModes) {
		this.ieeE11iEncryptionModes = ieeE11iEncryptionModes;
	}

	/**
	 * Set the encryption modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).

The DEPRECATED values are those that combine WEP with TKIP and/or AES, which is not permitted by the WPA2 specifications.
	 *
	 * @since 1.0
	 * @param ieeE11iEncryptionModes the input value
	 * @return this instance
	 */
	public WLANConfiguration withIeeE11iEncryptionModes(String ieeE11iEncryptionModes) {
		this.ieeE11iEncryptionModes = ieeE11iEncryptionModes;
		return this;
	}

	/**
	 * Get authentication modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIeeE11iAuthenticationMode() {
		return ieeE11iAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).
	 *
	 * @since 1.0
	 * @param ieeE11iAuthenticationMode the input value
	 */
	public void  setIeeE11iAuthenticationMode(String ieeE11iAuthenticationMode) {
		this.ieeE11iAuthenticationMode = ieeE11iAuthenticationMode;
	}

	/**
	 * Set authentication modes that are available when 802.11i is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support 802.11i then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.

''IEEE11i'' SHOULD be taken to refer to both the 802.11i specification and to the WPA2 specification (any WPA2-certified device will implement all mandatory parts of the 802.11i standard).
	 *
	 * @since 1.0
	 * @param ieeE11iAuthenticationMode the input value
	 * @return this instance
	 */
	public WLANConfiguration withIeeE11iAuthenticationMode(String ieeE11iAuthenticationMode) {
		this.ieeE11iAuthenticationMode = ieeE11iAuthenticationMode;
		return this;
	}

	/**
	 * Get the possible radio channels for the wireless standard (a, b or g) and the regulatory domain. 

Ranges in the form "n-m" are permitted.

For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getPossibleChannels() {
		if (this.possibleChannels == null){ this.possibleChannels=new ArrayList<>();}
		return possibleChannels;
	}

	/**
	 * Set the possible radio channels for the wireless standard (a, b or g) and the regulatory domain. 

Ranges in the form "n-m" are permitted.

For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 1.0
	 * @param possibleChannels the input value
	 */
	public void  setPossibleChannels(Collection<String> possibleChannels) {
		this.possibleChannels = possibleChannels;
	}

	/**
	 * Set the possible radio channels for the wireless standard (a, b or g) and the regulatory domain. 

Ranges in the form "n-m" are permitted.

For example, for 802.11b and North America, would be "1-11".
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withPossibleChannels(String string) {
		getPossibleChannels().add(string);
		return this;
	}

	/**
	 * Get the maximum access point data transmit rates in Mbps for unicast, multicast and broadcast frames.

For example, a value of "1,2", indicates that unicast, multicast and broadcast frames can be transmitted at 1 Mbps and 2 Mbps.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getBasicDataTransmitRates() {
		if (this.basicDataTransmitRates == null){ this.basicDataTransmitRates=new ArrayList<>();}
		return basicDataTransmitRates;
	}

	/**
	 * Set the maximum access point data transmit rates in Mbps for unicast, multicast and broadcast frames.

For example, a value of "1,2", indicates that unicast, multicast and broadcast frames can be transmitted at 1 Mbps and 2 Mbps.
	 *
	 * @since 1.0
	 * @param basicDataTransmitRates the input value
	 */
	public void  setBasicDataTransmitRates(Collection<String> basicDataTransmitRates) {
		this.basicDataTransmitRates = basicDataTransmitRates;
	}

	/**
	 * Set the maximum access point data transmit rates in Mbps for unicast, multicast and broadcast frames.

For example, a value of "1,2", indicates that unicast, multicast and broadcast frames can be transmitted at 1 Mbps and 2 Mbps.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withBasicDataTransmitRates(String string) {
		getBasicDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the maximum access point data transmit rates in Mbps for unicast frames (a superset of {{param|BasicDataTransmitRates}}).

Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getOperationalDataTransmitRates() {
		if (this.operationalDataTransmitRates == null){ this.operationalDataTransmitRates=new ArrayList<>();}
		return operationalDataTransmitRates;
	}

	/**
	 * Set the maximum access point data transmit rates in Mbps for unicast frames (a superset of {{param|BasicDataTransmitRates}}).

Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 1.0
	 * @param operationalDataTransmitRates the input value
	 */
	public void  setOperationalDataTransmitRates(Collection<String> operationalDataTransmitRates) {
		this.operationalDataTransmitRates = operationalDataTransmitRates;
	}

	/**
	 * Set the maximum access point data transmit rates in Mbps for unicast frames (a superset of {{param|BasicDataTransmitRates}}).

Given the value of {{param|BasicDataTransmitRates}} from the example above, {{param}} might be "1,2,5.5,11", indicating that unicast frames can additionally be transmitted at 5.5 Mbps and 11 Mbps.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withOperationalDataTransmitRates(String string) {
		getOperationalDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the data transmit rates for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}).

Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getPossibleDataTransmitRates() {
		if (this.possibleDataTransmitRates == null){ this.possibleDataTransmitRates=new ArrayList<>();}
		return possibleDataTransmitRates;
	}

	/**
	 * Set the data transmit rates for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}).

Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 1.0
	 * @param possibleDataTransmitRates the input value
	 */
	public void  setPossibleDataTransmitRates(Collection<String> possibleDataTransmitRates) {
		this.possibleDataTransmitRates = possibleDataTransmitRates;
	}

	/**
	 * Set the data transmit rates for unicast frames at which the access point will permit a station to connect (a subset of {{param|OperationalDataTransmitRates}}).

Given the values of {{param|BasicDataTransmitRates}} and {{param|OperationalDataTransmitRates}} from the examples above, {{param}} might be "1,2,5.5", indicating that the AP will only permit connections at 1 Mbps, 2 Mbps and 5.5 Mbps, even though it could theoretically accept connections at 11 Mbps.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withPossibleDataTransmitRates(String string) {
		getPossibleDataTransmitRates().add(string);
		return this;
	}

	/**
	 * Get the indicates whether insecure write access via mechanisms other than the CPE WAN Management Protocol is permitted to the parameters in this object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isInsecureOOBAccessEnabled() {
		return insecureOOBAccessEnabled;
	}

	/**
	 * Set the indicates whether insecure write access via mechanisms other than the CPE WAN Management Protocol is permitted to the parameters in this object.
	 *
	 * @since 1.0
	 * @param insecureOOBAccessEnabled the input value
	 */
	public void  setInsecureOOBAccessEnabled(Boolean insecureOOBAccessEnabled) {
		this.insecureOOBAccessEnabled = insecureOOBAccessEnabled;
	}

	/**
	 * Set the indicates whether insecure write access via mechanisms other than the CPE WAN Management Protocol is permitted to the parameters in this object.
	 *
	 * @since 1.0
	 * @param insecureOOBAccessEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withInsecureOOBAccessEnabled(Boolean insecureOOBAccessEnabled) {
		this.insecureOOBAccessEnabled = insecureOOBAccessEnabled;
		return this;
	}

	/**
	 * Get the indicates whether or not the access point is sending out beacons.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isBeaconAdvertisementEnabled() {
		return beaconAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not the access point is sending out beacons.
	 *
	 * @since 1.0
	 * @param beaconAdvertisementEnabled the input value
	 */
	public void  setBeaconAdvertisementEnabled(Boolean beaconAdvertisementEnabled) {
		this.beaconAdvertisementEnabled = beaconAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not the access point is sending out beacons.
	 *
	 * @since 1.0
	 * @param beaconAdvertisementEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withBeaconAdvertisementEnabled(Boolean beaconAdvertisementEnabled) {
		this.beaconAdvertisementEnabled = beaconAdvertisementEnabled;
		return this;
	}

	/**
	 * Get the indicates whether or not the access point radio is enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isRadioEnabled() {
		return radioEnabled;
	}

	/**
	 * Set the indicates whether or not the access point radio is enabled.
	 *
	 * @since 1.0
	 * @param radioEnabled the input value
	 */
	public void  setRadioEnabled(Boolean radioEnabled) {
		this.radioEnabled = radioEnabled;
	}

	/**
	 * Set the indicates whether or not the access point radio is enabled.
	 *
	 * @since 1.0
	 * @param radioEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withRadioEnabled(Boolean radioEnabled) {
		this.radioEnabled = radioEnabled;
		return this;
	}

	/**
	 * Get the indicates whether the access point can automatically reduce the data rate in the event of undue noise or contention.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAutoRateFallBackEnabled() {
		return autoRateFallBackEnabled;
	}

	/**
	 * Set the indicates whether the access point can automatically reduce the data rate in the event of undue noise or contention.
	 *
	 * @since 1.0
	 * @param autoRateFallBackEnabled the input value
	 */
	public void  setAutoRateFallBackEnabled(Boolean autoRateFallBackEnabled) {
		this.autoRateFallBackEnabled = autoRateFallBackEnabled;
	}

	/**
	 * Set the indicates whether the access point can automatically reduce the data rate in the event of undue noise or contention.
	 *
	 * @since 1.0
	 * @param autoRateFallBackEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withAutoRateFallBackEnabled(Boolean autoRateFallBackEnabled) {
		this.autoRateFallBackEnabled = autoRateFallBackEnabled;
		return this;
	}

	/**
	 * Get an XML description of information used to identify the access point by name and physical location.  The CPE is not expected to parse this string, but simply to treat it as an opaque string.  {{empty}} indicates no location has been set.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLocationDescription() {
		return locationDescription;
	}

	/**
	 * Set an XML description of information used to identify the access point by name and physical location.  The CPE is not expected to parse this string, but simply to treat it as an opaque string.  {{empty}} indicates no location has been set.
	 *
	 * @since 1.0
	 * @param locationDescription the input value
	 */
	public void  setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	/**
	 * Set an XML description of information used to identify the access point by name and physical location.  The CPE is not expected to parse this string, but simply to treat it as an opaque string.  {{empty}} indicates no location has been set.
	 *
	 * @since 1.0
	 * @param locationDescription the input value
	 * @return this instance
	 */
	public WLANConfiguration withLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
		return this;
	}

	/**
	 * Get the 802.11d Regulatory Domain String.  First two octets are ISO/IEC 3166-1 two-character country code.  The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRegulatoryDomain() {
		return regulatoryDomain;
	}

	/**
	 * Set the 802.11d Regulatory Domain String.  First two octets are ISO/IEC 3166-1 two-character country code.  The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 1.0
	 * @param regulatoryDomain the input value
	 */
	public void  setRegulatoryDomain(String regulatoryDomain) {
		this.regulatoryDomain = regulatoryDomain;
	}

	/**
	 * Set the 802.11d Regulatory Domain String.  First two octets are ISO/IEC 3166-1 two-character country code.  The third octet is either " " (all environments), "O" (outside) or "I" (inside).
	 *
	 * @since 1.0
	 * @param regulatoryDomain the input value
	 * @return this instance
	 */
	public WLANConfiguration withRegulatoryDomain(String regulatoryDomain) {
		this.regulatoryDomain = regulatoryDomain;
		return this;
	}

	/**
	 * Get the number of times pre-shared key (PSK) authentication has failed (relevant only to WPA and 802.11i).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPSKFailures() {
		return totalPSKFailures;
	}

	/**
	 * Set the number of times pre-shared key (PSK) authentication has failed (relevant only to WPA and 802.11i).
	 *
	 * @since 1.0
	 * @param totalPSKFailures the input value
	 */
	public void  setTotalPSKFailures(Long totalPSKFailures) {
		this.totalPSKFailures = totalPSKFailures;
	}

	/**
	 * Set the number of times pre-shared key (PSK) authentication has failed (relevant only to WPA and 802.11i).
	 *
	 * @since 1.0
	 * @param totalPSKFailures the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalPSKFailures(Long totalPSKFailures) {
		this.totalPSKFailures = totalPSKFailures;
		return this;
	}

	/**
	 * Get the number of times the MICHAEL integrity check has failed (relevant only to WPA and 802.11i)
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalIntegrityFailures() {
		return totalIntegrityFailures;
	}

	/**
	 * Set the number of times the MICHAEL integrity check has failed (relevant only to WPA and 802.11i)
	 *
	 * @since 1.0
	 * @param totalIntegrityFailures the input value
	 */
	public void  setTotalIntegrityFailures(Long totalIntegrityFailures) {
		this.totalIntegrityFailures = totalIntegrityFailures;
	}

	/**
	 * Set the number of times the MICHAEL integrity check has failed (relevant only to WPA and 802.11i)
	 *
	 * @since 1.0
	 * @param totalIntegrityFailures the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalIntegrityFailures(Long totalIntegrityFailures) {
		this.totalIntegrityFailures = totalIntegrityFailures;
		return this;
	}

	/**
	 * Get the channels that the access point determines to be currently in use (including any that it is using itself).

Ranges in the form "n-m" are permitted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getChannelsInUse() {
		if (this.channelsInUse == null){ this.channelsInUse=new ArrayList<>();}
		return channelsInUse;
	}

	/**
	 * Set the channels that the access point determines to be currently in use (including any that it is using itself).

Ranges in the form "n-m" are permitted.
	 *
	 * @since 1.0
	 * @param channelsInUse the input value
	 */
	public void  setChannelsInUse(Collection<String> channelsInUse) {
		this.channelsInUse = channelsInUse;
	}

	/**
	 * Set the channels that the access point determines to be currently in use (including any that it is using itself).

Ranges in the form "n-m" are permitted.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WLANConfiguration withChannelsInUse(String string) {
		getChannelsInUse().add(string);
		return this;
	}

	/**
	 * Get the current access-point operating mode.  The optional modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDeviceOperationMode() {
		return deviceOperationMode;
	}

	/**
	 * Set the current access-point operating mode.  The optional modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 * @param deviceOperationMode the input value
	 */
	public void  setDeviceOperationMode(String deviceOperationMode) {
		this.deviceOperationMode = deviceOperationMode;
	}

	/**
	 * Set the current access-point operating mode.  The optional modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 * @param deviceOperationMode the input value
	 * @return this instance
	 */
	public WLANConfiguration withDeviceOperationMode(String deviceOperationMode) {
		this.deviceOperationMode = deviceOperationMode;
		return this;
	}

	/**
	 * Get the number of hops from the root access point to the wireless repeater or bridge.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDistanceFromRoot() {
		return distanceFromRoot;
	}

	/**
	 * Set the number of hops from the root access point to the wireless repeater or bridge.
	 *
	 * @since 1.0
	 * @param distanceFromRoot the input value
	 */
	public void  setDistanceFromRoot(Long distanceFromRoot) {
		this.distanceFromRoot = distanceFromRoot;
	}

	/**
	 * Set the number of hops from the root access point to the wireless repeater or bridge.
	 *
	 * @since 1.0
	 * @param distanceFromRoot the input value
	 * @return this instance
	 */
	public WLANConfiguration withDistanceFromRoot(Long distanceFromRoot) {
		this.distanceFromRoot = distanceFromRoot;
		return this;
	}

	/**
	 * Get the MAC address of the peer in wireless repeater or bridge mode.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPeerBSSID() {
		return peerBSSID;
	}

	/**
	 * Set the MAC address of the peer in wireless repeater or bridge mode.
	 *
	 * @since 1.0
	 * @param peerBSSID the input value
	 */
	public void  setPeerBSSID(String peerBSSID) {
		this.peerBSSID = peerBSSID;
	}

	/**
	 * Set the MAC address of the peer in wireless repeater or bridge mode.
	 *
	 * @since 1.0
	 * @param peerBSSID the input value
	 * @return this instance
	 */
	public WLANConfiguration withPeerBSSID(String peerBSSID) {
		this.peerBSSID = peerBSSID;
		return this;
	}

	/**
	 * Get the indicates whether another service is involved in client authentication ({{enum|LinkAuthentication}} for a co-located authentication server; {{enum|RadiusClient}} for an external RADIUS server).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAuthenticationServiceMode() {
		return authenticationServiceMode;
	}

	/**
	 * Set the indicates whether another service is involved in client authentication ({{enum|LinkAuthentication}} for a co-located authentication server; {{enum|RadiusClient}} for an external RADIUS server).
	 *
	 * @since 1.0
	 * @param authenticationServiceMode the input value
	 */
	public void  setAuthenticationServiceMode(String authenticationServiceMode) {
		this.authenticationServiceMode = authenticationServiceMode;
	}

	/**
	 * Set the indicates whether another service is involved in client authentication ({{enum|LinkAuthentication}} for a co-located authentication server; {{enum|RadiusClient}} for an external RADIUS server).
	 *
	 * @since 1.0
	 * @param authenticationServiceMode the input value
	 * @return this instance
	 */
	public WLANConfiguration withAuthenticationServiceMode(String authenticationServiceMode) {
		this.authenticationServiceMode = authenticationServiceMode;
		return this;
	}

	/**
	 * Get the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of bytes received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsSent() {
		return totalPacketsSent;
	}

	/**
	 * Set the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 */
	public void  setTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
	}

	/**
	 * Set the total number of packets sent over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
		return this;
	}

	/**
	 * Get the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsReceived() {
		return totalPacketsReceived;
	}

	/**
	 * Set the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 */
	public void  setTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
	}

	/**
	 * Set the total number of packets received over the interface since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
		return this;
	}

	/**
	 * Get the number of devices currently associated with the access point.  This corresponds to the number of entries in the {{object|AssociatedDeivce}} table.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalAssociations() {
		return totalAssociations;
	}

	/**
	 * Set the number of devices currently associated with the access point.  This corresponds to the number of entries in the {{object|AssociatedDeivce}} table.
	 *
	 * @since 1.0
	 * @param totalAssociations the input value
	 */
	public void  setTotalAssociations(Long totalAssociations) {
		this.totalAssociations = totalAssociations;
	}

	/**
	 * Set the number of devices currently associated with the access point.  This corresponds to the number of entries in the {{object|AssociatedDeivce}} table.
	 *
	 * @since 1.0
	 * @param totalAssociations the input value
	 * @return this instance
	 */
	public WLANConfiguration withTotalAssociations(Long totalAssociations) {
		this.totalAssociations = totalAssociations;
		return this;
	}

	/**
	 * Get a table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set a table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set a table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public WLANConfiguration withAssociatedDevice(AssociatedDevice associatedDevice) {
		getAssociatedDevices().add(associatedDevice);
		return this;
	}

	/**
	 * Get the this is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<WEPKey> getWepKeies() {
		if (this.wepKeies == null){ this.wepKeies=new ArrayList<>();}
		return wepKeies;
	}

	/**
	 * Set the this is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param wepKeies the input value
	 */
	public void  setWepKeies(Collection<WEPKey> wepKeies) {
		this.wepKeies = wepKeies;
	}

	/**
	 * Set the this is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param wepKey the input value
	 * @return this instance
	 */
	public WLANConfiguration withWEPKey(WEPKey wepKey) {
		getWepKeies().add(wepKey);
		return this;
	}

	/**
	 * Get the this is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<PreSharedKey> getPreSharedKeies() {
		if (this.preSharedKeies == null){ this.preSharedKeies=new ArrayList<>();}
		return preSharedKeies;
	}

	/**
	 * Set the this is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param preSharedKeies the input value
	 */
	public void  setPreSharedKeies(Collection<PreSharedKey> preSharedKeies) {
		this.preSharedKeies = preSharedKeies;
	}

	/**
	 * Set the this is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param preSharedKey the input value
	 * @return this instance
	 */
	public WLANConfiguration withPreSharedKey(PreSharedKey preSharedKey) {
		getPreSharedKeies().add(preSharedKey);
		return this;
	}

	//</editor-fold>

}