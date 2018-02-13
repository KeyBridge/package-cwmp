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
package org.broadbandforum.tr098.internetgatewaydevice.smartcardreader;

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

	/**
	 * Status of currently associated smart card.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.SmartCardReader.{i}.SmartCard.")
@XmlRootElement(name = "SmartCard")
@XmlType(name = "InternetGatewayDevice.SmartCardReader.SmartCard")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmartCard {

	/**
	 * Status of the Smart Card.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Smart Card Type. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * {{list}} Indicates Smart Card Application(s).  {{param}} is only relevant when {{param|Type}} has a value of UICC, otherwise it is {{empty}}. 

Enumerated value must be one of [SIM, USIM, ISIM]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Application")
	@XmlList
	public Collection<String> application;
	/**
	 * The Smart Card Serial Number or {{empty}} if the Smart Card serial Number is not available, e.g. in the case of IPTV due to restrictions of the Service Delivery Platform.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 256)
	public String serialNumber;
	/**
	 * The Smart Card answer to a reset action. Issued by the Smart Card upon reset.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "ATR")
	@Size(max = 1024)
	public String atr;

	public SmartCard() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of the Smart Card.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the Smart Card.
	 *
	 * @since 1.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the Smart Card.
	 *
	 * @since 1.5
	 * @param status the input value
	 * @return this instance
	 */
	public SmartCard withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the smart Card Type. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the smart Card Type. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the smart Card Type. {{enum}}

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param type the input value
	 * @return this instance
	 */
	public SmartCard withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the {{list}} Indicates Smart Card Application(s).  {{param}} is only relevant when {{param|Type}} has a value of UICC, otherwise it is {{empty}}. 

Enumerated value must be one of [SIM, USIM, ISIM]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Collection<String> getApplication() {
		if (this.application == null){ this.application=new ArrayList<>();}
		return application;
	}

	/**
	 * Set the {{list}} Indicates Smart Card Application(s).  {{param}} is only relevant when {{param|Type}} has a value of UICC, otherwise it is {{empty}}. 

Enumerated value must be one of [SIM, USIM, ISIM]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param application the input value
	 */
	public void  setApplication(Collection<String> application) {
		this.application = application;
	}

	/**
	 * Set the {{list}} Indicates Smart Card Application(s).  {{param}} is only relevant when {{param|Type}} has a value of UICC, otherwise it is {{empty}}. 

Enumerated value must be one of [SIM, USIM, ISIM]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a2|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.5
	 * @param string the input value
	 * @return this instance
	 */
	public SmartCard withApplication(String string) {
		getApplication().add(string);
		return this;
	}

	/**
	 * Get the Smart Card Serial Number or {{empty}} if the Smart Card serial Number is not available, e.g. in the case of IPTV due to restrictions of the Service Delivery Platform.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the Smart Card Serial Number or {{empty}} if the Smart Card serial Number is not available, e.g. in the case of IPTV due to restrictions of the Service Delivery Platform.
	 *
	 * @since 1.5
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the Smart Card Serial Number or {{empty}} if the Smart Card serial Number is not available, e.g. in the case of IPTV due to restrictions of the Service Delivery Platform.
	 *
	 * @since 1.5
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public SmartCard withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the Smart Card answer to a reset action. Issued by the Smart Card upon reset.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getAtr() {
		return atr;
	}

	/**
	 * Set the Smart Card answer to a reset action. Issued by the Smart Card upon reset.
	 *
	 * @since 1.5
	 * @param atr the input value
	 */
	public void  setAtr(String atr) {
		this.atr = atr;
	}

	/**
	 * Set the Smart Card answer to a reset action. Issued by the Smart Card upon reset.
	 *
	 * @since 1.5
	 * @param atr the input value
	 * @return this instance
	 */
	public SmartCard withAtr(String atr) {
		this.atr = atr;
		return this;
	}

	//</editor-fold>

}