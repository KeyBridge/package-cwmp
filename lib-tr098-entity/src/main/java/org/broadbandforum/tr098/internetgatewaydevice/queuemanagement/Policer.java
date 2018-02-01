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
package org.broadbandforum.tr098.internetgatewaydevice.queuemanagement;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Policer table.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.Policer.{i}.")
public class Policer {

	/**
	 * Unique key for each policer entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PolicerKey")
	public Long policerKey;
	/**
	 * Enables or disables this policer.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PolicerEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean policerEnable = false;
	/**
	 * The status of this policer.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PolicerStatus")
	public String policerStatus = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Committed rate allowed for this policer in bits-per-second.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CommittedRate")
	@CWMPParameter(access = "readWrite")
	public Long committedRate = 0L;
	/**
	 * Committed Burstsize in bytes.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CommittedBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long committedBurstSize = 0L;
	/**
	 * Excess Burstsize in bytes.

Applied for a {{enum|SingleRateThreeColor|MeterType}} meter.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ExcessBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long excessBurstSize = 0L;
	/**
	 * Peak rate allowed for this Meter in bits-per-second.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PeakRate")
	@CWMPParameter(access = "readWrite")
	public Long peakRate = 0L;
	/**
	 * Peak Burstsize in bytes.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PeakBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long peakBurstSize = 0L;
	/**
	 * Identifies the method of traffic measurement to be used for this policer.  {{enum}}

{{enum|SimpleTokenBucket}} makes use of {{param|CommittedRate}} and {{param|CommittedBurstSize}}.

{{enum|SingleRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, and {{param|ExcessBurstSize}} as defined in RFC 2697 {{bibref|RFC2697}}.

{{enum|TwoRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, {{param|PeakRate}}, and {{param|PeakBurstSize}} as defined in RFC 2698 {{bibref|RFC2698}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MeterType")
	@CWMPParameter(access = "readWrite")
	public String meterType = "SimpleTokenBucket";
	/**
	 * Supported meter types.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PossibleMeterTypes")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> possibleMeterTypes;
	/**
	 * Instructions for how to handle traffic that is conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 */
	@XmlElement(name = "ConformingAction")
	@CWMPParameter(access = "readWrite")
	public String conformingAction = "Null";
	/**
	 * Instructions for how to handle traffic that is partially conforming (colored yellow).  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.Only applies for three-color meters.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 */
	@XmlElement(name = "PartialConformingAction")
	@CWMPParameter(access = "readWrite")
	public String partialConformingAction = "Drop";
	/**
	 * Instructions for how to handle traffic that is non-conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 */
	@XmlElement(name = "NonConformingAction")
	@CWMPParameter(access = "readWrite")
	public String nonConformingAction = "Drop";
	/**
	 * Number of Packets counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CountedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long countedPackets = 0L;
	/**
	 * Number of Bytes counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CountedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long countedBytes = 0L;
	/**
	 * Total number of Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TotalCountedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalCountedPackets = 0L;
	/**
	 * Total number of Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TotalCountedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalCountedBytes = 0L;
	/**
	 * Number of conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ConformingCountedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long conformingCountedPackets = 0L;
	/**
	 * Number of conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ConformingCountedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long conformingCountedBytes = 0L;
	/**
	 * Number of partially conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PartiallyConformingCountedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long partiallyConformingCountedPackets = 0L;
	/**
	 * Number of partially conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PartiallyConformingCountedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long partiallyConformingCountedBytes = 0L;
	/**
	 * Number of non-conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "NonConformingCountedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long nonConformingCountedPackets = 0L;
	/**
	 * Number of non-conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "NonConformingCountedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long nonConformingCountedBytes = 0L;

	public Policer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each policer entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPolicerKey() {
		return policerKey;
	}

	/**
	 * Set the unique key for each policer entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param policerKey the input value
	 */
	public void  setPolicerKey(Long policerKey) {
		this.policerKey = policerKey;
	}

	/**
	 * Set the unique key for each policer entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param policerKey the input value
	 * @return this instance
	 */
	public Policer withPolicerKey(Long policerKey) {
		this.policerKey = policerKey;
		return this;
	}

