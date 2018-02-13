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
package org.broadbandforum.tr181.device.dsl.line;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object models the DSL data gathering function at the VTU-R. This only applies to VDSL2.

        Note: see ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.DSL.Line.{i}.DataGathering.")
@XmlRootElement(name = "Device.DSL.Line.DataGathering")
@XmlType(name = "Device.DSL.Line.DataGathering")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataGathering {

	/**
	 * This parameter is the maximum depth of the entire data gathering event buffer at the VTU-R, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as LOGGING_DEPTH_R in Clause 7.5.3.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "LoggingDepthR")
	public Long loggingDepthR;
	/**
	 * This parameter is actual logging depth that is used for reporting the VTU-R event trace buffer over the eoc channel, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as ACT_LOGGING_DEPTH_REPORTING_R in Clause 7.5.3.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ActLoggingDepthReportingR")
	public Long actLoggingDepthReportingR;
	/**
	 * This parameter identifies the log file of the the data gathering event trace buffer containing the event records that originated at the VTU-R.

          This indicates the table entry that represents a Vendor Log File that contains the data gathering buffer at the VTU-R in the {{object|###.DeviceInfo.VendorLogFile}} table. 

          This data gathering buffer MAY be retrieved wia an upload RPC of the identified Vendor Log File.

          Note: This parameter is defined as EVENT_TRACE_BUFFER_R in Clause 7.5.3.6 of ITU-T Recommendation {{bibref|G.997.1}} and Clause 11.5 of ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "EventTraceBufferR")
	@Size(max = 256)
	public String eventTraceBufferR;

	public DataGathering() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter is the maximum depth of the entire data gathering event buffer at the VTU-R, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as LOGGING_DEPTH_R in Clause 7.5.3.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getLoggingDepthR() {
		return loggingDepthR;
	}

	/**
	 * Set the this parameter is the maximum depth of the entire data gathering event buffer at the VTU-R, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as LOGGING_DEPTH_R in Clause 7.5.3.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param loggingDepthR the input value
	 */
	public void  setLoggingDepthR(Long loggingDepthR) {
		this.loggingDepthR = loggingDepthR;
	}

	/**
	 * Set the this parameter is the maximum depth of the entire data gathering event buffer at the VTU-R, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as LOGGING_DEPTH_R in Clause 7.5.3.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param loggingDepthR the input value
	 * @return this instance
	 */
	public DataGathering withLoggingDepthR(Long loggingDepthR) {
		this.loggingDepthR = loggingDepthR;
		return this;
	}

	/**
	 * Get the this parameter is actual logging depth that is used for reporting the VTU-R event trace buffer over the eoc channel, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as ACT_LOGGING_DEPTH_REPORTING_R in Clause 7.5.3.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActLoggingDepthReportingR() {
		return actLoggingDepthReportingR;
	}

	/**
	 * Set the this parameter is actual logging depth that is used for reporting the VTU-R event trace buffer over the eoc channel, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as ACT_LOGGING_DEPTH_REPORTING_R in Clause 7.5.3.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actLoggingDepthReportingR the input value
	 */
	public void  setActLoggingDepthReportingR(Long actLoggingDepthReportingR) {
		this.actLoggingDepthReportingR = actLoggingDepthReportingR;
	}

	/**
	 * Set the this parameter is actual logging depth that is used for reporting the VTU-R event trace buffer over the eoc channel, in number of records, where each of the records consists of 6 bytes indicating a data gathering event as defined in {{bibref|G.993.2}}.

          Note: This parameter is defined as ACT_LOGGING_DEPTH_REPORTING_R in Clause 7.5.3.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actLoggingDepthReportingR the input value
	 * @return this instance
	 */
	public DataGathering withActLoggingDepthReportingR(Long actLoggingDepthReportingR) {
		this.actLoggingDepthReportingR = actLoggingDepthReportingR;
		return this;
	}

	/**
	 * Get the this parameter identifies the log file of the the data gathering event trace buffer containing the event records that originated at the VTU-R.

          This indicates the table entry that represents a Vendor Log File that contains the data gathering buffer at the VTU-R in the {{object|###.DeviceInfo.VendorLogFile}} table. 

          This data gathering buffer MAY be retrieved wia an upload RPC of the identified Vendor Log File.

          Note: This parameter is defined as EVENT_TRACE_BUFFER_R in Clause 7.5.3.6 of ITU-T Recommendation {{bibref|G.997.1}} and Clause 11.5 of ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getEventTraceBufferR() {
		return eventTraceBufferR;
	}

	/**
	 * Set the this parameter identifies the log file of the the data gathering event trace buffer containing the event records that originated at the VTU-R.

          This indicates the table entry that represents a Vendor Log File that contains the data gathering buffer at the VTU-R in the {{object|###.DeviceInfo.VendorLogFile}} table. 

          This data gathering buffer MAY be retrieved wia an upload RPC of the identified Vendor Log File.

          Note: This parameter is defined as EVENT_TRACE_BUFFER_R in Clause 7.5.3.6 of ITU-T Recommendation {{bibref|G.997.1}} and Clause 11.5 of ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @since 2.8
	 * @param eventTraceBufferR the input value
	 */
	public void  setEventTraceBufferR(String eventTraceBufferR) {
		this.eventTraceBufferR = eventTraceBufferR;
	}

	/**
	 * Set the this parameter identifies the log file of the the data gathering event trace buffer containing the event records that originated at the VTU-R.

          This indicates the table entry that represents a Vendor Log File that contains the data gathering buffer at the VTU-R in the {{object|###.DeviceInfo.VendorLogFile}} table. 

          This data gathering buffer MAY be retrieved wia an upload RPC of the identified Vendor Log File.

          Note: This parameter is defined as EVENT_TRACE_BUFFER_R in Clause 7.5.3.6 of ITU-T Recommendation {{bibref|G.997.1}} and Clause 11.5 of ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @since 2.8
	 * @param eventTraceBufferR the input value
	 * @return this instance
	 */
	public DataGathering withEventTraceBufferR(String eventTraceBufferR) {
		this.eventTraceBufferR = eventTraceBufferR;
		return this;
	}

	//</editor-fold>

}