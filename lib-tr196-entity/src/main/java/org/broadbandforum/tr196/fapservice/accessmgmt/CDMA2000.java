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
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.LocalIPAccess;
import org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.MemberDetail;

	/**
	 * This object contains configurable and observable attributes related to CDMA2000 Access and Admission Control of the FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.CDMA2000.")
public class CDMA2000 {

	/**
	 * Defines the access control mode of FAP.  Allowed modes are Open, Closed, and Signaling Association (refer to {{bibref|3GPP2-A.S0024}}).  AccessMode 2 (Hybrid) is not applicable to CDMA2000 FAPs.  0- Open,1-Closed, 2-Reserved, 3-Signaling Association.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessMode")
	@CWMPParameter(access = "readWrite")
	@Size(min = 3, max = 3)
	public Long accessMode;
	/**
	 * Total number of active calls allowed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTotalActiveCallsAllowed")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1024)
	public Long maxTotalActiveCallsAllowed;
	/**
	 * {{list}} (maximum item length 15). Each entry is an IMSI.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessControlList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	public String accessControlList;
	/**
	 * The maximum number of entries available in the {{object|.AccessMgmt.CDMA2000.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMemberDetailEntries")
	public Long maxMemberDetailEntries;
	/**
	 * At most one enabled entry in this table can exist with a given value for IMSI and HRPDIdentifierValue. The IMSI field may be empty.
	 */
	@XmlElementWrapper(name = "memberDetails")
	@XmlElement(name = "MemberDetail")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<MemberDetail> memberDetails;
	/**
	 * Local IP access support as defined in 3GPP2
	 */
	@XmlElement(name = "LocalIPAccess")
	public LocalIPAccess localIPAccess;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the access control mode of FAP.  Allowed modes are Open, Closed, and Signaling Association (refer to {{bibref|3GPP2-A.S0024}}).  AccessMode 2 (Hybrid) is not applicable to CDMA2000 FAPs.  0- Open,1-Closed, 2-Reserved, 3-Signaling Association.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessMode() {
		return accessMode;
	}

	/**
	 * Set the defines the access control mode of FAP.  Allowed modes are Open, Closed, and Signaling Association (refer to {{bibref|3GPP2-A.S0024}}).  AccessMode 2 (Hybrid) is not applicable to CDMA2000 FAPs.  0- Open,1-Closed, 2-Reserved, 3-Signaling Association.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 */
	public void  setAccessMode(Long accessMode) {
		this.accessMode = accessMode;
	}

	/**
	 * Set the defines the access control mode of FAP.  Allowed modes are Open, Closed, and Signaling Association (refer to {{bibref|3GPP2-A.S0024}}).  AccessMode 2 (Hybrid) is not applicable to CDMA2000 FAPs.  0- Open,1-Closed, 2-Reserved, 3-Signaling Association.
	 *
	 * @since 2.0
	 * @param accessMode the input value
	 * @return this instance
	 */
	public CDMA2000 withAccessMode(Long accessMode) {
		this.accessMode = accessMode;
		return this;
	}

	/**
	 * Get the total number of active calls allowed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxTotalActiveCallsAllowed() {
		return maxTotalActiveCallsAllowed;
	}

	/**
	 * Set the total number of active calls allowed.
	 *
	 * @since 2.0
	 * @param maxTotalActiveCallsAllowed the input value
	 */
	public void  setMaxTotalActiveCallsAllowed(Long maxTotalActiveCallsAllowed) {
		this.maxTotalActiveCallsAllowed = maxTotalActiveCallsAllowed;
	}

	/**
	 * Set the total number of active calls allowed.
	 *
	 * @since 2.0
	 * @param maxTotalActiveCallsAllowed the input value
	 * @return this instance
	 */
	public CDMA2000 withMaxTotalActiveCallsAllowed(Long maxTotalActiveCallsAllowed) {
		this.maxTotalActiveCallsAllowed = maxTotalActiveCallsAllowed;
		return this;
	}

	/**
	 * Get the {{list}} (maximum item length 15). Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAccessControlList() {
		return accessControlList;
	}

	/**
	 * Set the {{list}} (maximum item length 15). Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @param accessControlList the input value
	 */
	public void  setAccessControlList(String accessControlList) {
		this.accessControlList = accessControlList;
	}

	/**
	 * Set the {{list}} (maximum item length 15). Each entry is an IMSI.
	 *
	 * @since 2.0
	 * @param accessControlList the input value
	 * @return this instance
	 */
	public CDMA2000 withAccessControlList(String accessControlList) {
		this.accessControlList = accessControlList;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.AccessMgmt.CDMA2000.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMemberDetailEntries() {
		return maxMemberDetailEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.CDMA2000.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxMemberDetailEntries the input value
	 */
	public void  setMaxMemberDetailEntries(Long maxMemberDetailEntries) {
		this.maxMemberDetailEntries = maxMemberDetailEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.CDMA2000.MemberDetail.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxMemberDetailEntries the input value
	 * @return this instance
	 */
	public CDMA2000 withMaxMemberDetailEntries(Long maxMemberDetailEntries) {
		this.maxMemberDetailEntries = maxMemberDetailEntries;
		return this;
	}

	/**
	 * Get at most one enabled entry in this table can exist with a given value for IMSI and HRPDIdentifierValue. The IMSI field may be empty.
	 *
	 * @return the value
	 */
	public Collection<MemberDetail> getMemberDetails() {
		if (this.memberDetails == null){ this.memberDetails=new ArrayList<>();}
		return memberDetails;
	}

	/**
	 * Set at most one enabled entry in this table can exist with a given value for IMSI and HRPDIdentifierValue. The IMSI field may be empty.
	 *
	 * @param memberDetails the input value
	 */
	public void  setMemberDetails(Collection<MemberDetail> memberDetails) {
		this.memberDetails = memberDetails;
	}

	/**
	 * Set at most one enabled entry in this table can exist with a given value for IMSI and HRPDIdentifierValue. The IMSI field may be empty.
	 *
	 * @param memberDetail the input value
	 * @return this instance
	 */
	public CDMA2000 withMemberDetail(MemberDetail memberDetail) {
		getMemberDetails().add(memberDetail);
		return this;
	}

	/**
	 * Get the local IP access support as defined in 3GPP2
	 *
	 * @return the value
	 */
	public LocalIPAccess getLocalIPAccess() {
		return localIPAccess;
	}

	/**
	 * Set the local IP access support as defined in 3GPP2
	 *
	 * @param localIPAccess the input value
	 */
	public void  setLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
	}

	/**
	 * Set the local IP access support as defined in 3GPP2
	 *
	 * @param localIPAccess the input value
	 * @return this instance
	 */
	public CDMA2000 withLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
		return this;
	}

	//</editor-fold>

}