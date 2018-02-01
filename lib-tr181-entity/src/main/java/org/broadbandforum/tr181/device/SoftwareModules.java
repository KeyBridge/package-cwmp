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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.softwaremodules.DeploymentUnit;
import org.broadbandforum.tr181.device.softwaremodules.ExecEnv;
import org.broadbandforum.tr181.device.softwaremodules.ExecutionUnit;

	/**
	 * Top level object for dynamically managed software applications.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "Device.SoftwareModules.")
public class SoftwareModules {

	/**
	 * The Execution Environments that are available on the device, along with their properties and configurable settings.
	 */
	@XmlElementWrapper(name = "execEnvs")
	@XmlElement(name = "ExecEnv")
	public Collection<ExecEnv> execEnvs;
	/**
	 * This table serves as the Deployment Unit inventory and contains status information about each Deployment Unit.

        A new instance of this table gets created during the installation of a Software Module.
	 */
	@XmlElementWrapper(name = "deploymentUnits")
	@XmlElement(name = "DeploymentUnit")
	public Collection<DeploymentUnit> deploymentUnits;
	/**
	 * This table serves as the Execution Unit inventory and contains both status information about each Execution Unit as well as configurable parameters for each Execution Unit.

        Each {{object|#.DeploymentUnit}} that is installed can have zero or more Execution Units.  

        Once a Deployment Unit is installed it populates this table with its contained Execution Units.  

        When the Deployment Unit (that caused this {{object}} to come into existence) is updated, this instance MAY be removed and new instances MAY come into existence.  While the Deployment Unit (that caused this {{object}} to come into existence) is being updated, all {{object}} instances associated with the Deployment Unit will be stopped until the update is complete at which time they will be restored to the state that they were in before the update started.

        When the Deployment Unit (that caused this {{object}} to come into existence) is uninstalled, this instance is removed.

        Each {{object}} MAY also contain a set of vendor specific parameters displaying status and maintaining configuration that reside under the {{object|Extensions}} object.
	 */
	@XmlElementWrapper(name = "executionUnits")
	@XmlElement(name = "ExecutionUnit")
	public Collection<ExecutionUnit> executionUnits;

	public SoftwareModules() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the Execution Environments that are available on the device, along with their properties and configurable settings.
	 *
	 * @return the value
	 */
	public Collection<ExecEnv> getExecEnvs() {
		if (this.execEnvs == null){ this.execEnvs=new ArrayList<>();}
		return execEnvs;
	}

	/**
	 * Set the Execution Environments that are available on the device, along with their properties and configurable settings.
	 *
	 * @param execEnvs the input value
	 */
	public void  setExecEnvs(Collection<ExecEnv> execEnvs) {
		this.execEnvs = execEnvs;
	}

	/**
	 * Set the Execution Environments that are available on the device, along with their properties and configurable settings.
	 *
	 * @param execEnv the input value
	 * @return this instance
	 */
	public SoftwareModules withExecEnv(ExecEnv execEnv) {
		getExecEnvs().add(execEnv);
		return this;
	}

	/**
	 * Get the this table serves as the Deployment Unit inventory and contains status information about each Deployment Unit.

        A new instance of this table gets created during the installation of a Software Module.
	 *
	 * @return the value
	 */
	public Collection<DeploymentUnit> getDeploymentUnits() {
		if (this.deploymentUnits == null){ this.deploymentUnits=new ArrayList<>();}
		return deploymentUnits;
	}

	/**
	 * Set the this table serves as the Deployment Unit inventory and contains status information about each Deployment Unit.

        A new instance of this table gets created during the installation of a Software Module.
	 *
	 * @param deploymentUnits the input value
	 */
	public void  setDeploymentUnits(Collection<DeploymentUnit> deploymentUnits) {
		this.deploymentUnits = deploymentUnits;
	}

	/**
	 * Set the this table serves as the Deployment Unit inventory and contains status information about each Deployment Unit.

        A new instance of this table gets created during the installation of a Software Module.
	 *
	 * @param deploymentUnit the input value
	 * @return this instance
	 */
	public SoftwareModules withDeploymentUnit(DeploymentUnit deploymentUnit) {
		getDeploymentUnits().add(deploymentUnit);
		return this;
	}

	/**
	 * Get the this table serves as the Execution Unit inventory and contains both status information about each Execution Unit as well as configurable parameters for each Execution Unit.

        Each {{object|#.DeploymentUnit}} that is installed can have zero or more Execution Units.  

        Once a Deployment Unit is installed it populates this table with its contained Execution Units.  

        When the Deployment Unit (that caused this {{object}} to come into existence) is updated, this instance MAY be removed and new instances MAY come into existence.  While the Deployment Unit (that caused this {{object}} to come into existence) is being updated, all {{object}} instances associated with the Deployment Unit will be stopped until the update is complete at which time they will be restored to the state that they were in before the update started.

        When the Deployment Unit (that caused this {{object}} to come into existence) is uninstalled, this instance is removed.

        Each {{object}} MAY also contain a set of vendor specific parameters displaying status and maintaining configuration that reside under the {{object|Extensions}} object.
	 *
	 * @return the value
	 */
	public Collection<ExecutionUnit> getExecutionUnits() {
		if (this.executionUnits == null){ this.executionUnits=new ArrayList<>();}
		return executionUnits;
	}

	/**
	 * Set the this table serves as the Execution Unit inventory and contains both status information about each Execution Unit as well as configurable parameters for each Execution Unit.

        Each {{object|#.DeploymentUnit}} that is installed can have zero or more Execution Units.  

        Once a Deployment Unit is installed it populates this table with its contained Execution Units.  

        When the Deployment Unit (that caused this {{object}} to come into existence) is updated, this instance MAY be removed and new instances MAY come into existence.  While the Deployment Unit (that caused this {{object}} to come into existence) is being updated, all {{object}} instances associated with the Deployment Unit will be stopped until the update is complete at which time they will be restored to the state that they were in before the update started.

        When the Deployment Unit (that caused this {{object}} to come into existence) is uninstalled, this instance is removed.

        Each {{object}} MAY also contain a set of vendor specific parameters displaying status and maintaining configuration that reside under the {{object|Extensions}} object.
	 *
	 * @param executionUnits the input value
	 */
	public void  setExecutionUnits(Collection<ExecutionUnit> executionUnits) {
		this.executionUnits = executionUnits;
	}

	/**
	 * Set the this table serves as the Execution Unit inventory and contains both status information about each Execution Unit as well as configurable parameters for each Execution Unit.

        Each {{object|#.DeploymentUnit}} that is installed can have zero or more Execution Units.  

        Once a Deployment Unit is installed it populates this table with its contained Execution Units.  

        When the Deployment Unit (that caused this {{object}} to come into existence) is updated, this instance MAY be removed and new instances MAY come into existence.  While the Deployment Unit (that caused this {{object}} to come into existence) is being updated, all {{object}} instances associated with the Deployment Unit will be stopped until the update is complete at which time they will be restored to the state that they were in before the update started.

        When the Deployment Unit (that caused this {{object}} to come into existence) is uninstalled, this instance is removed.

        Each {{object}} MAY also contain a set of vendor specific parameters displaying status and maintaining configuration that reside under the {{object|Extensions}} object.
	 *
	 * @param executionUnit the input value
	 * @return this instance
	 */
	public SoftwareModules withExecutionUnit(ExecutionUnit executionUnit) {
		getExecutionUnits().add(executionUnit);
		return this;
	}

	//</editor-fold>

}