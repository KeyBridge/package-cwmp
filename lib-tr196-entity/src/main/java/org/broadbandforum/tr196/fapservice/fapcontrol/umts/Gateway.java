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
package org.broadbandforum.tr196.fapservice.fapcontrol.umts;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the Gateways that FAP is connected to.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.UMTS.Gateway.")
@XmlRootElement(name = "FAPService.FAPControl.UMTS.Gateway")
@XmlType(name = "FAPService.FAPControl.UMTS.Gateway")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gateway {

	/**
	 * First SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer1;
	/**
	 * Second SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer2;
	/**
	 * Third SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer3;
	/**
	 * First FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPGWServer1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String fapGWServer1;
	/**
	 * Second FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPGWServer2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String fapGWServer2;
	/**
	 * Third FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPGWServer3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String fapGWServer3;
	/**
	 * Port number of FAPGW used for initial Iuh SCTP contact. This value is specified as 29169 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-08. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPGWPort")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long fapGWPort;

	public Gateway() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the first SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer1() {
		return secGWServer1;
	}

	/**
	 * Set the first SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer1 the input value
	 */
	public void  setSecGWServer1(String secGWServer1) {
		this.secGWServer1 = secGWServer1;
	}

	/**
	 * Set the first SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer1 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer1(String secGWServer1) {
		this.secGWServer1 = secGWServer1;
		return this;
	}

	/**
	 * Get the second SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer2() {
		return secGWServer2;
	}

	/**
	 * Set the second SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer2 the input value
	 */
	public void  setSecGWServer2(String secGWServer2) {
		this.secGWServer2 = secGWServer2;
	}

	/**
	 * Set the second SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer2 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer2(String secGWServer2) {
		this.secGWServer2 = secGWServer2;
		return this;
	}

	/**
	 * Get the third SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer3() {
		return secGWServer3;
	}

	/**
	 * Set the third SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer3 the input value
	 */
	public void  setSecGWServer3(String secGWServer3) {
		this.secGWServer3 = secGWServer3;
	}

	/**
	 * Set the third SecGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer3 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer3(String secGWServer3) {
		this.secGWServer3 = secGWServer3;
		return this;
	}

	/**
	 * Get the first FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFapGWServer1() {
		return fapGWServer1;
	}

	/**
	 * Set the first FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer1 the input value
	 */
	public void  setFapGWServer1(String fapGWServer1) {
		this.fapGWServer1 = fapGWServer1;
	}

	/**
	 * Set the first FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer1 the input value
	 * @return this instance
	 */
	public Gateway withFapGWServer1(String fapGWServer1) {
		this.fapGWServer1 = fapGWServer1;
		return this;
	}

	/**
	 * Get the second FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFapGWServer2() {
		return fapGWServer2;
	}

	/**
	 * Set the second FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer2 the input value
	 */
	public void  setFapGWServer2(String fapGWServer2) {
		this.fapGWServer2 = fapGWServer2;
	}

	/**
	 * Set the second FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer2 the input value
	 * @return this instance
	 */
	public Gateway withFapGWServer2(String fapGWServer2) {
		this.fapGWServer2 = fapGWServer2;
		return this;
	}

	/**
	 * Get the third FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFapGWServer3() {
		return fapGWServer3;
	}

	/**
	 * Set the third FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer3 the input value
	 */
	public void  setFapGWServer3(String fapGWServer3) {
		this.fapGWServer3 = fapGWServer3;
	}

	/**
	 * Set the third FAPGW the FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param fapGWServer3 the input value
	 * @return this instance
	 */
	public Gateway withFapGWServer3(String fapGWServer3) {
		this.fapGWServer3 = fapGWServer3;
		return this;
	}

	/**
	 * Get the port number of FAPGW used for initial Iuh SCTP contact. This value is specified as 29169 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-08. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFapGWPort() {
		return fapGWPort;
	}

	/**
	 * Set the port number of FAPGW used for initial Iuh SCTP contact. This value is specified as 29169 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-08. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @param fapGWPort the input value
	 */
	public void  setFapGWPort(Long fapGWPort) {
		this.fapGWPort = fapGWPort;
	}

	/**
	 * Set the port number of FAPGW used for initial Iuh SCTP contact. This value is specified as 29169 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-08. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @param fapGWPort the input value
	 * @return this instance
	 */
	public Gateway withFapGWPort(Long fapGWPort) {
		this.fapGWPort = fapGWPort;
		return this;
	}

	//</editor-fold>

}