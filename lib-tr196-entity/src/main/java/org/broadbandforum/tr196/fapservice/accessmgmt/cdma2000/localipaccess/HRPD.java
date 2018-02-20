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
package org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.localipaccess;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.localipaccess.hrpd.EgressFilter;

	/**
	 * Local IP access support as defined in 3GPP2
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.")
@XmlRootElement(name = "FAPService.AccessMgmt.CDMA2000.LocalIPAccess.HRPD")
@XmlType(name = "FAPService.AccessMgmt.CDMA2000.LocalIPAccess.HRPD")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPD {

	/**
	 * Value of '0' indicates that the FAP shall allow only IP packets with destination address matching the local IP subnet on Local IP access interface. Value of '1' indicates that the FAP shall allow any IP packets with destination address matching either the local IP subnet or the subnets listed in Local IP egress filter parameter on Local IP access interface. Value of '2' indicates that the FAP shall allow any IP packets with destination addresses that do not match the Local IP egress filter parameter on Local IP access interface.Value of '3' indicates that the FAP shall allow any IP packets on the local IP address interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long filterType;
	/**
	 * This parameter is set to the IPCP Vendor Specific Option which the FAP uses to send Local IP access packet filter on AN-PPP interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterInUse")
	@Size(max = 256)
	public String filterInUse;
	/**
	 * HRPD LIPA Egress Filter Table entries.
	 */
	@XmlElementWrapper(name = "EgressFilters")
	@XmlElement(name = "EgressFilter")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<EgressFilter> egressFilters;

	public HRPD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the value of '0' indicates that the FAP shall allow only IP packets with destination address matching the local IP subnet on Local IP access interface. Value of '1' indicates that the FAP shall allow any IP packets with destination address matching either the local IP subnet or the subnets listed in Local IP egress filter parameter on Local IP access interface. Value of '2' indicates that the FAP shall allow any IP packets with destination addresses that do not match the Local IP egress filter parameter on Local IP access interface.Value of '3' indicates that the FAP shall allow any IP packets on the local IP address interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFilterType() {
		return filterType;
	}

	/**
	 * Set the value of '0' indicates that the FAP shall allow only IP packets with destination address matching the local IP subnet on Local IP access interface. Value of '1' indicates that the FAP shall allow any IP packets with destination address matching either the local IP subnet or the subnets listed in Local IP egress filter parameter on Local IP access interface. Value of '2' indicates that the FAP shall allow any IP packets with destination addresses that do not match the Local IP egress filter parameter on Local IP access interface.Value of '3' indicates that the FAP shall allow any IP packets on the local IP address interface.
	 *
	 * @since 2.0
	 * @param filterType the input value
	 */
	public void  setFilterType(Long filterType) {
		this.filterType = filterType;
	}

	/**
	 * Set the value of '0' indicates that the FAP shall allow only IP packets with destination address matching the local IP subnet on Local IP access interface. Value of '1' indicates that the FAP shall allow any IP packets with destination address matching either the local IP subnet or the subnets listed in Local IP egress filter parameter on Local IP access interface. Value of '2' indicates that the FAP shall allow any IP packets with destination addresses that do not match the Local IP egress filter parameter on Local IP access interface.Value of '3' indicates that the FAP shall allow any IP packets on the local IP address interface.
	 *
	 * @since 2.0
	 * @param filterType the input value
	 * @return this instance
	 */
	public HRPD withFilterType(Long filterType) {
		this.filterType = filterType;
		return this;
	}

	/**
	 * Get the this parameter is set to the IPCP Vendor Specific Option which the FAP uses to send Local IP access packet filter on AN-PPP interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFilterInUse() {
		return filterInUse;
	}

	/**
	 * Set the this parameter is set to the IPCP Vendor Specific Option which the FAP uses to send Local IP access packet filter on AN-PPP interface.
	 *
	 * @since 2.0
	 * @param filterInUse the input value
	 */
	public void  setFilterInUse(String filterInUse) {
		this.filterInUse = filterInUse;
	}

	/**
	 * Set the this parameter is set to the IPCP Vendor Specific Option which the FAP uses to send Local IP access packet filter on AN-PPP interface.
	 *
	 * @since 2.0
	 * @param filterInUse the input value
	 * @return this instance
	 */
	public HRPD withFilterInUse(String filterInUse) {
		this.filterInUse = filterInUse;
		return this;
	}

	/**
	 * Get the hrpD LIPA Egress Filter Table entries.
	 *
	 * @return the value
	 */
	public Collection<EgressFilter> getEgressFilters() {
		if (this.egressFilters == null){ this.egressFilters=new ArrayList<>();}
		return egressFilters;
	}

	/**
	 * Set the hrpD LIPA Egress Filter Table entries.
	 *
	 * @param egressFilters the input value
	 */
	public void  setEgressFilters(Collection<EgressFilter> egressFilters) {
		this.egressFilters = egressFilters;
	}

	/**
	 * Set the hrpD LIPA Egress Filter Table entries.
	 *
	 * @param egressFilter the input value
	 * @return this instance
	 */
	public HRPD withEgressFilter(EgressFilter egressFilter) {
		getEgressFilters().add(egressFilter);
		return this;
	}

	//</editor-fold>

}