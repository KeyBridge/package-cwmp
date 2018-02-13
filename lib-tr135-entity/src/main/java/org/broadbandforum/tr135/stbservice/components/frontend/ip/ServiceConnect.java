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
package org.broadbandforum.tr135.stbservice.components.frontend.ip;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters used to force connection to a dedicated IP stream for test purposes.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.ServiceConnect.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.ServiceConnect")
@XmlType(name = "STBService.Components.FrontEnd.IP.ServiceConnect")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceConnect {

	/**
	 * RFC 3986 URI that  describes the service to connect to in the form:

* <trsp>://<addr>:<port>?StrCtrl=<strctrl>?StrTrspCtrl=<trspctrl>?MuxType=<muxtype>

where:

* '''<addr>''' is the IP address of the service source (for Unicast) or IGMP  group (for Multicast).

* '''<port>''' is the associated TCP/UDP port.  If not specified, the STB is assumed to know and use an appropriate default port.

* '''<trsp>''' is the streaming transport protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportProtocols}}, which SHOULD be converted to lower-case. 

* '''<strctrl>''' is the streaming control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingControlProtocols}}.  If not specified, no streaming control protocol is to be used.

* '''<trspctrl>''' is the streaming transport control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportControlProtocols}}.  If not specified, no streaming transport control protocol is to be used.

* '''<muxtype>''' is the multiplex type and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.MultiplexTypes}}.  This tells the STB which multiplex type to expect.  If not specified, the STB is assumed to know, or to be able to determine, the multiplex type.

Note that download protocols are not supported by the above syntax.  However, the specified syntax is just a baseline, and STBs MAY support an extended syntax.

Example of Multicast MPEG2-TS over RTP with no transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?MuxType=MPEG2-TS

Example of Multicast MPEG2-TS over RTP with AL-FEC transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?StrTrspCtrl=AL-FEC?MuxType=MPEG2-TS

Example of Unicast MPEG2-TS over UDP with RTSP transport control:

* udp://174.146.35.12:3257?StrCtrl=RTSP?MuxType=MPEG2-TS

Example of Unicast raw AV over RTP with RTCP control and RTSP transport control:

* rtp://174.146.35.12:3257?StrCtrl=RTSP?StrTrspCtrl=RTCP?MuxType=None

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''IP'' or ''IPTV'' (or ''VoD'' if the URI accesses a VoD service) is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String uri;

	public ServiceConnect() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the rfc 3986 URI that  describes the service to connect to in the form:

* <trsp>://<addr>:<port>?StrCtrl=<strctrl>?StrTrspCtrl=<trspctrl>?MuxType=<muxtype>

where:

* '''<addr>''' is the IP address of the service source (for Unicast) or IGMP  group (for Multicast).

* '''<port>''' is the associated TCP/UDP port.  If not specified, the STB is assumed to know and use an appropriate default port.

* '''<trsp>''' is the streaming transport protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportProtocols}}, which SHOULD be converted to lower-case. 

* '''<strctrl>''' is the streaming control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingControlProtocols}}.  If not specified, no streaming control protocol is to be used.

* '''<trspctrl>''' is the streaming transport control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportControlProtocols}}.  If not specified, no streaming transport control protocol is to be used.

* '''<muxtype>''' is the multiplex type and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.MultiplexTypes}}.  This tells the STB which multiplex type to expect.  If not specified, the STB is assumed to know, or to be able to determine, the multiplex type.

Note that download protocols are not supported by the above syntax.  However, the specified syntax is just a baseline, and STBs MAY support an extended syntax.

Example of Multicast MPEG2-TS over RTP with no transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?MuxType=MPEG2-TS

Example of Multicast MPEG2-TS over RTP with AL-FEC transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?StrTrspCtrl=AL-FEC?MuxType=MPEG2-TS

Example of Unicast MPEG2-TS over UDP with RTSP transport control:

* udp://174.146.35.12:3257?StrCtrl=RTSP?MuxType=MPEG2-TS

Example of Unicast raw AV over RTP with RTCP control and RTSP transport control:

* rtp://174.146.35.12:3257?StrCtrl=RTSP?StrTrspCtrl=RTCP?MuxType=None

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''IP'' or ''IPTV'' (or ''VoD'' if the URI accesses a VoD service) is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the rfc 3986 URI that  describes the service to connect to in the form:

* <trsp>://<addr>:<port>?StrCtrl=<strctrl>?StrTrspCtrl=<trspctrl>?MuxType=<muxtype>

where:

* '''<addr>''' is the IP address of the service source (for Unicast) or IGMP  group (for Multicast).

* '''<port>''' is the associated TCP/UDP port.  If not specified, the STB is assumed to know and use an appropriate default port.

* '''<trsp>''' is the streaming transport protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportProtocols}}, which SHOULD be converted to lower-case. 

* '''<strctrl>''' is the streaming control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingControlProtocols}}.  If not specified, no streaming control protocol is to be used.

* '''<trspctrl>''' is the streaming transport control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportControlProtocols}}.  If not specified, no streaming transport control protocol is to be used.

* '''<muxtype>''' is the multiplex type and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.MultiplexTypes}}.  This tells the STB which multiplex type to expect.  If not specified, the STB is assumed to know, or to be able to determine, the multiplex type.

Note that download protocols are not supported by the above syntax.  However, the specified syntax is just a baseline, and STBs MAY support an extended syntax.

Example of Multicast MPEG2-TS over RTP with no transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?MuxType=MPEG2-TS

Example of Multicast MPEG2-TS over RTP with AL-FEC transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?StrTrspCtrl=AL-FEC?MuxType=MPEG2-TS

Example of Unicast MPEG2-TS over UDP with RTSP transport control:

* udp://174.146.35.12:3257?StrCtrl=RTSP?MuxType=MPEG2-TS

Example of Unicast raw AV over RTP with RTCP control and RTSP transport control:

* rtp://174.146.35.12:3257?StrCtrl=RTSP?StrTrspCtrl=RTCP?MuxType=None

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''IP'' or ''IPTV'' (or ''VoD'' if the URI accesses a VoD service) is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param uri the input value
	 */
	public void  setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Set the rfc 3986 URI that  describes the service to connect to in the form:

* <trsp>://<addr>:<port>?StrCtrl=<strctrl>?StrTrspCtrl=<trspctrl>?MuxType=<muxtype>

where:

* '''<addr>''' is the IP address of the service source (for Unicast) or IGMP  group (for Multicast).

* '''<port>''' is the associated TCP/UDP port.  If not specified, the STB is assumed to know and use an appropriate default port.

* '''<trsp>''' is the streaming transport protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportProtocols}}, which SHOULD be converted to lower-case. 

