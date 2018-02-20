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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains DSL statistics accumulated since the most recent DSL Showtime.
	 *
	 * @since TR143 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLInterfaceConfig.Stats.Showtime.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig.Stats.Showtime")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig.Stats.Showtime")
@XmlAccessorType(XmlAccessType.FIELD)
public class Showtime {

	/**
	 * Number of successfully received blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReceiveBlocks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long receiveBlocks;
	/**
	 * Number of successfully transmitted blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TransmitBlocks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long transmitBlocks;
	/**
	 * Number of cell-delineation errors since the most recent DSL Showtime (total seconds with NCD or LCD failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CellDelin")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cellDelin;
	/**
	 * Number of link-retrain errors since the most recent DSL Showtime (Full Initialization Count as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkRetrain")
	@CWMPParameter(activeNotify = "canDeny")
	public Long linkRetrain;
	/**
	 * Number of initialization errors since the most recent DSL Showtime (LINIT failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InitErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long initErrors;
	/**
	 * Number of initialization timeout errors since the most recent DSL Showtime.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InitTimeouts")
	@CWMPParameter(activeNotify = "canDeny")
	public Long initTimeouts;
	/**
	 * Number of loss-of-framing errors since the most recent DSL Showtime (LOF failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LossOfFraming")
	@CWMPParameter(activeNotify = "canDeny")
	public Long lossOfFraming;
	/**
	 * Number of errored seconds since the most recent DSL Showtime (ES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ErroredSecs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long erroredSecs;
	/**
	 * Number of severely errored seconds since the most recent DSL Showtime (SES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SeverelyErroredSecs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long severelyErroredSecs;
	/**
	 * Number of FEC errors detected since the most recent DSL Showtime (FEC-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long fecErrors;
	/**
	 * Number of FEC errors detected by the ATU-C since the most recent DSL Showtime (FEC-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCFECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long atuCFECErrors;
	/**
	 * Number of HEC errors detected since the most recent DSL Showtime (HEC-P as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hecErrors;
	/**
	 * Number of HEC errors detected by the ATU-C since the most recent DSL Showtime (HEC-PFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCHECErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long atuCHECErrors;
	/**
	 * Number of CRC errors detected since the most recent DSL Showtime (CV-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CRCErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long crcErrors;
	/**
	 * Number of CRC errors detected by the ATU-C since the most recent DSL Showtime (CV-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCCRCErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long atuCCRCErrors;

	public Showtime() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of successfully received blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getReceiveBlocks() {
		return receiveBlocks;
	}

	/**
	 * Set the number of successfully received blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @param receiveBlocks the input value
	 */
	public void  setReceiveBlocks(Long receiveBlocks) {
		this.receiveBlocks = receiveBlocks;
	}

	/**
	 * Set the number of successfully received blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @param receiveBlocks the input value
	 * @return this instance
	 */
	public Showtime withReceiveBlocks(Long receiveBlocks) {
		this.receiveBlocks = receiveBlocks;
		return this;
	}

	/**
	 * Get the number of successfully transmitted blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTransmitBlocks() {
		return transmitBlocks;
	}

	/**
	 * Set the number of successfully transmitted blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @param transmitBlocks the input value
	 */
	public void  setTransmitBlocks(Long transmitBlocks) {
		this.transmitBlocks = transmitBlocks;
	}

	/**
	 * Set the number of successfully transmitted blocks since the most recent DSL Showtime, where a block is as defined in RFC 2662.
	 *
	 * @since 1.0
	 * @param transmitBlocks the input value
	 * @return this instance
	 */
	public Showtime withTransmitBlocks(Long transmitBlocks) {
		this.transmitBlocks = transmitBlocks;
		return this;
	}

	/**
	 * Get the number of cell-delineation errors since the most recent DSL Showtime (total seconds with NCD or LCD failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCellDelin() {
		return cellDelin;
	}

	/**
	 * Set the number of cell-delineation errors since the most recent DSL Showtime (total seconds with NCD or LCD failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param cellDelin the input value
	 */
	public void  setCellDelin(Long cellDelin) {
		this.cellDelin = cellDelin;
	}

	/**
	 * Set the number of cell-delineation errors since the most recent DSL Showtime (total seconds with NCD or LCD failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param cellDelin the input value
	 * @return this instance
	 */
	public Showtime withCellDelin(Long cellDelin) {
		this.cellDelin = cellDelin;
		return this;
	}

