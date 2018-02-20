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
package org.broadbandforum.tr181.device.atm.link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The ATM Link QoS object.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.ATM.Link.{i}.QoS.")
@XmlRootElement(name = "Device.ATM.Link.QoS")
@XmlType(name = "Device.ATM.Link.QoS")
@XmlAccessorType(XmlAccessType.FIELD)
public class QoS {

	/**
	 * Describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QoSClass")
	@CWMPParameter(access = "readWrite")
	public String qosClass;
	/**
	 * Specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PeakCellRate")
	@CWMPParameter(access = "readWrite", units = "cells per second")
	public Long peakCellRate;
	/**
	 * Specifies the upstream maximum burst size in cells.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaximumBurstSize")
	@CWMPParameter(access = "readWrite", units = "cells")
	public Long maximumBurstSize;
	/**
	 * Specifies the upstream sustainable cell rate, in cells per second.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SustainableCellRate")
	@CWMPParameter(access = "readWrite", units = "cells per second")
	public Long sustainableCellRate;

	public QoS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getQosClass() {
		return qosClass;
	}

	/**
	 * Set the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 2.0
	 * @param qosClass the input value
	 */
	public void  setQosClass(String qosClass) {
		this.qosClass = qosClass;
	}

	/**
	 * Set the describes the ATM Quality Of Service (QoS) being used on the VC.
	 *
	 * @since 2.0
	 * @param qosClass the input value
	 * @return this instance
	 */
	public QoS withQosClass(String qosClass) {
		this.qosClass = qosClass;
		return this;
	}

	/**
	 * Get the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPeakCellRate() {
		return peakCellRate;
	}

	/**
	 * Set the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 2.0
	 * @param peakCellRate the input value
	 */
	public void  setPeakCellRate(Long peakCellRate) {
		this.peakCellRate = peakCellRate;
	}

	/**
	 * Set the specifies the upstream peak cell rate in cells per second.
	 *
	 * @since 2.0
	 * @param peakCellRate the input value
	 * @return this instance
	 */
	public QoS withPeakCellRate(Long peakCellRate) {
		this.peakCellRate = peakCellRate;
		return this;
	}

	/**
	 * Get the specifies the upstream maximum burst size in cells.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaximumBurstSize() {
		return maximumBurstSize;
	}

	/**
	 * Set the specifies the upstream maximum burst size in cells.
	 *
	 * @since 2.0
	 * @param maximumBurstSize the input value
	 */
	public void  setMaximumBurstSize(Long maximumBurstSize) {
		this.maximumBurstSize = maximumBurstSize;
	}

	/**
	 * Set the specifies the upstream maximum burst size in cells.
	 *
	 * @since 2.0
	 * @param maximumBurstSize the input value
	 * @return this instance
	 */
	public QoS withMaximumBurstSize(Long maximumBurstSize) {
		this.maximumBurstSize = maximumBurstSize;
		return this;
	}

	/**
	 * Get the specifies the upstream sustainable cell rate, in cells per second.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSustainableCellRate() {
		return sustainableCellRate;
	}

	/**
	 * Set the specifies the upstream sustainable cell rate, in cells per second.
	 *
	 * @since 2.0
	 * @param sustainableCellRate the input value
	 */
	public void  setSustainableCellRate(Long sustainableCellRate) {
		this.sustainableCellRate = sustainableCellRate;
	}

	/**
	 * Set the specifies the upstream sustainable cell rate, in cells per second.
	 *
	 * @since 2.0
	 * @param sustainableCellRate the input value
	 * @return this instance
	 */
	public QoS withSustainableCellRate(Long sustainableCellRate) {
		this.sustainableCellRate = sustainableCellRate;
		return this;
	}

	//</editor-fold>

}