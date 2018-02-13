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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.dns.Client;
import org.broadbandforum.tr181.device.dns.Diagnostics;
import org.broadbandforum.tr181.device.dns.Relay;
import org.broadbandforum.tr181.device.dns.SD;

	/**
	 * Properties for Domain Name Service (DNS).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.")
@XmlRootElement(name = "DNS")
@XmlType(name = "Device.DNS")
@XmlAccessorType(XmlAccessType.FIELD)
public class DNS {

	/**
	 * The DNS record types that are supported by the device. 

Enumerated value must be one of [A, AAAA, SRV, PTR]
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SupportedRecordTypes")
	@XmlList
	public Collection<String> supportedRecordTypes;
	/**
	 * Client properties for Domain Name Service (DNS). The DNS client resolves FQDN on behalf of device internal (client) applications.
	 */
	@XmlElement(name = "Client")
	public Client client;
	/**
	 * DNS Relay object. The DNS proxy (or relay) function allows the forwarding of local network DNS queries to local or external DNS server(s) {{bibref|RFC5625}}.
	 */
	@XmlElement(name = "Relay")
	public Relay relay;
	/**
	 * The DNS Diagnostics object containing the {{object|NSLookupDiagnostics}} test.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;
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
	 * Get the DNS record types that are supported by the device. 

Enumerated value must be one of [A, AAAA, SRV, PTR]
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getSupportedRecordTypes() {
		if (this.supportedRecordTypes == null){ this.supportedRecordTypes=new ArrayList<>();}
		return supportedRecordTypes;
	}

	/**
	 * Set the DNS record types that are supported by the device. 

Enumerated value must be one of [A, AAAA, SRV, PTR]
	 *
	 * @since 2.2
	 * @param supportedRecordTypes the input value
	 */
	public void  setSupportedRecordTypes(Collection<String> supportedRecordTypes) {
		this.supportedRecordTypes = supportedRecordTypes;
	}

	/**
	 * Set the DNS record types that are supported by the device. 

Enumerated value must be one of [A, AAAA, SRV, PTR]
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public DNS withSupportedRecordTypes(String string) {
		getSupportedRecordTypes().add(string);
		return this;
	}

	/**
	 * Get the client properties for Domain Name Service (DNS). The DNS client resolves FQDN on behalf of device internal (client) applications.
	 *
	 * @return the value
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Set the client properties for Domain Name Service (DNS). The DNS client resolves FQDN on behalf of device internal (client) applications.
	 *
	 * @param client the input value
	 */
	public void  setClient(Client client) {
		this.client = client;
	}

	/**
	 * Set the client properties for Domain Name Service (DNS). The DNS client resolves FQDN on behalf of device internal (client) applications.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public DNS withClient(Client client) {
		this.client = client;
		return this;
	}

	/**
	 * Get the dns Relay object. The DNS proxy (or relay) function allows the forwarding of local network DNS queries to local or external DNS server(s) {{bibref|RFC5625}}.
	 *
	 * @return the value
	 */
	public Relay getRelay() {
		return relay;
	}

	/**
	 * Set the dns Relay object. The DNS proxy (or relay) function allows the forwarding of local network DNS queries to local or external DNS server(s) {{bibref|RFC5625}}.
	 *
	 * @param relay the input value
	 */
	public void  setRelay(Relay relay) {
		this.relay = relay;
	}

	/**
	 * Set the dns Relay object. The DNS proxy (or relay) function allows the forwarding of local network DNS queries to local or external DNS server(s) {{bibref|RFC5625}}.
	 *
	 * @param relay the input value
	 * @return this instance
	 */
	public DNS withRelay(Relay relay) {
		this.relay = relay;
		return this;
	}

	/**
	 * Get the DNS Diagnostics object containing the {{object|NSLookupDiagnostics}} test.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the DNS Diagnostics object containing the {{object|NSLookupDiagnostics}} test.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the DNS Diagnostics object containing the {{object|NSLookupDiagnostics}} test.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public DNS withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

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