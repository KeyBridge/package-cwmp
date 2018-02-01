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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * This object contains information common to all neighbors of a sector. This object has only one instance.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.")
public class NeighborList {

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
	 * pilot increment policy for this network. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotInc")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 15)
	public Integer pilotInc = 1;
	/**
	 * Macro neighbour index. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXNeighborIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 19)
	public Integer oneXNeighborIndex = 0;
	/**
	 * Neighbor configuration in terms of number of frequencies having paging channels as defined in Section 3.7.2.3.2 of the {{bibref|3GPP2-C.S0005}} standard
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborConfig")
	@CWMPParameter(access = "readWrite")
	public String neighborConfig = "SameConfig";
	/**
	 * PN offset of the neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborPN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 511)
	public Integer neighborPN = 0;
	/**
	 * priority level for serching this neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SearchPriority")
	@CWMPParameter(access = "readWrite")
	public String searchPriority = "Medium";
	/**
	 * Neighbor band class. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborBand")
	@CWMPParameter(access = "readWrite")
	public String neighborBand;
	/**
	 * frequency of neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborFrequency")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2016)
	public Integer neighborFrequency = 0;
	/**
	 * Flag to indicate if the channel id included. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FrequencyIncluded")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer frequencyIncluded = 1;
	/**
	 * whether this neighbor can be used for in-traffic neighborlist message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InTraffic")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer intraffic = 1;
	/**
	 * whether this neighbor can be used for overhead neighborlist message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OverheadMsg")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer overheadMsg = 1;
	/**
	 * unique identifire of the neighboring cell (optional)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BaseIdentifier")
	@CWMPParameter(access = "readWrite")
	public Integer baseIdentifier = 0;
	/**
	 * Air interface technology of the neighbor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AirInterface")
	@CWMPParameter(access = "readWrite")
	public String airInterface = "OneX";
	/**
	 * Flag to indicate if the handOutCapability is possible.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HandOutCapable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer handOutCapable = 0;
	/**
	 * Longitude for this neighbor. Parameter is a string representing a floating point real number (+/- XXX.YY). Where  + for East, - for West, XXX.Y ranges between 0.0 and 180.0 .
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXNeighborLongitude")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String oneXNeighborLongitude;
	/**
	 * Lattitude for this neighbor. Parameter is a string representing a floating point number (+/-XX.Y).  + for North, - for South, XX.Y ranges between 0.0 and 90.0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXNeighborLatitude")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String oneXNeighborLatitude;
	/**
	 * IOS MSCID of the neighbors. See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXNeighborMSCId")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 16777215)
	public Long oneXNeighborMSCId = 0L;
	/**
	 * Cell Identifier of the neighbor (formatted according to Cell Identification Discriminator = '0000 0010', i.e., 12-bit cell value and 4-bit sector value). See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXNeighborIOSCellId")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long oneXNeighborIOSCellId = 0L;
	/**
	 * If {{param}} is set to {{true}}, the FAP SHOULD include this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}, in which case the FAP MAY include this Neighbor List entry in the Neighbor List overhead messages.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForceInOverhead")
	@CWMPParameter(access = "readWrite")
	public Boolean forceInOverhead = false;
	/**
	 * If {{param}} is set to {{true}}, the FAP is currently including this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IncludedInOverhead")
	public Boolean includedInOverhead;

	public NeighborList() {
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
	public NeighborList withEnable(Boolean enable) {
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
	public NeighborList withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the pilot increment policy for this network. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPilotInc() {
		return pilotInc;
	}

	/**
	 * Set the pilot increment policy for this network. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pilotInc the input value
	 */
	public void  setPilotInc(Integer pilotInc) {
		this.pilotInc = pilotInc;
	}

	/**
	 * Set the pilot increment policy for this network. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pilotInc the input value
	 * @return this instance
	 */
	public NeighborList withPilotInc(Integer pilotInc) {
		this.pilotInc = pilotInc;
		return this;
	}

	/**
	 * Get the macro neighbour index. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXNeighborIndex() {
		return oneXNeighborIndex;
	}

	/**
	 * Set the macro neighbour index. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborIndex the input value
	 */
	public void  setOneXNeighborIndex(Integer oneXNeighborIndex) {
		this.oneXNeighborIndex = oneXNeighborIndex;
	}

	/**
	 * Set the macro neighbour index. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborIndex the input value
	 * @return this instance
	 */
	public NeighborList withOneXNeighborIndex(Integer oneXNeighborIndex) {
		this.oneXNeighborIndex = oneXNeighborIndex;
		return this;
	}

