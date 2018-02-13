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
package org.broadbandforum.tr181.device.smartcardreaders;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.smartcardreaders.smartcardreader.SmartCard;

	/**
	 * This object describes the characteristics of the smart card reader.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.SmartCardReaders.SmartCardReader.{i}.")
@XmlRootElement(name = "SmartCardReader")
@XmlType(name = "Device.SmartCardReaders.SmartCardReader")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartCardReader {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables this smart card reader.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this smart card reader.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Human-readable name associated with this smart card reader.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * When set to {{true}}, resets the SmartCard Reader and the associated SmartCard.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * The time at which this SmartCard Reader was reset.

          Reset can be caused by:

          * {{param|Status}} transition from Disabled to Enabled

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the SmartCard Reader (including a reboot of the device).

          Unknown Time value indicates that this SmartCard Reader has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResetTime")
	public LocalDateTime resetTime;
	/**
	 * Counter incremented once each time decryption cannot be carried out.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DecryptionFailedCounter")
	@CWMPParameter(activeNotify = "canDeny")
	public Long decryptionFailedCounter;
	/**
	 * Counter incremented once each time the key is not available to decrypt it.  This is a subset of the more general {{param|DecryptionFailedCounter}} within the same object and thus will always be less than that parameter.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DecryptionFailedNoKeyCounter")
	@CWMPParameter(activeNotify = "canDeny")
	public Long decryptionFailedNoKeyCounter;
	/**
	 * Status of currently associated smart card.
	 */
	@XmlElement(name = "SmartCard")
	public SmartCard smartCard;

	public SmartCardReader() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public SmartCardReader withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables this smart card reader.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this smart card reader.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this smart card reader.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SmartCardReader withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this smart card reader.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this smart card reader.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this smart card reader.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public SmartCardReader withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the human-readable name associated with this smart card reader.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this smart card reader.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this smart card reader.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public SmartCardReader withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the when set to {{true}}, resets the SmartCard Reader and the associated SmartCard.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, resets the SmartCard Reader and the associated SmartCard.
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, resets the SmartCard Reader and the associated SmartCard.
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public SmartCardReader withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the time at which this SmartCard Reader was reset.

          Reset can be caused by:

          * {{param|Status}} transition from Disabled to Enabled

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the SmartCard Reader (including a reboot of the device).

          Unknown Time value indicates that this SmartCard Reader has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getResetTime() {
		return resetTime;
	}

	/**
	 * Set the time at which this SmartCard Reader was reset.

          Reset can be caused by:

          * {{param|Status}} transition from Disabled to Enabled

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the SmartCard Reader (including a reboot of the device).

          Unknown Time value indicates that this SmartCard Reader has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @param resetTime the input value
	 */
	public void  setResetTime(LocalDateTime resetTime) {
		this.resetTime = resetTime;
	}

	/**
	 * Set the time at which this SmartCard Reader was reset.

          Reset can be caused by:

          * {{param|Status}} transition from Disabled to Enabled

          * {{param|Reset}} set to {{true}}.

          * An internal reset of the SmartCard Reader (including a reboot of the device).

          Unknown Time value indicates that this SmartCard Reader has never been reset, which can only happen if it has never been enabled.
	 *
	 * @since 2.0
	 * @param resetTime the input value
	 * @return this instance
	 */
	public SmartCardReader withResetTime(LocalDateTime resetTime) {
		this.resetTime = resetTime;
		return this;
	}

	/**
	 * Get the counter incremented once each time decryption cannot be carried out.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDecryptionFailedCounter() {
		return decryptionFailedCounter;
	}

	/**
	 * Set the counter incremented once each time decryption cannot be carried out.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @param decryptionFailedCounter the input value
	 */
	public void  setDecryptionFailedCounter(Long decryptionFailedCounter) {
		this.decryptionFailedCounter = decryptionFailedCounter;
	}

	/**
	 * Set the counter incremented once each time decryption cannot be carried out.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @param decryptionFailedCounter the input value
	 * @return this instance
	 */
	public SmartCardReader withDecryptionFailedCounter(Long decryptionFailedCounter) {
		this.decryptionFailedCounter = decryptionFailedCounter;
		return this;
	}

	/**
	 * Get the counter incremented once each time the key is not available to decrypt it.  This is a subset of the more general {{param|DecryptionFailedCounter}} within the same object and thus will always be less than that parameter.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDecryptionFailedNoKeyCounter() {
		return decryptionFailedNoKeyCounter;
	}

	/**
	 * Set the counter incremented once each time the key is not available to decrypt it.  This is a subset of the more general {{param|DecryptionFailedCounter}} within the same object and thus will always be less than that parameter.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @param decryptionFailedNoKeyCounter the input value
	 */
	public void  setDecryptionFailedNoKeyCounter(Long decryptionFailedNoKeyCounter) {
		this.decryptionFailedNoKeyCounter = decryptionFailedNoKeyCounter;
	}

	/**
	 * Set the counter incremented once each time the key is not available to decrypt it.  This is a subset of the more general {{param|DecryptionFailedCounter}} within the same object and thus will always be less than that parameter.

          This counter relates to the smart card reader, not to the smart card itself, i.e. it is reset when the {{param|Reset}} parameter is used and not when a Smart Card is inserted or removed.
	 *
	 * @since 2.0
	 * @param decryptionFailedNoKeyCounter the input value
	 * @return this instance
	 */
	public SmartCardReader withDecryptionFailedNoKeyCounter(Long decryptionFailedNoKeyCounter) {
		this.decryptionFailedNoKeyCounter = decryptionFailedNoKeyCounter;
		return this;
	}

	/**
	 * Get the status of currently associated smart card.
	 *
	 * @return the value
	 */
	public SmartCard getSmartCard() {
		return smartCard;
	}

	/**
	 * Set the status of currently associated smart card.
	 *
	 * @param smartCard the input value
	 */
	public void  setSmartCard(SmartCard smartCard) {
		this.smartCard = smartCard;
	}

	/**
	 * Set the status of currently associated smart card.
	 *
	 * @param smartCard the input value
	 * @return this instance
	 */
	public SmartCardReader withSmartCard(SmartCard smartCard) {
		this.smartCard = smartCard;
		return this;
	}

	//</editor-fold>

}