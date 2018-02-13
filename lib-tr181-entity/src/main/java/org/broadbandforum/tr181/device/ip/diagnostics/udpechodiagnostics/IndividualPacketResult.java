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
package org.broadbandforum.tr181.device.ip.diagnostics.udpechodiagnostics;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object provides the results from individual UDPEchoPlus test packets collected during a test if {{param|#.EnableIndividualPacketResults}} is set to true.  When {{param|#.DiagnosticsState}} is set to {{enum|Completed|#.DiagnosticsState}} it should contain {{param|#.NumberOfRepetitions}} objects.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  The instance number should match the TestIterationNumber field of the request and response packet.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IP.Diagnostics.UDPEchoDiagnostics.IndividualPacketResult.{i}.")
@XmlRootElement(name = "Device.IP.Diagnostics.UDPEchoDiagnostics.IndividualPacketResult")
@XmlType(name = "Device.IP.Diagnostics.UDPEchoDiagnostics.IndividualPacketResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndividualPacketResult {

	/**
	 * Indicates that the response to this UDP Echo Plus packet sent was received by the client. When this value is {{true}}, then all the remaining parameters in this instance are valid. Otherwise only the values originally set by the CPE client (e.g. {{param|PacketSendTime}} and {{param|TestGenSN}}) MAY be set to valid values.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketSuccess")
	public Boolean packetSuccess;
	/**
	 * Time the client sent this UDP Echo Plus packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketSendTime")
	public LocalDateTime packetSendTime;
	/**
	 * Time the client receives the response packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          If this response is never received, {{param}} SHOULD be set to the Unknown Time value as specified in {{bibref|TR-106a7|Section 3.2.2}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketReceiveTime")
	public LocalDateTime packetReceiveTime;
	/**
	 * The TestGenSN field in the UDPEcho Plus packet {{bibref|TR-143a1|Section A.1.4}} sent by the CPE client.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestGenSN")
	public Long testGenSN;
	/**
	 * The TestRespSN field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) for this Echo Plus packet sent by the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestRespSN")
	public Long testRespSN;
	/**
	 * The TestRespRcvTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the reception time of this UDP Echo Plus packet sent from the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestRespRcvTimeStamp")
	public Long testRespRcvTimeStamp;
	/**
	 * The TestRespReplyTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the server reply time of this UDP Echo Plus packet sent from the CPE client.

          That is, the time that the server returned the UDP Echo Plus packet. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestRespReplyTimeStamp")
	public Long testRespReplyTimeStamp;
	/**
	 * The count value that was set by the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the number of dropped echo response packets by the server. This count is incremented if a valid echo request packet is received at a UDP EchoPlus server but for some reason cannot be responded to (e.g. due to local buffer overflow, CPU utilization, etc...).  If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestRespReplyFailureCount")
	public Long testRespReplyFailureCount;

	public IndividualPacketResult() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates that the response to this UDP Echo Plus packet sent was received by the client. When this value is {{true}}, then all the remaining parameters in this instance are valid. Otherwise only the values originally set by the CPE client (e.g. {{param|PacketSendTime}} and {{param|TestGenSN}}) MAY be set to valid values.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isPacketSuccess() {
		return packetSuccess;
	}

	/**
	 * Set the indicates that the response to this UDP Echo Plus packet sent was received by the client. When this value is {{true}}, then all the remaining parameters in this instance are valid. Otherwise only the values originally set by the CPE client (e.g. {{param|PacketSendTime}} and {{param|TestGenSN}}) MAY be set to valid values.
	 *
	 * @since 2.9
	 * @param packetSuccess the input value
	 */
	public void  setPacketSuccess(Boolean packetSuccess) {
		this.packetSuccess = packetSuccess;
	}

	/**
	 * Set the indicates that the response to this UDP Echo Plus packet sent was received by the client. When this value is {{true}}, then all the remaining parameters in this instance are valid. Otherwise only the values originally set by the CPE client (e.g. {{param|PacketSendTime}} and {{param|TestGenSN}}) MAY be set to valid values.
	 *
	 * @since 2.9
	 * @param packetSuccess the input value
	 * @return this instance
	 */
	public IndividualPacketResult withPacketSuccess(Boolean packetSuccess) {
		this.packetSuccess = packetSuccess;
		return this;
	}

	/**
	 * Get the time the client sent this UDP Echo Plus packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @return the value
	 */
	public LocalDateTime getPacketSendTime() {
		return packetSendTime;
	}

	/**
	 * Set the time the client sent this UDP Echo Plus packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param packetSendTime the input value
	 */
	public void  setPacketSendTime(LocalDateTime packetSendTime) {
		this.packetSendTime = packetSendTime;
	}

	/**
	 * Set the time the client sent this UDP Echo Plus packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param packetSendTime the input value
	 * @return this instance
	 */
	public IndividualPacketResult withPacketSendTime(LocalDateTime packetSendTime) {
		this.packetSendTime = packetSendTime;
		return this;
	}

	/**
	 * Get the time the client receives the response packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          If this response is never received, {{param}} SHOULD be set to the Unknown Time value as specified in {{bibref|TR-106a7|Section 3.2.2}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public LocalDateTime getPacketReceiveTime() {
		return packetReceiveTime;
	}

	/**
	 * Set the time the client receives the response packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          If this response is never received, {{param}} SHOULD be set to the Unknown Time value as specified in {{bibref|TR-106a7|Section 3.2.2}}.
	 *
	 * @since 2.9
	 * @param packetReceiveTime the input value
	 */
	public void  setPacketReceiveTime(LocalDateTime packetReceiveTime) {
		this.packetReceiveTime = packetReceiveTime;
	}

	/**
	 * Set the time the client receives the response packet in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          If this response is never received, {{param}} SHOULD be set to the Unknown Time value as specified in {{bibref|TR-106a7|Section 3.2.2}}.
	 *
	 * @since 2.9
	 * @param packetReceiveTime the input value
	 * @return this instance
	 */
	public IndividualPacketResult withPacketReceiveTime(LocalDateTime packetReceiveTime) {
		this.packetReceiveTime = packetReceiveTime;
		return this;
	}

	/**
	 * Get the TestGenSN field in the UDPEcho Plus packet {{bibref|TR-143a1|Section A.1.4}} sent by the CPE client.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestGenSN() {
		return testGenSN;
	}

	/**
	 * Set the TestGenSN field in the UDPEcho Plus packet {{bibref|TR-143a1|Section A.1.4}} sent by the CPE client.
	 *
	 * @since 2.9
	 * @param testGenSN the input value
	 */
	public void  setTestGenSN(Long testGenSN) {
		this.testGenSN = testGenSN;
	}

	/**
	 * Set the TestGenSN field in the UDPEcho Plus packet {{bibref|TR-143a1|Section A.1.4}} sent by the CPE client.
	 *
	 * @since 2.9
	 * @param testGenSN the input value
	 * @return this instance
	 */
	public IndividualPacketResult withTestGenSN(Long testGenSN) {
		this.testGenSN = testGenSN;
		return this;
	}

	/**
	 * Get the TestRespSN field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) for this Echo Plus packet sent by the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestRespSN() {
		return testRespSN;
	}

	/**
	 * Set the TestRespSN field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) for this Echo Plus packet sent by the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespSN the input value
	 */
	public void  setTestRespSN(Long testRespSN) {
		this.testRespSN = testRespSN;
	}

	/**
	 * Set the TestRespSN field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) for this Echo Plus packet sent by the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespSN the input value
	 * @return this instance
	 */
	public IndividualPacketResult withTestRespSN(Long testRespSN) {
		this.testRespSN = testRespSN;
		return this;
	}

	/**
	 * Get the TestRespRcvTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the reception time of this UDP Echo Plus packet sent from the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestRespRcvTimeStamp() {
		return testRespRcvTimeStamp;
	}

	/**
	 * Set the TestRespRcvTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the reception time of this UDP Echo Plus packet sent from the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespRcvTimeStamp the input value
	 */
	public void  setTestRespRcvTimeStamp(Long testRespRcvTimeStamp) {
		this.testRespRcvTimeStamp = testRespRcvTimeStamp;
	}

	/**
	 * Set the TestRespRcvTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the reception time of this UDP Echo Plus packet sent from the CPE client. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespRcvTimeStamp the input value
	 * @return this instance
	 */
	public IndividualPacketResult withTestRespRcvTimeStamp(Long testRespRcvTimeStamp) {
		this.testRespRcvTimeStamp = testRespRcvTimeStamp;
		return this;
	}

	/**
	 * Get the TestRespReplyTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the server reply time of this UDP Echo Plus packet sent from the CPE client.

          That is, the time that the server returned the UDP Echo Plus packet. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestRespReplyTimeStamp() {
		return testRespReplyTimeStamp;
	}

	/**
	 * Set the TestRespReplyTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the server reply time of this UDP Echo Plus packet sent from the CPE client.

          That is, the time that the server returned the UDP Echo Plus packet. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespReplyTimeStamp the input value
	 */
	public void  setTestRespReplyTimeStamp(Long testRespReplyTimeStamp) {
		this.testRespReplyTimeStamp = testRespReplyTimeStamp;
	}

	/**
	 * Set the TestRespReplyTimeStamp field in the response packet {{bibref|TR-143a1|Section A.1.4}} from the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the server reply time of this UDP Echo Plus packet sent from the CPE client.

          That is, the time that the server returned the UDP Echo Plus packet. If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespReplyTimeStamp the input value
	 * @return this instance
	 */
	public IndividualPacketResult withTestRespReplyTimeStamp(Long testRespReplyTimeStamp) {
		this.testRespReplyTimeStamp = testRespReplyTimeStamp;
		return this;
	}

	/**
	 * Get the count value that was set by the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the number of dropped echo response packets by the server. This count is incremented if a valid echo request packet is received at a UDP EchoPlus server but for some reason cannot be responded to (e.g. due to local buffer overflow, CPU utilization, etc...).  If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestRespReplyFailureCount() {
		return testRespReplyFailureCount;
	}

	/**
	 * Set the count value that was set by the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the number of dropped echo response packets by the server. This count is incremented if a valid echo request packet is received at a UDP EchoPlus server but for some reason cannot be responded to (e.g. due to local buffer overflow, CPU utilization, etc...).  If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespReplyFailureCount the input value
	 */
	public void  setTestRespReplyFailureCount(Long testRespReplyFailureCount) {
		this.testRespReplyFailureCount = testRespReplyFailureCount;
	}

	/**
	 * Set the count value that was set by the UDP Echo Plus server (i.e. {{param|#.Host}}) to record the number of dropped echo response packets by the server. This count is incremented if a valid echo request packet is received at a UDP EchoPlus server but for some reason cannot be responded to (e.g. due to local buffer overflow, CPU utilization, etc...).  If {{param|PacketSuccess}} is {{false}}, {{param}} SHOULD be 0.
	 *
	 * @since 2.9
	 * @param testRespReplyFailureCount the input value
	 * @return this instance
	 */
	public IndividualPacketResult withTestRespReplyFailureCount(Long testRespReplyFailureCount) {
		this.testRespReplyFailureCount = testRespReplyFailureCount;
		return this;
	}

	//</editor-fold>

}