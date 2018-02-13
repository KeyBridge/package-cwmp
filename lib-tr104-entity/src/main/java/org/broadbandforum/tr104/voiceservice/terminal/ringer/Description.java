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
package org.broadbandforum.tr104.voiceservice.terminal.ringer;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Each entry in this table defines the contents of an individual ring specification.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.Ringer.Description.{i}.")
@XmlRootElement(name = "VoiceService.Terminal.Ringer.Description")
@XmlType(name = "VoiceService.Terminal.Ringer.Description")
@XmlAccessorType(XmlAccessType.FIELD)
public class Description {

	/**
	 * Enables or disables the ring description entry.  If a disabled ring description entry is referenced, the result is that no ring is played.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ringEnable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Name of the ring.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ringName;
	/**
	 * This is the {{object|#.Pattern.{i}.}} object that begins this ring. If the ring is specified by a ring file instead of a ring pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingPattern")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ringPattern;
	/**
	 * The file name of a ring file file locally present on the CPE.

An ACS MUST use the Download method with FileType="5 Ringer File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a ring file.

If the ring is specified by a ring pattern instead of a ring file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingFile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ringFile;

	public Description() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the ring description entry.  If a disabled ring description entry is referenced, the result is that no ring is played.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRingEnable() {
		return ringEnable;
	}

	/**
	 * Set the enables or disables the ring description entry.  If a disabled ring description entry is referenced, the result is that no ring is played.
	 *
	 * @since 2.0
	 * @param ringEnable the input value
	 */
	public void  setRingEnable(Boolean ringEnable) {
		this.ringEnable = ringEnable;
	}

	/**
	 * Set the enables or disables the ring description entry.  If a disabled ring description entry is referenced, the result is that no ring is played.
	 *
	 * @since 2.0
	 * @param ringEnable the input value
	 * @return this instance
	 */
	public Description withRingEnable(Boolean ringEnable) {
		this.ringEnable = ringEnable;
		return this;
	}

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
	public Description withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of the ring.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRingName() {
		return ringName;
	}

	/**
	 * Set the name of the ring.
	 *
	 * @since 2.0
	 * @param ringName the input value
	 */
	public void  setRingName(String ringName) {
		this.ringName = ringName;
	}

	/**
	 * Set the name of the ring.
	 *
	 * @since 2.0
	 * @param ringName the input value
	 * @return this instance
	 */
	public Description withRingName(String ringName) {
		this.ringName = ringName;
		return this;
	}

	/**
	 * Get the this is the {{object|#.Pattern.{i}.}} object that begins this ring. If the ring is specified by a ring file instead of a ring pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRingPattern() {
		return ringPattern;
	}

	/**
	 * Set the this is the {{object|#.Pattern.{i}.}} object that begins this ring. If the ring is specified by a ring file instead of a ring pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param ringPattern the input value
	 */
	public void  setRingPattern(String ringPattern) {
		this.ringPattern = ringPattern;
	}

	/**
	 * Set the this is the {{object|#.Pattern.{i}.}} object that begins this ring. If the ring is specified by a ring file instead of a ring pattern, this parameter MUST be set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param ringPattern the input value
	 * @return this instance
	 */
	public Description withRingPattern(String ringPattern) {
		this.ringPattern = ringPattern;
		return this;
	}

	/**
	 * Get the file name of a ring file file locally present on the CPE.

An ACS MUST use the Download method with FileType="5 Ringer File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a ring file.

If the ring is specified by a ring pattern instead of a ring file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRingFile() {
		return ringFile;
	}

	/**
	 * Set the file name of a ring file file locally present on the CPE.

An ACS MUST use the Download method with FileType="5 Ringer File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a ring file.

If the ring is specified by a ring pattern instead of a ring file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param ringFile the input value
	 */
	public void  setRingFile(String ringFile) {
		this.ringFile = ringFile;
	}

	/**
	 * Set the file name of a ring file file locally present on the CPE.

An ACS MUST use the Download method with FileType="5 Ringer File" as defined in {{bibref|TR-069a4|Annex A.3.2.8}} to download a ring file.

If the ring is specified by a ring pattern instead of a ring file, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param ringFile the input value
	 * @return this instance
	 */
	public Description withRingFile(String ringFile) {
		this.ringFile = ringFile;
		return this;
	}

	//</editor-fold>

}