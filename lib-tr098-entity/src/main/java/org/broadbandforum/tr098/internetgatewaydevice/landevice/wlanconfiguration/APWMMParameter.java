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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This is a table of WMM parameters for traffic that originates at the wireless access point, i.e. for outgoing traffic.  The size of this table is fixed, with 4 entries (with instance numbers 1 through 4).  Instance numbers MUST be assigned as follows:

# BE AC (Best Effort)

# BK AC (Background)

# VI AC (Video)

# VO AC (Voice)
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.APWMMParameter.{i}.")
public class APWMMParameter {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Arbitration Inter Frame Spacing (Number).  This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AIFSN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2, max = 15)
	public Long aifSN;
	/**
	 * Exponent of Contention Window (Minimum). This encodes the Values of CWMin as an exponent: CWMin = 2^ECWMin - 1.

For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ECWMin")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long ecwMin;
	/**
	 * Exponent of Contention Window (Maximum). This encodes the Values of CWMax as an exponent: CWMax = 2^ECWMax - 1.

For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ECWMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long ecwMax;
	/**
	 * Transmit Opportunity, in multiples of 32 microseconds.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TXOP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long txoP;
	/**
	 * Ack Policy, where {{false}}=''Do Not Acknowledge'' and {{true}}=''Acknowledge''.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AckPolicy")
	@CWMPParameter(access = "readWrite")
	public Boolean ackPolicy;

	public APWMMParameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public APWMMParameter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get arbitration Inter Frame Spacing (Number).  This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getAifSN() {
		return aifSN;
	}

	/**
	 * Set arbitration Inter Frame Spacing (Number).  This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 1.4
	 * @param aifSN the input value
	 */
	public void  setAifSN(Long aifSN) {
		this.aifSN = aifSN;
	}

	/**
	 * Set arbitration Inter Frame Spacing (Number).  This is the number of time slots in the arbitration interframe space.
	 *
	 * @since 1.4
	 * @param aifSN the input value
	 * @return this instance
	 */
	public APWMMParameter withAifSN(Long aifSN) {
		this.aifSN = aifSN;
		return this;
	}

	/**
	 * Get the exponent of Contention Window (Minimum). This encodes the Values of CWMin as an exponent: CWMin = 2^ECWMin - 1.

For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEcwMin() {
		return ecwMin;
	}

	/**
	 * Set the exponent of Contention Window (Minimum). This encodes the Values of CWMin as an exponent: CWMin = 2^ECWMin - 1.

For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @param ecwMin the input value
	 */
	public void  setEcwMin(Long ecwMin) {
		this.ecwMin = ecwMin;
	}

	/**
	 * Set the exponent of Contention Window (Minimum). This encodes the Values of CWMin as an exponent: CWMin = 2^ECWMin - 1.

For example, if ECWMin is 8, then CWMin is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @param ecwMin the input value
	 * @return this instance
	 */
	public APWMMParameter withEcwMin(Long ecwMin) {
		this.ecwMin = ecwMin;
		return this;
	}

	/**
	 * Get the exponent of Contention Window (Maximum). This encodes the Values of CWMax as an exponent: CWMax = 2^ECWMax - 1.

For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEcwMax() {
		return ecwMax;
	}

	/**
	 * Set the exponent of Contention Window (Maximum). This encodes the Values of CWMax as an exponent: CWMax = 2^ECWMax - 1.

For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @param ecwMax the input value
	 */
	public void  setEcwMax(Long ecwMax) {
		this.ecwMax = ecwMax;
	}

	/**
	 * Set the exponent of Contention Window (Maximum). This encodes the Values of CWMax as an exponent: CWMax = 2^ECWMax - 1.

For example, if ECWMax is 8, then CWMax is 2^8 - 1, or 255,
	 *
	 * @since 1.4
	 * @param ecwMax the input value
	 * @return this instance
	 */
	public APWMMParameter withEcwMax(Long ecwMax) {
		this.ecwMax = ecwMax;
		return this;
	}

	/**
	 * Get the transmit Opportunity, in multiples of 32 microseconds.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTxoP() {
		return txoP;
	}

	/**
	 * Set the transmit Opportunity, in multiples of 32 microseconds.
	 *
	 * @since 1.4
	 * @param txoP the input value
	 */
	public void  setTxoP(Long txoP) {
		this.txoP = txoP;
	}

	/**
	 * Set the transmit Opportunity, in multiples of 32 microseconds.
	 *
	 * @since 1.4
	 * @param txoP the input value
	 * @return this instance
	 */
	public APWMMParameter withTxoP(Long txoP) {
		this.txoP = txoP;
		return this;
	}

	/**
	 * Get ack Policy, where {{false}}=''Do Not Acknowledge'' and {{true}}=''Acknowledge''.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isAckPolicy() {
		return ackPolicy;
	}

	/**
	 * Set ack Policy, where {{false}}=''Do Not Acknowledge'' and {{true}}=''Acknowledge''.
	 *
	 * @since 1.4
	 * @param ackPolicy the input value
	 */
	public void  setAckPolicy(Boolean ackPolicy) {
		this.ackPolicy = ackPolicy;
	}

	/**
	 * Set ack Policy, where {{false}}=''Do Not Acknowledge'' and {{true}}=''Acknowledge''.
	 *
	 * @since 1.4
	 * @param ackPolicy the input value
	 * @return this instance
	 */
	public APWMMParameter withAckPolicy(Boolean ackPolicy) {
		this.ackPolicy = ackPolicy;
		return this;
	}

	//</editor-fold>

}