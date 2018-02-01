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
package org.broadbandforum.tr196.fapservice.accessmgmt;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.accessmgmt.legacy.LocalIPAccess;

	/**
	 * This object contains configurable and observable attributes related to Access and Admission Control of the FAP, which are not not covered by 3GPP and 3GPP2 specifications.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.Legacy.")
public class Legacy {

	/**
	 * Old Local IP access object, included on special request.
	 */
	@XmlElement(name = "LocalIPAccess")
	public LocalIPAccess localIPAccess;

	public Legacy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the old Local IP access object, included on special request.
	 *
	 * @return the value
	 */
	public LocalIPAccess getLocalIPAccess() {
		return localIPAccess;
	}

	/**
	 * Set the old Local IP access object, included on special request.
	 *
	 * @param localIPAccess the input value
	 */
	public void  setLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
	}

	/**
	 * Set the old Local IP access object, included on special request.
	 *
	 * @param localIPAccess the input value
	 * @return this instance
	 */
	public Legacy withLocalIPAccess(LocalIPAccess localIPAccess) {
		this.localIPAccess = localIPAccess;
		return this;
	}

	//</editor-fold>

}