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
package org.broadbandforum.tr181.device.atm;

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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr181.device.atm.link.QoS;
import org.broadbandforum.tr181.device.atm.link.Stats;

	/**
	 * ATM link-layer table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Models an ATM PVC virtual circuit and the ATM Adaption Layer (AAL). An ATM Link entry is typically stacked on top of either a {{object|.DSL.Channel.}} or a {{object|.DSL.BondingGroup.}} object. 

        When an ''ATM Link'' interface is used, a lower-layer {{object|.DSL.Channel}} interface MUST be configured with ATM encapsulation (see {{param|.DSL.Channel.{i}.LinkEncapsulationUsed}}).
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.ATM.Link.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"}, functional = false)})
@XmlRootElement(name = "Device.ATM.Link")
@XmlType(name = "Device.ATM.Link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

	/**
	 * Enables or disables the link.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the link (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
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
	 * The textual name of the link as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the link entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * Indicates the type of connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LinkType")
	@CWMPParameter(access = "readWrite")
	public String linkType;
	/**
	 * Indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this  variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error SHOULD be returned.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoConfig")
	public Boolean autoConfig;
	/**
	 * Destination address of this link, in the form "VPI/VCI" (e.g. "8/23" or "0/35").
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestinationAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@Pattern(regexp = "\\d+/\\d+")
	public String destinationAddress;
	/**
	 * Identifies the connection encapsulation that will be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Encapsulation")
	@CWMPParameter(access = "readWrite")
	public String encapsulation;
	/**
	 * This flag tells if a checksum SHOULD be added in the ATM payload. It does not refer to the checksum of one of  the ATM cells or AALX packets. In case of LLC or VCMUX encapsulation, this ATM checksum is the FCS field described in {{bibref|RFC2684}}. It is only applicable in the upstream direction.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FCSPreserved")
	@CWMPParameter(access = "readWrite")
	public Boolean fcsPreserved;
	/**
	 * {{list}} Ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be  established.  In the form "VPI1/VCI1, VPI2/VCI2, ...".  {{pattern}}

          Example:

          : ''0/35, 8/35, 1/35''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VCSearchList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> vcsearchList;
	/**
	 * Describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AAL")
	public String aal;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * The ATM Link QoS object.
	 */
	@XmlElement(name = "QoS")
	public QoS qos;

	public Link() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the link.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the link.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the link.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Link withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the link (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the link (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the link (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Link withStatus(String status) {
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
	public Link withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the link as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the link as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the link as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Link withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the link entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the link entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the link entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Link withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Link withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the indicates the type of connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLinkType() {
		return linkType;
	}

	/**
	 * Set the indicates the type of connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 2.0
	 * @param linkType the input value
	 */
	public void  setLinkType(String linkType) {
		this.linkType = linkType;
	}

	/**
	 * Set the indicates the type of connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 2.0
	 * @param linkType the input value
	 * @return this instance
	 */
	public Link withLinkType(String linkType) {
		this.linkType = linkType;
		return this;
	}

	/**
	 * Get the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this  variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error SHOULD be returned.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAutoConfig() {
		return autoConfig;
	}

	/**
	 * Set the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this  variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error SHOULD be returned.
	 *
	 * @since 2.0
	 * @param autoConfig the input value
	 */
	public void  setAutoConfig(Boolean autoConfig) {
		this.autoConfig = autoConfig;
	}

	/**
	 * Set the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this  variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error SHOULD be returned.
	 *
	 * @since 2.0
	 * @param autoConfig the input value
	 * @return this instance
	 */
	public Link withAutoConfig(Boolean autoConfig) {
		this.autoConfig = autoConfig;
		return this;
	}

	/**
	 * Get the destination address of this link, in the form "VPI/VCI" (e.g. "8/23" or "0/35").
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * Set the destination address of this link, in the form "VPI/VCI" (e.g. "8/23" or "0/35").
	 *
	 * @since 2.0
	 * @param destinationAddress the input value
	 */
	public void  setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * Set the destination address of this link, in the form "VPI/VCI" (e.g. "8/23" or "0/35").
	 *
	 * @since 2.0
	 * @param destinationAddress the input value
	 * @return this instance
	 */
	public Link withDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
		return this;
	}

	/**
	 * Get the identifies the connection encapsulation that will be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEncapsulation() {
		return encapsulation;
	}

	/**
	 * Set the identifies the connection encapsulation that will be used.
	 *
	 * @since 2.0
	 * @param encapsulation the input value
	 */
	public void  setEncapsulation(String encapsulation) {
		this.encapsulation = encapsulation;
	}

	/**
	 * Set the identifies the connection encapsulation that will be used.
	 *
	 * @since 2.0
	 * @param encapsulation the input value
	 * @return this instance
	 */
	public Link withEncapsulation(String encapsulation) {
		this.encapsulation = encapsulation;
		return this;
	}

	/**
	 * Get the this flag tells if a checksum SHOULD be added in the ATM payload. It does not refer to the checksum of one of  the ATM cells or AALX packets. In case of LLC or VCMUX encapsulation, this ATM checksum is the FCS field described in {{bibref|RFC2684}}. It is only applicable in the upstream direction.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isFcsPreserved() {
		return fcsPreserved;
	}

	/**
	 * Set the this flag tells if a checksum SHOULD be added in the ATM payload. It does not refer to the checksum of one of  the ATM cells or AALX packets. In case of LLC or VCMUX encapsulation, this ATM checksum is the FCS field described in {{bibref|RFC2684}}. It is only applicable in the upstream direction.
	 *
	 * @since 2.0
	 * @param fcsPreserved the input value
	 */
	public void  setFcsPreserved(Boolean fcsPreserved) {
		this.fcsPreserved = fcsPreserved;
	}

	/**
	 * Set the this flag tells if a checksum SHOULD be added in the ATM payload. It does not refer to the checksum of one of  the ATM cells or AALX packets. In case of LLC or VCMUX encapsulation, this ATM checksum is the FCS field described in {{bibref|RFC2684}}. It is only applicable in the upstream direction.
	 *
	 * @since 2.0
	 * @param fcsPreserved the input value
	 * @return this instance
	 */
	public Link withFcsPreserved(Boolean fcsPreserved) {
		this.fcsPreserved = fcsPreserved;
		return this;
	}

	/**
	 * Get the {{list}} Ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be  established.  In the form "VPI1/VCI1, VPI2/VCI2, ...".  {{pattern}}

          Example:

          : ''0/35, 8/35, 1/35''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getVcsearchList() {
		if (this.vcsearchList == null){ this.vcsearchList=new ArrayList<>();}
		return vcsearchList;
	}

	/**
	 * Set the {{list}} Ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be  established.  In the form "VPI1/VCI1, VPI2/VCI2, ...".  {{pattern}}

          Example:

          : ''0/35, 8/35, 1/35''
	 *
	 * @since 2.0
	 * @param vcsearchList the input value
	 */
	public void  setVcsearchList(Collection<String> vcsearchList) {
		this.vcsearchList = vcsearchList;
	}

	/**
	 * Set the {{list}} Ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be  established.  In the form "VPI1/VCI1, VPI2/VCI2, ...".  {{pattern}}

          Example:

          : ''0/35, 8/35, 1/35''
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Link withVcsearchList(String string) {
		getVcsearchList().add(string);
		return this;
	}

	/**
	 * Get the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAal() {
		return aal;
	}

	/**
	 * Set the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 2.0
	 * @param aal the input value
	 */
	public void  setAal(String aal) {
		this.aal = aal;
	}

	/**
	 * Set the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 2.0
	 * @param aal the input value
	 * @return this instance
	 */
	public Link withAal(String aal) {
		this.aal = aal;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Link withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the ATM Link QoS object.
	 *
	 * @return the value
	 */
	public QoS getQos() {
		return qos;
	}

	/**
	 * Set the ATM Link QoS object.
	 *
	 * @param qos the input value
	 */
	public void  setQos(QoS qos) {
		this.qos = qos;
	}

	/**
	 * Set the ATM Link QoS object.
	 *
	 * @param qos the input value
	 * @return this instance
	 */
	public Link withQos(QoS qos) {
		this.qos = qos;
		return this;
	}

	//</editor-fold>

}