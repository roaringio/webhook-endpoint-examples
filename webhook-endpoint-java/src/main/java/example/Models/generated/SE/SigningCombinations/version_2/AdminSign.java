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
    "anomalies",
    "name",
    "personalNumber",
    "positions"
})
public class AdminSign {

    @JsonProperty("anomalies")
    private List<Anomaly> anomalies = new ArrayList<Anomaly>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("personalNumber")
    private String personalNumber;
    @JsonProperty("positions")
    private List<Position> positions = new ArrayList<Position>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anomalies")
    public List<Anomaly> getAnomalies() {
        return anomalies;
    }

    @JsonProperty("anomalies")
    public void setAnomalies(List<Anomaly> anomalies) {
        this.anomalies = anomalies;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("personalNumber")
    public String getPersonalNumber() {
        return personalNumber;
    }

    @JsonProperty("personalNumber")
    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @JsonProperty("positions")
    public List<Position> getPositions() {
        return positions;
    }

    @JsonProperty("positions")
    public void setPositions(List<Position> positions) {
        this.positions = positions;
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
        sb.append(AdminSign.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anomalies");
        sb.append('=');
        sb.append(((this.anomalies == null)?"<null>":this.anomalies));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("personalNumber");
        sb.append('=');
        sb.append(((this.personalNumber == null)?"<null>":this.personalNumber));
        sb.append(',');
        sb.append("positions");
        sb.append('=');
        sb.append(((this.positions == null)?"<null>":this.positions));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.positions == null)? 0 :this.positions.hashCode()));
        result = ((result* 31)+((this.personalNumber == null)? 0 :this.personalNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.anomalies == null)? 0 :this.anomalies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdminSign) == false) {
            return false;
        }
        AdminSign rhs = ((AdminSign) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.positions == rhs.positions)||((this.positions!= null)&&this.positions.equals(rhs.positions))))&&((this.personalNumber == rhs.personalNumber)||((this.personalNumber!= null)&&this.personalNumber.equals(rhs.personalNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.anomalies == rhs.anomalies)||((this.anomalies!= null)&&this.anomalies.equals(rhs.anomalies))));
    }

}
