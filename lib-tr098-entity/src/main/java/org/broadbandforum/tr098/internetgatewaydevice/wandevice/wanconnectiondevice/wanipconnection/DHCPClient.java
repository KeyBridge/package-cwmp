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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.dhcpclient.ReqDHCPOption;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.dhcpclient.SentDHCPOption;

	/**
	 * This object contains DHCP client configuration parameters.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.DHCPClient.")
public class DHCPClient {

	/**
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All sent DHCP options MUST be listed.
	 */
	@XmlElementWrapper(name = "sentDHCPOptions")
	@XmlElement(name = "SentDHCPOption")
	@CWMPParameter(access = "readWrite")
	public Collection<SentDHCPOption> sentDHCPOptions;
	/**
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests. All requested DHCP options MUST be listed.
	 */
	@XmlElementWrapper(name = "reqDHCPOptions")
	@XmlElement(name = "ReqDHCPOption")
	@CWMPParameter(access = "readWrite")
	public Collection<ReqDHCPOption> reqDHCPOptions;

	public DHCPClient() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All sent DHCP options MUST be listed.
	 *
	 * @return the value
	 */
	public Collection<SentDHCPOption> getSentDHCPOptions() {
		if (this.sentDHCPOptions == null){ this.sentDHCPOptions=new ArrayList<>();}
		return sentDHCPOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All sent DHCP options MUST be listed.
	 *
	 * @param sentDHCPOptions the input value
	 */
	public void  setSentDHCPOptions(Collection<SentDHCPOption> sentDHCPOptions) {
		this.sentDHCPOptions = sentDHCPOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All sent DHCP options MUST be listed.
	 *
	 * @param sentDHCPOption the input value
	 * @return this instance
	 */
	public DHCPClient withSentDHCPOption(SentDHCPOption sentDHCPOption) {
		getSentDHCPOptions().add(sentDHCPOption);
		return this;
	}

	/**
	 * Get the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests. All requested DHCP options MUST be listed.
	 *
	 * @return the value
	 */
	public Collection<ReqDHCPOption> getReqDHCPOptions() {
		if (this.reqDHCPOptions == null){ this.reqDHCPOptions=new ArrayList<>();}
		return reqDHCPOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests. All requested DHCP options MUST be listed.
	 *
	 * @param reqDHCPOptions the input value
	 */
	public void  setReqDHCPOptions(Collection<ReqDHCPOption> reqDHCPOptions) {
		this.reqDHCPOptions = reqDHCPOptions;
	}

	/**
	 * Set the each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests. All requested DHCP options MUST be listed.
	 *
	 * @param reqDHCPOption the input value
	 * @return this instance
	 */
	public DHCPClient withReqDHCPOption(ReqDHCPOption reqDHCPOption) {
		getReqDHCPOptions().add(reqDHCPOption);
		return this;
	}

	//</editor-fold>

}