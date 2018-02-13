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
package org.broadbandforum.tr181.device.routing.routeinformation;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.IPv6Address;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;

	/**
	 * IP Interface RA route information table. Contains received RA route information {{bibref|RFC4191}}. As such, the data in this table cannot be modified.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Routing.RouteInformation.InterfaceSetting.{i}.")
@XmlRootElement(name = "Device.Routing.RouteInformation.InterfaceSetting")
@XmlType(name = "Device.Routing.RouteInformation.InterfaceSetting")
@XmlAccessorType(XmlAccessType.FIELD)
public class InterfaceSetting {

	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Interface")
	@Size(max = 256)
	public String _interface;
	/**
	 * IPv6 Address of the router that sent the RA that included this route info.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceRouter")
	public IPv6Address sourceRouter;
	/**
	 * Flag included in a specific Route Information Option within an RA message (Prf flag), as defined in {{bibref|RFC4191|Section 2.3}}. {{enum}}

          Note that this is not the Prf flag included in the base RA message. Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PreferredRouteFlag")
	public String preferredRouteFlag;
	/**
	 * IPv6 address prefix, as received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Prefix")
	public IPv6Prefix prefix;
	/**
	 * The time at which {{param|Prefix}} will cease to be usable for use as a forwarding entry, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RouteLifetime")
	public LocalDateTime routeLifetime;

	public InterfaceSetting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public InterfaceSetting withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} This is the IP interface associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 * @return this instance
	 */
	public InterfaceSetting with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the ipv6 Address of the router that sent the RA that included this route info.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getSourceRouter() {
		return sourceRouter;
	}

	/**
	 * Set the ipv6 Address of the router that sent the RA that included this route info.
	 *
	 * @since 2.2
	 * @param sourceRouter the input value
	 */
	public void  setSourceRouter(IPv6Address sourceRouter) {
		this.sourceRouter = sourceRouter;
	}

	/**
	 * Set the ipv6 Address of the router that sent the RA that included this route info.
	 *
	 * @since 2.2
	 * @param sourceRouter the input value
	 * @return this instance
	 */
	public InterfaceSetting withSourceRouter(IPv6Address sourceRouter) {
		this.sourceRouter = sourceRouter;
		return this;
	}

	/**
	 * Get the flag included in a specific Route Information Option within an RA message (Prf flag), as defined in {{bibref|RFC4191|Section 2.3}}. {{enum}}

          Note that this is not the Prf flag included in the base RA message. Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getPreferredRouteFlag() {
		return preferredRouteFlag;
	}

	/**
	 * Set the flag included in a specific Route Information Option within an RA message (Prf flag), as defined in {{bibref|RFC4191|Section 2.3}}. {{enum}}

          Note that this is not the Prf flag included in the base RA message. Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @param preferredRouteFlag the input value
	 */
	public void  setPreferredRouteFlag(String preferredRouteFlag) {
		this.preferredRouteFlag = preferredRouteFlag;
	}

	/**
	 * Set the flag included in a specific Route Information Option within an RA message (Prf flag), as defined in {{bibref|RFC4191|Section 2.3}}. {{enum}}

          Note that this is not the Prf flag included in the base RA message. Also see {{bibref|RFC4191|Section 2.1}} which discusses how this flag is encoded on the wire.
	 *
	 * @since 2.2
	 * @param preferredRouteFlag the input value
	 * @return this instance
	 */
	public InterfaceSetting withPreferredRouteFlag(String preferredRouteFlag) {
		this.preferredRouteFlag = preferredRouteFlag;
		return this;
	}

	/**
	 * Get the ipv6 address prefix, as received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Prefix getPrefix() {
		return prefix;
	}

	/**
	 * Set the ipv6 address prefix, as received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 */
	public void  setPrefix(IPv6Prefix prefix) {
		this.prefix = prefix;
	}

	/**
	 * Set the ipv6 address prefix, as received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 * @return this instance
	 */
	public InterfaceSetting withPrefix(IPv6Prefix prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Get the time at which {{param|Prefix}} will cease to be usable for use as a forwarding entry, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getRouteLifetime() {
		return routeLifetime;
	}

	/**
	 * Set the time at which {{param|Prefix}} will cease to be usable for use as a forwarding entry, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @param routeLifetime the input value
	 */
	public void  setRouteLifetime(LocalDateTime routeLifetime) {
		this.routeLifetime = routeLifetime;
	}

	/**
	 * Set the time at which {{param|Prefix}} will cease to be usable for use as a forwarding entry, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is received in an instance of the Route Information Option of a RA message.
	 *
	 * @since 2.2
	 * @param routeLifetime the input value
	 * @return this instance
	 */
	public InterfaceSetting withRouteLifetime(LocalDateTime routeLifetime) {
		this.routeLifetime = routeLifetime;
		return this;
	}

	//</editor-fold>

}