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
package org.broadbandforum.tr098.internetgatewaydevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.capabilities.PerformanceDiagnostic;

	/**
	 * The capabilities of the device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.
	 *
	 * @since 1.3
	 */
@CWMPObject(name = "InternetGatewayDevice.Capabilities.")
@XmlRootElement(name = "Capabilities")
@XmlType(name = "InternetGatewayDevice.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * The capabilities of the Performance Diagnostics (''DownloadDiagnostics'' and ''UploadDiagnostics'') for the device.
	 */
	@XmlElement(name = "PerformanceDiagnostic")
	public PerformanceDiagnostic performanceDiagnostic;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the capabilities of the Performance Diagnostics (''DownloadDiagnostics'' and ''UploadDiagnostics'') for the device.
	 *
	 * @return the value
	 */
	public PerformanceDiagnostic getPerformanceDiagnostic() {
		return performanceDiagnostic;
	}

	/**
	 * Set the capabilities of the Performance Diagnostics (''DownloadDiagnostics'' and ''UploadDiagnostics'') for the device.
	 *
	 * @param performanceDiagnostic the input value
	 */
	public void  setPerformanceDiagnostic(PerformanceDiagnostic performanceDiagnostic) {
		this.performanceDiagnostic = performanceDiagnostic;
	}

	/**
	 * Set the capabilities of the Performance Diagnostics (''DownloadDiagnostics'' and ''UploadDiagnostics'') for the device.
	 *
	 * @param performanceDiagnostic the input value
	 * @return this instance
	 */
	public Capabilities withPerformanceDiagnostic(PerformanceDiagnostic performanceDiagnostic) {
		this.performanceDiagnostic = performanceDiagnostic;
		return this;
	}

	//</editor-fold>

}