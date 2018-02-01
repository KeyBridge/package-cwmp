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
package org.broadbandforum.tr181.device.dsl;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.dsl.diagnostics.ADSLLineTest;

	/**
	 * The DSL Diagnostics object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Diagnostics.")
public class Diagnostics {

	/**
	 * This object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 */
	@XmlElement(name = "ADSLLineTest")
	public ADSLLineTest adsLLineTest;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @return the value
	 */
	public ADSLLineTest getAdsLLineTest() {
		return adsLLineTest;
	}

	/**
	 * Set the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @param adsLLineTest the input value
	 */
	public void  setAdsLLineTest(ADSLLineTest adsLLineTest) {
		this.adsLLineTest = adsLLineTest;
	}

	/**
	 * Set the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @param adsLLineTest the input value
	 * @return this instance
	 */
	public Diagnostics withAdsLLineTest(ADSLLineTest adsLLineTest) {
		this.adsLLineTest = adsLLineTest;
		return this;
	}

	//</editor-fold>

}