	/**
	 * Get the enables or disables this policer.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isPolicerEnable() {
		return policerEnable;
	}

	/**
	 * Set the enables or disables this policer.
	 *
	 * @since 1.1
	 * @param policerEnable the input value
	 */
	public void  setPolicerEnable(Boolean policerEnable) {
		this.policerEnable = policerEnable;
	}

	/**
	 * Set the enables or disables this policer.
	 *
	 * @since 1.1
	 * @param policerEnable the input value
	 * @return this instance
	 */
	public Policer withPolicerEnable(Boolean policerEnable) {
		this.policerEnable = policerEnable;
		return this;
	}

	/**
	 * Get the status of this policer.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getPolicerStatus() {
		return policerStatus;
	}

	/**
	 * Set the status of this policer.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param policerStatus the input value
	 */
	public void  setPolicerStatus(String policerStatus) {
		this.policerStatus = policerStatus;
	}

	/**
	 * Set the status of this policer.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param policerStatus the input value
	 * @return this instance
	 */
	public Policer withPolicerStatus(String policerStatus) {
		this.policerStatus = policerStatus;
		return this;
	}

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
	public Policer withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the committed rate allowed for this policer in bits-per-second.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCommittedRate() {
		return committedRate;
	}

	/**
	 * Set the committed rate allowed for this policer in bits-per-second.
	 *
	 * @since 1.1
	 * @param committedRate the input value
	 */
	public void  setCommittedRate(Long committedRate) {
		this.committedRate = committedRate;
	}

	/**
	 * Set the committed rate allowed for this policer in bits-per-second.
	 *
	 * @since 1.1
	 * @param committedRate the input value
	 * @return this instance
	 */
	public Policer withCommittedRate(Long committedRate) {
		this.committedRate = committedRate;
		return this;
	}

	/**
	 * Get the committed Burstsize in bytes.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCommittedBurstSize() {
		return committedBurstSize;
	}

	/**
	 * Set the committed Burstsize in bytes.
	 *
	 * @since 1.1
	 * @param committedBurstSize the input value
	 */
	public void  setCommittedBurstSize(Long committedBurstSize) {
		this.committedBurstSize = committedBurstSize;
	}

	/**
	 * Set the committed Burstsize in bytes.
	 *
	 * @since 1.1
	 * @param committedBurstSize the input value
	 * @return this instance
	 */
	public Policer withCommittedBurstSize(Long committedBurstSize) {
		this.committedBurstSize = committedBurstSize;
		return this;
	}

	/**
	 * Get the excess Burstsize in bytes.

Applied for a {{enum|SingleRateThreeColor|MeterType}} meter.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getExcessBurstSize() {
		return excessBurstSize;
	}

	/**
	 * Set the excess Burstsize in bytes.

Applied for a {{enum|SingleRateThreeColor|MeterType}} meter.
	 *
	 * @since 1.1
	 * @param excessBurstSize the input value
	 */
	public void  setExcessBurstSize(Long excessBurstSize) {
		this.excessBurstSize = excessBurstSize;
	}

	/**
	 * Set the excess Burstsize in bytes.

Applied for a {{enum|SingleRateThreeColor|MeterType}} meter.
	 *
	 * @since 1.1
	 * @param excessBurstSize the input value
	 * @return this instance
	 */
	public Policer withExcessBurstSize(Long excessBurstSize) {
		this.excessBurstSize = excessBurstSize;
		return this;
	}

	/**
	 * Get the peak rate allowed for this Meter in bits-per-second.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPeakRate() {
		return peakRate;
	}

	/**
	 * Set the peak rate allowed for this Meter in bits-per-second.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @param peakRate the input value
	 */
	public void  setPeakRate(Long peakRate) {
		this.peakRate = peakRate;
	}

	/**
	 * Set the peak rate allowed for this Meter in bits-per-second.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @param peakRate the input value
	 * @return this instance
	 */
	public Policer withPeakRate(Long peakRate) {
		this.peakRate = peakRate;
		return this;
	}

	/**
	 * Get the peak Burstsize in bytes.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getPeakBurstSize() {
		return peakBurstSize;
	}

	/**
	 * Set the peak Burstsize in bytes.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @param peakBurstSize the input value
	 */
	public void  setPeakBurstSize(Long peakBurstSize) {
		this.peakBurstSize = peakBurstSize;
	}

