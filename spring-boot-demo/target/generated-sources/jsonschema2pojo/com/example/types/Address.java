
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
 * Address element properties definition, based on http://teamsites.unilever.com/collab/ISB/Pages/Unilever-Work-Location.aspx
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "houseNameOrNumber",
    "addressLine1",
    "addressLine2",
    "cityName",
    "postalCode",
    "stateOrProvince",
    "country"
})
public class Address {

    /**
     * The house number or name of the building
     * 
     */
    @JsonProperty("houseNameOrNumber")
    @JsonPropertyDescription("The house number or name of the building")
    private String houseNameOrNumber;
    /**
     * The street name of this location
     * 
     */
    @JsonProperty("addressLine1")
    @JsonPropertyDescription("The street name of this location")
    private String addressLine1;
    /**
     * Further Address information of this locations address
     * 
     */
    @JsonProperty("addressLine2")
    @JsonPropertyDescription("Further Address information of this locations address")
    private String addressLine2;
    /**
     * The town or city of this locations address
     * 
     */
    @JsonProperty("cityName")
    @JsonPropertyDescription("The town or city of this locations address")
    private String cityName;
    /**
     * Postal or Zip Code of this locations address
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("Postal or Zip Code of this locations address")
    private String postalCode;
    /**
     * State, Province, Department, Precinct or County information of this locations address
     * 
     */
    @JsonProperty("stateOrProvince")
    @JsonPropertyDescription("State, Province, Department, Precinct or County information of this locations address")
    private String stateOrProvince;
    /**
     * Country in which this location is based - ISO 3166-1
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Country in which this location is based - ISO 3166-1")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The house number or name of the building
     * 
     */
    @JsonProperty("houseNameOrNumber")
    public String getHouseNameOrNumber() {
        return houseNameOrNumber;
    }

    /**
     * The house number or name of the building
     * 
     */
    @JsonProperty("houseNameOrNumber")
    public void setHouseNameOrNumber(String houseNameOrNumber) {
        this.houseNameOrNumber = houseNameOrNumber;
    }

    /**
     * The street name of this location
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * The street name of this location
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Further Address information of this locations address
     * 
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Further Address information of this locations address
     * 
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * The town or city of this locations address
     * 
     */
    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    /**
     * The town or city of this locations address
     * 
     */
    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Postal or Zip Code of this locations address
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal or Zip Code of this locations address
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * State, Province, Department, Precinct or County information of this locations address
     * 
     */
    @JsonProperty("stateOrProvince")
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * State, Province, Department, Precinct or County information of this locations address
     * 
     */
    @JsonProperty("stateOrProvince")
    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * Country in which this location is based - ISO 3166-1
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country in which this location is based - ISO 3166-1
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("houseNameOrNumber");
        sb.append('=');
        sb.append(((this.houseNameOrNumber == null)?"<null>":this.houseNameOrNumber));
        sb.append(',');
        sb.append("addressLine1");
        sb.append('=');
        sb.append(((this.addressLine1 == null)?"<null>":this.addressLine1));
        sb.append(',');
        sb.append("addressLine2");
        sb.append('=');
        sb.append(((this.addressLine2 == null)?"<null>":this.addressLine2));
        sb.append(',');
        sb.append("cityName");
        sb.append('=');
        sb.append(((this.cityName == null)?"<null>":this.cityName));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("stateOrProvince");
        sb.append('=');
        sb.append(((this.stateOrProvince == null)?"<null>":this.stateOrProvince));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.cityName == null)? 0 :this.cityName.hashCode()));
        result = ((result* 31)+((this.stateOrProvince == null)? 0 :this.stateOrProvince.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.houseNameOrNumber == null)? 0 :this.houseNameOrNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.cityName == rhs.cityName)||((this.cityName!= null)&&this.cityName.equals(rhs.cityName))))&&((this.stateOrProvince == rhs.stateOrProvince)||((this.stateOrProvince!= null)&&this.stateOrProvince.equals(rhs.stateOrProvince))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.houseNameOrNumber == rhs.houseNameOrNumber)||((this.houseNameOrNumber!= null)&&this.houseNameOrNumber.equals(rhs.houseNameOrNumber))));
    }

}
