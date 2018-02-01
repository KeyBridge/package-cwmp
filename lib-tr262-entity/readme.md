# TR-262


Femto Component Objects

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

This document defines optional components for Femto for use in CWMP managed
devices. The objects may exist at the top level of a hierarchy, or in some
cases within an existing object. The objects are intended for use in all CWMP Root
objects. The objects define varying functionality for Femto like:

  - GPS
  - Tunnel
  - Performance Management
  - Application Platform

Editor:

Klaus Wich, Nokia Siemens Networks

BroadbandHome™ Working Group Chairs:

Greg Bathrick, PMC-Sierra
Jason Walls, UNH

Version History:

* November 2011: tr-262-1-0-0.xml, corresponds to TR-262 Issue 1.


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
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4301](http://tools.ietf.org/html/rfc4301) | RFC 4301 | Security Architecture for the Internet Protocol | IETF | RFC | December 2005
 | [RFC4307](http://tools.ietf.org/html/rfc4307) | RFC 4307 | Cryptographic Algorithms for Use in the Internet Key Exchange Version 2 (IKEv2) | IETF | RFC | December 2005
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC4835](http://tools.ietf.org/html/rfc4835) | RFC 4835 | Cryptographic Algorithm Implementation Requirements for Encapsulating Security Payload (ESP) and Authentication Header (AH) | IETF | RFC | 2007
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-098](http://www.broadband-forum.org/technical/download/TR-098.pdf) | TR-098 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2005
 | [TR-098a2](http://www.broadband-forum.org/technical/download/TR-098_Amendment-2.pdf) | TR-098 Amendment 2 | Internet Gateway Device Data Model for TR-069 | Broadband Forum | Technical Report | 2008
 | [TR-106a4](http://www.broadband-forum.org/technical/download/TR-106_Amendment-4.pdf) | TR-106 Amendment 4 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2010
 | [TR-106a6](http://www.broadband-forum.org/technical/download/TR-106_Amendment-6.pdf) | TR-106 Amendment 6 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2011
 | [TR-157a5](http://www.broadband-forum.org/technical/download/TR-157_Amendment-5.pdf) | TR-157 Amendment 5 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2011
 | [TR-181i1](http://www.broadband-forum.org/technical/download/TR-181_Issue-1.pdf) | TR-181 Issue 1 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-181i2](http://www.broadband-forum.org/technical/download/TR-181_Issue-2.pdf) | TR-181 Issue 2 | Device Data Model for TR-069 | Broadband Forum | Technical Report | 2010
 | [TR-196i2](http://www.broadband-forum.org/technical/download/TR-196_Issue-2.pdf) | TR-196 Issue 2 | Femto Access Point Service Data Model | Broadband Forum | Technical Report | 2011
 | [TR-262](http://www.broadband-forum.org/technical/download/TR-262.pdf) | TR-262 | Femto Component Objects | Broadband Forum | Technical Report | 2011


