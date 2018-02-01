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
package org.broadbandforum.tr181.device.etsim2m.scl;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.etsim2m.scl.areanwkinstance.Property;

	/**
	 * The M2M Area Network information provides administration capabilities for remote management (REM) of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        This object provides the administration of the properties needed by the SCL to remotely manage M2M Devices within a specific type of M2M Area network as defined by {{param|AreaNwkType}}.

        Multiple instances of {{object}} with the same {{param|AreaNwkType}} is permitted.

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL for an M2M Device.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.AreaNwkInstance.{i}.")
public class AreaNwkInstance {

	/**
	 * URI {{bibref|RFC3986}} that represents the identifier of the instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ID")
	public String id;
	/**
	 * Devices (D' and d) that connect to an SCL are said to be "attached devices" and are organized by M2M Area Networks within the {{object|##.SCL}} instance. The {{param}} is an implementation-chosen string that indicates the type of M2M Area Network.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "AreaNwkType")
	public String areaNwkType;
	/**
	 * {{list}} {{reference}}

          The list represents the M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance that are within this {{object}} instance. The list does not contain an instance for this CPE.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ListOfDevices")
	@XmlList
	public Collection<String> listOfDevices;
	/**
	 * This object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkInstance}} instance.

        For example, if the {{param|#.AreaNwkType}} is ZigBee the {{object|##.AreaNwkInstance}} will contain ZigBee specific parameters that have not been modeled for the M2M Area network. 

        At a minimum, a property instance MUST exist that defines  an attribute that describes the IP layer address type (e.g., IPv4, IPv6, non-IP) of this M2M Area Network.
	 */
	@XmlElementWrapper(name = "Properties")
	@XmlElement(name = "Property")
	public Collection<Property> properties;

	public AreaNwkInstance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the uri {{bibref|RFC3986}} that represents the identifier of the instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set the uri {{bibref|RFC3986}} that represents the identifier of the instance.
	 *
	 * @since 2.6
	 * @param id the input value
	 */
	public void  setId(String id) {
		this.id = id;
	}

	/**
	 * Set the uri {{bibref|RFC3986}} that represents the identifier of the instance.
	 *
	 * @since 2.6
	 * @param id the input value
	 * @return this instance
	 */
	public AreaNwkInstance withId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get the devices (D' and d) that connect to an SCL are said to be "attached devices" and are organized by M2M Area Networks within the {{object|##.SCL}} instance. The {{param}} is an implementation-chosen string that indicates the type of M2M Area Network.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getAreaNwkType() {
		return areaNwkType;
	}

	/**
	 * Set the devices (D' and d) that connect to an SCL are said to be "attached devices" and are organized by M2M Area Networks within the {{object|##.SCL}} instance. The {{param}} is an implementation-chosen string that indicates the type of M2M Area Network.
	 *
	 * @since 2.6
	 * @param areaNwkType the input value
	 */
	public void  setAreaNwkType(String areaNwkType) {
		this.areaNwkType = areaNwkType;
	}

	/**
	 * Set the devices (D' and d) that connect to an SCL are said to be "attached devices" and are organized by M2M Area Networks within the {{object|##.SCL}} instance. The {{param}} is an implementation-chosen string that indicates the type of M2M Area Network.
	 *
	 * @since 2.6
	 * @param areaNwkType the input value
	 * @return this instance
	 */
	public AreaNwkInstance withAreaNwkType(String areaNwkType) {
		this.areaNwkType = areaNwkType;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          The list represents the M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance that are within this {{object}} instance. The list does not contain an instance for this CPE.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getListOfDevices() {
		if (this.listOfDevices == null){ this.listOfDevices=new ArrayList<>();}
		return listOfDevices;
	}

	/**
	 * Set the {{list}} {{reference}}

          The list represents the M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance that are within this {{object}} instance. The list does not contain an instance for this CPE.
	 *
	 * @since 2.6
	 * @param listOfDevices the input value
	 */
	public void  setListOfDevices(Collection<String> listOfDevices) {
		this.listOfDevices = listOfDevices;
	}

	/**
	 * Set the {{list}} {{reference}}

          The list represents the M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance that are within this {{object}} instance. The list does not contain an instance for this CPE.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public AreaNwkInstance withListOfDevices(String string) {
		getListOfDevices().add(string);
		return this;
	}

	/**
	 * Get the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkInstance}} instance.

        For example, if the {{param|#.AreaNwkType}} is ZigBee the {{object|##.AreaNwkInstance}} will contain ZigBee specific parameters that have not been modeled for the M2M Area network. 

        At a minimum, a property instance MUST exist that defines  an attribute that describes the IP layer address type (e.g., IPv4, IPv6, non-IP) of this M2M Area Network.
	 *
	 * @return the value
	 */
	public Collection<Property> getProperties() {
		if (this.properties == null){ this.properties=new ArrayList<>();}
		return properties;
	}

	/**
	 * Set the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkInstance}} instance.

        For example, if the {{param|#.AreaNwkType}} is ZigBee the {{object|##.AreaNwkInstance}} will contain ZigBee specific parameters that have not been modeled for the M2M Area network. 

        At a minimum, a property instance MUST exist that defines  an attribute that describes the IP layer address type (e.g., IPv4, IPv6, non-IP) of this M2M Area Network.
	 *
	 * @param properties the input value
	 */
	public void  setProperties(Collection<Property> properties) {
		this.properties = properties;
	}

	/**
	 * Set the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkInstance}} instance.

        For example, if the {{param|#.AreaNwkType}} is ZigBee the {{object|##.AreaNwkInstance}} will contain ZigBee specific parameters that have not been modeled for the M2M Area network. 

        At a minimum, a property instance MUST exist that defines  an attribute that describes the IP layer address type (e.g., IPv4, IPv6, non-IP) of this M2M Area Network.
	 *
	 * @param property the input value
	 * @return this instance
	 */
	public AreaNwkInstance withProperty(Property property) {
		getProperties().add(property);
		return this;
	}

	//</editor-fold>

}