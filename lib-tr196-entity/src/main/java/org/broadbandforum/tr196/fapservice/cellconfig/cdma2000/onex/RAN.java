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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.APIDM;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.APIDTM;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.APPIM;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.AccessParameters;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.ExtendedSystemParameters;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.ForwardPwrCtr;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.HardHandoff;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.NeighborList;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.NetworkListenModeConfig;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.PowerControl;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.RF;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.SystemParameters;

	/**
	 * This object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.")
public class RAN {

	/**
	 * SID for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXSectorNID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Integer oneXSectorNID;
	/**
	 * NID for 1x . See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXSectorSID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32767)
	public Integer oneXSectorSID;
	/**
	 * packet Zone ID for 1x packet calls
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPZID")
	@CWMPParameter(access = "readWrite")
	public Integer oneXPZID;
	/**
	 * Base station ID (needed in SPM). This is also the CellID. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BaseID")
	@CWMPParameter(access = "readWrite")
	public Integer baseID;
	/**
	 * Maximum number of entries avaiable in  {{object|.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNeighborListEntries")
	public Long maxNeighborListEntries;
	/**
	 * This object contains parameters relating to RF configuration of the FAP.
	 */
	@XmlElement(name = "RF")
	public RF rf;
	/**
	 * This object contains parameters relating to self-configuration of the MaxFAPTxPower of the FAP.
	 */
	@XmlElement(name = "NetworkListenModeConfig")
	public NetworkListenModeConfig networkListenModeConfig;
	/**
	 * The object used for configuring access parameter messages for 1x. See {{bibref|3GPP2-C.S0005}}.
	 */
	@XmlElement(name = "AccessParameters")
	public AccessParameters accessParameters;
	/**
	 * The object used for configuring system parameter messages for 1x
	 */
	@XmlElement(name = "SystemParameters")
	public SystemParameters systemParameters;
	/**
	 * The object used for configuring extended system parameter messages for 1x
	 */
	@XmlElement(name = "ExtendedSystemParameters")
	public ExtendedSystemParameters extendedSystemParameters;
	/**
	 * The object used for configuring extended channel assignment  messages for 1x
	 */
	@XmlElement(name = "ForwardPwrCtr")
	public ForwardPwrCtr forwardPwrCtr;
	/**
	 * This object provides configurable parameters for 1x Handout
	 */
	@XmlElement(name = "HardHandoff")
	public HardHandoff hardHandoff;
	/**
	 * Configuration Managed Object for OTA  power control attribute.
	 */
	@XmlElement(name = "PowerControl")
	public PowerControl powerControl;
	/**
	 * This object contains information common to all neighbors of a sector. This object has only one instance.
	 */
	@XmlElementWrapper(name = "NeighborLists")
	@XmlElement(name = "NeighborList")
	@CWMPParameter(access = "readWrite")
	public Collection<NeighborList> neighborLists;
	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 */
	@XmlElement(name = "APIDM")
	public APIDM apiDM;
	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 */
	@XmlElement(name = "APIDTM")
	public APIDTM apiDTM;
	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 */
	@XmlElement(name = "APPIM")
	public APPIM appIM;

	public RAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the sid for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXSectorNID() {
		return oneXSectorNID;
	}

	/**
	 * Set the sid for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXSectorNID the input value
	 */
	public void  setOneXSectorNID(Integer oneXSectorNID) {
		this.oneXSectorNID = oneXSectorNID;
	}

	/**
	 * Set the sid for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXSectorNID the input value
	 * @return this instance
	 */
	public RAN withOneXSectorNID(Integer oneXSectorNID) {
		this.oneXSectorNID = oneXSectorNID;
		return this;
	}

	/**
	 * Get the nid for 1x . See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXSectorSID() {
		return oneXSectorSID;
	}

	/**
	 * Set the nid for 1x . See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXSectorSID the input value
	 */
	public void  setOneXSectorSID(Integer oneXSectorSID) {
		this.oneXSectorSID = oneXSectorSID;
	}

	/**
	 * Set the nid for 1x . See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param oneXSectorSID the input value
	 * @return this instance
	 */
	public RAN withOneXSectorSID(Integer oneXSectorSID) {
		this.oneXSectorSID = oneXSectorSID;
		return this;
	}

	/**
	 * Get the packet Zone ID for 1x packet calls
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPZID() {
		return oneXPZID;
	}

	/**
	 * Set the packet Zone ID for 1x packet calls
	 *
	 * @since 2.0
	 * @param oneXPZID the input value
	 */
	public void  setOneXPZID(Integer oneXPZID) {
		this.oneXPZID = oneXPZID;
	}

	/**
	 * Set the packet Zone ID for 1x packet calls
	 *
	 * @since 2.0
	 * @param oneXPZID the input value
	 * @return this instance
	 */
	public RAN withOneXPZID(Integer oneXPZID) {
		this.oneXPZID = oneXPZID;
		return this;
	}

	/**
	 * Get the base station ID (needed in SPM). This is also the CellID. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBaseID() {
		return baseID;
	}

	/**
	 * Set the base station ID (needed in SPM). This is also the CellID. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param baseID the input value
	 */
	public void  setBaseID(Integer baseID) {
		this.baseID = baseID;
	}

	/**
	 * Set the base station ID (needed in SPM). This is also the CellID. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param baseID the input value
	 * @return this instance
	 */
	public RAN withBaseID(Integer baseID) {
		this.baseID = baseID;
		return this;
	}

	/**
	 * Get the maximum number of entries avaiable in  {{object|.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNeighborListEntries() {
		return maxNeighborListEntries;
	}

	/**
	 * Set the maximum number of entries avaiable in  {{object|.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.}}.
	 *
	 * @since 2.0
	 * @param maxNeighborListEntries the input value
	 */
	public void  setMaxNeighborListEntries(Long maxNeighborListEntries) {
		this.maxNeighborListEntries = maxNeighborListEntries;
	}

	/**
	 * Set the maximum number of entries avaiable in  {{object|.CellConfig.CDMA2000.OneX.RAN.NeighborList.{i}.}}.
	 *
	 * @since 2.0
	 * @param maxNeighborListEntries the input value
	 * @return this instance
	 */
	public RAN withMaxNeighborListEntries(Long maxNeighborListEntries) {
		this.maxNeighborListEntries = maxNeighborListEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to RF configuration of the FAP.
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the this object contains parameters relating to RF configuration of the FAP.
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the this object contains parameters relating to RF configuration of the FAP.
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public RAN withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to self-configuration of the MaxFAPTxPower of the FAP.
	 *
	 * @return the value
	 */
	public NetworkListenModeConfig getNetworkListenModeConfig() {
		return networkListenModeConfig;
	}

	/**
	 * Set the this object contains parameters relating to self-configuration of the MaxFAPTxPower of the FAP.
	 *
	 * @param networkListenModeConfig the input value
	 */
	public void  setNetworkListenModeConfig(NetworkListenModeConfig networkListenModeConfig) {
		this.networkListenModeConfig = networkListenModeConfig;
	}

	/**
	 * Set the this object contains parameters relating to self-configuration of the MaxFAPTxPower of the FAP.
	 *
	 * @param networkListenModeConfig the input value
	 * @return this instance
	 */
	public RAN withNetworkListenModeConfig(NetworkListenModeConfig networkListenModeConfig) {
		this.networkListenModeConfig = networkListenModeConfig;
		return this;
	}

	/**
	 * Get the object used for configuring access parameter messages for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @return the value
	 */
	public AccessParameters getAccessParameters() {
		return accessParameters;
	}

	/**
	 * Set the object used for configuring access parameter messages for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @param accessParameters the input value
	 */
	public void  setAccessParameters(AccessParameters accessParameters) {
		this.accessParameters = accessParameters;
	}

	/**
	 * Set the object used for configuring access parameter messages for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @param accessParameters the input value
	 * @return this instance
	 */
	public RAN withAccessParameters(AccessParameters accessParameters) {
		this.accessParameters = accessParameters;
		return this;
	}

	/**
	 * Get the object used for configuring system parameter messages for 1x
	 *
	 * @return the value
	 */
	public SystemParameters getSystemParameters() {
		return systemParameters;
	}

	/**
	 * Set the object used for configuring system parameter messages for 1x
	 *
	 * @param systemParameters the input value
	 */
	public void  setSystemParameters(SystemParameters systemParameters) {
		this.systemParameters = systemParameters;
	}

	/**
	 * Set the object used for configuring system parameter messages for 1x
	 *
	 * @param systemParameters the input value
	 * @return this instance
	 */
	public RAN withSystemParameters(SystemParameters systemParameters) {
		this.systemParameters = systemParameters;
		return this;
	}

	/**
	 * Get the object used for configuring extended system parameter messages for 1x
	 *
	 * @return the value
	 */
	public ExtendedSystemParameters getExtendedSystemParameters() {
		return extendedSystemParameters;
	}

	/**
	 * Set the object used for configuring extended system parameter messages for 1x
	 *
	 * @param extendedSystemParameters the input value
	 */
	public void  setExtendedSystemParameters(ExtendedSystemParameters extendedSystemParameters) {
		this.extendedSystemParameters = extendedSystemParameters;
	}

	/**
	 * Set the object used for configuring extended system parameter messages for 1x
	 *
	 * @param extendedSystemParameters the input value
	 * @return this instance
	 */
	public RAN withExtendedSystemParameters(ExtendedSystemParameters extendedSystemParameters) {
		this.extendedSystemParameters = extendedSystemParameters;
		return this;
	}

	/**
	 * Get the object used for configuring extended channel assignment  messages for 1x
	 *
	 * @return the value
	 */
	public ForwardPwrCtr getForwardPwrCtr() {
		return forwardPwrCtr;
	}

	/**
	 * Set the object used for configuring extended channel assignment  messages for 1x
	 *
	 * @param forwardPwrCtr the input value
	 */
	public void  setForwardPwrCtr(ForwardPwrCtr forwardPwrCtr) {
		this.forwardPwrCtr = forwardPwrCtr;
	}

	/**
	 * Set the object used for configuring extended channel assignment  messages for 1x
	 *
	 * @param forwardPwrCtr the input value
	 * @return this instance
	 */
	public RAN withForwardPwrCtr(ForwardPwrCtr forwardPwrCtr) {
		this.forwardPwrCtr = forwardPwrCtr;
		return this;
	}

	/**
	 * Get the this object provides configurable parameters for 1x Handout
	 *
	 * @return the value
	 */
	public HardHandoff getHardHandoff() {
		return hardHandoff;
	}

	/**
	 * Set the this object provides configurable parameters for 1x Handout
	 *
	 * @param hardHandoff the input value
	 */
	public void  setHardHandoff(HardHandoff hardHandoff) {
		this.hardHandoff = hardHandoff;
	}

	/**
	 * Set the this object provides configurable parameters for 1x Handout
	 *
	 * @param hardHandoff the input value
	 * @return this instance
	 */
	public RAN withHardHandoff(HardHandoff hardHandoff) {
		this.hardHandoff = hardHandoff;
		return this;
	}

	/**
	 * Get the configuration Managed Object for OTA  power control attribute.
	 *
	 * @return the value
	 */
	public PowerControl getPowerControl() {
		return powerControl;
	}

	/**
	 * Set the configuration Managed Object for OTA  power control attribute.
	 *
	 * @param powerControl the input value
	 */
	public void  setPowerControl(PowerControl powerControl) {
		this.powerControl = powerControl;
	}

	/**
	 * Set the configuration Managed Object for OTA  power control attribute.
	 *
	 * @param powerControl the input value
	 * @return this instance
	 */
	public RAN withPowerControl(PowerControl powerControl) {
		this.powerControl = powerControl;
		return this;
	}

	/**
	 * Get the this object contains information common to all neighbors of a sector. This object has only one instance.
	 *
	 * @return the value
	 */
	public Collection<NeighborList> getNeighborLists() {
		if (this.neighborLists == null){ this.neighborLists=new ArrayList<>();}
		return neighborLists;
	}

	/**
	 * Set the this object contains information common to all neighbors of a sector. This object has only one instance.
	 *
	 * @param neighborLists the input value
	 */
	public void  setNeighborLists(Collection<NeighborList> neighborLists) {
		this.neighborLists = neighborLists;
	}

	/**
	 * Set the this object contains information common to all neighbors of a sector. This object has only one instance.
	 *
	 * @param neighborList the input value
	 * @return this instance
	 */
	public RAN withNeighborList(NeighborList neighborList) {
		getNeighborLists().add(neighborList);
		return this;
	}

	/**
	 * Get the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @return the value
	 */
	public APIDM getApiDM() {
		return apiDM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param apiDM the input value
	 */
	public void  setApiDM(APIDM apiDM) {
		this.apiDM = apiDM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param apiDM the input value
	 * @return this instance
	 */
	public RAN withApiDM(APIDM apiDM) {
		this.apiDM = apiDM;
		return this;
	}

	/**
	 * Get the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @return the value
	 */
	public APIDTM getApiDTM() {
		return apiDTM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param apiDTM the input value
	 */
	public void  setApiDTM(APIDTM apiDTM) {
		this.apiDTM = apiDTM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param apiDTM the input value
	 * @return this instance
	 */
	public RAN withApiDTM(APIDTM apiDTM) {
		this.apiDTM = apiDTM;
		return this;
	}

	/**
	 * Get the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @return the value
	 */
	public APPIM getAppIM() {
		return appIM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param appIM the input value
	 */
	public void  setAppIM(APPIM appIM) {
		this.appIM = appIM;
	}

	/**
	 * Set the this object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @param appIM the input value
	 * @return this instance
	 */
	public RAN withAppIM(APPIM appIM) {
		this.appIM = appIM;
		return this;
	}

	//</editor-fold>

}