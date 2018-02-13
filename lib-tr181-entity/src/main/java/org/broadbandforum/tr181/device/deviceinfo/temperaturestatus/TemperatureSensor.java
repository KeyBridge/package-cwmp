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
package org.broadbandforum.tr181.device.deviceinfo.temperaturestatus;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This object represents information that the device has obtained via sampling an internal temperature sensor.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.TemperatureStatus.TemperatureSensor.{i}.")
@XmlRootElement(name = "Device.DeviceInfo.TemperatureStatus.TemperatureSensor")
@XmlType(name = "Device.DeviceInfo.TemperatureStatus.TemperatureSensor")
@XmlAccessorType(XmlAccessType.FIELD)
public class TemperatureSensor {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates whether or not the temperature sensor is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this temperature sensor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * When set to {{true}}, resets the temperature sensor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * The time at which this temperature sensor was reset.

          Reset can be caused by:

          * {{param|Status}} transition from {{enum|Disabled|Status}} to {{enum|Enabled|Status}}

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the temperature sensor (including a reboot of the device).

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that this temperature sensor has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResetTime")
	public LocalDateTime resetTime;
	/**
	 * Name of this temperature sensor. This text MUST be sufficient to distinguish this temperature sensor from other temperature sensors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * This temperature sensor's last good reading in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(activeNotify = "canDeny", units = "degrees celsius")
	@Size(min = -274)
	public Integer value;
	/**
	 * The time at which this temperature sensor's last good reading was obtained. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastUpdate")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime lastUpdate;
	/**
	 * This temperature sensor's lowest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinValue")
	@Size(min = -274)
	public Integer minValue;
	/**
	 * The time at which this temperature sensor's lowest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinTime")
	public LocalDateTime minTime;
	/**
	 * This temperature sensor's highest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxValue")
	@Size(min = -274)
	public Integer maxValue;
	/**
	 * The time at which this temperature sensor's highest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTime")
	public LocalDateTime maxTime;
	/**
	 * This temperature sensor's low alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|LowAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowAlarmValue")
	@CWMPParameter(access = "readWrite", units = "degrees celsius")
	@Size(min = -274)
	public Integer lowAlarmValue;
	/**
	 * Initial time at which this temperature sensor's {{param|LowAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowAlarmTime")
	public LocalDateTime lowAlarmTime;
	/**
	 * This temperature sensor's high alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|HighAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighAlarmValue")
	@CWMPParameter(access = "readWrite", units = "degrees celsius")
	@Size(min = -274)
	public Integer highAlarmValue;
	/**
	 * The interval, measured in seconds, in which the device polls this {{object}}.

          If the value is 0 then the device selects its own polling interval.

          If the value is greater than 0 then the device MUST use this value as the polling interval.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PollingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long pollingInterval;
	/**
	 * Initial time at which this temperature sensor's {{param|HighAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighAlarmTime")
	public LocalDateTime highAlarmTime;

	public TemperatureSensor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public TemperatureSensor withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates whether or not the temperature sensor is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the indicates whether or not the temperature sensor is enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the indicates whether or not the temperature sensor is enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public TemperatureSensor withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this temperature sensor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this temperature sensor.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this temperature sensor.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public TemperatureSensor withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the when set to {{true}}, resets the temperature sensor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, resets the temperature sensor.
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, resets the temperature sensor.
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public TemperatureSensor withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the time at which this temperature sensor was reset.

          Reset can be caused by:

          * {{param|Status}} transition from {{enum|Disabled|Status}} to {{enum|Enabled|Status}}

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the temperature sensor (including a reboot of the device).

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that this temperature sensor has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getResetTime() {
		return resetTime;
	}

	/**
	 * Set the time at which this temperature sensor was reset.

          Reset can be caused by:

          * {{param|Status}} transition from {{enum|Disabled|Status}} to {{enum|Enabled|Status}}

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the temperature sensor (including a reboot of the device).

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that this temperature sensor has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @param resetTime the input value
	 */
	public void  setResetTime(LocalDateTime resetTime) {
		this.resetTime = resetTime;
	}

