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
package org.broadbandforum.tr181.device.userinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object describes how to remotely manage the initial positioning of a user interface on a device's local display.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UserInterface.LocalDisplay.")
@XmlRootElement(name = "Device.UserInterface.LocalDisplay")
@XmlType(name = "Device.UserInterface.LocalDisplay")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocalDisplay {

	/**
	 * Controls whether the user is allowed to change the GUI window position on the local CPE's display.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Movable")
	@CWMPParameter(access = "readWrite")
	public Boolean movable;
	/**
	 * Controls whether the user is allowed to resize the GUI window on the local CPE's display.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Resizable")
	@CWMPParameter(access = "readWrite")
	public Boolean resizable;
	/**
	 * The horizontal position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PosX")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "pixels")
	public Integer posX;
	/**
	 * The vertical position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PosY")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "pixels")
	public Integer posY;
	/**
	 * The width of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Width")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "pixels")
	public Long width;
	/**
	 * The height of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Height")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "pixels")
	public Long height;
	/**
	 * The width of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DisplayWidth")
	public Long displayWidth;
	/**
	 * The height of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DisplayHeight")
	public Long displayHeight;

	public LocalDisplay() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the controls whether the user is allowed to change the GUI window position on the local CPE's display.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMovable() {
		return movable;
	}

	/**
	 * Set the controls whether the user is allowed to change the GUI window position on the local CPE's display.
	 *
	 * @since 2.0
	 * @param movable the input value
	 */
	public void  setMovable(Boolean movable) {
		this.movable = movable;
	}

	/**
	 * Set the controls whether the user is allowed to change the GUI window position on the local CPE's display.
	 *
	 * @since 2.0
	 * @param movable the input value
	 * @return this instance
	 */
	public LocalDisplay withMovable(Boolean movable) {
		this.movable = movable;
		return this;
	}

	/**
	 * Get the controls whether the user is allowed to resize the GUI window on the local CPE's display.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isResizable() {
		return resizable;
	}

	/**
	 * Set the controls whether the user is allowed to resize the GUI window on the local CPE's display.
	 *
	 * @since 2.0
	 * @param resizable the input value
	 */
	public void  setResizable(Boolean resizable) {
		this.resizable = resizable;
	}

	/**
	 * Set the controls whether the user is allowed to resize the GUI window on the local CPE's display.
	 *
	 * @since 2.0
	 * @param resizable the input value
	 * @return this instance
	 */
	public LocalDisplay withResizable(Boolean resizable) {
		this.resizable = resizable;
		return this;
	}

	/**
	 * Get the horizontal position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPosX() {
		return posX;
	}

	/**
	 * Set the horizontal position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @param posX the input value
	 */
	public void  setPosX(Integer posX) {
		this.posX = posX;
	}

	/**
	 * Set the horizontal position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @param posX the input value
	 * @return this instance
	 */
	public LocalDisplay withPosX(Integer posX) {
		this.posX = posX;
		return this;
	}

	/**
	 * Get the vertical position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPosY() {
		return posY;
	}

	/**
	 * Set the vertical position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @param posY the input value
	 */
	public void  setPosY(Integer posY) {
		this.posY = posY;
	}

	/**
	 * Set the vertical position of the User Interface's top left corner within the local CPE's display measured from the top left corner, expressed in pixels.
	 *
	 * @since 2.0
	 * @param posY the input value
	 * @return this instance
	 */
	public LocalDisplay withPosY(Integer posY) {
		this.posY = posY;
		return this;
	}

	/**
	 * Get the width of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWidth() {
		return width;
	}

	/**
	 * Set the width of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param width the input value
	 */
	public void  setWidth(Long width) {
		this.width = width;
	}

	/**
	 * Set the width of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param width the input value
	 * @return this instance
	 */
	public LocalDisplay withWidth(Long width) {
		this.width = width;
		return this;
	}

	/**
	 * Get the height of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHeight() {
		return height;
	}

	/**
	 * Set the height of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param height the input value
	 */
	public void  setHeight(Long height) {
		this.height = height;
	}

	/**
	 * Set the height of the user interface within the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param height the input value
	 * @return this instance
	 */
	public LocalDisplay withHeight(Long height) {
		this.height = height;
		return this;
	}

	/**
	 * Get the width of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDisplayWidth() {
		return displayWidth;
	}

	/**
	 * Set the width of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param displayWidth the input value
	 */
	public void  setDisplayWidth(Long displayWidth) {
		this.displayWidth = displayWidth;
	}

	/**
	 * Set the width of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param displayWidth the input value
	 * @return this instance
	 */
	public LocalDisplay withDisplayWidth(Long displayWidth) {
		this.displayWidth = displayWidth;
		return this;
	}

	/**
	 * Get the height of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDisplayHeight() {
		return displayHeight;
	}

	/**
	 * Set the height of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param displayHeight the input value
	 */
	public void  setDisplayHeight(Long displayHeight) {
		this.displayHeight = displayHeight;
	}

	/**
	 * Set the height of the local CPE's display, expressed in pixels.
	 *
	 * @since 2.0
	 * @param displayHeight the input value
	 * @return this instance
	 */
	public LocalDisplay withDisplayHeight(Long displayHeight) {
		this.displayHeight = displayHeight;
		return this;
	}

	//</editor-fold>

}