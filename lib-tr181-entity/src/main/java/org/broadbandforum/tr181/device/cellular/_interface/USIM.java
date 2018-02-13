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
package org.broadbandforum.tr181.device.cellular._interface;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * USIM (Universal Subscriber Identity Module or SIM card) parameters for the interface.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Cellular.Interface.{i}.USIM.")
@XmlRootElement(name = "Device.Cellular.Interface.USIM")
@XmlType(name = "Device.Cellular.Interface.USIM")
@XmlAccessorType(XmlAccessType.FIELD)
public class USIM {

	/**
	 * The current status of the USIM card.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * International Mobile Subscriber Identity represented as a string with either 14 or 15 digits (digits 0-9). The first 3 digits are the mobile country code (MCC), which are followed by the mobile network code (MNC), either 2 digits (European standard) or 3 digits (North American standard), followed by the mobile subscription identification number (MSIN).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IMSI")
	@Size(min = 14, max = 15)
	@Pattern(regexp = "[0-9]{14,15}")
	public String imsI;
	/**
	 * Integrated Circuit Card Identifier represented as a string of up to 20 digits (digits 0-9). The number is composed of the following parts:

          * Major industry identifier (MII), 2 fixed digits, 89 for telecommunication purposes.

          * Country code, 1–3 digits, as defined by ITU-T recommendation {{bibref|ITU-E.164}}.

          * identifier, 1–4 digits.

          * Individual account identification number. Its length is variable, but every number under one IIN will have the same length.

          * Single check digit calculated from the other digits using the Luhn algorithm.

          For cards using an ICCID according to {{bibref|ITU-E.118}} the maximum length is 19 Digits, for GSM cards 20 digits.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ICCID")
	@Size(min = 6, max = 20)
	@Pattern(regexp = "[0-9]{6,20}")
	public String iccID;
	/**
	 * Mobile Subscriber Integrated Service Digital Network Number, a number uniquely identifying a subscription in a GSM, UMTS, or LTE mobile network. {{bibref|ITU-E.164}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MSISDN")
	@Size(min = 14, max = 15)
	@Pattern(regexp = "[0-9]{14,15}")
	public String msiSDN;
	/**
	 * Controls the PIN verification of the USIM card.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PINCheck")
	@CWMPParameter(access = "readWrite")
	public String pinCheck;
	/**
	 * Allows the ACS to change the USIM PIN used for SIM card activation.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PIN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 4)
	public String pin;

	public USIM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current status of the USIM card.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current status of the USIM card.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current status of the USIM card.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public USIM withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the international Mobile Subscriber Identity represented as a string with either 14 or 15 digits (digits 0-9). The first 3 digits are the mobile country code (MCC), which are followed by the mobile network code (MNC), either 2 digits (European standard) or 3 digits (North American standard), followed by the mobile subscription identification number (MSIN).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getImsI() {
		return imsI;
	}

	/**
	 * Set the international Mobile Subscriber Identity represented as a string with either 14 or 15 digits (digits 0-9). The first 3 digits are the mobile country code (MCC), which are followed by the mobile network code (MNC), either 2 digits (European standard) or 3 digits (North American standard), followed by the mobile subscription identification number (MSIN).
	 *
	 * @since 2.8
	 * @param imsI the input value
	 */
	public void  setImsI(String imsI) {
		this.imsI = imsI;
	}

	/**
	 * Set the international Mobile Subscriber Identity represented as a string with either 14 or 15 digits (digits 0-9). The first 3 digits are the mobile country code (MCC), which are followed by the mobile network code (MNC), either 2 digits (European standard) or 3 digits (North American standard), followed by the mobile subscription identification number (MSIN).
	 *
	 * @since 2.8
	 * @param imsI the input value
	 * @return this instance
	 */
	public USIM withImsI(String imsI) {
		this.imsI = imsI;
		return this;
	}

