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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This table contains a list of block periods for a {{object|##.ANPPolicy}}.

        A block period defines how long the device will wait before re-trying to establish connectivity via the access network after the previous attempt has failed.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.ANPPolicy.{i}.BlockPeriod.{i}.")
public class BlockPeriod {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Number of consecutively failed access attempts for which the {{param|BlockDuration}} will be used to block the next access attempt.

          The SCL will apply the {{object}} entry with the largest number of consecutive failed attempts that is smaller or equal to the actual number of consecutive failed attempts.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "FailedAttempts")
	@CWMPParameter(access = "readWrite")
	public Long failedAttempts = 0L;
	/**
	 * The duration, in seconds, to which to block further access attempts.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "BlockDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Integer blockDuration = 0;

	public BlockPeriod() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public BlockPeriod withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public BlockPeriod withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the number of consecutively failed access attempts for which the {{param|BlockDuration}} will be used to block the next access attempt.

          The SCL will apply the {{object}} entry with the largest number of consecutive failed attempts that is smaller or equal to the actual number of consecutive failed attempts.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getFailedAttempts() {
		return failedAttempts;
	}

	/**
	 * Set the number of consecutively failed access attempts for which the {{param|BlockDuration}} will be used to block the next access attempt.

          The SCL will apply the {{object}} entry with the largest number of consecutive failed attempts that is smaller or equal to the actual number of consecutive failed attempts.
	 *
	 * @since 2.6
	 * @param failedAttempts the input value
	 */
	public void  setFailedAttempts(Long failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	/**
	 * Set the number of consecutively failed access attempts for which the {{param|BlockDuration}} will be used to block the next access attempt.

          The SCL will apply the {{object}} entry with the largest number of consecutive failed attempts that is smaller or equal to the actual number of consecutive failed attempts.
	 *
	 * @since 2.6
	 * @param failedAttempts the input value
	 * @return this instance
	 */
	public BlockPeriod withFailedAttempts(Long failedAttempts) {
		this.failedAttempts = failedAttempts;
		return this;
	}

	/**
	 * Get the duration, in seconds, to which to block further access attempts.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getBlockDuration() {
		return blockDuration;
	}

	/**
	 * Set the duration, in seconds, to which to block further access attempts.
	 *
	 * @since 2.6
	 * @param blockDuration the input value
	 */
	public void  setBlockDuration(Integer blockDuration) {
		this.blockDuration = blockDuration;
	}

	/**
	 * Set the duration, in seconds, to which to block further access attempts.
	 *
	 * @since 2.6
	 * @param blockDuration the input value
	 * @return this instance
	 */
	public BlockPeriod withBlockDuration(Integer blockDuration) {
		this.blockDuration = blockDuration;
		return this;
	}

	//</editor-fold>

}