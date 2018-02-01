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
package org.broadbandforum.tr181.device.ieee1905;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ieee1905.al.ForwardingTable;
import org.broadbandforum.tr181.device.ieee1905.al.Interface;
import org.broadbandforum.tr181.device.ieee1905.al.NetworkTopology;
import org.broadbandforum.tr181.device.ieee1905.al.NetworkingRegistrar;
import org.broadbandforum.tr181.device.ieee1905.al.Security;

	/**
	 * This object represents the management functions for the 1905 Abstraction Layer as defined in {{bibref|IEEE1905.1a|Section 4.4 Abstraction Layer}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.")
public class AL {

	/**
	 * 1905 AL MAC Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IEEE1905Id")
	public MACAddress ieeE1905Id;
	/**
	 * The current operational state of the 1905 Abstraction Layer. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. 

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * This parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  The accumulated time in seconds since the 1905 Abstraction Layer entered its current operational state.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * This parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  {{list}} {{reference}} See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LowerLayers")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * {{list}} See {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}. 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz]
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "RegistrarFreqBand")
	@Size(max = 1024)
	@XmlList
	public Collection<String> registrarFreqBand;
	/**
	 * The 1905 interface table (described in {{bibref|IEEE1905.1a|sub-clause 5 Abstraction Layer Management}}).
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * This object represents the rules to forward PDUs between interfaces within the 1905 Abstraction Layer.
	 */
	@XmlElement(name = "ForwardingTable")
	public ForwardingTable forwardingTable;
	/**
	 * This object represents the 1905 Network Topology capabilities of this device.
	 */
	@XmlElement(name = "NetworkTopology")
	public NetworkTopology networkTopology;
	/**
	 * This object represents the Security configuration for the 1905 device as defined in {{bibref|IEEE1905.1a|Section 9.2 Security Setup Methods}}.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * This object represents the detected Network Registrars detection function for the IEEE 1905 network. They are determined by received AP-autoconfiguration response messages with Registrar role, with supported band as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}
	 */
	@XmlElement(name = "NetworkingRegistrar")
	public NetworkingRegistrar networkingRegistrar;

	public AL() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getIeeE1905Id() {
		return ieeE1905Id;
	}

	/**
	 * Set the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 */
	public void  setIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
	}

	/**
	 * Set the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 * @return this instance
	 */
	public AL withIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
		return this;
	}

	/**
	 * Get the current operational state of the 1905 Abstraction Layer. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. 

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the 1905 Abstraction Layer. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. 

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.9
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the 1905 Abstraction Layer. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. 

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.9
	 * @param status the input value
	 * @return this instance
	 */
	public AL withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  The accumulated time in seconds since the 1905 Abstraction Layer entered its current operational state.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  The accumulated time in seconds since the 1905 Abstraction Layer entered its current operational state.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  The accumulated time in seconds since the 1905 Abstraction Layer entered its current operational state.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 * @return this instance
	 */
	public AL withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  {{list}} {{reference}} See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  {{list}} {{reference}} See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because IEEE1905 is not an interface.  {{list}} {{reference}} See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public AL withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the {{list}} See {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}. 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz]
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getRegistrarFreqBand() {
		if (this.registrarFreqBand == null){ this.registrarFreqBand=new ArrayList<>();}
		return registrarFreqBand;
	}

	/**
	 * Set the {{list}} See {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}. 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz]
	 *
	 * @since 2.9
	 * @param registrarFreqBand the input value
	 */
	public void  setRegistrarFreqBand(Collection<String> registrarFreqBand) {
		this.registrarFreqBand = registrarFreqBand;
	}

	/**
	 * Set the {{list}} See {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}. 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz]
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public AL withRegistrarFreqBand(String string) {
		getRegistrarFreqBand().add(string);
		return this;
	}

	/**
	 * Get the 1905 interface table (described in {{bibref|IEEE1905.1a|sub-clause 5 Abstraction Layer Management}}).
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the 1905 interface table (described in {{bibref|IEEE1905.1a|sub-clause 5 Abstraction Layer Management}}).
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the 1905 interface table (described in {{bibref|IEEE1905.1a|sub-clause 5 Abstraction Layer Management}}).
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public AL withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the this object represents the rules to forward PDUs between interfaces within the 1905 Abstraction Layer.
	 *
	 * @return the value
	 */
	public ForwardingTable getForwardingTable() {
		return forwardingTable;
	}

	/**
	 * Set the this object represents the rules to forward PDUs between interfaces within the 1905 Abstraction Layer.
	 *
	 * @param forwardingTable the input value
	 */
	public void  setForwardingTable(ForwardingTable forwardingTable) {
		this.forwardingTable = forwardingTable;
	}

	/**
	 * Set the this object represents the rules to forward PDUs between interfaces within the 1905 Abstraction Layer.
	 *
	 * @param forwardingTable the input value
	 * @return this instance
	 */
	public AL withForwardingTable(ForwardingTable forwardingTable) {
		this.forwardingTable = forwardingTable;
		return this;
	}

	/**
	 * Get the this object represents the 1905 Network Topology capabilities of this device.
	 *
	 * @return the value
	 */
	public NetworkTopology getNetworkTopology() {
		return networkTopology;
	}

	/**
	 * Set the this object represents the 1905 Network Topology capabilities of this device.
	 *
	 * @param networkTopology the input value
	 */
	public void  setNetworkTopology(NetworkTopology networkTopology) {
		this.networkTopology = networkTopology;
	}

	/**
	 * Set the this object represents the 1905 Network Topology capabilities of this device.
	 *
	 * @param networkTopology the input value
	 * @return this instance
	 */
	public AL withNetworkTopology(NetworkTopology networkTopology) {
		this.networkTopology = networkTopology;
		return this;
	}

	/**
	 * Get the this object represents the Security configuration for the 1905 device as defined in {{bibref|IEEE1905.1a|Section 9.2 Security Setup Methods}}.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object represents the Security configuration for the 1905 device as defined in {{bibref|IEEE1905.1a|Section 9.2 Security Setup Methods}}.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object represents the Security configuration for the 1905 device as defined in {{bibref|IEEE1905.1a|Section 9.2 Security Setup Methods}}.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public AL withSecurity(Security security) {
		this.security = security;
		return this;
	}

	/**
	 * Get the this object represents the detected Network Registrars detection function for the IEEE 1905 network. They are determined by received AP-autoconfiguration response messages with Registrar role, with supported band as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}
	 *
	 * @return the value
	 */
	public NetworkingRegistrar getNetworkingRegistrar() {
		return networkingRegistrar;
	}

	/**
	 * Set the this object represents the detected Network Registrars detection function for the IEEE 1905 network. They are determined by received AP-autoconfiguration response messages with Registrar role, with supported band as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}
	 *
	 * @param networkingRegistrar the input value
	 */
	public void  setNetworkingRegistrar(NetworkingRegistrar networkingRegistrar) {
		this.networkingRegistrar = networkingRegistrar;
	}

	/**
	 * Set the this object represents the detected Network Registrars detection function for the IEEE 1905 network. They are determined by received AP-autoconfiguration response messages with Registrar role, with supported band as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}
	 *
	 * @param networkingRegistrar the input value
	 * @return this instance
	 */
	public AL withNetworkingRegistrar(NetworkingRegistrar networkingRegistrar) {
		this.networkingRegistrar = networkingRegistrar;
		return this;
	}

	//</editor-fold>

}