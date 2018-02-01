# TR-104

TR-069 VoiceService:2.0 Service Object definition

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



THIS SPECIFICATION IS BEING OFFERED WITHOUT ANY WARRANTY WHATSOEVER, AND IN PARTICULAR, ANY WARRANTY OF NONINFRINGEMENT IS EXPRESSLY DISCLAIMED. ANY USE OF THIS SPECIFICATION SHALL BE MADE ENTIRELY AT THE IMPLEMENTER'S OWN RISK, AND NEITHER the Forum, NOR ANY OF ITS MEMBERS OR SUBMITTERS, SHALL HAVE ANY LIABILITY WHATSOEVER TO ANY IMPLEMENTER OR THIRD PARTY FOR ANY DAMAGES OF ANY NATURE WHATSOEVER, DIRECTLY OR INDIRECTLY, ARISING FROM THE USE OF THIS SPECIFICATION.

Broadband Forum Documents may be copied, downloaded, stored on a
server or otherwise re-distributed in their entirety only, and may
not be modified without the advance written permission of the
Broadband Forum.

The text of this notice must be included in all copies of this
Broadband Forum Document.


Summary:

TR-104 VoiceService:2.0 Service Object definition.

Editors:

Alexandre Francois, Orange
Grégory Foucher, Orange

BroadbandHome™ Working Group Chairs:

John Blackford, Pace
Jason Walls, QA Cafe

Issue History (Filename: Approval Date: Publication Date: Changes):

* tr-104-1-0-0.xml: September 2009:

corresponds to TR-104 Issue 1, Section 3 (Data Model Definition) and Section 4 (Profile Definition).
* tr-104-1-1-0.xml: July 2011:

corresponds to TR-104 Issue 1, Amendment 1.
* tr-104-2-0-0.xml: 3 March 2014: 24 April 2014:

corresponds to TR-104 Issue 2.




## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [3GPP_TS_24.229](http://www.3gpp.org/ftp/Specs/html-info/24229.htm) | 3GPP TS 24.229 | IP Multimedia Call Control Protocol based on Session Initiation Protocol (SIP) and Session Description Protocol (SDP); Stage 3 | 3GPP CT WG1 | Technical specification | 
 | [802.1D-2004](http://standards.ieee.org/getieee802/download/802.1D-2004.pdf) | IEEE Std 802.1D-2004 | Media Access Control (MAC) Bridges | IEEE |  | 2004
 | [802.1Q-2005](http://standards.ieee.org/getieee802/download/802.1Q-2005.pdf) | IEEE Std 802.1Q-2005 | Virtual Bridged Local Area Networks | IEEE |  | 2006
 | [ETSI_EN_300_444](http://www.etsi.org/deliver/etsi_en/300400_300499/300444/02.04.01_60/en_300444v020401p.pdf) | ETSI EN 300 444 | Digital Enhanced Cordless Telecommunications (DECT); Generic Access Profile (GAP) | ETSI | Standard | 
 | [ETSI_EN_300_175-5](http://www.etsi.org/deliver/etsi_en/300100_300199/30017505/02.05.01_60/en_30017505v020501p.pdf) | ETSI EN 300 175-05 | Digital Enhanced Cordless Telecommunications (DECT); Common Interface (CI); Part 5: Network (NWK) layer | ETSI | Standard | 
 | [ETSI_EN_300_175-6](http://www.etsi.org/deliver/etsi_en/300100_300199/30017506/02.05.01_60/en_30017506v020501p.pdf) | ETSI EN 300 175-6 | Digital Enhanced Cordless Telecommunications (DECT); Common Interface (CI); Part 6: Identities and addressing | ETSI | Standard | 
 | [ETSI_EN_300_175-7](http://www.etsi.org/deliver/etsi_en/300100_300199/30017507/02.05.01_60/en_30017507v020501p.pdf) | ETSI 300 175-7 | Digital Enhanced Cordless Telecommunications (DECT); Common Interface (CI); Part 7: Security features | ETSI | Standard | 
 | [ETSI_EN_300_175-8](http://www.etsi.org/deliver/etsi_en/300100_300199/30017508/02.05.01_60/en_30017508v020501p.pdf) | ETSI 300 175-8 | Digital Enhanced Cordless Telecommunications (DECT); Common Interface (CI); Part 8: Speech and audio coding and transmission | ETSI | Standard | 
 | [ETSI_ES_201_970](http://www.etsi.org/deliver/etsi_es/201900_201999/201970/01.01.01_60/es_201970v010101p.pdf) | ETSI ES 201 970 | Access and Terminals (AT); Public Switched Telephone Network (PSTN); Harmonized specification of physical and electrical characteristics at a 2-wire analogue presented Network Termination Point (NTP)
             | ETSI | Standard | 
 | [ETSI_ES_203_021](http://www.etsi.org/WebSite/Technologies/analogueline.aspx) | ETSI ES 203 021 | Access and Terminals (AT); Harmonized basic attachment requirements for Terminals for connection to analogue interfaces of the Telephone Networks
             | ETSI | Standard | 
 | [ETSI_TR_101_183](http://www.etsi.org/deliver/etsi_tr/101100_101199/101183/01.01.01_60/tr_101183v010101p.pdf) | ETSI TR 101 183 | Public Switched Telephone Network (PSTN); Analogue ringing signals | ETSI | Technical Report | 
 | [ETSI_TS_102_527-1](http://www.etsi.org/deliver/etsi_ts/102500_102599/10252701/01.03.01_60/ts_10252701v010301p.pdf) | ETSI TS 102 527-1 | Digital Enhanced Cordless Telecommunications (DECT); New Generation DECT; Part 1: Wideband speech | ETSI | Technical Specification | 
 | [ETSI_TS_102_527-3](http://www.etsi.org/deliver/etsi_ts/102500_102599/10252703/01.05.01_60/ts_10252703v010501p.pdf) | ETSI TS 102 527-3 | Digital Enhanced Cordless Telecommunications (DECT); New Generation DECT; Part 3: Extended wideband speech services | ETSI | Technical Specification | 
 | [ETSI_TS_102_527-4](http://www.etsi.org/deliver/etsi_ts/102500_102599/10252704/01.01.01_60/ts_10252704v010101p.pdf) | ETSI TS 102 527-4 | Digital Enhanced Cordless Telecommunications (DECT); New Generation DECT; Part 4: Light Data Services; Software Update Over The Air (SUOTA), content downloading and HTTP based applications | ETSI | Technical Specification | 
 | [ETSI_TS_102_527-5](http://www.etsi.org/deliver/etsi_ts/102500_102599/10252705/01.01.01_60/ts_10252705v010101p.pdf) | ETSI TS 102 527-5 | Digital Enhanced Cordless Telecommunications (DECT); New Generation DECT; Part 5: Additional feature set nr. 1 for extended wideband speech services | ETSI | Technical Specification | 
 | [ETSI_TS_181_019](http://www.etsi.org/deliver/etsi_ts/181000_181099/181019/02.00.00_60/ts_181019v020000p.pdf) | ETSI TS 181 019 | Telecommunications and Internet converged Services and Protocols for Advanced Networking (TISPAN) | ETSI | Standard | 
 | [H.323](http://www.itu.int/rec/T-REC-H.323-200912-I) | H.323 | Packet-based multimedia communications systems | ITU-T | H series | 
 | [H.235.1](http://www.itu.int/rec/T-REC-H.235.1) | H.235.1 | H.323 security framework: Baseline security profile | ITU-T | H series | 
 | [I.251.1](http://www.itu.int/rec/T-REC-I.251.1) | I.251.1 | Number identification supplementary services : Direct-dialling-In | ITU-T | I series | 
 | [I.251.2](http://www.itu.int/rec/T-REC-I.251.2) | I.251.2 | Number identification supplementary services : Multiple Subscriber Number | ITU-T | I series | 
 | [I.251.7](http://www.itu.int/rec/T-REC-I.251.7) | I.251.7 | Number identification supplementary services : Malicious call Identification | ITU-T | I series | 
 | [I.252.7](http://www.itu.int/rec/T-REC-I.252.7) | I.252.7 | Call offering supplementary services : Explicit call transfer | ITU-T | I series | 
 | [I.256.2a](http://www.itu.int/rec/T-REC-I.256.2a) | I.256.2a | Charging supplementary services : Advice of charge: charging information at call set-up time (AOC-S) | ITU-T | I series | 
 | [I.256.2c](http://www.itu.int/rec/T-REC-I.256.2c) | I.256.2c | Charging supplementary services : Advice of charge: charging information at the end of the call (AOC-E) | ITU-T | I series | 
 | [I.256.2b](http://www.itu.int/rec/T-REC-I.256.2b) | I.256.2b | Charging supplementary services : Advice of charge: charging information during the call (AOC-D) | ITU-T | I series | 
 | [IANA_Event_Packages](http://www.iana.org/assignments/sip-events/sip-events.xhtml#sip-events-2) | IANA SIP Event packages and Event-template packages Registry | Session Initiation Protocol (SIP) Event Types Namespace | IANA |  | 
 | [IANA_SIP_Methods](http://www.iana.org/assignments/sip-parameters/sip-parameters.xhtml#sip-parameters-6) | IANA SIP Methods Registry | Session Initiation Protocol (SIP) Parameters : Methods and Response Codes | IANA |  | 
 | [ISO3166-1](http://www.iso.org/iso/country_codes.htm) | ISO 3166-1 | Codes for the representation of names of countries and their subdivisions - Part 1: Country codes | ISO |  | 2006
 | [Q.931](http://www.itu.int/rec/T-REC-Q.931) | Q.931 | ISDN user-network interface layer 3 specification for basic call control. | ITU-T | Q series | 
 | [RFC2198](http://tools.ietf.org/html/rfc2198) | RFC 2198 | RTP Payload for Redundant Audio Data | IETF | RFC | 
 | [RFC2782](http://tools.ietf.org/html/rfc2782) | RFC 2782 | A DNS RR for specifying the location of services (DNS SRV) | IETF | RFC | 2000
 | [RFC3261](http://tools.ietf.org/html/rfc3261) | RFC 3261 | SIP: Session Initiation Protocol | IETF | RFC | June 2002
 | [RFC3435](http://tools.ietf.org/html/rfc3435) | RFC 3435 | Media Gateway Control Protocol (MGCP) Version 1.0 | IETF | RFC | 
 | [RFC3550](http://tools.ietf.org/html/rfc3550) | RFC 3550 | RTP: A Transport Protocol for Real-Time Applications | IETF | RFC | July 2003
 | [RFC3611](http://tools.ietf.org/html/rfc3611) | RFC 3611 | RTP Control Protocol Extended Reports (RTCP XR) | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC4733](http://tools.ietf.org/html/rfc4733) | RFC 4733 | RTP Payload for DTMF Digits, Telephony Tones and Telephony Signals | IETF | RFC | 
 | [RFC6140](http://tools.ietf.org/html/rfc6140) | RFC 6140 | Registration for Multiple Phone Numbers in the Session Initiation Protocol (SIP) | IETF | RFC | 
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [T.38](http://www.itu.int/rec/T-REC-T.38-201009-I) | T.38 | Procedures for real-time Group 3 facsimile communication over IP networks. | ITU-T | T series | 
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-104i2](http://www.broadband-forum.org/technical/download/TR-104_Issue-2.pdf) | TR-104 Issue 2 | Provisioning Parameters for VoIP CPE | Broadband Forum | Technical Report | 2014
 | [TR-106](http://www.broadband-forum.org/technical/download/TR-106.pdf) | TR-106 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2005
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [Y.1540](http://www.itu.int/rec/T-REC-Y.1540) | Y.1540 | IP packet transfer and availability performance parameters | ITU-T | Y series | 
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


