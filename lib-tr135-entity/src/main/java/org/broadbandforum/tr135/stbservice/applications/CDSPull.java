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
package org.broadbandforum.tr135.stbservice.applications;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.applications.cdspull.ContentItem;

	/**
	 * Details of STB CDS Pull logical internal component. This object is present only if the user allowed (via his local STB UI) the remote management of the CDS Pull service.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Applications.CDSPull.")
@XmlRootElement(name = "CDSPull")
@XmlType(name = "STBService.Applications.CDSPull")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDSPull {

	/**
	 * It references the object instance dedicated to the CDS Pull service. Example: “Device.Services.StorageService.1.LogicalVolume.1.Folder.1”.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Reference")
	@Size(max = 256)
	public String reference;
	/**
	 * Content Item instance table.
	 */
	@XmlElementWrapper(name = "ContentItems")
	@XmlElement(name = "ContentItem")
	public Collection<ContentItem> contentItems;

	public CDSPull() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the it references the object instance dedicated to the CDS Pull service. Example: “Device.Services.StorageService.1.LogicalVolume.1.Folder.1”.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the it references the object instance dedicated to the CDS Pull service. Example: “Device.Services.StorageService.1.LogicalVolume.1.Folder.1”.
	 *
	 * @since 1.1
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the it references the object instance dedicated to the CDS Pull service. Example: “Device.Services.StorageService.1.LogicalVolume.1.Folder.1”.
	 *
	 * @since 1.1
	 * @param reference the input value
	 * @return this instance
	 */
	public CDSPull withReference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * Get the content Item instance table.
	 *
	 * @return the value
	 */
	public Collection<ContentItem> getContentItems() {
		if (this.contentItems == null){ this.contentItems=new ArrayList<>();}
		return contentItems;
	}

	/**
	 * Set the content Item instance table.
	 *
	 * @param contentItems the input value
	 */
	public void  setContentItems(Collection<ContentItem> contentItems) {
		this.contentItems = contentItems;
	}

	/**
	 * Set the content Item instance table.
	 *
	 * @param contentItem the input value
	 * @return this instance
	 */
	public CDSPull withContentItem(ContentItem contentItem) {
		getContentItems().add(contentItem);
		return this;
	}

	//</editor-fold>

}