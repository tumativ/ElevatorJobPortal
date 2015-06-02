
package com.elevator.interfaces.rs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Phone number of a user
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "phone_type",
    "country_code",
    "phone_number",
    "extension",
    "phone_entered"
})
public class Phone {

    /**
     * Unique ID for this phone number
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * The type of phone number
     * (Required)
     * 
     */
    @JsonProperty("phone_type")
    @NotNull
    private String phoneType;
    /**
     * Numeric country code portion of the phone number. For example, 1 is US / NANP numbers, 44 is Great Britan, etc.  They can't start with a zero, and the only single digit codes allowed are '1' (NANP) and '7' (Russia).
     * (Required)
     * 
     */
    @JsonProperty("country_code")
    @NotNull
    private String countryCode;
    /**
     * The rest of the phone number (not including country code, but does include 'area code for US numbers for example). Should be all digits, and no longer than 29 digits.
     * (Required)
     * 
     */
    @JsonProperty("phone_number")
    @NotNull
    private String phoneNumber;
    /**
     * Any extension that is part of the phone number. An extension is the part of the number that is used at a private switchboard once the phone number has resolved to an end-point. Typically this is only used for work numbers where the phone number is actually the number to the company switch-board and then, once they pick up you have to dial an 'extension' for the specific employee desk.
     * 
     */
    @JsonProperty("extension")
    private String extension;
    /**
     * The phone number as the user entered it (with spacing and formatting). 30 byte maximum length.
     * 
     */
    @JsonProperty("phone_entered")
    private String phoneEntered;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unique ID for this phone number
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Unique ID for this phone number
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The type of phone number
     * (Required)
     * 
     */
    @JsonProperty("phone_type")
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * The type of phone number
     * (Required)
     * 
     */
    @JsonProperty("phone_type")
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * Numeric country code portion of the phone number. For example, 1 is US / NANP numbers, 44 is Great Britan, etc.  They can't start with a zero, and the only single digit codes allowed are '1' (NANP) and '7' (Russia).
     * (Required)
     * 
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Numeric country code portion of the phone number. For example, 1 is US / NANP numbers, 44 is Great Britan, etc.  They can't start with a zero, and the only single digit codes allowed are '1' (NANP) and '7' (Russia).
     * (Required)
     * 
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * The rest of the phone number (not including country code, but does include 'area code for US numbers for example). Should be all digits, and no longer than 29 digits.
     * (Required)
     * 
     */
    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The rest of the phone number (not including country code, but does include 'area code for US numbers for example). Should be all digits, and no longer than 29 digits.
     * (Required)
     * 
     */
    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Any extension that is part of the phone number. An extension is the part of the number that is used at a private switchboard once the phone number has resolved to an end-point. Typically this is only used for work numbers where the phone number is actually the number to the company switch-board and then, once they pick up you have to dial an 'extension' for the specific employee desk.
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Any extension that is part of the phone number. An extension is the part of the number that is used at a private switchboard once the phone number has resolved to an end-point. Typically this is only used for work numbers where the phone number is actually the number to the company switch-board and then, once they pick up you have to dial an 'extension' for the specific employee desk.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * The phone number as the user entered it (with spacing and formatting). 30 byte maximum length.
     * 
     */
    @JsonProperty("phone_entered")
    public String getPhoneEntered() {
        return phoneEntered;
    }

    /**
     * The phone number as the user entered it (with spacing and formatting). 30 byte maximum length.
     * 
     */
    @JsonProperty("phone_entered")
    public void setPhoneEntered(String phoneEntered) {
        this.phoneEntered = phoneEntered;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
