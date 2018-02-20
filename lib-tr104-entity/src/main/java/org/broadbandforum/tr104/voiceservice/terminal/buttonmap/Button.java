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
package org.broadbandforum.tr104.voiceservice.terminal.buttonmap;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Each entry in this table specifies the purpose of each programmable CPE button / function key and whether the user has permission to reprogram the button.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.ButtonMap.Button.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.Terminal.ButtonMap.Button")
@XmlType(name = "VoiceService.Terminal.ButtonMap.Button")
@XmlAccessorType(XmlAccessType.FIELD)
public class Button {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Name of the button.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ButtonName")
	@Size(max = 16)
	public String buttonName;
	/**
	 * The value MUST be a member of the list reported by {{param|.Capabilities.FacilityActions}}. This is an OPTIONAL parameter that SHOULD NOT be specified for buttons not related to a particular Facility Action (e.g., invocation of ''Call Return'') implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

An empty or unrecognized string (i.e. a Facility Action not supported by the CPE) means that there is no Facility Action to be taken.

If this parameter is specified (not {{empty}}) then {{param|QuickDialNumber}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FacilityAction")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String facilityAction;
	/**
	 * Optional argument associated with the specified {{param|FacilityAction}}.  The interpretation of the argument is dependent on the specific FacilityAction.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FacilityActionArgument")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String facilityActionArgument;
	/**
	 * This is a string representing a quick dial destination number. Only the characters '0-9', '*' and '#' can be used.

If this parameter is specified (not {{empty}}) then {{param|FacilityAction}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuickDialNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 40)
	public String quickDialNumber;
	/**
	 * This string represents the message to be displayed on the screen when the button or function key is pressed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ButtonMessage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String buttonMessage;
	/**
	 * This parameter indicates whether the user has permission to program the button or function key. If this parameter is set to {{true}} then {{param|FacilityAction}}, {{param|QuickDialNumber}} and {{param|ButtonMessage}} MUST all be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAccess")
	@CWMPParameter(access = "readWrite")
	public Boolean userAccess;

	public Button() {
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
	public Button withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the button.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * Set the name of the button.
	 *
	 * @since 2.0
	 * @param buttonName the input value
	 */
	public void  setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	/**
	 * Set the name of the button.
	 *
	 * @since 2.0
	 * @param buttonName the input value
	 * @return this instance
	 */
	public Button withButtonName(String buttonName) {
		this.buttonName = buttonName;
		return this;
	}

	/**
	 * Get the value MUST be a member of the list reported by {{param|.Capabilities.FacilityActions}}. This is an OPTIONAL parameter that SHOULD NOT be specified for buttons not related to a particular Facility Action (e.g., invocation of ''Call Return'') implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

An empty or unrecognized string (i.e. a Facility Action not supported by the CPE) means that there is no Facility Action to be taken.

If this parameter is specified (not {{empty}}) then {{param|QuickDialNumber}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFacilityAction() {
		return facilityAction;
	}

	/**
	 * Set the value MUST be a member of the list reported by {{param|.Capabilities.FacilityActions}}. This is an OPTIONAL parameter that SHOULD NOT be specified for buttons not related to a particular Facility Action (e.g., invocation of ''Call Return'') implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

An empty or unrecognized string (i.e. a Facility Action not supported by the CPE) means that there is no Facility Action to be taken.

If this parameter is specified (not {{empty}}) then {{param|QuickDialNumber}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @param facilityAction the input value
	 */
	public void  setFacilityAction(String facilityAction) {
		this.facilityAction = facilityAction;
	}

	/**
	 * Set the value MUST be a member of the list reported by {{param|.Capabilities.FacilityActions}}. This is an OPTIONAL parameter that SHOULD NOT be specified for buttons not related to a particular Facility Action (e.g., invocation of ''Call Return'') implemented by the VoIP device.

The parameter MAY instead indicate a vendor-specific Facility Action, which MUST use the format defined in {{bibref|TR-106}}.

An empty or unrecognized string (i.e. a Facility Action not supported by the CPE) means that there is no Facility Action to be taken.

If this parameter is specified (not {{empty}}) then {{param|QuickDialNumber}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @param facilityAction the input value
	 * @return this instance
	 */
	public Button withFacilityAction(String facilityAction) {
		this.facilityAction = facilityAction;
		return this;
	}

