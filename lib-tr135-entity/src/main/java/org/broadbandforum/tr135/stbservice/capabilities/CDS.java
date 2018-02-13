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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object describes the characteristics of the Content Download System, if any.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.CDS.")
@XmlRootElement(name = "CDS")
@XmlType(name = "STBService.Capabilities.CDS")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDS {

	/**
	 * Capability of providing a CDS Push service for the operator initiated download of content items to local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PushCapable")
	public Boolean pushCapable;
	/**
	 * Capability of providing a CDS Pull service for the user initiated download of content items to a local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PullCapable")
	public Boolean pullCapable;

	public CDS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the capability of providing a CDS Push service for the operator initiated download of content items to local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isPushCapable() {
		return pushCapable;
	}

	/**
	 * Set the capability of providing a CDS Push service for the operator initiated download of content items to local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @param pushCapable the input value
	 */
	public void  setPushCapable(Boolean pushCapable) {
		this.pushCapable = pushCapable;
	}

	/**
	 * Set the capability of providing a CDS Push service for the operator initiated download of content items to local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @param pushCapable the input value
	 * @return this instance
	 */
	public CDS withPushCapable(Boolean pushCapable) {
		this.pushCapable = pushCapable;
		return this;
	}

	/**
	 * Get the capability of providing a CDS Pull service for the user initiated download of content items to a local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isPullCapable() {
		return pullCapable;
	}

	/**
	 * Set the capability of providing a CDS Pull service for the user initiated download of content items to a local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @param pullCapable the input value
	 */
	public void  setPullCapable(Boolean pullCapable) {
		this.pullCapable = pullCapable;
	}

	/**
	 * Set the capability of providing a CDS Pull service for the user initiated download of content items to a local storage via a broadband IP connection.
	 *
	 * @since 1.1
	 * @param pullCapable the input value
	 * @return this instance
	 */
	public CDS withPullCapable(Boolean pullCapable) {
		this.pullCapable = pullCapable;
		return this;
	}

	//</editor-fold>

}