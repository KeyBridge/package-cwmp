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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.deviceinfo.temperaturestatus.TemperatureSensor;

	/**
	 * Status of the temperature of the device.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.DeviceInfo.TemperatureStatus.")
public class TemperatureStatus {

	/**
	 * This object represents information that the device has obtained via sampling an internal temperature sensor.
	 */
	@XmlElementWrapper(name = "temperatureSensors")
	@XmlElement(name = "TemperatureSensor")
	public Collection<TemperatureSensor> temperatureSensors;

	public TemperatureStatus() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object represents information that the device has obtained via sampling an internal temperature sensor.
	 *
	 * @return the value
	 */
	public Collection<TemperatureSensor> getTemperatureSensors() {
		if (this.temperatureSensors == null){ this.temperatureSensors=new ArrayList<>();}
		return temperatureSensors;
	}

	/**
	 * Set the this object represents information that the device has obtained via sampling an internal temperature sensor.
	 *
	 * @param temperatureSensors the input value
	 */
	public void  setTemperatureSensors(Collection<TemperatureSensor> temperatureSensors) {
		this.temperatureSensors = temperatureSensors;
	}

	/**
	 * Set the this object represents information that the device has obtained via sampling an internal temperature sensor.
	 *
	 * @param temperatureSensor the input value
	 * @return this instance
	 */
	public TemperatureStatus withTemperatureSensor(TemperatureSensor temperatureSensor) {
		getTemperatureSensors().add(temperatureSensor);
		return this;
	}

	//</editor-fold>

}