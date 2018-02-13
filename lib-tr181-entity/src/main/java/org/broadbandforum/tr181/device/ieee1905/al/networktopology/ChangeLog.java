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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This object represents log entries for changes in the 1905 Network Topology. The Change Log is a First In First Out queue where the oldest entries (defined by values of the {{param|TimeStamp}} parameter) are deleted once the log is full.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.ChangeLog.{i}.")
@XmlRootElement(name = "ChangeLog")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.ChangeLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChangeLog {

	/**
	 * Date and Time at which the entry was added to the {{object}} table.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TimeStamp")
	public LocalDateTime timeStamp;
	/**
	 * Type of event for this entry. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EventType")
	public String eventType;
	/**
	 * 1905 AL MAC Address of device which reported the change.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ReporterDeviceId")
	public MACAddress reporterDeviceId;
	/**
	 * MAC Address of the interface of the reporting device on which the change has been detected.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ReporterInterfaceId")
	public MACAddress reporterInterfaceId;
	/**
	 * Type of Neighbor for this event. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NeighborType")
	public String neighborType;
	/**
	 * MAC Address of the Neighbor of this event. If the value of the {{param|EventType}} parameter is {{enum|NewNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the new Neighbor that joined the network; if the value of the {{param|EventType}} parameter is {{enum|LostNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the Neighbor that left the network.

          If value of the {{param|NeighborType}} parameter is {{enum|IEEE1905|NeighborType}}, then the value of this parameter is the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NeighborId")
	public MACAddress neighborId;

	public ChangeLog() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the date and Time at which the entry was added to the {{object}} table.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Set the date and Time at which the entry was added to the {{object}} table.
	 *
	 * @since 2.9
	 * @param timeStamp the input value
	 */
	public void  setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * Set the date and Time at which the entry was added to the {{object}} table.
	 *
	 * @since 2.9
	 * @param timeStamp the input value
	 * @return this instance
	 */
	public ChangeLog withTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	/**
	 * Get the type of event for this entry. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Set the type of event for this entry. {{enum}}
	 *
	 * @since 2.9
	 * @param eventType the input value
	 */
	public void  setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * Set the type of event for this entry. {{enum}}
	 *
	 * @since 2.9
	 * @param eventType the input value
	 * @return this instance
	 */
	public ChangeLog withEventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * Get the 1905 AL MAC Address of device which reported the change.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getReporterDeviceId() {
		return reporterDeviceId;
	}

	/**
	 * Set the 1905 AL MAC Address of device which reported the change.
	 *
	 * @since 2.9
	 * @param reporterDeviceId the input value
	 */
	public void  setReporterDeviceId(MACAddress reporterDeviceId) {
		this.reporterDeviceId = reporterDeviceId;
	}

	/**
	 * Set the 1905 AL MAC Address of device which reported the change.
	 *
	 * @since 2.9
	 * @param reporterDeviceId the input value
	 * @return this instance
	 */
	public ChangeLog withReporterDeviceId(MACAddress reporterDeviceId) {
		this.reporterDeviceId = reporterDeviceId;
		return this;
	}

	/**
	 * Get the mac Address of the interface of the reporting device on which the change has been detected.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getReporterInterfaceId() {
		return reporterInterfaceId;
	}

	/**
	 * Set the mac Address of the interface of the reporting device on which the change has been detected.
	 *
	 * @since 2.9
	 * @param reporterInterfaceId the input value
	 */
	public void  setReporterInterfaceId(MACAddress reporterInterfaceId) {
		this.reporterInterfaceId = reporterInterfaceId;
	}

	/**
	 * Set the mac Address of the interface of the reporting device on which the change has been detected.
	 *
	 * @since 2.9
	 * @param reporterInterfaceId the input value
	 * @return this instance
	 */
	public ChangeLog withReporterInterfaceId(MACAddress reporterInterfaceId) {
		this.reporterInterfaceId = reporterInterfaceId;
		return this;
	}

	/**
	 * Get the type of Neighbor for this event. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getNeighborType() {
		return neighborType;
	}

	/**
	 * Set the type of Neighbor for this event. {{enum}}
	 *
	 * @since 2.9
	 * @param neighborType the input value
	 */
	public void  setNeighborType(String neighborType) {
		this.neighborType = neighborType;
	}

	/**
	 * Set the type of Neighbor for this event. {{enum}}
	 *
	 * @since 2.9
	 * @param neighborType the input value
	 * @return this instance
	 */
	public ChangeLog withNeighborType(String neighborType) {
		this.neighborType = neighborType;
		return this;
	}

	/**
	 * Get the mac Address of the Neighbor of this event. If the value of the {{param|EventType}} parameter is {{enum|NewNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the new Neighbor that joined the network; if the value of the {{param|EventType}} parameter is {{enum|LostNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the Neighbor that left the network.

          If value of the {{param|NeighborType}} parameter is {{enum|IEEE1905|NeighborType}}, then the value of this parameter is the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getNeighborId() {
		return neighborId;
	}

	/**
	 * Set the mac Address of the Neighbor of this event. If the value of the {{param|EventType}} parameter is {{enum|NewNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the new Neighbor that joined the network; if the value of the {{param|EventType}} parameter is {{enum|LostNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the Neighbor that left the network.

          If value of the {{param|NeighborType}} parameter is {{enum|IEEE1905|NeighborType}}, then the value of this parameter is the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @param neighborId the input value
	 */
	public void  setNeighborId(MACAddress neighborId) {
		this.neighborId = neighborId;
	}

	/**
	 * Set the mac Address of the Neighbor of this event. If the value of the {{param|EventType}} parameter is {{enum|NewNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the new Neighbor that joined the network; if the value of the {{param|EventType}} parameter is {{enum|LostNeighbor|EventType}}, then the value of this parameter represents the MAC Address of the Neighbor that left the network.

          If value of the {{param|NeighborType}} parameter is {{enum|IEEE1905|NeighborType}}, then the value of this parameter is the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @param neighborId the input value
	 * @return this instance
	 */
	public ChangeLog withNeighborId(MACAddress neighborId) {
		this.neighborId = neighborId;
		return this;
	}

	//</editor-fold>

}