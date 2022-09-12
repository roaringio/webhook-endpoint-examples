package example.Models.generated.SE.SigningCombinations.version_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "adminSign",
    "changeDate",
    "combinations",
    "companyId",
    "coverage"
})
public class SigningCombinationsSe {

    @JsonProperty("adminSign")
    private List<AdminSign> adminSign = new ArrayList<AdminSign>();
    @JsonProperty("changeDate")
    private String changeDate;
    @JsonProperty("combinations")
    private List<List<Combination>> combinations = new ArrayList<List<Combination>>();
    @JsonProperty("companyId")
    private String companyId;
    @JsonProperty("coverage")
    private String coverage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adminSign")
    public List<AdminSign> getAdminSign() {
        return adminSign;
    }

    @JsonProperty("adminSign")
    public void setAdminSign(List<AdminSign> adminSign) {
        this.adminSign = adminSign;
    }

    @JsonProperty("changeDate")
    public String getChangeDate() {
        return changeDate;
    }

    @JsonProperty("changeDate")
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    @JsonProperty("combinations")
    public List<List<Combination>> getCombinations() {
        return combinations;
    }

    @JsonProperty("combinations")
    public void setCombinations(List<List<Combination>> combinations) {
        this.combinations = combinations;
    }

    @JsonProperty("companyId")
    public String getCompanyId() {
        return companyId;
    }

    @JsonProperty("companyId")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("coverage")
    public String getCoverage() {
        return coverage;
    }

    @JsonProperty("coverage")
    public void setCoverage(String coverage) {
        this.coverage = coverage;
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
        sb.append(SigningCombinationsSe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adminSign");
        sb.append('=');
        sb.append(((this.adminSign == null)?"<null>":this.adminSign));
        sb.append(',');
        sb.append("changeDate");
        sb.append('=');
        sb.append(((this.changeDate == null)?"<null>":this.changeDate));
        sb.append(',');
        sb.append("combinations");
        sb.append('=');
        sb.append(((this.combinations == null)?"<null>":this.combinations));
        sb.append(',');
        sb.append("companyId");
        sb.append('=');
        sb.append(((this.companyId == null)?"<null>":this.companyId));
        sb.append(',');
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
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
        result = ((result* 31)+((this.coverage == null)? 0 :this.coverage.hashCode()));
        result = ((result* 31)+((this.adminSign == null)? 0 :this.adminSign.hashCode()));
        result = ((result* 31)+((this.companyId == null)? 0 :this.companyId.hashCode()));
        result = ((result* 31)+((this.combinations == null)? 0 :this.combinations.hashCode()));
        result = ((result* 31)+((this.changeDate == null)? 0 :this.changeDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SigningCombinationsSe) == false) {
            return false;
        }
        SigningCombinationsSe rhs = ((SigningCombinationsSe) other);
        return (((((((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage)))&&((this.adminSign == rhs.adminSign)||((this.adminSign!= null)&&this.adminSign.equals(rhs.adminSign))))&&((this.companyId == rhs.companyId)||((this.companyId!= null)&&this.companyId.equals(rhs.companyId))))&&((this.combinations == rhs.combinations)||((this.combinations!= null)&&this.combinations.equals(rhs.combinations))))&&((this.changeDate == rhs.changeDate)||((this.changeDate!= null)&&this.changeDate.equals(rhs.changeDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
