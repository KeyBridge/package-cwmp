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
package org.broadbandforum.tr181.device.wifi.accesspoint;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.wifi.accesspoint.ac.Stats;

	/**
	 * This object contains parameters related to WiFi QoS for different 802.11e access categories (priorities). Access categories are: BE, BK, VI, and VO. These parameters can help control and monitor 802.11e Enhanced distributed channel access (EDCA). The size of this table is fixed, with four entries which are identified by the {{param|AccessCategory}} parameter as follows: 

        * BE (Best Effort) 

        * BK (Background)

        * VI (Video)

        * VO (Voice)
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.AC.{i}.")
public class AC {

	/**
	 * This identifies the access category.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AccessCategory")
	public String accessCategory;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Arbitration Inter Frame Spacing (Number). This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AIFSN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2, max = 15)
	public Long aifSN;
	/**
	 * Exponent of Contention Window (Minimum). This encodes the values of CWMin as an exponent: CWMin = 2^ECWMin - 1. For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ECWMin")
	@CWMPParameter(access = "readWrite", units = "microseconds")
	@Size(min = 0, max = 15)
	public Long ecwMin;
	/**
	 * Exponent of Contention Window (Maximum). This encodes the values of CWMax as an exponent: CWMax = 2^ECWMax - 1. For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ECWMax")
	@CWMPParameter(access = "readWrite", units = "microseconds")
	@Size(min = 0, max = 15)
	public Long ecwMax;
	/**
	 * Maximum transmit opportunity, in multiples of 32 microseconds. A TXOP time interval of 0 means it is limited to a single MAC protocol data unit (MPDU).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TxOpMax")
	@CWMPParameter(access = "readWrite", units = "32 microseconds")
	@Size(min = 0, max = 255)
	public Long txopMax;
	/**
	 * Ack Policy, where False="Do Not Acknowledge" and True="Acknowledge"
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "AckPolicy")
	@CWMPParameter(access = "readWrite")
	public Boolean ackPolicy;
	/**
	 * {{list}} Definition of the histogram intervals for counting the transmit queue length in packets. Each value indicates the maximum value of the interval. For example, "0,1,4,8," defines the five intervals: 0 packets in queue, 1 packet in queue, 2 to 4 packets in queue, 5 to 8 packets in queue, and 9 or more packets in queue. (No value after the last comma means no upper bound.) If this parameter is set to {{empty}}, no {{param|Stats.OutQLenHistogram}} stats will be collected.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OutQLenHistogramIntervals")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> outQLenHistogramIntervals;
	/**
	 * The time between recording samples of the current transmit queue in seconds.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OutQLenHistogramSampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long outQLenHistogramSampleInterval;
	/**
	 * This object contains statistics for different 802.11e access categories (priorities).

        Packet counters here count 802.11 WiFi frames. 

        If there are not separate stats for each access category, (e.g., 802.11e is not used and there is only one queue), then only access category 0 = BE applies (e.g., the statistics for the single queue are in access category 0 = BE).

        The CPE MUST reset the Access Point's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the Access Point becomes operationally down due to a previous administrative down (i.e. the Access Point's Status parameter transitions to a Diasbled state) or when the Access Point becomes administratively up (i.e. the Access Point's Enable parameter transitions from false to true). Administrative and operational status is discussed in [Section 4.2.2/TR-181i2].
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public AC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this identifies the access category.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getAccessCategory() {
		return accessCategory;
	}

	/**
	 * Set the this identifies the access category.
	 *
	 * @since 2.8
	 * @param accessCategory the input value
	 */
	public void  setAccessCategory(String accessCategory) {
		this.accessCategory = accessCategory;
	}

	/**
	 * Set the this identifies the access category.
	 *
	 * @since 2.8
	 * @param accessCategory the input value
	 * @return this instance
	 */
	public AC withAccessCategory(String accessCategory) {
		this.accessCategory = accessCategory;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public AC withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get arbitration Inter Frame Spacing (Number). This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getAifSN() {
		return aifSN;
	}

	/**
	 * Set arbitration Inter Frame Spacing (Number). This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 2.8
	 * @param aifSN the input value
	 */
	public void  setAifSN(Long aifSN) {
		this.aifSN = aifSN;
	}

	/**
	 * Set arbitration Inter Frame Spacing (Number). This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 2.8
	 * @param aifSN the input value
	 * @return this instance
	 */
	public AC withAifSN(Long aifSN) {
		this.aifSN = aifSN;
		return this;
	}

	/**
	 * Get the exponent of Contention Window (Minimum). This encodes the values of CWMin as an exponent: CWMin = 2^ECWMin - 1. For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getEcwMin() {
		return ecwMin;
	}

	/**
	 * Set the exponent of Contention Window (Minimum). This encodes the values of CWMin as an exponent: CWMin = 2^ECWMin - 1. For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @param ecwMin the input value
	 */
	public void  setEcwMin(Long ecwMin) {
		this.ecwMin = ecwMin;
	}

	/**
	 * Set the exponent of Contention Window (Minimum). This encodes the values of CWMin as an exponent: CWMin = 2^ECWMin - 1. For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @param ecwMin the input value
	 * @return this instance
	 */
	public AC withEcwMin(Long ecwMin) {
		this.ecwMin = ecwMin;
		return this;
	}

	/**
	 * Get the exponent of Contention Window (Maximum). This encodes the values of CWMax as an exponent: CWMax = 2^ECWMax - 1. For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getEcwMax() {
		return ecwMax;
	}

	/**
	 * Set the exponent of Contention Window (Maximum). This encodes the values of CWMax as an exponent: CWMax = 2^ECWMax - 1. For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @param ecwMax the input value
	 */
	public void  setEcwMax(Long ecwMax) {
		this.ecwMax = ecwMax;
	}

	/**
	 * Set the exponent of Contention Window (Maximum). This encodes the values of CWMax as an exponent: CWMax = 2^ECWMax - 1. For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255, (expressed in microseconds).
	 *
	 * @since 2.8
	 * @param ecwMax the input value
	 * @return this instance
	 */
	public AC withEcwMax(Long ecwMax) {
		this.ecwMax = ecwMax;
		return this;
	}

	/**
	 * Get the maximum transmit opportunity, in multiples of 32 microseconds. A TXOP time interval of 0 means it is limited to a single MAC protocol data unit (MPDU).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getTxopMax() {
		return txopMax;
	}

	/**
	 * Set the maximum transmit opportunity, in multiples of 32 microseconds. A TXOP time interval of 0 means it is limited to a single MAC protocol data unit (MPDU).
	 *
	 * @since 2.8
	 * @param txopMax the input value
	 */
	public void  setTxopMax(Long txopMax) {
		this.txopMax = txopMax;
	}

	/**
	 * Set the maximum transmit opportunity, in multiples of 32 microseconds. A TXOP time interval of 0 means it is limited to a single MAC protocol data unit (MPDU).
	 *
	 * @since 2.8
	 * @param txopMax the input value
	 * @return this instance
	 */
	public AC withTxopMax(Long txopMax) {
		this.txopMax = txopMax;
		return this;
	}

	/**
	 * Get ack Policy, where False="Do Not Acknowledge" and True="Acknowledge"
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isAckPolicy() {
		return ackPolicy;
	}

	/**
	 * Set ack Policy, where False="Do Not Acknowledge" and True="Acknowledge"
	 *
	 * @since 2.8
	 * @param ackPolicy the input value
	 */
	public void  setAckPolicy(Boolean ackPolicy) {
		this.ackPolicy = ackPolicy;
	}

	/**
	 * Set ack Policy, where False="Do Not Acknowledge" and True="Acknowledge"
	 *
	 * @since 2.8
	 * @param ackPolicy the input value
	 * @return this instance
	 */
	public AC withAckPolicy(Boolean ackPolicy) {
		this.ackPolicy = ackPolicy;
		return this;
	}

	/**
	 * Get the {{list}} Definition of the histogram intervals for counting the transmit queue length in packets. Each value indicates the maximum value of the interval. For example, "0,1,4,8," defines the five intervals: 0 packets in queue, 1 packet in queue, 2 to 4 packets in queue, 5 to 8 packets in queue, and 9 or more packets in queue. (No value after the last comma means no upper bound.) If this parameter is set to {{empty}}, no {{param|Stats.OutQLenHistogram}} stats will be collected.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getOutQLenHistogramIntervals() {
		if (this.outQLenHistogramIntervals == null){ this.outQLenHistogramIntervals=new ArrayList<>();}
		return outQLenHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting the transmit queue length in packets. Each value indicates the maximum value of the interval. For example, "0,1,4,8," defines the five intervals: 0 packets in queue, 1 packet in queue, 2 to 4 packets in queue, 5 to 8 packets in queue, and 9 or more packets in queue. (No value after the last comma means no upper bound.) If this parameter is set to {{empty}}, no {{param|Stats.OutQLenHistogram}} stats will be collected.
	 *
	 * @since 2.8
	 * @param outQLenHistogramIntervals the input value
	 */
	public void  setOutQLenHistogramIntervals(Collection<String> outQLenHistogramIntervals) {
		this.outQLenHistogramIntervals = outQLenHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting the transmit queue length in packets. Each value indicates the maximum value of the interval. For example, "0,1,4,8," defines the five intervals: 0 packets in queue, 1 packet in queue, 2 to 4 packets in queue, 5 to 8 packets in queue, and 9 or more packets in queue. (No value after the last comma means no upper bound.) If this parameter is set to {{empty}}, no {{param|Stats.OutQLenHistogram}} stats will be collected.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public AC withOutQLenHistogramIntervals(String string) {
		getOutQLenHistogramIntervals().add(string);
		return this;
	}

	/**
	 * Get the time between recording samples of the current transmit queue in seconds.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getOutQLenHistogramSampleInterval() {
		return outQLenHistogramSampleInterval;
	}

	/**
	 * Set the time between recording samples of the current transmit queue in seconds.
	 *
	 * @since 2.8
	 * @param outQLenHistogramSampleInterval the input value
	 */
	public void  setOutQLenHistogramSampleInterval(Long outQLenHistogramSampleInterval) {
		this.outQLenHistogramSampleInterval = outQLenHistogramSampleInterval;
	}

	/**
	 * Set the time between recording samples of the current transmit queue in seconds.
	 *
	 * @since 2.8
	 * @param outQLenHistogramSampleInterval the input value
	 * @return this instance
	 */
	public AC withOutQLenHistogramSampleInterval(Long outQLenHistogramSampleInterval) {
		this.outQLenHistogramSampleInterval = outQLenHistogramSampleInterval;
		return this;
	}

	/**
	 * Get the this object contains statistics for different 802.11e access categories (priorities).

        Packet counters here count 802.11 WiFi frames. 

        If there are not separate stats for each access category, (e.g., 802.11e is not used and there is only one queue), then only access category 0 = BE applies (e.g., the statistics for the single queue are in access category 0 = BE).

        The CPE MUST reset the Access Point's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the Access Point becomes operationally down due to a previous administrative down (i.e. the Access Point's Status parameter transitions to a Diasbled state) or when the Access Point becomes administratively up (i.e. the Access Point's Enable parameter transitions from false to true). Administrative and operational status is discussed in [Section 4.2.2/TR-181i2].
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for different 802.11e access categories (priorities).

        Packet counters here count 802.11 WiFi frames. 

        If there are not separate stats for each access category, (e.g., 802.11e is not used and there is only one queue), then only access category 0 = BE applies (e.g., the statistics for the single queue are in access category 0 = BE).

        The CPE MUST reset the Access Point's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the Access Point becomes operationally down due to a previous administrative down (i.e. the Access Point's Status parameter transitions to a Diasbled state) or when the Access Point becomes administratively up (i.e. the Access Point's Enable parameter transitions from false to true). Administrative and operational status is discussed in [Section 4.2.2/TR-181i2].
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for different 802.11e access categories (priorities).

        Packet counters here count 802.11 WiFi frames. 

        If there are not separate stats for each access category, (e.g., 802.11e is not used and there is only one queue), then only access category 0 = BE applies (e.g., the statistics for the single queue are in access category 0 = BE).

        The CPE MUST reset the Access Point's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the Access Point becomes operationally down due to a previous administrative down (i.e. the Access Point's Status parameter transitions to a Diasbled state) or when the Access Point becomes administratively up (i.e. the Access Point's Enable parameter transitions from false to true). Administrative and operational status is discussed in [Section 4.2.2/TR-181i2].
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public AC withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}