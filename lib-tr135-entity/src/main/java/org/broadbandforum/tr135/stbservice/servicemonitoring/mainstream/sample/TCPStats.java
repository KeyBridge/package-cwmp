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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * TCP sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since TR135 v1.1
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.TCPStats.")
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.Sample.TCPStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.TCPStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class TCPStats {

	/**
	 * Each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the total number of TCP packets received for this AV stream during the sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;
	/**
	 * Each entry is the total number of TCP packets being retransmitted this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PacketsRetransmitted")
	public Long packetsRetransmitted;
	/**
	 * Each entry is the total number of bytes received for  this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "BytesReceived")
	public Long bytesReceived;

	public TCPStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* TCP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public TCPStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the total number of TCP packets received for this AV stream during the sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the each entry is the total number of TCP packets received for this AV stream during the sample interval.
	 *
	 * @since 1.1
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the each entry is the total number of TCP packets received for this AV stream during the sample interval.
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
	 * Get the each entry is the total number of TCP packets being retransmitted this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPacketsRetransmitted() {
		return packetsRetransmitted;
	}

	/**
	 * Set the each entry is the total number of TCP packets being retransmitted this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 * @param packetsRetransmitted the input value
	 */
	public void  setPacketsRetransmitted(Long packetsRetransmitted) {
		this.packetsRetransmitted = packetsRetransmitted;
	}

	/**
	 * Set the each entry is the total number of TCP packets being retransmitted this AV stream.during the sample interval.
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
	 * Get the each entry is the total number of bytes received for  this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the each entry is the total number of bytes received for  this AV stream.during the sample interval.
	 *
	 * @since 1.1
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the each entry is the total number of bytes received for  this AV stream.during the sample interval.
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