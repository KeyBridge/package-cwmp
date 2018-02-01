# TR-098

TR-069 InternetGatewayDevice:1.14 Root Object definition

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

TR-069 InternetGatewayDevice Root Object definition.

Editor:

* William Lupton, Cisco

BroadbandHome Working Group Chairs:

* Jason Walls, QA Cafe
* John Blackford, Pace

Issue History (Filename: Approval Date: Publication Date: Changes):

* tr-098-1-2-0.xml: March 2009:

  - corresponds to TR-098 Amendment 1 sections 2.4 (Data Model),
2.4.1 (Inform and Notification Requirements) and 3 (Profile
Definitions).
* tr-098-1-2-0.xml: September 2009 (name unchanged)
  - fixed header information (had been cut-and-pasted from elsewhere)
  - changed WLANConfigurationNumberOfEntries to (wrong but consistent)
LANWLANConfigurationNumberOfEntries
  - fixed 802.1Q-2004 reference to 802.1Q-2005
  - fixed cwmp-datamodel.xsd to be cwmp-datamodel-1-0.xsd
* tr098-1-3-0.xml: July 2011:

  - Alias extensions
* tr098-1-4-0.xml: October 2011:

  - imports new optional components for Femto FAP from TR-262:

* GPS
* Tunnel
* Performance Manamgemen
* Application Platform
  - import of new/updated optional components from TR-157a5
* Software modules
* Fault Management
* Location
* Security
* tr-098-1-5-0.xml: May 2012:

  - imports the new BulkDataCollection component from TR-157a6
* tr-098-1-6-0.xml: November 2012:

  - Add components from TR-157a7
  - Added software components to remove non-ascii characters
* BulkDataCollectionDiffs
* DI_VendorLogFilesDiffss
* UI_RemoteAccessDiffs
* PeriodicStatisticsDiff
* tr-098-1-7-0.xml: November 2013:

  - import components from TR-157a8
* MS_StandbyPolicy
* XMPP
* XMPPConnReq
  - add ManagementServer Parameters for HTTP Compression and
Lightweight Notifications
* tr-098-1-8-0.xml: 8 September 2014: 17 September 2014
  - import components from TR-157a9
* DI_HTIP
* MS_InformParameters
* UPnPDiffs


## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [3GPP-TS.23.107](http://www.3gpp.org/ftp/Specs/html-info/23107.htm) | 3GPP TS 23.107 | Quality of Service (QoS) concept and architecture | 3GPP SA WG2 |  | 
 | [3GPP-TS.25.171](http://www.3gpp.org/ftp/Specs/html-info/25171.htm) | 3GPP TS 25.171 | Requirements for support of Assisted Global Positioning System (A-GPS) | 3GPP RAN WG4 |  | 
 | [3GPP-TS.32.582](http://www.3gpp.org/ftp/Specs/html-info/32582.htm) | 3GPP TS 32.582 | Telecommunications management; Home Node B (HNB) Operations, Administration, Maintenance and Provisioning (OAM&P); Information model for Type 1 interface HNB to HNB Management System (HMS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.584](http://www.3gpp.org/ftp/Specs/html-info/32584.htm) | 3GPP TS 32.584 | Telecommunications management; Home Node B (HNB) Operations, Administration, Maintenance and Provisioning (OAM&P); XML definitions for Type 1 interface HNB to HNB Management Systems (HMS) | 3GPP SA WG5 |  | 
 | [3GPP-TS.32.592](http://www.3gpp.org/ftp/Specs/html-info/32592.htm) | 3GPP TS 32.592 | Telecommunications management; Home enhanced Node B (HeNB) Operations, Administration, Maintenance and Provisioning (OAM&P); Information model for Type 1 interface HeNB to HeNB Management System (HeMS) | 3GPP SA WG5 |  | 
 | [3GPP2-S.S0132](http://www.3gpp2.org/Public_html/specs/S.S0132-0_v1.0_Femtocell_Security_Framework.pdf) | S.S0132-0 v1.0 | Femtocell Security Framework | 3GPP2 |  | January 2010
 | [3GPP2-X.S0011](http://www.3gpp2.org/Public_html/specs/X.S0011-005-C_v1.0_110703.pdf) | X.S0011-005-C | cdma2000 Wireless IP Network Standard: Accounting Services and 3GPP2 RADIUS VSAs | 3GPP2 |  | August 2003
 | [802.1D-2004](http://standards.ieee.org/getieee802/download/802.1D-2004.pdf) | IEEE Std 802.1D-2004 | Media Access Control (MAC) Bridges | IEEE |  | 2004
 | [802.1Q-2005](http://standards.ieee.org/getieee802/download/802.1Q-2005.pdf) | IEEE Std 802.1Q-2005 | Virtual Bridged Local Area Networks | IEEE |  | 2006
 | [BLUE](http://www.thefengs.com/wuchang/work/blue) | Blue | A New Class of Active Queue Management Algorithms |  |  | 
 | [DLNA-NDIG](http://www.dlna.org/industry/certification/guidelines/) | DLNA Networked Device Interoperability Guidelines | DLNA Networked Device Interoperability Guidelines, Volume 2: Media Format Profiles. | DLNA |  | October 2006
 | [DNS-SD](http://tools.ietf.org/html/rfc6763) | RFC 6763 | DNS-Based Service Discovery | IETF | RFC | 2013
 | [DVB-TS.102.824](http://webapp.etsi.org/workprogram/Report_WorkItem.asp?WKI_ID=27769) | TS 102 824 | Digital Video Broadcasting (DVB);Remote Management and Firmware Update System for DVB IP Services | ETSI |  | July 2008
 | [ETSIM2MFA](http://docbox.etsi.org/M2M/Open/Latest_Drafts/00002ed121v116.pdf) | ETSI TS 102 690 v1.1.6 | Machine-to-Machine Communications (M2M Functional Architecture) | ETSI |  | June 2012
 | [G.9973](http://www.itu.int/rec/T-REC-G.9973-201110-I/en) | G.9973 | Protocol for identifying home network topology | ITU-T |  | 2011
 | [HTML4.01](http://www.w3.org/TR/html4) | HTML 4.01 Specification |  | W3C |  | 
 | [ICSA-Baseline](http://www.icsalabs.com/sites/default/files/baseline.pdf) | ICSA Baseline Modular Firewall Certification Criteria | Baseline module - version 4.1 | ICSA Labs |  | 2008
 | [ICSA-Firewall](http://www.icsalabs.com/sites/default/files/SMB4.0.pdf) | ICSA Modular Firewall Certification Criteria | Required Services Security Policy - Small/Medium Business (SMB) Category module - version 4.0 | ICSA Labs |  | 
 | [ICSA-Residential](http://www.icsalabs.com/sites/default/files/residential.pdf) | ICSA Residential Modular Firewall Certification Criteria | Required Services Security Policy - Residential Category module - version 4.1 | ICSA Labs |  | 2008
 | [IPDR-FTP](http://www.ipdr.org/public/) | IPDR File Transfer Protocol | IPDR/File Transfer Protocol | TM Forum |  | 
 | [IPDR-SP](http://www.ipdr.org/public/) | IPDR Streaming Protocol | IPDR Streaming Protocol (IPDR/SP) Specification | TM Forum |  | 
 | [IPDR-XDR](http://www.ipdr.org/public/) | IPDR XDR Encoding Format | IPDR/XDR Encoding Format | TM Forum |  | 
 | [IPDR-XML](http://www.ipdr.org/public/) | IPDR XML File Encoding Format | IPDR/XML File Encoding Format | TM Forum |  | 
 | [ISO-13818-6:1998](http://www.iso.org/iso/iso_catalogue/catalogue_tc/catalogue_detail.htm?csnumber=25039) | ISO/IEC 13818-6:1998 | Information Technology - Generic coding of moving pictures and associated audio information - Part 6: Extensions for DSM-CC | ISO |  | 1998
 | [ITU-X.733](http://www.itu.int/rec/T-REC-X.733/en) | ITU X.733 | Information technology - Open Systems Interconnection - Systems Management: Alarm reporting function | International Telecommunication Union |  | February 1992
 | [JJ-300.00](http://www.ttc.or.jp/jp/document_list/pdf/e/STD/JJ-300.00(E)v1.1.pdf) | JJ-300.00 | Home-network Topology Identifying Protocol | TTC |  | 2011
 | [JJ-300.01](http://www.ttc.or.jp/jp/document_list/pdf/e/STD/JJ-300.01(E)v1.1.pdf) | JJ-300.01 | The List of Device Categories | TTC |  | 2011
 | [OUI](http://standards.ieee.org/faqs/OUI.html) | Organizationally Unique Identifiers (OUIs) |  |  |  | 
 | [RED](http://www.icir.org/floyd/red.html) | References on RED (Random Early Detection) Queue Management |  |  |  | 
 | [RFC793](http://tools.ietf.org/html/rfc793) | RFC 793 | Transmission Control Protocol | IETF | RFC | September 1981
 | [RFC862](http://tools.ietf.org/html/rfc862) | RFC 862 | Echo Protocol | IETF | RFC | 1983
 | [RFC959](http://tools.ietf.org/html/rfc959) | RFC 959 | File Transfer Protocol | IETF | RFC | 1985
 | [RFC1035](http://tools.ietf.org/html/rfc1035) | RFC 1035 | Domain Names - Implementation and Specification | IETF | RFC | 1987
 | [RFC1323](http://tools.ietf.org/html/rfc1323) | RFC 1323 | TCP Extensions for High Performance | IETF | RFC | May 1992
 | [RFC2131](http://tools.ietf.org/html/rfc2131) | RFC 2131 | Dynamic Host Configuration Protocol | IETF | RFC | 
 | [RFC2132](http://tools.ietf.org/html/rfc2132) | RFC 2132 | DHCP Options and BOOTP Vendor Extensions | IETF | RFC | 
 | [RFC2225](http://tools.ietf.org/html/rfc2225) | RFC 2225 | Classical IP and ARP over ATM | IETF | RFC | 
 | [RFC2474](http://tools.ietf.org/html/rfc2474) | RFC 2474 | Definition of the Differentiated Services Field (DS Field) in the IPv4 and IPv6 Headers | IETF | RFC | 
 | [RFC2516](http://tools.ietf.org/html/rfc2516) | RFC 2516 | A Method for Transmitting PPP Over Ethernet (PPPoE) | IETF | RFC | 
 | [RFC2581](http://tools.ietf.org/html/rfc2581) | RFC 2581 | TCP Congestion Control | IETF | RFC | April 1999
 | [RFC2582](http://tools.ietf.org/html/rfc2582) | RFC 2582 | The NewReno Modification to TCP's Fast Recovery Algorithm | IETF | RFC | April 1999
 | [RFC2616](http://tools.ietf.org/html/rfc2616) | RFC 2616 | Hypertext Transfer Protocol -- HTTP/1.1 | IETF | RFC | 1999
 | [RFC2634](http://tools.ietf.org/html/rfc2634) | RFC 2634 | Enhanced Security Services for S/MIME | IETF | RFC | 
 | [RFC2662](http://tools.ietf.org/html/rfc2662) | RFC 2662 | Definitions of Managed Objects for the ADSL Lines | IETF | RFC | 
 | [RFC2684](http://tools.ietf.org/html/rfc2684) | RFC 2684 | Multiprotocol Encapsulation over ATM Adaptation Layer 5 | IETF | RFC | 
 | [RFC2697](http://tools.ietf.org/html/rfc2697) | RFC 2697 | A Single Rate Three Color Marker | IETF | RFC | 
 | [RFC2698](http://tools.ietf.org/html/rfc2698) | RFC 2698 | A Two Rate Three Color Marker | IETF | RFC | 
 | [RFC2782](http://tools.ietf.org/html/rfc2782) | RFC 2782 | A DNS RR for specifying the location of services (DNS SRV) | IETF | RFC | 2000
 | [RFC2818](http://tools.ietf.org/html/rfc2818) | RFC 2818 | HTTP Over TLS | IETF | RFC | May 2000
 | [RFC2863](http://tools.ietf.org/html/rfc2863) | RFC 2863 | The Interfaces Group MIB | IETF | RFC | 2000
 | [RFC2898](http://tools.ietf.org/html/rfc2898) | RFC 2898 | PKCS #5: Password-Based Cryptography Specification Version 2.0 | IETF | RFC | 
 | [RFC2974](http://tools.ietf.org/html/rfc2974) | RFC 2974 | Session Announcement Protocol | IETF | RFC | October 2000
 | [RFC3004](http://tools.ietf.org/html/rfc3004) | RFC 3004 | The User Class Option for DHCP | IETF | RFC | 
 | [RFC3066](http://tools.ietf.org/html/rfc3066) | RFC 3066 | Tags for the Identification of Languages | IETF | RFC | 
 | [RFC3489](http://tools.ietf.org/html/rfc3489) | RFC 3489 | STUN - Simple Traversal of User Datagram Protocol (UDP) Through Network Address Translators (NATs) | IETF | RFC | 
 | [RFC3925](http://tools.ietf.org/html/rfc3925) | RFC 3925 | Vendor-Identifying Vendor Options for Dynamic Host Configuration Protocol version 4 (DHCPv4) | IETF | RFC | 
 | [RFC3926](http://tools.ietf.org/html/rfc3926) | RFC 3926 | FLUTE - File Delivery over Unidirectional Transport | IETF | RFC | October 2004
 | [RFC3986](http://tools.ietf.org/html/rfc3986) | RFC 3986 | Uniform Resource Identifier (URI): Generic Syntax | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4301](http://tools.ietf.org/html/rfc4301) | RFC 4301 | Security Architecture for the Internet Protocol | IETF | RFC | December 2005
 | [RFC4307](http://tools.ietf.org/html/rfc4307) | RFC 4307 | Cryptographic Algorithms for Use in the Internet Key Exchange Version 2 (IKEv2) | IETF | RFC | December 2005
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC4835](http://tools.ietf.org/html/rfc4835) | RFC 4835 | Cryptographic Algorithm Implementation Requirements for Encapsulating Security Payload (ESP) and Authentication Header (AH) | IETF | RFC | 2007
 | [RFC5139](http://tools.ietf.org/html/rfc5139) | RFC 5139 | Revised Civic Location Format For Presence Information Data Format Location Object (PIDF-LO) | IETF | RFC | February 2008
 | [RFC5280](http://tools.ietf.org/html/rfc5280) | RFC 5280 | Internet X.509 Public Key Infrastructure Certificate and Certificate Revocation List (CRL) Profile | IETF | RFC | May 2008
 | [RFC5491](http://tools.ietf.org/html/rfc5491) | RFC 5491 | GEOPRIV Presence Information Data Format Location Object (PIDF-LO) Usage Clarification, Considerations, and Recommendations | IETF | RFC | March 2009
 | [RFC6120](http://tools.ietf.org/html/rfc6120) | RFC 6120 | Extensible Messaging and Presence Protocol (XMPP) : Core | IETF | RFC | 2011
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-069](http://www.broadband-forum.org/technical/download/TR-069.pdf) | TR-069 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2004
 | [TR-069a1](http://www.broadband-forum.org/technical/download/TR-069_Amendment-1.pdf) | TR-069 Amendment 1 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2006
 | [TR-069a2](http://www.broadband-forum.org/technical/download/TR-069_Amendment-2.pdf) | TR-069 Amendment 2 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2007
 | [TR-069a3](http://www.broadband-forum.org/technical/download/TR-069_Amendment-3.pdf) | TR-069 Amendment 3 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2010
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-069a5](http://www.broadband-forum.org/technical/download/TR-069_Amendment-5.pdf) | TR-069 Amendment 5 | CPE WAN Management Protocol | Broadband Forum | Technical Report | December 2013
 | [TR-098](http://www.broadband-forum.org/technical/download/TR-098.pdf) | TR-098 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2005
 | [TR-098a1](http://www.broadband-forum.org/technical/download/TR-098_Amendment-1.pdf) | TR-098 Amendment 1 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2006
 | [TR-098a2](http://www.broadband-forum.org/technical/download/TR-098_Amendment-2.pdf) | TR-098 Amendment 2 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2008
 | [TR-106](http://www.broadband-forum.org/technical/download/TR-106.pdf) | TR-106 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2005
 | [TR-106a1](http://www.broadband-forum.org/technical/download/TR-106_Amendment-1.pdf) | TR-106 Amendment 1 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2006
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a3](http://www.broadband-forum.org/technical/download/TR-106_Amendment-3.pdf) | TR-106 Amendment 3 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2009
 | [TR-106a4](http://www.broadband-forum.org/technical/download/TR-106_Amendment-4.pdf) | TR-106 Amendment 4 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2010
 | [TR-106a6](http://www.broadband-forum.org/technical/download/TR-106_Amendment-6.pdf) | TR-106 Amendment 6 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2011
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-143](http://www.broadband-forum.org/technical/download/TR-143.pdf) | TR-143 | Enabling Network Throughput Performance Tests and Statistical Monitoring | Broadband Forum | Technical Report | 2008
 | [TR-157](http://www.broadband-forum.org/technical/download/TR-157.pdf) | TR-157 | Component Object for CWMP | Broadband Forum | Technical Report | March 2009
 | [TR-157a3](http://www.broadband-forum.org/technical/download/TR-157_Amendment-3.pdf) | TR-157 Amendment 3 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2010
 | [TR-157a5](http://www.broadband-forum.org/technical/download/TR-157_Amendment-5.pdf) | TR-157 Amendment 5 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2011
 | [TR-181i1](http://www.broadband-forum.org/technical/download/TR-181_Issue-1.pdf) | TR-181 Issue 1 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-181i2](http://www.broadband-forum.org/technical/download/TR-181_Issue-2.pdf) | TR-181 Issue 2 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-196i2](http://www.broadband-forum.org/technical/download/TR-196_Issue-2.pdf) | TR-196 Issue 2 | Femto Access Point Service Data Model | Broadband Forum | Technical Report | 2011
 | [TR-232](http://www.broadband-forum.org/technical/download/TR-232.pdf) | TR-232 | Bulk Data Collection | Broadband Forum | Technical Report | May 2012
 | [TR-262](http://www.broadband-forum.org/technical/download/TR-262.pdf) | TR-262 | Femto Component Objects | Broadband Forum | Technical Report | 2011
 | [UPnP-DAv1](http://www.upnp.org/specs/arch/UPnP-arch-DeviceArchitecture-v1.0-20080424.pdf) | UPnP Device Architecture | UPnP Device Architecture 1.0 | UPnP Forum |  | April 2008
 | [UPnP-DAv11](http://www.upnp.org/specs/arch/UPnP-arch-DeviceArchitecture-v1.1.pdf) | UPnP Device Architecture 1.1 | UPnP Device Architecture 1.1 | UPnP Forum |  | October, 2008
 | [UPnP-DM:1](http://upnp.org/specs/dm/dm1/) | UPnP Device Management:1 | UPnP Device Management v1 |  |  | 
 | [USB1.0](http://www.usb.org/developers/docs/) | USB 1.0 | USB 1.0 Specification | USB-IF |  | January 1996
 | [USB2.0](http://www.usb.org/developers/docs/usb_20_122208.zip) | USB 2.0 | USB 2.0 Specification | USB-IF |  | April 2000
 | [USB3.0](http://www.usb.org/developers/docs/usb_30_spec.zip) | USB 3.0 | USB 3.0 Specification | USB-IF |  | November 2008
 | [WPSv1.0](http://www.wi-fi.org) | Wi-Fi Protected Setup Specification Version 1.0h | Wi-Fi Alliance |  |  | 2006
 | [Z-Wave](http://www.z-wave.com) | Z-Wave | Z-Wave website |  |  | 
 | [ZigBee](http://www.zigbee.org) | ZigBee | ZigBee Alliance website |  |  | 
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


