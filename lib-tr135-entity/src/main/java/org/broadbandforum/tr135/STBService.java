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
package org.broadbandforum.tr135;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr135.stbservice.AVPlayers;
import org.broadbandforum.tr135.stbservice.AVStreams;
import org.broadbandforum.tr135.stbservice.Applications;
import org.broadbandforum.tr135.stbservice.Capabilities;
import org.broadbandforum.tr135.stbservice.Components;
import org.broadbandforum.tr135.stbservice.ServiceMonitoring;

	/**
	 * The top-level object for an STB CPE.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService")
@XmlType(name = "STBService")
@XmlAccessorType(XmlAccessType.FIELD)
public class STBService {

	/**
	 * Enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The overall capabilities of the STB CPE.  This is a constant read-only object, meaning that only a firmware update will cause these values to be altered.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * Details of STB logical or physical internal components. Unlike the {{object|.Capabilities}} object, which is read-only and which doesn't describe individual instances, this object contains some writeable parameters.
	 */
	@XmlElement(name = "Components")
	public Components components;
	/**
	 * AV Streams object.  If more than one AV stream can be active at a time, it may contain several {{object|AVStream}} instances.
	 */
	@XmlElement(name = "AVStreams")
	public AVStreams avstreams;
	/**
	 * AV Players object.  If more than one AV player can be active at a time, it may contain several {{object|AVPlayer}} instances. 

AV players are created statically. Each AV player corresponds to a combination of several AV streams (one main screen video, several PIP, one audio) being connected to an AV presentation device (such as a TV set).

There is no guarantee that the STB has the resources to enable all of its AV players at the same time.
	 */
	@XmlElement(name = "AVPlayers")
	public AVPlayers avplayers;
	/**
	 * {{marktemplate|diffs-1&2}}---Contains statistics relating to the QoS / QoE of Main AV streams. These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:---

+++Records events and collects QoS / QoE related statistics for Main AV streams.+++

+++These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:+++

* '''Total''' statistics, which count the number of occurrences of something.

* '''Sample''' statistics, which are measured over a sample interval, and are made available to the ACS as a list of the most recent n samples.

Total statistics are always collected (collection cannot be disabled, but the values can be reset).

For Sample statistics, an STB uses a single sample interval and number of samples (n) for all {{object|MainStream}} instances.  The sample interval can be aligned with absolute time.

When Sample statistics collection is enabled, statistics collection MUST proceed regardless of whether there are any active Main AV streams.  For example, even when the STB is not receiving any data, sample intervals will continue to be timed as normal.

Refer to {{bibref|TR-135|I.3}} for non-normative explanation of the operation of the ''ServiceMonitoring'' object.
	 */
	@XmlElement(name = "ServiceMonitoring")
	public ServiceMonitoring serviceMonitoring;
	/**
	 * Applications.
	 */
	@XmlElement(name = "Applications")
	public Applications applications;

	public STBService() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} instance.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public STBService withEnable(Boolean enable) {
		this.enable = enable;
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
	public STBService withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the overall capabilities of the STB CPE.  This is a constant read-only object, meaning that only a firmware update will cause these values to be altered.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the overall capabilities of the STB CPE.  This is a constant read-only object, meaning that only a firmware update will cause these values to be altered.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the overall capabilities of the STB CPE.  This is a constant read-only object, meaning that only a firmware update will cause these values to be altered.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public STBService withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the details of STB logical or physical internal components. Unlike the {{object|.Capabilities}} object, which is read-only and which doesn't describe individual instances, this object contains some writeable parameters.
	 *
	 * @return the value
	 */
	public Components getComponents() {
		return components;
	}

	/**
	 * Set the details of STB logical or physical internal components. Unlike the {{object|.Capabilities}} object, which is read-only and which doesn't describe individual instances, this object contains some writeable parameters.
	 *
	 * @param components the input value
	 */
	public void  setComponents(Components components) {
		this.components = components;
	}

	/**
	 * Set the details of STB logical or physical internal components. Unlike the {{object|.Capabilities}} object, which is read-only and which doesn't describe individual instances, this object contains some writeable parameters.
	 *
	 * @param components the input value
	 * @return this instance
	 */
	public STBService withComponents(Components components) {
		this.components = components;
		return this;
	}

	/**
	 * Get av Streams object.  If more than one AV stream can be active at a time, it may contain several {{object|AVStream}} instances.
	 *
	 * @return the value
	 */
	public AVStreams getAvstreams() {
		return avstreams;
	}

	/**
	 * Set av Streams object.  If more than one AV stream can be active at a time, it may contain several {{object|AVStream}} instances.
	 *
	 * @param avstreams the input value
	 */
	public void  setAvstreams(AVStreams avstreams) {
		this.avstreams = avstreams;
	}

	/**
	 * Set av Streams object.  If more than one AV stream can be active at a time, it may contain several {{object|AVStream}} instances.
	 *
	 * @param avstreams the input value
	 * @return this instance
	 */
	public STBService withAvstreams(AVStreams avstreams) {
		this.avstreams = avstreams;
		return this;
	}

	/**
	 * Get av Players object.  If more than one AV player can be active at a time, it may contain several {{object|AVPlayer}} instances. 

AV players are created statically. Each AV player corresponds to a combination of several AV streams (one main screen video, several PIP, one audio) being connected to an AV presentation device (such as a TV set).

There is no guarantee that the STB has the resources to enable all of its AV players at the same time.
	 *
	 * @return the value
	 */
	public AVPlayers getAvplayers() {
		return avplayers;
	}

	/**
	 * Set av Players object.  If more than one AV player can be active at a time, it may contain several {{object|AVPlayer}} instances. 

AV players are created statically. Each AV player corresponds to a combination of several AV streams (one main screen video, several PIP, one audio) being connected to an AV presentation device (such as a TV set).

There is no guarantee that the STB has the resources to enable all of its AV players at the same time.
	 *
	 * @param avplayers the input value
	 */
	public void  setAvplayers(AVPlayers avplayers) {
		this.avplayers = avplayers;
	}

	/**
	 * Set av Players object.  If more than one AV player can be active at a time, it may contain several {{object|AVPlayer}} instances. 

AV players are created statically. Each AV player corresponds to a combination of several AV streams (one main screen video, several PIP, one audio) being connected to an AV presentation device (such as a TV set).

There is no guarantee that the STB has the resources to enable all of its AV players at the same time.
	 *
	 * @param avplayers the input value
	 * @return this instance
	 */
	public STBService withAvplayers(AVPlayers avplayers) {
		this.avplayers = avplayers;
		return this;
	}

	/**
	 * Get the {{marktemplate|diffs-1&2}}---Contains statistics relating to the QoS / QoE of Main AV streams. These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:---

+++Records events and collects QoS / QoE related statistics for Main AV streams.+++

+++These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:+++

* '''Total''' statistics, which count the number of occurrences of something.

* '''Sample''' statistics, which are measured over a sample interval, and are made available to the ACS as a list of the most recent n samples.

Total statistics are always collected (collection cannot be disabled, but the values can be reset).

For Sample statistics, an STB uses a single sample interval and number of samples (n) for all {{object|MainStream}} instances.  The sample interval can be aligned with absolute time.

When Sample statistics collection is enabled, statistics collection MUST proceed regardless of whether there are any active Main AV streams.  For example, even when the STB is not receiving any data, sample intervals will continue to be timed as normal.

Refer to {{bibref|TR-135|I.3}} for non-normative explanation of the operation of the ''ServiceMonitoring'' object.
	 *
	 * @return the value
	 */
	public ServiceMonitoring getServiceMonitoring() {
		return serviceMonitoring;
	}

	/**
	 * Set the {{marktemplate|diffs-1&2}}---Contains statistics relating to the QoS / QoE of Main AV streams. These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:---

+++Records events and collects QoS / QoE related statistics for Main AV streams.+++

+++These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:+++

* '''Total''' statistics, which count the number of occurrences of something.

* '''Sample''' statistics, which are measured over a sample interval, and are made available to the ACS as a list of the most recent n samples.

Total statistics are always collected (collection cannot be disabled, but the values can be reset).

For Sample statistics, an STB uses a single sample interval and number of samples (n) for all {{object|MainStream}} instances.  The sample interval can be aligned with absolute time.

When Sample statistics collection is enabled, statistics collection MUST proceed regardless of whether there are any active Main AV streams.  For example, even when the STB is not receiving any data, sample intervals will continue to be timed as normal.

Refer to {{bibref|TR-135|I.3}} for non-normative explanation of the operation of the ''ServiceMonitoring'' object.
	 *
	 * @param serviceMonitoring the input value
	 */
	public void  setServiceMonitoring(ServiceMonitoring serviceMonitoring) {
		this.serviceMonitoring = serviceMonitoring;
	}

	/**
	 * Set the {{marktemplate|diffs-1&2}}---Contains statistics relating to the QoS / QoE of Main AV streams. These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:---

+++Records events and collects QoS / QoE related statistics for Main AV streams.+++

+++These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:+++

* '''Total''' statistics, which count the number of occurrences of something.

* '''Sample''' statistics, which are measured over a sample interval, and are made available to the ACS as a list of the most recent n samples.

Total statistics are always collected (collection cannot be disabled, but the values can be reset).

For Sample statistics, an STB uses a single sample interval and number of samples (n) for all {{object|MainStream}} instances.  The sample interval can be aligned with absolute time.

When Sample statistics collection is enabled, statistics collection MUST proceed regardless of whether there are any active Main AV streams.  For example, even when the STB is not receiving any data, sample intervals will continue to be timed as normal.

Refer to {{bibref|TR-135|I.3}} for non-normative explanation of the operation of the ''ServiceMonitoring'' object.
	 *
	 * @param serviceMonitoring the input value
	 * @return this instance
	 */
	public STBService withServiceMonitoring(ServiceMonitoring serviceMonitoring) {
		this.serviceMonitoring = serviceMonitoring;
		return this;
	}

	/**
	 * Get applications.
	 *
	 * @return the value
	 */
	public Applications getApplications() {
		return applications;
	}

	/**
	 * Set applications.
	 *
	 * @param applications the input value
	 */
	public void  setApplications(Applications applications) {
		this.applications = applications;
	}

	/**
	 * Set applications.
	 *
	 * @param applications the input value
	 * @return this instance
	 */
	public STBService withApplications(Applications applications) {
		this.applications = applications;
		return this;
	}

	//</editor-fold>

}