
package com.example.types;

import java.util.Date;
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
 * If a Question or concern is Product related then this section should be completed
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productDescription",
    "productSize",
    "purchaseCost",
    "expiryDate",
    "manufacturingCodeDetail",
    "manufacturingCode",
    "storeNamePurchasedFrom",
    "cityNamePurchasedFrom",
    "GTINCodeDetail",
    "purchaseDate"
})
public class ProductInfo {

    /**
     * A free text description of the product
     * 
     */
    @JsonProperty("productDescription")
    @JsonPropertyDescription("A free text description of the product")
    private String productDescription;
    /**
     * The size of the product
     * 
     */
    @JsonProperty("productSize")
    @JsonPropertyDescription("The size of the product")
    private String productSize;
    /**
     * Cost of purchase of the product
     * 
     */
    @JsonProperty("purchaseCost")
    @JsonPropertyDescription("Cost of purchase of the product")
    private String purchaseCost;
    /**
     * The date of expiry of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("expiryDate")
    @JsonPropertyDescription("The date of expiry of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected")
    private Date expiryDate;
    /**
     * Details about whether the manufacturing code being provided is full or partial
     * 
     */
    @JsonProperty("manufacturingCodeDetail")
    @JsonPropertyDescription("Details about whether the manufacturing code being provided is full or partial")
    private ProductInfo.ManufacturingCodeDetail manufacturingCodeDetail;
    /**
     * Manufacturing code of the product
     * 
     */
    @JsonProperty("manufacturingCode")
    @JsonPropertyDescription("Manufacturing code of the product")
    private String manufacturingCode;
    /**
     * Store the product being complained about was purchased from
     * 
     */
    @JsonProperty("storeNamePurchasedFrom")
    @JsonPropertyDescription("Store the product being complained about was purchased from")
    private String storeNamePurchasedFrom;
    /**
     * The Town or City that the product was purchased from
     * 
     */
    @JsonProperty("cityNamePurchasedFrom")
    @JsonPropertyDescription("The Town or City that the product was purchased from")
    private String cityNamePurchasedFrom;
    /**
     * The Global Trade Item Number, GTIN, is an identification number that may be encoded in UPC-A, UPC-E, EAN-8 & EAN-13 barcodes as well as other barcodes in the GS1 System
     * 
     */
    @JsonProperty("GTINCodeDetail")
    @JsonPropertyDescription("The Global Trade Item Number, GTIN, is an identification number that may be encoded in UPC-A, UPC-E, EAN-8 & EAN-13 barcodes as well as other barcodes in the GS1 System")
    private String gTINCodeDetail;
    /**
     * The date of purchase of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("purchaseDate")
    @JsonPropertyDescription("The date of purchase of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected")
    private Date purchaseDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A free text description of the product
     * 
     */
    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * A free text description of the product
     * 
     */
    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * The size of the product
     * 
     */
    @JsonProperty("productSize")
    public String getProductSize() {
        return productSize;
    }

