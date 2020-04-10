
package com.example.types;

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
 * Indicates where identity details will be received.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullName",
    "givenName",
    "familyName",
    "preferredName",
    "familyNameofBirth",
    "honorificPrefix",
    "honorificSuffix"
})
public class Identity {

    /**
     * A concatenation of family name, given name and middle name(s) (depending on country rules). The formatted name with all the pieces in the proper place
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("A concatenation of family name, given name and middle name(s) (depending on country rules). The formatted name with all the pieces in the proper place")
    private String fullName;
    /**
     * The non-family part of a full name by which a person is generally addressed is described as the given or chosen name. Also known as a person’s first name.
     * 
     */
    @JsonProperty("givenName")
    @JsonPropertyDescription("The non-family part of a full name by which a person is generally addressed is described as the given or chosen name. Also known as a person\u2019s first name.")
    private String givenName;
    /**
     * The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. This is the current Family Name and may include one or more name elements. For example: den Bergh.
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    @JsonPropertyDescription("The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. This is the current Family Name and may include one or more name elements. For example: den Bergh.")
    private String familyName;
    /**
     * The name a person prefers to be called if different from Given Name). For example: Bob, Buddy, Mike.
     * 
     */
    @JsonProperty("preferredName")
    @JsonPropertyDescription("The name a person prefers to be called if different from Given Name). For example: Bob, Buddy, Mike.")
    private String preferredName;
    /**
     * This is the family name of the individual at birth.  The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. The Family Name may include one or more name elements. For example: den Bergh.
     * 
     */
    @JsonProperty("familyNameofBirth")
    @JsonPropertyDescription("This is the family name of the individual at birth.  The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. The Family Name may include one or more name elements. For example: den Bergh.")
    private String familyNameofBirth;
    /**
     * A title prefixing a person's name
     * 
     */
    @JsonProperty("honorificPrefix")
    @JsonPropertyDescription("A title prefixing a person's name")
    private String honorificPrefix;
    /**
     * A title suffixing a person's name 
     * 
     */
    @JsonProperty("honorificSuffix")
    @JsonPropertyDescription("A title suffixing a person's name ")
    private String honorificSuffix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A concatenation of family name, given name and middle name(s) (depending on country rules). The formatted name with all the pieces in the proper place
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * A concatenation of family name, given name and middle name(s) (depending on country rules). The formatted name with all the pieces in the proper place
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * The non-family part of a full name by which a person is generally addressed is described as the given or chosen name. Also known as a person’s first name.
     * 
     */
    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    /**
     * The non-family part of a full name by which a person is generally addressed is described as the given or chosen name. Also known as a person’s first name.
     * 
     */
    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. This is the current Family Name and may include one or more name elements. For example: den Bergh.
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. This is the current Family Name and may include one or more name elements. For example: den Bergh.
     * (Required)
     * 
     */
    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * The name a person prefers to be called if different from Given Name). For example: Bob, Buddy, Mike.
     * 
     */
    @JsonProperty("preferredName")
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * The name a person prefers to be called if different from Given Name). For example: Bob, Buddy, Mike.
     * 
     */
    @JsonProperty("preferredName")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    /**
     * This is the family name of the individual at birth.  The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. The Family Name may include one or more name elements. For example: den Bergh.
     * 
     */
    @JsonProperty("familyNameofBirth")
    public String getFamilyNameofBirth() {
        return familyNameofBirth;
    }

    /**
     * This is the family name of the individual at birth.  The Family Name is the non-chosen or inherited name, also known as the last name in the Western context. The Family Name may include one or more name elements. For example: den Bergh.
     * 
     */
    @JsonProperty("familyNameofBirth")
    public void setFamilyNameofBirth(String familyNameofBirth) {
        this.familyNameofBirth = familyNameofBirth;
    }

    /**
     * A title prefixing a person's name
     * 
     */
    @JsonProperty("honorificPrefix")
    public String getHonorificPrefix() {
        return honorificPrefix;
    }

    /**
     * A title prefixing a person's name
     * 
     */
    @JsonProperty("honorificPrefix")
    public void setHonorificPrefix(String honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
    }

    /**
     * A title suffixing a person's name 
     * 
     */
    @JsonProperty("honorificSuffix")
    public String getHonorificSuffix() {
        return honorificSuffix;
    }

    /**
     * A title suffixing a person's name 
     * 
     */
    @JsonProperty("honorificSuffix")
    public void setHonorificSuffix(String honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
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
        sb.append(Identity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("givenName");
        sb.append('=');
        sb.append(((this.givenName == null)?"<null>":this.givenName));
        sb.append(',');
        sb.append("familyName");
        sb.append('=');
        sb.append(((this.familyName == null)?"<null>":this.familyName));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null)?"<null>":this.preferredName));
        sb.append(',');
        sb.append("familyNameofBirth");
        sb.append('=');
        sb.append(((this.familyNameofBirth == null)?"<null>":this.familyNameofBirth));
        sb.append(',');
        sb.append("honorificPrefix");
        sb.append('=');
        sb.append(((this.honorificPrefix == null)?"<null>":this.honorificPrefix));
        sb.append(',');
        sb.append("honorificSuffix");
        sb.append('=');
        sb.append(((this.honorificSuffix == null)?"<null>":this.honorificSuffix));
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
        result = ((result* 31)+((this.honorificSuffix == null)? 0 :this.honorificSuffix.hashCode()));
        result = ((result* 31)+((this.givenName == null)? 0 :this.givenName.hashCode()));
        result = ((result* 31)+((this.familyName == null)? 0 :this.familyName.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.honorificPrefix == null)? 0 :this.honorificPrefix.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.familyNameofBirth == null)? 0 :this.familyNameofBirth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identity) == false) {
            return false;
        }
        Identity rhs = ((Identity) other);
        return (((((((((this.honorificSuffix == rhs.honorificSuffix)||((this.honorificSuffix!= null)&&this.honorificSuffix.equals(rhs.honorificSuffix)))&&((this.givenName == rhs.givenName)||((this.givenName!= null)&&this.givenName.equals(rhs.givenName))))&&((this.familyName == rhs.familyName)||((this.familyName!= null)&&this.familyName.equals(rhs.familyName))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.honorificPrefix == rhs.honorificPrefix)||((this.honorificPrefix!= null)&&this.honorificPrefix.equals(rhs.honorificPrefix))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.familyNameofBirth == rhs.familyNameofBirth)||((this.familyNameofBirth!= null)&&this.familyNameofBirth.equals(rhs.familyNameofBirth))));
    }

}
