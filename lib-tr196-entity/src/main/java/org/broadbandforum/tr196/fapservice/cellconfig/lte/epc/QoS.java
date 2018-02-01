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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.epc;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * This object contains parameters relating to configuring QoS in LTE EPC.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EPC.QoS.{i}.")
public class QoS {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * QoS class identity as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QCI")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 20)
	public Long qci = 1L;
	/**
	 * Defines the type of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type = "Non-GBR";
	/**
	 * Priority of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 20)
	public Long priority = 1L;
	/**
	 * Defines the Packet delay budget, specified in milliseconds, as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketDelayBudget")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 2000, max = 2000)
	public Long packetDelayBudget = 50L;

	public QoS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public QoS withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public QoS withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the qos class identity as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQci() {
		return qci;
	}

	/**
	 * Set the qos class identity as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param qci the input value
	 */
	public void  setQci(Long qci) {
		this.qci = qci;
	}

	/**
	 * Set the qos class identity as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param qci the input value
	 * @return this instance
	 */
	public QoS withQci(Long qci) {
		this.qci = qci;
		return this;
	}

	/**
	 * Get the defines the type of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the defines the type of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the defines the type of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public QoS withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the priority of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of the QoS class as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public QoS withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the defines the Packet delay budget, specified in milliseconds, as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketDelayBudget() {
		return packetDelayBudget;
	}

	/**
	 * Set the defines the Packet delay budget, specified in milliseconds, as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param packetDelayBudget the input value
	 */
	public void  setPacketDelayBudget(Long packetDelayBudget) {
		this.packetDelayBudget = packetDelayBudget;
	}

	/**
	 * Set the defines the Packet delay budget, specified in milliseconds, as defined in {{bibref|3GPP-TS.23.203|Section 6.1.7.2}}.
	 *
	 * @since 2.0
	 * @param packetDelayBudget the input value
	 * @return this instance
	 */
	public QoS withPacketDelayBudget(Long packetDelayBudget) {
		this.packetDelayBudget = packetDelayBudget;
		return this;
	}

	//</editor-fold>

}