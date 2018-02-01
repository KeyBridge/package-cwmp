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
package org.broadbandforum.tr196.fapservice.cellconfig.umts;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.CSG;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.CellRestriction;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.CellSelection;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.DRX;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.InterFreqMeas;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.InterRATMeas;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.IntraFreqMeas;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.NeighborList;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.NeighborListInUse;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.PowerControl;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.RF;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.RRC;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.RRCTimers;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.UEInternalMeas;

	/**
	 * This object contains parameters relating to the RAN-level configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.")
public class RAN {

	/**
	 * {{list}} Each item is a URA (UTRAN Registration Area) to which the FAP belongs.

The order of the URA values has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URAList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long uraList;
	/**
	 * The URA being used by the FAP.

Self-configuration for URA is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for URA is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|URAList}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first URA value in {{param|URAList}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URAInUse")
	@Size(max = 65535)
	public Long uraInUse;
	/**
	 * RNC-ID allocated to the FAP. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RNCID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long rncID;
	/**
	 * Cell Identity. {{bibref|3GPP-TS.25.401|Section 6.1.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 268435455)
	public Long cellID;
	/**
	 * Guard period in seconds before sending a "RANAP:RESET ACKNOWLEDGE" message towards the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRatC")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long tratC;
	/**
	 * Maximum amount of time in seconds that the FAP SHOULD wait for receiving a "RANAP:RESET ACKNOWLEDGE" message from the Femto GW after sending a Reset to the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRafC")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long trafC;
	/**
	 * Maximum number for RESET procedure that can be repeated in FAP. {{bibref|3GPP-TS.25.413|Section 8.26.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NRafC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long nrafC;
	/**
	 * Amount of time in seconds used to determine when the additional level of traffic reduction in CN overload SHOULD take place. While this timer is running all OVERLOAD messages or signalling pointing to congested information received by the FAP are ignored. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TigOR")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long tigOR;
	/**
	 * Amount of time in seconds used to determine when the CN overload can be considered cleared. While this timer is running, the FAP is not allowed to increase traffic. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TinTR")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long tinTR;
	/**
	 * Maximum amount of time in seconds for Data Forwarding at FAP. Timer is started when a "RANAP:SRNS Data Forward Command" message (or a "RANAP:Relocation Command" message) is received. At timer expiry the "SRNS Data Forwarding" procedure is completed. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TDataFwd")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long tdataFwd;
	/**
	 * Maximum amount of time in seconds for the Relocation Preparation procedure. Timer is started when a "RANAP:Relocation Required" message is sent. Timer is stopped when a "RANAP:Relocation Command" or a "RANAP:Relocation Preparation Failure" message is received. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRelocPrep")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long trelocPrep;
	/**
	 * Maximum amount of time in seconds for protection of the overall Relocation procedure. Timer is started when a "RANAP:Relocation Command" message is received. Timer is stopped when a "RANAP:Iu Release Command" is received or the relocation procedure is cancelled. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRelocOverall")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long trelocOverall;
	/**
	 * The "realm" portion of the HNB-ID where HNB-ID is defined in {{bibref|3GPP-TS.25.469}} and is shown as follows:

0<IMSI>@<realm>

Or

1<OUI>-<SerialNumber>@<realm>

The other identifiers before "@" are device dependent values. Both <OUI> and <SerialNumber> are defined in {{bibref|TR-069a2|Table 36}}.

<IMSI> is obtained from the USIM if it is equipped in the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HNBIDRealm")
	@CWMPParameter(access = "readWrite")
	@Size(max = 182)
	public String hnbIDRealm;
	/**
	 * Enables/disables the HSDPA function in the FAP.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is disabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HSFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean hsflag;
	/**
	 * Enables or disables HSDPA in the cell.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is not enabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{param|HSFlag}} is {{false}} then this value MUST be {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HSEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean hsenable;
	/**
	 * The number of codes at the defined spreading factor (SF=16), within the complete code tree. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumOfHSPDSCHs")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long numOfHSPDSCHs;
	/**
	 * The number of HS-SCCHs for one cell. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumOfHSSCCHs")
	@CWMPParameter(access = "readWrite")
	public Long numOfHSSCCHs;
	/**
	 * This object contains parameters relating to the Closed Subscriber Group (CSG).
	 */
	@XmlElement(name = "CSG")
	public CSG csg;
	/**
	 * This object contains parameters related to cell selection and reselection.
	 */
	@XmlElement(name = "CellSelection")
	public CellSelection cellSelection;
	/**
	 * This object contains parameters related to miscellaneous RRC timers and constants.
	 */
	@XmlElement(name = "RRCTimers")
	public RRCTimers rrcTimers;
	/**
	 * This object contains parameters related to DRX parameters.
	 */
	@XmlElement(name = "DRX")
	public DRX drx;
	/**
	 * This object contains parameters related to power control and RACH.
	 */
	@XmlElement(name = "PowerControl")
	public PowerControl powerControl;
	/**
	 * This object contains parameters related to cell access restriction.
	 */
	@XmlElement(name = "CellRestriction")
	public CellRestriction cellRestriction;
	/**
	 * This object contains parameters relating to the intra-freq HO control parameters.
	 */
	@XmlElement(name = "IntraFreqMeas")
	public IntraFreqMeas intraFreqMeas;
	/**
	 * This object contains parameters relating to the inter-freq HO related control parameters.
	 */
	@XmlElement(name = "InterFreqMeas")
	public InterFreqMeas interFreqMeas;
	/**
	 * This object contains parameters relating to the inter-RAT HO related control parameters. This is specifically for GERAN system.
	 */
	@XmlElement(name = "InterRATMeas")
	public InterRATMeas interRATMeas;
	/**
	 * This object contains parameters relating to the UE internal measurement control parameters.
	 */
	@XmlElement(name = "UEInternalMeas")
	public UEInternalMeas ueinternalMeas;
	/**
	 * This object contains parameters relating to the RF configuration.
	 */
	@XmlElement(name = "RF")
	public RF rf;
	/**
	 * This object contains parameters relating to the neighbor list.
	 */
	@XmlElement(name = "NeighborList")
	public NeighborList neighborList;
	/**
	 * This object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and excluding cells.
	 */
	@XmlElement(name = "NeighborListInUse")
	public NeighborListInUse neighborListInUse;
	/**
	 * This object provides monitoring of the RRC in the HNB.
	 */
	@XmlElement(name = "RRC")
	public RRC rrc;

	public RAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a URA (UTRAN Registration Area) to which the FAP belongs.

