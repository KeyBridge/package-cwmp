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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.hrpd.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * RF REM results for each detected cell.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.RF.")
@XmlRootElement(name = "FAPService.REM.CDMA2000.HRPD.Cell.RF")
@XmlType(name = "FAPService.REM.CDMA2000.HRPD.Cell.RF")
@XmlAccessorType(XmlAccessType.FIELD)
public class RF {

	/**
	 * CDMA band for the reported cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Band")
	public Integer band;
	/**
	 * The Radio Frequency Channel Number (RFCN) in the FL direction for the reported cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFL")
	@Size(min = 0, max = 2016)
	public Long rfcNFL;
	/**
	 * The total received power spectral density in dBm, including signal and interference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Io")
	@CWMPParameter(activeNotify = "canDeny", units = "dBm")
	@Size(min = -105, max = -25)
	public Integer io;
	/**
	 * Pilot PN Offset (in units of 64 PN chips).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PIlotPN")
	@CWMPParameter(activeNotify = "canDeny", units = "64 PN chips")
	@Size(min = 0, max = 511)
	public Long pilotPN;
	/**
	 * Pilot PN phase in chips.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PIlotPNPhase")
	@CWMPParameter(activeNotify = "canDeny", units = "chips")
	public Long pilotPNPhase;
	/**
	 * The strength estimate of the received pilot energy per chip in dBm.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotStrengthEcp")
	@CWMPParameter(activeNotify = "canDeny", units = "dBm")
	@Size(min = -130, max = -25)
	public Integer pilotStrengthEcp;
	/**
	 * The strength estimate of the received pilot energy per chip, Ecp, to total received spectral density, Io (signal and noise) in dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotStrengthEcpIo")
	@CWMPParameter(activeNotify = "canDeny", units = "dB")
	@Size(min = -25, max = 0)
	public Integer pilotStrengthEcpIo;
	/**
	 * If set to {{true}}, the overhead messages for this particular cell is included in {{object|.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OverheadsAvailable")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean overheadsAvailable;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the cdmA band for the reported cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBand() {
		return band;
	}

	/**
	 * Set the cdmA band for the reported cell.
	 *
	 * @since 2.0
	 * @param band the input value
	 */
	public void  setBand(Integer band) {
		this.band = band;
	}

	/**
	 * Set the cdmA band for the reported cell.
	 *
	 * @since 2.0
	 * @param band the input value
	 * @return this instance
	 */
	public RF withBand(Integer band) {
		this.band = band;
		return this;
	}

	/**
	 * Get the Radio Frequency Channel Number (RFCN) in the FL direction for the reported cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRfcNFL() {
		return rfcNFL;
	}

	/**
	 * Set the Radio Frequency Channel Number (RFCN) in the FL direction for the reported cell.
	 *
	 * @since 2.0
	 * @param rfcNFL the input value
	 */
	public void  setRfcNFL(Long rfcNFL) {
		this.rfcNFL = rfcNFL;
	}

	/**
	 * Set the Radio Frequency Channel Number (RFCN) in the FL direction for the reported cell.
	 *
	 * @since 2.0
	 * @param rfcNFL the input value
	 * @return this instance
	 */
	public RF withRfcNFL(Long rfcNFL) {
		this.rfcNFL = rfcNFL;
		return this;
	}

	/**
	 * Get the total received power spectral density in dBm, including signal and interference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getIo() {
		return io;
	}

	/**
	 * Set the total received power spectral density in dBm, including signal and interference.
	 *
	 * @since 2.0
	 * @param io the input value
	 */
	public void  setIo(Integer io) {
		this.io = io;
	}

	/**
	 * Set the total received power spectral density in dBm, including signal and interference.
	 *
	 * @since 2.0
	 * @param io the input value
	 * @return this instance
	 */
	public RF withIo(Integer io) {
		this.io = io;
		return this;
	}

