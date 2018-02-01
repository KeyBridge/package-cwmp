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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The list of IP ports on the CPE WAN and LAN interfaces that will not be allocated by the ACS and therefore are available to be allocated by the CPE. The CPE can dynamically allocate ports from this range for things like signaling listening ports or local RTP ports.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ReservedPorts.")
public class ReservedPorts {

	/**
	 * Range of ports reserved for use by the CPE on any WAN interface. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WANPortRange")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> wanPortRange;
	/**
	 * Range of ports reserved for use by the CPE on any LAN interfaces. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LANPortRange")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> lanPortRange;

	public ReservedPorts() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the range of ports reserved for use by the CPE on any WAN interface. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getWanPortRange() {
		if (this.wanPortRange == null){ this.wanPortRange=new ArrayList<>();}
		return wanPortRange;
	}

	/**
	 * Set the range of ports reserved for use by the CPE on any WAN interface. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @param wanPortRange the input value
	 */
	public void  setWanPortRange(Collection<String> wanPortRange) {
		this.wanPortRange = wanPortRange;
	}

	/**
	 * Set the range of ports reserved for use by the CPE on any WAN interface. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ReservedPorts withWanPortRange(String string) {
		getWanPortRange().add(string);
		return this;
	}

	/**
	 * Get the range of ports reserved for use by the CPE on any LAN interfaces. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLanPortRange() {
		if (this.lanPortRange == null){ this.lanPortRange=new ArrayList<>();}
		return lanPortRange;
	}

	/**
	 * Set the range of ports reserved for use by the CPE on any LAN interfaces. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @param lanPortRange the input value
	 */
	public void  setLanPortRange(Collection<String> lanPortRange) {
		this.lanPortRange = lanPortRange;
	}

	/**
	 * Set the range of ports reserved for use by the CPE on any LAN interfaces. {{list}} Each range consists of a ''Start'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''End'' part consisting of 1 to n digits prefixed by a "-" symbol.

Example:

: 12345-12350,23580
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ReservedPorts withLanPortRange(String string) {
		getLanPortRange().add(string);
		return this;
	}

	//</editor-fold>

}