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
package org.broadbandforum.tr135.stbservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.applications.AudienceStats;
import org.broadbandforum.tr135.stbservice.applications.CDSPull;
import org.broadbandforum.tr135.stbservice.applications.CDSPush;
import org.broadbandforum.tr135.stbservice.applications.ServiceProvider;

	/**
	 * Applications.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Applications.")
@XmlRootElement(name = "STBService.Applications")
@XmlType(name = "STBService.Applications")
@XmlAccessorType(XmlAccessType.FIELD)
public class Applications {

	/**
	 * Service Provider instance table.
	 */
	@XmlElementWrapper(name = "ServiceProviders")
	@XmlElement(name = "ServiceProvider")
	public Collection<ServiceProvider> serviceProviders;
	/**
	 * Audience viewing statistics.
	 */
	@XmlElement(name = "AudienceStats")
	public AudienceStats audienceStats;
	/**
	 * Details of STB CDS Push logical internal parameters.
	 */
	@XmlElement(name = "CDSPush")
	public CDSPush cdsPush;
	/**
	 * Details of STB CDS Pull logical internal component. This object is present only if the user allowed (via his local STB UI) the remote management of the CDS Pull service.
	 */
	@XmlElement(name = "CDSPull")
	public CDSPull cdsPull;

	public Applications() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the service Provider instance table.
	 *
	 * @return the value
	 */
	public Collection<ServiceProvider> getServiceProviders() {
		if (this.serviceProviders == null){ this.serviceProviders=new ArrayList<>();}
		return serviceProviders;
	}

	/**
	 * Set the service Provider instance table.
	 *
	 * @param serviceProviders the input value
	 */
	public void  setServiceProviders(Collection<ServiceProvider> serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	/**
	 * Set the service Provider instance table.
	 *
	 * @param serviceProvider the input value
	 * @return this instance
	 */
	public Applications withServiceProvider(ServiceProvider serviceProvider) {
		getServiceProviders().add(serviceProvider);
		return this;
	}

	/**
	 * Get audience viewing statistics.
	 *
	 * @return the value
	 */
	public AudienceStats getAudienceStats() {
		return audienceStats;
	}

	/**
	 * Set audience viewing statistics.
	 *
	 * @param audienceStats the input value
	 */
	public void  setAudienceStats(AudienceStats audienceStats) {
		this.audienceStats = audienceStats;
	}

	/**
	 * Set audience viewing statistics.
	 *
	 * @param audienceStats the input value
	 * @return this instance
	 */
	public Applications withAudienceStats(AudienceStats audienceStats) {
		this.audienceStats = audienceStats;
		return this;
	}

	/**
	 * Get the details of STB CDS Push logical internal parameters.
	 *
	 * @return the value
	 */
	public CDSPush getCdsPush() {
		return cdsPush;
	}

	/**
	 * Set the details of STB CDS Push logical internal parameters.
	 *
	 * @param cdsPush the input value
	 */
	public void  setCdsPush(CDSPush cdsPush) {
		this.cdsPush = cdsPush;
	}

	/**
	 * Set the details of STB CDS Push logical internal parameters.
	 *
	 * @param cdsPush the input value
	 * @return this instance
	 */
	public Applications withCdsPush(CDSPush cdsPush) {
		this.cdsPush = cdsPush;
		return this;
	}

	/**
	 * Get the details of STB CDS Pull logical internal component. This object is present only if the user allowed (via his local STB UI) the remote management of the CDS Pull service.
	 *
	 * @return the value
	 */
	public CDSPull getCdsPull() {
		return cdsPull;
	}

	/**
	 * Set the details of STB CDS Pull logical internal component. This object is present only if the user allowed (via his local STB UI) the remote management of the CDS Pull service.
	 *
	 * @param cdsPull the input value
	 */
	public void  setCdsPull(CDSPull cdsPull) {
		this.cdsPull = cdsPull;
	}

	/**
	 * Set the details of STB CDS Pull logical internal component. This object is present only if the user allowed (via his local STB UI) the remote management of the CDS Pull service.
	 *
	 * @param cdsPull the input value
	 * @return this instance
	 */
	public Applications withCdsPull(CDSPull cdsPull) {
		this.cdsPull = cdsPull;
		return this;
	}

	//</editor-fold>

}