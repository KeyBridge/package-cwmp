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
package org.broadbandforum.tr104.voiceservice.capabilities.sip;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * SIP client capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.SIP.Client.")
@XmlRootElement(name = "VoiceService.Capabilities.SIP.Client")
@XmlType(name = "VoiceService.Capabilities.SIP.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * {{list}}  Each item is a supported SIP extension method among the methods listed in the IANA SIP parameters registry (see {{bibref|IANA_SIP_Methods}}). SIP extension methods MUST be in the form of the method name in upper case.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "REFER"

: "INFO"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Extensions")
	@XmlList
	public Collection<String> extensions;
	/**
	 * {{list}} Each item is a supported URI scheme beyond the URI schemes REQUIRED by the SIP specification ({{bibref|RFC3261}}). Each URI scheme is given by the URI prefix, without the colon separator.  Example:

"tel, fax"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URISchemes")
	@XmlList
	public Collection<String> uriSchemes;
	/**
	 * {{list}} Each item is a supported event package among the event packages listed in the IANA registry for SIP Event Type Namespace (see {{bibref|IANA_Event_Packages}}).

The list MAY include vendor-specific event packages, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "call-completion"

: "presence"

: "X_EXAMPLE-COM_MyEvtPkg"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EventTypes")
	@XmlList
	public Collection<String> eventTypes;
	/**
	 * {{list}} Each item is a supported authentication protocol for TLS transport. 

Enumerated value must be one of [Null, MD5, SHA-1, SHA-2, AEAD]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TLSAuthenticationProtocols")
	@XmlList
	public Collection<String> tlsAuthenticationProtocols;
	/**
	 * {{list}} Each item represents a supported TLS authentication key size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TLSAuthenticationKeySizes")
	public Long tlsAuthenticationKeySizes;
	/**
	 * {{list}} Each item is a supported encryption protocol for TLS transport.  

Enumerated value must be one of [Null, RC4, RC2, DES, 3DES, AES, Camellia]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TLSEncryptionProtocols")
	@XmlList
	public Collection<String> tlsEncryptionProtocols;
	/**
	 * {{list}}  Each item is a supported TLS encryption key size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TLSEncryptionKeySizes")
	public Long tlsEncryptionKeySizes;
	/**
	 * {{list}} Each item is a supported key exchange protocol for TLS transport.  

Enumerated value must be one of [RSA, DSS, DHE-RSA, DHE-DSS, ECDHE-RSA, ECDHE-ECDSA]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TLSKeyExchangeProtocols")
	@XmlList
	public Collection<String> tlsKeyExchangeProtocols;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}}  Each item is a supported SIP extension method among the methods listed in the IANA SIP parameters registry (see {{bibref|IANA_SIP_Methods}}). SIP extension methods MUST be in the form of the method name in upper case.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "REFER"

: "INFO"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getExtensions() {
		if (this.extensions == null){ this.extensions=new ArrayList<>();}
		return extensions;
	}

	/**
	 * Set the {{list}}  Each item is a supported SIP extension method among the methods listed in the IANA SIP parameters registry (see {{bibref|IANA_SIP_Methods}}). SIP extension methods MUST be in the form of the method name in upper case.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "REFER"

: "INFO"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @param extensions the input value
	 */
	public void  setExtensions(Collection<String> extensions) {
		this.extensions = extensions;
	}

	/**
	 * Set the {{list}}  Each item is a supported SIP extension method among the methods listed in the IANA SIP parameters registry (see {{bibref|IANA_SIP_Methods}}). SIP extension methods MUST be in the form of the method name in upper case.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "REFER"

: "INFO"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withExtensions(String string) {
		getExtensions().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported URI scheme beyond the URI schemes REQUIRED by the SIP specification ({{bibref|RFC3261}}). Each URI scheme is given by the URI prefix, without the colon separator.  Example:

"tel, fax"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getUriSchemes() {
		if (this.uriSchemes == null){ this.uriSchemes=new ArrayList<>();}
		return uriSchemes;
	}

	/**
	 * Set the {{list}} Each item is a supported URI scheme beyond the URI schemes REQUIRED by the SIP specification ({{bibref|RFC3261}}). Each URI scheme is given by the URI prefix, without the colon separator.  Example:

"tel, fax"
	 *
	 * @since 2.0
	 * @param uriSchemes the input value
	 */
	public void  setUriSchemes(Collection<String> uriSchemes) {
		this.uriSchemes = uriSchemes;
	}

	/**
	 * Set the {{list}} Each item is a supported URI scheme beyond the URI schemes REQUIRED by the SIP specification ({{bibref|RFC3261}}). Each URI scheme is given by the URI prefix, without the colon separator.  Example:

"tel, fax"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withUriSchemes(String string) {
		getUriSchemes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported event package among the event packages listed in the IANA registry for SIP Event Type Namespace (see {{bibref|IANA_Event_Packages}}).

The list MAY include vendor-specific event packages, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "call-completion"

: "presence"

: "X_EXAMPLE-COM_MyEvtPkg"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getEventTypes() {
		if (this.eventTypes == null){ this.eventTypes=new ArrayList<>();}
		return eventTypes;
	}

	/**
	 * Set the {{list}} Each item is a supported event package among the event packages listed in the IANA registry for SIP Event Type Namespace (see {{bibref|IANA_Event_Packages}}).

The list MAY include vendor-specific event packages, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "call-completion"

: "presence"

: "X_EXAMPLE-COM_MyEvtPkg"
	 *
	 * @since 2.0
	 * @param eventTypes the input value
	 */
	public void  setEventTypes(Collection<String> eventTypes) {
		this.eventTypes = eventTypes;
	}

	/**
	 * Set the {{list}} Each item is a supported event package among the event packages listed in the IANA registry for SIP Event Type Namespace (see {{bibref|IANA_Event_Packages}}).

The list MAY include vendor-specific event packages, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "call-completion"

: "presence"

: "X_EXAMPLE-COM_MyEvtPkg"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withEventTypes(String string) {
		getEventTypes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported authentication protocol for TLS transport. 

Enumerated value must be one of [Null, MD5, SHA-1, SHA-2, AEAD]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTlsAuthenticationProtocols() {
		if (this.tlsAuthenticationProtocols == null){ this.tlsAuthenticationProtocols=new ArrayList<>();}
		return tlsAuthenticationProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported authentication protocol for TLS transport. 

Enumerated value must be one of [Null, MD5, SHA-1, SHA-2, AEAD]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param tlsAuthenticationProtocols the input value
	 */
	public void  setTlsAuthenticationProtocols(Collection<String> tlsAuthenticationProtocols) {
		this.tlsAuthenticationProtocols = tlsAuthenticationProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported authentication protocol for TLS transport. 

Enumerated value must be one of [Null, MD5, SHA-1, SHA-2, AEAD]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withTlsAuthenticationProtocols(String string) {
		getTlsAuthenticationProtocols().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item represents a supported TLS authentication key size.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTlsAuthenticationKeySizes() {
		return tlsAuthenticationKeySizes;
	}

	/**
	 * Set the {{list}} Each item represents a supported TLS authentication key size.
	 *
	 * @since 2.0
	 * @param tlsAuthenticationKeySizes the input value
	 */
	public void  setTlsAuthenticationKeySizes(Long tlsAuthenticationKeySizes) {
		this.tlsAuthenticationKeySizes = tlsAuthenticationKeySizes;
	}

	/**
	 * Set the {{list}} Each item represents a supported TLS authentication key size.
	 *
	 * @since 2.0
	 * @param tlsAuthenticationKeySizes the input value
	 * @return this instance
	 */
	public Client withTlsAuthenticationKeySizes(Long tlsAuthenticationKeySizes) {
		this.tlsAuthenticationKeySizes = tlsAuthenticationKeySizes;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported encryption protocol for TLS transport.  

Enumerated value must be one of [Null, RC4, RC2, DES, 3DES, AES, Camellia]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTlsEncryptionProtocols() {
		if (this.tlsEncryptionProtocols == null){ this.tlsEncryptionProtocols=new ArrayList<>();}
		return tlsEncryptionProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported encryption protocol for TLS transport.  

Enumerated value must be one of [Null, RC4, RC2, DES, 3DES, AES, Camellia]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param tlsEncryptionProtocols the input value
	 */
	public void  setTlsEncryptionProtocols(Collection<String> tlsEncryptionProtocols) {
		this.tlsEncryptionProtocols = tlsEncryptionProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported encryption protocol for TLS transport.  

Enumerated value must be one of [Null, RC4, RC2, DES, 3DES, AES, Camellia]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withTlsEncryptionProtocols(String string) {
		getTlsEncryptionProtocols().add(string);
		return this;
	}

	/**
	 * Get the {{list}}  Each item is a supported TLS encryption key size.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTlsEncryptionKeySizes() {
		return tlsEncryptionKeySizes;
	}

	/**
	 * Set the {{list}}  Each item is a supported TLS encryption key size.
	 *
	 * @since 2.0
	 * @param tlsEncryptionKeySizes the input value
	 */
	public void  setTlsEncryptionKeySizes(Long tlsEncryptionKeySizes) {
		this.tlsEncryptionKeySizes = tlsEncryptionKeySizes;
	}

	/**
	 * Set the {{list}}  Each item is a supported TLS encryption key size.
	 *
	 * @since 2.0
	 * @param tlsEncryptionKeySizes the input value
	 * @return this instance
	 */
	public Client withTlsEncryptionKeySizes(Long tlsEncryptionKeySizes) {
		this.tlsEncryptionKeySizes = tlsEncryptionKeySizes;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported key exchange protocol for TLS transport.  

Enumerated value must be one of [RSA, DSS, DHE-RSA, DHE-DSS, ECDHE-RSA, ECDHE-ECDSA]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTlsKeyExchangeProtocols() {
		if (this.tlsKeyExchangeProtocols == null){ this.tlsKeyExchangeProtocols=new ArrayList<>();}
		return tlsKeyExchangeProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported key exchange protocol for TLS transport.  

Enumerated value must be one of [RSA, DSS, DHE-RSA, DHE-DSS, ECDHE-RSA, ECDHE-ECDSA]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param tlsKeyExchangeProtocols the input value
	 */
	public void  setTlsKeyExchangeProtocols(Collection<String> tlsKeyExchangeProtocols) {
		this.tlsKeyExchangeProtocols = tlsKeyExchangeProtocols;
	}

	/**
	 * Set the {{list}} Each item is a supported key exchange protocol for TLS transport.  

Enumerated value must be one of [RSA, DSS, DHE-RSA, DHE-DSS, ECDHE-RSA, ECDHE-ECDSA]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Client withTlsKeyExchangeProtocols(String string) {
		getTlsKeyExchangeProtocols().add(string);
		return this;
	}

	//</editor-fold>

}