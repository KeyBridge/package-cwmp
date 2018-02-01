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
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.isdn.BRI;
import org.broadbandforum.tr104.voiceservice.isdn.PRI;

	/**
	 * This object models ISDN physical interfaces (BRI and PRI) supporting {{bibref|Q.931}} based signalling.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ISDN.")
public class ISDN {

	/**
	 * ISDN BRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 */
	@XmlElementWrapper(name = "bris")
	@XmlElement(name = "BRI")
	public Collection<BRI> bris;
	/**
	 * ISDN PRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 */
	@XmlElementWrapper(name = "pris")
	@XmlElement(name = "PRI")
	public Collection<PRI> pris;

	public ISDN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the isdN BRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @return the value
	 */
	public Collection<BRI> getBris() {
		if (this.bris == null){ this.bris=new ArrayList<>();}
		return bris;
	}

	/**
	 * Set the isdN BRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param bris the input value
	 */
	public void  setBris(Collection<BRI> bris) {
		this.bris = bris;
	}

	/**
	 * Set the isdN BRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param bri the input value
	 * @return this instance
	 */
	public ISDN withBRI(BRI bri) {
		getBris().add(bri);
		return this;
	}

	/**
	 * Get the isdN PRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @return the value
	 */
	public Collection<PRI> getPris() {
		if (this.pris == null){ this.pris=new ArrayList<>();}
		return pris;
	}

	/**
	 * Set the isdN PRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param pris the input value
	 */
	public void  setPris(Collection<PRI> pris) {
		this.pris = pris;
	}

	/**
	 * Set the isdN PRI physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @param pri the input value
	 * @return this instance
	 */
	public ISDN withPRI(PRI pri) {
		getPris().add(pri);
		return this;
	}

	//</editor-fold>

}