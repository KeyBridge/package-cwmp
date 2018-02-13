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
package org.broadbandforum.tr135.stbservice.components;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.components.pvr.Storage;

	/**
	 * PVR details.  This is a read-only object that exists only to reference PVR storage objects.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.PVR.")
@XmlRootElement(name = "STBService.Components.PVR")
@XmlType(name = "STBService.Components.PVR")
@XmlAccessorType(XmlAccessType.FIELD)
public class PVR {

	/**
	 * PVR storage table. There MUST be an instance for each storage object that can be accessed by the PVR. Entries MAY be dynamically created and deleted as storage devices become available and unavailable.
	 */
	@XmlElementWrapper(name = "Storages")
	@XmlElement(name = "Storage")
	public Collection<Storage> storages;

	public PVR() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the pvr storage table. There MUST be an instance for each storage object that can be accessed by the PVR. Entries MAY be dynamically created and deleted as storage devices become available and unavailable.
	 *
	 * @return the value
	 */
	public Collection<Storage> getStorages() {
		if (this.storages == null){ this.storages=new ArrayList<>();}
		return storages;
	}

	/**
	 * Set the pvr storage table. There MUST be an instance for each storage object that can be accessed by the PVR. Entries MAY be dynamically created and deleted as storage devices become available and unavailable.
	 *
	 * @param storages the input value
	 */
	public void  setStorages(Collection<Storage> storages) {
		this.storages = storages;
	}

	/**
	 * Set the pvr storage table. There MUST be an instance for each storage object that can be accessed by the PVR. Entries MAY be dynamically created and deleted as storage devices become available and unavailable.
	 *
	 * @param storage the input value
	 * @return this instance
	 */
	public PVR withStorage(Storage storage) {
		getStorages().add(storage);
		return this;
	}

	//</editor-fold>

}