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
package org.broadbandforum.tr181.device.ipsec;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.ipsec.profile.SentCPAttr;

	/**
	 * Profile table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} processing info.  Each entry defines the IPsec treatment for packets that match the {{object|#.Filter}} entries that reference the entry.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.Profile.{i}.")
public class Profile {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Controls the maximum number of child Security Association (SA) pairs that can be negotiated by a single IKEv2 session.

          If a new child SA pair is needed, but the current IKEv2 session already has {{param}} child SA pairs, an additional IKEv2 session (and therefore an additional IPsec tunnel) will be established.

          A value of 0 means no specific limit.

          Note that support for more than one child SA pair per IKEv2 session is OPTIONAL {{bibref|RFC5996|Section 1.3}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "MaxChildSAs")
	@CWMPParameter(access = "readWrite")
	public Long maxChildSAs;
	/**
	 * The host name or IP address of the remote IPsec tunnel endpoint.  If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "RemoteEndpoints")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> remoteEndpoints;
	/**
	 * Identifier of the forwarding policy associated with traffic that is associated with this profile.

          The forwarding policy can be referenced by entries in the {{object|##.Routing.Router.{i}.IPv4Forwarding}} and {{object|##.Routing.Router.{i}.IPv6Forwarding}} tables, and therefore allows SPD selection criteria to influence the forwarding decision.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long forwardingPolicy = 0L;
	/**
	 * The "child" security protocol.

          This is not to be confused with {{object|#.Filter}}.{{param|#.Filter.{i}.Protocol}}, which is an SPD selector that can select packets that already have AH or ESP headers.  {{object}}.{{param}} selects whether AH or ESP will be used when encapsulating a packet.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol = "ESP";
	/**
	 * IKEv2 CPE authentication method {{bibref|RFC5996|Section 2.15}}. {{reference|an enabled row in the {{object|.Security.Certificate}} table or in another table that contains appropriate CPE credentials}}

          If {{empty}}, or the referenced row is disabled or deleted, the CPE chooses the authentication method based on local policy.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2AuthenticationMethod")
	@CWMPParameter(access = "readWrite")
	public String ikev2AuthenticationMethod;
	/**
	 * Allowed IKEv2 encryption algorithms.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2AllowedEncryptionAlgorithms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikev2AllowedEncryptionAlgorithms;
	/**
	 * Allowed ESP encryption algorithms.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ESPAllowedEncryptionAlgorithms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> espAllowedEncryptionAlgorithms;
	/**
	 * Allowed IKEv2 pseudo-random functions.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2AllowedPseudoRandomFunctions")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikev2AllowedPseudoRandomFunctions;
	/**
	 * Allowed IKEv2 integrity algorithms.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2AllowedIntegrityAlgorithms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikev2AllowedIntegrityAlgorithms;
	/**
	 * Allowed AH integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.2}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "AHAllowedIntegrityAlgorithms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ahallowedIntegrityAlgorithms;
	/**
	 * Allowed ESP integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.1.1}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ESPAllowedIntegrityAlgorithms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> espAllowedIntegrityAlgorithms;
	/**
	 * Allowed IKEv2 Diffie-Hellman group transforms.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2AllowedDiffieHellmanGroupTransforms")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> ikev2AllowedDiffieHellmanGroupTransforms;
	/**
	 * IKEv2 Dead Peer Detection (DPD) timeout in seconds.  {{bibref|RFC5996|section 2.4}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2DeadPeerDetectionTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ikev2DeadPeerDetectionTimeout;
	/**
	 * IKEv2 NAT traversal (NAT-T) keepalive timeout in seconds.  {{bibref|RFC3948|Section 4}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2NATTKeepaliveTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ikev2NATTKeepaliveTimeout;
	/**
	 * The size of the AH or ESP Anti-Replay Window.  {{bibref|RFC4302|Section B.2}} {{bibref|RFC4303|Section A2}}

          A value of 0 means that Sequence Number Verification is disabled.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "AntiReplayWindowSize")
	@CWMPParameter(access = "readWrite")
	public Long antiReplayWindowSize = 0L;
	/**
	 * Controls the value of the ''Do Not Fragment'' (DF) bit.  {{bibref|RFC4301|Section 8.1}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DoNotFragment")
	@CWMPParameter(access = "readWrite")
	public String donotFragment;
	/**
	 * DSCP with which to mark the outer IP header for traffic that is associated with this IPsec channel.

          A value of -1 indicates copy from the incoming packet.

          A value of -2 indicates automatic marking of DSCP.

          De-tunneled packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the CPE, possibly influenced by other Broadband Forum standards that it supports.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DSCPMarkPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2, max = 63)
	public Integer dscPMarkPolicy;
	/**
	 * IKEv2 SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATimeLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2SATrafficLimit")
	@CWMPParameter(access = "readWrite", units = "bytes")
	public Long ikev2SATrafficLimit;
	/**
	 * IKEv2 SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATrafficLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2SATimeLimit")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ikev2SATimeLimit;
	/**
	 * Action to take when an IKEv2 SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IKEv2SAExpiryAction")
	@CWMPParameter(access = "readWrite")
	public String ikev2SAExpiryAction;
	/**
	 * Child SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|ChildSATimeLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ChildSATrafficLimit")
	@CWMPParameter(access = "readWrite", units = "bytes")
	public Long childSATrafficLimit;
	/**
	 * Child SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|ChildSATrafficLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ChildSATimeLimit")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long childSATimeLimit;
	/**
	 * Action to take when a Child SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ChildSAExpiryAction")
	@CWMPParameter(access = "readWrite")
	public String childSAExpiryAction;
	/**
	 * Each instance of this object represents an IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attribute that MUST, if enabled, be sent in IKEv2 CP CFG_REQUEST messages.  All such Attributes MUST be listed.
	 */
	@XmlElementWrapper(name = "SentCPAttrs")
	@XmlElement(name = "SentCPAttr")
	@CWMPParameter(access = "readWrite")
	public Collection<SentCPAttr> sentCPAttrs;

	public Profile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 * @return this instance
	 */
	public Profile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the controls the maximum number of child Security Association (SA) pairs that can be negotiated by a single IKEv2 session.

          If a new child SA pair is needed, but the current IKEv2 session already has {{param}} child SA pairs, an additional IKEv2 session (and therefore an additional IPsec tunnel) will be established.

          A value of 0 means no specific limit.

          Note that support for more than one child SA pair per IKEv2 session is OPTIONAL {{bibref|RFC5996|Section 1.3}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getMaxChildSAs() {
		return maxChildSAs;
	}

	/**
	 * Set the controls the maximum number of child Security Association (SA) pairs that can be negotiated by a single IKEv2 session.

          If a new child SA pair is needed, but the current IKEv2 session already has {{param}} child SA pairs, an additional IKEv2 session (and therefore an additional IPsec tunnel) will be established.

          A value of 0 means no specific limit.

          Note that support for more than one child SA pair per IKEv2 session is OPTIONAL {{bibref|RFC5996|Section 1.3}}.
	 *
	 * @since 2.5
	 * @param maxChildSAs the input value
	 */
	public void  setMaxChildSAs(Long maxChildSAs) {
		this.maxChildSAs = maxChildSAs;
	}

	/**
	 * Set the controls the maximum number of child Security Association (SA) pairs that can be negotiated by a single IKEv2 session.

          If a new child SA pair is needed, but the current IKEv2 session already has {{param}} child SA pairs, an additional IKEv2 session (and therefore an additional IPsec tunnel) will be established.

          A value of 0 means no specific limit.

          Note that support for more than one child SA pair per IKEv2 session is OPTIONAL {{bibref|RFC5996|Section 1.3}}.
	 *
	 * @since 2.5
	 * @param maxChildSAs the input value
	 * @return this instance
	 */
	public Profile withMaxChildSAs(Long maxChildSAs) {
		this.maxChildSAs = maxChildSAs;
		return this;
	}

	/**
	 * Get the host name or IP address of the remote IPsec tunnel endpoint.  If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getRemoteEndpoints() {
		if (this.remoteEndpoints == null){ this.remoteEndpoints=new ArrayList<>();}
		return remoteEndpoints;
	}

	/**
	 * Set the host name or IP address of the remote IPsec tunnel endpoint.  If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.5
	 * @param remoteEndpoints the input value
	 */
	public void  setRemoteEndpoints(Collection<String> remoteEndpoints) {
		this.remoteEndpoints = remoteEndpoints;
	}

	/**
	 * Set the host name or IP address of the remote IPsec tunnel endpoint.  If more than one name/address is supplied, they will be tried in turn, i.e. they are in decreasing order of precedence.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withRemoteEndpoints(String string) {
		getRemoteEndpoints().add(string);
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with traffic that is associated with this profile.

          The forwarding policy can be referenced by entries in the {{object|##.Routing.Router.{i}.IPv4Forwarding}} and {{object|##.Routing.Router.{i}.IPv6Forwarding}} tables, and therefore allows SPD selection criteria to influence the forwarding decision.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic that is associated with this profile.

          The forwarding policy can be referenced by entries in the {{object|##.Routing.Router.{i}.IPv4Forwarding}} and {{object|##.Routing.Router.{i}.IPv6Forwarding}} tables, and therefore allows SPD selection criteria to influence the forwarding decision.
	 *
	 * @since 2.5
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic that is associated with this profile.

          The forwarding policy can be referenced by entries in the {{object|##.Routing.Router.{i}.IPv4Forwarding}} and {{object|##.Routing.Router.{i}.IPv6Forwarding}} tables, and therefore allows SPD selection criteria to influence the forwarding decision.
	 *
	 * @since 2.5
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public Profile withForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the "child" security protocol.

          This is not to be confused with {{object|#.Filter}}.{{param|#.Filter.{i}.Protocol}}, which is an SPD selector that can select packets that already have AH or ESP headers.  {{object}}.{{param}} selects whether AH or ESP will be used when encapsulating a packet.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the "child" security protocol.

          This is not to be confused with {{object|#.Filter}}.{{param|#.Filter.{i}.Protocol}}, which is an SPD selector that can select packets that already have AH or ESP headers.  {{object}}.{{param}} selects whether AH or ESP will be used when encapsulating a packet.
	 *
	 * @since 2.5
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the "child" security protocol.

          This is not to be confused with {{object|#.Filter}}.{{param|#.Filter.{i}.Protocol}}, which is an SPD selector that can select packets that already have AH or ESP headers.  {{object}}.{{param}} selects whether AH or ESP will be used when encapsulating a packet.
	 *
	 * @since 2.5
	 * @param protocol the input value
	 * @return this instance
	 */
	public Profile withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the ikev2 CPE authentication method {{bibref|RFC5996|Section 2.15}}. {{reference|an enabled row in the {{object|.Security.Certificate}} table or in another table that contains appropriate CPE credentials}}

          If {{empty}}, or the referenced row is disabled or deleted, the CPE chooses the authentication method based on local policy.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getIkev2AuthenticationMethod() {
		return ikev2AuthenticationMethod;
	}

	/**
	 * Set the ikev2 CPE authentication method {{bibref|RFC5996|Section 2.15}}. {{reference|an enabled row in the {{object|.Security.Certificate}} table or in another table that contains appropriate CPE credentials}}

          If {{empty}}, or the referenced row is disabled or deleted, the CPE chooses the authentication method based on local policy.
	 *
	 * @since 2.5
	 * @param ikev2AuthenticationMethod the input value
	 */
	public void  setIkev2AuthenticationMethod(String ikev2AuthenticationMethod) {
		this.ikev2AuthenticationMethod = ikev2AuthenticationMethod;
	}

	/**
	 * Set the ikev2 CPE authentication method {{bibref|RFC5996|Section 2.15}}. {{reference|an enabled row in the {{object|.Security.Certificate}} table or in another table that contains appropriate CPE credentials}}

          If {{empty}}, or the referenced row is disabled or deleted, the CPE chooses the authentication method based on local policy.
	 *
	 * @since 2.5
	 * @param ikev2AuthenticationMethod the input value
	 * @return this instance
	 */
	public Profile withIkev2AuthenticationMethod(String ikev2AuthenticationMethod) {
		this.ikev2AuthenticationMethod = ikev2AuthenticationMethod;
		return this;
	}

	/**
	 * Get allowed IKEv2 encryption algorithms.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2AllowedEncryptionAlgorithms() {
		if (this.ikev2AllowedEncryptionAlgorithms == null){ this.ikev2AllowedEncryptionAlgorithms=new ArrayList<>();}
		return ikev2AllowedEncryptionAlgorithms;
	}

	/**
	 * Set allowed IKEv2 encryption algorithms.
	 *
	 * @since 2.5
	 * @param ikev2AllowedEncryptionAlgorithms the input value
	 */
	public void  setIkev2AllowedEncryptionAlgorithms(Collection<String> ikev2AllowedEncryptionAlgorithms) {
		this.ikev2AllowedEncryptionAlgorithms = ikev2AllowedEncryptionAlgorithms;
	}

	/**
	 * Set allowed IKEv2 encryption algorithms.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withIkev2AllowedEncryptionAlgorithms(String string) {
		getIkev2AllowedEncryptionAlgorithms().add(string);
		return this;
	}

	/**
	 * Get allowed ESP encryption algorithms.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getEspAllowedEncryptionAlgorithms() {
		if (this.espAllowedEncryptionAlgorithms == null){ this.espAllowedEncryptionAlgorithms=new ArrayList<>();}
		return espAllowedEncryptionAlgorithms;
	}

	/**
	 * Set allowed ESP encryption algorithms.
	 *
	 * @since 2.5
	 * @param espAllowedEncryptionAlgorithms the input value
	 */
	public void  setEspAllowedEncryptionAlgorithms(Collection<String> espAllowedEncryptionAlgorithms) {
		this.espAllowedEncryptionAlgorithms = espAllowedEncryptionAlgorithms;
	}

	/**
	 * Set allowed ESP encryption algorithms.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withEspAllowedEncryptionAlgorithms(String string) {
		getEspAllowedEncryptionAlgorithms().add(string);
		return this;
	}

	/**
	 * Get allowed IKEv2 pseudo-random functions.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2AllowedPseudoRandomFunctions() {
		if (this.ikev2AllowedPseudoRandomFunctions == null){ this.ikev2AllowedPseudoRandomFunctions=new ArrayList<>();}
		return ikev2AllowedPseudoRandomFunctions;
	}

	/**
	 * Set allowed IKEv2 pseudo-random functions.
	 *
	 * @since 2.5
	 * @param ikev2AllowedPseudoRandomFunctions the input value
	 */
	public void  setIkev2AllowedPseudoRandomFunctions(Collection<String> ikev2AllowedPseudoRandomFunctions) {
		this.ikev2AllowedPseudoRandomFunctions = ikev2AllowedPseudoRandomFunctions;
	}

	/**
	 * Set allowed IKEv2 pseudo-random functions.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withIkev2AllowedPseudoRandomFunctions(String string) {
		getIkev2AllowedPseudoRandomFunctions().add(string);
		return this;
	}

	/**
	 * Get allowed IKEv2 integrity algorithms.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2AllowedIntegrityAlgorithms() {
		if (this.ikev2AllowedIntegrityAlgorithms == null){ this.ikev2AllowedIntegrityAlgorithms=new ArrayList<>();}
		return ikev2AllowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed IKEv2 integrity algorithms.
	 *
	 * @since 2.5
	 * @param ikev2AllowedIntegrityAlgorithms the input value
	 */
	public void  setIkev2AllowedIntegrityAlgorithms(Collection<String> ikev2AllowedIntegrityAlgorithms) {
		this.ikev2AllowedIntegrityAlgorithms = ikev2AllowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed IKEv2 integrity algorithms.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withIkev2AllowedIntegrityAlgorithms(String string) {
		getIkev2AllowedIntegrityAlgorithms().add(string);
		return this;
	}

	/**
	 * Get allowed AH integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.2}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getAhallowedIntegrityAlgorithms() {
		if (this.ahallowedIntegrityAlgorithms == null){ this.ahallowedIntegrityAlgorithms=new ArrayList<>();}
		return ahallowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed AH integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.2}}.
	 *
	 * @since 2.5
	 * @param ahallowedIntegrityAlgorithms the input value
	 */
	public void  setAhallowedIntegrityAlgorithms(Collection<String> ahallowedIntegrityAlgorithms) {
		this.ahallowedIntegrityAlgorithms = ahallowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed AH integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.2}}.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withAhallowedIntegrityAlgorithms(String string) {
		getAhallowedIntegrityAlgorithms().add(string);
		return this;
	}

	/**
	 * Get allowed ESP integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.1.1}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getEspAllowedIntegrityAlgorithms() {
		if (this.espAllowedIntegrityAlgorithms == null){ this.espAllowedIntegrityAlgorithms=new ArrayList<>();}
		return espAllowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed ESP integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.1.1}}.
	 *
	 * @since 2.5
	 * @param espAllowedIntegrityAlgorithms the input value
	 */
	public void  setEspAllowedIntegrityAlgorithms(Collection<String> espAllowedIntegrityAlgorithms) {
		this.espAllowedIntegrityAlgorithms = espAllowedIntegrityAlgorithms;
	}

	/**
	 * Set allowed ESP integrity algorithms {{bibref|IKEv2-params|Transform Type 3}} {{bibref|RFC4835|Section 3.1.1}}.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withEspAllowedIntegrityAlgorithms(String string) {
		getEspAllowedIntegrityAlgorithms().add(string);
		return this;
	}

	/**
	 * Get allowed IKEv2 Diffie-Hellman group transforms.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getIkev2AllowedDiffieHellmanGroupTransforms() {
		if (this.ikev2AllowedDiffieHellmanGroupTransforms == null){ this.ikev2AllowedDiffieHellmanGroupTransforms=new ArrayList<>();}
		return ikev2AllowedDiffieHellmanGroupTransforms;
	}

	/**
	 * Set allowed IKEv2 Diffie-Hellman group transforms.
	 *
	 * @since 2.5
	 * @param ikev2AllowedDiffieHellmanGroupTransforms the input value
	 */
	public void  setIkev2AllowedDiffieHellmanGroupTransforms(Collection<String> ikev2AllowedDiffieHellmanGroupTransforms) {
		this.ikev2AllowedDiffieHellmanGroupTransforms = ikev2AllowedDiffieHellmanGroupTransforms;
	}

	/**
	 * Set allowed IKEv2 Diffie-Hellman group transforms.
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Profile withIkev2AllowedDiffieHellmanGroupTransforms(String string) {
		getIkev2AllowedDiffieHellmanGroupTransforms().add(string);
		return this;
	}

	/**
	 * Get the ikev2 Dead Peer Detection (DPD) timeout in seconds.  {{bibref|RFC5996|section 2.4}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getIkev2DeadPeerDetectionTimeout() {
		return ikev2DeadPeerDetectionTimeout;
	}

	/**
	 * Set the ikev2 Dead Peer Detection (DPD) timeout in seconds.  {{bibref|RFC5996|section 2.4}}
	 *
	 * @since 2.5
	 * @param ikev2DeadPeerDetectionTimeout the input value
	 */
	public void  setIkev2DeadPeerDetectionTimeout(Long ikev2DeadPeerDetectionTimeout) {
		this.ikev2DeadPeerDetectionTimeout = ikev2DeadPeerDetectionTimeout;
	}

	/**
	 * Set the ikev2 Dead Peer Detection (DPD) timeout in seconds.  {{bibref|RFC5996|section 2.4}}
	 *
	 * @since 2.5
	 * @param ikev2DeadPeerDetectionTimeout the input value
	 * @return this instance
	 */
	public Profile withIkev2DeadPeerDetectionTimeout(Long ikev2DeadPeerDetectionTimeout) {
		this.ikev2DeadPeerDetectionTimeout = ikev2DeadPeerDetectionTimeout;
		return this;
	}

	/**
	 * Get the ikev2 NAT traversal (NAT-T) keepalive timeout in seconds.  {{bibref|RFC3948|Section 4}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getIkev2NATTKeepaliveTimeout() {
		return ikev2NATTKeepaliveTimeout;
	}

	/**
	 * Set the ikev2 NAT traversal (NAT-T) keepalive timeout in seconds.  {{bibref|RFC3948|Section 4}}
	 *
	 * @since 2.5
	 * @param ikev2NATTKeepaliveTimeout the input value
	 */
	public void  setIkev2NATTKeepaliveTimeout(Long ikev2NATTKeepaliveTimeout) {
		this.ikev2NATTKeepaliveTimeout = ikev2NATTKeepaliveTimeout;
	}

	/**
	 * Set the ikev2 NAT traversal (NAT-T) keepalive timeout in seconds.  {{bibref|RFC3948|Section 4}}
	 *
	 * @since 2.5
	 * @param ikev2NATTKeepaliveTimeout the input value
	 * @return this instance
	 */
	public Profile withIkev2NATTKeepaliveTimeout(Long ikev2NATTKeepaliveTimeout) {
		this.ikev2NATTKeepaliveTimeout = ikev2NATTKeepaliveTimeout;
		return this;
	}

	/**
	 * Get the size of the AH or ESP Anti-Replay Window.  {{bibref|RFC4302|Section B.2}} {{bibref|RFC4303|Section A2}}

          A value of 0 means that Sequence Number Verification is disabled.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getAntiReplayWindowSize() {
		return antiReplayWindowSize;
	}

	/**
	 * Set the size of the AH or ESP Anti-Replay Window.  {{bibref|RFC4302|Section B.2}} {{bibref|RFC4303|Section A2}}

          A value of 0 means that Sequence Number Verification is disabled.
	 *
	 * @since 2.5
	 * @param antiReplayWindowSize the input value
	 */
	public void  setAntiReplayWindowSize(Long antiReplayWindowSize) {
		this.antiReplayWindowSize = antiReplayWindowSize;
	}

	/**
	 * Set the size of the AH or ESP Anti-Replay Window.  {{bibref|RFC4302|Section B.2}} {{bibref|RFC4303|Section A2}}

          A value of 0 means that Sequence Number Verification is disabled.
	 *
	 * @since 2.5
	 * @param antiReplayWindowSize the input value
	 * @return this instance
	 */
	public Profile withAntiReplayWindowSize(Long antiReplayWindowSize) {
		this.antiReplayWindowSize = antiReplayWindowSize;
		return this;
	}

	/**
	 * Get the controls the value of the ''Do Not Fragment'' (DF) bit.  {{bibref|RFC4301|Section 8.1}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getDonotFragment() {
		return donotFragment;
	}

	/**
	 * Set the controls the value of the ''Do Not Fragment'' (DF) bit.  {{bibref|RFC4301|Section 8.1}}
	 *
	 * @since 2.5
	 * @param donotFragment the input value
	 */
	public void  setDonotFragment(String donotFragment) {
		this.donotFragment = donotFragment;
	}

	/**
	 * Set the controls the value of the ''Do Not Fragment'' (DF) bit.  {{bibref|RFC4301|Section 8.1}}
	 *
	 * @since 2.5
	 * @param donotFragment the input value
	 * @return this instance
	 */
	public Profile withDonotFragment(String donotFragment) {
		this.donotFragment = donotFragment;
		return this;
	}

	/**
	 * Get the dscP with which to mark the outer IP header for traffic that is associated with this IPsec channel.

          A value of -1 indicates copy from the incoming packet.

          A value of -2 indicates automatic marking of DSCP.

          De-tunneled packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the CPE, possibly influenced by other Broadband Forum standards that it supports.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getDscPMarkPolicy() {
		return dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with this IPsec channel.

          A value of -1 indicates copy from the incoming packet.

          A value of -2 indicates automatic marking of DSCP.

          De-tunneled packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the CPE, possibly influenced by other Broadband Forum standards that it supports.
	 *
	 * @since 2.5
	 * @param dscPMarkPolicy the input value
	 */
	public void  setDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with this IPsec channel.

          A value of -1 indicates copy from the incoming packet.

          A value of -2 indicates automatic marking of DSCP.

          De-tunneled packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the CPE, possibly influenced by other Broadband Forum standards that it supports.
	 *
	 * @since 2.5
	 * @param dscPMarkPolicy the input value
	 * @return this instance
	 */
	public Profile withDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
		return this;
	}

	/**
	 * Get the ikev2 SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATimeLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getIkev2SATrafficLimit() {
		return ikev2SATrafficLimit;
	}

	/**
	 * Set the ikev2 SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATimeLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param ikev2SATrafficLimit the input value
	 */
	public void  setIkev2SATrafficLimit(Long ikev2SATrafficLimit) {
		this.ikev2SATrafficLimit = ikev2SATrafficLimit;
	}

	/**
	 * Set the ikev2 SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATimeLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param ikev2SATrafficLimit the input value
	 * @return this instance
	 */
	public Profile withIkev2SATrafficLimit(Long ikev2SATrafficLimit) {
		this.ikev2SATrafficLimit = ikev2SATrafficLimit;
		return this;
	}

	/**
	 * Get the ikev2 SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATrafficLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getIkev2SATimeLimit() {
		return ikev2SATimeLimit;
	}

	/**
	 * Set the ikev2 SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATrafficLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param ikev2SATimeLimit the input value
	 */
	public void  setIkev2SATimeLimit(Long ikev2SATimeLimit) {
		this.ikev2SATimeLimit = ikev2SATimeLimit;
	}

	/**
	 * Set the ikev2 SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|IKEv2SATrafficLimit}} are non-zero, the IKEv2 SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param ikev2SATimeLimit the input value
	 * @return this instance
	 */
	public Profile withIkev2SATimeLimit(Long ikev2SATimeLimit) {
		this.ikev2SATimeLimit = ikev2SATimeLimit;
		return this;
	}

	/**
	 * Get action to take when an IKEv2 SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getIkev2SAExpiryAction() {
		return ikev2SAExpiryAction;
	}

	/**
	 * Set action to take when an IKEv2 SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @param ikev2SAExpiryAction the input value
	 */
	public void  setIkev2SAExpiryAction(String ikev2SAExpiryAction) {
		this.ikev2SAExpiryAction = ikev2SAExpiryAction;
	}

	/**
	 * Set action to take when an IKEv2 SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @param ikev2SAExpiryAction the input value
	 * @return this instance
	 */
	public Profile withIkev2SAExpiryAction(String ikev2SAExpiryAction) {
		this.ikev2SAExpiryAction = ikev2SAExpiryAction;
		return this;
	}

	/**
	 * Get the child SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|ChildSATimeLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getChildSATrafficLimit() {
		return childSATrafficLimit;
	}

	/**
	 * Set the child SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|ChildSATimeLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param childSATrafficLimit the input value
	 */
	public void  setChildSATrafficLimit(Long childSATrafficLimit) {
		this.childSATrafficLimit = childSATrafficLimit;
	}

	/**
	 * Set the child SA lifetime in bytes, or zero if there is no traffic constraint on its expiration.

          If both {{param}} and {{param|ChildSATimeLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param childSATrafficLimit the input value
	 * @return this instance
	 */
	public Profile withChildSATrafficLimit(Long childSATrafficLimit) {
		this.childSATrafficLimit = childSATrafficLimit;
		return this;
	}

	/**
	 * Get the child SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|ChildSATrafficLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getChildSATimeLimit() {
		return childSATimeLimit;
	}

	/**
	 * Set the child SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|ChildSATrafficLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param childSATimeLimit the input value
	 */
	public void  setChildSATimeLimit(Long childSATimeLimit) {
		this.childSATimeLimit = childSATimeLimit;
	}

	/**
	 * Set the child SA lifetime in seconds, or zero if there is no time constraint on its expiration.

          If both {{param}} and {{param|ChildSATrafficLimit}} are non-zero, the child SA is deleted when the first limit is reached.
	 *
	 * @since 2.5
	 * @param childSATimeLimit the input value
	 * @return this instance
	 */
	public Profile withChildSATimeLimit(Long childSATimeLimit) {
		this.childSATimeLimit = childSATimeLimit;
		return this;
	}

	/**
	 * Get action to take when a Child SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getChildSAExpiryAction() {
		return childSAExpiryAction;
	}

	/**
	 * Set action to take when a Child SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @param childSAExpiryAction the input value
	 */
	public void  setChildSAExpiryAction(String childSAExpiryAction) {
		this.childSAExpiryAction = childSAExpiryAction;
	}

	/**
	 * Set action to take when a Child SA expires, whether as a result of hitting a traffic limit or a time limit.
	 *
	 * @since 2.5
	 * @param childSAExpiryAction the input value
	 * @return this instance
	 */
	public Profile withChildSAExpiryAction(String childSAExpiryAction) {
		this.childSAExpiryAction = childSAExpiryAction;
		return this;
	}

	/**
	 * Get the each instance of this object represents an IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attribute that MUST, if enabled, be sent in IKEv2 CP CFG_REQUEST messages.  All such Attributes MUST be listed.
	 *
	 * @return the value
	 */
	public Collection<SentCPAttr> getSentCPAttrs() {
		if (this.sentCPAttrs == null){ this.sentCPAttrs=new ArrayList<>();}
		return sentCPAttrs;
	}

	/**
	 * Set the each instance of this object represents an IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attribute that MUST, if enabled, be sent in IKEv2 CP CFG_REQUEST messages.  All such Attributes MUST be listed.
	 *
	 * @param sentCPAttrs the input value
	 */
	public void  setSentCPAttrs(Collection<SentCPAttr> sentCPAttrs) {
		this.sentCPAttrs = sentCPAttrs;
	}

	/**
	 * Set the each instance of this object represents an IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attribute that MUST, if enabled, be sent in IKEv2 CP CFG_REQUEST messages.  All such Attributes MUST be listed.
	 *
	 * @param sentCPAttr the input value
	 * @return this instance
	 */
	public Profile withSentCPAttr(SentCPAttr sentCPAttr) {
		getSentCPAttrs().add(sentCPAttr);
		return this;
	}

	//</editor-fold>

}