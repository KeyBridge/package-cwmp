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
package org.broadbandforum.tr196.fapservice.rem.cdma2000;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.hrpd.Cell;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.hrpd.Channel;

	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the HRPD system.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.HRPD.")
@XmlRootElement(name = "FAPService.REM.CDMA2000.HRPD")
@XmlType(name = "FAPService.REM.CDMA2000.HRPD")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPD {

	/**
	 * The maximum number of entries available in the {{object|.REM.CDMA2000.HRPD.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCellEntries")
	public Long maxCellEntries;
	/**
	 * The maximum number of entries in {{object|.REM.CDMA2000.HRPD.Channel.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxChannelEntries")
	public Long maxChannelEntries;
	/**
	 * REM specific configuration and reporting.
	 */
	@XmlElementWrapper(name = "Channels")
	@XmlElement(name = "Channel")
	@CWMPParameter(access = "readWrite")
	public Collection<Channel> channels;
	/**
	 * Table indicating the components of the discovered cells.
	 */
	@XmlElementWrapper(name = "Cells")
	@XmlElement(name = "Cell")
	public Collection<Cell> cells;

	public HRPD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries available in the {{object|.REM.CDMA2000.HRPD.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCellEntries() {
		return maxCellEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.CDMA2000.HRPD.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCellEntries the input value
	 */
	public void  setMaxCellEntries(Long maxCellEntries) {
		this.maxCellEntries = maxCellEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.CDMA2000.HRPD.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCellEntries the input value
	 * @return this instance
	 */
	public HRPD withMaxCellEntries(Long maxCellEntries) {
		this.maxCellEntries = maxCellEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in {{object|.REM.CDMA2000.HRPD.Channel.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxChannelEntries() {
		return maxChannelEntries;
	}

	/**
	 * Set the maximum number of entries in {{object|.REM.CDMA2000.HRPD.Channel.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxChannelEntries the input value
	 */
	public void  setMaxChannelEntries(Long maxChannelEntries) {
		this.maxChannelEntries = maxChannelEntries;
	}

	/**
	 * Set the maximum number of entries in {{object|.REM.CDMA2000.HRPD.Channel.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxChannelEntries the input value
	 * @return this instance
	 */
	public HRPD withMaxChannelEntries(Long maxChannelEntries) {
		this.maxChannelEntries = maxChannelEntries;
		return this;
	}

	/**
	 * Get the rem specific configuration and reporting.
	 *
	 * @return the value
	 */
	public Collection<Channel> getChannels() {
		if (this.channels == null){ this.channels=new ArrayList<>();}
		return channels;
	}

	/**
	 * Set the rem specific configuration and reporting.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * Set the rem specific configuration and reporting.
	 *
	 * @param channel the input value
	 * @return this instance
	 */
	public HRPD withChannel(Channel channel) {
		getChannels().add(channel);
		return this;
	}

	/**
	 * Get the table indicating the components of the discovered cells.
	 *
	 * @return the value
	 */
	public Collection<Cell> getCells() {
		if (this.cells == null){ this.cells=new ArrayList<>();}
		return cells;
	}

	/**
	 * Set the table indicating the components of the discovered cells.
	 *
	 * @param cells the input value
	 */
	public void  setCells(Collection<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * Set the table indicating the components of the discovered cells.
	 *
	 * @param cell the input value
	 * @return this instance
	 */
	public HRPD withCell(Cell cell) {
		getCells().add(cell);
		return this;
	}

	//</editor-fold>

}