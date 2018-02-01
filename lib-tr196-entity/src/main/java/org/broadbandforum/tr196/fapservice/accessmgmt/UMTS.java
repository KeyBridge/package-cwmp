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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.accessmgmt.umts.LocalIPAccess;
import org.broadbandforum.tr196.fapservice.accessmgmt.umts.MemberDetail;

	/**
	 * This object contains parameters relating to Access Management for UMTS FAP (ACL, CSG, LIPA).

Closed Subscriber Group (CSG) service behavior is specified in {{bibref|3GPP-TS.22.011}}.

Note: Cell barring and 3GPP access class parameters are contained in {{object|.CellConfig.UMTS.RAN.CellRestriction.}} (UMTS FAP).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.UMTS.")
public class UMTS {

	/**
	 * Indicates the type of access mode the FAP operates in. {{enum}}

When the value is not {{enum|Open Access}} non-CSG-capable UE are handled according to {{param|NonCSGUEAccessDecision}}. Note: This parameter controls the setting of the CSGindicator bit, specified in MIB in {{bibref|3GPP-TS.25.331}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessMode")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String accessMode = "Open Access";
	/**
	 * Indicates how the access decision is made for non-CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonCSGUEAccessDecision")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String nonCSGUEAccessDecision = "Local";
	/**
	 * Indicates how the access decision is made for CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.

If {{true}} access decision is determined the same way as for {{param|NonCSGUEAccessDecision}}. (E.g. if core network doesn't (yet) support full CSG functionality.)

If {{false}} FAP always allows access for CSG-capable UE.

CSG enforcement is performed by MSC/SGSN (with support from HSS), or by FGW.

{{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGMembershipDeterminedLocally")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Boolean csgMembershipDeterminedLocally = false;
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
	 * Maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. In UMTS FAP, this applies to RB resource.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxResourceNonCSGMembers")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 100)
	public Long maxResourceNonCSGMembers;
	/**
	 * Home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB20 in {{bibref|3GPP-TS.25.331|Section 10.2.48.8.23}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HNBName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 48)
	public String hnbName;
	/**
	 * Defines the Closed Subscriber Group of the Access Control List. The UMTS FAP broadcasts this CSG ID in SIB3 depending on the AccessMode. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 134217727)
	public Long csgID;
	/**
	 * {{list}} Each entry is an IMSI.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessControlList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> accessControlList;
	/**
	 * The maximum number of entries available in the {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMemberDetailEntries")
	public Long maxMemberDetailEntries;
	/**
	 * Details for CSG and Non-CSG members.
	 */
	@XmlElementWrapper(name = "MemberDetails")
	@XmlElement(name = "MemberDetail")
	@CWMPParameter(access = "readWrite")
	public Collection<MemberDetail> memberDetails;
	/**
	 * Local IP access for UMTS FAP.
	 */
	@XmlElement(name = "LocalIPAccess")
	public LocalIPAccess localIPAccess;

	public UMTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the type of access mode the FAP operates in. {{enum}}

