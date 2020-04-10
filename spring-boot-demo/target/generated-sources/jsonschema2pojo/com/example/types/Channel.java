
package com.example.types;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel"
})
public class Channel {

    /**
     * Representing the channel that the opt-in information relates to. The allowed values are EM stands for 'Email', FB stands for 'Facebook', IN stands for 'Instagram', MO stands for 'Mobile phone', PH stands for 'Phone', PI stands for 'Pintrest', TW stands for 'Twitter'.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("Representing the channel that the opt-in information relates to. The allowed values are EM stands for 'Email', FB stands for 'Facebook', IN stands for 'Instagram', MO stands for 'Mobile phone', PH stands for 'Phone', PI stands for 'Pintrest', TW stands for 'Twitter'.")
    private Channel.Channel channel;

    /**
     * Representing the channel that the opt-in information relates to. The allowed values are EM stands for 'Email', FB stands for 'Facebook', IN stands for 'Instagram', MO stands for 'Mobile phone', PH stands for 'Phone', PI stands for 'Pintrest', TW stands for 'Twitter'.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public Channel.Channel getChannel() {
        return channel;
    }

    /**
     * Representing the channel that the opt-in information relates to. The allowed values are EM stands for 'Email', FB stands for 'Facebook', IN stands for 'Instagram', MO stands for 'Mobile phone', PH stands for 'Phone', PI stands for 'Pintrest', TW stands for 'Twitter'.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(Channel.Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Channel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel) == false) {
            return false;
        }
        Channel rhs = ((Channel) other);
        return ((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel)));
    }


    /**
     * Representing the channel that the opt-in information relates to. The allowed values are EM stands for 'Email', FB stands for 'Facebook', IN stands for 'Instagram', MO stands for 'Mobile phone', PH stands for 'Phone', PI stands for 'Pintrest', TW stands for 'Twitter'.
     * 
     */
    public enum Channel {

        EM("EM"),
        FB("FB"),
        IN("IN"),
        MO("MO"),
        PH("PH"),
        PI("PI"),
        TW("TW");
        private final String value;
        private final static Map<String, Channel.Channel> CONSTANTS = new HashMap<String, Channel.Channel>();

        static {
            for (Channel.Channel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Channel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Channel.Channel fromValue(String value) {
            Channel.Channel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
