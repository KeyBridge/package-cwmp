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
package org.broadbandforum.tr157.bulkdata.profile;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr157.bulkdata.profile.http.RequestURIParameter;

	/**
	 * This object defines the properties to be used when transporting bulk data using the HTTP/HTTPS protocol. This object is used when the {{param|#.Protocol}} parameter has a value of {{enum|HTTP|##.Protocols}}. For authentication purposes the CPE MUST support HTTP Basic and Digest Access Authentication as defined in {{bibref|RFC2616}}.
	 *
	 * @since TR157 v1.10
	 */
@CWMPObject(name = "BulkData.Profile.{i}.HTTP.")
@XmlRootElement(name = "BulkData.Profile.HTTP")
@XmlType(name = "BulkData.Profile.HTTP")
@XmlAccessorType(XmlAccessType.FIELD)
public class HTTP {

	/**
	 * The URL, as defined in {{bibref|RFC3986}}, for the collection server to receive the Bulk Data transmitted by the CPE.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	public String url;
	/**
	 * Username used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Indicates the HTTP Compression mechanism(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "CompressionsSupported")
	@XmlList
	public Collection<String> compressionsSupported;
	/**
	 * The value of this parameter represents the HTTP Compression mechanism to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Compression")
	@CWMPParameter(access = "readWrite")
	public String compression;
	/**
	 * Indicates the HTTP method(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "MethodsSupported")
	@XmlList
	public Collection<String> methodsSupported;
	/**
	 * The value of this parameter represents the HTTP method to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Method")
	@CWMPParameter(access = "readWrite")
	public String method;
	/**
	 * When {{true}}, the CPE encodes the HTTP Date Header {{bibref|RFC2616|Section 14.18}} in the HTTP client request.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "UseDateHeader")
	@CWMPParameter(access = "readWrite")
	public Boolean useDateHeader;
	/**
	 * When {{true}}, the CPE retries unsuccessful attempts to transfer data.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "RetryEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean retryEnable;
	/**
	 * Configures the data transfer retry wait interval, in seconds, as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          The device MUST use a random value between {{param}}  and ({{param}} * {{param|RetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "RetryMinimumWaitInterval")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long retryMinimumWaitInterval = 5L;
	/**
	 * Configures the retry interval multiplier as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

          The device MUST use a random value between {{param|RetryMinimumWaitInterval}}  and ({{param|RetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "RetryIntervalMultiplier")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1000, max = 65535)
	public Long retryIntervalMultiplier = 2000L;
	/**
	 * This object represents an instance of a parameter to be used in the report header used as part of the HTTP Request-URI transmitted by the CPE to the collection server using the Request-URI in addition to the parameters required by {{bibref|TR-157a10|Annex A.2.1}}.
	 */
	@XmlElementWrapper(name = "RequestURIParameters")
	@XmlElement(name = "RequestURIParameter")
	@CWMPParameter(access = "readWrite")
	public Collection<RequestURIParameter> requestURIParameters;

