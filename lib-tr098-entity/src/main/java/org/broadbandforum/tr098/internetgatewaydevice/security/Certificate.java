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
package org.broadbandforum.tr098.internetgatewaydevice.security;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This table provides information about all types of public key-based credentials, such as X.509 certificates, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.Security.Certificate.{i}.")
public class Certificate {

	/**
	 * Enables or disables this certificate.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The last modification time of this certificate.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "LastModif")
	public LocalDateTime lastModif;
	/**
	 * The Serial Number field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * The Issuer field in an X.509 certificate, see {{bibref|RFC5280}}; i.e. the Distinguished Name (DN) of the entity who has signed the certificate.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Issuer")
	@Size(max = 256)
	public String issuer;
	/**
	 * The beginning of the certificate validity period; i.e. the Not Before field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "NotBefore")
	public LocalDateTime notBefore;
	/**
	 * The end of the certificate validity period; i.e., the Not After field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "NotAfter")
	public LocalDateTime notAfter;
	/**
	 * The Distinguished Name (DN) of the entity associated with the Public Key; i.e., the Subject field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Subject")
	@Size(max = 256)
	public String subject;
	/**
	 * {{list}} Each item is a DNS Name.

The Subject Alternative Names extension field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SubjectAlt")
	@Size(max = 256)
	@XmlList
	public Collection<String> subjectAlt;
	/**
	 * The algorithm used in signing the certificate; i.e. the Signature Algorithm field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SignatureAlgorithm")
	@Size(max = 256)
	public String signatureAlgorithm;

	public Certificate() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this certificate.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this certificate.
	 *
	 * @since 1.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this certificate.
	 *
	 * @since 1.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Certificate withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the last modification time of this certificate.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getLastModif() {
		return lastModif;
	}

	/**
	 * Set the last modification time of this certificate.
	 *
	 * @since 1.10
	 * @param lastModif the input value
	 */
	public void  setLastModif(LocalDateTime lastModif) {
		this.lastModif = lastModif;
	}

	/**
	 * Set the last modification time of this certificate.
	 *
	 * @since 1.10
	 * @param lastModif the input value
	 * @return this instance
	 */
	public Certificate withLastModif(LocalDateTime lastModif) {
		this.lastModif = lastModif;
		return this;
	}

	/**
	 * Get the Serial Number field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the Serial Number field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the Serial Number field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public Certificate withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the Issuer field in an X.509 certificate, see {{bibref|RFC5280}}; i.e. the Distinguished Name (DN) of the entity who has signed the certificate.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * Set the Issuer field in an X.509 certificate, see {{bibref|RFC5280}}; i.e. the Distinguished Name (DN) of the entity who has signed the certificate.
	 *
	 * @since 1.10
	 * @param issuer the input value
	 */
	public void  setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * Set the Issuer field in an X.509 certificate, see {{bibref|RFC5280}}; i.e. the Distinguished Name (DN) of the entity who has signed the certificate.
	 *
	 * @since 1.10
	 * @param issuer the input value
	 * @return this instance
	 */
	public Certificate withIssuer(String issuer) {
		this.issuer = issuer;
		return this;
	}

	/**
	 * Get the beginning of the certificate validity period; i.e. the Not Before field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getNotBefore() {
		return notBefore;
	}

	/**
	 * Set the beginning of the certificate validity period; i.e. the Not Before field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param notBefore the input value
	 */
	public void  setNotBefore(LocalDateTime notBefore) {
		this.notBefore = notBefore;
	}

	/**
	 * Set the beginning of the certificate validity period; i.e. the Not Before field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param notBefore the input value
	 * @return this instance
	 */
	public Certificate withNotBefore(LocalDateTime notBefore) {
		this.notBefore = notBefore;
		return this;
	}

	/**
	 * Get the end of the certificate validity period; i.e., the Not After field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getNotAfter() {
		return notAfter;
	}

	/**
	 * Set the end of the certificate validity period; i.e., the Not After field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param notAfter the input value
	 */
	public void  setNotAfter(LocalDateTime notAfter) {
		this.notAfter = notAfter;
	}

	/**
	 * Set the end of the certificate validity period; i.e., the Not After field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param notAfter the input value
	 * @return this instance
	 */
	public Certificate withNotAfter(LocalDateTime notAfter) {
		this.notAfter = notAfter;
		return this;
	}

	/**
	 * Get the Distinguished Name (DN) of the entity associated with the Public Key; i.e., the Subject field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Set the Distinguished Name (DN) of the entity associated with the Public Key; i.e., the Subject field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param subject the input value
	 */
	public void  setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Set the Distinguished Name (DN) of the entity associated with the Public Key; i.e., the Subject field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param subject the input value
	 * @return this instance
	 */
	public Certificate withSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a DNS Name.

The Subject Alternative Names extension field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getSubjectAlt() {
		if (this.subjectAlt == null){ this.subjectAlt=new ArrayList<>();}
		return subjectAlt;
	}

	/**
	 * Set the {{list}} Each item is a DNS Name.

The Subject Alternative Names extension field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param subjectAlt the input value
	 */
	public void  setSubjectAlt(Collection<String> subjectAlt) {
		this.subjectAlt = subjectAlt;
	}

	/**
	 * Set the {{list}} Each item is a DNS Name.

The Subject Alternative Names extension field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public Certificate withSubjectAlt(String string) {
		getSubjectAlt().add(string);
		return this;
	}

	/**
	 * Get the algorithm used in signing the certificate; i.e. the Signature Algorithm field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * Set the algorithm used in signing the certificate; i.e. the Signature Algorithm field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param signatureAlgorithm the input value
	 */
	public void  setSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}

	/**
	 * Set the algorithm used in signing the certificate; i.e. the Signature Algorithm field in an X.509 certificate, see {{bibref|RFC5280}}.
	 *
	 * @since 1.10
	 * @param signatureAlgorithm the input value
	 * @return this instance
	 */
	public Certificate withSignatureAlgorithm(String signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
		return this;
	}

	//</editor-fold>

}