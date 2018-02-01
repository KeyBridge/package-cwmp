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
package org.broadbandforum.tr181.device.mqtt.client;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * List of MQTT subscriptions handled by the MQTT client.

        The MQTT client MUST subscribe with the MQTT broker for all subscription instances, whose parameter {{param|Enable}} is set to {{true}}, when it establishes a new connection to the MQTT broker. Disabled subscription instances with {{param|Enable}} set to {{false}} will be ignored during connection establishment.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Client.{i}.Subscription.{i}.")
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
	 * Setting Enable to {{true}} means the topic is subscribed at the MQTT broker with a MQTT SUBSCRIBE message, setting it to {{false}} will unsubscribe the topic from the MQTT broker with a MQTT UNSUBSCRIBE message. If the MQTT client is already connected with the Broker ({{param|#.Status}} is {{enum|Connected|#.Status}}), the MQTT SUBSCRIBE or UNSUBSCRIBE message is sent directly, otherwise it is sent after the next successful connect.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this subscription. {{enum}}

          The {{enum|Subscribed}} value indicates that the topic was successfully subscribed with the MQTT broker, the MQTT client received the SUBACK message for this topic from the server.

          The {{enum|Subscribing}} value MAY be used by the CPE to indicate that the a SUBSCRIBE message for this topic was sent, and the CPE is waiting for a SUBACK message.

          The {{enum|Unsubscribed}} value indicates that the topic is not reqistered with the MQTT broker.

          The {{enum|Unsubscribing}} value MAY be used by the CPE to indicate that the an UNSUBSCRIBE message for this topic was sent, and the CPE is waiting for an UNSUBACK message.

          If the {{param|Enable}} is set to {{false}} the status MUST be either {{enum|Unsubscribed}} or if the unsubscription failed {{enum|Error}}.
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
	 * The MQTT QoS level assigned with the subscription (see {{bibref|MQTT31|4.1}} and {{bibref|MQTT311|4.3}}).
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "QoS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2)
	public Long qos;

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
	 * Get the setting Enable to {{true}} means the topic is subscribed at the MQTT broker with a MQTT SUBSCRIBE message, setting it to {{false}} will unsubscribe the topic from the MQTT broker with a MQTT UNSUBSCRIBE message. If the MQTT client is already connected with the Broker ({{param|#.Status}} is {{enum|Connected|#.Status}}), the MQTT SUBSCRIBE or UNSUBSCRIBE message is sent directly, otherwise it is sent after the next successful connect.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the setting Enable to {{true}} means the topic is subscribed at the MQTT broker with a MQTT SUBSCRIBE message, setting it to {{false}} will unsubscribe the topic from the MQTT broker with a MQTT UNSUBSCRIBE message. If the MQTT client is already connected with the Broker ({{param|#.Status}} is {{enum|Connected|#.Status}}), the MQTT SUBSCRIBE or UNSUBSCRIBE message is sent directly, otherwise it is sent after the next successful connect.

          The actual status of the subscription is indicated with {{param|Status}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the setting Enable to {{true}} means the topic is subscribed at the MQTT broker with a MQTT SUBSCRIBE message, setting it to {{false}} will unsubscribe the topic from the MQTT broker with a MQTT UNSUBSCRIBE message. If the MQTT client is already connected with the Broker ({{param|#.Status}} is {{enum|Connected|#.Status}}), the MQTT SUBSCRIBE or UNSUBSCRIBE message is sent directly, otherwise it is sent after the next successful connect.

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

          The {{enum|Subscribed}} value indicates that the topic was successfully subscribed with the MQTT broker, the MQTT client received the SUBACK message for this topic from the server.

          The {{enum|Subscribing}} value MAY be used by the CPE to indicate that the a SUBSCRIBE message for this topic was sent, and the CPE is waiting for a SUBACK message.

          The {{enum|Unsubscribed}} value indicates that the topic is not reqistered with the MQTT broker.

          The {{enum|Unsubscribing}} value MAY be used by the CPE to indicate that the an UNSUBSCRIBE message for this topic was sent, and the CPE is waiting for an UNSUBACK message.

          If the {{param|Enable}} is set to {{false}} the status MUST be either {{enum|Unsubscribed}} or if the unsubscription failed {{enum|Error}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this subscription. {{enum}}

          The {{enum|Subscribed}} value indicates that the topic was successfully subscribed with the MQTT broker, the MQTT client received the SUBACK message for this topic from the server.

          The {{enum|Subscribing}} value MAY be used by the CPE to indicate that the a SUBSCRIBE message for this topic was sent, and the CPE is waiting for a SUBACK message.

          The {{enum|Unsubscribed}} value indicates that the topic is not reqistered with the MQTT broker.

          The {{enum|Unsubscribing}} value MAY be used by the CPE to indicate that the an UNSUBSCRIBE message for this topic was sent, and the CPE is waiting for an UNSUBACK message.

          If the {{param|Enable}} is set to {{false}} the status MUST be either {{enum|Unsubscribed}} or if the unsubscription failed {{enum|Error}}.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this subscription. {{enum}}

          The {{enum|Subscribed}} value indicates that the topic was successfully subscribed with the MQTT broker, the MQTT client received the SUBACK message for this topic from the server.

          The {{enum|Subscribing}} value MAY be used by the CPE to indicate that the a SUBSCRIBE message for this topic was sent, and the CPE is waiting for a SUBACK message.

          The {{enum|Unsubscribed}} value indicates that the topic is not reqistered with the MQTT broker.

          The {{enum|Unsubscribing}} value MAY be used by the CPE to indicate that the an UNSUBSCRIBE message for this topic was sent, and the CPE is waiting for an UNSUBACK message.

          If the {{param|Enable}} is set to {{false}} the status MUST be either {{enum|Unsubscribed}} or if the unsubscription failed {{enum|Error}}.
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

	//</editor-fold>

}