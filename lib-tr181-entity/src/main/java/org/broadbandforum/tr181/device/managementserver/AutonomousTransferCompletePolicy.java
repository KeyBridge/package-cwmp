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
package org.broadbandforum.tr181.device.managementserver;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object allows configuration of CPE policy for notification of AUTONOMOUS TRANSFER COMPLETE events, defined in {{bibref|TR-069a2}}.

        The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of file transfers that were not specifically requested by the ACS.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.ManagementServer.AutonomousTransferCompletePolicy.")
@XmlRootElement(name = "Device.ManagementServer.AutonomousTransferCompletePolicy")
@XmlType(name = "Device.ManagementServer.AutonomousTransferCompletePolicy")
@XmlAccessorType(XmlAccessType.FIELD)
public class AutonomousTransferCompletePolicy {

	/**
	 * Enable/disable CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the transfer types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.   Transfer types not indicated by this filter MUST NOT be included when the CPE notifies the ACS. {{enum}}

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransferTypeFilter")
	@CWMPParameter(access = "readWrite")
	public String transferTypeFilter;
	/**
	 * Indicates the transfer results that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  Transfer results omitted from this list MUST NOT be included when the CPE notifies the ACS.

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResultTypeFilter")
	@CWMPParameter(access = "readWrite")
	public String resultTypeFilter;
	/**
	 * {{list}} Indicates the file types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  File types omitted from this list MUST NOT be included when the CPE notifies the ACS.

          {{pattern}}

          Additionally, the following format is defined to allow the unique definition of vendor-specific file types:

          * ''"X <OUI> <Vendor-specific identifier>"''

          <OUI> is replaced by a 6 hexadecimal-digit OUI (organizationally unique identifier) as defined in {{bibref|OUI}}, with all upper-case letters and any leading zeros included. The OUI used for a given vendor-specific file type MUST be one that is assigned to the organization that defined this file type (which is not necessarily the same as the vendor of the CPE or ACS).

          Note that {{empty}} indicates that all file types are excluded from this filter, effectively disabling CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FileTypeFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> fileTypeFilter;

	public AutonomousTransferCompletePolicy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable/disable CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable/disable CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable/disable CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AutonomousTransferCompletePolicy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the transfer types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.   Transfer types not indicated by this filter MUST NOT be included when the CPE notifies the ACS. {{enum}}

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTransferTypeFilter() {
		return transferTypeFilter;
	}

	/**
	 * Set the indicates the transfer types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.   Transfer types not indicated by this filter MUST NOT be included when the CPE notifies the ACS. {{enum}}

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @param transferTypeFilter the input value
	 */
	public void  setTransferTypeFilter(String transferTypeFilter) {
		this.transferTypeFilter = transferTypeFilter;
	}

	/**
	 * Set the indicates the transfer types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.   Transfer types not indicated by this filter MUST NOT be included when the CPE notifies the ACS. {{enum}}

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @param transferTypeFilter the input value
	 * @return this instance
	 */
	public AutonomousTransferCompletePolicy withTransferTypeFilter(String transferTypeFilter) {
		this.transferTypeFilter = transferTypeFilter;
		return this;
	}

	/**
	 * Get the indicates the transfer results that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  Transfer results omitted from this list MUST NOT be included when the CPE notifies the ACS.

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getResultTypeFilter() {
		return resultTypeFilter;
	}

	/**
	 * Set the indicates the transfer results that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  Transfer results omitted from this list MUST NOT be included when the CPE notifies the ACS.

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @param resultTypeFilter the input value
	 */
	public void  setResultTypeFilter(String resultTypeFilter) {
		this.resultTypeFilter = resultTypeFilter;
	}

	/**
	 * Set the indicates the transfer results that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  Transfer results omitted from this list MUST NOT be included when the CPE notifies the ACS.

          Note that this includes any backup or restore operations that were not specifically requested by the ACS.  A backup is regarded as an Upload and a restore is regarded as a Download.
	 *
	 * @since 2.0
	 * @param resultTypeFilter the input value
	 * @return this instance
	 */
	public AutonomousTransferCompletePolicy withResultTypeFilter(String resultTypeFilter) {
		this.resultTypeFilter = resultTypeFilter;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the file types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  File types omitted from this list MUST NOT be included when the CPE notifies the ACS.

          {{pattern}}

          Additionally, the following format is defined to allow the unique definition of vendor-specific file types:

          * ''"X <OUI> <Vendor-specific identifier>"''

          <OUI> is replaced by a 6 hexadecimal-digit OUI (organizationally unique identifier) as defined in {{bibref|OUI}}, with all upper-case letters and any leading zeros included. The OUI used for a given vendor-specific file type MUST be one that is assigned to the organization that defined this file type (which is not necessarily the same as the vendor of the CPE or ACS).

          Note that {{empty}} indicates that all file types are excluded from this filter, effectively disabling CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFileTypeFilter() {
		if (this.fileTypeFilter == null){ this.fileTypeFilter=new ArrayList<>();}
		return fileTypeFilter;
	}

	/**
	 * Set the {{list}} Indicates the file types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  File types omitted from this list MUST NOT be included when the CPE notifies the ACS.

          {{pattern}}

          Additionally, the following format is defined to allow the unique definition of vendor-specific file types:

          * ''"X <OUI> <Vendor-specific identifier>"''

          <OUI> is replaced by a 6 hexadecimal-digit OUI (organizationally unique identifier) as defined in {{bibref|OUI}}, with all upper-case letters and any leading zeros included. The OUI used for a given vendor-specific file type MUST be one that is assigned to the organization that defined this file type (which is not necessarily the same as the vendor of the CPE or ACS).

          Note that {{empty}} indicates that all file types are excluded from this filter, effectively disabling CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @param fileTypeFilter the input value
	 */
	public void  setFileTypeFilter(Collection<String> fileTypeFilter) {
		this.fileTypeFilter = fileTypeFilter;
	}

	/**
	 * Set the {{list}} Indicates the file types that MUST be included when the CPE notifies the ACS of AUTONOMOUS TRANSFER COMPLETE events.  File types omitted from this list MUST NOT be included when the CPE notifies the ACS.

          {{pattern}}

          Additionally, the following format is defined to allow the unique definition of vendor-specific file types:

          * ''"X <OUI> <Vendor-specific identifier>"''

          <OUI> is replaced by a 6 hexadecimal-digit OUI (organizationally unique identifier) as defined in {{bibref|OUI}}, with all upper-case letters and any leading zeros included. The OUI used for a given vendor-specific file type MUST be one that is assigned to the organization that defined this file type (which is not necessarily the same as the vendor of the CPE or ACS).

          Note that {{empty}} indicates that all file types are excluded from this filter, effectively disabling CPE notification of AUTONOMOUS TRANSFER COMPLETE events to the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public AutonomousTransferCompletePolicy withFileTypeFilter(String string) {
		getFileTypeFilter().add(string);
		return this;
	}

	//</editor-fold>

}