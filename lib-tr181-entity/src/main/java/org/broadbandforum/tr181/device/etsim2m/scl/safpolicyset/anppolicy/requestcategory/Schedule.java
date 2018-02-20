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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.requestcategory;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.requestcategory.schedule.AbsTimeSpan;

	/**
	 * This table contains the schedules that define when it is appropriate to use the access network for processing requests for the specified value of the {{param|#.RCAT}}.

        The combination of all instances of the {{object|AbsTimeSpan}} along with the {{param|Schedules}} parameter makes up the complete schedule for this instance of a {{object}}.

        The {{param|Schedules}} parameter defines a recurrence of the schedule. If instances of {{object|AbsTimeSpan}} exist, these instances places constraints on the schedule recurrence.

        If the value of the {{param|Schedules}} parameter is {{empty}}, at least one enabled instance of {{object|AbsTimeSpan}} MUST exist.

        Processing behavior for the use of RCAT Schedules is defined in section 10.3.1.2.2 of the M2M mIa, dIa and mId Interfaces {{bibref|ETSIM2MInterfaces}} document.
	 *
	 * @since TR181 v2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.ANPPolicy.{i}.RequestCategory.{i}.Schedule.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.ETSIM2M.SCL.SAFPolicySet.ANPPolicy.RequestCategory.Schedule")
@XmlType(name = "Device.ETSIM2M.SCL.SAFPolicySet.ANPPolicy.RequestCategory.Schedule")
@XmlAccessorType(XmlAccessType.FIELD)
public class Schedule {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The list is a set of schedule strings. 

          A schedule string is formatted according to the date and time fields defined CRONTAB input file definition in {{bibref|POSIXBase}}.

          The {{param}} parameter is used to set the recurrence of the schedule.

          The timezone used for this parameter is dependent upon the existence of instances of {{object|AbsTimeSpan}} for this {{object}}. If instances of {{object|AbsTimeSpan}} exist, then the timezone of the {{object|AbsTimeSpan}} is used otherwise the UTC timezone is used for this {{param}} parameter.

          Note the command field is not used in this definition and any whitespace or comma characters within a Schedule string MUST be escaped using percent as defined in {{bibref|TR-106a5|section 3.2.3}}

          Example of CRONTAB string:

          *"* 0-6 * * 1-5" would mean every minute for the period from 0:00h to 6:00h (inclusive) on any week day (Monday through Friday) and would be represented as "*%200-6%20*%20*%201-5"

          *"* /15 22-23,0-4 * * 1-5" would mean every 15 minutes for the period from 22:00h to 04:00h on any week day (Monday through Friday) and would be represented as "* /15%2022-23%2C0-4%20*%20*%201-5"
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Schedules")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> schedules;
	/**
	 * This object defines an instance of a time span used for determining an RCAT schedule.

        An instance of the {{object}} represents the time span in which the schedule recurrence defined in {{param|#.Schedules}} is constrained.

        {{object}} instances with unknown values for the {{param|StartTime}} or {{param|EndTime}} are ignored.

        All instances of the {{object}} within this {{object|##.Schedule}} MUST utilize the same time zone.
	 */
	@XmlElementWrapper(name = "AbsTimeSpans")
	@XmlElement(name = "AbsTimeSpan")
	@CWMPParameter(access = "readWrite")
	public Collection<AbsTimeSpan> absTimeSpans;

	public Schedule() {
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
	public Schedule withEnable(Boolean enable) {
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
	public Schedule withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the list is a set of schedule strings. 

          A schedule string is formatted according to the date and time fields defined CRONTAB input file definition in {{bibref|POSIXBase}}.

          The {{param}} parameter is used to set the recurrence of the schedule.

          The timezone used for this parameter is dependent upon the existence of instances of {{object|AbsTimeSpan}} for this {{object}}. If instances of {{object|AbsTimeSpan}} exist, then the timezone of the {{object|AbsTimeSpan}} is used otherwise the UTC timezone is used for this {{param}} parameter.

          Note the command field is not used in this definition and any whitespace or comma characters within a Schedule string MUST be escaped using percent as defined in {{bibref|TR-106a5|section 3.2.3}}

          Example of CRONTAB string:

          *"* 0-6 * * 1-5" would mean every minute for the period from 0:00h to 6:00h (inclusive) on any week day (Monday through Friday) and would be represented as "*%200-6%20*%20*%201-5"

          *"* /15 22-23,0-4 * * 1-5" would mean every 15 minutes for the period from 22:00h to 04:00h on any week day (Monday through Friday) and would be represented as "* /15%2022-23%2C0-4%20*%20*%201-5"
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getSchedules() {
		if (this.schedules == null){ this.schedules=new ArrayList<>();}
		return schedules;
	}

	/**
	 * Set the list is a set of schedule strings. 

          A schedule string is formatted according to the date and time fields defined CRONTAB input file definition in {{bibref|POSIXBase}}.

          The {{param}} parameter is used to set the recurrence of the schedule.

          The timezone used for this parameter is dependent upon the existence of instances of {{object|AbsTimeSpan}} for this {{object}}. If instances of {{object|AbsTimeSpan}} exist, then the timezone of the {{object|AbsTimeSpan}} is used otherwise the UTC timezone is used for this {{param}} parameter.

          Note the command field is not used in this definition and any whitespace or comma characters within a Schedule string MUST be escaped using percent as defined in {{bibref|TR-106a5|section 3.2.3}}

          Example of CRONTAB string:

          *"* 0-6 * * 1-5" would mean every minute for the period from 0:00h to 6:00h (inclusive) on any week day (Monday through Friday) and would be represented as "*%200-6%20*%20*%201-5"

          *"* /15 22-23,0-4 * * 1-5" would mean every 15 minutes for the period from 22:00h to 04:00h on any week day (Monday through Friday) and would be represented as "* /15%2022-23%2C0-4%20*%20*%201-5"
	 *
	 * @since 2.6
	 * @param schedules the input value
	 */
	public void  setSchedules(Collection<String> schedules) {
		this.schedules = schedules;
	}

	/**
	 * Set the list is a set of schedule strings. 

          A schedule string is formatted according to the date and time fields defined CRONTAB input file definition in {{bibref|POSIXBase}}.

          The {{param}} parameter is used to set the recurrence of the schedule.

          The timezone used for this parameter is dependent upon the existence of instances of {{object|AbsTimeSpan}} for this {{object}}. If instances of {{object|AbsTimeSpan}} exist, then the timezone of the {{object|AbsTimeSpan}} is used otherwise the UTC timezone is used for this {{param}} parameter.

          Note the command field is not used in this definition and any whitespace or comma characters within a Schedule string MUST be escaped using percent as defined in {{bibref|TR-106a5|section 3.2.3}}

          Example of CRONTAB string:

          *"* 0-6 * * 1-5" would mean every minute for the period from 0:00h to 6:00h (inclusive) on any week day (Monday through Friday) and would be represented as "*%200-6%20*%20*%201-5"

          *"* /15 22-23,0-4 * * 1-5" would mean every 15 minutes for the period from 22:00h to 04:00h on any week day (Monday through Friday) and would be represented as "* /15%2022-23%2C0-4%20*%20*%201-5"
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public Schedule withSchedules(String string) {
		getSchedules().add(string);
		return this;
	}

	/**
	 * Get the this object defines an instance of a time span used for determining an RCAT schedule.

        An instance of the {{object}} represents the time span in which the schedule recurrence defined in {{param|#.Schedules}} is constrained.

        {{object}} instances with unknown values for the {{param|StartTime}} or {{param|EndTime}} are ignored.

        All instances of the {{object}} within this {{object|##.Schedule}} MUST utilize the same time zone.
	 *
	 * @return the value
	 */
	public Collection<AbsTimeSpan> getAbsTimeSpans() {
		if (this.absTimeSpans == null){ this.absTimeSpans=new ArrayList<>();}
		return absTimeSpans;
	}

	/**
	 * Set the this object defines an instance of a time span used for determining an RCAT schedule.

        An instance of the {{object}} represents the time span in which the schedule recurrence defined in {{param|#.Schedules}} is constrained.

        {{object}} instances with unknown values for the {{param|StartTime}} or {{param|EndTime}} are ignored.

        All instances of the {{object}} within this {{object|##.Schedule}} MUST utilize the same time zone.
	 *
	 * @param absTimeSpans the input value
	 */
	public void  setAbsTimeSpans(Collection<AbsTimeSpan> absTimeSpans) {
		this.absTimeSpans = absTimeSpans;
	}

	/**
	 * Set the this object defines an instance of a time span used for determining an RCAT schedule.

        An instance of the {{object}} represents the time span in which the schedule recurrence defined in {{param|#.Schedules}} is constrained.

        {{object}} instances with unknown values for the {{param|StartTime}} or {{param|EndTime}} are ignored.

        All instances of the {{object}} within this {{object|##.Schedule}} MUST utilize the same time zone.
	 *
	 * @param absTimeSpan the input value
	 * @return this instance
	 */
	public Schedule withAbsTimeSpan(AbsTimeSpan absTimeSpan) {
		getAbsTimeSpans().add(absTimeSpan);
		return this;
	}

	//</editor-fold>

}