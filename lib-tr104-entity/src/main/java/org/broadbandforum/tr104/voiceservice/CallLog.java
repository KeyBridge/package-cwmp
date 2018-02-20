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
package org.broadbandforum.tr104.voiceservice;

import java.time.LocalDateTime;
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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr104.voiceservice.calllog.Session;
import org.broadbandforum.tr104.voiceservice.calllog.SignalingPerformance;

	/**
	 * This table contains a list of calls. An entry is similar to a CDR (Call Detail Record) as used in PBX or on mobile phones.

An entry is created each time a call is terminated. If the number of {{object|.CallLog}} exceeds {{param|.Capabilities.MaxCallLogCount}}, the CPE SHOULD remove the oldest {{object|.CallLog}} object on basis of {{param|Start}} parameter.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.CallLog")
@XmlType(name = "VoiceService.CallLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class CallLog {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Number of the party originating the call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallingPartyNumber")
	@Size(max = 256)
	public String callingPartyNumber;
	/**
	 * Number of destination party of the call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CalledPartyNumber")
	@Size(max = 256)
	public String calledPartyNumber;
	/**
	 * Party originating the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Source")
	@Size(max = 256)
	public String source;
	/**
	 * Destination party of the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be only referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Destination")
	@Size(max = 256)
	public String destination;
	/**
	 * The phone number of the remote party after the dial plan has been processed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteParty")
	@Size(max = 32)
	public String remoteParty;
	/**
	 * The {{object|.CallControl.Line}} used to process the call.

{{reference}}

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UsedLine")
	@Size(max = 256)
	public String usedLine;
	/**
	 * {{list}} {{reference}}

For an incoming call multiple {{object|.CallControl.Extension}} objects can be involved till one user answers the call.

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UsedExtensions")
	@XmlList
	public Collection<String> usedExtensions;
	/**
	 * Direction of the call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Direction")
	public String direction;
	/**
	 * Start of the call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Start")
	public LocalDateTime start;
	/**
	 * Length of the call in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	public Long duration;
	/**
	 * The call termination cause.

The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallTerminationCause")
	public String callTerminationCause;
	/**
	 * This table contains signaling performance statistics for each protocol involved in the call.
	 */
	@XmlElementWrapper(name = "SignalingPerformances")
	@XmlElement(name = "SignalingPerformance")
	@CWMPParameter(minEntries = 1)
	public Collection<SignalingPerformance> signalingPerformances;
	/**
	 * Session information within one call.
	 */
	@XmlElementWrapper(name = "Sessions")
	@XmlElement(name = "Session")
	public Collection<Session> sessions;

	public CallLog() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public CallLog withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the number of the party originating the call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallingPartyNumber() {
		return callingPartyNumber;
	}

	/**
	 * Set the number of the party originating the call.
	 *
	 * @since 2.0
	 * @param callingPartyNumber the input value
	 */
	public void  setCallingPartyNumber(String callingPartyNumber) {
		this.callingPartyNumber = callingPartyNumber;
	}

	/**
	 * Set the number of the party originating the call.
	 *
	 * @since 2.0
	 * @param callingPartyNumber the input value
	 * @return this instance
	 */
	public CallLog withCallingPartyNumber(String callingPartyNumber) {
		this.callingPartyNumber = callingPartyNumber;
		return this;
	}

	/**
	 * Get the number of destination party of the call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCalledPartyNumber() {
		return calledPartyNumber;
	}

	/**
	 * Set the number of destination party of the call.
	 *
	 * @since 2.0
	 * @param calledPartyNumber the input value
	 */
	public void  setCalledPartyNumber(String calledPartyNumber) {
		this.calledPartyNumber = calledPartyNumber;
	}

	/**
	 * Set the number of destination party of the call.
	 *
	 * @since 2.0
	 * @param calledPartyNumber the input value
	 * @return this instance
	 */
	public CallLog withCalledPartyNumber(String calledPartyNumber) {
		this.calledPartyNumber = calledPartyNumber;
		return this;
	}

	/**
	 * Get the party originating the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Set the party originating the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @param source the input value
	 */
	public void  setSource(String source) {
		this.source = source;
	}

	/**
	 * Set the party originating the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @param source the input value
	 * @return this instance
	 */
	public CallLog withSource(String source) {
		this.source = source;
		return this;
	}

	/**
	 * Get the destination party of the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be only referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Set the destination party of the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be only referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @param destination the input value
	 */
	public void  setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Set the destination party of the call.

{{reference}}

