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
package org.broadbandforum.tr098.internetgatewaydevice.deviceinfo;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.deviceinfo.processstatus.Process;

	/**
	 * Status of the processes on the device.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.DeviceInfo.ProcessStatus.")
@XmlRootElement(name = "ProcessStatus")
@XmlType(name = "InternetGatewayDevice.DeviceInfo.ProcessStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcessStatus {

	/**
	 * The total amount of the CPU, in percent, rounded up to the nearest whole percent.  In the case that multiple CPU are present, this value represents the average of all CPU.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "CPUUsage")
	@CWMPParameter(activeNotify = "canDeny", units = "percent")
	@Size(max = 100)
	public Long cpuUsage;
	/**
	 * List of all processes running on the device.
	 */
	@XmlElementWrapper(name = "Processs")
	@XmlElement(name = "Process")
	public Collection<Process> processs;

	public ProcessStatus() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total amount of the CPU, in percent, rounded up to the nearest whole percent.  In the case that multiple CPU are present, this value represents the average of all CPU.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getCpuUsage() {
		return cpuUsage;
	}

	/**
	 * Set the total amount of the CPU, in percent, rounded up to the nearest whole percent.  In the case that multiple CPU are present, this value represents the average of all CPU.
	 *
	 * @since 1.5
	 * @param cpuUsage the input value
	 */
	public void  setCpuUsage(Long cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	/**
	 * Set the total amount of the CPU, in percent, rounded up to the nearest whole percent.  In the case that multiple CPU are present, this value represents the average of all CPU.
	 *
	 * @since 1.5
	 * @param cpuUsage the input value
	 * @return this instance
	 */
	public ProcessStatus withCpuUsage(Long cpuUsage) {
		this.cpuUsage = cpuUsage;
		return this;
	}

	/**
	 * Get the list of all processes running on the device.
	 *
	 * @return the value
	 */
	public Collection<Process> getProcesss() {
		if (this.processs == null){ this.processs=new ArrayList<>();}
		return processs;
	}

	/**
	 * Set the list of all processes running on the device.
	 *
	 * @param processs the input value
	 */
	public void  setProcesss(Collection<Process> processs) {
		this.processs = processs;
	}

	/**
	 * Set the list of all processes running on the device.
	 *
	 * @param process the input value
	 * @return this instance
	 */
	public ProcessStatus withProcess(Process process) {
		getProcesss().add(process);
		return this;
	}

	//</editor-fold>

}