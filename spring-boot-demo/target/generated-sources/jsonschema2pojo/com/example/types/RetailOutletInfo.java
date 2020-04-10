
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
 * If a Question or concern is Retail outlet related then this section should be completed
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "retailOutletAddress",
    "visitDateAndTime"
})
public class RetailOutletInfo {

    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("retailOutletAddress")
    @JsonPropertyDescription("Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx")
    private RetailOutletAddress retailOutletAddress;
    /**
     * The date and time of visit to the retail outlet in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("visitDateAndTime")
    @JsonPropertyDescription("The date and time of visit to the retail outlet in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected")
    private Date visitDateAndTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("retailOutletAddress")
    public RetailOutletAddress getRetailOutletAddress() {
        return retailOutletAddress;
    }

    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("retailOutletAddress")
    public void setRetailOutletAddress(RetailOutletAddress retailOutletAddress) {
        this.retailOutletAddress = retailOutletAddress;
    }

    /**
     * The date and time of visit to the retail outlet in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("visitDateAndTime")
    public Date getVisitDateAndTime() {
        return visitDateAndTime;
    }

    /**
     * The date and time of visit to the retail outlet in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("visitDateAndTime")
    public void setVisitDateAndTime(Date visitDateAndTime) {
        this.visitDateAndTime = visitDateAndTime;
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
        sb.append(RetailOutletInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("retailOutletAddress");
        sb.append('=');
        sb.append(((this.retailOutletAddress == null)?"<null>":this.retailOutletAddress));
        sb.append(',');
        sb.append("visitDateAndTime");
        sb.append('=');
        sb.append(((this.visitDateAndTime == null)?"<null>":this.visitDateAndTime));
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
        result = ((result* 31)+((this.retailOutletAddress == null)? 0 :this.retailOutletAddress.hashCode()));
        result = ((result* 31)+((this.visitDateAndTime == null)? 0 :this.visitDateAndTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetailOutletInfo) == false) {
            return false;
        }
        RetailOutletInfo rhs = ((RetailOutletInfo) other);
        return ((((this.retailOutletAddress == rhs.retailOutletAddress)||((this.retailOutletAddress!= null)&&this.retailOutletAddress.equals(rhs.retailOutletAddress)))&&((this.visitDateAndTime == rhs.visitDateAndTime)||((this.visitDateAndTime!= null)&&this.visitDateAndTime.equals(rhs.visitDateAndTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
