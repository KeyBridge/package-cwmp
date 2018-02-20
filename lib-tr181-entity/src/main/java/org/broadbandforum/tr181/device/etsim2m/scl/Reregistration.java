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
package org.broadbandforum.tr181.device.etsim2m.scl;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.etsim2m.scl.reregistration.ActionStatus;

	/**
	 * This object represents the properties and status necessary for a SCL to reregister with one or more NSCLs.
	 *
	 * @since TR181 v2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.Reregistration.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.Reregistration")
@XmlType(name = "Device.ETSIM2M.SCL.Reregistration")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reregistration {

	/**
	 * {{list}} The list represents a priority ordered set of URIs {{bibref|RFC3986}}. The item that is first in the list has the highest priority.

          A list item is a URI {{bibref|RFC3986}} string that represents a NSCL that this {{object|##.SCL}} instance can use in order to attempt registration.

          When modified the contents of this parameter replace the {{param}} received during the bootstrap procedure.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RegTargetNSCLList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> regTargetNSCLList;
	/**
	 * {{list}} The list represents the string tokens used as keys when searching for this {{object|##.SCL}} instance.

          Sections 9.2.3.6.2 and 9.2.3.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describe the usage for this parameter.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RegSearchStrings")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> regSearchStrings;
	/**
	 * URI {{bibref|RFC3986}} that represents the identifier of the access right resource. The value of this parameter is maintained by the NSCL and used by the SCL as a default access right identifier for re-registration to NSCLs.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RegAccessRightID")
	@CWMPParameter(access = "readWrite")
	public String regAccessRightID;
	/**
	 * The duration, in seconds, that the SCL will use in its next re-registration attempt. Any negative value represents an infinite duration.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "RegExpirationDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Integer regExpirationDuration;
	/**
	 * {{command}} When set to {{true}}, triggers an immediate re-registration action where the SCL re-registers with the SCLs in the {{param|RegTargetNSCLList}} .
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Reregistration")
	@CWMPParameter(access = "readWrite")
	public Boolean reregistration;
	/**
	 * This object represents the status of the Reregistration action.
	 */
	@XmlElement(name = "ActionStatus")
	public ActionStatus actionStatus;

	public Reregistration() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} The list represents a priority ordered set of URIs {{bibref|RFC3986}}. The item that is first in the list has the highest priority.

          A list item is a URI {{bibref|RFC3986}} string that represents a NSCL that this {{object|##.SCL}} instance can use in order to attempt registration.

          When modified the contents of this parameter replace the {{param}} received during the bootstrap procedure.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getRegTargetNSCLList() {
		if (this.regTargetNSCLList == null){ this.regTargetNSCLList=new ArrayList<>();}
		return regTargetNSCLList;
	}

	/**
	 * Set the {{list}} The list represents a priority ordered set of URIs {{bibref|RFC3986}}. The item that is first in the list has the highest priority.

          A list item is a URI {{bibref|RFC3986}} string that represents a NSCL that this {{object|##.SCL}} instance can use in order to attempt registration.

          When modified the contents of this parameter replace the {{param}} received during the bootstrap procedure.
	 *
	 * @since 2.6
	 * @param regTargetNSCLList the input value
	 */
	public void  setRegTargetNSCLList(Collection<String> regTargetNSCLList) {
		this.regTargetNSCLList = regTargetNSCLList;
	}

	/**
	 * Set the {{list}} The list represents a priority ordered set of URIs {{bibref|RFC3986}}. The item that is first in the list has the highest priority.

          A list item is a URI {{bibref|RFC3986}} string that represents a NSCL that this {{object|##.SCL}} instance can use in order to attempt registration.

          When modified the contents of this parameter replace the {{param}} received during the bootstrap procedure.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public Reregistration withRegTargetNSCLList(String string) {
		getRegTargetNSCLList().add(string);
		return this;
	}

	/**
	 * Get the {{list}} The list represents the string tokens used as keys when searching for this {{object|##.SCL}} instance.

          Sections 9.2.3.6.2 and 9.2.3.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describe the usage for this parameter.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getRegSearchStrings() {
		if (this.regSearchStrings == null){ this.regSearchStrings=new ArrayList<>();}
		return regSearchStrings;
	}

	/**
	 * Set the {{list}} The list represents the string tokens used as keys when searching for this {{object|##.SCL}} instance.

          Sections 9.2.3.6.2 and 9.2.3.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describe the usage for this parameter.
	 *
	 * @since 2.6
	 * @param regSearchStrings the input value
	 */
	public void  setRegSearchStrings(Collection<String> regSearchStrings) {
		this.regSearchStrings = regSearchStrings;
	}

	/**
	 * Set the {{list}} The list represents the string tokens used as keys when searching for this {{object|##.SCL}} instance.

          Sections 9.2.3.6.2 and 9.2.3.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describe the usage for this parameter.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public Reregistration withRegSearchStrings(String string) {
		getRegSearchStrings().add(string);
		return this;
	}

	/**
	 * Get the uri {{bibref|RFC3986}} that represents the identifier of the access right resource. The value of this parameter is maintained by the NSCL and used by the SCL as a default access right identifier for re-registration to NSCLs.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getRegAccessRightID() {
		return regAccessRightID;
	}

	/**
	 * Set the uri {{bibref|RFC3986}} that represents the identifier of the access right resource. The value of this parameter is maintained by the NSCL and used by the SCL as a default access right identifier for re-registration to NSCLs.
	 *
	 * @since 2.6
	 * @param regAccessRightID the input value
	 */
	public void  setRegAccessRightID(String regAccessRightID) {
		this.regAccessRightID = regAccessRightID;
	}

	/**
	 * Set the uri {{bibref|RFC3986}} that represents the identifier of the access right resource. The value of this parameter is maintained by the NSCL and used by the SCL as a default access right identifier for re-registration to NSCLs.
	 *
	 * @since 2.6
	 * @param regAccessRightID the input value
	 * @return this instance
	 */
	public Reregistration withRegAccessRightID(String regAccessRightID) {
		this.regAccessRightID = regAccessRightID;
		return this;
	}

	/**
	 * Get the duration, in seconds, that the SCL will use in its next re-registration attempt. Any negative value represents an infinite duration.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getRegExpirationDuration() {
		return regExpirationDuration;
	}

	/**
	 * Set the duration, in seconds, that the SCL will use in its next re-registration attempt. Any negative value represents an infinite duration.
	 *
	 * @since 2.6
	 * @param regExpirationDuration the input value
	 */
	public void  setRegExpirationDuration(Integer regExpirationDuration) {
		this.regExpirationDuration = regExpirationDuration;
	}

	/**
	 * Set the duration, in seconds, that the SCL will use in its next re-registration attempt. Any negative value represents an infinite duration.
	 *
	 * @since 2.6
	 * @param regExpirationDuration the input value
	 * @return this instance
	 */
	public Reregistration withRegExpirationDuration(Integer regExpirationDuration) {
		this.regExpirationDuration = regExpirationDuration;
		return this;
	}

	/**
	 * Get the {{command}} When set to {{true}}, triggers an immediate re-registration action where the SCL re-registers with the SCLs in the {{param|RegTargetNSCLList}} .
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isReregistration() {
		return reregistration;
	}

	/**
	 * Set the {{command}} When set to {{true}}, triggers an immediate re-registration action where the SCL re-registers with the SCLs in the {{param|RegTargetNSCLList}} .
	 *
	 * @since 2.6
	 * @param reregistration the input value
	 */
	public void  setReregistration(Boolean reregistration) {
		this.reregistration = reregistration;
	}

	/**
	 * Set the {{command}} When set to {{true}}, triggers an immediate re-registration action where the SCL re-registers with the SCLs in the {{param|RegTargetNSCLList}} .
	 *
	 * @since 2.6
	 * @param reregistration the input value
	 * @return this instance
	 */
	public Reregistration withReregistration(Boolean reregistration) {
		this.reregistration = reregistration;
		return this;
	}

	/**
	 * Get the this object represents the status of the Reregistration action.
	 *
	 * @return the value
	 */
	public ActionStatus getActionStatus() {
		return actionStatus;
	}

	/**
	 * Set the this object represents the status of the Reregistration action.
	 *
	 * @param actionStatus the input value
	 */
	public void  setActionStatus(ActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}

	/**
	 * Set the this object represents the status of the Reregistration action.
	 *
	 * @param actionStatus the input value
	 * @return this instance
	 */
	public Reregistration withActionStatus(ActionStatus actionStatus) {
		this.actionStatus = actionStatus;
		return this;
	}

	//</editor-fold>

}