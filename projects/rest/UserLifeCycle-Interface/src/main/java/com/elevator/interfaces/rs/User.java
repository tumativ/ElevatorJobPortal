
package com.elevator.interfaces.rs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
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
 * user data; both the core user element data and nested profile data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "emails",
    "names",
    "addresses",
    "phones",
    "preferred_language",
    "timezone"
})
public class User {

    /**
     * unique id for the user
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * The type of user. Must be one of a defined list of values
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    /**
     * Container object for a collection of Users
     * 
     */
    @JsonProperty("emails")
    @Valid
    private Emails emails;
    /**
     * Container object for a collection of Names
     * 
     */
    @JsonProperty("names")
    @Valid
    private Names names;
    /**
     * Container object for a collection of Addresses
     * 
     */
    @JsonProperty("addresses")
    @Valid
    private Addresses addresses;
    /**
     * Container object for a collection of Phones
     * 
     */
    @JsonProperty("phones")
    @Valid
    private Phones phones;
    /**
     * User's preferred language
     * 
     */
    @JsonProperty("preferred_language")
    private String preferredLanguage;
    /**
     * User's timezone
     * 
     */
    @JsonProperty("timezone")
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * unique id for the user
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * unique id for the user
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The type of user. Must be one of a defined list of values
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of user. Must be one of a defined list of values
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Container object for a collection of Users
     * 
     */
    @JsonProperty("emails")
    public Emails getEmails() {
        return emails;
    }

    /**
     * Container object for a collection of Users
     * 
     */
    @JsonProperty("emails")
    public void setEmails(Emails emails) {
        this.emails = emails;
    }

    /**
     * Container object for a collection of Names
     * 
     */
    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    /**
     * Container object for a collection of Names
     * 
     */
    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    /**
     * Container object for a collection of Addresses
     * 
     */
    @JsonProperty("addresses")
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Container object for a collection of Addresses
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    /**
     * Container object for a collection of Phones
     * 
     */
    @JsonProperty("phones")
    public Phones getPhones() {
        return phones;
    }

    /**
     * Container object for a collection of Phones
     * 
     */
    @JsonProperty("phones")
    public void setPhones(Phones phones) {
        this.phones = phones;
    }

    /**
     * User's preferred language
     * 
     */
    @JsonProperty("preferred_language")
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * User's preferred language
     * 
     */
    @JsonProperty("preferred_language")
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    /**
     * User's timezone
     * 
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * User's timezone
     * 
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
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
