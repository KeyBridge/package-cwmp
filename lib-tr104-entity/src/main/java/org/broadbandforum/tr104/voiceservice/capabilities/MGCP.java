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
	 * MGCP-specific capabilities (as defined in {{bibref|RFC3435}}).
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.MGCP.")
@XmlRootElement(name = "VoiceService.Capabilities.MGCP")
@XmlType(name = "VoiceService.Capabilities.MGCP")
@XmlAccessorType(XmlAccessType.FIELD)
public class MGCP {

	/**
	 * {{list}}  Each item is a supported optional MGCP package. MGCP packages are listed using the uppercase package abbreviation.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "BP"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Extensions")
	@XmlList
	public Collection<String> extensions;

	public MGCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}}  Each item is a supported optional MGCP package. MGCP packages are listed using the uppercase package abbreviation.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "BP"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getExtensions() {
		if (this.extensions == null){ this.extensions=new ArrayList<>();}
		return extensions;
	}

	/**
	 * Set the {{list}}  Each item is a supported optional MGCP package. MGCP packages are listed using the uppercase package abbreviation.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "BP"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @param extensions the input value
	 */
	public void  setExtensions(Collection<String> extensions) {
		this.extensions = extensions;
	}

	/**
	 * Set the {{list}}  Each item is a supported optional MGCP package. MGCP packages are listed using the uppercase package abbreviation.

The list MAY include vendor-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Examples:

: "BP"

: "X_EXAMPLE-COM_MyExt"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public MGCP withExtensions(String string) {
		getExtensions().add(string);
		return this;
	}

	//</editor-fold>

}