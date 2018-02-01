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
package org.broadbandforum.tr181.device.bridging.bridge.port;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * {{object}} provides the management control for the processing of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}}.

        The object is applicable to deployments of  {{object|####.Bridging.ProviderBridge}} where the {{object|###.Bridge}} instance is referenced by {{param|####.Bridging.ProviderBridge.{i}.SVLANComponent}} or {{param|####.Bridging.ProviderBridge.{i}.CVLANComponents}} parameters.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.Bridging.Bridge.{i}.Port.{i}.PriorityCodePoint.")
public class PriorityCodePoint {

	/**
	 * This parameter identifies the row in the {{param|PCPEncoding}} and {{param|PCPDecoding}} parameter lists. The value of 1 points to the 8P0D row in the corresponding parameter lists.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PCPSelection")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4)
	public Long pcpSelection = 1L;
	/**
	 * This parameter controls the processing of the drop_eligible field and is described in {{bibref|802.1Q-2011|section 6.9.3}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UseDEI")
	@CWMPParameter(access = "readWrite")
	public Boolean useDEI = false;
	/**
	 * This parameter controls the processing of the encoding or decoding of the drop_eligible component in the PCP field and is described in {{bibref|802.1Q-2011|section 8.6.7}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "RequireDropEncoding")
	@CWMPParameter(access = "readWrite")
	public Boolean requireDropEncoding = false;
	/**
	 * This parameter provides the management control for the processing of the encoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-3}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-3 (mentioned above):

          : [7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,0,1,0]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PCPEncoding")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> pcpEncoding;
	/**
	 * This parameter provides the management control for the processing of the decoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-4}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-4 (mentioned above):

          : [7,0,6,0,5,0,4,0,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,0,0,0,1]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PCPDecoding")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> pcpDecoding;

	public PriorityCodePoint() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter identifies the row in the {{param|PCPEncoding}} and {{param|PCPDecoding}} parameter lists. The value of 1 points to the 8P0D row in the corresponding parameter lists.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getPcpSelection() {
		return pcpSelection;
	}

	/**
	 * Set the this parameter identifies the row in the {{param|PCPEncoding}} and {{param|PCPDecoding}} parameter lists. The value of 1 points to the 8P0D row in the corresponding parameter lists.
	 *
	 * @since 2.7
	 * @param pcpSelection the input value
	 */
	public void  setPcpSelection(Long pcpSelection) {
		this.pcpSelection = pcpSelection;
	}

	/**
	 * Set the this parameter identifies the row in the {{param|PCPEncoding}} and {{param|PCPDecoding}} parameter lists. The value of 1 points to the 8P0D row in the corresponding parameter lists.
	 *
	 * @since 2.7
	 * @param pcpSelection the input value
	 * @return this instance
	 */
	public PriorityCodePoint withPcpSelection(Long pcpSelection) {
		this.pcpSelection = pcpSelection;
		return this;
	}

	/**
	 * Get the this parameter controls the processing of the drop_eligible field and is described in {{bibref|802.1Q-2011|section 6.9.3}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isUseDEI() {
		return useDEI;
	}

	/**
	 * Set the this parameter controls the processing of the drop_eligible field and is described in {{bibref|802.1Q-2011|section 6.9.3}}.
	 *
	 * @since 2.7
	 * @param useDEI the input value
	 */
	public void  setUseDEI(Boolean useDEI) {
		this.useDEI = useDEI;
	}

	/**
	 * Set the this parameter controls the processing of the drop_eligible field and is described in {{bibref|802.1Q-2011|section 6.9.3}}.
	 *
	 * @since 2.7
	 * @param useDEI the input value
	 * @return this instance
	 */
	public PriorityCodePoint withUseDEI(Boolean useDEI) {
		this.useDEI = useDEI;
		return this;
	}

	/**
	 * Get the this parameter controls the processing of the encoding or decoding of the drop_eligible component in the PCP field and is described in {{bibref|802.1Q-2011|section 8.6.7}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isRequireDropEncoding() {
		return requireDropEncoding;
	}

	/**
	 * Set the this parameter controls the processing of the encoding or decoding of the drop_eligible component in the PCP field and is described in {{bibref|802.1Q-2011|section 8.6.7}}.
	 *
	 * @since 2.7
	 * @param requireDropEncoding the input value
	 */
	public void  setRequireDropEncoding(Boolean requireDropEncoding) {
		this.requireDropEncoding = requireDropEncoding;
	}

	/**
	 * Set the this parameter controls the processing of the encoding or decoding of the drop_eligible component in the PCP field and is described in {{bibref|802.1Q-2011|section 8.6.7}}.
	 *
	 * @since 2.7
	 * @param requireDropEncoding the input value
	 * @return this instance
	 */
	public PriorityCodePoint withRequireDropEncoding(Boolean requireDropEncoding) {
		this.requireDropEncoding = requireDropEncoding;
		return this;
	}

	/**
	 * Get the this parameter provides the management control for the processing of the encoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-3}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-3 (mentioned above):

          : [7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,0,1,0]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getPcpEncoding() {
		if (this.pcpEncoding == null){ this.pcpEncoding=new ArrayList<>();}
		return pcpEncoding;
	}

	/**
	 * Set the this parameter provides the management control for the processing of the encoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-3}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-3 (mentioned above):

          : [7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,0,1,0]
	 *
	 * @since 2.7
	 * @param pcpEncoding the input value
	 */
	public void  setPcpEncoding(Collection<String> pcpEncoding) {
		this.pcpEncoding = pcpEncoding;
	}

	/**
	 * Set the this parameter provides the management control for the processing of the encoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-3}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-3 (mentioned above):

          : [7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,3,2,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,1,0,0],[7,7,6,6,5,4,5,4,3,2,3,2,1,0,1,0]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public PriorityCodePoint withPcpEncoding(String string) {
		getPcpEncoding().add(string);
		return this;
	}

	/**
	 * Get the this parameter provides the management control for the processing of the decoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-4}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-4 (mentioned above):

          : [7,0,6,0,5,0,4,0,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,0,0,0,1]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getPcpDecoding() {
		if (this.pcpDecoding == null){ this.pcpDecoding=new ArrayList<>();}
		return pcpDecoding;
	}

	/**
	 * Set the this parameter provides the management control for the processing of the decoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-4}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-4 (mentioned above):

          : [7,0,6,0,5,0,4,0,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,0,0,0,1]
	 *
	 * @since 2.7
	 * @param pcpDecoding the input value
	 */
	public void  setPcpDecoding(Collection<String> pcpDecoding) {
		this.pcpDecoding = pcpDecoding;
	}

	/**
	 * Set the this parameter provides the management control for the processing of the decoding of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}} and {{bibref|802.1Q-2011|Table 6-4}}.

          The list is an ordered list that contains entries for the following 4 PCP Values: "8P0D","7P1D", "6P2D" "5P3D".  Each list entry matches the following pattern:

          {{pattern}}

          The value of this parameter MUST use square brackets to protect comma separators within nested lists.  For example, this corresponds to Table 6-4 (mentioned above):

          : [7,0,6,0,5,0,4,0,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,3,0,2,0,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,1,0,0,0],[7,0,6,0,4,0,4,1,2,0,2,1,0,0,0,1]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public PriorityCodePoint withPcpDecoding(String string) {
		getPcpDecoding().add(string);
		return this;
	}

	//</editor-fold>

}