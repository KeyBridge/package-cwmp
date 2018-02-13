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
package org.broadbandforum.tr104.voiceservice.callcontrol;

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
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.Set;

	/**
	 * This object models the calling features that can be apply on {{object|.CallControl.Line}} or {{object|.CallControl.Extension}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.")
@XmlRootElement(name = "CallingFeatures")
@XmlType(name = "VoiceService.CallControl.CallingFeatures")
@XmlAccessorType(XmlAccessType.FIELD)
public class CallingFeatures {

	/**
	 * This object models a set of calling features that can be applied in {{object|.CallControl.Line.}} or {{object|.CallControl.Extension.}} objects.
	 */
	@XmlElementWrapper(name = "Sets")
	@XmlElement(name = "Set")
	@CWMPParameter(access = "readWrite")
	public Collection<Set> sets;

	public CallingFeatures() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object models a set of calling features that can be applied in {{object|.CallControl.Line.}} or {{object|.CallControl.Extension.}} objects.
	 *
	 * @return the value
	 */
	public Collection<Set> getSets() {
		if (this.sets == null){ this.sets=new ArrayList<>();}
		return sets;
	}

	/**
	 * Set the this object models a set of calling features that can be applied in {{object|.CallControl.Line.}} or {{object|.CallControl.Extension.}} objects.
	 *
	 * @param sets the input value
	 */
	public void  setSets(Collection<Set> sets) {
		this.sets = sets;
	}

	/**
	 * Set the this object models a set of calling features that can be applied in {{object|.CallControl.Line.}} or {{object|.CallControl.Extension.}} objects.
	 *
	 * @param set the input value
	 * @return this instance
	 */
	public CallingFeatures withSet(Set set) {
		getSets().add(set);
		return this;
	}

	//</editor-fold>

}