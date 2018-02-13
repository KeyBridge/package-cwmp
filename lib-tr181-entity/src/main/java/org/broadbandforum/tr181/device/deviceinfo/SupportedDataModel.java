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
package org.broadbandforum.tr181.device.deviceinfo;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.UUID;

	/**
	 * This table contains details of the device's Current Supported Data Model.

        The table MUST describe the device's entire Supported Data Model.  Therefore, if a device's Supported Data Model changes at run-time, entries will need to be added or removed as appropriate.

        Each table entry MUST refer to only a single Root Object or Service Object.  The device MAY choose to use more than one table entry for a given Root Object or Service Object.

        Considering that every device has some form of a data model, this table MUST NOT be empty.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.SupportedDataModel.{i}.")
@XmlRootElement(name = "Device.DeviceInfo.SupportedDataModel")
@XmlType(name = "Device.DeviceInfo.SupportedDataModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupportedDataModel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * URL ({{bibref|RFC3986}}) that describes some or all of the device's Current Supported Data Model.

          The URL MUST reference an XML file which describes the appropriate part of the Supported Data Model.

          The referenced XML file MUST be compliant with the DT (Device Type) Schema that is described in {{bibref|TR-106a3|Annex B}}, including any additional normative requirements referenced within the Schema.

          The XML file referenced by this URL MUST NOT change while the CPE is running, and SHOULD NOT change across a CPE reboot. Note that {{param|UUID}} is a unique key, so the XML file referenced by this URL will never change.

          The XML file MAY be located within the CPE. In this scenario the CPE MAY use the value of "localhost" as URL host portion, When the "localhost" value is used, the ACS has the responsibility to substitute the "localhost" value with the host portion of the connection request URL.

          Behavior in the event of an invalid URL, failure to access the referenced XML file, or an invalid XML file, is implementation-dependent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URL")
	@Size(max = 256)
	public String url;
	/**
	 * UUID ({{bibref|RFC4122}}) that is the value of the uuid attribute in the DT Instance referenced by {{param|URL}}.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "UUID")
	public UUID uuiD;
	/**
	 * URN ({{bibref|RFC3986}}) that is the value of the spec attribute in the DM (data model) Instance that defines the Root Object or Service Object referenced by this table entry.

          For example, if this table entry references a DT Instance that refers to the ''Device:1.3'' Root Object, the value of this parameter would be ''urn:broadband-forum-org:tr-157-1-0-0'', because TR-157 defines ''Device:1.3''.  If the DT Instance instead referred to a vendor-specific Root Object, e.g. ''X_EXAMPLE_Device:1.0'' (derived from ''Device:1.3''), the value of this parameter would be something like ''urn:example-com:device-1-0-0''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URN")
	@Size(max = 256)
	public String urn;
	/**
	 * This parameter MUST list exactly the features that are defined using the top-level ''feature'' element in the DT Instance referenced by {{param|URL}}.

          For example, if the DT instance specified the following:

          :<feature name="DNSServer"/>

          :<feature name="Router"/>

          :<feature name="X_MyDeviceFeature"/>

          then the value of this parameter might be ''DNSServer,Router,X_MyDeviceFeature''.  The order in which the features are listed is not significant.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Features")
	@XmlList
	public Collection<String> features;

	public SupportedDataModel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public SupportedDataModel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the url ({{bibref|RFC3986}}) that describes some or all of the device's Current Supported Data Model.

          The URL MUST reference an XML file which describes the appropriate part of the Supported Data Model.

          The referenced XML file MUST be compliant with the DT (Device Type) Schema that is described in {{bibref|TR-106a3|Annex B}}, including any additional normative requirements referenced within the Schema.

          The XML file referenced by this URL MUST NOT change while the CPE is running, and SHOULD NOT change across a CPE reboot. Note that {{param|UUID}} is a unique key, so the XML file referenced by this URL will never change.

          The XML file MAY be located within the CPE. In this scenario the CPE MAY use the value of "localhost" as URL host portion, When the "localhost" value is used, the ACS has the responsibility to substitute the "localhost" value with the host portion of the connection request URL.

          Behavior in the event of an invalid URL, failure to access the referenced XML file, or an invalid XML file, is implementation-dependent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url ({{bibref|RFC3986}}) that describes some or all of the device's Current Supported Data Model.

          The URL MUST reference an XML file which describes the appropriate part of the Supported Data Model.

          The referenced XML file MUST be compliant with the DT (Device Type) Schema that is described in {{bibref|TR-106a3|Annex B}}, including any additional normative requirements referenced within the Schema.

          The XML file referenced by this URL MUST NOT change while the CPE is running, and SHOULD NOT change across a CPE reboot. Note that {{param|UUID}} is a unique key, so the XML file referenced by this URL will never change.

          The XML file MAY be located within the CPE. In this scenario the CPE MAY use the value of "localhost" as URL host portion, When the "localhost" value is used, the ACS has the responsibility to substitute the "localhost" value with the host portion of the connection request URL.

          Behavior in the event of an invalid URL, failure to access the referenced XML file, or an invalid XML file, is implementation-dependent.
	 *
	 * @since 2.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url ({{bibref|RFC3986}}) that describes some or all of the device's Current Supported Data Model.

          The URL MUST reference an XML file which describes the appropriate part of the Supported Data Model.

          The referenced XML file MUST be compliant with the DT (Device Type) Schema that is described in {{bibref|TR-106a3|Annex B}}, including any additional normative requirements referenced within the Schema.

          The XML file referenced by this URL MUST NOT change while the CPE is running, and SHOULD NOT change across a CPE reboot. Note that {{param|UUID}} is a unique key, so the XML file referenced by this URL will never change.

          The XML file MAY be located within the CPE. In this scenario the CPE MAY use the value of "localhost" as URL host portion, When the "localhost" value is used, the ACS has the responsibility to substitute the "localhost" value with the host portion of the connection request URL.

          Behavior in the event of an invalid URL, failure to access the referenced XML file, or an invalid XML file, is implementation-dependent.
	 *
	 * @since 2.0
	 * @param url the input value
	 * @return this instance
	 */
	public SupportedDataModel withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the uuiD ({{bibref|RFC4122}}) that is the value of the uuid attribute in the DT Instance referenced by {{param|URL}}.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public UUID getUuiD() {
		return uuiD;
	}

	/**
	 * Set the uuiD ({{bibref|RFC4122}}) that is the value of the uuid attribute in the DT Instance referenced by {{param|URL}}.
	 *
	 * @since 2.6
	 * @param uuiD the input value
	 */
	public void  setUuiD(UUID uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set the uuiD ({{bibref|RFC4122}}) that is the value of the uuid attribute in the DT Instance referenced by {{param|URL}}.
	 *
	 * @since 2.6
	 * @param uuiD the input value
	 * @return this instance
	 */
	public SupportedDataModel withUuiD(UUID uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the urn ({{bibref|RFC3986}}) that is the value of the spec attribute in the DM (data model) Instance that defines the Root Object or Service Object referenced by this table entry.

          For example, if this table entry references a DT Instance that refers to the ''Device:1.3'' Root Object, the value of this parameter would be ''urn:broadband-forum-org:tr-157-1-0-0'', because TR-157 defines ''Device:1.3''.  If the DT Instance instead referred to a vendor-specific Root Object, e.g. ''X_EXAMPLE_Device:1.0'' (derived from ''Device:1.3''), the value of this parameter would be something like ''urn:example-com:device-1-0-0''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUrn() {
		return urn;
	}

	/**
	 * Set the urn ({{bibref|RFC3986}}) that is the value of the spec attribute in the DM (data model) Instance that defines the Root Object or Service Object referenced by this table entry.

          For example, if this table entry references a DT Instance that refers to the ''Device:1.3'' Root Object, the value of this parameter would be ''urn:broadband-forum-org:tr-157-1-0-0'', because TR-157 defines ''Device:1.3''.  If the DT Instance instead referred to a vendor-specific Root Object, e.g. ''X_EXAMPLE_Device:1.0'' (derived from ''Device:1.3''), the value of this parameter would be something like ''urn:example-com:device-1-0-0''.
	 *
	 * @since 2.0
	 * @param urn the input value
	 */
	public void  setUrn(String urn) {
		this.urn = urn;
	}

	/**
	 * Set the urn ({{bibref|RFC3986}}) that is the value of the spec attribute in the DM (data model) Instance that defines the Root Object or Service Object referenced by this table entry.

          For example, if this table entry references a DT Instance that refers to the ''Device:1.3'' Root Object, the value of this parameter would be ''urn:broadband-forum-org:tr-157-1-0-0'', because TR-157 defines ''Device:1.3''.  If the DT Instance instead referred to a vendor-specific Root Object, e.g. ''X_EXAMPLE_Device:1.0'' (derived from ''Device:1.3''), the value of this parameter would be something like ''urn:example-com:device-1-0-0''.
	 *
	 * @since 2.0
	 * @param urn the input value
	 * @return this instance
	 */
	public SupportedDataModel withUrn(String urn) {
		this.urn = urn;
		return this;
	}

	/**
	 * Get the this parameter MUST list exactly the features that are defined using the top-level ''feature'' element in the DT Instance referenced by {{param|URL}}.

          For example, if the DT instance specified the following:

          :<feature name="DNSServer"/>

          :<feature name="Router"/>

          :<feature name="X_MyDeviceFeature"/>

          then the value of this parameter might be ''DNSServer,Router,X_MyDeviceFeature''.  The order in which the features are listed is not significant.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFeatures() {
		if (this.features == null){ this.features=new ArrayList<>();}
		return features;
	}

	/**
	 * Set the this parameter MUST list exactly the features that are defined using the top-level ''feature'' element in the DT Instance referenced by {{param|URL}}.

          For example, if the DT instance specified the following:

          :<feature name="DNSServer"/>

          :<feature name="Router"/>

          :<feature name="X_MyDeviceFeature"/>

          then the value of this parameter might be ''DNSServer,Router,X_MyDeviceFeature''.  The order in which the features are listed is not significant.
	 *
	 * @since 2.0
	 * @param features the input value
	 */
	public void  setFeatures(Collection<String> features) {
		this.features = features;
	}

	/**
	 * Set the this parameter MUST list exactly the features that are defined using the top-level ''feature'' element in the DT Instance referenced by {{param|URL}}.

          For example, if the DT instance specified the following:

          :<feature name="DNSServer"/>

          :<feature name="Router"/>

          :<feature name="X_MyDeviceFeature"/>

          then the value of this parameter might be ''DNSServer,Router,X_MyDeviceFeature''.  The order in which the features are listed is not significant.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SupportedDataModel withFeatures(String string) {
		getFeatures().add(string);
		return this;
	}

	//</editor-fold>

}