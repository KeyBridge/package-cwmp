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
package org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000;

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
	 * At most one enabled entry in this table can exist with a given value for IMSI and HRPDIdentifierValue. The IMSI field may be empty.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.CDMA2000.MemberDetail.{i}.")
@XmlRootElement(name = "FAPService.AccessMgmt.CDMA2000.MemberDetail")
@XmlType(name = "FAPService.AccessMgmt.CDMA2000.MemberDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemberDetail {

	/**
	 * Enables or disables the {{object}} entry.
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
	 * Type of identifier used for the HRPD AT. 0-invalid 1-ESN 2-MEID 3-A12NAI. If IMSI in this record is valid, then this attribute is set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDIdentifierType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Integer hrpDIdentifierType = 0;
	/**
	 * The value of this attribute depends on {{param|HRPDIdentifierType}}. ESN and MEID shall be defined as Hex.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDIdentifierValue")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String hrpDIdentifierValue;
	/**
	 * The time that the current ACL membership expires.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MembershipExpires")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime membershipExpires = LocalDateTime.parse("");;

	public MemberDetail() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
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
	 * Get the type of identifier used for the HRPD AT. 0-invalid 1-ESN 2-MEID 3-A12NAI. If IMSI in this record is valid, then this attribute is set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHrpDIdentifierType() {
		return hrpDIdentifierType;
	}

	/**
	 * Set the type of identifier used for the HRPD AT. 0-invalid 1-ESN 2-MEID 3-A12NAI. If IMSI in this record is valid, then this attribute is set to 0.
	 *
	 * @since 2.0
	 * @param hrpDIdentifierType the input value
	 */
	public void  setHrpDIdentifierType(Integer hrpDIdentifierType) {
		this.hrpDIdentifierType = hrpDIdentifierType;
	}

	/**
	 * Set the type of identifier used for the HRPD AT. 0-invalid 1-ESN 2-MEID 3-A12NAI. If IMSI in this record is valid, then this attribute is set to 0.
	 *
	 * @since 2.0
	 * @param hrpDIdentifierType the input value
	 * @return this instance
	 */
	public MemberDetail withHrpDIdentifierType(Integer hrpDIdentifierType) {
		this.hrpDIdentifierType = hrpDIdentifierType;
		return this;
	}

	/**
	 * Get the value of this attribute depends on {{param|HRPDIdentifierType}}. ESN and MEID shall be defined as Hex.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHrpDIdentifierValue() {
		return hrpDIdentifierValue;
	}

	/**
	 * Set the value of this attribute depends on {{param|HRPDIdentifierType}}. ESN and MEID shall be defined as Hex.
	 *
	 * @since 2.0
	 * @param hrpDIdentifierValue the input value
	 */
	public void  setHrpDIdentifierValue(String hrpDIdentifierValue) {
		this.hrpDIdentifierValue = hrpDIdentifierValue;
	}

	/**
	 * Set the value of this attribute depends on {{param|HRPDIdentifierType}}. ESN and MEID shall be defined as Hex.
	 *
	 * @since 2.0
	 * @param hrpDIdentifierValue the input value
	 * @return this instance
	 */
	public MemberDetail withHrpDIdentifierValue(String hrpDIdentifierValue) {
		this.hrpDIdentifierValue = hrpDIdentifierValue;
		return this;
	}

	/**
	 * Get the time that the current ACL membership expires.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getMembershipExpires() {
		return membershipExpires;
	}

	/**
	 * Set the time that the current ACL membership expires.
	 *
	 * @since 2.0
	 * @param membershipExpires the input value
	 */
	public void  setMembershipExpires(LocalDateTime membershipExpires) {
		this.membershipExpires = membershipExpires;
	}

	/**
	 * Set the time that the current ACL membership expires.
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