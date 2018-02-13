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
package org.broadbandforum.tr104.voiceservice.tone.eventprofile;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Table of events for which a tone is defined. The table is pre-populated with the list of events for which the CPE supports definition of tones.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Tone.EventProfile.{i}.Event.{i}.")
@XmlRootElement(name = "VoiceService.Tone.EventProfile.Event")
@XmlType(name = "VoiceService.Tone.EventProfile.Event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The event for which the tone is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Function")
	@CWMPParameter(access = "readWrite")
	public String function;
	/**
	 * The description for the tone to be associated with the given event.

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tone")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tone;

	public Event() {
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
	public Event withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the event for which the tone is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * Set the event for which the tone is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param function the input value
	 */
	public void  setFunction(String function) {
		this.function = function;
	}

	/**
	 * Set the event for which the tone is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param function the input value
	 * @return this instance
	 */
	public Event withFunction(String function) {
		this.function = function;
		return this;
	}

	/**
	 * Get the description for the tone to be associated with the given event.

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTone() {
		return tone;
	}

	/**
	 * Set the description for the tone to be associated with the given event.

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @param tone the input value
	 */
	public void  setTone(String tone) {
		this.tone = tone;
	}

	/**
	 * Set the description for the tone to be associated with the given event.

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @param tone the input value
	 * @return this instance
	 */
	public Event withTone(String tone) {
		this.tone = tone;
		return this;
	}

	//</editor-fold>

}