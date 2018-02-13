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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.BlockPeriod;
import org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.RequestCategory;

	/**
	 * This table contains the SAF-handling policies which are controlled by the Access Network Provider(s).

        {{keys}}
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.ANPPolicy.{i}.")
@XmlRootElement(name = "ANPPolicy")
@XmlType(name = "Device.ETSIM2M.SCL.SAFPolicySet.ANPPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
public class ANPPolicy {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * This parameter is the name of the access network provider and used to determine for which access network the policies defined in the {{object|#.ANPPolicy}} table will apply.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ANName")
	@CWMPParameter(access = "readWrite")
	public String anname;
	/**
	 * This table contains a list of block periods for a {{object|##.ANPPolicy}}.

        A block period defines how long the device will wait before re-trying to establish connectivity via the access network after the previous attempt has failed.
	 */
	@XmlElementWrapper(name = "BlockPeriods")
	@XmlElement(name = "BlockPeriod")
	@CWMPParameter(access = "readWrite")
	public Collection<BlockPeriod> blockPeriods;
	/**
	 * This table contains the Request Category (RCAT) policy items for defining when it is appropriate to use the access network for processing requests.
	 */
	@XmlElementWrapper(name = "RequestCategories")
	@XmlElement(name = "RequestCategory")
	@CWMPParameter(access = "readWrite")
	public Collection<RequestCategory> requestCategories;

	public ANPPolicy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public ANPPolicy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public ANPPolicy withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this parameter is the name of the access network provider and used to determine for which access network the policies defined in the {{object|#.ANPPolicy}} table will apply.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getAnname() {
		return anname;
	}

	/**
	 * Set the this parameter is the name of the access network provider and used to determine for which access network the policies defined in the {{object|#.ANPPolicy}} table will apply.
	 *
	 * @since 2.6
	 * @param anname the input value
	 */
	public void  setAnname(String anname) {
		this.anname = anname;
	}

	/**
	 * Set the this parameter is the name of the access network provider and used to determine for which access network the policies defined in the {{object|#.ANPPolicy}} table will apply.
	 *
	 * @since 2.6
	 * @param anname the input value
	 * @return this instance
	 */
	public ANPPolicy withAnname(String anname) {
		this.anname = anname;
		return this;
	}

	/**
	 * Get the this table contains a list of block periods for a {{object|##.ANPPolicy}}.

        A block period defines how long the device will wait before re-trying to establish connectivity via the access network after the previous attempt has failed.
	 *
	 * @return the value
	 */
	public Collection<BlockPeriod> getBlockPeriods() {
		if (this.blockPeriods == null){ this.blockPeriods=new ArrayList<>();}
		return blockPeriods;
	}

	/**
	 * Set the this table contains a list of block periods for a {{object|##.ANPPolicy}}.

        A block period defines how long the device will wait before re-trying to establish connectivity via the access network after the previous attempt has failed.
	 *
	 * @param blockPeriods the input value
	 */
	public void  setBlockPeriods(Collection<BlockPeriod> blockPeriods) {
		this.blockPeriods = blockPeriods;
	}

	/**
	 * Set the this table contains a list of block periods for a {{object|##.ANPPolicy}}.

        A block period defines how long the device will wait before re-trying to establish connectivity via the access network after the previous attempt has failed.
	 *
	 * @param blockPeriod the input value
	 * @return this instance
	 */
	public ANPPolicy withBlockPeriod(BlockPeriod blockPeriod) {
		getBlockPeriods().add(blockPeriod);
		return this;
	}

	/**
	 * Get the this table contains the Request Category (RCAT) policy items for defining when it is appropriate to use the access network for processing requests.
	 *
	 * @return the value
	 */
	public Collection<RequestCategory> getRequestCategories() {
		if (this.requestCategories == null){ this.requestCategories=new ArrayList<>();}
		return requestCategories;
	}

	/**
	 * Set the this table contains the Request Category (RCAT) policy items for defining when it is appropriate to use the access network for processing requests.
	 *
	 * @param requestCategories the input value
	 */
	public void  setRequestCategories(Collection<RequestCategory> requestCategories) {
		this.requestCategories = requestCategories;
	}

	/**
	 * Set the this table contains the Request Category (RCAT) policy items for defining when it is appropriate to use the access network for processing requests.
	 *
	 * @param requestCategory the input value
	 * @return this instance
	 */
	public ANPPolicy withRequestCategory(RequestCategory requestCategory) {
		getRequestCategories().add(requestCategory);
		return this;
	}

	//</editor-fold>

}