	/**
	 * Get the neighbor configuration in terms of number of frequencies having paging channels as defined in Section 3.7.2.3.2 of the {{bibref|3GPP2-C.S0005}} standard
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNeighborConfig() {
		return neighborConfig;
	}

	/**
	 * Set the neighbor configuration in terms of number of frequencies having paging channels as defined in Section 3.7.2.3.2 of the {{bibref|3GPP2-C.S0005}} standard
	 *
	 * @since 2.0
	 * @param neighborConfig the input value
	 */
	public void  setNeighborConfig(String neighborConfig) {
		this.neighborConfig = neighborConfig;
	}

	/**
	 * Set the neighbor configuration in terms of number of frequencies having paging channels as defined in Section 3.7.2.3.2 of the {{bibref|3GPP2-C.S0005}} standard
	 *
	 * @since 2.0
	 * @param neighborConfig the input value
	 * @return this instance
	 */
	public NeighborList withNeighborConfig(String neighborConfig) {
		this.neighborConfig = neighborConfig;
		return this;
	}

	/**
	 * Get the pn offset of the neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getNeighborPN() {
		return neighborPN;
	}

	/**
	 * Set the pn offset of the neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborPN the input value
	 */
	public void  setNeighborPN(Integer neighborPN) {
		this.neighborPN = neighborPN;
	}

	/**
	 * Set the pn offset of the neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborPN the input value
	 * @return this instance
	 */
	public NeighborList withNeighborPN(Integer neighborPN) {
		this.neighborPN = neighborPN;
		return this;
	}

	/**
	 * Get the priority level for serching this neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSearchPriority() {
		return searchPriority;
	}

	/**
	 * Set the priority level for serching this neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param searchPriority the input value
	 */
	public void  setSearchPriority(String searchPriority) {
		this.searchPriority = searchPriority;
	}

	/**
	 * Set the priority level for serching this neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param searchPriority the input value
	 * @return this instance
	 */
	public NeighborList withSearchPriority(String searchPriority) {
		this.searchPriority = searchPriority;
		return this;
	}

	/**
	 * Get the neighbor band class. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNeighborBand() {
		return neighborBand;
	}

	/**
	 * Set the neighbor band class. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborBand the input value
	 */
	public void  setNeighborBand(String neighborBand) {
		this.neighborBand = neighborBand;
	}

	/**
	 * Set the neighbor band class. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborBand the input value
	 * @return this instance
	 */
	public NeighborList withNeighborBand(String neighborBand) {
		this.neighborBand = neighborBand;
		return this;
	}

	/**
	 * Get the frequency of neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getNeighborFrequency() {
		return neighborFrequency;
	}

	/**
	 * Set the frequency of neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborFrequency the input value
	 */
	public void  setNeighborFrequency(Integer neighborFrequency) {
		this.neighborFrequency = neighborFrequency;
	}

	/**
	 * Set the frequency of neighbor. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param neighborFrequency the input value
	 * @return this instance
	 */
	public NeighborList withNeighborFrequency(Integer neighborFrequency) {
		this.neighborFrequency = neighborFrequency;
		return this;
	}

	/**
	 * Get the flag to indicate if the channel id included. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFrequencyIncluded() {
		return frequencyIncluded;
	}

	/**
	 * Set the flag to indicate if the channel id included. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param frequencyIncluded the input value
	 */
	public void  setFrequencyIncluded(Integer frequencyIncluded) {
		this.frequencyIncluded = frequencyIncluded;
	}

	/**
	 * Set the flag to indicate if the channel id included. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param frequencyIncluded the input value
	 * @return this instance
	 */
	public NeighborList withFrequencyIncluded(Integer frequencyIncluded) {
		this.frequencyIncluded = frequencyIncluded;
		return this;
	}

	/**
	 * Get the whether this neighbor can be used for in-traffic neighborlist message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getIntraffic() {
		return intraffic;
	}

	/**
	 * Set the whether this neighbor can be used for in-traffic neighborlist message
	 *
	 * @since 2.0
	 * @param intraffic the input value
	 */
	public void  setIntraffic(Integer intraffic) {
		this.intraffic = intraffic;
	}

	/**
	 * Set the whether this neighbor can be used for in-traffic neighborlist message
	 *
	 * @since 2.0
	 * @param intraffic the input value
	 * @return this instance
	 */
	public NeighborList withIntraffic(Integer intraffic) {
		this.intraffic = intraffic;
		return this;
	}

