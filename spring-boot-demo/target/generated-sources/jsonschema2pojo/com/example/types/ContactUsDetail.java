
package com.example.types;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Indicates the type of Contact Us contact
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enquiryType",
    "subject",
    "comment",
    "productInfo",
    "retailOutletInfo",
    "privacyEnquiry"
})
public class ContactUsDetail {

    /**
     * Type of enquiry for the contact
     * (Required)
     * 
     */
    @JsonProperty("enquiryType")
    @JsonPropertyDescription("Type of enquiry for the contact")
    private ContactUsDetail.EnquiryType enquiryType;
    /**
     * valid call center subject
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("valid call center subject")
    private String subject;
    /**
     * A free text field filled in by the consumer to explain their issue. TODO: Length to be decided
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A free text field filled in by the consumer to explain their issue. TODO: Length to be decided")
    private String comment;
    /**
     * If a Question or concern is Product related then this section should be completed
     * 
     */
    @JsonProperty("productInfo")
    @JsonPropertyDescription("If a Question or concern is Product related then this section should be completed")
    private ProductInfo productInfo;
    /**
     * If a Question or concern is Retail outlet related then this section should be completed
     * 
     */
    @JsonProperty("retailOutletInfo")
    @JsonPropertyDescription("If a Question or concern is Retail outlet related then this section should be completed")
    private RetailOutletInfo retailOutletInfo;
    /**
     * Privacy enquiry details
     * 
     */
    @JsonProperty("privacyEnquiry")
    @JsonPropertyDescription("Privacy enquiry details")
    private ContactUsDetail.PrivacyEnquiry privacyEnquiry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Type of enquiry for the contact
     * (Required)
     * 
     */
    @JsonProperty("enquiryType")
    public ContactUsDetail.EnquiryType getEnquiryType() {
        return enquiryType;
    }

    /**
     * Type of enquiry for the contact
     * (Required)
     * 
     */
    @JsonProperty("enquiryType")
    public void setEnquiryType(ContactUsDetail.EnquiryType enquiryType) {
        this.enquiryType = enquiryType;
    }

    /**
     * valid call center subject
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * valid call center subject
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * A free text field filled in by the consumer to explain their issue. TODO: Length to be decided
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * A free text field filled in by the consumer to explain their issue. TODO: Length to be decided
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * If a Question or concern is Product related then this section should be completed
     * 
     */
    @JsonProperty("productInfo")
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * If a Question or concern is Product related then this section should be completed
     * 
     */
    @JsonProperty("productInfo")
    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    /**
     * If a Question or concern is Retail outlet related then this section should be completed
     * 
     */
    @JsonProperty("retailOutletInfo")
    public RetailOutletInfo getRetailOutletInfo() {
        return retailOutletInfo;
    }

    /**
     * If a Question or concern is Retail outlet related then this section should be completed
     * 
     */
    @JsonProperty("retailOutletInfo")
    public void setRetailOutletInfo(RetailOutletInfo retailOutletInfo) {
        this.retailOutletInfo = retailOutletInfo;
    }

    /**
     * Privacy enquiry details
     * 
     */
    @JsonProperty("privacyEnquiry")
    public ContactUsDetail.PrivacyEnquiry getPrivacyEnquiry() {
        return privacyEnquiry;
    }

    /**
     * Privacy enquiry details
     * 
     */
    @JsonProperty("privacyEnquiry")
    public void setPrivacyEnquiry(ContactUsDetail.PrivacyEnquiry privacyEnquiry) {
        this.privacyEnquiry = privacyEnquiry;
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
        sb.append(ContactUsDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enquiryType");
        sb.append('=');
        sb.append(((this.enquiryType == null)?"<null>":this.enquiryType));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("productInfo");
        sb.append('=');
        sb.append(((this.productInfo == null)?"<null>":this.productInfo));
        sb.append(',');
        sb.append("retailOutletInfo");
        sb.append('=');
        sb.append(((this.retailOutletInfo == null)?"<null>":this.retailOutletInfo));
        sb.append(',');
        sb.append("privacyEnquiry");
        sb.append('=');
        sb.append(((this.privacyEnquiry == null)?"<null>":this.privacyEnquiry));
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
        result = ((result* 31)+((this.enquiryType == null)? 0 :this.enquiryType.hashCode()));
        result = ((result* 31)+((this.retailOutletInfo == null)? 0 :this.retailOutletInfo.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.privacyEnquiry == null)? 0 :this.privacyEnquiry.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productInfo == null)? 0 :this.productInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactUsDetail) == false) {
            return false;
        }
        ContactUsDetail rhs = ((ContactUsDetail) other);
        return ((((((((this.enquiryType == rhs.enquiryType)||((this.enquiryType!= null)&&this.enquiryType.equals(rhs.enquiryType)))&&((this.retailOutletInfo == rhs.retailOutletInfo)||((this.retailOutletInfo!= null)&&this.retailOutletInfo.equals(rhs.retailOutletInfo))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.privacyEnquiry == rhs.privacyEnquiry)||((this.privacyEnquiry!= null)&&this.privacyEnquiry.equals(rhs.privacyEnquiry))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.productInfo == rhs.productInfo)||((this.productInfo!= null)&&this.productInfo.equals(rhs.productInfo))));
    }


    /**
     * Type of enquiry for the contact
     * 
     */
    public enum EnquiryType {

        QUESTION("Question"),
        CONCERN("Concern"),
        PRIVACY("Privacy"),
        OTHER_ENQUIRY("Other Enquiry"),
        RIGHT_TO_ACCESS("Right to Access"),
        RIGHT_TO_DELETE("Right to Delete"),
        OPT_OUT_OF_SALE("Opt out of Sale"),
        NOT_SURE_WANT_TO_KNOW_MORE("Not Sure Want to Know More");
        private final String value;
        private final static Map<String, ContactUsDetail.EnquiryType> CONSTANTS = new HashMap<String, ContactUsDetail.EnquiryType>();

        static {
            for (ContactUsDetail.EnquiryType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EnquiryType(String value) {
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
        public static ContactUsDetail.EnquiryType fromValue(String value) {
            ContactUsDetail.EnquiryType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Privacy enquiry details
     * 
     */
    public enum PrivacyEnquiry {

        CHANGE_OF_PERSONAL_DETAILS("Change of Personal Details"),
        UNSUBSCRIBE("Unsubscribe"),
        OTHER_PERSONAL_DATA_REQUESTS("Other Personal Data Requests"),
        CONTACT_MY_LOCAL_DPO("Contact My Local DPO");
        private final String value;
        private final static Map<String, ContactUsDetail.PrivacyEnquiry> CONSTANTS = new HashMap<String, ContactUsDetail.PrivacyEnquiry>();

        static {
            for (ContactUsDetail.PrivacyEnquiry c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PrivacyEnquiry(String value) {
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
        public static ContactUsDetail.PrivacyEnquiry fromValue(String value) {
            ContactUsDetail.PrivacyEnquiry constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
