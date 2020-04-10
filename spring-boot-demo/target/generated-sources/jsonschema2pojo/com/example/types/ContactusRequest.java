
package com.example.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Allows the insertion of a Contact Us request into Unilever backend systems
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brandCode",
    "origin",
    "socialOrigin",
    "brandAmbassadorStatus",
    "caseComment",
    "country",
    "consumer",
    "contactUsDetail",
    "Limitless",
    "additionalFields"
})
public class ContactusRequest {

    /**
     * A code identifying the brand. Brand codes should follow UL Master data coding wherever possible
     * (Required)
     * 
     */
    @JsonProperty("brandCode")
    @JsonPropertyDescription("A code identifying the brand. Brand codes should follow UL Master data coding wherever possible")
    private String brandCode;
    /**
     * Origin of the case
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("Origin of the case")
    private String origin;
    /**
     * Social Origin of the case
     * 
     */
    @JsonProperty("socialOrigin")
    @JsonPropertyDescription("Social Origin of the case")
    private String socialOrigin;
    /**
     * brand ambassidor status
     * 
     */
    @JsonProperty("brandAmbassadorStatus")
    @JsonPropertyDescription("brand ambassidor status")
    private String brandAmbassadorStatus;
    /**
     * A free text field filled in by the consumer to explain their issue.
     * 
     */
    @JsonProperty("caseComment")
    @JsonPropertyDescription("A free text field filled in by the consumer to explain their issue.")
    private String caseComment;
    /**
     * The country in which the contact us request is based in ISO-3166-1 standard
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country in which the contact us request is based in ISO-3166-1 standard")
    private String country;
    /**
     * Describes the Consumer who is making this contact us request
     * (Required)
     * 
     */
    @JsonProperty("consumer")
    @JsonPropertyDescription("Describes the Consumer who is making this contact us request")
    private Consumer consumer;
    /**
     * Indicates the type of Contact Us contact
     * (Required)
     * 
     */
    @JsonProperty("contactUsDetail")
    @JsonPropertyDescription("Indicates the type of Contact Us contact")
    private ContactUsDetail contactUsDetail;
    /**
     * Describes the Limitless details from contact us request
     * 
     */
    @JsonProperty("Limitless")
    @JsonPropertyDescription("Describes the Limitless details from contact us request")
    private Limitless limitless;
    /**
     * Additional fields which will be mapped into the Case description within the carelines system.  Approval from the Carelines Product owner should be sought before using this section
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("Additional fields which will be mapped into the Case description within the carelines system.  Approval from the Carelines Product owner should be sought before using this section")
    private List<Object> additionalFields = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A code identifying the brand. Brand codes should follow UL Master data coding wherever possible
     * (Required)
     * 
     */
    @JsonProperty("brandCode")
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * A code identifying the brand. Brand codes should follow UL Master data coding wherever possible
     * (Required)
     * 
     */
    @JsonProperty("brandCode")
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * Origin of the case
     * 
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin of the case
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Social Origin of the case
     * 
     */
    @JsonProperty("socialOrigin")
    public String getSocialOrigin() {
        return socialOrigin;
    }

    /**
     * Social Origin of the case
     * 
     */
    @JsonProperty("socialOrigin")
    public void setSocialOrigin(String socialOrigin) {
        this.socialOrigin = socialOrigin;
    }

    /**
     * brand ambassidor status
     * 
     */
    @JsonProperty("brandAmbassadorStatus")
    public String getBrandAmbassadorStatus() {
        return brandAmbassadorStatus;
    }

    /**
     * brand ambassidor status
     * 
     */
    @JsonProperty("brandAmbassadorStatus")
    public void setBrandAmbassadorStatus(String brandAmbassadorStatus) {
        this.brandAmbassadorStatus = brandAmbassadorStatus;
    }

    /**
     * A free text field filled in by the consumer to explain their issue.
     * 
     */
    @JsonProperty("caseComment")
    public String getCaseComment() {
        return caseComment;
    }

    /**
     * A free text field filled in by the consumer to explain their issue.
     * 
     */
    @JsonProperty("caseComment")
    public void setCaseComment(String caseComment) {
        this.caseComment = caseComment;
    }

    /**
     * The country in which the contact us request is based in ISO-3166-1 standard
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * The country in which the contact us request is based in ISO-3166-1 standard
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Describes the Consumer who is making this contact us request
     * (Required)
     * 
     */
    @JsonProperty("consumer")
    public Consumer getConsumer() {
        return consumer;
    }

