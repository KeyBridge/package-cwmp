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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.dlna.Capabilities;

	/**
	 * This object contains all DLNA related objects and parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DLNA.")
public class DLNA {

	/**
	 * DLNA capabilities.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;

	public DLNA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the dlnA capabilities.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the dlnA capabilities.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the dlnA capabilities.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public DLNA withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	//</editor-fold>

}