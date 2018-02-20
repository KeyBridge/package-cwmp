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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.MACAddress;
import org.broadbandforum.tr181.device.wifi.accesspoint.AC;
import org.broadbandforum.tr181.device.wifi.accesspoint.Accounting;
import org.broadbandforum.tr181.device.wifi.accesspoint.AssociatedDevice;
import org.broadbandforum.tr181.device.wifi.accesspoint.Security;
import org.broadbandforum.tr181.device.wifi.accesspoint.WPS;

	/**
	 * This object models an 802.11 connection from the perspective of a wireless access point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter. 

        For enabled table entries, if {{param|SSIDReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"SSIDReference"})})
@XmlRootElement(name = "Device.WiFi.AccessPoint")
@XmlType(name = "Device.WiFi.AccessPoint")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccessPoint {

	/**
	 * Enables or disables this access point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this access point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
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
	 * {{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSIDReference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ssiDReference;
	/**
	 * Indicates whether or not beacons include the SSID name.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSIDAdvertisementEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean ssiDAdvertisementEnabled;
	/**
	 * The maximum number of retransmission for a packet. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''.

          This parameter is DEPRECATED because it is really a {{object|#.Radio}} attribute.  Use {{param|#.Radio.{i}.RetryLimit}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RetryLimit")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long retryLimit;
	/**
	 * Indicates whether this access point supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WMMCapability")
	public Boolean wmmCapability;
	/**
	 * Indicates whether this access point supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

          Note: U-APSD support implies WMM support.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UAPSDCapability")
	public Boolean uapSDCapability;
	/**
	 * Whether WMM support is currently enabled. When enabled, this is indicated in beacon frames.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WMMEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean wmmEnable;
	/**
	 * Whether U-APSD support is currently enabled. When enabled, this is indicated in beacon frames.

          Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UAPSDEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean uapSDEnable;
	/**
	 * The maximum number of devices that can simultaneously be connected to the access point.

          A value of 0 means that there is no specific limit.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxAssociatedDevices")
	@CWMPParameter(access = "readWrite")
	public Long maxAssociatedDevices = 0L;
	/**
	 * Enables or disables device isolation.

          A value of {{true}} means that the devices connected to the Access Point are isolated from all other devices within the home network (as is typically the case for a Wireless Hotspot).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "IsolationEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean isolationEnable;
	/**
	 * Indicates whether or not MAC Address Control is enabled on this {{object|#}}.  MAC Address Control limits client devices to those whose hardware addresses match the {{param|AllowedMACAddress}} list.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACAddressControlEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressControlEnabled;
	/**
	 * Hardware addresses of client devices that are allowed to associate with this {{object|#}} if {{param|MACAddressControlEnabled}} is {{true}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "AllowedMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress allowedMACAddress;
	/**
	 * This object contains security related parameters that apply to a CPE acting as an Access Point {{bibref|802.11-2007}}.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * This object contains the parameters related to RADIUS accounting functionality for the access point.
	 */
	@XmlElement(name = "Accounting")
	public Accounting accounting;
	/**
	 * This object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this access point.
	 */
	@XmlElement(name = "WPS")
	public WPS wps;
	/**
	 * A table of the devices currently associated with the access point.
	 */
	@XmlElementWrapper(name = "AssociatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;
	/**
	 * This object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 */
	@XmlElementWrapper(name = "ACs")
	@XmlElement(name = "AC")
	@CWMPParameter(minEntries = 4, maxEntries = 4)
	public Collection<AC> acs;

	public AccessPoint() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this access point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this access point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this access point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AccessPoint withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this access point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this access point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this access point.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public AccessPoint withStatus(String status) {
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
	public AccessPoint withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSsiDReference() {
		return ssiDReference;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.0
	 * @param ssiDReference the input value
	 */
	public void  setSsiDReference(String ssiDReference) {
		this.ssiDReference = ssiDReference;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.0
	 * @param ssiDReference the input value
	 * @return this instance
	 */
	public AccessPoint withSsiDReference(String ssiDReference) {
		this.ssiDReference = ssiDReference;
		return this;
	}

	/**
	 * Get the indicates whether or not beacons include the SSID name.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSsiDAdvertisementEnabled() {
		return ssiDAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not beacons include the SSID name.
	 *
	 * @since 2.0
	 * @param ssiDAdvertisementEnabled the input value
	 */
	public void  setSsiDAdvertisementEnabled(Boolean ssiDAdvertisementEnabled) {
		this.ssiDAdvertisementEnabled = ssiDAdvertisementEnabled;
	}

	/**
	 * Set the indicates whether or not beacons include the SSID name.
	 *
	 * @since 2.0
	 * @param ssiDAdvertisementEnabled the input value
	 * @return this instance
	 */
	public AccessPoint withSsiDAdvertisementEnabled(Boolean ssiDAdvertisementEnabled) {
		this.ssiDAdvertisementEnabled = ssiDAdvertisementEnabled;
		return this;
	}

	/**
	 * Get the maximum number of retransmission for a packet. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''.

          This parameter is DEPRECATED because it is really a {{object|#.Radio}} attribute.  Use {{param|#.Radio.{i}.RetryLimit}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRetryLimit() {
		return retryLimit;
	}

	/**
	 * Set the maximum number of retransmission for a packet. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''.

          This parameter is DEPRECATED because it is really a {{object|#.Radio}} attribute.  Use {{param|#.Radio.{i}.RetryLimit}}.
	 *
	 * @since 2.0
	 * @param retryLimit the input value
	 */
	public void  setRetryLimit(Long retryLimit) {
		this.retryLimit = retryLimit;
	}

	/**
	 * Set the maximum number of retransmission for a packet. This corresponds to IEEE 802.11 parameter ''dot11ShortRetryLimit''.

          This parameter is DEPRECATED because it is really a {{object|#.Radio}} attribute.  Use {{param|#.Radio.{i}.RetryLimit}}.
	 *
	 * @since 2.0
	 * @param retryLimit the input value
	 * @return this instance
	 */
	public AccessPoint withRetryLimit(Long retryLimit) {
		this.retryLimit = retryLimit;
		return this;
	}

	/**
	 * Get the indicates whether this access point supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isWmmCapability() {
		return wmmCapability;
	}

	/**
	 * Set the indicates whether this access point supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 2.0
	 * @param wmmCapability the input value
	 */
	public void  setWmmCapability(Boolean wmmCapability) {
		this.wmmCapability = wmmCapability;
	}

	/**
	 * Set the indicates whether this access point supports WiFi Multimedia (WMM) Access Categories (AC).
	 *
	 * @since 2.0
	 * @param wmmCapability the input value
	 * @return this instance
	 */
	public AccessPoint withWmmCapability(Boolean wmmCapability) {
		this.wmmCapability = wmmCapability;
		return this;
	}

	/**
	 * Get the indicates whether this access point supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

          Note: U-APSD support implies WMM support.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUapSDCapability() {
		return uapSDCapability;
	}

	/**
	 * Set the indicates whether this access point supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

          Note: U-APSD support implies WMM support.
	 *
	 * @since 2.0
	 * @param uapSDCapability the input value
	 */
	public void  setUapSDCapability(Boolean uapSDCapability) {
		this.uapSDCapability = uapSDCapability;
	}

	/**
	 * Set the indicates whether this access point supports WMM Unscheduled Automatic Power Save Delivery (U-APSD).

          Note: U-APSD support implies WMM support.
	 *
	 * @since 2.0
	 * @param uapSDCapability the input value
	 * @return this instance
	 */
	public AccessPoint withUapSDCapability(Boolean uapSDCapability) {
		this.uapSDCapability = uapSDCapability;
		return this;
	}

	/**
	 * Get the whether WMM support is currently enabled. When enabled, this is indicated in beacon frames.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isWmmEnable() {
		return wmmEnable;
	}

	/**
	 * Set the whether WMM support is currently enabled. When enabled, this is indicated in beacon frames.
	 *
	 * @since 2.0
	 * @param wmmEnable the input value
	 */
	public void  setWmmEnable(Boolean wmmEnable) {
		this.wmmEnable = wmmEnable;
	}

	/**
	 * Set the whether WMM support is currently enabled. When enabled, this is indicated in beacon frames.
	 *
	 * @since 2.0
	 * @param wmmEnable the input value
	 * @return this instance
	 */
	public AccessPoint withWmmEnable(Boolean wmmEnable) {
		this.wmmEnable = wmmEnable;
		return this;
	}

	/**
	 * Get the whether U-APSD support is currently enabled. When enabled, this is indicated in beacon frames.

          Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUapSDEnable() {
		return uapSDEnable;
	}

	/**
	 * Set the whether U-APSD support is currently enabled. When enabled, this is indicated in beacon frames.

          Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 2.0
	 * @param uapSDEnable the input value
	 */
	public void  setUapSDEnable(Boolean uapSDEnable) {
		this.uapSDEnable = uapSDEnable;
	}

	/**
	 * Set the whether U-APSD support is currently enabled. When enabled, this is indicated in beacon frames.

          Note: U-APSD can only be enabled if WMM is also enabled.
	 *
	 * @since 2.0
	 * @param uapSDEnable the input value
	 * @return this instance
	 */
	public AccessPoint withUapSDEnable(Boolean uapSDEnable) {
		this.uapSDEnable = uapSDEnable;
		return this;
	}

	/**
	 * Get the maximum number of devices that can simultaneously be connected to the access point.

          A value of 0 means that there is no specific limit.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxAssociatedDevices() {
		return maxAssociatedDevices;
	}

	/**
	 * Set the maximum number of devices that can simultaneously be connected to the access point.

          A value of 0 means that there is no specific limit.
	 *
	 * @since 2.4
	 * @param maxAssociatedDevices the input value
	 */
	public void  setMaxAssociatedDevices(Long maxAssociatedDevices) {
		this.maxAssociatedDevices = maxAssociatedDevices;
	}

	/**
	 * Set the maximum number of devices that can simultaneously be connected to the access point.

          A value of 0 means that there is no specific limit.
	 *
	 * @since 2.4
	 * @param maxAssociatedDevices the input value
	 * @return this instance
	 */
	public AccessPoint withMaxAssociatedDevices(Long maxAssociatedDevices) {
		this.maxAssociatedDevices = maxAssociatedDevices;
		return this;
	}

	/**
	 * Get the enables or disables device isolation.

          A value of {{true}} means that the devices connected to the Access Point are isolated from all other devices within the home network (as is typically the case for a Wireless Hotspot).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isIsolationEnable() {
		return isolationEnable;
	}

	/**
	 * Set the enables or disables device isolation.

          A value of {{true}} means that the devices connected to the Access Point are isolated from all other devices within the home network (as is typically the case for a Wireless Hotspot).
	 *
	 * @since 2.4
	 * @param isolationEnable the input value
	 */
	public void  setIsolationEnable(Boolean isolationEnable) {
		this.isolationEnable = isolationEnable;
	}

	/**
	 * Set the enables or disables device isolation.

          A value of {{true}} means that the devices connected to the Access Point are isolated from all other devices within the home network (as is typically the case for a Wireless Hotspot).
	 *
	 * @since 2.4
	 * @param isolationEnable the input value
	 * @return this instance
	 */
	public AccessPoint withIsolationEnable(Boolean isolationEnable) {
		this.isolationEnable = isolationEnable;
		return this;
	}

	/**
	 * Get the indicates whether or not MAC Address Control is enabled on this {{object|#}}.  MAC Address Control limits client devices to those whose hardware addresses match the {{param|AllowedMACAddress}} list.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isMacAddressControlEnabled() {
		return macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether or not MAC Address Control is enabled on this {{object|#}}.  MAC Address Control limits client devices to those whose hardware addresses match the {{param|AllowedMACAddress}} list.
	 *
	 * @since 2.9
	 * @param macAddressControlEnabled the input value
	 */
	public void  setMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether or not MAC Address Control is enabled on this {{object|#}}.  MAC Address Control limits client devices to those whose hardware addresses match the {{param|AllowedMACAddress}} list.
	 *
	 * @since 2.9
	 * @param macAddressControlEnabled the input value
	 * @return this instance
	 */
	public AccessPoint withMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
		return this;
	}

	/**
	 * Get the hardware addresses of client devices that are allowed to associate with this {{object|#}} if {{param|MACAddressControlEnabled}} is {{true}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getAllowedMACAddress() {
		return allowedMACAddress;
	}

	/**
	 * Set the hardware addresses of client devices that are allowed to associate with this {{object|#}} if {{param|MACAddressControlEnabled}} is {{true}}.
	 *
	 * @since 2.9
	 * @param allowedMACAddress the input value
	 */
	public void  setAllowedMACAddress(MACAddress allowedMACAddress) {
		this.allowedMACAddress = allowedMACAddress;
	}

	/**
	 * Set the hardware addresses of client devices that are allowed to associate with this {{object|#}} if {{param|MACAddressControlEnabled}} is {{true}}.
	 *
	 * @since 2.9
	 * @param allowedMACAddress the input value
	 * @return this instance
	 */
	public AccessPoint withAllowedMACAddress(MACAddress allowedMACAddress) {
		this.allowedMACAddress = allowedMACAddress;
		return this;
	}

	/**
	 * Get the this object contains security related parameters that apply to a CPE acting as an Access Point {{bibref|802.11-2007}}.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a CPE acting as an Access Point {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object contains security related parameters that apply to a CPE acting as an Access Point {{bibref|802.11-2007}}.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public AccessPoint withSecurity(Security security) {
		this.security = security;
		return this;
	}

	/**
	 * Get the this object contains the parameters related to RADIUS accounting functionality for the access point.
	 *
	 * @return the value
	 */
	public Accounting getAccounting() {
		return accounting;
	}

	/**
	 * Set the this object contains the parameters related to RADIUS accounting functionality for the access point.
	 *
	 * @param accounting the input value
	 */
	public void  setAccounting(Accounting accounting) {
		this.accounting = accounting;
	}

	/**
	 * Set the this object contains the parameters related to RADIUS accounting functionality for the access point.
	 *
	 * @param accounting the input value
	 * @return this instance
	 */
	public AccessPoint withAccounting(Accounting accounting) {
		this.accounting = accounting;
		return this;
	}

	/**
	 * Get the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this access point.
	 *
	 * @return the value
	 */
	public WPS getWps() {
		return wps;
	}

	/**
	 * Set the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this access point.
	 *
	 * @param wps the input value
	 */
	public void  setWps(WPS wps) {
		this.wps = wps;
	}

	/**
	 * Set the this object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this access point.
	 *
	 * @param wps the input value
	 * @return this instance
	 */
	public AccessPoint withWps(WPS wps) {
		this.wps = wps;
		return this;
	}

	/**
	 * Get a table of the devices currently associated with the access point.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set a table of the devices currently associated with the access point.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set a table of the devices currently associated with the access point.
	 *
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public AccessPoint withAssociatedDevice(AssociatedDevice associatedDevice) {
		getAssociatedDevices().add(associatedDevice);
		return this;
	}

	/**
	 * Get the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @return the value
	 */
	public Collection<AC> getAcs() {
		if (this.acs == null){ this.acs=new ArrayList<>();}
		return acs;
	}

	/**
	 * Set the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @param acs the input value
	 */
	public void  setAcs(Collection<AC> acs) {
		this.acs = acs;
	}

	/**
	 * Set the this object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @param ac the input value
	 * @return this instance
	 */
	public AccessPoint withAC(AC ac) {
		getAcs().add(ac);
		return this;
	}

	//</editor-fold>

}