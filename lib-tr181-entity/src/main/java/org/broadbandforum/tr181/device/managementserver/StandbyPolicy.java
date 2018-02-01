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
package org.broadbandforum.tr181.device.managementserver;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to CPE behavior when waking up from standby. If this object is supported then the CPE MUST support the requirements of {{bibref|TR-069a5|Annex L}}.

        NOTE: "CR", as used in the names and descriptions of the parameters defined in this object, refers to the Connection Request concept defined in TR-069.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ManagementServer.StandbyPolicy.")
public class StandbyPolicy {

	/**
	 * When waking up from a non CR-Aware Standby that lasted more than this parameter's value (in seconds), the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for having been non CR-aware.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CRUnawarenessMaxDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer crunawarenessMaxDuration = -1;
	/**
	 * When waking up from a non fully Timer-Aware Standby that made it miss more than this parameter's value Periodic Contacts, the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for exceeding that limit.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaxMissedPeriodic")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer maxMissedPeriodic = -1;
	/**
	 * When waking up from a non fully Timer-Aware Standby that made it miss at least one Scheduled Contact, the CPE MUST issue a WAKEUP Event if this parameter is {{true}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "NotifyMissedScheduled")
	@CWMPParameter(access = "readWrite")
	public Boolean notifyMissedScheduled = false;
	/**
	 * Indicates that the CPE is capable of CR-Aware Standby.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "NetworkAwarenessCapable")
	public Boolean networkAwarenessCapable;
	/**
	 * Indicates that the CPE is capable of Timer-Aware Standby.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SelfTimerCapable")
	public Boolean selfTimerCapable;
	/**
	 * If {{param|NetworkAwarenessCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a non CR-Aware Standby state.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CRAwarenessRequested")
	@CWMPParameter(access = "readWrite")
	public Boolean crawarenessRequested = false;
	/**
	 * If {{param|SelfTimerCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a standby state that prevents it from honoring Periodic Contacts.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PeriodicAwarenessRequested")
	@CWMPParameter(access = "readWrite")
	public Boolean periodicAwarenessRequested = false;
	/**
	 * If this parameter is true, the CPE MUST NOT go into a standby state that prevents it from honoring Scheduled Contacts. This means that, whenever the ACS has requested a Scheduled Contact:

          *if {{param|SelfTimerCapable}} is {{true}} and the CPE chooses to go into Standby before the Scheduled Contact has been honored, it MUST use a Timer-Aware Standby;

          *if {{param|SelfTimerCapable}} is {{false}}, the CPE MUST NOT go into Standby before the Scheduled Contact has been honored.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ScheduledAwarenessRequested")
	@CWMPParameter(access = "readWrite")
	public Boolean scheduledAwarenessRequested;

	public StandbyPolicy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when waking up from a non CR-Aware Standby that lasted more than this parameter's value (in seconds), the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for having been non CR-aware.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getCrunawarenessMaxDuration() {
		return crunawarenessMaxDuration;
	}

	/**
	 * Set the when waking up from a non CR-Aware Standby that lasted more than this parameter's value (in seconds), the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for having been non CR-aware.
	 *
	 * @since 2.7
	 * @param crunawarenessMaxDuration the input value
	 */
	public void  setCrunawarenessMaxDuration(Integer crunawarenessMaxDuration) {
		this.crunawarenessMaxDuration = crunawarenessMaxDuration;
	}

	/**
	 * Set the when waking up from a non CR-Aware Standby that lasted more than this parameter's value (in seconds), the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for having been non CR-aware.
	 *
	 * @since 2.7
	 * @param crunawarenessMaxDuration the input value
	 * @return this instance
	 */
	public StandbyPolicy withCrunawarenessMaxDuration(Integer crunawarenessMaxDuration) {
		this.crunawarenessMaxDuration = crunawarenessMaxDuration;
		return this;
	}

