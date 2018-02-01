# TR-143

TR-069 Device:1.2 and InternetGatewayDevice:1.3 Root Object definition

Notice:


The Broadband Forum is a non-profit corporation organized to create
guidelines for broadband network system development and deployment.
This Broadband Forum Document has been approved by members of the
Forum. This Broadband Forum Document is not binding on the Broadband
Forum, any of its members, or any developer or service provider.
This Broadband Forum Document is subject to change, but only with
approval of members of the Forum.  This Document is copyrighted by
the Broadband Forum, and all rights are reserved.  Portions of this
Document may be copyrighted by Broadband Forum members.

This Broadband Forum Document is provided AS IS, WITH ALL FAULTS.
ANY PERSON HOLDING A COPYRIGHT IN THIS BROADBAND FORUM DOCUMENT,
OR ANY PORTION THEREOF, DISCLAIMS TO THE FULLEST EXTENT PERMITTED
BY LAW ANY REPRESENTATION OR WARRANTY, EXPRESS OR IMPLIED,
INCLUDING, BUT NOT LIMITED TO, ANY WARRANTY:


(a) OF ACCURACY, COMPLETENESS, MERCHANTABILITY, FITNESS FOR A
PARTICULAR PURPOSE, NON-INFRINGEMENT, OR TITLE;
(b) THAT THE CONTENTS OF THIS BROADBAND FORUM DOCUMENT ARE SUITABLE
FOR ANY PURPOSE, EVEN IF THAT PURPOSE IS KNOWN TO THE COPYRIGHT
HOLDER;
(c) THAT THE IMPLEMENTATION OF THE CONTENTS OF THE DOCUMENT WILL NOT
INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADEMARKS OR
OTHER RIGHTS.

By using this Broadband Forum Document, users acknowledge that
implementation may require licenses to patents.  The Broadband Forum
encourages but does not require its members to identify such
patents.  For a list of declarations made by Broadband Forum member
companies, please see http://www.broadband-forum.org.  No assurance
is given that licenses to patents necessary to implement this
Document will be available for license at all or on reasonable and
non-discriminatory terms.

ANY PERSON HOLDING A COPYRIGHT IN THIS BROADBAND FORUM DOCUMENT, OR
ANY PORTION THEREOF, DISCLAIMS TO THE FULLEST EXTENT PERMITTED BY
LAW (A) ANY LIABILITY (INCLUDING DIRECT, INDIRECT, SPECIAL, OR
CONSEQUENTIAL DAMAGES UNDER ANY LEGAL THEORY) ARISING FROM OR
RELATED TO THE USE OF OR RELIANCE UPON THIS DOCUMENT; AND (B) ANY
OBLIGATION TO UPDATE OR CORRECT THIS DOCUMENT.

Broadband Forum Documents may be copied, downloaded, stored on a
server or otherwise re-distributed in their entirety only, and may
not be modified without the advance written permission of the
Broadband Forum.

The text of this notice must be included in all copies of this
Broadband Forum Document.

Summary:

TR-069 Device:1.2 and InternetGatewayDevice:1.3 Root Object Definition.
Contains definition of Device:1.2 Root Object and Common Objects.
Contains definition of Device:2 specific components (but not the Device:2 model, which is in TR-181i2).

Version History:

November 2008: tr-143-1-0.xml, corresponds to TR-143 section 5 (Parameter Definitions),
section 6 (Notification Requirements) and section 7 (Profile
Definitions).
March 2009:    tr-143-1-0-1.xml, changed to use new global bibliography, plus a few
editorial changes.
May 2010:      tr-143-1-0-2.xml, corresponds to TR-143 Issue 1 Corrigenda 2.
Added two Device:2 specific components (DownloadDiagnostics_Device2
and UploadDiagnostics_Device2). Also brought in the tr-143 related changes (all editorial)
that had been implemented in the tr-106-1-2-0.xml file (otherwise these changes would not
have been visible to Device:2).


## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [BLUE](http://www.thefengs.com/wuchang/work/blue) | Blue | A New Class of Active Queue Management Algorithms |  |  | 
 | [HTML4.01](http://www.w3.org/TR/html4) | HTML 4.01 Specification |  | W3C |  | 
 | [OUI](http://standards.ieee.org/faqs/OUI.html) | Organizationally Unique Identifiers (OUIs) |  |  |  | 
 | [RED](http://www.icir.org/floyd/red.html) | References on RED (Random Early Detection) Queue Management |  |  |  | 
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
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-098](http://www.broadband-forum.org/technical/download/TR-098.pdf) | TR-098 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2005
 | [TR-098a1](http://www.broadband-forum.org/technical/download/TR-098_Amendment-1.pdf) | TR-098 Amendment 1 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2006
 | [TR-106](http://www.broadband-forum.org/technical/download/TR-106.pdf) | TR-106 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2005
 | [TR-106a1](http://www.broadband-forum.org/technical/download/TR-106_Amendment-1.pdf) | TR-106 Amendment 1 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2006
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-143](http://www.broadband-forum.org/technical/download/TR-143.pdf) | TR-143 | Enabling Network Throughput Performance Tests and Statistical Monitoring | Broadband Forum | Technical Report | 2008
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


