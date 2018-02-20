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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

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

	/**
	 * This object contains parameters relating to the S1AP configuration.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.S1AP.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.S1AP")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.S1AP")
@XmlAccessorType(XmlAccessType.FIELD)
public class S1AP {

	/**
	 * {{list}} Each item is a maximum time for the Handover Preparation procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started when the LTE FAP sends the HANDOVER REQUIRED message. Upon reception of the HANDOVER COMMAND message the LTE FAP shall stop the timer. Corresponds to parameter TS1RELOCprep defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If the LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If the LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRelocPrep")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> trelocPrep;
	/**
	 * {{list}} Each item is a maximum time for the protection of the overall handover procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started reception of the HANDOVER COMMAND message. Corresponds to parameter TS1RELOCOverall defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRelocOverall")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> trelocOverall;

	public S1AP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a maximum time for the Handover Preparation procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started when the LTE FAP sends the HANDOVER REQUIRED message. Upon reception of the HANDOVER COMMAND message the LTE FAP shall stop the timer. Corresponds to parameter TS1RELOCprep defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If the LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If the LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTrelocPrep() {
		if (this.trelocPrep == null){ this.trelocPrep=new ArrayList<>();}
		return trelocPrep;
	}

	/**
	 * Set the {{list}} Each item is a maximum time for the Handover Preparation procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started when the LTE FAP sends the HANDOVER REQUIRED message. Upon reception of the HANDOVER COMMAND message the LTE FAP shall stop the timer. Corresponds to parameter TS1RELOCprep defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If the LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If the LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param trelocPrep the input value
	 */
	public void  setTrelocPrep(Collection<String> trelocPrep) {
		this.trelocPrep = trelocPrep;
	}

	/**
	 * Set the {{list}} Each item is a maximum time for the Handover Preparation procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started when the LTE FAP sends the HANDOVER REQUIRED message. Upon reception of the HANDOVER COMMAND message the LTE FAP shall stop the timer. Corresponds to parameter TS1RELOCprep defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If the LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If the LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then the LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public S1AP withTrelocPrep(String string) {
		getTrelocPrep().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a maximum time for the protection of the overall handover procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started reception of the HANDOVER COMMAND message. Corresponds to parameter TS1RELOCOverall defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTrelocOverall() {
		if (this.trelocOverall == null){ this.trelocOverall=new ArrayList<>();}
		return trelocOverall;
	}

	/**
	 * Set the {{list}} Each item is a maximum time for the protection of the overall handover procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started reception of the HANDOVER COMMAND message. Corresponds to parameter TS1RELOCOverall defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param trelocOverall the input value
	 */
	public void  setTrelocOverall(Collection<String> trelocOverall) {
		this.trelocOverall = trelocOverall;
	}

	/**
	 * Set the {{list}} Each item is a maximum time for the protection of the overall handover procedure in the source LTE FAP, specified in seconds, with a numeric range between 0 and 300 inclusive. Only values in multiple of 5 are valid; use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The timer is started reception of the HANDOVER COMMAND message. Corresponds to parameter TS1RELOCOverall defined in {{bibref|3GPP-TS.36.413|Section 8.4.1.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public S1AP withTrelocOverall(String string) {
		getTrelocOverall().add(string);
		return this;
	}

	//</editor-fold>

}