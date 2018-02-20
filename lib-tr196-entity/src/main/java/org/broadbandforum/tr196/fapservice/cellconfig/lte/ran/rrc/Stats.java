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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.rrc;

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
	 * This object provides the RRC statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since TR196 v2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RRC.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.RRC.Stats")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.RRC.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the number of RRC connection establishment attempts by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttConnEstab")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> attConnEstab;
	/**
	 * This measurement provides the number of RRC establishment failures by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FailConnEstab")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> failConnEstab;
	/**
	 * This measurement provides the number of successful RRC establishments by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SuccConnEstab")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> succConnEstab;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of RRC connection establishment attempts by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getAttConnEstab() {
		if (this.attConnEstab == null){ this.attConnEstab=new ArrayList<>();}
		return attConnEstab;
	}

	/**
	 * Set the this measurement provides the number of RRC connection establishment attempts by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param attConnEstab the input value
	 */
	public void  setAttConnEstab(Collection<String> attConnEstab) {
		this.attConnEstab = attConnEstab;
	}

	/**
	 * Set the this measurement provides the number of RRC connection establishment attempts by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withAttConnEstab(String string) {
		getAttConnEstab().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of RRC establishment failures by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFailConnEstab() {
		if (this.failConnEstab == null){ this.failConnEstab=new ArrayList<>();}
		return failConnEstab;
	}

	/**
	 * Set the this measurement provides the number of RRC establishment failures by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param failConnEstab the input value
	 */
	public void  setFailConnEstab(Collection<String> failConnEstab) {
		this.failConnEstab = failConnEstab;
	}

	/**
	 * Set the this measurement provides the number of RRC establishment failures by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withFailConnEstab(String string) {
		getFailConnEstab().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful RRC establishments by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getSuccConnEstab() {
		if (this.succConnEstab == null){ this.succConnEstab=new ArrayList<>();}
		return succConnEstab;
	}

	/**
	 * Set the this measurement provides the number of successful RRC establishments by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param succConnEstab the input value
	 */
	public void  setSuccConnEstab(Collection<String> succConnEstab) {
		this.succConnEstab = succConnEstab;
	}

	/**
	 * Set the this measurement provides the number of successful RRC establishments by cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the cause name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withSuccConnEstab(String string) {
		getSuccConnEstab().add(string);
		return this;
	}

	//</editor-fold>

}