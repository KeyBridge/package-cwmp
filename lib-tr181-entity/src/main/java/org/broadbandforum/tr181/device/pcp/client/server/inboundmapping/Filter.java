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
package org.broadbandforum.tr181.device.pcp.client.server.inboundmapping;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * Filter table.

        This table contains all Filters restricting this Inbound Mapping, as defined in {{bibref|RFC6887|}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.Server.{i}.InboundMapping.{i}.Filter.{i}.")
public class Filter {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Permitted remote peer IP address for this filter.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemoteHostIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress remoteHostIPAddress;
	/**
	 * Indicates how many bits of {{param|RemoteHostIPAddress}} are relevant for this filter.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PrefixLength")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 128)
	public Long prefixLength = 128L;
	/**
	 * Permitted remote peer port number for this filter.

          The value 0 indicates ''all ports''.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemotePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long remotePort;
	/**
	 * Indicates the last port of the remote port range that starts with {{param|RemotePort}}. 

          If an external port range is specified, then the behavior described for {{param|RemotePort}} applies to all ports within the range. 

          A value of zero (0) indicates that no remote port range is specified, i.e. that the range consists only of {{param|RemotePort}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RemotePortEndRange")
	@Size(min = 0, max = 65535)
	public Long remotePortEndRange = 0L;

	public Filter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Filter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the permitted remote peer IP address for this filter.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getRemoteHostIPAddress() {
		return remoteHostIPAddress;
	}

	/**
	 * Set the permitted remote peer IP address for this filter.
	 *
	 * @since 2.8
	 * @param remoteHostIPAddress the input value
	 */
	public void  setRemoteHostIPAddress(IPAddress remoteHostIPAddress) {
		this.remoteHostIPAddress = remoteHostIPAddress;
	}

	/**
	 * Set the permitted remote peer IP address for this filter.
	 *
	 * @since 2.8
	 * @param remoteHostIPAddress the input value
	 * @return this instance
	 */
	public Filter withRemoteHostIPAddress(IPAddress remoteHostIPAddress) {
		this.remoteHostIPAddress = remoteHostIPAddress;
		return this;
	}

	/**
	 * Get the indicates how many bits of {{param|RemoteHostIPAddress}} are relevant for this filter.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPrefixLength() {
		return prefixLength;
	}

	/**
	 * Set the indicates how many bits of {{param|RemoteHostIPAddress}} are relevant for this filter.
	 *
	 * @since 2.8
	 * @param prefixLength the input value
	 */
	public void  setPrefixLength(Long prefixLength) {
		this.prefixLength = prefixLength;
	}

	/**
	 * Set the indicates how many bits of {{param|RemoteHostIPAddress}} are relevant for this filter.
	 *
	 * @since 2.8
	 * @param prefixLength the input value
	 * @return this instance
	 */
	public Filter withPrefixLength(Long prefixLength) {
		this.prefixLength = prefixLength;
		return this;
	}

	/**
	 * Get the permitted remote peer port number for this filter.

          The value 0 indicates ''all ports''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRemotePort() {
		return remotePort;
	}

	/**
	 * Set the permitted remote peer port number for this filter.

          The value 0 indicates ''all ports''.
	 *
	 * @since 2.8
	 * @param remotePort the input value
	 */
	public void  setRemotePort(Long remotePort) {
		this.remotePort = remotePort;
	}

	/**
	 * Set the permitted remote peer port number for this filter.

          The value 0 indicates ''all ports''.
	 *
	 * @since 2.8
	 * @param remotePort the input value
	 * @return this instance
	 */
	public Filter withRemotePort(Long remotePort) {
		this.remotePort = remotePort;
		return this;
	}

	/**
	 * Get the indicates the last port of the remote port range that starts with {{param|RemotePort}}. 

          If an external port range is specified, then the behavior described for {{param|RemotePort}} applies to all ports within the range. 

          A value of zero (0) indicates that no remote port range is specified, i.e. that the range consists only of {{param|RemotePort}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getRemotePortEndRange() {
		return remotePortEndRange;
	}

	/**
	 * Set the indicates the last port of the remote port range that starts with {{param|RemotePort}}. 

          If an external port range is specified, then the behavior described for {{param|RemotePort}} applies to all ports within the range. 

          A value of zero (0) indicates that no remote port range is specified, i.e. that the range consists only of {{param|RemotePort}}.
	 *
	 * @since 2.8
	 * @param remotePortEndRange the input value
	 */
	public void  setRemotePortEndRange(Long remotePortEndRange) {
		this.remotePortEndRange = remotePortEndRange;
	}

	/**
	 * Set the indicates the last port of the remote port range that starts with {{param|RemotePort}}. 

          If an external port range is specified, then the behavior described for {{param|RemotePort}} applies to all ports within the range. 

          A value of zero (0) indicates that no remote port range is specified, i.e. that the range consists only of {{param|RemotePort}}.
	 *
	 * @since 2.8
	 * @param remotePortEndRange the input value
	 * @return this instance
	 */
	public Filter withRemotePortEndRange(Long remotePortEndRange) {
		this.remotePortEndRange = remotePortEndRange;
		return this;
	}

	//</editor-fold>

}