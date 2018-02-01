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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.pots.FXO;
import org.broadbandforum.tr104.voiceservice.pots.FXS;
import org.broadbandforum.tr104.voiceservice.pots.Ringer;

	/**
	 * This object models analogue lines. Both FXO and FXS are handled.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.")
public class POTS {

	/**
	 * The geographic region associated to POTS (MUST be an alpha-2 (two-character alphabetic) country code as specified by {{bibref|ISO3166-1}}). This MAY be used by the CPE to customize localization settings. 

If {{empty}}, indicates that the region is unspecified and the CPE SHOULD use default localization settings.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Region")
	@CWMPParameter(access = "readWrite")
	@Size(max = 2)
	public String region;
	/**
	 * FXO physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_203_021}}
	 */
	@XmlElementWrapper(name = "fxos")
	@XmlElement(name = "FXO")
	public Collection<FXO> fxos;
	/**
	 * FXS physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_201_970}}
	 */
	@XmlElementWrapper(name = "fxss")
	@XmlElement(name = "FXS")
	public Collection<FXS> fxss;
	/**
	 * This object contains the ring sequences configured for analogue lines.
	 */
	@XmlElement(name = "Ringer")
	public Ringer ringer;

	public POTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the geographic region associated to POTS (MUST be an alpha-2 (two-character alphabetic) country code as specified by {{bibref|ISO3166-1}}). This MAY be used by the CPE to customize localization settings. 

If {{empty}}, indicates that the region is unspecified and the CPE SHOULD use default localization settings.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Set the geographic region associated to POTS (MUST be an alpha-2 (two-character alphabetic) country code as specified by {{bibref|ISO3166-1}}). This MAY be used by the CPE to customize localization settings. 

If {{empty}}, indicates that the region is unspecified and the CPE SHOULD use default localization settings.
	 *
	 * @since 2.0
	 * @param region the input value
	 */
	public void  setRegion(String region) {
		this.region = region;
	}

	/**
	 * Set the geographic region associated to POTS (MUST be an alpha-2 (two-character alphabetic) country code as specified by {{bibref|ISO3166-1}}). This MAY be used by the CPE to customize localization settings. 

If {{empty}}, indicates that the region is unspecified and the CPE SHOULD use default localization settings.
	 *
	 * @since 2.0
	 * @param region the input value
	 * @return this instance
	 */
	public POTS withRegion(String region) {
		this.region = region;
		return this;
	}

	/**
	 * Get the fxo physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_203_021}}
	 *
	 * @return the value
	 */
	public Collection<FXO> getFxos() {
		if (this.fxos == null){ this.fxos=new ArrayList<>();}
		return fxos;
	}

	/**
	 * Set the fxo physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_203_021}}
	 *
	 * @param fxos the input value
	 */
	public void  setFxos(Collection<FXO> fxos) {
		this.fxos = fxos;
	}

	/**
	 * Set the fxo physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_203_021}}
	 *
	 * @param fxo the input value
	 * @return this instance
	 */
	public POTS withFXO(FXO fxo) {
		getFxos().add(fxo);
		return this;
	}

	/**
	 * Get the fxs physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_201_970}}
	 *
	 * @return the value
	 */
	public Collection<FXS> getFxss() {
		if (this.fxss == null){ this.fxss=new ArrayList<>();}
		return fxss;
	}

	/**
	 * Set the fxs physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_201_970}}
	 *
	 * @param fxss the input value
	 */
	public void  setFxss(Collection<FXS> fxss) {
		this.fxss = fxss;
	}

	/**
	 * Set the fxs physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_201_970}}
	 *
	 * @param fxs the input value
	 * @return this instance
	 */
	public POTS withFXS(FXS fxs) {
		getFxss().add(fxs);
		return this;
	}

	/**
	 * Get the this object contains the ring sequences configured for analogue lines.
	 *
	 * @return the value
	 */
	public Ringer getRinger() {
		return ringer;
	}

	/**
	 * Set the this object contains the ring sequences configured for analogue lines.
	 *
	 * @param ringer the input value
	 */
	public void  setRinger(Ringer ringer) {
		this.ringer = ringer;
	}

	/**
	 * Set the this object contains the ring sequences configured for analogue lines.
	 *
	 * @param ringer the input value
	 * @return this instance
	 */
	public POTS withRinger(Ringer ringer) {
		this.ringer = ringer;
		return this;
	}

	//</editor-fold>

}