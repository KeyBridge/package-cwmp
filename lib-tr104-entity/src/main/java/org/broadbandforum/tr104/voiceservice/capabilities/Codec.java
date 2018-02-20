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
package org.broadbandforum.tr104.voiceservice.capabilities;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Table to describe the set of supported codecs.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.Codec.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Codec", "BitRate"})})
@XmlRootElement(name = "VoiceService.Capabilities.Codec")
@XmlType(name = "VoiceService.Capabilities.Codec")
@XmlAccessorType(XmlAccessType.FIELD)
public class Codec {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Identifier of the type of codec. {{enum}}

The parameter MAY instead be a vendor-specific codec, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyCodec"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Codec")
	public String codec;
	/**
	 * Bit rate, specified in bits per second.  The value MUST be among the values appropriate for the specified codec.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BitRate")
	public Long bitRate;
	/**
	 * {{list}} Each item is a supported packetization period, in milliseconds, or a continuous range of packetization periods.  Ranges are indicated as a hyphen-separated pair of unsigned integers.  Examples:

: "20" indicates a single discrete value.

: "10, 20, 30" indicates a set of discrete values.

: "5-40" indicates a continuous inclusive range.

: "5-10, 20, 30" indicates a continuous range in addition to a set of discrete values.

A range MUST only be indicated if all values within the range are supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketizationPeriod")
	@XmlList
	public Collection<String> packetizationPeriod;
	/**
	 * If {{true}} indicates support for silence suppression for this codec.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SilenceSuppression")
	public Boolean silenceSuppression;

	public Codec() {
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
	public Codec withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the identifier of the type of codec. {{enum}}

The parameter MAY instead be a vendor-specific codec, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyCodec"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCodec() {
		return codec;
	}

	/**
	 * Set the identifier of the type of codec. {{enum}}

The parameter MAY instead be a vendor-specific codec, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyCodec"
	 *
	 * @since 2.0
	 * @param codec the input value
	 */
	public void  setCodec(String codec) {
		this.codec = codec;
	}

	/**
	 * Set the identifier of the type of codec. {{enum}}

The parameter MAY instead be a vendor-specific codec, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyCodec"
	 *
	 * @since 2.0
	 * @param codec the input value
	 * @return this instance
	 */
	public Codec withCodec(String codec) {
		this.codec = codec;
		return this;
	}

	/**
	 * Get the bit rate, specified in bits per second.  The value MUST be among the values appropriate for the specified codec.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBitRate() {
		return bitRate;
	}

	/**
	 * Set the bit rate, specified in bits per second.  The value MUST be among the values appropriate for the specified codec.
	 *
	 * @since 2.0
	 * @param bitRate the input value
	 */
	public void  setBitRate(Long bitRate) {
		this.bitRate = bitRate;
	}

	/**
	 * Set the bit rate, specified in bits per second.  The value MUST be among the values appropriate for the specified codec.
	 *
	 * @since 2.0
	 * @param bitRate the input value
	 * @return this instance
	 */
	public Codec withBitRate(Long bitRate) {
		this.bitRate = bitRate;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported packetization period, in milliseconds, or a continuous range of packetization periods.  Ranges are indicated as a hyphen-separated pair of unsigned integers.  Examples:

: "20" indicates a single discrete value.

: "10, 20, 30" indicates a set of discrete values.

: "5-40" indicates a continuous inclusive range.

: "5-10, 20, 30" indicates a continuous range in addition to a set of discrete values.

A range MUST only be indicated if all values within the range are supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPacketizationPeriod() {
		if (this.packetizationPeriod == null){ this.packetizationPeriod=new ArrayList<>();}
		return packetizationPeriod;
	}

	/**
	 * Set the {{list}} Each item is a supported packetization period, in milliseconds, or a continuous range of packetization periods.  Ranges are indicated as a hyphen-separated pair of unsigned integers.  Examples:

: "20" indicates a single discrete value.

: "10, 20, 30" indicates a set of discrete values.

: "5-40" indicates a continuous inclusive range.

: "5-10, 20, 30" indicates a continuous range in addition to a set of discrete values.

A range MUST only be indicated if all values within the range are supported.
	 *
	 * @since 2.0
	 * @param packetizationPeriod the input value
	 */
	public void  setPacketizationPeriod(Collection<String> packetizationPeriod) {
		this.packetizationPeriod = packetizationPeriod;
	}

	/**
	 * Set the {{list}} Each item is a supported packetization period, in milliseconds, or a continuous range of packetization periods.  Ranges are indicated as a hyphen-separated pair of unsigned integers.  Examples:

: "20" indicates a single discrete value.

: "10, 20, 30" indicates a set of discrete values.

: "5-40" indicates a continuous inclusive range.

: "5-10, 20, 30" indicates a continuous range in addition to a set of discrete values.

A range MUST only be indicated if all values within the range are supported.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Codec withPacketizationPeriod(String string) {
		getPacketizationPeriod().add(string);
		return this;
	}

	/**
	 * Get the if {{true}} indicates support for silence suppression for this codec.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSilenceSuppression() {
		return silenceSuppression;
	}

	/**
	 * Set the if {{true}} indicates support for silence suppression for this codec.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 */
	public void  setSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
	}

	/**
	 * Set the if {{true}} indicates support for silence suppression for this codec.
	 *
	 * @since 2.0
	 * @param silenceSuppression the input value
	 * @return this instance
	 */
	public Codec withSilenceSuppression(Boolean silenceSuppression) {
		this.silenceSuppression = silenceSuppression;
		return this;
	}

	//</editor-fold>

}