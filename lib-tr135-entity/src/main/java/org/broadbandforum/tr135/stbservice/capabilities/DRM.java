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
	 * This object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.DRM.")
@XmlRootElement(name = "STBService.Capabilities.DRM")
@XmlType(name = "STBService.Capabilities.DRM")
@XmlAccessorType(XmlAccessType.FIELD)
public class DRM {

	/**
	 * Unique identifiers (e.g. commercial names) of supported DRM systems.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DRMSystems")
	@Size(max = 1024)
	@XmlList
	public Collection<String> drmSystems;

	public DRM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique identifiers (e.g. commercial names) of supported DRM systems.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getDrmSystems() {
		if (this.drmSystems == null){ this.drmSystems=new ArrayList<>();}
		return drmSystems;
	}

	/**
	 * Set the unique identifiers (e.g. commercial names) of supported DRM systems.
	 *
	 * @since 1.0
	 * @param drmSystems the input value
	 */
	public void  setDrmSystems(Collection<String> drmSystems) {
		this.drmSystems = drmSystems;
	}

	/**
	 * Set the unique identifiers (e.g. commercial names) of supported DRM systems.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public DRM withDrmSystems(String string) {
		getDrmSystems().add(string);
		return this;
	}

	//</editor-fold>

}