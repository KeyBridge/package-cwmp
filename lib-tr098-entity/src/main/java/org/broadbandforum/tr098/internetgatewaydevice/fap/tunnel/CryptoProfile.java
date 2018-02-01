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
package org.broadbandforum.tr098.internetgatewaydevice.fap.tunnel;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This object contains parameters relating to IKEv2 and IPsec crypto profiles, which are essentially a subset of the typical IPsec SPD. {{bibref|RFC4301}}.

For Cdma2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.FAP.Tunnel.CryptoProfile.{i}.")
public class CryptoProfile {

	/**
	 * Enables and disables this entry.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Specifies the Security mechanism and set of credentials used by the device to authenticate itself (either an instance of the ''.Security.Certificate.'' object defined in {{bibref|TR-157a5}} or an instance of the ''.Services.FAPService.{i}.Transport.Security.Secret.'' object defined in {{bibref|TR-196i2}}). 

{{reference}} If the value is an {{empty}}, the device chooses the authentication method based on local policy.

In order to configure the device for both device and hosting-party authentication, the object is populated with an enabled instance of the ''.Security.Certificate.''. object.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AuthMethod")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String authMethod;
	/**
	 * Controls the maximum number of child SAs that can be negotiated by a single IKE session.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "MaxChildSA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 10, max = 10)
	public Long maxChildSA = 2L;
	/**
	 * IKEv2 encryption algorithm. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IKEEncrypt")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikeEncrypt;
	/**
	 * IKEv2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IKEPRF")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikePRF;
	/**
	 * IKEv2 integrity function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IKEIntegrity")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikeIntegrity;
	/**
	 * IKEv2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IKEDH")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikeDH;
	/**
	 * IPsec encryption algorithm. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "ESPEncrypt")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> espEncrypt;
	/**
	 * IPsec integrity function. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "ESPIntegrity")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> espIntegrity;
	/**
	 * The size of the Anti-Replay Window.

If 0 Sequence Number Verification is disabled.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IPsecWindowSize")
	@CWMPParameter(access = "readWrite")
	public Long ipsecWindowSize = 0L;
	/**
	 * IKEv2 SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IKERekeyLifetime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ikeRekeyLifetime;
	/**
	 * IPsec SA rekey timeout in Kilobytes.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IPsecRekeyLifetimeByte")
	@CWMPParameter(access = "readWrite", units = "Kilobytes")
	public Long ipsecRekeyLifetimeByte;
	/**
	 * IPsec SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "IPsecRekeyLifetimeTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ipsecRekeyLifetimeTime;
	/**
	 * DPD timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "DPDTimer")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long dpdTimer = 300L;
	/**
	 * NAT-T keepalive timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "NATTKeepaliveTimer")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long natTKeepaliveTimer = 180L;
	/**
	 * Maximum fragment size, in bytes, from device before Encryption.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SecMaxFragSize")
	@CWMPParameter(access = "readWrite", units = "bytes")
	@Size(min = 256, max = 1400)
	public Long secMaxFragSize = 1200L;
	/**
	 * Indicates if the 'Do Not Fragment' bit needs to be turned on/off.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SecDFBit")
	@CWMPParameter(access = "readWrite")
	public String secDFBit = "Off";

	public CryptoProfile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables and disables this entry.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.10
	 * @param enable the input value
	 * @return this instance
	 */
	public CryptoProfile withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.10
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.10
	 * @param alias the input value
	 * @return this instance
	 */
	public CryptoProfile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the specifies the Security mechanism and set of credentials used by the device to authenticate itself (either an instance of the ''.Security.Certificate.'' object defined in {{bibref|TR-157a5}} or an instance of the ''.Services.FAPService.{i}.Transport.Security.Secret.'' object defined in {{bibref|TR-196i2}}). 

{{reference}} If the value is an {{empty}}, the device chooses the authentication method based on local policy.

In order to configure the device for both device and hosting-party authentication, the object is populated with an enabled instance of the ''.Security.Certificate.''. object.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getAuthMethod() {
		return authMethod;
	}

