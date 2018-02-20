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
package org.broadbandforum.tr181.device.softwaremodules.executionunit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object proposes a general location for vendor extensions specific to this Execution Unit, which allows multiple Execution Units to expose parameters without the concern of conflicting parameter names.  These vendor extensions are related to displaying status and maintaining configuration for this Execution Unit.

        It is also possible for the Execution Unit to expose status and configuration parameters within Service objects or as embedded objects and parameters directly within the root data model, in which case the combination of {{param|#.References}} and {{param|#.SupportedDataModelList}} will be used to determine their locations.

        See {{bibref|TR-157a3|Appendix II.3.2}} for more description and some examples.
	 *
	 * @since TR181 v2.1
	 */
@CWMPObject(name = "Device.SoftwareModules.ExecutionUnit.{i}.Extensions.")
@XmlRootElement(name = "Device.SoftwareModules.ExecutionUnit.Extensions")
@XmlType(name = "Device.SoftwareModules.ExecutionUnit.Extensions")
@XmlAccessorType(XmlAccessType.FIELD)
public class Extensions {


	public Extensions() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	//</editor-fold>

}