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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the captive portal configuration on the CPE.

The captive portal configuration defines the CPE's WAN-destined  HTTP (port 80) traffic redirect behavior.

When the captive portal is disabled, WAN-destined HTTP (port 80) traffic MUST be permitted to all destinations.

When the captive portal is enabled, WAN-destined HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|CaptivePortalURL}}.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.CaptivePortal.")
public class CaptivePortal {

	/**
	 * Enables or disables the captive portal.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the captive portal.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * IP addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

Each entry in the list MUST be either an IP address or an IP subnet specified using variable length subnet mask (VLSM) syntax.

An IP subnet is specified as an IP address followed (with no intervening white space) by "/n", where  n is an integer in the range  0-32; this is equivalent to a subnet mask consisting of n 1s followed by 32 minus n 0s.

For example, 1.2.3.4 specifies a single IP address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

The maximum length of a single entry (plus comma) is 19 characters so 10000 bytes is sufficient for more than 500 IP addresses and/or IP subnets.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AllowedList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 10000)
	@XmlList
	public Collection<String> allowedList;
	/**
	 * Captive portal URL to which WAN-destined HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

The captive portal URL MUST be an HTTP (not HTTPS) URL.

The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "CaptivePortalURL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 2000)
	public String captivePortalURL;

	public CaptivePortal() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the captive portal.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the captive portal.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the captive portal.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public CaptivePortal withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the captive portal.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the captive portal.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the captive portal.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @param status the input value
	 * @return this instance
	 */
	public CaptivePortal withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the ip addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

Each entry in the list MUST be either an IP address or an IP subnet specified using variable length subnet mask (VLSM) syntax.

An IP subnet is specified as an IP address followed (with no intervening white space) by "/n", where  n is an integer in the range  0-32; this is equivalent to a subnet mask consisting of n 1s followed by 32 minus n 0s.

For example, 1.2.3.4 specifies a single IP address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

The maximum length of a single entry (plus comma) is 19 characters so 10000 bytes is sufficient for more than 500 IP addresses and/or IP subnets.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getAllowedList() {
		if (this.allowedList == null){ this.allowedList=new ArrayList<>();}
		return allowedList;
	}

	/**
	 * Set the ip addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

Each entry in the list MUST be either an IP address or an IP subnet specified using variable length subnet mask (VLSM) syntax.

An IP subnet is specified as an IP address followed (with no intervening white space) by "/n", where  n is an integer in the range  0-32; this is equivalent to a subnet mask consisting of n 1s followed by 32 minus n 0s.

For example, 1.2.3.4 specifies a single IP address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

The maximum length of a single entry (plus comma) is 19 characters so 10000 bytes is sufficient for more than 500 IP addresses and/or IP subnets.
	 *
	 * @since 1.4
	 * @param allowedList the input value
	 */
	public void  setAllowedList(Collection<String> allowedList) {
		this.allowedList = allowedList;
	}

	/**
	 * Set the ip addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

Each entry in the list MUST be either an IP address or an IP subnet specified using variable length subnet mask (VLSM) syntax.

An IP subnet is specified as an IP address followed (with no intervening white space) by "/n", where  n is an integer in the range  0-32; this is equivalent to a subnet mask consisting of n 1s followed by 32 minus n 0s.

For example, 1.2.3.4 specifies a single IP address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

The maximum length of a single entry (plus comma) is 19 characters so 10000 bytes is sufficient for more than 500 IP addresses and/or IP subnets.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public CaptivePortal withAllowedList(String string) {
		getAllowedList().add(string);
		return this;
	}

	/**
	 * Get the captive portal URL to which WAN-destined HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

The captive portal URL MUST be an HTTP (not HTTPS) URL.

The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getCaptivePortalURL() {
		return captivePortalURL;
	}

	/**
	 * Set the captive portal URL to which WAN-destined HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

The captive portal URL MUST be an HTTP (not HTTPS) URL.

The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 1.4
	 * @param captivePortalURL the input value
	 */
	public void  setCaptivePortalURL(String captivePortalURL) {
		this.captivePortalURL = captivePortalURL;
	}

	/**
	 * Set the captive portal URL to which WAN-destined HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

The captive portal URL MUST be an HTTP (not HTTPS) URL.

The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 1.4
	 * @param captivePortalURL the input value
	 * @return this instance
	 */
	public CaptivePortal withCaptivePortalURL(String captivePortalURL) {
		this.captivePortalURL = captivePortalURL;
		return this;
	}

	//</editor-fold>

}