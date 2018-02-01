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
package org.broadbandforum.tr104.voiceservice.callcontrol.numberingplan;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Each entry in this table contains information related to an individual prefix in the NumberingPlan.

It is anticipated that once the minimum number of digits has been received, the VoIP device will search this prefix list every time a new digit is received. If no new entry is found, then the object that was previously found will be used instead.

If supported, {{param|.CallControl.NumberingPlan.{i}.PrefixInfoMaxEntries}} and {{param|.CallControl.NumberingPlan.{i}.PrefixInfoNumberOfEntries}} MUST be present.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.")
public class PrefixInfo {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * This is a string representation of a range of prefixes. Each prefix consists of a ''From'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''To'' part consisting of exactly one digit prefixed by a "-" symbol.

All characters in the "From" and "To" parts of the prefix range MUST be "0-9", "*" or "#".

A further constraint is that the "To" digit MUST always be numerically greater than the last digit of the "From" part.

Examples:

: 02

: 031-5

: 032

: 0325

: *#34

: #22
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrefixRange")
	@CWMPParameter(access = "readWrite")
	@Size(max = 42)
	public String prefixRange;
	/**
	 * This is the minimum number of allowable digits for the prefix range. Once the minimum number of digits has been reached, {{param|#.InterDigitTimerOpen}} will be used instead of {{param|#.InterDigitTimerStd}}.

If the minimum number of digits has been reached and the inter-digit timer expires, an outgoing request is initiated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrefixMinNumberOfDigits")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 40)
	public Long prefixMinNumberOfDigits = 1L;
	/**
	 * This is the maximum number of allowable digits for the prefix range. Once the number of digits received reaches this value an outgoing request is initiated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrefixMaxNumberOfDigits")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 40)
	public Long prefixMaxNumberOfDigits = 1L;
	/**
	 * If this parameter has a non-zero value, the specified number of digits will be removed from the internal digit buffer (which contains the dialed digits) from the position specified by {{param|PosOfDigitsToRemove}}.

Subsequently a search of {{object}} for a matching prefix using the modified number is performed. Note that this parameter does not have any impact on the number sent in the outgoing request: it is used only for searching within the Numbering Plan.

This parameter has no effect if it is set to 0.

This parameter is provided to handle Carrier override and other codes used as prefix to standard numbers and to ensure that the correct ''End of Dialing'' can be specified without significant data duplication.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfDigitsToRemove")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 40)
	public Long numberOfDigitsToRemove = 0L;
	/**
	 * This parameter is used in conjunction with {{param|NumberOfDigitsToRemove}}. It specifies the position within the internal digit buffer from which the digits are to be removed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PosOfDigitsToRemove")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 40)
	public Long posOfDigitsToRemove = 0L;
	/**
	 * The tone to be played by the VoIP device when the user has dialed exactly the same digits as defined in the prefix.  The VoIP device will cease playing the tone once an additional digit has been dialed.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DialTone")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String dialTone;
	/**
	 * This is a string representing a Facility Action implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

When {{empty}} or the value is an unrecognized string (i.e. a Facility Action not supported by the CPE) normal outgoing requests are made.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FacilityAction")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String facilityAction;
	/**
	 * Optional argument associated with {{param|FacilityAction}}.  The interpretation of the argument is dependent on a specific value of {{param|FacilityAction}}. {{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FacilityActionArgument")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String facilityActionArgument;

	public PrefixInfo() {
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
	public PrefixInfo withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public PrefixInfo withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the this is a string representation of a range of prefixes. Each prefix consists of a ''From'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''To'' part consisting of exactly one digit prefixed by a "-" symbol.

All characters in the "From" and "To" parts of the prefix range MUST be "0-9", "*" or "#".

A further constraint is that the "To" digit MUST always be numerically greater than the last digit of the "From" part.

Examples:

: 02

: 031-5

: 032

: 0325

: *#34

: #22
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPrefixRange() {
		return prefixRange;
	}

	/**
	 * Set the this is a string representation of a range of prefixes. Each prefix consists of a ''From'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''To'' part consisting of exactly one digit prefixed by a "-" symbol.

All characters in the "From" and "To" parts of the prefix range MUST be "0-9", "*" or "#".

A further constraint is that the "To" digit MUST always be numerically greater than the last digit of the "From" part.

Examples:

: 02

: 031-5

: 032

: 0325

: *#34

: #22
	 *
	 * @since 2.0
	 * @param prefixRange the input value
	 */
	public void  setPrefixRange(String prefixRange) {
		this.prefixRange = prefixRange;
	}

