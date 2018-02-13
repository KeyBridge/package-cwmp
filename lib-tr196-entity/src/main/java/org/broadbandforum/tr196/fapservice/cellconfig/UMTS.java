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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.CN;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.RAB;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.RAN;

	/**
	 * This object contains parameters relating to configuring UMTS system specific information.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.")
@XmlRootElement(name = "UMTS")
@XmlType(name = "FAPService.CellConfig.UMTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class UMTS {

	/**
	 * This is the reference to the IPsec tunnel instance used by the UMTS FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TunnelInstance")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tunnelInstance;
	/**
	 * This object contains parameters relating to configuring UMTS CN.
	 */
	@XmlElement(name = "CN")
	public CN cn;
	/**
	 * This object contains parameters relating to the RAN-level configuration.
	 */
	@XmlElement(name = "RAN")
	public RAN ran;
	/**
	 * This object contains parameters relating to Radio Access layers {{bibref|3GPP-TS.32.405}}
	 */
	@XmlElement(name = "RAB")
	public RAB rab;

	public UMTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this is the reference to the IPsec tunnel instance used by the UMTS FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTunnelInstance() {
		return tunnelInstance;
	}

	/**
	 * Set the this is the reference to the IPsec tunnel instance used by the UMTS FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @param tunnelInstance the input value
	 */
	public void  setTunnelInstance(String tunnelInstance) {
		this.tunnelInstance = tunnelInstance;
	}

	/**
	 * Set the this is the reference to the IPsec tunnel instance used by the UMTS FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @param tunnelInstance the input value
	 * @return this instance
	 */
	public UMTS withTunnelInstance(String tunnelInstance) {
		this.tunnelInstance = tunnelInstance;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring UMTS CN.
	 *
	 * @return the value
	 */
	public CN getCn() {
		return cn;
	}

	/**
	 * Set the this object contains parameters relating to configuring UMTS CN.
	 *
	 * @param cn the input value
	 */
	public void  setCn(CN cn) {
		this.cn = cn;
	}

	/**
	 * Set the this object contains parameters relating to configuring UMTS CN.
	 *
	 * @param cn the input value
	 * @return this instance
	 */
	public UMTS withCn(CN cn) {
		this.cn = cn;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the RAN-level configuration.
	 *
	 * @return the value
	 */
	public RAN getRan() {
		return ran;
	}

	/**
	 * Set the this object contains parameters relating to the RAN-level configuration.
	 *
	 * @param ran the input value
	 */
	public void  setRan(RAN ran) {
		this.ran = ran;
	}

	/**
	 * Set the this object contains parameters relating to the RAN-level configuration.
	 *
	 * @param ran the input value
	 * @return this instance
	 */
	public UMTS withRan(RAN ran) {
		this.ran = ran;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Radio Access layers {{bibref|3GPP-TS.32.405}}
	 *
	 * @return the value
	 */
	public RAB getRab() {
		return rab;
	}

	/**
	 * Set the this object contains parameters relating to Radio Access layers {{bibref|3GPP-TS.32.405}}
	 *
	 * @param rab the input value
	 */
	public void  setRab(RAB rab) {
		this.rab = rab;
	}

	/**
	 * Set the this object contains parameters relating to Radio Access layers {{bibref|3GPP-TS.32.405}}
	 *
	 * @param rab the input value
	 * @return this instance
	 */
	public UMTS withRab(RAB rab) {
		this.rab = rab;
		return this;
	}

	//</editor-fold>

}