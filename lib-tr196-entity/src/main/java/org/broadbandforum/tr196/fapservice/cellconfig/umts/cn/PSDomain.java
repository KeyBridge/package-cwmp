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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.psdomain.RAB;

	/**
	 * This object contains parameters relating to configuring the PS domain of the UMTS CN.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.PSDomain.")
@XmlRootElement(name = "PSDomain")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.PSDomain")
@XmlAccessorType(XmlAccessType.FIELD)
public class PSDomain {

	/**
	 * Network Mode of Operation of the CN. {{bibref|3GPP-TS.23.060}} {{bibref|3GPP-TS.24.008}}

If {{true}} (Network Mode of Operation II) Combined procedures between CS and PS domain are not supported (i.e. Gs interface is not present).

If {{false}} (Network Mode of Operation I) Combined procedures between CS and PS domain are supported (i.e. Gs interface is present).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkModeOperationCombined")
	@CWMPParameter(access = "readWrite")
	public Boolean networkModeOperationCombined;
	/**
	 * This object provides monitoring of the Packet Switch RAB in the HNB.
	 */
	@XmlElement(name = "RAB")
	public RAB rab;

	public PSDomain() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the network Mode of Operation of the CN. {{bibref|3GPP-TS.23.060}} {{bibref|3GPP-TS.24.008}}

If {{true}} (Network Mode of Operation II) Combined procedures between CS and PS domain are not supported (i.e. Gs interface is not present).

If {{false}} (Network Mode of Operation I) Combined procedures between CS and PS domain are supported (i.e. Gs interface is present).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNetworkModeOperationCombined() {
		return networkModeOperationCombined;
	}

	/**
	 * Set the network Mode of Operation of the CN. {{bibref|3GPP-TS.23.060}} {{bibref|3GPP-TS.24.008}}

If {{true}} (Network Mode of Operation II) Combined procedures between CS and PS domain are not supported (i.e. Gs interface is not present).

If {{false}} (Network Mode of Operation I) Combined procedures between CS and PS domain are supported (i.e. Gs interface is present).
	 *
	 * @since 2.0
	 * @param networkModeOperationCombined the input value
	 */
	public void  setNetworkModeOperationCombined(Boolean networkModeOperationCombined) {
		this.networkModeOperationCombined = networkModeOperationCombined;
	}

	/**
	 * Set the network Mode of Operation of the CN. {{bibref|3GPP-TS.23.060}} {{bibref|3GPP-TS.24.008}}

If {{true}} (Network Mode of Operation II) Combined procedures between CS and PS domain are not supported (i.e. Gs interface is not present).

If {{false}} (Network Mode of Operation I) Combined procedures between CS and PS domain are supported (i.e. Gs interface is present).
	 *
	 * @since 2.0
	 * @param networkModeOperationCombined the input value
	 * @return this instance
	 */
	public PSDomain withNetworkModeOperationCombined(Boolean networkModeOperationCombined) {
		this.networkModeOperationCombined = networkModeOperationCombined;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the Packet Switch RAB in the HNB.
	 *
	 * @return the value
	 */
	public RAB getRab() {
		return rab;
	}

	/**
	 * Set the this object provides monitoring of the Packet Switch RAB in the HNB.
	 *
	 * @param rab the input value
	 */
	public void  setRab(RAB rab) {
		this.rab = rab;
	}

	/**
	 * Set the this object provides monitoring of the Packet Switch RAB in the HNB.
	 *
	 * @param rab the input value
	 * @return this instance
	 */
	public PSDomain withRab(RAB rab) {
		this.rab = rab;
		return this;
	}

	//</editor-fold>

}