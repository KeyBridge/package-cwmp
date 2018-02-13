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
package org.broadbandforum.tr140.storageservice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides general LAN network information about this device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.NetInfo.")
@XmlRootElement(name = "NetInfo")
@XmlType(name = "StorageService.NetInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class NetInfo {

	/**
	 * Logical name which identifies the device on the local network.  This is the first segment of a fully qualified domain name (FQDN).  Combining {{param}}, a "." and the {{param|DomainName}} will result in a fully qualified domain name.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HostName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String hostName;
	/**
	 * Domain name for the device on the local network.  Combining {{param|HostName}}, a "." and {{param}} will result in a fully qualified domain name (FQDN).  For example, if the HostName contains "myLaptop" and the DomainName contains "dsl.sp1.com", then the FQDN would be "myLaptop.dsl.sp1.com".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DomainName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String domainName;

	public NetInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the logical name which identifies the device on the local network.  This is the first segment of a fully qualified domain name (FQDN).  Combining {{param}}, a "." and the {{param|DomainName}} will result in a fully qualified domain name.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Set the logical name which identifies the device on the local network.  This is the first segment of a fully qualified domain name (FQDN).  Combining {{param}}, a "." and the {{param|DomainName}} will result in a fully qualified domain name.
	 *
	 * @since 1.0
	 * @param hostName the input value
	 */
	public void  setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Set the logical name which identifies the device on the local network.  This is the first segment of a fully qualified domain name (FQDN).  Combining {{param}}, a "." and the {{param|DomainName}} will result in a fully qualified domain name.
	 *
	 * @since 1.0
	 * @param hostName the input value
	 * @return this instance
	 */
	public NetInfo withHostName(String hostName) {
		this.hostName = hostName;
		return this;
	}

	/**
	 * Get the domain name for the device on the local network.  Combining {{param|HostName}}, a "." and {{param}} will result in a fully qualified domain name (FQDN).  For example, if the HostName contains "myLaptop" and the DomainName contains "dsl.sp1.com", then the FQDN would be "myLaptop.dsl.sp1.com".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Set the domain name for the device on the local network.  Combining {{param|HostName}}, a "." and {{param}} will result in a fully qualified domain name (FQDN).  For example, if the HostName contains "myLaptop" and the DomainName contains "dsl.sp1.com", then the FQDN would be "myLaptop.dsl.sp1.com".
	 *
	 * @since 1.0
	 * @param domainName the input value
	 */
	public void  setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the domain name for the device on the local network.  Combining {{param|HostName}}, a "." and {{param}} will result in a fully qualified domain name (FQDN).  For example, if the HostName contains "myLaptop" and the DomainName contains "dsl.sp1.com", then the FQDN would be "myLaptop.dsl.sp1.com".
	 *
	 * @since 1.0
	 * @param domainName the input value
	 * @return this instance
	 */
	public NetInfo withDomainName(String domainName) {
		this.domainName = domainName;
		return this;
	}

	//</editor-fold>

}