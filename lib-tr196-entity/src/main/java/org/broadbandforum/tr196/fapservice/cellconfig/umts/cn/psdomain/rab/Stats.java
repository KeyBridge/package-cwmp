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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.psdomain.rab;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.psdomain.rab.stats.LGW;

	/**
	 * This object provides the RAB statistics in the PS Domain as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.PSDomain.RAB.Stats.")
public class Stats {

	/**
	 * This measurement provides the number of requested RAB in establishment attempts for the PS domain by traffic class.

{{list| where each item is defined as the "traffic class name=measurement value"}} The total of all the measurements is provided using the traffic class name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttEstabPS")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> attEstabPS;
	/**
	 * This measurement provides the total number of successfully established RABs for the PS domain
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SuccEstabPS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succEstabPS;
	/**
	 * This measurement provides the total number of RABs establishment failures for the PS domain.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FailEstabPS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failEstabPS;
	/**
	 * This measurement provides the total number of abnormally released PS RAB connections.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RelDropPS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long relDropPS;
	/**
	 * This measurement provides the number of uplink User Bits for PS RABs related with EDCH above RLC. The average uplink data throughput on EDCH RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ULNumUserBitsEDCH")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ulnumUserBitsEDCH;
	/**
	 * This measurement provides the number of Uplink User Bits for PS RABs with UL 64 kbps data rate. The average uplink data throughput on 64 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ULNumUserBits64K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ulnumUserBits64K;
	/**
	 * This measurement provides the number of Uplink User Bits for PS RABs with UL 128 kbps data rate. The average uplink data throughput on 128 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ULNumUserBits128K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ulnumUserBits128K;
	/**
	 * This measurement provides the number of Uplink User Bits for PS RABs with UL 384 kbps data rate. The average uplink data throughput on 384 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ULNumUserBits384K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ulnumUserBits384K;
	/**
	 * This measurement provides the number of Downlink User Bits for PS RABs related with HSDPA above RLC. The average downlink data throughput on HSDPA RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DLNumUserBitsHSDPA")
	@CWMPParameter(activeNotify = "canDeny")
	public Long dlnumUserBitsHSDPA;
	/**
	 * This measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 64 kbps data rate above RLC. The average downlink data throughput on 64 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DLNumUserBits64K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long dlnumUserBits64K;
	/**
	 * This measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 128 kbps data rate above RLC. The average downlink data throughput on 128 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DLNumUserBits128K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long dlnumUserBits128K;
	/**
	 * This measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 384 kbps data rate above RLC. The average downlink data throughput on 384 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DLNumUserBits384K")
	@CWMPParameter(activeNotify = "canDeny")
	public Long dlnumUserBits384K;
	/**
	 * This object provides statistics for the Direct User Plane Path between HNB and Local Gateway as defined in {{bibref|3GPP-TS.32.452}}.
	 */
	@XmlElementWrapper(name = "LGWs")
	@XmlElement(name = "LGW")
	public Collection<LGW> lgws;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of requested RAB in establishment attempts for the PS domain by traffic class.

