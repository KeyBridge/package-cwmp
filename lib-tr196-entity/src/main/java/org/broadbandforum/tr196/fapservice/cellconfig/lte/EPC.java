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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.epc.HO;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.epc.PLMNList;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.epc.QoS;

	/**
	 * This object contains parameters relating to configuring LTE EPC.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EPC.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.EPC")
@XmlType(name = "FAPService.CellConfig.LTE.EPC")
@XmlAccessorType(XmlAccessType.FIELD)
public class EPC {

	/**
	 * {{list}} Each item is a ciphering algorithm allowed to be used for RRC and UP confidentiality protection as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [EEA0, 128-EEA1, 128-EEA2]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllowedCipheringAlgorithmList")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> allowedCipheringAlgorithmList;
	/**
	 * {{list}} Each item is a integrity protection algorithm allowed to be used for RRC as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [128-EIA1, 128-EIA2]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllowedIntegrityProtectionAlgorithmList")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> allowedIntegrityProtectionAlgorithmList;
	/**
	 * TAC (Tracking Area Code) for LTE FAP as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TAC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long tac;
	/**
	 * Emergency Area ID that uniquely identifies the area of emergency for Earthquake and Tsunami Warning Services (ETWS). Corresponds to Emergency Area ID in {{bibref|3GPP-TS.36.413|Section 9.2.1.47}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EAID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 16777216)
	public Long eaiD;
	/**
	 * The maximum number of entries available in the {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxPLMNListEntries")
	public Long maxPLMNListEntries;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.EPC.QoS.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxQoSEntries")
	public Long maxQoSEntries;
	/**
	 * This object contains parameters relating to list of PLMN identity specific to LTE EPC definition, called PLMN-IdentityList, as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.  At minimum 1 item MUST be present in this list, and maximum of 6 items.
	 */
	@XmlElementWrapper(name = "PLMNLists")
	@XmlElement(name = "PLMNList")
	@CWMPParameter(access = "readWrite", minEntries = 1, maxEntries = 6)
	public Collection<PLMNList> plmNLists;
	/**
	 * This object contains parameters relating to configuring QoS in LTE EPC.
	 */
	@XmlElementWrapper(name = "QoSs")
	@XmlElement(name = "QoS")
	@CWMPParameter(access = "readWrite")
	public Collection<QoS> qoss;
	/**
	 * This object provides monitoring of the Handover (HO) properties in the HeNB.
	 */
	@XmlElement(name = "HO")
	public HO ho;

	public EPC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a ciphering algorithm allowed to be used for RRC and UP confidentiality protection as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [EEA0, 128-EEA1, 128-EEA2]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAllowedCipheringAlgorithmList() {
		if (this.allowedCipheringAlgorithmList == null){ this.allowedCipheringAlgorithmList=new ArrayList<>();}
		return allowedCipheringAlgorithmList;
	}

	/**
	 * Set the {{list}} Each item is a ciphering algorithm allowed to be used for RRC and UP confidentiality protection as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [EEA0, 128-EEA1, 128-EEA2]
	 *
	 * @since 2.0
	 * @param allowedCipheringAlgorithmList the input value
	 */
	public void  setAllowedCipheringAlgorithmList(Collection<String> allowedCipheringAlgorithmList) {
		this.allowedCipheringAlgorithmList = allowedCipheringAlgorithmList;
	}

	/**
	 * Set the {{list}} Each item is a ciphering algorithm allowed to be used for RRC and UP confidentiality protection as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [EEA0, 128-EEA1, 128-EEA2]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EPC withAllowedCipheringAlgorithmList(String string) {
		getAllowedCipheringAlgorithmList().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a integrity protection algorithm allowed to be used for RRC as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [128-EIA1, 128-EIA2]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAllowedIntegrityProtectionAlgorithmList() {
		if (this.allowedIntegrityProtectionAlgorithmList == null){ this.allowedIntegrityProtectionAlgorithmList=new ArrayList<>();}
		return allowedIntegrityProtectionAlgorithmList;
	}

	/**
	 * Set the {{list}} Each item is a integrity protection algorithm allowed to be used for RRC as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [128-EIA1, 128-EIA2]
	 *
	 * @since 2.0
	 * @param allowedIntegrityProtectionAlgorithmList the input value
	 */
	public void  setAllowedIntegrityProtectionAlgorithmList(Collection<String> allowedIntegrityProtectionAlgorithmList) {
		this.allowedIntegrityProtectionAlgorithmList = allowedIntegrityProtectionAlgorithmList;
	}

	/**
	 * Set the {{list}} Each item is a integrity protection algorithm allowed to be used for RRC as defined in {{bibref|3GPP-TS.33.401}}. If the list contains more than 1 item, it is in the order of the preferred algorithm to be used. 

Enumerated value must be one of [128-EIA1, 128-EIA2]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EPC withAllowedIntegrityProtectionAlgorithmList(String string) {
		getAllowedIntegrityProtectionAlgorithmList().add(string);
		return this;
	}

	/**
	 * Get the tac (Tracking Area Code) for LTE FAP as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTac() {
		return tac;
	}

	/**
	 * Set the tac (Tracking Area Code) for LTE FAP as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param tac the input value
	 */
	public void  setTac(Long tac) {
		this.tac = tac;
	}

	/**
	 * Set the tac (Tracking Area Code) for LTE FAP as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param tac the input value
	 * @return this instance
	 */
	public EPC withTac(Long tac) {
		this.tac = tac;
		return this;
	}

	/**
	 * Get the emergency Area ID that uniquely identifies the area of emergency for Earthquake and Tsunami Warning Services (ETWS). Corresponds to Emergency Area ID in {{bibref|3GPP-TS.36.413|Section 9.2.1.47}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEaiD() {
		return eaiD;
	}

	/**
	 * Set the emergency Area ID that uniquely identifies the area of emergency for Earthquake and Tsunami Warning Services (ETWS). Corresponds to Emergency Area ID in {{bibref|3GPP-TS.36.413|Section 9.2.1.47}}.
	 *
	 * @since 2.0
	 * @param eaiD the input value
	 */
	public void  setEaiD(Long eaiD) {
		this.eaiD = eaiD;
	}

	/**
	 * Set the emergency Area ID that uniquely identifies the area of emergency for Earthquake and Tsunami Warning Services (ETWS). Corresponds to Emergency Area ID in {{bibref|3GPP-TS.36.413|Section 9.2.1.47}}.
	 *
	 * @since 2.0
	 * @param eaiD the input value
	 * @return this instance
	 */
	public EPC withEaiD(Long eaiD) {
		this.eaiD = eaiD;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxPLMNListEntries() {
		return maxPLMNListEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxPLMNListEntries the input value
	 */
	public void  setMaxPLMNListEntries(Long maxPLMNListEntries) {
		this.maxPLMNListEntries = maxPLMNListEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxPLMNListEntries the input value
	 * @return this instance
	 */
	public EPC withMaxPLMNListEntries(Long maxPLMNListEntries) {
		this.maxPLMNListEntries = maxPLMNListEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.EPC.QoS.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxQoSEntries() {
		return maxQoSEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.EPC.QoS.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxQoSEntries the input value
	 */
	public void  setMaxQoSEntries(Long maxQoSEntries) {
		this.maxQoSEntries = maxQoSEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.EPC.QoS.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxQoSEntries the input value
	 * @return this instance
	 */
	public EPC withMaxQoSEntries(Long maxQoSEntries) {
		this.maxQoSEntries = maxQoSEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to list of PLMN identity specific to LTE EPC definition, called PLMN-IdentityList, as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.  At minimum 1 item MUST be present in this list, and maximum of 6 items.
	 *
	 * @return the value
	 */
	public Collection<PLMNList> getPlmNLists() {
		if (this.plmNLists == null){ this.plmNLists=new ArrayList<>();}
		return plmNLists;
	}

	/**
	 * Set the this object contains parameters relating to list of PLMN identity specific to LTE EPC definition, called PLMN-IdentityList, as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.  At minimum 1 item MUST be present in this list, and maximum of 6 items.
	 *
	 * @param plmNLists the input value
	 */
	public void  setPlmNLists(Collection<PLMNList> plmNLists) {
		this.plmNLists = plmNLists;
	}

	/**
	 * Set the this object contains parameters relating to list of PLMN identity specific to LTE EPC definition, called PLMN-IdentityList, as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.  At minimum 1 item MUST be present in this list, and maximum of 6 items.
	 *
	 * @param plmNList the input value
	 * @return this instance
	 */
	public EPC withPLMNList(PLMNList plmNList) {
		getPlmNLists().add(plmNList);
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring QoS in LTE EPC.
	 *
	 * @return the value
	 */
	public Collection<QoS> getQoss() {
		if (this.qoss == null){ this.qoss=new ArrayList<>();}
		return qoss;
	}

	/**
	 * Set the this object contains parameters relating to configuring QoS in LTE EPC.
	 *
	 * @param qoss the input value
	 */
	public void  setQoss(Collection<QoS> qoss) {
		this.qoss = qoss;
	}

	/**
	 * Set the this object contains parameters relating to configuring QoS in LTE EPC.
	 *
	 * @param qos the input value
	 * @return this instance
	 */
	public EPC withQoS(QoS qos) {
		getQoss().add(qos);
		return this;
	}

	/**
	 * Get the this object provides monitoring of the Handover (HO) properties in the HeNB.
	 *
	 * @return the value
	 */
	public HO getHo() {
		return ho;
	}

	/**
	 * Set the this object provides monitoring of the Handover (HO) properties in the HeNB.
	 *
	 * @param ho the input value
	 */
	public void  setHo(HO ho) {
		this.ho = ho;
	}

	/**
	 * Set the this object provides monitoring of the Handover (HO) properties in the HeNB.
	 *
	 * @param ho the input value
	 * @return this instance
	 */
	public EPC withHo(HO ho) {
		this.ho = ho;
		return this;
	}

	//</editor-fold>

}