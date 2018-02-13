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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.device.ipsec.ikev2sa.ChildSA;
import org.broadbandforum.tr181.device.ipsec.ikev2sa.ReceivedCPAttr;
import org.broadbandforum.tr181.device.ipsec.ikev2sa.Stats;

	/**
	 * Represents an IKEv2 Security Association (SA), corresponding to an IKEv2 session.  Instances are automatically created and deleted as IKEv2 SAs are created and deleted.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.IKEv2SA.{i}.")
@XmlRootElement(name = "IKEv2SA")
@XmlType(name = "Device.IPsec.IKEv2SA")
@XmlAccessorType(XmlAccessType.FIELD)
public class IKEv2SA {

	/**
	 * The current operational state of the IKEv2 SA.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The associated {{object|#.Tunnel}} instance.  {{reference}}

          Note that {{param}} is a unique key, i.e only one {{object}} instance is associated with a given {{object|#.Tunnel}} instance.  During rekeying {{bibref|RFC5996|Section 2.8}}, a new IKEv2 SA is created and inherits the existing IKEv2 SA's child SAs, then the old IKEv2 SA is deleted.  From the management point of view the new and old IKEv2 SAs are the same SA and MUST be modeled using the same {{object}} instance.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Tunnel")
	public String tunnel;
	/**
	 * The local IP address that this IKEv2 SA was negotiated with.  This is assigned via IKEv2 and will also be available via the associated {{object|#.Tunnel}}'s {{param|#.Tunnel.{i}.TunnelInterface}} {{object|##.IP.Interface.{i}.IPv4Address}} or {{object|##.IP.Interface.{i}.IPv6Address}} table (as appropriate).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "LocalAddress")
	public IPAddress localAddress;
	/**
	 * The IP address of the peer that this IKEv2 SA was negotiated with.  This will be the IP address of one of the security gateways configured via {{param|#.Profile.{i}.RemoteEndpoints}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "RemoteAddress")
	public IPAddress remoteAddress;
	/**
	 * The encryption algorithm applied to traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedEncryptionAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "EncryptionAlgorithm")
	@Size(max = 64)
	public String encryptionAlgorithm;
	/**
	 * The length of the encryption key in bits used for the algorithm specified in the {{param|EncryptionAlgorithm}} parameter. 

          The value is 0 if the key length is implicit in the specified algorithm or there is no encryption applied.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "EncryptionKeyLength")
	public Long encryptionKeyLength;
	/**
	 * The pseudo-random function used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedPseudoRandomFunctions}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PseudoRandomFunction")
	@Size(max = 64)
	public String pseudoRandomFunction;
	/**
	 * The integrity algorithm applied to the traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedIntegrityAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IntegrityAlgorithm")
	@Size(max = 64)
	public String integrityAlgorithm;
	/**
	 * The Diffie-Hellman Group used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedDiffieHellmanGroupTransforms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DiffieHellmanGroupTransform")
	@Size(max = 64)
	public String diffieHellmanGroupTransform;
	/**
	 * When this IKEv2 SA was set up.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "CreationTime")
	public LocalDateTime creationTime;
	/**
	 * Whether NAT traversal is supported by the device and, if so, whether a NAT was detected.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "NATDetected")
	public String natDetected;
	/**
	 * Statistics for this IKEv2 Security Association (SA).

        The CPE MUST reset the IKEv2 SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the associated {{param|#.Tunnel}} instance's Stats parameters are reset.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This is a transitory table that lists all the IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attributes that have been received via CFG_REPLY messages.  Table entries are automatically created to correspond with received Attributes. However, it is a local matter to the CPE when to delete old table entries.

        If the same Attribute is received multiple times, it is up to the CPE to decide which entries to include (i.e. whether the same Attribute will be present multiple times). In order to allow for the same Attribute to be present multiple times within the table, this table has no unique key defined.
	 */
	@XmlElementWrapper(name = "ReceivedCPAttrs")
	@XmlElement(name = "ReceivedCPAttr")
	@CWMPParameter(access = "readWrite")
	public Collection<ReceivedCPAttr> receivedCPAttrs;
	/**
	 * Represents a child Security Association (SA) pair, i.e. an inbound child SA and an outbound child SA.
	 */
	@XmlElementWrapper(name = "ChildSAs")
	@XmlElement(name = "ChildSA")
	public Collection<ChildSA> childSAs;

	public IKEv2SA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current operational state of the IKEv2 SA.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param status the input value
	 * @return this instance
	 */
	public IKEv2SA withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public IKEv2SA withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the associated {{object|#.Tunnel}} instance.  {{reference}}

          Note that {{param}} is a unique key, i.e only one {{object}} instance is associated with a given {{object|#.Tunnel}} instance.  During rekeying {{bibref|RFC5996|Section 2.8}}, a new IKEv2 SA is created and inherits the existing IKEv2 SA's child SAs, then the old IKEv2 SA is deleted.  From the management point of view the new and old IKEv2 SAs are the same SA and MUST be modeled using the same {{object}} instance.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getTunnel() {
		return tunnel;
	}

	/**
	 * Set the associated {{object|#.Tunnel}} instance.  {{reference}}

          Note that {{param}} is a unique key, i.e only one {{object}} instance is associated with a given {{object|#.Tunnel}} instance.  During rekeying {{bibref|RFC5996|Section 2.8}}, a new IKEv2 SA is created and inherits the existing IKEv2 SA's child SAs, then the old IKEv2 SA is deleted.  From the management point of view the new and old IKEv2 SAs are the same SA and MUST be modeled using the same {{object}} instance.
	 *
	 * @since 2.5
	 * @param tunnel the input value
	 */
	public void  setTunnel(String tunnel) {
		this.tunnel = tunnel;
	}

	/**
	 * Set the associated {{object|#.Tunnel}} instance.  {{reference}}

          Note that {{param}} is a unique key, i.e only one {{object}} instance is associated with a given {{object|#.Tunnel}} instance.  During rekeying {{bibref|RFC5996|Section 2.8}}, a new IKEv2 SA is created and inherits the existing IKEv2 SA's child SAs, then the old IKEv2 SA is deleted.  From the management point of view the new and old IKEv2 SAs are the same SA and MUST be modeled using the same {{object}} instance.
	 *
	 * @since 2.5
	 * @param tunnel the input value
	 * @return this instance
	 */
	public IKEv2SA withTunnel(String tunnel) {
		this.tunnel = tunnel;
		return this;
	}

	/**
	 * Get the local IP address that this IKEv2 SA was negotiated with.  This is assigned via IKEv2 and will also be available via the associated {{object|#.Tunnel}}'s {{param|#.Tunnel.{i}.TunnelInterface}} {{object|##.IP.Interface.{i}.IPv4Address}} or {{object|##.IP.Interface.{i}.IPv6Address}} table (as appropriate).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getLocalAddress() {
		return localAddress;
	}

	/**
	 * Set the local IP address that this IKEv2 SA was negotiated with.  This is assigned via IKEv2 and will also be available via the associated {{object|#.Tunnel}}'s {{param|#.Tunnel.{i}.TunnelInterface}} {{object|##.IP.Interface.{i}.IPv4Address}} or {{object|##.IP.Interface.{i}.IPv6Address}} table (as appropriate).
	 *
	 * @since 2.5
	 * @param localAddress the input value
	 */
	public void  setLocalAddress(IPAddress localAddress) {
		this.localAddress = localAddress;
	}

	/**
	 * Set the local IP address that this IKEv2 SA was negotiated with.  This is assigned via IKEv2 and will also be available via the associated {{object|#.Tunnel}}'s {{param|#.Tunnel.{i}.TunnelInterface}} {{object|##.IP.Interface.{i}.IPv4Address}} or {{object|##.IP.Interface.{i}.IPv6Address}} table (as appropriate).
	 *
	 * @since 2.5
	 * @param localAddress the input value
	 * @return this instance
	 */
	public IKEv2SA withLocalAddress(IPAddress localAddress) {
		this.localAddress = localAddress;
		return this;
	}

	/**
	 * Get the IP address of the peer that this IKEv2 SA was negotiated with.  This will be the IP address of one of the security gateways configured via {{param|#.Profile.{i}.RemoteEndpoints}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getRemoteAddress() {
		return remoteAddress;
	}

	/**
	 * Set the IP address of the peer that this IKEv2 SA was negotiated with.  This will be the IP address of one of the security gateways configured via {{param|#.Profile.{i}.RemoteEndpoints}}.
	 *
	 * @since 2.5
	 * @param remoteAddress the input value
	 */
	public void  setRemoteAddress(IPAddress remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	/**
	 * Set the IP address of the peer that this IKEv2 SA was negotiated with.  This will be the IP address of one of the security gateways configured via {{param|#.Profile.{i}.RemoteEndpoints}}.
	 *
	 * @since 2.5
	 * @param remoteAddress the input value
	 * @return this instance
	 */
	public IKEv2SA withRemoteAddress(IPAddress remoteAddress) {
		this.remoteAddress = remoteAddress;
		return this;
	}

	/**
	 * Get the encryption algorithm applied to traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedEncryptionAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getEncryptionAlgorithm() {
		return encryptionAlgorithm;
	}

	/**
	 * Set the encryption algorithm applied to traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedEncryptionAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param encryptionAlgorithm the input value
	 */
	public void  setEncryptionAlgorithm(String encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
	}

	/**
	 * Set the encryption algorithm applied to traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedEncryptionAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param encryptionAlgorithm the input value
	 * @return this instance
	 */
	public IKEv2SA withEncryptionAlgorithm(String encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
		return this;
	}

	/**
	 * Get the length of the encryption key in bits used for the algorithm specified in the {{param|EncryptionAlgorithm}} parameter. 

          The value is 0 if the key length is implicit in the specified algorithm or there is no encryption applied.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getEncryptionKeyLength() {
		return encryptionKeyLength;
	}

	/**
	 * Set the length of the encryption key in bits used for the algorithm specified in the {{param|EncryptionAlgorithm}} parameter. 

          The value is 0 if the key length is implicit in the specified algorithm or there is no encryption applied.
	 *
	 * @since 2.5
	 * @param encryptionKeyLength the input value
	 */
	public void  setEncryptionKeyLength(Long encryptionKeyLength) {
		this.encryptionKeyLength = encryptionKeyLength;
	}

	/**
	 * Set the length of the encryption key in bits used for the algorithm specified in the {{param|EncryptionAlgorithm}} parameter. 

          The value is 0 if the key length is implicit in the specified algorithm or there is no encryption applied.
	 *
	 * @since 2.5
	 * @param encryptionKeyLength the input value
	 * @return this instance
	 */
	public IKEv2SA withEncryptionKeyLength(Long encryptionKeyLength) {
		this.encryptionKeyLength = encryptionKeyLength;
		return this;
	}

	/**
	 * Get the pseudo-random function used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedPseudoRandomFunctions}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getPseudoRandomFunction() {
		return pseudoRandomFunction;
	}

	/**
	 * Set the pseudo-random function used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedPseudoRandomFunctions}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param pseudoRandomFunction the input value
	 */
	public void  setPseudoRandomFunction(String pseudoRandomFunction) {
		this.pseudoRandomFunction = pseudoRandomFunction;
	}

	/**
	 * Set the pseudo-random function used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedPseudoRandomFunctions}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param pseudoRandomFunction the input value
	 * @return this instance
	 */
	public IKEv2SA withPseudoRandomFunction(String pseudoRandomFunction) {
		this.pseudoRandomFunction = pseudoRandomFunction;
		return this;
	}

	/**
	 * Get the integrity algorithm applied to the traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedIntegrityAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getIntegrityAlgorithm() {
		return integrityAlgorithm;
	}

	/**
	 * Set the integrity algorithm applied to the traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedIntegrityAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param integrityAlgorithm the input value
	 */
	public void  setIntegrityAlgorithm(String integrityAlgorithm) {
		this.integrityAlgorithm = integrityAlgorithm;
	}

	/**
	 * Set the integrity algorithm applied to the traffic carried by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedIntegrityAlgorithms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param integrityAlgorithm the input value
	 * @return this instance
	 */
	public IKEv2SA withIntegrityAlgorithm(String integrityAlgorithm) {
		this.integrityAlgorithm = integrityAlgorithm;
		return this;
	}

	/**
	 * Get the Diffie-Hellman Group used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedDiffieHellmanGroupTransforms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getDiffieHellmanGroupTransform() {
		return diffieHellmanGroupTransform;
	}

	/**
	 * Set the Diffie-Hellman Group used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedDiffieHellmanGroupTransforms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param diffieHellmanGroupTransform the input value
	 */
	public void  setDiffieHellmanGroupTransform(String diffieHellmanGroupTransform) {
		this.diffieHellmanGroupTransform = diffieHellmanGroupTransform;
	}

	/**
	 * Set the Diffie-Hellman Group used by this IKEv2 SA.

          This will be one of the {{param|#.Profile.{i}.IKEv2AllowedDiffieHellmanGroupTransforms}} from the {{object|#.Profile}} instance via which this IKEv2 SA was created.
	 *
	 * @since 2.5
	 * @param diffieHellmanGroupTransform the input value
	 * @return this instance
	 */
	public IKEv2SA withDiffieHellmanGroupTransform(String diffieHellmanGroupTransform) {
		this.diffieHellmanGroupTransform = diffieHellmanGroupTransform;
		return this;
	}

	/**
	 * Get the when this IKEv2 SA was set up.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Set the when this IKEv2 SA was set up.
	 *
	 * @since 2.5
	 * @param creationTime the input value
	 */
	public void  setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * Set the when this IKEv2 SA was set up.
	 *
	 * @since 2.5
	 * @param creationTime the input value
	 * @return this instance
	 */
	public IKEv2SA withCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	/**
	 * Get the whether NAT traversal is supported by the device and, if so, whether a NAT was detected.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getNatDetected() {
		return natDetected;
	}

	/**
	 * Set the whether NAT traversal is supported by the device and, if so, whether a NAT was detected.
	 *
	 * @since 2.5
	 * @param natDetected the input value
	 */
	public void  setNatDetected(String natDetected) {
		this.natDetected = natDetected;
	}

	/**
	 * Set the whether NAT traversal is supported by the device and, if so, whether a NAT was detected.
	 *
	 * @since 2.5
	 * @param natDetected the input value
	 * @return this instance
	 */
	public IKEv2SA withNatDetected(String natDetected) {
		this.natDetected = natDetected;
		return this;
	}

	/**
	 * Get the statistics for this IKEv2 Security Association (SA).

        The CPE MUST reset the IKEv2 SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the associated {{param|#.Tunnel}} instance's Stats parameters are reset.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this IKEv2 Security Association (SA).

        The CPE MUST reset the IKEv2 SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the associated {{param|#.Tunnel}} instance's Stats parameters are reset.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this IKEv2 Security Association (SA).

        The CPE MUST reset the IKEv2 SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the associated {{param|#.Tunnel}} instance's Stats parameters are reset.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public IKEv2SA withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this is a transitory table that lists all the IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attributes that have been received via CFG_REPLY messages.  Table entries are automatically created to correspond with received Attributes. However, it is a local matter to the CPE when to delete old table entries.

        If the same Attribute is received multiple times, it is up to the CPE to decide which entries to include (i.e. whether the same Attribute will be present multiple times). In order to allow for the same Attribute to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @return the value
	 */
	public Collection<ReceivedCPAttr> getReceivedCPAttrs() {
		if (this.receivedCPAttrs == null){ this.receivedCPAttrs=new ArrayList<>();}
		return receivedCPAttrs;
	}

	/**
	 * Set the this is a transitory table that lists all the IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attributes that have been received via CFG_REPLY messages.  Table entries are automatically created to correspond with received Attributes. However, it is a local matter to the CPE when to delete old table entries.

        If the same Attribute is received multiple times, it is up to the CPE to decide which entries to include (i.e. whether the same Attribute will be present multiple times). In order to allow for the same Attribute to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @param receivedCPAttrs the input value
	 */
	public void  setReceivedCPAttrs(Collection<ReceivedCPAttr> receivedCPAttrs) {
		this.receivedCPAttrs = receivedCPAttrs;
	}

	/**
	 * Set the this is a transitory table that lists all the IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attributes that have been received via CFG_REPLY messages.  Table entries are automatically created to correspond with received Attributes. However, it is a local matter to the CPE when to delete old table entries.

        If the same Attribute is received multiple times, it is up to the CPE to decide which entries to include (i.e. whether the same Attribute will be present multiple times). In order to allow for the same Attribute to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @param receivedCPAttr the input value
	 * @return this instance
	 */
	public IKEv2SA withReceivedCPAttr(ReceivedCPAttr receivedCPAttr) {
		getReceivedCPAttrs().add(receivedCPAttr);
		return this;
	}

	/**
	 * Get the represents a child Security Association (SA) pair, i.e. an inbound child SA and an outbound child SA.
	 *
	 * @return the value
	 */
	public Collection<ChildSA> getChildSAs() {
		if (this.childSAs == null){ this.childSAs=new ArrayList<>();}
		return childSAs;
	}

	/**
	 * Set the represents a child Security Association (SA) pair, i.e. an inbound child SA and an outbound child SA.
	 *
	 * @param childSAs the input value
	 */
	public void  setChildSAs(Collection<ChildSA> childSAs) {
		this.childSAs = childSAs;
	}

	/**
	 * Set the represents a child Security Association (SA) pair, i.e. an inbound child SA and an outbound child SA.
	 *
	 * @param childSA the input value
	 * @return this instance
	 */
	public IKEv2SA withChildSA(ChildSA childSA) {
		getChildSAs().add(childSA);
		return this;
	}

	//</editor-fold>

}