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
package org.broadbandforum.tr181.datatypes;

import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Indicates the availability of diagnostics data. Enumeration of:

      {{enum}}

      If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test. When writing, the only allowed values are {{enum|Requested}} and {{enum|Canceled}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set, and any errors or inconsistencies in the test parameters MUST be detected, either prior to or at the same time as (in the same SetParameterValues) setting this parameter to {{enum|Requested}}.

      When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic test.

      When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

      If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

      When the diagnostic initiated by the ACS is completed (successfully or not), but not if it is canceled for any reason, the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

      After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

      Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

      While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

      While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.

      While the test is in progress, setting this parameter to {{enum|Canceled}} MUST result in the test being canceled and the value of this parameter being set to {{enum|None}}. If the CPE does not support the {{enum|Canceled}} value, it MUST return a SPV error with "Invalid Parameter value" (9007) to the ACS instead.
	 */
public enum DiagnosticsState {

None,
Requested,
	@CWMPObject(optional = true)
Canceled,
Complete,
	@CWMPObject(optional = true)
Error;


	private DiagnosticsState() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	//</editor-fold>

}