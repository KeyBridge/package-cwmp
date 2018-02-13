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
package org.broadbandforum.tr196.fapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.accessmgmt.CDMA2000;
import org.broadbandforum.tr196.fapservice.accessmgmt.LTE;
import org.broadbandforum.tr196.fapservice.accessmgmt.Legacy;
import org.broadbandforum.tr196.fapservice.accessmgmt.UMTS;

	/**
	 * This object contains parameters relating to Access Management for the different radio technologies.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.")
@XmlRootElement(name = "FAPService.AccessMgmt")
@XmlType(name = "FAPService.AccessMgmt")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccessMgmt {

	/**
	 * This object contains parameters relating to Access Management for UMTS FAP (ACL, CSG, LIPA).

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in {{object|.CellConfig.UMTS.RAN.CellRestriction.}} (UMTS FAP).
	 */
	@XmlElement(name = "UMTS")
	public UMTS umtS;
	/**
	 * This object contains parameters relating to Access Management, as defined in {{bibref|3GPP-TS.32.592}}/

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 */
	@XmlElement(name = "LTE")
	public LTE lte;
	/**
	 * This object contains configurable and observable attributes related to CDMA2000 Access and Admission Control of the FAP.
	 */
	@XmlElement(name = "CDMA2000")
	public CDMA2000 cdmA2000;
	/**
	 * This object contains configurable and observable attributes related to Access and Admission Control of the FAP, which are not not covered by 3GPP and 3GPP2 specifications.
	 */
	@XmlElement(name = "Legacy")
	public Legacy legacy;

	public AccessMgmt() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to Access Management for UMTS FAP (ACL, CSG, LIPA).

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in {{object|.CellConfig.UMTS.RAN.CellRestriction.}} (UMTS FAP).
	 *
	 * @return the value
	 */
	public UMTS getUmtS() {
		return umtS;
	}

	/**
	 * Set the this object contains parameters relating to Access Management for UMTS FAP (ACL, CSG, LIPA).

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in {{object|.CellConfig.UMTS.RAN.CellRestriction.}} (UMTS FAP).
	 *
	 * @param umtS the input value
	 */
	public void  setUmtS(UMTS umtS) {
		this.umtS = umtS;
	}

	/**
	 * Set the this object contains parameters relating to Access Management for UMTS FAP (ACL, CSG, LIPA).

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in {{object|.CellConfig.UMTS.RAN.CellRestriction.}} (UMTS FAP).
	 *
	 * @param umtS the input value
	 * @return this instance
	 */
	public AccessMgmt withUmtS(UMTS umtS) {
		this.umtS = umtS;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Access Management, as defined in {{bibref|3GPP-TS.32.592}}/

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @return the value
	 */
	public LTE getLte() {
		return lte;
	}

	/**
	 * Set the this object contains parameters relating to Access Management, as defined in {{bibref|3GPP-TS.32.592}}/

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @param lte the input value
	 */
	public void  setLte(LTE lte) {
		this.lte = lte;
	}

	/**
	 * Set the this object contains parameters relating to Access Management, as defined in {{bibref|3GPP-TS.32.592}}/

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @param lte the input value
	 * @return this instance
	 */
	public AccessMgmt withLte(LTE lte) {
		this.lte = lte;
		return this;
	}

	/**
	 * Get the this object contains configurable and observable attributes related to CDMA2000 Access and Admission Control of the FAP.
	 *
	 * @return the value
	 */
	public CDMA2000 getCdmA2000() {
		return cdmA2000;
	}

	/**
	 * Set the this object contains configurable and observable attributes related to CDMA2000 Access and Admission Control of the FAP.
	 *
	 * @param cdmA2000 the input value
	 */
	public void  setCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
	}

	/**
	 * Set the this object contains configurable and observable attributes related to CDMA2000 Access and Admission Control of the FAP.
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public AccessMgmt withCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
		return this;
	}

	/**
	 * Get the this object contains configurable and observable attributes related to Access and Admission Control of the FAP, which are not not covered by 3GPP and 3GPP2 specifications.
	 *
	 * @return the value
	 */
	public Legacy getLegacy() {
		return legacy;
	}

	/**
	 * Set the this object contains configurable and observable attributes related to Access and Admission Control of the FAP, which are not not covered by 3GPP and 3GPP2 specifications.
	 *
	 * @param legacy the input value
	 */
	public void  setLegacy(Legacy legacy) {
		this.legacy = legacy;
	}

	/**
	 * Set the this object contains configurable and observable attributes related to Access and Admission Control of the FAP, which are not not covered by 3GPP and 3GPP2 specifications.
	 *
	 * @param legacy the input value
	 * @return this instance
	 */
	public AccessMgmt withLegacy(Legacy legacy) {
		this.legacy = legacy;
		return this;
	}

	//</editor-fold>

}