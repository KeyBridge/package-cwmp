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
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.Beacon;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.HRPD;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.OneX;

	/**
	 * This object contains parameters relating to configuring the CDMA2000 FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.")
@XmlRootElement(name = "CDMA2000")
@XmlType(name = "FAPService.CellConfig.CDMA2000")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000 {

	/**
	 * This is the reference to the IPsec tunnel instance used by the CDMA2000 FAP.

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
	 * This object contains parameters relating to configuring the CDMA2000 1x FAP.
	 */
	@XmlElement(name = "OneX")
	public OneX oneX;
	/**
	 * The object contains attributes related to HRPD.
	 */
	@XmlElement(name = "HRPD")
	public HRPD hrpD;
	/**
	 * This object models the attributes to control the generalized beacon. The beacon is modeled as a beacon frame composed of multiple beacon intervals. The beacon frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD control channel frames align (occurs once every 1.28s).
	 */
	@XmlElement(name = "Beacon")
	public Beacon beacon;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this is the reference to the IPsec tunnel instance used by the CDMA2000 FAP.

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
	 * Set the this is the reference to the IPsec tunnel instance used by the CDMA2000 FAP.

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
	 * Set the this is the reference to the IPsec tunnel instance used by the CDMA2000 FAP.

For all root data models, which use the tunnel definition provided in {{bibref|TR-262}} (InternetGatewayDevice:1 {{bibref|TR-098}} and Device:1 {{bibref|TR-181i1}}) the {{param}} MUST point to a row in the 'FAP.Tunnel.IKESA.{i}.' table, defined in {{bibref|TR-262}}.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to IPsec tunnel instance defined in {{bibref|TR-181i2}}.

If the referenced object is deleted, the parameter value MUST be set to an empty string.

In case of a multiple-radio-technology FAP product, each radio technology can have its own tunnels or share common tunnels. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.
	 *
	 * @since 2.0
	 * @param tunnelInstance the input value
	 * @return this instance
	 */
	public CDMA2000 withTunnelInstance(String tunnelInstance) {
		this.tunnelInstance = tunnelInstance;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the CDMA2000 1x FAP.
	 *
	 * @return the value
	 */
	public OneX getOneX() {
		return oneX;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CDMA2000 1x FAP.
	 *
	 * @param oneX the input value
	 */
	public void  setOneX(OneX oneX) {
		this.oneX = oneX;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CDMA2000 1x FAP.
	 *
	 * @param oneX the input value
	 * @return this instance
	 */
	public CDMA2000 withOneX(OneX oneX) {
		this.oneX = oneX;
		return this;
	}

	/**
	 * Get the object contains attributes related to HRPD.
	 *
	 * @return the value
	 */
	public HRPD getHrpD() {
		return hrpD;
	}

	/**
	 * Set the object contains attributes related to HRPD.
	 *
	 * @param hrpD the input value
	 */
	public void  setHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
	}

	/**
	 * Set the object contains attributes related to HRPD.
	 *
	 * @param hrpD the input value
	 * @return this instance
	 */
	public CDMA2000 withHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
		return this;
	}

	/**
	 * Get the this object models the attributes to control the generalized beacon. The beacon is modeled as a beacon frame composed of multiple beacon intervals. The beacon frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD control channel frames align (occurs once every 1.28s).
	 *
	 * @return the value
	 */
	public Beacon getBeacon() {
		return beacon;
	}

	/**
	 * Set the this object models the attributes to control the generalized beacon. The beacon is modeled as a beacon frame composed of multiple beacon intervals. The beacon frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD control channel frames align (occurs once every 1.28s).
	 *
	 * @param beacon the input value
	 */
	public void  setBeacon(Beacon beacon) {
		this.beacon = beacon;
	}

	/**
	 * Set the this object models the attributes to control the generalized beacon. The beacon is modeled as a beacon frame composed of multiple beacon intervals. The beacon frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD control channel frames align (occurs once every 1.28s).
	 *
	 * @param beacon the input value
	 * @return this instance
	 */
	public CDMA2000 withBeacon(Beacon beacon) {
		this.beacon = beacon;
		return this;
	}

	//</editor-fold>

}