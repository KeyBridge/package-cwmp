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
package org.broadbandforum.tr181.device.pcp;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.pcp.client.PCPProxy;
import org.broadbandforum.tr181.device.pcp.client.Server;
import org.broadbandforum.tr181.device.pcp.client.UPnPIWF;

	/**
	 * Client properties for Port Control Protocol (PCP). The PCP Client interacts with a PCP Server as defined in {{bibref|RFC6887}} for internal device applications or LAN device applications via Interworking functions.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.")
@XmlRootElement(name = "Device.PCP.Client")
@XmlType(name = "Device.PCP.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * Enables or disables the PCP Client.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference|the interface stack instance representing the WAN interface this client operates on}} See {{object|.InterfaceStack.}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "WANInterface")
	public String wanInterface;
	/**
	 * The status of the PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Enables or disables the MAP OpCode.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MAPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean mapEnable;
	/**
	 * Enables or disables the PEER OpCode.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PEEREnable")
	@CWMPParameter(access = "readWrite")
	public Boolean peeREnable;
	/**
	 * Enables or disables the ANNOUNCE OpCode.

          When {{false}} the PCP Client does not support unsolicited ANNOUNCE messages.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ANNOUNCEEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean annOUNCEEnable;
	/**
	 * Enables or disables the THIRD_PARTY Option.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "THIRDPARTYEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean thiRDPARTYEnable;
	/**
	 * Indicates whether THIRD_PARTY Option is enabled or not. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "THIRDPARTYStatus")
	public String thiRDPARTYStatus;
	/**
	 * Enables or disables the FILTER option.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "FILTEREnable")
	@CWMPParameter(access = "readWrite")
	public Boolean filTEREnable;
	/**
	 * Properties for the Port Control Protocol (PCP) Proxy, as specified in {{bibref|PCPProxy}}.
	 */
	@XmlElement(name = "PCPProxy")
	public PCPProxy pcpProxy;
	/**
	 * Properties for the interworking function between UPnP IGD (Internet Gateway Device) and PCP, as specified in {{bibref|RFC6970}}.
	 */
	@XmlElement(name = "UPnPIWF")
	public UPnPIWF upnPIWF;
	/**
	 * This table contains the PCP Servers to be used by the PCP Client. Entries are either statically configured or automatically created via DHCP options OPTION_V4_PCP_SERVER and OPTION_V6_PCP_SERVER, as per {{bibref|RFC7291}}.

        Each OPTION_V4_PCP_SERVER or OPTION_V6_PCP_SERVER option corresponds to a {{object}} instance.  If an option returns multiple addresses then that {{object}} instance has multiple addresses.
	 */
	@XmlElementWrapper(name = "Servers")
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	public Collection<Server> servers;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the PCP Client.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference|the interface stack instance representing the WAN interface this client operates on}} See {{object|.InterfaceStack.}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getWanInterface() {
		return wanInterface;
	}

	/**
	 * Set the {{reference|the interface stack instance representing the WAN interface this client operates on}} See {{object|.InterfaceStack.}}
	 *
	 * @since 2.8
	 * @param wanInterface the input value
	 */
	public void  setWanInterface(String wanInterface) {
		this.wanInterface = wanInterface;
	}

	/**
	 * Set the {{reference|the interface stack instance representing the WAN interface this client operates on}} See {{object|.InterfaceStack.}}
	 *
	 * @since 2.8
	 * @param wanInterface the input value
	 * @return this instance
	 */
	public Client withWanInterface(String wanInterface) {
		this.wanInterface = wanInterface;
		return this;
	}

	/**
	 * Get the status of the PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the enables or disables the MAP OpCode.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isMapEnable() {
		return mapEnable;
	}

	/**
	 * Set the enables or disables the MAP OpCode.
	 *
	 * @since 2.8
	 * @param mapEnable the input value
	 */
	public void  setMapEnable(Boolean mapEnable) {
		this.mapEnable = mapEnable;
	}

	/**
	 * Set the enables or disables the MAP OpCode.
	 *
	 * @since 2.8
	 * @param mapEnable the input value
	 * @return this instance
	 */
	public Client withMapEnable(Boolean mapEnable) {
		this.mapEnable = mapEnable;
		return this;
	}

	/**
	 * Get the enables or disables the PEER OpCode.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isPeeREnable() {
		return peeREnable;
	}

	/**
	 * Set the enables or disables the PEER OpCode.
	 *
	 * @since 2.8
	 * @param peeREnable the input value
	 */
	public void  setPeeREnable(Boolean peeREnable) {
		this.peeREnable = peeREnable;
	}

	/**
	 * Set the enables or disables the PEER OpCode.
	 *
	 * @since 2.8
	 * @param peeREnable the input value
	 * @return this instance
	 */
	public Client withPeeREnable(Boolean peeREnable) {
		this.peeREnable = peeREnable;
		return this;
	}

	/**
	 * Get the enables or disables the ANNOUNCE OpCode.

          When {{false}} the PCP Client does not support unsolicited ANNOUNCE messages.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isAnnOUNCEEnable() {
		return annOUNCEEnable;
	}

	/**
	 * Set the enables or disables the ANNOUNCE OpCode.

          When {{false}} the PCP Client does not support unsolicited ANNOUNCE messages.
	 *
	 * @since 2.8
	 * @param annOUNCEEnable the input value
	 */
	public void  setAnnOUNCEEnable(Boolean annOUNCEEnable) {
		this.annOUNCEEnable = annOUNCEEnable;
	}

	/**
	 * Set the enables or disables the ANNOUNCE OpCode.

          When {{false}} the PCP Client does not support unsolicited ANNOUNCE messages.
	 *
	 * @since 2.8
	 * @param annOUNCEEnable the input value
	 * @return this instance
	 */
	public Client withAnnOUNCEEnable(Boolean annOUNCEEnable) {
		this.annOUNCEEnable = annOUNCEEnable;
		return this;
	}

	/**
	 * Get the enables or disables the THIRD_PARTY Option.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isThiRDPARTYEnable() {
		return thiRDPARTYEnable;
	}

	/**
	 * Set the enables or disables the THIRD_PARTY Option.
	 *
	 * @since 2.8
	 * @param thiRDPARTYEnable the input value
	 */
	public void  setThiRDPARTYEnable(Boolean thiRDPARTYEnable) {
		this.thiRDPARTYEnable = thiRDPARTYEnable;
	}

	/**
	 * Set the enables or disables the THIRD_PARTY Option.
	 *
	 * @since 2.8
	 * @param thiRDPARTYEnable the input value
	 * @return this instance
	 */
	public Client withThiRDPARTYEnable(Boolean thiRDPARTYEnable) {
		this.thiRDPARTYEnable = thiRDPARTYEnable;
		return this;
	}

	/**
	 * Get the indicates whether THIRD_PARTY Option is enabled or not. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getThiRDPARTYStatus() {
		return thiRDPARTYStatus;
	}

	/**
	 * Set the indicates whether THIRD_PARTY Option is enabled or not. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param thiRDPARTYStatus the input value
	 */
	public void  setThiRDPARTYStatus(String thiRDPARTYStatus) {
		this.thiRDPARTYStatus = thiRDPARTYStatus;
	}

	/**
	 * Set the indicates whether THIRD_PARTY Option is enabled or not. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param thiRDPARTYStatus the input value
	 * @return this instance
	 */
	public Client withThiRDPARTYStatus(String thiRDPARTYStatus) {
		this.thiRDPARTYStatus = thiRDPARTYStatus;
		return this;
	}

	/**
	 * Get the enables or disables the FILTER option.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isFilTEREnable() {
		return filTEREnable;
	}

	/**
	 * Set the enables or disables the FILTER option.
	 *
	 * @since 2.8
	 * @param filTEREnable the input value
	 */
	public void  setFilTEREnable(Boolean filTEREnable) {
		this.filTEREnable = filTEREnable;
	}

	/**
	 * Set the enables or disables the FILTER option.
	 *
	 * @since 2.8
	 * @param filTEREnable the input value
	 * @return this instance
	 */
	public Client withFilTEREnable(Boolean filTEREnable) {
		this.filTEREnable = filTEREnable;
		return this;
	}

	/**
	 * Get the properties for the Port Control Protocol (PCP) Proxy, as specified in {{bibref|PCPProxy}}.
	 *
	 * @return the value
	 */
	public PCPProxy getPcpProxy() {
		return pcpProxy;
	}

	/**
	 * Set the properties for the Port Control Protocol (PCP) Proxy, as specified in {{bibref|PCPProxy}}.
	 *
	 * @param pcpProxy the input value
	 */
	public void  setPcpProxy(PCPProxy pcpProxy) {
		this.pcpProxy = pcpProxy;
	}

	/**
	 * Set the properties for the Port Control Protocol (PCP) Proxy, as specified in {{bibref|PCPProxy}}.
	 *
	 * @param pcpProxy the input value
	 * @return this instance
	 */
	public Client withPcpProxy(PCPProxy pcpProxy) {
		this.pcpProxy = pcpProxy;
		return this;
	}

	/**
	 * Get the properties for the interworking function between UPnP IGD (Internet Gateway Device) and PCP, as specified in {{bibref|RFC6970}}.
	 *
	 * @return the value
	 */
	public UPnPIWF getUpnPIWF() {
		return upnPIWF;
	}

	/**
	 * Set the properties for the interworking function between UPnP IGD (Internet Gateway Device) and PCP, as specified in {{bibref|RFC6970}}.
	 *
	 * @param upnPIWF the input value
	 */
	public void  setUpnPIWF(UPnPIWF upnPIWF) {
		this.upnPIWF = upnPIWF;
	}

	/**
	 * Set the properties for the interworking function between UPnP IGD (Internet Gateway Device) and PCP, as specified in {{bibref|RFC6970}}.
	 *
	 * @param upnPIWF the input value
	 * @return this instance
	 */
	public Client withUpnPIWF(UPnPIWF upnPIWF) {
		this.upnPIWF = upnPIWF;
		return this;
	}

	/**
	 * Get the this table contains the PCP Servers to be used by the PCP Client. Entries are either statically configured or automatically created via DHCP options OPTION_V4_PCP_SERVER and OPTION_V6_PCP_SERVER, as per {{bibref|RFC7291}}.

        Each OPTION_V4_PCP_SERVER or OPTION_V6_PCP_SERVER option corresponds to a {{object}} instance.  If an option returns multiple addresses then that {{object}} instance has multiple addresses.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the this table contains the PCP Servers to be used by the PCP Client. Entries are either statically configured or automatically created via DHCP options OPTION_V4_PCP_SERVER and OPTION_V6_PCP_SERVER, as per {{bibref|RFC7291}}.

        Each OPTION_V4_PCP_SERVER or OPTION_V6_PCP_SERVER option corresponds to a {{object}} instance.  If an option returns multiple addresses then that {{object}} instance has multiple addresses.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the this table contains the PCP Servers to be used by the PCP Client. Entries are either statically configured or automatically created via DHCP options OPTION_V4_PCP_SERVER and OPTION_V6_PCP_SERVER, as per {{bibref|RFC7291}}.

        Each OPTION_V4_PCP_SERVER or OPTION_V6_PCP_SERVER option corresponds to a {{object}} instance.  If an option returns multiple addresses then that {{object}} instance has multiple addresses.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public Client withServer(Server server) {
		getServers().add(server);
		return this;
	}

	//</editor-fold>

}