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
package org.broadbandforum.tr181.device.moca._interface;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.moca._interface.qos.FlowStats;

	/**
	 * The QoS object provides information on MoCA parameterized QoS for this interface {{bibref|MoCAv1.1}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.MoCA.Interface.{i}.QoS.")
public class QoS {

	/**
	 * The number of QoS flows that this interface has from the MoCA network.

          This parameter is based on ''mocaIfEgressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EgressNumFlows")
	public Long egressNumFlows;
	/**
	 * The number of QoS flows that this interface has onto the MoCA network.

          This parameter is based on ''mocaIfIngressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IngressNumFlows")
	public Long ingressNumFlows;
	/**
	 * The flow statistics table provides information on the MoCA parameterized QoS flows this interface has allocated onto the MoCA network.
	 */
	@XmlElementWrapper(name = "FlowStatss")
	@XmlElement(name = "FlowStats")
	public Collection<FlowStats> flowStatss;

	public QoS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of QoS flows that this interface has from the MoCA network.

          This parameter is based on ''mocaIfEgressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEgressNumFlows() {
		return egressNumFlows;
	}

	/**
	 * Set the number of QoS flows that this interface has from the MoCA network.

          This parameter is based on ''mocaIfEgressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param egressNumFlows the input value
	 */
	public void  setEgressNumFlows(Long egressNumFlows) {
		this.egressNumFlows = egressNumFlows;
	}

	/**
	 * Set the number of QoS flows that this interface has from the MoCA network.

          This parameter is based on ''mocaIfEgressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param egressNumFlows the input value
	 * @return this instance
	 */
	public QoS withEgressNumFlows(Long egressNumFlows) {
		this.egressNumFlows = egressNumFlows;
		return this;
	}

	/**
	 * Get the number of QoS flows that this interface has onto the MoCA network.

          This parameter is based on ''mocaIfIngressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIngressNumFlows() {
		return ingressNumFlows;
	}

	/**
	 * Set the number of QoS flows that this interface has onto the MoCA network.

          This parameter is based on ''mocaIfIngressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param ingressNumFlows the input value
	 */
	public void  setIngressNumFlows(Long ingressNumFlows) {
		this.ingressNumFlows = ingressNumFlows;
	}

	/**
	 * Set the number of QoS flows that this interface has onto the MoCA network.

          This parameter is based on ''mocaIfIngressNodeNumFlows'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param ingressNumFlows the input value
	 * @return this instance
	 */
	public QoS withIngressNumFlows(Long ingressNumFlows) {
		this.ingressNumFlows = ingressNumFlows;
		return this;
	}

	/**
	 * Get the flow statistics table provides information on the MoCA parameterized QoS flows this interface has allocated onto the MoCA network.
	 *
	 * @return the value
	 */
	public Collection<FlowStats> getFlowStatss() {
		if (this.flowStatss == null){ this.flowStatss=new ArrayList<>();}
		return flowStatss;
	}

	/**
	 * Set the flow statistics table provides information on the MoCA parameterized QoS flows this interface has allocated onto the MoCA network.
	 *
	 * @param flowStatss the input value
	 */
	public void  setFlowStatss(Collection<FlowStats> flowStatss) {
		this.flowStatss = flowStatss;
	}

	/**
	 * Set the flow statistics table provides information on the MoCA parameterized QoS flows this interface has allocated onto the MoCA network.
	 *
	 * @param flowStats the input value
	 * @return this instance
	 */
	public QoS withFlowStats(FlowStats flowStats) {
		getFlowStatss().add(flowStats);
		return this;
	}

	//</editor-fold>

}