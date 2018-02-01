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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * This object describes the characteristics of the Digital Rights Management, if any.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.DRM.{i}.")
public class DRM {

	/**
	 * Enables or disables this DRM system.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this DRM system.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates a unique identifier (e.g. the commercial name: ''La 7 piu'', ''Mediaset Premium'') for this DRM system.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Path name of the smart card reader object instance containing the smart card (if any) associated with this DRM system. 

The value MUST be {{empty}} (if not associated with a smart card) or else be the full path name of the corresponding smart card reader object.  For example:

''Device.SmartCardReader.1''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SmartCardReader")
	@Size(max = 256)
	public String smartCardReader;

	public DRM() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this DRM system.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this DRM system.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this DRM system.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public DRM withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this DRM system.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this DRM system.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this DRM system.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public DRM withStatus(String status) {
		this.status = status;
		return this;
	}

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
	public DRM withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates a unique identifier (e.g. the commercial name: ''La 7 piu'', ''Mediaset Premium'') for this DRM system.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the indicates a unique identifier (e.g. the commercial name: ''La 7 piu'', ''Mediaset Premium'') for this DRM system.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the indicates a unique identifier (e.g. the commercial name: ''La 7 piu'', ''Mediaset Premium'') for this DRM system.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public DRM withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the path name of the smart card reader object instance containing the smart card (if any) associated with this DRM system. 

The value MUST be {{empty}} (if not associated with a smart card) or else be the full path name of the corresponding smart card reader object.  For example:

''Device.SmartCardReader.1''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSmartCardReader() {
		return smartCardReader;
	}

	/**
	 * Set the path name of the smart card reader object instance containing the smart card (if any) associated with this DRM system. 

The value MUST be {{empty}} (if not associated with a smart card) or else be the full path name of the corresponding smart card reader object.  For example:

''Device.SmartCardReader.1''
	 *
	 * @since 1.0
	 * @param smartCardReader the input value
	 */
	public void  setSmartCardReader(String smartCardReader) {
		this.smartCardReader = smartCardReader;
	}

	/**
	 * Set the path name of the smart card reader object instance containing the smart card (if any) associated with this DRM system. 

The value MUST be {{empty}} (if not associated with a smart card) or else be the full path name of the corresponding smart card reader object.  For example:

''Device.SmartCardReader.1''
	 *
	 * @since 1.0
	 * @param smartCardReader the input value
	 * @return this instance
	 */
	public DRM withSmartCardReader(String smartCardReader) {
		this.smartCardReader = smartCardReader;
		return this;
	}

	//</editor-fold>

}