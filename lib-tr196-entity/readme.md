# TR-196

FAPService:2.1 Femto Access Point Service Data Model

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

TR-196 FAPServce:2.1 Service data model with radio specific parts
for UMTS, LTE and CDMA2000 Femto cells.

Editors:

Klaus Wich, Nokia Siemens Networks (Original)
Douglas Knisely, Qualcomm Incorporated (Corrigendum 1)
William Lupton, Broadband Forum (Corrigendum 2)
Tim Carey Alcatel-Lucent (Amendment 1)

BroadbandHome™ Working Group Chairs:

Jason Walls, QA Cafe
John Blackford, Pace

Issue History (Filename: Approval Date: Publication Date: Changes)
* tr-196-2-0.0.xml: November 2011: November 2011:

Corresponds to TR-196 Issue 2.
* tr-196-2-0-1.xml: November 2012: November 2012:

Corresponds to TR-196 Issue 2 Corrigendum 1.
* tr-196-2-0-2.xml: March 2015: March 2015:

Corresponds to TR-196 Issue 2 Corrigendum 2.
* tr-196-2-1-0.xml: 24 August 2015: 2 October 2015:

Corresponds to TR-196 Issue 2 Amendment 1.


## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [3GPP-TS.03.03](http://www.3gpp.org/ftp/Specs/html-info/0303.htm) | 3GPP TS 03.03 | Numbering, Addressing and Identification | 3GPP CT WG4 |  | 
 | [3GPP-TS.05.05](http://www.3gpp.org/ftp/Specs/html-info/0505.htm) | 3GPP TS 05.05 | Radio Transmission and Reception | 3GPP GERAN WG1 |  | 
 | [3GPP-TS.22.011](http://www.3gpp.org/ftp/Specs/html-info/22011.htm) | 3GPP TS 22.011 | Service accessibility | 3GPP SA WG1 |  | 
 | [3GPP-TS.22.220](http://www.3gpp.org/ftp/Specs/html-info/22220.htm) | 3GPP TS 22.220 | Service requirements for Home Node B (HNB) and Home eNode B (HeNB) | 3GPP SA WG1 |  | 
 | [3GPP-TS.23.003](http://www.3gpp.org/ftp/Specs/html-info/23003.htm) | 3GPP TS 23.003 | Numbering, addressing and identification | 3GPP CT WG4 |  | 
 | [3GPP-TS.23.032](http://www.3gpp.org/ftp/Specs/html-info/23032.htm) | 3GPP TS 23.032 | Universal Geographical Area Description (GAD) | 3GPP SA WG2 |  | 
 | [3GPP-TS.23.060](http://www.3gpp.org/ftp/Specs/html-info/23060.htm) | 3GPP TS 23.060 | General Packet Radio Service (GPRS); Service description; Stage 2 | 3GPP SA WG2 |  | 
 | [3GPP-TS.23.203](http://www.3gpp.org/ftp/Specs/html-info/23203.htm) | 3GPP TS 23.203 | Policy and charging control architecture | 3GPP SA WG2 |  | 
 | [3GPP-TS.23.401](http://www.3gpp.org/ftp/Specs/html-info/23401.htm) | 3GPP TS 23.401 | General Packet Radio Service (GPRS) enhancements for Evolved Universal Terrestrial Radio Access Network (E-UTRAN) access | 3GPP SA WG2 |  | 
 | [3GPP-TS.24.008](http://www.3gpp.org/ftp/Specs/html-info/24008.htm) | 3GPP TS 24.008 | Mobile radio interface Layer 3 specification; Core network protocols; Stage 3 | 3GPP CT WG1 |  | 
 | [3GPP-TS.25.104](http://www.3gpp.org/ftp/Specs/html-info/25104.htm) | 3GPP TS 25.104 | Base Station (BS) radio transmission and reception (FDD) | 3GPP RAN WG4 |  | 
 | [3GPP-TS.25.133](http://www.3gpp.org/ftp/Specs/html-info/25133.htm) | 3GPP TS 25.133 | Requirements for support of radio resource management (FDD) | 3GPP RAN WG4 |  | 
 | [3GPP-TS.25.214](http://www.3gpp.org/ftp/Specs/html-info/25214.htm) | 3GPP TS 25.214 | Physical layer procedures (FDD) | 3GPP RAN WG1 |  | 
 | [3GPP-TS.25.304](http://www.3gpp.org/ftp/Specs/html-info/25304.htm) | 3GPP TS 25.304 | User Equipment (UE) procedures in idle mode and procedures for cell reselection in connected mode | 3GPP RAN WG2 |  | 
 | [3GPP-TS.25.331](http://www.3gpp.org/ftp/Specs/html-info/25331.htm) | 3GPP TS 25.331 | Radio Resource Control (RRC); Protocol specification | 3GPP RAN WG2 |  | 
 | [3GPP-TS.25.401](http://www.3gpp.org/ftp/Specs/html-info/25401.htm) | 3GPP TS 25.401 | UTRAN overall description | 3GPP RAN WG3 |  | 
 | [3GPP-TS.25.413](http://www.3gpp.org/ftp/Specs/html-info/25413.htm) | 3GPP TS 25.413 | UTRAN Iu interface Radio Access Network Application Part (RANAP) signalling | 3GPP RAN WG3 |  | 
 | [3GPP-TS.25.433](http://www.3gpp.org/ftp/Specs/html-info/25433.htm) | 3GPP TS 25.433 | UTRAN Iub interface Node B Application Part (NBAP) signalling | 3GPP RAN WG3 |  | 
 | [3GPP-TS.25.469](http://www.3gpp.org/ftp/Specs/html-info/25469.htm) | 3GPP TS 25.469 | UTRAN Iuh interface Home Node B Application Part (HNBAP) signalling | 3GPP RAN WG3 |  | 
 | [3GPP-TS.25.967](http://www.3gpp.org/ftp/Specs/html-info/25967.htm) | 3GPP TS 25.967 | FDD Home NodeB RF Requirements | 3GPP RAN WG4 |  | 
 | [3GPP-TS.29.281](http://www.3gpp.org/ftp/Specs/html-info/29281.htm) | 3GPP TS 29.281 | General Packet Radio System (GPRS) Tunnelling Protocol User Plane (GTPv1-U) | 3GPP CT WG4 |  | 
 | [3GPP-TS.32.300](http://www.3gpp.org/ftp/Specs/html-info/32300.htm) | 3GPP TS 32.300 | Telecommunication management; Configuration Management (CM); Name convention for Managed Objects | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.405](http://www.3gpp.org/ftp/Specs/html-info/32405.htm) | 3GPP TS 32.405 | Telecommunication management; Performance Management (PM); Performance measurements Universal Terrestrial Radio Access Network (UTRAN) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.452](http://www.3gpp.org/DynaReport/32452.htm) | 3GPP TS 32.452 | Performance measurements Home Node B(HNB) Subsystem (HNS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.453](http://www.3gpp.org/DynaReport/32453.htm) | 3GPP TS 32.453 | Performance measurements Home Enhanced Node B(HeNB) Subsystem (HeNS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.582](http://www.3gpp.org/ftp/Specs/html-info/32582.htm) | 3GPP TS 32.582 | Telecommunications management; Home Node B (HNB) Operations, Administration, Maintenance and Provisioning (OAM&P); Information model for Type 1 interface HNB to HNB Management System (HMS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.592](http://www.3gpp.org/ftp/Specs/html-info/32592.htm) | 3GPP TS 32.592 | Telecommunications management; Home enhanced Node B (HeNB) Operations, Administration, Maintenance and Provisioning (OAM&P); Information model for Type 1 interface HeNB to HeNB Management System (HeMS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.642](http://www.3gpp.org/ftp/Specs/html-info/32642.htm) | 3GPP TS 32.642 | Telecommunication management; Configuration Management (CM); UTRAN network resources Integration Reference Point (IRP); Network Resource Model (NRM) | 3GPP SA WG5 |  | 
 | [3GPP-TS.33.401](http://www.3gpp.org/ftp/Specs/html-info/33401.htm) | 3GPP TS 33.401 | 3GPP System Architecture Evolution (SAE); Security architecture | 3GPP SA WG3 |  | 
 | [3GPP-TS.36.101](http://www.3gpp.org/ftp/Specs/html-info/36101.htm) | 3GPP TS 36.101 | Evolved Universal Terrestrial Radio Access (E-UTRA); User Equipment (UE) radio transmission and reception | 3GPP RAN WG4 |  | 
 | [3GPP-TS.36.104](http://www.3gpp.org/ftp/Specs/html-info/36104.htm) | 3GPP TS 36.104 | Evolved Universal Terrestrial Radio Access (E-UTRA); Base Station (BS) radio transmission and reception | 3GPP RAN WG4 |  | 
 | [3GPP-TS.36.133](http://www.3gpp.org/ftp/Specs/html-info/36133.htm) | 3GPP TS 36.133 | Evolved Universal Terrestrial Radio Access (E-UTRA); Requirements for support of radio resource management | 3GPP RAN WG4 |  | 
 | [3GPP-TS.36.211](http://www.3gpp.org/ftp/Specs/html-info/36211.htm) | 3GPP TS 36.211 | Evolved Universal Terrestrial Radio Access (E-UTRA); Physical channels and modulation | 3GPP RAN WG1 |  | 
 | [3GPP-TS.36.212](http://www.3gpp.org/ftp/Specs/html-info/36212.htm) | 3GPP TS 36.212 | Evolved Universal Terrestrial Radio Access (E-UTRA); Multiplexing and channel coding | 3GPP RAN WG1 |  | 
 | [3GPP-TS.36.213](http://www.3gpp.org/ftp/Specs/html-info/36213.htm) | 3GPP TS 36.213 | Evolved Universal Terrestrial Radio Access (E-UTRA); Physical layer procedures | 3GPP RAN WG1 |  | 
 | [3GPP-TS.36.214](http://www.3gpp.org/ftp/Specs/html-info/36214.htm) | 3GPP TS 36.214 | Evolved Universal Terrestrial Radio Access (E-UTRA); Physical layer - Measurements | 3GPP RAN WG1 |  | 
 | [3GPP-TS.36.300](http://www.3gpp.org/ftp/Specs/html-info/36300.htm) | 3GPP TS 36.300 | Evolved Universal Terrestrial Radio Access (E-UTRA) and Evolved Universal Terrestrial Radio Access Network (E-UTRAN); Overall description; Stage 2 | 3GPP RAN WG3 |  | 
 | [3GPP-TS.36.304](http://www.3gpp.org/ftp/Specs/html-info/36304.htm) | 3GPP TS 36.304 | Evolved Universal Terrestrial Radio Access (E-UTRA); User Equipment (UE) procedures in idle mode | 3GPP RAN WG2 |  | 
 | [3GPP-TS.36.314](http://www.3gpp.org/DynaReport/36314.htm) | 3GPP TS 36.314 | Evolved Universal Terrestrial Radio Access (E-UTRA); Layer 2 - Measurements | 3GPP RAN2 WG2 |  | 
 | [3GPP-TS.36.321](http://www.3gpp.org/ftp/Specs/html-info/36321.htm) | 3GPP TS 36.321 | Evolved Universal Terrestrial Radio Access (E-UTRA); Medium Access Control (MAC) protocol specification | 3GPP RAN WG2 |  | 
 | [3GPP-TS.36.322](http://www.3gpp.org/ftp/Specs/html-info/36322.htm) | 3GPP TS 36.322 | Evolved Universal Terrestrial Radio Access (E-UTRA); Radio Link Control (RLC) protocol specification | 3GPP RAN WG2 |  | 
 | [3GPP-TS.36.331](http://www.3gpp.org/ftp/Specs/html-info/36331.htm) | 3GPP TS 36.331 | Evolved Universal Terrestrial Radio Access (E-UTRA); Radio Resource Control (RRC); Protocol specification | 3GPP RAN WG2 |  | 
 | [3GPP-TS.36.413](http://www.3gpp.org/ftp/Specs/html-info/36413.htm) | 3GPP TS 36.413 | Evolved Universal Terrestrial Radio Access Network (E-UTRAN); S1 Application Protocol (S1AP) | 3GPP RAN WG3 |  | 
 | [3GPP-TS.45.005](http://www.3gpp.org/ftp/Specs/html-info/45005.htm) | 3GPP TS 45.005 | Radio transmission and reception | 3GPP GERAN WG1 |  | 
 | [3GPP-TS.45.008](http://www.3gpp.org/ftp/Specs/html-info/45008.htm) | 3GPP TS 45.008 | Radio Access Network; Radio subsystem link control | 3GPP GERAN WG1 |  | 
 | [3GPP2-A.S0008](http://www.3gpp2.org/Public_html/specs/A.S0008-C_v2.0_090106.pdf) | A.S0008-C v2.0 | Interoperability Specification (IOS) for High Rate Packet Data (HRPD) Radio Access Network Interfaces with Session Control in the Access Network | 3GPP2 |  | January 2009
 | [3GPP2-A.S0009](http://www.3gpp2.org/Public_html/specs/A.S0009-C_v2.0_090106.pdf) | A.S0009-C v2.0 | Interoperability Specification (IOS) for High Rate Packet Data (HRPD) Radio Access Network Interfaces with Session Control in the Packet Control Function | 3GPP2 |  | January 2009
 | [3GPP2-A.S0013](http://www.3gpp2.org/Public_html/specs/A.S0013-D_v2.0_090825.pdf) | A.S0013-D v2.0 | Interoperability Specification (IOS) for CDMA2000 Access Network Interfaces  Part 3 Features | 3GPP2 |  | August 2009
 | [3GPP2-A.S0014](http://www.3gpp2.org/Public_html/specs/A.S0014-D_v2.0_090825.pdf) | A.S0014-D v2.0 | Interoperability Specification (IOS) for CDMA2000 Access Network Interfaces  Part 4 (A1, A1p, A2, and A5 Interfaces) | 3GPP2 |  | August 2009
 | [3GPP2-A.S0024](http://www.3gpp2.org/Public_html/specs/A.S0024-0_v1.0_100302.pdf) | A.S0024-0 v1.0 | Interoperability Specification (IOS) for Femtocell Access Points | 3GPP2 |  | March 2010
 | [3GPP2-C.R1001](http://www.3gpp2.org/Public_html/specs/C.R1001-G_v1.0_Param_Administration.pdf) | C.R1001-G v1.0 | Administration of Parameter Value Assignments for CDMA2000 Spread Spectrum Standards - Release G | 3GPP2 |  | June 2009
 | [3GPP2-C.S0005](http://www.3gpp2.org/Public_html/specs/C.S0005-E_v1.0_cdma200_1x_Layer_3-090925.pdf) | C.S0005-E v1.0 | Upper Layer (Layer 3) Signaling Standard for CDMA2000 Spread Spectrum Systems | 3GPP2 |  | September 2009
 | [3GPP2-C.S0024](http://www.3gpp2.org/Public_html/specs/C.S0024-B_v3.0_HRPD.pdf) | C.S0024-B v3.0 | CDMA2000 High Rate Packet Data Air Interface Specification | 3GPP2 |  | September 2009
 | [3GPP2-C.S0057](http://www.3gpp2.org/Public_html/specs/C.S0057-D_v1.0%20Band%20Class%20.pdf) | C.S0057-D v1.0 | Band Class Specification for CDMA2000 Spread Spectrum Systems | 3GPP2 |  | September 2009
 | [3GPP2-C.S0002-A](http://www.3gpp2.org/Public_html/specs/C.S0002-A_v6.0.pdf) | 3GPP2 C.S0002-A | Physical Layer Standard for CDMA2000 Spread Spectrum Systems, Release A | 3GPP2 TSG-C |  | 
 | [3GPP2-C.S0005-A](http://www.3gpp2.org/Public_html/specs/C.S0005-A.pdf) | 3GPP2 C.S0005-A | Upper Layer (Layer 3) Signaling Standard for CDMA2000 Spread Spectrum Systems, Release: A | 3GPP2 TSG-C |  | 
 | [3GPP2-C.S0024-A](http://www.3gpp2.org/Public_html/specs/C.S0024-A_v3.0_060912.pdf) | 3GPP2 C.S0024-A | CDMA2000 High Rate Packet Data Air Interface Specification | 3GPP2 TSG-C |  | 
 | [3GPP2-C.S0024-B](http://www.3gpp2.org/Public_html/specs/C.S0024-B_v3.0_HRPD.pdf) | C.S0024-B v3.0 | CDMA2000 High Rate Packet Data Air Interface Specification | 3GPP2 |  | September 2009
 | [3GPP2-C.S0057-B](http://www.3gpp2.org/Public_html/specs/C.S0057-B%20v1.0_060814.pdf) | 3GPP2 C.S0057-B | Band Class Specification for CDMA2000 Spread Spectrum Systems | 3GPP2 TSG-C |  | 
 | [3GPP2-N.S0010](http://www.3gpp2.org/Public_html/specs/N.S0010-0_v1.0.pdf) | N.S0010-0 v1.0 | Advanced Features in Wideband Spread Spectrum Systems | 3GPP2 |  | January 1998
 | [3GPP2-S.S0132](http://www.3gpp2.org/Public_html/specs/S.S0132-0_v1.0_Femtocell_Security_Framework.pdf) | S.S0132-0 v1.0 | Femtocell Security Framework | 3GPP2 |  | January 2010
 | [3GPP2-X.S0059](http://www.3gpp2.org/Public_html/specs/X.S0059-000-0_v1.0_100216.pdf) | X.S0059-0 v1.0 | CDMA2000 Femtocell Network | 3GPP2 |  | January 2010
 | [IANA-portnumbers](http://www.iana.org/assignments/port-numbers) | IANA Port Numbers | Port Numbers | IANA |  | 
 | [ITU-E.118](http://www.itu.int/rec/T-REC-E.118/en) | ITU E.118 | Overall Network Operation, Telephone Service, Service Operation and Human Factors | International Telecommunication Union |  | May 2006
 | [ITU-X.731](http://www.itu.int/rec/T-REC-X.731/en) | ITU X.731 | Information Technology - Open Systems Interconnection - Systems Management: State Management Function | International Telecommunication Union |  | January 1992
 | [RFC3261](http://tools.ietf.org/html/rfc3261) | RFC 3261 | SIP: Session Initiation Protocol | IETF | RFC | June 2002
 | [RFC3455](http://tools.ietf.org/html/rfc3455) | RFC 3455 | Private Header (P-Header) Extensions to the Session Initiation Protocol (SIP) for the 3rd-Generation Partnership Project (3GPP) | IETF | RFC | January 2003
 | [RFC3550](http://tools.ietf.org/html/rfc3550) | RFC 3550 | RTP: A Transport Protocol for Real-Time Applications | IETF | RFC | July 2003
 | [RFC3873](http://tools.ietf.org/html/rfc3873) | RFC 3873 | Stream Control Transmission Protocol (SCTP) Management Information Base (MIB) | IETF | RFC | September 2004
 | [RFC3986](http://tools.ietf.org/html/rfc3986) | RFC 3986 | Uniform Resource Identifier (URI): Generic Syntax | IETF | RFC | 
 | [RFC4028](http://tools.ietf.org/html/rfc4028) | RFC 4028 | Session Timers in the Session Initiation Protocol (SIP) | IETF | RFC | April 2005
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC4960](http://tools.ietf.org/html/rfc4960) | RFC 4960 | Stream Control Transmission Protocol | IETF | RFC | September 2007
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-069a2](http://www.broadband-forum.org/technical/download/TR-069_Amendment-2.pdf) | TR-069 Amendment 2 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2007
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-098](http://www.broadband-forum.org/technical/download/TR-098.pdf) | TR-098 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2005
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-157a5](http://www.broadband-forum.org/technical/download/TR-157_Amendment-5.pdf) | TR-157 Amendment 5 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2011
 | [TR-181i1](http://www.broadband-forum.org/technical/download/TR-181_Issue-1.pdf) | TR-181 Issue 1 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-181i2](http://www.broadband-forum.org/technical/download/TR-181_Issue-2.pdf) | TR-181 Issue 2 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-262](http://www.broadband-forum.org/technical/download/TR-262.pdf) | TR-262 | Femto Component Objects | Broadband Forum | Technical Report | 2011
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


