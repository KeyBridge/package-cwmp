# TR-135


STBService:1.4 Service Object definition

Notice:

The Broadband Forum is a non-profit corporation organized to create
guidelines for broadband network system development and deployment.
This Broadband Forum Document has been approved by members of the
Forum. This Broadband Forum Document is not binding on the Broadband
Forum, any of its members, or any developer or service provider.
This Broadband Forum Document is subject to change, but only with
approval of members of the Forum. This Document is copyrighted by
the Broadband Forum, and all rights are reserved. Portions of this
Document may be copyrighted by Broadband Forum members.

THIS SPECIFICATION IS BEING OFFERED WITHOUT ANY WARRANTY WHATSOEVER,
AND IN PARTICULAR, ANY WARRANTY OF NONINFRINGEMENT IS EXPRESSLY
DISCLAIMED. ANY USE OF THIS SPECIFICATION SHALL BE MADE ENTIRELY AT
THE IMPLEMENTER'S OWN RISK, AND NEITHER the Forum, NOR ANY OF ITS
MEMBERS OR SUBMITTERS, SHALL HAVE ANY LIABILITY WHATSOEVER TO ANY
IMPLEMENTER OR THIRD PARTY FOR ANY DAMAGES OF ANY NATURE WHATSOEVER,
DIRECTLY OR INDIRECTLY, ARISING FROM THE USE OF THIS SPECIFICATION.

Broadband Forum Documents may be copied, downloaded, stored on a
server or otherwise re-distributed in their entirety only, and may
not be modified without the advance written permission of the
Broadband Forum.


The text of this notice must be included in all copies of this
Broadband Forum Document.

Summary:

STBService:1.4 Service Object update.
Adds Service Monitoring of Events

Editors:

* Timothy Carey, Alcatel-Lucent

BroadbandHome Working Group Chairs:

* Jason Walls, QA Cafe
* John Blackford, Pace

Issue History (Filename: Approval Date: Publication Date: Changes)
* tr-135-1-0-0.xml: September 2009: September 2009:

  - Corresponds to TR-135 Issue 1, Section 6
  - (Parameter Definitions) and Section 7 (Profile Definitions)
* tr-135-1-1-0.xml: November 2010: November 2010:

  - Corresponds to TR-135 Issue 1, Amendment 1
* tr-135-1-2-0.xml, July 2011: July 2012:

  - Corresponds to TR-135 Issue 1, Amendment 2
* tr-135-1-3-0.xml: November 2012: November 2012:

  - Corresponds to TR-135 Issue 1, Amendment 3
* tr-135-1-4-0.xml: 24 August 2015: 2 October 2015:

  - Corresponds to TR-135 Issue 1, Amendment 4



## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [AC-3]() | E-AC-3 | Digital Audio Compression (AC-3) Standard, Rev. B, document number A/52B | ATSC |  | June 2005
 | [D-Book]() | DGTVi D-Book v1.0 | Compatible receivers for the Italian market |  |  | Sep 2004
 | [HDMI]() | HDMI |  High-Definition Multimedia Interface 1.4a |  |  | March 2010
 | [ISO/IEC11172-1]() | ISO/IEC 11172-1 (1993) | Information Technology - Coding of moving pictures and associated audio for digital storage media at up to about 1.5 Mbit/s - Part 1: System | ISO/IEC |  | 1993
 | [ISO/IEC11172-3]() | ISO/IEC 11172-3 (1993) | Information Technology - Coding of moving pictures and associated audio for digital storage media at up to about 1.5 Mbit/s - Part 3: Audio | ISO/IEC |  | 1993
 | [ISO/IEC13818-1]() | ISO/IEC 13818-1 (2nd edition, 2000) | Information technology - Generic coding of moving picture and associated audio information: Systems | ISO/IEC |  | 2000
 | [ISO/IEC13818-3]() | ISO/IEC 13818-3 (2nd edition, 1998) | Information technology - Generic coding of moving picture and associated audio information: Audio | ISO/IEC |  | 1998
 | [ISO/IEC13818-6]() | ISO/IEC 13818-6 (2nd edition, 1998) | Information technology - Generic coding of moving picture and associated audio information: Extensions for DSM-CC | ISO/IEC |  | 1998
 | [ISO/IEC14496-3]() | ISO/IEC 14496-3:2001 | Information technology - Coding of Audio-Visual objects - Part 3: Audio | ISO/IEC |  | 2001
 | [ISO/IEC14496-10]() | ITU-T Rec. H.264 | ISO/IEC 14496-10:2004/AM 1, Part 10 | Advanced Video Coding AMENDMENT 1: AVC fidelity range extensions | ISO/IEC |  | 2004
 | [ISO/IEC23003-1]() | ISO/IEC 23003-1:2007 | Information technology - MPEG audio technologies - Part 1: MPEG Surround | ISO/IEC |  | 2007
 | [RFC1350](http://tools.ietf.org/html/rfc1350) | RFC 1350 | The TFTP Protocol (Revision 2) | IETF | RFC | 
 | [RFC2228](http://tools.ietf.org/html/rfc2228) | RFC 2228 | FTP Security Extensions | IETF | RFC | 
 | [RFC2326](http://tools.ietf.org/html/rfc2326) | RFC 2326 | Real Time Streaming Protocol (RTSP) | IETF | RFC | 
 | [RFC2960](http://tools.ietf.org/html/rfc2960) | RFC 2960 | Stream Control Transmission Protocol (SCTP) | IETF | RFC | 
 | [RFC3066](http://tools.ietf.org/html/rfc3066) | RFC 3066 | Tags for the Identification of Languages | IETF | RFC | 
 | [RFC3376](http://tools.ietf.org/html/rfc3376) | RFC 3376 | Internet Group Management Protocol (IGMP) Version 3 | IETF | RFC | 
 | [RFC3550](http://tools.ietf.org/html/rfc3550) | RFC 3550 | RTP: A Transport Protocol for Real-Time Applications | IETF | RFC | July 2003
 | [RFC4078](http://tools.ietf.org/html/rfc4078) | RFC 4078 | The TV-Anytime Content Reference Identifier (CRID) | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4340](http://tools.ietf.org/html/rfc4340) | RFC 4340 | Datagram Congestion Control Protocol (DCCP) | IETF | RFC | 
 | [RFC4585](http://tools.ietf.org/html/rfc4585) | RFC 4585 | Extended RTP Profile for Real-time Transport Control Protocol (RTCP)-Based Feedback (RTP/AVPF) | IETF | RFC | 
 | [RFC4588](http://tools.ietf.org/html/rfc4588) | RFC 4588 | RTP Retransmission Packet Format | IETF | RFC | 
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [SMPTE20022-1]() | SMPTE 20022-1 Application Layer Forward Error Correction |  |  |  | 
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [SPDIF]() | S/PDIF |  Sony/Philips Digital InterFace  IEC-958 | IEC |  | 
 | [SSH-FTP](http://tools.ietf.org/wg/secsh/draft-ietf-secsh-filexfer) | SSH File Transfer Protocol |  |  |  | 
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-106a1](http://www.broadband-forum.org/technical/download/TR-106_Amendment-1.pdf) | TR-106 Amendment 1 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2006
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-135](http://www.broadband-forum.org/technical/download/TR-135.pdf) | TR-135 | Data Model for a TR-069 Enabled STB | Broadband Forum | Technical Report | 
 | [TR-140](http://www.broadband-forum.org/technical/download/TR-140.pdf) | TR-140 | TR-069 Data Model for Storage Service Devices | Broadband Forum | Technical Report | 
 | [TS102034]() | ETSI TS 102 034 | Digital Video Broadcasting (DVB); Transport of MPEG-2 Based DVB Services | ETSI |  | 
 | [TS102323]() | ETSI TS 102 323 | Digital Video Broadcasting (DVB); Carriage and signalling of TV-Anytime information
in DVB transport streams | ETSI |  | 
 | [VC-1]() | SMPTE VC-1 | Compressed Video Bitstream Format and Decoding Process, document number 421M | SMPTE, Television |  | 2006
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


