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
package org.broadbandforum.tr104.voiceservice.dect;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * DECT portable table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.DECT.Portable.{i}.")
@XmlRootElement(name = "Portable")
@XmlType(name = "VoiceService.DECT.Portable")
@XmlAccessorType(XmlAccessType.FIELD)
public class Portable {

	/**
	 * Enables or disables this DECT portable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this DECT portable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the portable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CodecList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> codecList;
	/**
	 * The current registration status of the DECT portable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationStatus")
	public String registrationStatus;
	/**
	 * The International Portable User Identity which uniquely identifies the current user of the portable. 

The IPUI is composed of the Portable User Type (PUT), of 4 bits, followed by the Portable User Number (PUN) whose size and format depend on PUT (see {{bibref|ETSI_EN_300_175-6|Section 6.2}}).

The hexbinary string is encoded exactly as it is defined in {{bibref|ETSI_EN_300_175-5|section 7.7.30}}) :

* Bits from position 0 to 3 represent the PUT (as defined in {{bibref|ETSI_EN_300_175-6|section 7.3}}).

* Bits from position 4 to {{param|IPUILength}}-1 represent the PUN.

* Unused bits after position {{param|IPUILength}}-1 are set to 0.

Examples :

: - Type N (PUT + IPEI) :

:: - PUT = 0000 (4 bits) = 0 (hexadecimal)

:: - IPEI = 0000 0000 0000 1100 0000 0000 0000 1000 1001 (36 bits) = 00 0C 00 08 9 (hexadecimal)

:: - IPUILength = 4 + 36 = 40 (bits)

:: - IPUI = 00 00 C0 00 89 (40 bits; multiple of 8 so no bits are ignored)

: - Type O (PUT + binary-coded number) :

:: - PUT = 0001 (4 bits) = 1 (hexadecimal)

:: - Number (decimal) = 4546812123 

:: - Number (binary) = 1000 0111 1000 0001 0110 1100 0110 1101 1 (33 bits)

:: - Number (hexadecimal) = 87 81 6C 6D 8 (33 bits; last three bits are ignored)

:: - IPUILength = 4 + 33 = 37 (bits)

:: - IPUI = 18 78 16 C6 D8 (37 bits; last 3 bits are ignored)

: - Type Q (PUT + BCD number) :

:: - PUT = 0011 (4 bits) = 3 (hexadecimal)

:: - Number (decimal) = 4546812123

:: - Number (BCD) = 0100 0101 0100 0110 1000 0001 0010 0001 0010 0011 (40 bits)

:: - IPUILength = 4 + 40 = 44 (bits)

:: - IPUI = 34 54 68 12 12 30 (40 bits; last 4 bits are ignored)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPUI")
	public byte[] ipuI;
	/**
	 * The length of {{param|IPUI}}, in bits.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPUILength")
	public Long ipuILength;
	/**
	 * The International Portable Equipment Identity which is globally unique and identifies the portable.

The IPEI is composed of the Equipment Manufacturer's Code (EMC), of 16 bits, followed by the Portable equipment Serial Number (PSN) of 20 bits (see {{bibref|ETSI_EN_300_175-6|Section 10}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 15 represent the EMC.

* Bits from position 16 to 35 represent the PSN.

* The last four bits are unused and are set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPEI")
	public byte[] ipeI;
	/**
	 * The Portable Access Rights Key of this portable.

The PARK is composed of the Access Rights Class (ARC) of 3 bits and the Access Rights Details (ARD) whose size and format depend on the ARC (see {{bibref|ETSI_EN_300_175-6|Sections 6.1.1 to 6.1.5}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 2 represent the ARC (as defined in {{bibref|ETSI_EN_300_175-6|section 7.2}}).

* For class A :

** Bits from position 3 to 35 represent the ARD.

** The last four bits are unused and are set to 0.

* For other classes :

** Bits from position 3 to 31 represent the ARD.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PARK")
	public byte[] parK;
	/**
	 * Refers to the {{object|#.Base}} where this portable part is attached to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BaseAttachedTo")
	@Size(max = 256)
	public String baseAttachedTo;
	/**
	 * {{list}} Protocols used for connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PortableType")
	@XmlList
	public Collection<String> portableType;
	/**
	 * The date and time in which the DECT portable has been subscribed with the base.

If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubscriptionTime")
	public LocalDateTime subscriptionTime;
	/**
	 * This parameter MAY be used by the ACS to control the registration status of the portable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Control")
	@CWMPParameter(access = "readWrite")
	public String control;
	/**
	 * Indicates the Hardware Version of a DECT portable. Corresponds to the portable HW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HardwareVersion")
	@Size(max = 20)
	public String hardwareVersion;
	/**
	 * Indicates the Software Version used by a DECT portable. Maps with the portable SW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SoftwareVersion")
	@Size(max = 20)
	public String softwareVersion;
	/**
	 * This parameter indicates support for SUOTA (Software Update Over The Air).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SoftwareUpgrade")
	public Boolean softwareUpgrade;
	/**
	 * Indicates the last successful SW update of the DECT portable. This is based on the reception of a FACILITY message (being part of the HS version indication procedure) from the portable containing another value of SW version than the current value in this table. This new SW version is then updated in this table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastUpdateDateTime")
	public LocalDateTime lastUpdateDateTime;
	/**
	 * The name of the operator that will be displayed on the portable, if it supports this feature.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperatorName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String operatorName;

	public Portable() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this DECT portable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this DECT portable.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this DECT portable.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Portable withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this DECT portable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this DECT portable.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this DECT portable.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Portable withStatus(String status) {
		this.status = status;
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
	public Portable withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the portable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getCodecList() {
		if (this.codecList == null){ this.codecList=new ArrayList<>();}
		return codecList;
	}

	/**
	 * Set the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the portable.
	 *
	 * @since 2.0
	 * @param codecList the input value
	 */
	public void  setCodecList(Collection<String> codecList) {
		this.codecList = codecList;
	}

