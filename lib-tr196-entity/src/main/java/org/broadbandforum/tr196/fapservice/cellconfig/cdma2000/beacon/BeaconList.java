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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.beacon;

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
	 * This object models an individual beacon intervals. It may be used to model both 1x and HRPD beacons with offset from start of beacon frame measured in 80ms slots.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.Beacon.BeaconList.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.Beacon.BeaconList")
@XmlType(name = "FAPService.CellConfig.CDMA2000.Beacon.BeaconList")
@XmlAccessorType(XmlAccessType.FIELD)
public class BeaconList {

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
	 * Instance identifier for this beacon interval. Allowed range is 0..(BeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconIndex")
	public Integer beaconIndex = 0;
	/**
	 * Offset from the start of the beacon frame in 80ms slots.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Offset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32767)
	public Long offset = 0L;
	/**
	 * Duration of this beacon interval in 80 ms slots.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	@CWMPParameter(access = "readWrite", units = "80 ms slots")
	@Size(min = 0, max = 32767)
	public Long duration = 0L;
	/**
	 * Determines if this beacon interval shall transmit HRPD (HRPD) or CDMA2000 1x.{HRPD="0", 1x="1"}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmissionFormat")
	@CWMPParameter(access = "readWrite")
	public String transmissionFormat = "1";
	/**
	 * Band class for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconBandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Integer beaconBandClass = 0;
	/**
	 * Channel number for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconChannelFreq")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2016)
	public Long beaconChannelFreq = 0L;
	/**
	 * {{list}} Each item is a pilot PN offset of the pilot beacon for this channel in units of 64 PN chips. If this parameter  contains more than one item, then the FAP is expected to select one from the list as the PilotPN to be used for this channel. If the self-configuration capability is not to be used, then this parameter SHALL contain only a single item.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconPNOffset")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> beaconPNOffset;
	/**
	 * TX power for the beacon interval (in dBm). If self-configuration of the Beacon Tx Power is enabled, then this value is determined by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPower")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -40, max = 20)
	public Integer txpower = -40;
	/**
	 * SID for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconSID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long beaconSID = 0L;
	/**
	 * NID for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconNID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32767)
	public Long beaconNID = 0L;
	/**
	 * PZID for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconPZID")
	@CWMPParameter(access = "readWrite")
	public Long beaconPZID = 0L;

	public BeaconList() {
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
	public BeaconList withEnable(Boolean enable) {
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
	public BeaconList withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the instance identifier for this beacon interval. Allowed range is 0..(BeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconIndex() {
		return beaconIndex;
	}

	/**
	 * Set the instance identifier for this beacon interval. Allowed range is 0..(BeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @param beaconIndex the input value
	 */
	public void  setBeaconIndex(Integer beaconIndex) {
		this.beaconIndex = beaconIndex;
	}

	/**
	 * Set the instance identifier for this beacon interval. Allowed range is 0..(BeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @param beaconIndex the input value
	 * @return this instance
	 */
	public BeaconList withBeaconIndex(Integer beaconIndex) {
		this.beaconIndex = beaconIndex;
		return this;
	}

	/**
	 * Get the offset from the start of the beacon frame in 80ms slots.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOffset() {
		return offset;
	}

	/**
	 * Set the offset from the start of the beacon frame in 80ms slots.
	 *
	 * @since 2.0
	 * @param offset the input value
	 */
	public void  setOffset(Long offset) {
		this.offset = offset;
	}

	/**
	 * Set the offset from the start of the beacon frame in 80ms slots.
	 *
	 * @since 2.0
	 * @param offset the input value
	 * @return this instance
	 */
	public BeaconList withOffset(Long offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Get the duration of this beacon interval in 80 ms slots.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the duration of this beacon interval in 80 ms slots.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the duration of this beacon interval in 80 ms slots.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public BeaconList withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the determines if this beacon interval shall transmit HRPD (HRPD) or CDMA2000 1x.{HRPD="0", 1x="1"}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTransmissionFormat() {
		return transmissionFormat;
	}

	/**
	 * Set the determines if this beacon interval shall transmit HRPD (HRPD) or CDMA2000 1x.{HRPD="0", 1x="1"}.
	 *
	 * @since 2.0
	 * @param transmissionFormat the input value
	 */
	public void  setTransmissionFormat(String transmissionFormat) {
		this.transmissionFormat = transmissionFormat;
	}

	/**
	 * Set the determines if this beacon interval shall transmit HRPD (HRPD) or CDMA2000 1x.{HRPD="0", 1x="1"}.
	 *
	 * @since 2.0
	 * @param transmissionFormat the input value
	 * @return this instance
	 */
	public BeaconList withTransmissionFormat(String transmissionFormat) {
		this.transmissionFormat = transmissionFormat;
		return this;
	}

	/**
	 * Get the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconBandClass() {
		return beaconBandClass;
	}

	/**
	 * Set the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconBandClass the input value
	 */
	public void  setBeaconBandClass(Integer beaconBandClass) {
		this.beaconBandClass = beaconBandClass;
	}

	/**
	 * Set the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconBandClass the input value
	 * @return this instance
	 */
	public BeaconList withBeaconBandClass(Integer beaconBandClass) {
		this.beaconBandClass = beaconBandClass;
		return this;
	}

	/**
	 * Get the channel number for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconChannelFreq() {
		return beaconChannelFreq;
	}

	/**
	 * Set the channel number for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconChannelFreq the input value
	 */
	public void  setBeaconChannelFreq(Long beaconChannelFreq) {
		this.beaconChannelFreq = beaconChannelFreq;
	}

	/**
	 * Set the channel number for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconChannelFreq the input value
	 * @return this instance
	 */
	public BeaconList withBeaconChannelFreq(Long beaconChannelFreq) {
		this.beaconChannelFreq = beaconChannelFreq;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a pilot PN offset of the pilot beacon for this channel in units of 64 PN chips. If this parameter  contains more than one item, then the FAP is expected to select one from the list as the PilotPN to be used for this channel. If the self-configuration capability is not to be used, then this parameter SHALL contain only a single item.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getBeaconPNOffset() {
		if (this.beaconPNOffset == null){ this.beaconPNOffset=new ArrayList<>();}
		return beaconPNOffset;
	}

	/**
	 * Set the {{list}} Each item is a pilot PN offset of the pilot beacon for this channel in units of 64 PN chips. If this parameter  contains more than one item, then the FAP is expected to select one from the list as the PilotPN to be used for this channel. If the self-configuration capability is not to be used, then this parameter SHALL contain only a single item.
	 *
	 * @since 2.0
	 * @param beaconPNOffset the input value
	 */
	public void  setBeaconPNOffset(Collection<String> beaconPNOffset) {
		this.beaconPNOffset = beaconPNOffset;
	}

	/**
	 * Set the {{list}} Each item is a pilot PN offset of the pilot beacon for this channel in units of 64 PN chips. If this parameter  contains more than one item, then the FAP is expected to select one from the list as the PilotPN to be used for this channel. If the self-configuration capability is not to be used, then this parameter SHALL contain only a single item.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public BeaconList withBeaconPNOffset(String string) {
		getBeaconPNOffset().add(string);
		return this;
	}

	/**
	 * Get the tx power for the beacon interval (in dBm). If self-configuration of the Beacon Tx Power is enabled, then this value is determined by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTxpower() {
		return txpower;
	}

	/**
	 * Set the tx power for the beacon interval (in dBm). If self-configuration of the Beacon Tx Power is enabled, then this value is determined by the FAP.
	 *
	 * @since 2.0
	 * @param txpower the input value
	 */
	public void  setTxpower(Integer txpower) {
		this.txpower = txpower;
	}

	/**
	 * Set the tx power for the beacon interval (in dBm). If self-configuration of the Beacon Tx Power is enabled, then this value is determined by the FAP.
	 *
	 * @since 2.0
	 * @param txpower the input value
	 * @return this instance
	 */
	public BeaconList withTxpower(Integer txpower) {
		this.txpower = txpower;
		return this;
	}

	/**
	 * Get the sid for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconSID() {
		return beaconSID;
	}

	/**
	 * Set the sid for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconSID the input value
	 */
	public void  setBeaconSID(Long beaconSID) {
		this.beaconSID = beaconSID;
	}

	/**
	 * Set the sid for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconSID the input value
	 * @return this instance
	 */
	public BeaconList withBeaconSID(Long beaconSID) {
		this.beaconSID = beaconSID;
		return this;
	}

	/**
	 * Get the nid for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconNID() {
		return beaconNID;
	}

	/**
	 * Set the nid for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconNID the input value
	 */
	public void  setBeaconNID(Long beaconNID) {
		this.beaconNID = beaconNID;
	}

	/**
	 * Set the nid for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconNID the input value
	 * @return this instance
	 */
	public BeaconList withBeaconNID(Long beaconNID) {
		this.beaconNID = beaconNID;
		return this;
	}

	/**
	 * Get the pziD for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconPZID() {
		return beaconPZID;
	}

	/**
	 * Set the pziD for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconPZID the input value
	 */
	public void  setBeaconPZID(Long beaconPZID) {
		this.beaconPZID = beaconPZID;
	}

	/**
	 * Set the pziD for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconPZID the input value
	 * @return this instance
	 */
	public BeaconList withBeaconPZID(Long beaconPZID) {
		this.beaconPZID = beaconPZID;
		return this;
	}

	//</editor-fold>

}