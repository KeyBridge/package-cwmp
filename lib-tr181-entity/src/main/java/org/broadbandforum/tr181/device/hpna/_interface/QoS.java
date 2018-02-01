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
package org.broadbandforum.tr181.device.hpna._interface;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.hpna._interface.qos.FlowSpec;

	/**
	 * QoS configuration object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Interface.{i}.QoS.")
public class QoS {

	/**
	 * Flow specification table.

        The {{object|.QoS.Classification}} table is used to classify ingress traffic, where {{param|.QoS.Classification.{i}.TrafficClass}} is one of the classification result outputs. This ''TrafficClass'' value can be used to look up the appropriate {{object}} entry (i.e. the {{object}} entry whose {{param|TrafficClasses}} list contains a matching traffic class).

        For enabled table entries, if {{param|TrafficClasses}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "FlowSpecs")
	@XmlElement(name = "FlowSpec")
	@CWMPParameter(access = "readWrite")
	public Collection<FlowSpec> flowSpecs;

	public QoS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the flow specification table.

        The {{object|.QoS.Classification}} table is used to classify ingress traffic, where {{param|.QoS.Classification.{i}.TrafficClass}} is one of the classification result outputs. This ''TrafficClass'' value can be used to look up the appropriate {{object}} entry (i.e. the {{object}} entry whose {{param|TrafficClasses}} list contains a matching traffic class).

        For enabled table entries, if {{param|TrafficClasses}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<FlowSpec> getFlowSpecs() {
		if (this.flowSpecs == null){ this.flowSpecs=new ArrayList<>();}
		return flowSpecs;
	}

	/**
	 * Set the flow specification table.

        The {{object|.QoS.Classification}} table is used to classify ingress traffic, where {{param|.QoS.Classification.{i}.TrafficClass}} is one of the classification result outputs. This ''TrafficClass'' value can be used to look up the appropriate {{object}} entry (i.e. the {{object}} entry whose {{param|TrafficClasses}} list contains a matching traffic class).

        For enabled table entries, if {{param|TrafficClasses}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param flowSpecs the input value
	 */
	public void  setFlowSpecs(Collection<FlowSpec> flowSpecs) {
		this.flowSpecs = flowSpecs;
	}

	/**
	 * Set the flow specification table.

        The {{object|.QoS.Classification}} table is used to classify ingress traffic, where {{param|.QoS.Classification.{i}.TrafficClass}} is one of the classification result outputs. This ''TrafficClass'' value can be used to look up the appropriate {{object}} entry (i.e. the {{object}} entry whose {{param|TrafficClasses}} list contains a matching traffic class).

        For enabled table entries, if {{param|TrafficClasses}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param flowSpec the input value
	 * @return this instance
	 */
	public QoS withFlowSpec(FlowSpec flowSpec) {
		getFlowSpecs().add(flowSpec);
		return this;
	}

	//</editor-fold>

}