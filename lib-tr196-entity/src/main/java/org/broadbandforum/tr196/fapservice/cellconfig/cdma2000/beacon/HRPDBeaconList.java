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
	 * This object models individual HRPD beacon intervals where the beacon start is expressed as a number of HRPD control channel slots from the start of the beacon frame.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.Beacon.HRPDBeaconList")
@XmlType(name = "FAPService.CellConfig.CDMA2000.Beacon.HRPDBeaconList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPDBeaconList {

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
	 * Instance identifier for this beacon interval.  Allowed range is 0..(HRPDBeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconIndex")
	public Integer beaconIndex = 0;
	/**
	 * Offset of the current beacon interval from the start of the beacon frame, in Control Channel cycles. The HRPDBeaconList interval SHOULD not overlap in time with any beacon interval for the same channel defined in the BeaconList object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CCoffset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2048)
	public Long ccoffset = 0L;
	/**
	 * Start of beacon transmission with respect to the Control Channel boundary.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Offset")
	@CWMPParameter(access = "readWrite")
	@Size(min = -127, max = 128)
	public Integer offset = 0;
	/**
	 * Duration of the beacon transmission within a Control Channel cycle, in slots. Beacon is transmitted starting offset from the CC boundary for duration. Transmission restarts offset from the next CC boundary, given that beacon interval spans more than 1 CC cycles.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 256)
	public Long duration = 0L;
	/**
	 * Number of Control Channel Cycles this beacon interval spans.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumCCcycles")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 48)
	public Long numCCcycles = 0L;
	/**
	 * Band class for this beacon interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconBandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long beaconBandClass = 0L;
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
	 * TX power for the beacon interval. If self-configuration of the HRPD Beacon Tx Power is enabled, then this value  is determined by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPower")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -40, max = 20)
	public Integer txpower = -40;

	public HRPDBeaconList() {
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
	public HRPDBeaconList withEnable(Boolean enable) {
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
	public HRPDBeaconList withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the instance identifier for this beacon interval.  Allowed range is 0..(HRPDBeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconIndex() {
		return beaconIndex;
	}

	/**
	 * Set the instance identifier for this beacon interval.  Allowed range is 0..(HRPDBeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @param beaconIndex the input value
	 */
	public void  setBeaconIndex(Integer beaconIndex) {
		this.beaconIndex = beaconIndex;
	}

	/**
	 * Set the instance identifier for this beacon interval.  Allowed range is 0..(HRPDBeaconListNumberOfEntries-1).
	 *
	 * @since 2.0
	 * @param beaconIndex the input value
	 * @return this instance
	 */
	public HRPDBeaconList withBeaconIndex(Integer beaconIndex) {
		this.beaconIndex = beaconIndex;
		return this;
	}

	/**
	 * Get the offset of the current beacon interval from the start of the beacon frame, in Control Channel cycles. The HRPDBeaconList interval SHOULD not overlap in time with any beacon interval for the same channel defined in the BeaconList object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCcoffset() {
		return ccoffset;
	}

	/**
	 * Set the offset of the current beacon interval from the start of the beacon frame, in Control Channel cycles. The HRPDBeaconList interval SHOULD not overlap in time with any beacon interval for the same channel defined in the BeaconList object.
	 *
	 * @since 2.0
	 * @param ccoffset the input value
	 */
	public void  setCcoffset(Long ccoffset) {
		this.ccoffset = ccoffset;
	}

	/**
	 * Set the offset of the current beacon interval from the start of the beacon frame, in Control Channel cycles. The HRPDBeaconList interval SHOULD not overlap in time with any beacon interval for the same channel defined in the BeaconList object.
	 *
	 * @since 2.0
	 * @param ccoffset the input value
	 * @return this instance
	 */
	public HRPDBeaconList withCcoffset(Long ccoffset) {
		this.ccoffset = ccoffset;
		return this;
	}

	/**
	 * Get the start of beacon transmission with respect to the Control Channel boundary.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * Set the start of beacon transmission with respect to the Control Channel boundary.
	 *
	 * @since 2.0
	 * @param offset the input value
	 */
	public void  setOffset(Integer offset) {
		this.offset = offset;
	}

	/**
	 * Set the start of beacon transmission with respect to the Control Channel boundary.
	 *
	 * @since 2.0
	 * @param offset the input value
	 * @return this instance
	 */
	public HRPDBeaconList withOffset(Integer offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Get the duration of the beacon transmission within a Control Channel cycle, in slots. Beacon is transmitted starting offset from the CC boundary for duration. Transmission restarts offset from the next CC boundary, given that beacon interval spans more than 1 CC cycles.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the duration of the beacon transmission within a Control Channel cycle, in slots. Beacon is transmitted starting offset from the CC boundary for duration. Transmission restarts offset from the next CC boundary, given that beacon interval spans more than 1 CC cycles.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the duration of the beacon transmission within a Control Channel cycle, in slots. Beacon is transmitted starting offset from the CC boundary for duration. Transmission restarts offset from the next CC boundary, given that beacon interval spans more than 1 CC cycles.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public HRPDBeaconList withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the number of Control Channel Cycles this beacon interval spans.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumCCcycles() {
		return numCCcycles;
	}

	/**
	 * Set the number of Control Channel Cycles this beacon interval spans.
	 *
	 * @since 2.0
	 * @param numCCcycles the input value
	 */
	public void  setNumCCcycles(Long numCCcycles) {
		this.numCCcycles = numCCcycles;
	}

	/**
	 * Set the number of Control Channel Cycles this beacon interval spans.
	 *
	 * @since 2.0
	 * @param numCCcycles the input value
	 * @return this instance
	 */
	public HRPDBeaconList withNumCCcycles(Long numCCcycles) {
		this.numCCcycles = numCCcycles;
		return this;
	}

	/**
	 * Get the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconBandClass() {
		return beaconBandClass;
	}

	/**
	 * Set the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconBandClass the input value
	 */
	public void  setBeaconBandClass(Long beaconBandClass) {
		this.beaconBandClass = beaconBandClass;
	}

	/**
	 * Set the band class for this beacon interval.
	 *
	 * @since 2.0
	 * @param beaconBandClass the input value
	 * @return this instance
	 */
	public HRPDBeaconList withBeaconBandClass(Long beaconBandClass) {
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
	public HRPDBeaconList withBeaconChannelFreq(Long beaconChannelFreq) {
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
	public HRPDBeaconList withBeaconPNOffset(String string) {
		getBeaconPNOffset().add(string);
		return this;
	}

	/**
	 * Get the tx power for the beacon interval. If self-configuration of the HRPD Beacon Tx Power is enabled, then this value  is determined by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTxpower() {
		return txpower;
	}

	/**
	 * Set the tx power for the beacon interval. If self-configuration of the HRPD Beacon Tx Power is enabled, then this value  is determined by the FAP.
	 *
	 * @since 2.0
	 * @param txpower the input value
	 */
	public void  setTxpower(Integer txpower) {
		this.txpower = txpower;
	}

	/**
	 * Set the tx power for the beacon interval. If self-configuration of the HRPD Beacon Tx Power is enabled, then this value  is determined by the FAP.
	 *
	 * @since 2.0
	 * @param txpower the input value
	 * @return this instance
	 */
	public HRPDBeaconList withTxpower(Integer txpower) {
		this.txpower = txpower;
		return this;
	}

	//</editor-fold>

}