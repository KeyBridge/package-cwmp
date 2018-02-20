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
package org.broadbandforum.tr104.voiceservice.tone;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr104.voiceservice.tone.eventprofile.Event;

	/**
	 * Configuration profile for tone events.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Tone.EventProfile.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.Tone.EventProfile")
@XmlType(name = "VoiceService.Tone.EventProfile")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventProfile {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Table of events for which a tone is defined. The table is pre-populated with the list of events for which the CPE supports definition of tones.
	 */
	@XmlElementWrapper(name = "Events")
	@XmlElement(name = "Event")
	@CWMPParameter(access = "readWrite")
	public Collection<Event> events;

	public EventProfile() {
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
	public EventProfile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the table of events for which a tone is defined. The table is pre-populated with the list of events for which the CPE supports definition of tones.
	 *
	 * @return the value
	 */
	public Collection<Event> getEvents() {
		if (this.events == null){ this.events=new ArrayList<>();}
		return events;
	}

	/**
	 * Set the table of events for which a tone is defined. The table is pre-populated with the list of events for which the CPE supports definition of tones.
	 *
	 * @param events the input value
	 */
	public void  setEvents(Collection<Event> events) {
		this.events = events;
	}

	/**
	 * Set the table of events for which a tone is defined. The table is pre-populated with the list of events for which the CPE supports definition of tones.
	 *
	 * @param event the input value
	 * @return this instance
	 */
	public EventProfile withEvent(Event event) {
		getEvents().add(event);
		return this;
	}

	//</editor-fold>

}