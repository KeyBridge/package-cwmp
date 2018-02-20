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
package org.broadbandforum.tr196.fapservice.fapcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.Gateway;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.HRPD;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.OneX;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.Time;

	/**
	 * This object contains parameters relating to the configuration for the control portions of a CDMA2000 FAP.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.")
@XmlRootElement(name = "FAPService.FAPControl.CDMA2000")
@XmlType(name = "FAPService.FAPControl.CDMA2000")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000 {

	/**
	 * A string containing one of operator's home domains in URI format. FAP is preconfigured with a default home domain, which can be overwritten later by ACS. See {{bibref|3GPP2-X.S0059}}.

If the''.ManagementServer.URL'' is null, then the FAP shall use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} is null, then the FAP shall  use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.

If the FAP is unable to connect to the management server indicated by the value of the ''.ManagementServer.URL'' attribute and this attribute is not null, the FAP may use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If the FAP is unable to connect to any security gateway indicated by the value of the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}}, {{param|.FAPControl.CDMA2000.Gateway.SecGWServer2}}, and {{param|.FAPControl.CDMA2000.Gateway.SecGWServer3}} attributes and this attribute is not null, the FAP may use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HomeDomain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String homeDomain;
	/**
	 * Enable or disable remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}} remote IP access is enabled. If {{false}} remove IP access is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteIPAccessEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean remoteIPAccessEnable;
	/**
	 * The value MUST be the path name of a row in the ''.FAP.PerfMgmt.Config.'' table.

This is the performance management related configuration for the CDMA2000 FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PMConfig")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String pmconfig;
	/**
	 * This object contains parameters related to time syncronization with CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}).
	 */
	@XmlElement(name = "Time")
	public Time time;
	/**
	 * This object contains all global attributes of the 1xFemto application.
	 */
	@XmlElement(name = "OneX")
	public OneX oneX;
	/**
	 * CDMA2000 FAP Security Gateway operational parameters.
	 */
	@XmlElement(name = "Gateway")
	public Gateway gateway;
	/**
	 * Operational parameters for the HRPD portion of a CDMA2000 FAP.
	 */
	@XmlElement(name = "HRPD")
	public HRPD hrpD;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a string containing one of operator's home domains in URI format. FAP is preconfigured with a default home domain, which can be overwritten later by ACS. See {{bibref|3GPP2-X.S0059}}.

If the''.ManagementServer.URL'' is null, then the FAP shall use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} is null, then the FAP shall  use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.

