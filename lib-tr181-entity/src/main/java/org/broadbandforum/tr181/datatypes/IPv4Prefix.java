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
package org.broadbandforum.tr181.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.tr181.datatypes.IPPrefix;

	/**
	 * IPv4 address prefix. 

      Can be any IPv4 prefix that is permitted by the ''IPPrefix'' data type.
	 */
@XmlRootElement(name = "IPv4Prefix")
@XmlType(name = "org.broadbandforum.tr181.datatypes.IPv4Prefix")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Prefix extends IPPrefix {


	public IPv4Prefix() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	//</editor-fold>

}