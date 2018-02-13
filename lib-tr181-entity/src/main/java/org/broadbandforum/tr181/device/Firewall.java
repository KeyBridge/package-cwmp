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
package org.broadbandforum.tr181.device;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.firewall.Chain;
import org.broadbandforum.tr181.device.firewall.Level;

	/**
	 * Firewall configuration object. The {{param|Config}} parameter enables and disables the Firewall, and can select either a predefined configuration ({{enum|High|Config}} or {{enum|Low|Config}}) or an explicitly-defined {{enum|Advanced|Config}} configuration.

        For an {{enum|Advanced|Config}} configuration, {{param|AdvancedLevel}} controls the currently active Firewall Level, and the Firewall Levels are defined in the {{object|Level}}, {{object|Chain}} and {{object|Chain.{i}.Rule}} tables.

        The Firewall rules modeled by this object operate only on the forwarding path. This means that they affect only routed traffic, and do not affect traffic that is destined for or generated by the CPE.  Note that any {{object|#.NAT}} processing on the ingress packet occurs before Firewall rules are applied so, for example, the Firewall rules will see the translated destination IP address and port in a downstream packet that has passed through the NAT.

        See {{bibref|TR-181i2a2|Appendix VIII}} for an example {{enum|Advanced|Config}} configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Firewall.")
@XmlRootElement(name = "Firewall")
@XmlType(name = "Device.Firewall")
@XmlAccessorType(XmlAccessType.FIELD)
public class Firewall {

	/**
	 * Enables or disables the Firewall.

          Firewalls often implement additional Denial of Service and other vulnerability protections, such as those described in {{bibref|ICSA-Baseline}}. If a {{enum|Stateful|Type}} Firewall is enabled, then it is assumed that all implemented stateful protections are enabled, unless they are overridden by some other part of the data model.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * How this firewall is configured. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Config")
	@CWMPParameter(access = "readWrite")
	public String config;
	/**
	 * Selects the currently active Firewall Level.

          {{param}} only applies when {{param|Config}} is {{enum|Advanced|Config}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AdvancedLevel")
	@CWMPParameter(access = "readWrite")
	public String advancedLevel;
	/**
	 * Firewall Type. {{enum}}

          A {{enum|Stateless}} Firewall treats each packet individually and thus has no concept of sessions.  Therefore a {{enum|Stateless}} Firewall cannot distinguish between unsolicited downstream traffic and downstream traffic in response to outbound messages.  This means that it has to accept all incoming downstream traffic.  Furthermore, because a {{enum|Stateless}} Firewall treats each packet individually, it does not provide any DoS or vulnerability protections.

          A {{enum|Stateful}} Firewall maintains state about previous packets and thus supports sessions.  Therefore a {{enum|Stateful}} Firewall can distinguish between solicited and unsolicited downstream traffic.  In a {{enum|Stateful}} Firewall, explicitly configured rules only apply to unsolicited traffic, and can not cause packets received in response to an upstream request to be dropped.  Furthermore, because a {{enum|Stateful}} Firewall maintains state, it can provide DoS and vulnerability protections.

          A device that has a {{enum|Stateless}} Firewall depends on the NAT to provide protection against unsolicited downstream IPv4 traffic.  This is because, as noted above, a {{enum|Stateless}} Firewall has to be configured to accept all incoming downstream traffic.  For IPv6 there is no NAT, so a {{enum|Stateless}} Firewall can not provide simple security protections against unsolicited downstream IPv6 traffic.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * A string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Version")
	@Size(max = 16)
	public String version;
	/**
	 * The time at which the firewall settings most recently changed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	public LocalDateTime lastChange;
	/**
	 * Firewall Level table. When an {{enum|Advanced|#.Config}} configuration is selected, {{param|#.AdvancedLevel}} selects the currently active entry in this table. Each {{object}} table entry references the {{object|#.Chain}} that contains the rules for this level.
	 */
	@XmlElementWrapper(name = "Levels")
	@XmlElement(name = "Level")
	@CWMPParameter(access = "readWrite")
	public Collection<Level> levels;
	/**
	 * Firewall Chain table. Each entry contains an ordered list of {{object|Rule}} objects which can themselves reference other {{object}} instances. A hierarchy of rules can therefore be created.

        A given Firewall Chain's rules are all created by the same entity, as indicated by the {{param|Creator}} parameter.
	 */
	@XmlElementWrapper(name = "Chains")
	@XmlElement(name = "Chain")
	@CWMPParameter(access = "readWrite")
	public Collection<Chain> chains;

	public Firewall() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the Firewall.

          Firewalls often implement additional Denial of Service and other vulnerability protections, such as those described in {{bibref|ICSA-Baseline}}. If a {{enum|Stateful|Type}} Firewall is enabled, then it is assumed that all implemented stateful protections are enabled, unless they are overridden by some other part of the data model.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the Firewall.

          Firewalls often implement additional Denial of Service and other vulnerability protections, such as those described in {{bibref|ICSA-Baseline}}. If a {{enum|Stateful|Type}} Firewall is enabled, then it is assumed that all implemented stateful protections are enabled, unless they are overridden by some other part of the data model.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the Firewall.

          Firewalls often implement additional Denial of Service and other vulnerability protections, such as those described in {{bibref|ICSA-Baseline}}. If a {{enum|Stateful|Type}} Firewall is enabled, then it is assumed that all implemented stateful protections are enabled, unless they are overridden by some other part of the data model.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public Firewall withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the how this firewall is configured. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getConfig() {
		return config;
	}

	/**
	 * Set the how this firewall is configured. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @param config the input value
	 */
	public void  setConfig(String config) {
		this.config = config;
	}

	/**
	 * Set the how this firewall is configured. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @param config the input value
	 * @return this instance
	 */
	public Firewall withConfig(String config) {
		this.config = config;
		return this;
	}

	/**
	 * Get the selects the currently active Firewall Level.

          {{param}} only applies when {{param|Config}} is {{enum|Advanced|Config}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getAdvancedLevel() {
		return advancedLevel;
	}

	/**
	 * Set the selects the currently active Firewall Level.

          {{param}} only applies when {{param|Config}} is {{enum|Advanced|Config}}.
	 *
	 * @since 2.2
	 * @param advancedLevel the input value
	 */
	public void  setAdvancedLevel(String advancedLevel) {
		this.advancedLevel = advancedLevel;
	}

	/**
	 * Set the selects the currently active Firewall Level.

          {{param}} only applies when {{param|Config}} is {{enum|Advanced|Config}}.
	 *
	 * @since 2.2
	 * @param advancedLevel the input value
	 * @return this instance
	 */
	public Firewall withAdvancedLevel(String advancedLevel) {
		this.advancedLevel = advancedLevel;
		return this;
	}

	/**
	 * Get the firewall Type. {{enum}}

          A {{enum|Stateless}} Firewall treats each packet individually and thus has no concept of sessions.  Therefore a {{enum|Stateless}} Firewall cannot distinguish between unsolicited downstream traffic and downstream traffic in response to outbound messages.  This means that it has to accept all incoming downstream traffic.  Furthermore, because a {{enum|Stateless}} Firewall treats each packet individually, it does not provide any DoS or vulnerability protections.

          A {{enum|Stateful}} Firewall maintains state about previous packets and thus supports sessions.  Therefore a {{enum|Stateful}} Firewall can distinguish between solicited and unsolicited downstream traffic.  In a {{enum|Stateful}} Firewall, explicitly configured rules only apply to unsolicited traffic, and can not cause packets received in response to an upstream request to be dropped.  Furthermore, because a {{enum|Stateful}} Firewall maintains state, it can provide DoS and vulnerability protections.

          A device that has a {{enum|Stateless}} Firewall depends on the NAT to provide protection against unsolicited downstream IPv4 traffic.  This is because, as noted above, a {{enum|Stateless}} Firewall has to be configured to accept all incoming downstream traffic.  For IPv6 there is no NAT, so a {{enum|Stateless}} Firewall can not provide simple security protections against unsolicited downstream IPv6 traffic.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the firewall Type. {{enum}}

          A {{enum|Stateless}} Firewall treats each packet individually and thus has no concept of sessions.  Therefore a {{enum|Stateless}} Firewall cannot distinguish between unsolicited downstream traffic and downstream traffic in response to outbound messages.  This means that it has to accept all incoming downstream traffic.  Furthermore, because a {{enum|Stateless}} Firewall treats each packet individually, it does not provide any DoS or vulnerability protections.

          A {{enum|Stateful}} Firewall maintains state about previous packets and thus supports sessions.  Therefore a {{enum|Stateful}} Firewall can distinguish between solicited and unsolicited downstream traffic.  In a {{enum|Stateful}} Firewall, explicitly configured rules only apply to unsolicited traffic, and can not cause packets received in response to an upstream request to be dropped.  Furthermore, because a {{enum|Stateful}} Firewall maintains state, it can provide DoS and vulnerability protections.

          A device that has a {{enum|Stateless}} Firewall depends on the NAT to provide protection against unsolicited downstream IPv4 traffic.  This is because, as noted above, a {{enum|Stateless}} Firewall has to be configured to accept all incoming downstream traffic.  For IPv6 there is no NAT, so a {{enum|Stateless}} Firewall can not provide simple security protections against unsolicited downstream IPv6 traffic.
	 *
	 * @since 2.2
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the firewall Type. {{enum}}

          A {{enum|Stateless}} Firewall treats each packet individually and thus has no concept of sessions.  Therefore a {{enum|Stateless}} Firewall cannot distinguish between unsolicited downstream traffic and downstream traffic in response to outbound messages.  This means that it has to accept all incoming downstream traffic.  Furthermore, because a {{enum|Stateless}} Firewall treats each packet individually, it does not provide any DoS or vulnerability protections.

          A {{enum|Stateful}} Firewall maintains state about previous packets and thus supports sessions.  Therefore a {{enum|Stateful}} Firewall can distinguish between solicited and unsolicited downstream traffic.  In a {{enum|Stateful}} Firewall, explicitly configured rules only apply to unsolicited traffic, and can not cause packets received in response to an upstream request to be dropped.  Furthermore, because a {{enum|Stateful}} Firewall maintains state, it can provide DoS and vulnerability protections.

          A device that has a {{enum|Stateless}} Firewall depends on the NAT to provide protection against unsolicited downstream IPv4 traffic.  This is because, as noted above, a {{enum|Stateless}} Firewall has to be configured to accept all incoming downstream traffic.  For IPv6 there is no NAT, so a {{enum|Stateless}} Firewall can not provide simple security protections against unsolicited downstream IPv6 traffic.
	 *
	 * @since 2.2
	 * @param type the input value
	 * @return this instance
	 */
	public Firewall withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 2.0
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set a string identifying the firewall settings version currently used in the CPE, or {{empty}} if the firewall settings are not associated with a version.
	 *
	 * @since 2.0
	 * @param version the input value
	 * @return this instance
	 */
	public Firewall withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the time at which the firewall settings most recently changed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastChange() {
		return lastChange;
	}

	/**
	 * Set the time at which the firewall settings most recently changed.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(LocalDateTime lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the time at which the firewall settings most recently changed.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Firewall withLastChange(LocalDateTime lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the firewall Level table. When an {{enum|Advanced|#.Config}} configuration is selected, {{param|#.AdvancedLevel}} selects the currently active entry in this table. Each {{object}} table entry references the {{object|#.Chain}} that contains the rules for this level.
	 *
	 * @return the value
	 */
	public Collection<Level> getLevels() {
		if (this.levels == null){ this.levels=new ArrayList<>();}
		return levels;
	}

	/**
	 * Set the firewall Level table. When an {{enum|Advanced|#.Config}} configuration is selected, {{param|#.AdvancedLevel}} selects the currently active entry in this table. Each {{object}} table entry references the {{object|#.Chain}} that contains the rules for this level.
	 *
	 * @param levels the input value
	 */
	public void  setLevels(Collection<Level> levels) {
		this.levels = levels;
	}

	/**
	 * Set the firewall Level table. When an {{enum|Advanced|#.Config}} configuration is selected, {{param|#.AdvancedLevel}} selects the currently active entry in this table. Each {{object}} table entry references the {{object|#.Chain}} that contains the rules for this level.
	 *
	 * @param level the input value
	 * @return this instance
	 */
	public Firewall withLevel(Level level) {
		getLevels().add(level);
		return this;
	}

	/**
	 * Get the firewall Chain table. Each entry contains an ordered list of {{object|Rule}} objects which can themselves reference other {{object}} instances. A hierarchy of rules can therefore be created.

        A given Firewall Chain's rules are all created by the same entity, as indicated by the {{param|Creator}} parameter.
	 *
	 * @return the value
	 */
	public Collection<Chain> getChains() {
		if (this.chains == null){ this.chains=new ArrayList<>();}
		return chains;
	}

	/**
	 * Set the firewall Chain table. Each entry contains an ordered list of {{object|Rule}} objects which can themselves reference other {{object}} instances. A hierarchy of rules can therefore be created.

        A given Firewall Chain's rules are all created by the same entity, as indicated by the {{param|Creator}} parameter.
	 *
	 * @param chains the input value
	 */
	public void  setChains(Collection<Chain> chains) {
		this.chains = chains;
	}

	/**
	 * Set the firewall Chain table. Each entry contains an ordered list of {{object|Rule}} objects which can themselves reference other {{object}} instances. A hierarchy of rules can therefore be created.

        A given Firewall Chain's rules are all created by the same entity, as indicated by the {{param|Creator}} parameter.
	 *
	 * @param chain the input value
	 * @return this instance
	 */
	public Firewall withChain(Chain chain) {
		getChains().add(chain);
		return this;
	}

	//</editor-fold>

}