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
package org.broadbandforum.tr262.fap.tunnel;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Virtual Interfaces used for associating the tunnel (ephemeral) childSA pairs with QoS Classification and Queue tables as defined in {{bibref|TR-098a2}} (InternetGatewayDevice.QueueManagement.Classification.{i}. and InternetGatewayDevice.QueueManagement.Queue.{i}.) or {{bibref|TR-181i2}} (Device.QoS.Classification.{i}. and Device.QoS.Queue.{i}.).
	 *
	 * @since TR262 v1.0
	 */
@CWMPObject(name = "FAP.Tunnel.VirtualInterface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"CryptoProfile", "DSCPMarkPolicy"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAP.Tunnel.VirtualInterface")
@XmlType(name = "FAP.Tunnel.VirtualInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class VirtualInterface {

	/**
	 * Enables and disables this entry.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * {{reference}} If multiple instances of VirtualInterface point to the same CryptoProfile instance, the associated {{param|#.CryptoProfile.{i}.MaxChildSA}} determines whether a new IKE session will be created (dynamically) to negotiate the child SA(s) for each of the virtual interfaces; otherwise, they are negotiated through the same IKE session.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CryptoProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String cryptoProfile;
	/**
	 * DSCP to mark the outer IP header for traffic that is associated with this virtual interface.  

A value of -1 indicates copy from the incoming packet. 

A value of -2 indicates automatic marking of DSCP as defined for the UMTS QoS class {{bibref|3GPP-TS.23.107}} or CDMA2000 Subscriber QoS profile {{bibref|3GPP2-X.S0011}}. 

De-tunneled packets are never re-marked.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DSCPMarkPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer dscPMarkPolicy;

	public VirtualInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables and disables this entry.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VirtualInterface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.0
	 * @param alias the input value
	 * @return this instance
	 */
	public VirtualInterface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} If multiple instances of VirtualInterface point to the same CryptoProfile instance, the associated {{param|#.CryptoProfile.{i}.MaxChildSA}} determines whether a new IKE session will be created (dynamically) to negotiate the child SA(s) for each of the virtual interfaces; otherwise, they are negotiated through the same IKE session.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getCryptoProfile() {
		return cryptoProfile;
	}

	/**
	 * Set the {{reference}} If multiple instances of VirtualInterface point to the same CryptoProfile instance, the associated {{param|#.CryptoProfile.{i}.MaxChildSA}} determines whether a new IKE session will be created (dynamically) to negotiate the child SA(s) for each of the virtual interfaces; otherwise, they are negotiated through the same IKE session.
	 *
	 * @since 1.0
	 * @param cryptoProfile the input value
	 */
	public void  setCryptoProfile(String cryptoProfile) {
		this.cryptoProfile = cryptoProfile;
	}

	/**
	 * Set the {{reference}} If multiple instances of VirtualInterface point to the same CryptoProfile instance, the associated {{param|#.CryptoProfile.{i}.MaxChildSA}} determines whether a new IKE session will be created (dynamically) to negotiate the child SA(s) for each of the virtual interfaces; otherwise, they are negotiated through the same IKE session.
	 *
	 * @since 1.0
	 * @param cryptoProfile the input value
	 * @return this instance
	 */
	public VirtualInterface withCryptoProfile(String cryptoProfile) {
		this.cryptoProfile = cryptoProfile;
		return this;
	}

	/**
	 * Get the dscP to mark the outer IP header for traffic that is associated with this virtual interface.  

A value of -1 indicates copy from the incoming packet. 

A value of -2 indicates automatic marking of DSCP as defined for the UMTS QoS class {{bibref|3GPP-TS.23.107}} or CDMA2000 Subscriber QoS profile {{bibref|3GPP2-X.S0011}}. 

De-tunneled packets are never re-marked.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDscPMarkPolicy() {
		return dscPMarkPolicy;
	}

	/**
	 * Set the dscP to mark the outer IP header for traffic that is associated with this virtual interface.  

A value of -1 indicates copy from the incoming packet. 

A value of -2 indicates automatic marking of DSCP as defined for the UMTS QoS class {{bibref|3GPP-TS.23.107}} or CDMA2000 Subscriber QoS profile {{bibref|3GPP2-X.S0011}}. 

De-tunneled packets are never re-marked.
	 *
	 * @since 1.0
	 * @param dscPMarkPolicy the input value
	 */
	public void  setDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
	}

	/**
	 * Set the dscP to mark the outer IP header for traffic that is associated with this virtual interface.  

A value of -1 indicates copy from the incoming packet. 

A value of -2 indicates automatic marking of DSCP as defined for the UMTS QoS class {{bibref|3GPP-TS.23.107}} or CDMA2000 Subscriber QoS profile {{bibref|3GPP2-X.S0011}}. 

De-tunneled packets are never re-marked.
	 *
	 * @since 1.0
	 * @param dscPMarkPolicy the input value
	 * @return this instance
	 */
	public VirtualInterface withDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
		return this;
	}

	//</editor-fold>

}