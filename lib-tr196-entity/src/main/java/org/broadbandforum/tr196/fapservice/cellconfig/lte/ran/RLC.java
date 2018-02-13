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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.rlc.SRB1;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.rlc.SRB2;

	/**
	 * This object contains parameters relating to the RLC (Radio Link Control) configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RLC.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.RLC")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.RLC")
@XmlAccessorType(XmlAccessType.FIELD)
public class RLC {

	/**
	 * This object contains parameters relating to the SRB1 (Signaling Radio Bearer 1) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 */
	@XmlElement(name = "SRB1")
	public SRB1 srb1;
	/**
	 * This object contains parameters relating to the SRB2 (Signaling Radio Bearer 2) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 */
	@XmlElement(name = "SRB2")
	public SRB2 srb2;

	public RLC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the SRB1 (Signaling Radio Bearer 1) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @return the value
	 */
	public SRB1 getSrb1() {
		return srb1;
	}

	/**
	 * Set the this object contains parameters relating to the SRB1 (Signaling Radio Bearer 1) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @param srb1 the input value
	 */
	public void  setSrb1(SRB1 srb1) {
		this.srb1 = srb1;
	}

	/**
	 * Set the this object contains parameters relating to the SRB1 (Signaling Radio Bearer 1) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @param srb1 the input value
	 * @return this instance
	 */
	public RLC withSrb1(SRB1 srb1) {
		this.srb1 = srb1;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the SRB2 (Signaling Radio Bearer 2) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @return the value
	 */
	public SRB2 getSrb2() {
		return srb2;
	}

	/**
	 * Set the this object contains parameters relating to the SRB2 (Signaling Radio Bearer 2) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @param srb2 the input value
	 */
	public void  setSrb2(SRB2 srb2) {
		this.srb2 = srb2;
	}

	/**
	 * Set the this object contains parameters relating to the SRB2 (Signaling Radio Bearer 2) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @param srb2 the input value
	 * @return this instance
	 */
	public RLC withSrb2(SRB2 srb2) {
		this.srb2 = srb2;
		return this;
	}

	//</editor-fold>

}