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
package org.broadbandforum.tr104.voiceservice.terminal;

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
import org.broadbandforum.tr104.voiceservice.terminal.buttonmap.Button;

	/**
	 * This object is provided to permit the purpose of the CPE buttons and function keys to be defined via the ACS.

Support of this object is appropriate only for a device that has programmable buttons in its user interface.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.ButtonMap.")
@XmlRootElement(name = "VoiceService.Terminal.ButtonMap")
@XmlType(name = "VoiceService.Terminal.ButtonMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class ButtonMap {

	/**
	 * Each entry in this table specifies the purpose of each programmable CPE button / function key and whether the user has permission to reprogram the button.
	 */
	@XmlElementWrapper(name = "Buttons")
	@XmlElement(name = "Button")
	@CWMPParameter(minEntries = 1)
	public Collection<Button> buttons;

	public ButtonMap() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry in this table specifies the purpose of each programmable CPE button / function key and whether the user has permission to reprogram the button.
	 *
	 * @return the value
	 */
	public Collection<Button> getButtons() {
		if (this.buttons == null){ this.buttons=new ArrayList<>();}
		return buttons;
	}

	/**
	 * Set the each entry in this table specifies the purpose of each programmable CPE button / function key and whether the user has permission to reprogram the button.
	 *
	 * @param buttons the input value
	 */
	public void  setButtons(Collection<Button> buttons) {
		this.buttons = buttons;
	}

	/**
	 * Set the each entry in this table specifies the purpose of each programmable CPE button / function key and whether the user has permission to reprogram the button.
	 *
	 * @param button the input value
	 * @return this instance
	 */
	public ButtonMap withButton(Button button) {
		getButtons().add(button);
		return this;
	}

	//</editor-fold>

}