	public HTTP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the URL, as defined in {{bibref|RFC3986}}, for the collection server to receive the Bulk Data transmitted by the CPE.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the collection server to receive the Bulk Data transmitted by the CPE.
	 *
	 * @since 1.10
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the collection server to receive the Bulk Data transmitted by the CPE.
	 *
	 * @since 1.10
	 * @param url the input value
	 * @return this instance
	 */
	public HTTP withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the username used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @param username the input value
	 * @return this instance
	 */
	public HTTP withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the collection server.
	 *
	 * @since 1.10
	 * @param password the input value
	 * @return this instance
	 */
	public HTTP withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the indicates the HTTP Compression mechanism(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getCompressionsSupported() {
		if (this.compressionsSupported == null){ this.compressionsSupported=new ArrayList<>();}
		return compressionsSupported;
	}

	/**
	 * Set the indicates the HTTP Compression mechanism(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @param compressionsSupported the input value
	 */
	public void  setCompressionsSupported(Collection<String> compressionsSupported) {
		this.compressionsSupported = compressionsSupported;
	}

	/**
	 * Set the indicates the HTTP Compression mechanism(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public HTTP withCompressionsSupported(String string) {
		getCompressionsSupported().add(string);
		return this;
	}

	/**
	 * Get the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getCompression() {
		return compression;
	}

	/**
	 * Set the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @param compression the input value
	 */
	public void  setCompression(String compression) {
		this.compression = compression;
	}

	/**
	 * Set the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @param compression the input value
	 * @return this instance
	 */
	public HTTP withCompression(String compression) {
		this.compression = compression;
		return this;
	}

	/**
	 * Get the indicates the HTTP method(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Collection<String> getMethodsSupported() {
		if (this.methodsSupported == null){ this.methodsSupported=new ArrayList<>();}
		return methodsSupported;
	}

	/**
	 * Set the indicates the HTTP method(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @param methodsSupported the input value
	 */
	public void  setMethodsSupported(Collection<String> methodsSupported) {
		this.methodsSupported = methodsSupported;
	}

	/**
	 * Set the indicates the HTTP method(s) supported by this CPE for the purposes of transferring bulk data.
	 *
	 * @since 1.10
	 * @param string the input value
	 * @return this instance
	 */
	public HTTP withMethodsSupported(String string) {
		getMethodsSupported().add(string);
		return this;
	}

	/**
	 * Get the value of this parameter represents the HTTP method to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Set the value of this parameter represents the HTTP method to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @param method the input value
	 */
	public void  setMethod(String method) {
		this.method = method;
	}

	/**
	 * Set the value of this parameter represents the HTTP method to be used by the CPE when transferring data to the collection server.
	 *
	 * @since 1.10
	 * @param method the input value
	 * @return this instance
	 */
	public HTTP withMethod(String method) {
		this.method = method;
		return this;
	}

	/**
	 * Get the when {{true}}, the CPE encodes the HTTP Date Header {{bibref|RFC2616|Section 14.18}} in the HTTP client request.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isUseDateHeader() {
		return useDateHeader;
	}

	/**
	 * Set the when {{true}}, the CPE encodes the HTTP Date Header {{bibref|RFC2616|Section 14.18}} in the HTTP client request.
	 *
	 * @since 1.10
	 * @param useDateHeader the input value
	 */
	public void  setUseDateHeader(Boolean useDateHeader) {
		this.useDateHeader = useDateHeader;
	}

	/**
	 * Set the when {{true}}, the CPE encodes the HTTP Date Header {{bibref|RFC2616|Section 14.18}} in the HTTP client request.
	 *
	 * @since 1.10
	 * @param useDateHeader the input value
	 * @return this instance
	 */
	public HTTP withUseDateHeader(Boolean useDateHeader) {
		this.useDateHeader = useDateHeader;
		return this;
	}

	/**
	 * Get the when {{true}}, the CPE retries unsuccessful attempts to transfer data.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isRetryEnable() {
		return retryEnable;
	}

	/**
	 * Set the when {{true}}, the CPE retries unsuccessful attempts to transfer data.
	 *
	 * @since 1.10
	 * @param retryEnable the input value
	 */
	public void  setRetryEnable(Boolean retryEnable) {
		this.retryEnable = retryEnable;
	}

	/**
	 * Set the when {{true}}, the CPE retries unsuccessful attempts to transfer data.
	 *
	 * @since 1.10
	 * @param retryEnable the input value
	 * @return this instance
	 */
	public HTTP withRetryEnable(Boolean retryEnable) {
		this.retryEnable = retryEnable;
		return this;
	}

	/**
	 * Get the configures the data transfer retry wait interval, in seconds, as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          The device MUST use a random value between {{param}}  and ({{param}} * {{param|RetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getRetryMinimumWaitInterval() {
		return retryMinimumWaitInterval;
	}

	/**
	 * Set the configures the data transfer retry wait interval, in seconds, as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          The device MUST use a random value between {{param}}  and ({{param}} * {{param|RetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @param retryMinimumWaitInterval the input value
	 */
	public void  setRetryMinimumWaitInterval(Long retryMinimumWaitInterval) {
		this.retryMinimumWaitInterval = retryMinimumWaitInterval;
	}

	/**
	 * Set the configures the data transfer retry wait interval, in seconds, as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          The device MUST use a random value between {{param}}  and ({{param}} * {{param|RetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @param retryMinimumWaitInterval the input value
	 * @return this instance
	 */
	public HTTP withRetryMinimumWaitInterval(Long retryMinimumWaitInterval) {
		this.retryMinimumWaitInterval = retryMinimumWaitInterval;
		return this;
	}

	/**
	 * Get the configures the retry interval multiplier as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

          The device MUST use a random value between {{param|RetryMinimumWaitInterval}}  and ({{param|RetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getRetryIntervalMultiplier() {
		return retryIntervalMultiplier;
	}

	/**
	 * Set the configures the retry interval multiplier as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

          The device MUST use a random value between {{param|RetryMinimumWaitInterval}}  and ({{param|RetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @param retryIntervalMultiplier the input value
	 */
	public void  setRetryIntervalMultiplier(Long retryIntervalMultiplier) {
		this.retryIntervalMultiplier = retryIntervalMultiplier;
	}

	/**
	 * Set the configures the retry interval multiplier as specified in {{bibref|TR-157a10|Annex A.2.2.1}}.

          This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

          The device MUST use a random value between {{param|RetryMinimumWaitInterval}}  and ({{param|RetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.10
	 * @param retryIntervalMultiplier the input value
	 * @return this instance
	 */
	public HTTP withRetryIntervalMultiplier(Long retryIntervalMultiplier) {
		this.retryIntervalMultiplier = retryIntervalMultiplier;
		return this;
	}

	/**
	 * Get the this object represents an instance of a parameter to be used in the report header used as part of the HTTP Request-URI transmitted by the CPE to the collection server using the Request-URI in addition to the parameters required by {{bibref|TR-157a10|Annex A.2.1}}.
	 *
	 * @return the value
	 */
	public Collection<RequestURIParameter> getRequestURIParameters() {
		if (this.requestURIParameters == null){ this.requestURIParameters=new ArrayList<>();}
		return requestURIParameters;
	}

	/**
	 * Set the this object represents an instance of a parameter to be used in the report header used as part of the HTTP Request-URI transmitted by the CPE to the collection server using the Request-URI in addition to the parameters required by {{bibref|TR-157a10|Annex A.2.1}}.
	 *
	 * @param requestURIParameters the input value
	 */
	public void  setRequestURIParameters(Collection<RequestURIParameter> requestURIParameters) {
		this.requestURIParameters = requestURIParameters;
	}

	/**
	 * Set the this object represents an instance of a parameter to be used in the report header used as part of the HTTP Request-URI transmitted by the CPE to the collection server using the Request-URI in addition to the parameters required by {{bibref|TR-157a10|Annex A.2.1}}.
	 *
	 * @param requestURIParameter the input value
	 * @return this instance
	 */
	public HTTP withRequestURIParameter(RequestURIParameter requestURIParameter) {
		getRequestURIParameters().add(requestURIParameter);
		return this;
	}

	//</editor-fold>

}