	/**
	 * Set the time at which this temperature sensor was reset.

          Reset can be caused by:

          * {{param|Status}} transition from {{enum|Disabled|Status}} to {{enum|Enabled|Status}}

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the temperature sensor (including a reboot of the device).

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that this temperature sensor has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @param resetTime the input value
	 * @return this instance
	 */
	public TemperatureSensor withResetTime(LocalDateTime resetTime) {
		this.resetTime = resetTime;
		return this;
	}

	/**
	 * Get the name of this temperature sensor. This text MUST be sufficient to distinguish this temperature sensor from other temperature sensors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this temperature sensor. This text MUST be sufficient to distinguish this temperature sensor from other temperature sensors.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this temperature sensor. This text MUST be sufficient to distinguish this temperature sensor from other temperature sensors.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public TemperatureSensor withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the this temperature sensor's last good reading in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * Set the this temperature sensor's last good reading in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param value the input value
	 */
	public void  setValue(Integer value) {
		this.value = value;
	}

	/**
	 * Set the this temperature sensor's last good reading in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param value the input value
	 * @return this instance
	 */
	public TemperatureSensor withValue(Integer value) {
		this.value = value;
		return this;
	}

	/**
	 * Get the time at which this temperature sensor's last good reading was obtained. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the time at which this temperature sensor's last good reading was obtained. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the time at which this temperature sensor's last good reading was obtained. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public TemperatureSensor withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get the this temperature sensor's lowest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMinValue() {
		return minValue;
	}

	/**
	 * Set the this temperature sensor's lowest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param minValue the input value
	 */
	public void  setMinValue(Integer minValue) {
		this.minValue = minValue;
	}

	/**
	 * Set the this temperature sensor's lowest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param minValue the input value
	 * @return this instance
	 */
	public TemperatureSensor withMinValue(Integer minValue) {
		this.minValue = minValue;
		return this;
	}

	/**
	 * Get the time at which this temperature sensor's lowest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getMinTime() {
		return minTime;
	}

	/**
	 * Set the time at which this temperature sensor's lowest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param minTime the input value
	 */
	public void  setMinTime(LocalDateTime minTime) {
		this.minTime = minTime;
	}

	/**
	 * Set the time at which this temperature sensor's lowest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param minTime the input value
	 * @return this instance
	 */
	public TemperatureSensor withMinTime(LocalDateTime minTime) {
		this.minTime = minTime;
		return this;
	}

