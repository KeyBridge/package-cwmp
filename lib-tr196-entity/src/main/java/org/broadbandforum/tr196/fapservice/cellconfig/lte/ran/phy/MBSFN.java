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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.mbsfn.SFConfigList;

	/**
	 * This object contains parameters relating to the MBSFN (Multimedia Broadcast multicast service Single Frequency Network) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.")
public class MBSFN {

	/**
	 * Defines the information related to MBSFN and TDD UL/DL configuration of neighbour cells. Corresponds to NeighCellConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.

Value 0: Not all neighbour cells have the same MBSFN sub-frame allocation as serving cell.

Value 1: No MBSFN sub-frames are present in all neighbour cells.

Value 2: The MBSFN sub-frame allocations of all neighbour cells are identical to or subsets of that in the serving cell.

Value 3: Different UL/DL allocation in neighbouring cells for TDD compared to the serving cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighCellConfig")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long neighCellConfig;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSFConfigListEntries")
	public Long maxSFConfigListEntries;
	/**
	 * This object contains parameters relating to the sub-frame that are reserved for MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in downlink direction.  For FDD mode, only one entry can exist in this table. For TDD mode, at most one entry can exist with a given value of stratumID (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 */
	@XmlElementWrapper(name = "sfconfigLists")
	@XmlElement(name = "SFConfigList")
	@CWMPParameter(access = "readWrite")
	public Collection<SFConfigList> sfconfigLists;

	public MBSFN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the information related to MBSFN and TDD UL/DL configuration of neighbour cells. Corresponds to NeighCellConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.

Value 0: Not all neighbour cells have the same MBSFN sub-frame allocation as serving cell.

Value 1: No MBSFN sub-frames are present in all neighbour cells.

Value 2: The MBSFN sub-frame allocations of all neighbour cells are identical to or subsets of that in the serving cell.

Value 3: Different UL/DL allocation in neighbouring cells for TDD compared to the serving cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNeighCellConfig() {
		return neighCellConfig;
	}

	/**
	 * Set the defines the information related to MBSFN and TDD UL/DL configuration of neighbour cells. Corresponds to NeighCellConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.

Value 0: Not all neighbour cells have the same MBSFN sub-frame allocation as serving cell.

Value 1: No MBSFN sub-frames are present in all neighbour cells.

Value 2: The MBSFN sub-frame allocations of all neighbour cells are identical to or subsets of that in the serving cell.

Value 3: Different UL/DL allocation in neighbouring cells for TDD compared to the serving cell.
	 *
	 * @since 2.0
	 * @param neighCellConfig the input value
	 */
	public void  setNeighCellConfig(Long neighCellConfig) {
		this.neighCellConfig = neighCellConfig;
	}

	/**
	 * Set the defines the information related to MBSFN and TDD UL/DL configuration of neighbour cells. Corresponds to NeighCellConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.

Value 0: Not all neighbour cells have the same MBSFN sub-frame allocation as serving cell.

Value 1: No MBSFN sub-frames are present in all neighbour cells.

Value 2: The MBSFN sub-frame allocations of all neighbour cells are identical to or subsets of that in the serving cell.

Value 3: Different UL/DL allocation in neighbouring cells for TDD compared to the serving cell.
	 *
	 * @since 2.0
	 * @param neighCellConfig the input value
	 * @return this instance
	 */
	public MBSFN withNeighCellConfig(Long neighCellConfig) {
		this.neighCellConfig = neighCellConfig;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSFConfigListEntries() {
		return maxSFConfigListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxSFConfigListEntries the input value
	 */
	public void  setMaxSFConfigListEntries(Long maxSFConfigListEntries) {
		this.maxSFConfigListEntries = maxSFConfigListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxSFConfigListEntries the input value
	 * @return this instance
	 */
	public MBSFN withMaxSFConfigListEntries(Long maxSFConfigListEntries) {
		this.maxSFConfigListEntries = maxSFConfigListEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the sub-frame that are reserved for MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in downlink direction.  For FDD mode, only one entry can exist in this table. For TDD mode, at most one entry can exist with a given value of stratumID (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @return the value
	 */
	public Collection<SFConfigList> getSfconfigLists() {
		if (this.sfconfigLists == null){ this.sfconfigLists=new ArrayList<>();}
		return sfconfigLists;
	}

	/**
	 * Set the this object contains parameters relating to the sub-frame that are reserved for MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in downlink direction.  For FDD mode, only one entry can exist in this table. For TDD mode, at most one entry can exist with a given value of stratumID (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @param sfconfigLists the input value
	 */
	public void  setSfconfigLists(Collection<SFConfigList> sfconfigLists) {
		this.sfconfigLists = sfconfigLists;
	}

	/**
	 * Set the this object contains parameters relating to the sub-frame that are reserved for MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in downlink direction.  For FDD mode, only one entry can exist in this table. For TDD mode, at most one entry can exist with a given value of stratumID (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @param sfconfigList the input value
	 * @return this instance
	 */
	public MBSFN withSFConfigList(SFConfigList sfconfigList) {
		getSfconfigLists().add(sfconfigList);
		return this;
	}

	//</editor-fold>

}