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
package org.broadbandforum.tr098.internetgatewaydevice.landevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.APWMMParameter;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.AssociatedDevice;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.PreSharedKey;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.STAWMMParameter;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.Stats;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.WEPKey;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.WPS;

	/**
	 * This object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.")
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
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The name of this layer 2 interface, chosen by the vendor, e.g. "wlan0".
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Name")
	@Size(max = 16)
	public String name;
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
	 * The current radio channel used by the connection.  To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Channel")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long channel;
	/**
	 * Enable or disable automatic channel selection.

Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

Set to {{true}} to enable the automatic channel selection procedure.  This procedure MUST automatically select the channel, and MAY also change it subsequently.

{{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AutoChannelEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean autoChannelEnable;
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

An attempt to set this parameter to one of the REQUIRED (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this WLANConfiguration instance but is available on another WLANConfiguration instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

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
	public String basicEncryptionModes;
	/**
	 * Authentication modes that are available when basic 802.11 is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support basic 802.11 then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BasicAuthenticationMode")
	@CWMPParameter(access = "readWrite")
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
	public String wpaEncryptionModes;
	/**
	 * Authentication modes that are available when WPA is enabled.  {{enum}}

If this ''WLANConfiguration'' instance does not support WPA then this parameter MUST NOT be present in this instance of the ''WLANConfiguration'' object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WPAAuthenticationMode")
	@CWMPParameter(access = "readWrite")
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
	 * Indicates whether or not beacons include the SSID name.

This parameter has an effect only if {{param|BeaconAdvertisementEnabled}} is {{true}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SSIDAdvertisementEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean ssiDAdvertisementEnabled;
	/**
	 * Indicates whether or not the access point radio is enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RadioEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean radioEnabled;
	/**
	 * Supported transmit power levels as percentages of full power.  For example, "0,25,50,75,100".
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TransmitPowerSupported")
	@Size(min = 0, max = 100)
	public Long transmitPowerSupported;
	/**
	 * Indicates the current transmit power level as a percentage of full power.  The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TransmitPower")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 100)
	public Long transmitPower;
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
	 * The current access-point operating mode.  The OPTIONAL modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DeviceOperationMode")
	@CWMPParameter(access = "readWrite")
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
	 * Indicates whether this interface supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "WMMSupported")
	public Boolean wmmSupported;
	/**
	 * Indicates whether this interface supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

Note: U-APSD support implies WMM support.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UAPSDSupported")
	public Boolean uapSDSupported;
	/**
	 * Whether WMM support is currently enabled.  When enabled, this is indicated in beacon frames
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "WMMEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean wmmEnable;
	/**
	 * Whether U-APSD support is currently enabled.  When enabled, this is indicated in beacon frames.

Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UAPSDEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean uapSDEnable;
	/**
	 * The total number of bytes transmitted out of the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesSent;
	/**
	 * The total number of bytes received on the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesReceived;
	/**
	 * The total number of packets transmitted out of the interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsSent;
	/**
	 * The total number of packets which were received on this interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsReceived;
	/**
	 * The number of devices currently associated with the access point.  This corresponds to the number of entries in the AssociatedDevice table.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalAssociations")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalAssociations;
	/**
	 * This object contains statistics for an 802.11 LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.

Note that this object does not include the total byte and packet statistics, which are, for historical reasons, in the parent object.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This object contains parameters related to WPS (Wi-Fi Protected Setup) {{bibref|WPSv1.0}} that apply to a CPE acting as an Access Point.
	 */
	@XmlElement(name = "WPS")
	public WPS wps;
	/**
	 * A table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "associatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;
	/**
	 * This is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "wepKeies")
	@XmlElement(name = "WEPKey")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<WEPKey> wepKeies;
	/**
	 * This is a table of preshared keys.  The size of this table is fixed with exactly 10 entries (with instance numbers 1 through 10).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "preSharedKeies")
	@XmlElement(name = "PreSharedKey")
	@CWMPParameter(minEntries = 10, maxEntries = 10)
	public Collection<PreSharedKey> preSharedKeies;
	/**
	 * This is a table of WMM parameters for traffic that originates at the wireless access point, i.e. for outgoing traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 */
	@XmlElementWrapper(name = "apwMMParameters")
	@XmlElement(name = "APWMMParameter")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<APWMMParameter> apwMMParameters;
	/**
	 * This is a table of WMM parameters for traffic that originates at the wireless station, i.e. for incoming traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 */
	@XmlElementWrapper(name = "staWMMParameters")
	@XmlElement(name = "STAWMMParameter")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<STAWMMParameter> staWMMParameters;

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
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public WLANConfiguration withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of this layer 2 interface, chosen by the vendor, e.g. "wlan0".
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this layer 2 interface, chosen by the vendor, e.g. "wlan0".
	 *
	 * @since 1.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this layer 2 interface, chosen by the vendor, e.g. "wlan0".
	 *
	 * @since 1.4
	 * @param name the input value
	 * @return this instance
	 */
	public WLANConfiguration withName(String name) {
		this.name = name;
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
	 * Get the current radio channel used by the connection.  To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getChannel() {
		return channel;
	}

	/**
	 * Set the current radio channel used by the connection.  To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.0
	 * @param channel the input value
	 */
	public void  setChannel(Long channel) {
		this.channel = channel;
	}

	/**
	 * Set the current radio channel used by the connection.  To request automatic channel selection, set {{param|AutoChannelEnable}} to {{true}}.

Whenever {{param|AutoChannelEnable}} is {{true}}, the value of the {{param}} parameter MUST be the channel selected by the automatic channel selection procedure.
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
	 * Get the enable or disable automatic channel selection.

Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

Set to {{true}} to enable the automatic channel selection procedure.  This procedure MUST automatically select the channel, and MAY also change it subsequently.

{{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isAutoChannelEnable() {
		return autoChannelEnable;
	}

	/**
	 * Set the enable or disable automatic channel selection.

Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

Set to {{true}} to enable the automatic channel selection procedure.  This procedure MUST automatically select the channel, and MAY also change it subsequently.

{{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.4
	 * @param autoChannelEnable the input value
	 */
	public void  setAutoChannelEnable(Boolean autoChannelEnable) {
		this.autoChannelEnable = autoChannelEnable;
	}

	/**
	 * Set the enable or disable automatic channel selection.

Set to {{false}} to disable the automatic channel selection procedure, in which case the currently selected channel remains selected.

Set to {{true}} to enable the automatic channel selection procedure.  This procedure MUST automatically select the channel, and MAY also change it subsequently.

{{param}} MUST automatically change to {{false}} whenever the channel is manually selected, i.e. whenever the {{param|Channel}} parameter is written.

Whenever {{param}} is {{true}}, the value of the {{param|Channel}} parameter MUST be the channel selected by the automatic channel selection procedure.
	 *
	 * @since 1.4
	 * @param autoChannelEnable the input value
	 * @return this instance
	 */
	public WLANConfiguration withAutoChannelEnable(Boolean autoChannelEnable) {
		this.autoChannelEnable = autoChannelEnable;
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

An attempt to set this parameter to one of the REQUIRED (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this WLANConfiguration instance but is available on another WLANConfiguration instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

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

An attempt to set this parameter to one of the REQUIRED (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this WLANConfiguration instance but is available on another WLANConfiguration instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

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

An attempt to set this parameter to one of the REQUIRED (mandatory) values MAY be rejected if (and only if) the requested capability is not available on this WLANConfiguration instance but is available on another WLANConfiguration instance within this Internet Gateway Device. For example, only basic 802.11 might be supported by one virtual AP, and only WPA might be supported by another virtual AP.

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
	 * Get the indicates whether or not beacons include the SSID name.

This parameter has an effect only if {{param|BeaconAdvertisementEnabled}} is {{true}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isSsiDAdvertisementEnabled() {
		return ssiDAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not beacons include the SSID name.

This parameter has an effect only if {{param|BeaconAdvertisementEnabled}} is {{true}}.
	 *
	 * @since 1.4
	 * @param ssiDAdvertisementEnabled the input value
	 */
	public void  setSsiDAdvertisementEnabled(Boolean ssiDAdvertisementEnabled) {
		this.ssiDAdvertisementEnabled = ssiDAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not beacons include the SSID name.

This parameter has an effect only if {{param|BeaconAdvertisementEnabled}} is {{true}}.
	 *
	 * @since 1.4
	 * @param ssiDAdvertisementEnabled the input value
	 * @return this instance
	 */
	public WLANConfiguration withSsiDAdvertisementEnabled(Boolean ssiDAdvertisementEnabled) {
		this.ssiDAdvertisementEnabled = ssiDAdvertisementEnabled;
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
	 * Get the supported transmit power levels as percentages of full power.  For example, "0,25,50,75,100".
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTransmitPowerSupported() {
		return transmitPowerSupported;
	}

	/**
	 * Set the supported transmit power levels as percentages of full power.  For example, "0,25,50,75,100".
	 *
	 * @since 1.4
	 * @param transmitPowerSupported the input value
	 */
	public void  setTransmitPowerSupported(Long transmitPowerSupported) {
		this.transmitPowerSupported = transmitPowerSupported;
	}

	/**
	 * Set the supported transmit power levels as percentages of full power.  For example, "0,25,50,75,100".
	 *
	 * @since 1.4
	 * @param transmitPowerSupported the input value
	 * @return this instance
	 */
	public WLANConfiguration withTransmitPowerSupported(Long transmitPowerSupported) {
		this.transmitPowerSupported = transmitPowerSupported;
		return this;
	}

	/**
	 * Get the indicates the current transmit power level as a percentage of full power.  The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTransmitPower() {
		return transmitPower;
	}

	/**
	 * Set the indicates the current transmit power level as a percentage of full power.  The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter.
	 *
	 * @since 1.4
	 * @param transmitPower the input value
	 */
	public void  setTransmitPower(Long transmitPower) {
		this.transmitPower = transmitPower;
	}

	/**
	 * Set the indicates the current transmit power level as a percentage of full power.  The value MUST be one of the values reported by the {{param|TransmitPowerSupported}} parameter.
	 *
	 * @since 1.4
	 * @param transmitPower the input value
	 * @return this instance
	 */
	public WLANConfiguration withTransmitPower(Long transmitPower) {
		this.transmitPower = transmitPower;
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
	 * Get the current access-point operating mode.  The OPTIONAL modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDeviceOperationMode() {
		return deviceOperationMode;
	}

	/**
	 * Set the current access-point operating mode.  The OPTIONAL modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
	 *
	 * @since 1.0
	 * @param deviceOperationMode the input value
	 */
	public void  setDeviceOperationMode(String deviceOperationMode) {
		this.deviceOperationMode = deviceOperationMode;
	}

	/**
	 * Set the current access-point operating mode.  The OPTIONAL modes permit the AP to be configured as a wireless bridge (to bridge two wired networks), repeater (a bridge that also serves wireless clients), or wireless station. Ad hoc stations are not supported.
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
	 * Get the indicates whether this interface supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isWmmSupported() {
		return wmmSupported;
	}

	/**
	 * Set the indicates whether this interface supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 1.4
	 * @param wmmSupported the input value
	 */
	public void  setWmmSupported(Boolean wmmSupported) {
		this.wmmSupported = wmmSupported;
	}

	/**
	 * Set the indicates whether this interface supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 1.4
	 * @param wmmSupported the input value
	 * @return this instance
	 */
	public WLANConfiguration withWmmSupported(Boolean wmmSupported) {
		this.wmmSupported = wmmSupported;
		return this;
	}

	/**
	 * Get the indicates whether this interface supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

Note: U-APSD support implies WMM support.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isUapSDSupported() {
		return uapSDSupported;
	}

	/**
	 * Set the indicates whether this interface supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

Note: U-APSD support implies WMM support.
	 *
	 * @since 1.4
	 * @param uapSDSupported the input value
	 */
	public void  setUapSDSupported(Boolean uapSDSupported) {
		this.uapSDSupported = uapSDSupported;
	}

	/**
	 * Set the indicates whether this interface supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

Note: U-APSD support implies WMM support.
	 *
	 * @since 1.4
	 * @param uapSDSupported the input value
	 * @return this instance
	 */
	public WLANConfiguration withUapSDSupported(Boolean uapSDSupported) {
		this.uapSDSupported = uapSDSupported;
		return this;
	}

	/**
	 * Get the whether WMM support is currently enabled.  When enabled, this is indicated in beacon frames
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isWmmEnable() {
		return wmmEnable;
	}

	/**
	 * Set the whether WMM support is currently enabled.  When enabled, this is indicated in beacon frames
	 *
	 * @since 1.4
	 * @param wmmEnable the input value
	 */
	public void  setWmmEnable(Boolean wmmEnable) {
		this.wmmEnable = wmmEnable;
	}

	/**
	 * Set the whether WMM support is currently enabled.  When enabled, this is indicated in beacon frames
	 *
	 * @since 1.4
	 * @param wmmEnable the input value
	 * @return this instance
	 */
	public WLANConfiguration withWmmEnable(Boolean wmmEnable) {
		this.wmmEnable = wmmEnable;
		return this;
	}

	/**
	 * Get the whether U-APSD support is currently enabled.  When enabled, this is indicated in beacon frames.

Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isUapSDEnable() {
		return uapSDEnable;
	}

	/**
	 * Set the whether U-APSD support is currently enabled.  When enabled, this is indicated in beacon frames.

Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 1.4
	 * @param uapSDEnable the input value
	 */
	public void  setUapSDEnable(Boolean uapSDEnable) {
		this.uapSDEnable = uapSDEnable;
	}

	/**
	 * Set the whether U-APSD support is currently enabled.  When enabled, this is indicated in beacon frames.

Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 1.4
	 * @param uapSDEnable the input value
	 * @return this instance
	 */
	public WLANConfiguration withUapSDEnable(Boolean uapSDEnable) {
		this.uapSDEnable = uapSDEnable;
		return this;
	}

	/**
	 * Get the total number of bytes transmitted out of the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
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
	 * Get the total number of bytes received on the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
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
	 * Get the total number of packets transmitted out of the interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsSent() {
		return totalPacketsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 */
	public void  setTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
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
	 * Get the total number of packets which were received on this interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsReceived() {
		return totalPacketsReceived;
	}

	/**
	 * Set the total number of packets which were received on this interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 */
	public void  setTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
	}

	/**
	 * Set the total number of packets which were received on this interface.

The value of this counter MAY be reset to zero when the CPE is rebooted.
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
	 * Get the number of devices currently associated with the access point.  This corresponds to the number of entries in the AssociatedDevice table.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalAssociations() {
		return totalAssociations;
	}

	/**
	 * Set the number of devices currently associated with the access point.  This corresponds to the number of entries in the AssociatedDevice table.
	 *
	 * @since 1.0
	 * @param totalAssociations the input value
	 */
	public void  setTotalAssociations(Long totalAssociations) {
		this.totalAssociations = totalAssociations;
	}

	/**
	 * Set the number of devices currently associated with the access point.  This corresponds to the number of entries in the AssociatedDevice table.
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
	 * Get the this object contains statistics for an 802.11 LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.

Note that this object does not include the total byte and packet statistics, which are, for historical reasons, in the parent object.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for an 802.11 LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.

Note that this object does not include the total byte and packet statistics, which are, for historical reasons, in the parent object.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for an 802.11 LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.

Note that this object does not include the total byte and packet statistics, which are, for historical reasons, in the parent object.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WLANConfiguration withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this object contains parameters related to WPS (Wi-Fi Protected Setup) {{bibref|WPSv1.0}} that apply to a CPE acting as an Access Point.
	 *
	 * @return the value
	 */
	public WPS getWps() {
		return wps;
	}

	/**
	 * Set the this object contains parameters related to WPS (Wi-Fi Protected Setup) {{bibref|WPSv1.0}} that apply to a CPE acting as an Access Point.
	 *
	 * @param wps the input value
	 */
	public void  setWps(WPS wps) {
		this.wps = wps;
	}

	/**
	 * Set the this object contains parameters related to WPS (Wi-Fi Protected Setup) {{bibref|WPSv1.0}} that apply to a CPE acting as an Access Point.
	 *
	 * @param wps the input value
	 * @return this instance
	 */
	public WLANConfiguration withWps(WPS wps) {
		this.wps = wps;
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

	/**
	 * Get the this is a table of WMM parameters for traffic that originates at the wireless access point, i.e. for outgoing traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @return the value
	 */
	public Collection<APWMMParameter> getApwMMParameters() {
		if (this.apwMMParameters == null){ this.apwMMParameters=new ArrayList<>();}
		return apwMMParameters;
	}

	/**
	 * Set the this is a table of WMM parameters for traffic that originates at the wireless access point, i.e. for outgoing traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @param apwMMParameters the input value
	 */
	public void  setApwMMParameters(Collection<APWMMParameter> apwMMParameters) {
		this.apwMMParameters = apwMMParameters;
	}

	/**
	 * Set the this is a table of WMM parameters for traffic that originates at the wireless access point, i.e. for outgoing traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @param apwMMParameter the input value
	 * @return this instance
	 */
	public WLANConfiguration withAPWMMParameter(APWMMParameter apwMMParameter) {
		getApwMMParameters().add(apwMMParameter);
		return this;
	}

	/**
	 * Get the this is a table of WMM parameters for traffic that originates at the wireless station, i.e. for incoming traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @return the value
	 */
	public Collection<STAWMMParameter> getStaWMMParameters() {
		if (this.staWMMParameters == null){ this.staWMMParameters=new ArrayList<>();}
		return staWMMParameters;
	}

	/**
	 * Set the this is a table of WMM parameters for traffic that originates at the wireless station, i.e. for incoming traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @param staWMMParameters the input value
	 */
	public void  setStaWMMParameters(Collection<STAWMMParameter> staWMMParameters) {
		this.staWMMParameters = staWMMParameters;
	}

	/**
	 * Set the this is a table of WMM parameters for traffic that originates at the wireless station, i.e. for incoming traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @param staWMMParameter the input value
	 * @return this instance
	 */
	public WLANConfiguration withSTAWMMParameter(STAWMMParameter staWMMParameter) {
		getStaWMMParameters().add(staWMMParameter);
		return this;
	}

	//</editor-fold>

}