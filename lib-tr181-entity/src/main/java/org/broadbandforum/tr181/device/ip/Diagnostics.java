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
package org.broadbandforum.tr181.device.ip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.ip.diagnostics.DownloadDiagnostics;
import org.broadbandforum.tr181.device.ip.diagnostics.IPPing;
import org.broadbandforum.tr181.device.ip.diagnostics.ServerSelectionDiagnostics;
import org.broadbandforum.tr181.device.ip.diagnostics.TraceRoute;
import org.broadbandforum.tr181.device.ip.diagnostics.UDPEchoConfig;
import org.broadbandforum.tr181.device.ip.diagnostics.UDPEchoDiagnostics;
import org.broadbandforum.tr181.device.ip.diagnostics.UploadDiagnostics;

	/**
	 * The IP Diagnostics object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Diagnostics.")
@XmlRootElement(name = "Device.IP.Diagnostics")
@XmlType(name = "Device.IP.Diagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {

	/**
	 * Indicates that Ping over IPv4 is supported.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv4PingSupported")
	public Boolean ipv4PingSupported;
	/**
	 * Indicates that Ping over IPv6 is supported.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv6PingSupported")
	public Boolean ipv6PingSupported;
	/**
	 * Indicates that TraceRoute over IPv4 is supported.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv4TraceRouteSupported")
	public Boolean ipv4TraceRouteSupported;
	/**
	 * Indicates that TraceRoute over IPv6 is supported.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv6TraceRouteSupported")
	public Boolean ipv6TraceRouteSupported;
	/**
	 * Indicates that Download Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4DownloadDiagnosticsSupported")
	public Boolean ipv4DownloadDiagnosticsSupported;
	/**
	 * Indicates that Download Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6DownloadDiagnosticsSupported")
	public Boolean ipv6DownloadDiagnosticsSupported;
	/**
	 * Indicates that Upload Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4UploadDiagnosticsSupported")
	public Boolean ipv4UploadDiagnosticsSupported;
	/**
	 * Indicates that Upload Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6UploadDiagnosticsSupported")
	public Boolean ipv6UploadDiagnosticsSupported;
	/**
	 * Indicates that UDPEcho Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4UDPEchoDiagnosticsSupported")
	public Boolean ipv4UDPEchoDiagnosticsSupported;
	/**
	 * Indicates that UDPEcho Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6UDPEchoDiagnosticsSupported")
	public Boolean ipv6UDPEchoDiagnosticsSupported;
	/**
	 * Indicates that ServerSelection Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4ServerSelectionDiagnosticsSupported")
	public Boolean ipv4ServerSelectionDiagnosticsSupported;
	/**
	 * Indicates that ServerSelection Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6ServerSelectionDiagnosticsSupported")
	public Boolean ipv6ServerSelectionDiagnosticsSupported;
	/**
	 * This object provides access to an IP-layer ping test.
	 */
	@XmlElement(name = "IPPing")
	public IPPing ipping;
	/**
	 * This object is defines access to an IP-layer trace-route test for the specified IP interface.
	 */
	@XmlElement(name = "TraceRoute")
	public TraceRoute traceRoute;
	/**
	 * This object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

        Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 */
	@XmlElement(name = "DownloadDiagnostics")
	public DownloadDiagnostics downloadDiagnostics;
	/**
	 * This object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

        Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 */
	@XmlElement(name = "UploadDiagnostics")
	public UploadDiagnostics uploadDiagnostics;
	/**
	 * This object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 */
	@XmlElement(name = "UDPEchoConfig")
	public UDPEchoConfig udpEchoConfig;
	/**
	 * This object defines the diagnostics configuration for a UDP Echo test {{bibref|TR-143a1|Appendix A.1}} defined in {{bibref|RFC862}} or a UDP Echo Plus test defined in {{bibref|TR-143a1|Appendix A.1}}.
	 */
	@XmlElement(name = "UDPEchoDiagnostics")
	public UDPEchoDiagnostics udpEchoDiagnostics;
	/**
	 * This object provides access to a diagnostics test that performs either an ICMP Ping or UDP Echo ping against multiple hosts determining which one has the smallest average response time. There MUST be a ping response to the transmitted ping, or timeout, before the next ping is sent out.
	 */
	@XmlElement(name = "ServerSelectionDiagnostics")
	public ServerSelectionDiagnostics serverSelectionDiagnostics;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates that Ping over IPv4 is supported.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIpv4PingSupported() {
		return ipv4PingSupported;
	}

	/**
	 * Set the indicates that Ping over IPv4 is supported.
	 *
	 * @since 2.8
	 * @param ipv4PingSupported the input value
	 */
	public void  setIpv4PingSupported(Boolean ipv4PingSupported) {
		this.ipv4PingSupported = ipv4PingSupported;
	}

	/**
	 * Set the indicates that Ping over IPv4 is supported.
	 *
	 * @since 2.8
	 * @param ipv4PingSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4PingSupported(Boolean ipv4PingSupported) {
		this.ipv4PingSupported = ipv4PingSupported;
		return this;
	}

	/**
	 * Get the indicates that Ping over IPv6 is supported.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIpv6PingSupported() {
		return ipv6PingSupported;
	}

	/**
	 * Set the indicates that Ping over IPv6 is supported.
	 *
	 * @since 2.8
	 * @param ipv6PingSupported the input value
	 */
	public void  setIpv6PingSupported(Boolean ipv6PingSupported) {
		this.ipv6PingSupported = ipv6PingSupported;
	}

	/**
	 * Set the indicates that Ping over IPv6 is supported.
	 *
	 * @since 2.8
	 * @param ipv6PingSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6PingSupported(Boolean ipv6PingSupported) {
		this.ipv6PingSupported = ipv6PingSupported;
		return this;
	}

	/**
	 * Get the indicates that TraceRoute over IPv4 is supported.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIpv4TraceRouteSupported() {
		return ipv4TraceRouteSupported;
	}

	/**
	 * Set the indicates that TraceRoute over IPv4 is supported.
	 *
	 * @since 2.8
	 * @param ipv4TraceRouteSupported the input value
	 */
	public void  setIpv4TraceRouteSupported(Boolean ipv4TraceRouteSupported) {
		this.ipv4TraceRouteSupported = ipv4TraceRouteSupported;
	}

	/**
	 * Set the indicates that TraceRoute over IPv4 is supported.
	 *
	 * @since 2.8
	 * @param ipv4TraceRouteSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4TraceRouteSupported(Boolean ipv4TraceRouteSupported) {
		this.ipv4TraceRouteSupported = ipv4TraceRouteSupported;
		return this;
	}

	/**
	 * Get the indicates that TraceRoute over IPv6 is supported.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIpv6TraceRouteSupported() {
		return ipv6TraceRouteSupported;
	}

	/**
	 * Set the indicates that TraceRoute over IPv6 is supported.
	 *
	 * @since 2.8
	 * @param ipv6TraceRouteSupported the input value
	 */
	public void  setIpv6TraceRouteSupported(Boolean ipv6TraceRouteSupported) {
		this.ipv6TraceRouteSupported = ipv6TraceRouteSupported;
	}

	/**
	 * Set the indicates that TraceRoute over IPv6 is supported.
	 *
	 * @since 2.8
	 * @param ipv6TraceRouteSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6TraceRouteSupported(Boolean ipv6TraceRouteSupported) {
		this.ipv6TraceRouteSupported = ipv6TraceRouteSupported;
		return this;
	}

	/**
	 * Get the indicates that Download Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv4DownloadDiagnosticsSupported() {
		return ipv4DownloadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Download Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4DownloadDiagnosticsSupported the input value
	 */
	public void  setIpv4DownloadDiagnosticsSupported(Boolean ipv4DownloadDiagnosticsSupported) {
		this.ipv4DownloadDiagnosticsSupported = ipv4DownloadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Download Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4DownloadDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4DownloadDiagnosticsSupported(Boolean ipv4DownloadDiagnosticsSupported) {
		this.ipv4DownloadDiagnosticsSupported = ipv4DownloadDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that Download Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv6DownloadDiagnosticsSupported() {
		return ipv6DownloadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Download Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6DownloadDiagnosticsSupported the input value
	 */
	public void  setIpv6DownloadDiagnosticsSupported(Boolean ipv6DownloadDiagnosticsSupported) {
		this.ipv6DownloadDiagnosticsSupported = ipv6DownloadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Download Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6DownloadDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6DownloadDiagnosticsSupported(Boolean ipv6DownloadDiagnosticsSupported) {
		this.ipv6DownloadDiagnosticsSupported = ipv6DownloadDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that Upload Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv4UploadDiagnosticsSupported() {
		return ipv4UploadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Upload Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4UploadDiagnosticsSupported the input value
	 */
	public void  setIpv4UploadDiagnosticsSupported(Boolean ipv4UploadDiagnosticsSupported) {
		this.ipv4UploadDiagnosticsSupported = ipv4UploadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Upload Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4UploadDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4UploadDiagnosticsSupported(Boolean ipv4UploadDiagnosticsSupported) {
		this.ipv4UploadDiagnosticsSupported = ipv4UploadDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that Upload Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv6UploadDiagnosticsSupported() {
		return ipv6UploadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Upload Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6UploadDiagnosticsSupported the input value
	 */
	public void  setIpv6UploadDiagnosticsSupported(Boolean ipv6UploadDiagnosticsSupported) {
		this.ipv6UploadDiagnosticsSupported = ipv6UploadDiagnosticsSupported;
	}

	/**
	 * Set the indicates that Upload Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6UploadDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6UploadDiagnosticsSupported(Boolean ipv6UploadDiagnosticsSupported) {
		this.ipv6UploadDiagnosticsSupported = ipv6UploadDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that UDPEcho Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv4UDPEchoDiagnosticsSupported() {
		return ipv4UDPEchoDiagnosticsSupported;
	}

	/**
	 * Set the indicates that UDPEcho Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4UDPEchoDiagnosticsSupported the input value
	 */
	public void  setIpv4UDPEchoDiagnosticsSupported(Boolean ipv4UDPEchoDiagnosticsSupported) {
		this.ipv4UDPEchoDiagnosticsSupported = ipv4UDPEchoDiagnosticsSupported;
	}

	/**
	 * Set the indicates that UDPEcho Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4UDPEchoDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4UDPEchoDiagnosticsSupported(Boolean ipv4UDPEchoDiagnosticsSupported) {
		this.ipv4UDPEchoDiagnosticsSupported = ipv4UDPEchoDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that UDPEcho Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv6UDPEchoDiagnosticsSupported() {
		return ipv6UDPEchoDiagnosticsSupported;
	}

	/**
	 * Set the indicates that UDPEcho Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6UDPEchoDiagnosticsSupported the input value
	 */
	public void  setIpv6UDPEchoDiagnosticsSupported(Boolean ipv6UDPEchoDiagnosticsSupported) {
		this.ipv6UDPEchoDiagnosticsSupported = ipv6UDPEchoDiagnosticsSupported;
	}

	/**
	 * Set the indicates that UDPEcho Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6UDPEchoDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6UDPEchoDiagnosticsSupported(Boolean ipv6UDPEchoDiagnosticsSupported) {
		this.ipv6UDPEchoDiagnosticsSupported = ipv6UDPEchoDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that ServerSelection Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv4ServerSelectionDiagnosticsSupported() {
		return ipv4ServerSelectionDiagnosticsSupported;
	}

	/**
	 * Set the indicates that ServerSelection Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4ServerSelectionDiagnosticsSupported the input value
	 */
	public void  setIpv4ServerSelectionDiagnosticsSupported(Boolean ipv4ServerSelectionDiagnosticsSupported) {
		this.ipv4ServerSelectionDiagnosticsSupported = ipv4ServerSelectionDiagnosticsSupported;
	}

	/**
	 * Set the indicates that ServerSelection Diagnostics over IPv4 is supported.
	 *
	 * @since 2.9
	 * @param ipv4ServerSelectionDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv4ServerSelectionDiagnosticsSupported(Boolean ipv4ServerSelectionDiagnosticsSupported) {
		this.ipv4ServerSelectionDiagnosticsSupported = ipv4ServerSelectionDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the indicates that ServerSelection Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIpv6ServerSelectionDiagnosticsSupported() {
		return ipv6ServerSelectionDiagnosticsSupported;
	}

	/**
	 * Set the indicates that ServerSelection Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6ServerSelectionDiagnosticsSupported the input value
	 */
	public void  setIpv6ServerSelectionDiagnosticsSupported(Boolean ipv6ServerSelectionDiagnosticsSupported) {
		this.ipv6ServerSelectionDiagnosticsSupported = ipv6ServerSelectionDiagnosticsSupported;
	}

	/**
	 * Set the indicates that ServerSelection Diagnostics over IPv6 is supported.
	 *
	 * @since 2.9
	 * @param ipv6ServerSelectionDiagnosticsSupported the input value
	 * @return this instance
	 */
	public Diagnostics withIpv6ServerSelectionDiagnosticsSupported(Boolean ipv6ServerSelectionDiagnosticsSupported) {
		this.ipv6ServerSelectionDiagnosticsSupported = ipv6ServerSelectionDiagnosticsSupported;
		return this;
	}

	/**
	 * Get the this object provides access to an IP-layer ping test.
	 *
	 * @return the value
	 */
	public IPPing getIpping() {
		return ipping;
	}

	/**
	 * Set the this object provides access to an IP-layer ping test.
	 *
	 * @param ipping the input value
	 */
	public void  setIpping(IPPing ipping) {
		this.ipping = ipping;
	}

	/**
	 * Set the this object provides access to an IP-layer ping test.
	 *
	 * @param ipping the input value
	 * @return this instance
	 */
	public Diagnostics withIpping(IPPing ipping) {
		this.ipping = ipping;
		return this;
	}

	/**
	 * Get the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @return the value
	 */
	public TraceRoute getTraceRoute() {
		return traceRoute;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @param traceRoute the input value
	 */
	public void  setTraceRoute(TraceRoute traceRoute) {
		this.traceRoute = traceRoute;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @param traceRoute the input value
	 * @return this instance
	 */
	public Diagnostics withTraceRoute(TraceRoute traceRoute) {
		this.traceRoute = traceRoute;
		return this;
	}

	/**
	 * Get the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

        Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @return the value
	 */
	public DownloadDiagnostics getDownloadDiagnostics() {
		return downloadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

        Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @param downloadDiagnostics the input value
	 */
	public void  setDownloadDiagnostics(DownloadDiagnostics downloadDiagnostics) {
		this.downloadDiagnostics = downloadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

        Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @param downloadDiagnostics the input value
	 * @return this instance
	 */
	public Diagnostics withDownloadDiagnostics(DownloadDiagnostics downloadDiagnostics) {
		this.downloadDiagnostics = downloadDiagnostics;
		return this;
	}

	/**
	 * Get the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

        Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @return the value
	 */
	public UploadDiagnostics getUploadDiagnostics() {
		return uploadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

        Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @param uploadDiagnostics the input value
	 */
	public void  setUploadDiagnostics(UploadDiagnostics uploadDiagnostics) {
		this.uploadDiagnostics = uploadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

        Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @param uploadDiagnostics the input value
	 * @return this instance
	 */
	public Diagnostics withUploadDiagnostics(UploadDiagnostics uploadDiagnostics) {
		this.uploadDiagnostics = uploadDiagnostics;
		return this;
	}

	/**
	 * Get the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @return the value
	 */
	public UDPEchoConfig getUdpEchoConfig() {
		return udpEchoConfig;
	}

	/**
	 * Set the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @param udpEchoConfig the input value
	 */
	public void  setUdpEchoConfig(UDPEchoConfig udpEchoConfig) {
		this.udpEchoConfig = udpEchoConfig;
	}

	/**
	 * Set the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @param udpEchoConfig the input value
	 * @return this instance
	 */
	public Diagnostics withUdpEchoConfig(UDPEchoConfig udpEchoConfig) {
		this.udpEchoConfig = udpEchoConfig;
		return this;
	}

	/**
	 * Get the this object defines the diagnostics configuration for a UDP Echo test {{bibref|TR-143a1|Appendix A.1}} defined in {{bibref|RFC862}} or a UDP Echo Plus test defined in {{bibref|TR-143a1|Appendix A.1}}.
	 *
	 * @return the value
	 */
	public UDPEchoDiagnostics getUdpEchoDiagnostics() {
		return udpEchoDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a UDP Echo test {{bibref|TR-143a1|Appendix A.1}} defined in {{bibref|RFC862}} or a UDP Echo Plus test defined in {{bibref|TR-143a1|Appendix A.1}}.
	 *
	 * @param udpEchoDiagnostics the input value
	 */
	public void  setUdpEchoDiagnostics(UDPEchoDiagnostics udpEchoDiagnostics) {
		this.udpEchoDiagnostics = udpEchoDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a UDP Echo test {{bibref|TR-143a1|Appendix A.1}} defined in {{bibref|RFC862}} or a UDP Echo Plus test defined in {{bibref|TR-143a1|Appendix A.1}}.
	 *
	 * @param udpEchoDiagnostics the input value
	 * @return this instance
	 */
	public Diagnostics withUdpEchoDiagnostics(UDPEchoDiagnostics udpEchoDiagnostics) {
		this.udpEchoDiagnostics = udpEchoDiagnostics;
		return this;
	}

	/**
	 * Get the this object provides access to a diagnostics test that performs either an ICMP Ping or UDP Echo ping against multiple hosts determining which one has the smallest average response time. There MUST be a ping response to the transmitted ping, or timeout, before the next ping is sent out.
	 *
	 * @return the value
	 */
	public ServerSelectionDiagnostics getServerSelectionDiagnostics() {
		return serverSelectionDiagnostics;
	}

	/**
	 * Set the this object provides access to a diagnostics test that performs either an ICMP Ping or UDP Echo ping against multiple hosts determining which one has the smallest average response time. There MUST be a ping response to the transmitted ping, or timeout, before the next ping is sent out.
	 *
	 * @param serverSelectionDiagnostics the input value
	 */
	public void  setServerSelectionDiagnostics(ServerSelectionDiagnostics serverSelectionDiagnostics) {
		this.serverSelectionDiagnostics = serverSelectionDiagnostics;
	}

	/**
	 * Set the this object provides access to a diagnostics test that performs either an ICMP Ping or UDP Echo ping against multiple hosts determining which one has the smallest average response time. There MUST be a ping response to the transmitted ping, or timeout, before the next ping is sent out.
	 *
	 * @param serverSelectionDiagnostics the input value
	 * @return this instance
	 */
	public Diagnostics withServerSelectionDiagnostics(ServerSelectionDiagnostics serverSelectionDiagnostics) {
		this.serverSelectionDiagnostics = serverSelectionDiagnostics;
		return this;
	}

	//</editor-fold>

}