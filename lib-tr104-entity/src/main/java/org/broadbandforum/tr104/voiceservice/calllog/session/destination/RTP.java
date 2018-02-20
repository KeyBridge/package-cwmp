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
package org.broadbandforum.tr104.voiceservice.calllog.session.destination;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.common.StatsCounter32;
import org.broadbandforum.common.StatsCounter64;

	/**
	 * The RTP part of the destination session information.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.Destination.RTP.")
@XmlRootElement(name = "VoiceService.CallLog.Session.Destination.RTP")
@XmlType(name = "VoiceService.CallLog.Session.Destination.RTP")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTP {

	/**
	 * The IP address of far end VoIP device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FarEndIPAddress")
	public IPAddress farEndIPAddress;
	/**
	 * The UDP port used for current session in the far end device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FarEndUDPPort")
	@Size(min = 0, max = 65535)
	public Long farEndUDPPort;
	/**
	 * The local UDP port used for current session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalUDPPort")
	@Size(min = 0, max = 65535)
	public Long localUDPPort;
	/**
	 * The minimum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinJitter")
	@Size(min = -1)
	public Integer minJitter;
	/**
	 * The maximum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxJitter")
	@Size(min = -1)
	public Integer maxJitter;
	/**
	 * The mean relative transit time in milliseconds between each two packet series as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeanJitter")
	@Size(min = -1)
	public Integer meanJitter;
	/**
	 * 1-Point Packet Delay Variation according to {{bibref|Y.1540}} in milliseconds.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketDelayVariation")
	@Size(min = -1)
	public Integer packetDelayVariation;
	/**
	 * Average delay in microseconds added by buffer processing.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BufferDelay")
	@Size(min = -1)
	public Integer bufferDelay;
	/**
	 * The number of bursts (as defined in {{bibref|RFC3611}}) that occur during this session (during one burst several packets MAY be lost).

The burst's threshold is configured with the parameter {{param|.VoIPProfile.{i}.RTP.Gmin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BurstCount")
	public StatsCounter32 burstCount;
	/**
	 * Total number of RTP packets received for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * Total number of RTP packets sent for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * Total number of RTP packets that have been lost for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsLost")
	public StatsCounter32 packetsLost;
	/**
	 * Total number of RTP packets that have been discarded for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsDiscarded")
	public StatsCounter32 packetsDiscarded;
	/**
	 * Total number of bytes received for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * Total number of bytes sent for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * Current receive packet loss rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivePacketLossRate")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 100)
	public Long receivePacketLossRate;
	/**
	 * Current far end receive packet lost rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FarEndPacketLossRate")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 100)
	public Long farEndPacketLossRate;
	/**
	 * Current receive interarrival jitter in timestamp units. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceiveInterarrivalJitter")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -1)
	public Integer receiveInterarrivalJitter;
	/**
	 * Current Interarrival jitter in timestamp units as reported from the far-end device via RTCP. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FarEndInterarrivalJitter")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -1)
	public Integer farEndInterarrivalJitter;
	/**
	 * Average receive interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageReceiveInterarrivalJitter")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -1)
	public Integer averageReceiveInterarrivalJitter;
	/**
	 * Average far-end interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageFarEndInterarrivalJitter")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -1)
	public Integer averageFarEndInterarrivalJitter;
	/**
	 * Current round trip delay in microseconds calculated as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RoundTripDelay")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	@Size(min = -1)
	public Integer roundTripDelay;
	/**
	 * Average round trip delay in microseconds since the beginning of the current session.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageRoundTripDelay")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	@Size(min = -1)
	public Integer averageRoundTripDelay;
	/**
	 * Sample frequency in Hertz used by the codec for this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SamplingFrequency")
	@CWMPParameter(activeNotify = "canDeny", units = "Hertz")
	public Long samplingFrequency;

	public RTP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the IP address of far end VoIP device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getFarEndIPAddress() {
		return farEndIPAddress;
	}

	/**
	 * Set the IP address of far end VoIP device.
	 *
	 * @since 2.0
	 * @param farEndIPAddress the input value
	 */
	public void  setFarEndIPAddress(IPAddress farEndIPAddress) {
		this.farEndIPAddress = farEndIPAddress;
	}

	/**
	 * Set the IP address of far end VoIP device.
	 *
	 * @since 2.0
	 * @param farEndIPAddress the input value
	 * @return this instance
	 */
	public RTP withFarEndIPAddress(IPAddress farEndIPAddress) {
		this.farEndIPAddress = farEndIPAddress;
		return this;
	}

	/**
	 * Get the UDP port used for current session in the far end device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFarEndUDPPort() {
		return farEndUDPPort;
	}

	/**
	 * Set the UDP port used for current session in the far end device.
	 *
	 * @since 2.0
	 * @param farEndUDPPort the input value
	 */
	public void  setFarEndUDPPort(Long farEndUDPPort) {
		this.farEndUDPPort = farEndUDPPort;
	}

	/**
	 * Set the UDP port used for current session in the far end device.
	 *
	 * @since 2.0
	 * @param farEndUDPPort the input value
	 * @return this instance
	 */
	public RTP withFarEndUDPPort(Long farEndUDPPort) {
		this.farEndUDPPort = farEndUDPPort;
		return this;
	}

	/**
	 * Get the local UDP port used for current session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalUDPPort() {
		return localUDPPort;
	}

	/**
	 * Set the local UDP port used for current session.
	 *
	 * @since 2.0
	 * @param localUDPPort the input value
	 */
	public void  setLocalUDPPort(Long localUDPPort) {
		this.localUDPPort = localUDPPort;
	}

	/**
	 * Set the local UDP port used for current session.
	 *
	 * @since 2.0
	 * @param localUDPPort the input value
	 * @return this instance
	 */
	public RTP withLocalUDPPort(Long localUDPPort) {
		this.localUDPPort = localUDPPort;
		return this;
	}

	/**
	 * Get the minimum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMinJitter() {
		return minJitter;
	}

	/**
	 * Set the minimum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param minJitter the input value
	 */
	public void  setMinJitter(Integer minJitter) {
		this.minJitter = minJitter;
	}

	/**
	 * Set the minimum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param minJitter the input value
	 * @return this instance
	 */
	public RTP withMinJitter(Integer minJitter) {
		this.minJitter = minJitter;
		return this;
	}

	/**
	 * Get the maximum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxJitter() {
		return maxJitter;
	}

	/**
	 * Set the maximum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param maxJitter the input value
	 */
	public void  setMaxJitter(Integer maxJitter) {
		this.maxJitter = maxJitter;
	}

	/**
	 * Set the maximum relative transit time in milliseconds between two packets as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param maxJitter the input value
	 * @return this instance
	 */
	public RTP withMaxJitter(Integer maxJitter) {
		this.maxJitter = maxJitter;
		return this;
	}

	/**
	 * Get the mean relative transit time in milliseconds between each two packet series as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMeanJitter() {
		return meanJitter;
	}

	/**
	 * Set the mean relative transit time in milliseconds between each two packet series as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param meanJitter the input value
	 */
	public void  setMeanJitter(Integer meanJitter) {
		this.meanJitter = meanJitter;
	}

	/**
	 * Set the mean relative transit time in milliseconds between each two packet series as defined in {{bibref|RFC3611}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param meanJitter the input value
	 * @return this instance
	 */
	public RTP withMeanJitter(Integer meanJitter) {
		this.meanJitter = meanJitter;
		return this;
	}

	/**
	 * Get the 1-point Packet Delay Variation according to {{bibref|Y.1540}} in milliseconds.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPacketDelayVariation() {
		return packetDelayVariation;
	}

	/**
	 * Set the 1-point Packet Delay Variation according to {{bibref|Y.1540}} in milliseconds.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param packetDelayVariation the input value
	 */
	public void  setPacketDelayVariation(Integer packetDelayVariation) {
		this.packetDelayVariation = packetDelayVariation;
	}

	/**
	 * Set the 1-point Packet Delay Variation according to {{bibref|Y.1540}} in milliseconds.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param packetDelayVariation the input value
	 * @return this instance
	 */
	public RTP withPacketDelayVariation(Integer packetDelayVariation) {
		this.packetDelayVariation = packetDelayVariation;
		return this;
	}

	/**
	 * Get average delay in microseconds added by buffer processing.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBufferDelay() {
		return bufferDelay;
	}

	/**
	 * Set average delay in microseconds added by buffer processing.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param bufferDelay the input value
	 */
	public void  setBufferDelay(Integer bufferDelay) {
		this.bufferDelay = bufferDelay;
	}

	/**
	 * Set average delay in microseconds added by buffer processing.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param bufferDelay the input value
	 * @return this instance
	 */
	public RTP withBufferDelay(Integer bufferDelay) {
		this.bufferDelay = bufferDelay;
		return this;
	}

	/**
	 * Get the number of bursts (as defined in {{bibref|RFC3611}}) that occur during this session (during one burst several packets MAY be lost).

The burst's threshold is configured with the parameter {{param|.VoIPProfile.{i}.RTP.Gmin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter32 getBurstCount() {
		return burstCount;
	}

	/**
	 * Set the number of bursts (as defined in {{bibref|RFC3611}}) that occur during this session (during one burst several packets MAY be lost).

The burst's threshold is configured with the parameter {{param|.VoIPProfile.{i}.RTP.Gmin}}.
	 *
	 * @since 2.0
	 * @param burstCount the input value
	 */
	public void  setBurstCount(StatsCounter32 burstCount) {
		this.burstCount = burstCount;
	}

	/**
	 * Set the number of bursts (as defined in {{bibref|RFC3611}}) that occur during this session (during one burst several packets MAY be lost).

The burst's threshold is configured with the parameter {{param|.VoIPProfile.{i}.RTP.Gmin}}.
	 *
	 * @since 2.0
	 * @param burstCount the input value
	 * @return this instance
	 */
	public RTP withBurstCount(StatsCounter32 burstCount) {
		this.burstCount = burstCount;
		return this;
	}

	/**
	 * Get the total number of RTP packets received for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of RTP packets received for this session.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of RTP packets received for this session.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public RTP withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of RTP packets sent for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of RTP packets sent for this session.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of RTP packets sent for this session.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public RTP withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of RTP packets that have been lost for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter32 getPacketsLost() {
		return packetsLost;
	}

	/**
	 * Set the total number of RTP packets that have been lost for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @param packetsLost the input value
	 */
	public void  setPacketsLost(StatsCounter32 packetsLost) {
		this.packetsLost = packetsLost;
	}

	/**
	 * Set the total number of RTP packets that have been lost for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @param packetsLost the input value
	 * @return this instance
	 */
	public RTP withPacketsLost(StatsCounter32 packetsLost) {
		this.packetsLost = packetsLost;
		return this;
	}

	/**
	 * Get the total number of RTP packets that have been discarded for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter32 getPacketsDiscarded() {
		return packetsDiscarded;
	}

	/**
	 * Set the total number of RTP packets that have been discarded for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @param packetsDiscarded the input value
	 */
	public void  setPacketsDiscarded(StatsCounter32 packetsDiscarded) {
		this.packetsDiscarded = packetsDiscarded;
	}

	/**
	 * Set the total number of RTP packets that have been discarded for this session (see {{bibref|RFC3611}}).
	 *
	 * @since 2.0
	 * @param packetsDiscarded the input value
	 * @return this instance
	 */
	public RTP withPacketsDiscarded(StatsCounter32 packetsDiscarded) {
		this.packetsDiscarded = packetsDiscarded;
		return this;
	}

	/**
	 * Get the total number of bytes received for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received for this session.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received for this session.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public RTP withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes sent for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes sent for this session.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes sent for this session.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public RTP withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the current receive packet loss rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivePacketLossRate() {
		return receivePacketLossRate;
	}

	/**
	 * Set the current receive packet loss rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @param receivePacketLossRate the input value
	 */
	public void  setReceivePacketLossRate(Long receivePacketLossRate) {
		this.receivePacketLossRate = receivePacketLossRate;
	}

	/**
	 * Set the current receive packet loss rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @param receivePacketLossRate the input value
	 * @return this instance
	 */
	public RTP withReceivePacketLossRate(Long receivePacketLossRate) {
		this.receivePacketLossRate = receivePacketLossRate;
		return this;
	}

	/**
	 * Get the current far end receive packet lost rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFarEndPacketLossRate() {
		return farEndPacketLossRate;
	}

	/**
	 * Set the current far end receive packet lost rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @param farEndPacketLossRate the input value
	 */
	public void  setFarEndPacketLossRate(Long farEndPacketLossRate) {
		this.farEndPacketLossRate = farEndPacketLossRate;
	}

	/**
	 * Set the current far end receive packet lost rate in percent, calculated as defined in {{bibref|RFC3550|Section 6.4}}.
	 *
	 * @since 2.0
	 * @param farEndPacketLossRate the input value
	 * @return this instance
	 */
	public RTP withFarEndPacketLossRate(Long farEndPacketLossRate) {
		this.farEndPacketLossRate = farEndPacketLossRate;
		return this;
	}

	/**
	 * Get the current receive interarrival jitter in timestamp units. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getReceiveInterarrivalJitter() {
		return receiveInterarrivalJitter;
	}

	/**
	 * Set the current receive interarrival jitter in timestamp units. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param receiveInterarrivalJitter the input value
	 */
	public void  setReceiveInterarrivalJitter(Integer receiveInterarrivalJitter) {
		this.receiveInterarrivalJitter = receiveInterarrivalJitter;
	}

	/**
	 * Set the current receive interarrival jitter in timestamp units. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param receiveInterarrivalJitter the input value
	 * @return this instance
	 */
	public RTP withReceiveInterarrivalJitter(Integer receiveInterarrivalJitter) {
		this.receiveInterarrivalJitter = receiveInterarrivalJitter;
		return this;
	}

	/**
	 * Get the current Interarrival jitter in timestamp units as reported from the far-end device via RTCP. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFarEndInterarrivalJitter() {
		return farEndInterarrivalJitter;
	}

	/**
	 * Set the current Interarrival jitter in timestamp units as reported from the far-end device via RTCP. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param farEndInterarrivalJitter the input value
	 */
	public void  setFarEndInterarrivalJitter(Integer farEndInterarrivalJitter) {
		this.farEndInterarrivalJitter = farEndInterarrivalJitter;
	}

	/**
	 * Set the current Interarrival jitter in timestamp units as reported from the far-end device via RTCP. Calculated from J(i) as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param farEndInterarrivalJitter the input value
	 * @return this instance
	 */
	public RTP withFarEndInterarrivalJitter(Integer farEndInterarrivalJitter) {
		this.farEndInterarrivalJitter = farEndInterarrivalJitter;
		return this;
	}

	/**
	 * Get average receive interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getAverageReceiveInterarrivalJitter() {
		return averageReceiveInterarrivalJitter;
	}

	/**
	 * Set average receive interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageReceiveInterarrivalJitter the input value
	 */
	public void  setAverageReceiveInterarrivalJitter(Integer averageReceiveInterarrivalJitter) {
		this.averageReceiveInterarrivalJitter = averageReceiveInterarrivalJitter;
	}

	/**
	 * Set average receive interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageReceiveInterarrivalJitter the input value
	 * @return this instance
	 */
	public RTP withAverageReceiveInterarrivalJitter(Integer averageReceiveInterarrivalJitter) {
		this.averageReceiveInterarrivalJitter = averageReceiveInterarrivalJitter;
		return this;
	}

	/**
	 * Get average far-end interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getAverageFarEndInterarrivalJitter() {
		return averageFarEndInterarrivalJitter;
	}

	/**
	 * Set average far-end interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageFarEndInterarrivalJitter the input value
	 */
	public void  setAverageFarEndInterarrivalJitter(Integer averageFarEndInterarrivalJitter) {
		this.averageFarEndInterarrivalJitter = averageFarEndInterarrivalJitter;
	}

	/**
	 * Set average far-end interarrival jitter in timestamp units since the beginning of the current call. Calculated as the average of the interarrival jitter values reported by the far-end.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageFarEndInterarrivalJitter the input value
	 * @return this instance
	 */
	public RTP withAverageFarEndInterarrivalJitter(Integer averageFarEndInterarrivalJitter) {
		this.averageFarEndInterarrivalJitter = averageFarEndInterarrivalJitter;
		return this;
	}

	/**
	 * Get the current round trip delay in microseconds calculated as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRoundTripDelay() {
		return roundTripDelay;
	}

	/**
	 * Set the current round trip delay in microseconds calculated as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param roundTripDelay the input value
	 */
	public void  setRoundTripDelay(Integer roundTripDelay) {
		this.roundTripDelay = roundTripDelay;
	}

	/**
	 * Set the current round trip delay in microseconds calculated as defined in {{bibref|RFC3550|Section 6.4}}.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param roundTripDelay the input value
	 * @return this instance
	 */
	public RTP withRoundTripDelay(Integer roundTripDelay) {
		this.roundTripDelay = roundTripDelay;
		return this;
	}

	/**
	 * Get average round trip delay in microseconds since the beginning of the current session.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getAverageRoundTripDelay() {
		return averageRoundTripDelay;
	}

	/**
	 * Set average round trip delay in microseconds since the beginning of the current session.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageRoundTripDelay the input value
	 */
	public void  setAverageRoundTripDelay(Integer averageRoundTripDelay) {
		this.averageRoundTripDelay = averageRoundTripDelay;
	}

	/**
	 * Set average round trip delay in microseconds since the beginning of the current session.

A value of -1 indicates no reliable value is available.
	 *
	 * @since 2.0
	 * @param averageRoundTripDelay the input value
	 * @return this instance
	 */
	public RTP withAverageRoundTripDelay(Integer averageRoundTripDelay) {
		this.averageRoundTripDelay = averageRoundTripDelay;
		return this;
	}

	/**
	 * Get the sample frequency in Hertz used by the codec for this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSamplingFrequency() {
		return samplingFrequency;
	}

	/**
	 * Set the sample frequency in Hertz used by the codec for this session.
	 *
	 * @since 2.0
	 * @param samplingFrequency the input value
	 */
	public void  setSamplingFrequency(Long samplingFrequency) {
		this.samplingFrequency = samplingFrequency;
	}

	/**
	 * Set the sample frequency in Hertz used by the codec for this session.
	 *
	 * @since 2.0
	 * @param samplingFrequency the input value
	 * @return this instance
	 */
	public RTP withSamplingFrequency(Long samplingFrequency) {
		this.samplingFrequency = samplingFrequency;
		return this;
	}

	//</editor-fold>

}