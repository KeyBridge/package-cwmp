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
package org.broadbandforum.tr135.stbservice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object describes the characteristics of the Conditional Access, if any.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.CA.")
@XmlRootElement(name = "STBService.Capabilities.CA")
@XmlType(name = "STBService.Capabilities.CA")
@XmlAccessorType(XmlAccessType.FIELD)
public class CA {

	/**
	 * Unique identifiers (e.g. commercial names) of supported CA systems.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CASystems")
	@Size(max = 1024)
	@XmlList
	public Collection<String> casystems;

	public CA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique identifiers (e.g. commercial names) of supported CA systems.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getCasystems() {
		if (this.casystems == null){ this.casystems=new ArrayList<>();}
		return casystems;
	}

	/**
	 * Set the unique identifiers (e.g. commercial names) of supported CA systems.
	 *
	 * @since 1.0
	 * @param casystems the input value
	 */
	public void  setCasystems(Collection<String> casystems) {
		this.casystems = casystems;
	}

	/**
	 * Set the unique identifiers (e.g. commercial names) of supported CA systems.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public CA withCasystems(String string) {
		getCasystems().add(string);
		return this;
	}

	//</editor-fold>

}