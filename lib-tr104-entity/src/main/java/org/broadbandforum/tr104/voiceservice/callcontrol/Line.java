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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr104.voiceservice.callcontrol.line.Stats;

	/**
	 * Voice line table.

Support for adding and removing lines is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Line.{i}.", uniqueConstraints = {@CWMPUnique(names = {"DirectoryNumber"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.CallControl.Line")
@XmlType(name = "VoiceService.CallControl.Line")
@XmlAccessorType(XmlAccessType.FIELD)
public class Line {

	/**
	 * Enable or disable this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates the call status for this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallStatus")
	public String callStatus;
	/**
	 * Mechanism via which the {{object}} instance was created.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * Directory number associated with this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DirectoryNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String directoryNumber;
	/**
	 * Provider for the line. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Provider")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String provider;
	/**
	 * Set of calling features to apply to this line.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallingFeatures")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String callingFeatures;
	/**
	 * Statistics for this {{object|#}} instance.

The CPE MUST reset the line's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the line becomes operationally down due to a previous administrative down (i.e. the line's {{param|#.Status}} parameter transitions to a down state after the line is disabled) or when the line becomes administratively up (i.e. the line's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Line() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this line.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this line.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Line withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQuiescentMode() {
		return quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 */
	public void  setQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 * @return this instance
	 */
	public Line withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this line.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this line.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Line withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public Line withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates the call status for this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallStatus() {
		return callStatus;
	}

	/**
	 * Set the indicates the call status for this line.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 */
	public void  setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	/**
	 * Set the indicates the call status for this line.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 * @return this instance
	 */
	public Line withCallStatus(String callStatus) {
		this.callStatus = callStatus;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} instance was created.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} instance was created.
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} instance was created.
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Line withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the directory number associated with this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDirectoryNumber() {
		return directoryNumber;
	}

	/**
	 * Set the directory number associated with this line.
	 *
	 * @since 2.0
	 * @param directoryNumber the input value
	 */
	public void  setDirectoryNumber(String directoryNumber) {
		this.directoryNumber = directoryNumber;
	}

	/**
	 * Set the directory number associated with this line.
	 *
	 * @since 2.0
	 * @param directoryNumber the input value
	 * @return this instance
	 */
	public Line withDirectoryNumber(String directoryNumber) {
		this.directoryNumber = directoryNumber;
		return this;
	}

	/**
	 * Get the provider for the line. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * Set the provider for the line. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @param provider the input value
	 */
	public void  setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Set the provider for the line. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @param provider the input value
	 * @return this instance
	 */
	public Line withProvider(String provider) {
		this.provider = provider;
		return this;
	}

	/**
	 * Get the set of calling features to apply to this line.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallingFeatures() {
		return callingFeatures;
	}

	/**
	 * Set the set of calling features to apply to this line.

{{reference}}
	 *
	 * @since 2.0
	 * @param callingFeatures the input value
	 */
	public void  setCallingFeatures(String callingFeatures) {
		this.callingFeatures = callingFeatures;
	}

	/**
	 * Set the set of calling features to apply to this line.

{{reference}}
	 *
	 * @since 2.0
	 * @param callingFeatures the input value
	 * @return this instance
	 */
	public Line withCallingFeatures(String callingFeatures) {
		this.callingFeatures = callingFeatures;
		return this;
	}

	/**
	 * Get the statistics for this {{object|#}} instance.

The CPE MUST reset the line's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the line becomes operationally down due to a previous administrative down (i.e. the line's {{param|#.Status}} parameter transitions to a down state after the line is disabled) or when the line becomes administratively up (i.e. the line's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this {{object|#}} instance.

The CPE MUST reset the line's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the line becomes operationally down due to a previous administrative down (i.e. the line's {{param|#.Status}} parameter transitions to a down state after the line is disabled) or when the line becomes administratively up (i.e. the line's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this {{object|#}} instance.

The CPE MUST reset the line's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the line becomes operationally down due to a previous administrative down (i.e. the line's {{param|#.Status}} parameter transitions to a down state after the line is disabled) or when the line becomes administratively up (i.e. the line's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Line withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}