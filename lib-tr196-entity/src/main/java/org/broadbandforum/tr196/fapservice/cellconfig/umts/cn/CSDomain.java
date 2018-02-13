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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.csdomain.HHO;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.csdomain.RAB;

	/**
	 * This object contains parameters relating to configuring the CS domain of the UMTS CN.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.CSDomain.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.CN.CSDomain")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.CSDomain")
@XmlAccessorType(XmlAccessType.FIELD)
public class CSDomain {

	/**
	 * T3212 timeout value specified in seconds {{bibref|3GPP-TS.24.008|section 10.5.1.12.2}}. The values are implemented by steps of 360 seconds, which aligns with values in decihours in {{bibref|3GPP-TS.24.008}}.

The value of 0 is used for infinite timeout value i.e. periodic updating shall not be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T3212")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 91800)
	public Long t3212;
	/**
	 * Indicates the UE behavior regarding IMSI attach/detach procedure to the CN {{bibref|3GPP-TS.24.008}}.

If {{true}} UE SHALL apply IMSI attach and detach procedure

If {{false}} UE SHALL NOT apply IMSI attach and detach procedure
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IMSIAttachDetachEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean imsIAttachDetachEnable;
	/**
	 * This object provides monitoring of the Circuit Switch RAB  in the HNB.
	 */
	@XmlElement(name = "RAB")
	public RAB rab;
	/**
	 * This object provides monitoring of the circuit switch Hard Handover (HHO) in the HNB.
	 */
	@XmlElement(name = "HHO")
	public HHO hho;

	public CSDomain() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the t3212 timeout value specified in seconds {{bibref|3GPP-TS.24.008|section 10.5.1.12.2}}. The values are implemented by steps of 360 seconds, which aligns with values in decihours in {{bibref|3GPP-TS.24.008}}.

The value of 0 is used for infinite timeout value i.e. periodic updating shall not be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT3212() {
		return t3212;
	}

	/**
	 * Set the t3212 timeout value specified in seconds {{bibref|3GPP-TS.24.008|section 10.5.1.12.2}}. The values are implemented by steps of 360 seconds, which aligns with values in decihours in {{bibref|3GPP-TS.24.008}}.

The value of 0 is used for infinite timeout value i.e. periodic updating shall not be used.
	 *
	 * @since 2.0
	 * @param t3212 the input value
	 */
	public void  setT3212(Long t3212) {
		this.t3212 = t3212;
	}

	/**
	 * Set the t3212 timeout value specified in seconds {{bibref|3GPP-TS.24.008|section 10.5.1.12.2}}. The values are implemented by steps of 360 seconds, which aligns with values in decihours in {{bibref|3GPP-TS.24.008}}.

The value of 0 is used for infinite timeout value i.e. periodic updating shall not be used.
	 *
	 * @since 2.0
	 * @param t3212 the input value
	 * @return this instance
	 */
	public CSDomain withT3212(Long t3212) {
		this.t3212 = t3212;
		return this;
	}

	/**
	 * Get the indicates the UE behavior regarding IMSI attach/detach procedure to the CN {{bibref|3GPP-TS.24.008}}.

If {{true}} UE SHALL apply IMSI attach and detach procedure

If {{false}} UE SHALL NOT apply IMSI attach and detach procedure
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isImsIAttachDetachEnable() {
		return imsIAttachDetachEnable;
	}

	/**
	 * Set the indicates the UE behavior regarding IMSI attach/detach procedure to the CN {{bibref|3GPP-TS.24.008}}.

If {{true}} UE SHALL apply IMSI attach and detach procedure

If {{false}} UE SHALL NOT apply IMSI attach and detach procedure
	 *
	 * @since 2.0
	 * @param imsIAttachDetachEnable the input value
	 */
	public void  setImsIAttachDetachEnable(Boolean imsIAttachDetachEnable) {
		this.imsIAttachDetachEnable = imsIAttachDetachEnable;
	}

	/**
	 * Set the indicates the UE behavior regarding IMSI attach/detach procedure to the CN {{bibref|3GPP-TS.24.008}}.

If {{true}} UE SHALL apply IMSI attach and detach procedure

If {{false}} UE SHALL NOT apply IMSI attach and detach procedure
	 *
	 * @since 2.0
	 * @param imsIAttachDetachEnable the input value
	 * @return this instance
	 */
	public CSDomain withImsIAttachDetachEnable(Boolean imsIAttachDetachEnable) {
		this.imsIAttachDetachEnable = imsIAttachDetachEnable;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the Circuit Switch RAB  in the HNB.
	 *
	 * @return the value
	 */
	public RAB getRab() {
		return rab;
	}

	/**
	 * Set the this object provides monitoring of the Circuit Switch RAB  in the HNB.
	 *
	 * @param rab the input value
	 */
	public void  setRab(RAB rab) {
		this.rab = rab;
	}

	/**
	 * Set the this object provides monitoring of the Circuit Switch RAB  in the HNB.
	 *
	 * @param rab the input value
	 * @return this instance
	 */
	public CSDomain withRab(RAB rab) {
		this.rab = rab;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the circuit switch Hard Handover (HHO) in the HNB.
	 *
	 * @return the value
	 */
	public HHO getHho() {
		return hho;
	}

	/**
	 * Set the this object provides monitoring of the circuit switch Hard Handover (HHO) in the HNB.
	 *
	 * @param hho the input value
	 */
	public void  setHho(HHO hho) {
		this.hho = hho;
	}

	/**
	 * Set the this object provides monitoring of the circuit switch Hard Handover (HHO) in the HNB.
	 *
	 * @param hho the input value
	 * @return this instance
	 */
	public CSDomain withHho(HHO hho) {
		this.hho = hho;
		return this;
	}

	//</editor-fold>

}