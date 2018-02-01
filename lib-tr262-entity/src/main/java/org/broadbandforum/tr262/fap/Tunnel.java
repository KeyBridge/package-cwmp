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
package org.broadbandforum.tr262.fap;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr262.fap.tunnel.ChildSA;
import org.broadbandforum.tr262.fap.tunnel.CryptoProfile;
import org.broadbandforum.tr262.fap.tunnel.IKESA;
import org.broadbandforum.tr262.fap.tunnel.VirtualInterface;

	/**
	 * This object contains parameters relating to Tunneling.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.Tunnel.")
public class Tunnel {

	/**
	 * The maximum number of  virtual interfaces.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxVirtualInterfaces")
	public Long maxVirtualInterfaces;
	/**
	 * If the SecGW parameters are configured then this parameter determines whether the CWMP traffic will be sent across the IPsec tunnel(s) or outside of the IPsec tunnel(s).

If {{false}} then the CWMP traffic will be sent outside of the IPsec tunnel(s). 

If {{true}} then the CWMP traffic will be sent across the IPsec tunnel(s).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UseForCWMP")
	@CWMPParameter(access = "readWrite")
	public Boolean useForCWMP;
	/**
	 * Indicates the maximum number of child SAs per IKE session that the device is capable of supporting.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxChildSAPerIKE")
	public Long maxChildSAPerIKE;
	/**
	 * Indicates the maximum number of IKE sessions the device is capable of supporting at any given time.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxIKESessions")
	public Long maxIKESessions;
	/**
	 * This object contains parameters relating to IKEv2 and IPsec crypto profiles, which are essentially a subset of the typical IPsec SPD. {{bibref|RFC4301}}.

For Cdma2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 */
	@XmlElementWrapper(name = "cryptoProfiles")
	@XmlElement(name = "CryptoProfile")
	@CWMPParameter(access = "readWrite")
	public Collection<CryptoProfile> cryptoProfiles;
	/**
	 * IKE IPsec Security Association Table. This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 */
	@XmlElementWrapper(name = "ikeSAs")
	@XmlElement(name = "IKESA")
	public Collection<IKESA> ikeSAs;
	/**
	 * Child IPsec Security Association Table.  This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 */
	@XmlElementWrapper(name = "childSAs")
	@XmlElement(name = "ChildSA")
	public Collection<ChildSA> childSAs;
	/**
	 * Virtual Interfaces used for associating the tunnel (ephemeral) childSA pairs with QoS Classification and Queue tables as defined in {{bibref|TR-098a2}} (InternetGatewayDevice.QueueManagement.Classification.{i}. and InternetGatewayDevice.QueueManagement.Queue.{i}.) or {{bibref|TR-181i2}} (Device.QoS.Classification.{i}. and Device.QoS.Queue.{i}.).
	 */
	@XmlElementWrapper(name = "virtualInterfaces")
	@XmlElement(name = "VirtualInterface")
	@CWMPParameter(access = "readWrite")
	public Collection<VirtualInterface> virtualInterfaces;

	public Tunnel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of  virtual interfaces.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxVirtualInterfaces() {
		return maxVirtualInterfaces;
	}

	/**
	 * Set the maximum number of  virtual interfaces.
	 *
	 * @since 1.0
	 * @param maxVirtualInterfaces the input value
	 */
	public void  setMaxVirtualInterfaces(Long maxVirtualInterfaces) {
		this.maxVirtualInterfaces = maxVirtualInterfaces;
	}

	/**
	 * Set the maximum number of  virtual interfaces.
	 *
	 * @since 1.0
	 * @param maxVirtualInterfaces the input value
	 * @return this instance
	 */
	public Tunnel withMaxVirtualInterfaces(Long maxVirtualInterfaces) {
		this.maxVirtualInterfaces = maxVirtualInterfaces;
		return this;
	}

	/**
	 * Get the if the SecGW parameters are configured then this parameter determines whether the CWMP traffic will be sent across the IPsec tunnel(s) or outside of the IPsec tunnel(s).

If {{false}} then the CWMP traffic will be sent outside of the IPsec tunnel(s). 

If {{true}} then the CWMP traffic will be sent across the IPsec tunnel(s).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isUseForCWMP() {
		return useForCWMP;
	}

	/**
	 * Set the if the SecGW parameters are configured then this parameter determines whether the CWMP traffic will be sent across the IPsec tunnel(s) or outside of the IPsec tunnel(s).

If {{false}} then the CWMP traffic will be sent outside of the IPsec tunnel(s). 

If {{true}} then the CWMP traffic will be sent across the IPsec tunnel(s).
	 *
	 * @since 1.0
	 * @param useForCWMP the input value
	 */
	public void  setUseForCWMP(Boolean useForCWMP) {
		this.useForCWMP = useForCWMP;
	}

	/**
	 * Set the if the SecGW parameters are configured then this parameter determines whether the CWMP traffic will be sent across the IPsec tunnel(s) or outside of the IPsec tunnel(s).

If {{false}} then the CWMP traffic will be sent outside of the IPsec tunnel(s). 

If {{true}} then the CWMP traffic will be sent across the IPsec tunnel(s).
	 *
	 * @since 1.0
	 * @param useForCWMP the input value
	 * @return this instance
	 */
	public Tunnel withUseForCWMP(Boolean useForCWMP) {
		this.useForCWMP = useForCWMP;
		return this;
	}

	/**
	 * Get the indicates the maximum number of child SAs per IKE session that the device is capable of supporting.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxChildSAPerIKE() {
		return maxChildSAPerIKE;
	}

	/**
	 * Set the indicates the maximum number of child SAs per IKE session that the device is capable of supporting.
	 *
	 * @since 1.0
	 * @param maxChildSAPerIKE the input value
	 */
	public void  setMaxChildSAPerIKE(Long maxChildSAPerIKE) {
		this.maxChildSAPerIKE = maxChildSAPerIKE;
	}

	/**
	 * Set the indicates the maximum number of child SAs per IKE session that the device is capable of supporting.
	 *
	 * @since 1.0
	 * @param maxChildSAPerIKE the input value
	 * @return this instance
	 */
	public Tunnel withMaxChildSAPerIKE(Long maxChildSAPerIKE) {
		this.maxChildSAPerIKE = maxChildSAPerIKE;
		return this;
	}

	/**
	 * Get the indicates the maximum number of IKE sessions the device is capable of supporting at any given time.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxIKESessions() {
		return maxIKESessions;
	}

	/**
	 * Set the indicates the maximum number of IKE sessions the device is capable of supporting at any given time.
	 *
	 * @since 1.0
	 * @param maxIKESessions the input value
	 */
	public void  setMaxIKESessions(Long maxIKESessions) {
		this.maxIKESessions = maxIKESessions;
	}

	/**
	 * Set the indicates the maximum number of IKE sessions the device is capable of supporting at any given time.
	 *
	 * @since 1.0
	 * @param maxIKESessions the input value
	 * @return this instance
	 */
	public Tunnel withMaxIKESessions(Long maxIKESessions) {
		this.maxIKESessions = maxIKESessions;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to IKEv2 and IPsec crypto profiles, which are essentially a subset of the typical IPsec SPD. {{bibref|RFC4301}}.

For Cdma2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @return the value
	 */
	public Collection<CryptoProfile> getCryptoProfiles() {
		if (this.cryptoProfiles == null){ this.cryptoProfiles=new ArrayList<>();}
		return cryptoProfiles;
	}

	/**
	 * Set the this object contains parameters relating to IKEv2 and IPsec crypto profiles, which are essentially a subset of the typical IPsec SPD. {{bibref|RFC4301}}.

For Cdma2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @param cryptoProfiles the input value
	 */
	public void  setCryptoProfiles(Collection<CryptoProfile> cryptoProfiles) {
		this.cryptoProfiles = cryptoProfiles;
	}

	/**
	 * Set the this object contains parameters relating to IKEv2 and IPsec crypto profiles, which are essentially a subset of the typical IPsec SPD. {{bibref|RFC4301}}.

For Cdma2000 devices, see also {{bibref|3GPP2-S.S0132}}.
	 *
	 * @param cryptoProfile the input value
	 * @return this instance
	 */
	public Tunnel withCryptoProfile(CryptoProfile cryptoProfile) {
		getCryptoProfiles().add(cryptoProfile);
		return this;
	}

	/**
	 * Get the ike IPsec Security Association Table. This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @return the value
	 */
	public Collection<IKESA> getIkeSAs() {
		if (this.ikeSAs == null){ this.ikeSAs=new ArrayList<>();}
		return ikeSAs;
	}

	/**
	 * Set the ike IPsec Security Association Table. This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @param ikeSAs the input value
	 */
	public void  setIkeSAs(Collection<IKESA> ikeSAs) {
		this.ikeSAs = ikeSAs;
	}

	/**
	 * Set the ike IPsec Security Association Table. This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @param ikeSA the input value
	 * @return this instance
	 */
	public Tunnel withIKESA(IKESA ikeSA) {
		getIkeSAs().add(ikeSA);
		return this;
	}

	/**
	 * Get the child IPsec Security Association Table.  This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @return the value
	 */
	public Collection<ChildSA> getChildSAs() {
		if (this.childSAs == null){ this.childSAs=new ArrayList<>();}
		return childSAs;
	}

	/**
	 * Set the child IPsec Security Association Table.  This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @param childSAs the input value
	 */
	public void  setChildSAs(Collection<ChildSA> childSAs) {
		this.childSAs = childSAs;
	}

	/**
	 * Set the child IPsec Security Association Table.  This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @param childSA the input value
	 * @return this instance
	 */
	public Tunnel withChildSA(ChildSA childSA) {
		getChildSAs().add(childSA);
		return this;
	}

	/**
	 * Get the virtual Interfaces used for associating the tunnel (ephemeral) childSA pairs with QoS Classification and Queue tables as defined in {{bibref|TR-098a2}} (InternetGatewayDevice.QueueManagement.Classification.{i}. and InternetGatewayDevice.QueueManagement.Queue.{i}.) or {{bibref|TR-181i2}} (Device.QoS.Classification.{i}. and Device.QoS.Queue.{i}.).
	 *
	 * @return the value
	 */
	public Collection<VirtualInterface> getVirtualInterfaces() {
		if (this.virtualInterfaces == null){ this.virtualInterfaces=new ArrayList<>();}
		return virtualInterfaces;
	}

	/**
	 * Set the virtual Interfaces used for associating the tunnel (ephemeral) childSA pairs with QoS Classification and Queue tables as defined in {{bibref|TR-098a2}} (InternetGatewayDevice.QueueManagement.Classification.{i}. and InternetGatewayDevice.QueueManagement.Queue.{i}.) or {{bibref|TR-181i2}} (Device.QoS.Classification.{i}. and Device.QoS.Queue.{i}.).
	 *
	 * @param virtualInterfaces the input value
	 */
	public void  setVirtualInterfaces(Collection<VirtualInterface> virtualInterfaces) {
		this.virtualInterfaces = virtualInterfaces;
	}

	/**
	 * Set the virtual Interfaces used for associating the tunnel (ephemeral) childSA pairs with QoS Classification and Queue tables as defined in {{bibref|TR-098a2}} (InternetGatewayDevice.QueueManagement.Classification.{i}. and InternetGatewayDevice.QueueManagement.Queue.{i}.) or {{bibref|TR-181i2}} (Device.QoS.Classification.{i}. and Device.QoS.Queue.{i}.).
	 *
	 * @param virtualInterface the input value
	 * @return this instance
	 */
	public Tunnel withVirtualInterface(VirtualInterface virtualInterface) {
		getVirtualInterfaces().add(virtualInterface);
		return this;
	}

	//</editor-fold>

}