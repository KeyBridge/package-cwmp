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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.epc.ho;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the HO statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EPC.HO.Stats.")
public class Stats {

	/**
	 * This measurement provides the number of attempted outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToeNBAtt")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toeNBAtt;
	/**
	 * This measurement provides the number of successful outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToeNBSucc")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toeNBSucc;
	/**
	 * This measurement provides the number of failed outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToeNBFail")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toeNBFail;
	/**
	 * This measurement provides the number of attempted inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FromeNBAtt")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> fromeNBAtt;
	/**
	 * This measurement provides the number of successful inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FromeNBSucc")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> fromeNBSucc;
	/**
	 * This measurement provides the number of failed inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FromeNBFail")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> fromeNBFail;
	/**
	 * This measurement provides the number of attempted outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToUtranAtt")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toutranAtt;
	/**
	 * This measurement provides the number of successful outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToUtranSucc")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toutranSucc;
	/**
	 * This measurement provides the number of failed outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToUtranFail")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> toutranFail;
	/**
	 * This measurement provides the number of attempted outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToGeranAtt")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> togeranAtt;
	/**
	 * This measurement provides the number of successful outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToGeranSucc")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> togeranSucc;
	/**
	 * This measurement provides the number of failed outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ToGeranFail")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> togeranFail;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of attempted outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToeNBAtt() {
		if (this.toeNBAtt == null){ this.toeNBAtt=new ArrayList<>();}
		return toeNBAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toeNBAtt the input value
	 */
	public void  setToeNBAtt(Collection<String> toeNBAtt) {
		this.toeNBAtt = toeNBAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToeNBAtt(String string) {
		getToeNBAtt().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToeNBSucc() {
		if (this.toeNBSucc == null){ this.toeNBSucc=new ArrayList<>();}
		return toeNBSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toeNBSucc the input value
	 */
	public void  setToeNBSucc(Collection<String> toeNBSucc) {
		this.toeNBSucc = toeNBSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToeNBSucc(String string) {
		getToeNBSucc().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of failed outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToeNBFail() {
		if (this.toeNBFail == null){ this.toeNBFail=new ArrayList<>();}
		return toeNBFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toeNBFail the input value
	 */
	public void  setToeNBFail(Collection<String> toeNBFail) {
		this.toeNBFail = toeNBFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToeNBFail(String string) {
		getToeNBFail().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFromeNBAtt() {
		if (this.fromeNBAtt == null){ this.fromeNBAtt=new ArrayList<>();}
		return fromeNBAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param fromeNBAtt the input value
	 */
	public void  setFromeNBAtt(Collection<String> fromeNBAtt) {
		this.fromeNBAtt = fromeNBAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withFromeNBAtt(String string) {
		getFromeNBAtt().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFromeNBSucc() {
		if (this.fromeNBSucc == null){ this.fromeNBSucc=new ArrayList<>();}
		return fromeNBSucc;
	}

	/**
	 * Set the this measurement provides the number of successful inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param fromeNBSucc the input value
	 */
	public void  setFromeNBSucc(Collection<String> fromeNBSucc) {
		this.fromeNBSucc = fromeNBSucc;
	}

	/**
	 * Set the this measurement provides the number of successful inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withFromeNBSucc(String string) {
		getFromeNBSucc().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of failed inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFromeNBFail() {
		if (this.fromeNBFail == null){ this.fromeNBFail=new ArrayList<>();}
		return fromeNBFail;
	}

	/**
	 * Set the this measurement provides the number of failed inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param fromeNBFail the input value
	 */
	public void  setFromeNBFail(Collection<String> fromeNBFail) {
		this.fromeNBFail = fromeNBFail;
	}

	/**
	 * Set the this measurement provides the number of failed inbound handover from HeNB by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withFromeNBFail(String string) {
		getFromeNBFail().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToutranAtt() {
		if (this.toutranAtt == null){ this.toutranAtt=new ArrayList<>();}
		return toutranAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toutranAtt the input value
	 */
	public void  setToutranAtt(Collection<String> toutranAtt) {
		this.toutranAtt = toutranAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToutranAtt(String string) {
		getToutranAtt().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToutranSucc() {
		if (this.toutranSucc == null){ this.toutranSucc=new ArrayList<>();}
		return toutranSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toutranSucc the input value
	 */
	public void  setToutranSucc(Collection<String> toutranSucc) {
		this.toutranSucc = toutranSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToutranSucc(String string) {
		getToutranSucc().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of failed outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getToutranFail() {
		if (this.toutranFail == null){ this.toutranFail=new ArrayList<>();}
		return toutranFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param toutranFail the input value
	 */
	public void  setToutranFail(Collection<String> toutranFail) {
		this.toutranFail = toutranFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to Utran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withToutranFail(String string) {
		getToutranFail().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getTogeranAtt() {
		if (this.togeranAtt == null){ this.togeranAtt=new ArrayList<>();}
		return togeranAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param togeranAtt the input value
	 */
	public void  setTogeranAtt(Collection<String> togeranAtt) {
		this.togeranAtt = togeranAtt;
	}

	/**
	 * Set the this measurement provides the number of attempted outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withTogeranAtt(String string) {
		getTogeranAtt().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of successful outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getTogeranSucc() {
		if (this.togeranSucc == null){ this.togeranSucc=new ArrayList<>();}
		return togeranSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param togeranSucc the input value
	 */
	public void  setTogeranSucc(Collection<String> togeranSucc) {
		this.togeranSucc = togeranSucc;
	}

	/**
	 * Set the this measurement provides the number of successful outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withTogeranSucc(String string) {
		getTogeranSucc().add(string);
		return this;
	}

	/**
	 * Get the this measurement provides the number of failed outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getTogeranFail() {
		if (this.togeranFail == null){ this.togeranFail=new ArrayList<>();}
		return togeranFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param togeranFail the input value
	 */
	public void  setTogeranFail(Collection<String> togeranFail) {
		this.togeranFail = togeranFail;
	}

	/**
	 * Set the this measurement provides the number of failed outbound handover to Geran by handover cause.

{{list| where each item is defined as the "cause name=measurement value"}} The total of all the measurements is provided using the name= "sum".
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withTogeranFail(String string) {
		getTogeranFail().add(string);
		return this;
	}

	//</editor-fold>

}