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
package org.broadbandforum.tr181.device.deviceinfo.processstatus;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * List of all processes running on the device.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.ProcessStatus.Process.{i}.")
@XmlRootElement(name = "Process")
@XmlType(name = "Device.DeviceInfo.ProcessStatus.Process")
@XmlAccessorType(XmlAccessType.FIELD)
public class Process {

	/**
	 * The Process Identifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PID")
	public Long pid;
	/**
	 * The name of the command that has caused the process to exist.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Command")
	@Size(max = 256)
	public String command;
	/**
	 * The size in kilobytes of the memory occupied by the process.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Size")
	@CWMPParameter(activeNotify = "canDeny", units = "kilobytes")
	public Long size;
	/**
	 * The priority of the process where 0 is highest.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@Size(max = 99)
	public Long priority;
	/**
	 * The amount of time in milliseconds that the process has spent taking up CPU time since the process was started.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CPUTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long cpuTime;
	/**
	 * The current state that the process is in.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "State")
	@CWMPParameter(activeNotify = "canDeny")
	public String state;

	public Process() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the Process Identifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPid() {
		return pid;
	}

	/**
	 * Set the Process Identifier.
	 *
	 * @since 2.0
	 * @param pid the input value
	 */
	public void  setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * Set the Process Identifier.
	 *
	 * @since 2.0
	 * @param pid the input value
	 * @return this instance
	 */
	public Process withPid(Long pid) {
		this.pid = pid;
		return this;
	}

	/**
	 * Get the name of the command that has caused the process to exist.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * Set the name of the command that has caused the process to exist.
	 *
	 * @since 2.0
	 * @param command the input value
	 */
	public void  setCommand(String command) {
		this.command = command;
	}

	/**
	 * Set the name of the command that has caused the process to exist.
	 *
	 * @since 2.0
	 * @param command the input value
	 * @return this instance
	 */
	public Process withCommand(String command) {
		this.command = command;
		return this;
	}

	/**
	 * Get the size in kilobytes of the memory occupied by the process.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * Set the size in kilobytes of the memory occupied by the process.
	 *
	 * @since 2.0
	 * @param size the input value
	 */
	public void  setSize(Long size) {
		this.size = size;
	}

	/**
	 * Set the size in kilobytes of the memory occupied by the process.
	 *
	 * @since 2.0
	 * @param size the input value
	 * @return this instance
	 */
	public Process withSize(Long size) {
		this.size = size;
		return this;
	}

	/**
	 * Get the priority of the process where 0 is highest.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of the process where 0 is highest.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of the process where 0 is highest.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public Process withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the amount of time in milliseconds that the process has spent taking up CPU time since the process was started.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCpuTime() {
		return cpuTime;
	}

	/**
	 * Set the amount of time in milliseconds that the process has spent taking up CPU time since the process was started.
	 *
	 * @since 2.0
	 * @param cpuTime the input value
	 */
	public void  setCpuTime(Long cpuTime) {
		this.cpuTime = cpuTime;
	}

	/**
	 * Set the amount of time in milliseconds that the process has spent taking up CPU time since the process was started.
	 *
	 * @since 2.0
	 * @param cpuTime the input value
	 * @return this instance
	 */
	public Process withCpuTime(Long cpuTime) {
		this.cpuTime = cpuTime;
		return this;
	}

	/**
	 * Get the current state that the process is in.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getState() {
		return state;
	}

	/**
	 * Set the current state that the process is in.
	 *
	 * @since 2.0
	 * @param state the input value
	 */
	public void  setState(String state) {
		this.state = state;
	}

	/**
	 * Set the current state that the process is in.
	 *
	 * @since 2.0
	 * @param state the input value
	 * @return this instance
	 */
	public Process withState(String state) {
		this.state = state;
		return this;
	}

	//</editor-fold>

}