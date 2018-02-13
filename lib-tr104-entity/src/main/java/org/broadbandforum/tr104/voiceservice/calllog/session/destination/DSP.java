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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.calllog.session.destination.dsp.ReceiveCodec;
import org.broadbandforum.tr104.voiceservice.calllog.session.destination.dsp.TransmitCodec;

	/**
	 * The DSP part of the destination session information.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.Destination.DSP.")
@XmlRootElement(name = "VoiceService.CallLog.Session.Destination.DSP")
@XmlType(name = "VoiceService.CallLog.Session.Destination.DSP")
@XmlAccessorType(XmlAccessType.FIELD)
public class DSP {

	/**
	 * The receive codec used in this session.
	 */
	@XmlElement(name = "ReceiveCodec")
	public ReceiveCodec receiveCodec;
	/**
	 * The transmit codec used in this session.
	 */
	@XmlElement(name = "TransmitCodec")
	public TransmitCodec transmitCodec;

	public DSP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the receive codec used in this session.
	 *
	 * @return the value
	 */
	public ReceiveCodec getReceiveCodec() {
		return receiveCodec;
	}

	/**
	 * Set the receive codec used in this session.
	 *
	 * @param receiveCodec the input value
	 */
	public void  setReceiveCodec(ReceiveCodec receiveCodec) {
		this.receiveCodec = receiveCodec;
	}

	/**
	 * Set the receive codec used in this session.
	 *
	 * @param receiveCodec the input value
	 * @return this instance
	 */
	public DSP withReceiveCodec(ReceiveCodec receiveCodec) {
		this.receiveCodec = receiveCodec;
		return this;
	}

	/**
	 * Get the transmit codec used in this session.
	 *
	 * @return the value
	 */
	public TransmitCodec getTransmitCodec() {
		return transmitCodec;
	}

	/**
	 * Set the transmit codec used in this session.
	 *
	 * @param transmitCodec the input value
	 */
	public void  setTransmitCodec(TransmitCodec transmitCodec) {
		this.transmitCodec = transmitCodec;
	}

	/**
	 * Set the transmit codec used in this session.
	 *
	 * @param transmitCodec the input value
	 * @return this instance
	 */
	public DSP withTransmitCodec(TransmitCodec transmitCodec) {
		this.transmitCodec = transmitCodec;
		return this;
	}

	//</editor-fold>

}