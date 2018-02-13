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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.wifi.AccessPoint;
import org.broadbandforum.tr181.device.wifi.EndPoint;
import org.broadbandforum.tr181.device.wifi.NeighboringWiFiDiagnostic;
import org.broadbandforum.tr181.device.wifi.Radio;
import org.broadbandforum.tr181.device.wifi.SSID;

	/**
	 * The WiFi object is based on the WiFi Alliance 802.11 specifications ({{bibref|802.11-2007}}). It defines interface objects ({{object|Radio}} and {{object|SSID}}), and application objects ({{object|AccessPoint}} and {{object|EndPoint}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.")
@XmlRootElement(name = "Device.WiFi")
@XmlType(name = "Device.WiFi")
@XmlAccessorType(XmlAccessType.FIELD)
public class WiFi {

	/**
	 * This object models an 802.11 wireless radio on a device (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        If the device can establish more than one connection simultaneously (e.g. a dual radio device), a separate {{object}} instance MUST be used for each physical radio of the device. See {{bibref|TR-181i2|Appendix III.1}} for additional information.

        Note: A dual-band single-radio device (e.g. an 802.11a/b/g radio) can be configured to operate at 2.4 or 5 GHz frequency bands, but only a single frequency band is used to transmit/receive at a given time. Therefore, a single {{object}} instance is used even for a dual-band radio.
	 */
	@XmlElementWrapper(name = "Radios")
	@XmlElement(name = "Radio")
	public Collection<Radio> radios;
	/**
	 * This object defines access to other WiFi SSIDs that this device is able to receive.
	 */
	@XmlElement(name = "NeighboringWiFiDiagnostic")
	public NeighboringWiFiDiagnostic neighboringWiFiDiagnostic;
	/**
	 * WiFi SSID table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}), where table entries model the MAC layer. A WiFi SSID entry is typically stacked on top of a {{object|#.Radio}} object.

        WiFi SSID is also a multiplexing layer, i.e. more than one {{object}} can be stacked above a single {{object|#.Radio}}.
	 */
	@XmlElementWrapper(name = "SSIDs")
	@XmlElement(name = "SSID")
	@CWMPParameter(access = "readWrite")
	public Collection<SSID> ssiDs;
	/**
	 * This object models an 802.11 connection from the perspective of a wireless access point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter. 

        For enabled table entries, if {{param|SSIDReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "AccessPoints")
	@XmlElement(name = "AccessPoint")
	@CWMPParameter(access = "readWrite")
	public Collection<AccessPoint> accessPoints;
	/**
	 * This object models an 802.11 connection from the perspective of a wireless end point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter, and an associated active {{object|Profile}} instance via the {{param|ProfileReference}} parameter. The active profile is responsible for specifying the actual SSID and security settings used by the end point.

        For enabled table entries, if {{param|SSIDReference}} or {{param|ProfileReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "EndPoints")
	@XmlElement(name = "EndPoint")
	@CWMPParameter(access = "readWrite")
	public Collection<EndPoint> endPoints;

	public WiFi() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object models an 802.11 wireless radio on a device (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        If the device can establish more than one connection simultaneously (e.g. a dual radio device), a separate {{object}} instance MUST be used for each physical radio of the device. See {{bibref|TR-181i2|Appendix III.1}} for additional information.

        Note: A dual-band single-radio device (e.g. an 802.11a/b/g radio) can be configured to operate at 2.4 or 5 GHz frequency bands, but only a single frequency band is used to transmit/receive at a given time. Therefore, a single {{object}} instance is used even for a dual-band radio.
	 *
	 * @return the value
	 */
	public Collection<Radio> getRadios() {
		if (this.radios == null){ this.radios=new ArrayList<>();}
		return radios;
	}

	/**
	 * Set the this object models an 802.11 wireless radio on a device (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        If the device can establish more than one connection simultaneously (e.g. a dual radio device), a separate {{object}} instance MUST be used for each physical radio of the device. See {{bibref|TR-181i2|Appendix III.1}} for additional information.

        Note: A dual-band single-radio device (e.g. an 802.11a/b/g radio) can be configured to operate at 2.4 or 5 GHz frequency bands, but only a single frequency band is used to transmit/receive at a given time. Therefore, a single {{object}} instance is used even for a dual-band radio.
	 *
	 * @param radios the input value
	 */
	public void  setRadios(Collection<Radio> radios) {
		this.radios = radios;
	}

	/**
	 * Set the this object models an 802.11 wireless radio on a device (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        If the device can establish more than one connection simultaneously (e.g. a dual radio device), a separate {{object}} instance MUST be used for each physical radio of the device. See {{bibref|TR-181i2|Appendix III.1}} for additional information.

        Note: A dual-band single-radio device (e.g. an 802.11a/b/g radio) can be configured to operate at 2.4 or 5 GHz frequency bands, but only a single frequency band is used to transmit/receive at a given time. Therefore, a single {{object}} instance is used even for a dual-band radio.
	 *
	 * @param radio the input value
	 * @return this instance
	 */
	public WiFi withRadio(Radio radio) {
		getRadios().add(radio);
		return this;
	}

	/**
	 * Get the this object defines access to other WiFi SSIDs that this device is able to receive.
	 *
	 * @return the value
	 */
	public NeighboringWiFiDiagnostic getNeighboringWiFiDiagnostic() {
		return neighboringWiFiDiagnostic;
	}

	/**
	 * Set the this object defines access to other WiFi SSIDs that this device is able to receive.
	 *
	 * @param neighboringWiFiDiagnostic the input value
	 */
	public void  setNeighboringWiFiDiagnostic(NeighboringWiFiDiagnostic neighboringWiFiDiagnostic) {
		this.neighboringWiFiDiagnostic = neighboringWiFiDiagnostic;
	}

	/**
	 * Set the this object defines access to other WiFi SSIDs that this device is able to receive.
	 *
	 * @param neighboringWiFiDiagnostic the input value
	 * @return this instance
	 */
	public WiFi withNeighboringWiFiDiagnostic(NeighboringWiFiDiagnostic neighboringWiFiDiagnostic) {
		this.neighboringWiFiDiagnostic = neighboringWiFiDiagnostic;
		return this;
	}

	/**
	 * Get the wifi SSID table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}), where table entries model the MAC layer. A WiFi SSID entry is typically stacked on top of a {{object|#.Radio}} object.

        WiFi SSID is also a multiplexing layer, i.e. more than one {{object}} can be stacked above a single {{object|#.Radio}}.
	 *
	 * @return the value
	 */
	public Collection<SSID> getSsiDs() {
		if (this.ssiDs == null){ this.ssiDs=new ArrayList<>();}
		return ssiDs;
	}

	/**
	 * Set the wifi SSID table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}), where table entries model the MAC layer. A WiFi SSID entry is typically stacked on top of a {{object|#.Radio}} object.

        WiFi SSID is also a multiplexing layer, i.e. more than one {{object}} can be stacked above a single {{object|#.Radio}}.
	 *
	 * @param ssiDs the input value
	 */
	public void  setSsiDs(Collection<SSID> ssiDs) {
		this.ssiDs = ssiDs;
	}

	/**
	 * Set the wifi SSID table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}), where table entries model the MAC layer. A WiFi SSID entry is typically stacked on top of a {{object|#.Radio}} object.

        WiFi SSID is also a multiplexing layer, i.e. more than one {{object}} can be stacked above a single {{object|#.Radio}}.
	 *
	 * @param ssiD the input value
	 * @return this instance
	 */
	public WiFi withSSID(SSID ssiD) {
		getSsiDs().add(ssiD);
		return this;
	}

	/**
	 * Get the this object models an 802.11 connection from the perspective of a wireless access point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter. 

        For enabled table entries, if {{param|SSIDReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<AccessPoint> getAccessPoints() {
		if (this.accessPoints == null){ this.accessPoints=new ArrayList<>();}
		return accessPoints;
	}

	/**
	 * Set the this object models an 802.11 connection from the perspective of a wireless access point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter. 

        For enabled table entries, if {{param|SSIDReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param accessPoints the input value
	 */
	public void  setAccessPoints(Collection<AccessPoint> accessPoints) {
		this.accessPoints = accessPoints;
	}

	/**
	 * Set the this object models an 802.11 connection from the perspective of a wireless access point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter. 

        For enabled table entries, if {{param|SSIDReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param accessPoint the input value
	 * @return this instance
	 */
	public WiFi withAccessPoint(AccessPoint accessPoint) {
		getAccessPoints().add(accessPoint);
		return this;
	}

	/**
	 * Get the this object models an 802.11 connection from the perspective of a wireless end point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter, and an associated active {{object|Profile}} instance via the {{param|ProfileReference}} parameter. The active profile is responsible for specifying the actual SSID and security settings used by the end point.

        For enabled table entries, if {{param|SSIDReference}} or {{param|ProfileReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<EndPoint> getEndPoints() {
		if (this.endPoints == null){ this.endPoints=new ArrayList<>();}
		return endPoints;
	}

	/**
	 * Set the this object models an 802.11 connection from the perspective of a wireless end point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter, and an associated active {{object|Profile}} instance via the {{param|ProfileReference}} parameter. The active profile is responsible for specifying the actual SSID and security settings used by the end point.

        For enabled table entries, if {{param|SSIDReference}} or {{param|ProfileReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param endPoints the input value
	 */
	public void  setEndPoints(Collection<EndPoint> endPoints) {
		this.endPoints = endPoints;
	}

	/**
	 * Set the this object models an 802.11 connection from the perspective of a wireless end point. Each {{object}} entry is associated with a particular {{object|#.SSID}} interface instance via the {{param|SSIDReference}} parameter, and an associated active {{object|Profile}} instance via the {{param|ProfileReference}} parameter. The active profile is responsible for specifying the actual SSID and security settings used by the end point.

        For enabled table entries, if {{param|SSIDReference}} or {{param|ProfileReference}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param endPoint the input value
	 * @return this instance
	 */
	public WiFi withEndPoint(EndPoint endPoint) {
		getEndPoints().add(endPoint);
		return this;
	}

	//</editor-fold>

}