{{list| where each item is defined as the "traffic class name=measurement value"}} The total of all the measurements is provided using the traffic class name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getAttEstabPS() {
		if (this.attEstabPS == null){ this.attEstabPS=new ArrayList<>();}
		return attEstabPS;
	}

	/**
	 * Set the this measurement provides the number of requested RAB in establishment attempts for the PS domain by traffic class.

{{list| where each item is defined as the "traffic class name=measurement value"}} The total of all the measurements is provided using the traffic class name= "sum".
	 *
	 * @since 2.1
	 * @param attEstabPS the input value
	 */
	public void  setAttEstabPS(Collection<String> attEstabPS) {
		this.attEstabPS = attEstabPS;
	}

	/**
	 * Set the this measurement provides the number of requested RAB in establishment attempts for the PS domain by traffic class.

{{list| where each item is defined as the "traffic class name=measurement value"}} The total of all the measurements is provided using the traffic class name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withAttEstabPS(String string) {
		getAttEstabPS().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the total number of successfully established RABs for the PS domain
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSuccEstabPS() {
		return succEstabPS;
	}

	/**
	 * Set the this measurement provides the total number of successfully established RABs for the PS domain
	 *
	 * @since 2.1
	 * @param succEstabPS the input value
	 */
	public void  setSuccEstabPS(Long succEstabPS) {
		this.succEstabPS = succEstabPS;
	}

	/**
	 * Set the this measurement provides the total number of successfully established RABs for the PS domain
	 *
	 * @since 2.1
	 * @param succEstabPS the input value
	 * @return this instance
	 */
	public Stats withSuccEstabPS(Long succEstabPS) {
		this.succEstabPS = succEstabPS;
		return this;
	}

	/**
	 * Get the this measurement provides the total number of RABs establishment failures for the PS domain.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getFailEstabPS() {
		return failEstabPS;
	}

	/**
	 * Set the this measurement provides the total number of RABs establishment failures for the PS domain.
	 *
	 * @since 2.1
	 * @param failEstabPS the input value
	 */
	public void  setFailEstabPS(Long failEstabPS) {
		this.failEstabPS = failEstabPS;
	}

	/**
	 * Set the this measurement provides the total number of RABs establishment failures for the PS domain.
	 *
	 * @since 2.1
	 * @param failEstabPS the input value
	 * @return this instance
	 */
	public Stats withFailEstabPS(Long failEstabPS) {
		this.failEstabPS = failEstabPS;
		return this;
	}

	/**
	 * Get the this measurement provides the total number of abnormally released PS RAB connections.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getRelDropPS() {
		return relDropPS;
	}

	/**
	 * Set the this measurement provides the total number of abnormally released PS RAB connections.
	 *
	 * @since 2.1
	 * @param relDropPS the input value
	 */
	public void  setRelDropPS(Long relDropPS) {
		this.relDropPS = relDropPS;
	}

	/**
	 * Set the this measurement provides the total number of abnormally released PS RAB connections.
	 *
	 * @since 2.1
	 * @param relDropPS the input value
	 * @return this instance
	 */
	public Stats withRelDropPS(Long relDropPS) {
		this.relDropPS = relDropPS;
		return this;
	}

	/**
	 * Get the this measurement provides the number of uplink User Bits for PS RABs related with EDCH above RLC. The average uplink data throughput on EDCH RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getUlnumUserBitsEDCH() {
		return ulnumUserBitsEDCH;
	}

	/**
	 * Set the this measurement provides the number of uplink User Bits for PS RABs related with EDCH above RLC. The average uplink data throughput on EDCH RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBitsEDCH the input value
	 */
	public void  setUlnumUserBitsEDCH(Long ulnumUserBitsEDCH) {
		this.ulnumUserBitsEDCH = ulnumUserBitsEDCH;
	}

	/**
	 * Set the this measurement provides the number of uplink User Bits for PS RABs related with EDCH above RLC. The average uplink data throughput on EDCH RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBitsEDCH the input value
	 * @return this instance
	 */
	public Stats withUlnumUserBitsEDCH(Long ulnumUserBitsEDCH) {
		this.ulnumUserBitsEDCH = ulnumUserBitsEDCH;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Uplink User Bits for PS RABs with UL 64 kbps data rate. The average uplink data throughput on 64 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getUlnumUserBits64K() {
		return ulnumUserBits64K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 64 kbps data rate. The average uplink data throughput on 64 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits64K the input value
	 */
	public void  setUlnumUserBits64K(Long ulnumUserBits64K) {
		this.ulnumUserBits64K = ulnumUserBits64K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 64 kbps data rate. The average uplink data throughput on 64 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits64K the input value
	 * @return this instance
	 */
	public Stats withUlnumUserBits64K(Long ulnumUserBits64K) {
		this.ulnumUserBits64K = ulnumUserBits64K;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Uplink User Bits for PS RABs with UL 128 kbps data rate. The average uplink data throughput on 128 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getUlnumUserBits128K() {
		return ulnumUserBits128K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 128 kbps data rate. The average uplink data throughput on 128 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits128K the input value
	 */
	public void  setUlnumUserBits128K(Long ulnumUserBits128K) {
		this.ulnumUserBits128K = ulnumUserBits128K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 128 kbps data rate. The average uplink data throughput on 128 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits128K the input value
	 * @return this instance
	 */
	public Stats withUlnumUserBits128K(Long ulnumUserBits128K) {
		this.ulnumUserBits128K = ulnumUserBits128K;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Uplink User Bits for PS RABs with UL 384 kbps data rate. The average uplink data throughput on 384 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getUlnumUserBits384K() {
		return ulnumUserBits384K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 384 kbps data rate. The average uplink data throughput on 384 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits384K the input value
	 */
	public void  setUlnumUserBits384K(Long ulnumUserBits384K) {
		this.ulnumUserBits384K = ulnumUserBits384K;
	}

	/**
	 * Set the this measurement provides the number of Uplink User Bits for PS RABs with UL 384 kbps data rate. The average uplink data throughput on 384 kbps RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param ulnumUserBits384K the input value
	 * @return this instance
	 */
	public Stats withUlnumUserBits384K(Long ulnumUserBits384K) {
		this.ulnumUserBits384K = ulnumUserBits384K;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Downlink User Bits for PS RABs related with HSDPA above RLC. The average downlink data throughput on HSDPA RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getDlnumUserBitsHSDPA() {
		return dlnumUserBitsHSDPA;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs related with HSDPA above RLC. The average downlink data throughput on HSDPA RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBitsHSDPA the input value
	 */
	public void  setDlnumUserBitsHSDPA(Long dlnumUserBitsHSDPA) {
		this.dlnumUserBitsHSDPA = dlnumUserBitsHSDPA;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs related with HSDPA above RLC. The average downlink data throughput on HSDPA RABs can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBitsHSDPA the input value
	 * @return this instance
	 */
	public Stats withDlnumUserBitsHSDPA(Long dlnumUserBitsHSDPA) {
		this.dlnumUserBitsHSDPA = dlnumUserBitsHSDPA;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 64 kbps data rate above RLC. The average downlink data throughput on 64 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getDlnumUserBits64K() {
		return dlnumUserBits64K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 64 kbps data rate above RLC. The average downlink data throughput on 64 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits64K the input value
	 */
	public void  setDlnumUserBits64K(Long dlnumUserBits64K) {
		this.dlnumUserBits64K = dlnumUserBits64K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 64 kbps data rate above RLC. The average downlink data throughput on 64 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits64K the input value
	 * @return this instance
	 */
	public Stats withDlnumUserBits64K(Long dlnumUserBits64K) {
		this.dlnumUserBits64K = dlnumUserBits64K;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 128 kbps data rate above RLC. The average downlink data throughput on 128 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getDlnumUserBits128K() {
		return dlnumUserBits128K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 128 kbps data rate above RLC. The average downlink data throughput on 128 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits128K the input value
	 */
	public void  setDlnumUserBits128K(Long dlnumUserBits128K) {
		this.dlnumUserBits128K = dlnumUserBits128K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 128 kbps data rate above RLC. The average downlink data throughput on 128 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits128K the input value
	 * @return this instance
	 */
	public Stats withDlnumUserBits128K(Long dlnumUserBits128K) {
		this.dlnumUserBits128K = dlnumUserBits128K;
		return this;
	}

	/**
	 * Get the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 384 kbps data rate above RLC. The average downlink data throughput on 384 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getDlnumUserBits384K() {
		return dlnumUserBits384K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 384 kbps data rate above RLC. The average downlink data throughput on 384 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits384K the input value
	 */
	public void  setDlnumUserBits384K(Long dlnumUserBits384K) {
		this.dlnumUserBits384K = dlnumUserBits384K;
	}

	/**
	 * Set the this measurement provides the number of Downlink User Bits for PS RABs (non-HSDPA) with DL 384 kbps data rate above RLC. The average downlink data throughput on 384 kbps RABs (non-HSDPA) can be derived from this measurement.
	 *
	 * @since 2.1
	 * @param dlnumUserBits384K the input value
	 * @return this instance
	 */
	public Stats withDlnumUserBits384K(Long dlnumUserBits384K) {
		this.dlnumUserBits384K = dlnumUserBits384K;
		return this;
	}

	/**
	 * Get the this object provides statistics for the Direct User Plane Path between HNB and Local Gateway as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @return the value
	 */
	public Collection<LGW> getLgws() {
		if (this.lgws == null){ this.lgws=new ArrayList<>();}
		return lgws;
	}

	/**
	 * Set the this object provides statistics for the Direct User Plane Path between HNB and Local Gateway as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @param lgws the input value
	 */
	public void  setLgws(Collection<LGW> lgws) {
		this.lgws = lgws;
	}

	/**
	 * Set the this object provides statistics for the Direct User Plane Path between HNB and Local Gateway as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @param lgw the input value
	 * @return this instance
	 */
	public Stats withLGW(LGW lgw) {
		getLgws().add(lgw);
		return this;
	}

	//</editor-fold>

}