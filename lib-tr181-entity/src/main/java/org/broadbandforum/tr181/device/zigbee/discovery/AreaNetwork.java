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
package org.broadbandforum.tr181.device.zigbee.discovery;

import java.time.LocalDateTime;
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
	 * This object specifies the ZigBee devices that are discovered by the {{param|Coordinator}}.

        As the ZigBee specification does not provide a discovery protocol between the CWMP proxy and the ZigBee coordinator, the {{object}} object is provisioned and not discovered.
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.Discovery.AreaNetwork.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Coordinator"})})
@XmlRootElement(name = "Device.ZigBee.Discovery.AreaNetwork")
@XmlType(name = "Device.ZigBee.Discovery.AreaNetwork")
@XmlAccessorType(XmlAccessType.FIELD)
public class AreaNetwork {

	/**
	 * Enables or disables discovery of the ZigBee devices in this {{object}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The date and time when this {{object}} or its member devices (i.e., the devices with ZDOs listed in {{param|ZDOList}}) were updated due to a discovery operation.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;
	/**
	 * The status of the current discovery operation.

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The Fully Qualified Domain Name (FQDN) or IP address of the ZigBee Coordinator.  The coordinator MAY be located within the CPE. In this scenario the ACS or CPE MAY use the value of "localhost".
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Coordinator")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String coordinator;
	/**
	 * The ZDO object for this device that is used to discover the ZigBee capabilities of attached devices.

          {{reference}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ZDOReference")
	@Size(max = 256)
	public String zdoReference;
	/**
	 * The list of ZDO objects discovered in this Area Network by the ZigBee Coordinator.

          {{reference}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ZDOList")
	@XmlList
	public Collection<String> zdoList;

	public AreaNetwork() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables discovery of the ZigBee devices in this {{object}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables discovery of the ZigBee devices in this {{object}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables discovery of the ZigBee devices in this {{object}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public AreaNetwork withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the date and time when this {{object}} or its member devices (i.e., the devices with ZDOs listed in {{param|ZDOList}}) were updated due to a discovery operation.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date and time when this {{object}} or its member devices (i.e., the devices with ZDOs listed in {{param|ZDOList}}) were updated due to a discovery operation.
	 *
	 * @since 2.7
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date and time when this {{object}} or its member devices (i.e., the devices with ZDOs listed in {{param|ZDOList}}) were updated due to a discovery operation.
	 *
	 * @since 2.7
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public AreaNetwork withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get the status of the current discovery operation.

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the current discovery operation.

          {{enum}}
	 *
	 * @since 2.7
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the current discovery operation.

          {{enum}}
	 *
	 * @since 2.7
	 * @param status the input value
	 * @return this instance
	 */
	public AreaNetwork withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public AreaNetwork withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the Fully Qualified Domain Name (FQDN) or IP address of the ZigBee Coordinator.  The coordinator MAY be located within the CPE. In this scenario the ACS or CPE MAY use the value of "localhost".
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getCoordinator() {
		return coordinator;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP address of the ZigBee Coordinator.  The coordinator MAY be located within the CPE. In this scenario the ACS or CPE MAY use the value of "localhost".
	 *
	 * @since 2.7
	 * @param coordinator the input value
	 */
	public void  setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP address of the ZigBee Coordinator.  The coordinator MAY be located within the CPE. In this scenario the ACS or CPE MAY use the value of "localhost".
	 *
	 * @since 2.7
	 * @param coordinator the input value
	 * @return this instance
	 */
	public AreaNetwork withCoordinator(String coordinator) {
		this.coordinator = coordinator;
		return this;
	}

	/**
	 * Get the ZDO object for this device that is used to discover the ZigBee capabilities of attached devices.

          {{reference}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getZdoReference() {
		return zdoReference;
	}

	/**
	 * Set the ZDO object for this device that is used to discover the ZigBee capabilities of attached devices.

          {{reference}}
	 *
	 * @since 2.7
	 * @param zdoReference the input value
	 */
	public void  setZdoReference(String zdoReference) {
		this.zdoReference = zdoReference;
	}

	/**
	 * Set the ZDO object for this device that is used to discover the ZigBee capabilities of attached devices.

          {{reference}}
	 *
	 * @since 2.7
	 * @param zdoReference the input value
	 * @return this instance
	 */
	public AreaNetwork withZdoReference(String zdoReference) {
		this.zdoReference = zdoReference;
		return this;
	}

	/**
	 * Get the list of ZDO objects discovered in this Area Network by the ZigBee Coordinator.

          {{reference}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getZdoList() {
		if (this.zdoList == null){ this.zdoList=new ArrayList<>();}
		return zdoList;
	}

	/**
	 * Set the list of ZDO objects discovered in this Area Network by the ZigBee Coordinator.

          {{reference}}
	 *
	 * @since 2.7
	 * @param zdoList the input value
	 */
	public void  setZdoList(Collection<String> zdoList) {
		this.zdoList = zdoList;
	}

	/**
	 * Set the list of ZDO objects discovered in this Area Network by the ZigBee Coordinator.

          {{reference}}
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public AreaNetwork withZdoList(String string) {
		getZdoList().add(string);
		return this;
	}

	//</editor-fold>

}