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
package org.broadbandforum.tr069.internetgatewaydevice;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the user interface of the CPE.  Support for this object is Optional.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.UserInterface.")
@XmlRootElement(name = "UserInterface")
@XmlType(name = "InternetGatewayDevice.UserInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInterface {

	/**
	 * Present only if the CPE provides a password-protected LAN-side user interface.

Indicates whether or not the local user interface must require a password to be chosen by the user.  If {{false}}, the choice of whether or not a password is used is left to the user.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PasswordRequired")
	@CWMPParameter(access = "readWrite")
	public Boolean passwordRequired;
	/**
	 * Present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration.

Indicates whether or not a password to protect the local user interface of the CPE may be selected by the user directly, or must be equal to the password used by the LAN-side Auto-Configuration protocol.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PasswordUserSelectable")
	@CWMPParameter(access = "readWrite")
	public Boolean passwordUserSelectable;
	/**
	 * Indicates that a CPE upgrade is available, allowing the CPE to display this information to the user.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpgradeAvailable")
	@CWMPParameter(access = "readWrite")
	public Boolean upgradeAvailable;
	/**
	 * Indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WarrantyDate")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime warrantyDate;
	/**
	 * The name of the customer's ISP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ispName;
	/**
	 * The help desk phone number of the ISP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPHelpDesk")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String ispHelpDesk;
	/**
	 * The URL of the ISP's home page.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPHomePage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispHomePage;
	/**
	 * The URL of the ISP's on-line support page.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPHelpPage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispHelpPage;
	/**
	 * Base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPLogo")
	@CWMPParameter(access = "readWrite")
	public String ispLogo;
	/**
	 * Un-encoded binary image size in bytes.

If ISPLogoSize input value is 0 then the ISPLogo is cleared.

ISPLogoSize can also be used as a check to verify correct transfer and conversion of Base64 string to image size.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPLogoSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4095)
	public Long ispLogoSize;
	/**
	 * The URL of the ISP's mail server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPMailServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispMailServer;
	/**
	 * The URL of the ISP's news server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ISPNewsServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispNewsServer;
	/**
	 * The color of text on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TextColor")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String textColor;
	/**
	 * The color of the GUI screen backgrounds in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BackgroundColor")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String backgroundColor;
	/**
	 * The color of buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ButtonColor")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String buttonColor;
	/**
	 * The color of text on buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ButtonTextColor")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String buttonTextColor;
	/**
	 * The server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AutoUpdateServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String autoUpdateServer;
	/**
	 * The server where a user can check via a web browser if an update is available for download to a PC.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UserUpdateServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String userUpdateServer;
	/**
	 * An example of a correct login, according to ISP-specific rules.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExampleLogin")
	@CWMPParameter(access = "readWrite")
	@Size(max = 40)
	public String exampleLogin;
	/**
	 * An example of a correct password, according to ISP-specific rules.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExamplePassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 30)
	public String examplePassword;

	public UserInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the present only if the CPE provides a password-protected LAN-side user interface.

Indicates whether or not the local user interface must require a password to be chosen by the user.  If {{false}}, the choice of whether or not a password is used is left to the user.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPasswordRequired() {
		return passwordRequired;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface.

Indicates whether or not the local user interface must require a password to be chosen by the user.  If {{false}}, the choice of whether or not a password is used is left to the user.
	 *
	 * @since 1.0
	 * @param passwordRequired the input value
	 */
	public void  setPasswordRequired(Boolean passwordRequired) {
		this.passwordRequired = passwordRequired;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface.

Indicates whether or not the local user interface must require a password to be chosen by the user.  If {{false}}, the choice of whether or not a password is used is left to the user.
	 *
	 * @since 1.0
	 * @param passwordRequired the input value
	 * @return this instance
	 */
	public UserInterface withPasswordRequired(Boolean passwordRequired) {
		this.passwordRequired = passwordRequired;
		return this;
	}

	/**
	 * Get the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration.

Indicates whether or not a password to protect the local user interface of the CPE may be selected by the user directly, or must be equal to the password used by the LAN-side Auto-Configuration protocol.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPasswordUserSelectable() {
		return passwordUserSelectable;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration.

Indicates whether or not a password to protect the local user interface of the CPE may be selected by the user directly, or must be equal to the password used by the LAN-side Auto-Configuration protocol.
	 *
	 * @since 1.0
	 * @param passwordUserSelectable the input value
	 */
	public void  setPasswordUserSelectable(Boolean passwordUserSelectable) {
		this.passwordUserSelectable = passwordUserSelectable;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration.

Indicates whether or not a password to protect the local user interface of the CPE may be selected by the user directly, or must be equal to the password used by the LAN-side Auto-Configuration protocol.
	 *
	 * @since 1.0
	 * @param passwordUserSelectable the input value
	 * @return this instance
	 */
	public UserInterface withPasswordUserSelectable(Boolean passwordUserSelectable) {
		this.passwordUserSelectable = passwordUserSelectable;
		return this;
	}

	/**
	 * Get the indicates that a CPE upgrade is available, allowing the CPE to display this information to the user.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isUpgradeAvailable() {
		return upgradeAvailable;
	}

	/**
	 * Set the indicates that a CPE upgrade is available, allowing the CPE to display this information to the user.
	 *
	 * @since 1.0
	 * @param upgradeAvailable the input value
	 */
	public void  setUpgradeAvailable(Boolean upgradeAvailable) {
		this.upgradeAvailable = upgradeAvailable;
	}

	/**
	 * Set the indicates that a CPE upgrade is available, allowing the CPE to display this information to the user.
	 *
	 * @since 1.0
	 * @param upgradeAvailable the input value
	 * @return this instance
	 */
	public UserInterface withUpgradeAvailable(Boolean upgradeAvailable) {
		this.upgradeAvailable = upgradeAvailable;
		return this;
	}

	/**
	 * Get the indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getWarrantyDate() {
		return warrantyDate;
	}

	/**
	 * Set the indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 1.0
	 * @param warrantyDate the input value
	 */
	public void  setWarrantyDate(LocalDateTime warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	/**
	 * Set the indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 1.0
	 * @param warrantyDate the input value
	 * @return this instance
	 */
	public UserInterface withWarrantyDate(LocalDateTime warrantyDate) {
		this.warrantyDate = warrantyDate;
		return this;
	}

	/**
	 * Get the name of the customer's ISP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspName() {
		return ispName;
	}

	/**
	 * Set the name of the customer's ISP.
	 *
	 * @since 1.0
	 * @param ispName the input value
	 */
	public void  setIspName(String ispName) {
		this.ispName = ispName;
	}

	/**
	 * Set the name of the customer's ISP.
	 *
	 * @since 1.0
	 * @param ispName the input value
	 * @return this instance
	 */
	public UserInterface withIspName(String ispName) {
		this.ispName = ispName;
		return this;
	}

	/**
	 * Get the help desk phone number of the ISP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspHelpDesk() {
		return ispHelpDesk;
	}

	/**
	 * Set the help desk phone number of the ISP.
	 *
	 * @since 1.0
	 * @param ispHelpDesk the input value
	 */
	public void  setIspHelpDesk(String ispHelpDesk) {
		this.ispHelpDesk = ispHelpDesk;
	}

	/**
	 * Set the help desk phone number of the ISP.
	 *
	 * @since 1.0
	 * @param ispHelpDesk the input value
	 * @return this instance
	 */
	public UserInterface withIspHelpDesk(String ispHelpDesk) {
		this.ispHelpDesk = ispHelpDesk;
		return this;
	}

	/**
	 * Get the URL of the ISP's home page.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspHomePage() {
		return ispHomePage;
	}

	/**
	 * Set the URL of the ISP's home page.
	 *
	 * @since 1.0
	 * @param ispHomePage the input value
	 */
	public void  setIspHomePage(String ispHomePage) {
		this.ispHomePage = ispHomePage;
	}

	/**
	 * Set the URL of the ISP's home page.
	 *
	 * @since 1.0
	 * @param ispHomePage the input value
	 * @return this instance
	 */
	public UserInterface withIspHomePage(String ispHomePage) {
		this.ispHomePage = ispHomePage;
		return this;
	}

	/**
	 * Get the URL of the ISP's on-line support page.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspHelpPage() {
		return ispHelpPage;
	}

	/**
	 * Set the URL of the ISP's on-line support page.
	 *
	 * @since 1.0
	 * @param ispHelpPage the input value
	 */
	public void  setIspHelpPage(String ispHelpPage) {
		this.ispHelpPage = ispHelpPage;
	}

	/**
	 * Set the URL of the ISP's on-line support page.
	 *
	 * @since 1.0
	 * @param ispHelpPage the input value
	 * @return this instance
	 */
	public UserInterface withIspHelpPage(String ispHelpPage) {
		this.ispHelpPage = ispHelpPage;
		return this;
	}

	/**
	 * Get the base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspLogo() {
		return ispLogo;
	}

	/**
	 * Set the base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 1.0
	 * @param ispLogo the input value
	 */
	public void  setIspLogo(String ispLogo) {
		this.ispLogo = ispLogo;
	}

	/**
	 * Set the base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 1.0
	 * @param ispLogo the input value
	 * @return this instance
	 */
	public UserInterface withIspLogo(String ispLogo) {
		this.ispLogo = ispLogo;
		return this;
	}

	/**
	 * Get the un-encoded binary image size in bytes.

If ISPLogoSize input value is 0 then the ISPLogo is cleared.

ISPLogoSize can also be used as a check to verify correct transfer and conversion of Base64 string to image size.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIspLogoSize() {
		return ispLogoSize;
	}

	/**
	 * Set the un-encoded binary image size in bytes.

If ISPLogoSize input value is 0 then the ISPLogo is cleared.

ISPLogoSize can also be used as a check to verify correct transfer and conversion of Base64 string to image size.
	 *
	 * @since 1.0
	 * @param ispLogoSize the input value
	 */
	public void  setIspLogoSize(Long ispLogoSize) {
		this.ispLogoSize = ispLogoSize;
	}

	/**
	 * Set the un-encoded binary image size in bytes.

If ISPLogoSize input value is 0 then the ISPLogo is cleared.

ISPLogoSize can also be used as a check to verify correct transfer and conversion of Base64 string to image size.
	 *
	 * @since 1.0
	 * @param ispLogoSize the input value
	 * @return this instance
	 */
	public UserInterface withIspLogoSize(Long ispLogoSize) {
		this.ispLogoSize = ispLogoSize;
		return this;
	}

	/**
	 * Get the URL of the ISP's mail server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspMailServer() {
		return ispMailServer;
	}

	/**
	 * Set the URL of the ISP's mail server.
	 *
	 * @since 1.0
	 * @param ispMailServer the input value
	 */
	public void  setIspMailServer(String ispMailServer) {
		this.ispMailServer = ispMailServer;
	}

	/**
	 * Set the URL of the ISP's mail server.
	 *
	 * @since 1.0
	 * @param ispMailServer the input value
	 * @return this instance
	 */
	public UserInterface withIspMailServer(String ispMailServer) {
		this.ispMailServer = ispMailServer;
		return this;
	}

	/**
	 * Get the URL of the ISP's news server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getIspNewsServer() {
		return ispNewsServer;
	}

	/**
	 * Set the URL of the ISP's news server.
	 *
	 * @since 1.0
	 * @param ispNewsServer the input value
	 */
	public void  setIspNewsServer(String ispNewsServer) {
		this.ispNewsServer = ispNewsServer;
	}

	/**
	 * Set the URL of the ISP's news server.
	 *
	 * @since 1.0
	 * @param ispNewsServer the input value
	 * @return this instance
	 */
	public UserInterface withIspNewsServer(String ispNewsServer) {
		this.ispNewsServer = ispNewsServer;
		return this;
	}

	/**
	 * Get the color of text on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * Set the color of text on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param textColor the input value
	 */
	public void  setTextColor(String textColor) {
		this.textColor = textColor;
	}

	/**
	 * Set the color of text on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param textColor the input value
	 * @return this instance
	 */
	public UserInterface withTextColor(String textColor) {
		this.textColor = textColor;
		return this;
	}

	/**
	 * Get the color of the GUI screen backgrounds in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * Set the color of the GUI screen backgrounds in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param backgroundColor the input value
	 */
	public void  setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Set the color of the GUI screen backgrounds in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param backgroundColor the input value
	 * @return this instance
	 */
	public UserInterface withBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	/**
	 * Get the color of buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getButtonColor() {
		return buttonColor;
	}

	/**
	 * Set the color of buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param buttonColor the input value
	 */
	public void  setButtonColor(String buttonColor) {
		this.buttonColor = buttonColor;
	}

	/**
	 * Set the color of buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param buttonColor the input value
	 * @return this instance
	 */
	public UserInterface withButtonColor(String buttonColor) {
		this.buttonColor = buttonColor;
		return this;
	}

	/**
	 * Get the color of text on buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getButtonTextColor() {
		return buttonTextColor;
	}

	/**
	 * Set the color of text on buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param buttonTextColor the input value
	 */
	public void  setButtonTextColor(String buttonTextColor) {
		this.buttonTextColor = buttonTextColor;
	}

	/**
	 * Set the color of text on buttons on the GUI screens in RGB hexidecimal notation (e.g., FF0088).
	 *
	 * @since 1.0
	 * @param buttonTextColor the input value
	 * @return this instance
	 */
	public UserInterface withButtonTextColor(String buttonTextColor) {
		this.buttonTextColor = buttonTextColor;
		return this;
	}

	/**
	 * Get the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAutoUpdateServer() {
		return autoUpdateServer;
	}

	/**
	 * Set the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @param autoUpdateServer the input value
	 */
	public void  setAutoUpdateServer(String autoUpdateServer) {
		this.autoUpdateServer = autoUpdateServer;
	}

	/**
	 * Set the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @param autoUpdateServer the input value
	 * @return this instance
	 */
	public UserInterface withAutoUpdateServer(String autoUpdateServer) {
		this.autoUpdateServer = autoUpdateServer;
		return this;
	}

	/**
	 * Get the server where a user can check via a web browser if an update is available for download to a PC.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUserUpdateServer() {
		return userUpdateServer;
	}

	/**
	 * Set the server where a user can check via a web browser if an update is available for download to a PC.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @param userUpdateServer the input value
	 */
	public void  setUserUpdateServer(String userUpdateServer) {
		this.userUpdateServer = userUpdateServer;
	}

	/**
	 * Set the server where a user can check via a web browser if an update is available for download to a PC.  This MUST NOT be used by the CPE if the {{param|InternetGatewayDevice.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 1.0
	 * @param userUpdateServer the input value
	 * @return this instance
	 */
	public UserInterface withUserUpdateServer(String userUpdateServer) {
		this.userUpdateServer = userUpdateServer;
		return this;
	}

	/**
	 * Get an example of a correct login, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getExampleLogin() {
		return exampleLogin;
	}

	/**
	 * Set an example of a correct login, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @param exampleLogin the input value
	 */
	public void  setExampleLogin(String exampleLogin) {
		this.exampleLogin = exampleLogin;
	}

	/**
	 * Set an example of a correct login, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @param exampleLogin the input value
	 * @return this instance
	 */
	public UserInterface withExampleLogin(String exampleLogin) {
		this.exampleLogin = exampleLogin;
		return this;
	}

	/**
	 * Get an example of a correct password, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getExamplePassword() {
		return examplePassword;
	}

	/**
	 * Set an example of a correct password, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @param examplePassword the input value
	 */
	public void  setExamplePassword(String examplePassword) {
		this.examplePassword = examplePassword;
	}

	/**
	 * Set an example of a correct password, according to ISP-specific rules.
	 *
	 * @since 1.0
	 * @param examplePassword the input value
	 * @return this instance
	 */
	public UserInterface withExamplePassword(String examplePassword) {
		this.examplePassword = examplePassword;
		return this;
	}

	//</editor-fold>

}