{{object|.Trunk}}, {{object|.SIP.Registrar.{i}.Account}} and {{object|.SIP.Client}} objects SHOULD be only referenced only when {{object|.Interwork}} is in use.
	 *
	 * @since 2.0
	 * @param destination the input value
	 * @return this instance
	 */
	public CallLog withDestination(String destination) {
		this.destination = destination;
		return this;
	}

	/**
	 * Get the phone number of the remote party after the dial plan has been processed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRemoteParty() {
		return remoteParty;
	}

	/**
	 * Set the phone number of the remote party after the dial plan has been processed.
	 *
	 * @since 2.0
	 * @param remoteParty the input value
	 */
	public void  setRemoteParty(String remoteParty) {
		this.remoteParty = remoteParty;
	}

	/**
	 * Set the phone number of the remote party after the dial plan has been processed.
	 *
	 * @since 2.0
	 * @param remoteParty the input value
	 * @return this instance
	 */
	public CallLog withRemoteParty(String remoteParty) {
		this.remoteParty = remoteParty;
		return this;
	}

	/**
	 * Get the {{object|.CallControl.Line}} used to process the call.

{{reference}}

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsedLine() {
		return usedLine;
	}

	/**
	 * Set the {{object|.CallControl.Line}} used to process the call.

{{reference}}

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param usedLine the input value
	 */
	public void  setUsedLine(String usedLine) {
		this.usedLine = usedLine;
	}

	/**
	 * Set the {{object|.CallControl.Line}} used to process the call.

{{reference}}

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param usedLine the input value
	 * @return this instance
	 */
	public CallLog withUsedLine(String usedLine) {
		this.usedLine = usedLine;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

For an incoming call multiple {{object|.CallControl.Extension}} objects can be involved till one user answers the call.

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getUsedExtensions() {
		if (this.usedExtensions == null){ this.usedExtensions=new ArrayList<>();}
		return usedExtensions;
	}

	/**
	 * Set the {{list}} {{reference}}

For an incoming call multiple {{object|.CallControl.Extension}} objects can be involved till one user answers the call.

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param usedExtensions the input value
	 */
	public void  setUsedExtensions(Collection<String> usedExtensions) {
		this.usedExtensions = usedExtensions;
	}

	/**
	 * Set the {{list}} {{reference}}

For an incoming call multiple {{object|.CallControl.Extension}} objects can be involved till one user answers the call.

When {{object|.Interwork}} is in use, this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CallLog withUsedExtensions(String string) {
		getUsedExtensions().add(string);
		return this;
	}

	/**
	 * Get the direction of the call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * Set the direction of the call.
	 *
	 * @since 2.0
	 * @param direction the input value
	 */
	public void  setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * Set the direction of the call.
	 *
	 * @since 2.0
	 * @param direction the input value
	 * @return this instance
	 */
	public CallLog withDirection(String direction) {
		this.direction = direction;
		return this;
	}

	/**
	 * Get the start of the call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getStart() {
		return start;
	}

	/**
	 * Set the start of the call.
	 *
	 * @since 2.0
	 * @param start the input value
	 */
	public void  setStart(LocalDateTime start) {
		this.start = start;
	}

	/**
	 * Set the start of the call.
	 *
	 * @since 2.0
	 * @param start the input value
	 * @return this instance
	 */
	public CallLog withStart(LocalDateTime start) {
		this.start = start;
		return this;
	}

	/**
	 * Get the length of the call in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the length of the call in seconds.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the length of the call in seconds.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public CallLog withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the call termination cause.

The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallTerminationCause() {
		return callTerminationCause;
	}

	/**
	 * Set the call termination cause.

The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param callTerminationCause the input value
	 */
	public void  setCallTerminationCause(String callTerminationCause) {
		this.callTerminationCause = callTerminationCause;
	}

	/**
	 * Set the call termination cause.

The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param callTerminationCause the input value
	 * @return this instance
	 */
	public CallLog withCallTerminationCause(String callTerminationCause) {
		this.callTerminationCause = callTerminationCause;
		return this;
	}

	/**
	 * Get the this table contains signaling performance statistics for each protocol involved in the call.
	 *
	 * @return the value
	 */
	public Collection<SignalingPerformance> getSignalingPerformances() {
		if (this.signalingPerformances == null){ this.signalingPerformances=new ArrayList<>();}
		return signalingPerformances;
	}

	/**
	 * Set the this table contains signaling performance statistics for each protocol involved in the call.
	 *
	 * @param signalingPerformances the input value
	 */
	public void  setSignalingPerformances(Collection<SignalingPerformance> signalingPerformances) {
		this.signalingPerformances = signalingPerformances;
	}

	/**
	 * Set the this table contains signaling performance statistics for each protocol involved in the call.
	 *
	 * @param signalingPerformance the input value
	 * @return this instance
	 */
	public CallLog withSignalingPerformance(SignalingPerformance signalingPerformance) {
		getSignalingPerformances().add(signalingPerformance);
		return this;
	}

	/**
	 * Get the session information within one call.
	 *
	 * @return the value
	 */
	public Collection<Session> getSessions() {
		if (this.sessions == null){ this.sessions=new ArrayList<>();}
		return sessions;
	}

	/**
	 * Set the session information within one call.
	 *
	 * @param sessions the input value
	 */
	public void  setSessions(Collection<Session> sessions) {
		this.sessions = sessions;
	}

	/**
	 * Set the session information within one call.
	 *
	 * @param session the input value
	 * @return this instance
	 */
	public CallLog withSession(Session session) {
		getSessions().add(session);
		return this;
	}

	//</editor-fold>

}