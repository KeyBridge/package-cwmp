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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfpdsn;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;

	/**
	 * This object is used in obtaining the Auxillary A10 Connection stats for each PDSN
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.AuxA10Stats.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.HRPD.PCFPDSN.AuxA10Stats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.PCFPDSN.AuxA10Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuxA10Stats {

	/**
	 * The PDSN Number
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNNumberAuxA10Perf")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 127)
	public Integer pdsNNumberAuxA10Perf;
	/**
	 * The IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNIPAddressAuxA10Perf")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress pdsNIPAddressAuxA10Perf;
	/**
	 * Number of Auxillary A10 Connections Created in the First Registration Request Message to the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuxA10ConnectionsCreatedInFirstRegReqPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long auxA10ConnectionsCreatedInFirstRegReqPDSN;
	/**
	 * Number of Auxillary A10 Connections Created in Subsequent  Registration Request Messages to the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuxA10ConnectionsCreatedInSubsequentRegReqPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long auxA10ConnectionsCreatedInSubsequentRegReqPDSN;
	/**
	 * Number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuxA10FwdIpFlowsCreatedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long auxA10FwdIpFlowsCreatedPDSN;
	/**
	 * Number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuxA10RevIpFlowsCreatedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long auxA10RevIpFlowsCreatedPDSN;
	/**
	 * Number of IP flow Accounting Reg Requests sent to the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuxA10IpFlowAccountingRegRequestsPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long auxA10IpFlowAccountingRegRequestsPDSN;

	public AuxA10Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the PDSN Number
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNNumberAuxA10Perf() {
		return pdsNNumberAuxA10Perf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberAuxA10Perf the input value
	 */
	public void  setPdsNNumberAuxA10Perf(Integer pdsNNumberAuxA10Perf) {
		this.pdsNNumberAuxA10Perf = pdsNNumberAuxA10Perf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberAuxA10Perf the input value
	 * @return this instance
	 */
	public AuxA10Stats withPdsNNumberAuxA10Perf(Integer pdsNNumberAuxA10Perf) {
		this.pdsNNumberAuxA10Perf = pdsNNumberAuxA10Perf;
		return this;
	}

	/**
	 * Get the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPdsNIPAddressAuxA10Perf() {
		return pdsNIPAddressAuxA10Perf;
	}

	/**
	 * Set the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressAuxA10Perf the input value
	 */
	public void  setPdsNIPAddressAuxA10Perf(IPAddress pdsNIPAddressAuxA10Perf) {
		this.pdsNIPAddressAuxA10Perf = pdsNIPAddressAuxA10Perf;
	}

	/**
	 * Set the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressAuxA10Perf the input value
	 * @return this instance
	 */
	public AuxA10Stats withPdsNIPAddressAuxA10Perf(IPAddress pdsNIPAddressAuxA10Perf) {
		this.pdsNIPAddressAuxA10Perf = pdsNIPAddressAuxA10Perf;
		return this;
	}

	/**
	 * Get the number of Auxillary A10 Connections Created in the First Registration Request Message to the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuxA10ConnectionsCreatedInFirstRegReqPDSN() {
		return auxA10ConnectionsCreatedInFirstRegReqPDSN;
	}

	/**
	 * Set the number of Auxillary A10 Connections Created in the First Registration Request Message to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10ConnectionsCreatedInFirstRegReqPDSN the input value
	 */
	public void  setAuxA10ConnectionsCreatedInFirstRegReqPDSN(Long auxA10ConnectionsCreatedInFirstRegReqPDSN) {
		this.auxA10ConnectionsCreatedInFirstRegReqPDSN = auxA10ConnectionsCreatedInFirstRegReqPDSN;
	}

	/**
	 * Set the number of Auxillary A10 Connections Created in the First Registration Request Message to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10ConnectionsCreatedInFirstRegReqPDSN the input value
	 * @return this instance
	 */
	public AuxA10Stats withAuxA10ConnectionsCreatedInFirstRegReqPDSN(Long auxA10ConnectionsCreatedInFirstRegReqPDSN) {
		this.auxA10ConnectionsCreatedInFirstRegReqPDSN = auxA10ConnectionsCreatedInFirstRegReqPDSN;
		return this;
	}

	/**
	 * Get the number of Auxillary A10 Connections Created in Subsequent  Registration Request Messages to the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuxA10ConnectionsCreatedInSubsequentRegReqPDSN() {
		return auxA10ConnectionsCreatedInSubsequentRegReqPDSN;
	}

	/**
	 * Set the number of Auxillary A10 Connections Created in Subsequent  Registration Request Messages to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10ConnectionsCreatedInSubsequentRegReqPDSN the input value
	 */
	public void  setAuxA10ConnectionsCreatedInSubsequentRegReqPDSN(Long auxA10ConnectionsCreatedInSubsequentRegReqPDSN) {
		this.auxA10ConnectionsCreatedInSubsequentRegReqPDSN = auxA10ConnectionsCreatedInSubsequentRegReqPDSN;
	}

	/**
	 * Set the number of Auxillary A10 Connections Created in Subsequent  Registration Request Messages to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10ConnectionsCreatedInSubsequentRegReqPDSN the input value
	 * @return this instance
	 */
	public AuxA10Stats withAuxA10ConnectionsCreatedInSubsequentRegReqPDSN(Long auxA10ConnectionsCreatedInSubsequentRegReqPDSN) {
		this.auxA10ConnectionsCreatedInSubsequentRegReqPDSN = auxA10ConnectionsCreatedInSubsequentRegReqPDSN;
		return this;
	}

	/**
	 * Get the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuxA10FwdIpFlowsCreatedPDSN() {
		return auxA10FwdIpFlowsCreatedPDSN;
	}

	/**
	 * Set the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @param auxA10FwdIpFlowsCreatedPDSN the input value
	 */
	public void  setAuxA10FwdIpFlowsCreatedPDSN(Long auxA10FwdIpFlowsCreatedPDSN) {
		this.auxA10FwdIpFlowsCreatedPDSN = auxA10FwdIpFlowsCreatedPDSN;
	}

	/**
	 * Set the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @param auxA10FwdIpFlowsCreatedPDSN the input value
	 * @return this instance
	 */
	public AuxA10Stats withAuxA10FwdIpFlowsCreatedPDSN(Long auxA10FwdIpFlowsCreatedPDSN) {
		this.auxA10FwdIpFlowsCreatedPDSN = auxA10FwdIpFlowsCreatedPDSN;
		return this;
	}

	/**
	 * Get the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuxA10RevIpFlowsCreatedPDSN() {
		return auxA10RevIpFlowsCreatedPDSN;
	}

	/**
	 * Set the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @param auxA10RevIpFlowsCreatedPDSN the input value
	 */
	public void  setAuxA10RevIpFlowsCreatedPDSN(Long auxA10RevIpFlowsCreatedPDSN) {
		this.auxA10RevIpFlowsCreatedPDSN = auxA10RevIpFlowsCreatedPDSN;
	}

	/**
	 * Set the number of Forward IP Flows created  with this PDSN for the Auxillary A10s
	 *
	 * @since 2.0
	 * @param auxA10RevIpFlowsCreatedPDSN the input value
	 * @return this instance
	 */
	public AuxA10Stats withAuxA10RevIpFlowsCreatedPDSN(Long auxA10RevIpFlowsCreatedPDSN) {
		this.auxA10RevIpFlowsCreatedPDSN = auxA10RevIpFlowsCreatedPDSN;
		return this;
	}

	/**
	 * Get the number of IP flow Accounting Reg Requests sent to the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAuxA10IpFlowAccountingRegRequestsPDSN() {
		return auxA10IpFlowAccountingRegRequestsPDSN;
	}

	/**
	 * Set the number of IP flow Accounting Reg Requests sent to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10IpFlowAccountingRegRequestsPDSN the input value
	 */
	public void  setAuxA10IpFlowAccountingRegRequestsPDSN(Long auxA10IpFlowAccountingRegRequestsPDSN) {
		this.auxA10IpFlowAccountingRegRequestsPDSN = auxA10IpFlowAccountingRegRequestsPDSN;
	}

	/**
	 * Set the number of IP flow Accounting Reg Requests sent to the PDSN
	 *
	 * @since 2.0
	 * @param auxA10IpFlowAccountingRegRequestsPDSN the input value
	 * @return this instance
	 */
	public AuxA10Stats withAuxA10IpFlowAccountingRegRequestsPDSN(Long auxA10IpFlowAccountingRegRequestsPDSN) {
		this.auxA10IpFlowAccountingRegRequestsPDSN = auxA10IpFlowAccountingRegRequestsPDSN;
		return this;
	}

	//</editor-fold>

}