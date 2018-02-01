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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.requestcategory.Schedule;

	/**
	 * This table contains the Request Category (RCAT) policy items for defining when it is appropriate to use the access network for processing requests.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.ANPPolicy.{i}.RequestCategory.{i}.")
public class RequestCategory {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * An RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RCAT")
	@CWMPParameter(access = "readWrite")
	public String rcaT;
	/**
	 * This table contains the schedules that define when it is appropriate to use the access network for processing requests for the specified value of the {{param|#.RCAT}}.

        The combination of all instances of the {{object|AbsTimeSpan}} along with the {{param|Schedules}} parameter makes up the complete schedule for this instance of a {{object}}.

        The {{param|Schedules}} parameter defines a recurrence of the schedule. If instances of {{object|AbsTimeSpan}} exist, these instances places constraints on the schedule recurrence.

        If the value of the {{param|Schedules}} parameter is {{empty}}, at least one enabled instance of {{object|AbsTimeSpan}} MUST exist.

        Processing behavior for the use of RCAT Schedules is defined in section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 */
	@XmlElementWrapper(name = "schedules")
	@XmlElement(name = "Schedule")
	@CWMPParameter(access = "readWrite")
	public Collection<Schedule> schedules;

	public RequestCategory() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public RequestCategory withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public RequestCategory withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getRcaT() {
		return rcaT;
	}

	/**
	 * Set an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @param rcaT the input value
	 */
	public void  setRcaT(String rcaT) {
		this.rcaT = rcaT;
	}

	/**
	 * Set an RCAT is a string that represents a request category used for policy enforcement.
	 *
	 * @since 2.6
	 * @param rcaT the input value
	 * @return this instance
	 */
	public RequestCategory withRcaT(String rcaT) {
		this.rcaT = rcaT;
		return this;
	}

	/**
	 * Get the this table contains the schedules that define when it is appropriate to use the access network for processing requests for the specified value of the {{param|#.RCAT}}.

        The combination of all instances of the {{object|AbsTimeSpan}} along with the {{param|Schedules}} parameter makes up the complete schedule for this instance of a {{object}}.

        The {{param|Schedules}} parameter defines a recurrence of the schedule. If instances of {{object|AbsTimeSpan}} exist, these instances places constraints on the schedule recurrence.

        If the value of the {{param|Schedules}} parameter is {{empty}}, at least one enabled instance of {{object|AbsTimeSpan}} MUST exist.

        Processing behavior for the use of RCAT Schedules is defined in section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @return the value
	 */
	public Collection<Schedule> getSchedules() {
		if (this.schedules == null){ this.schedules=new ArrayList<>();}
		return schedules;
	}

	/**
	 * Set the this table contains the schedules that define when it is appropriate to use the access network for processing requests for the specified value of the {{param|#.RCAT}}.

        The combination of all instances of the {{object|AbsTimeSpan}} along with the {{param|Schedules}} parameter makes up the complete schedule for this instance of a {{object}}.

        The {{param|Schedules}} parameter defines a recurrence of the schedule. If instances of {{object|AbsTimeSpan}} exist, these instances places constraints on the schedule recurrence.

        If the value of the {{param|Schedules}} parameter is {{empty}}, at least one enabled instance of {{object|AbsTimeSpan}} MUST exist.

        Processing behavior for the use of RCAT Schedules is defined in section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @param schedules the input value
	 */
	public void  setSchedules(Collection<Schedule> schedules) {
		this.schedules = schedules;
	}

	/**
	 * Set the this table contains the schedules that define when it is appropriate to use the access network for processing requests for the specified value of the {{param|#.RCAT}}.

        The combination of all instances of the {{object|AbsTimeSpan}} along with the {{param|Schedules}} parameter makes up the complete schedule for this instance of a {{object}}.

        The {{param|Schedules}} parameter defines a recurrence of the schedule. If instances of {{object|AbsTimeSpan}} exist, these instances places constraints on the schedule recurrence.

        If the value of the {{param|Schedules}} parameter is {{empty}}, at least one enabled instance of {{object|AbsTimeSpan}} MUST exist.

        Processing behavior for the use of RCAT Schedules is defined in section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @param schedule the input value
	 * @return this instance
	 */
	public RequestCategory withSchedule(Schedule schedule) {
		getSchedules().add(schedule);
		return this;
	}

	//</editor-fold>

}