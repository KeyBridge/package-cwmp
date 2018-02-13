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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice;

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
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANATMF5LoopbackDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANDSLLinkConfig;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANEthernetLinkConfig;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANIPConnection;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANPOTSLinkConfig;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANPPPConnection;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.WANPTMLinkConfig;

	/**
	 * Each instance contains objects associated with a given WAN link.  In the case of DSL, each instance corresponds to either a single ATM VC or a PTM Ethernet link.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.  In the case of Ethernet (interface or link), only one ''WANConnectionDevice'' instance is supported.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.")
@XmlRootElement(name = "WANConnectionDevice")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANConnectionDevice {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This object models the ATM layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 */
	@XmlElement(name = "WANDSLLinkConfig")
	public WANDSLLinkConfig wanDSLLinkConfig;
	/**
	 * This object is provides access to an ATM-layer F5 OAM loopback test.
	 */
	@XmlElement(name = "WANATMF5LoopbackDiagnostics")
	public WANATMF5LoopbackDiagnostics wanATMF5LoopbackDiagnostics;
	/**
	 * This object models the PTM layer properties specific to a layer 2 interface of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance. 

The PTM Link Layer object exists when the ''WANDSLInterfaceConfig'' ''LinkEncapsulationSupported'' parameter includes any of:

* ''G.992.3_Annex_K_PTM''

* ''G.993.2_Annex_K_PTM''

* ''G.994.1''
	 */
	@XmlElement(name = "WANPTMLinkConfig")
	public WANPTMLinkConfig wanPTMLinkConfig;
	/**
	 * This object models the Ethernet link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 */
	@XmlElement(name = "WANEthernetLinkConfig")
	public WANEthernetLinkConfig wanEthernetLinkConfig;
	/**
	 * This object models the POTS link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with a POTS WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 */
	@XmlElement(name = "WANPOTSLinkConfig")
	public WANPOTSLinkConfig wanPOTSLinkConfig;
	/**
	 * This object enables configuration of IP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 */
	@XmlElementWrapper(name = "WANIPConnections")
	@XmlElement(name = "WANIPConnection")
	@CWMPParameter(access = "readWrite")
	public Collection<WANIPConnection> wanIPConnections;
	/**
	 * This object enables configuration of PPP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 */
	@XmlElementWrapper(name = "WANPPPConnections")
	@XmlElement(name = "WANPPPConnection")
	@CWMPParameter(access = "readWrite")
	public Collection<WANPPPConnection> wanPPPConnections;

	public WANConnectionDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public WANConnectionDevice withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this object models the ATM layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @return the value
	 */
	public WANDSLLinkConfig getWanDSLLinkConfig() {
		return wanDSLLinkConfig;
	}

	/**
	 * Set the this object models the ATM layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @param wanDSLLinkConfig the input value
	 */
	public void  setWanDSLLinkConfig(WANDSLLinkConfig wanDSLLinkConfig) {
		this.wanDSLLinkConfig = wanDSLLinkConfig;
	}

	/**
	 * Set the this object models the ATM layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @param wanDSLLinkConfig the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWanDSLLinkConfig(WANDSLLinkConfig wanDSLLinkConfig) {
		this.wanDSLLinkConfig = wanDSLLinkConfig;
		return this;
	}

	/**
	 * Get the this object is provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @return the value
	 */
	public WANATMF5LoopbackDiagnostics getWanATMF5LoopbackDiagnostics() {
		return wanATMF5LoopbackDiagnostics;
	}

	/**
	 * Set the this object is provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @param wanATMF5LoopbackDiagnostics the input value
	 */
	public void  setWanATMF5LoopbackDiagnostics(WANATMF5LoopbackDiagnostics wanATMF5LoopbackDiagnostics) {
		this.wanATMF5LoopbackDiagnostics = wanATMF5LoopbackDiagnostics;
	}

	/**
	 * Set the this object is provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @param wanATMF5LoopbackDiagnostics the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWanATMF5LoopbackDiagnostics(WANATMF5LoopbackDiagnostics wanATMF5LoopbackDiagnostics) {
		this.wanATMF5LoopbackDiagnostics = wanATMF5LoopbackDiagnostics;
		return this;
	}

	/**
	 * Get the this object models the PTM layer properties specific to a layer 2 interface of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance. 

The PTM Link Layer object exists when the ''WANDSLInterfaceConfig'' ''LinkEncapsulationSupported'' parameter includes any of:

* ''G.992.3_Annex_K_PTM''

* ''G.993.2_Annex_K_PTM''

* ''G.994.1''
	 *
	 * @return the value
	 */
	public WANPTMLinkConfig getWanPTMLinkConfig() {
		return wanPTMLinkConfig;
	}

	/**
	 * Set the this object models the PTM layer properties specific to a layer 2 interface of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance. 

The PTM Link Layer object exists when the ''WANDSLInterfaceConfig'' ''LinkEncapsulationSupported'' parameter includes any of:

* ''G.992.3_Annex_K_PTM''

* ''G.993.2_Annex_K_PTM''

* ''G.994.1''
	 *
	 * @param wanPTMLinkConfig the input value
	 */
	public void  setWanPTMLinkConfig(WANPTMLinkConfig wanPTMLinkConfig) {
		this.wanPTMLinkConfig = wanPTMLinkConfig;
	}

	/**
	 * Set the this object models the PTM layer properties specific to a layer 2 interface of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance. 

The PTM Link Layer object exists when the ''WANDSLInterfaceConfig'' ''LinkEncapsulationSupported'' parameter includes any of:

* ''G.992.3_Annex_K_PTM''

* ''G.993.2_Annex_K_PTM''

* ''G.994.1''
	 *
	 * @param wanPTMLinkConfig the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWanPTMLinkConfig(WANPTMLinkConfig wanPTMLinkConfig) {
		this.wanPTMLinkConfig = wanPTMLinkConfig;
		return this;
	}

	/**
	 * Get the this object models the Ethernet link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @return the value
	 */
	public WANEthernetLinkConfig getWanEthernetLinkConfig() {
		return wanEthernetLinkConfig;
	}

	/**
	 * Set the this object models the Ethernet link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @param wanEthernetLinkConfig the input value
	 */
	public void  setWanEthernetLinkConfig(WANEthernetLinkConfig wanEthernetLinkConfig) {
		this.wanEthernetLinkConfig = wanEthernetLinkConfig;
	}

	/**
	 * Set the this object models the Ethernet link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @param wanEthernetLinkConfig the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWanEthernetLinkConfig(WANEthernetLinkConfig wanEthernetLinkConfig) {
		this.wanEthernetLinkConfig = wanEthernetLinkConfig;
		return this;
	}

	/**
	 * Get the this object models the POTS link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with a POTS WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @return the value
	 */
	public WANPOTSLinkConfig getWanPOTSLinkConfig() {
		return wanPOTSLinkConfig;
	}

	/**
	 * Set the this object models the POTS link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with a POTS WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @param wanPOTSLinkConfig the input value
	 */
	public void  setWanPOTSLinkConfig(WANPOTSLinkConfig wanPOTSLinkConfig) {
		this.wanPOTSLinkConfig = wanPOTSLinkConfig;
	}

	/**
	 * Set the this object models the POTS link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with a POTS WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @param wanPOTSLinkConfig the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWanPOTSLinkConfig(WANPOTSLinkConfig wanPOTSLinkConfig) {
		this.wanPOTSLinkConfig = wanPOTSLinkConfig;
		return this;
	}

	/**
	 * Get the this object enables configuration of IP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @return the value
	 */
	public Collection<WANIPConnection> getWanIPConnections() {
		if (this.wanIPConnections == null){ this.wanIPConnections=new ArrayList<>();}
		return wanIPConnections;
	}

	/**
	 * Set the this object enables configuration of IP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param wanIPConnections the input value
	 */
	public void  setWanIPConnections(Collection<WANIPConnection> wanIPConnections) {
		this.wanIPConnections = wanIPConnections;
	}

	/**
	 * Set the this object enables configuration of IP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param wanIPConnection the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWANIPConnection(WANIPConnection wanIPConnection) {
		getWanIPConnections().add(wanIPConnection);
		return this;
	}

	/**
	 * Get the this object enables configuration of PPP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @return the value
	 */
	public Collection<WANPPPConnection> getWanPPPConnections() {
		if (this.wanPPPConnections == null){ this.wanPPPConnections=new ArrayList<>();}
		return wanPPPConnections;
	}

	/**
	 * Set the this object enables configuration of PPP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param wanPPPConnections the input value
	 */
	public void  setWanPPPConnections(Collection<WANPPPConnection> wanPPPConnections) {
		this.wanPPPConnections = wanPPPConnections;
	}

	/**
	 * Set the this object enables configuration of PPP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param wanPPPConnection the input value
	 * @return this instance
	 */
	public WANConnectionDevice withWANPPPConnection(WANPPPConnection wanPPPConnection) {
		getWanPPPConnections().add(wanPPPConnection);
		return this;
	}

	//</editor-fold>

}