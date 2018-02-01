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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;
import org.broadbandforum.tr181.device.ip.ActivePort;
import org.broadbandforum.tr181.device.ip.Diagnostics;
import org.broadbandforum.tr181.device.ip.Interface;

	/**
	 * IP object that contains the {{object|Interface}}, {{object|ActivePort}}, and {{object|Diagnostics}} objects.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.")
public class IP {

	/**
	 * Indicates whether the device is IPv4 capable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPv4Capable")
	public Boolean ipv4Capable;
	/**
	 * Enables or disables the IPv4 stack, and so the use of IPv4 on the device. This affects only layer 3 and above. 

          When {{false}}, IP interfaces that had been operationally up and passing IPv4 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv6 stack).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv4Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipv4Enable;
	/**
	 * Indicates the status of the IPv4 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv4Status")
	public String ipv4Status;
	/**
	 * Indicates whether the device is IPv6 capable.

          Note: If {{false}}, it is expected that IPv6-related parameters, enumeration values, etc will not be implemented by the device.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv6Capable")
	public Boolean ipv6Capable;
	/**
	 * Enables or disables the IPv6 stack, and so the use of IPv6 on the device. This affects only layer 3 and above.

          When {{false}}, IP interfaces that had been operationally up and passing IPv6 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv4 stack).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv6Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipv6Enable;
	/**
	 * Indicates the status of the IPv6 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv6Status")
	public String ipv6Status;
	/**
	 * The ULA /48 prefix {{bibref|RFC4193|Section 3}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ULAPrefix")
	@CWMPParameter(access = "readWrite")
	public IPv6Prefix ulaPrefix;
	/**
	 * IP interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the layer 3 IP interface.

        Each IP interface can be attached to the IPv4 and/or IPv6 stack.  The interface's IP addresses and prefixes are listed in the {{object|IPv4Address}}, {{object|IPv6Address}} and {{object|IPv6Prefix}} tables.

        Note that support for manipulating {{param|Loopback}} interfaces is OPTIONAL, so the implementation MAY choose not to create (or allow the ACS to create) {{object}} instances of type {{enum|Loopback|Type}}.

        When the ACS administratively disables the interface, i.e. sets {{param|Enable}} to {{false}}, the interface's automatically-assigned IP addresses and prefixes MAY be retained.  When the ACS administratively enables the interface, i.e. sets {{param|Enable}} to {{true}}, these IP addresses and prefixes MUST be refreshed.  It's up to the implementation to decide exactly what this means: it SHOULD take all reasonable steps to refresh everything but if it is unable, for example, to refresh a prefix that still has a significant lifetime, it might well choose to retain rather than discard it.

        Any {{enum|Tunneled|Type}} IP interface instances instantiated by the CPE MUST NOT have any statistics, writable parameters, IP addresses or IPv6 prefixes.  Any read-only parameters, e.g. {{param|Status}}, MUST return the same information as for the corresponding {{enum|Tunnel|Type}} interface.  The reason for these rules is that {{enum|Tunneled|Type}} IP interfaces exist only in order to be the targets of references (within the data model) and do not model any concepts over and above those already modeled by the {{enum|Tunnel|Type}} IP interfaces.

        Note that {{enum|Tunnel|Type}} and {{enum|Tunneled|Type}} IP interfaces are part of a legacy mechanism that is only used for {{object|##.IPv6rd}}, {{object|##.DSLite}} and {{object|##.IPsec}} tunnels and MUST NOT be used in any other context.  For all other tunneling mechanisms {{enum|Normal|Type}} IP interfaces are stacked above technology-specific Tunnel Interfaces, e.g. above {{object|##.GRE.Tunnel.{i}.Interface}} or {{object|##.MAP.Domain.{i}.Interface}} objects.
	 */
	@XmlElementWrapper(name = "interfaces")
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public Collection<Interface> interfaces;
	/**
	 * This table lists the ports on which TCP connections are listening or established.
	 */
	@XmlElementWrapper(name = "activePorts")
	@XmlElement(name = "ActivePort")
	public Collection<ActivePort> activePorts;
	/**
	 * The IP Diagnostics object.
	 */
	@XmlElement(name = "Diagnostics")
	public Diagnostics diagnostics;

	public IP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the device is IPv4 capable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIpv4Capable() {
		return ipv4Capable;
	}

	/**
	 * Set the indicates whether the device is IPv4 capable.
	 *
	 * @since 2.0
	 * @param ipv4Capable the input value
	 */
	public void  setIpv4Capable(Boolean ipv4Capable) {
		this.ipv4Capable = ipv4Capable;
	}

	/**
	 * Set the indicates whether the device is IPv4 capable.
	 *
	 * @since 2.0
	 * @param ipv4Capable the input value
	 * @return this instance
	 */
	public IP withIpv4Capable(Boolean ipv4Capable) {
		this.ipv4Capable = ipv4Capable;
		return this;
	}

	/**
	 * Get the enables or disables the IPv4 stack, and so the use of IPv4 on the device. This affects only layer 3 and above. 

          When {{false}}, IP interfaces that had been operationally up and passing IPv4 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv6 stack).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv4Enable() {
		return ipv4Enable;
	}

	/**
	 * Set the enables or disables the IPv4 stack, and so the use of IPv4 on the device. This affects only layer 3 and above. 

          When {{false}}, IP interfaces that had been operationally up and passing IPv4 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv6 stack).
	 *
	 * @since 2.2
	 * @param ipv4Enable the input value
	 */
	public void  setIpv4Enable(Boolean ipv4Enable) {
		this.ipv4Enable = ipv4Enable;
	}

	/**
	 * Set the enables or disables the IPv4 stack, and so the use of IPv4 on the device. This affects only layer 3 and above. 

          When {{false}}, IP interfaces that had been operationally up and passing IPv4 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv6 stack).
	 *
	 * @since 2.2
	 * @param ipv4Enable the input value
	 * @return this instance
	 */
	public IP withIpv4Enable(Boolean ipv4Enable) {
		this.ipv4Enable = ipv4Enable;
		return this;
	}

	/**
	 * Get the indicates the status of the IPv4 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getIpv4Status() {
		return ipv4Status;
	}

	/**
	 * Set the indicates the status of the IPv4 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param ipv4Status the input value
	 */
	public void  setIpv4Status(String ipv4Status) {
		this.ipv4Status = ipv4Status;
	}

	/**
	 * Set the indicates the status of the IPv4 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param ipv4Status the input value
	 * @return this instance
	 */
	public IP withIpv4Status(String ipv4Status) {
		this.ipv4Status = ipv4Status;
		return this;
	}

	/**
	 * Get the indicates whether the device is IPv6 capable.

          Note: If {{false}}, it is expected that IPv6-related parameters, enumeration values, etc will not be implemented by the device.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv6Capable() {
		return ipv6Capable;
	}

	/**
	 * Set the indicates whether the device is IPv6 capable.

          Note: If {{false}}, it is expected that IPv6-related parameters, enumeration values, etc will not be implemented by the device.
	 *
	 * @since 2.2
	 * @param ipv6Capable the input value
	 */
	public void  setIpv6Capable(Boolean ipv6Capable) {
		this.ipv6Capable = ipv6Capable;
	}

	/**
	 * Set the indicates whether the device is IPv6 capable.

          Note: If {{false}}, it is expected that IPv6-related parameters, enumeration values, etc will not be implemented by the device.
	 *
	 * @since 2.2
	 * @param ipv6Capable the input value
	 * @return this instance
	 */
	public IP withIpv6Capable(Boolean ipv6Capable) {
		this.ipv6Capable = ipv6Capable;
		return this;
	}

	/**
	 * Get the enables or disables the IPv6 stack, and so the use of IPv6 on the device. This affects only layer 3 and above.

          When {{false}}, IP interfaces that had been operationally up and passing IPv6 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv4 stack).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv6Enable() {
		return ipv6Enable;
	}

	/**
	 * Set the enables or disables the IPv6 stack, and so the use of IPv6 on the device. This affects only layer 3 and above.

          When {{false}}, IP interfaces that had been operationally up and passing IPv6 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv4 stack).
	 *
	 * @since 2.2
	 * @param ipv6Enable the input value
	 */
	public void  setIpv6Enable(Boolean ipv6Enable) {
		this.ipv6Enable = ipv6Enable;
	}

	/**
	 * Set the enables or disables the IPv6 stack, and so the use of IPv6 on the device. This affects only layer 3 and above.

          When {{false}}, IP interfaces that had been operationally up and passing IPv6 packets will now no longer be able to do so, and will be operationally down (unless also attached to an enabled IPv4 stack).
	 *
	 * @since 2.2
	 * @param ipv6Enable the input value
	 * @return this instance
	 */
	public IP withIpv6Enable(Boolean ipv6Enable) {
		this.ipv6Enable = ipv6Enable;
		return this;
	}

	/**
	 * Get the indicates the status of the IPv6 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getIpv6Status() {
		return ipv6Status;
	}

	/**
	 * Set the indicates the status of the IPv6 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param ipv6Status the input value
	 */
	public void  setIpv6Status(String ipv6Status) {
		this.ipv6Status = ipv6Status;
	}

	/**
	 * Set the indicates the status of the IPv6 stack.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param ipv6Status the input value
	 * @return this instance
	 */
	public IP withIpv6Status(String ipv6Status) {
		this.ipv6Status = ipv6Status;
		return this;
	}

	/**
	 * Get the ULA /48 prefix {{bibref|RFC4193|Section 3}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Prefix getUlaPrefix() {
		return ulaPrefix;
	}

	/**
	 * Set the ULA /48 prefix {{bibref|RFC4193|Section 3}}.
	 *
	 * @since 2.2
	 * @param ulaPrefix the input value
	 */
	public void  setUlaPrefix(IPv6Prefix ulaPrefix) {
		this.ulaPrefix = ulaPrefix;
	}

	/**
	 * Set the ULA /48 prefix {{bibref|RFC4193|Section 3}}.
	 *
	 * @since 2.2
	 * @param ulaPrefix the input value
	 * @return this instance
	 */
	public IP withUlaPrefix(IPv6Prefix ulaPrefix) {
		this.ulaPrefix = ulaPrefix;
		return this;
	}

	/**
	 * Get the ip interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the layer 3 IP interface.

        Each IP interface can be attached to the IPv4 and/or IPv6 stack.  The interface's IP addresses and prefixes are listed in the {{object|IPv4Address}}, {{object|IPv6Address}} and {{object|IPv6Prefix}} tables.

        Note that support for manipulating {{param|Loopback}} interfaces is OPTIONAL, so the implementation MAY choose not to create (or allow the ACS to create) {{object}} instances of type {{enum|Loopback|Type}}.

        When the ACS administratively disables the interface, i.e. sets {{param|Enable}} to {{false}}, the interface's automatically-assigned IP addresses and prefixes MAY be retained.  When the ACS administratively enables the interface, i.e. sets {{param|Enable}} to {{true}}, these IP addresses and prefixes MUST be refreshed.  It's up to the implementation to decide exactly what this means: it SHOULD take all reasonable steps to refresh everything but if it is unable, for example, to refresh a prefix that still has a significant lifetime, it might well choose to retain rather than discard it.

        Any {{enum|Tunneled|Type}} IP interface instances instantiated by the CPE MUST NOT have any statistics, writable parameters, IP addresses or IPv6 prefixes.  Any read-only parameters, e.g. {{param|Status}}, MUST return the same information as for the corresponding {{enum|Tunnel|Type}} interface.  The reason for these rules is that {{enum|Tunneled|Type}} IP interfaces exist only in order to be the targets of references (within the data model) and do not model any concepts over and above those already modeled by the {{enum|Tunnel|Type}} IP interfaces.

        Note that {{enum|Tunnel|Type}} and {{enum|Tunneled|Type}} IP interfaces are part of a legacy mechanism that is only used for {{object|##.IPv6rd}}, {{object|##.DSLite}} and {{object|##.IPsec}} tunnels and MUST NOT be used in any other context.  For all other tunneling mechanisms {{enum|Normal|Type}} IP interfaces are stacked above technology-specific Tunnel Interfaces, e.g. above {{object|##.GRE.Tunnel.{i}.Interface}} or {{object|##.MAP.Domain.{i}.Interface}} objects.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the ip interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the layer 3 IP interface.

        Each IP interface can be attached to the IPv4 and/or IPv6 stack.  The interface's IP addresses and prefixes are listed in the {{object|IPv4Address}}, {{object|IPv6Address}} and {{object|IPv6Prefix}} tables.

        Note that support for manipulating {{param|Loopback}} interfaces is OPTIONAL, so the implementation MAY choose not to create (or allow the ACS to create) {{object}} instances of type {{enum|Loopback|Type}}.

        When the ACS administratively disables the interface, i.e. sets {{param|Enable}} to {{false}}, the interface's automatically-assigned IP addresses and prefixes MAY be retained.  When the ACS administratively enables the interface, i.e. sets {{param|Enable}} to {{true}}, these IP addresses and prefixes MUST be refreshed.  It's up to the implementation to decide exactly what this means: it SHOULD take all reasonable steps to refresh everything but if it is unable, for example, to refresh a prefix that still has a significant lifetime, it might well choose to retain rather than discard it.

        Any {{enum|Tunneled|Type}} IP interface instances instantiated by the CPE MUST NOT have any statistics, writable parameters, IP addresses or IPv6 prefixes.  Any read-only parameters, e.g. {{param|Status}}, MUST return the same information as for the corresponding {{enum|Tunnel|Type}} interface.  The reason for these rules is that {{enum|Tunneled|Type}} IP interfaces exist only in order to be the targets of references (within the data model) and do not model any concepts over and above those already modeled by the {{enum|Tunnel|Type}} IP interfaces.

        Note that {{enum|Tunnel|Type}} and {{enum|Tunneled|Type}} IP interfaces are part of a legacy mechanism that is only used for {{object|##.IPv6rd}}, {{object|##.DSLite}} and {{object|##.IPsec}} tunnels and MUST NOT be used in any other context.  For all other tunneling mechanisms {{enum|Normal|Type}} IP interfaces are stacked above technology-specific Tunnel Interfaces, e.g. above {{object|##.GRE.Tunnel.{i}.Interface}} or {{object|##.MAP.Domain.{i}.Interface}} objects.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the ip interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the layer 3 IP interface.

        Each IP interface can be attached to the IPv4 and/or IPv6 stack.  The interface's IP addresses and prefixes are listed in the {{object|IPv4Address}}, {{object|IPv6Address}} and {{object|IPv6Prefix}} tables.

        Note that support for manipulating {{param|Loopback}} interfaces is OPTIONAL, so the implementation MAY choose not to create (or allow the ACS to create) {{object}} instances of type {{enum|Loopback|Type}}.

        When the ACS administratively disables the interface, i.e. sets {{param|Enable}} to {{false}}, the interface's automatically-assigned IP addresses and prefixes MAY be retained.  When the ACS administratively enables the interface, i.e. sets {{param|Enable}} to {{true}}, these IP addresses and prefixes MUST be refreshed.  It's up to the implementation to decide exactly what this means: it SHOULD take all reasonable steps to refresh everything but if it is unable, for example, to refresh a prefix that still has a significant lifetime, it might well choose to retain rather than discard it.

        Any {{enum|Tunneled|Type}} IP interface instances instantiated by the CPE MUST NOT have any statistics, writable parameters, IP addresses or IPv6 prefixes.  Any read-only parameters, e.g. {{param|Status}}, MUST return the same information as for the corresponding {{enum|Tunnel|Type}} interface.  The reason for these rules is that {{enum|Tunneled|Type}} IP interfaces exist only in order to be the targets of references (within the data model) and do not model any concepts over and above those already modeled by the {{enum|Tunnel|Type}} IP interfaces.

        Note that {{enum|Tunnel|Type}} and {{enum|Tunneled|Type}} IP interfaces are part of a legacy mechanism that is only used for {{object|##.IPv6rd}}, {{object|##.DSLite}} and {{object|##.IPsec}} tunnels and MUST NOT be used in any other context.  For all other tunneling mechanisms {{enum|Normal|Type}} IP interfaces are stacked above technology-specific Tunnel Interfaces, e.g. above {{object|##.GRE.Tunnel.{i}.Interface}} or {{object|##.MAP.Domain.{i}.Interface}} objects.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public IP withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the this table lists the ports on which TCP connections are listening or established.
	 *
	 * @return the value
	 */
	public Collection<ActivePort> getActivePorts() {
		if (this.activePorts == null){ this.activePorts=new ArrayList<>();}
		return activePorts;
	}

	/**
	 * Set the this table lists the ports on which TCP connections are listening or established.
	 *
	 * @param activePorts the input value
	 */
	public void  setActivePorts(Collection<ActivePort> activePorts) {
		this.activePorts = activePorts;
	}

	/**
	 * Set the this table lists the ports on which TCP connections are listening or established.
	 *
	 * @param activePort the input value
	 * @return this instance
	 */
	public IP withActivePort(ActivePort activePort) {
		getActivePorts().add(activePort);
		return this;
	}

	/**
	 * Get the IP Diagnostics object.
	 *
	 * @return the value
	 */
	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	/**
	 * Set the IP Diagnostics object.
	 *
	 * @param diagnostics the input value
	 */
	public void  setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * Set the IP Diagnostics object.
	 *
	 * @param diagnostics the input value
	 * @return this instance
	 */
	public IP withDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
		return this;
	}

	//</editor-fold>

}