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
package org.broadbandforum.tr135.stbservice.applications.cdspull;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Content Item instance table.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Applications.CDSPull.ContentItem.{i}.")
public class ContentItem {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Unique Content Item reference as defined in {{bibref|TS102323}}, or {{bibref|RFC4078}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ContentReferenceId")
	public String contentReferenceId;
	/**
	 * Version number of the stored content item (a content item could be updated with a new version e.g. in case of errors in the video preventing the play out).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VersionNumber")
	@Size(min = 0, max = 255)
	public Long versionNumber;
	/**
	 * When set to {{true}}, deletes this Content Item instance. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DeleteItem")
	@CWMPParameter(access = "readWrite")
	public Boolean deleteItem;

	public ContentItem() {
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
	public ContentItem withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique Content Item reference as defined in {{bibref|TS102323}}, or {{bibref|RFC4078}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getContentReferenceId() {
		return contentReferenceId;
	}

	/**
	 * Set the unique Content Item reference as defined in {{bibref|TS102323}}, or {{bibref|RFC4078}}.
	 *
	 * @since 1.1
	 * @param contentReferenceId the input value
	 */
	public void  setContentReferenceId(String contentReferenceId) {
		this.contentReferenceId = contentReferenceId;
	}

	/**
	 * Set the unique Content Item reference as defined in {{bibref|TS102323}}, or {{bibref|RFC4078}}.
	 *
	 * @since 1.1
	 * @param contentReferenceId the input value
	 * @return this instance
	 */
	public ContentItem withContentReferenceId(String contentReferenceId) {
		this.contentReferenceId = contentReferenceId;
		return this;
	}

	/**
	 * Get the version number of the stored content item (a content item could be updated with a new version e.g. in case of errors in the video preventing the play out).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getVersionNumber() {
		return versionNumber;
	}

	/**
	 * Set the version number of the stored content item (a content item could be updated with a new version e.g. in case of errors in the video preventing the play out).
	 *
	 * @since 1.1
	 * @param versionNumber the input value
	 */
	public void  setVersionNumber(Long versionNumber) {
		this.versionNumber = versionNumber;
	}

	/**
	 * Set the version number of the stored content item (a content item could be updated with a new version e.g. in case of errors in the video preventing the play out).
	 *
	 * @since 1.1
	 * @param versionNumber the input value
	 * @return this instance
	 */
	public ContentItem withVersionNumber(Long versionNumber) {
		this.versionNumber = versionNumber;
		return this;
	}

	/**
	 * Get the when set to {{true}}, deletes this Content Item instance. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDeleteItem() {
		return deleteItem;
	}

	/**
	 * Set the when set to {{true}}, deletes this Content Item instance. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.1
	 * @param deleteItem the input value
	 */
	public void  setDeleteItem(Boolean deleteItem) {
		this.deleteItem = deleteItem;
	}

	/**
	 * Set the when set to {{true}}, deletes this Content Item instance. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.1
	 * @param deleteItem the input value
	 * @return this instance
	 */
	public ContentItem withDeleteItem(Boolean deleteItem) {
		this.deleteItem = deleteItem;
		return this;
	}

	//</editor-fold>

}