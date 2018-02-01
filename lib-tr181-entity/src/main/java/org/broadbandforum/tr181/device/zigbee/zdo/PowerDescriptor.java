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
package org.broadbandforum.tr181.device.zigbee.zdo;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The {{object}} object describes the power capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.4 Node Power Descriptor}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.PowerDescriptor.")
public class PowerDescriptor {

	/**
	 * Specifies the current sleep/power-saving mode of the ZigBee device.

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CurrentPowerMode")
	public String currentPowerMode;
	/**
	 * Specifies the power sources available on this ZigBee device.

          {{list}} 

Enumerated value must be one of [Constant, Rechargeable, Disposable]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "AvailablePowerSource")
	@XmlList
	public Collection<String> availablePowerSource;
	/**
	 * The current power source field specifies the current power source being utilized by the node.

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CurrentPowerSource")
	public String currentPowerSource;
	/**
	 * Specifies the level of charge of the current power source.

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CurrentPowerSourceLevel")
	public String currentPowerSourceLevel;

	public PowerDescriptor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies the current sleep/power-saving mode of the ZigBee device.

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getCurrentPowerMode() {
		return currentPowerMode;
	}

	/**
	 * Set the specifies the current sleep/power-saving mode of the ZigBee device.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerMode the input value
	 */
	public void  setCurrentPowerMode(String currentPowerMode) {
		this.currentPowerMode = currentPowerMode;
	}

	/**
	 * Set the specifies the current sleep/power-saving mode of the ZigBee device.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerMode the input value
	 * @return this instance
	 */
	public PowerDescriptor withCurrentPowerMode(String currentPowerMode) {
		this.currentPowerMode = currentPowerMode;
		return this;
	}

	/**
	 * Get the specifies the power sources available on this ZigBee device.

          {{list}} 

Enumerated value must be one of [Constant, Rechargeable, Disposable]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getAvailablePowerSource() {
		if (this.availablePowerSource == null){ this.availablePowerSource=new ArrayList<>();}
		return availablePowerSource;
	}

	/**
	 * Set the specifies the power sources available on this ZigBee device.

          {{list}} 

Enumerated value must be one of [Constant, Rechargeable, Disposable]
	 *
	 * @since 2.7
	 * @param availablePowerSource the input value
	 */
	public void  setAvailablePowerSource(Collection<String> availablePowerSource) {
		this.availablePowerSource = availablePowerSource;
	}

	/**
	 * Set the specifies the power sources available on this ZigBee device.

          {{list}} 

Enumerated value must be one of [Constant, Rechargeable, Disposable]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public PowerDescriptor withAvailablePowerSource(String string) {
		getAvailablePowerSource().add(string);
		return this;
	}

	/**
	 * Get the current power source field specifies the current power source being utilized by the node.

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getCurrentPowerSource() {
		return currentPowerSource;
	}

	/**
	 * Set the current power source field specifies the current power source being utilized by the node.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerSource the input value
	 */
	public void  setCurrentPowerSource(String currentPowerSource) {
		this.currentPowerSource = currentPowerSource;
	}

	/**
	 * Set the current power source field specifies the current power source being utilized by the node.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerSource the input value
	 * @return this instance
	 */
	public PowerDescriptor withCurrentPowerSource(String currentPowerSource) {
		this.currentPowerSource = currentPowerSource;
		return this;
	}

	/**
	 * Get the specifies the level of charge of the current power source.

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getCurrentPowerSourceLevel() {
		return currentPowerSourceLevel;
	}

	/**
	 * Set the specifies the level of charge of the current power source.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerSourceLevel the input value
	 */
	public void  setCurrentPowerSourceLevel(String currentPowerSourceLevel) {
		this.currentPowerSourceLevel = currentPowerSourceLevel;
	}

	/**
	 * Set the specifies the level of charge of the current power source.

          {{enum}}
	 *
	 * @since 2.7
	 * @param currentPowerSourceLevel the input value
	 * @return this instance
	 */
	public PowerDescriptor withCurrentPowerSourceLevel(String currentPowerSourceLevel) {
		this.currentPowerSourceLevel = currentPowerSourceLevel;
		return this;
	}

	//</editor-fold>

}