	/**
	 * Set the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the portable.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Portable withCodecList(String string) {
		getCodecList().add(string);
		return this;
	}

	/**
	 * Get the current registration status of the DECT portable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegistrationStatus() {
		return registrationStatus;
	}

	/**
	 * Set the current registration status of the DECT portable.
	 *
	 * @since 2.0
	 * @param registrationStatus the input value
	 */
	public void  setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	/**
	 * Set the current registration status of the DECT portable.
	 *
	 * @since 2.0
	 * @param registrationStatus the input value
	 * @return this instance
	 */
	public Portable withRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
		return this;
	}

	/**
	 * Get the International Portable User Identity which uniquely identifies the current user of the portable. 

The IPUI is composed of the Portable User Type (PUT), of 4 bits, followed by the Portable User Number (PUN) whose size and format depend on PUT (see {{bibref|ETSI_EN_300_175-6|Section 6.2}}).

The hexbinary string is encoded exactly as it is defined in {{bibref|ETSI_EN_300_175-5|section 7.7.30}}) :

* Bits from position 0 to 3 represent the PUT (as defined in {{bibref|ETSI_EN_300_175-6|section 7.3}}).

* Bits from position 4 to {{param|IPUILength}}-1 represent the PUN.

* Unused bits after position {{param|IPUILength}}-1 are set to 0.

Examples :

: - Type N (PUT + IPEI) :

:: - PUT = 0000 (4 bits) = 0 (hexadecimal)

:: - IPEI = 0000 0000 0000 1100 0000 0000 0000 1000 1001 (36 bits) = 00 0C 00 08 9 (hexadecimal)

:: - IPUILength = 4 + 36 = 40 (bits)

:: - IPUI = 00 00 C0 00 89 (40 bits; multiple of 8 so no bits are ignored)

: - Type O (PUT + binary-coded number) :

:: - PUT = 0001 (4 bits) = 1 (hexadecimal)

:: - Number (decimal) = 4546812123 

:: - Number (binary) = 1000 0111 1000 0001 0110 1100 0110 1101 1 (33 bits)

:: - Number (hexadecimal) = 87 81 6C 6D 8 (33 bits; last three bits are ignored)

:: - IPUILength = 4 + 33 = 37 (bits)

:: - IPUI = 18 78 16 C6 D8 (37 bits; last 3 bits are ignored)

: - Type Q (PUT + BCD number) :

:: - PUT = 0011 (4 bits) = 3 (hexadecimal)

:: - Number (decimal) = 4546812123

:: - Number (BCD) = 0100 0101 0100 0110 1000 0001 0010 0001 0010 0011 (40 bits)

:: - IPUILength = 4 + 40 = 44 (bits)

:: - IPUI = 34 54 68 12 12 30 (40 bits; last 4 bits are ignored)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getIpuI() {
		return ipuI;
	}

	/**
	 * Set the International Portable User Identity which uniquely identifies the current user of the portable. 

The IPUI is composed of the Portable User Type (PUT), of 4 bits, followed by the Portable User Number (PUN) whose size and format depend on PUT (see {{bibref|ETSI_EN_300_175-6|Section 6.2}}).

The hexbinary string is encoded exactly as it is defined in {{bibref|ETSI_EN_300_175-5|section 7.7.30}}) :

* Bits from position 0 to 3 represent the PUT (as defined in {{bibref|ETSI_EN_300_175-6|section 7.3}}).

* Bits from position 4 to {{param|IPUILength}}-1 represent the PUN.

* Unused bits after position {{param|IPUILength}}-1 are set to 0.

Examples :

: - Type N (PUT + IPEI) :

:: - PUT = 0000 (4 bits) = 0 (hexadecimal)

:: - IPEI = 0000 0000 0000 1100 0000 0000 0000 1000 1001 (36 bits) = 00 0C 00 08 9 (hexadecimal)

:: - IPUILength = 4 + 36 = 40 (bits)

:: - IPUI = 00 00 C0 00 89 (40 bits; multiple of 8 so no bits are ignored)

: - Type O (PUT + binary-coded number) :

:: - PUT = 0001 (4 bits) = 1 (hexadecimal)

:: - Number (decimal) = 4546812123 

:: - Number (binary) = 1000 0111 1000 0001 0110 1100 0110 1101 1 (33 bits)

:: - Number (hexadecimal) = 87 81 6C 6D 8 (33 bits; last three bits are ignored)

:: - IPUILength = 4 + 33 = 37 (bits)

:: - IPUI = 18 78 16 C6 D8 (37 bits; last 3 bits are ignored)

: - Type Q (PUT + BCD number) :

:: - PUT = 0011 (4 bits) = 3 (hexadecimal)

:: - Number (decimal) = 4546812123

:: - Number (BCD) = 0100 0101 0100 0110 1000 0001 0010 0001 0010 0011 (40 bits)

:: - IPUILength = 4 + 40 = 44 (bits)

:: - IPUI = 34 54 68 12 12 30 (40 bits; last 4 bits are ignored)
	 *
	 * @since 2.0
	 * @param ipuI the input value
	 */
	public void  setIpuI(byte[] ipuI) {
		this.ipuI = ipuI;
	}

	/**
	 * Set the International Portable User Identity which uniquely identifies the current user of the portable. 

The IPUI is composed of the Portable User Type (PUT), of 4 bits, followed by the Portable User Number (PUN) whose size and format depend on PUT (see {{bibref|ETSI_EN_300_175-6|Section 6.2}}).

The hexbinary string is encoded exactly as it is defined in {{bibref|ETSI_EN_300_175-5|section 7.7.30}}) :

* Bits from position 0 to 3 represent the PUT (as defined in {{bibref|ETSI_EN_300_175-6|section 7.3}}).

* Bits from position 4 to {{param|IPUILength}}-1 represent the PUN.

* Unused bits after position {{param|IPUILength}}-1 are set to 0.

Examples :

: - Type N (PUT + IPEI) :

:: - PUT = 0000 (4 bits) = 0 (hexadecimal)

:: - IPEI = 0000 0000 0000 1100 0000 0000 0000 1000 1001 (36 bits) = 00 0C 00 08 9 (hexadecimal)

:: - IPUILength = 4 + 36 = 40 (bits)

:: - IPUI = 00 00 C0 00 89 (40 bits; multiple of 8 so no bits are ignored)

: - Type O (PUT + binary-coded number) :

:: - PUT = 0001 (4 bits) = 1 (hexadecimal)

:: - Number (decimal) = 4546812123 

:: - Number (binary) = 1000 0111 1000 0001 0110 1100 0110 1101 1 (33 bits)

:: - Number (hexadecimal) = 87 81 6C 6D 8 (33 bits; last three bits are ignored)

:: - IPUILength = 4 + 33 = 37 (bits)

:: - IPUI = 18 78 16 C6 D8 (37 bits; last 3 bits are ignored)

: - Type Q (PUT + BCD number) :

:: - PUT = 0011 (4 bits) = 3 (hexadecimal)

:: - Number (decimal) = 4546812123

:: - Number (BCD) = 0100 0101 0100 0110 1000 0001 0010 0001 0010 0011 (40 bits)

:: - IPUILength = 4 + 40 = 44 (bits)

:: - IPUI = 34 54 68 12 12 30 (40 bits; last 4 bits are ignored)
	 *
	 * @since 2.0
	 * @param ipuI the input value
	 * @return this instance
	 */
	public Portable withIpuI(byte[] ipuI) {
		this.ipuI = ipuI;
		return this;
	}

	/**
	 * Get the length of {{param|IPUI}}, in bits.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIpuILength() {
		return ipuILength;
	}

	/**
	 * Set the length of {{param|IPUI}}, in bits.
	 *
	 * @since 2.0
	 * @param ipuILength the input value
	 */
	public void  setIpuILength(Long ipuILength) {
		this.ipuILength = ipuILength;
	}

	/**
	 * Set the length of {{param|IPUI}}, in bits.
	 *
	 * @since 2.0
	 * @param ipuILength the input value
	 * @return this instance
	 */
	public Portable withIpuILength(Long ipuILength) {
		this.ipuILength = ipuILength;
		return this;
	}

	/**
	 * Get the International Portable Equipment Identity which is globally unique and identifies the portable.

The IPEI is composed of the Equipment Manufacturer's Code (EMC), of 16 bits, followed by the Portable equipment Serial Number (PSN) of 20 bits (see {{bibref|ETSI_EN_300_175-6|Section 10}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 15 represent the EMC.

* Bits from position 16 to 35 represent the PSN.

* The last four bits are unused and are set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getIpeI() {
		return ipeI;
	}

	/**
	 * Set the International Portable Equipment Identity which is globally unique and identifies the portable.

The IPEI is composed of the Equipment Manufacturer's Code (EMC), of 16 bits, followed by the Portable equipment Serial Number (PSN) of 20 bits (see {{bibref|ETSI_EN_300_175-6|Section 10}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 15 represent the EMC.

* Bits from position 16 to 35 represent the PSN.

* The last four bits are unused and are set to 0.
	 *
	 * @since 2.0
	 * @param ipeI the input value
	 */
	public void  setIpeI(byte[] ipeI) {
		this.ipeI = ipeI;
	}

	/**
	 * Set the International Portable Equipment Identity which is globally unique and identifies the portable.

The IPEI is composed of the Equipment Manufacturer's Code (EMC), of 16 bits, followed by the Portable equipment Serial Number (PSN) of 20 bits (see {{bibref|ETSI_EN_300_175-6|Section 10}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 15 represent the EMC.

* Bits from position 16 to 35 represent the PSN.

* The last four bits are unused and are set to 0.
	 *
	 * @since 2.0
	 * @param ipeI the input value
	 * @return this instance
	 */
	public Portable withIpeI(byte[] ipeI) {
		this.ipeI = ipeI;
		return this;
	}

	/**
	 * Get the Portable Access Rights Key of this portable.

The PARK is composed of the Access Rights Class (ARC) of 3 bits and the Access Rights Details (ARD) whose size and format depend on the ARC (see {{bibref|ETSI_EN_300_175-6|Sections 6.1.1 to 6.1.5}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 2 represent the ARC (as defined in {{bibref|ETSI_EN_300_175-6|section 7.2}}).

* For class A :

** Bits from position 3 to 35 represent the ARD.

** The last four bits are unused and are set to 0.

* For other classes :

** Bits from position 3 to 31 represent the ARD.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getParK() {
		return parK;
	}

	/**
	 * Set the Portable Access Rights Key of this portable.

The PARK is composed of the Access Rights Class (ARC) of 3 bits and the Access Rights Details (ARD) whose size and format depend on the ARC (see {{bibref|ETSI_EN_300_175-6|Sections 6.1.1 to 6.1.5}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 2 represent the ARC (as defined in {{bibref|ETSI_EN_300_175-6|section 7.2}}).

* For class A :

** Bits from position 3 to 35 represent the ARD.

** The last four bits are unused and are set to 0.

* For other classes :

** Bits from position 3 to 31 represent the ARD.
	 *
	 * @since 2.0
	 * @param parK the input value
	 */
	public void  setParK(byte[] parK) {
		this.parK = parK;
	}

	/**
	 * Set the Portable Access Rights Key of this portable.

The PARK is composed of the Access Rights Class (ARC) of 3 bits and the Access Rights Details (ARD) whose size and format depend on the ARC (see {{bibref|ETSI_EN_300_175-6|Sections 6.1.1 to 6.1.5}}).

The hexbinary string is encoded as follows :

* Bits from position 0 to 2 represent the ARC (as defined in {{bibref|ETSI_EN_300_175-6|section 7.2}}).

* For class A :

** Bits from position 3 to 35 represent the ARD.

** The last four bits are unused and are set to 0.

* For other classes :

** Bits from position 3 to 31 represent the ARD.
	 *
	 * @since 2.0
	 * @param parK the input value
	 * @return this instance
	 */
	public Portable withParK(byte[] parK) {
		this.parK = parK;
		return this;
	}

	/**
	 * Get the refers to the {{object|#.Base}} where this portable part is attached to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBaseAttachedTo() {
		return baseAttachedTo;
	}

	/**
	 * Set the refers to the {{object|#.Base}} where this portable part is attached to.
	 *
	 * @since 2.0
	 * @param baseAttachedTo the input value
	 */
	public void  setBaseAttachedTo(String baseAttachedTo) {
		this.baseAttachedTo = baseAttachedTo;
	}

	/**
	 * Set the refers to the {{object|#.Base}} where this portable part is attached to.
	 *
	 * @since 2.0
	 * @param baseAttachedTo the input value
	 * @return this instance
	 */
	public Portable withBaseAttachedTo(String baseAttachedTo) {
		this.baseAttachedTo = baseAttachedTo;
		return this;
	}

	/**
	 * Get the {{list}} Protocols used for connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPortableType() {
		if (this.portableType == null){ this.portableType=new ArrayList<>();}
		return portableType;
	}

	/**
	 * Set the {{list}} Protocols used for connection.
	 *
	 * @since 2.0
	 * @param portableType the input value
	 */
	public void  setPortableType(Collection<String> portableType) {
		this.portableType = portableType;
	}

	/**
	 * Set the {{list}} Protocols used for connection.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Portable withPortableType(String string) {
		getPortableType().add(string);
		return this;
	}

	/**
	 * Get the date and time in which the DECT portable has been subscribed with the base.

If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getSubscriptionTime() {
		return subscriptionTime;
	}

	/**
	 * Set the date and time in which the DECT portable has been subscribed with the base.

If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param subscriptionTime the input value
	 */
	public void  setSubscriptionTime(LocalDateTime subscriptionTime) {
		this.subscriptionTime = subscriptionTime;
	}

	/**
	 * Set the date and time in which the DECT portable has been subscribed with the base.

If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param subscriptionTime the input value
	 * @return this instance
	 */
	public Portable withSubscriptionTime(LocalDateTime subscriptionTime) {
		this.subscriptionTime = subscriptionTime;
		return this;
	}

	/**
	 * Get the this parameter MAY be used by the ACS to control the registration status of the portable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getControl() {
		return control;
	}

	/**
	 * Set the this parameter MAY be used by the ACS to control the registration status of the portable.
	 *
	 * @since 2.0
	 * @param control the input value
	 */
	public void  setControl(String control) {
		this.control = control;
	}

	/**
	 * Set the this parameter MAY be used by the ACS to control the registration status of the portable.
	 *
	 * @since 2.0
	 * @param control the input value
	 * @return this instance
	 */
	public Portable withControl(String control) {
		this.control = control;
		return this;
	}

	/**
	 * Get the indicates the Hardware Version of a DECT portable. Corresponds to the portable HW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHardwareVersion() {
		return hardwareVersion;
	}

	/**
	 * Set the indicates the Hardware Version of a DECT portable. Corresponds to the portable HW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 */
	public void  setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	/**
	 * Set the indicates the Hardware Version of a DECT portable. Corresponds to the portable HW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 * @return this instance
	 */
	public Portable withHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		return this;
	}

	/**
	 * Get the indicates the Software Version used by a DECT portable. Maps with the portable SW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * Set the indicates the Software Version used by a DECT portable. Maps with the portable SW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @param softwareVersion the input value
	 */
	public void  setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * Set the indicates the Software Version used by a DECT portable. Maps with the portable SW Version identifier parameter, as defined in {{bibref|ETSI_TS_102_527-4}}.
	 *
	 * @since 2.0
	 * @param softwareVersion the input value
	 * @return this instance
	 */
	public Portable withSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
		return this;
	}

	/**
	 * Get the this parameter indicates support for SUOTA (Software Update Over The Air).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSoftwareUpgrade() {
		return softwareUpgrade;
	}

	/**
	 * Set the this parameter indicates support for SUOTA (Software Update Over The Air).
	 *
	 * @since 2.0
	 * @param softwareUpgrade the input value
	 */
	public void  setSoftwareUpgrade(Boolean softwareUpgrade) {
		this.softwareUpgrade = softwareUpgrade;
	}

	/**
	 * Set the this parameter indicates support for SUOTA (Software Update Over The Air).
	 *
	 * @since 2.0
	 * @param softwareUpgrade the input value
	 * @return this instance
	 */
	public Portable withSoftwareUpgrade(Boolean softwareUpgrade) {
		this.softwareUpgrade = softwareUpgrade;
		return this;
	}

	/**
	 * Get the indicates the last successful SW update of the DECT portable. This is based on the reception of a FACILITY message (being part of the HS version indication procedure) from the portable containing another value of SW version than the current value in this table. This new SW version is then updated in this table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}

	/**
	 * Set the indicates the last successful SW update of the DECT portable. This is based on the reception of a FACILITY message (being part of the HS version indication procedure) from the portable containing another value of SW version than the current value in this table. This new SW version is then updated in this table.
	 *
	 * @since 2.0
	 * @param lastUpdateDateTime the input value
	 */
	public void  setLastUpdateDateTime(LocalDateTime lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}

	/**
	 * Set the indicates the last successful SW update of the DECT portable. This is based on the reception of a FACILITY message (being part of the HS version indication procedure) from the portable containing another value of SW version than the current value in this table. This new SW version is then updated in this table.
	 *
	 * @since 2.0
	 * @param lastUpdateDateTime the input value
	 * @return this instance
	 */
	public Portable withLastUpdateDateTime(LocalDateTime lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
		return this;
	}

	/**
	 * Get the name of the operator that will be displayed on the portable, if it supports this feature.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOperatorName() {
		return operatorName;
	}

	/**
	 * Set the name of the operator that will be displayed on the portable, if it supports this feature.
	 *
	 * @since 2.0
	 * @param operatorName the input value
	 */
	public void  setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * Set the name of the operator that will be displayed on the portable, if it supports this feature.
	 *
	 * @since 2.0
	 * @param operatorName the input value
	 * @return this instance
	 */
	public Portable withOperatorName(String operatorName) {
		this.operatorName = operatorName;
		return this;
	}

	//</editor-fold>

}