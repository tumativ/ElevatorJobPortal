
package com.elevator.interfaces.rs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Container object for a collection of Phones
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "items",
    "is_complete"
})
public class Phones {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    @NotNull
    @Valid
    private List<Phone> items = new ArrayList<Phone>();
    /**
     * Whether this collection is a complete representation of Phones for this User
     * (Required)
     * 
     */
    @JsonProperty("is_complete")
    @NotNull
    private Boolean isComplete;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public List<Phone> getItems() {
        return items;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("items")
    public void setItems(List<Phone> items) {
        this.items = items;
    }

    /**
     * Whether this collection is a complete representation of Phones for this User
     * (Required)
     * 
     */
    @JsonProperty("is_complete")
    public Boolean getIsComplete() {
        return isComplete;
    }

    /**
     * Whether this collection is a complete representation of Phones for this User
     * (Required)
     * 
     */
    @JsonProperty("is_complete")
    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
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
