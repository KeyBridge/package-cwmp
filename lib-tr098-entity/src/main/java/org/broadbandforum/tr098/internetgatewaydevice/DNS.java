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
package org.broadbandforum.tr098.internetgatewaydevice;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.dns.SD;

	/**
	 * Properties for Domain Name Service (DNS). It contains the Service Discovery (DNS-SD) objects.
	 *
	 * @since 1.12
	 */
@CWMPObject(name = "InternetGatewayDevice.DNS.")
public class DNS {

	/**
	 * This object contains the DNS Service Discovery {{bibref|DNS-SD}} object and parameters necessary to discover services and their associated devices.

Upon reboot the the contents of the service table are repopulated. When the DNS.SD service is disabled, the contents of the service table is implementation specific.
	 */
	@XmlElement(name = "SD")
	public SD sd;

	public DNS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains the DNS Service Discovery {{bibref|DNS-SD}} object and parameters necessary to discover services and their associated devices.

Upon reboot the the contents of the service table are repopulated. When the DNS.SD service is disabled, the contents of the service table is implementation specific.
	 *
	 * @return the value
	 */
	public SD getSd() {
		return sd;
	}

	/**
	 * Set the this object contains the DNS Service Discovery {{bibref|DNS-SD}} object and parameters necessary to discover services and their associated devices.

Upon reboot the the contents of the service table are repopulated. When the DNS.SD service is disabled, the contents of the service table is implementation specific.
	 *
	 * @param sd the input value
	 */
	public void  setSd(SD sd) {
		this.sd = sd;
	}

	/**
	 * Set the this object contains the DNS Service Discovery {{bibref|DNS-SD}} object and parameters necessary to discover services and their associated devices.

Upon reboot the the contents of the service table are repopulated. When the DNS.SD service is disabled, the contents of the service table is implementation specific.
	 *
	 * @param sd the input value
	 * @return this instance
	 */
	public DNS withSd(SD sd) {
		this.sd = sd;
		return this;
	}

	//</editor-fold>

}