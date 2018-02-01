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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.IPAddress;

	/**
	 * This object is used in obtaining the A11 Session Update stats for each PDSN
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.A11SessionUpdateStats.")
public class A11SessionUpdateStats {

	/**
	 * The PDSN Number
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNNumberSessionUpdatePerf")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 127)
	public Integer pdsNNumberSessionUpdatePerf;
	/**
	 * The IP Address of the PDSN for which the A11 Session Update stats is obtained
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNIPAddressSessionUpdatePerf")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress pdsNIPAddressSessionUpdatePerf;
	/**
	 * Number of A11 Session Updates received from a PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateReceivedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateReceivedPDSN;
	/**
	 * Number of A11 Session Updates accepted  for a PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateAcceptedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateAcceptedPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN that contained extended API
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateExtendedAPIPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateExtendedAPIPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN that conatained unknown PSI
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateForUnknownPSIPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateForUnknownPSIPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "ID Check Failed "
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedIDCheckFailPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedIDCheckFailPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code"Auth Check Failed"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedAuthCheckFailPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedAuthCheckFailPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "Unspecified Reason"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedReasonUnspecifiedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedReasonUnspecifiedPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "Poorly Formed"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedPoorlyFormedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedPoorlyFormedPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "Parameters Not Updated"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedSessionParamsNotUpdatedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "QoS Profile Id Not Updated"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code "Insufficient Resources"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedInsufficientResourcesPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedInsufficientResourcesPDSN;
	/**
	 * Number of A11 Session Updates received from this PDSN denied due to reason code"Handoff In Progress"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11SessionUpdateDeniedHandoffInProgressPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11SessionUpdateDeniedHandoffInProgressPDSN;

	public A11SessionUpdateStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the PDSN Number
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNNumberSessionUpdatePerf() {
		return pdsNNumberSessionUpdatePerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberSessionUpdatePerf the input value
	 */
	public void  setPdsNNumberSessionUpdatePerf(Integer pdsNNumberSessionUpdatePerf) {
		this.pdsNNumberSessionUpdatePerf = pdsNNumberSessionUpdatePerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberSessionUpdatePerf the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withPdsNNumberSessionUpdatePerf(Integer pdsNNumberSessionUpdatePerf) {
		this.pdsNNumberSessionUpdatePerf = pdsNNumberSessionUpdatePerf;
		return this;
	}

	/**
	 * Get the IP Address of the PDSN for which the A11 Session Update stats is obtained
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPdsNIPAddressSessionUpdatePerf() {
		return pdsNIPAddressSessionUpdatePerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the A11 Session Update stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressSessionUpdatePerf the input value
	 */
	public void  setPdsNIPAddressSessionUpdatePerf(IPAddress pdsNIPAddressSessionUpdatePerf) {
		this.pdsNIPAddressSessionUpdatePerf = pdsNIPAddressSessionUpdatePerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the A11 Session Update stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressSessionUpdatePerf the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withPdsNIPAddressSessionUpdatePerf(IPAddress pdsNIPAddressSessionUpdatePerf) {
		this.pdsNIPAddressSessionUpdatePerf = pdsNIPAddressSessionUpdatePerf;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from a PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateReceivedPDSN() {
		return a11SessionUpdateReceivedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from a PDSN
	 *
	 * @since 2.0
	 * @param a11SessionUpdateReceivedPDSN the input value
	 */
	public void  setA11SessionUpdateReceivedPDSN(Long a11SessionUpdateReceivedPDSN) {
		this.a11SessionUpdateReceivedPDSN = a11SessionUpdateReceivedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from a PDSN
	 *
	 * @since 2.0
	 * @param a11SessionUpdateReceivedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateReceivedPDSN(Long a11SessionUpdateReceivedPDSN) {
		this.a11SessionUpdateReceivedPDSN = a11SessionUpdateReceivedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates accepted  for a PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateAcceptedPDSN() {
		return a11SessionUpdateAcceptedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates accepted  for a PDSN
	 *
	 * @since 2.0
	 * @param a11SessionUpdateAcceptedPDSN the input value
	 */
	public void  setA11SessionUpdateAcceptedPDSN(Long a11SessionUpdateAcceptedPDSN) {
		this.a11SessionUpdateAcceptedPDSN = a11SessionUpdateAcceptedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates accepted  for a PDSN
	 *
	 * @since 2.0
	 * @param a11SessionUpdateAcceptedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateAcceptedPDSN(Long a11SessionUpdateAcceptedPDSN) {
		this.a11SessionUpdateAcceptedPDSN = a11SessionUpdateAcceptedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN that contained extended API
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateExtendedAPIPDSN() {
		return a11SessionUpdateExtendedAPIPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN that contained extended API
	 *
	 * @since 2.0
	 * @param a11SessionUpdateExtendedAPIPDSN the input value
	 */
	public void  setA11SessionUpdateExtendedAPIPDSN(Long a11SessionUpdateExtendedAPIPDSN) {
		this.a11SessionUpdateExtendedAPIPDSN = a11SessionUpdateExtendedAPIPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN that contained extended API
	 *
	 * @since 2.0
	 * @param a11SessionUpdateExtendedAPIPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateExtendedAPIPDSN(Long a11SessionUpdateExtendedAPIPDSN) {
		this.a11SessionUpdateExtendedAPIPDSN = a11SessionUpdateExtendedAPIPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN that conatained unknown PSI
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateForUnknownPSIPDSN() {
		return a11SessionUpdateForUnknownPSIPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN that conatained unknown PSI
	 *
	 * @since 2.0
	 * @param a11SessionUpdateForUnknownPSIPDSN the input value
	 */
	public void  setA11SessionUpdateForUnknownPSIPDSN(Long a11SessionUpdateForUnknownPSIPDSN) {
		this.a11SessionUpdateForUnknownPSIPDSN = a11SessionUpdateForUnknownPSIPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN that conatained unknown PSI
	 *
	 * @since 2.0
	 * @param a11SessionUpdateForUnknownPSIPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateForUnknownPSIPDSN(Long a11SessionUpdateForUnknownPSIPDSN) {
		this.a11SessionUpdateForUnknownPSIPDSN = a11SessionUpdateForUnknownPSIPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "ID Check Failed "
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedIDCheckFailPDSN() {
		return a11SessionUpdateDeniedIDCheckFailPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "ID Check Failed "
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedIDCheckFailPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedIDCheckFailPDSN(Long a11SessionUpdateDeniedIDCheckFailPDSN) {
		this.a11SessionUpdateDeniedIDCheckFailPDSN = a11SessionUpdateDeniedIDCheckFailPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "ID Check Failed "
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedIDCheckFailPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedIDCheckFailPDSN(Long a11SessionUpdateDeniedIDCheckFailPDSN) {
		this.a11SessionUpdateDeniedIDCheckFailPDSN = a11SessionUpdateDeniedIDCheckFailPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code"Auth Check Failed"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedAuthCheckFailPDSN() {
		return a11SessionUpdateDeniedAuthCheckFailPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code"Auth Check Failed"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedAuthCheckFailPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedAuthCheckFailPDSN(Long a11SessionUpdateDeniedAuthCheckFailPDSN) {
		this.a11SessionUpdateDeniedAuthCheckFailPDSN = a11SessionUpdateDeniedAuthCheckFailPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code"Auth Check Failed"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedAuthCheckFailPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedAuthCheckFailPDSN(Long a11SessionUpdateDeniedAuthCheckFailPDSN) {
		this.a11SessionUpdateDeniedAuthCheckFailPDSN = a11SessionUpdateDeniedAuthCheckFailPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "Unspecified Reason"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedReasonUnspecifiedPDSN() {
		return a11SessionUpdateDeniedReasonUnspecifiedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Unspecified Reason"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedReasonUnspecifiedPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedReasonUnspecifiedPDSN(Long a11SessionUpdateDeniedReasonUnspecifiedPDSN) {
		this.a11SessionUpdateDeniedReasonUnspecifiedPDSN = a11SessionUpdateDeniedReasonUnspecifiedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Unspecified Reason"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedReasonUnspecifiedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedReasonUnspecifiedPDSN(Long a11SessionUpdateDeniedReasonUnspecifiedPDSN) {
		this.a11SessionUpdateDeniedReasonUnspecifiedPDSN = a11SessionUpdateDeniedReasonUnspecifiedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "Poorly Formed"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedPoorlyFormedPDSN() {
		return a11SessionUpdateDeniedPoorlyFormedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Poorly Formed"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedPoorlyFormedPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedPoorlyFormedPDSN(Long a11SessionUpdateDeniedPoorlyFormedPDSN) {
		this.a11SessionUpdateDeniedPoorlyFormedPDSN = a11SessionUpdateDeniedPoorlyFormedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Poorly Formed"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedPoorlyFormedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedPoorlyFormedPDSN(Long a11SessionUpdateDeniedPoorlyFormedPDSN) {
		this.a11SessionUpdateDeniedPoorlyFormedPDSN = a11SessionUpdateDeniedPoorlyFormedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "Parameters Not Updated"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedSessionParamsNotUpdatedPDSN() {
		return a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Parameters Not Updated"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedSessionParamsNotUpdatedPDSN(Long a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN) {
		this.a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN = a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Parameters Not Updated"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedSessionParamsNotUpdatedPDSN(Long a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN) {
		this.a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN = a11SessionUpdateDeniedSessionParamsNotUpdatedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "QoS Profile Id Not Updated"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN() {
		return a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "QoS Profile Id Not Updated"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN(Long a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN) {
		this.a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN = a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "QoS Profile Id Not Updated"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN(Long a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN) {
		this.a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN = a11SessionUpdateDeniedQoSProfileIdNotSupportedPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code "Insufficient Resources"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedInsufficientResourcesPDSN() {
		return a11SessionUpdateDeniedInsufficientResourcesPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Insufficient Resources"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedInsufficientResourcesPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedInsufficientResourcesPDSN(Long a11SessionUpdateDeniedInsufficientResourcesPDSN) {
		this.a11SessionUpdateDeniedInsufficientResourcesPDSN = a11SessionUpdateDeniedInsufficientResourcesPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code "Insufficient Resources"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedInsufficientResourcesPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedInsufficientResourcesPDSN(Long a11SessionUpdateDeniedInsufficientResourcesPDSN) {
		this.a11SessionUpdateDeniedInsufficientResourcesPDSN = a11SessionUpdateDeniedInsufficientResourcesPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Session Updates received from this PDSN denied due to reason code"Handoff In Progress"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11SessionUpdateDeniedHandoffInProgressPDSN() {
		return a11SessionUpdateDeniedHandoffInProgressPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code"Handoff In Progress"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedHandoffInProgressPDSN the input value
	 */
	public void  setA11SessionUpdateDeniedHandoffInProgressPDSN(Long a11SessionUpdateDeniedHandoffInProgressPDSN) {
		this.a11SessionUpdateDeniedHandoffInProgressPDSN = a11SessionUpdateDeniedHandoffInProgressPDSN;
	}

	/**
	 * Set the number of A11 Session Updates received from this PDSN denied due to reason code"Handoff In Progress"
	 *
	 * @since 2.0
	 * @param a11SessionUpdateDeniedHandoffInProgressPDSN the input value
	 * @return this instance
	 */
	public A11SessionUpdateStats withA11SessionUpdateDeniedHandoffInProgressPDSN(Long a11SessionUpdateDeniedHandoffInProgressPDSN) {
		this.a11SessionUpdateDeniedHandoffInProgressPDSN = a11SessionUpdateDeniedHandoffInProgressPDSN;
		return this;
	}

	//</editor-fold>

}