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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.internetgatewaydevice.wandevice.wandslinterfaceconfig.Stats;

	/**
	 * This object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLInterfaceConfig.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDSLInterfaceConfig {

	/**
	 * Enables or disables the link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Indicates the type of modulation used on the connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ModulationType")
	public String modulationType;
	/**
	 * The line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LineEncoding")
	public String lineEncoding;
	/**
	 * Indicates whether the data path is fast (lower latency) or interleaved (lower error rate).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataPath")
	public String dataPath;
	/**
	 * ADSL Interleaved depth.  This variable is only applicable if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InterleaveDepth")
	public Long interleaveDepth;
	/**
	 * Signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LineNumber")
	@Size(min = 1)
	public Integer lineNumber;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long upstreamCurrRate;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long downstreamCurrRate;
	/**
	 * The current attainable rate (expressed in Kbps) of the upstream DSL channel.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamMaxRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long upstreamMaxRate;
	/**
	 * The current attainable rate (expressed in Kbps) of the downstream DSL channel.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamMaxRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long downstreamMaxRate;
	/**
	 * The current signal-to-noise ratio (expressed in 0.1 db) of the upstream DSL connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamNoiseMargin;
	/**
	 * The current signal-to-noise ratio (expressed in 0.1 db) of the downstream DSL connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamNoiseMargin;
	/**
	 * The current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamAttenuation;
	/**
	 * The current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamAttenuation;
	/**
	 * The current output power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamPower")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamPower;
	/**
	 * The current received power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamPower")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamPower;
	/**
	 * ATU-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURVendor")
	@Size(max = 8)
	public String atuRVendor;
	/**
	 * T.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURCountry")
	@Size(max = 4)
	public String atuRCountry;
	/**
	 * ATU-R T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURANSIStd")
	public Long atuRANSIStd;
	/**
	 * ATU-R Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURANSIRev")
	public Long atuRANSIRev;
	/**
	 * ATU-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCVendor")
	@Size(max = 8)
	public String atuCVendor;
	/**
	 * T.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCCountry")
	@Size(max = 4)
	public String atuCCountry;
	/**
	 * ATU-C T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCANSIStd")
	public Long atuCANSIStd;
	/**
	 * ATU-C Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCANSIRev")
	public Long atuCANSIRev;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalStart;
	/**
	 * Number of seconds since the most recent DSL Showtime-the beginning of the period used for collection of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long showtimeStart;
	/**
	 * Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long lastShowtimeStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourStart;
	/**
	 * This object contains statistics for a WAN DSL physical interface.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public WANDSLInterfaceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the link.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the link.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates the type of modulation used on the connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getModulationType() {
		return modulationType;
	}

	/**
	 * Set the indicates the type of modulation used on the connection.
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 */
	public void  setModulationType(String modulationType) {
		this.modulationType = modulationType;
	}

	/**
	 * Set the indicates the type of modulation used on the connection.
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withModulationType(String modulationType) {
		this.modulationType = modulationType;
		return this;
	}

	/**
	 * Get the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLineEncoding() {
		return lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @param lineEncoding the input value
	 */
	public void  setLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @param lineEncoding the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
		return this;
	}

	/**
	 * Get the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * Set the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).
	 *
	 * @since 1.0
	 * @param dataPath the input value
	 */
	public void  setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	/**
	 * Set the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).
	 *
	 * @since 1.0
	 * @param dataPath the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDataPath(String dataPath) {
		this.dataPath = dataPath;
		return this;
	}

	/**
	 * Get adsL Interleaved depth.  This variable is only applicable if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInterleaveDepth() {
		return interleaveDepth;
	}

	/**
	 * Set adsL Interleaved depth.  This variable is only applicable if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @param interleaveDepth the input value
	 */
	public void  setInterleaveDepth(Long interleaveDepth) {
		this.interleaveDepth = interleaveDepth;
	}

	/**
	 * Set adsL Interleaved depth.  This variable is only applicable if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @param interleaveDepth the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInterleaveDepth(Long interleaveDepth) {
		this.interleaveDepth = interleaveDepth;
		return this;
	}

	/**
	 * Get the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @param lineNumber the input value
	 */
	public void  setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @param lineNumber the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUpstreamCurrRate() {
		return upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @param upstreamCurrRate the input value
	 */
	public void  setUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @param upstreamCurrRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDownstreamCurrRate() {
		return downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @param downstreamCurrRate the input value
	 */
	public void  setDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @param downstreamCurrRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
		return this;
	}

	/**
	 * Get the current attainable rate (expressed in Kbps) of the upstream DSL channel.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUpstreamMaxRate() {
		return upstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the upstream DSL channel.
	 *
	 * @since 1.0
	 * @param upstreamMaxRate the input value
	 */
	public void  setUpstreamMaxRate(Long upstreamMaxRate) {
		this.upstreamMaxRate = upstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the upstream DSL channel.
	 *
	 * @since 1.0
	 * @param upstreamMaxRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamMaxRate(Long upstreamMaxRate) {
		this.upstreamMaxRate = upstreamMaxRate;
		return this;
	}

	/**
	 * Get the current attainable rate (expressed in Kbps) of the downstream DSL channel.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDownstreamMaxRate() {
		return downstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the downstream DSL channel.
	 *
	 * @since 1.0
	 * @param downstreamMaxRate the input value
	 */
	public void  setDownstreamMaxRate(Long downstreamMaxRate) {
		this.downstreamMaxRate = downstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the downstream DSL channel.
	 *
	 * @since 1.0
	 * @param downstreamMaxRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamMaxRate(Long downstreamMaxRate) {
		this.downstreamMaxRate = downstreamMaxRate;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio (expressed in 0.1 db) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamNoiseMargin() {
		return upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio (expressed in 0.1 db) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @param upstreamNoiseMargin the input value
	 */
	public void  setUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio (expressed in 0.1 db) of the upstream DSL connection.
	 *
	 * @since 1.0
	 * @param upstreamNoiseMargin the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio (expressed in 0.1 db) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamNoiseMargin() {
		return downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio (expressed in 0.1 db) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @param downstreamNoiseMargin the input value
	 */
	public void  setDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio (expressed in 0.1 db) of the downstream DSL connection.
	 *
	 * @since 1.0
	 * @param downstreamNoiseMargin the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamAttenuation() {
		return upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param upstreamAttenuation the input value
	 */
	public void  setUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param upstreamAttenuation the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
		return this;
	}

	/**
	 * Get the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamAttenuation() {
		return downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param downstreamAttenuation the input value
	 */
	public void  setDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param downstreamAttenuation the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
		return this;
	}

	/**
	 * Get the current output power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamPower() {
		return upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @param upstreamPower the input value
	 */
	public void  setUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @param upstreamPower the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
		return this;
	}

	/**
	 * Get the current received power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamPower() {
		return downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @param downstreamPower the input value
	 */
	public void  setDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL interface (expressed in 0.1 dBmV),
	 *
	 * @since 1.0
	 * @param downstreamPower the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
		return this;
	}

	/**
	 * Get atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuRVendor() {
		return atuRVendor;
	}

	/**
	 * Set atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuRVendor the input value
	 */
	public void  setAtuRVendor(String atuRVendor) {
		this.atuRVendor = atuRVendor;
	}

	/**
	 * Set atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuRVendor the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRVendor(String atuRVendor) {
		this.atuRVendor = atuRVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuRCountry() {
		return atuRCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuRCountry the input value
	 */
	public void  setAtuRCountry(String atuRCountry) {
		this.atuRCountry = atuRCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuRCountry the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRCountry(String atuRCountry) {
		this.atuRCountry = atuRCountry;
		return this;
	}

	/**
	 * Get atu-R T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuRANSIStd() {
		return atuRANSIStd;
	}

	/**
	 * Set atu-R T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuRANSIStd the input value
	 */
	public void  setAtuRANSIStd(Long atuRANSIStd) {
		this.atuRANSIStd = atuRANSIStd;
	}

	/**
	 * Set atu-R T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuRANSIStd the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRANSIStd(Long atuRANSIStd) {
		this.atuRANSIStd = atuRANSIStd;
		return this;
	}

	/**
	 * Get atu-R Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuRANSIRev() {
		return atuRANSIRev;
	}

	/**
	 * Set atu-R Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuRANSIRev the input value
	 */
	public void  setAtuRANSIRev(Long atuRANSIRev) {
		this.atuRANSIRev = atuRANSIRev;
	}

	/**
	 * Set atu-R Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuRANSIRev the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRANSIRev(Long atuRANSIRev) {
		this.atuRANSIRev = atuRANSIRev;
		return this;
	}

	/**
	 * Get atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuCVendor() {
		return atuCVendor;
	}

	/**
	 * Set atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuCVendor the input value
	 */
	public void  setAtuCVendor(String atuCVendor) {
		this.atuCVendor = atuCVendor;
	}

	/**
	 * Set atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuCVendor the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCVendor(String atuCVendor) {
		this.atuCVendor = atuCVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuCCountry() {
		return atuCCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuCCountry the input value
	 */
	public void  setAtuCCountry(String atuCCountry) {
		this.atuCCountry = atuCCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.
	 *
	 * @since 1.0
	 * @param atuCCountry the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCCountry(String atuCCountry) {
		this.atuCCountry = atuCCountry;
		return this;
	}

	/**
	 * Get atu-C T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCANSIStd() {
		return atuCANSIStd;
	}

	/**
	 * Set atu-C T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuCANSIStd the input value
	 */
	public void  setAtuCANSIStd(Long atuCANSIStd) {
		this.atuCANSIStd = atuCANSIStd;
	}

	/**
	 * Set atu-C T1.413 Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuCANSIStd the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCANSIStd(Long atuCANSIStd) {
		this.atuCANSIStd = atuCANSIStd;
		return this;
	}

	/**
	 * Get atu-C Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCANSIRev() {
		return atuCANSIRev;
	}

	/**
	 * Set atu-C Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuCANSIRev the input value
	 */
	public void  setAtuCANSIRev(Long atuCANSIRev) {
		this.atuCANSIRev = atuCANSIRev;
	}

	/**
	 * Set atu-C Vendor Revision Number as defined in T1.413 Issue 2.
	 *
	 * @since 1.0
	 * @param atuCANSIRev the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCANSIRev(Long atuCANSIRev) {
		this.atuCANSIRev = atuCANSIRev;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalStart() {
		return totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 */
	public void  setTotalStart(Long totalStart) {
		this.totalStart = totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withTotalStart(Long totalStart) {
		this.totalStart = totalStart;
		return this;
	}

	/**
	 * Get the number of seconds since the most recent DSL Showtime-the beginning of the period used for collection of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getShowtimeStart() {
		return showtimeStart;
	}

	/**
	 * Set the number of seconds since the most recent DSL Showtime-the beginning of the period used for collection of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param showtimeStart the input value
	 */
	public void  setShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
	}

	/**
	 * Set the number of seconds since the most recent DSL Showtime-the beginning of the period used for collection of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param showtimeStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
		return this;
	}

	/**
	 * Get the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLastShowtimeStart() {
		return lastShowtimeStart;
	}

	/**
	 * Set the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param lastShowtimeStart the input value
	 */
	public void  setLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
	}

	/**
	 * Set the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param lastShowtimeStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayStart() {
		return currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 */
	public void  setCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourStart() {
		return quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 */
	public void  setQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
		return this;
	}

	/**
	 * Get the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}