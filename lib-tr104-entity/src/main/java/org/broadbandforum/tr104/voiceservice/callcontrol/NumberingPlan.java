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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.callcontrol.numberingplan.PrefixInfo;

	/**
	 * Information related the numbering plan.

{{object}} is applicable only if the device supports a dialing mechanism for which a number plan is needed (for example, some devices with an explicit Dial button do not need to be aware of the dialing plan) and if the device does not already support a numbering plan mechanism for this call control (e.g., in-band via MGCP).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.NumberingPlan.{i}.")
public class NumberingPlan {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This is the minimum number of digits to be collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

If ''End of Dialing'' (as defined in {{param|InterDigitTimerStd}}) occurs before the minimum number of digits has been reached then the number will be considered incomplete and no request will be initiated.

In practice, searching {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} commences only once {{param}} digits has been received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinimumNumberOfDigits")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 32)
	public Long minimumNumberOfDigits = 1L;
	/**
	 * When this number of digits has been collected, an outgoing request (e.g., a SIP INVITE) MUST be initiated. Any additional dialed digits will be ignored. This parameter is only used in the case that no match in {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} has been found.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaximumNumberOfDigits")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 32)
	public Long maximumNumberOfDigits = 15L;
	/**
	 * This timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits. This timer is restarted every time a digit is dialed. Expiration of this timer indicates ''End of Dialing''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterDigitTimerStd")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1, max = 50000)
	public Long interDigitTimerStd = 15000L;
	/**
	 * This timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits once the minimum number of digits defined on a prefix based has been reached.

This timer is only applicable to "open numbering", where the exact number of digits for a prefix is not known.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterDigitTimerOpen")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1, max = 50000)
	public Long interDigitTimerOpen = 3000L;
	/**
	 * Digit that can be used by the subscriber to indicate that dialing has completed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TerminationDigit")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1)
	public String terminationDigit = "#";
	/**
	 * The tone that tells the user when the number dialed is determined to be invalid.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InvalidNumberTone")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String invalidNumberTone;
	/**
	 * This is the maximum number of instances of {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} that can be supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrefixInfoMaxEntries")
	public Long prefixInfoMaxEntries;
	/**
	 * Each entry in this table contains information related to an individual prefix in the NumberingPlan.

It is anticipated that once the minimum number of digits has been received, the VoIP device will search this prefix list every time a new digit is received. If no new entry is found, then the object that was previously found will be used instead.

If supported, {{param|.CallControl.NumberingPlan.{i}.PrefixInfoMaxEntries}} and {{param|.CallControl.NumberingPlan.{i}.PrefixInfoNumberOfEntries}} MUST be present.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 */
	@XmlElementWrapper(name = "PrefixInfos")
	@XmlElement(name = "PrefixInfo")
	@CWMPParameter(access = "readWrite")
	public Collection<PrefixInfo> prefixInfos;

	public NumberingPlan() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public NumberingPlan withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this is the minimum number of digits to be collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

If ''End of Dialing'' (as defined in {{param|InterDigitTimerStd}}) occurs before the minimum number of digits has been reached then the number will be considered incomplete and no request will be initiated.

