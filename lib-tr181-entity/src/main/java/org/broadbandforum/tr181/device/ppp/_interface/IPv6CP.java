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
package org.broadbandforum.tr181.device.ppp._interface;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.IPv6Address;

	/**
	 * IPv6 Control Protocol (IPv6CP) client object for this PPP interface {{bibref|RFC5072}}. {{object}} only applies to IPv6.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.PPP.Interface.{i}.IPv6CP.")
public class IPv6CP {

	/**
	 * The interface identifier for the local end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "LocalInterfaceIdentifier")
	public IPv6Address localInterfaceIdentifier;
	/**
	 * The interface identifier for the remote end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RemoteInterfaceIdentifier")
	public IPv6Address remoteInterfaceIdentifier;

	public IPv6CP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the interface identifier for the local end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getLocalInterfaceIdentifier() {
		return localInterfaceIdentifier;
	}

	/**
	 * Set the interface identifier for the local end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @param localInterfaceIdentifier the input value
	 */
	public void  setLocalInterfaceIdentifier(IPv6Address localInterfaceIdentifier) {
		this.localInterfaceIdentifier = localInterfaceIdentifier;
	}

	/**
	 * Set the interface identifier for the local end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @param localInterfaceIdentifier the input value
	 * @return this instance
	 */
	public IPv6CP withLocalInterfaceIdentifier(IPv6Address localInterfaceIdentifier) {
		this.localInterfaceIdentifier = localInterfaceIdentifier;
		return this;
	}

	/**
	 * Get the interface identifier for the remote end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getRemoteInterfaceIdentifier() {
		return remoteInterfaceIdentifier;
	}

	/**
	 * Set the interface identifier for the remote end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @param remoteInterfaceIdentifier the input value
	 */
	public void  setRemoteInterfaceIdentifier(IPv6Address remoteInterfaceIdentifier) {
		this.remoteInterfaceIdentifier = remoteInterfaceIdentifier;
	}

	/**
	 * Set the interface identifier for the remote end of the PPP link, negotiated using the IPv6CP ''Interface-Identifier'' option {{bibref|RFC5072|Section 4.1}}.

          The identifier is represented as the rightmost 64 bits of an IPv6 address (the leftmost 64 bits MUST be zero and MUST be ignored by the recipient).
	 *
	 * @since 2.2
	 * @param remoteInterfaceIdentifier the input value
	 * @return this instance
	 */
	public IPv6CP withRemoteInterfaceIdentifier(IPv6Address remoteInterfaceIdentifier) {
		this.remoteInterfaceIdentifier = remoteInterfaceIdentifier;
		return this;
	}

	//</editor-fold>

}