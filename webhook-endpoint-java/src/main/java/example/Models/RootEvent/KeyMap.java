package example.Models.RootEvent;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "companyId",
    "personId",
    "personalNumber",
    "birthDate",
    "firstName",
    "lastName",
    "pepId",
    "referenceNumber"
})
public class KeyMap {

    @JsonProperty("companyId")
    private String companyId;
    @JsonProperty("personId")
    private Integer personId;
    @JsonProperty("personalNumber")
    private String personalNumber;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("pepId")
    private String pepId;
    @JsonProperty("referenceNumber")
    private String referenceNumber;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();

    @JsonProperty("companyId")
    public String getCompanyId() {
        return companyId;
    }

    @JsonProperty("companyId")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("personId")
    public Integer getPersonId() {
        return personId;
    }

    @JsonProperty("personId")
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @JsonProperty("personalNumber")
    public String getPersonalNumber() {
        return personalNumber;
    }

    @JsonProperty("personalNumber")
    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("pepId")
    public String getPepId() {
        return pepId;
    }

    @JsonProperty("pepId")
    public void setPepId(String pepId) {
        this.pepId = pepId;
    }

    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyMap.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companyId");
        sb.append('=');
        sb.append(((this.companyId == null)?"<null>":this.companyId));
        sb.append(',');
        sb.append("personId");
        sb.append('=');
        sb.append(((this.personId == null)?"<null>":this.personId));
        sb.append(',');
        sb.append("personalNumber");
        sb.append('=');
        sb.append(((this.personalNumber == null)?"<null>":this.personalNumber));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("pepId");
        sb.append('=');
        sb.append(((this.pepId == null)?"<null>":this.pepId));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.companyId == null)? 0 :this.companyId.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.personId == null)? 0 :this.personId.hashCode()));
        result = ((result* 31)+((this.personalNumber == null)? 0 :this.personalNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.pepId == null)? 0 :this.pepId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyMap) == false) {
            return false;
        }
        KeyMap rhs = ((KeyMap) other);
        return ((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.companyId == rhs.companyId)||((this.companyId!= null)&&this.companyId.equals(rhs.companyId))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.personId == rhs.personId)||((this.personId!= null)&&this.personId.equals(rhs.personId))))&&((this.personalNumber == rhs.personalNumber)||((this.personalNumber!= null)&&this.personalNumber.equals(rhs.personalNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.pepId == rhs.pepId)||((this.pepId!= null)&&this.pepId.equals(rhs.pepId))));
    }

}
