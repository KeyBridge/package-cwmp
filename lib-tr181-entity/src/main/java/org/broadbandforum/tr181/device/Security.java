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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.security.Certificate;

	/**
	 * This object contains general information related to managing security features on the device.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.Security.")
public class Security {

	/**
	 * This table provides information about all types of public key-based credentials, such as X.509 certificates, see {{bibref|RFC5280}}.
	 */
	@XmlElementWrapper(name = "certificates")
	@XmlElement(name = "Certificate")
	public Collection<Certificate> certificates;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this table provides information about all types of public key-based credentials, such as X.509 certificates, see {{bibref|RFC5280}}.
	 *
	 * @return the value
	 */
	public Collection<Certificate> getCertificates() {
		if (this.certificates == null){ this.certificates=new ArrayList<>();}
		return certificates;
	}

	/**
	 * Set the this table provides information about all types of public key-based credentials, such as X.509 certificates, see {{bibref|RFC5280}}.
	 *
	 * @param certificates the input value
	 */
	public void  setCertificates(Collection<Certificate> certificates) {
		this.certificates = certificates;
	}

	/**
	 * Set the this table provides information about all types of public key-based credentials, such as X.509 certificates, see {{bibref|RFC5280}}.
	 *
	 * @param certificate the input value
	 * @return this instance
	 */
	public Security withCertificate(Certificate certificate) {
		getCertificates().add(certificate);
		return this;
	}

	//</editor-fold>

}