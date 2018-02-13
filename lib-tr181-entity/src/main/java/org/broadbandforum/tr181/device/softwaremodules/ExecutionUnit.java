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
package org.broadbandforum.tr181.device.softwaremodules;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.softwaremodules.executionunit.Extensions;

	/**
	 * This table serves as the Execution Unit inventory and contains both status information about each Execution Unit as well as configurable parameters for each Execution Unit.

        Each {{object|#.DeploymentUnit}} that is installed can have zero or more Execution Units.  

        Once a Deployment Unit is installed it populates this table with its contained Execution Units.  

        When the Deployment Unit (that caused this {{object}} to come into existence) is updated, this instance MAY be removed and new instances MAY come into existence.  While the Deployment Unit (that caused this {{object}} to come into existence) is being updated, all {{object}} instances associated with the Deployment Unit will be stopped until the update is complete at which time they will be restored to the state that they were in before the update started.

        When the Deployment Unit (that caused this {{object}} to come into existence) is uninstalled, this instance is removed.

        Each {{object}} MAY also contain a set of vendor specific parameters displaying status and maintaining configuration that reside under the {{object|Extensions}} object.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "Device.SoftwareModules.ExecutionUnit.{i}.")
@XmlRootElement(name = "Device.SoftwareModules.ExecutionUnit")
@XmlType(name = "Device.SoftwareModules.ExecutionUnit")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExecutionUnit {

	/**
	 * Execution Unit Identifier chosen by the {{object|#.ExecEnv}} during installation of the associated {{object|#.DeploymentUnit}}.

          The format of this value is Execution Environment specific, but it MUST be unique across {{object|#.ExecEnv}} instances.  Thus, it is recommended that this be a combination of the {{param|#.ExecEnv.{i}.Name}} and an Execution Environment local unique value.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EUID")
	@Size(max = 64)
	public String euiD;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The name of this {{object}} as it pertains to its associated {{object|#.DeploymentUnit}}, which SHOULD be unique across all {{object}} instances contained within its associated {{object|#.DeploymentUnit}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 32)
	public String name;
	/**
	 * The name of this {{object}} as provided by the {{object|#.ExecEnv}}, which SHOULD be unique across all {{object}} instances contained within a specific {{object|#.ExecEnv}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ExecEnvLabel")
	@Size(max = 64)
	public String execEnvLabel;
	/**
	 * Indicates the status of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Status")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public String status;
	/**
	 * Indicates the state transition that the ACS is requesting for this {{object}}.  {{enum}}

          If this {{object}} is associated with an Execution Environment that is disabled and an attempt is made to alter this value, then a CWMP Fault MUST be generated.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RequestedState")
	@CWMPParameter(access = "readWrite")
	public String requestedState;
	/**
	 * If while running or transitioning between states this {{object}} identifies a fault this parameter embodies the problem.  The value of {{enum|NoFault}} MUST be used when everything is working as intended. {{enum}}

          For fault codes not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ExecutionFaultCode")
	public String executionFaultCode;
	/**
	 * If while running or transitioning between states this {{object}} identifies a fault this parameter provides a more detailed explanation of the problem.

          If {{param|ExecutionFaultCode}} has the value of {{enum|NoFault|ExecutionFaultCode}} then the value of this parameter MUST {{empty}} and ignored by the ACS.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ExecutionFaultMessage")
	@Size(max = 256)
	public String executionFaultMessage;
	/**
	 * If {{true}} and the {{param|RunLevel}} verification is also met, then this {{object}} will be automatically started by the device after its {{object|#.ExecEnv}} is either rebooted or restarted.

          If {{false}} this {{object}} will not be started after its {{object|#.ExecEnv}} is either rebooted or restarted until it is explicitly commanded to do so by either the ACS or another Execution Unit.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AutoStart")
	@CWMPParameter(access = "readWrite")
	public Boolean autoStart;
	/**
	 * Determines when this {{object}} will be started.

          If {{param|AutoStart}} is {{true}} and {{param|#.ExecEnv.{i}.CurrentRunLevel}} is greater than or equal to {{param}}, then this {{object}} will be started.

          If the value of {{param|#.ExecEnv.{i}.CurrentRunLevel}} is -1, then the associated {{object|#.ExecEnv.}} doesn't support Run Levels, thus the value of this parameter is irrelevant when read and setting its value has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RunLevel")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long runLevel;
	/**
	 * Vendor of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Vendor")
	@Size(max = 128)
	public String vendor;
	/**
	 * Version of the {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Version")
	@Size(max = 32)
	public String version;
	/**
	 * Textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Description")
	@Size(max = 256)
	public String description;
	/**
	 * The amount of disk space measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DiskSpaceInUse")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	@Size(min = -1)
	public Integer diskSpaceInUse;
	/**
	 * The amount of physical RAM measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "MemoryInUse")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	@Size(min = -1)
	public Integer memoryInUse;
	/**
	 * Represents the instances of multi-instanced objects that are directly controlled by, and have come into existence because of, this {{object}}.  See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.

          NOTE: All other objects and parameters (i.e. not multi-instanced objects) that this {{object}} has caused to come into existence can be discovered via the {{object|.DeviceInfo.SupportedDataModel.{i}.}} table.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "References")
	@XmlList
	public Collection<String> references;
	/**
	 * Represents the system processes that are active in the system because of this {{object}}.  

          If {{param|Status}} is not {{enum|Active|Status}} it is expected that this list will be {{empty}}.  Some {{object}} instances MIGHT NOT have any system processes irrespective of the value of {{param|Status}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AssociatedProcessList")
	@XmlList
	public Collection<String> associatedProcessList;
	/**
	 * Represents the vendor log files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "VendorLogList")
	@XmlList
	public Collection<String> vendorLogList;
	/**
	 * Represents the vendor config files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "VendorConfigList")
	@XmlList
	public Collection<String> vendorConfigList;
	/**
	 * Represents the CWMP-DT schema instances that have been introduced to this device because of the existence of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SupportedDataModelList")
	@XmlList
	public Collection<String> supportedDataModelList;
	/**
	 * Represents the {{object|#.ExecEnv}} that this {{object}} is associated with.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ExecutionEnvRef")
	public String executionEnvRef;
	/**
	 * This object proposes a general location for vendor extensions specific to this Execution Unit, which allows multiple Execution Units to expose parameters without the concern of conflicting parameter names.  These vendor extensions are related to displaying status and maintaining configuration for this Execution Unit.

        It is also possible for the Execution Unit to expose status and configuration parameters within Service objects or as embedded objects and parameters directly within the root data model, in which case the combination of {{param|#.References}} and {{param|#.SupportedDataModelList}} will be used to determine their locations.

        See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.
	 */
	@XmlElement(name = "Extensions")
	public Extensions extensions;

	public ExecutionUnit() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the execution Unit Identifier chosen by the {{object|#.ExecEnv}} during installation of the associated {{object|#.DeploymentUnit}}.

          The format of this value is Execution Environment specific, but it MUST be unique across {{object|#.ExecEnv}} instances.  Thus, it is recommended that this be a combination of the {{param|#.ExecEnv.{i}.Name}} and an Execution Environment local unique value.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getEuiD() {
		return euiD;
	}

	/**
	 * Set the execution Unit Identifier chosen by the {{object|#.ExecEnv}} during installation of the associated {{object|#.DeploymentUnit}}.

          The format of this value is Execution Environment specific, but it MUST be unique across {{object|#.ExecEnv}} instances.  Thus, it is recommended that this be a combination of the {{param|#.ExecEnv.{i}.Name}} and an Execution Environment local unique value.
	 *
	 * @since 2.1
	 * @param euiD the input value
	 */
	public void  setEuiD(String euiD) {
		this.euiD = euiD;
	}

	/**
	 * Set the execution Unit Identifier chosen by the {{object|#.ExecEnv}} during installation of the associated {{object|#.DeploymentUnit}}.

          The format of this value is Execution Environment specific, but it MUST be unique across {{object|#.ExecEnv}} instances.  Thus, it is recommended that this be a combination of the {{param|#.ExecEnv.{i}.Name}} and an Execution Environment local unique value.
	 *
	 * @since 2.1
	 * @param euiD the input value
	 * @return this instance
	 */
	public ExecutionUnit withEuiD(String euiD) {
		this.euiD = euiD;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.1
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.1
	 * @param alias the input value
	 * @return this instance
	 */
	public ExecutionUnit withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of this {{object}} as it pertains to its associated {{object|#.DeploymentUnit}}, which SHOULD be unique across all {{object}} instances contained within its associated {{object|#.DeploymentUnit}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this {{object}} as it pertains to its associated {{object|#.DeploymentUnit}}, which SHOULD be unique across all {{object}} instances contained within its associated {{object|#.DeploymentUnit}}.
	 *
	 * @since 2.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this {{object}} as it pertains to its associated {{object|#.DeploymentUnit}}, which SHOULD be unique across all {{object}} instances contained within its associated {{object|#.DeploymentUnit}}.
	 *
	 * @since 2.1
	 * @param name the input value
	 * @return this instance
	 */
	public ExecutionUnit withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the name of this {{object}} as provided by the {{object|#.ExecEnv}}, which SHOULD be unique across all {{object}} instances contained within a specific {{object|#.ExecEnv}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getExecEnvLabel() {
		return execEnvLabel;
	}

	/**
	 * Set the name of this {{object}} as provided by the {{object|#.ExecEnv}}, which SHOULD be unique across all {{object}} instances contained within a specific {{object|#.ExecEnv}}.
	 *
	 * @since 2.1
	 * @param execEnvLabel the input value
	 */
	public void  setExecEnvLabel(String execEnvLabel) {
		this.execEnvLabel = execEnvLabel;
	}

	/**
	 * Set the name of this {{object}} as provided by the {{object|#.ExecEnv}}, which SHOULD be unique across all {{object}} instances contained within a specific {{object|#.ExecEnv}}.
	 *
	 * @since 2.1
	 * @param execEnvLabel the input value
	 * @return this instance
	 */
	public ExecutionUnit withExecEnvLabel(String execEnvLabel) {
		this.execEnvLabel = execEnvLabel;
		return this;
	}

	/**
	 * Get the indicates the status of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 2.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 2.1
	 * @param status the input value
	 * @return this instance
	 */
	public ExecutionUnit withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates the state transition that the ACS is requesting for this {{object}}.  {{enum}}

          If this {{object}} is associated with an Execution Environment that is disabled and an attempt is made to alter this value, then a CWMP Fault MUST be generated.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getRequestedState() {
		return requestedState;
	}

	/**
	 * Set the indicates the state transition that the ACS is requesting for this {{object}}.  {{enum}}

          If this {{object}} is associated with an Execution Environment that is disabled and an attempt is made to alter this value, then a CWMP Fault MUST be generated.
	 *
	 * @since 2.1
	 * @param requestedState the input value
	 */
	public void  setRequestedState(String requestedState) {
		this.requestedState = requestedState;
	}

	/**
	 * Set the indicates the state transition that the ACS is requesting for this {{object}}.  {{enum}}

          If this {{object}} is associated with an Execution Environment that is disabled and an attempt is made to alter this value, then a CWMP Fault MUST be generated.
	 *
	 * @since 2.1
	 * @param requestedState the input value
	 * @return this instance
	 */
	public ExecutionUnit withRequestedState(String requestedState) {
		this.requestedState = requestedState;
		return this;
	}

	/**
	 * Get the if while running or transitioning between states this {{object}} identifies a fault this parameter embodies the problem.  The value of {{enum|NoFault}} MUST be used when everything is working as intended. {{enum}}

          For fault codes not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getExecutionFaultCode() {
		return executionFaultCode;
	}

	/**
	 * Set the if while running or transitioning between states this {{object}} identifies a fault this parameter embodies the problem.  The value of {{enum|NoFault}} MUST be used when everything is working as intended. {{enum}}

          For fault codes not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @param executionFaultCode the input value
	 */
	public void  setExecutionFaultCode(String executionFaultCode) {
		this.executionFaultCode = executionFaultCode;
	}

	/**
	 * Set the if while running or transitioning between states this {{object}} identifies a fault this parameter embodies the problem.  The value of {{enum|NoFault}} MUST be used when everything is working as intended. {{enum}}

          For fault codes not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @param executionFaultCode the input value
	 * @return this instance
	 */
	public ExecutionUnit withExecutionFaultCode(String executionFaultCode) {
		this.executionFaultCode = executionFaultCode;
		return this;
	}

	/**
	 * Get the if while running or transitioning between states this {{object}} identifies a fault this parameter provides a more detailed explanation of the problem.

          If {{param|ExecutionFaultCode}} has the value of {{enum|NoFault|ExecutionFaultCode}} then the value of this parameter MUST {{empty}} and ignored by the ACS.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getExecutionFaultMessage() {
		return executionFaultMessage;
	}

	/**
	 * Set the if while running or transitioning between states this {{object}} identifies a fault this parameter provides a more detailed explanation of the problem.

          If {{param|ExecutionFaultCode}} has the value of {{enum|NoFault|ExecutionFaultCode}} then the value of this parameter MUST {{empty}} and ignored by the ACS.
	 *
	 * @since 2.1
	 * @param executionFaultMessage the input value
	 */
	public void  setExecutionFaultMessage(String executionFaultMessage) {
		this.executionFaultMessage = executionFaultMessage;
	}

	/**
	 * Set the if while running or transitioning between states this {{object}} identifies a fault this parameter provides a more detailed explanation of the problem.

          If {{param|ExecutionFaultCode}} has the value of {{enum|NoFault|ExecutionFaultCode}} then the value of this parameter MUST {{empty}} and ignored by the ACS.
	 *
	 * @since 2.1
	 * @param executionFaultMessage the input value
	 * @return this instance
	 */
	public ExecutionUnit withExecutionFaultMessage(String executionFaultMessage) {
		this.executionFaultMessage = executionFaultMessage;
		return this;
	}

	/**
	 * Get the if {{true}} and the {{param|RunLevel}} verification is also met, then this {{object}} will be automatically started by the device after its {{object|#.ExecEnv}} is either rebooted or restarted.

          If {{false}} this {{object}} will not be started after its {{object|#.ExecEnv}} is either rebooted or restarted until it is explicitly commanded to do so by either the ACS or another Execution Unit.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isAutoStart() {
		return autoStart;
	}

	/**
	 * Set the if {{true}} and the {{param|RunLevel}} verification is also met, then this {{object}} will be automatically started by the device after its {{object|#.ExecEnv}} is either rebooted or restarted.

          If {{false}} this {{object}} will not be started after its {{object|#.ExecEnv}} is either rebooted or restarted until it is explicitly commanded to do so by either the ACS or another Execution Unit.
	 *
	 * @since 2.1
	 * @param autoStart the input value
	 */
	public void  setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
	}

	/**
	 * Set the if {{true}} and the {{param|RunLevel}} verification is also met, then this {{object}} will be automatically started by the device after its {{object|#.ExecEnv}} is either rebooted or restarted.

          If {{false}} this {{object}} will not be started after its {{object|#.ExecEnv}} is either rebooted or restarted until it is explicitly commanded to do so by either the ACS or another Execution Unit.
	 *
	 * @since 2.1
	 * @param autoStart the input value
	 * @return this instance
	 */
	public ExecutionUnit withAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		return this;
	}

	/**
	 * Get the determines when this {{object}} will be started.

          If {{param|AutoStart}} is {{true}} and {{param|#.ExecEnv.{i}.CurrentRunLevel}} is greater than or equal to {{param}}, then this {{object}} will be started.

          If the value of {{param|#.ExecEnv.{i}.CurrentRunLevel}} is -1, then the associated {{object|#.ExecEnv.}} doesn't support Run Levels, thus the value of this parameter is irrelevant when read and setting its value has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getRunLevel() {
		return runLevel;
	}

	/**
	 * Set the determines when this {{object}} will be started.

          If {{param|AutoStart}} is {{true}} and {{param|#.ExecEnv.{i}.CurrentRunLevel}} is greater than or equal to {{param}}, then this {{object}} will be started.

          If the value of {{param|#.ExecEnv.{i}.CurrentRunLevel}} is -1, then the associated {{object|#.ExecEnv.}} doesn't support Run Levels, thus the value of this parameter is irrelevant when read and setting its value has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param runLevel the input value
	 */
	public void  setRunLevel(Long runLevel) {
		this.runLevel = runLevel;
	}

	/**
	 * Set the determines when this {{object}} will be started.

          If {{param|AutoStart}} is {{true}} and {{param|#.ExecEnv.{i}.CurrentRunLevel}} is greater than or equal to {{param}}, then this {{object}} will be started.

          If the value of {{param|#.ExecEnv.{i}.CurrentRunLevel}} is -1, then the associated {{object|#.ExecEnv.}} doesn't support Run Levels, thus the value of this parameter is irrelevant when read and setting its value has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param runLevel the input value
	 * @return this instance
	 */
	public ExecutionUnit withRunLevel(Long runLevel) {
		this.runLevel = runLevel;
		return this;
	}

	/**
	 * Get the vendor of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Set the vendor of this {{object}}.
	 *
	 * @since 2.1
	 * @param vendor the input value
	 */
	public void  setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Set the vendor of this {{object}}.
	 *
	 * @since 2.1
	 * @param vendor the input value
	 * @return this instance
	 */
	public ExecutionUnit withVendor(String vendor) {
		this.vendor = vendor;
		return this;
	}

	/**
	 * Get the version of the {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the version of the {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the version of the {{object}}.  The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @param version the input value
	 * @return this instance
	 */
	public ExecutionUnit withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the textual description of this {{object}}. The format of this value is Execution Environment specific.
	 *
	 * @since 2.1
	 * @param description the input value
	 * @return this instance
	 */
	public ExecutionUnit withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the amount of disk space measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getDiskSpaceInUse() {
		return diskSpaceInUse;
	}

	/**
	 * Set the amount of disk space measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param diskSpaceInUse the input value
	 */
	public void  setDiskSpaceInUse(Integer diskSpaceInUse) {
		this.diskSpaceInUse = diskSpaceInUse;
	}

	/**
	 * Set the amount of disk space measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param diskSpaceInUse the input value
	 * @return this instance
	 */
	public ExecutionUnit withDiskSpaceInUse(Integer diskSpaceInUse) {
		this.diskSpaceInUse = diskSpaceInUse;
		return this;
	}

	/**
	 * Get the amount of physical RAM measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getMemoryInUse() {
		return memoryInUse;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param memoryInUse the input value
	 */
	public void  setMemoryInUse(Integer memoryInUse) {
		this.memoryInUse = memoryInUse;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes currently being used by this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param memoryInUse the input value
	 * @return this instance
	 */
	public ExecutionUnit withMemoryInUse(Integer memoryInUse) {
		this.memoryInUse = memoryInUse;
		return this;
	}

	/**
	 * Get the represents the instances of multi-instanced objects that are directly controlled by, and have come into existence because of, this {{object}}.  See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.

          NOTE: All other objects and parameters (i.e. not multi-instanced objects) that this {{object}} has caused to come into existence can be discovered via the {{object|.DeviceInfo.SupportedDataModel.{i}.}} table.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getReferences() {
		if (this.references == null){ this.references=new ArrayList<>();}
		return references;
	}

	/**
	 * Set the represents the instances of multi-instanced objects that are directly controlled by, and have come into existence because of, this {{object}}.  See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.

          NOTE: All other objects and parameters (i.e. not multi-instanced objects) that this {{object}} has caused to come into existence can be discovered via the {{object|.DeviceInfo.SupportedDataModel.{i}.}} table.
	 *
	 * @since 2.1
	 * @param references the input value
	 */
	public void  setReferences(Collection<String> references) {
		this.references = references;
	}

	/**
	 * Set the represents the instances of multi-instanced objects that are directly controlled by, and have come into existence because of, this {{object}}.  See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.

          NOTE: All other objects and parameters (i.e. not multi-instanced objects) that this {{object}} has caused to come into existence can be discovered via the {{object|.DeviceInfo.SupportedDataModel.{i}.}} table.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecutionUnit withReferences(String string) {
		getReferences().add(string);
		return this;
	}

	/**
	 * Get the represents the system processes that are active in the system because of this {{object}}.  

          If {{param|Status}} is not {{enum|Active|Status}} it is expected that this list will be {{empty}}.  Some {{object}} instances MIGHT NOT have any system processes irrespective of the value of {{param|Status}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getAssociatedProcessList() {
		if (this.associatedProcessList == null){ this.associatedProcessList=new ArrayList<>();}
		return associatedProcessList;
	}

	/**
	 * Set the represents the system processes that are active in the system because of this {{object}}.  

          If {{param|Status}} is not {{enum|Active|Status}} it is expected that this list will be {{empty}}.  Some {{object}} instances MIGHT NOT have any system processes irrespective of the value of {{param|Status}}.
	 *
	 * @since 2.1
	 * @param associatedProcessList the input value
	 */
	public void  setAssociatedProcessList(Collection<String> associatedProcessList) {
		this.associatedProcessList = associatedProcessList;
	}

	/**
	 * Set the represents the system processes that are active in the system because of this {{object}}.  

          If {{param|Status}} is not {{enum|Active|Status}} it is expected that this list will be {{empty}}.  Some {{object}} instances MIGHT NOT have any system processes irrespective of the value of {{param|Status}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecutionUnit withAssociatedProcessList(String string) {
		getAssociatedProcessList().add(string);
		return this;
	}

	/**
	 * Get the represents the vendor log files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getVendorLogList() {
		if (this.vendorLogList == null){ this.vendorLogList=new ArrayList<>();}
		return vendorLogList;
	}

	/**
	 * Set the represents the vendor log files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @param vendorLogList the input value
	 */
	public void  setVendorLogList(Collection<String> vendorLogList) {
		this.vendorLogList = vendorLogList;
	}

	/**
	 * Set the represents the vendor log files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor log files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor log file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecutionUnit withVendorLogList(String string) {
		getVendorLogList().add(string);
		return this;
	}

	/**
	 * Get the represents the vendor config files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getVendorConfigList() {
		if (this.vendorConfigList == null){ this.vendorConfigList=new ArrayList<>();}
		return vendorConfigList;
	}

	/**
	 * Set the represents the vendor config files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @param vendorConfigList the input value
	 */
	public void  setVendorConfigList(Collection<String> vendorConfigList) {
		this.vendorConfigList = vendorConfigList;
	}

	/**
	 * Set the represents the vendor config files that have come into existence because of this {{object}}.  

          When the {{object|#.DeploymentUnit}} (that caused this {{object}} to come into existence) is uninstalled the vendor config files referenced here SHOULD be removed from the CPE.

          Not all {{object}} instances will actually have a corresponding vendor config file, in which case the value of this parameter will be {{empty}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecutionUnit withVendorConfigList(String string) {
		getVendorConfigList().add(string);
		return this;
	}

	/**
	 * Get the represents the CWMP-DT schema instances that have been introduced to this device because of the existence of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getSupportedDataModelList() {
		if (this.supportedDataModelList == null){ this.supportedDataModelList=new ArrayList<>();}
		return supportedDataModelList;
	}

	/**
	 * Set the represents the CWMP-DT schema instances that have been introduced to this device because of the existence of this {{object}}.
	 *
	 * @since 2.1
	 * @param supportedDataModelList the input value
	 */
	public void  setSupportedDataModelList(Collection<String> supportedDataModelList) {
		this.supportedDataModelList = supportedDataModelList;
	}

	/**
	 * Set the represents the CWMP-DT schema instances that have been introduced to this device because of the existence of this {{object}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecutionUnit withSupportedDataModelList(String string) {
		getSupportedDataModelList().add(string);
		return this;
	}

	/**
	 * Get the represents the {{object|#.ExecEnv}} that this {{object}} is associated with.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getExecutionEnvRef() {
		return executionEnvRef;
	}

	/**
	 * Set the represents the {{object|#.ExecEnv}} that this {{object}} is associated with.
	 *
	 * @since 2.1
	 * @param executionEnvRef the input value
	 */
	public void  setExecutionEnvRef(String executionEnvRef) {
		this.executionEnvRef = executionEnvRef;
	}

	/**
	 * Set the represents the {{object|#.ExecEnv}} that this {{object}} is associated with.
	 *
	 * @since 2.1
	 * @param executionEnvRef the input value
	 * @return this instance
	 */
	public ExecutionUnit withExecutionEnvRef(String executionEnvRef) {
		this.executionEnvRef = executionEnvRef;
		return this;
	}

	/**
	 * Get the this object proposes a general location for vendor extensions specific to this Execution Unit, which allows multiple Execution Units to expose parameters without the concern of conflicting parameter names.  These vendor extensions are related to displaying status and maintaining configuration for this Execution Unit.

        It is also possible for the Execution Unit to expose status and configuration parameters within Service objects or as embedded objects and parameters directly within the root data model, in which case the combination of {{param|#.References}} and {{param|#.SupportedDataModelList}} will be used to determine their locations.

        See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.
	 *
	 * @return the value
	 */
	public Extensions getExtensions() {
		return extensions;
	}

	/**
	 * Set the this object proposes a general location for vendor extensions specific to this Execution Unit, which allows multiple Execution Units to expose parameters without the concern of conflicting parameter names.  These vendor extensions are related to displaying status and maintaining configuration for this Execution Unit.

        It is also possible for the Execution Unit to expose status and configuration parameters within Service objects or as embedded objects and parameters directly within the root data model, in which case the combination of {{param|#.References}} and {{param|#.SupportedDataModelList}} will be used to determine their locations.

        See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.
	 *
	 * @param extensions the input value
	 */
	public void  setExtensions(Extensions extensions) {
		this.extensions = extensions;
	}

	/**
	 * Set the this object proposes a general location for vendor extensions specific to this Execution Unit, which allows multiple Execution Units to expose parameters without the concern of conflicting parameter names.  These vendor extensions are related to displaying status and maintaining configuration for this Execution Unit.

        It is also possible for the Execution Unit to expose status and configuration parameters within Service objects or as embedded objects and parameters directly within the root data model, in which case the combination of {{param|#.References}} and {{param|#.SupportedDataModelList}} will be used to determine their locations.

        See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.
	 *
	 * @param extensions the input value
	 * @return this instance
	 */
	public ExecutionUnit withExtensions(Extensions extensions) {
		this.extensions = extensions;
		return this;
	}

	//</editor-fold>

}