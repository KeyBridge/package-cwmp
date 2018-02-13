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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.smartcardreaders.SmartCardReader;

	/**
	 * SmartCardReaders object that contains the {{object|SmartCardReader}} table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.SmartCardReaders.")
@XmlRootElement(name = "SmartCardReaders")
@XmlType(name = "Device.SmartCardReaders")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartCardReaders {

	/**
	 * This object describes the characteristics of the smart card reader.
	 */
	@XmlElementWrapper(name = "SmartCardReaders")
	@XmlElement(name = "SmartCardReader")
	public Collection<SmartCardReader> smartCardReaders;

	public SmartCardReaders() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object describes the characteristics of the smart card reader.
	 *
	 * @return the value
	 */
	public Collection<SmartCardReader> getSmartCardReaders() {
		if (this.smartCardReaders == null){ this.smartCardReaders=new ArrayList<>();}
		return smartCardReaders;
	}

	/**
	 * Set the this object describes the characteristics of the smart card reader.
	 *
	 * @param smartCardReaders the input value
	 */
	public void  setSmartCardReaders(Collection<SmartCardReader> smartCardReaders) {
		this.smartCardReaders = smartCardReaders;
	}

	/**
	 * Set the this object describes the characteristics of the smart card reader.
	 *
	 * @param smartCardReader the input value
	 * @return this instance
	 */
	public SmartCardReaders withSmartCardReader(SmartCardReader smartCardReader) {
		getSmartCardReaders().add(smartCardReader);
		return this;
	}

	//</editor-fold>

}