    /**
     * Describes the Consumer who is making this contact us request
     * (Required)
     * 
     */
    @JsonProperty("consumer")
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    /**
     * Indicates the type of Contact Us contact
     * (Required)
     * 
     */
    @JsonProperty("contactUsDetail")
    public ContactUsDetail getContactUsDetail() {
        return contactUsDetail;
    }

    /**
     * Indicates the type of Contact Us contact
     * (Required)
     * 
     */
    @JsonProperty("contactUsDetail")
    public void setContactUsDetail(ContactUsDetail contactUsDetail) {
        this.contactUsDetail = contactUsDetail;
    }

    /**
     * Describes the Limitless details from contact us request
     * 
     */
    @JsonProperty("Limitless")
    public Limitless getLimitless() {
        return limitless;
    }

    /**
     * Describes the Limitless details from contact us request
     * 
     */
    @JsonProperty("Limitless")
    public void setLimitless(Limitless limitless) {
        this.limitless = limitless;
    }

    /**
     * Additional fields which will be mapped into the Case description within the carelines system.  Approval from the Carelines Product owner should be sought before using this section
     * 
     */
    @JsonProperty("additionalFields")
    public List<Object> getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Additional fields which will be mapped into the Case description within the carelines system.  Approval from the Carelines Product owner should be sought before using this section
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<Object> additionalFields) {
        this.additionalFields = additionalFields;
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
        sb.append(ContactusRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brandCode");
        sb.append('=');
        sb.append(((this.brandCode == null)?"<null>":this.brandCode));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("socialOrigin");
        sb.append('=');
        sb.append(((this.socialOrigin == null)?"<null>":this.socialOrigin));
        sb.append(',');
        sb.append("brandAmbassadorStatus");
        sb.append('=');
        sb.append(((this.brandAmbassadorStatus == null)?"<null>":this.brandAmbassadorStatus));
        sb.append(',');
        sb.append("caseComment");
        sb.append('=');
        sb.append(((this.caseComment == null)?"<null>":this.caseComment));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null)?"<null>":this.consumer));
        sb.append(',');
        sb.append("contactUsDetail");
        sb.append('=');
        sb.append(((this.contactUsDetail == null)?"<null>":this.contactUsDetail));
        sb.append(',');
        sb.append("limitless");
        sb.append('=');
        sb.append(((this.limitless == null)?"<null>":this.limitless));
        sb.append(',');
        sb.append("additionalFields");
        sb.append('=');
        sb.append(((this.additionalFields == null)?"<null>":this.additionalFields));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.brandAmbassadorStatus == null)? 0 :this.brandAmbassadorStatus.hashCode()));
        result = ((result* 31)+((this.additionalFields == null)? 0 :this.additionalFields.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.caseComment == null)? 0 :this.caseComment.hashCode()));
        result = ((result* 31)+((this.limitless == null)? 0 :this.limitless.hashCode()));
        result = ((result* 31)+((this.socialOrigin == null)? 0 :this.socialOrigin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.brandCode == null)? 0 :this.brandCode.hashCode()));
        result = ((result* 31)+((this.contactUsDetail == null)? 0 :this.contactUsDetail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactusRequest) == false) {
            return false;
        }
        ContactusRequest rhs = ((ContactusRequest) other);
        return ((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.brandAmbassadorStatus == rhs.brandAmbassadorStatus)||((this.brandAmbassadorStatus!= null)&&this.brandAmbassadorStatus.equals(rhs.brandAmbassadorStatus))))&&((this.additionalFields == rhs.additionalFields)||((this.additionalFields!= null)&&this.additionalFields.equals(rhs.additionalFields))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.caseComment == rhs.caseComment)||((this.caseComment!= null)&&this.caseComment.equals(rhs.caseComment))))&&((this.limitless == rhs.limitless)||((this.limitless!= null)&&this.limitless.equals(rhs.limitless))))&&((this.socialOrigin == rhs.socialOrigin)||((this.socialOrigin!= null)&&this.socialOrigin.equals(rhs.socialOrigin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.brandCode == rhs.brandCode)||((this.brandCode!= null)&&this.brandCode.equals(rhs.brandCode))))&&((this.contactUsDetail == rhs.contactUsDetail)||((this.contactUsDetail!= null)&&this.contactUsDetail.equals(rhs.contactUsDetail))));
    }

}
