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

	/**
	 * The Execution Environments that are available on the device, along with their properties and configurable settings.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "Device.SoftwareModules.ExecEnv.{i}.")
@XmlRootElement(name = "Device.SoftwareModules.ExecEnv")
@XmlType(name = "Device.SoftwareModules.ExecEnv")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExecEnv {

	/**
	 * Indicates whether or not this {{object}} is enabled.

          Disabling an enabled Execution Environment stops it, while enabling a disabled Execution Environment starts it.  

          When an Execution Environment is disabled, Deployment Units installed to that Execution Environment will be unaffected, but any Execution Units currently running on that Execution Environment will automatically transition to {{enum|Idle|#.ExecutionUnit.{i}.Status}}.

          If a ChangeDUState is attempted on a {{object|#.DeploymentUnit}} that is to be applied against a disabled {{object}}, that ChangeDUState operation fails and the associated DUStateChangeComplete RPC will contain a FaultStruct for that operation.

          If a SetParameterValues is attempted against the {{param|#.ExecutionUnit.{i}.RequestedState}} for an {{object|#.ExecutionUnit}} that is associated with a disabled {{object}} a CWMP Fault will be issued in response.

          Disabling an Execution Environment could place the device in a non-manageable state.  For example, if the operating system itself was modeled as an {{object}} and the ACS disabled it, the CWMP management agent might be terminated leaving the device unmanageable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Setting this parameter to {{true}} causes this {{object}} to revert back to the state it was in when the device last issued a "0 BOOTSTRAP" Inform event.  The following requirements dictate what MUST happen for the reset to be complete:

          # All Deployment Units that were installed after the last "0 BOOTSTRAP" Inform event MUST be removed

          # All persistent storage, configuration files, and log files that were associated with the removed Deployment Units MUST be removed

          # Any Deployment Unit that is still installed against the Execution Environment MUST be restored to the version present when the last "0 BOOTSTRAP" Inform event was issued

          # Any Deployment Unit that was present when the last "0 BOOTSTRAP" Inform event was issued, but was subsequently uninstalled and is now not present, MUST be installed with the version that was present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restored to the version and configuration present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restarted after all other restoration requirements have been met
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * A Name provided by the CPE that adequately distinguishes this {{object}} from all other {{object}} instances.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 32)
	public String name;
	/**
	 * Indicates the complete type and specification version of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Type")
	@Size(max = 64)
	public String type;
	/**
	 * The run level that this {{object}} will be in upon startup (whether that is caused by a CPE Boot or the Execution Environment starting).

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "InitialRunLevel")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long initialRunLevel;
	/**
	 * Provides a mechanism to remotely manipulate the run level of this {{object}}, meaning that altering this parameter's value will change the value of the {{param|CurrentRunLevel}}.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          Setting this value when {{param|CurrentRunLevel}} is -1 has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RequestedRunLevel")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer requestedRunLevel;
	/**
	 * The run level that this {{object}} is currently operating in.  This value is altered by changing the {{param|RequestedRunLevel}} parameter.

          Upon startup (whether that is caused by a CPE Boot or the Execution Environment starting) {{param}} will be equal to {{param|InitialRunLevel}}, unless Run Levels are not supported by this {{object}} in which case {{param}} will be -1.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If {{param}} is -1 then Run Levels are not supported by this {{object}} and setting {{param|InitialRunLevel}} or {{param|RequestedRunLevel}} will not impact the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "CurrentRunLevel")
	@Size(min = -1, max = 65535)
	public Integer currentRunLevel;
	/**
	 * Indicates the initial value on creation for {{param|#.ExecutionUnit.{i}.RunLevel}} for all Execution Unit instances associated with this {{object}}.  

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of any Execution Unit.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "InitialExecutionUnitRunLevel")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer initialExecutionUnitRunLevel;
	/**
	 * The vendor that produced this {{object}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Vendor")
	@Size(max = 128)
	public String vendor;
	/**
	 * The Version of this {{object}} as specified by the Vendor that implemented this {{object}}, not the version of the specification.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Version")
	@Size(max = 32)
	public String version;
	/**
	 * Represents the parent {{object}} of this {{object}}.  

          If this value is {{empty}} then this is the Primary Execution Environment.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ParentExecEnv")
	public String parentExecEnv;
	/**
	 * The amount of disk space measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AllocatedDiskSpace")
	@Size(min = -1)
	public Integer allocatedDiskSpace;
	/**
	 * The amount of disk space measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} consumes disk space.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AvailableDiskSpace")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	@Size(min = -1)
	public Integer availableDiskSpace;
	/**
	 * The amount of physical RAM measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AllocatedMemory")
	@Size(min = -1)
	public Integer allocatedMemory;
	/**
	 * The amount of physical RAM measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} are started/stopped and consume the physical RAM.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AvailableMemory")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	@Size(min = -1)
	public Integer availableMemory;
	/**
	 * Represents the {{object|#.ExecutionUnit}} instances currently running on this {{object}}.  This parameter only contains {{object|#.ExecutionUnit}} instances that currently have a {{param|#.ExecutionUnit.{i}.Status}} of {{enum|Active|#.ExecutionUnit.{i}.Status}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ActiveExecutionUnits")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> activeExecutionUnits;
	/**
	 * Represents the processors that this {{object}} has available to it.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ProcessorRefList")
	@XmlList
	public Collection<String> processorRefList;

	public ExecEnv() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether or not this {{object}} is enabled.

          Disabling an enabled Execution Environment stops it, while enabling a disabled Execution Environment starts it.  

          When an Execution Environment is disabled, Deployment Units installed to that Execution Environment will be unaffected, but any Execution Units currently running on that Execution Environment will automatically transition to {{enum|Idle|#.ExecutionUnit.{i}.Status}}.

          If a ChangeDUState is attempted on a {{object|#.DeploymentUnit}} that is to be applied against a disabled {{object}}, that ChangeDUState operation fails and the associated DUStateChangeComplete RPC will contain a FaultStruct for that operation.

          If a SetParameterValues is attempted against the {{param|#.ExecutionUnit.{i}.RequestedState}} for an {{object|#.ExecutionUnit}} that is associated with a disabled {{object}} a CWMP Fault will be issued in response.

          Disabling an Execution Environment could place the device in a non-manageable state.  For example, if the operating system itself was modeled as an {{object}} and the ACS disabled it, the CWMP management agent might be terminated leaving the device unmanageable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the indicates whether or not this {{object}} is enabled.

          Disabling an enabled Execution Environment stops it, while enabling a disabled Execution Environment starts it.  

          When an Execution Environment is disabled, Deployment Units installed to that Execution Environment will be unaffected, but any Execution Units currently running on that Execution Environment will automatically transition to {{enum|Idle|#.ExecutionUnit.{i}.Status}}.

          If a ChangeDUState is attempted on a {{object|#.DeploymentUnit}} that is to be applied against a disabled {{object}}, that ChangeDUState operation fails and the associated DUStateChangeComplete RPC will contain a FaultStruct for that operation.

          If a SetParameterValues is attempted against the {{param|#.ExecutionUnit.{i}.RequestedState}} for an {{object|#.ExecutionUnit}} that is associated with a disabled {{object}} a CWMP Fault will be issued in response.

          Disabling an Execution Environment could place the device in a non-manageable state.  For example, if the operating system itself was modeled as an {{object}} and the ACS disabled it, the CWMP management agent might be terminated leaving the device unmanageable.
	 *
	 * @since 2.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the indicates whether or not this {{object}} is enabled.

          Disabling an enabled Execution Environment stops it, while enabling a disabled Execution Environment starts it.  

          When an Execution Environment is disabled, Deployment Units installed to that Execution Environment will be unaffected, but any Execution Units currently running on that Execution Environment will automatically transition to {{enum|Idle|#.ExecutionUnit.{i}.Status}}.

          If a ChangeDUState is attempted on a {{object|#.DeploymentUnit}} that is to be applied against a disabled {{object}}, that ChangeDUState operation fails and the associated DUStateChangeComplete RPC will contain a FaultStruct for that operation.

          If a SetParameterValues is attempted against the {{param|#.ExecutionUnit.{i}.RequestedState}} for an {{object|#.ExecutionUnit}} that is associated with a disabled {{object}} a CWMP Fault will be issued in response.

          Disabling an Execution Environment could place the device in a non-manageable state.  For example, if the operating system itself was modeled as an {{object}} and the ACS disabled it, the CWMP management agent might be terminated leaving the device unmanageable.
	 *
	 * @since 2.1
	 * @param enable the input value
	 * @return this instance
	 */
	public ExecEnv withEnable(Boolean enable) {
		this.enable = enable;
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
	public ExecEnv withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the setting this parameter to {{true}} causes this {{object}} to revert back to the state it was in when the device last issued a "0 BOOTSTRAP" Inform event.  The following requirements dictate what MUST happen for the reset to be complete:

          # All Deployment Units that were installed after the last "0 BOOTSTRAP" Inform event MUST be removed

          # All persistent storage, configuration files, and log files that were associated with the removed Deployment Units MUST be removed

          # Any Deployment Unit that is still installed against the Execution Environment MUST be restored to the version present when the last "0 BOOTSTRAP" Inform event was issued

          # Any Deployment Unit that was present when the last "0 BOOTSTRAP" Inform event was issued, but was subsequently uninstalled and is now not present, MUST be installed with the version that was present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restored to the version and configuration present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restarted after all other restoration requirements have been met
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the setting this parameter to {{true}} causes this {{object}} to revert back to the state it was in when the device last issued a "0 BOOTSTRAP" Inform event.  The following requirements dictate what MUST happen for the reset to be complete:

          # All Deployment Units that were installed after the last "0 BOOTSTRAP" Inform event MUST be removed

          # All persistent storage, configuration files, and log files that were associated with the removed Deployment Units MUST be removed

          # Any Deployment Unit that is still installed against the Execution Environment MUST be restored to the version present when the last "0 BOOTSTRAP" Inform event was issued

          # Any Deployment Unit that was present when the last "0 BOOTSTRAP" Inform event was issued, but was subsequently uninstalled and is now not present, MUST be installed with the version that was present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restored to the version and configuration present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restarted after all other restoration requirements have been met
	 *
	 * @since 2.1
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the setting this parameter to {{true}} causes this {{object}} to revert back to the state it was in when the device last issued a "0 BOOTSTRAP" Inform event.  The following requirements dictate what MUST happen for the reset to be complete:

          # All Deployment Units that were installed after the last "0 BOOTSTRAP" Inform event MUST be removed

          # All persistent storage, configuration files, and log files that were associated with the removed Deployment Units MUST be removed

          # Any Deployment Unit that is still installed against the Execution Environment MUST be restored to the version present when the last "0 BOOTSTRAP" Inform event was issued

          # Any Deployment Unit that was present when the last "0 BOOTSTRAP" Inform event was issued, but was subsequently uninstalled and is now not present, MUST be installed with the version that was present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restored to the version and configuration present when the last "0 BOOTSTRAP" Inform event was issued

          # The Execution Environment MUST be restarted after all other restoration requirements have been met
	 *
	 * @since 2.1
	 * @param reset the input value
	 * @return this instance
	 */
	public ExecEnv withReset(Boolean reset) {
		this.reset = reset;
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
	public ExecEnv withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get a name provided by the CPE that adequately distinguishes this {{object}} from all other {{object}} instances.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set a name provided by the CPE that adequately distinguishes this {{object}} from all other {{object}} instances.
	 *
	 * @since 2.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set a name provided by the CPE that adequately distinguishes this {{object}} from all other {{object}} instances.
	 *
	 * @since 2.1
	 * @param name the input value
	 * @return this instance
	 */
	public ExecEnv withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the indicates the complete type and specification version of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the indicates the complete type and specification version of this {{object}}.
	 *
	 * @since 2.1
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the indicates the complete type and specification version of this {{object}}.
	 *
	 * @since 2.1
	 * @param type the input value
	 * @return this instance
	 */
	public ExecEnv withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the run level that this {{object}} will be in upon startup (whether that is caused by a CPE Boot or the Execution Environment starting).

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getInitialRunLevel() {
		return initialRunLevel;
	}

	/**
	 * Set the run level that this {{object}} will be in upon startup (whether that is caused by a CPE Boot or the Execution Environment starting).

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param initialRunLevel the input value
	 */
	public void  setInitialRunLevel(Long initialRunLevel) {
		this.initialRunLevel = initialRunLevel;
	}

	/**
	 * Set the run level that this {{object}} will be in upon startup (whether that is caused by a CPE Boot or the Execution Environment starting).

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param initialRunLevel the input value
	 * @return this instance
	 */
	public ExecEnv withInitialRunLevel(Long initialRunLevel) {
		this.initialRunLevel = initialRunLevel;
		return this;
	}

	/**
	 * Get the provides a mechanism to remotely manipulate the run level of this {{object}}, meaning that altering this parameter's value will change the value of the {{param|CurrentRunLevel}}.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          Setting this value when {{param|CurrentRunLevel}} is -1 has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getRequestedRunLevel() {
		return requestedRunLevel;
	}

	/**
	 * Set the provides a mechanism to remotely manipulate the run level of this {{object}}, meaning that altering this parameter's value will change the value of the {{param|CurrentRunLevel}}.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          Setting this value when {{param|CurrentRunLevel}} is -1 has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param requestedRunLevel the input value
	 */
	public void  setRequestedRunLevel(Integer requestedRunLevel) {
		this.requestedRunLevel = requestedRunLevel;
	}

	/**
	 * Set the provides a mechanism to remotely manipulate the run level of this {{object}}, meaning that altering this parameter's value will change the value of the {{param|CurrentRunLevel}}.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param|CurrentRunLevel}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          Setting this value when {{param|CurrentRunLevel}} is -1 has no impact to the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param requestedRunLevel the input value
	 * @return this instance
	 */
	public ExecEnv withRequestedRunLevel(Integer requestedRunLevel) {
		this.requestedRunLevel = requestedRunLevel;
		return this;
	}

	/**
	 * Get the run level that this {{object}} is currently operating in.  This value is altered by changing the {{param|RequestedRunLevel}} parameter.

          Upon startup (whether that is caused by a CPE Boot or the Execution Environment starting) {{param}} will be equal to {{param|InitialRunLevel}}, unless Run Levels are not supported by this {{object}} in which case {{param}} will be -1.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If {{param}} is -1 then Run Levels are not supported by this {{object}} and setting {{param|InitialRunLevel}} or {{param|RequestedRunLevel}} will not impact the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getCurrentRunLevel() {
		return currentRunLevel;
	}

	/**
	 * Set the run level that this {{object}} is currently operating in.  This value is altered by changing the {{param|RequestedRunLevel}} parameter.

          Upon startup (whether that is caused by a CPE Boot or the Execution Environment starting) {{param}} will be equal to {{param|InitialRunLevel}}, unless Run Levels are not supported by this {{object}} in which case {{param}} will be -1.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If {{param}} is -1 then Run Levels are not supported by this {{object}} and setting {{param|InitialRunLevel}} or {{param|RequestedRunLevel}} will not impact the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param currentRunLevel the input value
	 */
	public void  setCurrentRunLevel(Integer currentRunLevel) {
		this.currentRunLevel = currentRunLevel;
	}

	/**
	 * Set the run level that this {{object}} is currently operating in.  This value is altered by changing the {{param|RequestedRunLevel}} parameter.

          Upon startup (whether that is caused by a CPE Boot or the Execution Environment starting) {{param}} will be equal to {{param|InitialRunLevel}}, unless Run Levels are not supported by this {{object}} in which case {{param}} will be -1.

          Run levels dictate which Execution Units will be started.  Execution Units will be started if {{param}} is greater than or equal to {{param|#.ExecutionUnit.{i}.RunLevel}} and {{param|#.ExecutionUnit.{i}.AutoStart}} is {{true}}.

          If {{param}} is -1 then Run Levels are not supported by this {{object}} and setting {{param|InitialRunLevel}} or {{param|RequestedRunLevel}} will not impact the Run Level of this {{object}}.
	 *
	 * @since 2.1
	 * @param currentRunLevel the input value
	 * @return this instance
	 */
	public ExecEnv withCurrentRunLevel(Integer currentRunLevel) {
		this.currentRunLevel = currentRunLevel;
		return this;
	}

	/**
	 * Get the indicates the initial value on creation for {{param|#.ExecutionUnit.{i}.RunLevel}} for all Execution Unit instances associated with this {{object}}.  

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of any Execution Unit.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Integer getInitialExecutionUnitRunLevel() {
		return initialExecutionUnitRunLevel;
	}

	/**
	 * Set the indicates the initial value on creation for {{param|#.ExecutionUnit.{i}.RunLevel}} for all Execution Unit instances associated with this {{object}}.  

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of any Execution Unit.
	 *
	 * @since 2.4
	 * @param initialExecutionUnitRunLevel the input value
	 */
	public void  setInitialExecutionUnitRunLevel(Integer initialExecutionUnitRunLevel) {
		this.initialExecutionUnitRunLevel = initialExecutionUnitRunLevel;
	}

	/**
	 * Set the indicates the initial value on creation for {{param|#.ExecutionUnit.{i}.RunLevel}} for all Execution Unit instances associated with this {{object}}.  

          If the value of {{param|CurrentRunLevel}} is -1, then the value of this parameter is irrelevant when read and setting its value has no impact on the Run Level of any Execution Unit.
	 *
	 * @since 2.4
	 * @param initialExecutionUnitRunLevel the input value
	 * @return this instance
	 */
	public ExecEnv withInitialExecutionUnitRunLevel(Integer initialExecutionUnitRunLevel) {
		this.initialExecutionUnitRunLevel = initialExecutionUnitRunLevel;
		return this;
	}

	/**
	 * Get the vendor that produced this {{object}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Set the vendor that produced this {{object}}.
	 *
	 * @since 2.1
	 * @param vendor the input value
	 */
	public void  setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Set the vendor that produced this {{object}}.
	 *
	 * @since 2.1
	 * @param vendor the input value
	 * @return this instance
	 */
	public ExecEnv withVendor(String vendor) {
		this.vendor = vendor;
		return this;
	}

	/**
	 * Get the Version of this {{object}} as specified by the Vendor that implemented this {{object}}, not the version of the specification.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the Version of this {{object}} as specified by the Vendor that implemented this {{object}}, not the version of the specification.
	 *
	 * @since 2.1
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the Version of this {{object}} as specified by the Vendor that implemented this {{object}}, not the version of the specification.
	 *
	 * @since 2.1
	 * @param version the input value
	 * @return this instance
	 */
	public ExecEnv withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the represents the parent {{object}} of this {{object}}.  

          If this value is {{empty}} then this is the Primary Execution Environment.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getParentExecEnv() {
		return parentExecEnv;
	}

	/**
	 * Set the represents the parent {{object}} of this {{object}}.  

          If this value is {{empty}} then this is the Primary Execution Environment.
	 *
	 * @since 2.1
	 * @param parentExecEnv the input value
	 */
	public void  setParentExecEnv(String parentExecEnv) {
		this.parentExecEnv = parentExecEnv;
	}

	/**
	 * Set the represents the parent {{object}} of this {{object}}.  

          If this value is {{empty}} then this is the Primary Execution Environment.
	 *
	 * @since 2.1
	 * @param parentExecEnv the input value
	 * @return this instance
	 */
	public ExecEnv withParentExecEnv(String parentExecEnv) {
		this.parentExecEnv = parentExecEnv;
		return this;
	}

	/**
	 * Get the amount of disk space measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getAllocatedDiskSpace() {
		return allocatedDiskSpace;
	}

	/**
	 * Set the amount of disk space measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param allocatedDiskSpace the input value
	 */
	public void  setAllocatedDiskSpace(Integer allocatedDiskSpace) {
		this.allocatedDiskSpace = allocatedDiskSpace;
	}

	/**
	 * Set the amount of disk space measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param allocatedDiskSpace the input value
	 * @return this instance
	 */
	public ExecEnv withAllocatedDiskSpace(Integer allocatedDiskSpace) {
		this.allocatedDiskSpace = allocatedDiskSpace;
		return this;
	}

	/**
	 * Get the amount of disk space measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} consumes disk space.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getAvailableDiskSpace() {
		return availableDiskSpace;
	}

	/**
	 * Set the amount of disk space measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} consumes disk space.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param availableDiskSpace the input value
	 */
	public void  setAvailableDiskSpace(Integer availableDiskSpace) {
		this.availableDiskSpace = availableDiskSpace;
	}

	/**
	 * Set the amount of disk space measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} consumes disk space.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param availableDiskSpace the input value
	 * @return this instance
	 */
	public ExecEnv withAvailableDiskSpace(Integer availableDiskSpace) {
		this.availableDiskSpace = availableDiskSpace;
		return this;
	}

	/**
	 * Get the amount of physical RAM measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getAllocatedMemory() {
		return allocatedMemory;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param allocatedMemory the input value
	 */
	public void  setAllocatedMemory(Integer allocatedMemory) {
		this.allocatedMemory = allocatedMemory;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes allocated to this {{object}}.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param allocatedMemory the input value
	 * @return this instance
	 */
	public ExecEnv withAllocatedMemory(Integer allocatedMemory) {
		this.allocatedMemory = allocatedMemory;
		return this;
	}

	/**
	 * Get the amount of physical RAM measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} are started/stopped and consume the physical RAM.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Integer getAvailableMemory() {
		return availableMemory;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} are started/stopped and consume the physical RAM.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param availableMemory the input value
	 */
	public void  setAvailableMemory(Integer availableMemory) {
		this.availableMemory = availableMemory;
	}

	/**
	 * Set the amount of physical RAM measured in kilobytes currently available to this {{object}}.  This value changes as the {{object|#.ExecutionUnit}} instances associated with this {{object}} are started/stopped and consume the physical RAM.  A value of -1 MUST be used for {{object}} instances where this parameter is not applicable.
	 *
	 * @since 2.1
	 * @param availableMemory the input value
	 * @return this instance
	 */
	public ExecEnv withAvailableMemory(Integer availableMemory) {
		this.availableMemory = availableMemory;
		return this;
	}

	/**
	 * Get the represents the {{object|#.ExecutionUnit}} instances currently running on this {{object}}.  This parameter only contains {{object|#.ExecutionUnit}} instances that currently have a {{param|#.ExecutionUnit.{i}.Status}} of {{enum|Active|#.ExecutionUnit.{i}.Status}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getActiveExecutionUnits() {
		if (this.activeExecutionUnits == null){ this.activeExecutionUnits=new ArrayList<>();}
		return activeExecutionUnits;
	}

	/**
	 * Set the represents the {{object|#.ExecutionUnit}} instances currently running on this {{object}}.  This parameter only contains {{object|#.ExecutionUnit}} instances that currently have a {{param|#.ExecutionUnit.{i}.Status}} of {{enum|Active|#.ExecutionUnit.{i}.Status}}.
	 *
	 * @since 2.1
	 * @param activeExecutionUnits the input value
	 */
	public void  setActiveExecutionUnits(Collection<String> activeExecutionUnits) {
		this.activeExecutionUnits = activeExecutionUnits;
	}

	/**
	 * Set the represents the {{object|#.ExecutionUnit}} instances currently running on this {{object}}.  This parameter only contains {{object|#.ExecutionUnit}} instances that currently have a {{param|#.ExecutionUnit.{i}.Status}} of {{enum|Active|#.ExecutionUnit.{i}.Status}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecEnv withActiveExecutionUnits(String string) {
		getActiveExecutionUnits().add(string);
		return this;
	}

	/**
	 * Get the represents the processors that this {{object}} has available to it.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getProcessorRefList() {
		if (this.processorRefList == null){ this.processorRefList=new ArrayList<>();}
		return processorRefList;
	}

	/**
	 * Set the represents the processors that this {{object}} has available to it.
	 *
	 * @since 2.1
	 * @param processorRefList the input value
	 */
	public void  setProcessorRefList(Collection<String> processorRefList) {
		this.processorRefList = processorRefList;
	}

	/**
	 * Set the represents the processors that this {{object}} has available to it.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public ExecEnv withProcessorRefList(String string) {
		getProcessorRefList().add(string);
		return this;
	}

	//</editor-fold>

}