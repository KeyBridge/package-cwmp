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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to miscellaneous RRC timers and constants.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.RRCTimers.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.RRCTimers")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.RRCTimers")
@XmlAccessorType(XmlAccessType.FIELD)
public class RRCTimers {

	/**
	 * Timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T300")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 100, max = 8000)
	public Long t300 = 1000L;
	/**
	 * Timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T301")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 100, max = 8000)
	public Long t301 = 2000L;
	/**
	 * Timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T302")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 100, max = 8000)
	public Long t302 = 4000L;
	/**
	 * Timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T304")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 2000, max = 2000)
	public Long t304 = 2000L;
	/**
	 * Timer measured in minutes.

-1 indicates an unbounded timer in which there is no update.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T305")
	@CWMPParameter(access = "readWrite", units = "minutes")
	@Size(min = 720, max = 720)
	public Integer t305;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T307")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 50, max = 50)
	public Long t307 = 30L;
	/**
	 * Timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T308")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 320, max = 320)
	public Long t308 = 160L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T309")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 8)
	public Long t309 = 5L;
	/**
	 * Timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T310")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 320, max = 320)
	public Long t310 = 160L;
	/**
	 * Timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T311")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 2000, max = 2000)
	public Long t311 = 2000L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T312")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 15)
	public Long t312 = 1L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T313")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 15)
	public Long t313 = 3L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T314")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 20, max = 20)
	public Long t314 = 12L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T315")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1800, max = 1800)
	public Long t315 = 180L;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.

-1 indicates an unbounded timer in which there is no update.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T316")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 50, max = 50)
	public Integer t316;
	/**
	 * Timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T317")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1800, max = 1800)
	public Long t317;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N300")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long n300 = 3L;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N301")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long n301 = 2L;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N302")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long n302 = 3L;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N304")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long n304 = 2L;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N310")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long n310 = 4L;
	/**
	 * Counter.

Only the following values are considered valid:

1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N312")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1000)
	public Long n312 = 1L;
	/**
	 * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N313")
	@CWMPParameter(access = "readWrite")
	@Size(min = 200, max = 200)
	public Long n313 = 20L;
	/**
	 * Counter.

Only the following values are considered valid:

:1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N315")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1000)
	public Long n315 = 1L;
	/**
	 * Time period the UE has to wait before repeating the rejected procedure. This is an IE used when sending RRC connection reject, redirecting the requesting UE to another frequency.

0 indicates that repetition is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.3.50}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WaitTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 15)
	public Long waitTime;

	public RRCTimers() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT300() {
		return t300;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t300 the input value
	 */
	public void  setT300(Long t300) {
		this.t300 = t300;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t300 the input value
	 * @return this instance
	 */
	public RRCTimers withT300(Long t300) {
		this.t300 = t300;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT301() {
		return t301;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t301 the input value
	 */
	public void  setT301(Long t301) {
		this.t301 = t301;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t301 the input value
	 * @return this instance
	 */
	public RRCTimers withT301(Long t301) {
		this.t301 = t301;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT302() {
		return t302;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t302 the input value
	 */
	public void  setT302(Long t302) {
		this.t302 = t302;
	}

	/**
	 * Set the timer measured in milliseconds.

Only the following values are considered valid:

:100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, and 8000

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t302 the input value
	 * @return this instance
	 */
	public RRCTimers withT302(Long t302) {
		this.t302 = t302;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT304() {
		return t304;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t304 the input value
	 */
	public void  setT304(Long t304) {
		this.t304 = t304;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t304 the input value
	 * @return this instance
	 */
	public RRCTimers withT304(Long t304) {
		this.t304 = t304;
		return this;
	}

	/**
	 * Get the timer measured in minutes.

-1 indicates an unbounded timer in which there is no update.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getT305() {
		return t305;
	}

	/**
	 * Set the timer measured in minutes.

-1 indicates an unbounded timer in which there is no update.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t305 the input value
	 */
	public void  setT305(Integer t305) {
		this.t305 = t305;
	}

	/**
	 * Set the timer measured in minutes.

-1 indicates an unbounded timer in which there is no update.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t305 the input value
	 * @return this instance
	 */
	public RRCTimers withT305(Integer t305) {
		this.t305 = t305;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT307() {
		return t307;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t307 the input value
	 */
	public void  setT307(Long t307) {
		this.t307 = t307;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t307 the input value
	 * @return this instance
	 */
	public RRCTimers withT307(Long t307) {
		this.t307 = t307;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT308() {
		return t308;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t308 the input value
	 */
	public void  setT308(Long t308) {
		this.t308 = t308;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t308 the input value
	 * @return this instance
	 */
	public RRCTimers withT308(Long t308) {
		this.t308 = t308;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT309() {
		return t309;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t309 the input value
	 */
	public void  setT309(Long t309) {
		this.t309 = t309;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t309 the input value
	 * @return this instance
	 */
	public RRCTimers withT309(Long t309) {
		this.t309 = t309;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT310() {
		return t310;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t310 the input value
	 */
	public void  setT310(Long t310) {
		this.t310 = t310;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t310 the input value
	 * @return this instance
	 */
	public RRCTimers withT310(Long t310) {
		this.t310 = t310;
		return this;
	}

	/**
	 * Get the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT311() {
		return t311;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t311 the input value
	 */
	public void  setT311(Long t311) {
		this.t311 = t311;
	}

	/**
	 * Set the timer measured in milliseconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t311 the input value
	 * @return this instance
	 */
	public RRCTimers withT311(Long t311) {
		this.t311 = t311;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT312() {
		return t312;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t312 the input value
	 */
	public void  setT312(Long t312) {
		this.t312 = t312;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param t312 the input value
	 * @return this instance
	 */
	public RRCTimers withT312(Long t312) {
		this.t312 = t312;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT313() {
		return t313;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t313 the input value
	 */
	public void  setT313(Long t313) {
		this.t313 = t313;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t313 the input value
	 * @return this instance
	 */
	public RRCTimers withT313(Long t313) {
		this.t313 = t313;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT314() {
		return t314;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t314 the input value
	 */
	public void  setT314(Long t314) {
		this.t314 = t314;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t314 the input value
	 * @return this instance
	 */
	public RRCTimers withT314(Long t314) {
		this.t314 = t314;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT315() {
		return t315;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t315 the input value
	 */
	public void  setT315(Long t315) {
		this.t315 = t315;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t315 the input value
	 * @return this instance
	 */
	public RRCTimers withT315(Long t315) {
		this.t315 = t315;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.

-1 indicates an unbounded timer in which there is no update.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getT316() {
		return t316;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.

-1 indicates an unbounded timer in which there is no update.
	 *
	 * @since 2.0
	 * @param t316 the input value
	 */
	public void  setT316(Integer t316) {
		this.t316 = t316;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.

-1 indicates an unbounded timer in which there is no update.
	 *
	 * @since 2.0
	 * @param t316 the input value
	 * @return this instance
	 */
	public RRCTimers withT316(Integer t316) {
		this.t316 = t316;
		return this;
	}

	/**
	 * Get the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT317() {
		return t317;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t317 the input value
	 */
	public void  setT317(Long t317) {
		this.t317 = t317;
	}

	/**
	 * Set the timer measured in seconds. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param t317 the input value
	 * @return this instance
	 */
	public RRCTimers withT317(Long t317) {
		this.t317 = t317;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN300() {
		return n300;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param n300 the input value
	 */
	public void  setN300(Long n300) {
		this.n300 = n300;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param n300 the input value
	 * @return this instance
	 */
	public RRCTimers withN300(Long n300) {
		this.n300 = n300;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN301() {
		return n301;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n301 the input value
	 */
	public void  setN301(Long n301) {
		this.n301 = n301;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n301 the input value
	 * @return this instance
	 */
	public RRCTimers withN301(Long n301) {
		this.n301 = n301;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN302() {
		return n302;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n302 the input value
	 */
	public void  setN302(Long n302) {
		this.n302 = n302;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n302 the input value
	 * @return this instance
	 */
	public RRCTimers withN302(Long n302) {
		this.n302 = n302;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN304() {
		return n304;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n304 the input value
	 */
	public void  setN304(Long n304) {
		this.n304 = n304;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n304 the input value
	 * @return this instance
	 */
	public RRCTimers withN304(Long n304) {
		this.n304 = n304;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN310() {
		return n310;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n310 the input value
	 */
	public void  setN310(Long n310) {
		this.n310 = n310;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n310 the input value
	 * @return this instance
	 */
	public RRCTimers withN310(Long n310) {
		this.n310 = n310;
		return this;
	}

	/**
	 * Get the counter.

Only the following values are considered valid:

1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN312() {
		return n312;
	}

	/**
	 * Set the counter.

Only the following values are considered valid:

1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param n312 the input value
	 */
	public void  setN312(Long n312) {
		this.n312 = n312;
	}

	/**
	 * Set the counter.

Only the following values are considered valid:

1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
	 *
	 * @since 2.0
	 * @param n312 the input value
	 * @return this instance
	 */
	public RRCTimers withN312(Long n312) {
		this.n312 = n312;
		return this;
	}

	/**
	 * Get the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN313() {
		return n313;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n313 the input value
	 */
	public void  setN313(Long n313) {
		this.n313 = n313;
	}

	/**
	 * Set the counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n313 the input value
	 * @return this instance
	 */
	public RRCTimers withN313(Long n313) {
		this.n313 = n313;
		return this;
	}

	/**
	 * Get the counter.

Only the following values are considered valid:

:1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN315() {
		return n315;
	}

	/**
	 * Set the counter.

Only the following values are considered valid:

:1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n315 the input value
	 */
	public void  setN315(Long n315) {
		this.n315 = n315;
	}

	/**
	 * Set the counter.

Only the following values are considered valid:

:1, 2, 4, 10, 20, 50, 100, 200, 400, 600, 800, and 1000.

Any value other than those and the CPE MUST reject the request.

Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.43}}.
	 *
	 * @since 2.0
	 * @param n315 the input value
	 * @return this instance
	 */
	public RRCTimers withN315(Long n315) {
		this.n315 = n315;
		return this;
	}

	/**
	 * Get the time period the UE has to wait before repeating the rejected procedure. This is an IE used when sending RRC connection reject, redirecting the requesting UE to another frequency.

0 indicates that repetition is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.3.50}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWaitTime() {
		return waitTime;
	}

	/**
	 * Set the time period the UE has to wait before repeating the rejected procedure. This is an IE used when sending RRC connection reject, redirecting the requesting UE to another frequency.

0 indicates that repetition is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.3.50}}.
	 *
	 * @since 2.0
	 * @param waitTime the input value
	 */
	public void  setWaitTime(Long waitTime) {
		this.waitTime = waitTime;
	}

	/**
	 * Set the time period the UE has to wait before repeating the rejected procedure. This is an IE used when sending RRC connection reject, redirecting the requesting UE to another frequency.

0 indicates that repetition is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.3.50}}.
	 *
	 * @since 2.0
	 * @param waitTime the input value
	 * @return this instance
	 */
	public RRCTimers withWaitTime(Long waitTime) {
		this.waitTime = waitTime;
		return this;
	}

	//</editor-fold>

}