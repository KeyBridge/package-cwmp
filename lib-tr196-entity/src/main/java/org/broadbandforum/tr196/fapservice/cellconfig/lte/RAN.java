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
package org.broadbandforum.tr196.fapservice.cellconfig.lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.CSG;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.CellRestriction;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.Common;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.DRB;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.ERAB;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.MAC;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.Mobility;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.NeighborList;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.NeighborListInUse;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.PHY;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.RF;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.RLC;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.RRC;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.RRCTimers;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.RRU;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.S1AP;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.S1U;

	/**
	 * This object contains parameters relating to the LTE RAN level configuration.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN")
@XmlType(name = "FAPService.CellConfig.LTE.RAN")
@XmlAccessorType(XmlAccessType.FIELD)
public class RAN {

	/**
	 * This object contains parameters relating to the common configuration in LTE RAN.
	 */
	@XmlElement(name = "Common")
	public Common common;
	/**
	 * This object contains parameters relating to the S1AP configuration.
	 */
	@XmlElement(name = "S1AP")
	public S1AP s1aP;
	/**
	 * This object contains parameters relating to the S1-U configuration.
	 */
	@XmlElement(name = "S1U")
	public S1U s1u;
	/**
	 * This object contains parameters relating to the RF, see {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
	 */
	@XmlElement(name = "RF")
	public RF rf;
	/**
	 * This object contains parameters relating to the physical layer level configuration.
	 */
	@XmlElement(name = "PHY")
	public PHY phy;
	/**
	 * This object contains parameters relating to the MAC (Medium Access Control) configuration.
	 */
	@XmlElement(name = "MAC")
	public MAC mac;
	/**
	 * This object contains parameters relating to the RLC (Radio Link Control) configuration.
	 */
	@XmlElement(name = "RLC")
	public RLC rlc;
	/**
	 * This object contains parameters relating to the RRC timers and constants (see {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
	 */
	@XmlElement(name = "RRCTimers")
	public RRCTimers rrcTimers;
	/**
	 * This object contains parameters relating to the cell restriction configuration.
	 */
	@XmlElement(name = "CellRestriction")
	public CellRestriction cellRestriction;
	/**
	 * This object contains parameters relating to the UE's mobility configuration. It covers both idle mode and connected mode.
	 */
	@XmlElement(name = "Mobility")
	public Mobility mobility;
	/**
	 * This object contains parameters relating to the neighbor list.
	 */
	@XmlElement(name = "NeighborList")
	public NeighborList neighborList;
	/**
	 * This object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.LTE.RAN.NeighborList.}} configuration of adding and excluding cells.
	 */
	@XmlElement(name = "NeighborListInUse")
	public NeighborListInUse neighborListInUse;
	/**
	 * This object provides monitoring of Closed Subscriber Groups (CSG) in the HeNB.
	 */
	@XmlElement(name = "CSG")
	public CSG csg;
	/**
	 * This object provides monitoring of the RRC in the HeNB.
	 */
	@XmlElement(name = "RRC")
	public RRC rrc;
	/**
	 * This object provides monitoring of E-RABs in the HeNB.
	 */
	@XmlElement(name = "ERAB")
	public ERAB eraB;
	/**
	 * This object provides monitoring of Data Radio Bearers (DRB) in the HeNB.
	 */
	@XmlElement(name = "DRB")
	public DRB drb;
	/**
	 * This object provides monitoring of the Radio Resource Usage in the HeNB.
	 */
	@XmlElement(name = "RRU")
	public RRU rru;

	public RAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the common configuration in LTE RAN.
	 *
	 * @return the value
	 */
	public Common getCommon() {
		return common;
	}

	/**
	 * Set the this object contains parameters relating to the common configuration in LTE RAN.
	 *
	 * @param common the input value
	 */
	public void  setCommon(Common common) {
		this.common = common;
	}

	/**
	 * Set the this object contains parameters relating to the common configuration in LTE RAN.
	 *
	 * @param common the input value
	 * @return this instance
	 */
	public RAN withCommon(Common common) {
		this.common = common;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the S1AP configuration.
	 *
	 * @return the value
	 */
	public S1AP getS1aP() {
		return s1aP;
	}

	/**
	 * Set the this object contains parameters relating to the S1AP configuration.
	 *
	 * @param s1aP the input value
	 */
	public void  setS1aP(S1AP s1aP) {
		this.s1aP = s1aP;
	}

	/**
	 * Set the this object contains parameters relating to the S1AP configuration.
	 *
	 * @param s1aP the input value
	 * @return this instance
	 */
	public RAN withS1aP(S1AP s1aP) {
		this.s1aP = s1aP;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the S1-U configuration.
	 *
	 * @return the value
	 */
	public S1U getS1u() {
		return s1u;
	}

	/**
	 * Set the this object contains parameters relating to the S1-U configuration.
	 *
	 * @param s1u the input value
	 */
	public void  setS1u(S1U s1u) {
		this.s1u = s1u;
	}

	/**
	 * Set the this object contains parameters relating to the S1-U configuration.
	 *
	 * @param s1u the input value
	 * @return this instance
	 */
	public RAN withS1u(S1U s1u) {
		this.s1u = s1u;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the RF, see {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the this object contains parameters relating to the RF, see {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the this object contains parameters relating to the RF, see {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public RAN withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the physical layer level configuration.
	 *
	 * @return the value
	 */
	public PHY getPhy() {
		return phy;
	}

	/**
	 * Set the this object contains parameters relating to the physical layer level configuration.
	 *
	 * @param phy the input value
	 */
	public void  setPhy(PHY phy) {
		this.phy = phy;
	}

	/**
	 * Set the this object contains parameters relating to the physical layer level configuration.
	 *
	 * @param phy the input value
	 * @return this instance
	 */
	public RAN withPhy(PHY phy) {
		this.phy = phy;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the MAC (Medium Access Control) configuration.
	 *
	 * @return the value
	 */
	public MAC getMac() {
		return mac;
	}

	/**
	 * Set the this object contains parameters relating to the MAC (Medium Access Control) configuration.
	 *
	 * @param mac the input value
	 */
	public void  setMac(MAC mac) {
		this.mac = mac;
	}

	/**
	 * Set the this object contains parameters relating to the MAC (Medium Access Control) configuration.
	 *
	 * @param mac the input value
	 * @return this instance
	 */
	public RAN withMac(MAC mac) {
		this.mac = mac;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the RLC (Radio Link Control) configuration.
	 *
	 * @return the value
	 */
	public RLC getRlc() {
		return rlc;
	}

	/**
	 * Set the this object contains parameters relating to the RLC (Radio Link Control) configuration.
	 *
	 * @param rlc the input value
	 */
	public void  setRlc(RLC rlc) {
		this.rlc = rlc;
	}

	/**
	 * Set the this object contains parameters relating to the RLC (Radio Link Control) configuration.
	 *
	 * @param rlc the input value
	 * @return this instance
	 */
	public RAN withRlc(RLC rlc) {
		this.rlc = rlc;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the RRC timers and constants (see {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
	 *
	 * @return the value
	 */
	public RRCTimers getRrcTimers() {
		return rrcTimers;
	}

	/**
	 * Set the this object contains parameters relating to the RRC timers and constants (see {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
	 *
	 * @param rrcTimers the input value
	 */
	public void  setRrcTimers(RRCTimers rrcTimers) {
		this.rrcTimers = rrcTimers;
	}

	/**
	 * Set the this object contains parameters relating to the RRC timers and constants (see {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
	 *
	 * @param rrcTimers the input value
	 * @return this instance
	 */
	public RAN withRrcTimers(RRCTimers rrcTimers) {
		this.rrcTimers = rrcTimers;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the cell restriction configuration.
	 *
	 * @return the value
	 */
	public CellRestriction getCellRestriction() {
		return cellRestriction;
	}

	/**
	 * Set the this object contains parameters relating to the cell restriction configuration.
	 *
	 * @param cellRestriction the input value
	 */
	public void  setCellRestriction(CellRestriction cellRestriction) {
		this.cellRestriction = cellRestriction;
	}

	/**
	 * Set the this object contains parameters relating to the cell restriction configuration.
	 *
	 * @param cellRestriction the input value
	 * @return this instance
	 */
	public RAN withCellRestriction(CellRestriction cellRestriction) {
		this.cellRestriction = cellRestriction;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the UE's mobility configuration. It covers both idle mode and connected mode.
	 *
	 * @return the value
	 */
	public Mobility getMobility() {
		return mobility;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility configuration. It covers both idle mode and connected mode.
	 *
	 * @param mobility the input value
	 */
	public void  setMobility(Mobility mobility) {
		this.mobility = mobility;
	}

	/**
	 * Set the this object contains parameters relating to the UE's mobility configuration. It covers both idle mode and connected mode.
	 *
	 * @param mobility the input value
	 * @return this instance
	 */
	public RAN withMobility(Mobility mobility) {
		this.mobility = mobility;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the neighbor list.
	 *
	 * @return the value
	 */
	public NeighborList getNeighborList() {
		return neighborList;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list.
	 *
	 * @param neighborList the input value
	 */
	public void  setNeighborList(NeighborList neighborList) {
		this.neighborList = neighborList;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list.
	 *
	 * @param neighborList the input value
	 * @return this instance
	 */
	public RAN withNeighborList(NeighborList neighborList) {
		this.neighborList = neighborList;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.LTE.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @return the value
	 */
	public NeighborListInUse getNeighborListInUse() {
		return neighborListInUse;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.LTE.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @param neighborListInUse the input value
	 */
	public void  setNeighborListInUse(NeighborListInUse neighborListInUse) {
		this.neighborListInUse = neighborListInUse;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.LTE.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @param neighborListInUse the input value
	 * @return this instance
	 */
	public RAN withNeighborListInUse(NeighborListInUse neighborListInUse) {
		this.neighborListInUse = neighborListInUse;
		return this;
	}

	/**
	 * Get the this object provides monitoring of Closed Subscriber Groups (CSG) in the HeNB.
	 *
	 * @return the value
	 */
	public CSG getCsg() {
		return csg;
	}

	/**
	 * Set the this object provides monitoring of Closed Subscriber Groups (CSG) in the HeNB.
	 *
	 * @param csg the input value
	 */
	public void  setCsg(CSG csg) {
		this.csg = csg;
	}

	/**
	 * Set the this object provides monitoring of Closed Subscriber Groups (CSG) in the HeNB.
	 *
	 * @param csg the input value
	 * @return this instance
	 */
	public RAN withCsg(CSG csg) {
		this.csg = csg;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the RRC in the HeNB.
	 *
	 * @return the value
	 */
	public RRC getRrc() {
		return rrc;
	}

	/**
	 * Set the this object provides monitoring of the RRC in the HeNB.
	 *
	 * @param rrc the input value
	 */
	public void  setRrc(RRC rrc) {
		this.rrc = rrc;
	}

	/**
	 * Set the this object provides monitoring of the RRC in the HeNB.
	 *
	 * @param rrc the input value
	 * @return this instance
	 */
	public RAN withRrc(RRC rrc) {
		this.rrc = rrc;
		return this;
	}

	/**
	 * Get the this object provides monitoring of E-RABs in the HeNB.
	 *
	 * @return the value
	 */
	public ERAB getEraB() {
		return eraB;
	}

	/**
	 * Set the this object provides monitoring of E-RABs in the HeNB.
	 *
	 * @param eraB the input value
	 */
	public void  setEraB(ERAB eraB) {
		this.eraB = eraB;
	}

	/**
	 * Set the this object provides monitoring of E-RABs in the HeNB.
	 *
	 * @param eraB the input value
	 * @return this instance
	 */
	public RAN withEraB(ERAB eraB) {
		this.eraB = eraB;
		return this;
	}

	/**
	 * Get the this object provides monitoring of Data Radio Bearers (DRB) in the HeNB.
	 *
	 * @return the value
	 */
	public DRB getDrb() {
		return drb;
	}

	/**
	 * Set the this object provides monitoring of Data Radio Bearers (DRB) in the HeNB.
	 *
	 * @param drb the input value
	 */
	public void  setDrb(DRB drb) {
		this.drb = drb;
	}

	/**
	 * Set the this object provides monitoring of Data Radio Bearers (DRB) in the HeNB.
	 *
	 * @param drb the input value
	 * @return this instance
	 */
	public RAN withDrb(DRB drb) {
		this.drb = drb;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the Radio Resource Usage in the HeNB.
	 *
	 * @return the value
	 */
	public RRU getRru() {
		return rru;
	}

	/**
	 * Set the this object provides monitoring of the Radio Resource Usage in the HeNB.
	 *
	 * @param rru the input value
	 */
	public void  setRru(RRU rru) {
		this.rru = rru;
	}

	/**
	 * Set the this object provides monitoring of the Radio Resource Usage in the HeNB.
	 *
	 * @param rru the input value
	 * @return this instance
	 */
	public RAN withRru(RRU rru) {
		this.rru = rru;
		return this;
	}

	//</editor-fold>

}