	/**
	 * Get the optional argument associated with the specified {{param|FacilityAction}}.  The interpretation of the argument is dependent on the specific FacilityAction.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFacilityActionArgument() {
		return facilityActionArgument;
	}

	/**
	 * Set the optional argument associated with the specified {{param|FacilityAction}}.  The interpretation of the argument is dependent on the specific FacilityAction.
	 *
	 * @since 2.0
	 * @param facilityActionArgument the input value
	 */
	public void  setFacilityActionArgument(String facilityActionArgument) {
		this.facilityActionArgument = facilityActionArgument;
	}

	/**
	 * Set the optional argument associated with the specified {{param|FacilityAction}}.  The interpretation of the argument is dependent on the specific FacilityAction.
	 *
	 * @since 2.0
	 * @param facilityActionArgument the input value
	 * @return this instance
	 */
	public Button withFacilityActionArgument(String facilityActionArgument) {
		this.facilityActionArgument = facilityActionArgument;
		return this;
	}

	/**
	 * Get the this is a string representing a quick dial destination number. Only the characters '0-9', '*' and '#' can be used.

If this parameter is specified (not {{empty}}) then {{param|FacilityAction}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getQuickDialNumber() {
		return quickDialNumber;
	}

	/**
	 * Set the this is a string representing a quick dial destination number. Only the characters '0-9', '*' and '#' can be used.

If this parameter is specified (not {{empty}}) then {{param|FacilityAction}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @param quickDialNumber the input value
	 */
	public void  setQuickDialNumber(String quickDialNumber) {
		this.quickDialNumber = quickDialNumber;
	}

	/**
	 * Set the this is a string representing a quick dial destination number. Only the characters '0-9', '*' and '#' can be used.

If this parameter is specified (not {{empty}}) then {{param|FacilityAction}} SHOULD be {{empty}}.
	 *
	 * @since 2.0
	 * @param quickDialNumber the input value
	 * @return this instance
	 */
	public Button withQuickDialNumber(String quickDialNumber) {
		this.quickDialNumber = quickDialNumber;
		return this;
	}

	/**
	 * Get the this string represents the message to be displayed on the screen when the button or function key is pressed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getButtonMessage() {
		return buttonMessage;
	}

	/**
	 * Set the this string represents the message to be displayed on the screen when the button or function key is pressed.
	 *
	 * @since 2.0
	 * @param buttonMessage the input value
	 */
	public void  setButtonMessage(String buttonMessage) {
		this.buttonMessage = buttonMessage;
	}

	/**
	 * Set the this string represents the message to be displayed on the screen when the button or function key is pressed.
	 *
	 * @since 2.0
	 * @param buttonMessage the input value
	 * @return this instance
	 */
	public Button withButtonMessage(String buttonMessage) {
		this.buttonMessage = buttonMessage;
		return this;
	}

	/**
	 * Get the this parameter indicates whether the user has permission to program the button or function key. If this parameter is set to {{true}} then {{param|FacilityAction}}, {{param|QuickDialNumber}} and {{param|ButtonMessage}} MUST all be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUserAccess() {
		return userAccess;
	}

	/**
	 * Set the this parameter indicates whether the user has permission to program the button or function key. If this parameter is set to {{true}} then {{param|FacilityAction}}, {{param|QuickDialNumber}} and {{param|ButtonMessage}} MUST all be {{empty}}.
	 *
	 * @since 2.0
	 * @param userAccess the input value
	 */
	public void  setUserAccess(Boolean userAccess) {
		this.userAccess = userAccess;
	}

	/**
	 * Set the this parameter indicates whether the user has permission to program the button or function key. If this parameter is set to {{true}} then {{param|FacilityAction}}, {{param|QuickDialNumber}} and {{param|ButtonMessage}} MUST all be {{empty}}.
	 *
	 * @since 2.0
	 * @param userAccess the input value
	 * @return this instance
	 */
	public Button withUserAccess(Boolean userAccess) {
		this.userAccess = userAccess;
		return this;
	}

	//</editor-fold>

}