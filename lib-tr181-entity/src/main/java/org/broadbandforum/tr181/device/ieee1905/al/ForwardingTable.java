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
package org.broadbandforum.tr181.device.ieee1905.al;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ieee1905.al.forwardingtable.ForwardingRule;

	/**
	 * This object represents the rules to forward PDUs between interfaces within the 1905 Abstraction Layer.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.ForwardingTable.")
@XmlRootElement(name = "Device.IEEE1905.AL.ForwardingTable")
@XmlType(name = "Device.IEEE1905.AL.ForwardingTable")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForwardingTable {

	/**
	 * Abstraction Layer ability to set, modify, and remove {{object|ForwardingRule}} entries for interfaces. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "SetForwardingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean setForwardingEnabled;
	/**
	 * The 1905 fowarding rule for the ALME-SET-FWD-RULE.request and ALME-GET-FWD-RULES.response with classification criteria as defined in {{bibref|IEEE1905.1a|Table 5-9: ClassificationSet elements}}.
	 */
	@XmlElementWrapper(name = "ForwardingRules")
	@XmlElement(name = "ForwardingRule")
	@CWMPParameter(access = "readWrite")
	public Collection<ForwardingRule> forwardingRules;

	public ForwardingTable() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get abstraction Layer ability to set, modify, and remove {{object|ForwardingRule}} entries for interfaces. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isSetForwardingEnabled() {
		return setForwardingEnabled;
	}

	/**
	 * Set abstraction Layer ability to set, modify, and remove {{object|ForwardingRule}} entries for interfaces. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @param setForwardingEnabled the input value
	 */
	public void  setSetForwardingEnabled(Boolean setForwardingEnabled) {
		this.setForwardingEnabled = setForwardingEnabled;
	}

	/**
	 * Set abstraction Layer ability to set, modify, and remove {{object|ForwardingRule}} entries for interfaces. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @param setForwardingEnabled the input value
	 * @return this instance
	 */
	public ForwardingTable withSetForwardingEnabled(Boolean setForwardingEnabled) {
		this.setForwardingEnabled = setForwardingEnabled;
		return this;
	}

	/**
	 * Get the 1905 fowarding rule for the ALME-SET-FWD-RULE.request and ALME-GET-FWD-RULES.response with classification criteria as defined in {{bibref|IEEE1905.1a|Table 5-9: ClassificationSet elements}}.
	 *
	 * @return the value
	 */
	public Collection<ForwardingRule> getForwardingRules() {
		if (this.forwardingRules == null){ this.forwardingRules=new ArrayList<>();}
		return forwardingRules;
	}

	/**
	 * Set the 1905 fowarding rule for the ALME-SET-FWD-RULE.request and ALME-GET-FWD-RULES.response with classification criteria as defined in {{bibref|IEEE1905.1a|Table 5-9: ClassificationSet elements}}.
	 *
	 * @param forwardingRules the input value
	 */
	public void  setForwardingRules(Collection<ForwardingRule> forwardingRules) {
		this.forwardingRules = forwardingRules;
	}

	/**
	 * Set the 1905 fowarding rule for the ALME-SET-FWD-RULE.request and ALME-GET-FWD-RULES.response with classification criteria as defined in {{bibref|IEEE1905.1a|Table 5-9: ClassificationSet elements}}.
	 *
	 * @param forwardingRule the input value
	 * @return this instance
	 */
	public ForwardingTable withForwardingRule(ForwardingRule forwardingRule) {
		getForwardingRules().add(forwardingRule);
		return this;
	}

	//</editor-fold>

}