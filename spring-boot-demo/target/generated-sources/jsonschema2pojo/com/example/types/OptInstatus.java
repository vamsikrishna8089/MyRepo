
package com.example.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OptInStatus element properties definition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel",
    "optinLevel",
    "optinValue",
    "subscribed"
})
public class OptInstatus {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("channel")
    private Channel channel;
    /**
     * The level within the Unilever Global Preference Hierarchy that the optin refers to. Provided by Unilever when the consumer of the service is on-boarded
     * 
     */
    @JsonProperty("optinLevel")
    @JsonPropertyDescription("The level within the Unilever Global Preference Hierarchy that the optin refers to. Provided by Unilever when the consumer of the service is on-boarded")
    private Integer optinLevel;
    /**
     * The value that relates to the level of the Global Preference Hierarchy that the optin refers to. For brand-level 3, examples would include 'Dove','Knorr'. Provided by Unilever when the consumer of the service is on-boarded.
     * 
     */
    @JsonProperty("optinValue")
    @JsonPropertyDescription("The value that relates to the level of the Global Preference Hierarchy that the optin refers to. For brand-level 3, examples would include 'Dove','Knorr'. Provided by Unilever when the consumer of the service is on-boarded.")
    private String optinValue;
    /**
     * Indicates whether the user opted in or out for this channel.
     * 
     */
    @JsonProperty("subscribed")
    @JsonPropertyDescription("Indicates whether the user opted in or out for this channel.")
    private Boolean subscribed;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * The level within the Unilever Global Preference Hierarchy that the optin refers to. Provided by Unilever when the consumer of the service is on-boarded
     * 
     */
    @JsonProperty("optinLevel")
    public Integer getOptinLevel() {
        return optinLevel;
    }

    /**
     * The level within the Unilever Global Preference Hierarchy that the optin refers to. Provided by Unilever when the consumer of the service is on-boarded
     * 
     */
    @JsonProperty("optinLevel")
    public void setOptinLevel(Integer optinLevel) {
        this.optinLevel = optinLevel;
    }

    /**
     * The value that relates to the level of the Global Preference Hierarchy that the optin refers to. For brand-level 3, examples would include 'Dove','Knorr'. Provided by Unilever when the consumer of the service is on-boarded.
     * 
     */
    @JsonProperty("optinValue")
    public String getOptinValue() {
        return optinValue;
    }

    /**
     * The value that relates to the level of the Global Preference Hierarchy that the optin refers to. For brand-level 3, examples would include 'Dove','Knorr'. Provided by Unilever when the consumer of the service is on-boarded.
     * 
     */
    @JsonProperty("optinValue")
    public void setOptinValue(String optinValue) {
        this.optinValue = optinValue;
    }

    /**
     * Indicates whether the user opted in or out for this channel.
     * 
     */
    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    /**
     * Indicates whether the user opted in or out for this channel.
     * 
     */
    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OptInstatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("optinLevel");
        sb.append('=');
        sb.append(((this.optinLevel == null)?"<null>":this.optinLevel));
        sb.append(',');
        sb.append("optinValue");
        sb.append('=');
        sb.append(((this.optinValue == null)?"<null>":this.optinValue));
        sb.append(',');
        sb.append("subscribed");
        sb.append('=');
        sb.append(((this.subscribed == null)?"<null>":this.subscribed));
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
        result = ((result* 31)+((this.subscribed == null)? 0 :this.subscribed.hashCode()));
        result = ((result* 31)+((this.optinValue == null)? 0 :this.optinValue.hashCode()));
        result = ((result* 31)+((this.optinLevel == null)? 0 :this.optinLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OptInstatus) == false) {
            return false;
        }
        OptInstatus rhs = ((OptInstatus) other);
        return (((((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel)))&&((this.subscribed == rhs.subscribed)||((this.subscribed!= null)&&this.subscribed.equals(rhs.subscribed))))&&((this.optinValue == rhs.optinValue)||((this.optinValue!= null)&&this.optinValue.equals(rhs.optinValue))))&&((this.optinLevel == rhs.optinLevel)||((this.optinLevel!= null)&&this.optinLevel.equals(rhs.optinLevel))));
    }

}
