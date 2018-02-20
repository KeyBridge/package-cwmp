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
import org.broadbandforum.tr181.device.hpna.Diagnostics;
import org.broadbandforum.tr181.device.hpna.Interface;

	/**
	 * HPNA object that contains the {{object|Interface}} and {{object|Diagnostics}} objects. The HPNA (also known as HomePNA) industry standard {{bibref|G.9954}} defines peer to peer communication for home networking over existing coax cables and telephone wiring within the home.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.HPNA.")
@XmlRootElement(name = "Device.HPNA")
@XmlType(name = "Device.HPNA")
@XmlAccessorType(XmlAccessType.FIELD)
public class HPNA {

	/**
	 * HPNA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of an HPNA interface {{bibref|G.9954}}.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * The HPNA Diagnostics object.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;

	public HPNA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the hpnA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of an HPNA interface {{bibref|G.9954}}.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the hpnA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of an HPNA interface {{bibref|G.9954}}.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the hpnA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of an HPNA interface {{bibref|G.9954}}.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public HPNA withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the HPNA Diagnostics object.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the HPNA Diagnostics object.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the HPNA Diagnostics object.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public HPNA withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

	//</editor-fold>

}