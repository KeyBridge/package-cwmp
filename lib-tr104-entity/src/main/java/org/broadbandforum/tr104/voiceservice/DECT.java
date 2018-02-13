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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.dect.Base;
import org.broadbandforum.tr104.voiceservice.dect.Portable;

	/**
	 * This object models DECT bases and portables.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.DECT.")
@XmlRootElement(name = "VoiceService.DECT")
@XmlType(name = "VoiceService.DECT")
@XmlAccessorType(XmlAccessType.FIELD)
public class DECT {

	/**
	 * DECT base table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 */
	@XmlElementWrapper(name = "Bases")
	@XmlElement(name = "Base")
	public Collection<Base> bases;
	/**
	 * DECT portable table.
	 */
	@XmlElementWrapper(name = "Portables")
	@XmlElement(name = "Portable")
	public Collection<Portable> portables;

	public DECT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the decT base table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @return the value
	 */
	public Collection<Base> getBases() {
		if (this.bases == null){ this.bases=new ArrayList<>();}
		return bases;
	}

	/**
	 * Set the decT base table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param bases the input value
	 */
	public void  setBases(Collection<Base> bases) {
		this.bases = bases;
	}

	/**
	 * Set the decT base table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param base the input value
	 * @return this instance
	 */
	public DECT withBase(Base base) {
		getBases().add(base);
		return this;
	}

	/**
	 * Get the decT portable table.
	 *
	 * @return the value
	 */
	public Collection<Portable> getPortables() {
		if (this.portables == null){ this.portables=new ArrayList<>();}
		return portables;
	}

	/**
	 * Set the decT portable table.
	 *
	 * @param portables the input value
	 */
	public void  setPortables(Collection<Portable> portables) {
		this.portables = portables;
	}

	/**
	 * Set the decT portable table.
	 *
	 * @param portable the input value
	 * @return this instance
	 */
	public DECT withPortable(Portable portable) {
		getPortables().add(portable);
		return this;
	}

	//</editor-fold>

}