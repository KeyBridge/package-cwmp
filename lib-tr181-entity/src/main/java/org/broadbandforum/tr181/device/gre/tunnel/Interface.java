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
package org.broadbandforum.tr181.device.gre.tunnel;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.gre.tunnel._interface.Stats;

	/**
	 * GRE Interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). The {{object}} object models the GRE Header as defined in {{bibref|RFC2784}} and extensions to the GRE Header as defined in {{bibref|RFC2890}}. The {{object}} object provides a way to discriminate how sessions or flows are encapsulated within the GRE Tunnel. In addition the {{object}} object represents the entry point and exit point of the tunnel in relation to the LAN interface. Unless the Key Identifier of {{bibref|RFC2890}} is supported there is only one instance of this {{object}} object per tunnel.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.GRE.Tunnel.{i}.Interface.{i}.")
@XmlRootElement(name = "Device.GRE.Tunnel.Interface")
@XmlType(name = "Device.GRE.Tunnel.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * Enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * The Protocol ID assigned to this {{object}}. The Protocol Id is the EtherType value used to identify the encapsulated payload. When set to {{null}} the CPE determines the Protocol Id.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ProtocolIdOverride")
	@CWMPParameter(access = "readWrite")
	public Long protocolIdOverride = 0L;
	/**
	 * When {{true}}, includes the "Checksum" field in the GRE header as defined in {{bibref|RFC2784}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UseChecksum")
	@CWMPParameter(access = "readWrite")
	public Boolean useChecksum = false;
	/**
	 * The method used to generate the Key Identifier extension as defined in.{{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeyIdentifierGenerationPolicy")
	@CWMPParameter(access = "readWrite")
	public String keyIdentifierGenerationPolicy = "Disabled";
	/**
	 * When the value of {{param|KeyIdentifierGenerationPolicy}} is {{enum|Provisioned|KeyIdentifierGenerationPolicy}} this {{param}} parameter is used to identify an individual traffic flow within a GRE tunnel, as defined in {{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeyIdentifier")
	@CWMPParameter(access = "readWrite")
	public Long keyIdentifier = 0L;
	/**
	 * When {{true}}, includes the "SequenceNumber" field in the GRE header as defined in {{bibref|RFC2890}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UseSequenceNumber")
	@CWMPParameter(access = "readWrite")
	public Boolean useSequenceNumber = false;
	/**
	 * Statistics for this GRE tunnel interface, i.e. all traffic that has passed through the interface.

        The device MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e., the interface's Status parameter transitions to a down state after the interface has been disabled) or when the interface becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.8
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.8
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.8
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the Protocol ID assigned to this {{object}}. The Protocol Id is the EtherType value used to identify the encapsulated payload. When set to {{null}} the CPE determines the Protocol Id.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getProtocolIdOverride() {
		return protocolIdOverride;
	}

	/**
	 * Set the Protocol ID assigned to this {{object}}. The Protocol Id is the EtherType value used to identify the encapsulated payload. When set to {{null}} the CPE determines the Protocol Id.
	 *
	 * @since 2.8
	 * @param protocolIdOverride the input value
	 */
	public void  setProtocolIdOverride(Long protocolIdOverride) {
		this.protocolIdOverride = protocolIdOverride;
	}

	/**
	 * Set the Protocol ID assigned to this {{object}}. The Protocol Id is the EtherType value used to identify the encapsulated payload. When set to {{null}} the CPE determines the Protocol Id.
	 *
	 * @since 2.8
	 * @param protocolIdOverride the input value
	 * @return this instance
	 */
	public Interface withProtocolIdOverride(Long protocolIdOverride) {
		this.protocolIdOverride = protocolIdOverride;
		return this;
	}

	/**
	 * Get the when {{true}}, includes the "Checksum" field in the GRE header as defined in {{bibref|RFC2784}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isUseChecksum() {
		return useChecksum;
	}

	/**
	 * Set the when {{true}}, includes the "Checksum" field in the GRE header as defined in {{bibref|RFC2784}}.
	 *
	 * @since 2.8
	 * @param useChecksum the input value
	 */
	public void  setUseChecksum(Boolean useChecksum) {
		this.useChecksum = useChecksum;
	}

	/**
	 * Set the when {{true}}, includes the "Checksum" field in the GRE header as defined in {{bibref|RFC2784}}.
	 *
	 * @since 2.8
	 * @param useChecksum the input value
	 * @return this instance
	 */
	public Interface withUseChecksum(Boolean useChecksum) {
		this.useChecksum = useChecksum;
		return this;
	}

	/**
	 * Get the method used to generate the Key Identifier extension as defined in.{{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getKeyIdentifierGenerationPolicy() {
		return keyIdentifierGenerationPolicy;
	}

	/**
	 * Set the method used to generate the Key Identifier extension as defined in.{{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @param keyIdentifierGenerationPolicy the input value
	 */
	public void  setKeyIdentifierGenerationPolicy(String keyIdentifierGenerationPolicy) {
		this.keyIdentifierGenerationPolicy = keyIdentifierGenerationPolicy;
	}

	/**
	 * Set the method used to generate the Key Identifier extension as defined in.{{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @param keyIdentifierGenerationPolicy the input value
	 * @return this instance
	 */
	public Interface withKeyIdentifierGenerationPolicy(String keyIdentifierGenerationPolicy) {
		this.keyIdentifierGenerationPolicy = keyIdentifierGenerationPolicy;
		return this;
	}

	/**
	 * Get the when the value of {{param|KeyIdentifierGenerationPolicy}} is {{enum|Provisioned|KeyIdentifierGenerationPolicy}} this {{param}} parameter is used to identify an individual traffic flow within a GRE tunnel, as defined in {{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getKeyIdentifier() {
		return keyIdentifier;
	}

	/**
	 * Set the when the value of {{param|KeyIdentifierGenerationPolicy}} is {{enum|Provisioned|KeyIdentifierGenerationPolicy}} this {{param}} parameter is used to identify an individual traffic flow within a GRE tunnel, as defined in {{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @param keyIdentifier the input value
	 */
	public void  setKeyIdentifier(Long keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	/**
	 * Set the when the value of {{param|KeyIdentifierGenerationPolicy}} is {{enum|Provisioned|KeyIdentifierGenerationPolicy}} this {{param}} parameter is used to identify an individual traffic flow within a GRE tunnel, as defined in {{bibref|RFC2890}}.
	 *
	 * @since 2.8
	 * @param keyIdentifier the input value
	 * @return this instance
	 */
	public Interface withKeyIdentifier(Long keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
		return this;
	}

	/**
	 * Get the when {{true}}, includes the "SequenceNumber" field in the GRE header as defined in {{bibref|RFC2890}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isUseSequenceNumber() {
		return useSequenceNumber;
	}

	/**
	 * Set the when {{true}}, includes the "SequenceNumber" field in the GRE header as defined in {{bibref|RFC2890}}
	 *
	 * @since 2.8
	 * @param useSequenceNumber the input value
	 */
	public void  setUseSequenceNumber(Boolean useSequenceNumber) {
		this.useSequenceNumber = useSequenceNumber;
	}

	/**
	 * Set the when {{true}}, includes the "SequenceNumber" field in the GRE header as defined in {{bibref|RFC2890}}
	 *
	 * @since 2.8
	 * @param useSequenceNumber the input value
	 * @return this instance
	 */
	public Interface withUseSequenceNumber(Boolean useSequenceNumber) {
		this.useSequenceNumber = useSequenceNumber;
		return this;
	}

	/**
	 * Get the statistics for this GRE tunnel interface, i.e. all traffic that has passed through the interface.

        The device MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e., the interface's Status parameter transitions to a down state after the interface has been disabled) or when the interface becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this GRE tunnel interface, i.e. all traffic that has passed through the interface.

        The device MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e., the interface's Status parameter transitions to a down state after the interface has been disabled) or when the interface becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this GRE tunnel interface, i.e. all traffic that has passed through the interface.

        The device MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e., the interface's Status parameter transitions to a down state after the interface has been disabled) or when the interface becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}