	/**
	 * Set the specifies the Security mechanism and set of credentials used by the device to authenticate itself (either an instance of the ''.Security.Certificate.'' object defined in {{bibref|TR-157a5}} or an instance of the ''.Services.FAPService.{i}.Transport.Security.Secret.'' object defined in {{bibref|TR-196i2}}). 

{{reference}} If the value is an {{empty}}, the device chooses the authentication method based on local policy.

In order to configure the device for both device and hosting-party authentication, the object is populated with an enabled instance of the ''.Security.Certificate.''. object.
	 *
	 * @since 1.10
	 * @param authMethod the input value
	 */
	public void  setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	/**
	 * Set the specifies the Security mechanism and set of credentials used by the device to authenticate itself (either an instance of the ''.Security.Certificate.'' object defined in {{bibref|TR-157a5}} or an instance of the ''.Services.FAPService.{i}.Transport.Security.Secret.'' object defined in {{bibref|TR-196i2}}). 

{{reference}} If the value is an {{empty}}, the device chooses the authentication method based on local policy.

In order to configure the device for both device and hosting-party authentication, the object is populated with an enabled instance of the ''.Security.Certificate.''. object.
	 *
	 * @since 1.10
	 * @param authMethod the input value
	 * @return this instance
	 */
	public CryptoProfile withAuthMethod(String authMethod) {
		this.authMethod = authMethod;
		return this;
	}

	/**
	 * Get the controls the maximum number of child SAs that can be negotiated by a single IKE session.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getMaxChildSA() {
		return maxChildSA;
	}

	/**
	 * Set the controls the maximum number of child SAs that can be negotiated by a single IKE session.
	 *
	 * @since 1.10
	 * @param maxChildSA the input value
	 */
	public void  setMaxChildSA(Long maxChildSA) {
		this.maxChildSA = maxChildSA;
	}

	/**
	 * Set the controls the maximum number of child SAs that can be negotiated by a single IKE session.
	 *
	 * @since 1.10
	 * @param maxChildSA the input value
	 * @return this instance
	 */
	public CryptoProfile withMaxChildSA(Long maxChildSA) {
		this.maxChildSA = maxChildSA;
		return this;
	}

	/**
	 * Get the ikev2 encryption algorithm. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getIkeEncrypt() {
		if (this.ikeEncrypt == null){ this.ikeEncrypt=new ArrayList<>();}
		return ikeEncrypt;
	}

	/**
	 * Set the ikev2 encryption algorithm. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikeEncrypt the input value
	 */
	public void  setIkeEncrypt(Collection<String> ikeEncrypt) {
		this.ikeEncrypt = ikeEncrypt;
	}

	/**
	 * Set the ikev2 encryption algorithm. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withIkeEncrypt(String string) {
		getIkeEncrypt().add(string);
		return this;
	}

	/**
	 * Get the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getIkePRF() {
		if (this.ikePRF == null){ this.ikePRF=new ArrayList<>();}
		return ikePRF;
	}

	/**
	 * Set the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikePRF the input value
	 */
	public void  setIkePRF(Collection<String> ikePRF) {
		this.ikePRF = ikePRF;
	}

	/**
	 * Set the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withIkePRF(String string) {
		getIkePRF().add(string);
		return this;
	}

	/**
	 * Get the ikev2 integrity function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getIkeIntegrity() {
		if (this.ikeIntegrity == null){ this.ikeIntegrity=new ArrayList<>();}
		return ikeIntegrity;
	}

	/**
	 * Set the ikev2 integrity function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikeIntegrity the input value
	 */
	public void  setIkeIntegrity(Collection<String> ikeIntegrity) {
		this.ikeIntegrity = ikeIntegrity;
	}

