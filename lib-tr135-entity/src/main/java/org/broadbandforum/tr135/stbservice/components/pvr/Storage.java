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
package org.broadbandforum.tr135.stbservice.components.pvr;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * PVR storage table. There MUST be an instance for each storage object that can be accessed by the PVR. Entries MAY be dynamically created and deleted as storage devices become available and unavailable.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.PVR.Storage.{i}.")
@XmlRootElement(name = "Storage")
@XmlType(name = "STBService.Components.PVR.Storage")
@XmlAccessorType(XmlAccessType.FIELD)
public class Storage {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Unique human-readable name associated with this storage instance.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * References the corresponding ''StorageService'' {{bibref|TR-140}} instance, or an object contained within such an instance, e.g. a ''PhysicalMedium'', ''LogicalVolume'' or ''Folder'' instance.

The value is the full hierarchical name of the corresponding object.  Example: ''Device.Services.StorageService.1''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Reference")
	@Size(max = 256)
	public String reference;

	public Storage() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Storage withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique human-readable name associated with this storage instance.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the unique human-readable name associated with this storage instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the unique human-readable name associated with this storage instance.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public Storage withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the references the corresponding ''StorageService'' {{bibref|TR-140}} instance, or an object contained within such an instance, e.g. a ''PhysicalMedium'', ''LogicalVolume'' or ''Folder'' instance.

The value is the full hierarchical name of the corresponding object.  Example: ''Device.Services.StorageService.1''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the references the corresponding ''StorageService'' {{bibref|TR-140}} instance, or an object contained within such an instance, e.g. a ''PhysicalMedium'', ''LogicalVolume'' or ''Folder'' instance.

The value is the full hierarchical name of the corresponding object.  Example: ''Device.Services.StorageService.1''
	 *
	 * @since 1.0
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the references the corresponding ''StorageService'' {{bibref|TR-140}} instance, or an object contained within such an instance, e.g. a ''PhysicalMedium'', ''LogicalVolume'' or ''Folder'' instance.

The value is the full hierarchical name of the corresponding object.  Example: ''Device.Services.StorageService.1''
	 *
	 * @since 1.0
	 * @param reference the input value
	 * @return this instance
	 */
	public Storage withReference(String reference) {
		this.reference = reference;
		return this;
	}

	//</editor-fold>

}