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
package org.broadbandforum.tr196.fapservice.fapcontrol.lte;

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
	 * This object contains parameters relating to the Gateways that the LTE FAP is connected to.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.LTE.Gateway.")
@XmlRootElement(name = "FAPService.FAPControl.LTE.Gateway")
@XmlType(name = "FAPService.FAPControl.LTE.Gateway")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gateway {

	/**
	 * First SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer1;
	/**
	 * Second SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer2;
	/**
	 * Third SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer3;
	/**
	 * {{list}} Each item is a S1 signaling connection end point (-GW or MME) the LTE FAP attempts to establish connection with. It is in the form of either hostname or IPaddress. LTE FAP's behavior in terms of the number of S1 connection to established with is determined by {{param|S1ConnectionMode}} parameter. If {{param|S1ConnectionMode}} has the value of {{enum|One|S1ConnectionMode}}, then LTE FAP attempts to establish S1 connection with only one address following the ordering of the list. If {{param|S1ConnectionMode}} has the value of {{enum|All|S1ConnectionMode}}, then LTE FAP attempts to establish connection with all addresses in the list.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "S1SigLinkServerList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> s1sigLinkServerList;
	/**
	 * Indicates how many of the configured far-end S1 link address(es),as defined in {{param|S1SigLinkServerList}}, LTE FAP SHOULD attempt to establish connection with simultaneously. If {{param}} parameter is not explicitly configured, then LTE FAP shall assume the value to be {{enum|One|S1ConnectionMode}} as default.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "S1ConnectionMode")
	@CWMPParameter(access = "readWrite")
	public String s1connectionMode;
	/**
	 * Port number of S1AP signaling connection end point (-GW or MME) used for initial S1 SCTP contact. This value is specified as 36412 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-01. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "S1SigLinkPort")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long s1sigLinkPort;

	public Gateway() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the first SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer1() {
		return secGWServer1;
	}

	/**
	 * Set the first SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer1 the input value
	 */
	public void  setSecGWServer1(String secGWServer1) {
		this.secGWServer1 = secGWServer1;
	}

	/**
	 * Set the first SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
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
	 * Get the second SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer2() {
		return secGWServer2;
	}

	/**
	 * Set the second SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer2 the input value
	 */
	public void  setSecGWServer2(String secGWServer2) {
		this.secGWServer2 = secGWServer2;
	}

	/**
	 * Set the second SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
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
	 * Get the third SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer3() {
		return secGWServer3;
	}

	/**
	 * Set the third SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
	 *
	 * @since 2.0
	 * @param secGWServer3 the input value
	 */
	public void  setSecGWServer3(String secGWServer3) {
		this.secGWServer3 = secGWServer3;
	}

	/**
	 * Set the third SecGW the LTE FAP attempts to establish connection with. Either hostname or IPaddress.
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
	 * Get the {{list}} Each item is a S1 signaling connection end point (-GW or MME) the LTE FAP attempts to establish connection with. It is in the form of either hostname or IPaddress. LTE FAP's behavior in terms of the number of S1 connection to established with is determined by {{param|S1ConnectionMode}} parameter. If {{param|S1ConnectionMode}} has the value of {{enum|One|S1ConnectionMode}}, then LTE FAP attempts to establish S1 connection with only one address following the ordering of the list. If {{param|S1ConnectionMode}} has the value of {{enum|All|S1ConnectionMode}}, then LTE FAP attempts to establish connection with all addresses in the list.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getS1sigLinkServerList() {
		if (this.s1sigLinkServerList == null){ this.s1sigLinkServerList=new ArrayList<>();}
		return s1sigLinkServerList;
	}

	/**
	 * Set the {{list}} Each item is a S1 signaling connection end point (-GW or MME) the LTE FAP attempts to establish connection with. It is in the form of either hostname or IPaddress. LTE FAP's behavior in terms of the number of S1 connection to established with is determined by {{param|S1ConnectionMode}} parameter. If {{param|S1ConnectionMode}} has the value of {{enum|One|S1ConnectionMode}}, then LTE FAP attempts to establish S1 connection with only one address following the ordering of the list. If {{param|S1ConnectionMode}} has the value of {{enum|All|S1ConnectionMode}}, then LTE FAP attempts to establish connection with all addresses in the list.
	 *
	 * @since 2.0
	 * @param s1sigLinkServerList the input value
	 */
	public void  setS1sigLinkServerList(Collection<String> s1sigLinkServerList) {
		this.s1sigLinkServerList = s1sigLinkServerList;
	}

	/**
	 * Set the {{list}} Each item is a S1 signaling connection end point (-GW or MME) the LTE FAP attempts to establish connection with. It is in the form of either hostname or IPaddress. LTE FAP's behavior in terms of the number of S1 connection to established with is determined by {{param|S1ConnectionMode}} parameter. If {{param|S1ConnectionMode}} has the value of {{enum|One|S1ConnectionMode}}, then LTE FAP attempts to establish S1 connection with only one address following the ordering of the list. If {{param|S1ConnectionMode}} has the value of {{enum|All|S1ConnectionMode}}, then LTE FAP attempts to establish connection with all addresses in the list.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Gateway withS1sigLinkServerList(String string) {
		getS1sigLinkServerList().add(string);
		return this;
	}

	/**
	 * Get the indicates how many of the configured far-end S1 link address(es),as defined in {{param|S1SigLinkServerList}}, LTE FAP SHOULD attempt to establish connection with simultaneously. If {{param}} parameter is not explicitly configured, then LTE FAP shall assume the value to be {{enum|One|S1ConnectionMode}} as default.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getS1connectionMode() {
		return s1connectionMode;
	}

	/**
	 * Set the indicates how many of the configured far-end S1 link address(es),as defined in {{param|S1SigLinkServerList}}, LTE FAP SHOULD attempt to establish connection with simultaneously. If {{param}} parameter is not explicitly configured, then LTE FAP shall assume the value to be {{enum|One|S1ConnectionMode}} as default.
	 *
	 * @since 2.0
	 * @param s1connectionMode the input value
	 */
	public void  setS1connectionMode(String s1connectionMode) {
		this.s1connectionMode = s1connectionMode;
	}

	/**
	 * Set the indicates how many of the configured far-end S1 link address(es),as defined in {{param|S1SigLinkServerList}}, LTE FAP SHOULD attempt to establish connection with simultaneously. If {{param}} parameter is not explicitly configured, then LTE FAP shall assume the value to be {{enum|One|S1ConnectionMode}} as default.
	 *
	 * @since 2.0
	 * @param s1connectionMode the input value
	 * @return this instance
	 */
	public Gateway withS1connectionMode(String s1connectionMode) {
		this.s1connectionMode = s1connectionMode;
		return this;
	}

	/**
	 * Get the port number of S1AP signaling connection end point (-GW or MME) used for initial S1 SCTP contact. This value is specified as 36412 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-01. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getS1sigLinkPort() {
		return s1sigLinkPort;
	}

	/**
	 * Set the port number of S1AP signaling connection end point (-GW or MME) used for initial S1 SCTP contact. This value is specified as 36412 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-01. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @param s1sigLinkPort the input value
	 */
	public void  setS1sigLinkPort(Long s1sigLinkPort) {
		this.s1sigLinkPort = s1sigLinkPort;
	}

	/**
	 * Set the port number of S1AP signaling connection end point (-GW or MME) used for initial S1 SCTP contact. This value is specified as 36412 according to IANA definition per {{bibref|IANA-portnumbers}}, registered on 2009-09-01. Use of IANA-defined value is recommended.
	 *
	 * @since 2.0
	 * @param s1sigLinkPort the input value
	 * @return this instance
	 */
	public Gateway withS1sigLinkPort(Long s1sigLinkPort) {
		this.s1sigLinkPort = s1sigLinkPort;
		return this;
	}

	//</editor-fold>

}