	/**
	 * Set the this is a string representation of a range of prefixes. Each prefix consists of a ''From'' part consisting of 1 to n digits (string representation) followed by an OPTIONAL ''To'' part consisting of exactly one digit prefixed by a "-" symbol.

All characters in the "From" and "To" parts of the prefix range MUST be "0-9", "*" or "#".

A further constraint is that the "To" digit MUST always be numerically greater than the last digit of the "From" part.

Examples:

: 02

: 031-5

: 032

: 0325

: *#34

: #22
	 *
	 * @since 2.0
	 * @param prefixRange the input value
	 * @return this instance
	 */
	public PrefixInfo withPrefixRange(String prefixRange) {
		this.prefixRange = prefixRange;
		return this;
	}

	/**
	 * Get the this is the minimum number of allowable digits for the prefix range. Once the minimum number of digits has been reached, {{param|#.InterDigitTimerOpen}} will be used instead of {{param|#.InterDigitTimerStd}}.

If the minimum number of digits has been reached and the inter-digit timer expires, an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrefixMinNumberOfDigits() {
		return prefixMinNumberOfDigits;
	}

	/**
	 * Set the this is the minimum number of allowable digits for the prefix range. Once the minimum number of digits has been reached, {{param|#.InterDigitTimerOpen}} will be used instead of {{param|#.InterDigitTimerStd}}.

If the minimum number of digits has been reached and the inter-digit timer expires, an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @param prefixMinNumberOfDigits the input value
	 */
	public void  setPrefixMinNumberOfDigits(Long prefixMinNumberOfDigits) {
		this.prefixMinNumberOfDigits = prefixMinNumberOfDigits;
	}

	/**
	 * Set the this is the minimum number of allowable digits for the prefix range. Once the minimum number of digits has been reached, {{param|#.InterDigitTimerOpen}} will be used instead of {{param|#.InterDigitTimerStd}}.

If the minimum number of digits has been reached and the inter-digit timer expires, an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @param prefixMinNumberOfDigits the input value
	 * @return this instance
	 */
	public PrefixInfo withPrefixMinNumberOfDigits(Long prefixMinNumberOfDigits) {
		this.prefixMinNumberOfDigits = prefixMinNumberOfDigits;
		return this;
	}

	/**
	 * Get the this is the maximum number of allowable digits for the prefix range. Once the number of digits received reaches this value an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrefixMaxNumberOfDigits() {
		return prefixMaxNumberOfDigits;
	}

	/**
	 * Set the this is the maximum number of allowable digits for the prefix range. Once the number of digits received reaches this value an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @param prefixMaxNumberOfDigits the input value
	 */
	public void  setPrefixMaxNumberOfDigits(Long prefixMaxNumberOfDigits) {
		this.prefixMaxNumberOfDigits = prefixMaxNumberOfDigits;
	}

	/**
	 * Set the this is the maximum number of allowable digits for the prefix range. Once the number of digits received reaches this value an outgoing request is initiated.
	 *
	 * @since 2.0
	 * @param prefixMaxNumberOfDigits the input value
	 * @return this instance
	 */
	public PrefixInfo withPrefixMaxNumberOfDigits(Long prefixMaxNumberOfDigits) {
		this.prefixMaxNumberOfDigits = prefixMaxNumberOfDigits;
		return this;
	}

	/**
	 * Get the if this parameter has a non-zero value, the specified number of digits will be removed from the internal digit buffer (which contains the dialed digits) from the position specified by {{param|PosOfDigitsToRemove}}.

Subsequently a search of {{object}} for a matching prefix using the modified number is performed. Note that this parameter does not have any impact on the number sent in the outgoing request: it is used only for searching within the Numbering Plan.

This parameter has no effect if it is set to 0.

This parameter is provided to handle Carrier override and other codes used as prefix to standard numbers and to ensure that the correct ''End of Dialing'' can be specified without significant data duplication.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfDigitsToRemove() {
		return numberOfDigitsToRemove;
	}

	/**
	 * Set the if this parameter has a non-zero value, the specified number of digits will be removed from the internal digit buffer (which contains the dialed digits) from the position specified by {{param|PosOfDigitsToRemove}}.

Subsequently a search of {{object}} for a matching prefix using the modified number is performed. Note that this parameter does not have any impact on the number sent in the outgoing request: it is used only for searching within the Numbering Plan.

This parameter has no effect if it is set to 0.

This parameter is provided to handle Carrier override and other codes used as prefix to standard numbers and to ensure that the correct ''End of Dialing'' can be specified without significant data duplication.
	 *
	 * @since 2.0
	 * @param numberOfDigitsToRemove the input value
	 */
	public void  setNumberOfDigitsToRemove(Long numberOfDigitsToRemove) {
		this.numberOfDigitsToRemove = numberOfDigitsToRemove;
	}

