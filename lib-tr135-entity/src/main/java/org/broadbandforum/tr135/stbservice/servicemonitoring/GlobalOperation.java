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
package org.broadbandforum.tr135.stbservice.servicemonitoring;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.servicemonitoring.globaloperation.Sample;
import org.broadbandforum.tr135.stbservice.servicemonitoring.globaloperation.Total;

	/**
	 * Global operations statistics.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.GlobalOperation.")
public class GlobalOperation {

	/**
	 * Global operations total statistics.
	 */
	@XmlElement(name = "Total")
	public Total total;
	/**
	 * Global operations sample statistics.
	 */
	@XmlElement(name = "Sample")
	public Sample sample;

	public GlobalOperation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the global operations total statistics.
	 *
	 * @return the value
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Set the global operations total statistics.
	 *
	 * @param total the input value
	 */
	public void  setTotal(Total total) {
		this.total = total;
	}

	/**
	 * Set the global operations total statistics.
	 *
	 * @param total the input value
	 * @return this instance
	 */
	public GlobalOperation withTotal(Total total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the global operations sample statistics.
	 *
	 * @return the value
	 */
	public Sample getSample() {
		return sample;
	}

	/**
	 * Set the global operations sample statistics.
	 *
	 * @param sample the input value
	 */
	public void  setSample(Sample sample) {
		this.sample = sample;
	}

	/**
	 * Set the global operations sample statistics.
	 *
	 * @param sample the input value
	 * @return this instance
	 */
	public GlobalOperation withSample(Sample sample) {
		this.sample = sample;
		return this;
	}

	//</editor-fold>

}