    /**
     * The size of the product
     * 
     */
    @JsonProperty("productSize")
    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    /**
     * Cost of purchase of the product
     * 
     */
    @JsonProperty("purchaseCost")
    public String getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Cost of purchase of the product
     * 
     */
    @JsonProperty("purchaseCost")
    public void setPurchaseCost(String purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    /**
     * The date of expiry of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("expiryDate")
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * The date of expiry of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("expiryDate")
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Details about whether the manufacturing code being provided is full or partial
     * 
     */
    @JsonProperty("manufacturingCodeDetail")
    public ProductInfo.ManufacturingCodeDetail getManufacturingCodeDetail() {
        return manufacturingCodeDetail;
    }

    /**
     * Details about whether the manufacturing code being provided is full or partial
     * 
     */
    @JsonProperty("manufacturingCodeDetail")
    public void setManufacturingCodeDetail(ProductInfo.ManufacturingCodeDetail manufacturingCodeDetail) {
        this.manufacturingCodeDetail = manufacturingCodeDetail;
    }

    /**
     * Manufacturing code of the product
     * 
     */
    @JsonProperty("manufacturingCode")
    public String getManufacturingCode() {
        return manufacturingCode;
    }

    /**
     * Manufacturing code of the product
     * 
     */
    @JsonProperty("manufacturingCode")
    public void setManufacturingCode(String manufacturingCode) {
        this.manufacturingCode = manufacturingCode;
    }

    /**
     * Store the product being complained about was purchased from
     * 
     */
    @JsonProperty("storeNamePurchasedFrom")
    public String getStoreNamePurchasedFrom() {
        return storeNamePurchasedFrom;
    }

    /**
     * Store the product being complained about was purchased from
     * 
     */
    @JsonProperty("storeNamePurchasedFrom")
    public void setStoreNamePurchasedFrom(String storeNamePurchasedFrom) {
        this.storeNamePurchasedFrom = storeNamePurchasedFrom;
    }

    /**
     * The Town or City that the product was purchased from
     * 
     */
    @JsonProperty("cityNamePurchasedFrom")
    public String getCityNamePurchasedFrom() {
        return cityNamePurchasedFrom;
    }

    /**
     * The Town or City that the product was purchased from
     * 
     */
    @JsonProperty("cityNamePurchasedFrom")
    public void setCityNamePurchasedFrom(String cityNamePurchasedFrom) {
        this.cityNamePurchasedFrom = cityNamePurchasedFrom;
    }

    /**
     * The Global Trade Item Number, GTIN, is an identification number that may be encoded in UPC-A, UPC-E, EAN-8 & EAN-13 barcodes as well as other barcodes in the GS1 System
     * 
     */
    @JsonProperty("GTINCodeDetail")
    public String getGTINCodeDetail() {
        return gTINCodeDetail;
    }

    /**
     * The Global Trade Item Number, GTIN, is an identification number that may be encoded in UPC-A, UPC-E, EAN-8 & EAN-13 barcodes as well as other barcodes in the GS1 System
     * 
     */
    @JsonProperty("GTINCodeDetail")
    public void setGTINCodeDetail(String gTINCodeDetail) {
        this.gTINCodeDetail = gTINCodeDetail;
    }

    /**
     * The date of purchase of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("purchaseDate")
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * The date of purchase of the product in YYYY-MM-DDThh:mm:ss.sssTZD format. Append 'T00:00:00.000Z' if time is not collected
     * 
     */
    @JsonProperty("purchaseDate")
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
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
        sb.append(ProductInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productDescription");
        sb.append('=');
        sb.append(((this.productDescription == null)?"<null>":this.productDescription));
        sb.append(',');
        sb.append("productSize");
        sb.append('=');
        sb.append(((this.productSize == null)?"<null>":this.productSize));
        sb.append(',');
        sb.append("purchaseCost");
        sb.append('=');
        sb.append(((this.purchaseCost == null)?"<null>":this.purchaseCost));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("manufacturingCodeDetail");
        sb.append('=');
        sb.append(((this.manufacturingCodeDetail == null)?"<null>":this.manufacturingCodeDetail));
        sb.append(',');
        sb.append("manufacturingCode");
        sb.append('=');
        sb.append(((this.manufacturingCode == null)?"<null>":this.manufacturingCode));
        sb.append(',');
        sb.append("storeNamePurchasedFrom");
        sb.append('=');
        sb.append(((this.storeNamePurchasedFrom == null)?"<null>":this.storeNamePurchasedFrom));
        sb.append(',');
        sb.append("cityNamePurchasedFrom");
        sb.append('=');
        sb.append(((this.cityNamePurchasedFrom == null)?"<null>":this.cityNamePurchasedFrom));
        sb.append(',');
        sb.append("gTINCodeDetail");
        sb.append('=');
        sb.append(((this.gTINCodeDetail == null)?"<null>":this.gTINCodeDetail));
        sb.append(',');
        sb.append("purchaseDate");
        sb.append('=');
        sb.append(((this.purchaseDate == null)?"<null>":this.purchaseDate));
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
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.purchaseCost == null)? 0 :this.purchaseCost.hashCode()));
        result = ((result* 31)+((this.manufacturingCodeDetail == null)? 0 :this.manufacturingCodeDetail.hashCode()));
        result = ((result* 31)+((this.purchaseDate == null)? 0 :this.purchaseDate.hashCode()));
        result = ((result* 31)+((this.productSize == null)? 0 :this.productSize.hashCode()));
        result = ((result* 31)+((this.storeNamePurchasedFrom == null)? 0 :this.storeNamePurchasedFrom.hashCode()));
        result = ((result* 31)+((this.cityNamePurchasedFrom == null)? 0 :this.cityNamePurchasedFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.productDescription == null)? 0 :this.productDescription.hashCode()));
        result = ((result* 31)+((this.manufacturingCode == null)? 0 :this.manufacturingCode.hashCode()));
        result = ((result* 31)+((this.gTINCodeDetail == null)? 0 :this.gTINCodeDetail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductInfo) == false) {
            return false;
        }
        ProductInfo rhs = ((ProductInfo) other);
        return ((((((((((((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate)))&&((this.purchaseCost == rhs.purchaseCost)||((this.purchaseCost!= null)&&this.purchaseCost.equals(rhs.purchaseCost))))&&((this.manufacturingCodeDetail == rhs.manufacturingCodeDetail)||((this.manufacturingCodeDetail!= null)&&this.manufacturingCodeDetail.equals(rhs.manufacturingCodeDetail))))&&((this.purchaseDate == rhs.purchaseDate)||((this.purchaseDate!= null)&&this.purchaseDate.equals(rhs.purchaseDate))))&&((this.productSize == rhs.productSize)||((this.productSize!= null)&&this.productSize.equals(rhs.productSize))))&&((this.storeNamePurchasedFrom == rhs.storeNamePurchasedFrom)||((this.storeNamePurchasedFrom!= null)&&this.storeNamePurchasedFrom.equals(rhs.storeNamePurchasedFrom))))&&((this.cityNamePurchasedFrom == rhs.cityNamePurchasedFrom)||((this.cityNamePurchasedFrom!= null)&&this.cityNamePurchasedFrom.equals(rhs.cityNamePurchasedFrom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.productDescription == rhs.productDescription)||((this.productDescription!= null)&&this.productDescription.equals(rhs.productDescription))))&&((this.manufacturingCode == rhs.manufacturingCode)||((this.manufacturingCode!= null)&&this.manufacturingCode.equals(rhs.manufacturingCode))))&&((this.gTINCodeDetail == rhs.gTINCodeDetail)||((this.gTINCodeDetail!= null)&&this.gTINCodeDetail.equals(rhs.gTINCodeDetail))));
    }


    /**
     * Details about whether the manufacturing code being provided is full or partial
     * 
     */
    public enum ManufacturingCodeDetail {

        FULL("Full"),
        PARTIAL("Partial"),
        NOT_LEGIBLE("Not Legible"),
        NOT_AVAILABLE("Not Available");
        private final String value;
        private final static Map<String, ProductInfo.ManufacturingCodeDetail> CONSTANTS = new HashMap<String, ProductInfo.ManufacturingCodeDetail>();

        static {
            for (ProductInfo.ManufacturingCodeDetail c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ManufacturingCodeDetail(String value) {
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
        public static ProductInfo.ManufacturingCodeDetail fromValue(String value) {
            ProductInfo.ManufacturingCodeDetail constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
