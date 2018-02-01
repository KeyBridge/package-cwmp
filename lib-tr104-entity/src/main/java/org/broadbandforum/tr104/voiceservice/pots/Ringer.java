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
package org.broadbandforum.tr104.voiceservice.pots;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.pots.ringer.Event;

	/**
	 * This object contains the ring sequences configured for analogue lines.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.Ringer.")
public class Ringer {

	/**
	 * Table of events for which a ring pattern is defined.  The table is pre-populated with the complete list of events for which the CPE supports definition of ring patterns.
	 */
	@XmlElementWrapper(name = "events")
	@XmlElement(name = "Event")
	public Collection<Event> events;

	public Ringer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the table of events for which a ring pattern is defined.  The table is pre-populated with the complete list of events for which the CPE supports definition of ring patterns.
	 *
	 * @return the value
	 */
	public Collection<Event> getEvents() {
		if (this.events == null){ this.events=new ArrayList<>();}
		return events;
	}

	/**
	 * Set the table of events for which a ring pattern is defined.  The table is pre-populated with the complete list of events for which the CPE supports definition of ring patterns.
	 *
	 * @param events the input value
	 */
	public void  setEvents(Collection<Event> events) {
		this.events = events;
	}

	/**
	 * Set the table of events for which a ring pattern is defined.  The table is pre-populated with the complete list of events for which the CPE supports definition of ring patterns.
	 *
	 * @param event the input value
	 * @return this instance
	 */
	public Ringer withEvent(Event event) {
		getEvents().add(event);
		return this;
	}

	//</editor-fold>

}