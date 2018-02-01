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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object defines the properties to be used when the {{object|##.Profile}} object's {{param|#.EncodingType}} parameter value is {{enum|CSV|##.EncodingTypes}}.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.BulkData.Profile.{i}.CSVEncoding.")
public class CSVEncoding {

	/**
	 * Field separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "FieldSeparator")
	@CWMPParameter(access = "readWrite")
	public String fieldSeparator = ",";
	/**
	 * Row separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "RowSeparator")
	@CWMPParameter(access = "readWrite")
	public String rowSeparator;
	/**
	 * Escape character to use when encoding CSV data.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "EscapeCharacter")
	@CWMPParameter(access = "readWrite")
	public String escapeCharacter = "\"";
	/**
	 * This parameter describes the formatting used for reports defined by this profile as described in {{bibref|TR-157a10|Annex A.3.4}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ReportFormat")
	@CWMPParameter(access = "readWrite")
	public String reportFormat = "ParameterPerColumn";
	/**
	 * The format of the timestamp to use for data inserted into the row.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "RowTimestamp")
	@CWMPParameter(access = "readWrite")
	public String rowTimestamp = "Unix-Epoch";

	public CSVEncoding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the field separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getFieldSeparator() {
		return fieldSeparator;
	}

	/**
	 * Set the field separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param fieldSeparator the input value
	 */
	public void  setFieldSeparator(String fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}

	/**
	 * Set the field separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param fieldSeparator the input value
	 * @return this instance
	 */
	public CSVEncoding withFieldSeparator(String fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
		return this;
	}

	/**
	 * Get the row separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getRowSeparator() {
		return rowSeparator;
	}

	/**
	 * Set the row separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param rowSeparator the input value
	 */
	public void  setRowSeparator(String rowSeparator) {
		this.rowSeparator = rowSeparator;
	}

	/**
	 * Set the row separator to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param rowSeparator the input value
	 * @return this instance
	 */
	public CSVEncoding withRowSeparator(String rowSeparator) {
		this.rowSeparator = rowSeparator;
		return this;
	}

	/**
	 * Get the escape character to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getEscapeCharacter() {
		return escapeCharacter;
	}

	/**
	 * Set the escape character to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param escapeCharacter the input value
	 */
	public void  setEscapeCharacter(String escapeCharacter) {
		this.escapeCharacter = escapeCharacter;
	}

	/**
	 * Set the escape character to use when encoding CSV data.
	 *
	 * @since 2.10
	 * @param escapeCharacter the input value
	 * @return this instance
	 */
	public CSVEncoding withEscapeCharacter(String escapeCharacter) {
		this.escapeCharacter = escapeCharacter;
		return this;
	}

	/**
	 * Get the this parameter describes the formatting used for reports defined by this profile as described in {{bibref|TR-157a10|Annex A.3.4}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getReportFormat() {
		return reportFormat;
	}

	/**
	 * Set the this parameter describes the formatting used for reports defined by this profile as described in {{bibref|TR-157a10|Annex A.3.4}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @param reportFormat the input value
	 */
	public void  setReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
	}

	/**
	 * Set the this parameter describes the formatting used for reports defined by this profile as described in {{bibref|TR-157a10|Annex A.3.4}}.

          Note: This parameter is encoded as a token in the BBF-Report-Format header field and MUST NOT include spaces or other characters excluded from token characters defined in {{bibref|RFC2616}}.
	 *
	 * @since 2.10
	 * @param reportFormat the input value
	 * @return this instance
	 */
	public CSVEncoding withReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
		return this;
	}

	/**
	 * Get the format of the timestamp to use for data inserted into the row.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getRowTimestamp() {
		return rowTimestamp;
	}

	/**
	 * Set the format of the timestamp to use for data inserted into the row.
	 *
	 * @since 2.10
	 * @param rowTimestamp the input value
	 */
	public void  setRowTimestamp(String rowTimestamp) {
		this.rowTimestamp = rowTimestamp;
	}

	/**
	 * Set the format of the timestamp to use for data inserted into the row.
	 *
	 * @since 2.10
	 * @param rowTimestamp the input value
	 * @return this instance
	 */
	public CSVEncoding withRowTimestamp(String rowTimestamp) {
		this.rowTimestamp = rowTimestamp;
		return this;
	}

	//</editor-fold>

}