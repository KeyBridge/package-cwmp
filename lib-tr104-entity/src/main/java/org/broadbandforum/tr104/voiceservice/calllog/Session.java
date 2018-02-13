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
package org.broadbandforum.tr104.voiceservice.calllog;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.calllog.session.Destination;
import org.broadbandforum.tr104.voiceservice.calllog.session.Source;

	/**
	 * Session information within one call.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.")
@XmlRootElement(name = "Session")
@XmlType(name = "VoiceService.CallLog.Session")
@XmlAccessorType(XmlAccessType.FIELD)
public class Session {

	/**
	 * The type of media stream used in this session.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StreamType")
	public String streamType;
	/**
	 * The time that the session started, in UTC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Start")
	public LocalDateTime start;
	/**
	 * Length of the session in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	public Long duration;
	/**
	 * Session identifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SessionID")
	@Size(max = 16)
	public String sessionID;
	/**
	 * The source of the session information within one call.
	 */
	@XmlElement(name = "Source")
	public Source source;
	/**
	 * The destination part of session information within one call.
	 */
	@XmlElement(name = "Destination")
	public Destination destination;

	public Session() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the type of media stream used in this session.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStreamType() {
		return streamType;
	}

	/**
	 * Set the type of media stream used in this session.
	 *
	 * @since 2.0
	 * @param streamType the input value
	 */
	public void  setStreamType(String streamType) {
		this.streamType = streamType;
	}

	/**
	 * Set the type of media stream used in this session.
	 *
	 * @since 2.0
	 * @param streamType the input value
	 * @return this instance
	 */
	public Session withStreamType(String streamType) {
		this.streamType = streamType;
		return this;
	}

	/**
	 * Get the time that the session started, in UTC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getStart() {
		return start;
	}

	/**
	 * Set the time that the session started, in UTC.
	 *
	 * @since 2.0
	 * @param start the input value
	 */
	public void  setStart(LocalDateTime start) {
		this.start = start;
	}

	/**
	 * Set the time that the session started, in UTC.
	 *
	 * @since 2.0
	 * @param start the input value
	 * @return this instance
	 */
	public Session withStart(LocalDateTime start) {
		this.start = start;
		return this;
	}

	/**
	 * Get the length of the session in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the length of the session in seconds.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the length of the session in seconds.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public Session withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the session identifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSessionID() {
		return sessionID;
	}

	/**
	 * Set the session identifier.
	 *
	 * @since 2.0
	 * @param sessionID the input value
	 */
	public void  setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * Set the session identifier.
	 *
	 * @since 2.0
	 * @param sessionID the input value
	 * @return this instance
	 */
	public Session withSessionID(String sessionID) {
		this.sessionID = sessionID;
		return this;
	}

	/**
	 * Get the source of the session information within one call.
	 *
	 * @return the value
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Set the source of the session information within one call.
	 *
	 * @param source the input value
	 */
	public void  setSource(Source source) {
		this.source = source;
	}

	/**
	 * Set the source of the session information within one call.
	 *
	 * @param source the input value
	 * @return this instance
	 */
	public Session withSource(Source source) {
		this.source = source;
		return this;
	}

	/**
	 * Get the destination part of session information within one call.
	 *
	 * @return the value
	 */
	public Destination getDestination() {
		return destination;
	}

	/**
	 * Set the destination part of session information within one call.
	 *
	 * @param destination the input value
	 */
	public void  setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * Set the destination part of session information within one call.
	 *
	 * @param destination the input value
	 * @return this instance
	 */
	public Session withDestination(Destination destination) {
		this.destination = destination;
		return this;
	}

	//</editor-fold>

}