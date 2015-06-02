
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
 * Name record for a user.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "full_name",
    "full_name_extended",
    "salutation",
    "given_name",
    "middle_name",
    "family_name",
    "secondary_family_name",
    "suffix",
    "alternate_full_name",
    "orthography",
    "deleted",
    "primary",
    "confirmation_status",
    "confirmation_authority"
})
public class Name {

    /**
     * unique ID for this name for this user
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user as you should typically use it. For a person this will usually be first name and last name.
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    @NotNull
    private String fullName;
    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user, just like the full_name field except that it may include more parts of the name such as middle name.
     * (Required)
     * 
     */
    @JsonProperty("full_name_extended")
    @NotNull
    private String fullNameExtended;
    /**
     * The prefix for the user name, i.e. 'Mr.', 'Dr.', 'Mrs.', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("salutation")
    private String salutation;
    /**
     * The 'given name' (typically 'first name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("given_name")
    private String givenName;
    /**
     * The middle name of the user.
     * Length is limited to 128 bytes.
     * 
     */
    @JsonProperty("middle_name")
    private String middleName;
    /**
     * The surname or family name (typically 'last name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("family_name")
    private String familyName;
    /**
     * A secondary surname or family name of the user.
     * Length is limited to 140 bytes.
     * 
     */
    @JsonProperty("secondary_family_name")
    private String secondaryFamilyName;
    /**
     * The suffix for the user name, i.e. 'Sr.', 'Jr.', 'III', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("suffix")
    private String suffix;
    /**
     * The full name of an organization or some entity that can't break their name up into components like in a personName. This could even be used for a person for whom we don't know how to break their name up into component parts.
     * 
     */
    @JsonProperty("alternate_full_name")
    private String alternateFullName;
    /**
     * The orthography used in the name fields. There is a constrained set of allowed values for this field.
     * 
     */
    @JsonProperty("orthography")
    private String orthography;
    /**
     * Whether this name has been deleted from the user. If true then this name was previously associated with the user but has been removed.
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    @NotNull
    private Boolean deleted;
    /**
     * Whether this is the primary name of the user. This cannot be directly set to false, but rather is toggled false in the datastore upon setting another Name to primary.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    @NotNull
    private Boolean primary;
    /**
     * Status of 3rd party confirmation of this name.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_status")
    @NotNull
    private String confirmationStatus;
    /**
     * What 3rd party or process has determined the current confirmation_status.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_authority")
    @NotNull
    private String confirmationAuthority;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * unique ID for this name for this user
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * unique ID for this name for this user
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user as you should typically use it. For a person this will usually be first name and last name.
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user as you should typically use it. For a person this will usually be first name and last name.
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user, just like the full_name field except that it may include more parts of the name such as middle name.
     * (Required)
     * 
     */
    @JsonProperty("full_name_extended")
    public String getFullNameExtended() {
        return fullNameExtended;
    }

    /**
     * This is a computed, localized field. It is made up of the component fields that follow. On insert or update you must specify your input in the below fields. This is a read-only field. This is the full name of the user, just like the full_name field except that it may include more parts of the name such as middle name.
     * (Required)
     * 
     */
    @JsonProperty("full_name_extended")
    public void setFullNameExtended(String fullNameExtended) {
        this.fullNameExtended = fullNameExtended;
    }

    /**
     * The prefix for the user name, i.e. 'Mr.', 'Dr.', 'Mrs.', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("salutation")
    public String getSalutation() {
        return salutation;
    }

    /**
     * The prefix for the user name, i.e. 'Mr.', 'Dr.', 'Mrs.', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("salutation")
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * The 'given name' (typically 'first name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("given_name")
    public String getGivenName() {
        return givenName;
    }

    /**
     * The 'given name' (typically 'first name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("given_name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * The middle name of the user.
     * Length is limited to 128 bytes.
     * 
     */
    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * The middle name of the user.
     * Length is limited to 128 bytes.
     * 
     */
    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * The surname or family name (typically 'last name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("family_name")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * The surname or family name (typically 'last name') of the user.
     * Length is limited to 64 bytes.
     * 
     */
    @JsonProperty("family_name")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * A secondary surname or family name of the user.
     * Length is limited to 140 bytes.
     * 
     */
    @JsonProperty("secondary_family_name")
    public String getSecondaryFamilyName() {
        return secondaryFamilyName;
    }

    /**
     * A secondary surname or family name of the user.
     * Length is limited to 140 bytes.
     * 
     */
    @JsonProperty("secondary_family_name")
    public void setSecondaryFamilyName(String secondaryFamilyName) {
        this.secondaryFamilyName = secondaryFamilyName;
    }

    /**
     * The suffix for the user name, i.e. 'Sr.', 'Jr.', 'III', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * The suffix for the user name, i.e. 'Sr.', 'Jr.', 'III', etc. 
     * Length is limited to 32 bytes.
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * The full name of an organization or some entity that can't break their name up into components like in a personName. This could even be used for a person for whom we don't know how to break their name up into component parts.
     * 
     */
    @JsonProperty("alternate_full_name")
    public String getAlternateFullName() {
        return alternateFullName;
    }

    /**
     * The full name of an organization or some entity that can't break their name up into components like in a personName. This could even be used for a person for whom we don't know how to break their name up into component parts.
     * 
     */
    @JsonProperty("alternate_full_name")
    public void setAlternateFullName(String alternateFullName) {
        this.alternateFullName = alternateFullName;
    }

    /**
     * The orthography used in the name fields. There is a constrained set of allowed values for this field.
     * 
     */
    @JsonProperty("orthography")
    public String getOrthography() {
        return orthography;
    }

    /**
     * The orthography used in the name fields. There is a constrained set of allowed values for this field.
     * 
     */
    @JsonProperty("orthography")
    public void setOrthography(String orthography) {
        this.orthography = orthography;
    }

    /**
     * Whether this name has been deleted from the user. If true then this name was previously associated with the user but has been removed.
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Whether this name has been deleted from the user. If true then this name was previously associated with the user but has been removed.
     * (Required)
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Whether this is the primary name of the user. This cannot be directly set to false, but rather is toggled false in the datastore upon setting another Name to primary.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * Whether this is the primary name of the user. This cannot be directly set to false, but rather is toggled false in the datastore upon setting another Name to primary.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * Status of 3rd party confirmation of this name.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_status")
    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * Status of 3rd party confirmation of this name.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_status")
    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * What 3rd party or process has determined the current confirmation_status.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_authority")
    public String getConfirmationAuthority() {
        return confirmationAuthority;
    }

    /**
     * What 3rd party or process has determined the current confirmation_status.
     * (Required)
     * 
     */
    @JsonProperty("confirmation_authority")
    public void setConfirmationAuthority(String confirmationAuthority) {
        this.confirmationAuthority = confirmationAuthority;
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
