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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the S1-U configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.S1U.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.S1U")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.S1U")
@XmlAccessorType(XmlAccessType.FIELD)
public class S1U {

	/**
	 * Defines the interval in seconds between each GTP-U Echo Request that LTE FAP sends to the GTP-U peer, as specified in {{bibref|3GPP-TS.29.281|Section 7.2.1}}. If the value of {{param}} is equal to 0, then this functionality is supressed and thus LTE FAP does not send GTP-U Echo Request. If there is no GTP-U path in use, then no Echo Request is sent regardless of the value of {{param}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GTPUEchoInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 60)
	public Long gtpUEchoInterval;

	public S1U() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the interval in seconds between each GTP-U Echo Request that LTE FAP sends to the GTP-U peer, as specified in {{bibref|3GPP-TS.29.281|Section 7.2.1}}. If the value of {{param}} is equal to 0, then this functionality is supressed and thus LTE FAP does not send GTP-U Echo Request. If there is no GTP-U path in use, then no Echo Request is sent regardless of the value of {{param}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGtpUEchoInterval() {
		return gtpUEchoInterval;
	}

	/**
	 * Set the defines the interval in seconds between each GTP-U Echo Request that LTE FAP sends to the GTP-U peer, as specified in {{bibref|3GPP-TS.29.281|Section 7.2.1}}. If the value of {{param}} is equal to 0, then this functionality is supressed and thus LTE FAP does not send GTP-U Echo Request. If there is no GTP-U path in use, then no Echo Request is sent regardless of the value of {{param}}.
	 *
	 * @since 2.0
	 * @param gtpUEchoInterval the input value
	 */
	public void  setGtpUEchoInterval(Long gtpUEchoInterval) {
		this.gtpUEchoInterval = gtpUEchoInterval;
	}

	/**
	 * Set the defines the interval in seconds between each GTP-U Echo Request that LTE FAP sends to the GTP-U peer, as specified in {{bibref|3GPP-TS.29.281|Section 7.2.1}}. If the value of {{param}} is equal to 0, then this functionality is supressed and thus LTE FAP does not send GTP-U Echo Request. If there is no GTP-U path in use, then no Echo Request is sent regardless of the value of {{param}}.
	 *
	 * @since 2.0
	 * @param gtpUEchoInterval the input value
	 * @return this instance
	 */
	public S1U withGtpUEchoInterval(Long gtpUEchoInterval) {
		this.gtpUEchoInterval = gtpUEchoInterval;
		return this;
	}

	//</editor-fold>

}