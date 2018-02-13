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
package org.broadbandforum.tr181.device.dlna;

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

	/**
	 * DLNA capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DLNA.Capabilities.")
@XmlRootElement(name = "Capabilities")
@XmlType(name = "Device.DLNA.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * {{list}} Indicates the supported DLNA Home Network Device Classes {{bibref|DLNA-NDIG|Table 4-1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HNDDeviceClass")
	@Size(max = 256)
	@XmlList
	public Collection<String> hndDeviceClass;
	/**
	 * {{list}} Indicates the supported DLNA Device Capabilities {{bibref|DLNA-NDIG|Table 4-2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceCapability")
	@Size(max = 256)
	@XmlList
	public Collection<String> deviceCapability;
	/**
	 * {{list}} Indicates the supported DLNA Home Infrastructure Device Classes {{bibref|DLNA-NDIG|Table 4-4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HIDDeviceClass")
	@Size(max = 256)
	@XmlList
	public Collection<String> hidDeviceClass;
	/**
	 * {{list}} Indicates the DLNA Image Class Profile IDs supported by this device, from Tables 5-2 and 5-3 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ImageClassProfileID")
	@Size(max = 256)
	@XmlList
	public Collection<String> imageClassProfileID;
	/**
	 * {{list}} Indicates the DLNA Audio Class Profile IDs supported by this device, from Tables 5-4 through 5-10 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AudioClassProfileID")
	@Size(max = 256)
	@XmlList
	public Collection<String> audioClassProfileID;
	/**
	 * {{list}} Indicates the DLNA AV Class Profile IDs supported by this device, from Tables 5-11 through 5-15 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AVClassProfileID")
	@Size(max = 256)
	@XmlList
	public Collection<String> avclassProfileID;
	/**
	 * {{list}} Indicates the DLNA Media Collection Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-16}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MediaCollectionProfileID")
	@Size(max = 256)
	@XmlList
	public Collection<String> mediaCollectionProfileID;
	/**
	 * {{list}} Indicates the DLNA Printer Class Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-17}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrinterClassProfileID")
	@Size(max = 256)
	@XmlList
	public Collection<String> printerClassProfileID;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Indicates the supported DLNA Home Network Device Classes {{bibref|DLNA-NDIG|Table 4-1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHndDeviceClass() {
		if (this.hndDeviceClass == null){ this.hndDeviceClass=new ArrayList<>();}
		return hndDeviceClass;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Home Network Device Classes {{bibref|DLNA-NDIG|Table 4-1}}.
	 *
	 * @since 2.0
	 * @param hndDeviceClass the input value
	 */
	public void  setHndDeviceClass(Collection<String> hndDeviceClass) {
		this.hndDeviceClass = hndDeviceClass;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Home Network Device Classes {{bibref|DLNA-NDIG|Table 4-1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withHndDeviceClass(String string) {
		getHndDeviceClass().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the supported DLNA Device Capabilities {{bibref|DLNA-NDIG|Table 4-2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDeviceCapability() {
		if (this.deviceCapability == null){ this.deviceCapability=new ArrayList<>();}
		return deviceCapability;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Device Capabilities {{bibref|DLNA-NDIG|Table 4-2}}.
	 *
	 * @since 2.0
	 * @param deviceCapability the input value
	 */
	public void  setDeviceCapability(Collection<String> deviceCapability) {
		this.deviceCapability = deviceCapability;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Device Capabilities {{bibref|DLNA-NDIG|Table 4-2}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withDeviceCapability(String string) {
		getDeviceCapability().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the supported DLNA Home Infrastructure Device Classes {{bibref|DLNA-NDIG|Table 4-4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHidDeviceClass() {
		if (this.hidDeviceClass == null){ this.hidDeviceClass=new ArrayList<>();}
		return hidDeviceClass;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Home Infrastructure Device Classes {{bibref|DLNA-NDIG|Table 4-4}}.
	 *
	 * @since 2.0
	 * @param hidDeviceClass the input value
	 */
	public void  setHidDeviceClass(Collection<String> hidDeviceClass) {
		this.hidDeviceClass = hidDeviceClass;
	}

	/**
	 * Set the {{list}} Indicates the supported DLNA Home Infrastructure Device Classes {{bibref|DLNA-NDIG|Table 4-4}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withHidDeviceClass(String string) {
		getHidDeviceClass().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the DLNA Image Class Profile IDs supported by this device, from Tables 5-2 and 5-3 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getImageClassProfileID() {
		if (this.imageClassProfileID == null){ this.imageClassProfileID=new ArrayList<>();}
		return imageClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Image Class Profile IDs supported by this device, from Tables 5-2 and 5-3 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param imageClassProfileID the input value
	 */
	public void  setImageClassProfileID(Collection<String> imageClassProfileID) {
		this.imageClassProfileID = imageClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Image Class Profile IDs supported by this device, from Tables 5-2 and 5-3 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withImageClassProfileID(String string) {
		getImageClassProfileID().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the DLNA Audio Class Profile IDs supported by this device, from Tables 5-4 through 5-10 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAudioClassProfileID() {
		if (this.audioClassProfileID == null){ this.audioClassProfileID=new ArrayList<>();}
		return audioClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Audio Class Profile IDs supported by this device, from Tables 5-4 through 5-10 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param audioClassProfileID the input value
	 */
	public void  setAudioClassProfileID(Collection<String> audioClassProfileID) {
		this.audioClassProfileID = audioClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Audio Class Profile IDs supported by this device, from Tables 5-4 through 5-10 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withAudioClassProfileID(String string) {
		getAudioClassProfileID().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the DLNA AV Class Profile IDs supported by this device, from Tables 5-11 through 5-15 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAvclassProfileID() {
		if (this.avclassProfileID == null){ this.avclassProfileID=new ArrayList<>();}
		return avclassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA AV Class Profile IDs supported by this device, from Tables 5-11 through 5-15 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param avclassProfileID the input value
	 */
	public void  setAvclassProfileID(Collection<String> avclassProfileID) {
		this.avclassProfileID = avclassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA AV Class Profile IDs supported by this device, from Tables 5-11 through 5-15 of {{bibref|DLNA-NDIG}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withAvclassProfileID(String string) {
		getAvclassProfileID().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the DLNA Media Collection Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-16}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getMediaCollectionProfileID() {
		if (this.mediaCollectionProfileID == null){ this.mediaCollectionProfileID=new ArrayList<>();}
		return mediaCollectionProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Media Collection Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-16}}.
	 *
	 * @since 2.0
	 * @param mediaCollectionProfileID the input value
	 */
	public void  setMediaCollectionProfileID(Collection<String> mediaCollectionProfileID) {
		this.mediaCollectionProfileID = mediaCollectionProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Media Collection Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-16}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withMediaCollectionProfileID(String string) {
		getMediaCollectionProfileID().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the DLNA Printer Class Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-17}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPrinterClassProfileID() {
		if (this.printerClassProfileID == null){ this.printerClassProfileID=new ArrayList<>();}
		return printerClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Printer Class Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-17}}.
	 *
	 * @since 2.0
	 * @param printerClassProfileID the input value
	 */
	public void  setPrinterClassProfileID(Collection<String> printerClassProfileID) {
		this.printerClassProfileID = printerClassProfileID;
	}

	/**
	 * Set the {{list}} Indicates the DLNA Printer Class Profile IDs supported by this device {{bibref|DLNA-NDIG|Table 5-17}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withPrinterClassProfileID(String string) {
		getPrinterClassProfileID().add(string);
		return this;
	}

	//</editor-fold>

}