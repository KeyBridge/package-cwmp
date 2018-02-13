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
package org.broadbandforum.tr196.fapservice.cellconfig.lte;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * This object contains a table of all tunnel instances configured for the LTE FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.Tunnel.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.Tunnel")
@XmlType(name = "FAPService.CellConfig.LTE.Tunnel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tunnel {

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
	 * This is the reference to an IPsec tunnel instance used by the LTE FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TunnelRef")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tunnelRef;
	/**
	 * {{list}} Optional list of PLMM IDs associated with the tunnel, which can be used for selecting the tunnel.

Each PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.  Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> plmNID;

	public Tunnel() {
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
	public Tunnel withEnable(Boolean enable) {
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
	public Tunnel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this is the reference to an IPsec tunnel instance used by the LTE FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTunnelRef() {
		return tunnelRef;
	}

	/**
	 * Set the this is the reference to an IPsec tunnel instance used by the LTE FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @param tunnelRef the input value
	 */
	public void  setTunnelRef(String tunnelRef) {
		this.tunnelRef = tunnelRef;
	}

	/**
	 * Set the this is the reference to an IPsec tunnel instance used by the LTE FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @param tunnelRef the input value
	 * @return this instance
	 */
	public Tunnel withTunnelRef(String tunnelRef) {
		this.tunnelRef = tunnelRef;
		return this;
	}

	/**
	 * Get the {{list}} Optional list of PLMM IDs associated with the tunnel, which can be used for selecting the tunnel.

Each PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.  Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPlmNID() {
		if (this.plmNID == null){ this.plmNID=new ArrayList<>();}
		return plmNID;
	}

	/**
	 * Set the {{list}} Optional list of PLMM IDs associated with the tunnel, which can be used for selecting the tunnel.

Each PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.  Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 */
	public void  setPlmNID(Collection<String> plmNID) {
		this.plmNID = plmNID;
	}

	/**
	 * Set the {{list}} Optional list of PLMM IDs associated with the tunnel, which can be used for selecting the tunnel.

Each PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.  Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Tunnel withPlmNID(String string) {
		getPlmNID().add(string);
		return this;
	}

	//</editor-fold>

}