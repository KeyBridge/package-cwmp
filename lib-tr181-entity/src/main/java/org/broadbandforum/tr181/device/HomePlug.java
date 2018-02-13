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
import org.broadbandforum.tr181.device.homeplug.Interface;

	/**
	 * HomePlug object that contains the {{object|Interface}} table. The HomePlug industry standard {{bibref|HPAV1.1}} defines peer to peer communication over powerline medium.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HomePlug.")
@XmlRootElement(name = "Device.HomePlug")
@XmlType(name = "Device.HomePlug")
@XmlAccessorType(XmlAccessType.FIELD)
public class HomePlug {

	/**
	 * HomePlug interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a HomePlug interface {{bibref|HPAV1.1}}.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;

	public HomePlug() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the homePlug interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a HomePlug interface {{bibref|HPAV1.1}}.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the homePlug interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a HomePlug interface {{bibref|HPAV1.1}}.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the homePlug interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a HomePlug interface {{bibref|HPAV1.1}}.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public HomePlug withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	//</editor-fold>

}