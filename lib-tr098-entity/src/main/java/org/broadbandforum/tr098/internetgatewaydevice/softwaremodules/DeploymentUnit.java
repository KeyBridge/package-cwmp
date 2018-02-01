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
package org.broadbandforum.tr098.internetgatewaydevice.softwaremodules;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This table serves as the Deployment Unit inventory and contains status information about each Deployment Unit.

A new instance of this table gets created during the installation of a Software Module.
	 *
	 * @since 1.8
	 */
@CWMPObject(name = "InternetGatewayDevice.SoftwareModules.DeploymentUnit.{i}.")
public class DeploymentUnit {

	/**
	 * A Universally Unique Identifier either provided by the ACS, or generated by the CPE, at the time of Deployment Unit Installation.  The format of this value is defined by {{bibref|RFC4122}} Version 3 (Name-Based) and {{bibref|TR-069a3|Annex H}}.

This value MUST NOT be altered when the {{object}} is updated.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "UUID")
	@Size(max = 36)
	public String uuiD;
	/**
	 * Deployment Unit Identifier chosen by the targeted {{object|#.ExecEnv}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "DUID")
	@Size(max = 64)
	public String duiD;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates the Name of this {{object}}, which is chosen by the author of the Deployment Unit.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * Indicates the status of this {{object}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Status")
	@CWMPParameter(activeNotify = "canDeny")
	public String status;
	/**
	 * Indicates whether or not this {{object}} has resolved all of its dependencies.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Resolved")
	public Boolean resolved;
	/**
	 * Contains the URL used by the most recent ChangeDUState RPC to either Install or Update this {{object}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "URL")
	@Size(max = 1024)
	public String url;
	/**
	 * Textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Description")
	@Size(max = 256)
	public String description;
	/**
	 * The author of this {{object}} formatted as a domain name.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Vendor")
	@Size(max = 128)
	public String vendor;
	/**
	 * Version of this {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "Version")
	@Size(max = 32)
	public String version;
	/**
	 * Represents the vendor log files that have come into existence because of this {{object}}.  This does not include any vendor log files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "VendorLogList")
	@XmlList
	public Collection<String> vendorLogList;
	/**
	 * Represents the vendor config files that have come into existence because of this {{object}}.  This does not include any vendor config files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "VendorConfigList")
	@XmlList
	public Collection<String> vendorConfigList;
	/**
	 * Represents the {{object|#.ExecutionUnit}} instances that are associated with this {{object}} instance.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "ExecutionUnitList")
	@XmlList
	public Collection<String> executionUnitList;
	/**
	 * Represents the {{object|#.ExecEnv}} instance where this {{object}} instance is installed.
	 *
	 * @since 1.8
	 */
	@XmlElement(name = "ExecutionEnvRef")
	public String executionEnvRef;

	public DeploymentUnit() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a universally Unique Identifier either provided by the ACS, or generated by the CPE, at the time of Deployment Unit Installation.  The format of this value is defined by {{bibref|RFC4122}} Version 3 (Name-Based) and {{bibref|TR-069a3|Annex H}}.

This value MUST NOT be altered when the {{object}} is updated.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getUuiD() {
		return uuiD;
	}

