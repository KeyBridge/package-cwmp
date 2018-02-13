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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The object used for configuring extended system parameter messages for 1x
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ExtendedSystemParameters.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.ExtendedSystemParameters")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.ExtendedSystemParameters")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExtendedSystemParameters {

	/**
	 * protocol revision
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Prev")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long prev;
	/**
	 * minimum protocol revision
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PMinRev")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long pminRev;
	/**
	 * Delete Foreign TMSI.

The base station shall set this field to '1' to cause the mobile station to delete its TMSI if the TMSI was assigned in a different TMSI zone from that specified by the TMSI_ZONE field of this message; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeleteForTMSI")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long deleteForTMSI;
	/**
	 * Use TMSI indicator.

The base station shall set this field to the value shown next field corresponding to the type of MSID that the mobile station is to use on the Access Channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UseTMSI")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long useTMSI;
	/**
	 * Preferred Access Channel Mobile Station Identifier Type. F294.

The base station shall set this field to the value shown as below corresponding to the type of MSDI that the mobile station is to use on the Access Channel.

[useTMSI] [prefMSIDType] [description]

 0                  00                  IMSI_S and ESN

 0                  10                  IMSI

 0                  11                  IMSI and ESN

 1                  10                  TMSI; IMSI

 1                  11                  TMSI; IMSI and ESN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrefMSIDType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long prefMSIDType;
	/**
	 * Mobile Country Code. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MCC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1023)
	public Long mcc;
	/**
	 * 11th and 12th digits of IMSI. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IMSI1112")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long imsI1112;
	/**
	 * TMSI zone length.

The base station shall set this field to the number of octets included in the TMSI_ZONE. The base station shall set this field to a value in the range 1 to 8 inclusive.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TMSIZoneLen")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 8)
	public Long tmsIZoneLen;
	/**
	 * TMSI zone.

The base station shall set this field to the TMSI zone number as specified in {{bibref|3GPP2-N.S0010}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TMSIZone")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long tmsIZone;
	/**
	 * Broadcast slot cycle index. To enable periodic broadcast paging, the base station shall set this field to and unsigned 3-bit number in the range 1-7, equal to the broadcast slot cycle index. To disable periodic broadcast paging, the base station shall set this field to '000'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BcastIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long bcastIndex;
	/**
	 * 1: IMISI_T is supported, 0: IMSI_T is not supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IMSITSupported")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer imsITSupported;
	/**
	 * The slope in the inequality criterion for adding a pilot to the Active Set, or dropping a pilot from the Active Set. The base station shall set this field as an unsigned binary number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SoftSlope")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long softSlope;
	/**
	 * The intercept in the inequality criterion for adding a pilot to the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AddIntercept")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long addIntercept;
	/**
	 * The intercept in the inequality criterion for dropping a pilot from the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DropIntercept")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long dropIntercept;
	/**
	 * Maximum number of alternative service options. The base station shall set this field to the maximum number of alternative service option numbers that the mobile station is allowed to include in the Origination Message or the Page Response Message.

For mobile stations with MOB_P_REVs less than seven, the alternative service options are those service options defined in TSB-58B and related to SERVICE_OPTION in Origination Message and the Page Response Message.

For mobile stations with MOB_P_REVs equal to or greater than seven, the alternative service options are those service options defined in TSB-58B without service group number assigned and related to SERVICE_OPTION in Origination Message and the Page Response Message.

The base station sets this field to a value greater than zero, in addition, the base station shall allow the mobile station with MOB_P_REVs equal to or greater than 7 to include

- a 4 or 8-bit service option bitmap in the Origination Message and the Page Response Message;

- alternative service option numbers, not limited to MAX_ALT_SO_NUM, in the Enhanced Origination Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumAltSo")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long maxNumAltSo;
	/**
	 * System reselection parameters included.

If the base station is including system reselection parameters, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReselectedIncluded")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long reselectedIncluded;
	/**
	 * Pilot power threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_THRESH and set this field to:

[  (pilot_power_threshold + 115 ) ]

where pilot_power_threshold is the pilot power, Ec, in dBm/1.23 MHz, below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EcThresh")
	@CWMPParameter(access = "readWrite", units = "dBm")
	public Long ecthresh;
	/**
	 * Pilot Ec / Io threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_I0_THRESH and set this field to:

[ - 20 x log10 (pilot_threshold) ]

where pilot_threshold is the pilot Ec/Io below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EcIoThresh")
	@CWMPParameter(access = "readWrite")
	public Long ecioThresh;
	/**
	 * Pilot reporting indicator.

The base station shall set this field to '1' if the mobile station is to report the additional pilots which have pilot strength exceeding T_ADD in all Access Channel messages. The base station shall set this field to '0' if the mobile station is to report the additional pilots which have pilot strengths exceeding T_ADD only in the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotReport")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long pilotReport;
	/**
	 * Neighbor Set access entry handoff information included indicator.

If the base station is including information on the Neighbor Set access entry handoff, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NghbrSetEntryInfo")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long nghbrSetEntryInfo;
	/**
	 * Access entry handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access entry handoff after receiving a message while performing the Mobile Station Order and Message Processing Operation in the Mobile Station Idle State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessHOOrder")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accessHOOrder;
	/**
	 * Neighbor Set access handoff included indicator.

If the base station is including information on the Neighbor Set access handoff or access probe handoff, the base station shall set this field to '1', otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NghbrSetAccessInfo")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long nghbrSetAccessInfo;
	/**
	 * Access handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessHO")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accessHO;
	/**
	 * Access handoff permitted for message response indicator.

If AccessHO is set to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to '1' if the mobile station is permitted to perform an access handoff after receiving a message and before responding to that message in the System Access State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessHOMsgRsp")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accessHOMsgRsp;
	/**
	 * Access probe handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the base station is permitted to perform an access probe handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessProbeHO")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accessProbeHO;
	/**
	 * Access handoff list update permitted indicator.

If AccessProbeHO is included and is set to '1', the base station shall set this field to '1' if the mobile station is permitted to update the access handoff list during an access attempt; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccHOListUpd")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accHOListUpd;
	/**
	 * Access probe handoff permitted for messages other than the Origination Message and the Page Response Message.

If AccessProbeHO is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access probe handoff for messages other than the Origination Message and the Page Response. The base station shall set this field to '0' if the mobile station is permitted to perform an access probe handoff only for the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccProbeHOOtherMsg")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long accProbeHOOtherMsg;
	/**
	 * Maximum number of times that mobile station is permitted to perform an access probe handoff.

If AccessProbeHO is set to '1', the base station shall set this field to the maximum number of times the mobile station is allowed to perform an access probe handoff within an access attempt minus one.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNumProbeHO")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long maxNumProbeHO;
	/**
	 * If {{param}} is set to 1, then Braodcast GPS assist is supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BrdcastGPSAssit")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long brdcastGPSAssit;
	/**
	 * Quick Paging Channel Supported Indication.

If the base station supports Quick Paging Channel operation, the base station shall set this field to '1'; otherwise the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QPCHSupported")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long qpcHSupported;
	/**
	 * Number of Quick Paging Channels.

If the base station sets QPCHSUPPORTED to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to the number of Quick Paging Channels on this CDMA Channel. The base station shall not set this field to '00'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQPCH")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 3)
	public Long numQPCH;
	/**
	 * Quick Paging Channel indicator rate.

See {{bibref|3GPP2-C.S0005}}. {{param}} is set as follows:  0:  4800bps; 1:  9600bps.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QPCHRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long qpcHRate;
	/**
	 * Quick Paging Channel paging indicator transmit power level.

{{param}} is set as follows:  0:  5 dB below; 1: 4 dB below; 2: 3 dB below; 3: 2 dB below; 4: 1 dB below; 5:  Same; 6: 1 dB above; 7: 2dB above.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QPCHPwrLevelPage")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long qpcHPwrLevelPage;
	/**
	 * Quick Paging Channel configuration change indicator supported.

{{param}} is set as follows:  if the base station is to support configuration change indicators on the Quick Paging Channel, {{param}} to '1'; otherwise {{param}} is set to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QPCHcciSupported")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long qpcHcciSupported;
	/**
	 * Quick Paging Channel configuration change indicator CONFIG transmit power level.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QPCHPwrLevelConfig")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long qpcHPwrLevelConfig;
	/**
	 * Short Data Burst supported indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SDBSupported")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long sdbSupported;
	/**
	 * Gain adjustment of the Reverse Traffic Channel relative to the Reverse Pilot Channel for Radio Configurations greater than 2.

{{param}} is set to the correction factor to be used by mobile stations in setting the power of a reverse traffic channel, expressed as a two's complement value in units of 0.125 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RLgainTrafficPilot")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = 0, max = 63)
	public Long rlgainTrafficPilot;
	/**
	 * Reverse Power Control Delay included indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RvsPwrCtrlDelayIncl")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long rvsPwrCtrlDelayIncl;
	/**
	 * The reverse power control delay.

{{param}} is setto the closed-loop reverse power control delay minus one (the closed-loop reverse power control delay is the time between the end of a gated-on reverse PCG and the beginning of the Forward Power Control Subchannel in units of 1.25 ms.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RvsPwrCtrlDelay")
	@CWMPParameter(access = "readWrite", units = "1.25 ms")
	@Size(min = 0, max = 3)
	public Long rvsPwrCtrlDelay;

	public ExtendedSystemParameters() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the protocol revision
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrev() {
		return prev;
	}

	/**
	 * Set the protocol revision
	 *
	 * @since 2.0
	 * @param prev the input value
	 */
	public void  setPrev(Long prev) {
		this.prev = prev;
	}

	/**
	 * Set the protocol revision
	 *
	 * @since 2.0
	 * @param prev the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withPrev(Long prev) {
		this.prev = prev;
		return this;
	}

	/**
	 * Get the minimum protocol revision
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPminRev() {
		return pminRev;
	}

	/**
	 * Set the minimum protocol revision
	 *
	 * @since 2.0
	 * @param pminRev the input value
	 */
	public void  setPminRev(Long pminRev) {
		this.pminRev = pminRev;
	}

	/**
	 * Set the minimum protocol revision
	 *
	 * @since 2.0
	 * @param pminRev the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withPminRev(Long pminRev) {
		this.pminRev = pminRev;
		return this;
	}

	/**
	 * Get the delete Foreign TMSI.

The base station shall set this field to '1' to cause the mobile station to delete its TMSI if the TMSI was assigned in a different TMSI zone from that specified by the TMSI_ZONE field of this message; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDeleteForTMSI() {
		return deleteForTMSI;
	}

	/**
	 * Set the delete Foreign TMSI.

The base station shall set this field to '1' to cause the mobile station to delete its TMSI if the TMSI was assigned in a different TMSI zone from that specified by the TMSI_ZONE field of this message; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param deleteForTMSI the input value
	 */
	public void  setDeleteForTMSI(Long deleteForTMSI) {
		this.deleteForTMSI = deleteForTMSI;
	}

	/**
	 * Set the delete Foreign TMSI.

The base station shall set this field to '1' to cause the mobile station to delete its TMSI if the TMSI was assigned in a different TMSI zone from that specified by the TMSI_ZONE field of this message; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param deleteForTMSI the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withDeleteForTMSI(Long deleteForTMSI) {
		this.deleteForTMSI = deleteForTMSI;
		return this;
	}

	/**
	 * Get the use TMSI indicator.

The base station shall set this field to the value shown next field corresponding to the type of MSID that the mobile station is to use on the Access Channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUseTMSI() {
		return useTMSI;
	}

	/**
	 * Set the use TMSI indicator.

The base station shall set this field to the value shown next field corresponding to the type of MSID that the mobile station is to use on the Access Channel.
	 *
	 * @since 2.0
	 * @param useTMSI the input value
	 */
	public void  setUseTMSI(Long useTMSI) {
		this.useTMSI = useTMSI;
	}

	/**
	 * Set the use TMSI indicator.

The base station shall set this field to the value shown next field corresponding to the type of MSID that the mobile station is to use on the Access Channel.
	 *
	 * @since 2.0
	 * @param useTMSI the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withUseTMSI(Long useTMSI) {
		this.useTMSI = useTMSI;
		return this;
	}

	/**
	 * Get the preferred Access Channel Mobile Station Identifier Type. F294.

The base station shall set this field to the value shown as below corresponding to the type of MSDI that the mobile station is to use on the Access Channel.

[useTMSI] [prefMSIDType] [description]

 0                  00                  IMSI_S and ESN

 0                  10                  IMSI

 0                  11                  IMSI and ESN

 1                  10                  TMSI; IMSI

 1                  11                  TMSI; IMSI and ESN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrefMSIDType() {
		return prefMSIDType;
	}

	/**
	 * Set the preferred Access Channel Mobile Station Identifier Type. F294.

The base station shall set this field to the value shown as below corresponding to the type of MSDI that the mobile station is to use on the Access Channel.

[useTMSI] [prefMSIDType] [description]

 0                  00                  IMSI_S and ESN

 0                  10                  IMSI

 0                  11                  IMSI and ESN

 1                  10                  TMSI; IMSI

 1                  11                  TMSI; IMSI and ESN
	 *
	 * @since 2.0
	 * @param prefMSIDType the input value
	 */
	public void  setPrefMSIDType(Long prefMSIDType) {
		this.prefMSIDType = prefMSIDType;
	}

	/**
	 * Set the preferred Access Channel Mobile Station Identifier Type. F294.

The base station shall set this field to the value shown as below corresponding to the type of MSDI that the mobile station is to use on the Access Channel.

[useTMSI] [prefMSIDType] [description]

 0                  00                  IMSI_S and ESN

 0                  10                  IMSI

 0                  11                  IMSI and ESN

 1                  10                  TMSI; IMSI

 1                  11                  TMSI; IMSI and ESN
	 *
	 * @since 2.0
	 * @param prefMSIDType the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withPrefMSIDType(Long prefMSIDType) {
		this.prefMSIDType = prefMSIDType;
		return this;
	}

	/**
	 * Get the mobile Country Code. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMcc() {
		return mcc;
	}

	/**
	 * Set the mobile Country Code. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mcc the input value
	 */
	public void  setMcc(Long mcc) {
		this.mcc = mcc;
	}

	/**
	 * Set the mobile Country Code. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mcc the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withMcc(Long mcc) {
		this.mcc = mcc;
		return this;
	}

	/**
	 * Get the 11th and 12th digits of IMSI. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getImsI1112() {
		return imsI1112;
	}

	/**
	 * Set the 11th and 12th digits of IMSI. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param imsI1112 the input value
	 */
	public void  setImsI1112(Long imsI1112) {
		this.imsI1112 = imsI1112;
	}

	/**
	 * Set the 11th and 12th digits of IMSI. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param imsI1112 the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withImsI1112(Long imsI1112) {
		this.imsI1112 = imsI1112;
		return this;
	}

	/**
	 * Get the tmsI zone length.

The base station shall set this field to the number of octets included in the TMSI_ZONE. The base station shall set this field to a value in the range 1 to 8 inclusive.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTmsIZoneLen() {
		return tmsIZoneLen;
	}

	/**
	 * Set the tmsI zone length.

The base station shall set this field to the number of octets included in the TMSI_ZONE. The base station shall set this field to a value in the range 1 to 8 inclusive.
	 *
	 * @since 2.0
	 * @param tmsIZoneLen the input value
	 */
	public void  setTmsIZoneLen(Long tmsIZoneLen) {
		this.tmsIZoneLen = tmsIZoneLen;
	}

	/**
	 * Set the tmsI zone length.

The base station shall set this field to the number of octets included in the TMSI_ZONE. The base station shall set this field to a value in the range 1 to 8 inclusive.
	 *
	 * @since 2.0
	 * @param tmsIZoneLen the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withTmsIZoneLen(Long tmsIZoneLen) {
		this.tmsIZoneLen = tmsIZoneLen;
		return this;
	}

	/**
	 * Get the tmsI zone.

The base station shall set this field to the TMSI zone number as specified in {{bibref|3GPP2-N.S0010}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTmsIZone() {
		return tmsIZone;
	}

	/**
	 * Set the tmsI zone.

The base station shall set this field to the TMSI zone number as specified in {{bibref|3GPP2-N.S0010}}.
	 *
	 * @since 2.0
	 * @param tmsIZone the input value
	 */
	public void  setTmsIZone(Long tmsIZone) {
		this.tmsIZone = tmsIZone;
	}

	/**
	 * Set the tmsI zone.

The base station shall set this field to the TMSI zone number as specified in {{bibref|3GPP2-N.S0010}}.
	 *
	 * @since 2.0
	 * @param tmsIZone the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withTmsIZone(Long tmsIZone) {
		this.tmsIZone = tmsIZone;
		return this;
	}

	/**
	 * Get the broadcast slot cycle index. To enable periodic broadcast paging, the base station shall set this field to and unsigned 3-bit number in the range 1-7, equal to the broadcast slot cycle index. To disable periodic broadcast paging, the base station shall set this field to '000'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBcastIndex() {
		return bcastIndex;
	}

	/**
	 * Set the broadcast slot cycle index. To enable periodic broadcast paging, the base station shall set this field to and unsigned 3-bit number in the range 1-7, equal to the broadcast slot cycle index. To disable periodic broadcast paging, the base station shall set this field to '000'.
	 *
	 * @since 2.0
	 * @param bcastIndex the input value
	 */
	public void  setBcastIndex(Long bcastIndex) {
		this.bcastIndex = bcastIndex;
	}

	/**
	 * Set the broadcast slot cycle index. To enable periodic broadcast paging, the base station shall set this field to and unsigned 3-bit number in the range 1-7, equal to the broadcast slot cycle index. To disable periodic broadcast paging, the base station shall set this field to '000'.
	 *
	 * @since 2.0
	 * @param bcastIndex the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withBcastIndex(Long bcastIndex) {
		this.bcastIndex = bcastIndex;
		return this;
	}

	/**
	 * Get the 1: IMISI_T is supported, 0: IMSI_T is not supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getImsITSupported() {
		return imsITSupported;
	}

	/**
	 * Set the 1: IMISI_T is supported, 0: IMSI_T is not supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param imsITSupported the input value
	 */
	public void  setImsITSupported(Integer imsITSupported) {
		this.imsITSupported = imsITSupported;
	}

	/**
	 * Set the 1: IMISI_T is supported, 0: IMSI_T is not supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param imsITSupported the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withImsITSupported(Integer imsITSupported) {
		this.imsITSupported = imsITSupported;
		return this;
	}

	/**
	 * Get the slope in the inequality criterion for adding a pilot to the Active Set, or dropping a pilot from the Active Set. The base station shall set this field as an unsigned binary number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSoftSlope() {
		return softSlope;
	}

	/**
	 * Set the slope in the inequality criterion for adding a pilot to the Active Set, or dropping a pilot from the Active Set. The base station shall set this field as an unsigned binary number.
	 *
	 * @since 2.0
	 * @param softSlope the input value
	 */
	public void  setSoftSlope(Long softSlope) {
		this.softSlope = softSlope;
	}

	/**
	 * Set the slope in the inequality criterion for adding a pilot to the Active Set, or dropping a pilot from the Active Set. The base station shall set this field as an unsigned binary number.
	 *
	 * @since 2.0
	 * @param softSlope the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withSoftSlope(Long softSlope) {
		this.softSlope = softSlope;
		return this;
	}

	/**
	 * Get the intercept in the inequality criterion for adding a pilot to the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAddIntercept() {
		return addIntercept;
	}

	/**
	 * Set the intercept in the inequality criterion for adding a pilot to the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @param addIntercept the input value
	 */
	public void  setAddIntercept(Long addIntercept) {
		this.addIntercept = addIntercept;
	}

	/**
	 * Set the intercept in the inequality criterion for adding a pilot to the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @param addIntercept the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAddIntercept(Long addIntercept) {
		this.addIntercept = addIntercept;
		return this;
	}

	/**
	 * Get the intercept in the inequality criterion for dropping a pilot from the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDropIntercept() {
		return dropIntercept;
	}

	/**
	 * Set the intercept in the inequality criterion for dropping a pilot from the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @param dropIntercept the input value
	 */
	public void  setDropIntercept(Long dropIntercept) {
		this.dropIntercept = dropIntercept;
	}

	/**
	 * Set the intercept in the inequality criterion for dropping a pilot from the Active Set. The base station shall set this field as a two's complement signed binary number, in units of dB.
	 *
	 * @since 2.0
	 * @param dropIntercept the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withDropIntercept(Long dropIntercept) {
		this.dropIntercept = dropIntercept;
		return this;
	}

	/**
	 * Get the maximum number of alternative service options. The base station shall set this field to the maximum number of alternative service option numbers that the mobile station is allowed to include in the Origination Message or the Page Response Message.

For mobile stations with MOB_P_REVs less than seven, the alternative service options are those service options defined in TSB-58B and related to SERVICE_OPTION in Origination Message and the Page Response Message.

For mobile stations with MOB_P_REVs equal to or greater than seven, the alternative service options are those service options defined in TSB-58B without service group number assigned and related to SERVICE_OPTION in Origination Message and the Page Response Message.

The base station sets this field to a value greater than zero, in addition, the base station shall allow the mobile station with MOB_P_REVs equal to or greater than 7 to include

- a 4 or 8-bit service option bitmap in the Origination Message and the Page Response Message;

- alternative service option numbers, not limited to MAX_ALT_SO_NUM, in the Enhanced Origination Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNumAltSo() {
		return maxNumAltSo;
	}

	/**
	 * Set the maximum number of alternative service options. The base station shall set this field to the maximum number of alternative service option numbers that the mobile station is allowed to include in the Origination Message or the Page Response Message.

For mobile stations with MOB_P_REVs less than seven, the alternative service options are those service options defined in TSB-58B and related to SERVICE_OPTION in Origination Message and the Page Response Message.

For mobile stations with MOB_P_REVs equal to or greater than seven, the alternative service options are those service options defined in TSB-58B without service group number assigned and related to SERVICE_OPTION in Origination Message and the Page Response Message.

The base station sets this field to a value greater than zero, in addition, the base station shall allow the mobile station with MOB_P_REVs equal to or greater than 7 to include

- a 4 or 8-bit service option bitmap in the Origination Message and the Page Response Message;

- alternative service option numbers, not limited to MAX_ALT_SO_NUM, in the Enhanced Origination Message.
	 *
	 * @since 2.0
	 * @param maxNumAltSo the input value
	 */
	public void  setMaxNumAltSo(Long maxNumAltSo) {
		this.maxNumAltSo = maxNumAltSo;
	}

	/**
	 * Set the maximum number of alternative service options. The base station shall set this field to the maximum number of alternative service option numbers that the mobile station is allowed to include in the Origination Message or the Page Response Message.

For mobile stations with MOB_P_REVs less than seven, the alternative service options are those service options defined in TSB-58B and related to SERVICE_OPTION in Origination Message and the Page Response Message.

For mobile stations with MOB_P_REVs equal to or greater than seven, the alternative service options are those service options defined in TSB-58B without service group number assigned and related to SERVICE_OPTION in Origination Message and the Page Response Message.

The base station sets this field to a value greater than zero, in addition, the base station shall allow the mobile station with MOB_P_REVs equal to or greater than 7 to include

- a 4 or 8-bit service option bitmap in the Origination Message and the Page Response Message;

- alternative service option numbers, not limited to MAX_ALT_SO_NUM, in the Enhanced Origination Message.
	 *
	 * @since 2.0
	 * @param maxNumAltSo the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withMaxNumAltSo(Long maxNumAltSo) {
		this.maxNumAltSo = maxNumAltSo;
		return this;
	}

	/**
	 * Get the system reselection parameters included.

If the base station is including system reselection parameters, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReselectedIncluded() {
		return reselectedIncluded;
	}

	/**
	 * Set the system reselection parameters included.

If the base station is including system reselection parameters, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param reselectedIncluded the input value
	 */
	public void  setReselectedIncluded(Long reselectedIncluded) {
		this.reselectedIncluded = reselectedIncluded;
	}

	/**
	 * Set the system reselection parameters included.

If the base station is including system reselection parameters, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param reselectedIncluded the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withReselectedIncluded(Long reselectedIncluded) {
		this.reselectedIncluded = reselectedIncluded;
		return this;
	}

	/**
	 * Get the pilot power threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_THRESH and set this field to:

[  (pilot_power_threshold + 115 ) ]

where pilot_power_threshold is the pilot power, Ec, in dBm/1.23 MHz, below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEcthresh() {
		return ecthresh;
	}

	/**
	 * Set the pilot power threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_THRESH and set this field to:

[  (pilot_power_threshold + 115 ) ]

where pilot_power_threshold is the pilot power, Ec, in dBm/1.23 MHz, below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @param ecthresh the input value
	 */
	public void  setEcthresh(Long ecthresh) {
		this.ecthresh = ecthresh;
	}

	/**
	 * Set the pilot power threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_THRESH and set this field to:

[  (pilot_power_threshold + 115 ) ]

where pilot_power_threshold is the pilot power, Ec, in dBm/1.23 MHz, below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @param ecthresh the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withEcthresh(Long ecthresh) {
		this.ecthresh = ecthresh;
		return this;
	}

	/**
	 * Get the pilot Ec / Io threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_I0_THRESH and set this field to:

[ - 20 x log10 (pilot_threshold) ]

where pilot_threshold is the pilot Ec/Io below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEcioThresh() {
		return ecioThresh;
	}

	/**
	 * Set the pilot Ec / Io threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_I0_THRESH and set this field to:

[ - 20 x log10 (pilot_threshold) ]

where pilot_threshold is the pilot Ec/Io below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @param ecioThresh the input value
	 */
	public void  setEcioThresh(Long ecioThresh) {
		this.ecioThresh = ecioThresh;
	}

	/**
	 * Set the pilot Ec / Io threshold.

If RESELECTINCLUDED is set to '1', the base station shall include the field EC_I0_THRESH and set this field to:

[ - 20 x log10 (pilot_threshold) ]

where pilot_threshold is the pilot Ec/Io below which the mobile station is to perform system reselection; otherwise, the base station shall omit this field.
	 *
	 * @since 2.0
	 * @param ecioThresh the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withEcioThresh(Long ecioThresh) {
		this.ecioThresh = ecioThresh;
		return this;
	}

	/**
	 * Get the pilot reporting indicator.

The base station shall set this field to '1' if the mobile station is to report the additional pilots which have pilot strength exceeding T_ADD in all Access Channel messages. The base station shall set this field to '0' if the mobile station is to report the additional pilots which have pilot strengths exceeding T_ADD only in the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotReport() {
		return pilotReport;
	}

	/**
	 * Set the pilot reporting indicator.

The base station shall set this field to '1' if the mobile station is to report the additional pilots which have pilot strength exceeding T_ADD in all Access Channel messages. The base station shall set this field to '0' if the mobile station is to report the additional pilots which have pilot strengths exceeding T_ADD only in the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @param pilotReport the input value
	 */
	public void  setPilotReport(Long pilotReport) {
		this.pilotReport = pilotReport;
	}

	/**
	 * Set the pilot reporting indicator.

The base station shall set this field to '1' if the mobile station is to report the additional pilots which have pilot strength exceeding T_ADD in all Access Channel messages. The base station shall set this field to '0' if the mobile station is to report the additional pilots which have pilot strengths exceeding T_ADD only in the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @param pilotReport the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withPilotReport(Long pilotReport) {
		this.pilotReport = pilotReport;
		return this;
	}

	/**
	 * Get the neighbor Set access entry handoff information included indicator.

If the base station is including information on the Neighbor Set access entry handoff, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNghbrSetEntryInfo() {
		return nghbrSetEntryInfo;
	}

	/**
	 * Set the neighbor Set access entry handoff information included indicator.

If the base station is including information on the Neighbor Set access entry handoff, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param nghbrSetEntryInfo the input value
	 */
	public void  setNghbrSetEntryInfo(Long nghbrSetEntryInfo) {
		this.nghbrSetEntryInfo = nghbrSetEntryInfo;
	}

	/**
	 * Set the neighbor Set access entry handoff information included indicator.

If the base station is including information on the Neighbor Set access entry handoff, the base station shall set this field to '1'; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param nghbrSetEntryInfo the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withNghbrSetEntryInfo(Long nghbrSetEntryInfo) {
		this.nghbrSetEntryInfo = nghbrSetEntryInfo;
		return this;
	}

	/**
	 * Get access entry handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access entry handoff after receiving a message while performing the Mobile Station Order and Message Processing Operation in the Mobile Station Idle State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessHOOrder() {
		return accessHOOrder;
	}

	/**
	 * Set access entry handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access entry handoff after receiving a message while performing the Mobile Station Order and Message Processing Operation in the Mobile Station Idle State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHOOrder the input value
	 */
	public void  setAccessHOOrder(Long accessHOOrder) {
		this.accessHOOrder = accessHOOrder;
	}

	/**
	 * Set access entry handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access entry handoff after receiving a message while performing the Mobile Station Order and Message Processing Operation in the Mobile Station Idle State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHOOrder the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccessHOOrder(Long accessHOOrder) {
		this.accessHOOrder = accessHOOrder;
		return this;
	}

	/**
	 * Get the neighbor Set access handoff included indicator.

If the base station is including information on the Neighbor Set access handoff or access probe handoff, the base station shall set this field to '1', otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNghbrSetAccessInfo() {
		return nghbrSetAccessInfo;
	}

	/**
	 * Set the neighbor Set access handoff included indicator.

If the base station is including information on the Neighbor Set access handoff or access probe handoff, the base station shall set this field to '1', otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param nghbrSetAccessInfo the input value
	 */
	public void  setNghbrSetAccessInfo(Long nghbrSetAccessInfo) {
		this.nghbrSetAccessInfo = nghbrSetAccessInfo;
	}

	/**
	 * Set the neighbor Set access handoff included indicator.

If the base station is including information on the Neighbor Set access handoff or access probe handoff, the base station shall set this field to '1', otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param nghbrSetAccessInfo the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withNghbrSetAccessInfo(Long nghbrSetAccessInfo) {
		this.nghbrSetAccessInfo = nghbrSetAccessInfo;
		return this;
	}

	/**
	 * Get access handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessHO() {
		return accessHO;
	}

	/**
	 * Set access handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHO the input value
	 */
	public void  setAccessHO(Long accessHO) {
		this.accessHO = accessHO;
	}

	/**
	 * Set access handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHO the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccessHO(Long accessHO) {
		this.accessHO = accessHO;
		return this;
	}

	/**
	 * Get access handoff permitted for message response indicator.

If AccessHO is set to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to '1' if the mobile station is permitted to perform an access handoff after receiving a message and before responding to that message in the System Access State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessHOMsgRsp() {
		return accessHOMsgRsp;
	}

	/**
	 * Set access handoff permitted for message response indicator.

If AccessHO is set to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to '1' if the mobile station is permitted to perform an access handoff after receiving a message and before responding to that message in the System Access State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHOMsgRsp the input value
	 */
	public void  setAccessHOMsgRsp(Long accessHOMsgRsp) {
		this.accessHOMsgRsp = accessHOMsgRsp;
	}

	/**
	 * Set access handoff permitted for message response indicator.

If AccessHO is set to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to '1' if the mobile station is permitted to perform an access handoff after receiving a message and before responding to that message in the System Access State; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessHOMsgRsp the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccessHOMsgRsp(Long accessHOMsgRsp) {
		this.accessHOMsgRsp = accessHOMsgRsp;
		return this;
	}

	/**
	 * Get access probe handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the base station is permitted to perform an access probe handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessProbeHO() {
		return accessProbeHO;
	}

	/**
	 * Set access probe handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the base station is permitted to perform an access probe handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessProbeHO the input value
	 */
	public void  setAccessProbeHO(Long accessProbeHO) {
		this.accessProbeHO = accessProbeHO;
	}

	/**
	 * Set access probe handoff permitted indicator.

If NghbrSetEntryInfo is set to '1', the base station shall set this field to '1' if the base station is permitted to perform an access probe handoff; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accessProbeHO the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccessProbeHO(Long accessProbeHO) {
		this.accessProbeHO = accessProbeHO;
		return this;
	}

	/**
	 * Get access handoff list update permitted indicator.

If AccessProbeHO is included and is set to '1', the base station shall set this field to '1' if the mobile station is permitted to update the access handoff list during an access attempt; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccHOListUpd() {
		return accHOListUpd;
	}

	/**
	 * Set access handoff list update permitted indicator.

If AccessProbeHO is included and is set to '1', the base station shall set this field to '1' if the mobile station is permitted to update the access handoff list during an access attempt; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accHOListUpd the input value
	 */
	public void  setAccHOListUpd(Long accHOListUpd) {
		this.accHOListUpd = accHOListUpd;
	}

	/**
	 * Set access handoff list update permitted indicator.

If AccessProbeHO is included and is set to '1', the base station shall set this field to '1' if the mobile station is permitted to update the access handoff list during an access attempt; otherwise, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param accHOListUpd the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccHOListUpd(Long accHOListUpd) {
		this.accHOListUpd = accHOListUpd;
		return this;
	}

	/**
	 * Get access probe handoff permitted for messages other than the Origination Message and the Page Response Message.

If AccessProbeHO is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access probe handoff for messages other than the Origination Message and the Page Response. The base station shall set this field to '0' if the mobile station is permitted to perform an access probe handoff only for the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccProbeHOOtherMsg() {
		return accProbeHOOtherMsg;
	}

	/**
	 * Set access probe handoff permitted for messages other than the Origination Message and the Page Response Message.

If AccessProbeHO is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access probe handoff for messages other than the Origination Message and the Page Response. The base station shall set this field to '0' if the mobile station is permitted to perform an access probe handoff only for the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @param accProbeHOOtherMsg the input value
	 */
	public void  setAccProbeHOOtherMsg(Long accProbeHOOtherMsg) {
		this.accProbeHOOtherMsg = accProbeHOOtherMsg;
	}

	/**
	 * Set access probe handoff permitted for messages other than the Origination Message and the Page Response Message.

If AccessProbeHO is set to '1', the base station shall set this field to '1' if the mobile station is permitted to perform an access probe handoff for messages other than the Origination Message and the Page Response. The base station shall set this field to '0' if the mobile station is permitted to perform an access probe handoff only for the Origination Message and the Page Response Message.
	 *
	 * @since 2.0
	 * @param accProbeHOOtherMsg the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withAccProbeHOOtherMsg(Long accProbeHOOtherMsg) {
		this.accProbeHOOtherMsg = accProbeHOOtherMsg;
		return this;
	}

	/**
	 * Get the maximum number of times that mobile station is permitted to perform an access probe handoff.

If AccessProbeHO is set to '1', the base station shall set this field to the maximum number of times the mobile station is allowed to perform an access probe handoff within an access attempt minus one.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxNumProbeHO() {
		return maxNumProbeHO;
	}

	/**
	 * Set the maximum number of times that mobile station is permitted to perform an access probe handoff.

If AccessProbeHO is set to '1', the base station shall set this field to the maximum number of times the mobile station is allowed to perform an access probe handoff within an access attempt minus one.
	 *
	 * @since 2.0
	 * @param maxNumProbeHO the input value
	 */
	public void  setMaxNumProbeHO(Long maxNumProbeHO) {
		this.maxNumProbeHO = maxNumProbeHO;
	}

	/**
	 * Set the maximum number of times that mobile station is permitted to perform an access probe handoff.

If AccessProbeHO is set to '1', the base station shall set this field to the maximum number of times the mobile station is allowed to perform an access probe handoff within an access attempt minus one.
	 *
	 * @since 2.0
	 * @param maxNumProbeHO the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withMaxNumProbeHO(Long maxNumProbeHO) {
		this.maxNumProbeHO = maxNumProbeHO;
		return this;
	}

	/**
	 * Get the if {{param}} is set to 1, then Braodcast GPS assist is supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBrdcastGPSAssit() {
		return brdcastGPSAssit;
	}

	/**
	 * Set the if {{param}} is set to 1, then Braodcast GPS assist is supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param brdcastGPSAssit the input value
	 */
	public void  setBrdcastGPSAssit(Long brdcastGPSAssit) {
		this.brdcastGPSAssit = brdcastGPSAssit;
	}

	/**
	 * Set the if {{param}} is set to 1, then Braodcast GPS assist is supported. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param brdcastGPSAssit the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withBrdcastGPSAssit(Long brdcastGPSAssit) {
		this.brdcastGPSAssit = brdcastGPSAssit;
		return this;
	}

	/**
	 * Get the quick Paging Channel Supported Indication.

If the base station supports Quick Paging Channel operation, the base station shall set this field to '1'; otherwise the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQpcHSupported() {
		return qpcHSupported;
	}

	/**
	 * Set the quick Paging Channel Supported Indication.

If the base station supports Quick Paging Channel operation, the base station shall set this field to '1'; otherwise the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param qpcHSupported the input value
	 */
	public void  setQpcHSupported(Long qpcHSupported) {
		this.qpcHSupported = qpcHSupported;
	}

	/**
	 * Set the quick Paging Channel Supported Indication.

If the base station supports Quick Paging Channel operation, the base station shall set this field to '1'; otherwise the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param qpcHSupported the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withQpcHSupported(Long qpcHSupported) {
		this.qpcHSupported = qpcHSupported;
		return this;
	}

	/**
	 * Get the number of Quick Paging Channels.

If the base station sets QPCHSUPPORTED to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to the number of Quick Paging Channels on this CDMA Channel. The base station shall not set this field to '00'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQPCH() {
		return numQPCH;
	}

	/**
	 * Set the number of Quick Paging Channels.

If the base station sets QPCHSUPPORTED to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to the number of Quick Paging Channels on this CDMA Channel. The base station shall not set this field to '00'.
	 *
	 * @since 2.0
	 * @param numQPCH the input value
	 */
	public void  setNumQPCH(Long numQPCH) {
		this.numQPCH = numQPCH;
	}

	/**
	 * Set the number of Quick Paging Channels.

If the base station sets QPCHSUPPORTED to '1', the base station shall include this field and set it as described below; otherwise, the base station shall omit this field.

The base station shall set this field to the number of Quick Paging Channels on this CDMA Channel. The base station shall not set this field to '00'.
	 *
	 * @since 2.0
	 * @param numQPCH the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withNumQPCH(Long numQPCH) {
		this.numQPCH = numQPCH;
		return this;
	}

	/**
	 * Get the quick Paging Channel indicator rate.

See {{bibref|3GPP2-C.S0005}}. {{param}} is set as follows:  0:  4800bps; 1:  9600bps.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQpcHRate() {
		return qpcHRate;
	}

	/**
	 * Set the quick Paging Channel indicator rate.

See {{bibref|3GPP2-C.S0005}}. {{param}} is set as follows:  0:  4800bps; 1:  9600bps.
	 *
	 * @since 2.0
	 * @param qpcHRate the input value
	 */
	public void  setQpcHRate(Long qpcHRate) {
		this.qpcHRate = qpcHRate;
	}

	/**
	 * Set the quick Paging Channel indicator rate.

See {{bibref|3GPP2-C.S0005}}. {{param}} is set as follows:  0:  4800bps; 1:  9600bps.
	 *
	 * @since 2.0
	 * @param qpcHRate the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withQpcHRate(Long qpcHRate) {
		this.qpcHRate = qpcHRate;
		return this;
	}

	/**
	 * Get the quick Paging Channel paging indicator transmit power level.

{{param}} is set as follows:  0:  5 dB below; 1: 4 dB below; 2: 3 dB below; 3: 2 dB below; 4: 1 dB below; 5:  Same; 6: 1 dB above; 7: 2dB above.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQpcHPwrLevelPage() {
		return qpcHPwrLevelPage;
	}

	/**
	 * Set the quick Paging Channel paging indicator transmit power level.

{{param}} is set as follows:  0:  5 dB below; 1: 4 dB below; 2: 3 dB below; 3: 2 dB below; 4: 1 dB below; 5:  Same; 6: 1 dB above; 7: 2dB above.
	 *
	 * @since 2.0
	 * @param qpcHPwrLevelPage the input value
	 */
	public void  setQpcHPwrLevelPage(Long qpcHPwrLevelPage) {
		this.qpcHPwrLevelPage = qpcHPwrLevelPage;
	}

	/**
	 * Set the quick Paging Channel paging indicator transmit power level.

{{param}} is set as follows:  0:  5 dB below; 1: 4 dB below; 2: 3 dB below; 3: 2 dB below; 4: 1 dB below; 5:  Same; 6: 1 dB above; 7: 2dB above.
	 *
	 * @since 2.0
	 * @param qpcHPwrLevelPage the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withQpcHPwrLevelPage(Long qpcHPwrLevelPage) {
		this.qpcHPwrLevelPage = qpcHPwrLevelPage;
		return this;
	}

	/**
	 * Get the quick Paging Channel configuration change indicator supported.

{{param}} is set as follows:  if the base station is to support configuration change indicators on the Quick Paging Channel, {{param}} to '1'; otherwise {{param}} is set to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQpcHcciSupported() {
		return qpcHcciSupported;
	}

	/**
	 * Set the quick Paging Channel configuration change indicator supported.

{{param}} is set as follows:  if the base station is to support configuration change indicators on the Quick Paging Channel, {{param}} to '1'; otherwise {{param}} is set to '0'.
	 *
	 * @since 2.0
	 * @param qpcHcciSupported the input value
	 */
	public void  setQpcHcciSupported(Long qpcHcciSupported) {
		this.qpcHcciSupported = qpcHcciSupported;
	}

	/**
	 * Set the quick Paging Channel configuration change indicator supported.

{{param}} is set as follows:  if the base station is to support configuration change indicators on the Quick Paging Channel, {{param}} to '1'; otherwise {{param}} is set to '0'.
	 *
	 * @since 2.0
	 * @param qpcHcciSupported the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withQpcHcciSupported(Long qpcHcciSupported) {
		this.qpcHcciSupported = qpcHcciSupported;
		return this;
	}

	/**
	 * Get the quick Paging Channel configuration change indicator CONFIG transmit power level.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQpcHPwrLevelConfig() {
		return qpcHPwrLevelConfig;
	}

	/**
	 * Set the quick Paging Channel configuration change indicator CONFIG transmit power level.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param qpcHPwrLevelConfig the input value
	 */
	public void  setQpcHPwrLevelConfig(Long qpcHPwrLevelConfig) {
		this.qpcHPwrLevelConfig = qpcHPwrLevelConfig;
	}

	/**
	 * Set the quick Paging Channel configuration change indicator CONFIG transmit power level.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param qpcHPwrLevelConfig the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withQpcHPwrLevelConfig(Long qpcHPwrLevelConfig) {
		this.qpcHPwrLevelConfig = qpcHPwrLevelConfig;
		return this;
	}

	/**
	 * Get the short Data Burst supported indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSdbSupported() {
		return sdbSupported;
	}

	/**
	 * Set the short Data Burst supported indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param sdbSupported the input value
	 */
	public void  setSdbSupported(Long sdbSupported) {
		this.sdbSupported = sdbSupported;
	}

	/**
	 * Set the short Data Burst supported indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param sdbSupported the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withSdbSupported(Long sdbSupported) {
		this.sdbSupported = sdbSupported;
		return this;
	}

	/**
	 * Get the gain adjustment of the Reverse Traffic Channel relative to the Reverse Pilot Channel for Radio Configurations greater than 2.

{{param}} is set to the correction factor to be used by mobile stations in setting the power of a reverse traffic channel, expressed as a two's complement value in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRlgainTrafficPilot() {
		return rlgainTrafficPilot;
	}

	/**
	 * Set the gain adjustment of the Reverse Traffic Channel relative to the Reverse Pilot Channel for Radio Configurations greater than 2.

{{param}} is set to the correction factor to be used by mobile stations in setting the power of a reverse traffic channel, expressed as a two's complement value in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param rlgainTrafficPilot the input value
	 */
	public void  setRlgainTrafficPilot(Long rlgainTrafficPilot) {
		this.rlgainTrafficPilot = rlgainTrafficPilot;
	}

	/**
	 * Set the gain adjustment of the Reverse Traffic Channel relative to the Reverse Pilot Channel for Radio Configurations greater than 2.

{{param}} is set to the correction factor to be used by mobile stations in setting the power of a reverse traffic channel, expressed as a two's complement value in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param rlgainTrafficPilot the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withRlgainTrafficPilot(Long rlgainTrafficPilot) {
		this.rlgainTrafficPilot = rlgainTrafficPilot;
		return this;
	}

	/**
	 * Get the reverse Power Control Delay included indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRvsPwrCtrlDelayIncl() {
		return rvsPwrCtrlDelayIncl;
	}

	/**
	 * Set the reverse Power Control Delay included indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rvsPwrCtrlDelayIncl the input value
	 */
	public void  setRvsPwrCtrlDelayIncl(Long rvsPwrCtrlDelayIncl) {
		this.rvsPwrCtrlDelayIncl = rvsPwrCtrlDelayIncl;
	}

	/**
	 * Set the reverse Power Control Delay included indicator.

See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rvsPwrCtrlDelayIncl the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withRvsPwrCtrlDelayIncl(Long rvsPwrCtrlDelayIncl) {
		this.rvsPwrCtrlDelayIncl = rvsPwrCtrlDelayIncl;
		return this;
	}

	/**
	 * Get the reverse power control delay.

{{param}} is setto the closed-loop reverse power control delay minus one (the closed-loop reverse power control delay is the time between the end of a gated-on reverse PCG and the beginning of the Forward Power Control Subchannel in units of 1.25 ms.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRvsPwrCtrlDelay() {
		return rvsPwrCtrlDelay;
	}

	/**
	 * Set the reverse power control delay.

{{param}} is setto the closed-loop reverse power control delay minus one (the closed-loop reverse power control delay is the time between the end of a gated-on reverse PCG and the beginning of the Forward Power Control Subchannel in units of 1.25 ms.
	 *
	 * @since 2.0
	 * @param rvsPwrCtrlDelay the input value
	 */
	public void  setRvsPwrCtrlDelay(Long rvsPwrCtrlDelay) {
		this.rvsPwrCtrlDelay = rvsPwrCtrlDelay;
	}

	/**
	 * Set the reverse power control delay.

{{param}} is setto the closed-loop reverse power control delay minus one (the closed-loop reverse power control delay is the time between the end of a gated-on reverse PCG and the beginning of the Forward Power Control Subchannel in units of 1.25 ms.
	 *
	 * @since 2.0
	 * @param rvsPwrCtrlDelay the input value
	 * @return this instance
	 */
	public ExtendedSystemParameters withRvsPwrCtrlDelay(Long rvsPwrCtrlDelay) {
		this.rvsPwrCtrlDelay = rvsPwrCtrlDelay;
		return this;
	}

	//</editor-fold>

}