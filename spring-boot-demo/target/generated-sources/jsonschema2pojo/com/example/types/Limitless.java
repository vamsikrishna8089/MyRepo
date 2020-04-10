
package com.example.types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the Limitless details from contact us request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transcriptTime",
    "transcriptDetails",
    "transcriptUrl",
    "transcriptDevice"
})
public class Limitless {

    /**
     * describes time
     * 
     */
    @JsonProperty("transcriptTime")
    @JsonPropertyDescription("describes time")
    private Date transcriptTime;
    /**
     * Details provided in the limitless transcript
     * 
     */
    @JsonProperty("transcriptDetails")
    @JsonPropertyDescription("Details provided in the limitless transcript")
    private String transcriptDetails;
    /**
     * describes url
     * 
     */
    @JsonProperty("transcriptUrl")
    @JsonPropertyDescription("describes url")
    private String transcriptUrl;
    /**
     * describes device
     * 
     */
    @JsonProperty("transcriptDevice")
    @JsonPropertyDescription("describes device")
    private String transcriptDevice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * describes time
     * 
     */
    @JsonProperty("transcriptTime")
    public Date getTranscriptTime() {
        return transcriptTime;
    }

    /**
     * describes time
     * 
     */
    @JsonProperty("transcriptTime")
    public void setTranscriptTime(Date transcriptTime) {
        this.transcriptTime = transcriptTime;
    }

    /**
     * Details provided in the limitless transcript
     * 
     */
    @JsonProperty("transcriptDetails")
    public String getTranscriptDetails() {
        return transcriptDetails;
    }

    /**
     * Details provided in the limitless transcript
     * 
     */
    @JsonProperty("transcriptDetails")
    public void setTranscriptDetails(String transcriptDetails) {
        this.transcriptDetails = transcriptDetails;
    }

    /**
     * describes url
     * 
     */
    @JsonProperty("transcriptUrl")
    public String getTranscriptUrl() {
        return transcriptUrl;
    }

    /**
     * describes url
     * 
     */
    @JsonProperty("transcriptUrl")
    public void setTranscriptUrl(String transcriptUrl) {
        this.transcriptUrl = transcriptUrl;
    }

    /**
     * describes device
     * 
     */
    @JsonProperty("transcriptDevice")
    public String getTranscriptDevice() {
        return transcriptDevice;
    }

    /**
     * describes device
     * 
     */
    @JsonProperty("transcriptDevice")
    public void setTranscriptDevice(String transcriptDevice) {
        this.transcriptDevice = transcriptDevice;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limitless.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transcriptTime");
        sb.append('=');
        sb.append(((this.transcriptTime == null)?"<null>":this.transcriptTime));
        sb.append(',');
        sb.append("transcriptDetails");
        sb.append('=');
        sb.append(((this.transcriptDetails == null)?"<null>":this.transcriptDetails));
        sb.append(',');
        sb.append("transcriptUrl");
        sb.append('=');
        sb.append(((this.transcriptUrl == null)?"<null>":this.transcriptUrl));
        sb.append(',');
        sb.append("transcriptDevice");
        sb.append('=');
        sb.append(((this.transcriptDevice == null)?"<null>":this.transcriptDevice));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.transcriptDetails == null)? 0 :this.transcriptDetails.hashCode()));
        result = ((result* 31)+((this.transcriptDevice == null)? 0 :this.transcriptDevice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transcriptTime == null)? 0 :this.transcriptTime.hashCode()));
        result = ((result* 31)+((this.transcriptUrl == null)? 0 :this.transcriptUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limitless) == false) {
            return false;
        }
        Limitless rhs = ((Limitless) other);
        return ((((((this.transcriptDetails == rhs.transcriptDetails)||((this.transcriptDetails!= null)&&this.transcriptDetails.equals(rhs.transcriptDetails)))&&((this.transcriptDevice == rhs.transcriptDevice)||((this.transcriptDevice!= null)&&this.transcriptDevice.equals(rhs.transcriptDevice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transcriptTime == rhs.transcriptTime)||((this.transcriptTime!= null)&&this.transcriptTime.equals(rhs.transcriptTime))))&&((this.transcriptUrl == rhs.transcriptUrl)||((this.transcriptUrl!= null)&&this.transcriptUrl.equals(rhs.transcriptUrl))));
    }

}
