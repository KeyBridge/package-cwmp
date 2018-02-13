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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.psdomain.rab.stats;

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
	 * This object provides statistics for the Direct User Plane Path between HNB and Local Gateway as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.PSDomain.RAB.Stats.LGW.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.CN.PSDomain.RAB.Stats.LGW")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.PSDomain.RAB.Stats.LGW")
@XmlAccessorType(XmlAccessType.FIELD)
public class LGW {

	/**
	 * The value of this parameter is equal to the user plane GGSN TEID that the Gn-SGSN has received or the user plane PDN GW TEID that the S4-SGSN has received. {{bibref|3GPP-TS.25.413}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "CorrelationID")
	@CWMPParameter(activeNotify = "canDeny")
	public String correlationID;
	/**
	 * This measurement provides the number of direct user plane path between HNB and Local GW attempted to setup.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabDirectPathLGWAttNbr")
	@CWMPParameter(activeNotify = "canDeny")
	public Long estabDirectPathLGWAttNbr;
	/**
	 * This measurement provides the number of direct user plane path between HNB and Local GW successfully established.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabDirectPathLGWSuccNbr")
	@CWMPParameter(activeNotify = "canDeny")
	public Long estabDirectPathLGWSuccNbr;
	/**
	 * This measurement provides the number of direct user plane path between HNB and Local GW RABs failed to setup by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabDirectPathLGWFailNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabDirectPathLGWFailNbr;

	public LGW() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the value of this parameter is equal to the user plane GGSN TEID that the Gn-SGSN has received or the user plane PDN GW TEID that the S4-SGSN has received. {{bibref|3GPP-TS.25.413}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getCorrelationID() {
		return correlationID;
	}

	/**
	 * Set the value of this parameter is equal to the user plane GGSN TEID that the Gn-SGSN has received or the user plane PDN GW TEID that the S4-SGSN has received. {{bibref|3GPP-TS.25.413}}.
	 *
	 * @since 2.1
	 * @param correlationID the input value
	 */
	public void  setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	/**
	 * Set the value of this parameter is equal to the user plane GGSN TEID that the Gn-SGSN has received or the user plane PDN GW TEID that the S4-SGSN has received. {{bibref|3GPP-TS.25.413}}.
	 *
	 * @since 2.1
	 * @param correlationID the input value
	 * @return this instance
	 */
	public LGW withCorrelationID(String correlationID) {
		this.correlationID = correlationID;
		return this;
	}

	/**
	 * Get the this measurement provides the number of direct user plane path between HNB and Local GW attempted to setup.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getEstabDirectPathLGWAttNbr() {
		return estabDirectPathLGWAttNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW attempted to setup.
	 *
	 * @since 2.1
	 * @param estabDirectPathLGWAttNbr the input value
	 */
	public void  setEstabDirectPathLGWAttNbr(Long estabDirectPathLGWAttNbr) {
		this.estabDirectPathLGWAttNbr = estabDirectPathLGWAttNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW attempted to setup.
	 *
	 * @since 2.1
	 * @param estabDirectPathLGWAttNbr the input value
	 * @return this instance
	 */
	public LGW withEstabDirectPathLGWAttNbr(Long estabDirectPathLGWAttNbr) {
		this.estabDirectPathLGWAttNbr = estabDirectPathLGWAttNbr;
		return this;
	}

	/**
	 * Get the this measurement provides the number of direct user plane path between HNB and Local GW successfully established.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getEstabDirectPathLGWSuccNbr() {
		return estabDirectPathLGWSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW successfully established.
	 *
	 * @since 2.1
	 * @param estabDirectPathLGWSuccNbr the input value
	 */
	public void  setEstabDirectPathLGWSuccNbr(Long estabDirectPathLGWSuccNbr) {
		this.estabDirectPathLGWSuccNbr = estabDirectPathLGWSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW successfully established.
	 *
	 * @since 2.1
	 * @param estabDirectPathLGWSuccNbr the input value
	 * @return this instance
	 */
	public LGW withEstabDirectPathLGWSuccNbr(Long estabDirectPathLGWSuccNbr) {
		this.estabDirectPathLGWSuccNbr = estabDirectPathLGWSuccNbr;
		return this;
	}

	/**
	 * Get the this measurement provides the number of direct user plane path between HNB and Local GW RABs failed to setup by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabDirectPathLGWFailNbr() {
		if (this.estabDirectPathLGWFailNbr == null){ this.estabDirectPathLGWFailNbr=new ArrayList<>();}
		return estabDirectPathLGWFailNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW RABs failed to setup by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param estabDirectPathLGWFailNbr the input value
	 */
	public void  setEstabDirectPathLGWFailNbr(Collection<String> estabDirectPathLGWFailNbr) {
		this.estabDirectPathLGWFailNbr = estabDirectPathLGWFailNbr;
	}

	/**
	 * Set the this measurement provides the number of direct user plane path between HNB and Local GW RABs failed to setup by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public LGW withEstabDirectPathLGWFailNbr(String string) {
		getEstabDirectPathLGWFailNbr().add(string);
		return this;
	}

	//</editor-fold>

}