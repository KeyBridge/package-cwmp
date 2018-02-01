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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ipsec.Filter;
import org.broadbandforum.tr181.device.ipsec.IKEv2SA;
import org.broadbandforum.tr181.device.ipsec.Profile;
import org.broadbandforum.tr181.device.ipsec.Stats;
import org.broadbandforum.tr181.device.ipsec.Tunnel;

	/**
	 * IPsec {{bibref|RFC4301}} object that supports the configuration of Encapsulating Security Payload (ESP) {{bibref|RFC4303}} and Authentication Header (AH) {{bibref|RFC4302}} in tunnel mode {{bibref|RFC4301|Section 3.2}}.

        Use of IKEv2 {{bibref|RFC5996}} is assumed.  The IPsec object does not currently support static configuration of tunnels and child Security Associations (SAs).

        See the IPsec Theory of Operation {{bibref|TR-181i2a5|Appendix IX}} for a description of the working of this IPsec data model.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.")
public class IPsec {

	/**
	 * Enables or disables IPsec.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * IPsec status.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Indicates whether or not Authentication Header (AH) {{bibref|RFC4302}} is supported.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "AHSupported")
	public Boolean ahsupported;
	/**
	 * Supported IKEv2 encryption algorithms {{bibref|IKEv2-params|Transform Type 1}}.  

Enumerated value must be one of [DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, CAMELLIA-CBC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2SupportedEncryptionAlgorithms")
	@XmlList
	public Collection<String> ikev2SupportedEncryptionAlgorithms;
	/**
	 * Supported ESP encryption algorithms {{bibref|IKEv2-params|Transform Type 1}} {{bibref|RFC4835|Section 3.1.1}}.  

Enumerated value must be one of [NULL, DES-IV64, DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, DES-IV32, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, NULL-AUTH-AES-GMAC, CAMELLIA-CBC, CAMELLIA-CTR, CAMELLIA-CCM-8, CAMELLIA-CCM-12, CAMELLIA-CCM-16]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          * Some algorithms with apparently rather specialised application are omitted, e.g. ''ENCR_NULL_AUTH_AES_GMAC''.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ESPSupportedEncryptionAlgorithms")
	@XmlList
	public Collection<String> espSupportedEncryptionAlgorithms;
	/**
	 * Supported IKEv2 pseudo-random functions {{bibref|IKEv2-params|Transform Type 2}}.  

Enumerated value must be one of [HMAC-MD5, HMAC-SHA1, HMAC-TIGER, AES-128-XCBC, HMAC-SHA2-256, HMAC-SHA2-384, HMAC-SHA2-512, AES-128-CMAC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''PRF_'' (when present) discarded because they all pseudo-random functions so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          * Hyphen inserted after ''AES'' (or other acronym) when immediately followed by a key length.

          As additional functions are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2SupportedPseudoRandomFunctions")
	@XmlList
	public Collection<String> ikev2SupportedPseudoRandomFunctions;
	/**
	 * Supported integrity algorithms {{bibref|IKEv2-params|Transform Type 3}}.  

Enumerated value must be one of [NONE, HMAC-MD5-96, HMAC-SHA1-96, DES-MAC, KPDK-MD5, AES-XCBC-96, HMAC-MD5-128, HMAC-SHA1-160, AES-CMAC-96, AES-128-GMAC, AES-192-GMAC, AES-256-GMAC, HMAC-SHA2-256-128, HMAC-SHA2-256-192, HMAC-SHA2-256-256]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''AUTH_'' (when present) discarded because they all authentication (integrity) algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SupportedIntegrityAlgorithms")
	@XmlList
	public Collection<String> supportedIntegrityAlgorithms;
	/**
	 * Supported Diffie-Hellman group transforms {{bibref|IKEv2-params|Transform Type 4}}.  

Enumerated value must be one of [NONE, MODP-768, MODP-1024, MODP-1536, MODP-2048, MODP-3072, MODP-4096, MODP-6144, MODP-8192, ECP-256, ECP-384, ECP-521, MODP-1024-PRIME-160, MODP-2048-PRIME-224, MODP-2048-PRIME-256, ECP-192, ECP-224]

          Note that these are the names from the above reference, transformed as follows:

          * Name (other than ''NONE'') always starts with the type of group, currently ''MODP'' or ''ECP'' (implies ECP random).

          * This is followed by ''-NN'', where ''NN'' is the group length in bits.

          * this is followed by ''-PRIME-NN'' for groups with prime order subgroups, where ''NN'' is the subgroup length in bits.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SupportedDiffieHellmanGroupTransforms")
	@XmlList
	public Collection<String> supportedDiffieHellmanGroupTransforms;
	/**
	 * The maximum number of entries in the {{object|Filter}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "MaxFilterEntries")
	public Long maxFilterEntries;
	/**
	 * The maximum number of entries in the {{object|Profile}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "MaxProfileEntries")
	public Long maxProfileEntries;
	/**
	 * Global IPsec statistics.  These statistics include all IPsec traffic, i.e. all IKEv2 negotiation, IKEv2 SAs and child SAs.

        The CPE MUST reset global IPsec Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when IPsec is disabled ({{param|.IPsec.Enable}} is set to {{false}}) or when IPsec is enabled ({{param|.IPsec.Enable}} is set to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * Filter table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} selection criteria.  Each (ordered) entry defines a set of selection criteria and references a {{object|#.Profile}} table entry that specifies how matching packets will be processed.

        SPD filtering is performed for all packets that might need to cross the IPsec boundary {{bibref|RFC4301|Section 3.1}}.  Given that IPsec operates at the IP level, this means that SPD filtering conceptually occurs after bridging and before routing.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;
	/**
	 * Profile table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} processing info.  Each entry defines the IPsec treatment for packets that match the {{object|#.Filter}} entries that reference the entry.
	 */
	@XmlElementWrapper(name = "profiles")
	@XmlElement(name = "Profile")
	@CWMPParameter(access = "readWrite")
	public Collection<Profile> profiles;
	/**
	 * Represents an IPsec tunnel, i.e. a virtual IP interface that models an IPsec tunnel entry point and exit point.  A {{object}} instance always references (and has the same lifetime as) a ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair.  The {{object}} instance models the IPsec-specific concepts, the {{enum|Tunnel|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance models the generic concepts, and the {{enum|Tunneled|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance exists only so it can be referenced by forwarding or filter rules.

        {{object}} instances are automatically created (as needed) when {{object|#.Filter}} instances are enabled and disabled.

        Each instance's {{param|Filters}} parameter references the {{object|#.Filter}} instances that require the {{object}} instance to exist.  If this list ever becomes {{empty}}, e.g. because all the referenced {{object|#.Filter}} instances have been disabled or deleted, the CPE MAY choose not to delete the {{object}} instance (and its associated ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair).  This can be desirable, because {{object|.QoS.Classification}}, {{object|.Routing.Router.{i}.IPv4Forwarding}}, {{object|.Routing.Router.{i}.IPv6Forwarding}} etc instances might be referencing the {{object|.IP.Interface}} instances.
	 */
	@XmlElementWrapper(name = "tunnels")
	@XmlElement(name = "Tunnel")
	public Collection<Tunnel> tunnels;
	/**
	 * Represents an IKEv2 Security Association (SA), corresponding to an IKEv2 session.  Instances are automatically created and deleted as IKEv2 SAs are created and deleted.
	 */
	@XmlElementWrapper(name = "ikev2SAs")
	@XmlElement(name = "IKEv2SA")
	public Collection<IKEv2SA> ikev2SAs;

	public IPsec() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables IPsec.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables IPsec.
	 *
	 * @since 2.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables IPsec.
	 *
	 * @since 2.5
	 * @param enable the input value
	 * @return this instance
	 */
	public IPsec withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the ipsec status.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the ipsec status.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the ipsec status.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @param status the input value
	 * @return this instance
	 */
	public IPsec withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates whether or not Authentication Header (AH) {{bibref|RFC4302}} is supported.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isAhsupported() {
		return ahsupported;
	}

	/**
	 * Set the indicates whether or not Authentication Header (AH) {{bibref|RFC4302}} is supported.
	 *
	 * @since 2.5
	 * @param ahsupported the input value
	 */
	public void  setAhsupported(Boolean ahsupported) {
		this.ahsupported = ahsupported;
	}

	/**
	 * Set the indicates whether or not Authentication Header (AH) {{bibref|RFC4302}} is supported.
	 *
	 * @since 2.5
	 * @param ahsupported the input value
	 * @return this instance
	 */
	public IPsec withAhsupported(Boolean ahsupported) {
		this.ahsupported = ahsupported;
		return this;
	}

	/**
	 * Get the supported IKEv2 encryption algorithms {{bibref|IKEv2-params|Transform Type 1}}.  

Enumerated value must be one of [DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, CAMELLIA-CBC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2SupportedEncryptionAlgorithms() {
		if (this.ikev2SupportedEncryptionAlgorithms == null){ this.ikev2SupportedEncryptionAlgorithms=new ArrayList<>();}
		return ikev2SupportedEncryptionAlgorithms;
	}

	/**
	 * Set the supported IKEv2 encryption algorithms {{bibref|IKEv2-params|Transform Type 1}}.  

Enumerated value must be one of [DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, CAMELLIA-CBC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param ikev2SupportedEncryptionAlgorithms the input value
	 */
	public void  setIkev2SupportedEncryptionAlgorithms(Collection<String> ikev2SupportedEncryptionAlgorithms) {
		this.ikev2SupportedEncryptionAlgorithms = ikev2SupportedEncryptionAlgorithms;
	}

	/**
	 * Set the supported IKEv2 encryption algorithms {{bibref|IKEv2-params|Transform Type 1}}.  

Enumerated value must be one of [DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, CAMELLIA-CBC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public IPsec withIkev2SupportedEncryptionAlgorithms(String string) {
		getIkev2SupportedEncryptionAlgorithms().add(string);
		return this;
	}

	/**
	 * Get the supported ESP encryption algorithms {{bibref|IKEv2-params|Transform Type 1}} {{bibref|RFC4835|Section 3.1.1}}.  

Enumerated value must be one of [NULL, DES-IV64, DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, DES-IV32, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, NULL-AUTH-AES-GMAC, CAMELLIA-CBC, CAMELLIA-CTR, CAMELLIA-CCM-8, CAMELLIA-CCM-12, CAMELLIA-CCM-16]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          * Some algorithms with apparently rather specialised application are omitted, e.g. ''ENCR_NULL_AUTH_AES_GMAC''.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getEspSupportedEncryptionAlgorithms() {
		if (this.espSupportedEncryptionAlgorithms == null){ this.espSupportedEncryptionAlgorithms=new ArrayList<>();}
		return espSupportedEncryptionAlgorithms;
	}

	/**
	 * Set the supported ESP encryption algorithms {{bibref|IKEv2-params|Transform Type 1}} {{bibref|RFC4835|Section 3.1.1}}.  

Enumerated value must be one of [NULL, DES-IV64, DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, DES-IV32, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, NULL-AUTH-AES-GMAC, CAMELLIA-CBC, CAMELLIA-CTR, CAMELLIA-CCM-8, CAMELLIA-CCM-12, CAMELLIA-CCM-16]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          * Some algorithms with apparently rather specialised application are omitted, e.g. ''ENCR_NULL_AUTH_AES_GMAC''.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param espSupportedEncryptionAlgorithms the input value
	 */
	public void  setEspSupportedEncryptionAlgorithms(Collection<String> espSupportedEncryptionAlgorithms) {
		this.espSupportedEncryptionAlgorithms = espSupportedEncryptionAlgorithms;
	}

	/**
	 * Set the supported ESP encryption algorithms {{bibref|IKEv2-params|Transform Type 1}} {{bibref|RFC4835|Section 3.1.1}}.  

Enumerated value must be one of [NULL, DES-IV64, DES, 3DES, RC5, IDEA, CAST, BLOWFISH, 3IDEA, DES-IV32, AES-CBC, AES-CTR, AES-CCM-8, AES-CCM-12, AES-CCM-16, AES-GCM-8, AES-GCM-12, AES-GCM-16, NULL-AUTH-AES-GMAC, CAMELLIA-CBC, CAMELLIA-CTR, CAMELLIA-CCM-8, CAMELLIA-CCM-12, CAMELLIA-CCM-16]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''ENCR_'' (when present) discarded because they are all encryption algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models (and because of inconsistent conventions).

          * Phrases collapsed where unambiguous, e.g. "with a(n) NN octet ICV" -> "-NN".

          * Some algorithms with apparently rather specialised application are omitted, e.g. ''ENCR_NULL_AUTH_AES_GMAC''.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public IPsec withEspSupportedEncryptionAlgorithms(String string) {
		getEspSupportedEncryptionAlgorithms().add(string);
		return this;
	}

	/**
	 * Get the supported IKEv2 pseudo-random functions {{bibref|IKEv2-params|Transform Type 2}}.  

Enumerated value must be one of [HMAC-MD5, HMAC-SHA1, HMAC-TIGER, AES-128-XCBC, HMAC-SHA2-256, HMAC-SHA2-384, HMAC-SHA2-512, AES-128-CMAC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''PRF_'' (when present) discarded because they all pseudo-random functions so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          * Hyphen inserted after ''AES'' (or other acronym) when immediately followed by a key length.

          As additional functions are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2SupportedPseudoRandomFunctions() {
		if (this.ikev2SupportedPseudoRandomFunctions == null){ this.ikev2SupportedPseudoRandomFunctions=new ArrayList<>();}
		return ikev2SupportedPseudoRandomFunctions;
	}

	/**
	 * Set the supported IKEv2 pseudo-random functions {{bibref|IKEv2-params|Transform Type 2}}.  

Enumerated value must be one of [HMAC-MD5, HMAC-SHA1, HMAC-TIGER, AES-128-XCBC, HMAC-SHA2-256, HMAC-SHA2-384, HMAC-SHA2-512, AES-128-CMAC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''PRF_'' (when present) discarded because they all pseudo-random functions so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          * Hyphen inserted after ''AES'' (or other acronym) when immediately followed by a key length.

          As additional functions are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param ikev2SupportedPseudoRandomFunctions the input value
	 */
	public void  setIkev2SupportedPseudoRandomFunctions(Collection<String> ikev2SupportedPseudoRandomFunctions) {
		this.ikev2SupportedPseudoRandomFunctions = ikev2SupportedPseudoRandomFunctions;
	}

	/**
	 * Set the supported IKEv2 pseudo-random functions {{bibref|IKEv2-params|Transform Type 2}}.  

Enumerated value must be one of [HMAC-MD5, HMAC-SHA1, HMAC-TIGER, AES-128-XCBC, HMAC-SHA2-256, HMAC-SHA2-384, HMAC-SHA2-512, AES-128-CMAC]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''PRF_'' (when present) discarded because they all pseudo-random functions so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          * Hyphen inserted after ''AES'' (or other acronym) when immediately followed by a key length.

          As additional functions are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public IPsec withIkev2SupportedPseudoRandomFunctions(String string) {
		getIkev2SupportedPseudoRandomFunctions().add(string);
		return this;
	}

	/**
	 * Get the supported integrity algorithms {{bibref|IKEv2-params|Transform Type 3}}.  

Enumerated value must be one of [NONE, HMAC-MD5-96, HMAC-SHA1-96, DES-MAC, KPDK-MD5, AES-XCBC-96, HMAC-MD5-128, HMAC-SHA1-160, AES-CMAC-96, AES-128-GMAC, AES-192-GMAC, AES-256-GMAC, HMAC-SHA2-256-128, HMAC-SHA2-256-192, HMAC-SHA2-256-256]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''AUTH_'' (when present) discarded because they all authentication (integrity) algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getSupportedIntegrityAlgorithms() {
		if (this.supportedIntegrityAlgorithms == null){ this.supportedIntegrityAlgorithms=new ArrayList<>();}
		return supportedIntegrityAlgorithms;
	}

	/**
	 * Set the supported integrity algorithms {{bibref|IKEv2-params|Transform Type 3}}.  

Enumerated value must be one of [NONE, HMAC-MD5-96, HMAC-SHA1-96, DES-MAC, KPDK-MD5, AES-XCBC-96, HMAC-MD5-128, HMAC-SHA1-160, AES-CMAC-96, AES-128-GMAC, AES-192-GMAC, AES-256-GMAC, HMAC-SHA2-256-128, HMAC-SHA2-256-192, HMAC-SHA2-256-256]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''AUTH_'' (when present) discarded because they all authentication (integrity) algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param supportedIntegrityAlgorithms the input value
	 */
	public void  setSupportedIntegrityAlgorithms(Collection<String> supportedIntegrityAlgorithms) {
		this.supportedIntegrityAlgorithms = supportedIntegrityAlgorithms;
	}

	/**
	 * Set the supported integrity algorithms {{bibref|IKEv2-params|Transform Type 3}}.  

Enumerated value must be one of [NONE, HMAC-MD5-96, HMAC-SHA1-96, DES-MAC, KPDK-MD5, AES-XCBC-96, HMAC-MD5-128, HMAC-SHA1-160, AES-CMAC-96, AES-128-GMAC, AES-192-GMAC, AES-256-GMAC, HMAC-SHA2-256-128, HMAC-SHA2-256-192, HMAC-SHA2-256-256]

          Note that these are the names from the above reference, transformed as follows:

          * Leading ''AUTH_'' (when present) discarded because they all authentication (integrity) algorithms so it's not needed.

          * Underscores changed to hyphens to preserve names used in existing data models.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public IPsec withSupportedIntegrityAlgorithms(String string) {
		getSupportedIntegrityAlgorithms().add(string);
		return this;
	}

	/**
	 * Get the supported Diffie-Hellman group transforms {{bibref|IKEv2-params|Transform Type 4}}.  

Enumerated value must be one of [NONE, MODP-768, MODP-1024, MODP-1536, MODP-2048, MODP-3072, MODP-4096, MODP-6144, MODP-8192, ECP-256, ECP-384, ECP-521, MODP-1024-PRIME-160, MODP-2048-PRIME-224, MODP-2048-PRIME-256, ECP-192, ECP-224]

          Note that these are the names from the above reference, transformed as follows:

          * Name (other than ''NONE'') always starts with the type of group, currently ''MODP'' or ''ECP'' (implies ECP random).

          * This is followed by ''-NN'', where ''NN'' is the group length in bits.

          * this is followed by ''-PRIME-NN'' for groups with prime order subgroups, where ''NN'' is the subgroup length in bits.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getSupportedDiffieHellmanGroupTransforms() {
		if (this.supportedDiffieHellmanGroupTransforms == null){ this.supportedDiffieHellmanGroupTransforms=new ArrayList<>();}
		return supportedDiffieHellmanGroupTransforms;
	}

	/**
	 * Set the supported Diffie-Hellman group transforms {{bibref|IKEv2-params|Transform Type 4}}.  

Enumerated value must be one of [NONE, MODP-768, MODP-1024, MODP-1536, MODP-2048, MODP-3072, MODP-4096, MODP-6144, MODP-8192, ECP-256, ECP-384, ECP-521, MODP-1024-PRIME-160, MODP-2048-PRIME-224, MODP-2048-PRIME-256, ECP-192, ECP-224]

          Note that these are the names from the above reference, transformed as follows:

          * Name (other than ''NONE'') always starts with the type of group, currently ''MODP'' or ''ECP'' (implies ECP random).

          * This is followed by ''-NN'', where ''NN'' is the group length in bits.

          * this is followed by ''-PRIME-NN'' for groups with prime order subgroups, where ''NN'' is the subgroup length in bits.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param supportedDiffieHellmanGroupTransforms the input value
	 */
	public void  setSupportedDiffieHellmanGroupTransforms(Collection<String> supportedDiffieHellmanGroupTransforms) {
		this.supportedDiffieHellmanGroupTransforms = supportedDiffieHellmanGroupTransforms;
	}

	/**
	 * Set the supported Diffie-Hellman group transforms {{bibref|IKEv2-params|Transform Type 4}}.  

Enumerated value must be one of [NONE, MODP-768, MODP-1024, MODP-1536, MODP-2048, MODP-3072, MODP-4096, MODP-6144, MODP-8192, ECP-256, ECP-384, ECP-521, MODP-1024-PRIME-160, MODP-2048-PRIME-224, MODP-2048-PRIME-256, ECP-192, ECP-224]

          Note that these are the names from the above reference, transformed as follows:

          * Name (other than ''NONE'') always starts with the type of group, currently ''MODP'' or ''ECP'' (implies ECP random).

          * This is followed by ''-NN'', where ''NN'' is the group length in bits.

          * this is followed by ''-PRIME-NN'' for groups with prime order subgroups, where ''NN'' is the subgroup length in bits.

          As additional algorithms are added to the above reference, this data model will be extended according to the above conventions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public IPsec withSupportedDiffieHellmanGroupTransforms(String string) {
		getSupportedDiffieHellmanGroupTransforms().add(string);
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|Filter}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getMaxFilterEntries() {
		return maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|Filter}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @param maxFilterEntries the input value
	 */
	public void  setMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|Filter}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @param maxFilterEntries the input value
	 * @return this instance
	 */
	public IPsec withMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|Profile}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getMaxProfileEntries() {
		return maxProfileEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|Profile}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @param maxProfileEntries the input value
	 */
	public void  setMaxProfileEntries(Long maxProfileEntries) {
		this.maxProfileEntries = maxProfileEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|Profile}} table.

          A value of 0 means no specific limit.
	 *
	 * @since 2.5
	 * @param maxProfileEntries the input value
	 * @return this instance
	 */
	public IPsec withMaxProfileEntries(Long maxProfileEntries) {
		this.maxProfileEntries = maxProfileEntries;
		return this;
	}

	/**
	 * Get the global IPsec statistics.  These statistics include all IPsec traffic, i.e. all IKEv2 negotiation, IKEv2 SAs and child SAs.

        The CPE MUST reset global IPsec Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when IPsec is disabled ({{param|.IPsec.Enable}} is set to {{false}}) or when IPsec is enabled ({{param|.IPsec.Enable}} is set to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the global IPsec statistics.  These statistics include all IPsec traffic, i.e. all IKEv2 negotiation, IKEv2 SAs and child SAs.

        The CPE MUST reset global IPsec Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when IPsec is disabled ({{param|.IPsec.Enable}} is set to {{false}}) or when IPsec is enabled ({{param|.IPsec.Enable}} is set to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the global IPsec statistics.  These statistics include all IPsec traffic, i.e. all IKEv2 negotiation, IKEv2 SAs and child SAs.

        The CPE MUST reset global IPsec Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when IPsec is disabled ({{param|.IPsec.Enable}} is set to {{false}}) or when IPsec is enabled ({{param|.IPsec.Enable}} is set to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public IPsec withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the filter table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} selection criteria.  Each (ordered) entry defines a set of selection criteria and references a {{object|#.Profile}} table entry that specifies how matching packets will be processed.

        SPD filtering is performed for all packets that might need to cross the IPsec boundary {{bibref|RFC4301|Section 3.1}}.  Given that IPsec operates at the IP level, this means that SPD filtering conceptually occurs after bridging and before routing.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the filter table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} selection criteria.  Each (ordered) entry defines a set of selection criteria and references a {{object|#.Profile}} table entry that specifies how matching packets will be processed.

        SPD filtering is performed for all packets that might need to cross the IPsec boundary {{bibref|RFC4301|Section 3.1}}.  Given that IPsec operates at the IP level, this means that SPD filtering conceptually occurs after bridging and before routing.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the filter table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} selection criteria.  Each (ordered) entry defines a set of selection criteria and references a {{object|#.Profile}} table entry that specifies how matching packets will be processed.

        SPD filtering is performed for all packets that might need to cross the IPsec boundary {{bibref|RFC4301|Section 3.1}}.  Given that IPsec operates at the IP level, this means that SPD filtering conceptually occurs after bridging and before routing.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public IPsec withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	/**
	 * Get the profile table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} processing info.  Each entry defines the IPsec treatment for packets that match the {{object|#.Filter}} entries that reference the entry.
	 *
	 * @return the value
	 */
	public Collection<Profile> getProfiles() {
		if (this.profiles == null){ this.profiles=new ArrayList<>();}
		return profiles;
	}

	/**
	 * Set the profile table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} processing info.  Each entry defines the IPsec treatment for packets that match the {{object|#.Filter}} entries that reference the entry.
	 *
	 * @param profiles the input value
	 */
	public void  setProfiles(Collection<Profile> profiles) {
		this.profiles = profiles;
	}

	/**
	 * Set the profile table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} processing info.  Each entry defines the IPsec treatment for packets that match the {{object|#.Filter}} entries that reference the entry.
	 *
	 * @param profile the input value
	 * @return this instance
	 */
	public IPsec withProfile(Profile profile) {
		getProfiles().add(profile);
		return this;
	}

	/**
	 * Get the represents an IPsec tunnel, i.e. a virtual IP interface that models an IPsec tunnel entry point and exit point.  A {{object}} instance always references (and has the same lifetime as) a ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair.  The {{object}} instance models the IPsec-specific concepts, the {{enum|Tunnel|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance models the generic concepts, and the {{enum|Tunneled|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance exists only so it can be referenced by forwarding or filter rules.

        {{object}} instances are automatically created (as needed) when {{object|#.Filter}} instances are enabled and disabled.

        Each instance's {{param|Filters}} parameter references the {{object|#.Filter}} instances that require the {{object}} instance to exist.  If this list ever becomes {{empty}}, e.g. because all the referenced {{object|#.Filter}} instances have been disabled or deleted, the CPE MAY choose not to delete the {{object}} instance (and its associated ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair).  This can be desirable, because {{object|.QoS.Classification}}, {{object|.Routing.Router.{i}.IPv4Forwarding}}, {{object|.Routing.Router.{i}.IPv6Forwarding}} etc instances might be referencing the {{object|.IP.Interface}} instances.
	 *
	 * @return the value
	 */
	public Collection<Tunnel> getTunnels() {
		if (this.tunnels == null){ this.tunnels=new ArrayList<>();}
		return tunnels;
	}

	/**
	 * Set the represents an IPsec tunnel, i.e. a virtual IP interface that models an IPsec tunnel entry point and exit point.  A {{object}} instance always references (and has the same lifetime as) a ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair.  The {{object}} instance models the IPsec-specific concepts, the {{enum|Tunnel|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance models the generic concepts, and the {{enum|Tunneled|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance exists only so it can be referenced by forwarding or filter rules.

        {{object}} instances are automatically created (as needed) when {{object|#.Filter}} instances are enabled and disabled.

        Each instance's {{param|Filters}} parameter references the {{object|#.Filter}} instances that require the {{object}} instance to exist.  If this list ever becomes {{empty}}, e.g. because all the referenced {{object|#.Filter}} instances have been disabled or deleted, the CPE MAY choose not to delete the {{object}} instance (and its associated ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair).  This can be desirable, because {{object|.QoS.Classification}}, {{object|.Routing.Router.{i}.IPv4Forwarding}}, {{object|.Routing.Router.{i}.IPv6Forwarding}} etc instances might be referencing the {{object|.IP.Interface}} instances.
	 *
	 * @param tunnels the input value
	 */
	public void  setTunnels(Collection<Tunnel> tunnels) {
		this.tunnels = tunnels;
	}

	/**
	 * Set the represents an IPsec tunnel, i.e. a virtual IP interface that models an IPsec tunnel entry point and exit point.  A {{object}} instance always references (and has the same lifetime as) a ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair.  The {{object}} instance models the IPsec-specific concepts, the {{enum|Tunnel|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance models the generic concepts, and the {{enum|Tunneled|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance exists only so it can be referenced by forwarding or filter rules.

        {{object}} instances are automatically created (as needed) when {{object|#.Filter}} instances are enabled and disabled.

        Each instance's {{param|Filters}} parameter references the {{object|#.Filter}} instances that require the {{object}} instance to exist.  If this list ever becomes {{empty}}, e.g. because all the referenced {{object|#.Filter}} instances have been disabled or deleted, the CPE MAY choose not to delete the {{object}} instance (and its associated ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair).  This can be desirable, because {{object|.QoS.Classification}}, {{object|.Routing.Router.{i}.IPv4Forwarding}}, {{object|.Routing.Router.{i}.IPv6Forwarding}} etc instances might be referencing the {{object|.IP.Interface}} instances.
	 *
	 * @param tunnel the input value
	 * @return this instance
	 */
	public IPsec withTunnel(Tunnel tunnel) {
		getTunnels().add(tunnel);
		return this;
	}

	/**
	 * Get the represents an IKEv2 Security Association (SA), corresponding to an IKEv2 session.  Instances are automatically created and deleted as IKEv2 SAs are created and deleted.
	 *
	 * @return the value
	 */
	public Collection<IKEv2SA> getIkev2SAs() {
		if (this.ikev2SAs == null){ this.ikev2SAs=new ArrayList<>();}
		return ikev2SAs;
	}

	/**
	 * Set the represents an IKEv2 Security Association (SA), corresponding to an IKEv2 session.  Instances are automatically created and deleted as IKEv2 SAs are created and deleted.
	 *
	 * @param ikev2SAs the input value
	 */
	public void  setIkev2SAs(Collection<IKEv2SA> ikev2SAs) {
		this.ikev2SAs = ikev2SAs;
	}

	/**
	 * Set the represents an IKEv2 Security Association (SA), corresponding to an IKEv2 session.  Instances are automatically created and deleted as IKEv2 SAs are created and deleted.
	 *
	 * @param ikev2SA the input value
	 * @return this instance
	 */
	public IPsec withIKEv2SA(IKEv2SA ikev2SA) {
		getIkev2SAs().add(ikev2SA);
		return this;
	}

	//</editor-fold>

}