	/**
	 * Get the number of link-retrain errors since the most recent DSL Showtime (Full Initialization Count as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLinkRetrain() {
		return linkRetrain;
	}

	/**
	 * Set the number of link-retrain errors since the most recent DSL Showtime (Full Initialization Count as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param linkRetrain the input value
	 */
	public void  setLinkRetrain(Long linkRetrain) {
		this.linkRetrain = linkRetrain;
	}

	/**
	 * Set the number of link-retrain errors since the most recent DSL Showtime (Full Initialization Count as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param linkRetrain the input value
	 * @return this instance
	 */
	public Showtime withLinkRetrain(Long linkRetrain) {
		this.linkRetrain = linkRetrain;
		return this;
	}

	/**
	 * Get the number of initialization errors since the most recent DSL Showtime (LINIT failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInitErrors() {
		return initErrors;
	}

	/**
	 * Set the number of initialization errors since the most recent DSL Showtime (LINIT failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param initErrors the input value
	 */
	public void  setInitErrors(Long initErrors) {
		this.initErrors = initErrors;
	}

	/**
	 * Set the number of initialization errors since the most recent DSL Showtime (LINIT failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param initErrors the input value
	 * @return this instance
	 */
	public Showtime withInitErrors(Long initErrors) {
		this.initErrors = initErrors;
		return this;
	}

	/**
	 * Get the number of initialization timeout errors since the most recent DSL Showtime.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInitTimeouts() {
		return initTimeouts;
	}

	/**
	 * Set the number of initialization timeout errors since the most recent DSL Showtime.
	 *
	 * @since 1.0
	 * @param initTimeouts the input value
	 */
	public void  setInitTimeouts(Long initTimeouts) {
		this.initTimeouts = initTimeouts;
	}

	/**
	 * Set the number of initialization timeout errors since the most recent DSL Showtime.
	 *
	 * @since 1.0
	 * @param initTimeouts the input value
	 * @return this instance
	 */
	public Showtime withInitTimeouts(Long initTimeouts) {
		this.initTimeouts = initTimeouts;
		return this;
	}

	/**
	 * Get the number of loss-of-framing errors since the most recent DSL Showtime (LOF failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLossOfFraming() {
		return lossOfFraming;
	}

	/**
	 * Set the number of loss-of-framing errors since the most recent DSL Showtime (LOF failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param lossOfFraming the input value
	 */
	public void  setLossOfFraming(Long lossOfFraming) {
		this.lossOfFraming = lossOfFraming;
	}

	/**
	 * Set the number of loss-of-framing errors since the most recent DSL Showtime (LOF failures as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param lossOfFraming the input value
	 * @return this instance
	 */
	public Showtime withLossOfFraming(Long lossOfFraming) {
		this.lossOfFraming = lossOfFraming;
		return this;
	}

	/**
	 * Get the number of errored seconds since the most recent DSL Showtime (ES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getErroredSecs() {
		return erroredSecs;
	}

	/**
	 * Set the number of errored seconds since the most recent DSL Showtime (ES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param erroredSecs the input value
	 */
	public void  setErroredSecs(Long erroredSecs) {
		this.erroredSecs = erroredSecs;
	}

	/**
	 * Set the number of errored seconds since the most recent DSL Showtime (ES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param erroredSecs the input value
	 * @return this instance
	 */
	public Showtime withErroredSecs(Long erroredSecs) {
		this.erroredSecs = erroredSecs;
		return this;
	}

	/**
	 * Get the number of severely errored seconds since the most recent DSL Showtime (SES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSeverelyErroredSecs() {
		return severelyErroredSecs;
	}

	/**
	 * Set the number of severely errored seconds since the most recent DSL Showtime (SES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param severelyErroredSecs the input value
	 */
	public void  setSeverelyErroredSecs(Long severelyErroredSecs) {
		this.severelyErroredSecs = severelyErroredSecs;
	}

	/**
	 * Set the number of severely errored seconds since the most recent DSL Showtime (SES-L as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param severelyErroredSecs the input value
	 * @return this instance
	 */
	public Showtime withSeverelyErroredSecs(Long severelyErroredSecs) {
		this.severelyErroredSecs = severelyErroredSecs;
		return this;
	}