	/**
	 * Get the pilot PN Offset (in units of 64 PN chips).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotPN() {
		return pilotPN;
	}

	/**
	 * Set the pilot PN Offset (in units of 64 PN chips).
	 *
	 * @since 2.0
	 * @param pilotPN the input value
	 */
	public void  setPilotPN(Long pilotPN) {
		this.pilotPN = pilotPN;
	}

	/**
	 * Set the pilot PN Offset (in units of 64 PN chips).
	 *
	 * @since 2.0
	 * @param pilotPN the input value
	 * @return this instance
	 */
	public RF withPilotPN(Long pilotPN) {
		this.pilotPN = pilotPN;
		return this;
	}

	/**
	 * Get the pilot PN phase in chips.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotPNPhase() {
		return pilotPNPhase;
	}

	/**
	 * Set the pilot PN phase in chips.
	 *
	 * @since 2.0
	 * @param pilotPNPhase the input value
	 */
	public void  setPilotPNPhase(Long pilotPNPhase) {
		this.pilotPNPhase = pilotPNPhase;
	}

	/**
	 * Set the pilot PN phase in chips.
	 *
	 * @since 2.0
	 * @param pilotPNPhase the input value
	 * @return this instance
	 */
	public RF withPilotPNPhase(Long pilotPNPhase) {
		this.pilotPNPhase = pilotPNPhase;
		return this;
	}

	/**
	 * Get the strength estimate of the received pilot energy per chip in dBm.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPilotStrengthEcp() {
		return pilotStrengthEcp;
	}

	/**
	 * Set the strength estimate of the received pilot energy per chip in dBm.
	 *
	 * @since 2.0
	 * @param pilotStrengthEcp the input value
	 */
	public void  setPilotStrengthEcp(Integer pilotStrengthEcp) {
		this.pilotStrengthEcp = pilotStrengthEcp;
	}

	/**
	 * Set the strength estimate of the received pilot energy per chip in dBm.
	 *
	 * @since 2.0
	 * @param pilotStrengthEcp the input value
	 * @return this instance
	 */
	public RF withPilotStrengthEcp(Integer pilotStrengthEcp) {
		this.pilotStrengthEcp = pilotStrengthEcp;
		return this;
	}

	/**
	 * Get the strength estimate of the received pilot energy per chip, Ecp, to total received spectral density, Io (signal and noise) in dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPilotStrengthEcpIo() {
		return pilotStrengthEcpIo;
	}

	/**
	 * Set the strength estimate of the received pilot energy per chip, Ecp, to total received spectral density, Io (signal and noise) in dB.
	 *
	 * @since 2.0
	 * @param pilotStrengthEcpIo the input value
	 */
	public void  setPilotStrengthEcpIo(Integer pilotStrengthEcpIo) {
		this.pilotStrengthEcpIo = pilotStrengthEcpIo;
	}

	/**
	 * Set the strength estimate of the received pilot energy per chip, Ecp, to total received spectral density, Io (signal and noise) in dB.
	 *
	 * @since 2.0
	 * @param pilotStrengthEcpIo the input value
	 * @return this instance
	 */
	public RF withPilotStrengthEcpIo(Integer pilotStrengthEcpIo) {
		this.pilotStrengthEcpIo = pilotStrengthEcpIo;
		return this;
	}

	/**
	 * Get the if set to {{true}}, the overhead messages for this particular cell is included in {{object|.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isOverheadsAvailable() {
		return overheadsAvailable;
	}

	/**
	 * Set the if set to {{true}}, the overhead messages for this particular cell is included in {{object|.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.}}.
	 *
	 * @since 2.0
	 * @param overheadsAvailable the input value
	 */
	public void  setOverheadsAvailable(Boolean overheadsAvailable) {
		this.overheadsAvailable = overheadsAvailable;
	}

	/**
	 * Set the if set to {{true}}, the overhead messages for this particular cell is included in {{object|.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.}}.
	 *
	 * @since 2.0
	 * @param overheadsAvailable the input value
	 * @return this instance
	 */
	public RF withOverheadsAvailable(Boolean overheadsAvailable) {
		this.overheadsAvailable = overheadsAvailable;
		return this;
	}

	//</editor-fold>

}