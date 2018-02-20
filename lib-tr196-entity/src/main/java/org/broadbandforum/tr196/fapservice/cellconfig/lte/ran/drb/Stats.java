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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.drb;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the DRB statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since TR196 v2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.DRB.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.DRB.Stats")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.DRB.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the average cell bit-rate of PDCP SDUs on the downlink.  This represents the ingress rate of user plane traffic to the HeNB (via S1) by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduBitrateDl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduBitrateDl;
	/**
	 * This measurement provides the average cell bit-rate of PDCP SDUs on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure. Measurement is by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduBitrateUl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduBitrateUl;
	/**
	 * This measurement provides the maximum cell bit-rate of PDCP SDUs on the downlink.  This represents the maximum ingress rate of user plane traffic to the HeNB (via S1).  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduBitrateDlMax")
	@CWMPParameter(activeNotify = "canDeny")
	public Long pdcpSduBitrateDlMax;
	/**
	 * This measurement provides the maximum cell bit-rate of PDCP SDUs measured on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure.  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduBitrateUlMax")
	@CWMPParameter(activeNotify = "canDeny")
	public Long pdcpSduBitrateUlMax;
	/**
	 * This measurement provides the average (arithmetic mean) PDCP SDU delay on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduDelayDl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduDelayDl;
	/**
	 * This measurement provides the fraction of IP packets (PDCP SDUs) which are dropped on the downlink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) is considered.  A dropped packet is one whose context is removed from the HeNB without any part of it having been transmitted on the air interface.  Packets discarded during handover are excluded from the count.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduDropRateDl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduDropRateDl;
	/**
	 * This measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully transmitted) on the downlink air interface by ERAB Bearer QoS level (QCI). Only user-plane traffic (DTCH) is considered. A lost packet is one whose context is removed from the HeNB after an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmittedafter an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmitted.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduAirLossRateDl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduAirLossRateDl;
	/**
	 * This measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully received) on the uplink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) and only PDCP SDUs that have entered PDCP (and given a PDCP sequence number) are considered.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PdcpSduLossRateUl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> pdcpSduLossRateUl;
	/**
	 * This measurement provides the average number of UEs that have user-plane (DTCH) data queued on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "UEActiveDl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> ueactiveDl;
	/**
	 * This measurement provides the average number of UEs that have user-plane (DTCH) data queued on the uplink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "UEActiveUl")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> ueactiveUl;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the average cell bit-rate of PDCP SDUs on the downlink.  This represents the ingress rate of user plane traffic to the HeNB (via S1) by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduBitrateDl() {
		if (this.pdcpSduBitrateDl == null){ this.pdcpSduBitrateDl=new ArrayList<>();}
		return pdcpSduBitrateDl;
	}

	/**
	 * Set the this measurement provides the average cell bit-rate of PDCP SDUs on the downlink.  This represents the ingress rate of user plane traffic to the HeNB (via S1) by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateDl the input value
	 */
	public void  setPdcpSduBitrateDl(Collection<String> pdcpSduBitrateDl) {
		this.pdcpSduBitrateDl = pdcpSduBitrateDl;
	}

	/**
	 * Set the this measurement provides the average cell bit-rate of PDCP SDUs on the downlink.  This represents the ingress rate of user plane traffic to the HeNB (via S1) by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduBitrateDl(String string) {
		getPdcpSduBitrateDl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the average cell bit-rate of PDCP SDUs on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure. Measurement is by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduBitrateUl() {
		if (this.pdcpSduBitrateUl == null){ this.pdcpSduBitrateUl=new ArrayList<>();}
		return pdcpSduBitrateUl;
	}

	/**
	 * Set the this measurement provides the average cell bit-rate of PDCP SDUs on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure. Measurement is by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateUl the input value
	 */
	public void  setPdcpSduBitrateUl(Collection<String> pdcpSduBitrateUl) {
		this.pdcpSduBitrateUl = pdcpSduBitrateUl;
	}

	/**
	 * Set the this measurement provides the average cell bit-rate of PDCP SDUs on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure. Measurement is by SAE Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduBitrateUl(String string) {
		getPdcpSduBitrateUl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the maximum cell bit-rate of PDCP SDUs on the downlink.  This represents the maximum ingress rate of user plane traffic to the HeNB (via S1).  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getPdcpSduBitrateDlMax() {
		return pdcpSduBitrateDlMax;
	}

	/**
	 * Set the this measurement provides the maximum cell bit-rate of PDCP SDUs on the downlink.  This represents the maximum ingress rate of user plane traffic to the HeNB (via S1).  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateDlMax the input value
	 */
	public void  setPdcpSduBitrateDlMax(Long pdcpSduBitrateDlMax) {
		this.pdcpSduBitrateDlMax = pdcpSduBitrateDlMax;
	}

	/**
	 * Set the this measurement provides the maximum cell bit-rate of PDCP SDUs on the downlink.  This represents the maximum ingress rate of user plane traffic to the HeNB (via S1).  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateDlMax the input value
	 * @return this instance
	 */
	public Stats withPdcpSduBitrateDlMax(Long pdcpSduBitrateDlMax) {
		this.pdcpSduBitrateDlMax = pdcpSduBitrateDlMax;
		return this;
	}

	/**
	 * Get the this measurement provides the maximum cell bit-rate of PDCP SDUs measured on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure.  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getPdcpSduBitrateUlMax() {
		return pdcpSduBitrateUlMax;
	}

	/**
	 * Set the this measurement provides the maximum cell bit-rate of PDCP SDUs measured on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure.  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateUlMax the input value
	 */
	public void  setPdcpSduBitrateUlMax(Long pdcpSduBitrateUlMax) {
		this.pdcpSduBitrateUlMax = pdcpSduBitrateUlMax;
	}

	/**
	 * Set the this measurement provides the maximum cell bit-rate of PDCP SDUs measured on the uplink. This represents successful transmissions of user plane traffic; control signalling and retransmissions are excluded from this measure.  This is a sum counter measured across all QCIs.
	 *
	 * @since 2.1
	 * @param pdcpSduBitrateUlMax the input value
	 * @return this instance
	 */
	public Stats withPdcpSduBitrateUlMax(Long pdcpSduBitrateUlMax) {
		this.pdcpSduBitrateUlMax = pdcpSduBitrateUlMax;
		return this;
	}

	/**
	 * Get the this measurement provides the average (arithmetic mean) PDCP SDU delay on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduDelayDl() {
		if (this.pdcpSduDelayDl == null){ this.pdcpSduDelayDl=new ArrayList<>();}
		return pdcpSduDelayDl;
	}

	/**
	 * Set the this measurement provides the average (arithmetic mean) PDCP SDU delay on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduDelayDl the input value
	 */
	public void  setPdcpSduDelayDl(Collection<String> pdcpSduDelayDl) {
		this.pdcpSduDelayDl = pdcpSduDelayDl;
	}

	/**
	 * Set the this measurement provides the average (arithmetic mean) PDCP SDU delay on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduDelayDl(String string) {
		getPdcpSduDelayDl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the fraction of IP packets (PDCP SDUs) which are dropped on the downlink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) is considered.  A dropped packet is one whose context is removed from the HeNB without any part of it having been transmitted on the air interface.  Packets discarded during handover are excluded from the count.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduDropRateDl() {
		if (this.pdcpSduDropRateDl == null){ this.pdcpSduDropRateDl=new ArrayList<>();}
		return pdcpSduDropRateDl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are dropped on the downlink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) is considered.  A dropped packet is one whose context is removed from the HeNB without any part of it having been transmitted on the air interface.  Packets discarded during handover are excluded from the count.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduDropRateDl the input value
	 */
	public void  setPdcpSduDropRateDl(Collection<String> pdcpSduDropRateDl) {
		this.pdcpSduDropRateDl = pdcpSduDropRateDl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are dropped on the downlink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) is considered.  A dropped packet is one whose context is removed from the HeNB without any part of it having been transmitted on the air interface.  Packets discarded during handover are excluded from the count.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduDropRateDl(String string) {
		getPdcpSduDropRateDl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully transmitted) on the downlink air interface by ERAB Bearer QoS level (QCI). Only user-plane traffic (DTCH) is considered. A lost packet is one whose context is removed from the HeNB after an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmittedafter an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmitted.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduAirLossRateDl() {
		if (this.pdcpSduAirLossRateDl == null){ this.pdcpSduAirLossRateDl=new ArrayList<>();}
		return pdcpSduAirLossRateDl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully transmitted) on the downlink air interface by ERAB Bearer QoS level (QCI). Only user-plane traffic (DTCH) is considered. A lost packet is one whose context is removed from the HeNB after an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmittedafter an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmitted.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduAirLossRateDl the input value
	 */
	public void  setPdcpSduAirLossRateDl(Collection<String> pdcpSduAirLossRateDl) {
		this.pdcpSduAirLossRateDl = pdcpSduAirLossRateDl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully transmitted) on the downlink air interface by ERAB Bearer QoS level (QCI). Only user-plane traffic (DTCH) is considered. A lost packet is one whose context is removed from the HeNB after an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmittedafter an attempt has been made to transmit part or all of the packet on the air interface but the whole packet has not been successfully transmitted.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduAirLossRateDl(String string) {
		getPdcpSduAirLossRateDl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully received) on the uplink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) and only PDCP SDUs that have entered PDCP (and given a PDCP sequence number) are considered.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getPdcpSduLossRateUl() {
		if (this.pdcpSduLossRateUl == null){ this.pdcpSduLossRateUl=new ArrayList<>();}
		return pdcpSduLossRateUl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully received) on the uplink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) and only PDCP SDUs that have entered PDCP (and given a PDCP sequence number) are considered.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param pdcpSduLossRateUl the input value
	 */
	public void  setPdcpSduLossRateUl(Collection<String> pdcpSduLossRateUl) {
		this.pdcpSduLossRateUl = pdcpSduLossRateUl;
	}

	/**
	 * Set the this measurement provides the fraction of IP packets (PDCP SDUs) which are lost (not successfully received) on the uplink by ERAB Bearer QoS level (QCI).  Only user-plane traffic (DTCH) and only PDCP SDUs that have entered PDCP (and given a PDCP sequence number) are considered.

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withPdcpSduLossRateUl(String string) {
		getPdcpSduLossRateUl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getUeactiveDl() {
		if (this.ueactiveDl == null){ this.ueactiveDl=new ArrayList<>();}
		return ueactiveDl;
	}

	/**
	 * Set the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param ueactiveDl the input value
	 */
	public void  setUeactiveDl(Collection<String> ueactiveDl) {
		this.ueactiveDl = ueactiveDl;
	}

	/**
	 * Set the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the downlink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withUeactiveDl(String string) {
		getUeactiveDl().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the uplink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getUeactiveUl() {
		if (this.ueactiveUl == null){ this.ueactiveUl=new ArrayList<>();}
		return ueactiveUl;
	}

	/**
	 * Set the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the uplink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param ueactiveUl the input value
	 */
	public void  setUeactiveUl(Collection<String> ueactiveUl) {
		this.ueactiveUl = ueactiveUl;
	}

	/**
	 * Set the this measurement provides the average number of UEs that have user-plane (DTCH) data queued on the uplink by ERAB Bearer QoS level (QCI).

{{list| where each item is defined as the "QCI level=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withUeactiveUl(String string) {
		getUeactiveUl().add(string);
		return this;
	}

	//</editor-fold>

}