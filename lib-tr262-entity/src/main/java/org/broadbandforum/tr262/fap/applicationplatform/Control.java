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
package org.broadbandforum.tr262.fap.applicationplatform;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr262.fap.applicationplatform.control.FemtoAwareness;
import org.broadbandforum.tr262.fap.applicationplatform.control.MMS;
import org.broadbandforum.tr262.fap.applicationplatform.control.SMS;
import org.broadbandforum.tr262.fap.applicationplatform.control.TerminalLocation;

	/**
	 * This object contains parameters related to the operation of the Femtozone APIs.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.ApplicationPlatform.Control.")
@XmlRootElement(name = "Control")
@XmlType(name = "FAP.ApplicationPlatform.Control")
@XmlAccessorType(XmlAccessType.FIELD)
public class Control {

	/**
	 * Specifies how 3rd Party Applications have to authenticate against Femto APIs in order to use it. {{reference}}

'''''Note:''''' The credentials are not part of the data model and have to be supplied externally.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AuthenticationMethod")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String authenticationMethod;
	/**
	 * This is the reference to the IPsec tunnel instance to be used by the Application Platform traffic. 

If InternetGatewayDevice:1 {{bibref|TR-098}} or Device:1 {{bibref|TR-181i1}}) is used as root data model the {{param}} MUST point to a row in the ''.FAP.Tunnel.IKESA.{i}.'' table.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to an tunnel instance defined in this data model.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TunnelInst")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tunnelInst;
	/**
	 * This object contains parameters related to the Femto Awareness API.
	 */
	@XmlElement(name = "FemtoAwareness")
	public FemtoAwareness femtoAwareness;
	/**
	 * This object contains parameters related to the SMS API.
	 */
	@XmlElement(name = "SMS")
	public SMS sms;
	/**
	 * This object contains parameters related to the MMS API.
	 */
	@XmlElement(name = "MMS")
	public MMS mms;
	/**
	 * This object contains parameters related to the TerminalLocation API.
	 */
	@XmlElement(name = "TerminalLocation")
	public TerminalLocation terminalLocation;

	public Control() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies how 3rd Party Applications have to authenticate against Femto APIs in order to use it. {{reference}}

'''''Note:''''' The credentials are not part of the data model and have to be supplied externally.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * Set the specifies how 3rd Party Applications have to authenticate against Femto APIs in order to use it. {{reference}}

'''''Note:''''' The credentials are not part of the data model and have to be supplied externally.
	 *
	 * @since 1.0
	 * @param authenticationMethod the input value
	 */
	public void  setAuthenticationMethod(String authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}

	/**
	 * Set the specifies how 3rd Party Applications have to authenticate against Femto APIs in order to use it. {{reference}}

'''''Note:''''' The credentials are not part of the data model and have to be supplied externally.
	 *
	 * @since 1.0
	 * @param authenticationMethod the input value
	 * @return this instance
	 */
	public Control withAuthenticationMethod(String authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
		return this;
	}

	/**
	 * Get the this is the reference to the IPsec tunnel instance to be used by the Application Platform traffic. 

If InternetGatewayDevice:1 {{bibref|TR-098}} or Device:1 {{bibref|TR-181i1}}) is used as root data model the {{param}} MUST point to a row in the ''.FAP.Tunnel.IKESA.{i}.'' table.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to an tunnel instance defined in this data model.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getTunnelInst() {
		return tunnelInst;
	}

	/**
	 * Set the this is the reference to the IPsec tunnel instance to be used by the Application Platform traffic. 

If InternetGatewayDevice:1 {{bibref|TR-098}} or Device:1 {{bibref|TR-181i1}}) is used as root data model the {{param}} MUST point to a row in the ''.FAP.Tunnel.IKESA.{i}.'' table.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to an tunnel instance defined in this data model.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 1.0
	 * @param tunnelInst the input value
	 */
	public void  setTunnelInst(String tunnelInst) {
		this.tunnelInst = tunnelInst;
	}

	/**
	 * Set the this is the reference to the IPsec tunnel instance to be used by the Application Platform traffic. 

If InternetGatewayDevice:1 {{bibref|TR-098}} or Device:1 {{bibref|TR-181i1}}) is used as root data model the {{param}} MUST point to a row in the ''.FAP.Tunnel.IKESA.{i}.'' table.

If the root data model used is Device:2 {{bibref|TR-181i2}} than the {{param}} MUST point to an tunnel instance defined in this data model.

If the referenced object is deleted, the parameter value MUST be set to an empty string.
	 *
	 * @since 1.0
	 * @param tunnelInst the input value
	 * @return this instance
	 */
	public Control withTunnelInst(String tunnelInst) {
		this.tunnelInst = tunnelInst;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the Femto Awareness API.
	 *
	 * @return the value
	 */
	public FemtoAwareness getFemtoAwareness() {
		return femtoAwareness;
	}

	/**
	 * Set the this object contains parameters related to the Femto Awareness API.
	 *
	 * @param femtoAwareness the input value
	 */
	public void  setFemtoAwareness(FemtoAwareness femtoAwareness) {
		this.femtoAwareness = femtoAwareness;
	}

	/**
	 * Set the this object contains parameters related to the Femto Awareness API.
	 *
	 * @param femtoAwareness the input value
	 * @return this instance
	 */
	public Control withFemtoAwareness(FemtoAwareness femtoAwareness) {
		this.femtoAwareness = femtoAwareness;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the SMS API.
	 *
	 * @return the value
	 */
	public SMS getSms() {
		return sms;
	}

	/**
	 * Set the this object contains parameters related to the SMS API.
	 *
	 * @param sms the input value
	 */
	public void  setSms(SMS sms) {
		this.sms = sms;
	}

	/**
	 * Set the this object contains parameters related to the SMS API.
	 *
	 * @param sms the input value
	 * @return this instance
	 */
	public Control withSms(SMS sms) {
		this.sms = sms;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the MMS API.
	 *
	 * @return the value
	 */
	public MMS getMms() {
		return mms;
	}

	/**
	 * Set the this object contains parameters related to the MMS API.
	 *
	 * @param mms the input value
	 */
	public void  setMms(MMS mms) {
		this.mms = mms;
	}

	/**
	 * Set the this object contains parameters related to the MMS API.
	 *
	 * @param mms the input value
	 * @return this instance
	 */
	public Control withMms(MMS mms) {
		this.mms = mms;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the TerminalLocation API.
	 *
	 * @return the value
	 */
	public TerminalLocation getTerminalLocation() {
		return terminalLocation;
	}

	/**
	 * Set the this object contains parameters related to the TerminalLocation API.
	 *
	 * @param terminalLocation the input value
	 */
	public void  setTerminalLocation(TerminalLocation terminalLocation) {
		this.terminalLocation = terminalLocation;
	}

	/**
	 * Set the this object contains parameters related to the TerminalLocation API.
	 *
	 * @param terminalLocation the input value
	 * @return this instance
	 */
	public Control withTerminalLocation(TerminalLocation terminalLocation) {
		this.terminalLocation = terminalLocation;
		return this;
	}

	//</editor-fold>

}