	/**
	 * Get the whether this neighbor can be used for overhead neighborlist message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOverheadMsg() {
		return overheadMsg;
	}

	/**
	 * Set the whether this neighbor can be used for overhead neighborlist message
	 *
	 * @since 2.0
	 * @param overheadMsg the input value
	 */
	public void  setOverheadMsg(Integer overheadMsg) {
		this.overheadMsg = overheadMsg;
	}

	/**
	 * Set the whether this neighbor can be used for overhead neighborlist message
	 *
	 * @since 2.0
	 * @param overheadMsg the input value
	 * @return this instance
	 */
	public NeighborList withOverheadMsg(Integer overheadMsg) {
		this.overheadMsg = overheadMsg;
		return this;
	}

	/**
	 * Get the unique identifire of the neighboring cell (optional)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBaseIdentifier() {
		return baseIdentifier;
	}

	/**
	 * Set the unique identifire of the neighboring cell (optional)
	 *
	 * @since 2.0
	 * @param baseIdentifier the input value
	 */
	public void  setBaseIdentifier(Integer baseIdentifier) {
		this.baseIdentifier = baseIdentifier;
	}

	/**
	 * Set the unique identifire of the neighboring cell (optional)
	 *
	 * @since 2.0
	 * @param baseIdentifier the input value
	 * @return this instance
	 */
	public NeighborList withBaseIdentifier(Integer baseIdentifier) {
		this.baseIdentifier = baseIdentifier;
		return this;
	}

	/**
	 * Get air interface technology of the neighbor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAirInterface() {
		return airInterface;
	}

	/**
	 * Set air interface technology of the neighbor.
	 *
	 * @since 2.0
	 * @param airInterface the input value
	 */
	public void  setAirInterface(String airInterface) {
		this.airInterface = airInterface;
	}

	/**
	 * Set air interface technology of the neighbor.
	 *
	 * @since 2.0
	 * @param airInterface the input value
	 * @return this instance
	 */
	public NeighborList withAirInterface(String airInterface) {
		this.airInterface = airInterface;
		return this;
	}

	/**
	 * Get the flag to indicate if the handOutCapability is possible.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHandOutCapable() {
		return handOutCapable;
	}

	/**
	 * Set the flag to indicate if the handOutCapability is possible.
	 *
	 * @since 2.0
	 * @param handOutCapable the input value
	 */
	public void  setHandOutCapable(Integer handOutCapable) {
		this.handOutCapable = handOutCapable;
	}

	/**
	 * Set the flag to indicate if the handOutCapability is possible.
	 *
	 * @since 2.0
	 * @param handOutCapable the input value
	 * @return this instance
	 */
	public NeighborList withHandOutCapable(Integer handOutCapable) {
		this.handOutCapable = handOutCapable;
		return this;
	}

	/**
	 * Get the longitude for this neighbor. Parameter is a string representing a floating point real number (+/- XXX.YY). Where  + for East, - for West, XXX.Y ranges between 0.0 and 180.0 .
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOneXNeighborLongitude() {
		return oneXNeighborLongitude;
	}

	/**
	 * Set the longitude for this neighbor. Parameter is a string representing a floating point real number (+/- XXX.YY). Where  + for East, - for West, XXX.Y ranges between 0.0 and 180.0 .
	 *
	 * @since 2.0
	 * @param oneXNeighborLongitude the input value
	 */
	public void  setOneXNeighborLongitude(String oneXNeighborLongitude) {
		this.oneXNeighborLongitude = oneXNeighborLongitude;
	}

	/**
	 * Set the longitude for this neighbor. Parameter is a string representing a floating point real number (+/- XXX.YY). Where  + for East, - for West, XXX.Y ranges between 0.0 and 180.0 .
	 *
	 * @since 2.0
	 * @param oneXNeighborLongitude the input value
	 * @return this instance
	 */
	public NeighborList withOneXNeighborLongitude(String oneXNeighborLongitude) {
		this.oneXNeighborLongitude = oneXNeighborLongitude;
		return this;
	}

	/**
	 * Get the lattitude for this neighbor. Parameter is a string representing a floating point number (+/-XX.Y).  + for North, - for South, XX.Y ranges between 0.0 and 90.0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOneXNeighborLatitude() {
		return oneXNeighborLatitude;
	}

	/**
	 * Set the lattitude for this neighbor. Parameter is a string representing a floating point number (+/-XX.Y).  + for North, - for South, XX.Y ranges between 0.0 and 90.0.
	 *
	 * @since 2.0
	 * @param oneXNeighborLatitude the input value
	 */
	public void  setOneXNeighborLatitude(String oneXNeighborLatitude) {
		this.oneXNeighborLatitude = oneXNeighborLatitude;
	}

