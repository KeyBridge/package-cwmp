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
package org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.bridge;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Bridge Port table.  If this table is supported, it MUST contain an entry for each Bridge Port.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Bridge.{i}.Port.{i}.")
@XmlRootElement(name = "Port")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.Bridge.Port")
@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

	/**
	 * Enables or disables this Bridge Port table entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PortEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean portEnable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The interface associated with this Bridge Port table entry.  Represents a bridge port as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}. 

To associate this Bridge Port with an interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PortInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String portInterface;
	/**
	 * Bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PortState")
	public String portState = "Disabled";
	/**
	 * Default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, this parameter MUST be ignored.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PVID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4094)
	public Integer pviD = 1;
	/**
	 * Bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2005}}.  {{enum}}

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AcceptableFrameTypes")
	@CWMPParameter(access = "readWrite")
	public String acceptableFrameTypes = "AdmitAll";
	/**
	 * Enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "IngressFiltering")
	@CWMPParameter(access = "readWrite")
	public Boolean ingressFiltering = false;

	public Port() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Bridge Port table entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isPortEnable() {
		return portEnable;
	}

	/**
	 * Set the enables or disables this Bridge Port table entry.
	 *
	 * @since 1.4
	 * @param portEnable the input value
	 */
	public void  setPortEnable(Boolean portEnable) {
		this.portEnable = portEnable;
	}

	/**
	 * Set the enables or disables this Bridge Port table entry.
	 *
	 * @since 1.4
	 * @param portEnable the input value
	 * @return this instance
	 */
	public Port withPortEnable(Boolean portEnable) {
		this.portEnable = portEnable;
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
	public Port withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the interface associated with this Bridge Port table entry.  Represents a bridge port as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}. 

To associate this Bridge Port with an interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getPortInterface() {
		return portInterface;
	}

	/**
	 * Set the interface associated with this Bridge Port table entry.  Represents a bridge port as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}. 

To associate this Bridge Port with an interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.
	 *
	 * @since 1.4
	 * @param portInterface the input value
	 */
	public void  setPortInterface(String portInterface) {
		this.portInterface = portInterface;
	}

	/**
	 * Set the interface associated with this Bridge Port table entry.  Represents a bridge port as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}. 

To associate this Bridge Port with an interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.
	 *
	 * @since 1.4
	 * @param portInterface the input value
	 * @return this instance
	 */
	public Port withPortInterface(String portInterface) {
		this.portInterface = portInterface;
		return this;
	}

	/**
	 * Get the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getPortState() {
		return portState;
	}

	/**
	 * Set the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}.
	 *
	 * @since 1.4
	 * @param portState the input value
	 */
	public void  setPortState(String portState) {
		this.portState = portState;
	}

	/**
	 * Set the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}}.
	 *
	 * @since 1.4
	 * @param portState the input value
	 * @return this instance
	 */
	public Port withPortState(String portState) {
		this.portState = portState;
		return this;
	}

	/**
	 * Get the default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, this parameter MUST be ignored.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getPviD() {
		return pviD;
	}

	/**
	 * Set the default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, this parameter MUST be ignored.
	 *
	 * @since 1.4
	 * @param pviD the input value
	 */
	public void  setPviD(Integer pviD) {
		this.pviD = pviD;
	}

	/**
	 * Set the default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, this parameter MUST be ignored.
	 *
	 * @since 1.4
	 * @param pviD the input value
	 * @return this instance
	 */
	public Port withPviD(Integer pviD) {
		this.pviD = pviD;
		return this;
	}

	/**
	 * Get the bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2005}}.  {{enum}}

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getAcceptableFrameTypes() {
		return acceptableFrameTypes;
	}

	/**
	 * Set the bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2005}}.  {{enum}}

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 1.4
	 * @param acceptableFrameTypes the input value
	 */
	public void  setAcceptableFrameTypes(String acceptableFrameTypes) {
		this.acceptableFrameTypes = acceptableFrameTypes;
	}

	/**
	 * Set the bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2005}}.  {{enum}}

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 1.4
	 * @param acceptableFrameTypes the input value
	 * @return this instance
	 */
	public Port withAcceptableFrameTypes(String acceptableFrameTypes) {
		this.acceptableFrameTypes = acceptableFrameTypes;
		return this;
	}

	/**
	 * Get the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isIngressFiltering() {
		return ingressFiltering;
	}

	/**
	 * Set the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.4
	 * @param ingressFiltering the input value
	 */
	public void  setIngressFiltering(Boolean ingressFiltering) {
		this.ingressFiltering = ingressFiltering;
	}

	/**
	 * Set the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2005}}.

For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.4
	 * @param ingressFiltering the input value
	 * @return this instance
	 */
	public Port withIngressFiltering(Boolean ingressFiltering) {
		this.ingressFiltering = ingressFiltering;
		return this;
	}

	//</editor-fold>

}