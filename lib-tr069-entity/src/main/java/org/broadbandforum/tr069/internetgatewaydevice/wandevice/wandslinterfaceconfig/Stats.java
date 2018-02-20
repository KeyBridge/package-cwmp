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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats.CurrentDay;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats.LastShowtime;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats.QuarterHour;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats.Showtime;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.wandslinterfaceconfig.stats.Total;

	/**
	 * This object contains statistics for a WAN DSL physical interface.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLInterfaceConfig.Stats.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig.Stats")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This object contains DSL total statistics.
	 */
	@XmlElement(name = "Total")
	public Total total;
	/**
	 * This object contains DSL statistics accumulated since the most recent DSL Showtime.
	 */
	@XmlElement(name = "Showtime")
	public Showtime showtime;
	/**
	 * This object contains DSL statistics accumulated since the second most recent DSL Showtime.
	 */
	@XmlElement(name = "LastShowtime")
	public LastShowtime lastShowtime;
	/**
	 * This object contains DSL statistics accumulated during the current day.
	 */
	@XmlElement(name = "CurrentDay")
	public CurrentDay currentDay;
	/**
	 * This object contains DSL statistics accumulated during the current quarter hour.
	 */
	@XmlElement(name = "QuarterHour")
	public QuarterHour quarterHour;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains DSL total statistics.
	 *
	 * @return the value
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Set the this object contains DSL total statistics.
	 *
	 * @param total the input value
	 */
	public void  setTotal(Total total) {
		this.total = total;
	}

	/**
	 * Set the this object contains DSL total statistics.
	 *
	 * @param total the input value
	 * @return this instance
	 */
	public Stats withTotal(Total total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the this object contains DSL statistics accumulated since the most recent DSL Showtime.
	 *
	 * @return the value
	 */
	public Showtime getShowtime() {
		return showtime;
	}

	/**
	 * Set the this object contains DSL statistics accumulated since the most recent DSL Showtime.
	 *
	 * @param showtime the input value
	 */
	public void  setShowtime(Showtime showtime) {
		this.showtime = showtime;
	}

	/**
	 * Set the this object contains DSL statistics accumulated since the most recent DSL Showtime.
	 *
	 * @param showtime the input value
	 * @return this instance
	 */
	public Stats withShowtime(Showtime showtime) {
		this.showtime = showtime;
		return this;
	}

	/**
	 * Get the this object contains DSL statistics accumulated since the second most recent DSL Showtime.
	 *
	 * @return the value
	 */
	public LastShowtime getLastShowtime() {
		return lastShowtime;
	}

	/**
	 * Set the this object contains DSL statistics accumulated since the second most recent DSL Showtime.
	 *
	 * @param lastShowtime the input value
	 */
	public void  setLastShowtime(LastShowtime lastShowtime) {
		this.lastShowtime = lastShowtime;
	}

	/**
	 * Set the this object contains DSL statistics accumulated since the second most recent DSL Showtime.
	 *
	 * @param lastShowtime the input value
	 * @return this instance
	 */
	public Stats withLastShowtime(LastShowtime lastShowtime) {
		this.lastShowtime = lastShowtime;
		return this;
	}

	/**
	 * Get the this object contains DSL statistics accumulated during the current day.
	 *
	 * @return the value
	 */
	public CurrentDay getCurrentDay() {
		return currentDay;
	}

	/**
	 * Set the this object contains DSL statistics accumulated during the current day.
	 *
	 * @param currentDay the input value
	 */
	public void  setCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
	}

	/**
	 * Set the this object contains DSL statistics accumulated during the current day.
	 *
	 * @param currentDay the input value
	 * @return this instance
	 */
	public Stats withCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
		return this;
	}

	/**
	 * Get the this object contains DSL statistics accumulated during the current quarter hour.
	 *
	 * @return the value
	 */
	public QuarterHour getQuarterHour() {
		return quarterHour;
	}

	/**
	 * Set the this object contains DSL statistics accumulated during the current quarter hour.
	 *
	 * @param quarterHour the input value
	 */
	public void  setQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
	}

	/**
	 * Set the this object contains DSL statistics accumulated during the current quarter hour.
	 *
	 * @param quarterHour the input value
	 * @return this instance
	 */
	public Stats withQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
		return this;
	}

	//</editor-fold>

}