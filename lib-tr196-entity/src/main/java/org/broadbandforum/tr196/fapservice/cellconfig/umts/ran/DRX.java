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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to DRX parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.DRX.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.DRX")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.DRX")
@XmlAccessorType(XmlAccessType.FIELD)
public class DRX {

	/**
	 * Defines the DRX cycle length coefficient for CS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN CS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXCycleLengthCoefficientCS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 6, max = 9)
	public Long drxCycleLengthCoefficientCS;
	/**
	 * Defines the DRX cycle length coefficient for PS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN PS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXCycleLengthCoefficientPS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 6, max = 9)
	public Long drxCycleLengthCoefficientPS;
	/**
	 * Defines the DRX cycle length used by UTRAN to count paging occasions for discontinuous reception in Connected Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for UTRAN.

{{param}} SHOULD be used by the UTRAN/FAP for UEs in Cell_PCH/Cell_FACH state.

{{bibref|3GPP-TS.25.331|Section 10.3.3.49}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UTRANDRXCycleLengthCoefficient")
	@CWMPParameter(access = "readWrite")
	@Size(min = 3, max = 9)
	public Long utrANDRXCycleLengthCoefficient;

	public DRX() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the DRX cycle length coefficient for CS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN CS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDrxCycleLengthCoefficientCS() {
		return drxCycleLengthCoefficientCS;
	}

	/**
	 * Set the defines the DRX cycle length coefficient for CS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN CS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @param drxCycleLengthCoefficientCS the input value
	 */
	public void  setDrxCycleLengthCoefficientCS(Long drxCycleLengthCoefficientCS) {
		this.drxCycleLengthCoefficientCS = drxCycleLengthCoefficientCS;
	}

	/**
	 * Set the defines the DRX cycle length coefficient for CS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN CS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @param drxCycleLengthCoefficientCS the input value
	 * @return this instance
	 */
	public DRX withDrxCycleLengthCoefficientCS(Long drxCycleLengthCoefficientCS) {
		this.drxCycleLengthCoefficientCS = drxCycleLengthCoefficientCS;
		return this;
	}

	/**
	 * Get the defines the DRX cycle length coefficient for PS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN PS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDrxCycleLengthCoefficientPS() {
		return drxCycleLengthCoefficientPS;
	}

	/**
	 * Set the defines the DRX cycle length coefficient for PS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN PS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @param drxCycleLengthCoefficientPS the input value
	 */
	public void  setDrxCycleLengthCoefficientPS(Long drxCycleLengthCoefficientPS) {
		this.drxCycleLengthCoefficientPS = drxCycleLengthCoefficientPS;
	}

	/**
	 * Set the defines the DRX cycle length coefficient for PS domain to optimize paging in idle mode. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 10.3.3.6}}.

{{param}} refers to 'k' in the formula as specified in {{bibref|3GPP-TS.25.304}}, Discontinuous reception. Used by the CN PS domain to count paging occasions for discontinuous reception in Idle Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for CN.
	 *
	 * @since 2.0
	 * @param drxCycleLengthCoefficientPS the input value
	 * @return this instance
	 */
	public DRX withDrxCycleLengthCoefficientPS(Long drxCycleLengthCoefficientPS) {
		this.drxCycleLengthCoefficientPS = drxCycleLengthCoefficientPS;
		return this;
	}

	/**
	 * Get the defines the DRX cycle length used by UTRAN to count paging occasions for discontinuous reception in Connected Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for UTRAN.

{{param}} SHOULD be used by the UTRAN/FAP for UEs in Cell_PCH/Cell_FACH state.

{{bibref|3GPP-TS.25.331|Section 10.3.3.49}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUtrANDRXCycleLengthCoefficient() {
		return utrANDRXCycleLengthCoefficient;
	}

	/**
	 * Set the defines the DRX cycle length used by UTRAN to count paging occasions for discontinuous reception in Connected Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for UTRAN.

{{param}} SHOULD be used by the UTRAN/FAP for UEs in Cell_PCH/Cell_FACH state.

{{bibref|3GPP-TS.25.331|Section 10.3.3.49}}
	 *
	 * @since 2.0
	 * @param utrANDRXCycleLengthCoefficient the input value
	 */
	public void  setUtrANDRXCycleLengthCoefficient(Long utrANDRXCycleLengthCoefficient) {
		this.utrANDRXCycleLengthCoefficient = utrANDRXCycleLengthCoefficient;
	}

	/**
	 * Set the defines the DRX cycle length used by UTRAN to count paging occasions for discontinuous reception in Connected Mode.

The duration of the DRX cycle is 2 <power> k frames, where 'k' is the used DRX cycle length coefficient for UTRAN.

{{param}} SHOULD be used by the UTRAN/FAP for UEs in Cell_PCH/Cell_FACH state.

{{bibref|3GPP-TS.25.331|Section 10.3.3.49}}
	 *
	 * @since 2.0
	 * @param utrANDRXCycleLengthCoefficient the input value
	 * @return this instance
	 */
	public DRX withUtrANDRXCycleLengthCoefficient(Long utrANDRXCycleLengthCoefficient) {
		this.utrANDRXCycleLengthCoefficient = utrANDRXCycleLengthCoefficient;
		return this;
	}

	//</editor-fold>

}