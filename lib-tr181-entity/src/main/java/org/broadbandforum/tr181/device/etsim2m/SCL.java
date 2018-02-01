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
package org.broadbandforum.tr181.device.etsim2m;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.etsim2m.scl.AreaNwkDeviceInfoInstance;
import org.broadbandforum.tr181.device.etsim2m.scl.AreaNwkInstance;
import org.broadbandforum.tr181.device.etsim2m.scl.Discovery;
import org.broadbandforum.tr181.device.etsim2m.scl.Reregistration;
import org.broadbandforum.tr181.device.etsim2m.scl.SAFPolicySet;

	/**
	 * This object represents an instance of a Service Capability Layer (SCL) for a M2M device or gateway.

        The {{object}} MAY be maintained by the ACS or by the CPE.

        When the {{object}} provides the administration of an SCL that is represented as a {{object|.SoftwareModules.ExecutionUnit}} the {{object}} is maintained in the {{param|.SoftwareModules.ExecutionUnit.{i}.References}} parameter.

        Section 5.1.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the high level event flows for SCL registration.

        Section 9.3.2.6.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the creation/registration of SCLs.

        Section 9.3.2.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the update/re-registration of SCLs.

        Section 9.3.2.6.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the deletion/deregistration of SCLs.

        {{keys}}
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.")
public class SCL {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * {{list}} The list represents an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is a URI string that represents a SCL to which the this {{object}} will announce original (local) resources. 

          The AnnouncedToSCL has an interest in the discovery of the local resource. Section 9.2.1.14 Announced Resource of the M2M Functional Architecture {{bibref|ETSIM2MFA}} provides a description of this behavior of an Announced Resource.

          Section 9.3.2.28 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.2.7 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describes the process of announcing and deannouncing of resources within a SCL.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "AnnouncedToSCLList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> announcedToSCLList;
	/**
	 * This object is represents the administration properties used when a NSCL requests discovery of resources within this {{object|##.SCL}} instance.

        Section 9.3.2.27 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the process of discovery of resources within a SCL.
	 */
	@XmlElement(name = "Discovery")
	public Discovery discovery;
	/**
	 * This object represents the properties and status necessary for a SCL to reregister with one or more NSCLs.
	 */
	@XmlElement(name = "Reregistration")
	public Reregistration reregistration;
	/**
	 * This object describes the parameters necessary to administer the store-and-forward (SAF) handling policies applied to requests to access remotely hosted resources.

        Policies are described by instances of {{object}}. Which instances of {{object}} are used by the SCL is determined by the {{param|PolicyScope}} parameter.

        Section 9.3.1.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describe the behavior for SAF processing.

        There is at most one {{object}} instance with the {{param|PolicyScope}} containing a specific application id (APP-ID) URI value within the list.

        There is exactly one {{object}} instance with a {{param|PolicyScope}} value of "default".
	 */
	@XmlElementWrapper(name = "safPolicySets")
	@XmlElement(name = "SAFPolicySet")
	@CWMPParameter(access = "readWrite")
	public Collection<SAFPolicySet> safPolicySets;
	/**
	 * The M2M Area Network information provides administration capabilities for remote management (REM) of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        This object provides the administration of the properties needed by the SCL to remotely manage M2M Devices within a specific type of M2M Area network as defined by {{param|AreaNwkType}}.

        Multiple instances of {{object}} with the same {{param|AreaNwkType}} is permitted.

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL for an M2M Device.
	 */
	@XmlElementWrapper(name = "areaNwkInstances")
	@XmlElement(name = "AreaNwkInstance")
	public Collection<AreaNwkInstance> areaNwkInstances;
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
	 */
	@XmlElementWrapper(name = "areaNwkDeviceInfoInstances")
	@XmlElement(name = "AreaNwkDeviceInfoInstance")
	public Collection<AreaNwkDeviceInfoInstance> areaNwkDeviceInfoInstances;

	public SCL() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public SCL withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public SCL withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}} The list represents an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is a URI string that represents a SCL to which the this {{object}} will announce original (local) resources. 

          The AnnouncedToSCL has an interest in the discovery of the local resource. Section 9.2.1.14 Announced Resource of the M2M Functional Architecture {{bibref|ETSIM2MFA}} provides a description of this behavior of an Announced Resource.

          Section 9.3.2.28 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.2.7 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describes the process of announcing and deannouncing of resources within a SCL.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getAnnouncedToSCLList() {
		if (this.announcedToSCLList == null){ this.announcedToSCLList=new ArrayList<>();}
		return announcedToSCLList;
	}

	/**
	 * Set the {{list}} The list represents an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is a URI string that represents a SCL to which the this {{object}} will announce original (local) resources. 

          The AnnouncedToSCL has an interest in the discovery of the local resource. Section 9.2.1.14 Announced Resource of the M2M Functional Architecture {{bibref|ETSIM2MFA}} provides a description of this behavior of an Announced Resource.

          Section 9.3.2.28 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.2.7 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describes the process of announcing and deannouncing of resources within a SCL.
	 *
	 * @since 2.6
	 * @param announcedToSCLList the input value
	 */
	public void  setAnnouncedToSCLList(Collection<String> announcedToSCLList) {
		this.announcedToSCLList = announcedToSCLList;
	}

	/**
	 * Set the {{list}} The list represents an unordered set of URIs {{bibref|RFC3986}}. 

          A list item is a URI string that represents a SCL to which the this {{object}} will announce original (local) resources. 

          The AnnouncedToSCL has an interest in the discovery of the local resource. Section 9.2.1.14 Announced Resource of the M2M Functional Architecture {{bibref|ETSIM2MFA}} provides a description of this behavior of an Announced Resource.

          Section 9.3.2.28 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.2.7 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describes the process of announcing and deannouncing of resources within a SCL.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public SCL withAnnouncedToSCLList(String string) {
		getAnnouncedToSCLList().add(string);
		return this;
	}

	/**
	 * Get the this object is represents the administration properties used when a NSCL requests discovery of resources within this {{object|##.SCL}} instance.

        Section 9.3.2.27 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the process of discovery of resources within a SCL.
	 *
	 * @return the value
	 */
	public Discovery getDiscovery() {
		return discovery;
	}

	/**
	 * Set the this object is represents the administration properties used when a NSCL requests discovery of resources within this {{object|##.SCL}} instance.

        Section 9.3.2.27 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the process of discovery of resources within a SCL.
	 *
	 * @param discovery the input value
	 */
	public void  setDiscovery(Discovery discovery) {
		this.discovery = discovery;
	}

	/**
	 * Set the this object is represents the administration properties used when a NSCL requests discovery of resources within this {{object|##.SCL}} instance.

        Section 9.3.2.27 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the process of discovery of resources within a SCL.
	 *
	 * @param discovery the input value
	 * @return this instance
	 */
	public SCL withDiscovery(Discovery discovery) {
		this.discovery = discovery;
		return this;
	}

	/**
	 * Get the this object represents the properties and status necessary for a SCL to reregister with one or more NSCLs.
	 *
	 * @return the value
	 */
	public Reregistration getReregistration() {
		return reregistration;
	}

	/**
	 * Set the this object represents the properties and status necessary for a SCL to reregister with one or more NSCLs.
	 *
	 * @param reregistration the input value
	 */
	public void  setReregistration(Reregistration reregistration) {
		this.reregistration = reregistration;
	}

	/**
	 * Set the this object represents the properties and status necessary for a SCL to reregister with one or more NSCLs.
	 *
	 * @param reregistration the input value
	 * @return this instance
	 */
	public SCL withReregistration(Reregistration reregistration) {
		this.reregistration = reregistration;
		return this;
	}

	/**
	 * Get the this object describes the parameters necessary to administer the store-and-forward (SAF) handling policies applied to requests to access remotely hosted resources.

        Policies are described by instances of {{object}}. Which instances of {{object}} are used by the SCL is determined by the {{param|PolicyScope}} parameter.

        Section 9.3.1.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describe the behavior for SAF processing.

        There is at most one {{object}} instance with the {{param|PolicyScope}} containing a specific application id (APP-ID) URI value within the list.

        There is exactly one {{object}} instance with a {{param|PolicyScope}} value of "default".
	 *
	 * @return the value
	 */
	public Collection<SAFPolicySet> getSafPolicySets() {
		if (this.safPolicySets == null){ this.safPolicySets=new ArrayList<>();}
		return safPolicySets;
	}

	/**
	 * Set the this object describes the parameters necessary to administer the store-and-forward (SAF) handling policies applied to requests to access remotely hosted resources.

        Policies are described by instances of {{object}}. Which instances of {{object}} are used by the SCL is determined by the {{param|PolicyScope}} parameter.

        Section 9.3.1.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describe the behavior for SAF processing.

        There is at most one {{object}} instance with the {{param|PolicyScope}} containing a specific application id (APP-ID) URI value within the list.

        There is exactly one {{object}} instance with a {{param|PolicyScope}} value of "default".
	 *
	 * @param safPolicySets the input value
	 */
	public void  setSafPolicySets(Collection<SAFPolicySet> safPolicySets) {
		this.safPolicySets = safPolicySets;
	}

	/**
	 * Set the this object describes the parameters necessary to administer the store-and-forward (SAF) handling policies applied to requests to access remotely hosted resources.

        Policies are described by instances of {{object}}. Which instances of {{object}} are used by the SCL is determined by the {{param|PolicyScope}} parameter.

        Section 9.3.1.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} and Section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} describe the behavior for SAF processing.

        There is at most one {{object}} instance with the {{param|PolicyScope}} containing a specific application id (APP-ID) URI value within the list.

        There is exactly one {{object}} instance with a {{param|PolicyScope}} value of "default".
	 *
	 * @param safPolicySet the input value
	 * @return this instance
	 */
	public SCL withSAFPolicySet(SAFPolicySet safPolicySet) {
		getSafPolicySets().add(safPolicySet);
		return this;
	}

	/**
	 * Get the M2M Area Network information provides administration capabilities for remote management (REM) of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        This object provides the administration of the properties needed by the SCL to remotely manage M2M Devices within a specific type of M2M Area network as defined by {{param|AreaNwkType}}.

        Multiple instances of {{object}} with the same {{param|AreaNwkType}} is permitted.

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL for an M2M Device.
	 *
	 * @return the value
	 */
	public Collection<AreaNwkInstance> getAreaNwkInstances() {
		if (this.areaNwkInstances == null){ this.areaNwkInstances=new ArrayList<>();}
		return areaNwkInstances;
	}

	/**
	 * Set the M2M Area Network information provides administration capabilities for remote management (REM) of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        This object provides the administration of the properties needed by the SCL to remotely manage M2M Devices within a specific type of M2M Area network as defined by {{param|AreaNwkType}}.

        Multiple instances of {{object}} with the same {{param|AreaNwkType}} is permitted.

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL for an M2M Device.
	 *
	 * @param areaNwkInstances the input value
	 */
	public void  setAreaNwkInstances(Collection<AreaNwkInstance> areaNwkInstances) {
		this.areaNwkInstances = areaNwkInstances;
	}

	/**
	 * Set the M2M Area Network information provides administration capabilities for remote management (REM) of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

        This object provides the administration of the properties needed by the SCL to remotely manage M2M Devices within a specific type of M2M Area network as defined by {{param|AreaNwkType}}.

        Multiple instances of {{object}} with the same {{param|AreaNwkType}} is permitted.

        Section 5.3.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the REM functionality expected of a SCL for an M2M Device.
	 *
	 * @param areaNwkInstance the input value
	 * @return this instance
	 */
	public SCL withAreaNwkInstance(AreaNwkInstance areaNwkInstance) {
		getAreaNwkInstances().add(areaNwkInstance);
		return this;
	}

	/**
	 * Get the M2M Area Network Device Information provides the administration capability to the SCL for maintenance of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

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
	 * @return the value
	 */
	public Collection<AreaNwkDeviceInfoInstance> getAreaNwkDeviceInfoInstances() {
		if (this.areaNwkDeviceInfoInstances == null){ this.areaNwkDeviceInfoInstances=new ArrayList<>();}
		return areaNwkDeviceInfoInstances;
	}

	/**
	 * Set the M2M Area Network Device Information provides the administration capability to the SCL for maintenance of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

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
	 * @param areaNwkDeviceInfoInstances the input value
	 */
	public void  setAreaNwkDeviceInfoInstances(Collection<AreaNwkDeviceInfoInstance> areaNwkDeviceInfoInstances) {
		this.areaNwkDeviceInfoInstances = areaNwkDeviceInfoInstances;
	}

	/**
	 * Set the M2M Area Network Device Information provides the administration capability to the SCL for maintenance of M2M Devices (D', d) that are attached to this {{object|##.SCL}} instance.

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
	 * @param areaNwkDeviceInfoInstance the input value
	 * @return this instance
	 */
	public SCL withAreaNwkDeviceInfoInstance(AreaNwkDeviceInfoInstance areaNwkDeviceInfoInstance) {
		getAreaNwkDeviceInfoInstances().add(areaNwkDeviceInfoInstance);
		return this;
	}

	//</editor-fold>

}