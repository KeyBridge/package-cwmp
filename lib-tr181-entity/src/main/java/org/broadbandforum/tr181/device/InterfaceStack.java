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
package org.broadbandforum.tr181.device;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This table contains information about the relationships between the multiple layers of interface objects ({{bibref|TR-181i2|Section 4.3}}). In particular, it contains information on which interfaces run ''on top of'' which other interfaces.

        This table is auto-generated by the CPE based on the ''LowerLayers'' parameters on individual interface objects. 

        Each table row represents a "link" between two interface objects, a higher-layer interface object (referenced by {{param|HigherLayer}}) and a lower-layer interface object (referenced by {{param|LowerLayer}}). Consequently, if a referenced interface object is deleted, the CPE MUST delete the corresponding {{object}} row(s) that had referenced it.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.InterfaceStack.{i}.")
public class InterfaceStack {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{noreference}}A reference to the interface object corresponding to the higher layer of the relationship, i.e. the interface which runs on ''top'' of the interface identified by the corresponding instance of {{param|LowerLayer}}. 

          When the referenced higher layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HigherLayer")
	@Size(max = 256)
	public String higherLayer;
	/**
	 * {{noreference}}A reference to the interface object corresponding to the lower layer of the relationship, i.e. the interface which runs ''below'' the interface identified by the corresponding instance of {{param|HigherLayer}}. 

          When the referenced lower layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayer")
	@Size(max = 256)
	public String lowerLayer;
	/**
	 * The value of the ''Alias'' parameter for the interface object referenced by {{param|HigherLayer}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HigherAlias")
	@Size(max = 64)
	public String higherAlias;
	/**
	 * The value of the ''Alias'' parameter for the interface object referenced by {{param|LowerLayer}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerAlias")
	@Size(max = 64)
	public String lowerAlias;

	public InterfaceStack() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public InterfaceStack withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{noreference}}A reference to the interface object corresponding to the higher layer of the relationship, i.e. the interface which runs on ''top'' of the interface identified by the corresponding instance of {{param|LowerLayer}}. 

          When the referenced higher layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHigherLayer() {
		return higherLayer;
	}

	/**
	 * Set the {{noreference}}A reference to the interface object corresponding to the higher layer of the relationship, i.e. the interface which runs on ''top'' of the interface identified by the corresponding instance of {{param|LowerLayer}}. 

          When the referenced higher layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @param higherLayer the input value
	 */
	public void  setHigherLayer(String higherLayer) {
		this.higherLayer = higherLayer;
	}

	/**
	 * Set the {{noreference}}A reference to the interface object corresponding to the higher layer of the relationship, i.e. the interface which runs on ''top'' of the interface identified by the corresponding instance of {{param|LowerLayer}}. 

          When the referenced higher layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @param higherLayer the input value
	 * @return this instance
	 */
	public InterfaceStack withHigherLayer(String higherLayer) {
		this.higherLayer = higherLayer;
		return this;
	}

	/**
	 * Get the {{noreference}}A reference to the interface object corresponding to the lower layer of the relationship, i.e. the interface which runs ''below'' the interface identified by the corresponding instance of {{param|HigherLayer}}. 

          When the referenced lower layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLowerLayer() {
		return lowerLayer;
	}

	/**
	 * Set the {{noreference}}A reference to the interface object corresponding to the lower layer of the relationship, i.e. the interface which runs ''below'' the interface identified by the corresponding instance of {{param|HigherLayer}}. 

          When the referenced lower layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @param lowerLayer the input value
	 */
	public void  setLowerLayer(String lowerLayer) {
		this.lowerLayer = lowerLayer;
	}

	/**
	 * Set the {{noreference}}A reference to the interface object corresponding to the lower layer of the relationship, i.e. the interface which runs ''below'' the interface identified by the corresponding instance of {{param|HigherLayer}}. 

          When the referenced lower layer interface is deleted, the CPE MUST delete the table row.
	 *
	 * @since 2.0
	 * @param lowerLayer the input value
	 * @return this instance
	 */
	public InterfaceStack withLowerLayer(String lowerLayer) {
		this.lowerLayer = lowerLayer;
		return this;
	}

	/**
	 * Get the value of the ''Alias'' parameter for the interface object referenced by {{param|HigherLayer}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHigherAlias() {
		return higherAlias;
	}

	/**
	 * Set the value of the ''Alias'' parameter for the interface object referenced by {{param|HigherLayer}}.
	 *
	 * @since 2.0
	 * @param higherAlias the input value
	 */
	public void  setHigherAlias(String higherAlias) {
		this.higherAlias = higherAlias;
	}

	/**
	 * Set the value of the ''Alias'' parameter for the interface object referenced by {{param|HigherLayer}}.
	 *
	 * @since 2.0
	 * @param higherAlias the input value
	 * @return this instance
	 */
	public InterfaceStack withHigherAlias(String higherAlias) {
		this.higherAlias = higherAlias;
		return this;
	}

	/**
	 * Get the value of the ''Alias'' parameter for the interface object referenced by {{param|LowerLayer}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLowerAlias() {
		return lowerAlias;
	}

	/**
	 * Set the value of the ''Alias'' parameter for the interface object referenced by {{param|LowerLayer}}.
	 *
	 * @since 2.0
	 * @param lowerAlias the input value
	 */
	public void  setLowerAlias(String lowerAlias) {
		this.lowerAlias = lowerAlias;
	}

	/**
	 * Set the value of the ''Alias'' parameter for the interface object referenced by {{param|LowerLayer}}.
	 *
	 * @since 2.0
	 * @param lowerAlias the input value
	 * @return this instance
	 */
	public InterfaceStack withLowerAlias(String lowerAlias) {
		this.lowerAlias = lowerAlias;
		return this;
	}

	//</editor-fold>

}