	/**
	 * Get the integrated Circuit Card Identifier represented as a string of up to 20 digits (digits 0-9). The number is composed of the following parts:

          * Major industry identifier (MII), 2 fixed digits, 89 for telecommunication purposes.

          * Country code, 1–3 digits, as defined by ITU-T recommendation {{bibref|ITU-E.164}}.

          * identifier, 1–4 digits.

          * Individual account identification number. Its length is variable, but every number under one IIN will have the same length.

          * Single check digit calculated from the other digits using the Luhn algorithm.

          For cards using an ICCID according to {{bibref|ITU-E.118}} the maximum length is 19 Digits, for GSM cards 20 digits.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getIccID() {
		return iccID;
	}

	/**
	 * Set the integrated Circuit Card Identifier represented as a string of up to 20 digits (digits 0-9). The number is composed of the following parts:

          * Major industry identifier (MII), 2 fixed digits, 89 for telecommunication purposes.

          * Country code, 1–3 digits, as defined by ITU-T recommendation {{bibref|ITU-E.164}}.

          * identifier, 1–4 digits.

          * Individual account identification number. Its length is variable, but every number under one IIN will have the same length.

          * Single check digit calculated from the other digits using the Luhn algorithm.

          For cards using an ICCID according to {{bibref|ITU-E.118}} the maximum length is 19 Digits, for GSM cards 20 digits.
	 *
	 * @since 2.8
	 * @param iccID the input value
	 */
	public void  setIccID(String iccID) {
		this.iccID = iccID;
	}

	/**
	 * Set the integrated Circuit Card Identifier represented as a string of up to 20 digits (digits 0-9). The number is composed of the following parts:

          * Major industry identifier (MII), 2 fixed digits, 89 for telecommunication purposes.

          * Country code, 1–3 digits, as defined by ITU-T recommendation {{bibref|ITU-E.164}}.

          * identifier, 1–4 digits.

          * Individual account identification number. Its length is variable, but every number under one IIN will have the same length.

          * Single check digit calculated from the other digits using the Luhn algorithm.

          For cards using an ICCID according to {{bibref|ITU-E.118}} the maximum length is 19 Digits, for GSM cards 20 digits.
	 *
	 * @since 2.8
	 * @param iccID the input value
	 * @return this instance
	 */
	public USIM withIccID(String iccID) {
		this.iccID = iccID;
		return this;
	}

	/**
	 * Get the mobile Subscriber Integrated Service Digital Network Number, a number uniquely identifying a subscription in a GSM, UMTS, or LTE mobile network. {{bibref|ITU-E.164}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getMsiSDN() {
		return msiSDN;
	}

	/**
	 * Set the mobile Subscriber Integrated Service Digital Network Number, a number uniquely identifying a subscription in a GSM, UMTS, or LTE mobile network. {{bibref|ITU-E.164}}
	 *
	 * @since 2.8
	 * @param msiSDN the input value
	 */
	public void  setMsiSDN(String msiSDN) {
		this.msiSDN = msiSDN;
	}

	/**
	 * Set the mobile Subscriber Integrated Service Digital Network Number, a number uniquely identifying a subscription in a GSM, UMTS, or LTE mobile network. {{bibref|ITU-E.164}}
	 *
	 * @since 2.8
	 * @param msiSDN the input value
	 * @return this instance
	 */
	public USIM withMsiSDN(String msiSDN) {
		this.msiSDN = msiSDN;
		return this;
	}

	/**
	 * Get the controls the PIN verification of the USIM card.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPinCheck() {
		return pinCheck;
	}

	/**
	 * Set the controls the PIN verification of the USIM card.
	 *
	 * @since 2.8
	 * @param pinCheck the input value
	 */
	public void  setPinCheck(String pinCheck) {
		this.pinCheck = pinCheck;
	}

	/**
	 * Set the controls the PIN verification of the USIM card.
	 *
	 * @since 2.8
	 * @param pinCheck the input value
	 * @return this instance
	 */
	public USIM withPinCheck(String pinCheck) {
		this.pinCheck = pinCheck;
		return this;
	}

	/**
	 * Get allows the ACS to change the USIM PIN used for SIM card activation.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * Set allows the ACS to change the USIM PIN used for SIM card activation.
	 *
	 * @since 2.8
	 * @param pin the input value
	 */
	public void  setPin(String pin) {
		this.pin = pin;
	}

	/**
	 * Set allows the ACS to change the USIM PIN used for SIM card activation.
	 *
	 * @since 2.8
	 * @param pin the input value
	 * @return this instance
	 */
	public USIM withPin(String pin) {
		this.pin = pin;
		return this;
	}

	//</editor-fold>

}