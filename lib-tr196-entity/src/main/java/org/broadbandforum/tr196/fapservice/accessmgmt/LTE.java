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
package org.broadbandforum.tr196.fapservice.accessmgmt;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.accessmgmt.lte.LocalIPAccess;

	/**
	 * This object contains parameters relating to Access Management, as defined in {{bibref|3GPP-TS.32.592}}/

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.LTE.")
@XmlRootElement(name = "LTE")
@XmlType(name = "FAPService.AccessMgmt.LTE")
@XmlAccessorType(XmlAccessType.FIELD)
public class LTE {

	/**
	 * Indicates the type of access mode the FAP operates in. {{enum}}

Note: This parameter controls the setting of the CSGindicator bit, specified in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessMode")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String accessMode = "Open Access";
	/**
	 * Maximum number of concurrent UEs allowed at a cell. Valid for any {{param|AccessMode}}. A value of -1 allows an unlimited number of concurrent UEs up to the limit of FAP capacity. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxUEsServed")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxUEsServed = -1;
	/**
	 * Maximum number of concurrent CSG member UEs allowed at a hybrid or closed cell. A value of -1 allows an unlimited number of CSG members up to the limit of FAP capacity. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls. {{bibref|3GPP-TS.22.011}}, {{bibref|3GPP-TS.22.220}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCSGMembers")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxCSGMembers = -1;
	/**
	 * Maximum number of concurerent non-CSG member UEs allowed at a hybrid cell. Valid only if {{param|AccessMode}} is {{enum|Hybrid Access|AccessMode}}. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNonCSGMembers")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxNonCSGMembers = -1;
	/**
	 * Maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. This applies to PDSCH physical resource blocks.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxResourceNonCSGMembers")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 100)
	public Long maxResourceNonCSGMembers;
	/**
	 * Defines the Closed Subscriber Group of the Access Control List. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 134217727)
	public Long csgID;
	/**
	 * Home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB9 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HNBName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 48)
	public String hnbName;
	/**
	 * Local IP access for LTE FAP.
	 */
	@XmlElement(name = "LocalIPAccess")
	public LocalIPAccess localIPAccess;

	public LTE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the type of access mode the FAP operates in. {{enum}}

