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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.csdomain.hho;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the circuit switch HHO statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @since TR196 v2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.CSDomain.HHO.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.CN.CSDomain.HHO.Stats")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.CSDomain.HHO.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the number of attempted 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Att3GMacroToHnbCSHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long att3GMacroToHnbCSHO;
	/**
	 * This measurement provides the number of successful 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Succ3GMacroToHnbCSHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succ3GMacroToHnbCSHO;
	/**
	 * This measurement provides the number of attempted 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Att2GMacroToHnbCSHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long att2GMacroToHnbCSHO;
	/**
	 * This measurement provides the number of successful 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Succ2GMacroToHnbCSHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succ2GMacroToHnbCSHO;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of attempted 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAtt3GMacroToHnbCSHO() {
		return att3GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of attempted 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param att3GMacroToHnbCSHO the input value
	 */
	public void  setAtt3GMacroToHnbCSHO(Long att3GMacroToHnbCSHO) {
		this.att3GMacroToHnbCSHO = att3GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of attempted 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param att3GMacroToHnbCSHO the input value
	 * @return this instance
	 */
	public Stats withAtt3GMacroToHnbCSHO(Long att3GMacroToHnbCSHO) {
		this.att3GMacroToHnbCSHO = att3GMacroToHnbCSHO;
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSucc3GMacroToHnbCSHO() {
		return succ3GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of successful 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param succ3GMacroToHnbCSHO the input value
	 */
	public void  setSucc3GMacroToHnbCSHO(Long succ3GMacroToHnbCSHO) {
		this.succ3GMacroToHnbCSHO = succ3GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of successful 3G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param succ3GMacroToHnbCSHO the input value
	 * @return this instance
	 */
	public Stats withSucc3GMacroToHnbCSHO(Long succ3GMacroToHnbCSHO) {
		this.succ3GMacroToHnbCSHO = succ3GMacroToHnbCSHO;
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAtt2GMacroToHnbCSHO() {
		return att2GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of attempted 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param att2GMacroToHnbCSHO the input value
	 */
	public void  setAtt2GMacroToHnbCSHO(Long att2GMacroToHnbCSHO) {
		this.att2GMacroToHnbCSHO = att2GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of attempted 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param att2GMacroToHnbCSHO the input value
	 * @return this instance
	 */
	public Stats withAtt2GMacroToHnbCSHO(Long att2GMacroToHnbCSHO) {
		this.att2GMacroToHnbCSHO = att2GMacroToHnbCSHO;
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSucc2GMacroToHnbCSHO() {
		return succ2GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of successful 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param succ2GMacroToHnbCSHO the input value
	 */
	public void  setSucc2GMacroToHnbCSHO(Long succ2GMacroToHnbCSHO) {
		this.succ2GMacroToHnbCSHO = succ2GMacroToHnbCSHO;
	}

	/**
	 * Set the this measurement provides the number of successful 2G Macro to HNB CS handovers.
	 *
	 * @since 2.1
	 * @param succ2GMacroToHnbCSHO the input value
	 * @return this instance
	 */
	public Stats withSucc2GMacroToHnbCSHO(Long succ2GMacroToHnbCSHO) {
		this.succ2GMacroToHnbCSHO = succ2GMacroToHnbCSHO;
		return this;
	}

	//</editor-fold>

}