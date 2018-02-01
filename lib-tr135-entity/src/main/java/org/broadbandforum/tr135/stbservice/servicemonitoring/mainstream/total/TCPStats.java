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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Total TCP statistics for this ServiceMonitoring main stream instance.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.TCPStats.")
public class TCPStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * Total number of TCP packets correctly received for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceived;
	/**
	 * Total number of TCP packets being retransmitted for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PacketsRetransmitted")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsRetransmitted;
	/**
	 * Total number of bytes received for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesReceived;

	public TCPStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getTotalSeconds() {
		return totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 */
	public void  setTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public TCPStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the total number of TCP packets correctly received for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of TCP packets correctly received for this AV stream.
	 *
	 * @since 1.1
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of TCP packets correctly received for this AV stream.
	 *
	 * @since 1.1
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public TCPStats withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of TCP packets being retransmitted for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPacketsRetransmitted() {
		return packetsRetransmitted;
	}

	/**
	 * Set the total number of TCP packets being retransmitted for this AV stream.
	 *
	 * @since 1.1
	 * @param packetsRetransmitted the input value
	 */
	public void  setPacketsRetransmitted(Long packetsRetransmitted) {
		this.packetsRetransmitted = packetsRetransmitted;
	}

	/**
	 * Set the total number of TCP packets being retransmitted for this AV stream.
	 *
	 * @since 1.1
	 * @param packetsRetransmitted the input value
	 * @return this instance
	 */
	public TCPStats withPacketsRetransmitted(Long packetsRetransmitted) {
		this.packetsRetransmitted = packetsRetransmitted;
		return this;
	}

	/**
	 * Get the total number of bytes received for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received for this AV stream.
	 *
	 * @since 1.1
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received for this AV stream.
	 *
	 * @since 1.1
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public TCPStats withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	//</editor-fold>

}