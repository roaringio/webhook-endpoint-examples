package example.Models.RootEvent;

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
        "changeType",
        "countryCodes",
        "keyMap",
        "newAttributes",
        "previousAttributes",
        "messageId",
        "object",
        "requestType",
        "timestamp",
        "type",
        "version"
})
public class Event {

    @JsonProperty("changeType")
    private String changeType;
    @JsonProperty("countryCodes")
    private List<String> countryCodes = new ArrayList<String>();
    @JsonProperty("keyMap")
    private KeyMap keyMap;
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("object")
    private Object object;
    @JsonProperty("requestType")
    private String requestType;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("type")
    private String type;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("changeType")
    public String getChangeType() {
        return changeType;
    }

    @JsonProperty("changeType")
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    @JsonProperty("countryCodes")
    public List<String> getCountryCodes() {
        return countryCodes;
    }

    @JsonProperty("countryCodes")
    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    @JsonProperty("keyMap")
    public KeyMap getKeyMap() {
        return keyMap;
    }

    @JsonProperty("keyMap")
    public void setKeyMap(KeyMap keyMap) {
        this.keyMap = keyMap;
    }

    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("object")
    public Object getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(Object object) {
        this.object = object;
    }

    @JsonProperty("requestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonProperty("requestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("changeType");
        sb.append('=');
        sb.append(((this.changeType == null)?"<null>":this.changeType));
        sb.append(',');
        sb.append("countryCodes");
        sb.append('=');
        sb.append(((this.countryCodes == null)?"<null>":this.countryCodes));
        sb.append(',');
        sb.append("keyMap");
        sb.append('=');
        sb.append(((this.keyMap == null)?"<null>":this.keyMap));
        sb.append(',');
        sb.append("newAttributes");
        sb.append('=');
        sb.append(((this.messageId == null)?"<null>":this.messageId));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("requestType");
        sb.append('=');
        sb.append(((this.requestType == null)?"<null>":this.requestType));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        result = ((result* 31)+((this.keyMap == null)? 0 :this.keyMap.hashCode()));
        result = ((result* 31)+((this.requestType == null)? 0 :this.requestType.hashCode()));
        result = ((result* 31)+((this.changeType == null)? 0 :this.changeType.hashCode()));
        result = ((result* 31)+((this.messageId == null)? 0 :this.messageId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.countryCodes == null)? 0 :this.countryCodes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return (((((((((((((this.keyMap == rhs.keyMap)||((this.keyMap!= null)&&this.keyMap.equals(rhs.keyMap)))&&((this.requestType == rhs.requestType)||((this.requestType!= null)&&this.requestType.equals(rhs.requestType)))))&&((this.changeType == rhs.changeType)||((this.changeType!= null)&&this.changeType.equals(rhs.changeType))))&&((this.messageId == rhs.messageId)||((this.messageId!= null)&&this.messageId.equals(rhs.messageId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.countryCodes == rhs.countryCodes)||((this.countryCodes!= null)&&this.countryCodes.equals(rhs.countryCodes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp)))));
    }

}
