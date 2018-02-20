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
package org.broadbandforum.tr135.stbservice.components.frontend;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.Dejittering;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.FEC;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.ForceMonitor;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.IGMP;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.Inbound;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.Outbound;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.RTCP;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.RTPAVPF;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.ServiceConnect;

	/**
	 * IP front-end details. This object will normally be present if and only if the front-end is an IP front-end.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP")
@XmlType(name = "STBService.Components.FrontEnd.IP")
@XmlAccessorType(XmlAccessType.FIELD)
public class IP {

	/**
	 * Number of {{object|Inbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveInboundIPStreams")
	public Long activeInboundIPStreams;
	/**
	 * Number of {{object|Outbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveOutboundIPStreams")
	public Long activeOutboundIPStreams;
	/**
	 * Parameters related to RTCP receiver report generation as defined in {{bibref|RFC3550}}.
	 */
	@XmlElement(name = "RTCP")
	public RTCP rtcP;
	/**
	 * Parameters related to RTP AVPF configuration as defined in {{bibref|RFC4585}} and {{bibref|RFC4588}}.
	 */
	@XmlElement(name = "RTPAVPF")
	public RTPAVPF rtpAVPF;
	/**
	 * Parameters related to AL-FEC configuration as defined in {{bibref|SMPTE20022-1}}.
	 */
	@XmlElement(name = "FEC")
	public FEC fec;
	/**
	 * Parameters that are specific to IGMP clients when changing channels.
	 */
	@XmlElement(name = "IGMP")
	public IGMP igmP;
	/**
	 * Parameters related to the de-jittering buffer configuration for all inbound IP streams.
	 */
	@XmlElement(name = "Dejittering")
	public Dejittering dejittering;
	/**
	 * Inbound IP streams currently entering the STB via this front-end.
	 */
	@XmlElementWrapper(name = "Inbounds")
	@XmlElement(name = "Inbound")
	public Collection<Inbound> inbounds;
	/**
	 * Parameters related to an outbound IP stream.
	 */
	@XmlElementWrapper(name = "Outbounds")
	@XmlElement(name = "Outbound")
	public Collection<Outbound> outbounds;
	/**
	 * Parameters used to force connection to a dedicated IP stream for test purposes.
	 */
	@XmlElement(name = "ServiceConnect")
	public ServiceConnect serviceConnect;
	/**
	 * Parameters used to describe the force monitoring operation.

When running in the force monitoring mode, the STB MUST automatically connect to a test URI  defined by the {{param|URI}} parameter whenever it detects that the IP tuner is not not receiving any data from the WAN.

When running in normal mode, the STB does not perform any action when it does not receive any data from the IP tuner coming from the WAN.

The force monitor mode allows to maintain an active stream coming from the network so as to keep collecting statistics.
	 */
	@XmlElement(name = "ForceMonitor")
	public ForceMonitor forceMonitor;

	public IP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of {{object|Inbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getActiveInboundIPStreams() {
		return activeInboundIPStreams;
	}

	/**
	 * Set the number of {{object|Inbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeInboundIPStreams the input value
	 */
	public void  setActiveInboundIPStreams(Long activeInboundIPStreams) {
		this.activeInboundIPStreams = activeInboundIPStreams;
	}

	/**
	 * Set the number of {{object|Inbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeInboundIPStreams the input value
	 * @return this instance
	 */
	public IP withActiveInboundIPStreams(Long activeInboundIPStreams) {
		this.activeInboundIPStreams = activeInboundIPStreams;
		return this;
	}

	/**
	 * Get the number of {{object|Outbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getActiveOutboundIPStreams() {
		return activeOutboundIPStreams;
	}

	/**
	 * Set the number of {{object|Outbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeOutboundIPStreams the input value
	 */
	public void  setActiveOutboundIPStreams(Long activeOutboundIPStreams) {
		this.activeOutboundIPStreams = activeOutboundIPStreams;
	}

	/**
	 * Set the number of {{object|Outbound}} AV streams currently active (i.e. with ''Status'' != ''Disabled'', which means audio or AV data are being processed).
	 *
	 * @since 1.0
	 * @param activeOutboundIPStreams the input value
	 * @return this instance
	 */
	public IP withActiveOutboundIPStreams(Long activeOutboundIPStreams) {
		this.activeOutboundIPStreams = activeOutboundIPStreams;
		return this;
	}

	/**
	 * Get the parameters related to RTCP receiver report generation as defined in {{bibref|RFC3550}}.
	 *
	 * @return the value
	 */
	public RTCP getRtcP() {
		return rtcP;
	}

	/**
	 * Set the parameters related to RTCP receiver report generation as defined in {{bibref|RFC3550}}.
	 *
	 * @param rtcP the input value
	 */
	public void  setRtcP(RTCP rtcP) {
		this.rtcP = rtcP;
	}

	/**
	 * Set the parameters related to RTCP receiver report generation as defined in {{bibref|RFC3550}}.
	 *
	 * @param rtcP the input value
	 * @return this instance
	 */
	public IP withRtcP(RTCP rtcP) {
		this.rtcP = rtcP;
		return this;
	}

	/**
	 * Get the parameters related to RTP AVPF configuration as defined in {{bibref|RFC4585}} and {{bibref|RFC4588}}.
	 *
	 * @return the value
	 */
	public RTPAVPF getRtpAVPF() {
		return rtpAVPF;
	}

	/**
	 * Set the parameters related to RTP AVPF configuration as defined in {{bibref|RFC4585}} and {{bibref|RFC4588}}.
	 *
	 * @param rtpAVPF the input value
	 */
	public void  setRtpAVPF(RTPAVPF rtpAVPF) {
		this.rtpAVPF = rtpAVPF;
	}

	/**
	 * Set the parameters related to RTP AVPF configuration as defined in {{bibref|RFC4585}} and {{bibref|RFC4588}}.
	 *
	 * @param rtpAVPF the input value
	 * @return this instance
	 */
	public IP withRtpAVPF(RTPAVPF rtpAVPF) {
		this.rtpAVPF = rtpAVPF;
		return this;
	}

	/**
	 * Get the parameters related to AL-FEC configuration as defined in {{bibref|SMPTE20022-1}}.
	 *
	 * @return the value
	 */
	public FEC getFec() {
		return fec;
	}

	/**
	 * Set the parameters related to AL-FEC configuration as defined in {{bibref|SMPTE20022-1}}.
	 *
	 * @param fec the input value
	 */
	public void  setFec(FEC fec) {
		this.fec = fec;
	}

	/**
	 * Set the parameters related to AL-FEC configuration as defined in {{bibref|SMPTE20022-1}}.
	 *
	 * @param fec the input value
	 * @return this instance
	 */
	public IP withFec(FEC fec) {
		this.fec = fec;
		return this;
	}

	/**
	 * Get the parameters that are specific to IGMP clients when changing channels.
	 *
	 * @return the value
	 */
	public IGMP getIgmP() {
		return igmP;
	}

	/**
	 * Set the parameters that are specific to IGMP clients when changing channels.
	 *
	 * @param igmP the input value
	 */
	public void  setIgmP(IGMP igmP) {
		this.igmP = igmP;
	}

	/**
	 * Set the parameters that are specific to IGMP clients when changing channels.
	 *
	 * @param igmP the input value
	 * @return this instance
	 */
	public IP withIgmP(IGMP igmP) {
		this.igmP = igmP;
		return this;
	}

	/**
	 * Get the parameters related to the de-jittering buffer configuration for all inbound IP streams.
	 *
	 * @return the value
	 */
	public Dejittering getDejittering() {
		return dejittering;
	}

	/**
	 * Set the parameters related to the de-jittering buffer configuration for all inbound IP streams.
	 *
	 * @param dejittering the input value
	 */
	public void  setDejittering(Dejittering dejittering) {
		this.dejittering = dejittering;
	}

	/**
	 * Set the parameters related to the de-jittering buffer configuration for all inbound IP streams.
	 *
	 * @param dejittering the input value
	 * @return this instance
	 */
	public IP withDejittering(Dejittering dejittering) {
		this.dejittering = dejittering;
		return this;
	}

	/**
	 * Get the inbound IP streams currently entering the STB via this front-end.
	 *
	 * @return the value
	 */
	public Collection<Inbound> getInbounds() {
		if (this.inbounds == null){ this.inbounds=new ArrayList<>();}
		return inbounds;
	}

	/**
	 * Set the inbound IP streams currently entering the STB via this front-end.
	 *
	 * @param inbounds the input value
	 */
	public void  setInbounds(Collection<Inbound> inbounds) {
		this.inbounds = inbounds;
	}

	/**
	 * Set the inbound IP streams currently entering the STB via this front-end.
	 *
	 * @param inbound the input value
	 * @return this instance
	 */
	public IP withInbound(Inbound inbound) {
		getInbounds().add(inbound);
		return this;
	}

	/**
	 * Get the parameters related to an outbound IP stream.
	 *
	 * @return the value
	 */
	public Collection<Outbound> getOutbounds() {
		if (this.outbounds == null){ this.outbounds=new ArrayList<>();}
		return outbounds;
	}

	/**
	 * Set the parameters related to an outbound IP stream.
	 *
	 * @param outbounds the input value
	 */
	public void  setOutbounds(Collection<Outbound> outbounds) {
		this.outbounds = outbounds;
	}

	/**
	 * Set the parameters related to an outbound IP stream.
	 *
	 * @param outbound the input value
	 * @return this instance
	 */
	public IP withOutbound(Outbound outbound) {
		getOutbounds().add(outbound);
		return this;
	}

	/**
	 * Get the parameters used to force connection to a dedicated IP stream for test purposes.
	 *
	 * @return the value
	 */
	public ServiceConnect getServiceConnect() {
		return serviceConnect;
	}

	/**
	 * Set the parameters used to force connection to a dedicated IP stream for test purposes.
	 *
	 * @param serviceConnect the input value
	 */
	public void  setServiceConnect(ServiceConnect serviceConnect) {
		this.serviceConnect = serviceConnect;
	}

	/**
	 * Set the parameters used to force connection to a dedicated IP stream for test purposes.
	 *
	 * @param serviceConnect the input value
	 * @return this instance
	 */
	public IP withServiceConnect(ServiceConnect serviceConnect) {
		this.serviceConnect = serviceConnect;
		return this;
	}

	/**
	 * Get the parameters used to describe the force monitoring operation.

When running in the force monitoring mode, the STB MUST automatically connect to a test URI  defined by the {{param|URI}} parameter whenever it detects that the IP tuner is not not receiving any data from the WAN.

When running in normal mode, the STB does not perform any action when it does not receive any data from the IP tuner coming from the WAN.

The force monitor mode allows to maintain an active stream coming from the network so as to keep collecting statistics.
	 *
	 * @return the value
	 */
	public ForceMonitor getForceMonitor() {
		return forceMonitor;
	}

	/**
	 * Set the parameters used to describe the force monitoring operation.

When running in the force monitoring mode, the STB MUST automatically connect to a test URI  defined by the {{param|URI}} parameter whenever it detects that the IP tuner is not not receiving any data from the WAN.

When running in normal mode, the STB does not perform any action when it does not receive any data from the IP tuner coming from the WAN.

The force monitor mode allows to maintain an active stream coming from the network so as to keep collecting statistics.
	 *
	 * @param forceMonitor the input value
	 */
	public void  setForceMonitor(ForceMonitor forceMonitor) {
		this.forceMonitor = forceMonitor;
	}

	/**
	 * Set the parameters used to describe the force monitoring operation.

When running in the force monitoring mode, the STB MUST automatically connect to a test URI  defined by the {{param|URI}} parameter whenever it detects that the IP tuner is not not receiving any data from the WAN.

When running in normal mode, the STB does not perform any action when it does not receive any data from the IP tuner coming from the WAN.

The force monitor mode allows to maintain an active stream coming from the network so as to keep collecting statistics.
	 *
	 * @param forceMonitor the input value
	 * @return this instance
	 */
	public IP withForceMonitor(ForceMonitor forceMonitor) {
		this.forceMonitor = forceMonitor;
		return this;
	}

	//</editor-fold>

}