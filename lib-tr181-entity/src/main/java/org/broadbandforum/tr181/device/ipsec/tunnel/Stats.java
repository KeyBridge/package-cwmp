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
package org.broadbandforum.tr181.device.ipsec.tunnel;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;

	/**
	 * Statistics for this IPsec tunnel, i.e. all traffic that has passed through the tunnel, including IKEv2 negotiation, IKEv2 SA and ChildSA traffic.

        The CPE MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e. its associated {{param|.IP.Interface.{i}.Status}} parameter transitions to a down state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. its associated {{param|.IP.Interface.{i}.Enable}} parameter transition from {{false}} to {{true}}).

        Note that this object does not include generic statistics that are available in the associated {{object|.IP.Interface.{i}.Stats}} object.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.Tunnel.{i}.Stats.")
public class Stats {

	/**
	 * The total number of inbound {{units}} discarded due to ESP decryption errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DecryptionErrors")
	public StatsCounter32 decryptionErrors;
	/**
	 * The total number of inbound {{units}} discarded due to integrity errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "IntegrityErrors")
	public StatsCounter32 integrityErrors;
	/**
	 * The total number of inbound {{units}} discarded due to replay errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ReplayErrors")
	public StatsCounter32 replayErrors;
	/**
	 * The total number of inbound {{units}} discarded due to policy errors.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "PolicyErrors")
	public StatsCounter32 policyErrors;
	/**
	 * The total number of inbound {{units}} discarded due to errors other than decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "OtherReceiveErrors")
	public StatsCounter32 otherReceiveErrors;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of inbound {{units}} discarded due to ESP decryption errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getDecryptionErrors() {
		return decryptionErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to ESP decryption errors.
	 *
	 * @since 2.5
	 * @param decryptionErrors the input value
	 */
	public void  setDecryptionErrors(StatsCounter32 decryptionErrors) {
		this.decryptionErrors = decryptionErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to ESP decryption errors.
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
	 * Get the total number of inbound {{units}} discarded due to integrity errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getIntegrityErrors() {
		return integrityErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to integrity errors.
	 *
	 * @since 2.5
	 * @param integrityErrors the input value
	 */
	public void  setIntegrityErrors(StatsCounter32 integrityErrors) {
		this.integrityErrors = integrityErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to integrity errors.
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
	 * Get the total number of inbound {{units}} discarded due to replay errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getReplayErrors() {
		return replayErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to replay errors.
	 *
	 * @since 2.5
	 * @param replayErrors the input value
	 */
	public void  setReplayErrors(StatsCounter32 replayErrors) {
		this.replayErrors = replayErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to replay errors.
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
	 * Get the total number of inbound {{units}} discarded due to policy errors.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getPolicyErrors() {
		return policyErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to policy errors.
	 *
	 * @since 2.5
	 * @param policyErrors the input value
	 */
	public void  setPolicyErrors(StatsCounter32 policyErrors) {
		this.policyErrors = policyErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to policy errors.
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
	 * Get the total number of inbound {{units}} discarded due to errors other than decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public StatsCounter32 getOtherReceiveErrors() {
		return otherReceiveErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to errors other than decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
	 *
	 * @since 2.5
	 * @param otherReceiveErrors the input value
	 */
	public void  setOtherReceiveErrors(StatsCounter32 otherReceiveErrors) {
		this.otherReceiveErrors = otherReceiveErrors;
	}

	/**
	 * Set the total number of inbound {{units}} discarded due to errors other than decryption, integrity, replay or policy errors. This can include packets dropped due to a lack of receive buffers.
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