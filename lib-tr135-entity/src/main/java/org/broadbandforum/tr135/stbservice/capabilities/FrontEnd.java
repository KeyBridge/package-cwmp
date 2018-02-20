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
package org.broadbandforum.tr135.stbservice.capabilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.capabilities.frontend.DVBT;
import org.broadbandforum.tr135.stbservice.capabilities.frontend.IP;

	/**
	 * Front-end capabilities.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.FrontEnd.")
@XmlRootElement(name = "STBService.Capabilities.FrontEnd")
@XmlType(name = "STBService.Capabilities.FrontEnd")
@XmlAccessorType(XmlAccessType.FIELD)
public class FrontEnd {

	/**
	 * Capabilities of the DVB-T receiver.
	 */
	@XmlElement(name = "DVBT")
	public DVBT dvbT;
	/**
	 * IP front-end capabilities.
	 */
	@XmlElement(name = "IP")
	public IP ip;

	public FrontEnd() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the capabilities of the DVB-T receiver.
	 *
	 * @return the value
	 */
	public DVBT getDvbT() {
		return dvbT;
	}

	/**
	 * Set the capabilities of the DVB-T receiver.
	 *
	 * @param dvbT the input value
	 */
	public void  setDvbT(DVBT dvbT) {
		this.dvbT = dvbT;
	}

	/**
	 * Set the capabilities of the DVB-T receiver.
	 *
	 * @param dvbT the input value
	 * @return this instance
	 */
	public FrontEnd withDvbT(DVBT dvbT) {
		this.dvbT = dvbT;
		return this;
	}

	/**
	 * Get the ip front-end capabilities.
	 *
	 * @return the value
	 */
	public IP getIp() {
		return ip;
	}

	/**
	 * Set the ip front-end capabilities.
	 *
	 * @param ip the input value
	 */
	public void  setIp(IP ip) {
		this.ip = ip;
	}

	/**
	 * Set the ip front-end capabilities.
	 *
	 * @param ip the input value
	 * @return this instance
	 */
	public FrontEnd withIp(IP ip) {
		this.ip = ip;
		return this;
	}

	//</editor-fold>

}