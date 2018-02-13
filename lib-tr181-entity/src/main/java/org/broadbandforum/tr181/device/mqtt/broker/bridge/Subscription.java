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
package org.broadbandforum.tr181.device.mqtt.broker.bridge;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * List of MQTT subscriptions handled over the bridge.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Broker.{i}.Bridge.{i}.Subscription.{i}.")
@XmlRootElement(name = "Device.MQTT.Broker.Bridge.Subscription")
@XmlType(name = "Device.MQTT.Broker.Bridge.Subscription")
@XmlAccessorType(XmlAccessType.FIELD)
public class Subscription {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Setting Enable to {{true}} activates the handling of this subscription instance. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic is subscribed over the bridge at the remote MQTT broker with a MQTT SUBSCRIBE message if {{param}} is set to {{true}} or unsubscribed from the remote MQTT broker with a MQTT UNSUBSCRIBE message if the value is set to {{false}}.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this subscription. {{enum}}

          The {{enum|Enabled}} value indicates that the this subscription is active. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic was successfully subscribed with the remote MQTT broker.

          The {{enum|Disabled}} value indicates that this subscription is not used.

          The {{enum|Error}} value indicates that an error occured (e.g. an subscription could not be made with the remote MQTT broker) and the subscription is not in use.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Name of the subscribed topic. Topic names may contain wildcards according to the rules specified in {{bibref|MQTT31|Appendix A}} and {{bibref|MQTT311|4.7}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Topic")
	@CWMPParameter(access = "readWrite")
	@Size(max = -1)
	public String topic;
	/**
	 * The direction of the subscription. {{enum}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Direction")
	@CWMPParameter(access = "readWrite")
	public String direction;
	/**
	 * The MQTT QoS level assigned with the subscription (see {{bibref|MQTT31|4.1}} and {{bibref|MQTT311|4.3}}).
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "QoS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2)
	public Long qos;
	/**
	 * The local prefix is used for remapping received topics to the local topics of the MQTT broker and to select the topics to be sent over bridge to the remote MQTT broker.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker adds the LocalPrefix in front of the received topic, before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "in"

          :: MQTT broker receives message with topic "/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For selection of the topics to be sent over the bridge the MQTT broker uses the combination of {{param}} and {{param|Topic}} to match the topics to be sent over bridge, and removes the {{param}} from the selected topic before sending it over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "LocalPrefix")
	@CWMPParameter(access = "readWrite")
	public String localPrefix;
	/**
	 * The remote prefix is used for remapping topics to the remote MQTT broker topic lists.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker removes the remote prefix topic from the received topic (before handling the {{param|LocalPrefix}}), before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker receives message with topic "/remote/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          : During activation of the bridge, the MQTT broker prepends the {{param|Topic}} with {{param}} topic and subscribes to the remote MQTT broker with it, in order to receive all applicable remote topics.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker sends a subscription to the remote MQTT broker with the topic "/remote/bus/+".

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For all topics to be sent over the bridge ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}), the RemotePrefix will be prepended to the topic after the {{param|LocalPrefix}} has been processed and before sending the message over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote" Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/remote/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "RemotePrefix")
	@CWMPParameter(access = "readWrite")
	public String remotePrefix;

	public Subscription() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 * @return this instance
	 */
	public Subscription withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the setting Enable to {{true}} activates the handling of this subscription instance. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic is subscribed over the bridge at the remote MQTT broker with a MQTT SUBSCRIBE message if {{param}} is set to {{true}} or unsubscribed from the remote MQTT broker with a MQTT UNSUBSCRIBE message if the value is set to {{false}}.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the setting Enable to {{true}} activates the handling of this subscription instance. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic is subscribed over the bridge at the remote MQTT broker with a MQTT SUBSCRIBE message if {{param}} is set to {{true}} or unsubscribed from the remote MQTT broker with a MQTT UNSUBSCRIBE message if the value is set to {{false}}.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the setting Enable to {{true}} activates the handling of this subscription instance. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic is subscribed over the bridge at the remote MQTT broker with a MQTT SUBSCRIBE message if {{param}} is set to {{true}} or unsubscribed from the remote MQTT broker with a MQTT UNSUBSCRIBE message if the value is set to {{false}}.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Subscription withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this subscription. {{enum}}

          The {{enum|Enabled}} value indicates that the this subscription is active. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic was successfully subscribed with the remote MQTT broker.

          The {{enum|Disabled}} value indicates that this subscription is not used.

          The {{enum|Error}} value indicates that an error occured (e.g. an subscription could not be made with the remote MQTT broker) and the subscription is not in use.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this subscription. {{enum}}

          The {{enum|Enabled}} value indicates that the this subscription is active. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic was successfully subscribed with the remote MQTT broker.

          The {{enum|Disabled}} value indicates that this subscription is not used.

          The {{enum|Error}} value indicates that an error occured (e.g. an subscription could not be made with the remote MQTT broker) and the subscription is not in use.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this subscription. {{enum}}

          The {{enum|Enabled}} value indicates that the this subscription is active. In case of incoming directions ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}) the topic was successfully subscribed with the remote MQTT broker.

          The {{enum|Disabled}} value indicates that this subscription is not used.

          The {{enum|Error}} value indicates that an error occured (e.g. an subscription could not be made with the remote MQTT broker) and the subscription is not in use.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Subscription withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the name of the subscribed topic. Topic names may contain wildcards according to the rules specified in {{bibref|MQTT31|Appendix A}} and {{bibref|MQTT311|4.7}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * Set the name of the subscribed topic. Topic names may contain wildcards according to the rules specified in {{bibref|MQTT31|Appendix A}} and {{bibref|MQTT311|4.7}}.
	 *
	 * @since 2.10
	 * @param topic the input value
	 */
	public void  setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * Set the name of the subscribed topic. Topic names may contain wildcards according to the rules specified in {{bibref|MQTT31|Appendix A}} and {{bibref|MQTT311|4.7}}.
	 *
	 * @since 2.10
	 * @param topic the input value
	 * @return this instance
	 */
	public Subscription withTopic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * Get the direction of the subscription. {{enum}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * Set the direction of the subscription. {{enum}}.
	 *
	 * @since 2.10
	 * @param direction the input value
	 */
	public void  setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * Set the direction of the subscription. {{enum}}.
	 *
	 * @since 2.10
	 * @param direction the input value
	 * @return this instance
	 */
	public Subscription withDirection(String direction) {
		this.direction = direction;
		return this;
	}

	/**
	 * Get the MQTT QoS level assigned with the subscription (see {{bibref|MQTT31|4.1}} and {{bibref|MQTT311|4.3}}).
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getQos() {
		return qos;
	}

	/**
	 * Set the MQTT QoS level assigned with the subscription (see {{bibref|MQTT31|4.1}} and {{bibref|MQTT311|4.3}}).
	 *
	 * @since 2.10
	 * @param qos the input value
	 */
	public void  setQos(Long qos) {
		this.qos = qos;
	}

	/**
	 * Set the MQTT QoS level assigned with the subscription (see {{bibref|MQTT31|4.1}} and {{bibref|MQTT311|4.3}}).
	 *
	 * @since 2.10
	 * @param qos the input value
	 * @return this instance
	 */
	public Subscription withQos(Long qos) {
		this.qos = qos;
		return this;
	}

	/**
	 * Get the local prefix is used for remapping received topics to the local topics of the MQTT broker and to select the topics to be sent over bridge to the remote MQTT broker.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker adds the LocalPrefix in front of the received topic, before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "in"

          :: MQTT broker receives message with topic "/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For selection of the topics to be sent over the bridge the MQTT broker uses the combination of {{param}} and {{param|Topic}} to match the topics to be sent over bridge, and removes the {{param}} from the selected topic before sending it over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getLocalPrefix() {
		return localPrefix;
	}

	/**
	 * Set the local prefix is used for remapping received topics to the local topics of the MQTT broker and to select the topics to be sent over bridge to the remote MQTT broker.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker adds the LocalPrefix in front of the received topic, before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "in"

          :: MQTT broker receives message with topic "/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For selection of the topics to be sent over the bridge the MQTT broker uses the combination of {{param}} and {{param|Topic}} to match the topics to be sent over bridge, and removes the {{param}} from the selected topic before sending it over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @param localPrefix the input value
	 */
	public void  setLocalPrefix(String localPrefix) {
		this.localPrefix = localPrefix;
	}

	/**
	 * Set the local prefix is used for remapping received topics to the local topics of the MQTT broker and to select the topics to be sent over bridge to the remote MQTT broker.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker adds the LocalPrefix in front of the received topic, before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "in"

          :: MQTT broker receives message with topic "/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For selection of the topics to be sent over the bridge the MQTT broker uses the combination of {{param}} and {{param|Topic}} to match the topics to be sent over bridge, and removes the {{param}} from the selected topic before sending it over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @param localPrefix the input value
	 * @return this instance
	 */
	public Subscription withLocalPrefix(String localPrefix) {
		this.localPrefix = localPrefix;
		return this;
	}

	/**
	 * Get the remote prefix is used for remapping topics to the remote MQTT broker topic lists.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker removes the remote prefix topic from the received topic (before handling the {{param|LocalPrefix}}), before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker receives message with topic "/remote/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          : During activation of the bridge, the MQTT broker prepends the {{param|Topic}} with {{param}} topic and subscribes to the remote MQTT broker with it, in order to receive all applicable remote topics.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker sends a subscription to the remote MQTT broker with the topic "/remote/bus/+".

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For all topics to be sent over the bridge ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}), the RemotePrefix will be prepended to the topic after the {{param|LocalPrefix}} has been processed and before sending the message over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote" Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/remote/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getRemotePrefix() {
		return remotePrefix;
	}

	/**
	 * Set the remote prefix is used for remapping topics to the remote MQTT broker topic lists.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker removes the remote prefix topic from the received topic (before handling the {{param|LocalPrefix}}), before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker receives message with topic "/remote/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          : During activation of the bridge, the MQTT broker prepends the {{param|Topic}} with {{param}} topic and subscribes to the remote MQTT broker with it, in order to receive all applicable remote topics.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker sends a subscription to the remote MQTT broker with the topic "/remote/bus/+".

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For all topics to be sent over the bridge ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}), the RemotePrefix will be prepended to the topic after the {{param|LocalPrefix}} has been processed and before sending the message over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote" Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/remote/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @param remotePrefix the input value
	 */
	public void  setRemotePrefix(String remotePrefix) {
		this.remotePrefix = remotePrefix;
	}

	/**
	 * Set the remote prefix is used for remapping topics to the remote MQTT broker topic lists.

          * In incoming direction ({{param|Direction}} is either {{enum|in|Direction}} or {{enum|both|Direction}}):

          : For remote topics received over the bridge the MQTT broker removes the remote prefix topic from the received topic (before handling the {{param|LocalPrefix}}), before processing it.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker receives message with topic "/remote/bus/tr181" over bridge => MQTT broker uses topic "/local/bus/tr181" for internal processing

          : During activation of the bridge, the MQTT broker prepends the {{param|Topic}} with {{param}} topic and subscribes to the remote MQTT broker with it, in order to receive all applicable remote topics.

          :: '' ''

          : ''Example:'' 

          :: Topic is "/bus/+", RemotePrefix is "/remote", Direction is "in"

          :: MQTT broker sends a subscription to the remote MQTT broker with the topic "/remote/bus/+".

          * In outgoing direction ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}):

          : For all topics to be sent over the bridge ({{param|Direction}} is either {{enum|out|Direction}} or {{enum|both|Direction}}), the RemotePrefix will be prepended to the topic after the {{param|LocalPrefix}} has been processed and before sending the message over the bridge.

          :: '' ''

          : ''Example:''

          :: Topic is "/bus/+", LocalPrefix is "/local", RemotePrefix is "/remote" Direction is "out"

          :: MQTT broker receives message with topic "/local/bus/tr181" from a MQTT client => MQTT broker sends topic "/remote/bus/tr181" to remote MQTT broker
	 *
	 * @since 2.10
	 * @param remotePrefix the input value
	 * @return this instance
	 */
	public Subscription withRemotePrefix(String remotePrefix) {
		this.remotePrefix = remotePrefix;
		return this;
	}

	//</editor-fold>

}