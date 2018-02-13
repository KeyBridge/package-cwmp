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
package org.broadbandforum.tr135.stbservice.components;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;
import org.broadbandforum.tr135.stbservice.components.frontend.DVBT;
import org.broadbandforum.tr135.stbservice.components.frontend.IP;

	/**
	 * FrontEnd instance table. Each front-end instance, including vendor-specific front-end types, will normally have a sub-object that corresponds to the front-end type (e.g. DVB-T or IP).
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.")
@XmlRootElement(name = "FrontEnd")
@XmlType(name = "STBService.Components.FrontEnd")
@XmlAccessorType(XmlAccessType.FIELD)
public class FrontEnd {

	/**
	 * Enables or disables this front-end.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this front-end.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this front-end.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * DVB-T front-end details. This object will normally be present if and only if this front-end is a DVB-T front-end.

Parameters are taken from the DGTVi D-Book {{bibref|D-Book}}.
	 */
	@XmlElement(name = "DVBT")
	public DVBT dvbT;
	/**
	 * IP front-end details. This object will normally be present if and only if the front-end is an IP front-end.
	 */
	@XmlElement(name = "IP")
	public IP ip;

	public FrontEnd() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this front-end.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this front-end.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this front-end.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FrontEnd withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this front-end.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this front-end.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this front-end.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public FrontEnd withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public FrontEnd withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this front-end.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this front-end.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this front-end.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public FrontEnd withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the dvb-T front-end details. This object will normally be present if and only if this front-end is a DVB-T front-end.

Parameters are taken from the DGTVi D-Book {{bibref|D-Book}}.
	 *
	 * @return the value
	 */
	public DVBT getDvbT() {
		return dvbT;
	}

	/**
	 * Set the dvb-T front-end details. This object will normally be present if and only if this front-end is a DVB-T front-end.

Parameters are taken from the DGTVi D-Book {{bibref|D-Book}}.
	 *
	 * @param dvbT the input value
	 */
	public void  setDvbT(DVBT dvbT) {
		this.dvbT = dvbT;
	}

	/**
	 * Set the dvb-T front-end details. This object will normally be present if and only if this front-end is a DVB-T front-end.

Parameters are taken from the DGTVi D-Book {{bibref|D-Book}}.
	 *
	 * @param dvbT the input value
	 * @return this instance
	 */
	public FrontEnd withDvbT(DVBT dvbT) {
		this.dvbT = dvbT;
		return this;
	}

	/**
	 * Get the ip front-end details. This object will normally be present if and only if the front-end is an IP front-end.
	 *
	 * @return the value
	 */
	public IP getIp() {
		return ip;
	}

	/**
	 * Set the ip front-end details. This object will normally be present if and only if the front-end is an IP front-end.
	 *
	 * @param ip the input value
	 */
	public void  setIp(IP ip) {
		this.ip = ip;
	}

	/**
	 * Set the ip front-end details. This object will normally be present if and only if the front-end is an IP front-end.
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