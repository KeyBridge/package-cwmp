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
package org.broadbandforum.tr104.voiceservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Table of codec profiles. This table MUST be populated with the set of supported codecs matching {{object|.Capabilities.Codec.}}. Additional entries can be added to use different configurations of codec or to use the same codec configuration in different CodecList parameters.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CodecProfile.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.CodecProfile")
@XmlType(name = "VoiceService.CodecProfile")
@XmlAccessorType(XmlAccessType.FIELD)
public class CodecProfile {

	/**
	 * Enable or disable the use of this combination of codec parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Codec")
	@Size(max = 256)
	public String codec;
	/**
	 * {{list}} Each item is a supported packetization period, in milliseconds, or continuous ranges of packetization periods as defined in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.

The ACS MAY restrict the set of packetization periods by modifying the value of this parameter to a more restricted set of values than is listed in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}. The CPE MUST ignore any values or portions of ranges outside of those specified in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketizationPeriod")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> packetizationPeriod;
	/**
	 * Indicates support for silence suppression for this codec.  If silence suppression is supported, it can be disabled for this codec/bit-rate by setting this parameter to {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SilenceSuppression")
	@CWMPParameter(access = "readWrite")
	public Boolean silenceSuppression;

	public CodecProfile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the use of this combination of codec parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the use of this combination of codec parameters.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the use of this combination of codec parameters.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public CodecProfile withEnable(Boolean enable) {
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
	public CodecProfile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCodec() {
		return codec;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.0
	 * @param codec the input value
	 */
	public void  setCodec(String codec) {
		this.codec = codec;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.0
	 * @param codec the input value
	 * @return this instance
	 */
	public CodecProfile withCodec(String codec) {
		this.codec = codec;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported packetization period, in milliseconds, or continuous ranges of packetization periods as defined in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.

The ACS MAY restrict the set of packetization periods by modifying the value of this parameter to a more restricted set of values than is listed in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}. The CPE MUST ignore any values or portions of ranges outside of those specified in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPacketizationPeriod() {
		if (this.packetizationPeriod == null){ this.packetizationPeriod=new ArrayList<>();}
		return packetizationPeriod;
	}

	/**
	 * Set the {{list}} Each item is a supported packetization period, in milliseconds, or continuous ranges of packetization periods as defined in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.

The ACS MAY restrict the set of packetization periods by modifying the value of this parameter to a more restricted set of values than is listed in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}. The CPE MUST ignore any values or portions of ranges outside of those specified in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.
	 *
	 * @since 2.0
	 * @param packetizationPeriod the input value
	 */
	public void  setPacketizationPeriod(Collection<String> packetizationPeriod) {
		this.packetizationPeriod = packetizationPeriod;
	}

	/**
	 * Set the {{list}} Each item is a supported packetization period, in milliseconds, or continuous ranges of packetization periods as defined in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.

The ACS MAY restrict the set of packetization periods by modifying the value of this parameter to a more restricted set of values than is listed in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}. The CPE MUST ignore any values or portions of ranges outside of those specified in {{param|.Capabilities.Codec.{i}.PacketizationPeriod}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CodecProfile withPacketizationPeriod(String string) {
		getPacketizationPeriod().add(string);
		return this;
	}

	/**
	 * Get the indicates support for silence suppression for this codec.  If silence suppression is supported, it can be disabled for this codec/bit-rate by setting this parameter to {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSilenceSuppression() {
		return silenceSuppression;
	}

	/**
	 * Set the indicates support for silence suppression for this codec.  If silence suppression is supported, it can be disabled for this codec/bit-rate by setting this parameter to {{false}}.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 */
	public void  setSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
	}

	/**
	 * Set the indicates support for silence suppression for this codec.  If silence suppression is supported, it can be disabled for this codec/bit-rate by setting this parameter to {{false}}.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 * @return this instance
	 */
	public CodecProfile withSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
		return this;
	}

	//</editor-fold>

}