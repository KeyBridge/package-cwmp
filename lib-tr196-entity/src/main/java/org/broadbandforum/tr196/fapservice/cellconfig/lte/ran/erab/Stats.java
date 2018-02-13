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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.erab;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.erab.stats.LGW;

	/**
	 * This object provides the E-RAB statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.ERAB.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.ERAB.Stats")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.ERAB.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the number of initial E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabInitAttNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabInitAttNbr;
	/**
	 * This measurement provides the number of initial E-RABs successfully established QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabInitSuccNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabInitSuccNbr;
	/**
	 * This measurement provides the number of initial E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabInitFailNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabInitFailNbr;
	/**
	 * This measurement provides the number of E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabAttNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabAttNbr;
	/**
	 * This measurement provides the number of E-RABs successfully established by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabSuccNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabSuccNbr;
	/**
	 * This measurement provides the number of E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EstabFailNbr")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> estabFailNbr;
	/**
	 * This measurement provides the number of E-RABs requested to release initiated by HeNB by QCI.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RelEnbNbrQCI")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> relEnbNbrQCI;
	/**
	 * This measurement provides the number of E-RABs requested to release initiated by HeNB by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RelEnbNbrCause")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> relEnbNbrCause;
	/**
	 * This object provides statistics for the Direct User Plane Path between HeNB and Local Gateway as defined in {{bibref|3GPP-TS.32.453}}.
	 */
	@XmlElementWrapper(name = "LGWs")
	@XmlElement(name = "LGW")
	public Collection<LGW> lgws;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of initial E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabInitAttNbr() {
		if (this.estabInitAttNbr == null){ this.estabInitAttNbr=new ArrayList<>();}
		return estabInitAttNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabInitAttNbr the input value
	 */
	public void  setEstabInitAttNbr(Collection<String> estabInitAttNbr) {
		this.estabInitAttNbr = estabInitAttNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabInitAttNbr(String string) {
		getEstabInitAttNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of initial E-RABs successfully established QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabInitSuccNbr() {
		if (this.estabInitSuccNbr == null){ this.estabInitSuccNbr=new ArrayList<>();}
		return estabInitSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs successfully established QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabInitSuccNbr the input value
	 */
	public void  setEstabInitSuccNbr(Collection<String> estabInitSuccNbr) {
		this.estabInitSuccNbr = estabInitSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs successfully established QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabInitSuccNbr(String string) {
		getEstabInitSuccNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of initial E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabInitFailNbr() {
		if (this.estabInitFailNbr == null){ this.estabInitFailNbr=new ArrayList<>();}
		return estabInitFailNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabInitFailNbr the input value
	 */
	public void  setEstabInitFailNbr(Collection<String> estabInitFailNbr) {
		this.estabInitFailNbr = estabInitFailNbr;
	}

	/**
	 * Set the this measurement provides the number of initial E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabInitFailNbr(String string) {
		getEstabInitFailNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabAttNbr() {
		if (this.estabAttNbr == null){ this.estabAttNbr=new ArrayList<>();}
		return estabAttNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabAttNbr the input value
	 */
	public void  setEstabAttNbr(Collection<String> estabAttNbr) {
		this.estabAttNbr = estabAttNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs attempted to setup by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabAttNbr(String string) {
		getEstabAttNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of E-RABs successfully established by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabSuccNbr() {
		if (this.estabSuccNbr == null){ this.estabSuccNbr=new ArrayList<>();}
		return estabSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs successfully established by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabSuccNbr the input value
	 */
	public void  setEstabSuccNbr(Collection<String> estabSuccNbr) {
		this.estabSuccNbr = estabSuccNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs successfully established by QoS level (QCI).

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabSuccNbr(String string) {
		getEstabSuccNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getEstabFailNbr() {
		if (this.estabFailNbr == null){ this.estabFailNbr=new ArrayList<>();}
		return estabFailNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param estabFailNbr the input value
	 */
	public void  setEstabFailNbr(Collection<String> estabFailNbr) {
		this.estabFailNbr = estabFailNbr;
	}

	/**
	 * Set the this measurement provides the number of E-RABs failed to setup by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withEstabFailNbr(String string) {
		getEstabFailNbr().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of E-RABs requested to release initiated by HeNB by QCI.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getRelEnbNbrQCI() {
		if (this.relEnbNbrQCI == null){ this.relEnbNbrQCI=new ArrayList<>();}
		return relEnbNbrQCI;
	}

	/**
	 * Set the this measurement provides the number of E-RABs requested to release initiated by HeNB by QCI.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param relEnbNbrQCI the input value
	 */
	public void  setRelEnbNbrQCI(Collection<String> relEnbNbrQCI) {
		this.relEnbNbrQCI = relEnbNbrQCI;
	}

	/**
	 * Set the this measurement provides the number of E-RABs requested to release initiated by HeNB by QCI.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withRelEnbNbrQCI(String string) {
		getRelEnbNbrQCI().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of E-RABs requested to release initiated by HeNB by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getRelEnbNbrCause() {
		if (this.relEnbNbrCause == null){ this.relEnbNbrCause=new ArrayList<>();}
		return relEnbNbrCause;
	}

	/**
	 * Set the this measurement provides the number of E-RABs requested to release initiated by HeNB by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param relEnbNbrCause the input value
	 */
	public void  setRelEnbNbrCause(Collection<String> relEnbNbrCause) {
		this.relEnbNbrCause = relEnbNbrCause;
	}

	/**
	 * Set the this measurement provides the number of E-RABs requested to release initiated by HeNB by cause.

{{list| where each item is defined as the "QCI level name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withRelEnbNbrCause(String string) {
		getRelEnbNbrCause().add(string);
		return this;
	}

	/**
	 * Get the this object provides statistics for the Direct User Plane Path between HeNB and Local Gateway as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @return the value
	 */
	public Collection<LGW> getLgws() {
		if (this.lgws == null){ this.lgws=new ArrayList<>();}
		return lgws;
	}

	/**
	 * Set the this object provides statistics for the Direct User Plane Path between HeNB and Local Gateway as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @param lgws the input value
	 */
	public void  setLgws(Collection<LGW> lgws) {
		this.lgws = lgws;
	}

	/**
	 * Set the this object provides statistics for the Direct User Plane Path between HeNB and Local Gateway as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @param lgw the input value
	 * @return this instance
	 */
	public Stats withLGW(LGW lgw) {
		getLgws().add(lgw);
		return this;
	}

	//</editor-fold>

}