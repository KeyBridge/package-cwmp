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
	 * The {{object}} is a table that is used to control which line is used when an extension makes a call.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.OutgoingMap.{i}.")
@XmlRootElement(name = "VoiceService.CallControl.OutgoingMap")
@XmlType(name = "VoiceService.CallControl.OutgoingMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutgoingMap {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Public number to be presented outgoing calls, instead of the effective extension number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CLIPNoScreeningNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String cliPNoScreeningNumber;
	/**
	 * {{object|#.Extension}} which makes the outgoing call.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Extension")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String extension;
	/**
	 * Identifies the {{object|#.Line}} to be used for outgoing calls.

When applicable in the signaling protocol the DirectoryNumber will be used as source number for this call.

Note: The Line to be used for an outgoing call can be overridden by the {{object|#.NumberingPlan}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Line")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String line;
	/**
	 * The order in which using the lines is attempted. This is used to implement a backup mechanism.

If the first line is not available, using the next one will be attempted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order = 1L;

	public OutgoingMap() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public OutgoingMap withEnable(Boolean enable) {
		this.enable = enable;
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
	public OutgoingMap withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the public number to be presented outgoing calls, instead of the effective extension number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCliPNoScreeningNumber() {
		return cliPNoScreeningNumber;
	}

	/**
	 * Set the public number to be presented outgoing calls, instead of the effective extension number.
	 *
	 * @since 2.0
	 * @param cliPNoScreeningNumber the input value
	 */
	public void  setCliPNoScreeningNumber(String cliPNoScreeningNumber) {
		this.cliPNoScreeningNumber = cliPNoScreeningNumber;
	}

	/**
	 * Set the public number to be presented outgoing calls, instead of the effective extension number.
	 *
	 * @since 2.0
	 * @param cliPNoScreeningNumber the input value
	 * @return this instance
	 */
	public OutgoingMap withCliPNoScreeningNumber(String cliPNoScreeningNumber) {
		this.cliPNoScreeningNumber = cliPNoScreeningNumber;
		return this;
	}

	/**
	 * Get the {{object|#.Extension}} which makes the outgoing call.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * Set the {{object|#.Extension}} which makes the outgoing call.

{{reference}}
	 *
	 * @since 2.0
	 * @param extension the input value
	 */
	public void  setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Set the {{object|#.Extension}} which makes the outgoing call.

{{reference}}
	 *
	 * @since 2.0
	 * @param extension the input value
	 * @return this instance
	 */
	public OutgoingMap withExtension(String extension) {
		this.extension = extension;
		return this;
	}

	/**
	 * Get the identifies the {{object|#.Line}} to be used for outgoing calls.

When applicable in the signaling protocol the DirectoryNumber will be used as source number for this call.

Note: The Line to be used for an outgoing call can be overridden by the {{object|#.NumberingPlan}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLine() {
		return line;
	}

	/**
	 * Set the identifies the {{object|#.Line}} to be used for outgoing calls.

When applicable in the signaling protocol the DirectoryNumber will be used as source number for this call.

Note: The Line to be used for an outgoing call can be overridden by the {{object|#.NumberingPlan}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param line the input value
	 */
	public void  setLine(String line) {
		this.line = line;
	}

	/**
	 * Set the identifies the {{object|#.Line}} to be used for outgoing calls.

When applicable in the signaling protocol the DirectoryNumber will be used as source number for this call.

Note: The Line to be used for an outgoing call can be overridden by the {{object|#.NumberingPlan}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param line the input value
	 * @return this instance
	 */
	public OutgoingMap withLine(String line) {
		this.line = line;
		return this;
	}

	/**
	 * Get the order in which using the lines is attempted. This is used to implement a backup mechanism.

If the first line is not available, using the next one will be attempted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the order in which using the lines is attempted. This is used to implement a backup mechanism.

If the first line is not available, using the next one will be attempted.
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the order in which using the lines is attempted. This is used to implement a backup mechanism.

If the first line is not available, using the next one will be attempted.
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public OutgoingMap withOrder(Long order) {
		this.order = order;
		return this;
	}

	//</editor-fold>

}