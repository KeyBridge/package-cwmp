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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.etsim2m.scl.areanwkdeviceinfoinstance.Property;

	/**
	 * The M2M Area Network Device Information provides the administration capability to the SCL for maintenance of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        While discovery and identification of devices by the M2M Gateway or Device (CPE) is implementation specific, each device is represented by an instance of the {{object|.Hosts.Host}} table.

        When the M2M Device is managed by the CWMP endpoint of the CPE, the {{object}} is expected to be referenced by an instance of one of the following tables: 

        *{{object|.ManagementServer.EmbeddedDevice}}

        *{{object|.ManagementServer.VirtualDevice}}

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL to a M2M Device.

        This object instance provides the administration properties required by a SCL to remotely manage an instance of a M2M Device within a M2M area network. 

        A M2M Device is associated with an instance of a {{object|#.AreaNwkInstance}}. 

        This table contains parameters and information of the M2M Device related to each {{object|#.AreaNwkInstance}} instance.

        Instances of this table are created and deleted by the CPE. The ACS MAY modify the writeable parameters of this object instance but  it is possible that the value set by the ACS is not retained between reboots of the M2M Device.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.{i}.")
public class AreaNwkDeviceInfoInstance {

	/**
	 * {{reference}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "AreaNwkInstance")
	public String areaNwkInstance;
	/**
	 * {{list}} {{reference|the {{object|.Hosts.Host}} table entry that represents an active or inactive M2M Device}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Host")
	@XmlList
	public Collection<String> host;
	/**
	 * {{list}} {{reference}} References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that represent the reachable neighbors of this M2M Device (D' or d).
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ListOfDeviceNeighbors")
	@XmlList
	public Collection<String> listOfDeviceNeighbors;
	/**
	 * The list is an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is an URI string that represents an application id (APP-ID) for the M2M D'A applications residing on the M2M Device for the associated {{object|#.AreaNwkInstance}}. 

          Table B.58 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes this parameter.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ListOfDeviceApplications")
	@XmlList
	public Collection<String> listOfDeviceApplications;
	/**
	 * The interval, in seconds, between sleep periods for the device.

          A value of 0 represents a device that does not sleep.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SleepInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long sleepInterval;
	/**
	 * The duration, in seconds, of a sleep period. 

          The value 0 represents an unknown value.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SleepDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long sleepDuration;
	/**
	 * The sleep status of the device.

          Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Whether or not this M2M Device is currently attached to this {{object|##.SCL}} instance.

          The ability to list inactive M2M Devices is OPTIONAL.  If the CPE includes inactive M2MDevices in this table, {{param}} is set to {{false}}  for each inactive M2M Device.  The length of time an inactive M2M Device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * This object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkDeviceInfoInstance}} instance.

        For example, if the {{param|##.AreaNwkInstance.{i}.AreaNwkType}} value is ZigBee, this {{object|##.AreaNwkDeviceInfoInstance}} contains ZigBee-specific parameters that are not formally modeled for this {{object|##.AreaNwkDeviceInfoInstance}} instance.
	 */
	@XmlElementWrapper(name = "Properties")
	@XmlElement(name = "Property")
	public Collection<Property> properties;

	public AreaNwkDeviceInfoInstance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getAreaNwkInstance() {
		return areaNwkInstance;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.6
	 * @param areaNwkInstance the input value
	 */
	public void  setAreaNwkInstance(String areaNwkInstance) {
		this.areaNwkInstance = areaNwkInstance;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.6
	 * @param areaNwkInstance the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withAreaNwkInstance(String areaNwkInstance) {
		this.areaNwkInstance = areaNwkInstance;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|the {{object|.Hosts.Host}} table entry that represents an active or inactive M2M Device}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} {{reference|the {{object|.Hosts.Host}} table entry that represents an active or inactive M2M Device}}
	 *
	 * @since 2.6
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} {{reference|the {{object|.Hosts.Host}} table entry that represents an active or inactive M2M Device}}
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference}} References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that represent the reachable neighbors of this M2M Device (D' or d).
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getListOfDeviceNeighbors() {
		if (this.listOfDeviceNeighbors == null){ this.listOfDeviceNeighbors=new ArrayList<>();}
		return listOfDeviceNeighbors;
	}

	/**
	 * Set the {{list}} {{reference}} References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that represent the reachable neighbors of this M2M Device (D' or d).
	 *
	 * @since 2.6
	 * @param listOfDeviceNeighbors the input value
	 */
	public void  setListOfDeviceNeighbors(Collection<String> listOfDeviceNeighbors) {
		this.listOfDeviceNeighbors = listOfDeviceNeighbors;
	}

	/**
	 * Set the {{list}} {{reference}} References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that represent the reachable neighbors of this M2M Device (D' or d).
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withListOfDeviceNeighbors(String string) {
		getListOfDeviceNeighbors().add(string);
		return this;
	}

	/**
	 * Get the list is an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is an URI string that represents an application id (APP-ID) for the M2M D'A applications residing on the M2M Device for the associated {{object|#.AreaNwkInstance}}. 

          Table B.58 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes this parameter.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getListOfDeviceApplications() {
		if (this.listOfDeviceApplications == null){ this.listOfDeviceApplications=new ArrayList<>();}
		return listOfDeviceApplications;
	}

	/**
	 * Set the list is an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is an URI string that represents an application id (APP-ID) for the M2M D'A applications residing on the M2M Device for the associated {{object|#.AreaNwkInstance}}. 

          Table B.58 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes this parameter.
	 *
	 * @since 2.6
	 * @param listOfDeviceApplications the input value
	 */
	public void  setListOfDeviceApplications(Collection<String> listOfDeviceApplications) {
		this.listOfDeviceApplications = listOfDeviceApplications;
	}

	/**
	 * Set the list is an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is an URI string that represents an application id (APP-ID) for the M2M D'A applications residing on the M2M Device for the associated {{object|#.AreaNwkInstance}}. 

          Table B.58 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes this parameter.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withListOfDeviceApplications(String string) {
		getListOfDeviceApplications().add(string);
		return this;
	}

	/**
	 * Get the interval, in seconds, between sleep periods for the device.

          A value of 0 represents a device that does not sleep.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getSleepInterval() {
		return sleepInterval;
	}

	/**
	 * Set the interval, in seconds, between sleep periods for the device.

          A value of 0 represents a device that does not sleep.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @param sleepInterval the input value
	 */
	public void  setSleepInterval(Long sleepInterval) {
		this.sleepInterval = sleepInterval;
	}

	/**
	 * Set the interval, in seconds, between sleep periods for the device.

          A value of 0 represents a device that does not sleep.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @param sleepInterval the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withSleepInterval(Long sleepInterval) {
		this.sleepInterval = sleepInterval;
		return this;
	}

	/**
	 * Get the duration, in seconds, of a sleep period. 

          The value 0 represents an unknown value.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getSleepDuration() {
		return sleepDuration;
	}

	/**
	 * Set the duration, in seconds, of a sleep period. 

          The value 0 represents an unknown value.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @param sleepDuration the input value
	 */
	public void  setSleepDuration(Long sleepDuration) {
		this.sleepDuration = sleepDuration;
	}

	/**
	 * Set the duration, in seconds, of a sleep period. 

          The value 0 represents an unknown value.

          Note: When this value is modified, the CPE could modify the {{param}} for this M2M Device in other Area Networks.
	 *
	 * @since 2.6
	 * @param sleepDuration the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withSleepDuration(Long sleepDuration) {
		this.sleepDuration = sleepDuration;
		return this;
	}

	/**
	 * Get the sleep status of the device.

          Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the sleep status of the device.

          Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the sleep status of the device.

          Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @param status the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the whether or not this M2M Device is currently attached to this {{object|##.SCL}} instance.

          The ability to list inactive M2M Devices is OPTIONAL.  If the CPE includes inactive M2MDevices in this table, {{param}} is set to {{false}}  for each inactive M2M Device.  The length of time an inactive M2M Device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this M2M Device is currently attached to this {{object|##.SCL}} instance.

          The ability to list inactive M2M Devices is OPTIONAL.  If the CPE includes inactive M2MDevices in this table, {{param}} is set to {{false}}  for each inactive M2M Device.  The length of time an inactive M2M Device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.6
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this M2M Device is currently attached to this {{object|##.SCL}} instance.

          The ability to list inactive M2M Devices is OPTIONAL.  If the CPE includes inactive M2MDevices in this table, {{param}} is set to {{false}}  for each inactive M2M Device.  The length of time an inactive M2M Device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.6
	 * @param active the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkDeviceInfoInstance}} instance.

        For example, if the {{param|##.AreaNwkInstance.{i}.AreaNwkType}} value is ZigBee, this {{object|##.AreaNwkDeviceInfoInstance}} contains ZigBee-specific parameters that are not formally modeled for this {{object|##.AreaNwkDeviceInfoInstance}} instance.
	 *
	 * @return the value
	 */
	public Collection<Property> getProperties() {
		if (this.properties == null){ this.properties=new ArrayList<>();}
		return properties;
	}

	/**
	 * Set the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkDeviceInfoInstance}} instance.

        For example, if the {{param|##.AreaNwkInstance.{i}.AreaNwkType}} value is ZigBee, this {{object|##.AreaNwkDeviceInfoInstance}} contains ZigBee-specific parameters that are not formally modeled for this {{object|##.AreaNwkDeviceInfoInstance}} instance.
	 *
	 * @param properties the input value
	 */
	public void  setProperties(Collection<Property> properties) {
		this.properties = properties;
	}

	/**
	 * Set the this object contains an instance of a property extension (name value pair) for this {{object|##.AreaNwkDeviceInfoInstance}} instance.

        For example, if the {{param|##.AreaNwkInstance.{i}.AreaNwkType}} value is ZigBee, this {{object|##.AreaNwkDeviceInfoInstance}} contains ZigBee-specific parameters that are not formally modeled for this {{object|##.AreaNwkDeviceInfoInstance}} instance.
	 *
	 * @param property the input value
	 * @return this instance
	 */
	public AreaNwkDeviceInfoInstance withProperty(Property property) {
		getProperties().add(property);
		return this;
	}

	//</editor-fold>

}