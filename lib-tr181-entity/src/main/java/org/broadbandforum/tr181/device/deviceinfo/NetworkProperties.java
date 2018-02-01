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
package org.broadbandforum.tr181.device.deviceinfo;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object defines the parameters that describe how the device handles network traffic.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.NetworkProperties.")
public class NetworkProperties {

	/**
	 * The maximum number of bytes of outstanding data a sender can send on a particular connection prior to an acknowledgment {{bibref|RFC793}}.  Any scaling factor SHOULD be included in this parameter {{bibref|RFC1323}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTCPWindowSize")
	public Long maxTCPWindowSize;
	/**
	 * {{list}} Indicates the TCP congestion control mechanism(s) implemented. 

Enumerated value must be one of [Tahoe, Reno, New Reno, Vegas]

          Tahoe, Reno, and New Reno are defined in {{bibref|RFC2582}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCPImplementation")
	@XmlList
	public Collection<String> tcpImplementation;

	public NetworkProperties() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of bytes of outstanding data a sender can send on a particular connection prior to an acknowledgment {{bibref|RFC793}}.  Any scaling factor SHOULD be included in this parameter {{bibref|RFC1323}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxTCPWindowSize() {
		return maxTCPWindowSize;
	}

	/**
	 * Set the maximum number of bytes of outstanding data a sender can send on a particular connection prior to an acknowledgment {{bibref|RFC793}}.  Any scaling factor SHOULD be included in this parameter {{bibref|RFC1323}}.
	 *
	 * @since 2.0
	 * @param maxTCPWindowSize the input value
	 */
	public void  setMaxTCPWindowSize(Long maxTCPWindowSize) {
		this.maxTCPWindowSize = maxTCPWindowSize;
	}

	/**
	 * Set the maximum number of bytes of outstanding data a sender can send on a particular connection prior to an acknowledgment {{bibref|RFC793}}.  Any scaling factor SHOULD be included in this parameter {{bibref|RFC1323}}.
	 *
	 * @since 2.0
	 * @param maxTCPWindowSize the input value
	 * @return this instance
	 */
	public NetworkProperties withMaxTCPWindowSize(Long maxTCPWindowSize) {
		this.maxTCPWindowSize = maxTCPWindowSize;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the TCP congestion control mechanism(s) implemented. 

Enumerated value must be one of [Tahoe, Reno, New Reno, Vegas]

          Tahoe, Reno, and New Reno are defined in {{bibref|RFC2582}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTcpImplementation() {
		if (this.tcpImplementation == null){ this.tcpImplementation=new ArrayList<>();}
		return tcpImplementation;
	}

	/**
	 * Set the {{list}} Indicates the TCP congestion control mechanism(s) implemented. 

Enumerated value must be one of [Tahoe, Reno, New Reno, Vegas]

          Tahoe, Reno, and New Reno are defined in {{bibref|RFC2582}}
	 *
	 * @since 2.0
	 * @param tcpImplementation the input value
	 */
	public void  setTcpImplementation(Collection<String> tcpImplementation) {
		this.tcpImplementation = tcpImplementation;
	}

	/**
	 * Set the {{list}} Indicates the TCP congestion control mechanism(s) implemented. 

Enumerated value must be one of [Tahoe, Reno, New Reno, Vegas]

          Tahoe, Reno, and New Reno are defined in {{bibref|RFC2582}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public NetworkProperties withTcpImplementation(String string) {
		getTcpImplementation().add(string);
		return this;
	}

	//</editor-fold>

}