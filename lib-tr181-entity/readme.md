# TR-181

TR-069 Device:2.10 Root Object definition

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

TR-069 Device:2.10 Root Object definition.

Editor:

* Klaus Wich, Axiros GmbH

BroadbandHome Working Group Chairs:

* Jason Walls, QA Cafe
* John Blackford, Pace

Issue History (Filename: Approval Date: Publication Date: Changes):

* tr-181-2-0-0.xml: May 2010:

  - corresponds to TR-181 Issue 2.
* tr-181-2-1-0.xml: November 2010:

  - corresponds to TR-181 Issue 2 Amendment 1.
* tr-181-2-2-0.xml: March 2011:

  - corresponds to TR-181 Issue 2 Amendment 2.
* tr-181-2-3-0.xml: September 2011:

  - corresponds to TR-181 Issue 2 Amendment 3.
* tr-181-2-4-0.xml: November 2011:

  - corresponds to TR-181 Issue 2 Amendment 4.
* tr-181-2-5-0.xml: May 2012:

  - corresponds to TR-181 Issue 2 Amendment 5.
* tr-181-2-6-0.xml: November 2012:

  - corresponds to TR-181 Issue 2 Amendment 6.
* tr-181-2-7-0.xml: November 2013: January 17, 2014
  - corresponds to TR-181 Issue 2 Amendment 7.
* tr-181-2-8-0.xml: 8 September 2014: 17 September 2014:

  - corresponds to TR-181 Issue 2 Amendment 8.
* tr-181-2-9-0.xml:  1 December 2014:  4 February 2015:

  - Added WiFi MAC Address Filtering
  - Added Traceroute fixes
  - Added IEEE 1905 data model
  - Incorporated TR-143a1
* tr-181-2-10-0.xml: 9 November 2015: 13 November 2015:

  - corresponds to TR-181 Issue 2 Amendment 10.



## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [3GPP-HSPA](http://www.3gpp.org/technologies/keywords-acronyms/99-hspa) | High Speed Packet data Access (HSPA) |  | 3GPP |  | 
 | [3GPP-TS.25.171](http://www.3gpp.org/ftp/Specs/html-info/25171.htm) | 3GPP TS 25.171 | Requirements for support of Assisted Global Positioning System (A-GPS) | 3GPP RAN WG4 |  | 
 | [802.11-2007](http://standards.ieee.org/getieee802/download/802.11-2007.pdf) | IEEE Std 802.11-2007 | Wireless LAN Medium Access Control (MAC) and Physical Layer (PHY) Specifications | IEEE |  | 2007
 | [802.11-2012](http://standards.ieee.org/getieee802/download/802.11-2012.pdf) | IEEE Std 802.11-2012 | Wireless LAN Medium Access Control (MAC) and Physical Layer (PHY) Specifications | IEEE |  | March 2012
 | [802.11a-1999](http://standards.ieee.org/getieee802/download/802.11a-1999.pdf) | IEEE Std 802.11a-1999 | High-speed Physical Layer in the 5 GHz band | IEEE |  | 1999
 | [802.11ac-2013](http://www.ieee802.org/11/Reports/tgac_update.htm) | IEEE Std 802.11ac-2013 |  | IEEE |  | 
 | [802.11b-1999](http://standards.ieee.org/getieee802/download/802.11b-1999.pdf) | IEEE Std 802.11b-1999 | Higher Speed Physical Layer Extension in the 2.4 GHz band | IEEE |  | 1999
 | [802.11g-2003](http://standards.ieee.org/getieee802/download/802.11g-2003.pdf) | IEEE Std 802.11g-2003 | Further Higher Data Rate Extension in the 2.4 GHz Band | IEEE |  | 2003
 | [802.11h-2003](http://standards.ieee.org/getieee802/download/802.11h-2003.pdf) | IEEE Std 802.11h-2003 | Spectrum and Transmit Power Management Extensions | IEEE |  | 2003
 | [802.11n-2009](http://ieeexplore.ieee.org/xpl/freeabs_all.jsp?reload=true&arnumber=5307322) | IEEE Std 802.11n-2009 | Amendment 5: Enhancements for Higher Throughput | IEEE |  | 2009
 | [802.1AB-2009](http://standards.ieee.org/getieee802/download/802.1AB-2009.pdf) | IEEE Std 802.1AB-2009 | Station and Media Access Control Connectivity Discovery | IEEE |  | 2009
 | [802.1ad-2005](http://standards.ieee.org/getieee802/download/802.1ad-2005.pdf) | IEEE Std 802.1ad-2005 | Virtual Bridged Local Area Networks Amendment 4: Provider Bridges | IEEE |  | May 2005
 | [802.1D-2004](http://standards.ieee.org/getieee802/download/802.1D-2004.pdf) | IEEE Std 802.1D-2004 | Media Access Control (MAC) Bridges | IEEE |  | 2004
 | [802.1Q-2005](http://standards.ieee.org/getieee802/download/802.1Q-2005.pdf) | IEEE Std 802.1Q-2005 | Virtual Bridged Local Area Networks | IEEE |  | 2006
 | [802.1Q-2011](http://standards.ieee.org/getieee802/download/802.1Q-2011.pdf) | IEEE Std 802.1Q-2011 | MAC Bridges and Virtual Bridge Local Area Networks | IEEE |  | 2011
 | [802.1x-2004](http://standards.ieee.org/getieee802/download/802.1X-2004.pdf) | IEEE Std 802.1x-2004 | Standards for Local and Metropolitan Area Networks: Port based Network Access Control | IEEE |  | 2004
 | [802.3-2012_section6](http://standards.ieee.org/getieee802/download/802.3-2012_section6.pdf) | IEEE 802.3-2012 - Section Six | IEEE Standard for Ethernet - Section Six | IEEE |  | December 2012
 | [BLUE](http://www.thefengs.com/wuchang/work/blue) | Blue | A New Class of Active Queue Management Algorithms |  |  | 
 | [DLNA-NDIG](http://www.dlna.org/industry/certification/guidelines/) | DLNA Networked Device Interoperability Guidelines | DLNA Networked Device Interoperability Guidelines, Volume 2: Media Format Profiles. | DLNA |  | October 2006
 | [DNS-SD](http://tools.ietf.org/html/rfc6763) | RFC 6763 | DNS-Based Service Discovery | IETF | RFC | 2013
 | [DSLite](http://tools.ietf.org/html/rfc6333) | RFC 6333 | Dual-Stack Lite Broadband Deployments Following IPv4 Exhaustion | IETF | RFC | 2011
 | [DSLite-options](http://tools.ietf.org/html/rfc6334) | RFC 6334 | Dynamic Host Configuation Protocol for IPv6 (DHCPv6) Option for Dual-Stack Lite | IETF | RFC | 2011
 | [DVB-TS.102.824](http://webapp.etsi.org/workprogram/Report_WorkItem.asp?WKI_ID=27769) | TS 102 824 | Digital Video Broadcasting (DVB);Remote Management and Firmware Update System for DVB IP Services | ETSI |  | July 2008
 | [ETSIM2MFA](http://docbox.etsi.org/M2M/Open/Latest_Drafts/00002ed121v116.pdf) | ETSI TS 102 690 v1.1.6 | Machine-to-Machine Communications (M2M Functional Architecture) | ETSI |  | June 2012
 | [ETSIM2MInterfaces](http://docbox.etsi.org/M2M/Open/Latest_Drafts/00010ed121v116.pdf) | ETSI TS 102 921 v1.1.6 | M2M mIa, dIa and mId Interfaces | ETSI |  | August 2012
 | [G.988](http://www.itu.int/rec/T-REC-G.988-201010-P/en) | G.988 | ONU management and control interface (OMCI) specification | ITU-T |  | 2010
 | [G.9954](http://www.itu.int/rec/T-REC-G.9954/en) | G.9954 | Phoneline networking transceivers - Enhanced physical, media access, and link layer specifications (HPNA 3.0 and 3.1) | ITU-T |  | 2007
 | [G.9960](http://www.itu.int/rec/T-REC-G.9960-201006-P) | G.9960 | Unified high-speed wire-line based home networking transceivers - System architecture and physical layer specification | ITU-T | G.hn series | 
 | [G.9961](http://www.itu.int/rec/T-REC-G.9961-201006-P) | G.9961 | Unified high-speed wire-line based home networking transceivers - Data link layer specification | ITU-T | G.hn series | 
 | [G.9962](http://www.itu.int/rec/T-REC-G.9962-201308-P) | G.9962 | Unified high-speed wire-line based home networking transceivers - Management specification | ITU-T | G.hn series | 
 | [G.9964](http://www.itu.int/rec/T-REC-G.9962-201308-P) | G.9964 | Unified high-speed wire-line based home networking transceivers - Power spectral density specification | ITU-T | G.hn series | 
 | [G.9973](http://www.itu.int/rec/T-REC-G.9973-201110-I/en) | G.9973 | Protocol for identifying home network topology | ITU-T |  | 2011
 | [G.993.1](http://www.itu.int/rec/T-REC-G.993.1) | G.993.1 | Very high speed digital subscriber line transceivers | ITU-T |  | 
 | [G.993.2](http://www.itu.int/rec/T-REC-G.993.2) | G.993.2 | Very high speed digital subscriber line transceivers 2 (VDSL2) | ITU-T |  | 
 | [G.997.1](http://www.itu.int/rec/T-REC-G.997.1) | G.997.1 | Physical layer management for digital subscriber line (DSL) transceivers | ITU-T |  | 
 | [G.998.1](http://www.itu.int/rec/T-REC-G.998.1) | G.998.1 | ATM-based Multi-Pair Bonding | ITU-T |  | 2005
 | [G.998.2](http://www.itu.int/rec/T-REC-G.998.2) | G.998.2 | Ethernet-based Multi-Pair Bonding | ITU-T |  | 2005
 | [G.998.3](http://www.itu.int/rec/T-REC-G.998.2) | G.998.3 | Multi-Pair Bonding Using Time-Division Inverse Multiplexing | ITU-T |  | 2005
 | [HPAV1.1](http://www.homeplug.org) | HomePlug AV Specification | Version 1.1 | HomePlug |  | 2007
 | [HTML4.01](http://www.w3.org/TR/html4) | HTML 4.01 Specification |  | W3C |  | 
 | [IANA-protocolnumbers](http://www.iana.org/assignments/protocol-numbers) | IANA Protocol Numbers | Protocol Numbers | IANA |  | 
 | [IANAifType](http://www.iana.org/assignments/ianaiftype-mib/ianaiftype-mib) | IANAifType | IANAifType-MIB DEFINITIONS | IANA |  | 2009
 | [ICSA-Baseline](http://www.icsalabs.com/sites/default/files/baseline.pdf) | ICSA Baseline Modular Firewall Certification Criteria | Baseline module - version 4.1 | ICSA Labs |  | 2008
 | [ICSA-Firewall](http://www.icsalabs.com/sites/default/files/SMB4.0.pdf) | ICSA Modular Firewall Certification Criteria | Required Services Security Policy - Small/Medium Business (SMB) Category module - version 4.0 | ICSA Labs |  | 
 | [ICSA-Residential](http://www.icsalabs.com/sites/default/files/residential.pdf) | ICSA Residential Modular Firewall Certification Criteria | Required Services Security Policy - Residential Category module - version 4.1 | ICSA Labs |  | 2008
 | [IEEE1905.1a](http://www.IEEE.org) | IEEE 1905.1a | IEEE Std 1905.1a, Convergent Digital Home Network for Heterogeneous Technologies Amendment 1: Support of new MAC/PHYs and enhancements, IEEE, December 2014. | IEEE |  | December 2014
 | [IKEv2-params](http://www.iana.org/assignments/ikev2-parameters/ikev2-parameters.xml) | IKEv2 Parameters | Internet Key Exchange Version 2 (IKEv2) Parameters | IETF |  | 
 | [IPDR-FTP](http://www.ipdr.org/public/) | IPDR File Transfer Protocol | IPDR/File Transfer Protocol | TM Forum |  | 
 | [IPDR-SP](http://www.ipdr.org/public/) | IPDR Streaming Protocol | IPDR Streaming Protocol (IPDR/SP) Specification | TM Forum |  | 
 | [IPDR-XDR](http://www.ipdr.org/public/) | IPDR XDR Encoding Format | IPDR/XDR Encoding Format | TM Forum |  | 
 | [IPDR-XML](http://www.ipdr.org/public/) | IPDR XML File Encoding Format | IPDR/XML File Encoding Format | TM Forum |  | 
 | [ISO-13818-6:1998](http://www.iso.org/iso/iso_catalogue/catalogue_tc/catalogue_detail.htm?csnumber=25039) | ISO/IEC 13818-6:1998 | Information Technology - Generic coding of moving pictures and associated audio information - Part 6: Extensions for DSM-CC | ISO |  | 1998
 | [ISO3166-1](http://www.iso.org/iso/country_codes.htm) | ISO 3166-1 | Codes for the representation of names of countries and their subdivisions - Part 1: Country codes | ISO |  | 2006
 | [ISO639-1](http://www.iso.org/iso/language_codes) | ISO 639-1 | Codes for the representation of names of Languages - Part 1: Alpha-2 code | ISO |  | 2002
 | [ISO646-1991]() | ISO/IEC 646-1991 | Information Technology - ISO 7-bit coded character set for information interchange | ISO |  | 1991
 | [ITU-E.118](http://www.itu.int/rec/T-REC-E.118/en) | ITU E.118 | Overall Network Operation, Telephone Service, Service Operation and Human Factors | International Telecommunication Union |  | May 2006
 | [ITU-E.164](http://www.itu.int/rec/T-REC-E.164-201011-I/en) | ITU E.164 | The international public telecommunication numbering plan | International Telecommunication Union |  | October 2010
 | [ITU-X.733](http://www.itu.int/rec/T-REC-X.733/en) | ITU X.733 | Information technology - Open Systems Interconnection - Systems Management: Alarm reporting function | International Telecommunication Union |  | February 1992
 | [JJ-300.00](http://www.ttc.or.jp/jp/document_list/pdf/e/STD/JJ-300.00(E)v1.1.pdf) | JJ-300.00 | Home-network Topology Identifying Protocol | TTC |  | 2011
 | [JJ-300.01](http://www.ttc.or.jp/jp/document_list/pdf/e/STD/JJ-300.01(E)v1.1.pdf) | JJ-300.01 | The List of Device Categories | TTC |  | 2011
 | [MAP](http://tools.ietf.org/html/draft-ietf-softwire-map) | ID-MAP | Mapping of Address and Port with Encapsulation (MAP) | IETF | ID | January 2014
 | [MAP-DHCP](http://tools.ietf.org/html/draft-ietf-softwire-map-dhcp) | ID-MAP-DHCP | DHCPv6 Options for configuration of Softwire Address and Port Mapped Clients | IETF | ID | March 2014
 | [MAP-T](http://tools.ietf.org/html/draft-ietf-softwire-map-t) | ID-MAP-T | Mapping of Address and Port using Translation (MAP-T) | IETF | ID | February 2014
 | [MOCA11-MIB](http://www.mocalliance.org) | MOCA11-MIB | Remote Management of MoCA Interfaces using SNMP MIB | MoCA Alliance |  | 2009
 | [MoCAv1.0](http://www.mocalliance.org) | MoCA v1.0 | MoCA MAC/PHY Specification v1.0 | MoCA Alliance |  | 2009
 | [MoCAv1.1](http://www.mocalliance.org) | MoCA v1.1 | MoCA MAC/PHY Specification v1.1 Extensions | MoCA Alliance |  | 2009
 | [MQTT31](http://www.ibm.com/developerworks/webservices/library/ws-mqtt/index.html) | MQTT v3.1 | MQ Telemetry Transport (MQTT) V3.1 Protocol Specification |  |  | 2010
 | [MQTT311](https://www.oasis-open.org/standards#mqttv3.1.1) | MQTT Version 3.1.1 | MQTT v3.1.1 | OASIS Message Queuing Telemetry Transport (MQTT) TC |  | October 2014
 | [OUI](http://standards.ieee.org/faqs/OUI.html) | Organizationally Unique Identifiers (OUIs) |  |  |  | 
 | [PCPProxy](http://tools.ietf.org/html/draft-ietf-pcp-proxy) | PCP Proxy Function | Port Control Protocol (PCP) Proxy Function | IETF |  | January 2014
 | [POSIXBase](http://ieeexplore.ieee.org/xpl/mostRecentIssue.jsp?punumber=4694974) | ISO/IEC/IEEE 9945 | Information technology - Portable Operating System Interface (POSIX) Base Specifications, Issue 7 | ISO/IEC/IEEE |  | September 2009
 | [RED](http://www.icir.org/floyd/red.html) | References on RED (Random Early Detection) Queue Management |  |  |  | 
 | [RFC793](http://tools.ietf.org/html/rfc793) | RFC 793 | Transmission Control Protocol | IETF | RFC | September 1981
 | [RFC862](http://tools.ietf.org/html/rfc862) | RFC 862 | Echo Protocol | IETF | RFC | 1983
 | [RFC959](http://tools.ietf.org/html/rfc959) | RFC 959 | File Transfer Protocol | IETF | RFC | 1985
 | [RFC1035](http://tools.ietf.org/html/rfc1035) | RFC 1035 | Domain Names - Implementation and Specification | IETF | RFC | 1987
 | [RFC1323](http://tools.ietf.org/html/rfc1323) | RFC 1323 | TCP Extensions for High Performance | IETF | RFC | May 1992
 | [RFC1332](http://tools.ietf.org/html/rfc1332) | RFC 1332 | The PPP Internet Protocol Control Protocol (IPCP) | IETF | RFC | 1992
 | [RFC1378](http://tools.ietf.org/html/rfc1378) | RFC 1378 | The PPP AppleTalk Control Protocol (ATCP) | IETF | RFC | 1992
 | [RFC1552](http://tools.ietf.org/html/rfc1552) | RFC 1552 | The PPP Internetwork Packet Exchange Control Protocol (IPXCP) | IETF | RFC | 1993
 | [RFC1661](http://tools.ietf.org/html/rfc1661) | RFC 1661 | The Point-to-Point Protocol (PPP) | IETF | RFC | 1994
 | [RFC1877](http://tools.ietf.org/html/rfc1877) | RFC 1877 | PPP Internet Protocol Control Protocol Extensions for Name Server Addresses | IETF | RFC | 1995
 | [RFC1974](http://tools.ietf.org/html/rfc1974) | RFC 1974 | PPP Stac LZS Compression Protocol | IETF | RFC | 1996
 | [RFC2080](http://tools.ietf.org/html/rfc2080) | RFC 2080 | RIPng for IPv6 | IETF | RFC | 1997
 | [RFC2097](http://tools.ietf.org/html/rfc2097) | RFC 2097 | The PPP NetBIOS Frames Control Protocol (NBFCP) | IETF | RFC | 1997
 | [RFC2131](http://tools.ietf.org/html/rfc2131) | RFC 2131 | Dynamic Host Configuration Protocol | IETF | RFC | 
 | [RFC2132](http://tools.ietf.org/html/rfc2132) | RFC 2132 | DHCP Options and BOOTP Vendor Extensions | IETF | RFC | 
 | [RFC2225](http://tools.ietf.org/html/rfc2225) | RFC 2225 | Classical IP and ARP over ATM | IETF | RFC | 
 | [RFC2364](http://tools.ietf.org/html/rfc2364) | RFC 2364 | PPP Over AAL5 | IETF | RFC | 1998
 | [RFC2474](http://tools.ietf.org/html/rfc2474) | RFC 2474 | Definition of the Differentiated Services Field (DS Field) in the IPv4 and IPv6 Headers | IETF | RFC | 
 | [RFC2581](http://tools.ietf.org/html/rfc2581) | RFC 2581 | TCP Congestion Control | IETF | RFC | April 1999
 | [RFC2582](http://tools.ietf.org/html/rfc2582) | RFC 2582 | The NewReno Modification to TCP's Fast Recovery Algorithm | IETF | RFC | April 1999
 | [RFC2616](http://tools.ietf.org/html/rfc2616) | RFC 2616 | Hypertext Transfer Protocol -- HTTP/1.1 | IETF | RFC | 1999
 | [RFC2684](http://tools.ietf.org/html/rfc2684) | RFC 2684 | Multiprotocol Encapsulation over ATM Adaptation Layer 5 | IETF | RFC | 
 | [RFC2697](http://tools.ietf.org/html/rfc2697) | RFC 2697 | A Single Rate Three Color Marker | IETF | RFC | 
 | [RFC2698](http://tools.ietf.org/html/rfc2698) | RFC 2698 | A Two Rate Three Color Marker | IETF | RFC | 
 | [RFC2782](http://tools.ietf.org/html/rfc2782) | RFC 2782 | A DNS RR for specifying the location of services (DNS SRV) | IETF | RFC | 2000
 | [RFC2784](http://tools.ietf.org/html/rfc2784) | RFC 2784 | Generic Routing Encapsulation (GRE) | IETF | RFC | November 2000
 | [RFC2818](http://tools.ietf.org/html/rfc2818) | RFC 2818 | HTTP Over TLS | IETF | RFC | May 2000
 | [RFC2819](http://tools.ietf.org/html/rfc2819) | RFC 2819 | Remote Network Monitoring Management Information Base | IETF | RFC | 2000
 | [RFC2863](http://tools.ietf.org/html/rfc2863) | RFC 2863 | The Interfaces Group MIB | IETF | RFC | 2000
 | [RFC2865](http://tools.ietf.org/html/rfc2865) | RFC 2865 | Remote Authentication Dial In User Service (RADIUS) | IETF | RFC | 2000
 | [RFC2866](http://tools.ietf.org/html/rfc2866) | RFC 2866 | RADIUS Accounting | IETF | RFC | 2000
 | [RFC2869](http://tools.ietf.org/html/rfc2869) | RFC 2869 | RADIUS Extensions | IETF | RFC | 2000
 | [RFC2890](http://tools.ietf.org/html/rfc2890) | RFC 2890 | Key and Sequence Number Extensions to GRE | IETF | RFC | November 2000
 | [RFC2898](http://tools.ietf.org/html/rfc2898) | RFC 2898 | PKCS #5: Password-Based Cryptography Specification Version 2.0 | IETF | RFC | 
 | [RFC2974](http://tools.ietf.org/html/rfc2974) | RFC 2974 | Session Announcement Protocol | IETF | RFC | October 2000
 | [RFC3004](http://tools.ietf.org/html/rfc3004) | RFC 3004 | The User Class Option for DHCP | IETF | RFC | 
 | [RFC3066](http://tools.ietf.org/html/rfc3066) | RFC 3066 | Tags for the Identification of Languages | IETF | RFC | 
 | [RFC3232](http://tools.ietf.org/html/rfc3232) | RFC 3232 | "Assigned Numbers: RFC 1700 is Replaced by an On-line Database" | IETF | RFC | 2002
 | [RFC3315](http://tools.ietf.org/html/rfc3315) | RFC 3315 | Dynamic Host Configuration Protocol for IPv6 (DHCPv6) | IETF | RFC | 2003
 | [RFC3489](http://tools.ietf.org/html/rfc3489) | RFC 3489 | STUN - Simple Traversal of User Datagram Protocol (UDP) Through Network Address Translators (NATs) | IETF | RFC | 
 | [RFC3596](http://tools.ietf.org/html/rfc3596) | RFC 3596 | DDNS Extensions to Support IP Version 6 | IETF | RFC | 2003
 | [RFC3633](http://tools.ietf.org/html/rfc3633) | RFC 3633 | IPv6 Prefix Options for Dynamic Host Configuration Protocol (DHCP) version 6 | IETF | RFC | 2003
 | [RFC3646](http://tools.ietf.org/html/rfc3646) | RFC 3646 | DNS Configuration options for Dynamic Host Configuration Protocol for IPv6 (DHCPv6) | IETF | RFC | 2003
 | [RFC3775](http://tools.ietf.org/html/rfc3775) | RFC 3775 | Mobility Support in IPv6 | IETF | RFC | 2004
 | [RFC3925](http://tools.ietf.org/html/rfc3925) | RFC 3925 | Vendor-Identifying Vendor Options for Dynamic Host Configuration Protocol version 4 (DHCPv4) | IETF | RFC | 
 | [RFC3926](http://tools.ietf.org/html/rfc3926) | RFC 3926 | FLUTE - File Delivery over Unidirectional Transport | IETF | RFC | October 2004
 | [RFC3927](http://tools.ietf.org/html/rfc3927) | RFC 3927 | Dynamic Configuration of IPv4 Link-Local Addresses | IETF | RFC | 2005
 | [RFC3948](http://tools.ietf.org/html/rfc3948) | RFC 3948 | UDP Encapsulation of IPsec ESP Packets | IETF | RFC | January 2005
 | [RFC3986](http://tools.ietf.org/html/rfc3986) | RFC 3986 | Uniform Resource Identifier (URI): Generic Syntax | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4180](http://tools.ietf.org/html/rfc4180) | RFC4180 | Common Format and MIME Type for Comma-Separated Values (CSV) Files | IETF | RFC | October 2005
 | [RFC4191](http://tools.ietf.org/html/rfc4191) | RFC 4191 | Default Router Preferences and More-Specific Routes | IETF | RFC | 2005
 | [RFC4193](http://tools.ietf.org/html/rfc4193) | RFC 4193 | Unique Local IPv6 Unicast Addresses | IETF | RFC | 2005
 | [RFC4242](http://tools.ietf.org/html/rfc4242) | RFC 4242 | Information Refresh Time Option for Dynamic Host Configuration Protocol for IPv6 (DHCPv6) | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4292](http://tools.ietf.org/html/rfc4292) | RFC 4292 | IP Forwarding Table MIB | IETF | RFC | 2006
 | [RFC4293](http://tools.ietf.org/html/rfc4293) | RFC 4293 | Management Information Base for the Internet Protocol (IP) | IETF | RFC | 2006
 | [RFC4301](http://tools.ietf.org/html/rfc4301) | RFC 4301 | Security Architecture for the Internet Protocol | IETF | RFC | December 2005
 | [RFC4302](http://tools.ietf.org/html/rfc4302) | RFC 4302 | IP Authentication Header | IETF | RFC | December 2005
 | [RFC4303](http://tools.ietf.org/html/rfc4303) | RFC 4303 | IP Encapsulating Security Payload (ESP) | IETF | RFC | December 2005
 | [RFC4389](http://tools.ietf.org/html/rfc4389) | RFC 4389 | Neighbor Discovery Proxies (ND Proxy) | IETF | RFC | 2006
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC4835](http://tools.ietf.org/html/rfc4835) | RFC 4835 | Cryptographic Algorithm Implementation Requirements for Encapsulating Security Payload (ESP) and Authentication Header (AH) | IETF | RFC | 2007
 | [RFC4861](http://tools.ietf.org/html/rfc4861) | RFC 4861 | Neighbor Discovery for IP version 6 (IPv6) | IETF | RFC | 2007
 | [RFC4862](http://tools.ietf.org/html/rfc4862) | RFC 4862 | IPv6 Stateless Address Autoconfiguration | IETF | RFC | 2007
 | [RFC5072](http://tools.ietf.org/html/rfc5072) | RFC 5072 | IP Version 6 over PPP | IETF | RFC | 2007
 | [RFC5139](http://tools.ietf.org/html/rfc5139) | RFC 5139 | Revised Civic Location Format For Presence Information Data Format Location Object (PIDF-LO) | IETF | RFC | February 2008
 | [RFC5280](http://tools.ietf.org/html/rfc5280) | RFC 5280 | Internet X.509 Public Key Infrastructure Certificate and Certificate Revocation List (CRL) Profile | IETF | RFC | May 2008
 | [RFC5491](http://tools.ietf.org/html/rfc5491) | RFC 5491 | GEOPRIV Presence Information Data Format Location Object (PIDF-LO) Usage Clarification, Considerations, and Recommendations | IETF | RFC | March 2009
 | [RFC5625](http://tools.ietf.org/html/rfc5625) | RFC 5625 | DNS Proxy Implementation Guidelines | IETF | RFC | 2009
 | [RFC5969](http://tools.ietf.org/html/rfc5969) | RFC 5969 | IPv6 Rapid Deployment on IPv4 Infrastructures (6rd) - Protocol Specification | IETF | RFC | 2010
 | [RFC5996](http://tools.ietf.org/html/rfc5996) | RFC 5996 | Internet Key Exchange Protocol Version 2 (IKEv2) | IETF | RFC | September 2010
 | [RFC6106](http://tools.ietf.org/html/rfc6106) | RFC 6106 | IPv6 Router Advertisement Option for DNS Configuration | IETF | RFC | 2010
 | [RFC6120](http://tools.ietf.org/html/rfc6120) | RFC 6120 | Extensible Messaging and Presence Protocol (XMPP) : Core | IETF | RFC | 2011
 | [RFC6887](http://tools.ietf.org/html/rfc6887) | RFC 6887 | Port Control Protocol (PCP) | IETF | RFC | 2013
 | [RFC6970](http://tools.ietf.org/html/rfc6970) | RFC 6970 | Universal Plug and Play (UPnP) Internet Gateway Device (IGD) - Port Control Protocol (PCP) Interworking Function | IETF | RFC | 2013
 | [RFC7159](http://tools.ietf.org/html/rfc7159) | RFC7159 | The JavaScript Object Notation (JSON) Data Interchange Format | IETF | RFC | March 2014
 | [RFC7291](http://tools.ietf.org/html/rfc7291) | RFC 7291 | DHCP Options for the Port Control Protocol (PCP) | IETF | RFC | 2014
 | [RFC7597](http://tools.ietf.org/html/rfc7597) | RFC 7597 | Mapping of Address and Port with Encapsulation (MAP) | IETF | RFC | July 2015
 | [RFC7598](http://tools.ietf.org/html/rfc7598) | RFC 7598 | DHCPv6 Options for configuration of Softwire Address and Port Mapped Clients | IETF | RFC | July 2015
 | [RFC7599](http://tools.ietf.org/html/rfc7599) | RFC 7599 | Mapping of Address and Port using Translation (MAP-T) | IETF | RFC | July 2015
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-064](http://www.broadband-forum.org/technical/download/TR-064.pdf) | TR-064 | LAN-Side DSL CPE Configuration Specification | Broadband Forum | Technical Report | 2004
 | [TR-069](http://www.broadband-forum.org/technical/download/TR-069.pdf) | TR-069 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2004
 | [TR-069a2](http://www.broadband-forum.org/technical/download/TR-069_Amendment-2.pdf) | TR-069 Amendment 2 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2007
 | [TR-069a3](http://www.broadband-forum.org/technical/download/TR-069_Amendment-3.pdf) | TR-069 Amendment 3 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2010
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-069a5](http://www.broadband-forum.org/technical/download/TR-069_Amendment-5.pdf) | TR-069 Amendment 5 | CPE WAN Management Protocol | Broadband Forum | Technical Report | December 2013
 | [TR-098](http://www.broadband-forum.org/technical/download/TR-098.pdf) | TR-098 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2005
 | [TR-106](http://www.broadband-forum.org/technical/download/TR-106.pdf) | TR-106 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2005
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a3](http://www.broadband-forum.org/technical/download/TR-106_Amendment-3.pdf) | TR-106 Amendment 3 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2009
 | [TR-106a4](http://www.broadband-forum.org/technical/download/TR-106_Amendment-4.pdf) | TR-106 Amendment 4 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2010
 | [TR-106a5](http://www.broadband-forum.org/technical/download/TR-106_Amendment-5.pdf) | TR-106 Amendment 5 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2010
 | [TR-106a6](http://www.broadband-forum.org/technical/download/TR-106_Amendment-6.pdf) | TR-106 Amendment 6 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2011
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-143](http://www.broadband-forum.org/technical/download/TR-143.pdf) | TR-143 | Enabling Network Throughput Performance Tests and Statistical Monitoring | Broadband Forum | Technical Report | 2008
 | [TR-143a1](http://www.broadband-forum.org/technical/download/TR-143_Amendment-1.pdf) | TR-143 Amendment 1 | Enabling Network Throughput Performance Tests and Statistical Monitoring | Broadband Forum | Technical Report | December 2014
 | [TR-157](http://www.broadband-forum.org/technical/download/TR-157.pdf) | TR-157 | Component Object for CWMP | Broadband Forum | Technical Report | March 2009
 | [TR-157a10](http://www.broadband-forum.org/technical/download/TR-157_Amendment-10.pdf) | TR-157 Amendment 10 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2015
 | [TR-157a3](http://www.broadband-forum.org/technical/download/TR-157_Amendment-3.pdf) | TR-157 Amendment 3 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2010
 | [TR-159](http://www.broadband-forum.org/technical/download/TR-159.pdf) | TR-159 | Management Framework for xDSL Bonding | Broadband Forum | Technical Report | 2008
 | [TR-181i1](http://www.broadband-forum.org/technical/download/TR-181_Issue-1.pdf) | TR-181 Issue 1 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-181i2](http://www.broadband-forum.org/technical/download/TR-181_Issue-2.pdf) | TR-181 Issue 2 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-232](http://www.broadband-forum.org/technical/download/TR-232.pdf) | TR-232 | Bulk Data Collection | Broadband Forum | Technical Report | May 2012
 | [TR-262](http://www.broadband-forum.org/technical/download/TR-262.pdf) | TR-262 | Femto Component Objects | Broadband Forum | Technical Report | 2011
 | [TR-181i2a2](http://www.broadband-forum.org/technical/download/TR-181_Issue-2_Amendment-2.pdf) | TR-181 Issue 2 Amendment 2 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2011
 | [TR-181i2a5](http://www.broadband-forum.org/technical/download/TR-181_Issue-2_Amendment-5.pdf) | TR-181 Issue 2 Amendment 5 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2012
 | [TR-181i2a8](http://www.broadband-forum.org/technical/download/TR-181_Issue-2_Amendment-8.pdf) | TR-181 Issue 2 Amendment 8 | Device Data Model for TR-069 | Broadband Forum | Technical Report | September 2014
 | [UPA-PLC](http://www.upaplc.org) | Universal Powerline Association |  | UPA |  | 
 | [UPnP-DAv1](http://www.upnp.org/specs/arch/UPnP-arch-DeviceArchitecture-v1.0-20080424.pdf) | UPnP Device Architecture | UPnP Device Architecture 1.0 | UPnP Forum |  | April 2008
 | [UPnP-DAv11](http://www.upnp.org/specs/arch/UPnP-arch-DeviceArchitecture-v1.1.pdf) | UPnP Device Architecture 1.1 | UPnP Device Architecture 1.1 | UPnP Forum |  | October, 2008
 | [UPnP-DM:1](http://upnp.org/specs/dm/dm1/) | UPnP Device Management:1 | UPnP Device Management v1 |  |  | 
 | [UPnP-IGD:1](http://upnp.org/specs/gw/UPnP-gw-InternetGatewayDevice-v1-Device.pdf) | UPnP InternetGatewayDevice:1 | InternetGatewayDevice:1 Device Template Version 1.01 | UPnP | SDCP | 2001
 | [UPnP-IGD:2](http://upnp.org/specs/gw/UPnP-gw-InternetGatewayDevice-v2-Device.pdf) | UPnP InternetGatewayDevice:2 | InternetGatewayDevice:2 Device Template Version 1.01 | UPnP | SDCP | 2010
 | [USB1.0](http://www.usb.org/developers/docs/) | USB 1.0 | USB 1.0 Specification | USB-IF |  | January 1996
 | [USB2.0](http://www.usb.org/developers/docs/usb_20_122208.zip) | USB 2.0 | USB 2.0 Specification | USB-IF |  | April 2000
 | [USB3.0](http://www.usb.org/developers/docs/usb_30_spec.zip) | USB 3.0 | USB 3.0 Specification | USB-IF |  | November 2008
 | [WPSv1.0](http://www.wi-fi.org) | Wi-Fi Protected Setup Specification Version 1.0h | Wi-Fi Alliance |  |  | 2006
 | [Z-Wave](http://www.z-wave.com) | Z-Wave | Z-Wave website |  |  | 
 | [ZigBee](http://www.zigbee.org) | ZigBee | ZigBee Alliance website |  |  | 
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


