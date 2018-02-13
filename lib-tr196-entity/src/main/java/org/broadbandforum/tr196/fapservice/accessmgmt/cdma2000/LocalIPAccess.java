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
package org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.localipaccess.HRPD;

	/**
	 * Local IP access support as defined in 3GPP2
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.")
@XmlRootElement(name = "FAPService.AccessMgmt.CDMA2000.LocalIPAccess")
@XmlType(name = "FAPService.AccessMgmt.CDMA2000.LocalIPAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocalIPAccess {

	/**
	 * Local IP access support as defined in 3GPP2
	 */
	@XmlElement(name = "HRPD")
	public HRPD hrpD;

	public LocalIPAccess() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the local IP access support as defined in 3GPP2
	 *
	 * @return the value
	 */
	public HRPD getHrpD() {
		return hrpD;
	}

	/**
	 * Set the local IP access support as defined in 3GPP2
	 *
	 * @param hrpD the input value
	 */
	public void  setHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
	}

	/**
	 * Set the local IP access support as defined in 3GPP2
	 *
	 * @param hrpD the input value
	 * @return this instance
	 */
	public LocalIPAccess withHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
		return this;
	}

	//</editor-fold>

}