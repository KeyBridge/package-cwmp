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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlistinuse.InterFreqCell;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlistinuse.InterRATCell;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlistinuse.IntraFreqCell;

	/**
	 * This object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.UMTS.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.")
public class NeighborListInUse {

	/**
	 * The maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxIntraFreqCellEntries")
	public Long maxIntraFreqCellEntries;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxInterFreqCellEntries")
	public Long maxInterFreqCellEntries;
	/**
	 * Table containing the intra-frequency cell list.
	 */
	@XmlElementWrapper(name = "intraFreqCells")
	@XmlElement(name = "IntraFreqCell")
	public Collection<IntraFreqCell> intraFreqCells;
	/**
	 * Table containing the inter-frequency cell list.
	 */
	@XmlElementWrapper(name = "interFreqCells")
	@XmlElement(name = "InterFreqCell")
	public Collection<InterFreqCell> interFreqCells;
	/**
	 * The inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
	 */
	@XmlElement(name = "InterRATCell")
	public InterRATCell interRATCell;

	public NeighborListInUse() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxIntraFreqCellEntries() {
		return maxIntraFreqCellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxIntraFreqCellEntries the input value
	 */
	public void  setMaxIntraFreqCellEntries(Long maxIntraFreqCellEntries) {
		this.maxIntraFreqCellEntries = maxIntraFreqCellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxIntraFreqCellEntries the input value
	 * @return this instance
	 */
	public NeighborListInUse withMaxIntraFreqCellEntries(Long maxIntraFreqCellEntries) {
		this.maxIntraFreqCellEntries = maxIntraFreqCellEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxInterFreqCellEntries() {
		return maxInterFreqCellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxInterFreqCellEntries the input value
	 */
	public void  setMaxInterFreqCellEntries(Long maxInterFreqCellEntries) {
		this.maxInterFreqCellEntries = maxInterFreqCellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxInterFreqCellEntries the input value
	 * @return this instance
	 */
	public NeighborListInUse withMaxInterFreqCellEntries(Long maxInterFreqCellEntries) {
		this.maxInterFreqCellEntries = maxInterFreqCellEntries;
		return this;
	}

	/**
	 * Get the table containing the intra-frequency cell list.
	 *
	 * @return the value
	 */
	public Collection<IntraFreqCell> getIntraFreqCells() {
		if (this.intraFreqCells == null){ this.intraFreqCells=new ArrayList<>();}
		return intraFreqCells;
	}

	/**
	 * Set the table containing the intra-frequency cell list.
	 *
	 * @param intraFreqCells the input value
	 */
	public void  setIntraFreqCells(Collection<IntraFreqCell> intraFreqCells) {
		this.intraFreqCells = intraFreqCells;
	}

	/**
	 * Set the table containing the intra-frequency cell list.
	 *
	 * @param intraFreqCell the input value
	 * @return this instance
	 */
	public NeighborListInUse withIntraFreqCell(IntraFreqCell intraFreqCell) {
		getIntraFreqCells().add(intraFreqCell);
		return this;
	}

	/**
	 * Get the table containing the inter-frequency cell list.
	 *
	 * @return the value
	 */
	public Collection<InterFreqCell> getInterFreqCells() {
		if (this.interFreqCells == null){ this.interFreqCells=new ArrayList<>();}
		return interFreqCells;
	}

	/**
	 * Set the table containing the inter-frequency cell list.
	 *
	 * @param interFreqCells the input value
	 */
	public void  setInterFreqCells(Collection<InterFreqCell> interFreqCells) {
		this.interFreqCells = interFreqCells;
	}

	/**
	 * Set the table containing the inter-frequency cell list.
	 *
	 * @param interFreqCell the input value
	 * @return this instance
	 */
	public NeighborListInUse withInterFreqCell(InterFreqCell interFreqCell) {
		getInterFreqCells().add(interFreqCell);
		return this;
	}

	/**
	 * Get the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
	 *
	 * @return the value
	 */
	public InterRATCell getInterRATCell() {
		return interRATCell;
	}

	/**
	 * Set the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
	 *
	 * @param interRATCell the input value
	 */
	public void  setInterRATCell(InterRATCell interRATCell) {
		this.interRATCell = interRATCell;
	}

	/**
	 * Set the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
	 *
	 * @param interRATCell the input value
	 * @return this instance
	 */
	public NeighborListInUse withInterRATCell(InterRATCell interRATCell) {
		this.interRATCell = interRATCell;
		return this;
	}

	//</editor-fold>

}