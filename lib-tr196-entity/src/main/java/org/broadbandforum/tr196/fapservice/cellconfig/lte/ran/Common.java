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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the common configuration in LTE RAN.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Common.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Common")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Common")
@XmlAccessorType(XmlAccessType.FIELD)
public class Common {

	/**
	 * Cell Identity as specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellIdentity")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 268435455)
	public Long cellIdentity;

	public Common() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the cell Identity as specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellIdentity() {
		return cellIdentity;
	}

	/**
	 * Set the cell Identity as specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cellIdentity the input value
	 */
	public void  setCellIdentity(Long cellIdentity) {
		this.cellIdentity = cellIdentity;
	}

	/**
	 * Set the cell Identity as specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cellIdentity the input value
	 * @return this instance
	 */
	public Common withCellIdentity(Long cellIdentity) {
		this.cellIdentity = cellIdentity;
		return this;
	}

	//</editor-fold>

}