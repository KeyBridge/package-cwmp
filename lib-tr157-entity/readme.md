# TR-157

Component Objects for CWMP

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

This document defines objects for use in CWMP managed devices.  The objects
may exist at the top level of a hierarchy, or in some cases within an
existing object.  The objects are intended for use in all CWMP Root
objects. The objects define varying functionality, diagnostics, etc. that
are agnostic to the type of device.

Editors:

* Tim Carey, Alcatel-Lucent

BroadbandHome™ Working Group Chairs:

* John Blackford, Pace
* Jason Walls, QACafe

Issue History (Filename: Approval Date: Publication Date: Changes):

* tr-157-1-0-0.xml: March 2009:

  - corresponds to TR-157 Issue 1, Section 4
(Data Model Definition) and Section 5 (Profile Definition)
* tr-157-1-1-0.xml: September 2009:

  - corresponds to TR-157 Issue 1 Amendment 1, Section 4
(Data Model Definition) and Section 5 (Profile Definition)
* tr-157-1-2-0.xml: May 2010:

  - corresponds to TR-157 Issue 1 Amendment 2
* tr-157-1-3-0.xml: December 2010:

  - corresponds to TR-157 Issue 1 Amendment 3
* tr-157-1-4-0.xml: September 2011:

  - updates for Alias-Based Addressing and Proxy Management
* tr-157-1-5-0.xml: December 2011:

  - updates related to 3GPP LTE and 3GPP2 cdma2000 (TR-196 Issue 2)
* tr-157-1-6-0.xml: May 2012:

  - updates for Bulk Data Collection (TR-232)
* tr-157-1-7-0.xml: November 2012:

  - new components for UPnP and DnsSd Discovery updates to
InternetGatewayDevice.DeviceInfo.SupportedDataModel.{i}.URL and
Proxy objects for Discovery and Proxy References
* tr-157-1-8-0.xml: November 2013:

  - updates for XMPP, HTTP Compression, Lightweight Notifications,
and the ManagementServer Standby Policy
* tr-157-1-9-0.xml: 8 September 2014: 17 September 2014:

  - Added Inform Parameters table to ManagementServer
  - Added HTIP Component to DeviceInfo containing HTIP related parameters
  - Updated the UPnP component for HTIP parameters
* tr-157-1-10-0.xml: 9 November 2015: 13 November 2015:

  - Update Bulk Data Collection for HTTP Transport


## Bibliography

| ID | Name | Title | Organization | Category | Date |
| --- | --- | --- | --- | --- | --- |
 | [IPDR-FTP](http://www.ipdr.org/public/) | IPDR File Transfer Protocol | IPDR/File Transfer Protocol | TM Forum |  | 
 | [IPDR-SP](http://www.ipdr.org/public/) | IPDR Streaming Protocol | IPDR Streaming Protocol (IPDR/SP) Specification | TM Forum |  | 
 | [IPDR-XDR](http://www.ipdr.org/public/) | IPDR XDR Encoding Format | IPDR/XDR Encoding Format | TM Forum |  | 
 | [IPDR-XML](http://www.ipdr.org/public/) | IPDR XML File Encoding Format | IPDR/XML File Encoding Format | TM Forum |  | 
 | [RFC2616](http://tools.ietf.org/html/rfc2616) | RFC 2616 | Hypertext Transfer Protocol -- HTTP/1.1 | IETF | RFC | 1999
 | [RFC3986](http://tools.ietf.org/html/rfc3986) | RFC 3986 | Uniform Resource Identifier (URI): Generic Syntax | IETF | RFC | 
 | [RFC4122](http://tools.ietf.org/html/rfc4122) | RFC 4122 | A Universally Unique IDentifier (UUID) URN Namespace | IETF | RFC | 2005
 | [RFC4180](http://tools.ietf.org/html/rfc4180) | RFC4180 | Common Format and MIME Type for Comma-Separated Values (CSV) Files | IETF | RFC | October 2005
 | [RFC4291](http://tools.ietf.org/html/rfc4291) | RFC 4291 | IP Version 6 Addressing Architecture | IETF | RFC | 2006
 | [RFC4632](http://tools.ietf.org/html/rfc4632) | RFC 4632 | Classless Inter-domain Routing (CIDR): The Internet Address Assignment and Aggregation Plan | IETF | RFC | 2006
 | [RFC7159](http://tools.ietf.org/html/rfc7159) | RFC7159 | The JavaScript Object Notation (JSON) Data Interchange Format | IETF | RFC | March 2014
 | [SOAP1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508) | Simple Object Access Protocol (SOAP) 1.1 |  | W3C |  | 
 | [TR-069](http://www.broadband-forum.org/technical/download/TR-069.pdf) | TR-069 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2004
 | [TR-069a4](http://www.broadband-forum.org/technical/download/TR-069_Amendment-4.pdf) | TR-069 Amendment 4 | CPE WAN Management Protocol | Broadband Forum | Technical Report | 2011
 | [TR-106a2](http://www.broadband-forum.org/technical/download/TR-106_Amendment-2.pdf) | TR-106 Amendment 2 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2008
 | [TR-106a7](http://www.broadband-forum.org/technical/download/TR-106_Amendment-7.pdf) | TR-106 Amendment 7 | Data Model Template for TR-069-Enabled Devices | Broadband Forum | Technical Report | 2013
 | [TR-157a10](http://www.broadband-forum.org/technical/download/TR-157_Amendment-10.pdf) | TR-157 Amendment 10 | Componnent Objects for CWMP | Broadband Forum | Technical Report | 2015
 | [TR-232](http://www.broadband-forum.org/technical/download/TR-232.pdf) | TR-232 | Bulk Data Collection | Broadband Forum | Technical Report | May 2012
 | [ZigBee2007](http://www.zigbee.org/Specifications/ZigBee/download.aspx) | ZigBee 2007 Specification | ZigBee 2007 Specification | ZigBee Alliance |  | October 2007


