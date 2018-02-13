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
package org.broadbandforum.tr181.device.dsl.line.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains DSL line statistics accumulated since the second most recent DSL Showtime. See {{bibref|G.997.1|Chapter 7.2.6}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Line.{i}.Stats.LastShowtime.")
@XmlRootElement(name = "LastShowtime")
@XmlType(name = "Device.DSL.Line.Stats.LastShowtime")
@XmlAccessorType(XmlAccessType.FIELD)
public class LastShowtime {

	/**
	 * Number of errored seconds since the second most recent DSL Showtime (ES-L as defined in ITU-T Rec. {{bibref|G.997.1}}).

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErroredSecs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long erroredSecs;
	/**
	 * Number of severely errored seconds since the second most recent DSL Showtime (SES-L as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SeverelyErroredSecs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long severelyErroredSecs;

	public LastShowtime() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of errored seconds since the second most recent DSL Showtime (ES-L as defined in ITU-T Rec. {{bibref|G.997.1}}).

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErroredSecs() {
		return erroredSecs;
	}

	/**
	 * Set the number of errored seconds since the second most recent DSL Showtime (ES-L as defined in ITU-T Rec. {{bibref|G.997.1}}).

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param erroredSecs the input value
	 */
	public void  setErroredSecs(Long erroredSecs) {
		this.erroredSecs = erroredSecs;
	}

	/**
	 * Set the number of errored seconds since the second most recent DSL Showtime (ES-L as defined in ITU-T Rec. {{bibref|G.997.1}}).

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param erroredSecs the input value
	 * @return this instance
	 */
	public LastShowtime withErroredSecs(Long erroredSecs) {
		this.erroredSecs = erroredSecs;
		return this;
	}

	/**
	 * Get the number of severely errored seconds since the second most recent DSL Showtime (SES-L as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSeverelyErroredSecs() {
		return severelyErroredSecs;
	}

	/**
	 * Set the number of severely errored seconds since the second most recent DSL Showtime (SES-L as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param severelyErroredSecs the input value
	 */
	public void  setSeverelyErroredSecs(Long severelyErroredSecs) {
		this.severelyErroredSecs = severelyErroredSecs;
	}

	/**
	 * Set the number of severely errored seconds since the second most recent DSL Showtime (SES-L as defined in ITU-T Rec.  {{bibref|G.997.1}}). 

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be 4294967295 (the maximum for its data type).
	 *
	 * @since 2.0
	 * @param severelyErroredSecs the input value
	 * @return this instance
	 */
	public LastShowtime withSeverelyErroredSecs(Long severelyErroredSecs) {
		this.severelyErroredSecs = severelyErroredSecs;
		return this;
	}

	//</editor-fold>

}