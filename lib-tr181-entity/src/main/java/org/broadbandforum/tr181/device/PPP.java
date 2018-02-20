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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ppp.Interface;

	/**
	 * Point-to-Point Protocol {{bibref|RFC1661}}. This object contains the {{object|Interface}} table.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.PPP.")
@XmlRootElement(name = "Device.PPP")
@XmlType(name = "Device.PPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class PPP {

	/**
	 * The Network Control Protocols (NCPs) that are supported by the device. 

Enumerated value must be one of [ATCP, IPCP, IPXCP, NBFCP, IPv6CP]

          Note that {{enum|IPv6CP}} is an IPv6 capability.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SupportedNCPs")
	@XmlList
	public Collection<String> supportedNCPs;
	/**
	 * PPP interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public Collection<Interface> interfaces;

	public PPP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the Network Control Protocols (NCPs) that are supported by the device. 

Enumerated value must be one of [ATCP, IPCP, IPXCP, NBFCP, IPv6CP]

          Note that {{enum|IPv6CP}} is an IPv6 capability.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getSupportedNCPs() {
		if (this.supportedNCPs == null){ this.supportedNCPs=new ArrayList<>();}
		return supportedNCPs;
	}

	/**
	 * Set the Network Control Protocols (NCPs) that are supported by the device. 

Enumerated value must be one of [ATCP, IPCP, IPXCP, NBFCP, IPv6CP]

          Note that {{enum|IPv6CP}} is an IPv6 capability.
	 *
	 * @since 2.2
	 * @param supportedNCPs the input value
	 */
	public void  setSupportedNCPs(Collection<String> supportedNCPs) {
		this.supportedNCPs = supportedNCPs;
	}

	/**
	 * Set the Network Control Protocols (NCPs) that are supported by the device. 

Enumerated value must be one of [ATCP, IPCP, IPXCP, NBFCP, IPv6CP]

          Note that {{enum|IPv6CP}} is an IPv6 capability.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public PPP withSupportedNCPs(String string) {
		getSupportedNCPs().add(string);
		return this;
	}

	/**
	 * Get the ppp interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the ppp interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the ppp interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public PPP withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	//</editor-fold>

}