The order of the URA values has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUraList() {
		return uraList;
	}

	/**
	 * Set the {{list}} Each item is a URA (UTRAN Registration Area) to which the FAP belongs.

The order of the URA values has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @param uraList the input value
	 */
	public void  setUraList(Long uraList) {
		this.uraList = uraList;
	}

	/**
	 * Set the {{list}} Each item is a URA (UTRAN Registration Area) to which the FAP belongs.

The order of the URA values has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @param uraList the input value
	 * @return this instance
	 */
	public RAN withUraList(Long uraList) {
		this.uraList = uraList;
		return this;
	}

	/**
	 * Get the URA being used by the FAP.

Self-configuration for URA is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for URA is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|URAList}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first URA value in {{param|URAList}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUraInUse() {
		return uraInUse;
	}

	/**
	 * Set the URA being used by the FAP.

Self-configuration for URA is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for URA is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|URAList}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first URA value in {{param|URAList}}.
	 *
	 * @since 2.0
	 * @param uraInUse the input value
	 */
	public void  setUraInUse(Long uraInUse) {
		this.uraInUse = uraInUse;
	}

	/**
	 * Set the URA being used by the FAP.

Self-configuration for URA is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for URA is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|URAList}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first URA value in {{param|URAList}}.
	 *
	 * @since 2.0
	 * @param uraInUse the input value
	 * @return this instance
	 */
	public RAN withUraInUse(Long uraInUse) {
		this.uraInUse = uraInUse;
		return this;
	}

	/**
	 * Get the rnc-ID allocated to the FAP. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRncID() {
		return rncID;
	}

	/**
	 * Set the rnc-ID allocated to the FAP. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @param rncID the input value
	 */
	public void  setRncID(Long rncID) {
		this.rncID = rncID;
	}

	/**
	 * Set the rnc-ID allocated to the FAP. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @param rncID the input value
	 * @return this instance
	 */
	public RAN withRncID(Long rncID) {
		this.rncID = rncID;
		return this;
	}

	/**
	 * Get the cell Identity. {{bibref|3GPP-TS.25.401|Section 6.1.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellID() {
		return cellID;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.25.401|Section 6.1.5}}
	 *
	 * @since 2.0
	 * @param cellID the input value
	 */
	public void  setCellID(Long cellID) {
		this.cellID = cellID;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.25.401|Section 6.1.5}}
	 *
	 * @since 2.0
	 * @param cellID the input value
	 * @return this instance
	 */
	public RAN withCellID(Long cellID) {
		this.cellID = cellID;
		return this;
	}

	/**
	 * Get the guard period in seconds before sending a "RANAP:RESET ACKNOWLEDGE" message towards the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTratC() {
		return tratC;
	}

	/**
	 * Set the guard period in seconds before sending a "RANAP:RESET ACKNOWLEDGE" message towards the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tratC the input value
	 */
	public void  setTratC(Long tratC) {
		this.tratC = tratC;
	}

	/**
	 * Set the guard period in seconds before sending a "RANAP:RESET ACKNOWLEDGE" message towards the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tratC the input value
	 * @return this instance
	 */
	public RAN withTratC(Long tratC) {
		this.tratC = tratC;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds that the FAP SHOULD wait for receiving a "RANAP:RESET ACKNOWLEDGE" message from the Femto GW after sending a Reset to the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrafC() {
		return trafC;
	}

	/**
	 * Set the maximum amount of time in seconds that the FAP SHOULD wait for receiving a "RANAP:RESET ACKNOWLEDGE" message from the Femto GW after sending a Reset to the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trafC the input value
	 */
	public void  setTrafC(Long trafC) {
		this.trafC = trafC;
	}

	/**
	 * Set the maximum amount of time in seconds that the FAP SHOULD wait for receiving a "RANAP:RESET ACKNOWLEDGE" message from the Femto GW after sending a Reset to the Femto GW. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trafC the input value
	 * @return this instance
	 */
	public RAN withTrafC(Long trafC) {
		this.trafC = trafC;
		return this;
	}

	/**
	 * Get the maximum number for RESET procedure that can be repeated in FAP. {{bibref|3GPP-TS.25.413|Section 8.26.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNrafC() {
		return nrafC;
	}

	/**
	 * Set the maximum number for RESET procedure that can be repeated in FAP. {{bibref|3GPP-TS.25.413|Section 8.26.3.2}}
	 *
	 * @since 2.0
	 * @param nrafC the input value
	 */
	public void  setNrafC(Long nrafC) {
		this.nrafC = nrafC;
	}

	/**
	 * Set the maximum number for RESET procedure that can be repeated in FAP. {{bibref|3GPP-TS.25.413|Section 8.26.3.2}}
	 *
	 * @since 2.0
	 * @param nrafC the input value
	 * @return this instance
	 */
	public RAN withNrafC(Long nrafC) {
		this.nrafC = nrafC;
		return this;
	}

	/**
	 * Get amount of time in seconds used to determine when the additional level of traffic reduction in CN overload SHOULD take place. While this timer is running all OVERLOAD messages or signalling pointing to congested information received by the FAP are ignored. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTigOR() {
		return tigOR;
	}

	/**
	 * Set amount of time in seconds used to determine when the additional level of traffic reduction in CN overload SHOULD take place. While this timer is running all OVERLOAD messages or signalling pointing to congested information received by the FAP are ignored. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tigOR the input value
	 */
	public void  setTigOR(Long tigOR) {
		this.tigOR = tigOR;
	}

	/**
	 * Set amount of time in seconds used to determine when the additional level of traffic reduction in CN overload SHOULD take place. While this timer is running all OVERLOAD messages or signalling pointing to congested information received by the FAP are ignored. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tigOR the input value
	 * @return this instance
	 */
	public RAN withTigOR(Long tigOR) {
		this.tigOR = tigOR;
		return this;
	}

	/**
	 * Get amount of time in seconds used to determine when the CN overload can be considered cleared. While this timer is running, the FAP is not allowed to increase traffic. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTinTR() {
		return tinTR;
	}

	/**
	 * Set amount of time in seconds used to determine when the CN overload can be considered cleared. While this timer is running, the FAP is not allowed to increase traffic. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tinTR the input value
	 */
	public void  setTinTR(Long tinTR) {
		this.tinTR = tinTR;
	}

	/**
	 * Set amount of time in seconds used to determine when the CN overload can be considered cleared. While this timer is running, the FAP is not allowed to increase traffic. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tinTR the input value
	 * @return this instance
	 */
	public RAN withTinTR(Long tinTR) {
		this.tinTR = tinTR;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds for Data Forwarding at FAP. Timer is started when a "RANAP:SRNS Data Forward Command" message (or a "RANAP:Relocation Command" message) is received. At timer expiry the "SRNS Data Forwarding" procedure is completed. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTdataFwd() {
		return tdataFwd;
	}

	/**
	 * Set the maximum amount of time in seconds for Data Forwarding at FAP. Timer is started when a "RANAP:SRNS Data Forward Command" message (or a "RANAP:Relocation Command" message) is received. At timer expiry the "SRNS Data Forwarding" procedure is completed. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tdataFwd the input value
	 */
	public void  setTdataFwd(Long tdataFwd) {
		this.tdataFwd = tdataFwd;
	}

	/**
	 * Set the maximum amount of time in seconds for Data Forwarding at FAP. Timer is started when a "RANAP:SRNS Data Forward Command" message (or a "RANAP:Relocation Command" message) is received. At timer expiry the "SRNS Data Forwarding" procedure is completed. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param tdataFwd the input value
	 * @return this instance
	 */
	public RAN withTdataFwd(Long tdataFwd) {
		this.tdataFwd = tdataFwd;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds for the Relocation Preparation procedure. Timer is started when a "RANAP:Relocation Required" message is sent. Timer is stopped when a "RANAP:Relocation Command" or a "RANAP:Relocation Preparation Failure" message is received. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrelocPrep() {
		return trelocPrep;
	}

	/**
	 * Set the maximum amount of time in seconds for the Relocation Preparation procedure. Timer is started when a "RANAP:Relocation Required" message is sent. Timer is stopped when a "RANAP:Relocation Command" or a "RANAP:Relocation Preparation Failure" message is received. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trelocPrep the input value
	 */
	public void  setTrelocPrep(Long trelocPrep) {
		this.trelocPrep = trelocPrep;
	}

	/**
	 * Set the maximum amount of time in seconds for the Relocation Preparation procedure. Timer is started when a "RANAP:Relocation Required" message is sent. Timer is stopped when a "RANAP:Relocation Command" or a "RANAP:Relocation Preparation Failure" message is received. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trelocPrep the input value
	 * @return this instance
	 */
	public RAN withTrelocPrep(Long trelocPrep) {
		this.trelocPrep = trelocPrep;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds for protection of the overall Relocation procedure. Timer is started when a "RANAP:Relocation Command" message is received. Timer is stopped when a "RANAP:Iu Release Command" is received or the relocation procedure is cancelled. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrelocOverall() {
		return trelocOverall;
	}

	/**
	 * Set the maximum amount of time in seconds for protection of the overall Relocation procedure. Timer is started when a "RANAP:Relocation Command" message is received. Timer is stopped when a "RANAP:Iu Release Command" is received or the relocation procedure is cancelled. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trelocOverall the input value
	 */
	public void  setTrelocOverall(Long trelocOverall) {
		this.trelocOverall = trelocOverall;
	}

	/**
	 * Set the maximum amount of time in seconds for protection of the overall Relocation procedure. Timer is started when a "RANAP:Relocation Command" message is received. Timer is stopped when a "RANAP:Iu Release Command" is received or the relocation procedure is cancelled. {{bibref|3GPP-TS.25.413|Section 9.5}}
	 *
	 * @since 2.0
	 * @param trelocOverall the input value
	 * @return this instance
	 */
	public RAN withTrelocOverall(Long trelocOverall) {
		this.trelocOverall = trelocOverall;
		return this;
	}

	/**
	 * Get the "realm" portion of the HNB-ID where HNB-ID is defined in {{bibref|3GPP-TS.25.469}} and is shown as follows:

0<IMSI>@<realm>

Or

1<OUI>-<SerialNumber>@<realm>

The other identifiers before "@" are device dependent values. Both <OUI> and <SerialNumber> are defined in {{bibref|TR-069a2|Table 36}}.

<IMSI> is obtained from the USIM if it is equipped in the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHnbIDRealm() {
		return hnbIDRealm;
	}

	/**
	 * Set the "realm" portion of the HNB-ID where HNB-ID is defined in {{bibref|3GPP-TS.25.469}} and is shown as follows:

0<IMSI>@<realm>

Or

1<OUI>-<SerialNumber>@<realm>

The other identifiers before "@" are device dependent values. Both <OUI> and <SerialNumber> are defined in {{bibref|TR-069a2|Table 36}}.

<IMSI> is obtained from the USIM if it is equipped in the FAP.
	 *
	 * @since 2.0
	 * @param hnbIDRealm the input value
	 */
	public void  setHnbIDRealm(String hnbIDRealm) {
		this.hnbIDRealm = hnbIDRealm;
	}

	/**
	 * Set the "realm" portion of the HNB-ID where HNB-ID is defined in {{bibref|3GPP-TS.25.469}} and is shown as follows:

0<IMSI>@<realm>

Or

1<OUI>-<SerialNumber>@<realm>

The other identifiers before "@" are device dependent values. Both <OUI> and <SerialNumber> are defined in {{bibref|TR-069a2|Table 36}}.

<IMSI> is obtained from the USIM if it is equipped in the FAP.
	 *
	 * @since 2.0
	 * @param hnbIDRealm the input value
	 * @return this instance
	 */
	public RAN withHnbIDRealm(String hnbIDRealm) {
		this.hnbIDRealm = hnbIDRealm;
		return this;
	}

	/**
	 * Get the enables/disables the HSDPA function in the FAP.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is disabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHsflag() {
		return hsflag;
	}

	/**
	 * Set the enables/disables the HSDPA function in the FAP.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is disabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})
	 *
	 * @since 2.0
	 * @param hsflag the input value
	 */
	public void  setHsflag(Boolean hsflag) {
		this.hsflag = hsflag;
	}

	/**
	 * Set the enables/disables the HSDPA function in the FAP.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is disabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})
	 *
	 * @since 2.0
	 * @param hsflag the input value
	 * @return this instance
	 */
	public RAN withHsflag(Boolean hsflag) {
		this.hsflag = hsflag;
		return this;
	}

	/**
	 * Get the enables or disables HSDPA in the cell.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is not enabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{param|HSFlag}} is {{false}} then this value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHsenable() {
		return hsenable;
	}

	/**
	 * Set the enables or disables HSDPA in the cell.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is not enabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{param|HSFlag}} is {{false}} then this value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param hsenable the input value
	 */
	public void  setHsenable(Boolean hsenable) {
		this.hsenable = hsenable;
	}

	/**
	 * Set the enables or disables HSDPA in the cell.

If {{true}} HSDPA is enabled (this is equivalent to a "1" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{false}} HSDPA is not enabled (this is equivalent to a "0" in {{bibref|3GPP-TS.32.642|Section 6.3.9}})

If {{param|HSFlag}} is {{false}} then this value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param hsenable the input value
	 * @return this instance
	 */
	public RAN withHsenable(Boolean hsenable) {
		this.hsenable = hsenable;
		return this;
	}

	/**
	 * Get the number of codes at the defined spreading factor (SF=16), within the complete code tree. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumOfHSPDSCHs() {
		return numOfHSPDSCHs;
	}

	/**
	 * Set the number of codes at the defined spreading factor (SF=16), within the complete code tree. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @param numOfHSPDSCHs the input value
	 */
	public void  setNumOfHSPDSCHs(Long numOfHSPDSCHs) {
		this.numOfHSPDSCHs = numOfHSPDSCHs;
	}

	/**
	 * Set the number of codes at the defined spreading factor (SF=16), within the complete code tree. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @param numOfHSPDSCHs the input value
	 * @return this instance
	 */
	public RAN withNumOfHSPDSCHs(Long numOfHSPDSCHs) {
		this.numOfHSPDSCHs = numOfHSPDSCHs;
		return this;
	}

	/**
	 * Get the number of HS-SCCHs for one cell. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumOfHSSCCHs() {
		return numOfHSSCCHs;
	}

	/**
	 * Set the number of HS-SCCHs for one cell. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @param numOfHSSCCHs the input value
	 */
	public void  setNumOfHSSCCHs(Long numOfHSSCCHs) {
		this.numOfHSSCCHs = numOfHSSCCHs;
	}

	/**
	 * Set the number of HS-SCCHs for one cell. {{bibref|3GPP-TS.32.642|Section 6.3.9}}
	 *
	 * @since 2.0
	 * @param numOfHSSCCHs the input value
	 * @return this instance
	 */
	public RAN withNumOfHSSCCHs(Long numOfHSSCCHs) {
		this.numOfHSSCCHs = numOfHSSCCHs;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the Closed Subscriber Group (CSG).
	 *
	 * @return the value
	 */
	public CSG getCsg() {
		return csg;
	}

	/**
	 * Set the this object contains parameters relating to the Closed Subscriber Group (CSG).
	 *
	 * @param csg the input value
	 */
	public void  setCsg(CSG csg) {
		this.csg = csg;
	}

	/**
	 * Set the this object contains parameters relating to the Closed Subscriber Group (CSG).
	 *
	 * @param csg the input value
	 * @return this instance
	 */
	public RAN withCsg(CSG csg) {
		this.csg = csg;
		return this;
	}

	/**
	 * Get the this object contains parameters related to cell selection and reselection.
	 *
	 * @return the value
	 */
	public CellSelection getCellSelection() {
		return cellSelection;
	}

	/**
	 * Set the this object contains parameters related to cell selection and reselection.
	 *
	 * @param cellSelection the input value
	 */
	public void  setCellSelection(CellSelection cellSelection) {
		this.cellSelection = cellSelection;
	}

	/**
	 * Set the this object contains parameters related to cell selection and reselection.
	 *
	 * @param cellSelection the input value
	 * @return this instance
	 */
	public RAN withCellSelection(CellSelection cellSelection) {
		this.cellSelection = cellSelection;
		return this;
	}

	/**
	 * Get the this object contains parameters related to miscellaneous RRC timers and constants.
	 *
	 * @return the value
	 */
	public RRCTimers getRrcTimers() {
		return rrcTimers;
	}

	/**
	 * Set the this object contains parameters related to miscellaneous RRC timers and constants.
	 *
	 * @param rrcTimers the input value
	 */
	public void  setRrcTimers(RRCTimers rrcTimers) {
		this.rrcTimers = rrcTimers;
	}

	/**
	 * Set the this object contains parameters related to miscellaneous RRC timers and constants.
	 *
	 * @param rrcTimers the input value
	 * @return this instance
	 */
	public RAN withRrcTimers(RRCTimers rrcTimers) {
		this.rrcTimers = rrcTimers;
		return this;
	}

	/**
	 * Get the this object contains parameters related to DRX parameters.
	 *
	 * @return the value
	 */
	public DRX getDrx() {
		return drx;
	}

	/**
	 * Set the this object contains parameters related to DRX parameters.
	 *
	 * @param drx the input value
	 */
	public void  setDrx(DRX drx) {
		this.drx = drx;
	}

	/**
	 * Set the this object contains parameters related to DRX parameters.
	 *
	 * @param drx the input value
	 * @return this instance
	 */
	public RAN withDrx(DRX drx) {
		this.drx = drx;
		return this;
	}

	/**
	 * Get the this object contains parameters related to power control and RACH.
	 *
	 * @return the value
	 */
	public PowerControl getPowerControl() {
		return powerControl;
	}

	/**
	 * Set the this object contains parameters related to power control and RACH.
	 *
	 * @param powerControl the input value
	 */
	public void  setPowerControl(PowerControl powerControl) {
		this.powerControl = powerControl;
	}

	/**
	 * Set the this object contains parameters related to power control and RACH.
	 *
	 * @param powerControl the input value
	 * @return this instance
	 */
	public RAN withPowerControl(PowerControl powerControl) {
		this.powerControl = powerControl;
		return this;
	}

	/**
	 * Get the this object contains parameters related to cell access restriction.
	 *
	 * @return the value
	 */
	public CellRestriction getCellRestriction() {
		return cellRestriction;
	}

	/**
	 * Set the this object contains parameters related to cell access restriction.
	 *
	 * @param cellRestriction the input value
	 */
	public void  setCellRestriction(CellRestriction cellRestriction) {
		this.cellRestriction = cellRestriction;
	}

	/**
	 * Set the this object contains parameters related to cell access restriction.
	 *
	 * @param cellRestriction the input value
	 * @return this instance
	 */
	public RAN withCellRestriction(CellRestriction cellRestriction) {
		this.cellRestriction = cellRestriction;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the intra-freq HO control parameters.
	 *
	 * @return the value
	 */
	public IntraFreqMeas getIntraFreqMeas() {
		return intraFreqMeas;
	}

	/**
	 * Set the this object contains parameters relating to the intra-freq HO control parameters.
	 *
	 * @param intraFreqMeas the input value
	 */
	public void  setIntraFreqMeas(IntraFreqMeas intraFreqMeas) {
		this.intraFreqMeas = intraFreqMeas;
	}

	/**
	 * Set the this object contains parameters relating to the intra-freq HO control parameters.
	 *
	 * @param intraFreqMeas the input value
	 * @return this instance
	 */
	public RAN withIntraFreqMeas(IntraFreqMeas intraFreqMeas) {
		this.intraFreqMeas = intraFreqMeas;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the inter-freq HO related control parameters.
	 *
	 * @return the value
	 */
	public InterFreqMeas getInterFreqMeas() {
		return interFreqMeas;
	}

	/**
	 * Set the this object contains parameters relating to the inter-freq HO related control parameters.
	 *
	 * @param interFreqMeas the input value
	 */
	public void  setInterFreqMeas(InterFreqMeas interFreqMeas) {
		this.interFreqMeas = interFreqMeas;
	}

	/**
	 * Set the this object contains parameters relating to the inter-freq HO related control parameters.
	 *
	 * @param interFreqMeas the input value
	 * @return this instance
	 */
	public RAN withInterFreqMeas(InterFreqMeas interFreqMeas) {
		this.interFreqMeas = interFreqMeas;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the inter-RAT HO related control parameters. This is specifically for GERAN system.
	 *
	 * @return the value
	 */
	public InterRATMeas getInterRATMeas() {
		return interRATMeas;
	}

	/**
	 * Set the this object contains parameters relating to the inter-RAT HO related control parameters. This is specifically for GERAN system.
	 *
	 * @param interRATMeas the input value
	 */
	public void  setInterRATMeas(InterRATMeas interRATMeas) {
		this.interRATMeas = interRATMeas;
	}

	/**
	 * Set the this object contains parameters relating to the inter-RAT HO related control parameters. This is specifically for GERAN system.
	 *
	 * @param interRATMeas the input value
	 * @return this instance
	 */
	public RAN withInterRATMeas(InterRATMeas interRATMeas) {
		this.interRATMeas = interRATMeas;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the UE internal measurement control parameters.
	 *
	 * @return the value
	 */
	public UEInternalMeas getUeinternalMeas() {
		return ueinternalMeas;
	}

	/**
	 * Set the this object contains parameters relating to the UE internal measurement control parameters.
	 *
	 * @param ueinternalMeas the input value
	 */
	public void  setUeinternalMeas(UEInternalMeas ueinternalMeas) {
		this.ueinternalMeas = ueinternalMeas;
	}

	/**
	 * Set the this object contains parameters relating to the UE internal measurement control parameters.
	 *
	 * @param ueinternalMeas the input value
	 * @return this instance
	 */
	public RAN withUeinternalMeas(UEInternalMeas ueinternalMeas) {
		this.ueinternalMeas = ueinternalMeas;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the RF configuration.
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the this object contains parameters relating to the RF configuration.
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the this object contains parameters relating to the RF configuration.
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public RAN withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the neighbor list.
	 *
	 * @return the value
	 */
	public NeighborList getNeighborList() {
		return neighborList;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list.
	 *
	 * @param neighborList the input value
	 */
	public void  setNeighborList(NeighborList neighborList) {
		this.neighborList = neighborList;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list.
	 *
	 * @param neighborList the input value
	 * @return this instance
	 */
	public RAN withNeighborList(NeighborList neighborList) {
		this.neighborList = neighborList;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @return the value
	 */
	public NeighborListInUse getNeighborListInUse() {
		return neighborListInUse;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @param neighborListInUse the input value
	 */
	public void  setNeighborListInUse(NeighborListInUse neighborListInUse) {
		this.neighborListInUse = neighborListInUse;
	}

	/**
	 * Set the this object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @param neighborListInUse the input value
	 * @return this instance
	 */
	public RAN withNeighborListInUse(NeighborListInUse neighborListInUse) {
		this.neighborListInUse = neighborListInUse;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the RRC in the HNB.
	 *
	 * @return the value
	 */
	public RRC getRrc() {
		return rrc;
	}

	/**
	 * Set the this object provides monitoring of the RRC in the HNB.
	 *
	 * @param rrc the input value
	 */
	public void  setRrc(RRC rrc) {
		this.rrc = rrc;
	}

	/**
	 * Set the this object provides monitoring of the RRC in the HNB.
	 *
	 * @param rrc the input value
	 * @return this instance
	 */
	public RAN withRrc(RRC rrc) {
		this.rrc = rrc;
		return this;
	}

	//</editor-fold>

}