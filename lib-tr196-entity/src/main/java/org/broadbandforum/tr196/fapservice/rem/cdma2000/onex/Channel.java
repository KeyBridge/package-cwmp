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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.onex;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * REM specific configuration and reporting.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.OneX.Channel.{i}.")
@XmlRootElement(name = "FAPService.REM.CDMA2000.OneX.Channel")
@XmlType(name = "FAPService.REM.CDMA2000.OneX.Channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Channel {

	/**
	 * Enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Config parameter to set band class. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SniffingBandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long sniffingBandClass = 0L;
	/**
	 * The Radio Frequency Channel Number (RFCN) in the forward direction.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SniffingChannelNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2016)
	public Long sniffingChannelNumber = 0L;
	/**
	 * {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:  <Start-value>".."<End-value>:<Increment> If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PNList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> pnlist;

	public Channel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Channel withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Channel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the config parameter to set band class. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSniffingBandClass() {
		return sniffingBandClass;
	}

	/**
	 * Set the config parameter to set band class. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @param sniffingBandClass the input value
	 */
	public void  setSniffingBandClass(Long sniffingBandClass) {
		this.sniffingBandClass = sniffingBandClass;
	}

	/**
	 * Set the config parameter to set band class. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @param sniffingBandClass the input value
	 * @return this instance
	 */
	public Channel withSniffingBandClass(Long sniffingBandClass) {
		this.sniffingBandClass = sniffingBandClass;
		return this;
	}

	/**
	 * Get the Radio Frequency Channel Number (RFCN) in the forward direction.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSniffingChannelNumber() {
		return sniffingChannelNumber;
	}

	/**
	 * Set the Radio Frequency Channel Number (RFCN) in the forward direction.
	 *
	 * @since 2.0
	 * @param sniffingChannelNumber the input value
	 */
	public void  setSniffingChannelNumber(Long sniffingChannelNumber) {
		this.sniffingChannelNumber = sniffingChannelNumber;
	}

	/**
	 * Set the Radio Frequency Channel Number (RFCN) in the forward direction.
	 *
	 * @since 2.0
	 * @param sniffingChannelNumber the input value
	 * @return this instance
	 */
	public Channel withSniffingChannelNumber(Long sniffingChannelNumber) {
		this.sniffingChannelNumber = sniffingChannelNumber;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:  <Start-value>".."<End-value>:<Increment> If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPnlist() {
		if (this.pnlist == null){ this.pnlist=new ArrayList<>();}
		return pnlist;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:  <Start-value>".."<End-value>:<Increment> If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 * @param pnlist the input value
	 */
	public void  setPnlist(Collection<String> pnlist) {
		this.pnlist = pnlist;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:  <Start-value>".."<End-value>:<Increment> If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Channel withPnlist(String string) {
		getPnlist().add(string);
		return this;
	}

	//</editor-fold>

}