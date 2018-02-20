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

import java.time.LocalDateTime;
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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.userinterface.LocalDisplay;
import org.broadbandforum.tr181.device.userinterface.RemoteAccess;

	/**
	 * This object contains parameters relating to the user interface of the CPE.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UserInterface.")
@XmlRootElement(name = "Device.UserInterface")
@XmlType(name = "Device.UserInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInterface {

	/**
	 * Present only if the CPE provides a password-protected LAN-side user interface.

          Indicates whether or not the local user interface MUST require a password to be chosen by the user.  If {{false}}, the choice of  whether or not a password is used is left to the user.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PasswordRequired")
	@CWMPParameter(access = "readWrite")
	public Boolean passwordRequired;
	/**
	 * Present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side  Auto-Configuration.

          Indicates whether or not a password to protect the local user interface of the CPE MAY be selected by the user directly (i.e. {{param|.Users.User.{i}.Password}}), or MUST be equal to the password used by the LAN-side Auto-Configuration protocol (i.e. {{param|.LANConfigSecurity.ConfigPassword}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PasswordUserSelectable")
	@CWMPParameter(access = "readWrite")
	public Boolean passwordUserSelectable;
	/**
	 * Present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration. 

          When set to true, resets {{param|.LANConfigSecurity.ConfigPassword}} to its factory value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PasswordReset")
	@CWMPParameter(access = "readWrite")
	public Boolean passwordReset;
	/**
	 * Indicates that a CPE upgrade is available, allowing the CPE to display this information to the  user.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpgradeAvailable")
	@CWMPParameter(access = "readWrite")
	public Boolean upgradeAvailable;
	/**
	 * Indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WarrantyDate")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime warrantyDate;
	/**
	 * The name of the customer's ISP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ispName;
	/**
	 * The help desk phone number of the ISP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPHelpDesk")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String ispHelpDesk;
	/**
	 * The URL of the ISP's home page.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPHomePage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispHomePage;
	/**
	 * The URL of the ISP's on-line support page.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPHelpPage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispHelpPage;
	/**
	 * Base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPLogo")
	@CWMPParameter(access = "readWrite")
	public String ispLogo;
	/**
	 * Un-encoded binary image size in bytes.

          If ISPLogoSize input value is 0 then the ISPLogo is cleared.

          ISPLogoSize can also be used as a check to verify correct transfer and conversion of Base64 string to image size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPLogoSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4095)
	public Long ispLogoSize;
	/**
	 * The URL of the ISP's mail server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPMailServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispMailServer;
	/**
	 * The URL of the ISP's news server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ISPNewsServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String ispNewsServer;
	/**
	 * The color of text on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TextColor")
	@CWMPParameter(access = "readWrite")
	public byte[] textColor;
	/**
	 * The color of the GUI screen backgrounds in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BackgroundColor")
	@CWMPParameter(access = "readWrite")
	public byte[] backgroundColor;
	/**
	 * The color of buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ButtonColor")
	@CWMPParameter(access = "readWrite")
	public byte[] buttonColor;
	/**
	 * The color of text on buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ButtonTextColor")
	@CWMPParameter(access = "readWrite")
	public byte[] buttonTextColor;
	/**
	 * The server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used  by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoUpdateServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String autoUpdateServer;
	/**
	 * The server where a user can check via a web browser if an update is available for download to a PC.  This MUST  NOT be used by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserUpdateServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String userUpdateServer;
	/**
	 * {{list}} List items represent user-interface languages that are available, where each language is specified according to {{bibref|RFC3066}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AvailableLanguages")
	@Size(max = 256)
	@XmlList
	public Collection<String> availableLanguages;
	/**
	 * Current user-interface language, specified according to {{bibref|RFC3066}}. The value MUST be a member of the list reported by the {{param|AvailableLanguages}} parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentLanguage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String currentLanguage;
	/**
	 * This object contains parameters relating to remotely accessing the CPE's user interface.

        Remote access is defined as any entity not of a local subnet attempting to connect to the CPE.

        Remote access requires user authentication.  To provide remote access authentication the CPE MUST support a "User" table with at least one instance that has "RemoteAccessCapable" set to {{true}}.
	 */
	@XmlElement(name = "RemoteAccess")
	public RemoteAccess remoteAccess;
	/**
	 * This object describes how to remotely manage the initial positioning of a user interface on a device's local display.
	 */
	@XmlElement(name = "LocalDisplay")
	public LocalDisplay localDisplay;

	public UserInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the present only if the CPE provides a password-protected LAN-side user interface.

          Indicates whether or not the local user interface MUST require a password to be chosen by the user.  If {{false}}, the choice of  whether or not a password is used is left to the user.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPasswordRequired() {
		return passwordRequired;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface.

          Indicates whether or not the local user interface MUST require a password to be chosen by the user.  If {{false}}, the choice of  whether or not a password is used is left to the user.
	 *
	 * @since 2.0
	 * @param passwordRequired the input value
	 */
	public void  setPasswordRequired(Boolean passwordRequired) {
		this.passwordRequired = passwordRequired;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface.

          Indicates whether or not the local user interface MUST require a password to be chosen by the user.  If {{false}}, the choice of  whether or not a password is used is left to the user.
	 *
	 * @since 2.0
	 * @param passwordRequired the input value
	 * @return this instance
	 */
	public UserInterface withPasswordRequired(Boolean passwordRequired) {
		this.passwordRequired = passwordRequired;
		return this;
	}

	/**
	 * Get the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side  Auto-Configuration.

          Indicates whether or not a password to protect the local user interface of the CPE MAY be selected by the user directly (i.e. {{param|.Users.User.{i}.Password}}), or MUST be equal to the password used by the LAN-side Auto-Configuration protocol (i.e. {{param|.LANConfigSecurity.ConfigPassword}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPasswordUserSelectable() {
		return passwordUserSelectable;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side  Auto-Configuration.

          Indicates whether or not a password to protect the local user interface of the CPE MAY be selected by the user directly (i.e. {{param|.Users.User.{i}.Password}}), or MUST be equal to the password used by the LAN-side Auto-Configuration protocol (i.e. {{param|.LANConfigSecurity.ConfigPassword}}).
	 *
	 * @since 2.0
	 * @param passwordUserSelectable the input value
	 */
	public void  setPasswordUserSelectable(Boolean passwordUserSelectable) {
		this.passwordUserSelectable = passwordUserSelectable;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side  Auto-Configuration.

          Indicates whether or not a password to protect the local user interface of the CPE MAY be selected by the user directly (i.e. {{param|.Users.User.{i}.Password}}), or MUST be equal to the password used by the LAN-side Auto-Configuration protocol (i.e. {{param|.LANConfigSecurity.ConfigPassword}}).
	 *
	 * @since 2.0
	 * @param passwordUserSelectable the input value
	 * @return this instance
	 */
	public UserInterface withPasswordUserSelectable(Boolean passwordUserSelectable) {
		this.passwordUserSelectable = passwordUserSelectable;
		return this;
	}

	/**
	 * Get the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration. 

          When set to true, resets {{param|.LANConfigSecurity.ConfigPassword}} to its factory value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPasswordReset() {
		return passwordReset;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration. 

          When set to true, resets {{param|.LANConfigSecurity.ConfigPassword}} to its factory value.
	 *
	 * @since 2.0
	 * @param passwordReset the input value
	 */
	public void  setPasswordReset(Boolean passwordReset) {
		this.passwordReset = passwordReset;
	}

	/**
	 * Set the present only if the CPE provides a password-protected LAN-side user interface and supports LAN-side Auto-Configuration. 

          When set to true, resets {{param|.LANConfigSecurity.ConfigPassword}} to its factory value.
	 *
	 * @since 2.0
	 * @param passwordReset the input value
	 * @return this instance
	 */
	public UserInterface withPasswordReset(Boolean passwordReset) {
		this.passwordReset = passwordReset;
		return this;
	}

	/**
	 * Get the indicates that a CPE upgrade is available, allowing the CPE to display this information to the  user.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpgradeAvailable() {
		return upgradeAvailable;
	}

	/**
	 * Set the indicates that a CPE upgrade is available, allowing the CPE to display this information to the  user.
	 *
	 * @since 2.0
	 * @param upgradeAvailable the input value
	 */
	public void  setUpgradeAvailable(Boolean upgradeAvailable) {
		this.upgradeAvailable = upgradeAvailable;
	}

	/**
	 * Set the indicates that a CPE upgrade is available, allowing the CPE to display this information to the  user.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getWarrantyDate() {
		return warrantyDate;
	}

	/**
	 * Set the indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 2.0
	 * @param warrantyDate the input value
	 */
	public void  setWarrantyDate(LocalDateTime warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	/**
	 * Set the indicates the date and time in UTC that the warranty associated with the CPE is to expire.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspName() {
		return ispName;
	}

	/**
	 * Set the name of the customer's ISP.
	 *
	 * @since 2.0
	 * @param ispName the input value
	 */
	public void  setIspName(String ispName) {
		this.ispName = ispName;
	}

	/**
	 * Set the name of the customer's ISP.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspHelpDesk() {
		return ispHelpDesk;
	}

	/**
	 * Set the help desk phone number of the ISP.
	 *
	 * @since 2.0
	 * @param ispHelpDesk the input value
	 */
	public void  setIspHelpDesk(String ispHelpDesk) {
		this.ispHelpDesk = ispHelpDesk;
	}

	/**
	 * Set the help desk phone number of the ISP.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspHomePage() {
		return ispHomePage;
	}

	/**
	 * Set the URL of the ISP's home page.
	 *
	 * @since 2.0
	 * @param ispHomePage the input value
	 */
	public void  setIspHomePage(String ispHomePage) {
		this.ispHomePage = ispHomePage;
	}

	/**
	 * Set the URL of the ISP's home page.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspHelpPage() {
		return ispHelpPage;
	}

	/**
	 * Set the URL of the ISP's on-line support page.
	 *
	 * @since 2.0
	 * @param ispHelpPage the input value
	 */
	public void  setIspHelpPage(String ispHelpPage) {
		this.ispHelpPage = ispHelpPage;
	}

	/**
	 * Set the URL of the ISP's on-line support page.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspLogo() {
		return ispLogo;
	}

	/**
	 * Set the base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 2.0
	 * @param ispLogo the input value
	 */
	public void  setIspLogo(String ispLogo) {
		this.ispLogo = ispLogo;
	}

	/**
	 * Set the base64 encoded GIF or JPEG image. The binary image is constrained to 4095 bytes or less.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspMailServer() {
		return ispMailServer;
	}

	/**
	 * Set the URL of the ISP's mail server.
	 *
	 * @since 2.0
	 * @param ispMailServer the input value
	 */
	public void  setIspMailServer(String ispMailServer) {
		this.ispMailServer = ispMailServer;
	}

	/**
	 * Set the URL of the ISP's mail server.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getIspNewsServer() {
		return ispNewsServer;
	}

	/**
	 * Set the URL of the ISP's news server.
	 *
	 * @since 2.0
	 * @param ispNewsServer the input value
	 */
	public void  setIspNewsServer(String ispNewsServer) {
		this.ispNewsServer = ispNewsServer;
	}

	/**
	 * Set the URL of the ISP's news server.
	 *
	 * @since 2.0
	 * @param ispNewsServer the input value
	 * @return this instance
	 */
	public UserInterface withIspNewsServer(String ispNewsServer) {
		this.ispNewsServer = ispNewsServer;
		return this;
	}

	/**
	 * Get the color of text on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getTextColor() {
		return textColor;
	}

	/**
	 * Set the color of text on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param textColor the input value
	 */
	public void  setTextColor(byte[] textColor) {
		this.textColor = textColor;
	}

	/**
	 * Set the color of text on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param textColor the input value
	 * @return this instance
	 */
	public UserInterface withTextColor(byte[] textColor) {
		this.textColor = textColor;
		return this;
	}

	/**
	 * Get the color of the GUI screen backgrounds in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * Set the color of the GUI screen backgrounds in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param backgroundColor the input value
	 */
	public void  setBackgroundColor(byte[] backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Set the color of the GUI screen backgrounds in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param backgroundColor the input value
	 * @return this instance
	 */
	public UserInterface withBackgroundColor(byte[] backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	/**
	 * Get the color of buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getButtonColor() {
		return buttonColor;
	}

	/**
	 * Set the color of buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param buttonColor the input value
	 */
	public void  setButtonColor(byte[] buttonColor) {
		this.buttonColor = buttonColor;
	}

	/**
	 * Set the color of buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param buttonColor the input value
	 * @return this instance
	 */
	public UserInterface withButtonColor(byte[] buttonColor) {
		this.buttonColor = buttonColor;
		return this;
	}

	/**
	 * Get the color of text on buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getButtonTextColor() {
		return buttonTextColor;
	}

	/**
	 * Set the color of text on buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param buttonTextColor the input value
	 */
	public void  setButtonTextColor(byte[] buttonTextColor) {
		this.buttonTextColor = buttonTextColor;
	}

	/**
	 * Set the color of text on buttons on the GUI screens in RGB hexadecimal notation (e.g., FF0088).
	 *
	 * @since 2.0
	 * @param buttonTextColor the input value
	 * @return this instance
	 */
	public UserInterface withButtonTextColor(byte[] buttonTextColor) {
		this.buttonTextColor = buttonTextColor;
		return this;
	}

	/**
	 * Get the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used  by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAutoUpdateServer() {
		return autoUpdateServer;
	}

	/**
	 * Set the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used  by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @param autoUpdateServer the input value
	 */
	public void  setAutoUpdateServer(String autoUpdateServer) {
		this.autoUpdateServer = autoUpdateServer;
	}

	/**
	 * Set the server the CPE can check to see if an update is available for direct download to it.  This MUST NOT be used  by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @param autoUpdateServer the input value
	 * @return this instance
	 */
	public UserInterface withAutoUpdateServer(String autoUpdateServer) {
		this.autoUpdateServer = autoUpdateServer;
		return this;
	}

	/**
	 * Get the server where a user can check via a web browser if an update is available for download to a PC.  This MUST  NOT be used by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserUpdateServer() {
		return userUpdateServer;
	}

	/**
	 * Set the server where a user can check via a web browser if an update is available for download to a PC.  This MUST  NOT be used by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @param userUpdateServer the input value
	 */
	public void  setUserUpdateServer(String userUpdateServer) {
		this.userUpdateServer = userUpdateServer;
	}

	/**
	 * Set the server where a user can check via a web browser if an update is available for download to a PC.  This MUST  NOT be used by the CPE if the {{param|.ManagementServer.UpgradesManaged}} parameter is {{true}}.
	 *
	 * @since 2.0
	 * @param userUpdateServer the input value
	 * @return this instance
	 */
	public UserInterface withUserUpdateServer(String userUpdateServer) {
		this.userUpdateServer = userUpdateServer;
		return this;
	}

	/**
	 * Get the {{list}} List items represent user-interface languages that are available, where each language is specified according to {{bibref|RFC3066}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAvailableLanguages() {
		if (this.availableLanguages == null){ this.availableLanguages=new ArrayList<>();}
		return availableLanguages;
	}

	/**
	 * Set the {{list}} List items represent user-interface languages that are available, where each language is specified according to {{bibref|RFC3066}}.
	 *
	 * @since 2.0
	 * @param availableLanguages the input value
	 */
	public void  setAvailableLanguages(Collection<String> availableLanguages) {
		this.availableLanguages = availableLanguages;
	}

	/**
	 * Set the {{list}} List items represent user-interface languages that are available, where each language is specified according to {{bibref|RFC3066}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public UserInterface withAvailableLanguages(String string) {
		getAvailableLanguages().add(string);
		return this;
	}

	/**
	 * Get the current user-interface language, specified according to {{bibref|RFC3066}}. The value MUST be a member of the list reported by the {{param|AvailableLanguages}} parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCurrentLanguage() {
		return currentLanguage;
	}

	/**
	 * Set the current user-interface language, specified according to {{bibref|RFC3066}}. The value MUST be a member of the list reported by the {{param|AvailableLanguages}} parameter.
	 *
	 * @since 2.0
	 * @param currentLanguage the input value
	 */
	public void  setCurrentLanguage(String currentLanguage) {
		this.currentLanguage = currentLanguage;
	}

	/**
	 * Set the current user-interface language, specified according to {{bibref|RFC3066}}. The value MUST be a member of the list reported by the {{param|AvailableLanguages}} parameter.
	 *
	 * @since 2.0
	 * @param currentLanguage the input value
	 * @return this instance
	 */
	public UserInterface withCurrentLanguage(String currentLanguage) {
		this.currentLanguage = currentLanguage;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to remotely accessing the CPE's user interface.

        Remote access is defined as any entity not of a local subnet attempting to connect to the CPE.

        Remote access requires user authentication.  To provide remote access authentication the CPE MUST support a "User" table with at least one instance that has "RemoteAccessCapable" set to {{true}}.
	 *
	 * @return the value
	 */
	public RemoteAccess getRemoteAccess() {
		return remoteAccess;
	}

	/**
	 * Set the this object contains parameters relating to remotely accessing the CPE's user interface.

        Remote access is defined as any entity not of a local subnet attempting to connect to the CPE.

        Remote access requires user authentication.  To provide remote access authentication the CPE MUST support a "User" table with at least one instance that has "RemoteAccessCapable" set to {{true}}.
	 *
	 * @param remoteAccess the input value
	 */
	public void  setRemoteAccess(RemoteAccess remoteAccess) {
		this.remoteAccess = remoteAccess;
	}

	/**
	 * Set the this object contains parameters relating to remotely accessing the CPE's user interface.

        Remote access is defined as any entity not of a local subnet attempting to connect to the CPE.

        Remote access requires user authentication.  To provide remote access authentication the CPE MUST support a "User" table with at least one instance that has "RemoteAccessCapable" set to {{true}}.
	 *
	 * @param remoteAccess the input value
	 * @return this instance
	 */
	public UserInterface withRemoteAccess(RemoteAccess remoteAccess) {
		this.remoteAccess = remoteAccess;
		return this;
	}

	/**
	 * Get the this object describes how to remotely manage the initial positioning of a user interface on a device's local display.
	 *
	 * @return the value
	 */
	public LocalDisplay getLocalDisplay() {
		return localDisplay;
	}

	/**
	 * Set the this object describes how to remotely manage the initial positioning of a user interface on a device's local display.
	 *
	 * @param localDisplay the input value
	 */
	public void  setLocalDisplay(LocalDisplay localDisplay) {
		this.localDisplay = localDisplay;
	}

	/**
	 * Set the this object describes how to remotely manage the initial positioning of a user interface on a device's local display.
	 *
	 * @param localDisplay the input value
	 * @return this instance
	 */
	public UserInterface withLocalDisplay(LocalDisplay localDisplay) {
		this.localDisplay = localDisplay;
		return this;
	}

	//</editor-fold>

}