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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.etsim2m.SCL;

	/**
	 * The {{object}} object represents the management object for the Remote Entity Functions (REM) functions defined in the M2M Functional Architecture {{bibref|ETSIM2MFA}}.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.")
@XmlRootElement(name = "ETSIM2M")
@XmlType(name = "Device.ETSIM2M")
@XmlAccessorType(XmlAccessType.FIELD)
public class ETSIM2M {

	/**
	 * This object represents an instance of a Service Capability Layer (SCL) for a M2M device or gateway.

        The {{object}} MAY be maintained by the ACS or by the CPE.

        When the {{object}} provides the administration of an SCL that is represented as a {{object|.SoftwareModules.ExecutionUnit}} the {{object}} is maintained in the {{param|.SoftwareModules.ExecutionUnit.{i}.References}} parameter.

        Section 5.1.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the high level event flows for SCL registration.

        Section 9.3.2.6.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the creation/registration of SCLs.

        Section 9.3.2.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the update/re-registration of SCLs.

        Section 9.3.2.6.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the deletion/deregistration of SCLs.

        {{keys}}
	 */
	@XmlElementWrapper(name = "SCLs")
	@XmlElement(name = "SCL")
	@CWMPParameter(access = "readWrite")
	public Collection<SCL> scls;

	public ETSIM2M() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object represents an instance of a Service Capability Layer (SCL) for a M2M device or gateway.

        The {{object}} MAY be maintained by the ACS or by the CPE.

        When the {{object}} provides the administration of an SCL that is represented as a {{object|.SoftwareModules.ExecutionUnit}} the {{object}} is maintained in the {{param|.SoftwareModules.ExecutionUnit.{i}.References}} parameter.

        Section 5.1.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the high level event flows for SCL registration.

        Section 9.3.2.6.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the creation/registration of SCLs.

        Section 9.3.2.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the update/re-registration of SCLs.

        Section 9.3.2.6.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the deletion/deregistration of SCLs.

        {{keys}}
	 *
	 * @return the value
	 */
	public Collection<SCL> getScls() {
		if (this.scls == null){ this.scls=new ArrayList<>();}
		return scls;
	}

	/**
	 * Set the this object represents an instance of a Service Capability Layer (SCL) for a M2M device or gateway.

        The {{object}} MAY be maintained by the ACS or by the CPE.

        When the {{object}} provides the administration of an SCL that is represented as a {{object|.SoftwareModules.ExecutionUnit}} the {{object}} is maintained in the {{param|.SoftwareModules.ExecutionUnit.{i}.References}} parameter.

        Section 5.1.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the high level event flows for SCL registration.

        Section 9.3.2.6.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the creation/registration of SCLs.

        Section 9.3.2.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the update/re-registration of SCLs.

        Section 9.3.2.6.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the deletion/deregistration of SCLs.

        {{keys}}
	 *
	 * @param scls the input value
	 */
	public void  setScls(Collection<SCL> scls) {
		this.scls = scls;
	}

	/**
	 * Set the this object represents an instance of a Service Capability Layer (SCL) for a M2M device or gateway.

        The {{object}} MAY be maintained by the ACS or by the CPE.

        When the {{object}} provides the administration of an SCL that is represented as a {{object|.SoftwareModules.ExecutionUnit}} the {{object}} is maintained in the {{param|.SoftwareModules.ExecutionUnit.{i}.References}} parameter.

        Section 5.1.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the high level event flows for SCL registration.

        Section 9.3.2.6.2 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the creation/registration of SCLs.

        Section 9.3.2.6.4 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the update/re-registration of SCLs.

        Section 9.3.2.6.5 of the M2M Functional Architecture {{bibref|ETSIM2MFA}} describes the deletion/deregistration of SCLs.

        {{keys}}
	 *
	 * @param scl the input value
	 * @return this instance
	 */
	public ETSIM2M withSCL(SCL scl) {
		getScls().add(scl);
		return this;
	}

	//</editor-fold>

}