	/**
	 * Set the ikev2 integrity function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withIkeIntegrity(String string) {
		getIkeIntegrity().add(string);
		return this;
	}

	/**
	 * Get the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getIkeDH() {
		if (this.ikeDH == null){ this.ikeDH=new ArrayList<>();}
		return ikeDH;
	}

	/**
	 * Set the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikeDH the input value
	 */
	public void  setIkeDH(Collection<String> ikeDH) {
		this.ikeDH = ikeDH;
	}

	/**
	 * Set the ikev2 pseudo-random function. {{bibref|RFC4307}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withIkeDH(String string) {
		getIkeDH().add(string);
		return this;
	}

	/**
	 * Get the ipsec encryption algorithm. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getEspEncrypt() {
		if (this.espEncrypt == null){ this.espEncrypt=new ArrayList<>();}
		return espEncrypt;
	}

	/**
	 * Set the ipsec encryption algorithm. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param espEncrypt the input value
	 */
	public void  setEspEncrypt(Collection<String> espEncrypt) {
		this.espEncrypt = espEncrypt;
	}

	/**
	 * Set the ipsec encryption algorithm. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withEspEncrypt(String string) {
		getEspEncrypt().add(string);
		return this;
	}

	/**
	 * Get the ipsec integrity function. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getEspIntegrity() {
		if (this.espIntegrity == null){ this.espIntegrity=new ArrayList<>();}
		return espIntegrity;
	}

	/**
	 * Set the ipsec integrity function. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param espIntegrity the input value
	 */
	public void  setEspIntegrity(Collection<String> espIntegrity) {
		this.espIntegrity = espIntegrity;
	}

	/**
	 * Set the ipsec integrity function. {{bibref|RFC4835|Section 3.1.1}}

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public CryptoProfile withEspIntegrity(String string) {
		getEspIntegrity().add(string);
		return this;
	}

	/**
	 * Get the size of the Anti-Replay Window.

If 0 Sequence Number Verification is disabled.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getIpsecWindowSize() {
		return ipsecWindowSize;
	}

	/**
	 * Set the size of the Anti-Replay Window.

If 0 Sequence Number Verification is disabled.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecWindowSize the input value
	 */
	public void  setIpsecWindowSize(Long ipsecWindowSize) {
		this.ipsecWindowSize = ipsecWindowSize;
	}

	/**
	 * Set the size of the Anti-Replay Window.

If 0 Sequence Number Verification is disabled.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecWindowSize the input value
	 * @return this instance
	 */
	public CryptoProfile withIpsecWindowSize(Long ipsecWindowSize) {
		this.ipsecWindowSize = ipsecWindowSize;
		return this;
	}

	/**
	 * Get the ikev2 SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getIkeRekeyLifetime() {
		return ikeRekeyLifetime;
	}

	/**
	 * Set the ikev2 SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikeRekeyLifetime the input value
	 */
	public void  setIkeRekeyLifetime(Long ikeRekeyLifetime) {
		this.ikeRekeyLifetime = ikeRekeyLifetime;
	}

	/**
	 * Set the ikev2 SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ikeRekeyLifetime the input value
	 * @return this instance
	 */
	public CryptoProfile withIkeRekeyLifetime(Long ikeRekeyLifetime) {
		this.ikeRekeyLifetime = ikeRekeyLifetime;
		return this;
	}

	/**
	 * Get the ipsec SA rekey timeout in Kilobytes.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getIpsecRekeyLifetimeByte() {
		return ipsecRekeyLifetimeByte;
	}

	/**
	 * Set the ipsec SA rekey timeout in Kilobytes.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecRekeyLifetimeByte the input value
	 */
	public void  setIpsecRekeyLifetimeByte(Long ipsecRekeyLifetimeByte) {
		this.ipsecRekeyLifetimeByte = ipsecRekeyLifetimeByte;
	}

