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
package org.broadbandforum.tr196.fapservice.transport;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.transport.security.Secret;

	/**
	 * This object contains parameters relating to Security.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.Security.")
public class Security {

	/**
	 * Shared Secret Table. This table gathers information about all types of shared secret-based credentials (UICC).
	 */
	@XmlElementWrapper(name = "Secrets")
	@XmlElement(name = "Secret")
	@CWMPParameter(access = "readWrite")
	public Collection<Secret> secrets;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the shared Secret Table. This table gathers information about all types of shared secret-based credentials (UICC).
	 *
	 * @return the value
	 */
	public Collection<Secret> getSecrets() {
		if (this.secrets == null){ this.secrets=new ArrayList<>();}
		return secrets;
	}

	/**
	 * Set the shared Secret Table. This table gathers information about all types of shared secret-based credentials (UICC).
	 *
	 * @param secrets the input value
	 */
	public void  setSecrets(Collection<Secret> secrets) {
		this.secrets = secrets;
	}

	/**
	 * Set the shared Secret Table. This table gathers information about all types of shared secret-based credentials (UICC).
	 *
	 * @param secret the input value
	 * @return this instance
	 */
	public Security withSecret(Secret secret) {
		getSecrets().add(secret);
		return this;
	}

	//</editor-fold>

}