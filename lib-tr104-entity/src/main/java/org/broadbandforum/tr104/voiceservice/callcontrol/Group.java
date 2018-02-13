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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * This object models an extension as a group of extensions.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Group.{i}.")
@XmlRootElement(name = "VoiceService.CallControl.Group")
@XmlType(name = "VoiceService.CallControl.Group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{list}} If this parameter is null the group is treated as a group that contains all extensions. 

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Extensions")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> extensions;
	/**
	 * Defines the way of ringing for the extensions in this group. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingType")
	@CWMPParameter(access = "readWrite")
	public String ringType;
	/**
	 * The time (in seconds) to wait for extension reply before trying the next extension.

Only applicable if {{param|RingType}} = {{enum|Hierarchical|RingType}} or {{enum|Cyclic|RingType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long ringTimeout;

	public Group() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Group withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}} If this parameter is null the group is treated as a group that contains all extensions. 

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getExtensions() {
		if (this.extensions == null){ this.extensions=new ArrayList<>();}
		return extensions;
	}

	/**
	 * Set the {{list}} If this parameter is null the group is treated as a group that contains all extensions. 

{{reference}}
	 *
	 * @since 2.0
	 * @param extensions the input value
	 */
	public void  setExtensions(Collection<String> extensions) {
		this.extensions = extensions;
	}

	/**
	 * Set the {{list}} If this parameter is null the group is treated as a group that contains all extensions. 

{{reference}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Group withExtensions(String string) {
		getExtensions().add(string);
		return this;
	}

	/**
	 * Get the defines the way of ringing for the extensions in this group. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRingType() {
		return ringType;
	}

	/**
	 * Set the defines the way of ringing for the extensions in this group. {{enum}}
	 *
	 * @since 2.0
	 * @param ringType the input value
	 */
	public void  setRingType(String ringType) {
		this.ringType = ringType;
	}

	/**
	 * Set the defines the way of ringing for the extensions in this group. {{enum}}
	 *
	 * @since 2.0
	 * @param ringType the input value
	 * @return this instance
	 */
	public Group withRingType(String ringType) {
		this.ringType = ringType;
		return this;
	}

	/**
	 * Get the time (in seconds) to wait for extension reply before trying the next extension.

Only applicable if {{param|RingType}} = {{enum|Hierarchical|RingType}} or {{enum|Cyclic|RingType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRingTimeout() {
		return ringTimeout;
	}

	/**
	 * Set the time (in seconds) to wait for extension reply before trying the next extension.

Only applicable if {{param|RingType}} = {{enum|Hierarchical|RingType}} or {{enum|Cyclic|RingType}}.
	 *
	 * @since 2.0
	 * @param ringTimeout the input value
	 */
	public void  setRingTimeout(Long ringTimeout) {
		this.ringTimeout = ringTimeout;
	}

	/**
	 * Set the time (in seconds) to wait for extension reply before trying the next extension.

Only applicable if {{param|RingType}} = {{enum|Hierarchical|RingType}} or {{enum|Cyclic|RingType}}.
	 *
	 * @since 2.0
	 * @param ringTimeout the input value
	 * @return this instance
	 */
	public Group withRingTimeout(Long ringTimeout) {
		this.ringTimeout = ringTimeout;
		return this;
	}

	//</editor-fold>

}