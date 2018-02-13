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
package org.broadbandforum.tr196.fapservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.CDMA2000;
import org.broadbandforum.tr196.fapservice.fapcontrol.LTE;
import org.broadbandforum.tr196.fapservice.fapcontrol.UMTS;

	/**
	 * This object contains parameters relating to state management and provisioning aspects of the FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.")
@XmlRootElement(name = "FAPService.FAPControl")
@XmlType(name = "FAPService.FAPControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class FAPControl {

	/**
	 * {{list}}  Each item is an event that causes the FAP to perform self configuration as defined by {{object|.FAPControl.UMTS.SelfConfig.}}, {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}, or {{object|.FAPControl.CDMA2000.HRPD.SelfConfig.}}.

Vendors can extend the enumerated values with vendor-specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SelfConfigEvents")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> selfConfigEvents;
	/**
	 * This parameter indicates whether or not physical tampering of the device enclosure occurred, such as illegal opening of the box.

If {{true}} device tampering is detected.

If {{false}} no sign of device tampering is detected.

Tampering state MUST be persisted across reboots and the device MUST never reset it back from {{true}} to {{false}} even after a factory reset.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EnclosureTamperingDetected")
	@CWMPParameter(access = "readWrite")
	public Boolean enclosureTamperingDetected;
	/**
	 * This object contains parameters relating to the UMTS system specific information.
	 */
	@XmlElement(name = "UMTS")
	public UMTS umtS;
	/**
	 * This object contains parameters relating to the LTE system specific information.
	 */
	@XmlElement(name = "LTE")
	public LTE lte;
	/**
	 * This object contains parameters relating to the configuration for the control portions of a CDMA2000 FAP.
	 */
	@XmlElement(name = "CDMA2000")
	public CDMA2000 cdmA2000;

	public FAPControl() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}}  Each item is an event that causes the FAP to perform self configuration as defined by {{object|.FAPControl.UMTS.SelfConfig.}}, {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}, or {{object|.FAPControl.CDMA2000.HRPD.SelfConfig.}}.

Vendors can extend the enumerated values with vendor-specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSelfConfigEvents() {
		if (this.selfConfigEvents == null){ this.selfConfigEvents=new ArrayList<>();}
		return selfConfigEvents;
	}

	/**
	 * Set the {{list}}  Each item is an event that causes the FAP to perform self configuration as defined by {{object|.FAPControl.UMTS.SelfConfig.}}, {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}, or {{object|.FAPControl.CDMA2000.HRPD.SelfConfig.}}.

Vendors can extend the enumerated values with vendor-specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @param selfConfigEvents the input value
	 */
	public void  setSelfConfigEvents(Collection<String> selfConfigEvents) {
		this.selfConfigEvents = selfConfigEvents;
	}

	/**
	 * Set the {{list}}  Each item is an event that causes the FAP to perform self configuration as defined by {{object|.FAPControl.UMTS.SelfConfig.}}, {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}, or {{object|.FAPControl.CDMA2000.HRPD.SelfConfig.}}.

Vendors can extend the enumerated values with vendor-specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section3.3}} MUST be adhered to.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public FAPControl withSelfConfigEvents(String string) {
		getSelfConfigEvents().add(string);
		return this;
	}

	/**
	 * Get the this parameter indicates whether or not physical tampering of the device enclosure occurred, such as illegal opening of the box.

If {{true}} device tampering is detected.

If {{false}} no sign of device tampering is detected.

Tampering state MUST be persisted across reboots and the device MUST never reset it back from {{true}} to {{false}} even after a factory reset.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnclosureTamperingDetected() {
		return enclosureTamperingDetected;
	}

	/**
	 * Set the this parameter indicates whether or not physical tampering of the device enclosure occurred, such as illegal opening of the box.

If {{true}} device tampering is detected.

If {{false}} no sign of device tampering is detected.

Tampering state MUST be persisted across reboots and the device MUST never reset it back from {{true}} to {{false}} even after a factory reset.
	 *
	 * @since 2.0
	 * @param enclosureTamperingDetected the input value
	 */
	public void  setEnclosureTamperingDetected(Boolean enclosureTamperingDetected) {
		this.enclosureTamperingDetected = enclosureTamperingDetected;
	}

	/**
	 * Set the this parameter indicates whether or not physical tampering of the device enclosure occurred, such as illegal opening of the box.

If {{true}} device tampering is detected.

If {{false}} no sign of device tampering is detected.

Tampering state MUST be persisted across reboots and the device MUST never reset it back from {{true}} to {{false}} even after a factory reset.
	 *
	 * @since 2.0
	 * @param enclosureTamperingDetected the input value
	 * @return this instance
	 */
	public FAPControl withEnclosureTamperingDetected(Boolean enclosureTamperingDetected) {
		this.enclosureTamperingDetected = enclosureTamperingDetected;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the UMTS system specific information.
	 *
	 * @return the value
	 */
	public UMTS getUmtS() {
		return umtS;
	}

	/**
	 * Set the this object contains parameters relating to the UMTS system specific information.
	 *
	 * @param umtS the input value
	 */
	public void  setUmtS(UMTS umtS) {
		this.umtS = umtS;
	}

	/**
	 * Set the this object contains parameters relating to the UMTS system specific information.
	 *
	 * @param umtS the input value
	 * @return this instance
	 */
	public FAPControl withUmtS(UMTS umtS) {
		this.umtS = umtS;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the LTE system specific information.
	 *
	 * @return the value
	 */
	public LTE getLte() {
		return lte;
	}

	/**
	 * Set the this object contains parameters relating to the LTE system specific information.
	 *
	 * @param lte the input value
	 */
	public void  setLte(LTE lte) {
		this.lte = lte;
	}

	/**
	 * Set the this object contains parameters relating to the LTE system specific information.
	 *
	 * @param lte the input value
	 * @return this instance
	 */
	public FAPControl withLte(LTE lte) {
		this.lte = lte;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the configuration for the control portions of a CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public CDMA2000 getCdmA2000() {
		return cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the configuration for the control portions of a CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 */
	public void  setCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the configuration for the control portions of a CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public FAPControl withCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
		return this;
	}

	//</editor-fold>

}