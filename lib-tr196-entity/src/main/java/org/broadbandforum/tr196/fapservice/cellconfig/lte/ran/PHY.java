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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.AntennaInfo;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.MBSFN;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.PDSCH;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.PRACH;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.PRS;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.PUCCH;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.PUSCH;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.SRS;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.TDDFrame;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.ULPowerControl;

	/**
	 * This object contains parameters relating to the physical layer level configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY")
@XmlAccessorType(XmlAccessType.FIELD)
public class PHY {

	/**
	 * This object contains parameters relating to the antenna configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
	 */
	@XmlElement(name = "AntennaInfo")
	public AntennaInfo antennaInfo;
	/**
	 * This object contains parameters relating to the PDSCH (Physical Downlink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
	 */
	@XmlElement(name = "PDSCH")
	public PDSCH pdsCH;
	/**
	 * This object contains parameters relating to the UL SRS (Sounding Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
	 */
	@XmlElement(name = "SRS")
	public SRS srs;
	/**
	 * This object contains parameters relating to the PRACH (Physical Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
	 */
	@XmlElement(name = "PRACH")
	public PRACH praCH;
	/**
	 * This object contains parameters relating to the PUCCH (Physical Uplink Control Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
	 */
	@XmlElement(name = "PUCCH")
	public PUCCH pucCH;
	/**
	 * This object contains parameters relating to the PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
	 */
	@XmlElement(name = "PUSCH")
	public PUSCH pusCH;
	/**
	 * This object contains parameters relating to the uplink power control configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
	 */
	@XmlElement(name = "ULPowerControl")
	public ULPowerControl ulpowerControl;
	/**
	 * This object contains parameters relating to the MBSFN (Multimedia Broadcast multicast service Single Frequency Network) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 */
	@XmlElement(name = "MBSFN")
	public MBSFN mbsFN;
	/**
	 * This object contains parameters relating to the PRS (Positioning Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
	 */
	@XmlElement(name = "PRS")
	public PRS prs;
	/**
	 * This object is applicable to TDD mode only. This object contains parameters relating to the TDD frame structure configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
	 */
	@XmlElement(name = "TDDFrame")
	public TDDFrame tddFrame;

	public PHY() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the antenna configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
	 *
	 * @return the value
	 */
	public AntennaInfo getAntennaInfo() {
		return antennaInfo;
	}

	/**
	 * Set the this object contains parameters relating to the antenna configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
	 *
	 * @param antennaInfo the input value
	 */
	public void  setAntennaInfo(AntennaInfo antennaInfo) {
		this.antennaInfo = antennaInfo;
	}

	/**
	 * Set the this object contains parameters relating to the antenna configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
	 *
	 * @param antennaInfo the input value
	 * @return this instance
	 */
	public PHY withAntennaInfo(AntennaInfo antennaInfo) {
		this.antennaInfo = antennaInfo;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the PDSCH (Physical Downlink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
	 *
	 * @return the value
	 */
	public PDSCH getPdsCH() {
		return pdsCH;
	}

	/**
	 * Set the this object contains parameters relating to the PDSCH (Physical Downlink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
	 *
	 * @param pdsCH the input value
	 */
	public void  setPdsCH(PDSCH pdsCH) {
		this.pdsCH = pdsCH;
	}

	/**
	 * Set the this object contains parameters relating to the PDSCH (Physical Downlink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
	 *
	 * @param pdsCH the input value
	 * @return this instance
	 */
	public PHY withPdsCH(PDSCH pdsCH) {
		this.pdsCH = pdsCH;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the UL SRS (Sounding Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
	 *
	 * @return the value
	 */
	public SRS getSrs() {
		return srs;
	}

	/**
	 * Set the this object contains parameters relating to the UL SRS (Sounding Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
	 *
	 * @param srs the input value
	 */
	public void  setSrs(SRS srs) {
		this.srs = srs;
	}

	/**
	 * Set the this object contains parameters relating to the UL SRS (Sounding Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
	 *
	 * @param srs the input value
	 * @return this instance
	 */
	public PHY withSrs(SRS srs) {
		this.srs = srs;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the PRACH (Physical Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
	 *
	 * @return the value
	 */
	public PRACH getPraCH() {
		return praCH;
	}

	/**
	 * Set the this object contains parameters relating to the PRACH (Physical Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
	 *
	 * @param praCH the input value
	 */
	public void  setPraCH(PRACH praCH) {
		this.praCH = praCH;
	}

	/**
	 * Set the this object contains parameters relating to the PRACH (Physical Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
	 *
	 * @param praCH the input value
	 * @return this instance
	 */
	public PHY withPraCH(PRACH praCH) {
		this.praCH = praCH;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the PUCCH (Physical Uplink Control Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
	 *
	 * @return the value
	 */
	public PUCCH getPucCH() {
		return pucCH;
	}

	/**
	 * Set the this object contains parameters relating to the PUCCH (Physical Uplink Control Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
	 *
	 * @param pucCH the input value
	 */
	public void  setPucCH(PUCCH pucCH) {
		this.pucCH = pucCH;
	}

	/**
	 * Set the this object contains parameters relating to the PUCCH (Physical Uplink Control Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
	 *
	 * @param pucCH the input value
	 * @return this instance
	 */
	public PHY withPucCH(PUCCH pucCH) {
		this.pucCH = pucCH;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
	 *
	 * @return the value
	 */
	public PUSCH getPusCH() {
		return pusCH;
	}

	/**
	 * Set the this object contains parameters relating to the PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
	 *
	 * @param pusCH the input value
	 */
	public void  setPusCH(PUSCH pusCH) {
		this.pusCH = pusCH;
	}

	/**
	 * Set the this object contains parameters relating to the PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
	 *
	 * @param pusCH the input value
	 * @return this instance
	 */
	public PHY withPusCH(PUSCH pusCH) {
		this.pusCH = pusCH;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the uplink power control configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
	 *
	 * @return the value
	 */
	public ULPowerControl getUlpowerControl() {
		return ulpowerControl;
	}

	/**
	 * Set the this object contains parameters relating to the uplink power control configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
	 *
	 * @param ulpowerControl the input value
	 */
	public void  setUlpowerControl(ULPowerControl ulpowerControl) {
		this.ulpowerControl = ulpowerControl;
	}

	/**
	 * Set the this object contains parameters relating to the uplink power control configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
	 *
	 * @param ulpowerControl the input value
	 * @return this instance
	 */
	public PHY withUlpowerControl(ULPowerControl ulpowerControl) {
		this.ulpowerControl = ulpowerControl;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the MBSFN (Multimedia Broadcast multicast service Single Frequency Network) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @return the value
	 */
	public MBSFN getMbsFN() {
		return mbsFN;
	}

	/**
	 * Set the this object contains parameters relating to the MBSFN (Multimedia Broadcast multicast service Single Frequency Network) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @param mbsFN the input value
	 */
	public void  setMbsFN(MBSFN mbsFN) {
		this.mbsFN = mbsFN;
	}

	/**
	 * Set the this object contains parameters relating to the MBSFN (Multimedia Broadcast multicast service Single Frequency Network) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @param mbsFN the input value
	 * @return this instance
	 */
	public PHY withMbsFN(MBSFN mbsFN) {
		this.mbsFN = mbsFN;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the PRS (Positioning Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
	 *
	 * @return the value
	 */
	public PRS getPrs() {
		return prs;
	}

	/**
	 * Set the this object contains parameters relating to the PRS (Positioning Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
	 *
	 * @param prs the input value
	 */
	public void  setPrs(PRS prs) {
		this.prs = prs;
	}

	/**
	 * Set the this object contains parameters relating to the PRS (Positioning Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
	 *
	 * @param prs the input value
	 * @return this instance
	 */
	public PHY withPrs(PRS prs) {
		this.prs = prs;
		return this;
	}

	/**
	 * Get the this object is applicable to TDD mode only. This object contains parameters relating to the TDD frame structure configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
	 *
	 * @return the value
	 */
	public TDDFrame getTddFrame() {
		return tddFrame;
	}

	/**
	 * Set the this object is applicable to TDD mode only. This object contains parameters relating to the TDD frame structure configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
	 *
	 * @param tddFrame the input value
	 */
	public void  setTddFrame(TDDFrame tddFrame) {
		this.tddFrame = tddFrame;
	}

	/**
	 * Set the this object is applicable to TDD mode only. This object contains parameters relating to the TDD frame structure configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.10}}).
	 *
	 * @param tddFrame the input value
	 * @return this instance
	 */
	public PHY withTddFrame(TDDFrame tddFrame) {
		this.tddFrame = tddFrame;
		return this;
	}

	//</editor-fold>

}