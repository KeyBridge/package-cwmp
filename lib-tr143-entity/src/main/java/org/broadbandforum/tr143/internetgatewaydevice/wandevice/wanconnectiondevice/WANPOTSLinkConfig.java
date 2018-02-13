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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice;

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

	/**
	 * This object models the POTS link layer properties specific to a single physical connection used for Internet access on a CPE.  This object is intended for a CPE with a POTS WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPOTSLinkConfig.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANPOTSLinkConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANPOTSLinkConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANPOTSLinkConfig {

	/**
	 * Enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Status of the link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkStatus")
	public String linkStatus;
	/**
	 * Specifies a list of strings separated by semicolon (;), each string representing a phone number to connect to a particular ISP. The digits of the phone number follow the semantics of the ITU-T E.164 specification. Delimiters such as brackets or hyphens between the digits of a phone number are to be ignored by the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPPhoneNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ispPhoneNumber;
	/**
	 * Information identifying the Internet Service Provider. The format of the string is vendor specific.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPInfo")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ispInfo;
	/**
	 * This variable indicates the type of POTS link used for the dialup connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkType")
	@CWMPParameter(access = "readWrite")
	public String linkType = "PPP_Dialup";
	/**
	 * The number of times the CPE SHOULD attempt an Internet connection setup before returning error.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfRetries")
	@CWMPParameter(access = "readWrite")
	public Long numberOfRetries;
	/**
	 * The number of seconds the CPE SHOULD wait between attempts to setup an Internet connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DelayBetweenRetries")
	@CWMPParameter(access = "readWrite")
	public Long delayBetweenRetries;
	/**
	 * Specifies capabilities of the POTS modem - i.e., if it handles data ({{enum|0}}), fax ({{enum|1}},{{enum|2}},{{enum|2.0}}), voice ({{enum|8}}), DSVD ({{enum|80}}).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Fclass")
	@XmlList
	public Collection<String> fclass;
	/**
	 * The modulation standard currently being used for data.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataModulationSupported")
	public String dataModulationSupported;
	/**
	 * The protocol standard currently being used for data transfers.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataProtocol")
	public String dataProtocol;
	/**
	 * The compression technology implemented on the modem.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataCompression")
	public String dataCompression;
	/**
	 * Capability for full duplex operation with data and voice.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PlusVTRCommandSupported")
	public Boolean plusVTRCommandSupported;

	public WANPOTSLinkConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLinkStatus() {
		return linkStatus;
	}

	/**
	 * Set the status of the link.
	 *
	 * @since 1.0
	 * @param linkStatus the input value
	 */
	public void  setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	/**
	 * Set the status of the link.
	 *
	 * @since 1.0
	 * @param linkStatus the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
		return this;
	}

	/**
	 * Get the specifies a list of strings separated by semicolon (;), each string representing a phone number to connect to a particular ISP. The digits of the phone number follow the semantics of the ITU-T E.164 specification. Delimiters such as brackets or hyphens between the digits of a phone number are to be ignored by the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspPhoneNumber() {
		return ispPhoneNumber;
	}

	/**
	 * Set the specifies a list of strings separated by semicolon (;), each string representing a phone number to connect to a particular ISP. The digits of the phone number follow the semantics of the ITU-T E.164 specification. Delimiters such as brackets or hyphens between the digits of a phone number are to be ignored by the CPE.
	 *
	 * @since 1.0
	 * @param ispPhoneNumber the input value
	 */
	public void  setIspPhoneNumber(String ispPhoneNumber) {
		this.ispPhoneNumber = ispPhoneNumber;
	}

	/**
	 * Set the specifies a list of strings separated by semicolon (;), each string representing a phone number to connect to a particular ISP. The digits of the phone number follow the semantics of the ITU-T E.164 specification. Delimiters such as brackets or hyphens between the digits of a phone number are to be ignored by the CPE.
	 *
	 * @since 1.0
	 * @param ispPhoneNumber the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withIspPhoneNumber(String ispPhoneNumber) {
		this.ispPhoneNumber = ispPhoneNumber;
		return this;
	}

	/**
	 * Get the information identifying the Internet Service Provider. The format of the string is vendor specific.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspInfo() {
		return ispInfo;
	}

	/**
	 * Set the information identifying the Internet Service Provider. The format of the string is vendor specific.
	 *
	 * @since 1.0
	 * @param ispInfo the input value
	 */
	public void  setIspInfo(String ispInfo) {
		this.ispInfo = ispInfo;
	}

	/**
	 * Set the information identifying the Internet Service Provider. The format of the string is vendor specific.
	 *
	 * @since 1.0
	 * @param ispInfo the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withIspInfo(String ispInfo) {
		this.ispInfo = ispInfo;
		return this;
	}

	/**
	 * Get the this variable indicates the type of POTS link used for the dialup connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLinkType() {
		return linkType;
	}

	/**
	 * Set the this variable indicates the type of POTS link used for the dialup connection.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 */
	public void  setLinkType(String linkType) {
		this.linkType = linkType;
	}

	/**
	 * Set the this variable indicates the type of POTS link used for the dialup connection.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withLinkType(String linkType) {
		this.linkType = linkType;
		return this;
	}

	/**
	 * Get the number of times the CPE SHOULD attempt an Internet connection setup before returning error.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfRetries() {
		return numberOfRetries;
	}

	/**
	 * Set the number of times the CPE SHOULD attempt an Internet connection setup before returning error.
	 *
	 * @since 1.0
	 * @param numberOfRetries the input value
	 */
	public void  setNumberOfRetries(Long numberOfRetries) {
		this.numberOfRetries = numberOfRetries;
	}

	/**
	 * Set the number of times the CPE SHOULD attempt an Internet connection setup before returning error.
	 *
	 * @since 1.0
	 * @param numberOfRetries the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withNumberOfRetries(Long numberOfRetries) {
		this.numberOfRetries = numberOfRetries;
		return this;
	}

	/**
	 * Get the number of seconds the CPE SHOULD wait between attempts to setup an Internet connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDelayBetweenRetries() {
		return delayBetweenRetries;
	}

	/**
	 * Set the number of seconds the CPE SHOULD wait between attempts to setup an Internet connection.
	 *
	 * @since 1.0
	 * @param delayBetweenRetries the input value
	 */
	public void  setDelayBetweenRetries(Long delayBetweenRetries) {
		this.delayBetweenRetries = delayBetweenRetries;
	}

	/**
	 * Set the number of seconds the CPE SHOULD wait between attempts to setup an Internet connection.
	 *
	 * @since 1.0
	 * @param delayBetweenRetries the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withDelayBetweenRetries(Long delayBetweenRetries) {
		this.delayBetweenRetries = delayBetweenRetries;
		return this;
	}

	/**
	 * Get the specifies capabilities of the POTS modem - i.e., if it handles data ({{enum|0}}), fax ({{enum|1}},{{enum|2}},{{enum|2.0}}), voice ({{enum|8}}), DSVD ({{enum|80}}).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getFclass() {
		if (this.fclass == null){ this.fclass=new ArrayList<>();}
		return fclass;
	}

	/**
	 * Set the specifies capabilities of the POTS modem - i.e., if it handles data ({{enum|0}}), fax ({{enum|1}},{{enum|2}},{{enum|2.0}}), voice ({{enum|8}}), DSVD ({{enum|80}}).
	 *
	 * @since 1.0
	 * @param fclass the input value
	 */
	public void  setFclass(Collection<String> fclass) {
		this.fclass = fclass;
	}

	/**
	 * Set the specifies capabilities of the POTS modem - i.e., if it handles data ({{enum|0}}), fax ({{enum|1}},{{enum|2}},{{enum|2.0}}), voice ({{enum|8}}), DSVD ({{enum|80}}).
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withFclass(String string) {
		getFclass().add(string);
		return this;
	}

	/**
	 * Get the modulation standard currently being used for data.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDataModulationSupported() {
		return dataModulationSupported;
	}

	/**
	 * Set the modulation standard currently being used for data.
	 *
	 * @since 1.0
	 * @param dataModulationSupported the input value
	 */
	public void  setDataModulationSupported(String dataModulationSupported) {
		this.dataModulationSupported = dataModulationSupported;
	}

	/**
	 * Set the modulation standard currently being used for data.
	 *
	 * @since 1.0
	 * @param dataModulationSupported the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withDataModulationSupported(String dataModulationSupported) {
		this.dataModulationSupported = dataModulationSupported;
		return this;
	}

	/**
	 * Get the protocol standard currently being used for data transfers.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDataProtocol() {
		return dataProtocol;
	}

	/**
	 * Set the protocol standard currently being used for data transfers.
	 *
	 * @since 1.0
	 * @param dataProtocol the input value
	 */
	public void  setDataProtocol(String dataProtocol) {
		this.dataProtocol = dataProtocol;
	}

	/**
	 * Set the protocol standard currently being used for data transfers.
	 *
	 * @since 1.0
	 * @param dataProtocol the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withDataProtocol(String dataProtocol) {
		this.dataProtocol = dataProtocol;
		return this;
	}

	/**
	 * Get the compression technology implemented on the modem.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDataCompression() {
		return dataCompression;
	}

	/**
	 * Set the compression technology implemented on the modem.
	 *
	 * @since 1.0
	 * @param dataCompression the input value
	 */
	public void  setDataCompression(String dataCompression) {
		this.dataCompression = dataCompression;
	}

	/**
	 * Set the compression technology implemented on the modem.
	 *
	 * @since 1.0
	 * @param dataCompression the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withDataCompression(String dataCompression) {
		this.dataCompression = dataCompression;
		return this;
	}

	/**
	 * Get the capability for full duplex operation with data and voice.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPlusVTRCommandSupported() {
		return plusVTRCommandSupported;
	}

	/**
	 * Set the capability for full duplex operation with data and voice.
	 *
	 * @since 1.0
	 * @param plusVTRCommandSupported the input value
	 */
	public void  setPlusVTRCommandSupported(Boolean plusVTRCommandSupported) {
		this.plusVTRCommandSupported = plusVTRCommandSupported;
	}

	/**
	 * Set the capability for full duplex operation with data and voice.
	 *
	 * @since 1.0
	 * @param plusVTRCommandSupported the input value
	 * @return this instance
	 */
	public WANPOTSLinkConfig withPlusVTRCommandSupported(Boolean plusVTRCommandSupported) {
		this.plusVTRCommandSupported = plusVTRCommandSupported;
		return this;
	}

	//</editor-fold>

}