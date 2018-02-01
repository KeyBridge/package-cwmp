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
	 * Video decoder instance table. It contains data representing the current status of the video decoder.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.VideoDecoder.{i}.")
public class VideoDecoder {

	/**
	 * Enables or disables this video decoder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this video decoder.  {{enum}}

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
	 * Human-readable name associated with this video decoder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * MPEG2 Part 2 profile and level object instance, or {{empty}} if MPEG2 Part 2 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG2Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MPEG2Part2")
	@Size(max = 256)
	public String mpeG2Part2;
	/**
	 * MPEG4 Part 2 profile and level object instance, or {{empty}} if MPEG4 Part 2 is not used).  For example:

''.Capabilities.VideoDecoder.MPEG4Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MPEG4Part2")
	@Size(max = 256)
	public String mpeG4Part2;
	/**
	 * MPEG4 Part 10 profile and level object instance, or {{empty}} if MPEG4 Part 10 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MPEG4Part10")
	@Size(max = 256)
	public String mpeG4Part10;
	/**
	 * SMPTE-VC-1 profile and level object instance, or {{empty}} if SMPTE-VC-1 is not used.  For example:

''.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SMPTEVC1")
	@Size(max = 256)
	public String smpTEVC1;
	/**
	 * Indicates the native aspect ratio of the content available at this decoder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ContentAspectRatio")
	public String contentAspectRatio;

	public VideoDecoder() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this video decoder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this video decoder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this video decoder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VideoDecoder withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this video decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this video decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this video decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public VideoDecoder withStatus(String status) {
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
	public VideoDecoder withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this video decoder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this video decoder.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this video decoder.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public VideoDecoder withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the mpeG2 Part 2 profile and level object instance, or {{empty}} if MPEG2 Part 2 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG2Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMpeG2Part2() {
		return mpeG2Part2;
	}

	/**
	 * Set the mpeG2 Part 2 profile and level object instance, or {{empty}} if MPEG2 Part 2 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG2Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG2Part2 the input value
	 */
	public void  setMpeG2Part2(String mpeG2Part2) {
		this.mpeG2Part2 = mpeG2Part2;
	}

	/**
	 * Set the mpeG2 Part 2 profile and level object instance, or {{empty}} if MPEG2 Part 2 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG2Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG2Part2 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG2Part2(String mpeG2Part2) {
		this.mpeG2Part2 = mpeG2Part2;
		return this;
	}

	/**
	 * Get the mpeG4 Part 2 profile and level object instance, or {{empty}} if MPEG4 Part 2 is not used).  For example:

''.Capabilities.VideoDecoder.MPEG4Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMpeG4Part2() {
		return mpeG4Part2;
	}

	/**
	 * Set the mpeG4 Part 2 profile and level object instance, or {{empty}} if MPEG4 Part 2 is not used).  For example:

''.Capabilities.VideoDecoder.MPEG4Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG4Part2 the input value
	 */
	public void  setMpeG4Part2(String mpeG4Part2) {
		this.mpeG4Part2 = mpeG4Part2;
	}

	/**
	 * Set the mpeG4 Part 2 profile and level object instance, or {{empty}} if MPEG4 Part 2 is not used).  For example:

''.Capabilities.VideoDecoder.MPEG4Part2.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG4Part2 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG4Part2(String mpeG4Part2) {
		this.mpeG4Part2 = mpeG4Part2;
		return this;
	}

	/**
	 * Get the mpeG4 Part 10 profile and level object instance, or {{empty}} if MPEG4 Part 10 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMpeG4Part10() {
		return mpeG4Part10;
	}

	/**
	 * Set the mpeG4 Part 10 profile and level object instance, or {{empty}} if MPEG4 Part 10 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG4Part10 the input value
	 */
	public void  setMpeG4Part10(String mpeG4Part10) {
		this.mpeG4Part10 = mpeG4Part10;
	}

	/**
	 * Set the mpeG4 Part 10 profile and level object instance, or {{empty}} if MPEG4 Part 10 is not used.  For example:

''.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param mpeG4Part10 the input value
	 * @return this instance
	 */
	public VideoDecoder withMpeG4Part10(String mpeG4Part10) {
		this.mpeG4Part10 = mpeG4Part10;
		return this;
	}

	/**
	 * Get the smpTE-VC-1 profile and level object instance, or {{empty}} if SMPTE-VC-1 is not used.  For example:

''.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSmpTEVC1() {
		return smpTEVC1;
	}

	/**
	 * Set the smpTE-VC-1 profile and level object instance, or {{empty}} if SMPTE-VC-1 is not used.  For example:

''.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param smpTEVC1 the input value
	 */
	public void  setSmpTEVC1(String smpTEVC1) {
		this.smpTEVC1 = smpTEVC1;
	}

	/**
	 * Set the smpTE-VC-1 profile and level object instance, or {{empty}} if SMPTE-VC-1 is not used.  For example:

''.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel.2''
	 *
	 * @since 1.0
	 * @param smpTEVC1 the input value
	 * @return this instance
	 */
	public VideoDecoder withSmpTEVC1(String smpTEVC1) {
		this.smpTEVC1 = smpTEVC1;
		return this;
	}

	/**
	 * Get the indicates the native aspect ratio of the content available at this decoder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getContentAspectRatio() {
		return contentAspectRatio;
	}

	/**
	 * Set the indicates the native aspect ratio of the content available at this decoder.
	 *
	 * @since 1.0
	 * @param contentAspectRatio the input value
	 */
	public void  setContentAspectRatio(String contentAspectRatio) {
		this.contentAspectRatio = contentAspectRatio;
	}

	/**
	 * Set the indicates the native aspect ratio of the content available at this decoder.
	 *
	 * @since 1.0
	 * @param contentAspectRatio the input value
	 * @return this instance
	 */
	public VideoDecoder withContentAspectRatio(String contentAspectRatio) {
		this.contentAspectRatio = contentAspectRatio;
		return this;
	}

	//</editor-fold>

}