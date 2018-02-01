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
package org.broadbandforum.tr181.device.ieee1905.al;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ChangeLog;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.IEEE1905Device;

	/**
	 * This object represents the 1905 Network Topology capabilities of this device.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.")
public class NetworkTopology {

	/**
	 * Enables or disables the 1905 Network Topology reporting (via TR-069). When {{true}}, the device clears and (re)populates the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables. When {{false}}, the contents of the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables have no meaning.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * When {{param|Enable}} is set to {{true}}, this parameter indicates the transient phase of the discovery of the {{object}}. 

          {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The maximum number of entries allowed in the {{object|ChangeLog}} table.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MaxChangeLogEntries")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long maxChangeLogEntries;
	/**
	 * {{reference}} If the {{object|ChangeLog}} is modified the parameter is modified to reflect the last entry added to the {{object|ChangeLog}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LastChange")
	@Size(max = 256)
	public String lastChange;
	/**
	 * This object represents log entries for changes in the 1905 Network Topology. The Change Log is a First In First Out queue where the oldest entries (defined by values of the {{param|TimeStamp}} parameter) are deleted once the log is full.
	 */
	@XmlElementWrapper(name = "ChangeLogs")
	@XmlElement(name = "ChangeLog")
	public Collection<ChangeLog> changeLogs;
	/**
	 * This object represents an instance of discovered 1905 Devices in the network (received Topology discovery message as defined in {{bibref|IEEE1905.1a|Clause 6.3.1}}).
	 */
	@XmlElementWrapper(name = "IEEE1905Devices")
	@XmlElement(name = "IEEE1905Device")
	public Collection<IEEE1905Device> ieeE1905Devices;

	public NetworkTopology() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the 1905 Network Topology reporting (via TR-069). When {{true}}, the device clears and (re)populates the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables. When {{false}}, the contents of the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables have no meaning.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the 1905 Network Topology reporting (via TR-069). When {{true}}, the device clears and (re)populates the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables. When {{false}}, the contents of the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables have no meaning.
	 *
	 * @since 2.9
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the 1905 Network Topology reporting (via TR-069). When {{true}}, the device clears and (re)populates the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables. When {{false}}, the contents of the {{object|IEEE1905Device}} and {{object|ChangeLog}} tables have no meaning.
	 *
	 * @since 2.9
	 * @param enable the input value
	 * @return this instance
	 */
	public NetworkTopology withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the when {{param|Enable}} is set to {{true}}, this parameter indicates the transient phase of the discovery of the {{object}}. 

          {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the when {{param|Enable}} is set to {{true}}, this parameter indicates the transient phase of the discovery of the {{object}}. 

          {{enum}}
	 *
	 * @since 2.9
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the when {{param|Enable}} is set to {{true}}, this parameter indicates the transient phase of the discovery of the {{object}}. 

          {{enum}}
	 *
	 * @since 2.9
	 * @param status the input value
	 * @return this instance
	 */
	public NetworkTopology withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the maximum number of entries allowed in the {{object|ChangeLog}} table.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMaxChangeLogEntries() {
		return maxChangeLogEntries;
	}

	/**
	 * Set the maximum number of entries allowed in the {{object|ChangeLog}} table.
	 *
	 * @since 2.9
	 * @param maxChangeLogEntries the input value
	 */
	public void  setMaxChangeLogEntries(Long maxChangeLogEntries) {
		this.maxChangeLogEntries = maxChangeLogEntries;
	}

	/**
	 * Set the maximum number of entries allowed in the {{object|ChangeLog}} table.
	 *
	 * @since 2.9
	 * @param maxChangeLogEntries the input value
	 * @return this instance
	 */
	public NetworkTopology withMaxChangeLogEntries(Long maxChangeLogEntries) {
		this.maxChangeLogEntries = maxChangeLogEntries;
		return this;
	}

	/**
	 * Get the {{reference}} If the {{object|ChangeLog}} is modified the parameter is modified to reflect the last entry added to the {{object|ChangeLog}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getLastChange() {
		return lastChange;
	}

	/**
	 * Set the {{reference}} If the {{object|ChangeLog}} is modified the parameter is modified to reflect the last entry added to the {{object|ChangeLog}}.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 */
	public void  setLastChange(String lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the {{reference}} If the {{object|ChangeLog}} is modified the parameter is modified to reflect the last entry added to the {{object|ChangeLog}}.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 * @return this instance
	 */
	public NetworkTopology withLastChange(String lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the this object represents log entries for changes in the 1905 Network Topology. The Change Log is a First In First Out queue where the oldest entries (defined by values of the {{param|TimeStamp}} parameter) are deleted once the log is full.
	 *
	 * @return the value
	 */
	public Collection<ChangeLog> getChangeLogs() {
		if (this.changeLogs == null){ this.changeLogs=new ArrayList<>();}
		return changeLogs;
	}

	/**
	 * Set the this object represents log entries for changes in the 1905 Network Topology. The Change Log is a First In First Out queue where the oldest entries (defined by values of the {{param|TimeStamp}} parameter) are deleted once the log is full.
	 *
	 * @param changeLogs the input value
	 */
	public void  setChangeLogs(Collection<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

	/**
	 * Set the this object represents log entries for changes in the 1905 Network Topology. The Change Log is a First In First Out queue where the oldest entries (defined by values of the {{param|TimeStamp}} parameter) are deleted once the log is full.
	 *
	 * @param changeLog the input value
	 * @return this instance
	 */
	public NetworkTopology withChangeLog(ChangeLog changeLog) {
		getChangeLogs().add(changeLog);
		return this;
	}

	/**
	 * Get the this object represents an instance of discovered 1905 Devices in the network (received Topology discovery message as defined in {{bibref|IEEE1905.1a|Clause 6.3.1}}).
	 *
	 * @return the value
	 */
	public Collection<IEEE1905Device> getIeeE1905Devices() {
		if (this.ieeE1905Devices == null){ this.ieeE1905Devices=new ArrayList<>();}
		return ieeE1905Devices;
	}

	/**
	 * Set the this object represents an instance of discovered 1905 Devices in the network (received Topology discovery message as defined in {{bibref|IEEE1905.1a|Clause 6.3.1}}).
	 *
	 * @param ieeE1905Devices the input value
	 */
	public void  setIeeE1905Devices(Collection<IEEE1905Device> ieeE1905Devices) {
		this.ieeE1905Devices = ieeE1905Devices;
	}

	/**
	 * Set the this object represents an instance of discovered 1905 Devices in the network (received Topology discovery message as defined in {{bibref|IEEE1905.1a|Clause 6.3.1}}).
	 *
	 * @param ieeE1905Device the input value
	 * @return this instance
	 */
	public NetworkTopology withIEEE1905Device(IEEE1905Device ieeE1905Device) {
		getIeeE1905Devices().add(ieeE1905Device);
		return this;
	}

	//</editor-fold>

}