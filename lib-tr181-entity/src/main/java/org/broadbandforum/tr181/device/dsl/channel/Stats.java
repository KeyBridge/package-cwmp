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
package org.broadbandforum.tr181.device.dsl.channel;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dsl.channel.stats.CurrentDay;
import org.broadbandforum.tr181.device.dsl.channel.stats.LastShowtime;
import org.broadbandforum.tr181.device.dsl.channel.stats.QuarterHour;
import org.broadbandforum.tr181.device.dsl.channel.stats.Showtime;
import org.broadbandforum.tr181.device.dsl.channel.stats.Total;

	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Channel.{i}.Stats.")
public class Stats {

	/**
	 * The total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesSent;
	/**
	 * The total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesReceived;
	/**
	 * The total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsSent;
	/**
	 * The total number of packets received on the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long errorsSent;
	/**
	 * The total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long errorsReceived;
	/**
	 * The total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long discardPacketsSent;
	/**
	 * The total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long discardPacketsReceived;
	/**
	 * DSL-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long totalStart;
	/**
	 * DSL-specific statistic. The Number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of {{object|Showtime}} statistics.

          Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected  since the most recent establishment of the DSL link.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long showtimeStart;
	/**
	 * DSL-specific statistic. The Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of {{object|LastShowtime}} statistics.

          If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime''  statistics MAY temporarily coincide with the start of ''Showtime'' statistics.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastShowtimeStart;
	/**
	 * DSL-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

          The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentDayStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long currentDayStart;
	/**
	 * DSL-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

          The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuarterHourStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long quarterHourStart;
	/**
	 * This object contains DSL channel total statistics {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 */
	@XmlElement(name = "Total")
	public Total total;
	/**
	 * This object contains DSL channel statistics accumulated since the most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 */
	@XmlElement(name = "Showtime")
	public Showtime showtime;
	/**
	 * This object contains DSL channel statistics accumulated since the second most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 */
	@XmlElement(name = "LastShowtime")
	public LastShowtime lastShowtime;
	/**
	 * This object contains DSL channel statistics accumulated during the current day {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 */
	@XmlElement(name = "CurrentDay")
	public CurrentDay currentDay;
	/**
	 * This object contains DSL channel statistics accumulated during the current quarter hour {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 */
	@XmlElement(name = "QuarterHour")
	public QuarterHour quarterHour;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(Long errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(Long errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(Long errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(Long errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(Long discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsSent(Long discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(Long discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsReceived(Long discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalStart() {
		return totalStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param totalStart the input value
	 */
	public void  setTotalStart(Long totalStart) {
		this.totalStart = totalStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param totalStart the input value
	 * @return this instance
	 */
	public Stats withTotalStart(Long totalStart) {
		this.totalStart = totalStart;
		return this;
	}

	/**
	 * Get the dsl-specific statistic. The Number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of {{object|Showtime}} statistics.

          Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected  since the most recent establishment of the DSL link.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getShowtimeStart() {
		return showtimeStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of {{object|Showtime}} statistics.

          Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected  since the most recent establishment of the DSL link.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param showtimeStart the input value
	 */
	public void  setShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of {{object|Showtime}} statistics.

          Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected  since the most recent establishment of the DSL link.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param showtimeStart the input value
	 * @return this instance
	 */
	public Stats withShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
		return this;
	}

	/**
	 * Get the dsl-specific statistic. The Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of {{object|LastShowtime}} statistics.

          If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime''  statistics MAY temporarily coincide with the start of ''Showtime'' statistics.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastShowtimeStart() {
		return lastShowtimeStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of {{object|LastShowtime}} statistics.

          If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime''  statistics MAY temporarily coincide with the start of ''Showtime'' statistics.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param lastShowtimeStart the input value
	 */
	public void  setLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of {{object|LastShowtime}} statistics.

          If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime''  statistics MAY temporarily coincide with the start of ''Showtime'' statistics.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param lastShowtimeStart the input value
	 * @return this instance
	 */
	public Stats withLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
		return this;
	}

	/**
	 * Get the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

          The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCurrentDayStart() {
		return currentDayStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

          The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param currentDayStart the input value
	 */
	public void  setCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

          The CPE MAY align the beginning of each ''CurrentDay'' interval with days in the UTC time zone, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param currentDayStart the input value
	 * @return this instance
	 */
	public Stats withCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
		return this;
	}

	/**
	 * Get the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

          The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQuarterHourStart() {
		return quarterHourStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

          The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param quarterHourStart the input value
	 */
	public void  setQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
	}

	/**
	 * Set the dsl-specific statistic. The Number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

          The CPE MAY align the beginning of each ''QuarterHour'' interval with real-time quarter-hour intervals, but is not required to do so.

          Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.

          Note: {{param}} SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @since 2.0
	 * @param quarterHourStart the input value
	 * @return this instance
	 */
	public Stats withQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
		return this;
	}

	/**
	 * Get the this object contains DSL channel total statistics {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @return the value
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Set the this object contains DSL channel total statistics {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param total the input value
	 */
	public void  setTotal(Total total) {
		this.total = total;
	}

	/**
	 * Set the this object contains DSL channel total statistics {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param total the input value
	 * @return this instance
	 */
	public Stats withTotal(Total total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the this object contains DSL channel statistics accumulated since the most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @return the value
	 */
	public Showtime getShowtime() {
		return showtime;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated since the most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param showtime the input value
	 */
	public void  setShowtime(Showtime showtime) {
		this.showtime = showtime;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated since the most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param showtime the input value
	 * @return this instance
	 */
	public Stats withShowtime(Showtime showtime) {
		this.showtime = showtime;
		return this;
	}

	/**
	 * Get the this object contains DSL channel statistics accumulated since the second most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @return the value
	 */
	public LastShowtime getLastShowtime() {
		return lastShowtime;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated since the second most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param lastShowtime the input value
	 */
	public void  setLastShowtime(LastShowtime lastShowtime) {
		this.lastShowtime = lastShowtime;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated since the second most recent DSL Showtime {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param lastShowtime the input value
	 * @return this instance
	 */
	public Stats withLastShowtime(LastShowtime lastShowtime) {
		this.lastShowtime = lastShowtime;
		return this;
	}

	/**
	 * Get the this object contains DSL channel statistics accumulated during the current day {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @return the value
	 */
	public CurrentDay getCurrentDay() {
		return currentDay;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated during the current day {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param currentDay the input value
	 */
	public void  setCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated during the current day {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param currentDay the input value
	 * @return this instance
	 */
	public Stats withCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
		return this;
	}

	/**
	 * Get the this object contains DSL channel statistics accumulated during the current quarter hour {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @return the value
	 */
	public QuarterHour getQuarterHour() {
		return quarterHour;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated during the current quarter hour {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param quarterHour the input value
	 */
	public void  setQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
	}

	/**
	 * Set the this object contains DSL channel statistics accumulated during the current quarter hour {{bibref|G.997.1}}.

        Note: The {{object}} parameters SHOULD NOT be reset when the interface statistics are reset via an interface disable / enable cycle.
	 *
	 * @param quarterHour the input value
	 * @return this instance
	 */
	public Stats withQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
		return this;
	}

	//</editor-fold>

}