	/**
	 * Set the peak Burstsize in bytes.

Applied for {{enum|TwoRateThreeColor|MeterType}} meters.
	 *
	 * @since 1.1
	 * @param peakBurstSize the input value
	 * @return this instance
	 */
	public Policer withPeakBurstSize(Long peakBurstSize) {
		this.peakBurstSize = peakBurstSize;
		return this;
	}

	/**
	 * Get the identifies the method of traffic measurement to be used for this policer.  {{enum}}

{{enum|SimpleTokenBucket}} makes use of {{param|CommittedRate}} and {{param|CommittedBurstSize}}.

{{enum|SingleRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, and {{param|ExcessBurstSize}} as defined in RFC 2697 {{bibref|RFC2697}}.

{{enum|TwoRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, {{param|PeakRate}}, and {{param|PeakBurstSize}} as defined in RFC 2698 {{bibref|RFC2698}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getMeterType() {
		return meterType;
	}

	/**
	 * Set the identifies the method of traffic measurement to be used for this policer.  {{enum}}

{{enum|SimpleTokenBucket}} makes use of {{param|CommittedRate}} and {{param|CommittedBurstSize}}.

{{enum|SingleRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, and {{param|ExcessBurstSize}} as defined in RFC 2697 {{bibref|RFC2697}}.

{{enum|TwoRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, {{param|PeakRate}}, and {{param|PeakBurstSize}} as defined in RFC 2698 {{bibref|RFC2698}}.
	 *
	 * @since 1.1
	 * @param meterType the input value
	 */
	public void  setMeterType(String meterType) {
		this.meterType = meterType;
	}

	/**
	 * Set the identifies the method of traffic measurement to be used for this policer.  {{enum}}

{{enum|SimpleTokenBucket}} makes use of {{param|CommittedRate}} and {{param|CommittedBurstSize}}.

{{enum|SingleRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, and {{param|ExcessBurstSize}} as defined in RFC 2697 {{bibref|RFC2697}}.

{{enum|TwoRateThreeColor}} makes use of {{param|CommittedRate}}, {{param|CommittedBurstSize}}, {{param|PeakRate}}, and {{param|PeakBurstSize}} as defined in RFC 2698 {{bibref|RFC2698}}.
	 *
	 * @since 1.1
	 * @param meterType the input value
	 * @return this instance
	 */
	public Policer withMeterType(String meterType) {
		this.meterType = meterType;
		return this;
	}

	/**
	 * Get the supported meter types.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getPossibleMeterTypes() {
		if (this.possibleMeterTypes == null){ this.possibleMeterTypes=new ArrayList<>();}
		return possibleMeterTypes;
	}

	/**
	 * Set the supported meter types.
	 *
	 * @since 1.1
	 * @param possibleMeterTypes the input value
	 */
	public void  setPossibleMeterTypes(Collection<String> possibleMeterTypes) {
		this.possibleMeterTypes = possibleMeterTypes;
	}

