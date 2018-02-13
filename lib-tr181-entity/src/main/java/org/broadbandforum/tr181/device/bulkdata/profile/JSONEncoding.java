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
package org.broadbandforum.tr181.device.bulkdata.profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object defines the properties to be used when the {{object|##.Profile}} object's {{param|#.EncodingType}} parameter value is {{enum|JSON|##.EncodingTypes}}.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.BulkData.Profile.{i}.JSONEncoding.")
@XmlRootElement(name = "Device.BulkData.Profile.JSONEncoding")
@XmlType(name = "Device.BulkData.Profile.JSONEncoding")
@XmlAccessorType(XmlAccessType.FIELD)
public class JSONEncoding {

	/**
	 * This parameter describes the formatting used for the report as described in {{bibref|TR-157a10|Annex A.3.5}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ReportFormat")
	@CWMPParameter(access = "readWrite")
	public String reportFormat = "ObjectHierarchy";
	/**
	 * The format of timestamp to use for the JSON Object named "CollectionTime" as described in {{bibref|TR-157a10}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ReportTimestamp")
	@CWMPParameter(access = "readWrite")
	public String reportTimestamp = "Unix-Epoch";

	public JSONEncoding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter describes the formatting used for the report as described in {{bibref|TR-157a10|Annex A.3.5}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getReportFormat() {
		return reportFormat;
	}

	/**
	 * Set the this parameter describes the formatting used for the report as described in {{bibref|TR-157a10|Annex A.3.5}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @param reportFormat the input value
	 */
	public void  setReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
	}

	/**
	 * Set the this parameter describes the formatting used for the report as described in {{bibref|TR-157a10|Annex A.3.5}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @param reportFormat the input value
	 * @return this instance
	 */
	public JSONEncoding withReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
		return this;
	}

	/**
	 * Get the format of timestamp to use for the JSON Object named "CollectionTime" as described in {{bibref|TR-157a10}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getReportTimestamp() {
		return reportTimestamp;
	}

	/**
	 * Set the format of timestamp to use for the JSON Object named "CollectionTime" as described in {{bibref|TR-157a10}}.
	 *
	 * @since 2.10
	 * @param reportTimestamp the input value
	 */
	public void  setReportTimestamp(String reportTimestamp) {
		this.reportTimestamp = reportTimestamp;
	}

	/**
	 * Set the format of timestamp to use for the JSON Object named "CollectionTime" as described in {{bibref|TR-157a10}}.
	 *
	 * @since 2.10
	 * @param reportTimestamp the input value
	 * @return this instance
	 */
	public JSONEncoding withReportTimestamp(String reportTimestamp) {
		this.reportTimestamp = reportTimestamp;
		return this;
	}

	//</editor-fold>

}