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
package org.broadbandforum.tr143.internetgatewaydevice;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.datatypes.IPAddress;

	/**
	 * This object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @since 1.3
	 */
@CWMPObject(name = "InternetGatewayDevice.UDPEchoConfig.")
@XmlRootElement(name = "UDPEchoConfig")
@XmlType(name = "InternetGatewayDevice.UDPEchoConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class UDPEchoConfig {

	/**
	 * MUST be enabled to receive UDP echo. When enabled from a disabled state all related timestamps, statistics and UDP Echo Plus counters are cleared.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{reference|IP-layer interface over which the CPE MUST listen and receive UDP echo requests on}}

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST listen and receive UDP echo requests on all interfaces.

Note: Interfaces behind a NAT MAY require port forwarding rules configured in the Gateway to enable receiving the UDP packets.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The Source IP address of the UDP echo packet. The CPE MUST only respond to a UDP echo from this source IP address.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "SourceIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIPAddress;
	/**
	 * The UDP port on which the UDP server MUST listen and respond to UDP echo requests.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "UDPPort")
	@CWMPParameter(access = "readWrite")
	public Long udpPort;
	/**
	 * If {{true}} the CPE will perform necessary packet processing for UDP Echo Plus packets.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "EchoPlusEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean echoPlusEnabled;
	/**
	 * {{true}} if UDP Echo Plus is supported.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "EchoPlusSupported")
	public Boolean echoPlusSupported;
	/**
	 * Incremented upon each valid UDP echo packet received.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceived;
	/**
	 * Incremented for each UDP echo response sent.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsResponded")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsResponded;
	/**
	 * The number of UDP received bytes including payload and UDP header after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesReceived;
	/**
	 * The number of UDP responded bytes, including payload and UDP header sent after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "BytesResponded")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesResponded;
	/**
	 * Time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456, 

The time that the server receives the first UDP echo packet after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TimeFirstPacketReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime timeFirstPacketReceived;
	/**
	 * Time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

The time that the server receives the most recent UDP echo packet.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TimeLastPacketReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime timeLastPacketReceived;

	public UDPEchoConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the musT be enabled to receive UDP echo. When enabled from a disabled state all related timestamps, statistics and UDP Echo Plus counters are cleared.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the musT be enabled to receive UDP echo. When enabled from a disabled state all related timestamps, statistics and UDP Echo Plus counters are cleared.
	 *
	 * @since 1.3
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the musT be enabled to receive UDP echo. When enabled from a disabled state all related timestamps, statistics and UDP Echo Plus counters are cleared.
	 *
	 * @since 1.3
	 * @param enable the input value
	 * @return this instance
	 */
	public UDPEchoConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{reference|IP-layer interface over which the CPE MUST listen and receive UDP echo requests on}}

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST listen and receive UDP echo requests on all interfaces.

Note: Interfaces behind a NAT MAY require port forwarding rules configured in the Gateway to enable receiving the UDP packets.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference|IP-layer interface over which the CPE MUST listen and receive UDP echo requests on}}

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST listen and receive UDP echo requests on all interfaces.

Note: Interfaces behind a NAT MAY require port forwarding rules configured in the Gateway to enable receiving the UDP packets.
	 *
	 * @since 1.3
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference|IP-layer interface over which the CPE MUST listen and receive UDP echo requests on}}

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST listen and receive UDP echo requests on all interfaces.

