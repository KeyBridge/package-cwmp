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
package org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set;

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
	 * This object defines the FollowMe destinations mapping definition, in the provided sequence order.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.Set.{i}.FollowMe.{i}.")
@XmlRootElement(name = "VoiceService.CallControl.CallingFeatures.Set.FollowMe")
@XmlType(name = "VoiceService.CallControl.CallingFeatures.Set.FollowMe")
@XmlAccessorType(XmlAccessType.FIELD)
public class FollowMe {

	/**
	 * Enables or disables this FollowMe sequence item.
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
	 * Delay in seconds before next FollowMe sequence item applies.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Delay")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long delay;
	/**
	 * Directory number to which all incoming calls to this line are forwarded to after {{param|Delay}}, when {{param|#.FollowMeEnable}} is {{true}}. In this case, {{param|#.CallForwardOnNoAnswerNumber}} is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Number")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String number;
	/**
	 * For a given {{param|Number}}, defines the order of this item in the FollowMe sequence.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	public Long order;

	public FollowMe() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this FollowMe sequence item.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this FollowMe sequence item.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this FollowMe sequence item.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FollowMe withEnable(Boolean enable) {
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
	public FollowMe withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the delay in seconds before next FollowMe sequence item applies.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDelay() {
		return delay;
	}

	/**
	 * Set the delay in seconds before next FollowMe sequence item applies.
	 *
	 * @since 2.0
	 * @param delay the input value
	 */
	public void  setDelay(Long delay) {
		this.delay = delay;
	}

	/**
	 * Set the delay in seconds before next FollowMe sequence item applies.
	 *
	 * @since 2.0
	 * @param delay the input value
	 * @return this instance
	 */
	public FollowMe withDelay(Long delay) {
		this.delay = delay;
		return this;
	}

	/**
	 * Get the directory number to which all incoming calls to this line are forwarded to after {{param|Delay}}, when {{param|#.FollowMeEnable}} is {{true}}. In this case, {{param|#.CallForwardOnNoAnswerNumber}} is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded to after {{param|Delay}}, when {{param|#.FollowMeEnable}} is {{true}}. In this case, {{param|#.CallForwardOnNoAnswerNumber}} is not used.
	 *
	 * @since 2.0
	 * @param number the input value
	 */
	public void  setNumber(String number) {
		this.number = number;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded to after {{param|Delay}}, when {{param|#.FollowMeEnable}} is {{true}}. In this case, {{param|#.CallForwardOnNoAnswerNumber}} is not used.
	 *
	 * @since 2.0
	 * @param number the input value
	 * @return this instance
	 */
	public FollowMe withNumber(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Get the for a given {{param|Number}}, defines the order of this item in the FollowMe sequence.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the for a given {{param|Number}}, defines the order of this item in the FollowMe sequence.
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the for a given {{param|Number}}, defines the order of this item in the FollowMe sequence.
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public FollowMe withOrder(Long order) {
		this.order = order;
		return this;
	}

	//</editor-fold>

}