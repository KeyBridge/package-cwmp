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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.csg;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the LTE RAN CSG statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since TR196 v2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.CSG.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.CSG.Stats")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.CSG.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the mean number of attached CSG UEs in the HeNB.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "MeanNbrUsr")
	@CWMPParameter(activeNotify = "canDeny")
	public Long meanNbrUsr;
	/**
	 * This measurement provides the number of attempted inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttInboundMobility")
	@CWMPParameter(activeNotify = "canDeny")
	public Long attInboundMobility;
	/**
	 * This measurement provides the number of successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SuccInboundMobility")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succInboundMobility;
	/**
	 * This measurement provides the number of failed successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FailedInboundMobility")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> failedInboundMobility;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the mean number of attached CSG UEs in the HeNB.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getMeanNbrUsr() {
		return meanNbrUsr;
	}

	/**
	 * Set the this measurement provides the mean number of attached CSG UEs in the HeNB.
	 *
	 * @since 2.1
	 * @param meanNbrUsr the input value
	 */
	public void  setMeanNbrUsr(Long meanNbrUsr) {
		this.meanNbrUsr = meanNbrUsr;
	}

	/**
	 * Set the this measurement provides the mean number of attached CSG UEs in the HeNB.
	 *
	 * @since 2.1
	 * @param meanNbrUsr the input value
	 * @return this instance
	 */
	public Stats withMeanNbrUsr(Long meanNbrUsr) {
		this.meanNbrUsr = meanNbrUsr;
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAttInboundMobility() {
		return attInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of attempted inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @param attInboundMobility the input value
	 */
	public void  setAttInboundMobility(Long attInboundMobility) {
		this.attInboundMobility = attInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of attempted inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @param attInboundMobility the input value
	 * @return this instance
	 */
	public Stats withAttInboundMobility(Long attInboundMobility) {
		this.attInboundMobility = attInboundMobility;
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSuccInboundMobility() {
		return succInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @param succInboundMobility the input value
	 */
	public void  setSuccInboundMobility(Long succInboundMobility) {
		this.succInboundMobility = succInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode.
	 *
	 * @since 2.1
	 * @param succInboundMobility the input value
	 * @return this instance
	 */
	public Stats withSuccInboundMobility(Long succInboundMobility) {
		this.succInboundMobility = succInboundMobility;
		return this;
	}

	/**
	 * Get the this measurement provides the number of failed successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFailedInboundMobility() {
		if (this.failedInboundMobility == null){ this.failedInboundMobility=new ArrayList<>();}
		return failedInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of failed successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param failedInboundMobility the input value
	 */
	public void  setFailedInboundMobility(Collection<String> failedInboundMobility) {
		this.failedInboundMobility = failedInboundMobility;
	}

	/**
	 * Set the this measurement provides the number of failed successful inbound mobility for UEs to CSG cells or hybrid cells in RRC_CONNECTED mode by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withFailedInboundMobility(String string) {
		getFailedInboundMobility().add(string);
		return this;
	}

	//</editor-fold>

}