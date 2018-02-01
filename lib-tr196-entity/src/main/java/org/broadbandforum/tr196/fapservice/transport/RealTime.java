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
package org.broadbandforum.tr196.fapservice.transport;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.transport.realtime.Perf;

	/**
	 * This object contains parameters relating to Real Time Transport using RTP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.RealTime.")
public class RealTime {

	/**
	 * Enable or disable RTCP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RTCPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean rtcPEnable;
	/**
	 * The number of sent RTP packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SentPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long sentPackets;
	/**
	 * The number of received RTP packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RcvPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rcvPackets;
	/**
	 * Total number of RTP payload bytes sent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesSent;
	/**
	 * Total number of RTP payload bytes received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesReceived;
	/**
	 * This object contains performances relating to Real Time Transport using RTP.
	 */
	@XmlElement(name = "Perf")
	public Perf perf;

	public RealTime() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRtcPEnable() {
		return rtcPEnable;
	}

	/**
	 * Set the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @param rtcPEnable the input value
	 */
	public void  setRtcPEnable(Boolean rtcPEnable) {
		this.rtcPEnable = rtcPEnable;
	}

	/**
	 * Set the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @param rtcPEnable the input value
	 * @return this instance
	 */
	public RealTime withRtcPEnable(Boolean rtcPEnable) {
		this.rtcPEnable = rtcPEnable;
		return this;
	}

	/**
	 * Get the number of sent RTP packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSentPackets() {
		return sentPackets;
	}

	/**
	 * Set the number of sent RTP packets.
	 *
	 * @since 2.0
	 * @param sentPackets the input value
	 */
	public void  setSentPackets(Long sentPackets) {
		this.sentPackets = sentPackets;
	}

	/**
	 * Set the number of sent RTP packets.
	 *
	 * @since 2.0
	 * @param sentPackets the input value
	 * @return this instance
	 */
	public RealTime withSentPackets(Long sentPackets) {
		this.sentPackets = sentPackets;
		return this;
	}

	/**
	 * Get the number of received RTP packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRcvPackets() {
		return rcvPackets;
	}

	/**
	 * Set the number of received RTP packets.
	 *
	 * @since 2.0
	 * @param rcvPackets the input value
	 */
	public void  setRcvPackets(Long rcvPackets) {
		this.rcvPackets = rcvPackets;
	}

	/**
	 * Set the number of received RTP packets.
	 *
	 * @since 2.0
	 * @param rcvPackets the input value
	 * @return this instance
	 */
	public RealTime withRcvPackets(Long rcvPackets) {
		this.rcvPackets = rcvPackets;
		return this;
	}

	/**
	 * Get the total number of RTP payload bytes sent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of RTP payload bytes sent.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of RTP payload bytes sent.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public RealTime withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of RTP payload bytes received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of RTP payload bytes received.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of RTP payload bytes received.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public RealTime withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the this object contains performances relating to Real Time Transport using RTP.
	 *
	 * @return the value
	 */
	public Perf getPerf() {
		return perf;
	}

	/**
	 * Set the this object contains performances relating to Real Time Transport using RTP.
	 *
	 * @param perf the input value
	 */
	public void  setPerf(Perf perf) {
		this.perf = perf;
	}

	/**
	 * Set the this object contains performances relating to Real Time Transport using RTP.
	 *
	 * @param perf the input value
	 * @return this instance
	 */
	public RealTime withPerf(Perf perf) {
		this.perf = perf;
		return this;
	}

	//</editor-fold>

}