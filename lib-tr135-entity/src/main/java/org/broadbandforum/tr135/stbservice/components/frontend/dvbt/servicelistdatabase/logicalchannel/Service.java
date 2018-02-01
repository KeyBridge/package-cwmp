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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt.servicelistdatabase.logicalchannel;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * DVB-T service information.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.LogicalChannel.{i}.Service.{i}.")
public class Service {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this service, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * DVB Triplet {{bibref|TS102034}} that uniquely identifies the service in the service list database.

The DVB Triplet is a 12-byte string that is a concatenation of 4 hexadecimal characters for each of the following: Original Network Id, Transport Stream Id, Service Id.  For example:

* OriginalNetworkId = 8442 = 0x20FA

* TransportStreamId = 4 = 0x0004

* ServiceId = 257 = 0x0101

-> DvbId = ''20FA00040101''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DvbId")
	@Size(max = 12)
	public String dvbId;
	/**
	 * Transmitter frequency (in kHz) for this service.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Frequency")
	public Long frequency;
	/**
	 * Bit Error Ratio before correction, expressed in multiples of 1e-6 (indicates the quality of this service).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BER")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ber;
	/**
	 * Bit Error Ratio after correction, expressed in multiples of 1e-9 (indicates the quality of this service).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CBER")
	@CWMPParameter(activeNotify = "canDeny", units = "multiples of 1e-9")
	public Long cbeR;
	/**
	 * Signal/Noise ratio in the carrier band, measured in dB (indicates the quality of this service).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SNR")
	@CWMPParameter(activeNotify = "canDeny", units = "dB")
	public Long snr;
	/**
	 * When set to {{true}}, identifies this as the preferred service for this logical channel and automatically sets {{param}} to {{false}} for other services associated with this logical channel.

When set to {{false}}, cancels this service's preferred status and causes the service with the lowest {{param|BER}} (best received quality) to become the preferred service for this logical channel.

Whenever frequencies are re-scanned, all {{param}} parameters are implicitly reset to {{false}}, i.e. a re-scan will always use the {{param|BER}} to determine preferred services, and will discard any past explicit overrides.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Preferred")
	@CWMPParameter(access = "readWrite")
	public Boolean preferred;

	public Service() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Service withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this service, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this service, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this service, e.g. read from the DVB service information metadata.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public Service withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the dvb Triplet {{bibref|TS102034}} that uniquely identifies the service in the service list database.

The DVB Triplet is a 12-byte string that is a concatenation of 4 hexadecimal characters for each of the following: Original Network Id, Transport Stream Id, Service Id.  For example:

* OriginalNetworkId = 8442 = 0x20FA

* TransportStreamId = 4 = 0x0004

* ServiceId = 257 = 0x0101

-> DvbId = ''20FA00040101''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDvbId() {
		return dvbId;
	}

	/**
	 * Set the dvb Triplet {{bibref|TS102034}} that uniquely identifies the service in the service list database.

The DVB Triplet is a 12-byte string that is a concatenation of 4 hexadecimal characters for each of the following: Original Network Id, Transport Stream Id, Service Id.  For example:

* OriginalNetworkId = 8442 = 0x20FA

* TransportStreamId = 4 = 0x0004

* ServiceId = 257 = 0x0101

-> DvbId = ''20FA00040101''
	 *
	 * @since 1.0
	 * @param dvbId the input value
	 */
	public void  setDvbId(String dvbId) {
		this.dvbId = dvbId;
	}

	/**
	 * Set the dvb Triplet {{bibref|TS102034}} that uniquely identifies the service in the service list database.

The DVB Triplet is a 12-byte string that is a concatenation of 4 hexadecimal characters for each of the following: Original Network Id, Transport Stream Id, Service Id.  For example:

* OriginalNetworkId = 8442 = 0x20FA

* TransportStreamId = 4 = 0x0004

* ServiceId = 257 = 0x0101

-> DvbId = ''20FA00040101''
	 *
	 * @since 1.0
	 * @param dvbId the input value
	 * @return this instance
	 */
	public Service withDvbId(String dvbId) {
		this.dvbId = dvbId;
		return this;
	}