When the value is not {{enum|Open Access}} non-CSG-capable UE are handled according to {{param|NonCSGUEAccessDecision}}. Note: This parameter controls the setting of the CSGindicator bit, specified in MIB in {{bibref|3GPP-TS.25.331}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAccessMode() {
		return accessMode;
	}

	/**
	 * Set the indicates the type of access mode the FAP operates in. {{enum}}

When the value is not {{enum|Open Access}} non-CSG-capable UE are handled according to {{param|NonCSGUEAccessDecision}}. Note: This parameter controls the setting of the CSGindicator bit, specified in MIB in {{bibref|3GPP-TS.25.331}}.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 */
	public void  setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	/**
	 * Set the indicates the type of access mode the FAP operates in. {{enum}}

When the value is not {{enum|Open Access}} non-CSG-capable UE are handled according to {{param|NonCSGUEAccessDecision}}. Note: This parameter controls the setting of the CSGindicator bit, specified in MIB in {{bibref|3GPP-TS.25.331}}.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 * @return this instance
	 */
	public UMTS withAccessMode(String accessMode) {
		this.accessMode = accessMode;
		return this;
	}

	/**
	 * Get the indicates how the access decision is made for non-CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNonCSGUEAccessDecision() {
		return nonCSGUEAccessDecision;
	}

	/**
	 * Set the indicates how the access decision is made for non-CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.
	 *
	 * @since 2.0
	 * @param nonCSGUEAccessDecision the input value
	 */
	public void  setNonCSGUEAccessDecision(String nonCSGUEAccessDecision) {
		this.nonCSGUEAccessDecision = nonCSGUEAccessDecision;
	}

	/**
	 * Set the indicates how the access decision is made for non-CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.
	 *
	 * @since 2.0
	 * @param nonCSGUEAccessDecision the input value
	 * @return this instance
	 */
	public UMTS withNonCSGUEAccessDecision(String nonCSGUEAccessDecision) {
		this.nonCSGUEAccessDecision = nonCSGUEAccessDecision;
		return this;
	}

	/**
	 * Get the indicates how the access decision is made for CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.

If {{true}} access decision is determined the same way as for {{param|NonCSGUEAccessDecision}}. (E.g. if core network doesn't (yet) support full CSG functionality.)

If {{false}} FAP always allows access for CSG-capable UE.

CSG enforcement is performed by MSC/SGSN (with support from HSS), or by FGW.

{{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCsgMembershipDeterminedLocally() {
		return csgMembershipDeterminedLocally;
	}

	/**
	 * Set the indicates how the access decision is made for CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.

If {{true}} access decision is determined the same way as for {{param|NonCSGUEAccessDecision}}. (E.g. if core network doesn't (yet) support full CSG functionality.)

If {{false}} FAP always allows access for CSG-capable UE.

CSG enforcement is performed by MSC/SGSN (with support from HSS), or by FGW.

{{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @param csgMembershipDeterminedLocally the input value
	 */
	public void  setCsgMembershipDeterminedLocally(Boolean csgMembershipDeterminedLocally) {
		this.csgMembershipDeterminedLocally = csgMembershipDeterminedLocally;
	}

	/**
	 * Set the indicates how the access decision is made for CSG-capable UE. Parameter is ignored when {{param|AccessMode}} is {{enum|Open Access|AccessMode}}.

If {{true}} access decision is determined the same way as for {{param|NonCSGUEAccessDecision}}. (E.g. if core network doesn't (yet) support full CSG functionality.)

If {{false}} FAP always allows access for CSG-capable UE.

CSG enforcement is performed by MSC/SGSN (with support from HSS), or by FGW.

{{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @param csgMembershipDeterminedLocally the input value
	 * @return this instance
	 */
	public UMTS withCsgMembershipDeterminedLocally(Boolean csgMembershipDeterminedLocally) {
		this.csgMembershipDeterminedLocally = csgMembershipDeterminedLocally;
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
	public UMTS withMaxUEsServed(Integer maxUEsServed) {
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
	public UMTS withMaxCSGMembers(Integer maxCSGMembers) {
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
	public UMTS withMaxNonCSGMembers(Integer maxNonCSGMembers) {
		this.maxNonCSGMembers = maxNonCSGMembers;
		return this;
	}

	/**
	 * Get the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. In UMTS FAP, this applies to RB resource.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxResourceNonCSGMembers() {
		return maxResourceNonCSGMembers;
	}

	/**
	 * Set the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. In UMTS FAP, this applies to RB resource.
	 *
	 * @since 2.0
	 * @param maxResourceNonCSGMembers the input value
	 */
	public void  setMaxResourceNonCSGMembers(Long maxResourceNonCSGMembers) {
		this.maxResourceNonCSGMembers = maxResourceNonCSGMembers;
	}

	/**
	 * Set the maximum percentage of physical resource that can be assigned to non-CSG members aggregately at one time. In UMTS FAP, this applies to RB resource.
	 *
	 * @since 2.0
	 * @param maxResourceNonCSGMembers the input value
	 * @return this instance
	 */
	public UMTS withMaxResourceNonCSGMembers(Long maxResourceNonCSGMembers) {
		this.maxResourceNonCSGMembers = maxResourceNonCSGMembers;
		return this;
	}

	/**
	 * Get the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB20 in {{bibref|3GPP-TS.25.331|Section 10.2.48.8.23}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHnbName() {
		return hnbName;
	}

	/**
	 * Set the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB20 in {{bibref|3GPP-TS.25.331|Section 10.2.48.8.23}}.
	 *
	 * @since 2.0
	 * @param hnbName the input value
	 */
	public void  setHnbName(String hnbName) {
		this.hnbName = hnbName;
	}

	/**
	 * Set the home NodeB name. An operator-defined string that is broadcast by a CSG cell or a hybrid cell and displayed on the UE for the purpose of manual cell selection or indication that the UE is camped on the cell as specified in {{bibref|3GPP-TS.22.220|Section 5.4.2}}. Corresponds to parameter 'hnb-Name' specified in SIB20 in {{bibref|3GPP-TS.25.331|Section 10.2.48.8.23}}.
	 *
	 * @since 2.0
	 * @param hnbName the input value
	 * @return this instance
	 */
	public UMTS withHnbName(String hnbName) {
		this.hnbName = hnbName;
		return this;
	}

	/**
	 * Get the defines the Closed Subscriber Group of the Access Control List. The UMTS FAP broadcasts this CSG ID in SIB3 depending on the AccessMode. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCsgID() {
		return csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. The UMTS FAP broadcasts this CSG ID in SIB3 depending on the AccessMode. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 */
	public void  setCsgID(Long csgID) {
		this.csgID = csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. The UMTS FAP broadcasts this CSG ID in SIB3 depending on the AccessMode. The LTE FAP broadcasts this in SIB1, and corresponds to parameter csg-Identity in SIB1 in {{bibref|3GPP-TS.36.331}}.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 * @return this instance
	 */
	public UMTS withCsgID(Long csgID) {
		this.csgID = csgID;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAccessControlList() {
		if (this.accessControlList == null){ this.accessControlList=new ArrayList<>();}
		return accessControlList;
	}

	/**
	 * Set the {{list}} Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @param accessControlList the input value
	 */
	public void  setAccessControlList(Collection<String> accessControlList) {
		this.accessControlList = accessControlList;
	}

	/**
	 * Set the {{list}} Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public UMTS withAccessControlList(String string) {
		getAccessControlList().add(string);
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMemberDetailEntries() {
		return maxMemberDetailEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxMemberDetailEntries the input value
	 */
	public void  setMaxMemberDetailEntries(Long maxMemberDetailEntries) {
		this.maxMemberDetailEntries = maxMemberDetailEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxMemberDetailEntries the input value
	 * @return this instance
	 */
	public UMTS withMaxMemberDetailEntries(Long maxMemberDetailEntries) {
		this.maxMemberDetailEntries = maxMemberDetailEntries;
		return this;
	}

	/**
	 * Get the details for CSG and Non-CSG members.
	 *
	 * @return the value
	 */
	public Collection<MemberDetail> getMemberDetails() {
		if (this.memberDetails == null){ this.memberDetails=new ArrayList<>();}
		return memberDetails;
	}

	/**
	 * Set the details for CSG and Non-CSG members.
	 *
	 * @param memberDetails the input value
	 */
	public void  setMemberDetails(Collection<MemberDetail> memberDetails) {
		this.memberDetails = memberDetails;
	}

	/**
	 * Set the details for CSG and Non-CSG members.
	 *
	 * @param memberDetail the input value
	 * @return this instance
	 */
	public UMTS withMemberDetail(MemberDetail memberDetail) {
		getMemberDetails().add(memberDetail);
		return this;
	}

	/**
	 * Get the local IP access for UMTS FAP.
	 *
	 * @return the value
	 */
	public LocalIPAccess getLocalIPAccess() {
		return localIPAccess;
	}

	/**
	 * Set the local IP access for UMTS FAP.
	 *
	 * @param localIPAccess the input value
	 */
	public void  setLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
	}

	/**
	 * Set the local IP access for UMTS FAP.
	 *
	 * @param localIPAccess the input value
	 * @return this instance
	 */
	public UMTS withLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
		return this;
	}

	//</editor-fold>

}