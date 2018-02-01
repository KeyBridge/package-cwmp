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
package org.broadbandforum.tr196.fapservice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.capabilities.cdma2000.HRPD;
import org.broadbandforum.tr196.fapservice.capabilities.cdma2000.OneX;

	/**
	 * This object contains parameters relating to the capability attributes for CDMA2000 FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.CDMA2000.")
public class CDMA2000 {

	/**
	 * Indicates whether the FAP is capable of providing remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}}, the FAP is capable of remote IP access service. If {{false}}, the FAP is not capable of remote IP access service.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteIPAccessCapable")
	public Boolean remoteIPAccessCapable;
	/**
	 * {{list}} Indicates the band classes that the FAP supports for beacon transmission. One or multiple bands MAY be supported.  Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. List is empty if FAP can not support beacon transmissions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandClassSupportedFAPBeacon")
	@Size(max = 32)
	@XmlList
	public Collection<String> bandClassSupportedFAPBeacon;
	/**
	 * This object contains parameters relating to the capability attributes for the CDMA2000 1x radio technology portions of a CDMA2000 FAP.
	 */
	@XmlElement(name = "OneX")
	public OneX oneX;
	/**
	 * This object contains parameters relating to the capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 */
	@XmlElement(name = "HRPD")
	public HRPD hrpD;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP is capable of providing remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}}, the FAP is capable of remote IP access service. If {{false}}, the FAP is not capable of remote IP access service.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRemoteIPAccessCapable() {
		return remoteIPAccessCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of providing remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}}, the FAP is capable of remote IP access service. If {{false}}, the FAP is not capable of remote IP access service.
	 *
	 * @since 2.0
	 * @param remoteIPAccessCapable the input value
	 */
	public void  setRemoteIPAccessCapable(Boolean remoteIPAccessCapable) {
		this.remoteIPAccessCapable = remoteIPAccessCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of providing remote IP access service as defined in {{bibref|3GPP2-X.S0059}}. If {{true}}, the FAP is capable of remote IP access service. If {{false}}, the FAP is not capable of remote IP access service.
	 *
	 * @since 2.0
	 * @param remoteIPAccessCapable the input value
	 * @return this instance
	 */
	public CDMA2000 withRemoteIPAccessCapable(Boolean remoteIPAccessCapable) {
		this.remoteIPAccessCapable = remoteIPAccessCapable;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the band classes that the FAP supports for beacon transmission. One or multiple bands MAY be supported.  Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. List is empty if FAP can not support beacon transmissions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getBandClassSupportedFAPBeacon() {
		if (this.bandClassSupportedFAPBeacon == null){ this.bandClassSupportedFAPBeacon=new ArrayList<>();}
		return bandClassSupportedFAPBeacon;
	}

	/**
	 * Set the {{list}} Indicates the band classes that the FAP supports for beacon transmission. One or multiple bands MAY be supported.  Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. List is empty if FAP can not support beacon transmissions.
	 *
	 * @since 2.0
	 * @param bandClassSupportedFAPBeacon the input value
	 */
	public void  setBandClassSupportedFAPBeacon(Collection<String> bandClassSupportedFAPBeacon) {
		this.bandClassSupportedFAPBeacon = bandClassSupportedFAPBeacon;
	}

	/**
	 * Set the {{list}} Indicates the band classes that the FAP supports for beacon transmission. One or multiple bands MAY be supported.  Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. List is empty if FAP can not support beacon transmissions.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CDMA2000 withBandClassSupportedFAPBeacon(String string) {
		getBandClassSupportedFAPBeacon().add(string);
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the capability attributes for the CDMA2000 1x radio technology portions of a CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public OneX getOneX() {
		return oneX;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for the CDMA2000 1x radio technology portions of a CDMA2000 FAP.
	 *
	 * @param oneX the input value
	 */
	public void  setOneX(OneX oneX) {
		this.oneX = oneX;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for the CDMA2000 1x radio technology portions of a CDMA2000 FAP.
	 *
	 * @param oneX the input value
	 * @return this instance
	 */
	public CDMA2000 withOneX(OneX oneX) {
		this.oneX = oneX;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public HRPD getHrpD() {
		return hrpD;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @param hrpD the input value
	 */
	public void  setHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @param hrpD the input value
	 * @return this instance
	 */
	public CDMA2000 withHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
		return this;
	}

	//</editor-fold>

}