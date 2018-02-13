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
package org.broadbandforum.tr181.device.dns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.dns.diagnostics.NSLookupDiagnostics;

	/**
	 * The DNS Diagnostics object containing the {{object|NSLookupDiagnostics}} test.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.Diagnostics.")
@XmlRootElement(name = "Device.DNS.Diagnostics")
@XmlType(name = "Device.DNS.Diagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {

	/**
	 * This object defines access to an IP-layer NS Lookup test for the specified IP interface.

        When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

        There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

        Any previous {{object|Result}} instances are removed when a new test is initiated.
	 */
	@XmlElement(name = "NSLookupDiagnostics")
	public NSLookupDiagnostics nslookupDiagnostics;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

        When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

        There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

        Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @return the value
	 */
	public NSLookupDiagnostics getNslookupDiagnostics() {
		return nslookupDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

        When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

        There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

        Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @param nslookupDiagnostics the input value
	 */
	public void  setNslookupDiagnostics(NSLookupDiagnostics nslookupDiagnostics) {
		this.nslookupDiagnostics = nslookupDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

        When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

        There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

        Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @param nslookupDiagnostics the input value
	 * @return this instance
	 */
	public Diagnostics withNslookupDiagnostics(NSLookupDiagnostics nslookupDiagnostics) {
		this.nslookupDiagnostics = nslookupDiagnostics;
		return this;
	}

	//</editor-fold>

}