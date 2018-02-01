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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.a13.ColorCodeToUATI104;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.a13.HRPDSubnetToIP;

	/**
	 * This object contains attributes related to A13 Session Transfer
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.")
public class A13 {

	/**
	 * HRPD ColorCode to UATI Mapping Table number of entries.
	 */
	@XmlElementWrapper(name = "ColorCodeToUATI104s")
	@XmlElement(name = "ColorCodeToUATI104")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<ColorCodeToUATI104> colorCodeToUATI104s;
	/**
	 * This object contains attributes related to A13 Session Transfer
	 */
	@XmlElementWrapper(name = "HRPDSubnetToIPs")
	@XmlElement(name = "HRPDSubnetToIP")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<HRPDSubnetToIP> hrpDSubnetToIPs;

	public A13() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the hrpD ColorCode to UATI Mapping Table number of entries.
	 *
	 * @return the value
	 */
	public Collection<ColorCodeToUATI104> getColorCodeToUATI104s() {
		if (this.colorCodeToUATI104s == null){ this.colorCodeToUATI104s=new ArrayList<>();}
		return colorCodeToUATI104s;
	}

	/**
	 * Set the hrpD ColorCode to UATI Mapping Table number of entries.
	 *
	 * @param colorCodeToUATI104s the input value
	 */
	public void  setColorCodeToUATI104s(Collection<ColorCodeToUATI104> colorCodeToUATI104s) {
		this.colorCodeToUATI104s = colorCodeToUATI104s;
	}

	/**
	 * Set the hrpD ColorCode to UATI Mapping Table number of entries.
	 *
	 * @param colorCodeToUATI104 the input value
	 * @return this instance
	 */
	public A13 withColorCodeToUATI104(ColorCodeToUATI104 colorCodeToUATI104) {
		getColorCodeToUATI104s().add(colorCodeToUATI104);
		return this;
	}

	/**
	 * Get the this object contains attributes related to A13 Session Transfer
	 *
	 * @return the value
	 */
	public Collection<HRPDSubnetToIP> getHrpDSubnetToIPs() {
		if (this.hrpDSubnetToIPs == null){ this.hrpDSubnetToIPs=new ArrayList<>();}
		return hrpDSubnetToIPs;
	}

	/**
	 * Set the this object contains attributes related to A13 Session Transfer
	 *
	 * @param hrpDSubnetToIPs the input value
	 */
	public void  setHrpDSubnetToIPs(Collection<HRPDSubnetToIP> hrpDSubnetToIPs) {
		this.hrpDSubnetToIPs = hrpDSubnetToIPs;
	}

	/**
	 * Set the this object contains attributes related to A13 Session Transfer
	 *
	 * @param hrpDSubnetToIP the input value
	 * @return this instance
	 */
	public A13 withHRPDSubnetToIP(HRPDSubnetToIP hrpDSubnetToIP) {
		getHrpDSubnetToIPs().add(hrpDSubnetToIP);
		return this;
	}

	//</editor-fold>

}