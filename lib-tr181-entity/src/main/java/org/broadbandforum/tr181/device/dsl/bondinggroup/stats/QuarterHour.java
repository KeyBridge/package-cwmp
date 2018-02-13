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
package org.broadbandforum.tr181.device.dsl.bondinggroup.stats;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Current quarter hour statistics for this bonding group.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.Stats.QuarterHour.")
@XmlRootElement(name = "QuarterHour")
@XmlType(name = "Device.DSL.BondingGroup.Stats.QuarterHour")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuarterHour {

	/**
	 * {{list}}  Indicates the failure conditions that have occurred during the accumulation period.  

Enumerated value must be one of [LowRate, ExcessiveDelay, InsufficientBuffers, Other]

          Corresponds to {{bibref|G.998.1|section 11.4.3}} ''Current Group Failure Reason''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FailureReasons")
	@XmlList
	public Collection<String> failureReasons;
	/**
	 * The achieved upstream data rate in bits per second (which might change subject to dynamic link usage conditions).  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamRate")
	public Long upstreamRate;
	/**
	 * The achieved downstream data rate in bits per second (which might change subject to dynamic link usage conditions).   Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamRate")
	public Long downstreamRate;
	/**
	 * The total number of upstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamPacketLoss")
	public Long upstreamPacketLoss;
	/**
	 * The total number of downstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamPacketLoss")
	public Long downstreamPacketLoss;
	/**
	 * The achieved upstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamDifferentialDelay")
	public Long upstreamDifferentialDelay;
	/**
	 * The achieved downstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamDifferentialDelay")
	public Long downstreamDifferentialDelay;
	/**
	 * The number of times that the group was declared ''Unavailable'' during the accumulation period.  Corresponds to  {{bibref|G.998.1|Section 11.4.3}} ''Group Failure Count''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FailureCount")
	public Long failureCount;
	/**
	 * The time in seconds during which the group was declared ''Errored'' during the accumulation period. Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**ES''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErroredSeconds")
	public Long erroredSeconds;
	/**
	 * The time in seconds during which the group was declared ''SeverelyErrored'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**SES''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SeverelyErroredSeconds")
	public Long severelyErroredSeconds;
	/**
	 * The time in seconds during which the group was declared ''Unavailable'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**UAS''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnavailableSeconds")
	public Long unavailableSeconds;

	public QuarterHour() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}}  Indicates the failure conditions that have occurred during the accumulation period.  

Enumerated value must be one of [LowRate, ExcessiveDelay, InsufficientBuffers, Other]

          Corresponds to {{bibref|G.998.1|section 11.4.3}} ''Current Group Failure Reason''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFailureReasons() {
		if (this.failureReasons == null){ this.failureReasons=new ArrayList<>();}
		return failureReasons;
	}

	/**
	 * Set the {{list}}  Indicates the failure conditions that have occurred during the accumulation period.  

Enumerated value must be one of [LowRate, ExcessiveDelay, InsufficientBuffers, Other]

          Corresponds to {{bibref|G.998.1|section 11.4.3}} ''Current Group Failure Reason''.
	 *
	 * @since 2.0
	 * @param failureReasons the input value
	 */
	public void  setFailureReasons(Collection<String> failureReasons) {
		this.failureReasons = failureReasons;
	}

	/**
	 * Set the {{list}}  Indicates the failure conditions that have occurred during the accumulation period.  

Enumerated value must be one of [LowRate, ExcessiveDelay, InsufficientBuffers, Other]

          Corresponds to {{bibref|G.998.1|section 11.4.3}} ''Current Group Failure Reason''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public QuarterHour withFailureReasons(String string) {
		getFailureReasons().add(string);
		return this;
	}

	/**
	 * Get the achieved upstream data rate in bits per second (which might change subject to dynamic link usage conditions).  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamRate() {
		return upstreamRate;
	}

	/**
	 * Set the achieved upstream data rate in bits per second (which might change subject to dynamic link usage conditions).  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @param upstreamRate the input value
	 */
	public void  setUpstreamRate(Long upstreamRate) {
		this.upstreamRate = upstreamRate;
	}

	/**
	 * Set the achieved upstream data rate in bits per second (which might change subject to dynamic link usage conditions).  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @param upstreamRate the input value
	 * @return this instance
	 */
	public QuarterHour withUpstreamRate(Long upstreamRate) {
		this.upstreamRate = upstreamRate;
		return this;
	}

	/**
	 * Get the achieved downstream data rate in bits per second (which might change subject to dynamic link usage conditions).   Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamRate() {
		return downstreamRate;
	}

	/**
	 * Set the achieved downstream data rate in bits per second (which might change subject to dynamic link usage conditions).   Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @param downstreamRate the input value
	 */
	public void  setDownstreamRate(Long downstreamRate) {
		this.downstreamRate = downstreamRate;
	}

	/**
	 * Set the achieved downstream data rate in bits per second (which might change subject to dynamic link usage conditions).   Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Achieved Aggregate Data Rate''.
	 *
	 * @since 2.0
	 * @param downstreamRate the input value
	 * @return this instance
	 */
	public QuarterHour withDownstreamRate(Long downstreamRate) {
		this.downstreamRate = downstreamRate;
		return this;
	}

	/**
	 * Get the total number of upstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamPacketLoss() {
		return upstreamPacketLoss;
	}

	/**
	 * Set the total number of upstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @param upstreamPacketLoss the input value
	 */
	public void  setUpstreamPacketLoss(Long upstreamPacketLoss) {
		this.upstreamPacketLoss = upstreamPacketLoss;
	}

	/**
	 * Set the total number of upstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @param upstreamPacketLoss the input value
	 * @return this instance
	 */
	public QuarterHour withUpstreamPacketLoss(Long upstreamPacketLoss) {
		this.upstreamPacketLoss = upstreamPacketLoss;
		return this;
	}

	/**
	 * Get the total number of downstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamPacketLoss() {
		return downstreamPacketLoss;
	}

	/**
	 * Set the total number of downstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @param downstreamPacketLoss the input value
	 */
	public void  setDownstreamPacketLoss(Long downstreamPacketLoss) {
		this.downstreamPacketLoss = downstreamPacketLoss;
	}

	/**
	 * Set the total number of downstream packets that were lost at aggregation output from a bonding group during the  accumulation period.  Corresponds to {{bibref|G.998.1|section 11.4.2}} ''Group Rx Cell Loss Count''.
	 *
	 * @since 2.0
	 * @param downstreamPacketLoss the input value
	 * @return this instance
	 */
	public QuarterHour withDownstreamPacketLoss(Long downstreamPacketLoss) {
		this.downstreamPacketLoss = downstreamPacketLoss;
		return this;
	}

	/**
	 * Get the achieved upstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamDifferentialDelay() {
		return upstreamDifferentialDelay;
	}

	/**
	 * Set the achieved upstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @param upstreamDifferentialDelay the input value
	 */
	public void  setUpstreamDifferentialDelay(Long upstreamDifferentialDelay) {
		this.upstreamDifferentialDelay = upstreamDifferentialDelay;
	}

	/**
	 * Set the achieved upstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @param upstreamDifferentialDelay the input value
	 * @return this instance
	 */
	public QuarterHour withUpstreamDifferentialDelay(Long upstreamDifferentialDelay) {
		this.upstreamDifferentialDelay = upstreamDifferentialDelay;
		return this;
	}

	/**
	 * Get the achieved downstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamDifferentialDelay() {
		return downstreamDifferentialDelay;
	}

	/**
	 * Set the achieved downstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @param downstreamDifferentialDelay the input value
	 */
	public void  setDownstreamDifferentialDelay(Long downstreamDifferentialDelay) {
		this.downstreamDifferentialDelay = downstreamDifferentialDelay;
	}

	/**
	 * Set the achieved downstream differential delay in milliseconds (which might change subject to dynamic link usage  conditions).
	 *
	 * @since 2.0
	 * @param downstreamDifferentialDelay the input value
	 * @return this instance
	 */
	public QuarterHour withDownstreamDifferentialDelay(Long downstreamDifferentialDelay) {
		this.downstreamDifferentialDelay = downstreamDifferentialDelay;
		return this;
	}

	/**
	 * Get the number of times that the group was declared ''Unavailable'' during the accumulation period.  Corresponds to  {{bibref|G.998.1|Section 11.4.3}} ''Group Failure Count''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFailureCount() {
		return failureCount;
	}

	/**
	 * Set the number of times that the group was declared ''Unavailable'' during the accumulation period.  Corresponds to  {{bibref|G.998.1|Section 11.4.3}} ''Group Failure Count''.
	 *
	 * @since 2.0
	 * @param failureCount the input value
	 */
	public void  setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}

	/**
	 * Set the number of times that the group was declared ''Unavailable'' during the accumulation period.  Corresponds to  {{bibref|G.998.1|Section 11.4.3}} ''Group Failure Count''.
	 *
	 * @since 2.0
	 * @param failureCount the input value
	 * @return this instance
	 */
	public QuarterHour withFailureCount(Long failureCount) {
		this.failureCount = failureCount;
		return this;
	}

	/**
	 * Get the time in seconds during which the group was declared ''Errored'' during the accumulation period. Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**ES''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErroredSeconds() {
		return erroredSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''Errored'' during the accumulation period. Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**ES''.
	 *
	 * @since 2.0
	 * @param erroredSeconds the input value
	 */
	public void  setErroredSeconds(Long erroredSeconds) {
		this.erroredSeconds = erroredSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''Errored'' during the accumulation period. Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**ES''.
	 *
	 * @since 2.0
	 * @param erroredSeconds the input value
	 * @return this instance
	 */
	public QuarterHour withErroredSeconds(Long erroredSeconds) {
		this.erroredSeconds = erroredSeconds;
		return this;
	}

	/**
	 * Get the time in seconds during which the group was declared ''SeverelyErrored'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**SES''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSeverelyErroredSeconds() {
		return severelyErroredSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''SeverelyErrored'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**SES''.
	 *
	 * @since 2.0
	 * @param severelyErroredSeconds the input value
	 */
	public void  setSeverelyErroredSeconds(Long severelyErroredSeconds) {
		this.severelyErroredSeconds = severelyErroredSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''SeverelyErrored'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**SES''.
	 *
	 * @since 2.0
	 * @param severelyErroredSeconds the input value
	 * @return this instance
	 */
	public QuarterHour withSeverelyErroredSeconds(Long severelyErroredSeconds) {
		this.severelyErroredSeconds = severelyErroredSeconds;
		return this;
	}

	/**
	 * Get the time in seconds during which the group was declared ''Unavailable'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**UAS''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnavailableSeconds() {
		return unavailableSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''Unavailable'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**UAS''.
	 *
	 * @since 2.0
	 * @param unavailableSeconds the input value
	 */
	public void  setUnavailableSeconds(Long unavailableSeconds) {
		this.unavailableSeconds = unavailableSeconds;
	}

	/**
	 * Set the time in seconds during which the group was declared ''Unavailable'' during the accumulation period.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupPerf**UAS''.
	 *
	 * @since 2.0
	 * @param unavailableSeconds the input value
	 * @return this instance
	 */
	public QuarterHour withUnavailableSeconds(Long unavailableSeconds) {
		this.unavailableSeconds = unavailableSeconds;
		return this;
	}

	//</editor-fold>

}