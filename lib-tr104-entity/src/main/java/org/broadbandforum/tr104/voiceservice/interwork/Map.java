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
package org.broadbandforum.tr104.voiceservice.interwork;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * For interworking use cases such as SIP-ISDN PBX plug and ESBC : mapping instance between a Network interface and a User extension.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Interwork.{i}.Map.{i}.")
public class Map {

	/**
	 * Enable ({{true}}) or disable ({{false}}) this connection mapping.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates the status of this connection mapping. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "InActive";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable string identifying the reason or explanation of the current mapping {{param|Status}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StatusDescription")
	@Size(max = 256)
	public String statusDescription;
	/**
	 * The last time the Status was updated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastTime")
	public LocalDateTime lastTime;
	/**
	 * Mechanism via which this connection mapping was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkConnection")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String networkConnection;
	/**
	 * {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserConnection")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String userConnection;
	/**
	 * Digit map controlling digit collection on a User interface.  The string defines the criteria to be met as digits are collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

The syntax of this parameter is exactly the syntax used by MGCP as defined in {{bibref|RFC3435|Section 2.1.5}}.

This parameter is applicable only if the User interface supports per digit dialing and the Network interface supports en-bloc dialing only.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DigitMap")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String digitMap;
	/**
	 * Enables use of {{param|DigitMap}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DigitMapEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean digitMapEnable = true;
	/**
	 * Indicates the priority for this combination of Network-to-User mapping, where 1 is the highest priority.  Where the priority differs between entries in this table, the CPE SHOULD use the highest priority (lowest numbered) entry.  Where the priorities are equal among multiple entries, the CPE MAY apply a local criterion for choosing among them.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long priority;

	public Map() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable ({{true}}) or disable ({{false}}) this connection mapping.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable ({{true}}) or disable ({{false}}) this connection mapping.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable ({{true}}) or disable ({{false}}) this connection mapping.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Map withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this connection mapping. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this connection mapping. {{enum}}
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this connection mapping. {{enum}}
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Map withStatus(String status) {
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
	public Map withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable string identifying the reason or explanation of the current mapping {{param|Status}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * Set the human-readable string identifying the reason or explanation of the current mapping {{param|Status}}.
	 *
	 * @since 2.0
	 * @param statusDescription the input value
	 */
	public void  setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * Set the human-readable string identifying the reason or explanation of the current mapping {{param|Status}}.
	 *
	 * @since 2.0
	 * @param statusDescription the input value
	 * @return this instance
	 */
	public Map withStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
		return this;
	}

	/**
	 * Get the last time the Status was updated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastTime() {
		return lastTime;
	}

	/**
	 * Set the last time the Status was updated.
	 *
	 * @since 2.0
	 * @param lastTime the input value
	 */
	public void  setLastTime(LocalDateTime lastTime) {
		this.lastTime = lastTime;
	}

	/**
	 * Set the last time the Status was updated.
	 *
	 * @since 2.0
	 * @param lastTime the input value
	 * @return this instance
	 */
	public Map withLastTime(LocalDateTime lastTime) {
		this.lastTime = lastTime;
		return this;
	}

	/**
	 * Get the mechanism via which this connection mapping was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which this connection mapping was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which this connection mapping was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Map withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetworkConnection() {
		return networkConnection;
	}

	/**
	 * Set the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param networkConnection the input value
	 */
	public void  setNetworkConnection(String networkConnection) {
		this.networkConnection = networkConnection;
	}

	/**
	 * Set the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param networkConnection the input value
	 * @return this instance
	 */
	public Map withNetworkConnection(String networkConnection) {
		this.networkConnection = networkConnection;
		return this;
	}

	/**
	 * Get the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserConnection() {
		return userConnection;
	}

	/**
	 * Set the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param userConnection the input value
	 */
	public void  setUserConnection(String userConnection) {
		this.userConnection = userConnection;
	}

	/**
	 * Set the {{reference}}. This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param userConnection the input value
	 * @return this instance
	 */
	public Map withUserConnection(String userConnection) {
		this.userConnection = userConnection;
		return this;
	}

	/**
	 * Get the digit map controlling digit collection on a User interface.  The string defines the criteria to be met as digits are collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

The syntax of this parameter is exactly the syntax used by MGCP as defined in {{bibref|RFC3435|Section 2.1.5}}.

This parameter is applicable only if the User interface supports per digit dialing and the Network interface supports en-bloc dialing only.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDigitMap() {
		return digitMap;
	}

	/**
	 * Set the digit map controlling digit collection on a User interface.  The string defines the criteria to be met as digits are collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

The syntax of this parameter is exactly the syntax used by MGCP as defined in {{bibref|RFC3435|Section 2.1.5}}.

This parameter is applicable only if the User interface supports per digit dialing and the Network interface supports en-bloc dialing only.
	 *
	 * @since 2.0
	 * @param digitMap the input value
	 */
	public void  setDigitMap(String digitMap) {
		this.digitMap = digitMap;
	}

	/**
	 * Set the digit map controlling digit collection on a User interface.  The string defines the criteria to be met as digits are collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

The syntax of this parameter is exactly the syntax used by MGCP as defined in {{bibref|RFC3435|Section 2.1.5}}.

This parameter is applicable only if the User interface supports per digit dialing and the Network interface supports en-bloc dialing only.
	 *
	 * @since 2.0
	 * @param digitMap the input value
	 * @return this instance
	 */
	public Map withDigitMap(String digitMap) {
		this.digitMap = digitMap;
		return this;
	}

	/**
	 * Get the enables use of {{param|DigitMap}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDigitMapEnable() {
		return digitMapEnable;
	}

	/**
	 * Set the enables use of {{param|DigitMap}}.
	 *
	 * @since 2.0
	 * @param digitMapEnable the input value
	 */
	public void  setDigitMapEnable(Boolean digitMapEnable) {
		this.digitMapEnable = digitMapEnable;
	}

	/**
	 * Set the enables use of {{param|DigitMap}}.
	 *
	 * @since 2.0
	 * @param digitMapEnable the input value
	 * @return this instance
	 */
	public Map withDigitMapEnable(Boolean digitMapEnable) {
		this.digitMapEnable = digitMapEnable;
		return this;
	}

	/**
	 * Get the indicates the priority for this combination of Network-to-User mapping, where 1 is the highest priority.  Where the priority differs between entries in this table, the CPE SHOULD use the highest priority (lowest numbered) entry.  Where the priorities are equal among multiple entries, the CPE MAY apply a local criterion for choosing among them.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the indicates the priority for this combination of Network-to-User mapping, where 1 is the highest priority.  Where the priority differs between entries in this table, the CPE SHOULD use the highest priority (lowest numbered) entry.  Where the priorities are equal among multiple entries, the CPE MAY apply a local criterion for choosing among them.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the indicates the priority for this combination of Network-to-User mapping, where 1 is the highest priority.  Where the priority differs between entries in this table, the CPE SHOULD use the highest priority (lowest numbered) entry.  Where the priorities are equal among multiple entries, the CPE MAY apply a local criterion for choosing among them.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public Map withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	//</editor-fold>

}