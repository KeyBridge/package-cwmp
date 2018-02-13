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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is required for a CPE with an ADSL2 or ADSL2+ modem WAN interface, and optional otherwise.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLDiagnostics.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANDSLDiagnostics")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDSLDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test, which brings down the DSL connection while the test is operating.  When writing, the only allowed value is {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed, the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the corresponding reason in the Inform message.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LoopDiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public String loopDiagnosticsState;
	/**
	 * Downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ACTPSDds")
	public Integer actPSDds;
	/**
	 * Upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ACTPSDus")
	public Integer actPSDus;
	/**
	 * Downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ACTATPds")
	public Integer actATPds;
	/**
	 * Upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ACTATPus")
	public Integer actATPus;
	/**
	 * Downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HLINSCds")
	public Integer hliNSCds;
	/**
	 * Downstream linear channel characteristics per subcarrier.  Each successive pair of integers represents the real and imaginary parts of each complex value.  Maximum number of complex pairs is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HLINpsds")
	public Integer hliNpsds;
	/**
	 * Downstream quiet line noise per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QLNpsds")
	public Integer qlnpsds;
	/**
	 * Downstream SNR per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SNRpsds")
	public Integer snrpsds;
	/**
	 * Downstream bit allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BITSpsds")
	public Integer bitSpsds;
	/**
	 * Downstream gain allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GAINSpsds")
	public Integer gaiNSpsds;

	public WANDSLDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test, which brings down the DSL connection while the test is operating.  When writing, the only allowed value is {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed, the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the corresponding reason in the Inform message.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLoopDiagnosticsState() {
		return loopDiagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test, which brings down the DSL connection while the test is operating.  When writing, the only allowed value is {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed, the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the corresponding reason in the Inform message.
	 *
	 * @since 1.0
	 * @param loopDiagnosticsState the input value
	 */
	public void  setLoopDiagnosticsState(String loopDiagnosticsState) {
		this.loopDiagnosticsState = loopDiagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test, which brings down the DSL connection while the test is operating.  When writing, the only allowed value is {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed, the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the corresponding reason in the Inform message.
	 *
	 * @since 1.0
	 * @param loopDiagnosticsState the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withLoopDiagnosticsState(String loopDiagnosticsState) {
		this.loopDiagnosticsState = loopDiagnosticsState;
		return this;
	}

	/**
	 * Get the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getActPSDds() {
		return actPSDds;
	}

	/**
	 * Set the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actPSDds the input value
	 */
	public void  setActPSDds(Integer actPSDds) {
		this.actPSDds = actPSDds;
	}

	/**
	 * Set the downstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actPSDds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withActPSDds(Integer actPSDds) {
		this.actPSDds = actPSDds;
		return this;
	}

	/**
	 * Get the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getActPSDus() {
		return actPSDus;
	}

	/**
	 * Set the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actPSDus the input value
	 */
	public void  setActPSDus(Integer actPSDus) {
		this.actPSDus = actPSDus;
	}

	/**
	 * Set the upstream actual power spectral density.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actPSDus the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withActPSDus(Integer actPSDus) {
		this.actPSDus = actPSDus;
		return this;
	}

	/**
	 * Get the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getActATPds() {
		return actATPds;
	}

	/**
	 * Set the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actATPds the input value
	 */
	public void  setActATPds(Integer actATPds) {
		this.actATPds = actATPds;
	}

	/**
	 * Set the downstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actATPds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withActATPds(Integer actATPds) {
		this.actATPds = actATPds;
		return this;
	}

	/**
	 * Get the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getActATPus() {
		return actATPus;
	}

	/**
	 * Set the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actATPus the input value
	 */
	public void  setActATPus(Integer actATPus) {
		this.actATPus = actATPus;
	}

	/**
	 * Set the upstream actual aggregate transmitter power.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param actATPus the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withActATPus(Integer actATPus) {
		this.actATPus = actATPus;
		return this;
	}

	/**
	 * Get the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getHliNSCds() {
		return hliNSCds;
	}

	/**
	 * Set the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param hliNSCds the input value
	 */
	public void  setHliNSCds(Integer hliNSCds) {
		this.hliNSCds = hliNSCds;
	}

	/**
	 * Set the downstream linear representation scale.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param hliNSCds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withHliNSCds(Integer hliNSCds) {
		this.hliNSCds = hliNSCds;
		return this;
	}

	/**
	 * Get the downstream linear channel characteristics per subcarrier.  Each successive pair of integers represents the real and imaginary parts of each complex value.  Maximum number of complex pairs is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getHliNpsds() {
		return hliNpsds;
	}

	/**
	 * Set the downstream linear channel characteristics per subcarrier.  Each successive pair of integers represents the real and imaginary parts of each complex value.  Maximum number of complex pairs is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param hliNpsds the input value
	 */
	public void  setHliNpsds(Integer hliNpsds) {
		this.hliNpsds = hliNpsds;
	}

	/**
	 * Set the downstream linear channel characteristics per subcarrier.  Each successive pair of integers represents the real and imaginary parts of each complex value.  Maximum number of complex pairs is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param hliNpsds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withHliNpsds(Integer hliNpsds) {
		this.hliNpsds = hliNpsds;
		return this;
	}

	/**
	 * Get the downstream quiet line noise per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getQlnpsds() {
		return qlnpsds;
	}

	/**
	 * Set the downstream quiet line noise per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param qlnpsds the input value
	 */
	public void  setQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
	}

	/**
	 * Set the downstream quiet line noise per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param qlnpsds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withQlnpsds(Integer qlnpsds) {
		this.qlnpsds = qlnpsds;
		return this;
	}

	/**
	 * Get the downstream SNR per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getSnrpsds() {
		return snrpsds;
	}

	/**
	 * Set the downstream SNR per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param snrpsds the input value
	 */
	public void  setSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
	}

	/**
	 * Set the downstream SNR per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param snrpsds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withSnrpsds(Integer snrpsds) {
		this.snrpsds = snrpsds;
		return this;
	}

	/**
	 * Get the downstream bit allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getBitSpsds() {
		return bitSpsds;
	}

	/**
	 * Set the downstream bit allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param bitSpsds the input value
	 */
	public void  setBitSpsds(Integer bitSpsds) {
		this.bitSpsds = bitSpsds;
	}

	/**
	 * Set the downstream bit allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param bitSpsds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withBitSpsds(Integer bitSpsds) {
		this.bitSpsds = bitSpsds;
		return this;
	}

	/**
	 * Get the downstream gain allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getGaiNSpsds() {
		return gaiNSpsds;
	}

	/**
	 * Set the downstream gain allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param gaiNSpsds the input value
	 */
	public void  setGaiNSpsds(Integer gaiNSpsds) {
		this.gaiNSpsds = gaiNSpsds;
	}

	/**
	 * Set the downstream gain allocation per subcarrier.  Maximum number of elements is 256 for ADSL and ADSL2, 512 for ADSL2+.  Interpretation of the value is as defined in ITU-T Rec. G.997.1.
	 *
	 * @since 1.0
	 * @param gaiNSpsds the input value
	 * @return this instance
	 */
	public WANDSLDiagnostics withGaiNSpsds(Integer gaiNSpsds) {
		this.gaiNSpsds = gaiNSpsds;
		return this;
	}

	//</editor-fold>

}