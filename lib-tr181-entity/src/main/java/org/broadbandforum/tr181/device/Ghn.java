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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.ghn.Diagnostics;
import org.broadbandforum.tr181.device.ghn.Interface;

	/**
	 * G.hn object that contains an {{object|Interface}} table for G.hn supported CPE. The ITU-T G.hn specifications {{bibref|G.9960}} and {{bibref|G.9961}} define Physical and MAC Layers for communication between two or more G.hn nodes in the home network over multiple wired media such as power line, phone line and coaxial cable.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.Ghn.")
public class Ghn {

	/**
	 * G.hn interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY {{bibref|G.9960}} and MAC {{bibref|G.9961}} layers of a G.hn interface.
	 */
	@XmlElementWrapper(name = "interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * The G.hn Diagnostics object.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;

	public Ghn() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the g.hn interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY {{bibref|G.9960}} and MAC {{bibref|G.9961}} layers of a G.hn interface.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the g.hn interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY {{bibref|G.9960}} and MAC {{bibref|G.9961}} layers of a G.hn interface.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the g.hn interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY {{bibref|G.9960}} and MAC {{bibref|G.9961}} layers of a G.hn interface.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Ghn withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the G.hn Diagnostics object.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the G.hn Diagnostics object.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the G.hn Diagnostics object.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public Ghn withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

	//</editor-fold>

}