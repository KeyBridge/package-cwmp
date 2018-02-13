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
package org.broadbandforum.tr196.fapservice.accessmgmt.umts;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * Details for CSG and Non-CSG members.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.UMTS.MemberDetail.{i}.")
@XmlRootElement(name = "FAPService.AccessMgmt.UMTS.MemberDetail")
@XmlType(name = "FAPService.AccessMgmt.UMTS.MemberDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemberDetail {

	/**
	 * Enables or disables the MemberDetail entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * International Mobile Subscriber Identity of the UE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IMSI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 15)
	public String imsI;
	/**
	 * Mobile Station International Subscriber Identity Number. Set to {{empty}} if unknown.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MSISDN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 15)
	public String msiSDN;
	/**
	 * Time when the ACL membership expires.

An Unknown Time value, as defined in {{bibref|TR-106a2|Section 3.2}}, indicates that the membership doesn't expire.

Upon expiry the FAP MUST remove the IMSI from the {{param|.AccessMgmt.UMTS.AccessControlList}}, but the entry in {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} remains. {{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MembershipExpires")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime membershipExpires = LocalDateTime.parse("0001-01-01T00:00:00Z");;

	public MemberDetail() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the MemberDetail entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the MemberDetail entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the MemberDetail entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public MemberDetail withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public MemberDetail withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the international Mobile Subscriber Identity of the UE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getImsI() {
		return imsI;
	}

	/**
	 * Set the international Mobile Subscriber Identity of the UE.
	 *
	 * @since 2.0
	 * @param imsI the input value
	 */
	public void  setImsI(String imsI) {
		this.imsI = imsI;
	}

	/**
	 * Set the international Mobile Subscriber Identity of the UE.
	 *
	 * @since 2.0
	 * @param imsI the input value
	 * @return this instance
	 */
	public MemberDetail withImsI(String imsI) {
		this.imsI = imsI;
		return this;
	}

	/**
	 * Get the mobile Station International Subscriber Identity Number. Set to {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMsiSDN() {
		return msiSDN;
	}

	/**
	 * Set the mobile Station International Subscriber Identity Number. Set to {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @param msiSDN the input value
	 */
	public void  setMsiSDN(String msiSDN) {
		this.msiSDN = msiSDN;
	}

	/**
	 * Set the mobile Station International Subscriber Identity Number. Set to {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @param msiSDN the input value
	 * @return this instance
	 */
	public MemberDetail withMsiSDN(String msiSDN) {
		this.msiSDN = msiSDN;
		return this;
	}

	/**
	 * Get the time when the ACL membership expires.

An Unknown Time value, as defined in {{bibref|TR-106a2|Section 3.2}}, indicates that the membership doesn't expire.

Upon expiry the FAP MUST remove the IMSI from the {{param|.AccessMgmt.UMTS.AccessControlList}}, but the entry in {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} remains. {{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getMembershipExpires() {
		return membershipExpires;
	}

	/**
	 * Set the time when the ACL membership expires.

An Unknown Time value, as defined in {{bibref|TR-106a2|Section 3.2}}, indicates that the membership doesn't expire.

Upon expiry the FAP MUST remove the IMSI from the {{param|.AccessMgmt.UMTS.AccessControlList}}, but the entry in {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} remains. {{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @param membershipExpires the input value
	 */
	public void  setMembershipExpires(LocalDateTime membershipExpires) {
		this.membershipExpires = membershipExpires;
	}

	/**
	 * Set the time when the ACL membership expires.

An Unknown Time value, as defined in {{bibref|TR-106a2|Section 3.2}}, indicates that the membership doesn't expire.

Upon expiry the FAP MUST remove the IMSI from the {{param|.AccessMgmt.UMTS.AccessControlList}}, but the entry in {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} remains. {{bibref|3GPP-TS.22.011}}
	 *
	 * @since 2.0
	 * @param membershipExpires the input value
	 * @return this instance
	 */
	public MemberDetail withMembershipExpires(LocalDateTime membershipExpires) {
		this.membershipExpires = membershipExpires;
		return this;
	}

	//</editor-fold>

}