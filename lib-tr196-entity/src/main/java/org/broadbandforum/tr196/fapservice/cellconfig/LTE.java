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
package org.broadbandforum.tr196.fapservice.cellconfig;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.EPC;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.EnergySavings;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.RAN;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.Tunnel;

	/**
	 * This object contains parameters relating to configuring the LTE FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.")
@XmlRootElement(name = "FAPService.CellConfig.LTE")
@XmlType(name = "FAPService.CellConfig.LTE")
@XmlAccessorType(XmlAccessType.FIELD)
public class LTE {

	/**
	 * This object contains a table of all tunnel instances configured for the LTE FAP.
	 */
	@XmlElementWrapper(name = "Tunnels")
	@XmlElement(name = "Tunnel")
	@CWMPParameter(access = "readWrite")
	public Collection<Tunnel> tunnels;
	/**
	 * This object contains parameters relating to configuring LTE EPC.
	 */
	@XmlElement(name = "EPC")
	public EPC epc;
	/**
	 * This object contains parameters relating to the LTE RAN level configuration.
	 */
	@XmlElement(name = "RAN")
	public RAN ran;
	/**
	 * This object provides for the managment of energy savings capabilities in the HeNB.
	 */
	@XmlElement(name = "EnergySavings")
	public EnergySavings energySavings;

	public LTE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains a table of all tunnel instances configured for the LTE FAP.
	 *
	 * @return the value
	 */
	public Collection<Tunnel> getTunnels() {
		if (this.tunnels == null){ this.tunnels=new ArrayList<>();}
		return tunnels;
	}

	/**
	 * Set the this object contains a table of all tunnel instances configured for the LTE FAP.
	 *
	 * @param tunnels the input value
	 */
	public void  setTunnels(Collection<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}

	/**
	 * Set the this object contains a table of all tunnel instances configured for the LTE FAP.
	 *
	 * @param tunnel the input value
	 * @return this instance
	 */
	public LTE withTunnel(Tunnel tunnel) {
		getTunnels().add(tunnel);
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring LTE EPC.
	 *
	 * @return the value
	 */
	public EPC getEpc() {
		return epc;
	}

	/**
	 * Set the this object contains parameters relating to configuring LTE EPC.
	 *
	 * @param epc the input value
	 */
	public void  setEpc(EPC epc) {
		this.epc = epc;
	}

	/**
	 * Set the this object contains parameters relating to configuring LTE EPC.
	 *
	 * @param epc the input value
	 * @return this instance
	 */
	public LTE withEpc(EPC epc) {
		this.epc = epc;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the LTE RAN level configuration.
	 *
	 * @return the value
	 */
	public RAN getRan() {
		return ran;
	}

	/**
	 * Set the this object contains parameters relating to the LTE RAN level configuration.
	 *
	 * @param ran the input value
	 */
	public void  setRan(RAN ran) {
		this.ran = ran;
	}

	/**
	 * Set the this object contains parameters relating to the LTE RAN level configuration.
	 *
	 * @param ran the input value
	 * @return this instance
	 */
	public LTE withRan(RAN ran) {
		this.ran = ran;
		return this;
	}

	/**
	 * Get the this object provides for the managment of energy savings capabilities in the HeNB.
	 *
	 * @return the value
	 */
	public EnergySavings getEnergySavings() {
		return energySavings;
	}

	/**
	 * Set the this object provides for the managment of energy savings capabilities in the HeNB.
	 *
	 * @param energySavings the input value
	 */
	public void  setEnergySavings(EnergySavings energySavings) {
		this.energySavings = energySavings;
	}

	/**
	 * Set the this object provides for the managment of energy savings capabilities in the HeNB.
	 *
	 * @param energySavings the input value
	 * @return this instance
	 */
	public LTE withEnergySavings(EnergySavings energySavings) {
		this.energySavings = energySavings;
		return this;
	}

	//</editor-fold>

}