	/**
	 * Set the if this parameter has a non-zero value, the specified number of digits will be removed from the internal digit buffer (which contains the dialed digits) from the position specified by {{param|PosOfDigitsToRemove}}.

Subsequently a search of {{object}} for a matching prefix using the modified number is performed. Note that this parameter does not have any impact on the number sent in the outgoing request: it is used only for searching within the Numbering Plan.

This parameter has no effect if it is set to 0.

This parameter is provided to handle Carrier override and other codes used as prefix to standard numbers and to ensure that the correct ''End of Dialing'' can be specified without significant data duplication.
	 *
	 * @since 2.0
	 * @param numberOfDigitsToRemove the input value
	 * @return this instance
	 */
	public PrefixInfo withNumberOfDigitsToRemove(Long numberOfDigitsToRemove) {
		this.numberOfDigitsToRemove = numberOfDigitsToRemove;
		return this;
	}

	/**
	 * Get the this parameter is used in conjunction with {{param|NumberOfDigitsToRemove}}. It specifies the position within the internal digit buffer from which the digits are to be removed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPosOfDigitsToRemove() {
		return posOfDigitsToRemove;
	}

	/**
	 * Set the this parameter is used in conjunction with {{param|NumberOfDigitsToRemove}}. It specifies the position within the internal digit buffer from which the digits are to be removed.
	 *
	 * @since 2.0
	 * @param posOfDigitsToRemove the input value
	 */
	public void  setPosOfDigitsToRemove(Long posOfDigitsToRemove) {
		this.posOfDigitsToRemove = posOfDigitsToRemove;
	}

	/**
	 * Set the this parameter is used in conjunction with {{param|NumberOfDigitsToRemove}}. It specifies the position within the internal digit buffer from which the digits are to be removed.
	 *
	 * @since 2.0
	 * @param posOfDigitsToRemove the input value
	 * @return this instance
	 */
	public PrefixInfo withPosOfDigitsToRemove(Long posOfDigitsToRemove) {
		this.posOfDigitsToRemove = posOfDigitsToRemove;
		return this;
	}

	/**
	 * Get the tone to be played by the VoIP device when the user has dialed exactly the same digits as defined in the prefix.  The VoIP device will cease playing the tone once an additional digit has been dialed.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDialTone() {
		return dialTone;
	}

	/**
	 * Set the tone to be played by the VoIP device when the user has dialed exactly the same digits as defined in the prefix.  The VoIP device will cease playing the tone once an additional digit has been dialed.

{{reference}}
	 *
	 * @since 2.0
	 * @param dialTone the input value
	 */
	public void  setDialTone(String dialTone) {
		this.dialTone = dialTone;
	}

	/**
	 * Set the tone to be played by the VoIP device when the user has dialed exactly the same digits as defined in the prefix.  The VoIP device will cease playing the tone once an additional digit has been dialed.

{{reference}}
	 *
	 * @since 2.0
	 * @param dialTone the input value
	 * @return this instance
	 */
	public PrefixInfo withDialTone(String dialTone) {
		this.dialTone = dialTone;
		return this;
	}

	/**
	 * Get the this is a string representing a Facility Action implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

When {{empty}} or the value is an unrecognized string (i.e. a Facility Action not supported by the CPE) normal outgoing requests are made.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFacilityAction() {
		return facilityAction;
	}

	/**
	 * Set the this is a string representing a Facility Action implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

When {{empty}} or the value is an unrecognized string (i.e. a Facility Action not supported by the CPE) normal outgoing requests are made.
	 *
	 * @since 2.0
	 * @param facilityAction the input value
	 */
	public void  setFacilityAction(String facilityAction) {
		this.facilityAction = facilityAction;
	}

	/**
	 * Set the this is a string representing a Facility Action implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

When {{empty}} or the value is an unrecognized string (i.e. a Facility Action not supported by the CPE) normal outgoing requests are made.
	 *
	 * @since 2.0
	 * @param facilityAction the input value
	 * @return this instance
	 */
	public PrefixInfo withFacilityAction(String facilityAction) {
		this.facilityAction = facilityAction;
		return this;
	}

	/**
	 * Get the optional argument associated with {{param|FacilityAction}}.  The interpretation of the argument is dependent on a specific value of {{param|FacilityAction}}. {{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFacilityActionArgument() {
		return facilityActionArgument;
	}

	/**
	 * Set the optional argument associated with {{param|FacilityAction}}.  The interpretation of the argument is dependent on a specific value of {{param|FacilityAction}}. {{reference}}
	 *
	 * @since 2.0
	 * @param facilityActionArgument the input value
	 */
	public void  setFacilityActionArgument(String facilityActionArgument) {
		this.facilityActionArgument = facilityActionArgument;
	}

	/**
	 * Set the optional argument associated with {{param|FacilityAction}}.  The interpretation of the argument is dependent on a specific value of {{param|FacilityAction}}. {{reference}}
	 *
	 * @since 2.0
	 * @param facilityActionArgument the input value
	 * @return this instance
	 */
	public PrefixInfo withFacilityActionArgument(String facilityActionArgument) {
		this.facilityActionArgument = facilityActionArgument;
		return this;
	}

	//</editor-fold>

}