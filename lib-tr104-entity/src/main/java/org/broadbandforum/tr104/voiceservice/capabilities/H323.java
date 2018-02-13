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
package org.broadbandforum.tr104.voiceservice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * H.323-specific capabilities (as defined in {{bibref|H.323}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.H323.")
@XmlRootElement(name = "H323")
@XmlType(name = "VoiceService.Capabilities.H323")
@XmlAccessorType(XmlAccessType.FIELD)
public class H323 {

	/**
	 * Support for H.323 fast start.  If {{true}} indicates support for fast start.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FastStart")
	public Boolean fastStart;
	/**
	 * {{list}} Each item is a supported authentication method. 

Enumerated value must be one of [dhExch, pwdSymEnc, pwdHash, certSign, ipsec, tls]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106a7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "H235AuthenticationMethods")
	@XmlList
	public Collection<String> h235AuthenticationMethods;

	public H323() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the support for H.323 fast start.  If {{true}} indicates support for fast start.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isFastStart() {
		return fastStart;
	}

	/**
	 * Set the support for H.323 fast start.  If {{true}} indicates support for fast start.
	 *
	 * @since 2.0
	 * @param fastStart the input value
	 */
	public void  setFastStart(Boolean fastStart) {
		this.fastStart = fastStart;
	}

	/**
	 * Set the support for H.323 fast start.  If {{true}} indicates support for fast start.
	 *
	 * @since 2.0
	 * @param fastStart the input value
	 * @return this instance
	 */
	public H323 withFastStart(Boolean fastStart) {
		this.fastStart = fastStart;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported authentication method. 

Enumerated value must be one of [dhExch, pwdSymEnc, pwdHash, certSign, ipsec, tls]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106a7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getH235AuthenticationMethods() {
		if (this.h235AuthenticationMethods == null){ this.h235AuthenticationMethods=new ArrayList<>();}
		return h235AuthenticationMethods;
	}

	/**
	 * Set the {{list}} Each item is a supported authentication method. 

Enumerated value must be one of [dhExch, pwdSymEnc, pwdHash, certSign, ipsec, tls]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106a7}}.
	 *
	 * @since 2.0
	 * @param h235AuthenticationMethods the input value
	 */
	public void  setH235AuthenticationMethods(Collection<String> h235AuthenticationMethods) {
		this.h235AuthenticationMethods = h235AuthenticationMethods;
	}

	/**
	 * Set the {{list}} Each item is a supported authentication method. 

Enumerated value must be one of [dhExch, pwdSymEnc, pwdHash, certSign, ipsec, tls]

The list MAY include vendor-specific protocols, which MUST use the format defined in {{bibref|TR-106a7}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public H323 withH235AuthenticationMethods(String string) {
		getH235AuthenticationMethods().add(string);
		return this;
	}

	//</editor-fold>

}