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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * Global IPsec statistics.  These statistics include all IPsec traffic, i.e. all IKEv2 negotiation, IKEv2 SAs and child SAs.

        The CPE MUST reset global IPsec Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when IPsec is disabled ({{param|.IPsec.Enable}} is set to {{false}}) or when IPsec is enabled ({{param|.IPsec.Enable}} is set to {{true}}).
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.Stats.")
@XmlRootElement(name = "Device.IPsec.Stats")
@XmlType(name = "Device.IPsec.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of times an IPsec negotiation failure has occurred.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "NegotiationFailures")
	public StatsCounter32 negotiationFailures;
	/**
	 * The total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of {{units}} discarded by IPsec due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of {{units}} discarded by IPsec due to an unknown SPI (Security Parameter Index).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "UnknownSPIErrors")
	public StatsCounter32 unknownSPIErrors;
	/**
	 * The total number of {{units}} discarded by IPsec due to ESP decryption errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DecryptionErrors")
	public StatsCounter32 decryptionErrors;
	/**
	 * The total number of {{units}} discarded by IPsec due to integrity errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IntegrityErrors")
	public StatsCounter32 integrityErrors;
	/**
	 * The total number of {{units}} discarded by IPsec due to replay errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ReplayErrors")
	public StatsCounter32 replayErrors;
	/**
	 * The total number of {{units}} discarded by IPsec due to policy errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PolicyErrors")
	public StatsCounter32 policyErrors;
	/**
	 * The total number of {{units}} discarded by IPsec due to errors other than unknown SPI, decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "OtherReceiveErrors")
	public StatsCounter32 otherReceiveErrors;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of times an IPsec negotiation failure has occurred.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getNegotiationFailures() {
		return negotiationFailures;
	}

	/**
	 * Set the total number of times an IPsec negotiation failure has occurred.
	 *
	 * @since 2.5
	 * @param negotiationFailures the input value
	 */
	public void  setNegotiationFailures(StatsCounter32 negotiationFailures) {
		this.negotiationFailures = negotiationFailures;
	}

	/**
	 * Set the total number of times an IPsec negotiation failure has occurred.
	 *
	 * @since 2.5
	 * @param negotiationFailures the input value
	 * @return this instance
	 */
	public Stats withNegotiationFailures(StatsCounter32 negotiationFailures) {
		this.negotiationFailures = negotiationFailures;
		return this;
	}

	/**
	 * Get the total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by IPsec.
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
	 * Get the total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by IPsec.
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
	 * Get the total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by IPsec.
	 *
	 * @since 2.5
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by IPsec.
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
	 * Get the total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by IPsec.
	 *
	 * @since 2.5
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by IPsec.
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
	 * Get the total number of {{units}} discarded by IPsec due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.5
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to any error.  This can include packets dropped due to a lack of transmit buffers.
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
	 * Get the total number of {{units}} discarded by IPsec due to an unknown SPI (Security Parameter Index).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getUnknownSPIErrors() {
		return unknownSPIErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to an unknown SPI (Security Parameter Index).
	 *
	 * @since 2.5
	 * @param unknownSPIErrors the input value
	 */
	public void  setUnknownSPIErrors(StatsCounter32 unknownSPIErrors) {
		this.unknownSPIErrors = unknownSPIErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to an unknown SPI (Security Parameter Index).
	 *
	 * @since 2.5
	 * @param unknownSPIErrors the input value
	 * @return this instance
	 */
	public Stats withUnknownSPIErrors(StatsCounter32 unknownSPIErrors) {
		this.unknownSPIErrors = unknownSPIErrors;
		return this;
	}

	/**
	 * Get the total number of {{units}} discarded by IPsec due to ESP decryption errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getDecryptionErrors() {
		return decryptionErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to ESP decryption errors.
	 *
	 * @since 2.5
	 * @param decryptionErrors the input value
	 */
	public void  setDecryptionErrors(StatsCounter32 decryptionErrors) {
		this.decryptionErrors = decryptionErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to ESP decryption errors.
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
	 * Get the total number of {{units}} discarded by IPsec due to integrity errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getIntegrityErrors() {
		return integrityErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to integrity errors.
	 *
	 * @since 2.5
	 * @param integrityErrors the input value
	 */
	public void  setIntegrityErrors(StatsCounter32 integrityErrors) {
		this.integrityErrors = integrityErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to integrity errors.
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
	 * Get the total number of {{units}} discarded by IPsec due to replay errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getReplayErrors() {
		return replayErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to replay errors.
	 *
	 * @since 2.5
	 * @param replayErrors the input value
	 */
	public void  setReplayErrors(StatsCounter32 replayErrors) {
		this.replayErrors = replayErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to replay errors.
	 *
	 * @since 2.5
	 * @param replayErrors the input value
	 * @return this instance
	 */
	public Stats withReplayErrors(StatsCounter32 replayErrors) {
		this.replayErrors = replayErrors;
		return this;
	}

	/**
	 * Get the total number of {{units}} discarded by IPsec due to policy errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getPolicyErrors() {
		return policyErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to policy errors.
	 *
	 * @since 2.5
	 * @param policyErrors the input value
	 */
	public void  setPolicyErrors(StatsCounter32 policyErrors) {
		this.policyErrors = policyErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to policy errors.
	 *
	 * @since 2.5
	 * @param policyErrors the input value
	 * @return this instance
	 */
	public Stats withPolicyErrors(StatsCounter32 policyErrors) {
		this.policyErrors = policyErrors;
		return this;
	}

	/**
	 * Get the total number of {{units}} discarded by IPsec due to errors other than unknown SPI, decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getOtherReceiveErrors() {
		return otherReceiveErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to errors other than unknown SPI, decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 * @param otherReceiveErrors the input value
	 */
	public void  setOtherReceiveErrors(StatsCounter32 otherReceiveErrors) {
		this.otherReceiveErrors = otherReceiveErrors;
	}

	/**
	 * Set the total number of {{units}} discarded by IPsec due to errors other than unknown SPI, decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
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