Note: Interfaces behind a NAT MAY require port forwarding rules configured in the Gateway to enable receiving the UDP packets.
	 *
	 * @since 1.3
	 * @param _interface the input value
	 * @return this instance
	 */
	public UDPEchoConfig with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the Source IP address of the UDP echo packet. The CPE MUST only respond to a UDP echo from this source IP address.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public IPAddress getSourceIPAddress() {
		return sourceIPAddress;
	}

	/**
	 * Set the Source IP address of the UDP echo packet. The CPE MUST only respond to a UDP echo from this source IP address.
	 *
	 * @since 1.3
	 * @param sourceIPAddress the input value
	 */
	public void  setSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
	}

	/**
	 * Set the Source IP address of the UDP echo packet. The CPE MUST only respond to a UDP echo from this source IP address.
	 *
	 * @since 1.3
	 * @param sourceIPAddress the input value
	 * @return this instance
	 */
	public UDPEchoConfig withSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
		return this;
	}

	/**
	 * Get the UDP port on which the UDP server MUST listen and respond to UDP echo requests.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getUdpPort() {
		return udpPort;
	}

	/**
	 * Set the UDP port on which the UDP server MUST listen and respond to UDP echo requests.
	 *
	 * @since 1.3
	 * @param udpPort the input value
	 */
	public void  setUdpPort(Long udpPort) {
		this.udpPort = udpPort;
	}

	/**
	 * Set the UDP port on which the UDP server MUST listen and respond to UDP echo requests.
	 *
	 * @since 1.3
	 * @param udpPort the input value
	 * @return this instance
	 */
	public UDPEchoConfig withUdpPort(Long udpPort) {
		this.udpPort = udpPort;
		return this;
	}

	/**
	 * Get the if {{true}} the CPE will perform necessary packet processing for UDP Echo Plus packets.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Boolean isEchoPlusEnabled() {
		return echoPlusEnabled;
	}

	/**
	 * Set the if {{true}} the CPE will perform necessary packet processing for UDP Echo Plus packets.
	 *
	 * @since 1.3
	 * @param echoPlusEnabled the input value
	 */
	public void  setEchoPlusEnabled(Boolean echoPlusEnabled) {
		this.echoPlusEnabled = echoPlusEnabled;
	}

	/**
	 * Set the if {{true}} the CPE will perform necessary packet processing for UDP Echo Plus packets.
	 *
	 * @since 1.3
	 * @param echoPlusEnabled the input value
	 * @return this instance
	 */
	public UDPEchoConfig withEchoPlusEnabled(Boolean echoPlusEnabled) {
		this.echoPlusEnabled = echoPlusEnabled;
		return this;
	}

	/**
	 * Get the {{true}} if UDP Echo Plus is supported.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Boolean isEchoPlusSupported() {
		return echoPlusSupported;
	}

	/**
	 * Set the {{true}} if UDP Echo Plus is supported.
	 *
	 * @since 1.3
	 * @param echoPlusSupported the input value
	 */
	public void  setEchoPlusSupported(Boolean echoPlusSupported) {
		this.echoPlusSupported = echoPlusSupported;
	}

	/**
	 * Set the {{true}} if UDP Echo Plus is supported.
	 *
	 * @since 1.3
	 * @param echoPlusSupported the input value
	 * @return this instance
	 */
	public UDPEchoConfig withEchoPlusSupported(Boolean echoPlusSupported) {
		this.echoPlusSupported = echoPlusSupported;
		return this;
	}

	/**
	 * Get the incremented upon each valid UDP echo packet received.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the incremented upon each valid UDP echo packet received.
	 *
	 * @since 1.3
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the incremented upon each valid UDP echo packet received.
	 *
	 * @since 1.3
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public UDPEchoConfig withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the incremented for each UDP echo response sent.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getPacketsResponded() {
		return packetsResponded;
	}

	/**
	 * Set the incremented for each UDP echo response sent.
	 *
	 * @since 1.3
	 * @param packetsResponded the input value
	 */
	public void  setPacketsResponded(Long packetsResponded) {
		this.packetsResponded = packetsResponded;
	}

	/**
	 * Set the incremented for each UDP echo response sent.
	 *
	 * @since 1.3
	 * @param packetsResponded the input value
	 * @return this instance
	 */
	public UDPEchoConfig withPacketsResponded(Long packetsResponded) {
		this.packetsResponded = packetsResponded;
		return this;
	}

	/**
	 * Get the number of UDP received bytes including payload and UDP header after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the number of UDP received bytes including payload and UDP header after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the number of UDP received bytes including payload and UDP header after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public UDPEchoConfig withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the number of UDP responded bytes, including payload and UDP header sent after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getBytesResponded() {
		return bytesResponded;
	}

	/**
	 * Set the number of UDP responded bytes, including payload and UDP header sent after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param bytesResponded the input value
	 */
	public void  setBytesResponded(Long bytesResponded) {
		this.bytesResponded = bytesResponded;
	}

	/**
	 * Set the number of UDP responded bytes, including payload and UDP header sent after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param bytesResponded the input value
	 * @return this instance
	 */
	public UDPEchoConfig withBytesResponded(Long bytesResponded) {
		this.bytesResponded = bytesResponded;
		return this;
	}

	/**
	 * Get the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456, 

The time that the server receives the first UDP echo packet after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getTimeFirstPacketReceived() {
		return timeFirstPacketReceived;
	}

	/**
	 * Set the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456, 

The time that the server receives the first UDP echo packet after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param timeFirstPacketReceived the input value
	 */
	public void  setTimeFirstPacketReceived(LocalDateTime timeFirstPacketReceived) {
		this.timeFirstPacketReceived = timeFirstPacketReceived;
	}

	/**
	 * Set the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456, 

The time that the server receives the first UDP echo packet after the UDPEchoConfig is enabled.
	 *
	 * @since 1.3
	 * @param timeFirstPacketReceived the input value
	 * @return this instance
	 */
	public UDPEchoConfig withTimeFirstPacketReceived(LocalDateTime timeFirstPacketReceived) {
		this.timeFirstPacketReceived = timeFirstPacketReceived;
		return this;
	}

	/**
	 * Get the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

The time that the server receives the most recent UDP echo packet.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getTimeLastPacketReceived() {
		return timeLastPacketReceived;
	}

	/**
	 * Set the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

The time that the server receives the most recent UDP echo packet.
	 *
	 * @since 1.3
	 * @param timeLastPacketReceived the input value
	 */
	public void  setTimeLastPacketReceived(LocalDateTime timeLastPacketReceived) {
		this.timeLastPacketReceived = timeLastPacketReceived;
	}

	/**
	 * Set the time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

The time that the server receives the most recent UDP echo packet.
	 *
	 * @since 1.3
	 * @param timeLastPacketReceived the input value
	 * @return this instance
	 */
	public UDPEchoConfig withTimeLastPacketReceived(LocalDateTime timeLastPacketReceived) {
		this.timeLastPacketReceived = timeLastPacketReceived;
		return this;
	}

	//</editor-fold>

}