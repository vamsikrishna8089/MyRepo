
package com.example.types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
 * Describes the Consumer who is making this contact us request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "legalAgeConfirmation",
    "language",
    "applicationId",
    "identity",
    "contactDetail",
    "dateOfBirth",
    "gender",
    "address",
    "optInStatus"
})
public class Consumer {

    /**
     * Indicates whether age consent is granted or not
     * 
     */
    @JsonProperty("legalAgeConfirmation")
    @JsonPropertyDescription("Indicates whether age consent is granted or not")
    private Boolean legalAgeConfirmation;
    /**
     * The preferred language of the individual in ISO-639-1 standard
     * (Required)
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("The preferred language of the individual in ISO-639-1 standard")
    private String language;
    /**
     * The application ID of the consumer
     * 
     */
    @JsonProperty("applicationId")
    @JsonPropertyDescription("The application ID of the consumer")
    private String applicationId;
    /**
     * Indicates where identity details will be received.
     * (Required)
     * 
     */
    @JsonProperty("identity")
    @JsonPropertyDescription("Indicates where identity details will be received.")
    private Identity identity;
    /**
     * consumer contact details
     * (Required)
     * 
     */
    @JsonProperty("contactDetail")
    @JsonPropertyDescription("consumer contact details")
    private List<Object> contactDetail = new ArrayList<Object>();
    /**
     * The Date of Birth of the individual in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("The Date of Birth of the individual in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected")
    private Date dateOfBirth;
    /**
     * From http://tools.ietf.org/html/rfc6350#page-32.  This corresponds,to the (biological) sex of the individual.  The allowed values are M stands for 'male', F stands for 'female', O stands for 'other', N stands for 'none or not applicable', U stands for 'unknown'.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("From http://tools.ietf.org/html/rfc6350#page-32.  This corresponds,to the (biological) sex of the individual.  The allowed values are M stands for 'male', F stands for 'female', O stands for 'other', N stands for 'none or not applicable', U stands for 'unknown'.")
    private Consumer.Gender gender;
    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx")
    private Address address;
    /**
     * OptInStatus element properties definition.
     * 
     */
    @JsonProperty("optInStatus")
    @JsonPropertyDescription("OptInStatus element properties definition.")
    private List<OptInstatus> optInStatus = new ArrayList<OptInstatus>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Indicates whether age consent is granted or not
     * 
     */
    @JsonProperty("legalAgeConfirmation")
    public Boolean getLegalAgeConfirmation() {
        return legalAgeConfirmation;
    }

    /**
     * Indicates whether age consent is granted or not
     * 
     */
    @JsonProperty("legalAgeConfirmation")
    public void setLegalAgeConfirmation(Boolean legalAgeConfirmation) {
        this.legalAgeConfirmation = legalAgeConfirmation;
    }

    /**
     * The preferred language of the individual in ISO-639-1 standard
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * The preferred language of the individual in ISO-639-1 standard
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * The application ID of the consumer
     * 
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The application ID of the consumer
     * 
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Indicates where identity details will be received.
     * (Required)
     * 
     */
    @JsonProperty("identity")
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Indicates where identity details will be received.
     * (Required)
     * 
     */
    @JsonProperty("identity")
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * consumer contact details
     * (Required)
     * 
     */
    @JsonProperty("contactDetail")
    public List<Object> getContactDetail() {
        return contactDetail;
    }

    /**
     * consumer contact details
     * (Required)
     * 
     */
    @JsonProperty("contactDetail")
    public void setContactDetail(List<Object> contactDetail) {
        this.contactDetail = contactDetail;
    }

    /**
     * The Date of Birth of the individual in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("dateOfBirth")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The Date of Birth of the individual in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * From http://tools.ietf.org/html/rfc6350#page-32.  This corresponds,to the (biological) sex of the individual.  The allowed values are M stands for 'male', F stands for 'female', O stands for 'other', N stands for 'none or not applicable', U stands for 'unknown'.
     * 
     */
    @JsonProperty("gender")
    public Consumer.Gender getGender() {
        return gender;
    }

    /**
     * From http://tools.ietf.org/html/rfc6350#page-32.  This corresponds,to the (biological) sex of the individual.  The allowed values are M stands for 'male', F stands for 'female', O stands for 'other', N stands for 'none or not applicable', U stands for 'unknown'.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Consumer.Gender gender) {
        this.gender = gender;
    }

    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * OptInStatus element properties definition.
     * 
     */
    @JsonProperty("optInStatus")
    public List<OptInstatus> getOptInStatus() {
        return optInStatus;
    }

    /**
     * OptInStatus element properties definition.
     * 
     */
    @JsonProperty("optInStatus")
    public void setOptInStatus(List<OptInstatus> optInStatus) {
        this.optInStatus = optInStatus;
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
        sb.append(Consumer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("legalAgeConfirmation");
        sb.append('=');
        sb.append(((this.legalAgeConfirmation == null)?"<null>":this.legalAgeConfirmation));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("applicationId");
        sb.append('=');
        sb.append(((this.applicationId == null)?"<null>":this.applicationId));
        sb.append(',');
        sb.append("identity");
        sb.append('=');
        sb.append(((this.identity == null)?"<null>":this.identity));
        sb.append(',');
        sb.append("contactDetail");
        sb.append('=');
        sb.append(((this.contactDetail == null)?"<null>":this.contactDetail));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("optInStatus");
        sb.append('=');
        sb.append(((this.optInStatus == null)?"<null>":this.optInStatus));
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
        result = ((result* 31)+((this.contactDetail == null)? 0 :this.contactDetail.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.identity == null)? 0 :this.identity.hashCode()));
        result = ((result* 31)+((this.optInStatus == null)? 0 :this.optInStatus.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applicationId == null)? 0 :this.applicationId.hashCode()));
        result = ((result* 31)+((this.legalAgeConfirmation == null)? 0 :this.legalAgeConfirmation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Consumer) == false) {
            return false;
        }
        Consumer rhs = ((Consumer) other);
        return (((((((((((this.contactDetail == rhs.contactDetail)||((this.contactDetail!= null)&&this.contactDetail.equals(rhs.contactDetail)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.identity == rhs.identity)||((this.identity!= null)&&this.identity.equals(rhs.identity))))&&((this.optInStatus == rhs.optInStatus)||((this.optInStatus!= null)&&this.optInStatus.equals(rhs.optInStatus))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applicationId == rhs.applicationId)||((this.applicationId!= null)&&this.applicationId.equals(rhs.applicationId))))&&((this.legalAgeConfirmation == rhs.legalAgeConfirmation)||((this.legalAgeConfirmation!= null)&&this.legalAgeConfirmation.equals(rhs.legalAgeConfirmation))));
    }


    /**
     * From http://tools.ietf.org/html/rfc6350#page-32.  This corresponds,to the (biological) sex of the individual.  The allowed values are M stands for 'male', F stands for 'female', O stands for 'other', N stands for 'none or not applicable', U stands for 'unknown'.
     * 
     */
    public enum Gender {

        F("F"),
        M("M"),
        N("N"),
        O("O"),
        U("U");
        private final String value;
        private final static Map<String, Consumer.Gender> CONSTANTS = new HashMap<String, Consumer.Gender>();

        static {
            for (Consumer.Gender c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Gender(String value) {
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
        public static Consumer.Gender fromValue(String value) {
            Consumer.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