	/**
	 * Set the supported meter types.
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public Policer withPossibleMeterTypes(String string) {
		getPossibleMeterTypes().add(string);
		return this;
	}

	/**
	 * Get the instructions for how to handle traffic that is conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @return the value
	 */
	public String getConformingAction() {
		return conformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param conformingAction the input value
	 */
	public void  setConformingAction(String conformingAction) {
		this.conformingAction = conformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param conformingAction the input value
	 * @return this instance
	 */
	public Policer withConformingAction(String conformingAction) {
		this.conformingAction = conformingAction;
		return this;
	}

	/**
	 * Get the instructions for how to handle traffic that is partially conforming (colored yellow).  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.Only applies for three-color meters.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @return the value
	 */
	public String getPartialConformingAction() {
		return partialConformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is partially conforming (colored yellow).  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.Only applies for three-color meters.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param partialConformingAction the input value
	 */
	public void  setPartialConformingAction(String partialConformingAction) {
		this.partialConformingAction = partialConformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is partially conforming (colored yellow).  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.Only applies for three-color meters.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param partialConformingAction the input value
	 * @return this instance
	 */
	public Policer withPartialConformingAction(String partialConformingAction) {
		this.partialConformingAction = partialConformingAction;
		return this;
	}

	/**
	 * Get the instructions for how to handle traffic that is non-conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @return the value
	 */
	public String getNonConformingAction() {
		return nonConformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is non-conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param nonConformingAction the input value
	 */
	public void  setNonConformingAction(String nonConformingAction) {
		this.nonConformingAction = nonConformingAction;
	}

	/**
	 * Set the instructions for how to handle traffic that is non-conforming.  {{pattern}}

{{pattern|Null}} corresponds with no action.

A {{pattern|Count}} action (and only the {{pattern|Count}} action) increases the meter instance count statistics in the {{param|CountedPackets}} and {{param|CountedBytes}} parameters.  {{pattern|Count}} actions are DEPRECATED because they can not be combined with other actions, e.g. marking actions.

''<DSCP Value>'' is an unsigned integer that corresponds with a mark action overwriting the traffic's DSCP with the configured DSCP.

''<:Ethernet Priority>'' is a colon (":") followed by an unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's Ethernet Priority with the configured Ethernet Priority.

''<DSCP Value:Ethernet Priority>'' is an unsigned integer followed by a colon (":") and a second unsigned integer (no white space).  It corresponds with a mark action overwriting the traffic's DSCP and Ethernet Priority with the configured values.

For example, "24" specifies a DSCP value of 24, ":3" specifies an Ethernet Priority of 3, and "24:3" specifies both.
	 *
	 * @since 1.1
	 * @pattern Null
	 * @pattern Drop
	 * @pattern Count
	 * @pattern [0-9]|[1-5][0-9]|6[0-3]
	 * @pattern :[0-7]
	 * @pattern ([0-9]|[1-5][0-9]|6[0-3]):[0-7]
	 * @param nonConformingAction the input value
	 * @return this instance
	 */
	public Policer withNonConformingAction(String nonConformingAction) {
		this.nonConformingAction = nonConformingAction;
		return this;
	}

	/**
	 * Get the number of Packets counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCountedPackets() {
		return countedPackets;
	}

	/**
	 * Set the number of Packets counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @param countedPackets the input value
	 */
	public void  setCountedPackets(Long countedPackets) {
		this.countedPackets = countedPackets;
	}

	/**
	 * Set the number of Packets counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @param countedPackets the input value
	 * @return this instance
	 */
	public Policer withCountedPackets(Long countedPackets) {
		this.countedPackets = countedPackets;
		return this;
	}

	/**
	 * Get the number of Bytes counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCountedBytes() {
		return countedBytes;
	}

	/**
	 * Set the number of Bytes counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @param countedBytes the input value
	 */
	public void  setCountedBytes(Long countedBytes) {
		this.countedBytes = countedBytes;
	}

	/**
	 * Set the number of Bytes counted as result of a ''Count'' meter action.

This parameter is DEPRECATED because the ''Count'' meter action is DEPRECATED.
	 *
	 * @since 1.1
	 * @param countedBytes the input value
	 * @return this instance
	 */
	public Policer withCountedBytes(Long countedBytes) {
		this.countedBytes = countedBytes;
		return this;
	}

	/**
	 * Get the total number of Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTotalCountedPackets() {
		return totalCountedPackets;
	}

	/**
	 * Set the total number of Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param totalCountedPackets the input value
	 */
	public void  setTotalCountedPackets(Long totalCountedPackets) {
		this.totalCountedPackets = totalCountedPackets;
	}

	/**
	 * Set the total number of Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param totalCountedPackets the input value
	 * @return this instance
	 */
	public Policer withTotalCountedPackets(Long totalCountedPackets) {
		this.totalCountedPackets = totalCountedPackets;
		return this;
	}

	/**
	 * Get the total number of Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTotalCountedBytes() {
		return totalCountedBytes;
	}

	/**
	 * Set the total number of Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param totalCountedBytes the input value
	 */
	public void  setTotalCountedBytes(Long totalCountedBytes) {
		this.totalCountedBytes = totalCountedBytes;
	}

	/**
	 * Set the total number of Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param totalCountedBytes the input value
	 * @return this instance
	 */
	public Policer withTotalCountedBytes(Long totalCountedBytes) {
		this.totalCountedBytes = totalCountedBytes;
		return this;
	}

	/**
	 * Get the number of conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getConformingCountedPackets() {
		return conformingCountedPackets;
	}

	/**
	 * Set the number of conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param conformingCountedPackets the input value
	 */
	public void  setConformingCountedPackets(Long conformingCountedPackets) {
		this.conformingCountedPackets = conformingCountedPackets;
	}

	/**
	 * Set the number of conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param conformingCountedPackets the input value
	 * @return this instance
	 */
	public Policer withConformingCountedPackets(Long conformingCountedPackets) {
		this.conformingCountedPackets = conformingCountedPackets;
		return this;
	}

	/**
	 * Get the number of conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getConformingCountedBytes() {
		return conformingCountedBytes;
	}

	/**
	 * Set the number of conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param conformingCountedBytes the input value
	 */
	public void  setConformingCountedBytes(Long conformingCountedBytes) {
		this.conformingCountedBytes = conformingCountedBytes;
	}

	/**
	 * Set the number of conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param conformingCountedBytes the input value
	 * @return this instance
	 */
	public Policer withConformingCountedBytes(Long conformingCountedBytes) {
		this.conformingCountedBytes = conformingCountedBytes;
		return this;
	}

	/**
	 * Get the number of partially conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getPartiallyConformingCountedPackets() {
		return partiallyConformingCountedPackets;
	}

	/**
	 * Set the number of partially conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param partiallyConformingCountedPackets the input value
	 */
	public void  setPartiallyConformingCountedPackets(Long partiallyConformingCountedPackets) {
		this.partiallyConformingCountedPackets = partiallyConformingCountedPackets;
	}

	/**
	 * Set the number of partially conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param partiallyConformingCountedPackets the input value
	 * @return this instance
	 */
	public Policer withPartiallyConformingCountedPackets(Long partiallyConformingCountedPackets) {
		this.partiallyConformingCountedPackets = partiallyConformingCountedPackets;
		return this;
	}

	/**
	 * Get the number of partially conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getPartiallyConformingCountedBytes() {
		return partiallyConformingCountedBytes;
	}

	/**
	 * Set the number of partially conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param partiallyConformingCountedBytes the input value
	 */
	public void  setPartiallyConformingCountedBytes(Long partiallyConformingCountedBytes) {
		this.partiallyConformingCountedBytes = partiallyConformingCountedBytes;
	}

	/**
	 * Set the number of partially conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param partiallyConformingCountedBytes the input value
	 * @return this instance
	 */
	public Policer withPartiallyConformingCountedBytes(Long partiallyConformingCountedBytes) {
		this.partiallyConformingCountedBytes = partiallyConformingCountedBytes;
		return this;
	}

	/**
	 * Get the number of non-conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getNonConformingCountedPackets() {
		return nonConformingCountedPackets;
	}

	/**
	 * Set the number of non-conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param nonConformingCountedPackets the input value
	 */
	public void  setNonConformingCountedPackets(Long nonConformingCountedPackets) {
		this.nonConformingCountedPackets = nonConformingCountedPackets;
	}

	/**
	 * Set the number of non-conforming Packets counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param nonConformingCountedPackets the input value
	 * @return this instance
	 */
	public Policer withNonConformingCountedPackets(Long nonConformingCountedPackets) {
		this.nonConformingCountedPackets = nonConformingCountedPackets;
		return this;
	}

	/**
	 * Get the number of non-conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getNonConformingCountedBytes() {
		return nonConformingCountedBytes;
	}

	/**
	 * Set the number of non-conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param nonConformingCountedBytes the input value
	 */
	public void  setNonConformingCountedBytes(Long nonConformingCountedBytes) {
		this.nonConformingCountedBytes = nonConformingCountedBytes;
	}

	/**
	 * Set the number of non-conforming Bytes counted by this policer, regardless of meter action.
	 *
	 * @since 1.4
	 * @param nonConformingCountedBytes the input value
	 * @return this instance
	 */
	public Policer withNonConformingCountedBytes(Long nonConformingCountedBytes) {
		this.nonConformingCountedBytes = nonConformingCountedBytes;
		return this;
	}

	//</editor-fold>

}