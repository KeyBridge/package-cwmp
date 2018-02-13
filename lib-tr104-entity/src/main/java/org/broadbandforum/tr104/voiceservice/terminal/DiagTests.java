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
package org.broadbandforum.tr104.voiceservice.terminal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Terminal level tests.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.DiagTests.")
@XmlRootElement(name = "DiagTests")
@XmlType(name = "VoiceService.Terminal.DiagTests")
@XmlAccessorType(XmlAccessType.FIELD)
public class DiagTests {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to None.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public String diagnosticsState;
	/**
	 * Indicates which test to perform.

The parameter MAY instead indicate a vendor-specific test, which MUST use the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyTest"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TestSelector")
	@CWMPParameter(access = "readWrite")
	public String testSelector;
	/**
	 * Indicates whether or not the phone associated with this port is ringing. This parameter is applicable only if {{enum|RingingTest|TestSelector}} is supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhoneRinging")
	public Boolean phoneRinging;

	public DiagTests() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to None.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to None.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to None.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public DiagTests withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the indicates which test to perform.

The parameter MAY instead indicate a vendor-specific test, which MUST use the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyTest"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTestSelector() {
		return testSelector;
	}

	/**
	 * Set the indicates which test to perform.

The parameter MAY instead indicate a vendor-specific test, which MUST use the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyTest"
	 *
	 * @since 2.0
	 * @param testSelector the input value
	 */
	public void  setTestSelector(String testSelector) {
		this.testSelector = testSelector;
	}

	/**
	 * Set the indicates which test to perform.

The parameter MAY instead indicate a vendor-specific test, which MUST use the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyTest"
	 *
	 * @since 2.0
	 * @param testSelector the input value
	 * @return this instance
	 */
	public DiagTests withTestSelector(String testSelector) {
		this.testSelector = testSelector;
		return this;
	}

	/**
	 * Get the indicates whether or not the phone associated with this port is ringing. This parameter is applicable only if {{enum|RingingTest|TestSelector}} is supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPhoneRinging() {
		return phoneRinging;
	}

	/**
	 * Set the indicates whether or not the phone associated with this port is ringing. This parameter is applicable only if {{enum|RingingTest|TestSelector}} is supported.
	 *
	 * @since 2.0
	 * @param phoneRinging the input value
	 */
	public void  setPhoneRinging(Boolean phoneRinging) {
		this.phoneRinging = phoneRinging;
	}

	/**
	 * Set the indicates whether or not the phone associated with this port is ringing. This parameter is applicable only if {{enum|RingingTest|TestSelector}} is supported.
	 *
	 * @since 2.0
	 * @param phoneRinging the input value
	 * @return this instance
	 */
	public DiagTests withPhoneRinging(Boolean phoneRinging) {
		this.phoneRinging = phoneRinging;
		return this;
	}

	//</editor-fold>

}