If the FAP is unable to connect to the management server indicated by the value of the ''.ManagementServer.URL'' attribute and this attribute is not null, the FAP may use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If the FAP is unable to connect to any security gateway indicated by the value of the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}}, {{param|.FAPControl.CDMA2000.Gateway.SecGWServer2}}, and {{param|.FAPControl.CDMA2000.Gateway.SecGWServer3}} attributes and this attribute is not null, the FAP may use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHomeDomain() {
		return homeDomain;
	}

	/**
	 * Set a string containing one of operator's home domains in URI format. FAP is preconfigured with a default home domain, which can be overwritten later by ACS. See {{bibref|3GPP2-X.S0059}}.

If the''.ManagementServer.URL'' is null, then the FAP shall use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} is null, then the FAP shall  use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.

If the FAP is unable to connect to the management server indicated by the value of the ''.ManagementServer.URL'' attribute and this attribute is not null, the FAP may use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If the FAP is unable to connect to any security gateway indicated by the value of the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}}, {{param|.FAPControl.CDMA2000.Gateway.SecGWServer2}}, and {{param|.FAPControl.CDMA2000.Gateway.SecGWServer3}} attributes and this attribute is not null, the FAP may use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.
	 *
	 * @since 2.0
	 * @param homeDomain the input value
	 */
	public void  setHomeDomain(String homeDomain) {
		this.homeDomain = homeDomain;
	}

	/**
	 * Set a string containing one of operator's home domains in URI format. FAP is preconfigured with a default home domain, which can be overwritten later by ACS. See {{bibref|3GPP2-X.S0059}}.

If the''.ManagementServer.URL'' is null, then the FAP shall use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} is null, then the FAP shall  use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.

If the FAP is unable to connect to the management server indicated by the value of the ''.ManagementServer.URL'' attribute and this attribute is not null, the FAP may use the value of this attribute to construct the ''.ManagementServer.URL'' attribute.

If the FAP is unable to connect to any security gateway indicated by the value of the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}}, {{param|.FAPControl.CDMA2000.Gateway.SecGWServer2}}, and {{param|.FAPControl.CDMA2000.Gateway.SecGWServer3}} attributes and this attribute is not null, the FAP may use the value of this attribute to construct the {{param|.FAPControl.CDMA2000.Gateway.SecGWServer1}} attribute.
	 *
	 * @since 2.0
	 * @param homeDomain the input value
	 * @return this instance
	 */
	public CDMA2000 withHomeDomain(String homeDomain) {
		this.homeDomain = homeDomain;
		return this;
	}

	/**
	 * Get the enable or disable remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}} remote IP access is enabled. If {{false}} remove IP access is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRemoteIPAccessEnable() {
		return remoteIPAccessEnable;
	}

	/**
	 * Set the enable or disable remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}} remote IP access is enabled. If {{false}} remove IP access is disabled.
	 *
	 * @since 2.0
	 * @param remoteIPAccessEnable the input value
	 */
	public void  setRemoteIPAccessEnable(Boolean remoteIPAccessEnable) {
		this.remoteIPAccessEnable = remoteIPAccessEnable;
	}

	/**
	 * Set the enable or disable remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}} remote IP access is enabled. If {{false}} remove IP access is disabled.
	 *
	 * @since 2.0
	 * @param remoteIPAccessEnable the input value
	 * @return this instance
	 */
	public CDMA2000 withRemoteIPAccessEnable(Boolean remoteIPAccessEnable) {
		this.remoteIPAccessEnable = remoteIPAccessEnable;
		return this;
	}

	/**
	 * Get the value MUST be the path name of a row in the ''.FAP.PerfMgmt.Config.'' table.

This is the performance management related configuration for the CDMA2000 FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPmconfig() {
		return pmconfig;
	}

	/**
	 * Set the value MUST be the path name of a row in the ''.FAP.PerfMgmt.Config.'' table.

This is the performance management related configuration for the CDMA2000 FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @param pmconfig the input value
	 */
	public void  setPmconfig(String pmconfig) {
		this.pmconfig = pmconfig;
	}

	/**
	 * Set the value MUST be the path name of a row in the ''.FAP.PerfMgmt.Config.'' table.

This is the performance management related configuration for the CDMA2000 FAP. In case of a multiple-radio-technology FAP product, each radio technology can have its own PM configuration or share a common PM configuration. In the former case, {{param}} can contain a unique instance number. In the latter case, {{param}} under all radio technologies can have the same instance number.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 2.0
	 * @param pmconfig the input value
	 * @return this instance
	 */
	public CDMA2000 withPmconfig(String pmconfig) {
		this.pmconfig = pmconfig;
		return this;
	}

	/**
	 * Get the this object contains parameters related to time syncronization with CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}).
	 *
	 * @return the value
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * Set the this object contains parameters related to time syncronization with CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}).
	 *
	 * @param time the input value
	 */
	public void  setTime(Time time) {
		this.time = time;
	}

	/**
	 * Set the this object contains parameters related to time syncronization with CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}).
	 *
	 * @param time the input value
	 * @return this instance
	 */
	public CDMA2000 withTime(Time time) {
		this.time = time;
		return this;
	}

	/**
	 * Get the this object contains all global attributes of the 1xFemto application.
	 *
	 * @return the value
	 */
	public OneX getOneX() {
		return oneX;
	}

	/**
	 * Set the this object contains all global attributes of the 1xFemto application.
	 *
	 * @param oneX the input value
	 */
	public void  setOneX(OneX oneX) {
		this.oneX = oneX;
	}

	/**
	 * Set the this object contains all global attributes of the 1xFemto application.
	 *
	 * @param oneX the input value
	 * @return this instance
	 */
	public CDMA2000 withOneX(OneX oneX) {
		this.oneX = oneX;
		return this;
	}

	/**
	 * Get the cdmA2000 FAP Security Gateway operational parameters.
	 *
	 * @return the value
	 */
	public Gateway getGateway() {
		return gateway;
	}

	/**
	 * Set the cdmA2000 FAP Security Gateway operational parameters.
	 *
	 * @param gateway the input value
	 */
	public void  setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	/**
	 * Set the cdmA2000 FAP Security Gateway operational parameters.
	 *
	 * @param gateway the input value
	 * @return this instance
	 */
	public CDMA2000 withGateway(Gateway gateway) {
		this.gateway = gateway;
		return this;
	}

	/**
	 * Get the operational parameters for the HRPD portion of a CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public HRPD getHrpD() {
		return hrpD;
	}

	/**
	 * Set the operational parameters for the HRPD portion of a CDMA2000 FAP.
	 *
	 * @param hrpD the input value
	 */
	public void  setHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
	}

	/**
	 * Set the operational parameters for the HRPD portion of a CDMA2000 FAP.
	 *
	 * @param hrpD the input value
	 * @return this instance
	 */
	public CDMA2000 withHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
		return this;
	}

	//</editor-fold>

}