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
package org.broadbandforum.tr196.fapservice.cellconfig.lte;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.energysavings.ActivationCandidateCellsLoad;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.energysavings.DeactivationCandidateCellsLoad;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.energysavings.NotAllowedTimePeriod;

	/**
	 * This object provides for the managment of energy savings capabilities in the HeNB.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EnergySavings.")
public class EnergySavings {

	/**
	 * This attribute determines whether the energy saving function is enabled or disabled.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Specifies the status regarding the energy saving in the cell. This parameter is applicable when the value of {{param|Enable}} is {{true}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "State")
	public String state;
	/**
	 * This object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration, which are used by distributed energy saving algorithms to allow an ‘original’ cell to enter the energy saving state. Threshold and TimeDuration are applied to the candidate cell(s) which provide coverage backup of an original cell when it is in the energy saving state.
	 */
	@XmlElement(name = "ActivationCandidateCellsLoad")
	public ActivationCandidateCellsLoad activationCandidateCellsLoad;
	/**
	 * This object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration which is used by distributed energy saving algorithms to allow a cell to leave the energy saving state. Threshold and time duration are applied to the candidate cell when it provides coverage backup for the cell in energy saving state.
	 */
	@XmlElement(name = "DeactivationCandidateCellsLoad")
	public DeactivationCandidateCellsLoad deactivationCandidateCellsLoad;
	/**
	 * This object provides a time period for which energy saving is not allowed.

This object can be used to prevent a cell entering energy saving state. 

This object is valid on the specified day(s) and time of every week.
	 */
	@XmlElementWrapper(name = "NotAllowedTimePeriods")
	@XmlElement(name = "NotAllowedTimePeriod")
	@CWMPParameter(access = "readWrite")
	public Collection<NotAllowedTimePeriod> notAllowedTimePeriods;

	public EnergySavings() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this attribute determines whether the energy saving function is enabled or disabled.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the this attribute determines whether the energy saving function is enabled or disabled.
	 *
	 * @since 2.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the this attribute determines whether the energy saving function is enabled or disabled.
	 *
	 * @since 2.1
	 * @param enable the input value
	 * @return this instance
	 */
	public EnergySavings withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the specifies the status regarding the energy saving in the cell. This parameter is applicable when the value of {{param|Enable}} is {{true}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getState() {
		return state;
	}

	/**
	 * Set the specifies the status regarding the energy saving in the cell. This parameter is applicable when the value of {{param|Enable}} is {{true}}.
	 *
	 * @since 2.1
	 * @param state the input value
	 */
	public void  setState(String state) {
		this.state = state;
	}

	/**
	 * Set the specifies the status regarding the energy saving in the cell. This parameter is applicable when the value of {{param|Enable}} is {{true}}.
	 *
	 * @since 2.1
	 * @param state the input value
	 * @return this instance
	 */
	public EnergySavings withState(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Get the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration, which are used by distributed energy saving algorithms to allow an ‘original’ cell to enter the energy saving state. Threshold and TimeDuration are applied to the candidate cell(s) which provide coverage backup of an original cell when it is in the energy saving state.
	 *
	 * @return the value
	 */
	public ActivationCandidateCellsLoad getActivationCandidateCellsLoad() {
		return activationCandidateCellsLoad;
	}

	/**
	 * Set the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration, which are used by distributed energy saving algorithms to allow an ‘original’ cell to enter the energy saving state. Threshold and TimeDuration are applied to the candidate cell(s) which provide coverage backup of an original cell when it is in the energy saving state.
	 *
	 * @param activationCandidateCellsLoad the input value
	 */
	public void  setActivationCandidateCellsLoad(ActivationCandidateCellsLoad activationCandidateCellsLoad) {
		this.activationCandidateCellsLoad = activationCandidateCellsLoad;
	}

	/**
	 * Set the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration, which are used by distributed energy saving algorithms to allow an ‘original’ cell to enter the energy saving state. Threshold and TimeDuration are applied to the candidate cell(s) which provide coverage backup of an original cell when it is in the energy saving state.
	 *
	 * @param activationCandidateCellsLoad the input value
	 * @return this instance
	 */
	public EnergySavings withActivationCandidateCellsLoad(ActivationCandidateCellsLoad activationCandidateCellsLoad) {
		this.activationCandidateCellsLoad = activationCandidateCellsLoad;
		return this;
	}

	/**
	 * Get the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration which is used by distributed energy saving algorithms to allow a cell to leave the energy saving state. Threshold and time duration are applied to the candidate cell when it provides coverage backup for the cell in energy saving state.
	 *
	 * @return the value
	 */
	public DeactivationCandidateCellsLoad getDeactivationCandidateCellsLoad() {
		return deactivationCandidateCellsLoad;
	}

	/**
	 * Set the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration which is used by distributed energy saving algorithms to allow a cell to leave the energy saving state. Threshold and time duration are applied to the candidate cell when it provides coverage backup for the cell in energy saving state.
	 *
	 * @param deactivationCandidateCellsLoad the input value
	 */
	public void  setDeactivationCandidateCellsLoad(DeactivationCandidateCellsLoad deactivationCandidateCellsLoad) {
		this.deactivationCandidateCellsLoad = deactivationCandidateCellsLoad;
	}

	/**
	 * Set the this object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration which is used by distributed energy saving algorithms to allow a cell to leave the energy saving state. Threshold and time duration are applied to the candidate cell when it provides coverage backup for the cell in energy saving state.
	 *
	 * @param deactivationCandidateCellsLoad the input value
	 * @return this instance
	 */
	public EnergySavings withDeactivationCandidateCellsLoad(DeactivationCandidateCellsLoad deactivationCandidateCellsLoad) {
		this.deactivationCandidateCellsLoad = deactivationCandidateCellsLoad;
		return this;
	}

	/**
	 * Get the this object provides a time period for which energy saving is not allowed.

This object can be used to prevent a cell entering energy saving state. 

This object is valid on the specified day(s) and time of every week.
	 *
	 * @return the value
	 */
	public Collection<NotAllowedTimePeriod> getNotAllowedTimePeriods() {
		if (this.notAllowedTimePeriods == null){ this.notAllowedTimePeriods=new ArrayList<>();}
		return notAllowedTimePeriods;
	}

	/**
	 * Set the this object provides a time period for which energy saving is not allowed.

This object can be used to prevent a cell entering energy saving state. 

This object is valid on the specified day(s) and time of every week.
	 *
	 * @param notAllowedTimePeriods the input value
	 */
	public void  setNotAllowedTimePeriods(Collection<NotAllowedTimePeriod> notAllowedTimePeriods) {
		this.notAllowedTimePeriods = notAllowedTimePeriods;
	}

	/**
	 * Set the this object provides a time period for which energy saving is not allowed.

This object can be used to prevent a cell entering energy saving state. 

This object is valid on the specified day(s) and time of every week.
	 *
	 * @param notAllowedTimePeriod the input value
	 * @return this instance
	 */
	public EnergySavings withNotAllowedTimePeriod(NotAllowedTimePeriod notAllowedTimePeriod) {
		getNotAllowedTimePeriods().add(notAllowedTimePeriod);
		return this;
	}

	//</editor-fold>

}