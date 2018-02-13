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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * DVB-T service list database installation.  Supports maintenance of the service list database by scanning frequencies in order to detect services.

The service list database is in {{object|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.Install.")
@XmlRootElement(name = "STBService.Components.FrontEnd.DVBT.Install")
@XmlType(name = "STBService.Components.FrontEnd.DVBT.Install")
@XmlAccessorType(XmlAccessType.FIELD)
public class Install {

	/**
	 * Starts (when set to {{true}}) or stops (when set to {{false}}) scanning for services.  The value is not saved in device state and is always {{false}} when read.

Discovered services are merged with those already present in the service list database.  This supports cases where the frequency spectrum is not continuous.

In order to force a re-install, the service list database needs to be reset (see {{param|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.Reset}}).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Start")
	@CWMPParameter(access = "readWrite")
	public Boolean start;
	/**
	 * Indicates the status of the scanning process.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Progression in % of the current scan.  The value is undefined when a scan is not in progress.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Progress")
	@CWMPParameter(activeNotify = "canDeny", units = "%")
	@Size(min = 0, max = 100)
	public Long progress;
	/**
	 * Frequency (in kHz) at which to start the scanning process.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StartFrequency")
	@CWMPParameter(access = "readWrite", units = "kHz")
	public Long startFrequency;
	/**
	 * Frequency (in kHz) at which to stop the scanning process.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StopFrequency")
	@CWMPParameter(access = "readWrite", units = "kHz")
	public Long stopFrequency;

	public Install() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the starts (when set to {{true}}) or stops (when set to {{false}}) scanning for services.  The value is not saved in device state and is always {{false}} when read.

Discovered services are merged with those already present in the service list database.  This supports cases where the frequency spectrum is not continuous.

In order to force a re-install, the service list database needs to be reset (see {{param|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.Reset}}).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isStart() {
		return start;
	}

	/**
	 * Set the starts (when set to {{true}}) or stops (when set to {{false}}) scanning for services.  The value is not saved in device state and is always {{false}} when read.

Discovered services are merged with those already present in the service list database.  This supports cases where the frequency spectrum is not continuous.

In order to force a re-install, the service list database needs to be reset (see {{param|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.Reset}}).
	 *
	 * @since 1.0
	 * @param start the input value
	 */
	public void  setStart(Boolean start) {
		this.start = start;
	}

	/**
	 * Set the starts (when set to {{true}}) or stops (when set to {{false}}) scanning for services.  The value is not saved in device state and is always {{false}} when read.

Discovered services are merged with those already present in the service list database.  This supports cases where the frequency spectrum is not continuous.

In order to force a re-install, the service list database needs to be reset (see {{param|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.Reset}}).
	 *
	 * @since 1.0
	 * @param start the input value
	 * @return this instance
	 */
	public Install withStart(Boolean start) {
		this.start = start;
		return this;
	}

	/**
	 * Get the indicates the status of the scanning process.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the scanning process.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the scanning process.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public Install withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the progression in % of the current scan.  The value is undefined when a scan is not in progress.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getProgress() {
		return progress;
	}

	/**
	 * Set the progression in % of the current scan.  The value is undefined when a scan is not in progress.
	 *
	 * @since 1.0
	 * @param progress the input value
	 */
	public void  setProgress(Long progress) {
		this.progress = progress;
	}

	/**
	 * Set the progression in % of the current scan.  The value is undefined when a scan is not in progress.
	 *
	 * @since 1.0
	 * @param progress the input value
	 * @return this instance
	 */
	public Install withProgress(Long progress) {
		this.progress = progress;
		return this;
	}

	/**
	 * Get the frequency (in kHz) at which to start the scanning process.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getStartFrequency() {
		return startFrequency;
	}

	/**
	 * Set the frequency (in kHz) at which to start the scanning process.
	 *
	 * @since 1.0
	 * @param startFrequency the input value
	 */
	public void  setStartFrequency(Long startFrequency) {
		this.startFrequency = startFrequency;
	}

	/**
	 * Set the frequency (in kHz) at which to start the scanning process.
	 *
	 * @since 1.0
	 * @param startFrequency the input value
	 * @return this instance
	 */
	public Install withStartFrequency(Long startFrequency) {
		this.startFrequency = startFrequency;
		return this;
	}

	/**
	 * Get the frequency (in kHz) at which to stop the scanning process.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getStopFrequency() {
		return stopFrequency;
	}

	/**
	 * Set the frequency (in kHz) at which to stop the scanning process.
	 *
	 * @since 1.0
	 * @param stopFrequency the input value
	 */
	public void  setStopFrequency(Long stopFrequency) {
		this.stopFrequency = stopFrequency;
	}

	/**
	 * Set the frequency (in kHz) at which to stop the scanning process.
	 *
	 * @since 1.0
	 * @param stopFrequency the input value
	 * @return this instance
	 */
	public Install withStopFrequency(Long stopFrequency) {
		this.stopFrequency = stopFrequency;
		return this;
	}

	//</editor-fold>

}