	/**
	 * Set the lattitude for this neighbor. Parameter is a string representing a floating point number (+/-XX.Y).  + for North, - for South, XX.Y ranges between 0.0 and 90.0.
	 *
	 * @since 2.0
	 * @param oneXNeighborLatitude the input value
	 * @return this instance
	 */
	public NeighborList withOneXNeighborLatitude(String oneXNeighborLatitude) {
		this.oneXNeighborLatitude = oneXNeighborLatitude;
		return this;
	}

	/**
	 * Get the ios MSCID of the neighbors. See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOneXNeighborMSCId() {
		return oneXNeighborMSCId;
	}

	/**
	 * Set the ios MSCID of the neighbors. See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborMSCId the input value
	 */
	public void  setOneXNeighborMSCId(Long oneXNeighborMSCId) {
		this.oneXNeighborMSCId = oneXNeighborMSCId;
	}

	/**
	 * Set the ios MSCID of the neighbors. See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborMSCId the input value
	 * @return this instance
	 */
	public NeighborList withOneXNeighborMSCId(Long oneXNeighborMSCId) {
		this.oneXNeighborMSCId = oneXNeighborMSCId;
		return this;
	}

	/**
	 * Get the cell Identifier of the neighbor (formatted according to Cell Identification Discriminator = '0000 0010', i.e., 12-bit cell value and 4-bit sector value). See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOneXNeighborIOSCellId() {
		return oneXNeighborIOSCellId;
	}

	/**
	 * Set the cell Identifier of the neighbor (formatted according to Cell Identification Discriminator = '0000 0010', i.e., 12-bit cell value and 4-bit sector value). See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborIOSCellId the input value
	 */
	public void  setOneXNeighborIOSCellId(Long oneXNeighborIOSCellId) {
		this.oneXNeighborIOSCellId = oneXNeighborIOSCellId;
	}

	/**
	 * Set the cell Identifier of the neighbor (formatted according to Cell Identification Discriminator = '0000 0010', i.e., 12-bit cell value and 4-bit sector value). See {{bibref|3GPP2-A.S0014}}.
	 *
	 * @since 2.0
	 * @param oneXNeighborIOSCellId the input value
	 * @return this instance
	 */
	public NeighborList withOneXNeighborIOSCellId(Long oneXNeighborIOSCellId) {
		this.oneXNeighborIOSCellId = oneXNeighborIOSCellId;
		return this;
	}

	/**
	 * Get the if {{param}} is set to {{true}}, the FAP SHOULD include this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}, in which case the FAP MAY include this Neighbor List entry in the Neighbor List overhead messages.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isForceInOverhead() {
		return forceInOverhead;
	}

	/**
	 * Set the if {{param}} is set to {{true}}, the FAP SHOULD include this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}, in which case the FAP MAY include this Neighbor List entry in the Neighbor List overhead messages.
	 *
	 * @since 2.0
	 * @param forceInOverhead the input value
	 */
	public void  setForceInOverhead(Boolean forceInOverhead) {
		this.forceInOverhead = forceInOverhead;
	}

	/**
	 * Set the if {{param}} is set to {{true}}, the FAP SHOULD include this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}, in which case the FAP MAY include this Neighbor List entry in the Neighbor List overhead messages.
	 *
	 * @since 2.0
	 * @param forceInOverhead the input value
	 * @return this instance
	 */
	public NeighborList withForceInOverhead(Boolean forceInOverhead) {
		this.forceInOverhead = forceInOverhead;
		return this;
	}

	/**
	 * Get the if {{param}} is set to {{true}}, the FAP is currently including this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIncludedInOverhead() {
		return includedInOverhead;
	}

	/**
	 * Set the if {{param}} is set to {{true}}, the FAP is currently including this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}.
	 *
	 * @since 2.0
	 * @param includedInOverhead the input value
	 */
	public void  setIncludedInOverhead(Boolean includedInOverhead) {
		this.includedInOverhead = includedInOverhead;
	}

	/**
	 * Set the if {{param}} is set to {{true}}, the FAP is currently including this Neighbor List entry in the Neighbor List overhead messages (see {{bibref|3GPP2-C.S0005}}.  Otherwise, {{param}} is set to {{false}}.
	 *
	 * @since 2.0
	 * @param includedInOverhead the input value
	 * @return this instance
	 */
	public NeighborList withIncludedInOverhead(Boolean includedInOverhead) {
		this.includedInOverhead = includedInOverhead;
		return this;
	}

	//</editor-fold>

}