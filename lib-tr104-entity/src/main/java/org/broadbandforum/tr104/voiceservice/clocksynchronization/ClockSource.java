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
package org.broadbandforum.tr104.voiceservice.clocksynchronization;

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
	 * List of eligible external clock sources. The number of entries in this table depends on the maximum number of external clock sources supported by the CPE.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ClockSynchronization.ClockSource.{i}.")
@XmlRootElement(name = "VoiceService.ClockSynchronization.ClockSource")
@XmlType(name = "VoiceService.ClockSynchronization.ClockSource")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClockSource {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of "1" indicates the first entry considered (highest precedence).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 100)
	public Long order;
	/**
	 * A reference to a physical interface from which a clock signal can be derived. {{object|.ISDN.PRI.{i}.}} is eligible as a clock source when {{param|.ISDN.PRI.{i}.ClockMode}} is {{enum|Slave|.ISDN.PRI.{i}.ClockMode}}. {{object|.ISDN.BRI.{i}.}} is eligible as a clock source when {{param|.ISDN.BRI.{i}.ProtocolEmulation}} is {{enum|TE|.ISDN.BRI.{i}.ProtocolEmulation}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;

	public ClockSource() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public ClockSource withEnable(Boolean enable) {
		this.enable = enable;
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
	public ClockSource withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of "1" indicates the first entry considered (highest precedence).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of "1" indicates the first entry considered (highest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of "1" indicates the first entry considered (highest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public ClockSource withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get a reference to a physical interface from which a clock signal can be derived. {{object|.ISDN.PRI.{i}.}} is eligible as a clock source when {{param|.ISDN.PRI.{i}.ClockMode}} is {{enum|Slave|.ISDN.PRI.{i}.ClockMode}}. {{object|.ISDN.BRI.{i}.}} is eligible as a clock source when {{param|.ISDN.BRI.{i}.ProtocolEmulation}} is {{enum|TE|.ISDN.BRI.{i}.ProtocolEmulation}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set a reference to a physical interface from which a clock signal can be derived. {{object|.ISDN.PRI.{i}.}} is eligible as a clock source when {{param|.ISDN.PRI.{i}.ClockMode}} is {{enum|Slave|.ISDN.PRI.{i}.ClockMode}}. {{object|.ISDN.BRI.{i}.}} is eligible as a clock source when {{param|.ISDN.BRI.{i}.ProtocolEmulation}} is {{enum|TE|.ISDN.BRI.{i}.ProtocolEmulation}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set a reference to a physical interface from which a clock signal can be derived. {{object|.ISDN.PRI.{i}.}} is eligible as a clock source when {{param|.ISDN.PRI.{i}.ClockMode}} is {{enum|Slave|.ISDN.PRI.{i}.ClockMode}}. {{object|.ISDN.BRI.{i}.}} is eligible as a clock source when {{param|.ISDN.BRI.{i}.ProtocolEmulation}} is {{enum|TE|.ISDN.BRI.{i}.ProtocolEmulation}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public ClockSource with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	//</editor-fold>

}