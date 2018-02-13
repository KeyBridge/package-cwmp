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
package org.broadbandforum.tr181.device.deviceinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Each table entry represents a hardware or virtual processor that resides on this device.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "Device.DeviceInfo.Processor.{i}.")
@XmlRootElement(name = "Processor")
@XmlType(name = "Device.DeviceInfo.Processor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Processor {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The architecture of the processor on the underlying hardware. {{enum}} 

          For processor architectures not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Architecture")
	public String architecture;

	public Processor() {
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
	public Processor withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the architecture of the processor on the underlying hardware. {{enum}} 

          For processor architectures not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * Set the architecture of the processor on the underlying hardware. {{enum}} 

          For processor architectures not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @param architecture the input value
	 */
	public void  setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	/**
	 * Set the architecture of the processor on the underlying hardware. {{enum}} 

          For processor architectures not included in this list, the vendor MAY include vendor-specific values, which MUST use the format defined in {{bibref|TR-106a4|Section 3.3}}.
	 *
	 * @since 2.1
	 * @param architecture the input value
	 * @return this instance
	 */
	public Processor withArchitecture(String architecture) {
		this.architecture = architecture;
		return this;
	}

	//</editor-fold>

}