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
package org.broadbandforum.tr181.device.fap;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.fap.perfmgmt.Config;

	/**
	 * This object contains parameters relating to Performance Management in a Femto-related environment.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.PerfMgmt.")
@XmlRootElement(name = "PerfMgmt")
@XmlType(name = "Device.FAP.PerfMgmt")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerfMgmt {

	/**
	 * This object contains parameters relating to File Management configuration for uploading of Performance Files to a designated File Server. Each table entry can be referenced by zero or more radio-specific objects contained in the FAPService instances. The periodic upload will upload data for all of the radio-specific objects that reference it.
	 */
	@XmlElementWrapper(name = "Configs")
	@XmlElement(name = "Config")
	@CWMPParameter(access = "readWrite")
	public Collection<Config> configs;

	public PerfMgmt() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to File Management configuration for uploading of Performance Files to a designated File Server. Each table entry can be referenced by zero or more radio-specific objects contained in the FAPService instances. The periodic upload will upload data for all of the radio-specific objects that reference it.
	 *
	 * @return the value
	 */
	public Collection<Config> getConfigs() {
		if (this.configs == null){ this.configs=new ArrayList<>();}
		return configs;
	}

	/**
	 * Set the this object contains parameters relating to File Management configuration for uploading of Performance Files to a designated File Server. Each table entry can be referenced by zero or more radio-specific objects contained in the FAPService instances. The periodic upload will upload data for all of the radio-specific objects that reference it.
	 *
	 * @param configs the input value
	 */
	public void  setConfigs(Collection<Config> configs) {
		this.configs = configs;
	}

	/**
	 * Set the this object contains parameters relating to File Management configuration for uploading of Performance Files to a designated File Server. Each table entry can be referenced by zero or more radio-specific objects contained in the FAPService instances. The periodic upload will upload data for all of the radio-specific objects that reference it.
	 *
	 * @param config the input value
	 * @return this instance
	 */
	public PerfMgmt withConfig(Config config) {
		getConfigs().add(config);
		return this;
	}

	//</editor-fold>

}