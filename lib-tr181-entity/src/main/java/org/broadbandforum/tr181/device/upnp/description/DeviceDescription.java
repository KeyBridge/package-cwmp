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
package org.broadbandforum.tr181.device.upnp.description;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This table contains information read from the Device Description Document of discovered root devices.

        The CPE MAY, but need not, retain some or all of the information in this table after the associated SSDP advertisement (objects in the  UPnP.Discovery. object tables) expires. 

        In case the SSDP advertisement expires and the CPE deletes the related instances from the tables in UPnP.Discovery., the reference to such instances MUST be set to the empty string.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.UPnP.Description.DeviceDescription.{i}.")
@XmlRootElement(name = "DeviceDescription")
@XmlType(name = "Device.UPnP.Description.DeviceDescription")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceDescription {

	/**
	 * The value extracted from the URLBase element in the Device Description Document of the discovered root device. If the URLBase element in the root device's Device Description Document is empty or absent, the URL from which the device description was retrieved (e.g. the LOCATION from the SSDP message) is utilized as the URLBase.

          Note: the URLBase element is not recommended by {{bibref|UPnP-DAv1}} and is not permitted by {{bibref|UPnP-DAv11}}, so the value of {{param}} will usually be the URL from which the device description was retrieved.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "URLBase")
	@Size(max = 256)
	public String urlBase;
	/**
	 * The UPnP Device Architecture version extracted from the specVersion element in the Device Description Document of the discovered root device. The {{param}} is encoded as "major revison.minor revision". {{pattern}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SpecVersion")
	@Size(max = 256)
	@Pattern(regexp = "\\d+\\.\\d+")
	public String specVersion;
	/**
	 * {{list}} {{reference|the Host table entries associated with the root device from which the device description was retrieved|ignore}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;

	public DeviceDescription() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the value extracted from the URLBase element in the Device Description Document of the discovered root device. If the URLBase element in the root device's Device Description Document is empty or absent, the URL from which the device description was retrieved (e.g. the LOCATION from the SSDP message) is utilized as the URLBase.

          Note: the URLBase element is not recommended by {{bibref|UPnP-DAv1}} and is not permitted by {{bibref|UPnP-DAv11}}, so the value of {{param}} will usually be the URL from which the device description was retrieved.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getUrlBase() {
		return urlBase;
	}

	/**
	 * Set the value extracted from the URLBase element in the Device Description Document of the discovered root device. If the URLBase element in the root device's Device Description Document is empty or absent, the URL from which the device description was retrieved (e.g. the LOCATION from the SSDP message) is utilized as the URLBase.

          Note: the URLBase element is not recommended by {{bibref|UPnP-DAv1}} and is not permitted by {{bibref|UPnP-DAv11}}, so the value of {{param}} will usually be the URL from which the device description was retrieved.
	 *
	 * @since 2.6
	 * @param urlBase the input value
	 */
	public void  setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	/**
	 * Set the value extracted from the URLBase element in the Device Description Document of the discovered root device. If the URLBase element in the root device's Device Description Document is empty or absent, the URL from which the device description was retrieved (e.g. the LOCATION from the SSDP message) is utilized as the URLBase.

          Note: the URLBase element is not recommended by {{bibref|UPnP-DAv1}} and is not permitted by {{bibref|UPnP-DAv11}}, so the value of {{param}} will usually be the URL from which the device description was retrieved.
	 *
	 * @since 2.6
	 * @param urlBase the input value
	 * @return this instance
	 */
	public DeviceDescription withUrlBase(String urlBase) {
		this.urlBase = urlBase;
		return this;
	}

	/**
	 * Get the UPnP Device Architecture version extracted from the specVersion element in the Device Description Document of the discovered root device. The {{param}} is encoded as "major revison.minor revision". {{pattern}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getSpecVersion() {
		return specVersion;
	}

	/**
	 * Set the UPnP Device Architecture version extracted from the specVersion element in the Device Description Document of the discovered root device. The {{param}} is encoded as "major revison.minor revision". {{pattern}}
	 *
	 * @since 2.6
	 * @param specVersion the input value
	 */
	public void  setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}

	/**
	 * Set the UPnP Device Architecture version extracted from the specVersion element in the Device Description Document of the discovered root device. The {{param}} is encoded as "major revison.minor revision". {{pattern}}
	 *
	 * @since 2.6
	 * @param specVersion the input value
	 * @return this instance
	 */
	public DeviceDescription withSpecVersion(String specVersion) {
		this.specVersion = specVersion;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|the Host table entries associated with the root device from which the device description was retrieved|ignore}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} {{reference|the Host table entries associated with the root device from which the device description was retrieved|ignore}}
	 *
	 * @since 2.6
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} {{reference|the Host table entries associated with the root device from which the device description was retrieved|ignore}}
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceDescription withHost(String string) {
		getHost().add(string);
		return this;
	}

	//</editor-fold>

}