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
package org.broadbandforum.tr181.device.etsim2m.scl.reregistration;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object represents the status of the Reregistration action.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.Reregistration.ActionStatus.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.Reregistration.ActionStatus")
@XmlType(name = "Device.ETSIM2M.SCL.Reregistration.ActionStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActionStatus {

	/**
	 * The progress, in percent, of the Reregistration action. The progress is measured from 0-100%. A value of 0 indicates that the action has not started. A value of 100 indicates that the action has completed.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Progress")
	@CWMPParameter(activeNotify = "canDeny", units = "percent")
	@Size(min = 0, max = 100)
	public Long progress;
	/**
	 * The completion status of the Reregistration operation. Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "FinalStatus")
	public String finalStatus;

	public ActionStatus() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the progress, in percent, of the Reregistration action. The progress is measured from 0-100%. A value of 0 indicates that the action has not started. A value of 100 indicates that the action has completed.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Long getProgress() {
		return progress;
	}

	/**
	 * Set the progress, in percent, of the Reregistration action. The progress is measured from 0-100%. A value of 0 indicates that the action has not started. A value of 100 indicates that the action has completed.
	 *
	 * @since 2.6
	 * @param progress the input value
	 */
	public void  setProgress(Long progress) {
		this.progress = progress;
	}

	/**
	 * Set the progress, in percent, of the Reregistration action. The progress is measured from 0-100%. A value of 0 indicates that the action has not started. A value of 100 indicates that the action has completed.
	 *
	 * @since 2.6
	 * @param progress the input value
	 * @return this instance
	 */
	public ActionStatus withProgress(Long progress) {
		this.progress = progress;
		return this;
	}

	/**
	 * Get the completion status of the Reregistration operation. Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getFinalStatus() {
		return finalStatus;
	}

	/**
	 * Set the completion status of the Reregistration operation. Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @param finalStatus the input value
	 */
	public void  setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	/**
	 * Set the completion status of the Reregistration operation. Enumeration of: 

          {{enum}}
	 *
	 * @since 2.6
	 * @param finalStatus the input value
	 * @return this instance
	 */
	public ActionStatus withFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
		return this;
	}

	//</editor-fold>

}