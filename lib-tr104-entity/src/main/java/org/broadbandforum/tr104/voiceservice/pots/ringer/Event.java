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
package org.broadbandforum.tr104.voiceservice.pots.ringer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Table of events for which a ring pattern is defined.  The table is pre-populated with the complete list of events for which the CPE supports definition of ring patterns.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.Ringer.Event.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Function"})})
@XmlRootElement(name = "VoiceService.POTS.Ringer.Event")
@XmlType(name = "VoiceService.POTS.Ringer.Event")
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
	 * The event for which the ring pattern is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Function")
	public String function;
	/**
	 * {{list}} The values represent an alternating pattern of times (in milliseconds) when the ringer is ON or OFF.

Example: "1000,5000"

See also {{bibref|ETSI_TR_101_183}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Cadence")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long cadence;

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
	 * Get the event for which the ring pattern is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * Set the event for which the ring pattern is to apply. {{enum}}

The parameter MAY instead indicate a vendor-specific event name, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param function the input value
	 */
	public void  setFunction(String function) {
		this.function = function;
	}

	/**
	 * Set the event for which the ring pattern is to apply. {{enum}}

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
	 * Get the {{list}} The values represent an alternating pattern of times (in milliseconds) when the ringer is ON or OFF.

Example: "1000,5000"

See also {{bibref|ETSI_TR_101_183}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCadence() {
		return cadence;
	}

	/**
	 * Set the {{list}} The values represent an alternating pattern of times (in milliseconds) when the ringer is ON or OFF.

Example: "1000,5000"

See also {{bibref|ETSI_TR_101_183}}.
	 *
	 * @since 2.0
	 * @param cadence the input value
	 */
	public void  setCadence(Long cadence) {
		this.cadence = cadence;
	}

	/**
	 * Set the {{list}} The values represent an alternating pattern of times (in milliseconds) when the ringer is ON or OFF.

Example: "1000,5000"

See also {{bibref|ETSI_TR_101_183}}.
	 *
	 * @since 2.0
	 * @param cadence the input value
	 * @return this instance
	 */
	public Event withCadence(Long cadence) {
		this.cadence = cadence;
		return this;
	}

	//</editor-fold>

}