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
package org.broadbandforum.tr181.device.ipsec.ikev2sa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * Statistics for this IKEv2 Security Association (SA).

        The CPE MUST reset the IKEv2 SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the associated {{param|#.Tunnel}} instance's Stats parameters are reset.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.IKEv2SA.{i}.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "Device.IPsec.IKEv2SA.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of outbound {{units}} from this IKEv2 SA discarded for any reason. This can include {{units}} dropped due to a lack of transmit buffer space.

          Note that this refers to IKE protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of inbound {{units}} to this IKEv2 SA discarded due to decryption errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {units}} carried by other SAs.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DecryptionErrors")
	public StatsCounter32 decryptionErrors;
	/**
	 * The total number of inbound {{units}} to this IKEv2 SA discarded due to integrity errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IntegrityErrors")
	public StatsCounter32 integrityErrors;
	/**
	 * The total number of inbound {{units}} to this IKEv2 SA discarded for reasons other than decryption or integrity errors. This can include {{units}} dropped due to a lack of receive buffer space.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "OtherReceiveErrors")
	public StatsCounter32 otherReceiveErrors;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} handled in the outbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} handled in the inbound direction by the IKEv2 SA.
	 *
	 * @since 2.5
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound {{units}} from this IKEv2 SA discarded for any reason. This can include {{units}} dropped due to a lack of transmit buffer space.

          Note that this refers to IKE protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound {{units}} from this IKEv2 SA discarded for any reason. This can include {{units}} dropped due to a lack of transmit buffer space.

          Note that this refers to IKE protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound {{units}} from this IKEv2 SA discarded for any reason. This can include {{units}} dropped due to a lack of transmit buffer space.

          Note that this refers to IKE protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of inbound {{units}} to this IKEv2 SA discarded due to decryption errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getDecryptionErrors() {
		return decryptionErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded due to decryption errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param decryptionErrors the input value
	 */
	public void  setDecryptionErrors(StatsCounter32 decryptionErrors) {
		this.decryptionErrors = decryptionErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded due to decryption errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param decryptionErrors the input value
	 * @return this instance
	 */
	public Stats withDecryptionErrors(StatsCounter32 decryptionErrors) {
		this.decryptionErrors = decryptionErrors;
		return this;
	}

	/**
	 * Get the total number of inbound {{units}} to this IKEv2 SA discarded due to integrity errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getIntegrityErrors() {
		return integrityErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded due to integrity errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param integrityErrors the input value
	 */
	public void  setIntegrityErrors(StatsCounter32 integrityErrors) {
		this.integrityErrors = integrityErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded due to integrity errors.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param integrityErrors the input value
	 * @return this instance
	 */
	public Stats withIntegrityErrors(StatsCounter32 integrityErrors) {
		this.integrityErrors = integrityErrors;
		return this;
	}

	/**
	 * Get the total number of inbound {{units}} to this IKEv2 SA discarded for reasons other than decryption or integrity errors. This can include {{units}} dropped due to a lack of receive buffer space.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getOtherReceiveErrors() {
		return otherReceiveErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded for reasons other than decryption or integrity errors. This can include {{units}} dropped due to a lack of receive buffer space.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param otherReceiveErrors the input value
	 */
	public void  setOtherReceiveErrors(StatsCounter32 otherReceiveErrors) {
		this.otherReceiveErrors = otherReceiveErrors;
	}

	/**
	 * Set the total number of inbound {{units}} to this IKEv2 SA discarded for reasons other than decryption or integrity errors. This can include {{units}} dropped due to a lack of receive buffer space.

          Note that this refers to IKEv2 protocol {{units}}, and not to {{units}} carried by other SAs.
	 *
	 * @since 2.5
	 * @param otherReceiveErrors the input value
	 * @return this instance
	 */
	public Stats withOtherReceiveErrors(StatsCounter32 otherReceiveErrors) {
		this.otherReceiveErrors = otherReceiveErrors;
		return this;
	}

	//</editor-fold>

}