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
package org.broadbandforum.tr104.voiceservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.callcontrol.CallingFeatures;
import org.broadbandforum.tr104.voiceservice.callcontrol.Extension;
import org.broadbandforum.tr104.voiceservice.callcontrol.Group;
import org.broadbandforum.tr104.voiceservice.callcontrol.IncomingMap;
import org.broadbandforum.tr104.voiceservice.callcontrol.Line;
import org.broadbandforum.tr104.voiceservice.callcontrol.Mailbox;
import org.broadbandforum.tr104.voiceservice.callcontrol.NumberingPlan;
import org.broadbandforum.tr104.voiceservice.callcontrol.OutgoingMap;

	/**
	 * Call control and call routing parameters. This object is a control plane application for the VoiceService that provides numbers or names based routing, local PBX functionalities and advanced telephony features.

It is mutually exclusive with the {{object|.Interwork}} table which is used in case of switching capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.")
public class CallControl {

	/**
	 * Maximum number of {{object|Line.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumberOfLines")
	@CWMPParameter(access = "readWrite")
	public Long maxNumberOfLines;
	/**
	 * Maximum number of {{object|Extension.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumberOfExtensions")
	@CWMPParameter(access = "readWrite")
	public Long maxNumberOfExtensions;
	/**
	 * Voice line table.

Support for adding and removing lines is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxLineCount}}.
	 */
	@XmlElementWrapper(name = "lines")
	@XmlElement(name = "Line")
	@CWMPParameter(access = "readWrite")
	public Collection<Line> lines;
	/**
	 * Extension table containing the local numbers and names.

Support for adding and removing extensions is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxExtensionCount}}.
	 */
	@XmlElementWrapper(name = "extensions")
	@XmlElement(name = "Extension")
	@CWMPParameter(access = "readWrite")
	public Collection<Extension> extensions;
	/**
	 * This object models an extension as a group of extensions.
	 */
	@XmlElementWrapper(name = "groups")
	@XmlElement(name = "Group")
	@CWMPParameter(access = "readWrite")
	public Collection<Group> groups;
	/**
	 * Voice mail configuration related to a particular extension.
	 */
	@XmlElementWrapper(name = "mailboxs")
	@XmlElement(name = "Mailbox")
	@CWMPParameter(access = "readWrite")
	public Collection<Mailbox> mailboxs;
	/**
	 * The {{object}} is a table that is used to control which extensions ring when an incoming call is received.

The map approach separates the call routing aspects from the configuration of the lines and extensions. It support PBX concepts such as DDI (one extension per line) and groups (parallel dialing if extensions have same priority and hunting when extensions have different priority).
	 */
	@XmlElementWrapper(name = "incomingMaps")
	@XmlElement(name = "IncomingMap")
	@CWMPParameter(access = "readWrite")
	public Collection<IncomingMap> incomingMaps;
	/**
	 * The {{object}} is a table that is used to control which line is used when an extension makes a call.
	 */
	@XmlElementWrapper(name = "outgoingMaps")
	@XmlElement(name = "OutgoingMap")
	@CWMPParameter(access = "readWrite")
	public Collection<OutgoingMap> outgoingMaps;
	/**
	 * Information related the numbering plan.

{{object}} is applicable only if the device supports a dialing mechanism for which a number plan is needed (for example, some devices with an explicit Dial button do not need to be aware of the dialing plan) and if the device does not already support a numbering plan mechanism for this call control (e.g., in-band via MGCP).
	 */
	@XmlElementWrapper(name = "numberingPlans")
	@XmlElement(name = "NumberingPlan")
	@CWMPParameter(access = "readWrite")
	public Collection<NumberingPlan> numberingPlans;
	/**
	 * This object models the calling features that can be apply on {{object|.CallControl.Line}} or {{object|.CallControl.Extension}}.
	 */
	@XmlElement(name = "CallingFeatures")
	public CallingFeatures callingFeatures;

	public CallControl() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of {{object|Line.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNumberOfLines() {
		return maxNumberOfLines;
	}

	/**
	 * Set the maximum number of {{object|Line.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @since 2.0
	 * @param maxNumberOfLines the input value
	 */
	public void  setMaxNumberOfLines(Long maxNumberOfLines) {
		this.maxNumberOfLines = maxNumberOfLines;
	}

	/**
	 * Set the maximum number of {{object|Line.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @since 2.0
	 * @param maxNumberOfLines the input value
	 * @return this instance
	 */
	public CallControl withMaxNumberOfLines(Long maxNumberOfLines) {
		this.maxNumberOfLines = maxNumberOfLines;
		return this;
	}

	/**
	 * Get the maximum number of {{object|Extension.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNumberOfExtensions() {
		return maxNumberOfExtensions;
	}

	/**
	 * Set the maximum number of {{object|Extension.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @since 2.0
	 * @param maxNumberOfExtensions the input value
	 */
	public void  setMaxNumberOfExtensions(Long maxNumberOfExtensions) {
		this.maxNumberOfExtensions = maxNumberOfExtensions;
	}

	/**
	 * Set the maximum number of {{object|Extension.{i}.}} in {{object}}.

This value cannot be greater than {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @since 2.0
	 * @param maxNumberOfExtensions the input value
	 * @return this instance
	 */
	public CallControl withMaxNumberOfExtensions(Long maxNumberOfExtensions) {
		this.maxNumberOfExtensions = maxNumberOfExtensions;
		return this;
	}

	/**
	 * Get the voice line table.

Support for adding and removing lines is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @return the value
	 */
	public Collection<Line> getLines() {
		if (this.lines == null){ this.lines=new ArrayList<>();}
		return lines;
	}

	/**
	 * Set the voice line table.

Support for adding and removing lines is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @param lines the input value
	 */
	public void  setLines(Collection<Line> lines) {
		this.lines = lines;
	}

	/**
	 * Set the voice line table.

Support for adding and removing lines is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxLineCount}}.
	 *
	 * @param line the input value
	 * @return this instance
	 */
	public CallControl withLine(Line line) {
		getLines().add(line);
		return this;
	}

	/**
	 * Get the extension table containing the local numbers and names.

Support for adding and removing extensions is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @return the value
	 */
	public Collection<Extension> getExtensions() {
		if (this.extensions == null){ this.extensions=new ArrayList<>();}
		return extensions;
	}

	/**
	 * Set the extension table containing the local numbers and names.

Support for adding and removing extensions is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @param extensions the input value
	 */
	public void  setExtensions(Collection<Extension> extensions) {
		this.extensions = extensions;
	}

	/**
	 * Set the extension table containing the local numbers and names.

Support for adding and removing extensions is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @param extension the input value
	 * @return this instance
	 */
	public CallControl withExtension(Extension extension) {
		getExtensions().add(extension);
		return this;
	}

	/**
	 * Get the this object models an extension as a group of extensions.
	 *
	 * @return the value
	 */
	public Collection<Group> getGroups() {
		if (this.groups == null){ this.groups=new ArrayList<>();}
		return groups;
	}

	/**
	 * Set the this object models an extension as a group of extensions.
	 *
	 * @param groups the input value
	 */
	public void  setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	/**
	 * Set the this object models an extension as a group of extensions.
	 *
	 * @param group the input value
	 * @return this instance
	 */
	public CallControl withGroup(Group group) {
		getGroups().add(group);
		return this;
	}

	/**
	 * Get the voice mail configuration related to a particular extension.
	 *
	 * @return the value
	 */
	public Collection<Mailbox> getMailboxs() {
		if (this.mailboxs == null){ this.mailboxs=new ArrayList<>();}
		return mailboxs;
	}

	/**
	 * Set the voice mail configuration related to a particular extension.
	 *
	 * @param mailboxs the input value
	 */
	public void  setMailboxs(Collection<Mailbox> mailboxs) {
		this.mailboxs = mailboxs;
	}

	/**
	 * Set the voice mail configuration related to a particular extension.
	 *
	 * @param mailbox the input value
	 * @return this instance
	 */
	public CallControl withMailbox(Mailbox mailbox) {
		getMailboxs().add(mailbox);
		return this;
	}

	/**
	 * Get the {{object}} is a table that is used to control which extensions ring when an incoming call is received.

The map approach separates the call routing aspects from the configuration of the lines and extensions. It support PBX concepts such as DDI (one extension per line) and groups (parallel dialing if extensions have same priority and hunting when extensions have different priority).
	 *
	 * @return the value
	 */
	public Collection<IncomingMap> getIncomingMaps() {
		if (this.incomingMaps == null){ this.incomingMaps=new ArrayList<>();}
		return incomingMaps;
	}

	/**
	 * Set the {{object}} is a table that is used to control which extensions ring when an incoming call is received.

The map approach separates the call routing aspects from the configuration of the lines and extensions. It support PBX concepts such as DDI (one extension per line) and groups (parallel dialing if extensions have same priority and hunting when extensions have different priority).
	 *
	 * @param incomingMaps the input value
	 */
	public void  setIncomingMaps(Collection<IncomingMap> incomingMaps) {
		this.incomingMaps = incomingMaps;
	}

	/**
	 * Set the {{object}} is a table that is used to control which extensions ring when an incoming call is received.

The map approach separates the call routing aspects from the configuration of the lines and extensions. It support PBX concepts such as DDI (one extension per line) and groups (parallel dialing if extensions have same priority and hunting when extensions have different priority).
	 *
	 * @param incomingMap the input value
	 * @return this instance
	 */
	public CallControl withIncomingMap(IncomingMap incomingMap) {
		getIncomingMaps().add(incomingMap);
		return this;
	}

	/**
	 * Get the {{object}} is a table that is used to control which line is used when an extension makes a call.
	 *
	 * @return the value
	 */
	public Collection<OutgoingMap> getOutgoingMaps() {
		if (this.outgoingMaps == null){ this.outgoingMaps=new ArrayList<>();}
		return outgoingMaps;
	}

	/**
	 * Set the {{object}} is a table that is used to control which line is used when an extension makes a call.
	 *
	 * @param outgoingMaps the input value
	 */
	public void  setOutgoingMaps(Collection<OutgoingMap> outgoingMaps) {
		this.outgoingMaps = outgoingMaps;
	}

	/**
	 * Set the {{object}} is a table that is used to control which line is used when an extension makes a call.
	 *
	 * @param outgoingMap the input value
	 * @return this instance
	 */
	public CallControl withOutgoingMap(OutgoingMap outgoingMap) {
		getOutgoingMaps().add(outgoingMap);
		return this;
	}

	/**
	 * Get the information related the numbering plan.

{{object}} is applicable only if the device supports a dialing mechanism for which a number plan is needed (for example, some devices with an explicit Dial button do not need to be aware of the dialing plan) and if the device does not already support a numbering plan mechanism for this call control (e.g., in-band via MGCP).
	 *
	 * @return the value
	 */
	public Collection<NumberingPlan> getNumberingPlans() {
		if (this.numberingPlans == null){ this.numberingPlans=new ArrayList<>();}
		return numberingPlans;
	}

	/**
	 * Set the information related the numbering plan.

{{object}} is applicable only if the device supports a dialing mechanism for which a number plan is needed (for example, some devices with an explicit Dial button do not need to be aware of the dialing plan) and if the device does not already support a numbering plan mechanism for this call control (e.g., in-band via MGCP).
	 *
	 * @param numberingPlans the input value
	 */
	public void  setNumberingPlans(Collection<NumberingPlan> numberingPlans) {
		this.numberingPlans = numberingPlans;
	}

	/**
	 * Set the information related the numbering plan.

{{object}} is applicable only if the device supports a dialing mechanism for which a number plan is needed (for example, some devices with an explicit Dial button do not need to be aware of the dialing plan) and if the device does not already support a numbering plan mechanism for this call control (e.g., in-band via MGCP).
	 *
	 * @param numberingPlan the input value
	 * @return this instance
	 */
	public CallControl withNumberingPlan(NumberingPlan numberingPlan) {
		getNumberingPlans().add(numberingPlan);
		return this;
	}

	/**
	 * Get the this object models the calling features that can be apply on {{object|.CallControl.Line}} or {{object|.CallControl.Extension}}.
	 *
	 * @return the value
	 */
	public CallingFeatures getCallingFeatures() {
		return callingFeatures;
	}

	/**
	 * Set the this object models the calling features that can be apply on {{object|.CallControl.Line}} or {{object|.CallControl.Extension}}.
	 *
	 * @param callingFeatures the input value
	 */
	public void  setCallingFeatures(CallingFeatures callingFeatures) {
		this.callingFeatures = callingFeatures;
	}

	/**
	 * Set the this object models the calling features that can be apply on {{object|.CallControl.Line}} or {{object|.CallControl.Extension}}.
	 *
	 * @param callingFeatures the input value
	 * @return this instance
	 */
	public CallControl withCallingFeatures(CallingFeatures callingFeatures) {
		this.callingFeatures = callingFeatures;
		return this;
	}

	//</editor-fold>

}