	/**
	 * Set the ipsec SA rekey timeout in Kilobytes.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecRekeyLifetimeByte the input value
	 * @return this instance
	 */
	public CryptoProfile withIpsecRekeyLifetimeByte(Long ipsecRekeyLifetimeByte) {
		this.ipsecRekeyLifetimeByte = ipsecRekeyLifetimeByte;
		return this;
	}

	/**
	 * Get the ipsec SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getIpsecRekeyLifetimeTime() {
		return ipsecRekeyLifetimeTime;
	}

	/**
	 * Set the ipsec SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecRekeyLifetimeTime the input value
	 */
	public void  setIpsecRekeyLifetimeTime(Long ipsecRekeyLifetimeTime) {
		this.ipsecRekeyLifetimeTime = ipsecRekeyLifetimeTime;
	}

	/**
	 * Set the ipsec SA rekey timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param ipsecRekeyLifetimeTime the input value
	 * @return this instance
	 */
	public CryptoProfile withIpsecRekeyLifetimeTime(Long ipsecRekeyLifetimeTime) {
		this.ipsecRekeyLifetimeTime = ipsecRekeyLifetimeTime;
		return this;
	}

	/**
	 * Get the dpd timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getDpdTimer() {
		return dpdTimer;
	}

	/**
	 * Set the dpd timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param dpdTimer the input value
	 */
	public void  setDpdTimer(Long dpdTimer) {
		this.dpdTimer = dpdTimer;
	}

	/**
	 * Set the dpd timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param dpdTimer the input value
	 * @return this instance
	 */
	public CryptoProfile withDpdTimer(Long dpdTimer) {
		this.dpdTimer = dpdTimer;
		return this;
	}

	/**
	 * Get the nat-T keepalive timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getNatTKeepaliveTimer() {
		return natTKeepaliveTimer;
	}

	/**
	 * Set the nat-T keepalive timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param natTKeepaliveTimer the input value
	 */
	public void  setNatTKeepaliveTimer(Long natTKeepaliveTimer) {
		this.natTKeepaliveTimer = natTKeepaliveTimer;
	}

	/**
	 * Set the nat-T keepalive timeout in seconds.

For UMTS devices, see {{bibref|3GPP-TS.32.582}} and {{bibref|3GPP-TS.32.584}}. For LTE devices, see {{bibref|3GPP-TS.32.592}}. For CDMA2000 devices, see {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param natTKeepaliveTimer the input value
	 * @return this instance
	 */
	public CryptoProfile withNatTKeepaliveTimer(Long natTKeepaliveTimer) {
		this.natTKeepaliveTimer = natTKeepaliveTimer;
		return this;
	}

	/**
	 * Get the maximum fragment size, in bytes, from device before Encryption.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getSecMaxFragSize() {
		return secMaxFragSize;
	}

	/**
	 * Set the maximum fragment size, in bytes, from device before Encryption.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param secMaxFragSize the input value
	 */
	public void  setSecMaxFragSize(Long secMaxFragSize) {
		this.secMaxFragSize = secMaxFragSize;
	}

	/**
	 * Set the maximum fragment size, in bytes, from device before Encryption.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param secMaxFragSize the input value
	 * @return this instance
	 */
	public CryptoProfile withSecMaxFragSize(Long secMaxFragSize) {
		this.secMaxFragSize = secMaxFragSize;
		return this;
	}

	/**
	 * Get the indicates if the 'Do Not Fragment' bit needs to be turned on/off.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getSecDFBit() {
		return secDFBit;
	}

	/**
	 * Set the indicates if the 'Do Not Fragment' bit needs to be turned on/off.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param secDFBit the input value
	 */
	public void  setSecDFBit(String secDFBit) {
		this.secDFBit = secDFBit;
	}

	/**
	 * Set the indicates if the 'Do Not Fragment' bit needs to be turned on/off.

For CDMA2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @since 1.10
	 * @param secDFBit the input value
	 * @return this instance
	 */
	public CryptoProfile withSecDFBit(String secDFBit) {
		this.secDFBit = secDFBit;
		return this;
	}

	//</editor-fold>

}