	/**
	 * Get the transmitter frequency (in kHz) for this service.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFrequency() {
		return frequency;
	}

	/**
	 * Set the transmitter frequency (in kHz) for this service.
	 *
	 * @since 1.0
	 * @param frequency the input value
	 */
	public void  setFrequency(Long frequency) {
		this.frequency = frequency;
	}

	/**
	 * Set the transmitter frequency (in kHz) for this service.
	 *
	 * @since 1.0
	 * @param frequency the input value
	 * @return this instance
	 */
	public Service withFrequency(Long frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Get the bit Error Ratio before correction, expressed in multiples of 1e-6 (indicates the quality of this service).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBer() {
		return ber;
	}

	/**
	 * Set the bit Error Ratio before correction, expressed in multiples of 1e-6 (indicates the quality of this service).
	 *
	 * @since 1.0
	 * @param ber the input value
	 */
	public void  setBer(Long ber) {
		this.ber = ber;
	}

	/**
	 * Set the bit Error Ratio before correction, expressed in multiples of 1e-6 (indicates the quality of this service).
	 *
	 * @since 1.0
	 * @param ber the input value
	 * @return this instance
	 */
	public Service withBer(Long ber) {
		this.ber = ber;
		return this;
	}

	/**
	 * Get the bit Error Ratio after correction, expressed in multiples of 1e-9 (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCbeR() {
		return cbeR;
	}

	/**
	 * Set the bit Error Ratio after correction, expressed in multiples of 1e-9 (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @param cbeR the input value
	 */
	public void  setCbeR(Long cbeR) {
		this.cbeR = cbeR;
	}

	/**
	 * Set the bit Error Ratio after correction, expressed in multiples of 1e-9 (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @param cbeR the input value
	 * @return this instance
	 */
	public Service withCbeR(Long cbeR) {
		this.cbeR = cbeR;
		return this;
	}

	/**
	 * Get the signal/Noise ratio in the carrier band, measured in dB (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getSnr() {
		return snr;
	}

	/**
	 * Set the signal/Noise ratio in the carrier band, measured in dB (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @param snr the input value
	 */
	public void  setSnr(Long snr) {
		this.snr = snr;
	}

	/**
	 * Set the signal/Noise ratio in the carrier band, measured in dB (indicates the quality of this service).
	 *
	 * @since 1.1
	 * @param snr the input value
	 * @return this instance
	 */
	public Service withSnr(Long snr) {
		this.snr = snr;
		return this;
	}

	/**
	 * Get the when set to {{true}}, identifies this as the preferred service for this logical channel and automatically sets {{param}} to {{false}} for other services associated with this logical channel.

When set to {{false}}, cancels this service's preferred status and causes the service with the lowest {{param|BER}} (best received quality) to become the preferred service for this logical channel.

Whenever frequencies are re-scanned, all {{param}} parameters are implicitly reset to {{false}}, i.e. a re-scan will always use the {{param|BER}} to determine preferred services, and will discard any past explicit overrides.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPreferred() {
		return preferred;
	}

	/**
	 * Set the when set to {{true}}, identifies this as the preferred service for this logical channel and automatically sets {{param}} to {{false}} for other services associated with this logical channel.

When set to {{false}}, cancels this service's preferred status and causes the service with the lowest {{param|BER}} (best received quality) to become the preferred service for this logical channel.

Whenever frequencies are re-scanned, all {{param}} parameters are implicitly reset to {{false}}, i.e. a re-scan will always use the {{param|BER}} to determine preferred services, and will discard any past explicit overrides.
	 *
	 * @since 1.0
	 * @param preferred the input value
	 */
	public void  setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}

	/**
	 * Set the when set to {{true}}, identifies this as the preferred service for this logical channel and automatically sets {{param}} to {{false}} for other services associated with this logical channel.

When set to {{false}}, cancels this service's preferred status and causes the service with the lowest {{param|BER}} (best received quality) to become the preferred service for this logical channel.

Whenever frequencies are re-scanned, all {{param}} parameters are implicitly reset to {{false}}, i.e. a re-scan will always use the {{param|BER}} to determine preferred services, and will discard any past explicit overrides.
	 *
	 * @since 1.0
	 * @param preferred the input value
	 * @return this instance
	 */
	public Service withPreferred(Boolean preferred) {
		this.preferred = preferred;
		return this;
	}

	//</editor-fold>

}