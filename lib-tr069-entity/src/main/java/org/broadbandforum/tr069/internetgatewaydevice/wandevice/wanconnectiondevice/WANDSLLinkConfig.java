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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wanconnectiondevice;

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
	 * This object models the ATM layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANDSLLinkConfig.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANDSLLinkConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANDSLLinkConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDSLLinkConfig {

	/**
	 * Enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of the link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkStatus")
	public String linkStatus;
	/**
	 * Indicates the type of DSL connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkType")
	@CWMPParameter(access = "readWrite")
	public String linkType;
	/**
	 * Indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error should be returned.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AutoConfig")
	public Boolean autoConfig;
	/**
	 * Indicates the type of DSL modulation used on the interface associated with this connection (duplication from ''WANDSLInterfaceConfig'').
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ModulationType")
	public String modulationType;
	/**
	 * Destination address of this link.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestinationAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destinationAddress;
	/**
	 * Identifies the connection encapsulation that will be used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMEncapsulation")
	@CWMPParameter(access = "readWrite")
	public String atmEncapsulation;
	/**
	 * This flag tells if a checksum should be added in the ATM payload. It does not refer to the checksum of one of the ATM cells or AALX packets. In case of {{enum|LLC|ATMEncapsulation}} or {{enum|VCMUX|ATMEncapsulation}} encapsulation, this ATM checksum is the FCS field described in RFC 1483. It is only applicable in the upstream direction.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FCSPreserved")
	@CWMPParameter(access = "readWrite")
	public Boolean fcsPreserved;
	/**
	 * Comma separated ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be established.  In the form:

: ''VPI1/VCI1, VPI2/VCI2, ...''

Example:

: ''0/35, 8/35, 1/35''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VCSearchList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> vcsearchList;
	/**
	 * Describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMAAL")
	public String atmAAL;
	/**
	 * The current count of successfully transmitted blocks.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMTransmittedBlocks")
	public Long atmTransmittedBlocks;
	/**
	 * The current count of successfully received blocks.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMReceivedBlocks")
	public Long atmReceivedBlocks;
	/**
	 * Describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMQoS")
	@CWMPParameter(access = "readWrite")
	public String atmQoS;
	/**
	 * Specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMPeakCellRate")
	@CWMPParameter(access = "readWrite")
	public Long atmPeakCellRate;
	/**
	 * Specifies the upstream maximum burst size in cells.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMMaximumBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long atmMaximumBurstSize;
	/**
	 * Specifies the upstream sustainable cell rate, in cells per second, used for traffic shaping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMSustainableCellRate")
	@CWMPParameter(access = "readWrite")
	public Long atmSustainableCellRate;
	/**
	 * Count of the AAL5 layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AAL5CRCErrors")
	public Long aal5CRCErrors;
	/**
	 * Count of the ATM layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMCRCErrors")
	public Long atmCRCErrors;
	/**
	 * Count of the number of Header Error Check related errors at the ATM layer.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATMHECErrors")
	public Long atmHECErrors;

	public WANDSLLinkConfig() {
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
	public WANDSLLinkConfig withEnable(Boolean enable) {
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
	public WANDSLLinkConfig withLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
		return this;
	}

	/**
	 * Get the indicates the type of DSL connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLinkType() {
		return linkType;
	}

	/**
	 * Set the indicates the type of DSL connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 */
	public void  setLinkType(String linkType) {
		this.linkType = linkType;
	}

	/**
	 * Set the indicates the type of DSL connection and refers to the complete stack of protocol used for this connection.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withLinkType(String linkType) {
		this.linkType = linkType;
		return this;
	}

	/**
	 * Get the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error should be returned.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAutoConfig() {
		return autoConfig;
	}

	/**
	 * Set the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error should be returned.
	 *
	 * @since 1.0
	 * @param autoConfig the input value
	 */
	public void  setAutoConfig(Boolean autoConfig) {
		this.autoConfig = autoConfig;
	}

	/**
	 * Set the indicates if the CPE is currently using some auto configuration mechanisms for this connection.  If this variable is {{true}}, all writable variables in this connection instance become read-only. Any attempt to change one of these variables SHOULD fail and an error should be returned.
	 *
	 * @since 1.0
	 * @param autoConfig the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAutoConfig(Boolean autoConfig) {
		this.autoConfig = autoConfig;
		return this;
	}

	/**
	 * Get the indicates the type of DSL modulation used on the interface associated with this connection (duplication from ''WANDSLInterfaceConfig'').
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getModulationType() {
		return modulationType;
	}

	/**
	 * Set the indicates the type of DSL modulation used on the interface associated with this connection (duplication from ''WANDSLInterfaceConfig'').
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 */
	public void  setModulationType(String modulationType) {
		this.modulationType = modulationType;
	}

	/**
	 * Set the indicates the type of DSL modulation used on the interface associated with this connection (duplication from ''WANDSLInterfaceConfig'').
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withModulationType(String modulationType) {
		this.modulationType = modulationType;
		return this;
	}

	/**
	 * Get the destination address of this link.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * Set the destination address of this link.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 */
	public void  setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * Set the destination address of this link.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
		return this;
	}

	/**
	 * Get the identifies the connection encapsulation that will be used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtmEncapsulation() {
		return atmEncapsulation;
	}

	/**
	 * Set the identifies the connection encapsulation that will be used.
	 *
	 * @since 1.0
	 * @param atmEncapsulation the input value
	 */
	public void  setAtmEncapsulation(String atmEncapsulation) {
		this.atmEncapsulation = atmEncapsulation;
	}

	/**
	 * Set the identifies the connection encapsulation that will be used.
	 *
	 * @since 1.0
	 * @param atmEncapsulation the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmEncapsulation(String atmEncapsulation) {
		this.atmEncapsulation = atmEncapsulation;
		return this;
	}

	/**
	 * Get the this flag tells if a checksum should be added in the ATM payload. It does not refer to the checksum of one of the ATM cells or AALX packets. In case of {{enum|LLC|ATMEncapsulation}} or {{enum|VCMUX|ATMEncapsulation}} encapsulation, this ATM checksum is the FCS field described in RFC 1483. It is only applicable in the upstream direction.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isFcsPreserved() {
		return fcsPreserved;
	}

	/**
	 * Set the this flag tells if a checksum should be added in the ATM payload. It does not refer to the checksum of one of the ATM cells or AALX packets. In case of {{enum|LLC|ATMEncapsulation}} or {{enum|VCMUX|ATMEncapsulation}} encapsulation, this ATM checksum is the FCS field described in RFC 1483. It is only applicable in the upstream direction.
	 *
	 * @since 1.0
	 * @param fcsPreserved the input value
	 */
	public void  setFcsPreserved(Boolean fcsPreserved) {
		this.fcsPreserved = fcsPreserved;
	}

	/**
	 * Set the this flag tells if a checksum should be added in the ATM payload. It does not refer to the checksum of one of the ATM cells or AALX packets. In case of {{enum|LLC|ATMEncapsulation}} or {{enum|VCMUX|ATMEncapsulation}} encapsulation, this ATM checksum is the FCS field described in RFC 1483. It is only applicable in the upstream direction.
	 *
	 * @since 1.0
	 * @param fcsPreserved the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withFcsPreserved(Boolean fcsPreserved) {
		this.fcsPreserved = fcsPreserved;
		return this;
	}

	/**
	 * Get the comma separated ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be established.  In the form:

: ''VPI1/VCI1, VPI2/VCI2, ...''

Example:

: ''0/35, 8/35, 1/35''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getVcsearchList() {
		if (this.vcsearchList == null){ this.vcsearchList=new ArrayList<>();}
		return vcsearchList;
	}

	/**
	 * Set the comma separated ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be established.  In the form:

: ''VPI1/VCI1, VPI2/VCI2, ...''

Example:

: ''0/35, 8/35, 1/35''
	 *
	 * @since 1.0
	 * @param vcsearchList the input value
	 */
	public void  setVcsearchList(Collection<String> vcsearchList) {
		this.vcsearchList = vcsearchList;
	}

	/**
	 * Set the comma separated ordered list of VPI/VCI pairs to search if a link using the {{param|DestinationAddress}} cannot be established.  In the form:

: ''VPI1/VCI1, VPI2/VCI2, ...''

Example:

: ''0/35, 8/35, 1/35''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withVcsearchList(String string) {
		getVcsearchList().add(string);
		return this;
	}

	/**
	 * Get the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtmAAL() {
		return atmAAL;
	}

	/**
	 * Set the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 1.0
	 * @param atmAAL the input value
	 */
	public void  setAtmAAL(String atmAAL) {
		this.atmAAL = atmAAL;
	}

	/**
	 * Set the describes the ATM Adaptation Layer (AAL) currently in use on the PVC.
	 *
	 * @since 1.0
	 * @param atmAAL the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmAAL(String atmAAL) {
		this.atmAAL = atmAAL;
		return this;
	}

	/**
	 * Get the current count of successfully transmitted blocks.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmTransmittedBlocks() {
		return atmTransmittedBlocks;
	}

	/**
	 * Set the current count of successfully transmitted blocks.
	 *
	 * @since 1.0
	 * @param atmTransmittedBlocks the input value
	 */
	public void  setAtmTransmittedBlocks(Long atmTransmittedBlocks) {
		this.atmTransmittedBlocks = atmTransmittedBlocks;
	}

	/**
	 * Set the current count of successfully transmitted blocks.
	 *
	 * @since 1.0
	 * @param atmTransmittedBlocks the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmTransmittedBlocks(Long atmTransmittedBlocks) {
		this.atmTransmittedBlocks = atmTransmittedBlocks;
		return this;
	}

	/**
	 * Get the current count of successfully received blocks.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmReceivedBlocks() {
		return atmReceivedBlocks;
	}

	/**
	 * Set the current count of successfully received blocks.
	 *
	 * @since 1.0
	 * @param atmReceivedBlocks the input value
	 */
	public void  setAtmReceivedBlocks(Long atmReceivedBlocks) {
		this.atmReceivedBlocks = atmReceivedBlocks;
	}

	/**
	 * Set the current count of successfully received blocks.
	 *
	 * @since 1.0
	 * @param atmReceivedBlocks the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmReceivedBlocks(Long atmReceivedBlocks) {
		this.atmReceivedBlocks = atmReceivedBlocks;
		return this;
	}

	/**
	 * Get the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtmQoS() {
		return atmQoS;
	}

	/**
	 * Set the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 1.0
	 * @param atmQoS the input value
	 */
	public void  setAtmQoS(String atmQoS) {
		this.atmQoS = atmQoS;
	}

	/**
	 * Set the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 1.0
	 * @param atmQoS the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmQoS(String atmQoS) {
		this.atmQoS = atmQoS;
		return this;
	}

	/**
	 * Get the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmPeakCellRate() {
		return atmPeakCellRate;
	}

	/**
	 * Set the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 1.0
	 * @param atmPeakCellRate the input value
	 */
	public void  setAtmPeakCellRate(Long atmPeakCellRate) {
		this.atmPeakCellRate = atmPeakCellRate;
	}

	/**
	 * Set the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 1.0
	 * @param atmPeakCellRate the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmPeakCellRate(Long atmPeakCellRate) {
		this.atmPeakCellRate = atmPeakCellRate;
		return this;
	}

	/**
	 * Get the specifies the upstream maximum burst size in cells.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmMaximumBurstSize() {
		return atmMaximumBurstSize;
	}

	/**
	 * Set the specifies the upstream maximum burst size in cells.
	 *
	 * @since 1.0
	 * @param atmMaximumBurstSize the input value
	 */
	public void  setAtmMaximumBurstSize(Long atmMaximumBurstSize) {
		this.atmMaximumBurstSize = atmMaximumBurstSize;
	}

	/**
	 * Set the specifies the upstream maximum burst size in cells.
	 *
	 * @since 1.0
	 * @param atmMaximumBurstSize the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmMaximumBurstSize(Long atmMaximumBurstSize) {
		this.atmMaximumBurstSize = atmMaximumBurstSize;
		return this;
	}

	/**
	 * Get the specifies the upstream sustainable cell rate, in cells per second, used for traffic shaping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmSustainableCellRate() {
		return atmSustainableCellRate;
	}

	/**
	 * Set the specifies the upstream sustainable cell rate, in cells per second, used for traffic shaping.
	 *
	 * @since 1.0
	 * @param atmSustainableCellRate the input value
	 */
	public void  setAtmSustainableCellRate(Long atmSustainableCellRate) {
		this.atmSustainableCellRate = atmSustainableCellRate;
	}

	/**
	 * Set the specifies the upstream sustainable cell rate, in cells per second, used for traffic shaping.
	 *
	 * @since 1.0
	 * @param atmSustainableCellRate the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmSustainableCellRate(Long atmSustainableCellRate) {
		this.atmSustainableCellRate = atmSustainableCellRate;
		return this;
	}

	/**
	 * Get the count of the AAL5 layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAal5CRCErrors() {
		return aal5CRCErrors;
	}

	/**
	 * Set the count of the AAL5 layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @param aal5CRCErrors the input value
	 */
	public void  setAal5CRCErrors(Long aal5CRCErrors) {
		this.aal5CRCErrors = aal5CRCErrors;
	}

	/**
	 * Set the count of the AAL5 layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @param aal5CRCErrors the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAal5CRCErrors(Long aal5CRCErrors) {
		this.aal5CRCErrors = aal5CRCErrors;
		return this;
	}

	/**
	 * Get the count of the ATM layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmCRCErrors() {
		return atmCRCErrors;
	}

	/**
	 * Set the count of the ATM layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @param atmCRCErrors the input value
	 */
	public void  setAtmCRCErrors(Long atmCRCErrors) {
		this.atmCRCErrors = atmCRCErrors;
	}

	/**
	 * Set the count of the ATM layer cyclic redundancy check errors.
	 *
	 * @since 1.0
	 * @param atmCRCErrors the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmCRCErrors(Long atmCRCErrors) {
		this.atmCRCErrors = atmCRCErrors;
		return this;
	}

	/**
	 * Get the count of the number of Header Error Check related errors at the ATM layer.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtmHECErrors() {
		return atmHECErrors;
	}

	/**
	 * Set the count of the number of Header Error Check related errors at the ATM layer.
	 *
	 * @since 1.0
	 * @param atmHECErrors the input value
	 */
	public void  setAtmHECErrors(Long atmHECErrors) {
		this.atmHECErrors = atmHECErrors;
	}

	/**
	 * Set the count of the number of Header Error Check related errors at the ATM layer.
	 *
	 * @since 1.0
	 * @param atmHECErrors the input value
	 * @return this instance
	 */
	public WANDSLLinkConfig withAtmHECErrors(Long atmHECErrors) {
		this.atmHECErrors = atmHECErrors;
		return this;
	}

	//</editor-fold>

}