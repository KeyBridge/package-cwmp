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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.pcp.Client;

	/**
	 * Properties for Port Control Protocol (PCP) {{bibref|RFC6887}}.

        See the PCP Theory of Operation {{bibref|TR-181i2a8|Appendix XIV}} for a description of the working of this PCP data model.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.")
public class PCP {

	/**
	 * {{list}} Each list item denotes a PCP version supported by the PCP Client. Currently known versions are 0, 1 and 2.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SupportedVersions")
	@Size(min = 0, max = 65535)
	public Long supportedVersions;
	/**
	 * This is the version to be used in the first exchange with a new PCP Server.

          The factory default MUST be the highest supported version, as described in {{bibref|RFC6887|Section 9}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PreferredVersion")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long preferredVersion;
	/**
	 * {{list}} The list of the PCP Options supported by the PCP Client.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OptionList")
	@Size(min = 0, max = 254)
	public Long optionList;
	/**
	 * Client properties for Port Control Protocol (PCP). The PCP Client interacts with a PCP Server as defined in {{bibref|RFC6887}} for internal device applications or LAN device applications via Interworking functions.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;

	public PCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each list item denotes a PCP version supported by the PCP Client. Currently known versions are 0, 1 and 2.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSupportedVersions() {
		return supportedVersions;
	}

	/**
	 * Set the {{list}} Each list item denotes a PCP version supported by the PCP Client. Currently known versions are 0, 1 and 2.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param supportedVersions the input value
	 */
	public void  setSupportedVersions(Long supportedVersions) {
		this.supportedVersions = supportedVersions;
	}

	/**
	 * Set the {{list}} Each list item denotes a PCP version supported by the PCP Client. Currently known versions are 0, 1 and 2.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param supportedVersions the input value
	 * @return this instance
	 */
	public PCP withSupportedVersions(Long supportedVersions) {
		this.supportedVersions = supportedVersions;
		return this;
	}

	/**
	 * Get the this is the version to be used in the first exchange with a new PCP Server.

          The factory default MUST be the highest supported version, as described in {{bibref|RFC6887|Section 9}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPreferredVersion() {
		return preferredVersion;
	}

	/**
	 * Set the this is the version to be used in the first exchange with a new PCP Server.

          The factory default MUST be the highest supported version, as described in {{bibref|RFC6887|Section 9}}.
	 *
	 * @since 2.8
	 * @param preferredVersion the input value
	 */
	public void  setPreferredVersion(Long preferredVersion) {
		this.preferredVersion = preferredVersion;
	}

	/**
	 * Set the this is the version to be used in the first exchange with a new PCP Server.

          The factory default MUST be the highest supported version, as described in {{bibref|RFC6887|Section 9}}.
	 *
	 * @since 2.8
	 * @param preferredVersion the input value
	 * @return this instance
	 */
	public PCP withPreferredVersion(Long preferredVersion) {
		this.preferredVersion = preferredVersion;
		return this;
	}

	/**
	 * Get the {{list}} The list of the PCP Options supported by the PCP Client.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getOptionList() {
		return optionList;
	}

	/**
	 * Set the {{list}} The list of the PCP Options supported by the PCP Client.
	 *
	 * @since 2.8
	 * @param optionList the input value
	 */
	public void  setOptionList(Long optionList) {
		this.optionList = optionList;
	}

	/**
	 * Set the {{list}} The list of the PCP Options supported by the PCP Client.
	 *
	 * @since 2.8
	 * @param optionList the input value
	 * @return this instance
	 */
	public PCP withOptionList(Long optionList) {
		this.optionList = optionList;
		return this;
	}

	/**
	 * Get the client properties for Port Control Protocol (PCP). The PCP Client interacts with a PCP Server as defined in {{bibref|RFC6887}} for internal device applications or LAN device applications via Interworking functions.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the client properties for Port Control Protocol (PCP). The PCP Client interacts with a PCP Server as defined in {{bibref|RFC6887}} for internal device applications or LAN device applications via Interworking functions.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the client properties for Port Control Protocol (PCP). The PCP Client interacts with a PCP Server as defined in {{bibref|RFC6887}} for internal device applications or LAN device applications via Interworking functions.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public PCP withClient(Client client) {
		getClients().add(client);
		return this;
	}

	//</editor-fold>

}