	/**
	 * Set a universally Unique Identifier either provided by the ACS, or generated by the CPE, at the time of Deployment Unit Installation.  The format of this value is defined by {{bibref|RFC4122}} Version 3 (Name-Based) and {{bibref|TR-069a3|Annex H}}.

This value MUST NOT be altered when the {{object}} is updated.
	 *
	 * @since 1.8
	 * @param uuiD the input value
	 */
	public void  setUuiD(String uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set a universally Unique Identifier either provided by the ACS, or generated by the CPE, at the time of Deployment Unit Installation.  The format of this value is defined by {{bibref|RFC4122}} Version 3 (Name-Based) and {{bibref|TR-069a3|Annex H}}.

This value MUST NOT be altered when the {{object}} is updated.
	 *
	 * @since 1.8
	 * @param uuiD the input value
	 * @return this instance
	 */
	public DeploymentUnit withUuiD(String uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the deployment Unit Identifier chosen by the targeted {{object|#.ExecEnv}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getDuiD() {
		return duiD;
	}

	/**
	 * Set the deployment Unit Identifier chosen by the targeted {{object|#.ExecEnv}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param duiD the input value
	 */
	public void  setDuiD(String duiD) {
		this.duiD = duiD;
	}

	/**
	 * Set the deployment Unit Identifier chosen by the targeted {{object|#.ExecEnv}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param duiD the input value
	 * @return this instance
	 */
	public DeploymentUnit withDuiD(String duiD) {
		this.duiD = duiD;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.8
	 * @param alias the input value
	 * @return this instance
	 */
	public DeploymentUnit withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates the Name of this {{object}}, which is chosen by the author of the Deployment Unit.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the indicates the Name of this {{object}}, which is chosen by the author of the Deployment Unit.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the indicates the Name of this {{object}}, which is chosen by the author of the Deployment Unit.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @param name the input value
	 * @return this instance
	 */
	public DeploymentUnit withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the indicates the status of this {{object}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 1.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 1.8
	 * @param status the input value
	 * @return this instance
	 */
	public DeploymentUnit withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates whether or not this {{object}} has resolved all of its dependencies.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Boolean isResolved() {
		return resolved;
	}

	/**
	 * Set the indicates whether or not this {{object}} has resolved all of its dependencies.
	 *
	 * @since 1.8
	 * @param resolved the input value
	 */
	public void  setResolved(Boolean resolved) {
		this.resolved = resolved;
	}

	/**
	 * Set the indicates whether or not this {{object}} has resolved all of its dependencies.
	 *
	 * @since 1.8
	 * @param resolved the input value
	 * @return this instance
	 */
	public DeploymentUnit withResolved(Boolean resolved) {
		this.resolved = resolved;
		return this;
	}

	/**
	 * Get the contains the URL used by the most recent ChangeDUState RPC to either Install or Update this {{object}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the contains the URL used by the most recent ChangeDUState RPC to either Install or Update this {{object}}.
	 *
	 * @since 1.8
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the contains the URL used by the most recent ChangeDUState RPC to either Install or Update this {{object}}.
	 *
	 * @since 1.8
	 * @param url the input value
	 * @return this instance
	 */
	public DeploymentUnit withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param description the input value
	 * @return this instance
	 */
	public DeploymentUnit withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the author of this {{object}} formatted as a domain name.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Set the author of this {{object}} formatted as a domain name.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @param vendor the input value
	 */
	public void  setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Set the author of this {{object}} formatted as a domain name.

The value of this parameter is used in the generation of the {{param|UUID}} based on the rules defined in {{bibref|TR-069a3|Annex H}}.
	 *
	 * @since 1.8
	 * @param vendor the input value
	 * @return this instance
	 */
	public DeploymentUnit withVendor(String vendor) {
		this.vendor = vendor;
		return this;
	}

	/**
	 * Get the version of this {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the version of this {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the version of this {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 1.8
	 * @param version the input value
	 * @return this instance
	 */
	public DeploymentUnit withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the represents the vendor log files that have come into existence because of this {{object}}.  This does not include any vendor log files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Collection<String> getVendorLogList() {
		if (this.vendorLogList == null){ this.vendorLogList=new ArrayList<>();}
		return vendorLogList;
	}

	/**
	 * Set the represents the vendor log files that have come into existence because of this {{object}}.  This does not include any vendor log files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @param vendorLogList the input value
	 */
	public void  setVendorLogList(Collection<String> vendorLogList) {
		this.vendorLogList = vendorLogList;
	}

	/**
	 * Set the represents the vendor log files that have come into existence because of this {{object}}.  This does not include any vendor log files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeploymentUnit withVendorLogList(String string) {
		getVendorLogList().add(string);
		return this;
	}

	/**
	 * Get the represents the vendor config files that have come into existence because of this {{object}}.  This does not include any vendor config files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Collection<String> getVendorConfigList() {
		if (this.vendorConfigList == null){ this.vendorConfigList=new ArrayList<>();}
		return vendorConfigList;
	}

	/**
	 * Set the represents the vendor config files that have come into existence because of this {{object}}.  This does not include any vendor config files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @param vendorConfigList the input value
	 */
	public void  setVendorConfigList(Collection<String> vendorConfigList) {
		this.vendorConfigList = vendorConfigList;
	}

	/**
	 * Set the represents the vendor config files that have come into existence because of this {{object}}.  This does not include any vendor config files that have come into existence because of {{object|#.ExecutionUnit}} instances that are contained within this {{object}}.

When this {{object}} is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 1.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeploymentUnit withVendorConfigList(String string) {
		getVendorConfigList().add(string);
		return this;
	}

	/**
	 * Get the represents the {{object|#.ExecutionUnit}} instances that are associated with this {{object}} instance.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public Collection<String> getExecutionUnitList() {
		if (this.executionUnitList == null){ this.executionUnitList=new ArrayList<>();}
		return executionUnitList;
	}

	/**
	 * Set the represents the {{object|#.ExecutionUnit}} instances that are associated with this {{object}} instance.
	 *
	 * @since 1.8
	 * @param executionUnitList the input value
	 */
	public void  setExecutionUnitList(Collection<String> executionUnitList) {
		this.executionUnitList = executionUnitList;
	}

	/**
	 * Set the represents the {{object|#.ExecutionUnit}} instances that are associated with this {{object}} instance.
	 *
	 * @since 1.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeploymentUnit withExecutionUnitList(String string) {
		getExecutionUnitList().add(string);
		return this;
	}

	/**
	 * Get the represents the {{object|#.ExecEnv}} instance where this {{object}} instance is installed.
	 *
	 * @since 1.8
	 * @return the value
	 */
	public String getExecutionEnvRef() {
		return executionEnvRef;
	}

	/**
	 * Set the represents the {{object|#.ExecEnv}} instance where this {{object}} instance is installed.
	 *
	 * @since 1.8
	 * @param executionEnvRef the input value
	 */
	public void  setExecutionEnvRef(String executionEnvRef) {
		this.executionEnvRef = executionEnvRef;
	}

	/**
	 * Set the represents the {{object|#.ExecEnv}} instance where this {{object}} instance is installed.
	 *
	 * @since 1.8
	 * @param executionEnvRef the input value
	 * @return this instance
	 */
	public DeploymentUnit withExecutionEnvRef(String executionEnvRef) {
		this.executionEnvRef = executionEnvRef;
		return this;
	}

	//</editor-fold>

}