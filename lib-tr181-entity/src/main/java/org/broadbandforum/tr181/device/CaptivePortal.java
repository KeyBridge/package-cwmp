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
	 * This object contains parameters relating to the captive portal configuration on the CPE.

        The captive portal configuration defines the CPE's upstream HTTP (port 80) traffic redirect behavior.

        When the captive portal is disabled, upstream HTTP (port 80) traffic MUST be permitted to all destinations.

        When the captive portal is enabled, upstream HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|URL}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.CaptivePortal.")
@XmlRootElement(name = "CaptivePortal")
@XmlType(name = "Device.CaptivePortal")
@XmlAccessorType(XmlAccessType.FIELD)
public class CaptivePortal {

	/**
	 * Enables or disables the captive portal.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the captive portal.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{list}} List items represent IP addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

          Each entry in the list MUST be either an IP address, or an IP prefix specified using Classless Inter-Domain Routing (CIDR) notation {{bibref|RFC4632}}.

          An IP prefix is specified as an IP address followed (with no intervening white space) by "/n", where ''n'' (the prefix size) is an integer in the range 0-32 (for IPv4) or 0-128 (for IPv6) that indicates the number of (leftmost) '1' bits of the prefix.

          IPv4 example: 

          * 1.2.3.4 specifies a single IPv4 address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

          * 1.2.0.0/22 represents the 1024 IPv4 addresses from 1.2.0.0 to 1.2.3.255. 

          IPv6 example: 

          * fec0::220:edff:fe6a:f76 specifies a single IPv6 address.

          * 2001:edff:fe6a:f76::/64 represents the IPv6 addresses from 2001:edff:fe6a:f76:0:0:0:0 to 2001:edff:fe6a:f76:ffff:ffff:ffff:ffff.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllowedList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 10000)
	@XmlList
	public Collection<String> allowedList;
	/**
	 * Captive portal URL to which upstream HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

          The captive portal URL MUST be an HTTP (not HTTPS) URL.

          The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 2000)
	public String url;

	public CaptivePortal() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the captive portal.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the captive portal.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the captive portal.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the captive portal.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the captive portal.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public CaptivePortal withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{list}} List items represent IP addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

          Each entry in the list MUST be either an IP address, or an IP prefix specified using Classless Inter-Domain Routing (CIDR) notation {{bibref|RFC4632}}.

          An IP prefix is specified as an IP address followed (with no intervening white space) by "/n", where ''n'' (the prefix size) is an integer in the range 0-32 (for IPv4) or 0-128 (for IPv6) that indicates the number of (leftmost) '1' bits of the prefix.

          IPv4 example: 

          * 1.2.3.4 specifies a single IPv4 address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

          * 1.2.0.0/22 represents the 1024 IPv4 addresses from 1.2.0.0 to 1.2.3.255. 

          IPv6 example: 

          * fec0::220:edff:fe6a:f76 specifies a single IPv6 address.

          * 2001:edff:fe6a:f76::/64 represents the IPv6 addresses from 2001:edff:fe6a:f76:0:0:0:0 to 2001:edff:fe6a:f76:ffff:ffff:ffff:ffff.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAllowedList() {
		if (this.allowedList == null){ this.allowedList=new ArrayList<>();}
		return allowedList;
	}

	/**
	 * Set the {{list}} List items represent IP addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

          Each entry in the list MUST be either an IP address, or an IP prefix specified using Classless Inter-Domain Routing (CIDR) notation {{bibref|RFC4632}}.

          An IP prefix is specified as an IP address followed (with no intervening white space) by "/n", where ''n'' (the prefix size) is an integer in the range 0-32 (for IPv4) or 0-128 (for IPv6) that indicates the number of (leftmost) '1' bits of the prefix.

          IPv4 example: 

          * 1.2.3.4 specifies a single IPv4 address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

          * 1.2.0.0/22 represents the 1024 IPv4 addresses from 1.2.0.0 to 1.2.3.255. 

          IPv6 example: 

          * fec0::220:edff:fe6a:f76 specifies a single IPv6 address.

          * 2001:edff:fe6a:f76::/64 represents the IPv6 addresses from 2001:edff:fe6a:f76:0:0:0:0 to 2001:edff:fe6a:f76:ffff:ffff:ffff:ffff.
	 *
	 * @since 2.0
	 * @param allowedList the input value
	 */
	public void  setAllowedList(Collection<String> allowedList) {
		this.allowedList = allowedList;
	}

	/**
	 * Set the {{list}} List items represent IP addresses to which HTTP (port 80) traffic MUST always be permitted, regardless of whether the captive portal is enabled.

          Each entry in the list MUST be either an IP address, or an IP prefix specified using Classless Inter-Domain Routing (CIDR) notation {{bibref|RFC4632}}.

          An IP prefix is specified as an IP address followed (with no intervening white space) by "/n", where ''n'' (the prefix size) is an integer in the range 0-32 (for IPv4) or 0-128 (for IPv6) that indicates the number of (leftmost) '1' bits of the prefix.

          IPv4 example: 

          * 1.2.3.4 specifies a single IPv4 address, and 1.2.3.4/24 specifies a class C subnet with subnet mask 255.255.255.0.

          * 1.2.0.0/22 represents the 1024 IPv4 addresses from 1.2.0.0 to 1.2.3.255. 

          IPv6 example: 

          * fec0::220:edff:fe6a:f76 specifies a single IPv6 address.

          * 2001:edff:fe6a:f76::/64 represents the IPv6 addresses from 2001:edff:fe6a:f76:0:0:0:0 to 2001:edff:fe6a:f76:ffff:ffff:ffff:ffff.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CaptivePortal withAllowedList(String string) {
		getAllowedList().add(string);
		return this;
	}

	/**
	 * Get the captive portal URL to which upstream HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

          The captive portal URL MUST be an HTTP (not HTTPS) URL.

          The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the captive portal URL to which upstream HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

          The captive portal URL MUST be an HTTP (not HTTPS) URL.

          The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 2.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the captive portal URL to which upstream HTTP (port 80) traffic to destinations not listed in the {{param|AllowedList}} will be redirected.

          The captive portal URL MUST be an HTTP (not HTTPS) URL.

          The CPE MUST permit the captive portal URL to be set to {{empty}}, which has the effect of disabling the captive portal (if {{param|Enable}} is {{true}} and the captive portal URL is {{empty}}, {{param|Status}} MUST be {{enum|Error_URLEmpty|Status}}).
	 *
	 * @since 2.0
	 * @param url the input value
	 * @return this instance
	 */
	public CaptivePortal withUrl(String url) {
		this.url = url;
		return this;
	}

	//</editor-fold>

}