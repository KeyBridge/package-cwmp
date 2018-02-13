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
package org.broadbandforum.tr181.device.bridging;

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

	/**
	 * Provider Bridge table.

        A Provider Bridge is described in {{bibref|802.1Q-2011|section 5.10 Provider Bridge conformance}} as an entity that is comprised of one S-VLAN component and zero or more C-VLAN components. S-VLAN and C-VLAN components are modelled as instances of {{object|#.Bridge}} objects.

        When {{param|Type}} is configured with value of {{enum|PE|Type}} VLAN tags from the S-VLAN component (outer of 2 VLAN tags) are stacked on top of the VLAN tag from the C-VLAN component (inner of 2 VLAN tags).

        When {{param|Type}} is configured with value of {{enum|S-VLAN|Type}} only VLAN tags from the S-VLAN component are utilized.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.Bridging.ProviderBridge.{i}.")
@XmlRootElement(name = "Device.Bridging.ProviderBridge")
@XmlType(name = "Device.Bridging.ProviderBridge")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProviderBridge {

	/**
	 * Enables or disables this {{object}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this {{object}}. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. For example when the {{param|Type}} is configured with value of {{enum|PE|Type}} but {{param|CVLANComponents}} is {{empty}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * A non-volatile handle used to reference this instance. This parameter provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String alias;
	/**
	 * Selects the standard supported by this {{object}} table entry.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type;
	/**
	 * {{reference|a {{object|#.Bridge}} instance that specifies the S-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SVLANComponent")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String svlANComponent;
	/**
	 * {{list}} {{reference|a {{object|#.Bridge}} instance that specifies a C-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CVLANComponents")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> cvlANComponents;

	public ProviderBridge() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public ProviderBridge withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}}. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. For example when the {{param|Type}} is configured with value of {{enum|PE|Type}} but {{param|CVLANComponents}} is {{empty}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this {{object}}. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. For example when the {{param|Type}} is configured with value of {{enum|PE|Type}} but {{param|CVLANComponents}} is {{empty}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.7
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this {{object}}. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid. For example when the {{param|Type}} is configured with value of {{enum|PE|Type}} but {{param|CVLANComponents}} is {{empty}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.7
	 * @param status the input value
	 * @return this instance
	 */
	public ProviderBridge withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get a non-volatile handle used to reference this instance. This parameter provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. This parameter provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. This parameter provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public ProviderBridge withAlias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the selects the standard supported by this {{object}} table entry.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the selects the standard supported by this {{object}} table entry.
	 *
	 * @since 2.7
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the selects the standard supported by this {{object}} table entry.
	 *
	 * @since 2.7
	 * @param type the input value
	 * @return this instance
	 */
	public ProviderBridge withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the {{reference|a {{object|#.Bridge}} instance that specifies the S-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getSvlANComponent() {
		return svlANComponent;
	}

	/**
	 * Set the {{reference|a {{object|#.Bridge}} instance that specifies the S-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @param svlANComponent the input value
	 */
	public void  setSvlANComponent(String svlANComponent) {
		this.svlANComponent = svlANComponent;
	}

	/**
	 * Set the {{reference|a {{object|#.Bridge}} instance that specifies the S-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @param svlANComponent the input value
	 * @return this instance
	 */
	public ProviderBridge withSvlANComponent(String svlANComponent) {
		this.svlANComponent = svlANComponent;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|a {{object|#.Bridge}} instance that specifies a C-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getCvlANComponents() {
		if (this.cvlANComponents == null){ this.cvlANComponents=new ArrayList<>();}
		return cvlANComponents;
	}

	/**
	 * Set the {{list}} {{reference|a {{object|#.Bridge}} instance that specifies a C-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @param cvlANComponents the input value
	 */
	public void  setCvlANComponents(Collection<String> cvlANComponents) {
		this.cvlANComponents = cvlANComponents;
	}

	/**
	 * Set the {{list}} {{reference|a {{object|#.Bridge}} instance that specifies a C-VLAN component for the {{object}}}}
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public ProviderBridge withCvlANComponents(String string) {
		getCvlANComponents().add(string);
		return this;
	}

	//</editor-fold>

}