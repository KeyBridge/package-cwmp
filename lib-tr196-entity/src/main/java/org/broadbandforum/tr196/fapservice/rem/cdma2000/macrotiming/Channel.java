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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.macrotiming;

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
	 * Object used to configure list of channels to be used for Macto Timing.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.MacroTiming.Channel.{i}.")
@XmlRootElement(name = "Channel")
@XmlType(name = "FAPService.REM.CDMA2000.MacroTiming.Channel")
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
	 * Air interface type of the configured Band class and Channel. 0 - 1x, 1 - HRPD.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AirInterfaceType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long airInterfaceType = 0L;
	/**
	 * Bandclass of the Macro timing channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long bandClass = 0L;
	/**
	 * Macro timing acquisition channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChannelNumber")
	@CWMPParameter(access = "readWrite")
	public Long channelNumber = 0L;
	/**
	 * Priority of the channle to use for acquisition.  FAP should prioritize lower values over higher.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	public Long priority = 0L;
	/**
	 * {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:

<Start-value>".."<End-value>:<Increment>

If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
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
	 * Get air interface type of the configured Band class and Channel. 0 - 1x, 1 - HRPD.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAirInterfaceType() {
		return airInterfaceType;
	}

	/**
	 * Set air interface type of the configured Band class and Channel. 0 - 1x, 1 - HRPD.
	 *
	 * @since 2.0
	 * @param airInterfaceType the input value
	 */
	public void  setAirInterfaceType(Long airInterfaceType) {
		this.airInterfaceType = airInterfaceType;
	}

	/**
	 * Set air interface type of the configured Band class and Channel. 0 - 1x, 1 - HRPD.
	 *
	 * @since 2.0
	 * @param airInterfaceType the input value
	 * @return this instance
	 */
	public Channel withAirInterfaceType(Long airInterfaceType) {
		this.airInterfaceType = airInterfaceType;
		return this;
	}

	/**
	 * Get the bandclass of the Macro timing channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBandClass() {
		return bandClass;
	}

	/**
	 * Set the bandclass of the Macro timing channel.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 */
	public void  setBandClass(Long bandClass) {
		this.bandClass = bandClass;
	}

	/**
	 * Set the bandclass of the Macro timing channel.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 * @return this instance
	 */
	public Channel withBandClass(Long bandClass) {
		this.bandClass = bandClass;
		return this;
	}

	/**
	 * Get the macro timing acquisition channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getChannelNumber() {
		return channelNumber;
	}

	/**
	 * Set the macro timing acquisition channel.
	 *
	 * @since 2.0
	 * @param channelNumber the input value
	 */
	public void  setChannelNumber(Long channelNumber) {
		this.channelNumber = channelNumber;
	}

	/**
	 * Set the macro timing acquisition channel.
	 *
	 * @since 2.0
	 * @param channelNumber the input value
	 * @return this instance
	 */
	public Channel withChannelNumber(Long channelNumber) {
		this.channelNumber = channelNumber;
		return this;
	}

	/**
	 * Get the priority of the channle to use for acquisition.  FAP should prioritize lower values over higher.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of the channle to use for acquisition.  FAP should prioritize lower values over higher.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of the channle to use for acquisition.  FAP should prioritize lower values over higher.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public Channel withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:

<Start-value>".."<End-value>:<Increment>

If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPnlist() {
		if (this.pnlist == null){ this.pnlist=new ArrayList<>();}
		return pnlist;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:

<Start-value>".."<End-value>:<Increment>

If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
	 *
	 * @since 2.0
	 * @param pnlist the input value
	 */
	public void  setPnlist(Collection<String> pnlist) {
		this.pnlist = pnlist;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips or PNrange expressed in the following format:

<Start-value>".."<End-value>:<Increment>

If an empty string, then no specific PNList is provided, meaning that the FAP is required to pick a PN list to scan on its own.
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