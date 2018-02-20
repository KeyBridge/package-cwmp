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
package org.broadbandforum.tr135.stbservice.applications;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Service Provider instance table.
	 *
	 * @since TR135 v1.1
	 */
@CWMPObject(name = "STBService.{i}.Applications.ServiceProvider.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.Applications.ServiceProvider")
@XmlType(name = "STBService.Applications.ServiceProvider")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceProvider {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Service Provider name.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String name;
	/**
	 * Service Provider domain URI.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String domain;
	/**
	 * Service Provider’s Service Discovery Server. It MAY be configured in the format of IMS Public Service Identifier, or IP address or URL.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ServiceDiscoveryServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serviceDiscoveryServer;
	/**
	 * Comma separated list of the BCG (Broadband Content Guide) server URLs the STB is currently retrieving IPTV service information from.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ActiveBCGServers")
	@Size(max = 1024)
	public String activeBCGServers;

	public ServiceProvider() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public ServiceProvider withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the service Provider name.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the service Provider name.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the service Provider name.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public ServiceProvider withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the service Provider domain URI.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the service Provider domain URI.
	 *
	 * @since 1.1
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the service Provider domain URI.
	 *
	 * @since 1.1
	 * @param domain the input value
	 * @return this instance
	 */
	public ServiceProvider withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get the service Provider’s Service Discovery Server. It MAY be configured in the format of IMS Public Service Identifier, or IP address or URL.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getServiceDiscoveryServer() {
		return serviceDiscoveryServer;
	}

	/**
	 * Set the service Provider’s Service Discovery Server. It MAY be configured in the format of IMS Public Service Identifier, or IP address or URL.
	 *
	 * @since 1.1
	 * @param serviceDiscoveryServer the input value
	 */
	public void  setServiceDiscoveryServer(String serviceDiscoveryServer) {
		this.serviceDiscoveryServer = serviceDiscoveryServer;
	}

	/**
	 * Set the service Provider’s Service Discovery Server. It MAY be configured in the format of IMS Public Service Identifier, or IP address or URL.
	 *
	 * @since 1.1
	 * @param serviceDiscoveryServer the input value
	 * @return this instance
	 */
	public ServiceProvider withServiceDiscoveryServer(String serviceDiscoveryServer) {
		this.serviceDiscoveryServer = serviceDiscoveryServer;
		return this;
	}

	/**
	 * Get the comma separated list of the BCG (Broadband Content Guide) server URLs the STB is currently retrieving IPTV service information from.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getActiveBCGServers() {
		return activeBCGServers;
	}

	/**
	 * Set the comma separated list of the BCG (Broadband Content Guide) server URLs the STB is currently retrieving IPTV service information from.
	 *
	 * @since 1.1
	 * @param activeBCGServers the input value
	 */
	public void  setActiveBCGServers(String activeBCGServers) {
		this.activeBCGServers = activeBCGServers;
	}

	/**
	 * Set the comma separated list of the BCG (Broadband Content Guide) server URLs the STB is currently retrieving IPTV service information from.
	 *
	 * @since 1.1
	 * @param activeBCGServers the input value
	 * @return this instance
	 */
	public ServiceProvider withActiveBCGServers(String activeBCGServers) {
		this.activeBCGServers = activeBCGServers;
		return this;
	}

	//</editor-fold>

}