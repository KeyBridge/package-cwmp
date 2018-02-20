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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.InterRATCell;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.LTECell;

	/**
	 * This object contains parameters relating to the neighbor list used by the FAP based on its self-configuration capability and {{object|.CellConfig.LTE.RAN.NeighborList.}} configuration of adding and excluding cells.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse")
@XmlAccessorType(XmlAccessType.FIELD)
public class NeighborListInUse {

	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxLTECellEntries")
	public Long maxLTECellEntries;
	/**
	 * Table containing the LTE EUTRA (i.e. intra-RAT) cell list.
	 */
	@XmlElementWrapper(name = "LTECells")
	@XmlElement(name = "LTECell")
	public Collection<LTECell> lteCells;
	/**
	 * Table containing the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
	 */
	@XmlElement(name = "InterRATCell")
	public InterRATCell interRATCell;

	public NeighborListInUse() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxLTECellEntries() {
		return maxLTECellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxLTECellEntries the input value
	 */
	public void  setMaxLTECellEntries(Long maxLTECellEntries) {
		this.maxLTECellEntries = maxLTECellEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxLTECellEntries the input value
	 * @return this instance
	 */
	public NeighborListInUse withMaxLTECellEntries(Long maxLTECellEntries) {
		this.maxLTECellEntries = maxLTECellEntries;
		return this;
	}

	/**
	 * Get the table containing the LTE EUTRA (i.e. intra-RAT) cell list.
	 *
	 * @return the value
	 */
	public Collection<LTECell> getLteCells() {
		if (this.lteCells == null){ this.lteCells=new ArrayList<>();}
		return lteCells;
	}

	/**
	 * Set the table containing the LTE EUTRA (i.e. intra-RAT) cell list.
	 *
	 * @param lteCells the input value
	 */
	public void  setLteCells(Collection<LTECell> lteCells) {
		this.lteCells = lteCells;
	}

	/**
	 * Set the table containing the LTE EUTRA (i.e. intra-RAT) cell list.
	 *
	 * @param lteCell the input value
	 * @return this instance
	 */
	public NeighborListInUse withLTECell(LTECell lteCell) {
		getLteCells().add(lteCell);
		return this;
	}

	/**
	 * Get the table containing the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
	 *
	 * @return the value
	 */
	public InterRATCell getInterRATCell() {
		return interRATCell;
	}

	/**
	 * Set the table containing the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
	 *
	 * @param interRATCell the input value
	 */
	public void  setInterRATCell(InterRATCell interRATCell) {
		this.interRATCell = interRATCell;
	}

	/**
	 * Set the table containing the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
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