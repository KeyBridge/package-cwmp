# TR-106

TR-069 Device:1.2 Root Object errata and clarifications

Notice:

The Broadband Forum is a non-profit corporation organized to create
guidelines for broadband network system development and deployment. This
Broadband Forum XML Document has been approved by members of the Forum.
This Broadband Forum XML Document is not binding on the Broadband Forum,
any of its members, or any developer or service provider. This Broadband
Forum XML Document is subject to change, but only with approval of members
of the Forum.  This XML Document is copyrighted by the Broadband Forum,
and all rights are reserved.  Portions of this XML Document may be
copyrighted by Broadband Forum members.

This Broadband Forum XML Document is provided AS IS, WITH ALL FAULTS.
ANY PERSON HOLDING A COPYRIGHT IN THIS BROADBAND FORUM XML DOCUMENT,
OR ANY PORTION THEREOF, DISCLAIMS TO THE FULLEST EXTENT PERMITTED BY
LAW ANY REPRESENTATION OR WARRANTY, EXPRESS OR IMPLIED, INCLUDING, BUT
NOT LIMITED TO, ANY WARRANTY:


(A) OF ACCURACY, COMPLETENESS, MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE, NON-INFRINGEMENT, OR TITLE;
(B) THAT THE CONTENTS OF THIS BROADBAND FORUM XML DOCUMENT ARE SUITABLE
FOR ANY PURPOSE, EVEN IF THAT PURPOSE IS KNOWN TO THE COPYRIGHT HOLDER;
(C) THAT THE IMPLEMENTATION OF THE CONTENTS OF THE DOCUMENTATION WILL NOT
INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER
RIGHTS.

By using this Broadband Forum XML Document, users acknowledge that
implementation may require licenses to patents.  The Broadband Forum
encourages but does not require its members to identify such patents.
For a list of declarations made by Broadband Forum member companies,
please see http://www.broadband-forum.org.  No assurance is given that
licenses to patents necessary to implement this XML Document will be
available for license at all or on reasonable and non-discriminatory terms.

ANY PERSON HOLDING A COPYRIGHT IN THIS BROADBAND FORUM XML DOCUMENT, OR
ANY PORTION THEREOF, DISCLAIMS TO THE FULLEST EXTENT PERMITTED BY LAW
(A) ANY LIABILITY (INCLUDING DIRECT, INDIRECT, SPECIAL, OR CONSEQUENTIAL
DAMAGES UNDER ANY LEGAL THEORY) ARISING FROM OR RELATED TO THE USE OF OR
RELIANCE UPON THIS XML DOCUMENT; AND (B) ANY OBLIGATION TO UPDATE OR
CORRECT THIS XML DOCUMENT.

Broadband Forum XML Documents may be copied, downloaded, stored on a
server or otherwise re-distributed in their entirety only, and may not be
modified without the advance written permission of the Broadband Forum.

The text of this notice must be included in all copies.

Summary:

TR-069 Device:1.2 Root Object errata and clarifications.

Version History:

November 2008: tr-106-1-2-0.xml, corresponds to TR-106 Amendment 2 section
3.4 (Common Object Definitions), section 3.5 (Inform Require-
ments), section 3.6 (Notification Requirements) and section 4
(Profile Definitions).  Contains only the differences from
Device:1.2 as defined in TR-143.
September 2009: tr-106-1-2-0.xml (name unchanged)
  - removed duplicate bibrefs
  - fixed cwmp-datamodel.xsd to be cwmp-datamodel-1-0.xsd


## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [OUI](http://standards.ieee.org/faqs/OUI.html) | Organizationally Unique Identifiers (OUIs) |  |  |  | 
 | [RFC862](http://tools.ietf.org/html/rfc862) | RFC 862 | Echo Protocol | IETF | RFC | 1983
 | [RFC959](http://tools.ietf.org/html/rfc959) | RFC 959 | File Transfer Protocol | IETF | RFC | 1985
 | [RFC2616](http://tools.ietf.org/html/rfc2616) | RFC 2616 | Hypertext Transfer Protocol -- HTTP/1.1 | IETF | RFC | 1999
 | [RFC3066](http://tools.ietf.org/html/rfc3066) | RFC 3066 | Tags for the Identification of Languages | IETF | RFC | 
 | [RFC3489](http://tools.ietf.org/html/rfc3489) | RFC 3489 | STUN - Simple Traversal of User Datagram Protocol (UDP) Through Network Address Translators (NATs) | IETF | RFC | 
 | [RFC3986](http://tools.ietf.org/html/rfc3986) | RFC 3986 | Uniform Resource Identifier (URI): Generic Syntax | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-069](http://www.broadband-forum.org/technical/download/TR-069.pdf) | TR-069 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2004
 | [TR-069a1](http://www.broadband-forum.org/technical/download/TR-069_Amendment-1.pdf) | TR-069 Amendment 1 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2006
 | [TR-069a2](http://www.broadband-forum.org/technical/download/TR-069_Amendment-2.pdf) | TR-069 Amendment 2 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2007
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-106](http://www.broadband-forum.org/technical/download/TR-106.pdf) | TR-106 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2005
 | [TR-106a1](http://www.broadband-forum.org/technical/download/TR-106_Amendment-1.pdf) | TR-106 Amendment 1 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2006
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-143](http://www.broadband-forum.org/technical/download/TR-143.pdf) | TR-143 | Enabling Network Throughput Performance Tests and Statistical Monitoring | Broadband Forum | Technical Report | 2008
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


