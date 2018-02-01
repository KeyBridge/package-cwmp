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
package org.broadbandforum.tr098.internetgatewaydevice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The capabilities of the Performance Diagnostics (''DownloadDiagnostics'' and ''UploadDiagnostics'') for the device.
	 *
	 * @since 1.3
	 */
@CWMPObject(name = "InternetGatewayDevice.Capabilities.PerformanceDiagnostic.")
public class PerformanceDiagnostic {

	/**
	 * Supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DownloadTransports")
	@XmlList
	public Collection<String> downloadTransports;
	/**
	 * Supported ''UploadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "UploadTransports")
	@XmlList
	public Collection<String> uploadTransports;

	public PerformanceDiagnostic() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getDownloadTransports() {
		if (this.downloadTransports == null){ this.downloadTransports=new ArrayList<>();}
		return downloadTransports;
	}

	/**
	 * Set the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @param downloadTransports the input value
	 */
	public void  setDownloadTransports(Collection<String> downloadTransports) {
		this.downloadTransports = downloadTransports;
	}

	/**
	 * Set the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public PerformanceDiagnostic withDownloadTransports(String string) {
		getDownloadTransports().add(string);
		return this;
	}

	/**
	 * Get the supported ''UploadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getUploadTransports() {
		if (this.uploadTransports == null){ this.uploadTransports=new ArrayList<>();}
		return uploadTransports;
	}

	/**
	 * Set the supported ''UploadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @param uploadTransports the input value
	 */
	public void  setUploadTransports(Collection<String> uploadTransports) {
		this.uploadTransports = uploadTransports;
	}

	/**
	 * Set the supported ''UploadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public PerformanceDiagnostic withUploadTransports(String string) {
		getUploadTransports().add(string);
		return this;
	}

	//</editor-fold>

}