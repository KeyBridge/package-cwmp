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
package org.broadbandforum.tr196.fapservice.accessmgmt.legacy;

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
import org.broadbandforum.tr196.fapservice.accessmgmt.legacy.localipaccess.Rule;

	/**
	 * Old Local IP access object, included on special request.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.Legacy.LocalIPAccess.")
@XmlRootElement(name = "FAPService.AccessMgmt.Legacy.LocalIPAccess")
@XmlType(name = "FAPService.AccessMgmt.Legacy.LocalIPAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocalIPAccess {

	/**
	 * Enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The maximum number of entries available in the {{object|.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRulesEntries")
	public Long maxRulesEntries;
	/**
	 * Policy for selecting traffic for local IP access. Originated traffic will be NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do NOT affect traffic to/from the FAP itself (such as TR-069 or control). The rules are applied to the mobile station data traffic (PS-domain) via deep packet inspection or similar method.
	 */
	@XmlElementWrapper(name = "Rules")
	@XmlElement(name = "Rule")
	@CWMPParameter(access = "readWrite")
	public Collection<Rule> rules;

	public LocalIPAccess() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public LocalIPAccess withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRulesEntries() {
		return maxRulesEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxRulesEntries the input value
	 */
	public void  setMaxRulesEntries(Long maxRulesEntries) {
		this.maxRulesEntries = maxRulesEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxRulesEntries the input value
	 * @return this instance
	 */
	public LocalIPAccess withMaxRulesEntries(Long maxRulesEntries) {
		this.maxRulesEntries = maxRulesEntries;
		return this;
	}

	/**
	 * Get the policy for selecting traffic for local IP access. Originated traffic will be NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do NOT affect traffic to/from the FAP itself (such as TR-069 or control). The rules are applied to the mobile station data traffic (PS-domain) via deep packet inspection or similar method.
	 *
	 * @return the value
	 */
	public Collection<Rule> getRules() {
		if (this.rules == null){ this.rules=new ArrayList<>();}
		return rules;
	}

	/**
	 * Set the policy for selecting traffic for local IP access. Originated traffic will be NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do NOT affect traffic to/from the FAP itself (such as TR-069 or control). The rules are applied to the mobile station data traffic (PS-domain) via deep packet inspection or similar method.
	 *
	 * @param rules the input value
	 */
	public void  setRules(Collection<Rule> rules) {
		this.rules = rules;
	}

	/**
	 * Set the policy for selecting traffic for local IP access. Originated traffic will be NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do NOT affect traffic to/from the FAP itself (such as TR-069 or control). The rules are applied to the mobile station data traffic (PS-domain) via deep packet inspection or similar method.
	 *
	 * @param rule the input value
	 * @return this instance
	 */
	public LocalIPAccess withRule(Rule rule) {
		getRules().add(rule);
		return this;
	}

	//</editor-fold>

}