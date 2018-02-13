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
package org.broadbandforum.tr106.device.lan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains statistics for the default IP interface.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.LAN.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "Device.LAN.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The time in seconds that this IP interface has been connected.

* If the IP interface is using DHCP, this is the time that the DHCP client has been only in the Bound or Renewing states and the lower-layer interface has continuously maintained a link.

* If the IP interface is using static addressing, this is the time that the lower-layer interface has continuously maintained a link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionUpTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long connectionUpTime;
	/**
	 * Total number of IP payload bytes sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesSent;
	/**
	 * Total number of IP payload bytes received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesReceived;
	/**
	 * Total number of IP packets sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsSent;
	/**
	 * Total number of IP packets received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalPacketsReceived;
	/**
	 * Number of seconds since the beginning of the period used for collection of CurrentDay statistics.

The device MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not need to do so.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayInterval")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayInterval;
	/**
	 * Total number of IP payload bytes sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayBytesSent;
	/**
	 * Total number of IP payload bytes received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayBytesReceived;
	/**
	 * Total number of IP packets sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayPacketsSent;
	/**
	 * Total number of IP packets received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayPacketsReceived;
	/**
	 * Number of seconds since the beginning of the period used for collection of QuarterHour statistics.

The device MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not need to do so.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourInterval")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourInterval;
	/**
	 * Total number of IP payload bytes sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourBytesSent;
	/**
	 * Total number of IP payload bytes received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourBytesReceived;
	/**
	 * Total number of IP packets sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourPacketsSent;
	/**
	 * Total number of IP packets received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the time in seconds that this IP interface has been connected.

* If the IP interface is using DHCP, this is the time that the DHCP client has been only in the Bound or Renewing states and the lower-layer interface has continuously maintained a link.

* If the IP interface is using static addressing, this is the time that the lower-layer interface has continuously maintained a link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getConnectionUpTime() {
		return connectionUpTime;
	}

	/**
	 * Set the time in seconds that this IP interface has been connected.

* If the IP interface is using DHCP, this is the time that the DHCP client has been only in the Bound or Renewing states and the lower-layer interface has continuously maintained a link.

* If the IP interface is using static addressing, this is the time that the lower-layer interface has continuously maintained a link.
	 *
	 * @since 1.0
	 * @param connectionUpTime the input value
	 */
	public void  setConnectionUpTime(Long connectionUpTime) {
		this.connectionUpTime = connectionUpTime;
	}

	/**
	 * Set the time in seconds that this IP interface has been connected.

* If the IP interface is using DHCP, this is the time that the DHCP client has been only in the Bound or Renewing states and the lower-layer interface has continuously maintained a link.

* If the IP interface is using static addressing, this is the time that the lower-layer interface has continuously maintained a link.
	 *
	 * @since 1.0
	 * @param connectionUpTime the input value
	 * @return this instance
	 */
	public Stats withConnectionUpTime(Long connectionUpTime) {
		this.connectionUpTime = connectionUpTime;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public Stats withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public Stats withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the total number of IP packets sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsSent() {
		return totalPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 */
	public void  setTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalPacketsSent the input value
	 * @return this instance
	 */
	public Stats withTotalPacketsSent(Long totalPacketsSent) {
		this.totalPacketsSent = totalPacketsSent;
		return this;
	}

	/**
	 * Get the total number of IP packets received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalPacketsReceived() {
		return totalPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 */
	public void  setTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the device was last restarted as specified in {{param|.DeviceInfo.UpTime}}.
	 *
	 * @since 1.0
	 * @param totalPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withTotalPacketsReceived(Long totalPacketsReceived) {
		this.totalPacketsReceived = totalPacketsReceived;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of CurrentDay statistics.

The device MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not need to do so.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayInterval() {
		return currentDayInterval;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of CurrentDay statistics.

The device MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not need to do so.
	 *
	 * @since 1.0
	 * @param currentDayInterval the input value
	 */
	public void  setCurrentDayInterval(Long currentDayInterval) {
		this.currentDayInterval = currentDayInterval;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of CurrentDay statistics.

The device MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not need to do so.
	 *
	 * @since 1.0
	 * @param currentDayInterval the input value
	 * @return this instance
	 */
	public Stats withCurrentDayInterval(Long currentDayInterval) {
		this.currentDayInterval = currentDayInterval;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayBytesSent() {
		return currentDayBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayBytesSent the input value
	 */
	public void  setCurrentDayBytesSent(Long currentDayBytesSent) {
		this.currentDayBytesSent = currentDayBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayBytesSent the input value
	 * @return this instance
	 */
	public Stats withCurrentDayBytesSent(Long currentDayBytesSent) {
		this.currentDayBytesSent = currentDayBytesSent;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayBytesReceived() {
		return currentDayBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayBytesReceived the input value
	 */
	public void  setCurrentDayBytesReceived(Long currentDayBytesReceived) {
		this.currentDayBytesReceived = currentDayBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayBytesReceived the input value
	 * @return this instance
	 */
	public Stats withCurrentDayBytesReceived(Long currentDayBytesReceived) {
		this.currentDayBytesReceived = currentDayBytesReceived;
		return this;
	}

	/**
	 * Get the total number of IP packets sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayPacketsSent() {
		return currentDayPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayPacketsSent the input value
	 */
	public void  setCurrentDayPacketsSent(Long currentDayPacketsSent) {
		this.currentDayPacketsSent = currentDayPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayPacketsSent the input value
	 * @return this instance
	 */
	public Stats withCurrentDayPacketsSent(Long currentDayPacketsSent) {
		this.currentDayPacketsSent = currentDayPacketsSent;
		return this;
	}

	/**
	 * Get the total number of IP packets received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayPacketsReceived() {
		return currentDayPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayPacketsReceived the input value
	 */
	public void  setCurrentDayPacketsReceived(Long currentDayPacketsReceived) {
		this.currentDayPacketsReceived = currentDayPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the beginning of the current-day interval as specified by {{param|CurrentDayInterval}}.
	 *
	 * @since 1.0
	 * @param currentDayPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withCurrentDayPacketsReceived(Long currentDayPacketsReceived) {
		this.currentDayPacketsReceived = currentDayPacketsReceived;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of QuarterHour statistics.

The device MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not need to do so.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourInterval() {
		return quarterHourInterval;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of QuarterHour statistics.

The device MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not need to do so.
	 *
	 * @since 1.0
	 * @param quarterHourInterval the input value
	 */
	public void  setQuarterHourInterval(Long quarterHourInterval) {
		this.quarterHourInterval = quarterHourInterval;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of QuarterHour statistics.

The device MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not need to do so.
	 *
	 * @since 1.0
	 * @param quarterHourInterval the input value
	 * @return this instance
	 */
	public Stats withQuarterHourInterval(Long quarterHourInterval) {
		this.quarterHourInterval = quarterHourInterval;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourBytesSent() {
		return quarterHourBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourBytesSent the input value
	 */
	public void  setQuarterHourBytesSent(Long quarterHourBytesSent) {
		this.quarterHourBytesSent = quarterHourBytesSent;
	}

	/**
	 * Set the total number of IP payload bytes sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourBytesSent the input value
	 * @return this instance
	 */
	public Stats withQuarterHourBytesSent(Long quarterHourBytesSent) {
		this.quarterHourBytesSent = quarterHourBytesSent;
		return this;
	}

	/**
	 * Get the total number of IP payload bytes received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourBytesReceived() {
		return quarterHourBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourBytesReceived the input value
	 */
	public void  setQuarterHourBytesReceived(Long quarterHourBytesReceived) {
		this.quarterHourBytesReceived = quarterHourBytesReceived;
	}

	/**
	 * Set the total number of IP payload bytes received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourBytesReceived the input value
	 * @return this instance
	 */
	public Stats withQuarterHourBytesReceived(Long quarterHourBytesReceived) {
		this.quarterHourBytesReceived = quarterHourBytesReceived;
		return this;
	}

	/**
	 * Get the total number of IP packets sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourPacketsSent() {
		return quarterHourPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourPacketsSent the input value
	 */
	public void  setQuarterHourPacketsSent(Long quarterHourPacketsSent) {
		this.quarterHourPacketsSent = quarterHourPacketsSent;
	}

	/**
	 * Set the total number of IP packets sent over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourPacketsSent the input value
	 * @return this instance
	 */
	public Stats withQuarterHourPacketsSent(Long quarterHourPacketsSent) {
		this.quarterHourPacketsSent = quarterHourPacketsSent;
		return this;
	}

	/**
	 * Get the total number of IP packets received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourPacketsReceived() {
		return quarterHourPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourPacketsReceived the input value
	 */
	public void  setQuarterHourPacketsReceived(Long quarterHourPacketsReceived) {
		this.quarterHourPacketsReceived = quarterHourPacketsReceived;
	}

	/**
	 * Set the total number of IP packets received over this interface since the beginning of the quarter-hour interval as specified by {{param|QuarterHourInterval}}.
	 *
	 * @since 1.0
	 * @param quarterHourPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withQuarterHourPacketsReceived(Long quarterHourPacketsReceived) {
		this.quarterHourPacketsReceived = quarterHourPacketsReceived;
		return this;
	}

	//</editor-fold>

}