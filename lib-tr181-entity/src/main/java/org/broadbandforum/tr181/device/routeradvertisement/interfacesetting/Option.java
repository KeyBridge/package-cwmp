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
package org.broadbandforum.tr181.device.routeradvertisement.interfacesetting;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object specifies the options in a Router Advertisement (RA) message {{bibref|RFC4861|Section 4.6}}. {{object}} entries are created for use in sending Router Advertisements (enabled options MUST be included in RA messages sent). This includes support for sending DNS information in the RA message as described in {{bibref|RFC6106}}.

        This table is intended only for options that are not modeled elsewhere. For example, it is not appropriate for the MTU option (which is modeled via {{param|#.AdvLinkMTU}}).
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.RouterAdvertisement.InterfaceSetting.{i}.Option.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Tag"})})
@XmlRootElement(name = "Device.RouterAdvertisement.InterfaceSetting.Option")
@XmlType(name = "Device.RouterAdvertisement.InterfaceSetting.Option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Option tag (type) {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Tag")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long tag;
	/**
	 * A hexbinary encoded option value {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public byte[] value;

	public Option() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public Option withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Option withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the option tag (type) {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getTag() {
		return tag;
	}

	/**
	 * Set the option tag (type) {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @param tag the input value
	 */
	public void  setTag(Long tag) {
		this.tag = tag;
	}

	/**
	 * Set the option tag (type) {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @param tag the input value
	 * @return this instance
	 */
	public Option withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get a hexbinary encoded option value {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded option value {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded option value {{bibref|RFC4861|Section 4.6}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 * @return this instance
	 */
	public Option withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}