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
package org.broadbandforum.tr196.fapservice.rem.cdma2000;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.macrotiming.Channel;

	/**
	 * Parameters for controlling CDMA2000 system timing derived from macro system sniffing.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.MacroTiming.")
@XmlRootElement(name = "FAPService.REM.CDMA2000.MacroTiming")
@XmlType(name = "FAPService.REM.CDMA2000.MacroTiming")
@XmlAccessorType(XmlAccessType.FIELD)
public class MacroTiming {

	/**
	 * This is the Admin State of Macro Timing. Lock means MacroTiming feature is Enabled. Unlock means MacroTiming feature is disabled.  0 - Lock (Enabled), 1 - Unlock (Disabled).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdminState")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long adminState;
	/**
	 * Channel number of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrackingChannelNumber")
	@CWMPParameter(activeNotify = "canDeny")
	public Long trackingChannelNumber;
	/**
	 * BandClass of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrackingBandClass")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 31)
	public Long trackingBandClass;
	/**
	 * {{list}} Each item is a (single value) PN offset in units of 64 PN chips of a Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrackingPNOffset")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> trackingPNOffset;
	/**
	 * This parameter indicates the timing source for the FAP:

0 - GPS

1 - Macro Timing

The other read-only parameters in this object only have valid values when timingsource is set to 1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimingSource")
	@Size(min = 0, max = 1)
	public Long timingSource;
	/**
	 * Object used to configure list of channels to be used for Macto Timing.
	 */
	@XmlElementWrapper(name = "Channels")
	@XmlElement(name = "Channel")
	@CWMPParameter(access = "readWrite")
	public Collection<Channel> channels;

	public MacroTiming() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this is the Admin State of Macro Timing. Lock means MacroTiming feature is Enabled. Unlock means MacroTiming feature is disabled.  0 - Lock (Enabled), 1 - Unlock (Disabled).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAdminState() {
		return adminState;
	}

	/**
	 * Set the this is the Admin State of Macro Timing. Lock means MacroTiming feature is Enabled. Unlock means MacroTiming feature is disabled.  0 - Lock (Enabled), 1 - Unlock (Disabled).
	 *
	 * @since 2.0
	 * @param adminState the input value
	 */
	public void  setAdminState(Long adminState) {
		this.adminState = adminState;
	}

	/**
	 * Set the this is the Admin State of Macro Timing. Lock means MacroTiming feature is Enabled. Unlock means MacroTiming feature is disabled.  0 - Lock (Enabled), 1 - Unlock (Disabled).
	 *
	 * @since 2.0
	 * @param adminState the input value
	 * @return this instance
	 */
	public MacroTiming withAdminState(Long adminState) {
		this.adminState = adminState;
		return this;
	}

	/**
	 * Get the channel number of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrackingChannelNumber() {
		return trackingChannelNumber;
	}

	/**
	 * Set the channel number of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param trackingChannelNumber the input value
	 */
	public void  setTrackingChannelNumber(Long trackingChannelNumber) {
		this.trackingChannelNumber = trackingChannelNumber;
	}

	/**
	 * Set the channel number of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param trackingChannelNumber the input value
	 * @return this instance
	 */
	public MacroTiming withTrackingChannelNumber(Long trackingChannelNumber) {
		this.trackingChannelNumber = trackingChannelNumber;
		return this;
	}

	/**
	 * Get the bandClass of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrackingBandClass() {
		return trackingBandClass;
	}

	/**
	 * Set the bandClass of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param trackingBandClass the input value
	 */
	public void  setTrackingBandClass(Long trackingBandClass) {
		this.trackingBandClass = trackingBandClass;
	}

	/**
	 * Set the bandClass of Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param trackingBandClass the input value
	 * @return this instance
	 */
	public MacroTiming withTrackingBandClass(Long trackingBandClass) {
		this.trackingBandClass = trackingBandClass;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a (single value) PN offset in units of 64 PN chips of a Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTrackingPNOffset() {
		if (this.trackingPNOffset == null){ this.trackingPNOffset=new ArrayList<>();}
		return trackingPNOffset;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips of a Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param trackingPNOffset the input value
	 */
	public void  setTrackingPNOffset(Collection<String> trackingPNOffset) {
		this.trackingPNOffset = trackingPNOffset;
	}

	/**
	 * Set the {{list}} Each item is a (single value) PN offset in units of 64 PN chips of a Macro Base Station currently used for MacroTiming.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public MacroTiming withTrackingPNOffset(String string) {
		getTrackingPNOffset().add(string);
		return this;
	}

	/**
	 * Get the this parameter indicates the timing source for the FAP:

0 - GPS

1 - Macro Timing

The other read-only parameters in this object only have valid values when timingsource is set to 1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimingSource() {
		return timingSource;
	}

	/**
	 * Set the this parameter indicates the timing source for the FAP:

0 - GPS

1 - Macro Timing

The other read-only parameters in this object only have valid values when timingsource is set to 1.
	 *
	 * @since 2.0
	 * @param timingSource the input value
	 */
	public void  setTimingSource(Long timingSource) {
		this.timingSource = timingSource;
	}

	/**
	 * Set the this parameter indicates the timing source for the FAP:

0 - GPS

1 - Macro Timing

The other read-only parameters in this object only have valid values when timingsource is set to 1.
	 *
	 * @since 2.0
	 * @param timingSource the input value
	 * @return this instance
	 */
	public MacroTiming withTimingSource(Long timingSource) {
		this.timingSource = timingSource;
		return this;
	}

	/**
	 * Get the object used to configure list of channels to be used for Macto Timing.
	 *
	 * @return the value
	 */
	public Collection<Channel> getChannels() {
		if (this.channels == null){ this.channels=new ArrayList<>();}
		return channels;
	}

	/**
	 * Set the object used to configure list of channels to be used for Macto Timing.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * Set the object used to configure list of channels to be used for Macto Timing.
	 *
	 * @param channel the input value
	 * @return this instance
	 */
	public MacroTiming withChannel(Channel channel) {
		getChannels().add(channel);
		return this;
	}

	//</editor-fold>

}