In practice, searching {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} commences only once {{param}} digits has been received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMinimumNumberOfDigits() {
		return minimumNumberOfDigits;
	}

	/**
	 * Set the this is the minimum number of digits to be collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

If ''End of Dialing'' (as defined in {{param|InterDigitTimerStd}}) occurs before the minimum number of digits has been reached then the number will be considered incomplete and no request will be initiated.

In practice, searching {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} commences only once {{param}} digits has been received.
	 *
	 * @since 2.0
	 * @param minimumNumberOfDigits the input value
	 */
	public void  setMinimumNumberOfDigits(Long minimumNumberOfDigits) {
		this.minimumNumberOfDigits = minimumNumberOfDigits;
	}

	/**
	 * Set the this is the minimum number of digits to be collected before an outgoing request (e.g., a SIP INVITE) can be initiated.

If ''End of Dialing'' (as defined in {{param|InterDigitTimerStd}}) occurs before the minimum number of digits has been reached then the number will be considered incomplete and no request will be initiated.

In practice, searching {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} commences only once {{param}} digits has been received.
	 *
	 * @since 2.0
	 * @param minimumNumberOfDigits the input value
	 * @return this instance
	 */
	public NumberingPlan withMinimumNumberOfDigits(Long minimumNumberOfDigits) {
		this.minimumNumberOfDigits = minimumNumberOfDigits;
		return this;
	}

	/**
	 * Get the when this number of digits has been collected, an outgoing request (e.g., a SIP INVITE) MUST be initiated. Any additional dialed digits will be ignored. This parameter is only used in the case that no match in {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} has been found.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaximumNumberOfDigits() {
		return maximumNumberOfDigits;
	}

	/**
	 * Set the when this number of digits has been collected, an outgoing request (e.g., a SIP INVITE) MUST be initiated. Any additional dialed digits will be ignored. This parameter is only used in the case that no match in {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} has been found.
	 *
	 * @since 2.0
	 * @param maximumNumberOfDigits the input value
	 */
	public void  setMaximumNumberOfDigits(Long maximumNumberOfDigits) {
		this.maximumNumberOfDigits = maximumNumberOfDigits;
	}

	/**
	 * Set the when this number of digits has been collected, an outgoing request (e.g., a SIP INVITE) MUST be initiated. Any additional dialed digits will be ignored. This parameter is only used in the case that no match in {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} has been found.
	 *
	 * @since 2.0
	 * @param maximumNumberOfDigits the input value
	 * @return this instance
	 */
	public NumberingPlan withMaximumNumberOfDigits(Long maximumNumberOfDigits) {
		this.maximumNumberOfDigits = maximumNumberOfDigits;
		return this;
	}

	/**
	 * Get the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits. This timer is restarted every time a digit is dialed. Expiration of this timer indicates ''End of Dialing''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInterDigitTimerStd() {
		return interDigitTimerStd;
	}

	/**
	 * Set the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits. This timer is restarted every time a digit is dialed. Expiration of this timer indicates ''End of Dialing''.
	 *
	 * @since 2.0
	 * @param interDigitTimerStd the input value
	 */
	public void  setInterDigitTimerStd(Long interDigitTimerStd) {
		this.interDigitTimerStd = interDigitTimerStd;
	}

	/**
	 * Set the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits. This timer is restarted every time a digit is dialed. Expiration of this timer indicates ''End of Dialing''.
	 *
	 * @since 2.0
	 * @param interDigitTimerStd the input value
	 * @return this instance
	 */
	public NumberingPlan withInterDigitTimerStd(Long interDigitTimerStd) {
		this.interDigitTimerStd = interDigitTimerStd;
		return this;
	}

	/**
	 * Get the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits once the minimum number of digits defined on a prefix based has been reached.

This timer is only applicable to "open numbering", where the exact number of digits for a prefix is not known.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInterDigitTimerOpen() {
		return interDigitTimerOpen;
	}

	/**
	 * Set the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits once the minimum number of digits defined on a prefix based has been reached.

This timer is only applicable to "open numbering", where the exact number of digits for a prefix is not known.
	 *
	 * @since 2.0
	 * @param interDigitTimerOpen the input value
	 */
	public void  setInterDigitTimerOpen(Long interDigitTimerOpen) {
		this.interDigitTimerOpen = interDigitTimerOpen;
	}

	/**
	 * Set the this timer is the maximum allowable time (expressed in milliseconds) between the dialing of digits once the minimum number of digits defined on a prefix based has been reached.

This timer is only applicable to "open numbering", where the exact number of digits for a prefix is not known.
	 *
	 * @since 2.0
	 * @param interDigitTimerOpen the input value
	 * @return this instance
	 */
	public NumberingPlan withInterDigitTimerOpen(Long interDigitTimerOpen) {
		this.interDigitTimerOpen = interDigitTimerOpen;
		return this;
	}

	/**
	 * Get the digit that can be used by the subscriber to indicate that dialing has completed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTerminationDigit() {
		return terminationDigit;
	}

	/**
	 * Set the digit that can be used by the subscriber to indicate that dialing has completed.
	 *
	 * @since 2.0
	 * @param terminationDigit the input value
	 */
	public void  setTerminationDigit(String terminationDigit) {
		this.terminationDigit = terminationDigit;
	}

	/**
	 * Set the digit that can be used by the subscriber to indicate that dialing has completed.
	 *
	 * @since 2.0
	 * @param terminationDigit the input value
	 * @return this instance
	 */
	public NumberingPlan withTerminationDigit(String terminationDigit) {
		this.terminationDigit = terminationDigit;
		return this;
	}

	/**
	 * Get the tone that tells the user when the number dialed is determined to be invalid.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInvalidNumberTone() {
		return invalidNumberTone;
	}

	/**
	 * Set the tone that tells the user when the number dialed is determined to be invalid.

{{reference}}
	 *
	 * @since 2.0
	 * @param invalidNumberTone the input value
	 */
	public void  setInvalidNumberTone(String invalidNumberTone) {
		this.invalidNumberTone = invalidNumberTone;
	}

	/**
	 * Set the tone that tells the user when the number dialed is determined to be invalid.

{{reference}}
	 *
	 * @since 2.0
	 * @param invalidNumberTone the input value
	 * @return this instance
	 */
	public NumberingPlan withInvalidNumberTone(String invalidNumberTone) {
		this.invalidNumberTone = invalidNumberTone;
		return this;
	}

	/**
	 * Get the this is the maximum number of instances of {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} that can be supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrefixInfoMaxEntries() {
		return prefixInfoMaxEntries;
	}

	/**
	 * Set the this is the maximum number of instances of {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} that can be supported.
	 *
	 * @since 2.0
	 * @param prefixInfoMaxEntries the input value
	 */
	public void  setPrefixInfoMaxEntries(Long prefixInfoMaxEntries) {
		this.prefixInfoMaxEntries = prefixInfoMaxEntries;
	}

	/**
	 * Set the this is the maximum number of instances of {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} that can be supported.
	 *
	 * @since 2.0
	 * @param prefixInfoMaxEntries the input value
	 * @return this instance
	 */
	public NumberingPlan withPrefixInfoMaxEntries(Long prefixInfoMaxEntries) {
		this.prefixInfoMaxEntries = prefixInfoMaxEntries;
		return this;
	}

	/**
	 * Get the each entry in this table contains information related to an individual prefix in the NumberingPlan.

It is anticipated that once the minimum number of digits has been received, the VoIP device will search this prefix list every time a new digit is received. If no new entry is found, then the object that was previously found will be used instead.

If supported, {{param|.CallControl.NumberingPlan.{i}.PrefixInfoMaxEntries}} and {{param|.CallControl.NumberingPlan.{i}.PrefixInfoNumberOfEntries}} MUST be present.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @return the value
	 */
	public Collection<PrefixInfo> getPrefixInfos() {
		if (this.prefixInfos == null){ this.prefixInfos=new ArrayList<>();}
		return prefixInfos;
	}

	/**
	 * Set the each entry in this table contains information related to an individual prefix in the NumberingPlan.

It is anticipated that once the minimum number of digits has been received, the VoIP device will search this prefix list every time a new digit is received. If no new entry is found, then the object that was previously found will be used instead.

If supported, {{param|.CallControl.NumberingPlan.{i}.PrefixInfoMaxEntries}} and {{param|.CallControl.NumberingPlan.{i}.PrefixInfoNumberOfEntries}} MUST be present.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param prefixInfos the input value
	 */
	public void  setPrefixInfos(Collection<PrefixInfo> prefixInfos) {
		this.prefixInfos = prefixInfos;
	}

	/**
	 * Set the each entry in this table contains information related to an individual prefix in the NumberingPlan.

It is anticipated that once the minimum number of digits has been received, the VoIP device will search this prefix list every time a new digit is received. If no new entry is found, then the object that was previously found will be used instead.

If supported, {{param|.CallControl.NumberingPlan.{i}.PrefixInfoMaxEntries}} and {{param|.CallControl.NumberingPlan.{i}.PrefixInfoNumberOfEntries}} MUST be present.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param prefixInfo the input value
	 * @return this instance
	 */
	public NumberingPlan withPrefixInfo(PrefixInfo prefixInfo) {
		getPrefixInfos().add(prefixInfo);
		return this;
	}

	//</editor-fold>

}