	/**
	 * Get the number of FEC errors detected since the most recent DSL Showtime (FEC-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFecErrors() {
		return fecErrors;
	}

	/**
	 * Set the number of FEC errors detected since the most recent DSL Showtime (FEC-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param fecErrors the input value
	 */
	public void  setFecErrors(Long fecErrors) {
		this.fecErrors = fecErrors;
	}

	/**
	 * Set the number of FEC errors detected since the most recent DSL Showtime (FEC-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param fecErrors the input value
	 * @return this instance
	 */
	public Showtime withFecErrors(Long fecErrors) {
		this.fecErrors = fecErrors;
		return this;
	}

	/**
	 * Get the number of FEC errors detected by the ATU-C since the most recent DSL Showtime (FEC-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCFECErrors() {
		return atuCFECErrors;
	}

	/**
	 * Set the number of FEC errors detected by the ATU-C since the most recent DSL Showtime (FEC-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCFECErrors the input value
	 */
	public void  setAtuCFECErrors(Long atuCFECErrors) {
		this.atuCFECErrors = atuCFECErrors;
	}

	/**
	 * Set the number of FEC errors detected by the ATU-C since the most recent DSL Showtime (FEC-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCFECErrors the input value
	 * @return this instance
	 */
	public Showtime withAtuCFECErrors(Long atuCFECErrors) {
		this.atuCFECErrors = atuCFECErrors;
		return this;
	}

	/**
	 * Get the number of HEC errors detected since the most recent DSL Showtime (HEC-P as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getHecErrors() {
		return hecErrors;
	}

	/**
	 * Set the number of HEC errors detected since the most recent DSL Showtime (HEC-P as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param hecErrors the input value
	 */
	public void  setHecErrors(Long hecErrors) {
		this.hecErrors = hecErrors;
	}

	/**
	 * Set the number of HEC errors detected since the most recent DSL Showtime (HEC-P as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param hecErrors the input value
	 * @return this instance
	 */
	public Showtime withHecErrors(Long hecErrors) {
		this.hecErrors = hecErrors;
		return this;
	}

	/**
	 * Get the number of HEC errors detected by the ATU-C since the most recent DSL Showtime (HEC-PFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCHECErrors() {
		return atuCHECErrors;
	}

	/**
	 * Set the number of HEC errors detected by the ATU-C since the most recent DSL Showtime (HEC-PFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCHECErrors the input value
	 */
	public void  setAtuCHECErrors(Long atuCHECErrors) {
		this.atuCHECErrors = atuCHECErrors;
	}

	/**
	 * Set the number of HEC errors detected by the ATU-C since the most recent DSL Showtime (HEC-PFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCHECErrors the input value
	 * @return this instance
	 */
	public Showtime withAtuCHECErrors(Long atuCHECErrors) {
		this.atuCHECErrors = atuCHECErrors;
		return this;
	}

	/**
	 * Get the number of CRC errors detected since the most recent DSL Showtime (CV-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCrcErrors() {
		return crcErrors;
	}

	/**
	 * Set the number of CRC errors detected since the most recent DSL Showtime (CV-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param crcErrors the input value
	 */
	public void  setCrcErrors(Long crcErrors) {
		this.crcErrors = crcErrors;
	}

	/**
	 * Set the number of CRC errors detected since the most recent DSL Showtime (CV-C as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param crcErrors the input value
	 * @return this instance
	 */
	public Showtime withCrcErrors(Long crcErrors) {
		this.crcErrors = crcErrors;
		return this;
	}

	/**
	 * Get the number of CRC errors detected by the ATU-C since the most recent DSL Showtime (CV-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCCRCErrors() {
		return atuCCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected by the ATU-C since the most recent DSL Showtime (CV-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCCRCErrors the input value
	 */
	public void  setAtuCCRCErrors(Long atuCCRCErrors) {
		this.atuCCRCErrors = atuCCRCErrors;
	}

	/**
	 * Set the number of CRC errors detected by the ATU-C since the most recent DSL Showtime (CV-CFE as defined in ITU-T Rec. G.997.1).
	 *
	 * @since 1.0
	 * @param atuCCRCErrors the input value
	 * @return this instance
	 */
	public Showtime withAtuCCRCErrors(Long atuCCRCErrors) {
		this.atuCCRCErrors = atuCCRCErrors;
		return this;
	}

	//</editor-fold>

}