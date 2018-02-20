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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.usb.Interface;
import org.broadbandforum.tr181.device.usb.Port;
import org.broadbandforum.tr181.device.usb.USBHosts;

	/**
	 * Universal Serial Bus ({{bibref|USB1.0}}, {{bibref|USB2.0}}, {{bibref|USB3.0}}). This object contains the {{object|Interface}}, {{object|Port}}, and {{object|USBHosts}} objects.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.USB.")
@XmlRootElement(name = "Device.USB")
@XmlType(name = "Device.USB")
@XmlAccessorType(XmlAccessType.FIELD)
public class USB {

	/**
	 * USB interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models master and slave USB physical interfaces that support carrying Ethernet frames, e.g. via the USB Communication Device Class.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * USB Port table. This table models master and slave USB physical ports on the device.
	 */
	@XmlElementWrapper(name = "Ports")
	@XmlElement(name = "Port")
	public Collection<Port> ports;
	/**
	 * This object models the CPE's USB Host controllers.

        See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 */
	@XmlElement(name = "USBHosts")
	public USBHosts usbHosts;

	public USB() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the usb interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models master and slave USB physical interfaces that support carrying Ethernet frames, e.g. via the USB Communication Device Class.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the usb interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models master and slave USB physical interfaces that support carrying Ethernet frames, e.g. via the USB Communication Device Class.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the usb interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models master and slave USB physical interfaces that support carrying Ethernet frames, e.g. via the USB Communication Device Class.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public USB withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the usb Port table. This table models master and slave USB physical ports on the device.
	 *
	 * @return the value
	 */
	public Collection<Port> getPorts() {
		if (this.ports == null){ this.ports=new ArrayList<>();}
		return ports;
	}

	/**
	 * Set the usb Port table. This table models master and slave USB physical ports on the device.
	 *
	 * @param ports the input value
	 */
	public void  setPorts(Collection<Port> ports) {
		this.ports = ports;
	}

	/**
	 * Set the usb Port table. This table models master and slave USB physical ports on the device.
	 *
	 * @param port the input value
	 * @return this instance
	 */
	public USB withPort(Port port) {
		getPorts().add(port);
		return this;
	}

	/**
	 * Get the this object models the CPE's USB Host controllers.

        See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @return the value
	 */
	public USBHosts getUsbHosts() {
		return usbHosts;
	}

	/**
	 * Set the this object models the CPE's USB Host controllers.

        See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @param usbHosts the input value
	 */
	public void  setUsbHosts(USBHosts usbHosts) {
		this.usbHosts = usbHosts;
	}

	/**
	 * Set the this object models the CPE's USB Host controllers.

        See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @param usbHosts the input value
	 * @return this instance
	 */
	public USB withUsbHosts(USBHosts usbHosts) {
		this.usbHosts = usbHosts;
		return this;
	}

	//</editor-fold>

}