* '''<strctrl>''' is the streaming control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingControlProtocols}}.  If not specified, no streaming control protocol is to be used.

* '''<trspctrl>''' is the streaming transport control protocol and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.StreamingTransportControlProtocols}}.  If not specified, no streaming transport control protocol is to be used.

* '''<muxtype>''' is the multiplex type and MUST be one of the values in {{param|.Capabilities.FrontEnd.IP.MultiplexTypes}}.  This tells the STB which multiplex type to expect.  If not specified, the STB is assumed to know, or to be able to determine, the multiplex type.

Note that download protocols are not supported by the above syntax.  However, the specified syntax is just a baseline, and STBs MAY support an extended syntax.

Example of Multicast MPEG2-TS over RTP with no transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?MuxType=MPEG2-TS

Example of Multicast MPEG2-TS over RTP with AL-FEC transport control:

* rtp://224.112.15.18:3257?StrCtrl=IGMP?StrTrspCtrl=AL-FEC?MuxType=MPEG2-TS

Example of Unicast MPEG2-TS over UDP with RTSP transport control:

* udp://174.146.35.12:3257?StrCtrl=RTSP?MuxType=MPEG2-TS

Example of Unicast raw AV over RTP with RTCP control and RTSP transport control:

* rtp://174.146.35.12:3257?StrCtrl=RTSP?StrTrspCtrl=RTCP?MuxType=None

If a {{object|.ServiceMonitoring.MainStream}} instance with ''ServiceType'' = ''IP'' or ''IPTV'' (or ''VoD'' if the URI accesses a VoD service) is currently enabled, the STB MUST ensure that performance data for this service is collected in that instance.

The value is not saved in device state.  The value when read is not specified and need not be the value that was most recently written.
	 *
	 * @since 1.0
	 * @param uri the input value
	 * @return this instance
	 */
	public ServiceConnect withUri(String uri) {
		this.uri = uri;
		return this;
	}

	//</editor-fold>

}