Note: This parameter controls the setting of the CSGindicator bit, specified in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAccessMode() {
		return accessMode;
	}

	/**
	 * Set the indicates the type of access mode the FAP operates in. {{enum}}

Note: This parameter controls the setting of the CSGindicator bit, specified in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 */
	public void  setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	/**
	 * Set the indicates the type of access mode the FAP operates in. {{enum}}

Note: This parameter controls the setting of the CSGindicator bit, specified in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 * @return this instance
	 */
	public LTE withAccessMode(String accessMode) {
		this.accessMode = accessMode;
		return this;
	}

	/**
	 * Get the maximum number of concurrent UEs allowed at a cell. Valid for any {{param|AccessMode}}. A value of -1 allows an unlimited number of concurrent UEs up to the limit of FAP capacity. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxUEsServed() {
		return maxUEsServed;
	}

	/**
	 * Set the maximum number of concurrent UEs allowed at a cell. Valid for any {{param|AccessMode}}. A value of -1 allows an unlimited number of concurrent UEs up to the limit of FAP capacity. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @param maxUEsServed the input value
	 */
	public void  setMaxUEsServed(Integer maxUEsServed) {
		this.maxUEsServed = maxUEsServed;
	}

	/**
	 * Set the maximum number of concurrent UEs allowed at a cell. Valid for any {{param|AccessMode}}. A value of -1 allows an unlimited number of concurrent UEs up to the limit of FAP capacity. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @param maxUEsServed the input value
	 * @return this instance
	 */
	public LTE withMaxUEsServed(Integer maxUEsServed) {
		this.maxUEsServed = maxUEsServed;
		return this;
	}

	/**
	 * Get the maximum number of concurrent CSG member UEs allowed at a hybrid or closed cell. A value of -1 allows an unlimited number of CSG members up to the limit of FAP capacity. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls. {{bibref|3GPP-TS.22.011}}, {{bibref|3GPP-TS.22.220}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxCSGMembers() {
		return maxCSGMembers;
	}

	/**
	 * Set the maximum number of concurrent CSG member UEs allowed at a hybrid or closed cell. A value of -1 allows an unlimited number of CSG members up to the limit of FAP capacity. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls. {{bibref|3GPP-TS.22.011}}, {{bibref|3GPP-TS.22.220}}.
	 *
	 * @since 2.0
	 * @param maxCSGMembers the input value
	 */
	public void  setMaxCSGMembers(Integer maxCSGMembers) {
		this.maxCSGMembers = maxCSGMembers;
	}

	/**
	 * Set the maximum number of concurrent CSG member UEs allowed at a hybrid or closed cell. A value of -1 allows an unlimited number of CSG members up to the limit of FAP capacity. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls. {{bibref|3GPP-TS.22.011}}, {{bibref|3GPP-TS.22.220}}.
	 *
	 * @since 2.0
	 * @param maxCSGMembers the input value
	 * @return this instance
	 */
	public LTE withMaxCSGMembers(Integer maxCSGMembers) {
		this.maxCSGMembers = maxCSGMembers;
		return this;
	}

	/**
	 * Get the maximum number of concurerent non-CSG member UEs allowed at a hybrid cell. Valid only if {{param|AccessMode}} is {{enum|Hybrid Access|AccessMode}}. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxNonCSGMembers() {
		return maxNonCSGMembers;
	}

	/**
	 * Set the maximum number of concurerent non-CSG member UEs allowed at a hybrid cell. Valid only if {{param|AccessMode}} is {{enum|Hybrid Access|AccessMode}}. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @param maxNonCSGMembers the input value
	 */
	public void  setMaxNonCSGMembers(Integer maxNonCSGMembers) {
		this.maxNonCSGMembers = maxNonCSGMembers;
	}

	/**
	 * Set the maximum number of concurerent non-CSG member UEs allowed at a hybrid cell. Valid only if {{param|AccessMode}} is {{enum|Hybrid Access|AccessMode}}. The setting cannot be larger than the value of {{param|MaxUEsServed}}. The setting does not affect emergency calls.
	 *
	 * @since 2.0
	 * @param maxNonCSGMembers the input value
	 * @return this instance
	 */
	public LTE withMaxNonCSGMembers(Integer maxNonCSGMembers) {
		this.maxNonCSGMembers = maxNonCSGMembers;
		return this;
	}

	/**
	 * Get the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. This applies to PDSCH physical resource blocks.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxResourceNonCSGMembers() {
		return maxResourceNonCSGMembers;
	}

	/**
	 * Set the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. This applies to PDSCH physical resource blocks.
	 *
	 * @since 2.0
	 * @param maxResourceNonCSGMembers the input value
	 */
	public void  setMaxResourceNonCSGMembers(Long maxResourceNonCSGMembers) {
		this.maxResourceNonCSGMembers = maxResourceNonCSGMembers;
	}

	/**
	 * Set the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. This applies to PDSCH physical resource blocks.
	 *
	 * @since 2.0
	 * @param maxResourceNonCSGMembers the input value
	 * @return this instance
	 */
	public LTE withMaxResourceNonCSGMembers(Long maxResourceNonCSGMembers) {
		this.maxResourceNonCSGMembers = maxResourceNonCSGMembers;
		return this;
	}

	/**
	 * Get the defines the Closed Subscriber Group of the Access Control List. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCsgID() {
		return csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 */
	public void  setCsgID(Long csgID) {
		this.csgID = csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 * @return this instance
	 */
	public LTE withCsgID(Long csgID) {
		this.csgID = csgID;
		return this;
	}

	/**
	 * Get the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB9 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHnbName() {
		return hnbName;
	}

	/**
	 * Set the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB9 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param hnbName the input value
	 */
	public void  setHnbName(String hnbName) {
		this.hnbName = hnbName;
	}

	/**
	 * Set the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB9 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param hnbName the input value
	 * @return this instance
	 */
	public LTE withHnbName(String hnbName) {
		this.hnbName = hnbName;
		return this;
	}

	/**
	 * Get the local IP access for LTE FAP.
	 *
	 * @return the value
	 */
	public LocalIPAccess getLocalIPAccess() {
		return localIPAccess;
	}

	/**
	 * Set the local IP access for LTE FAP.
	 *
	 * @param localIPAccess the input value
	 */
	public void  setLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
	}

	/**
	 * Set the local IP access for LTE FAP.
	 *
	 * @param localIPAccess the input value
	 * @return this instance
	 */
	public LTE withLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
		return this;
	}

	//</editor-fold>

}