	/**
	 * Get the when waking up from a non fully Timer-Aware Standby that made it miss more than this parameter's value Periodic Contacts, the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for exceeding that limit.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getMaxMissedPeriodic() {
		return maxMissedPeriodic;
	}

	/**
	 * Set the when waking up from a non fully Timer-Aware Standby that made it miss more than this parameter's value Periodic Contacts, the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for exceeding that limit.
	 *
	 * @since 2.7
	 * @param maxMissedPeriodic the input value
	 */
	public void  setMaxMissedPeriodic(Integer maxMissedPeriodic) {
		this.maxMissedPeriodic = maxMissedPeriodic;
	}

	/**
	 * Set the when waking up from a non fully Timer-Aware Standby that made it miss more than this parameter's value Periodic Contacts, the CPE MUST issue a WAKEUP Event.

          If the value is -1, the CPE MUST NOT ever issue WAKEUP Events for exceeding that limit.
	 *
	 * @since 2.7
	 * @param maxMissedPeriodic the input value
	 * @return this instance
	 */
	public StandbyPolicy withMaxMissedPeriodic(Integer maxMissedPeriodic) {
		this.maxMissedPeriodic = maxMissedPeriodic;
		return this;
	}

	/**
	 * Get the when waking up from a non fully Timer-Aware Standby that made it miss at least one Scheduled Contact, the CPE MUST issue a WAKEUP Event if this parameter is {{true}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isNotifyMissedScheduled() {
		return notifyMissedScheduled;
	}

	/**
	 * Set the when waking up from a non fully Timer-Aware Standby that made it miss at least one Scheduled Contact, the CPE MUST issue a WAKEUP Event if this parameter is {{true}}.
	 *
	 * @since 2.7
	 * @param notifyMissedScheduled the input value
	 */
	public void  setNotifyMissedScheduled(Boolean notifyMissedScheduled) {
		this.notifyMissedScheduled = notifyMissedScheduled;
	}

	/**
	 * Set the when waking up from a non fully Timer-Aware Standby that made it miss at least one Scheduled Contact, the CPE MUST issue a WAKEUP Event if this parameter is {{true}}.
	 *
	 * @since 2.7
	 * @param notifyMissedScheduled the input value
	 * @return this instance
	 */
	public StandbyPolicy withNotifyMissedScheduled(Boolean notifyMissedScheduled) {
		this.notifyMissedScheduled = notifyMissedScheduled;
		return this;
	}

	/**
	 * Get the indicates that the CPE is capable of CR-Aware Standby.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isNetworkAwarenessCapable() {
		return networkAwarenessCapable;
	}

	/**
	 * Set the indicates that the CPE is capable of CR-Aware Standby.
	 *
	 * @since 2.7
	 * @param networkAwarenessCapable the input value
	 */
	public void  setNetworkAwarenessCapable(Boolean networkAwarenessCapable) {
		this.networkAwarenessCapable = networkAwarenessCapable;
	}

	/**
	 * Set the indicates that the CPE is capable of CR-Aware Standby.
	 *
	 * @since 2.7
	 * @param networkAwarenessCapable the input value
	 * @return this instance
	 */
	public StandbyPolicy withNetworkAwarenessCapable(Boolean networkAwarenessCapable) {
		this.networkAwarenessCapable = networkAwarenessCapable;
		return this;
	}

	/**
	 * Get the indicates that the CPE is capable of Timer-Aware Standby.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isSelfTimerCapable() {
		return selfTimerCapable;
	}

	/**
	 * Set the indicates that the CPE is capable of Timer-Aware Standby.
	 *
	 * @since 2.7
	 * @param selfTimerCapable the input value
	 */
	public void  setSelfTimerCapable(Boolean selfTimerCapable) {
		this.selfTimerCapable = selfTimerCapable;
	}

	/**
	 * Set the indicates that the CPE is capable of Timer-Aware Standby.
	 *
	 * @since 2.7
	 * @param selfTimerCapable the input value
	 * @return this instance
	 */
	public StandbyPolicy withSelfTimerCapable(Boolean selfTimerCapable) {
		this.selfTimerCapable = selfTimerCapable;
		return this;
	}

