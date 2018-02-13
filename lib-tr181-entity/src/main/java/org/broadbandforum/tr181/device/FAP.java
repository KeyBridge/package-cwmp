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
package org.broadbandforum.tr181.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.fap.ApplicationPlatform;
import org.broadbandforum.tr181.device.fap.GPS;
import org.broadbandforum.tr181.device.fap.PerfMgmt;

	/**
	 * This object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.")
@XmlRootElement(name = "Device.FAP")
@XmlType(name = "Device.FAP")
@XmlAccessorType(XmlAccessType.FIELD)
public class FAP {

	/**
	 * This object contains the parameters relating to the GPS scan.
	 */
	@XmlElement(name = "GPS")
	public GPS gps;
	/**
	 * This object contains parameters relating to Performance Management in a Femto-related environment.
	 */
	@XmlElement(name = "PerfMgmt")
	public PerfMgmt perfMgmt;
	/**
	 * This object defines the data model for the following Femtozone APIs.

        * Femto Awareness

        * SMS

        * MMS

        * Terminal Location

        Femto Awareness, SMS, MMS, and Terminal Location APIs are defined in the Release 1 API Specifications of the Service SIG in the Femto Forum (non public document).

        {{bibref|TR-262|appendix I}} provides the "Theory of Operation" for the usage of this object.
	 */
	@XmlElement(name = "ApplicationPlatform")
	public ApplicationPlatform applicationPlatform;

	public FAP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains the parameters relating to the GPS scan.
	 *
	 * @return the value
	 */
	public GPS getGps() {
		return gps;
	}

	/**
	 * Set the this object contains the parameters relating to the GPS scan.
	 *
	 * @param gps the input value
	 */
	public void  setGps(GPS gps) {
		this.gps = gps;
	}

	/**
	 * Set the this object contains the parameters relating to the GPS scan.
	 *
	 * @param gps the input value
	 * @return this instance
	 */
	public FAP withGps(GPS gps) {
		this.gps = gps;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Performance Management in a Femto-related environment.
	 *
	 * @return the value
	 */
	public PerfMgmt getPerfMgmt() {
		return perfMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Performance Management in a Femto-related environment.
	 *
	 * @param perfMgmt the input value
	 */
	public void  setPerfMgmt(PerfMgmt perfMgmt) {
		this.perfMgmt = perfMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Performance Management in a Femto-related environment.
	 *
	 * @param perfMgmt the input value
	 * @return this instance
	 */
	public FAP withPerfMgmt(PerfMgmt perfMgmt) {
		this.perfMgmt = perfMgmt;
		return this;
	}

	/**
	 * Get the this object defines the data model for the following Femtozone APIs.

        * Femto Awareness

        * SMS

        * MMS

        * Terminal Location

        Femto Awareness, SMS, MMS, and Terminal Location APIs are defined in the Release 1 API Specifications of the Service SIG in the Femto Forum (non public document).

        {{bibref|TR-262|appendix I}} provides the "Theory of Operation" for the usage of this object.
	 *
	 * @return the value
	 */
	public ApplicationPlatform getApplicationPlatform() {
		return applicationPlatform;
	}

	/**
	 * Set the this object defines the data model for the following Femtozone APIs.

        * Femto Awareness

        * SMS

        * MMS

        * Terminal Location

        Femto Awareness, SMS, MMS, and Terminal Location APIs are defined in the Release 1 API Specifications of the Service SIG in the Femto Forum (non public document).

        {{bibref|TR-262|appendix I}} provides the "Theory of Operation" for the usage of this object.
	 *
	 * @param applicationPlatform the input value
	 */
	public void  setApplicationPlatform(ApplicationPlatform applicationPlatform) {
		this.applicationPlatform = applicationPlatform;
	}

	/**
	 * Set the this object defines the data model for the following Femtozone APIs.

        * Femto Awareness

        * SMS

        * MMS

        * Terminal Location

        Femto Awareness, SMS, MMS, and Terminal Location APIs are defined in the Release 1 API Specifications of the Service SIG in the Femto Forum (non public document).

        {{bibref|TR-262|appendix I}} provides the "Theory of Operation" for the usage of this object.
	 *
	 * @param applicationPlatform the input value
	 * @return this instance
	 */
	public FAP withApplicationPlatform(ApplicationPlatform applicationPlatform) {
		this.applicationPlatform = applicationPlatform;
		return this;
	}

	//</editor-fold>

}