	/**
	 * Get the this temperature sensor's highest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxValue() {
		return maxValue;
	}

	/**
	 * Set the this temperature sensor's highest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param maxValue the input value
	 */
	public void  setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	/**
	 * Set the this temperature sensor's highest value  reading in degrees celsius since last reset.

          A value of -274 (which is below absolute zero) indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param maxValue the input value
	 * @return this instance
	 */
	public TemperatureSensor withMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
		return this;
	}

	/**
	 * Get the time at which this temperature sensor's highest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getMaxTime() {
		return maxTime;
	}

	/**
	 * Set the time at which this temperature sensor's highest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param maxTime the input value
	 */
	public void  setMaxTime(LocalDateTime maxTime) {
		this.maxTime = maxTime;
	}

	/**
	 * Set the time at which this temperature sensor's highest value was read. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates a good reading has not been obtained since last reset.
	 *
	 * @since 2.0
	 * @param maxTime the input value
	 * @return this instance
	 */
	public TemperatureSensor withMaxTime(LocalDateTime maxTime) {
		this.maxTime = maxTime;
		return this;
	}

	/**
	 * Get the this temperature sensor's low alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|LowAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLowAlarmValue() {
		return lowAlarmValue;
	}

	/**
	 * Set the this temperature sensor's low alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|LowAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @param lowAlarmValue the input value
	 */
	public void  setLowAlarmValue(Integer lowAlarmValue) {
		this.lowAlarmValue = lowAlarmValue;
	}

	/**
	 * Set the this temperature sensor's low alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|LowAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @param lowAlarmValue the input value
	 * @return this instance
	 */
	public TemperatureSensor withLowAlarmValue(Integer lowAlarmValue) {
		this.lowAlarmValue = lowAlarmValue;
		return this;
	}

	/**
	 * Get the initial time at which this temperature sensor's {{param|LowAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLowAlarmTime() {
		return lowAlarmTime;
	}

	/**
	 * Set the initial time at which this temperature sensor's {{param|LowAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @param lowAlarmTime the input value
	 */
	public void  setLowAlarmTime(LocalDateTime lowAlarmTime) {
		this.lowAlarmTime = lowAlarmTime;
	}

	/**
	 * Set the initial time at which this temperature sensor's {{param|LowAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @param lowAlarmTime the input value
	 * @return this instance
	 */
	public TemperatureSensor withLowAlarmTime(LocalDateTime lowAlarmTime) {
		this.lowAlarmTime = lowAlarmTime;
		return this;
	}

	/**
	 * Get the this temperature sensor's high alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|HighAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHighAlarmValue() {
		return highAlarmValue;
	}

	/**
	 * Set the this temperature sensor's high alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|HighAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @param highAlarmValue the input value
	 */
	public void  setHighAlarmValue(Integer highAlarmValue) {
		this.highAlarmValue = highAlarmValue;
	}

	/**
	 * Set the this temperature sensor's high alarm value in degrees celsius.

          A value of -274 (which is below absolute zero) indicates a non configured value.

          A change to this value will cause {{param|HighAlarmTime}} to be reset.
	 *
	 * @since 2.0
	 * @param highAlarmValue the input value
	 * @return this instance
	 */
	public TemperatureSensor withHighAlarmValue(Integer highAlarmValue) {
		this.highAlarmValue = highAlarmValue;
		return this;
	}

	/**
	 * Get the interval, measured in seconds, in which the device polls this {{object}}.

          If the value is 0 then the device selects its own polling interval.

          If the value is greater than 0 then the device MUST use this value as the polling interval.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getPollingInterval() {
		return pollingInterval;
	}

	/**
	 * Set the interval, measured in seconds, in which the device polls this {{object}}.

          If the value is 0 then the device selects its own polling interval.

          If the value is greater than 0 then the device MUST use this value as the polling interval.
	 *
	 * @since 2.1
	 * @param pollingInterval the input value
	 */
	public void  setPollingInterval(Long pollingInterval) {
		this.pollingInterval = pollingInterval;
	}

	/**
	 * Set the interval, measured in seconds, in which the device polls this {{object}}.

          If the value is 0 then the device selects its own polling interval.

          If the value is greater than 0 then the device MUST use this value as the polling interval.
	 *
	 * @since 2.1
	 * @param pollingInterval the input value
	 * @return this instance
	 */
	public TemperatureSensor withPollingInterval(Long pollingInterval) {
		this.pollingInterval = pollingInterval;
		return this;
	}

	/**
	 * Get the initial time at which this temperature sensor's {{param|HighAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getHighAlarmTime() {
		return highAlarmTime;
	}

	/**
	 * Set the initial time at which this temperature sensor's {{param|HighAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @param highAlarmTime the input value
	 */
	public void  setHighAlarmTime(LocalDateTime highAlarmTime) {
		this.highAlarmTime = highAlarmTime;
	}

	/**
	 * Set the initial time at which this temperature sensor's {{param|HighAlarmValue}} was encountered.

          This value is only set the first time the alarm is seen and not changed until the next reset. 

          The Unknown Time value, as defined in {{bibref|TR-106a2}}, indicates that an alarm has not been encountered since the last reset.
	 *
	 * @since 2.0
	 * @param highAlarmTime the input value
	 * @return this instance
	 */
	public TemperatureSensor withHighAlarmTime(LocalDateTime highAlarmTime) {
		this.highAlarmTime = highAlarmTime;
		return this;
	}

	//</editor-fold>

}