	/**
	 * Get the if {{param|NetworkAwarenessCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a non CR-Aware Standby state.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isCrawarenessRequested() {
		return crawarenessRequested;
	}

	/**
	 * Set the if {{param|NetworkAwarenessCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a non CR-Aware Standby state.
	 *
	 * @since 2.7
	 * @param crawarenessRequested the input value
	 */
	public void  setCrawarenessRequested(Boolean crawarenessRequested) {
		this.crawarenessRequested = crawarenessRequested;
	}

	/**
	 * Set the if {{param|NetworkAwarenessCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a non CR-Aware Standby state.
	 *
	 * @since 2.7
	 * @param crawarenessRequested the input value
	 * @return this instance
	 */
	public StandbyPolicy withCrawarenessRequested(Boolean crawarenessRequested) {
		this.crawarenessRequested = crawarenessRequested;
		return this;
	}

	/**
	 * Get the if {{param|SelfTimerCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a standby state that prevents it from honoring Periodic Contacts.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isPeriodicAwarenessRequested() {
		return periodicAwarenessRequested;
	}

	/**
	 * Set the if {{param|SelfTimerCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a standby state that prevents it from honoring Periodic Contacts.
	 *
	 * @since 2.7
	 * @param periodicAwarenessRequested the input value
	 */
	public void  setPeriodicAwarenessRequested(Boolean periodicAwarenessRequested) {
		this.periodicAwarenessRequested = periodicAwarenessRequested;
	}

	/**
	 * Set the if {{param|SelfTimerCapable}} and this parameter are both {{true}}, the CPE MUST NOT go into a standby state that prevents it from honoring Periodic Contacts.
	 *
	 * @since 2.7
	 * @param periodicAwarenessRequested the input value
	 * @return this instance
	 */
	public StandbyPolicy withPeriodicAwarenessRequested(Boolean periodicAwarenessRequested) {
		this.periodicAwarenessRequested = periodicAwarenessRequested;
		return this;
	}

	/**
	 * Get the if this parameter is true, the CPE MUST NOT go into a standby state that prevents it from honoring Scheduled Contacts. This means that, whenever the ACS has requested a Scheduled Contact:

          *if {{param|SelfTimerCapable}} is {{true}} and the CPE chooses to go into Standby before the Scheduled Contact has been honored, it MUST use a Timer-Aware Standby;

          *if {{param|SelfTimerCapable}} is {{false}}, the CPE MUST NOT go into Standby before the Scheduled Contact has been honored.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isScheduledAwarenessRequested() {
		return scheduledAwarenessRequested;
	}

	/**
	 * Set the if this parameter is true, the CPE MUST NOT go into a standby state that prevents it from honoring Scheduled Contacts. This means that, whenever the ACS has requested a Scheduled Contact:

          *if {{param|SelfTimerCapable}} is {{true}} and the CPE chooses to go into Standby before the Scheduled Contact has been honored, it MUST use a Timer-Aware Standby;

          *if {{param|SelfTimerCapable}} is {{false}}, the CPE MUST NOT go into Standby before the Scheduled Contact has been honored.
	 *
	 * @since 2.7
	 * @param scheduledAwarenessRequested the input value
	 */
	public void  setScheduledAwarenessRequested(Boolean scheduledAwarenessRequested) {
		this.scheduledAwarenessRequested = scheduledAwarenessRequested;
	}

	/**
	 * Set the if this parameter is true, the CPE MUST NOT go into a standby state that prevents it from honoring Scheduled Contacts. This means that, whenever the ACS has requested a Scheduled Contact:

          *if {{param|SelfTimerCapable}} is {{true}} and the CPE chooses to go into Standby before the Scheduled Contact has been honored, it MUST use a Timer-Aware Standby;

          *if {{param|SelfTimerCapable}} is {{false}}, the CPE MUST NOT go into Standby before the Scheduled Contact has been honored.
	 *
	 * @since 2.7
	 * @param scheduledAwarenessRequested the input value
	 * @return this instance
	 */
	public StandbyPolicy withScheduledAwarenessRequested(Boolean scheduledAwarenessRequested) {
		this.scheduledAwarenessRequested = scheduledAwarenessRequested;
		return this;
	}

	//</editor-fold>

}