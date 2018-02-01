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
package org.broadbandforum.tr181.device.dhcpv6;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dhcpv6.client.ReceivedOption;
import org.broadbandforum.tr181.device.dhcpv6.client.SentOption;
import org.broadbandforum.tr181.device.dhcpv6.client.Server;

	/**
	 * This object contains DHCPv6 client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference.  If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}.  However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Client.{i}.")
public class Client {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}} The IP Interface associated with the {{object}} entry. This will reference an IPv6-capable interface (that is attached to the IPv6 stack), otherwise the table entry will be inoperable.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * The client's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}}. {{param}} is set by the CPE.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DUID")
	public byte[] duiD;
	/**
	 * Enables or disables inclusion of the ''Identity Association (IA) for Non-Temporary Address'' option OPTION_IA_NA(3) {{bibref|RFC3315|Section 22.4}} in Solicit messages.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RequestAddresses")
	@CWMPParameter(access = "readWrite")
	public Boolean requestAddresses = true;
	/**
	 * Enables or disables inclusion of the ''Identity Association (IA) for Prefix Delegation'' option OPTION_IA_PD(25) {{bibref|RFC3633|Section 10}} in Solicit messages.

          Note that this is only appropriate for an upstream interface on a requesting router, e.g. for an RG WAN interface.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RequestPrefixes")
	@CWMPParameter(access = "readWrite")
	public Boolean requestPrefixes = false;
	/**
	 * Enables or disables inclusion of the ''Rapid Commit'' option OPTION_RAPID_COMMIT(14) {{bibref|RFC3315|Section 22.14}} in Solicit messages.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RapidCommit")
	@CWMPParameter(access = "readWrite")
	public Boolean rapidCommit = false;
	/**
	 * When set to {{true}}, the {{object}} will renew its DHCPv6-supplied information (i.e. the CPE will do a renew or information request as needed, updating both stateful and stateless parameter values discovered by this Client instance).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Renew")
	@CWMPParameter(access = "readWrite")
	public Boolean renew = false;
	/**
	 * T1 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T1 value is specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SuggestedT1")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer suggestedT1;
	/**
	 * T2 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T2 value is specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SuggestedT2")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer suggestedT2;
	/**
	 * {{list}} The options that the client is able to process in server responses.  This list MUST include both top-level and encapsulated options, e.g. if the client is able to process OPTION_IA_NA (3) with an encapsulated OPTION_IAADDR (5), the list would be expected to include both 3 and 5.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SupportedOptions")
	public Long supportedOptions;
	/**
	 * {{list}} An ordered list of the top-level options (i.e. not encapsulated options) that the client will explicitly request from the server.

          This parameter is intended only for options that are not necessary for the basic operation of the protocol, and are not modeled elsewhere.  For example, it is appropriate for OPTION_DNS_SERVERS {{bibref|RFC3646}} but is not appropriate for OPTION_SERVERID (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|RequestAddresses}}) or OPTION_IA_PD (which is modeled via {{param|RequestPrefixes}}).  However, the CPE MUST NOT reject an attempt to set this parameter to a value that includes options that it regards as inappropriate; instead, it MUST accept the requested options and handle them as best it can.

          Loosely speaking, these are the options that the client will include in OPTION_ORO {{bibref|RFC3315}} but the client is free to decide (in accordance with {{bibref|RFC3315}}) in which messages to request which option, whether also to request additional options, whether not to request inappropriate options, and in which order to request any options that are also in {{param|SupportedOptions}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "RequestedOptions")
	@CWMPParameter(access = "readWrite")
	public Long requestedOptions;
	/**
	 * This is a transitory table that lists the discovered DHCPv6 servers (it does ''not'' model a local DHCP server). Table entries are automatically created to correspond with these servers. However, it is a local matter to the CPE when to delete old table entries.
	 */
	@XmlElementWrapper(name = "Servers")
	@XmlElement(name = "Server")
	public Collection<Server> servers;
	/**
	 * The top-level options and option values (including any encapsulated options) that the client will send to the server.

        This table is intended only for options that are not part of the basic operation of the protocol, and whose values are simple, do not often change and are not modeled elsewhere.  For example, it is appropriate for OPTION_USER_CLASS (whose value is a list of user classes) but is not appropriate for OPTION_RECONF_MSG (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|#.RequestAddresses}}) or OPTION_RAPID_COMMIT (which is modeled via {{param|#.RapidCommit}}).
	 */
	@XmlElementWrapper(name = "SentOptions")
	@XmlElement(name = "SentOption")
	@CWMPParameter(access = "readWrite")
	public Collection<SentOption> sentOptions;
	/**
	 * This is a transitory table that lists all the options received from all servers. Table entries are automatically created to correspond with received options. However, it is a local matter to the CPE when to delete old table entries.

        If the same option is received multiple times, whether from one or more servers, it is up to the CPE to decide which entries to include (i.e. whether the same option will be present multiple times). In order to allow for the same option to be present multiple times within the table, this table has no unique key defined.
	 */
	@XmlElementWrapper(name = "ReceivedOptions")
	@XmlElement(name = "ReceivedOption")
	public Collection<ReceivedOption> receivedOptions;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} The IP Interface associated with the {{object}} entry. This will reference an IPv6-capable interface (that is attached to the IPv6 stack), otherwise the table entry will be inoperable.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the {{object}} entry. This will reference an IPv6-capable interface (that is attached to the IPv6 stack), otherwise the table entry will be inoperable.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the {{object}} entry. This will reference an IPv6-capable interface (that is attached to the IPv6 stack), otherwise the table entry will be inoperable.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 * @return this instance
	 */
	public Client with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this table entry. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the client's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}}. {{param}} is set by the CPE.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getDuiD() {
		return duiD;
	}

	/**
	 * Set the client's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}}. {{param}} is set by the CPE.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 */
	public void  setDuiD(byte[] duiD) {
		this.duiD = duiD;
	}

	/**
	 * Set the client's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}}. {{param}} is set by the CPE.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 * @return this instance
	 */
	public Client withDuiD(byte[] duiD) {
		this.duiD = duiD;
		return this;
	}

	/**
	 * Get the enables or disables inclusion of the ''Identity Association (IA) for Non-Temporary Address'' option OPTION_IA_NA(3) {{bibref|RFC3315|Section 22.4}} in Solicit messages.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isRequestAddresses() {
		return requestAddresses;
	}

	/**
	 * Set the enables or disables inclusion of the ''Identity Association (IA) for Non-Temporary Address'' option OPTION_IA_NA(3) {{bibref|RFC3315|Section 22.4}} in Solicit messages.
	 *
	 * @since 2.2
	 * @param requestAddresses the input value
	 */
	public void  setRequestAddresses(Boolean requestAddresses) {
		this.requestAddresses = requestAddresses;
	}

	/**
	 * Set the enables or disables inclusion of the ''Identity Association (IA) for Non-Temporary Address'' option OPTION_IA_NA(3) {{bibref|RFC3315|Section 22.4}} in Solicit messages.
	 *
	 * @since 2.2
	 * @param requestAddresses the input value
	 * @return this instance
	 */
	public Client withRequestAddresses(Boolean requestAddresses) {
		this.requestAddresses = requestAddresses;
		return this;
	}

	/**
	 * Get the enables or disables inclusion of the ''Identity Association (IA) for Prefix Delegation'' option OPTION_IA_PD(25) {{bibref|RFC3633|Section 10}} in Solicit messages.

          Note that this is only appropriate for an upstream interface on a requesting router, e.g. for an RG WAN interface.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isRequestPrefixes() {
		return requestPrefixes;
	}

	/**
	 * Set the enables or disables inclusion of the ''Identity Association (IA) for Prefix Delegation'' option OPTION_IA_PD(25) {{bibref|RFC3633|Section 10}} in Solicit messages.

          Note that this is only appropriate for an upstream interface on a requesting router, e.g. for an RG WAN interface.
	 *
	 * @since 2.2
	 * @param requestPrefixes the input value
	 */
	public void  setRequestPrefixes(Boolean requestPrefixes) {
		this.requestPrefixes = requestPrefixes;
	}

	/**
	 * Set the enables or disables inclusion of the ''Identity Association (IA) for Prefix Delegation'' option OPTION_IA_PD(25) {{bibref|RFC3633|Section 10}} in Solicit messages.

          Note that this is only appropriate for an upstream interface on a requesting router, e.g. for an RG WAN interface.
	 *
	 * @since 2.2
	 * @param requestPrefixes the input value
	 * @return this instance
	 */
	public Client withRequestPrefixes(Boolean requestPrefixes) {
		this.requestPrefixes = requestPrefixes;
		return this;
	}

	/**
	 * Get the enables or disables inclusion of the ''Rapid Commit'' option OPTION_RAPID_COMMIT(14) {{bibref|RFC3315|Section 22.14}} in Solicit messages.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isRapidCommit() {
		return rapidCommit;
	}

	/**
	 * Set the enables or disables inclusion of the ''Rapid Commit'' option OPTION_RAPID_COMMIT(14) {{bibref|RFC3315|Section 22.14}} in Solicit messages.
	 *
	 * @since 2.2
	 * @param rapidCommit the input value
	 */
	public void  setRapidCommit(Boolean rapidCommit) {
		this.rapidCommit = rapidCommit;
	}

	/**
	 * Set the enables or disables inclusion of the ''Rapid Commit'' option OPTION_RAPID_COMMIT(14) {{bibref|RFC3315|Section 22.14}} in Solicit messages.
	 *
	 * @since 2.2
	 * @param rapidCommit the input value
	 * @return this instance
	 */
	public Client withRapidCommit(Boolean rapidCommit) {
		this.rapidCommit = rapidCommit;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the {{object}} will renew its DHCPv6-supplied information (i.e. the CPE will do a renew or information request as needed, updating both stateful and stateless parameter values discovered by this Client instance).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isRenew() {
		return renew;
	}

	/**
	 * Set the when set to {{true}}, the {{object}} will renew its DHCPv6-supplied information (i.e. the CPE will do a renew or information request as needed, updating both stateful and stateless parameter values discovered by this Client instance).
	 *
	 * @since 2.2
	 * @param renew the input value
	 */
	public void  setRenew(Boolean renew) {
		this.renew = renew;
	}

	/**
	 * Set the when set to {{true}}, the {{object}} will renew its DHCPv6-supplied information (i.e. the CPE will do a renew or information request as needed, updating both stateful and stateless parameter values discovered by this Client instance).
	 *
	 * @since 2.2
	 * @param renew the input value
	 * @return this instance
	 */
	public Client withRenew(Boolean renew) {
		this.renew = renew;
		return this;
	}

	/**
	 * Get the t1 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T1 value is specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getSuggestedT1() {
		return suggestedT1;
	}

	/**
	 * Set the t1 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T1 value is specified.
	 *
	 * @since 2.2
	 * @param suggestedT1 the input value
	 */
	public void  setSuggestedT1(Integer suggestedT1) {
		this.suggestedT1 = suggestedT1;
	}

	/**
	 * Set the t1 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T1 value is specified.
	 *
	 * @since 2.2
	 * @param suggestedT1 the input value
	 * @return this instance
	 */
	public Client withSuggestedT1(Integer suggestedT1) {
		this.suggestedT1 = suggestedT1;
		return this;
	}

	/**
	 * Get the t2 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T2 value is specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getSuggestedT2() {
		return suggestedT2;
	}

	/**
	 * Set the t2 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T2 value is specified.
	 *
	 * @since 2.2
	 * @param suggestedT2 the input value
	 */
	public void  setSuggestedT2(Integer suggestedT2) {
		this.suggestedT2 = suggestedT2;
	}

	/**
	 * Set the t2 value, in seconds, that the client SHOULD use when sending IA options, e.g. OPTION_IA_NA {{bibref|RFC3315|Section 22.4}} and OPTION_IA_PD {{bibref|RFC3633|Section 10}}.

          A value of -1 indicates that no T2 value is specified.
	 *
	 * @since 2.2
	 * @param suggestedT2 the input value
	 * @return this instance
	 */
	public Client withSuggestedT2(Integer suggestedT2) {
		this.suggestedT2 = suggestedT2;
		return this;
	}

	/**
	 * Get the {{list}} The options that the client is able to process in server responses.  This list MUST include both top-level and encapsulated options, e.g. if the client is able to process OPTION_IA_NA (3) with an encapsulated OPTION_IAADDR (5), the list would be expected to include both 3 and 5.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getSupportedOptions() {
		return supportedOptions;
	}

	/**
	 * Set the {{list}} The options that the client is able to process in server responses.  This list MUST include both top-level and encapsulated options, e.g. if the client is able to process OPTION_IA_NA (3) with an encapsulated OPTION_IAADDR (5), the list would be expected to include both 3 and 5.
	 *
	 * @since 2.2
	 * @param supportedOptions the input value
	 */
	public void  setSupportedOptions(Long supportedOptions) {
		this.supportedOptions = supportedOptions;
	}

	/**
	 * Set the {{list}} The options that the client is able to process in server responses.  This list MUST include both top-level and encapsulated options, e.g. if the client is able to process OPTION_IA_NA (3) with an encapsulated OPTION_IAADDR (5), the list would be expected to include both 3 and 5.
	 *
	 * @since 2.2
	 * @param supportedOptions the input value
	 * @return this instance
	 */
	public Client withSupportedOptions(Long supportedOptions) {
		this.supportedOptions = supportedOptions;
		return this;
	}

	/**
	 * Get the {{list}} An ordered list of the top-level options (i.e. not encapsulated options) that the client will explicitly request from the server.

          This parameter is intended only for options that are not necessary for the basic operation of the protocol, and are not modeled elsewhere.  For example, it is appropriate for OPTION_DNS_SERVERS {{bibref|RFC3646}} but is not appropriate for OPTION_SERVERID (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|RequestAddresses}}) or OPTION_IA_PD (which is modeled via {{param|RequestPrefixes}}).  However, the CPE MUST NOT reject an attempt to set this parameter to a value that includes options that it regards as inappropriate; instead, it MUST accept the requested options and handle them as best it can.

          Loosely speaking, these are the options that the client will include in OPTION_ORO {{bibref|RFC3315}} but the client is free to decide (in accordance with {{bibref|RFC3315}}) in which messages to request which option, whether also to request additional options, whether not to request inappropriate options, and in which order to request any options that are also in {{param|SupportedOptions}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getRequestedOptions() {
		return requestedOptions;
	}

	/**
	 * Set the {{list}} An ordered list of the top-level options (i.e. not encapsulated options) that the client will explicitly request from the server.

          This parameter is intended only for options that are not necessary for the basic operation of the protocol, and are not modeled elsewhere.  For example, it is appropriate for OPTION_DNS_SERVERS {{bibref|RFC3646}} but is not appropriate for OPTION_SERVERID (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|RequestAddresses}}) or OPTION_IA_PD (which is modeled via {{param|RequestPrefixes}}).  However, the CPE MUST NOT reject an attempt to set this parameter to a value that includes options that it regards as inappropriate; instead, it MUST accept the requested options and handle them as best it can.

          Loosely speaking, these are the options that the client will include in OPTION_ORO {{bibref|RFC3315}} but the client is free to decide (in accordance with {{bibref|RFC3315}}) in which messages to request which option, whether also to request additional options, whether not to request inappropriate options, and in which order to request any options that are also in {{param|SupportedOptions}}.
	 *
	 * @since 2.2
	 * @param requestedOptions the input value
	 */
	public void  setRequestedOptions(Long requestedOptions) {
		this.requestedOptions = requestedOptions;
	}

	/**
	 * Set the {{list}} An ordered list of the top-level options (i.e. not encapsulated options) that the client will explicitly request from the server.

          This parameter is intended only for options that are not necessary for the basic operation of the protocol, and are not modeled elsewhere.  For example, it is appropriate for OPTION_DNS_SERVERS {{bibref|RFC3646}} but is not appropriate for OPTION_SERVERID (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|RequestAddresses}}) or OPTION_IA_PD (which is modeled via {{param|RequestPrefixes}}).  However, the CPE MUST NOT reject an attempt to set this parameter to a value that includes options that it regards as inappropriate; instead, it MUST accept the requested options and handle them as best it can.

          Loosely speaking, these are the options that the client will include in OPTION_ORO {{bibref|RFC3315}} but the client is free to decide (in accordance with {{bibref|RFC3315}}) in which messages to request which option, whether also to request additional options, whether not to request inappropriate options, and in which order to request any options that are also in {{param|SupportedOptions}}.
	 *
	 * @since 2.2
	 * @param requestedOptions the input value
	 * @return this instance
	 */
	public Client withRequestedOptions(Long requestedOptions) {
		this.requestedOptions = requestedOptions;
		return this;
	}

	/**
	 * Get the this is a transitory table that lists the discovered DHCPv6 servers (it does ''not'' model a local DHCP server). Table entries are automatically created to correspond with these servers. However, it is a local matter to the CPE when to delete old table entries.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the this is a transitory table that lists the discovered DHCPv6 servers (it does ''not'' model a local DHCP server). Table entries are automatically created to correspond with these servers. However, it is a local matter to the CPE when to delete old table entries.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the this is a transitory table that lists the discovered DHCPv6 servers (it does ''not'' model a local DHCP server). Table entries are automatically created to correspond with these servers. However, it is a local matter to the CPE when to delete old table entries.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public Client withServer(Server server) {
		getServers().add(server);
		return this;
	}

	/**
	 * Get the top-level options and option values (including any encapsulated options) that the client will send to the server.

        This table is intended only for options that are not part of the basic operation of the protocol, and whose values are simple, do not often change and are not modeled elsewhere.  For example, it is appropriate for OPTION_USER_CLASS (whose value is a list of user classes) but is not appropriate for OPTION_RECONF_MSG (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|#.RequestAddresses}}) or OPTION_RAPID_COMMIT (which is modeled via {{param|#.RapidCommit}}).
	 *
	 * @return the value
	 */
	public Collection<SentOption> getSentOptions() {
		if (this.sentOptions == null){ this.sentOptions=new ArrayList<>();}
		return sentOptions;
	}

	/**
	 * Set the top-level options and option values (including any encapsulated options) that the client will send to the server.

        This table is intended only for options that are not part of the basic operation of the protocol, and whose values are simple, do not often change and are not modeled elsewhere.  For example, it is appropriate for OPTION_USER_CLASS (whose value is a list of user classes) but is not appropriate for OPTION_RECONF_MSG (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|#.RequestAddresses}}) or OPTION_RAPID_COMMIT (which is modeled via {{param|#.RapidCommit}}).
	 *
	 * @param sentOptions the input value
	 */
	public void  setSentOptions(Collection<SentOption> sentOptions) {
		this.sentOptions = sentOptions;
	}

	/**
	 * Set the top-level options and option values (including any encapsulated options) that the client will send to the server.

        This table is intended only for options that are not part of the basic operation of the protocol, and whose values are simple, do not often change and are not modeled elsewhere.  For example, it is appropriate for OPTION_USER_CLASS (whose value is a list of user classes) but is not appropriate for OPTION_RECONF_MSG (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|#.RequestAddresses}}) or OPTION_RAPID_COMMIT (which is modeled via {{param|#.RapidCommit}}).
	 *
	 * @param sentOption the input value
	 * @return this instance
	 */
	public Client withSentOption(SentOption sentOption) {
		getSentOptions().add(sentOption);
		return this;
	}

	/**
	 * Get the this is a transitory table that lists all the options received from all servers. Table entries are automatically created to correspond with received options. However, it is a local matter to the CPE when to delete old table entries.

        If the same option is received multiple times, whether from one or more servers, it is up to the CPE to decide which entries to include (i.e. whether the same option will be present multiple times). In order to allow for the same option to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @return the value
	 */
	public Collection<ReceivedOption> getReceivedOptions() {
		if (this.receivedOptions == null){ this.receivedOptions=new ArrayList<>();}
		return receivedOptions;
	}

	/**
	 * Set the this is a transitory table that lists all the options received from all servers. Table entries are automatically created to correspond with received options. However, it is a local matter to the CPE when to delete old table entries.

        If the same option is received multiple times, whether from one or more servers, it is up to the CPE to decide which entries to include (i.e. whether the same option will be present multiple times). In order to allow for the same option to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @param receivedOptions the input value
	 */
	public void  setReceivedOptions(Collection<ReceivedOption> receivedOptions) {
		this.receivedOptions = receivedOptions;
	}

	/**
	 * Set the this is a transitory table that lists all the options received from all servers. Table entries are automatically created to correspond with received options. However, it is a local matter to the CPE when to delete old table entries.

        If the same option is received multiple times, whether from one or more servers, it is up to the CPE to decide which entries to include (i.e. whether the same option will be present multiple times). In order to allow for the same option to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @param receivedOption the input value
	 * @return this instance
	 */
	public Client withReceivedOption(ReceivedOption receivedOption) {
		getReceivedOptions().add(receivedOption);
		return this;
	}

	//</editor-fold>

}