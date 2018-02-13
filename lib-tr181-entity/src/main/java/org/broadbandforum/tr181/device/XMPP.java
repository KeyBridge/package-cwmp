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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.xmpp.Connection;

	/**
	 * The {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.XMPP.")
@XmlRootElement(name = "XMPP")
@XmlType(name = "Device.XMPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMPP {

	/**
	 * The {{object}} represents a XMPP connection between the device and a server. The {{param|Username}}, {{param|Domain}} and {{param|Resource}} comprise the full identity (JabberID) of this {{object}} for this device.
	 */
	@XmlElementWrapper(name = "Connections")
	@XmlElement(name = "Connection")
	@CWMPParameter(access = "readWrite")
	public Collection<Connection> connections;

	public XMPP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{object}} represents a XMPP connection between the device and a server. The {{param|Username}}, {{param|Domain}} and {{param|Resource}} comprise the full identity (JabberID) of this {{object}} for this device.
	 *
	 * @return the value
	 */
	public Collection<Connection> getConnections() {
		if (this.connections == null){ this.connections=new ArrayList<>();}
		return connections;
	}

	/**
	 * Set the {{object}} represents a XMPP connection between the device and a server. The {{param|Username}}, {{param|Domain}} and {{param|Resource}} comprise the full identity (JabberID) of this {{object}} for this device.
	 *
	 * @param connections the input value
	 */
	public void  setConnections(Collection<Connection> connections) {
		this.connections = connections;
	}

	/**
	 * Set the {{object}} represents a XMPP connection between the device and a server. The {{param|Username}}, {{param|Domain}} and {{param|Resource}} comprise the full identity (JabberID) of this {{object}} for this device.
	 *
	 * @param connection the input value
	 * @return this instance
	 */
	public XMPP withConnection(Connection connection) {
		getConnections().add(connection);
		return this;
	}

	//</editor-fold>

}