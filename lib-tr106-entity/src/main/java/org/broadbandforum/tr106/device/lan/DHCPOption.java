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
package org.broadbandforum.tr106.device.lan;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is for configuration of DHCP options.  Each instance of this object represents a DHCP option to be included by the DHCP client in client requests.  The DHCP client MAY include any other options not specified in this table.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.LAN.DHCPOption.{i}.")
@XmlRootElement(name = "Device.LAN.DHCPOption")
@XmlType(name = "Device.LAN.DHCPOption")
@XmlAccessorType(XmlAccessType.FIELD)
public class DHCPOption {

	/**
	 * Whether this entry represents a request to the DHCP server, or a value to be sent by the DHCP client.

* When {{true}}, this entry represents a request.  In this case, the DHCP client MUST include the specified {{param|Tag}} in the Parameter Request List, as defined in RFC 2132.  The {{param|Value}} parameter is ignored in this case.

* When {{false}}, this entry represents a value to be sent by the DHCP client.  In this case, the DHCP client MUST include a DHCP option formed from the {{param|Tag}} and {{param|Value}} parameters (with the Length derived from the length of the {{param|Value}} parameter).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Request")
	@CWMPParameter(access = "readWrite")
	public Boolean request;
	/**
	 * Tag of the DHCP option as defined in RFC 2132.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Tag")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 254)
	public Long tag;
	/**
	 * Base64 encoded octet string to be used as the Value of the DHCP option if {{param|Request}} is {{false}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public String value;

	public DHCPOption() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the whether this entry represents a request to the DHCP server, or a value to be sent by the DHCP client.

* When {{true}}, this entry represents a request.  In this case, the DHCP client MUST include the specified {{param|Tag}} in the Parameter Request List, as defined in RFC 2132.  The {{param|Value}} parameter is ignored in this case.

* When {{false}}, this entry represents a value to be sent by the DHCP client.  In this case, the DHCP client MUST include a DHCP option formed from the {{param|Tag}} and {{param|Value}} parameters (with the Length derived from the length of the {{param|Value}} parameter).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isRequest() {
		return request;
	}

	/**
	 * Set the whether this entry represents a request to the DHCP server, or a value to be sent by the DHCP client.

* When {{true}}, this entry represents a request.  In this case, the DHCP client MUST include the specified {{param|Tag}} in the Parameter Request List, as defined in RFC 2132.  The {{param|Value}} parameter is ignored in this case.

* When {{false}}, this entry represents a value to be sent by the DHCP client.  In this case, the DHCP client MUST include a DHCP option formed from the {{param|Tag}} and {{param|Value}} parameters (with the Length derived from the length of the {{param|Value}} parameter).
	 *
	 * @since 1.0
	 * @param request the input value
	 */
	public void  setRequest(Boolean request) {
		this.request = request;
	}

	/**
	 * Set the whether this entry represents a request to the DHCP server, or a value to be sent by the DHCP client.

* When {{true}}, this entry represents a request.  In this case, the DHCP client MUST include the specified {{param|Tag}} in the Parameter Request List, as defined in RFC 2132.  The {{param|Value}} parameter is ignored in this case.

* When {{false}}, this entry represents a value to be sent by the DHCP client.  In this case, the DHCP client MUST include a DHCP option formed from the {{param|Tag}} and {{param|Value}} parameters (with the Length derived from the length of the {{param|Value}} parameter).
	 *
	 * @since 1.0
	 * @param request the input value
	 * @return this instance
	 */
	public DHCPOption withRequest(Boolean request) {
		this.request = request;
		return this;
	}

	/**
	 * Get the tag of the DHCP option as defined in RFC 2132.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTag() {
		return tag;
	}

	/**
	 * Set the tag of the DHCP option as defined in RFC 2132.
	 *
	 * @since 1.0
	 * @param tag the input value
	 */
	public void  setTag(Long tag) {
		this.tag = tag;
	}

	/**
	 * Set the tag of the DHCP option as defined in RFC 2132.
	 *
	 * @since 1.0
	 * @param tag the input value
	 * @return this instance
	 */
	public DHCPOption withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get the base64 encoded octet string to be used as the Value of the DHCP option if {{param|Request}} is {{false}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the base64 encoded octet string to be used as the Value of the DHCP option if {{param|Request}} is {{false}}.
	 *
	 * @since 1.0
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 * Set the base64 encoded octet string to be used as the Value of the DHCP option if {{param|Request}} is {{false}}.
	 *
	 * @since 1.0
	 * @param value the input value
	 * @return this instance
	 */
	public DHCPOption withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}