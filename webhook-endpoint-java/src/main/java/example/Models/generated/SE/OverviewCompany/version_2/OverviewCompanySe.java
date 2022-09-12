package example.Models.generated.SE.OverviewCompany.version_2;

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
    "address",
    "changeDate",
    "coAddress",
    "commune",
    "communeCode",
    "companyDeregistrationDate",
    "companyHolder",
    "companyId",
    "companyName",
    "companyRegistrationDate",
    "county",
    "email",
    "employerContributionReg",
    "employerContributionRegDate",
    "faxNumber",
    "industryCode",
    "industryText",
    "legalGroupCode",
    "legalGroupText",
    "numberCompanyUnits",
    "numberEmployeesInterval",
    "phoneNumber",
    "preliminaryTaxReg",
    "preliminaryTaxRegDate",
    "severalCompanyName",
    "statusCode",
    "statusDateFrom",
    "statusTextDetailed",
    "statusTextHigh",
    "topDirectorFunction",
    "topDirectorName",
    "town",
    "vatReg",
    "vatRegDate",
    "visitAddress",
    "visitCommune",
    "visitCounty",
    "visitStreet",
    "visitTown",
    "visitZipCode",
    "webAddress",
    "zipCode"
})
public class OverviewCompanySe {

    @JsonProperty("address")
    private String address;
    @JsonProperty("changeDate")
    private String changeDate;
    @JsonProperty("coAddress")
    private String coAddress;
    @JsonProperty("commune")
    private String commune;
    @JsonProperty("communeCode")
    private String communeCode;
    @JsonProperty("companyDeregistrationDate")
    private String companyDeregistrationDate;
    @JsonProperty("companyHolder")
    private String companyHolder;
    @JsonProperty("companyId")
    private String companyId;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("companyRegistrationDate")
    private String companyRegistrationDate;
    @JsonProperty("county")
    private String county;
    @JsonProperty("email")
    private String email;
    @JsonProperty("employerContributionReg")
    private Boolean employerContributionReg;
    @JsonProperty("employerContributionRegDate")
    private String employerContributionRegDate;
    @JsonProperty("faxNumber")
    private String faxNumber;
    @JsonProperty("industryCode")
    private String industryCode;
    @JsonProperty("industryText")
    private String industryText;
    @JsonProperty("legalGroupCode")
    private String legalGroupCode;
    @JsonProperty("legalGroupText")
    private String legalGroupText;
    @JsonProperty("numberCompanyUnits")
    private Integer numberCompanyUnits;
    @JsonProperty("numberEmployeesInterval")
    private String numberEmployeesInterval;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("preliminaryTaxReg")
    private Boolean preliminaryTaxReg;
    @JsonProperty("preliminaryTaxRegDate")
    private String preliminaryTaxRegDate;
    @JsonProperty("severalCompanyName")
    private Boolean severalCompanyName;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("statusDateFrom")
    private String statusDateFrom;
    @JsonProperty("statusTextDetailed")
    private String statusTextDetailed;
    @JsonProperty("statusTextHigh")
    private String statusTextHigh;
    @JsonProperty("topDirectorFunction")
    private String topDirectorFunction;
    @JsonProperty("topDirectorName")
    private String topDirectorName;
    @JsonProperty("town")
    private String town;
    @JsonProperty("vatReg")
    private Boolean vatReg;
    @JsonProperty("vatRegDate")
    private String vatRegDate;
    @JsonProperty("visitAddress")
    private String visitAddress;
    @JsonProperty("visitCommune")
    private String visitCommune;
    @JsonProperty("visitCounty")
    private String visitCounty;
    @JsonProperty("visitStreet")
    private String visitStreet;
    @JsonProperty("visitTown")
    private String visitTown;
    @JsonProperty("visitZipCode")
    private String visitZipCode;
    @JsonProperty("webAddress")
    private String webAddress;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("changeDate")
    public String getChangeDate() {
        return changeDate;
    }

    @JsonProperty("changeDate")
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    @JsonProperty("coAddress")
    public String getCoAddress() {
        return coAddress;
    }

    @JsonProperty("coAddress")
    public void setCoAddress(String coAddress) {
        this.coAddress = coAddress;
    }

    @JsonProperty("commune")
    public String getCommune() {
        return commune;
    }

    @JsonProperty("commune")
    public void setCommune(String commune) {
        this.commune = commune;
    }

    @JsonProperty("communeCode")
    public String getCommuneCode() {
        return communeCode;
    }

    @JsonProperty("communeCode")
    public void setCommuneCode(String communeCode) {
        this.communeCode = communeCode;
    }

    @JsonProperty("companyDeregistrationDate")
    public String getCompanyDeregistrationDate() {
        return companyDeregistrationDate;
    }

    @JsonProperty("companyDeregistrationDate")
    public void setCompanyDeregistrationDate(String companyDeregistrationDate) {
        this.companyDeregistrationDate = companyDeregistrationDate;
    }

    @JsonProperty("companyHolder")
    public String getCompanyHolder() {
        return companyHolder;
    }

    @JsonProperty("companyHolder")
    public void setCompanyHolder(String companyHolder) {
        this.companyHolder = companyHolder;
    }

    @JsonProperty("companyId")
    public String getCompanyId() {
        return companyId;
    }

    @JsonProperty("companyId")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("companyRegistrationDate")
    public String getCompanyRegistrationDate() {
        return companyRegistrationDate;
    }

    @JsonProperty("companyRegistrationDate")
    public void setCompanyRegistrationDate(String companyRegistrationDate) {
        this.companyRegistrationDate = companyRegistrationDate;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("employerContributionReg")
    public Boolean getEmployerContributionReg() {
        return employerContributionReg;
    }

    @JsonProperty("employerContributionReg")
    public void setEmployerContributionReg(Boolean employerContributionReg) {
        this.employerContributionReg = employerContributionReg;
    }

    @JsonProperty("employerContributionRegDate")
    public String getEmployerContributionRegDate() {
        return employerContributionRegDate;
    }

    @JsonProperty("employerContributionRegDate")
    public void setEmployerContributionRegDate(String employerContributionRegDate) {
        this.employerContributionRegDate = employerContributionRegDate;
    }

    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @JsonProperty("industryCode")
    public String getIndustryCode() {
        return industryCode;
    }

    @JsonProperty("industryCode")
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    @JsonProperty("industryText")
    public String getIndustryText() {
        return industryText;
    }

    @JsonProperty("industryText")
    public void setIndustryText(String industryText) {
        this.industryText = industryText;
    }

    @JsonProperty("legalGroupCode")
    public String getLegalGroupCode() {
        return legalGroupCode;
    }

    @JsonProperty("legalGroupCode")
    public void setLegalGroupCode(String legalGroupCode) {
        this.legalGroupCode = legalGroupCode;
    }

    @JsonProperty("legalGroupText")
    public String getLegalGroupText() {
        return legalGroupText;
    }

    @JsonProperty("legalGroupText")
    public void setLegalGroupText(String legalGroupText) {
        this.legalGroupText = legalGroupText;
    }

    @JsonProperty("numberCompanyUnits")
    public Integer getNumberCompanyUnits() {
        return numberCompanyUnits;
    }

    @JsonProperty("numberCompanyUnits")
    public void setNumberCompanyUnits(Integer numberCompanyUnits) {
        this.numberCompanyUnits = numberCompanyUnits;
    }

    @JsonProperty("numberEmployeesInterval")
    public String getNumberEmployeesInterval() {
        return numberEmployeesInterval;
    }

    @JsonProperty("numberEmployeesInterval")
    public void setNumberEmployeesInterval(String numberEmployeesInterval) {
        this.numberEmployeesInterval = numberEmployeesInterval;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("preliminaryTaxReg")
    public Boolean getPreliminaryTaxReg() {
        return preliminaryTaxReg;
    }

    @JsonProperty("preliminaryTaxReg")
    public void setPreliminaryTaxReg(Boolean preliminaryTaxReg) {
        this.preliminaryTaxReg = preliminaryTaxReg;
    }

    @JsonProperty("preliminaryTaxRegDate")
    public String getPreliminaryTaxRegDate() {
        return preliminaryTaxRegDate;
    }

    @JsonProperty("preliminaryTaxRegDate")
    public void setPreliminaryTaxRegDate(String preliminaryTaxRegDate) {
        this.preliminaryTaxRegDate = preliminaryTaxRegDate;
    }

    @JsonProperty("severalCompanyName")
    public Boolean getSeveralCompanyName() {
        return severalCompanyName;
    }

    @JsonProperty("severalCompanyName")
    public void setSeveralCompanyName(Boolean severalCompanyName) {
        this.severalCompanyName = severalCompanyName;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("statusDateFrom")
    public String getStatusDateFrom() {
        return statusDateFrom;
    }

    @JsonProperty("statusDateFrom")
    public void setStatusDateFrom(String statusDateFrom) {
        this.statusDateFrom = statusDateFrom;
    }

    @JsonProperty("statusTextDetailed")
    public String getStatusTextDetailed() {
        return statusTextDetailed;
    }

    @JsonProperty("statusTextDetailed")
    public void setStatusTextDetailed(String statusTextDetailed) {
        this.statusTextDetailed = statusTextDetailed;
    }

    @JsonProperty("statusTextHigh")
    public String getStatusTextHigh() {
        return statusTextHigh;
    }

    @JsonProperty("statusTextHigh")
    public void setStatusTextHigh(String statusTextHigh) {
        this.statusTextHigh = statusTextHigh;
    }

    @JsonProperty("topDirectorFunction")
    public String getTopDirectorFunction() {
        return topDirectorFunction;
    }

    @JsonProperty("topDirectorFunction")
    public void setTopDirectorFunction(String topDirectorFunction) {
        this.topDirectorFunction = topDirectorFunction;
    }

    @JsonProperty("topDirectorName")
    public String getTopDirectorName() {
        return topDirectorName;
    }

    @JsonProperty("topDirectorName")
    public void setTopDirectorName(String topDirectorName) {
        this.topDirectorName = topDirectorName;
    }

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    @JsonProperty("vatReg")
    public Boolean getVatReg() {
        return vatReg;
    }

    @JsonProperty("vatReg")
    public void setVatReg(Boolean vatReg) {
        this.vatReg = vatReg;
    }

    @JsonProperty("vatRegDate")
    public String getVatRegDate() {
        return vatRegDate;
    }

    @JsonProperty("vatRegDate")
    public void setVatRegDate(String vatRegDate) {
        this.vatRegDate = vatRegDate;
    }

    @JsonProperty("visitAddress")
    public String getVisitAddress() {
        return visitAddress;
    }

    @JsonProperty("visitAddress")
    public void setVisitAddress(String visitAddress) {
        this.visitAddress = visitAddress;
    }

    @JsonProperty("visitCommune")
    public String getVisitCommune() {
        return visitCommune;
    }

    @JsonProperty("visitCommune")
    public void setVisitCommune(String visitCommune) {
        this.visitCommune = visitCommune;
    }

    @JsonProperty("visitCounty")
    public String getVisitCounty() {
        return visitCounty;
    }

    @JsonProperty("visitCounty")
    public void setVisitCounty(String visitCounty) {
        this.visitCounty = visitCounty;
    }

    @JsonProperty("visitStreet")
    public String getVisitStreet() {
        return visitStreet;
    }

    @JsonProperty("visitStreet")
    public void setVisitStreet(String visitStreet) {
        this.visitStreet = visitStreet;
    }

    @JsonProperty("visitTown")
    public String getVisitTown() {
        return visitTown;
    }

    @JsonProperty("visitTown")
    public void setVisitTown(String visitTown) {
        this.visitTown = visitTown;
    }

    @JsonProperty("visitZipCode")
    public String getVisitZipCode() {
        return visitZipCode;
    }

    @JsonProperty("visitZipCode")
    public void setVisitZipCode(String visitZipCode) {
        this.visitZipCode = visitZipCode;
    }

    @JsonProperty("webAddress")
    public String getWebAddress() {
        return webAddress;
    }

    @JsonProperty("webAddress")
    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        sb.append(OverviewCompanySe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("changeDate");
        sb.append('=');
        sb.append(((this.changeDate == null)?"<null>":this.changeDate));
        sb.append(',');
        sb.append("coAddress");
        sb.append('=');
        sb.append(((this.coAddress == null)?"<null>":this.coAddress));
        sb.append(',');
        sb.append("commune");
        sb.append('=');
        sb.append(((this.commune == null)?"<null>":this.commune));
        sb.append(',');
        sb.append("communeCode");
        sb.append('=');
        sb.append(((this.communeCode == null)?"<null>":this.communeCode));
        sb.append(',');
        sb.append("companyDeregistrationDate");
        sb.append('=');
        sb.append(((this.companyDeregistrationDate == null)?"<null>":this.companyDeregistrationDate));
        sb.append(',');
        sb.append("companyHolder");
        sb.append('=');
        sb.append(((this.companyHolder == null)?"<null>":this.companyHolder));
        sb.append(',');
        sb.append("companyId");
        sb.append('=');
        sb.append(((this.companyId == null)?"<null>":this.companyId));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("companyRegistrationDate");
        sb.append('=');
        sb.append(((this.companyRegistrationDate == null)?"<null>":this.companyRegistrationDate));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("employerContributionReg");
        sb.append('=');
        sb.append(((this.employerContributionReg == null)?"<null>":this.employerContributionReg));
        sb.append(',');
        sb.append("employerContributionRegDate");
        sb.append('=');
        sb.append(((this.employerContributionRegDate == null)?"<null>":this.employerContributionRegDate));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("industryCode");
        sb.append('=');
        sb.append(((this.industryCode == null)?"<null>":this.industryCode));
        sb.append(',');
        sb.append("industryText");
        sb.append('=');
        sb.append(((this.industryText == null)?"<null>":this.industryText));
        sb.append(',');
        sb.append("legalGroupCode");
        sb.append('=');
        sb.append(((this.legalGroupCode == null)?"<null>":this.legalGroupCode));
        sb.append(',');
        sb.append("legalGroupText");
        sb.append('=');
        sb.append(((this.legalGroupText == null)?"<null>":this.legalGroupText));
        sb.append(',');
        sb.append("numberCompanyUnits");
        sb.append('=');
        sb.append(((this.numberCompanyUnits == null)?"<null>":this.numberCompanyUnits));
        sb.append(',');
        sb.append("numberEmployeesInterval");
        sb.append('=');
        sb.append(((this.numberEmployeesInterval == null)?"<null>":this.numberEmployeesInterval));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("preliminaryTaxReg");
        sb.append('=');
        sb.append(((this.preliminaryTaxReg == null)?"<null>":this.preliminaryTaxReg));
        sb.append(',');
        sb.append("preliminaryTaxRegDate");
        sb.append('=');
        sb.append(((this.preliminaryTaxRegDate == null)?"<null>":this.preliminaryTaxRegDate));
        sb.append(',');
        sb.append("severalCompanyName");
        sb.append('=');
        sb.append(((this.severalCompanyName == null)?"<null>":this.severalCompanyName));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("statusDateFrom");
        sb.append('=');
        sb.append(((this.statusDateFrom == null)?"<null>":this.statusDateFrom));
        sb.append(',');
        sb.append("statusTextDetailed");
        sb.append('=');
        sb.append(((this.statusTextDetailed == null)?"<null>":this.statusTextDetailed));
        sb.append(',');
        sb.append("statusTextHigh");
        sb.append('=');
        sb.append(((this.statusTextHigh == null)?"<null>":this.statusTextHigh));
        sb.append(',');
        sb.append("topDirectorFunction");
        sb.append('=');
        sb.append(((this.topDirectorFunction == null)?"<null>":this.topDirectorFunction));
        sb.append(',');
        sb.append("topDirectorName");
        sb.append('=');
        sb.append(((this.topDirectorName == null)?"<null>":this.topDirectorName));
        sb.append(',');
        sb.append("town");
        sb.append('=');
        sb.append(((this.town == null)?"<null>":this.town));
        sb.append(',');
        sb.append("vatReg");
        sb.append('=');
        sb.append(((this.vatReg == null)?"<null>":this.vatReg));
        sb.append(',');
        sb.append("vatRegDate");
        sb.append('=');
        sb.append(((this.vatRegDate == null)?"<null>":this.vatRegDate));
        sb.append(',');
        sb.append("visitAddress");
        sb.append('=');
        sb.append(((this.visitAddress == null)?"<null>":this.visitAddress));
        sb.append(',');
        sb.append("visitCommune");
        sb.append('=');
        sb.append(((this.visitCommune == null)?"<null>":this.visitCommune));
        sb.append(',');
        sb.append("visitCounty");
        sb.append('=');
        sb.append(((this.visitCounty == null)?"<null>":this.visitCounty));
        sb.append(',');
        sb.append("visitStreet");
        sb.append('=');
        sb.append(((this.visitStreet == null)?"<null>":this.visitStreet));
        sb.append(',');
        sb.append("visitTown");
        sb.append('=');
        sb.append(((this.visitTown == null)?"<null>":this.visitTown));
        sb.append(',');
        sb.append("visitZipCode");
        sb.append('=');
        sb.append(((this.visitZipCode == null)?"<null>":this.visitZipCode));
        sb.append(',');
        sb.append("webAddress");
        sb.append('=');
        sb.append(((this.webAddress == null)?"<null>":this.webAddress));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
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
        result = ((result* 31)+((this.companyDeregistrationDate == null)? 0 :this.companyDeregistrationDate.hashCode()));
        result = ((result* 31)+((this.industryText == null)? 0 :this.industryText.hashCode()));
        result = ((result* 31)+((this.coAddress == null)? 0 :this.coAddress.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.employerContributionRegDate == null)? 0 :this.employerContributionRegDate.hashCode()));
        result = ((result* 31)+((this.severalCompanyName == null)? 0 :this.severalCompanyName.hashCode()));
        result = ((result* 31)+((this.statusTextHigh == null)? 0 :this.statusTextHigh.hashCode()));
        result = ((result* 31)+((this.vatReg == null)? 0 :this.vatReg.hashCode()));
        result = ((result* 31)+((this.commune == null)? 0 :this.commune.hashCode()));
        result = ((result* 31)+((this.communeCode == null)? 0 :this.communeCode.hashCode()));
        result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.visitZipCode == null)? 0 :this.visitZipCode.hashCode()));
        result = ((result* 31)+((this.vatRegDate == null)? 0 :this.vatRegDate.hashCode()));
        result = ((result* 31)+((this.industryCode == null)? 0 :this.industryCode.hashCode()));
        result = ((result* 31)+((this.changeDate == null)? 0 :this.changeDate.hashCode()));
        result = ((result* 31)+((this.numberEmployeesInterval == null)? 0 :this.numberEmployeesInterval.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.visitStreet == null)? 0 :this.visitStreet.hashCode()));
        result = ((result* 31)+((this.companyRegistrationDate == null)? 0 :this.companyRegistrationDate.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.town == null)? 0 :this.town.hashCode()));
        result = ((result* 31)+((this.statusDateFrom == null)? 0 :this.statusDateFrom.hashCode()));
        result = ((result* 31)+((this.numberCompanyUnits == null)? 0 :this.numberCompanyUnits.hashCode()));
        result = ((result* 31)+((this.webAddress == null)? 0 :this.webAddress.hashCode()));
        result = ((result* 31)+((this.preliminaryTaxRegDate == null)? 0 :this.preliminaryTaxRegDate.hashCode()));
        result = ((result* 31)+((this.visitCounty == null)? 0 :this.visitCounty.hashCode()));
        result = ((result* 31)+((this.companyHolder == null)? 0 :this.companyHolder.hashCode()));
        result = ((result* 31)+((this.employerContributionReg == null)? 0 :this.employerContributionReg.hashCode()));
        result = ((result* 31)+((this.preliminaryTaxReg == null)? 0 :this.preliminaryTaxReg.hashCode()));
        result = ((result* 31)+((this.statusTextDetailed == null)? 0 :this.statusTextDetailed.hashCode()));
        result = ((result* 31)+((this.visitCommune == null)? 0 :this.visitCommune.hashCode()));
        result = ((result* 31)+((this.topDirectorFunction == null)? 0 :this.topDirectorFunction.hashCode()));
        result = ((result* 31)+((this.companyId == null)? 0 :this.companyId.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.legalGroupCode == null)? 0 :this.legalGroupCode.hashCode()));
        result = ((result* 31)+((this.visitTown == null)? 0 :this.visitTown.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.topDirectorName == null)? 0 :this.topDirectorName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.legalGroupText == null)? 0 :this.legalGroupText.hashCode()));
        result = ((result* 31)+((this.visitAddress == null)? 0 :this.visitAddress.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OverviewCompanySe) == false) {
            return false;
        }
        OverviewCompanySe rhs = ((OverviewCompanySe) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.companyDeregistrationDate == rhs.companyDeregistrationDate)||((this.companyDeregistrationDate!= null)&&this.companyDeregistrationDate.equals(rhs.companyDeregistrationDate)))&&((this.industryText == rhs.industryText)||((this.industryText!= null)&&this.industryText.equals(rhs.industryText))))&&((this.coAddress == rhs.coAddress)||((this.coAddress!= null)&&this.coAddress.equals(rhs.coAddress))))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.employerContributionRegDate == rhs.employerContributionRegDate)||((this.employerContributionRegDate!= null)&&this.employerContributionRegDate.equals(rhs.employerContributionRegDate))))&&((this.severalCompanyName == rhs.severalCompanyName)||((this.severalCompanyName!= null)&&this.severalCompanyName.equals(rhs.severalCompanyName))))&&((this.statusTextHigh == rhs.statusTextHigh)||((this.statusTextHigh!= null)&&this.statusTextHigh.equals(rhs.statusTextHigh))))&&((this.vatReg == rhs.vatReg)||((this.vatReg!= null)&&this.vatReg.equals(rhs.vatReg))))&&((this.commune == rhs.commune)||((this.commune!= null)&&this.commune.equals(rhs.commune))))&&((this.communeCode == rhs.communeCode)||((this.communeCode!= null)&&this.communeCode.equals(rhs.communeCode))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.visitZipCode == rhs.visitZipCode)||((this.visitZipCode!= null)&&this.visitZipCode.equals(rhs.visitZipCode))))&&((this.vatRegDate == rhs.vatRegDate)||((this.vatRegDate!= null)&&this.vatRegDate.equals(rhs.vatRegDate))))&&((this.industryCode == rhs.industryCode)||((this.industryCode!= null)&&this.industryCode.equals(rhs.industryCode))))&&((this.changeDate == rhs.changeDate)||((this.changeDate!= null)&&this.changeDate.equals(rhs.changeDate))))&&((this.numberEmployeesInterval == rhs.numberEmployeesInterval)||((this.numberEmployeesInterval!= null)&&this.numberEmployeesInterval.equals(rhs.numberEmployeesInterval))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.visitStreet == rhs.visitStreet)||((this.visitStreet!= null)&&this.visitStreet.equals(rhs.visitStreet))))&&((this.companyRegistrationDate == rhs.companyRegistrationDate)||((this.companyRegistrationDate!= null)&&this.companyRegistrationDate.equals(rhs.companyRegistrationDate))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.town == rhs.town)||((this.town!= null)&&this.town.equals(rhs.town))))&&((this.statusDateFrom == rhs.statusDateFrom)||((this.statusDateFrom!= null)&&this.statusDateFrom.equals(rhs.statusDateFrom))))&&((this.numberCompanyUnits == rhs.numberCompanyUnits)||((this.numberCompanyUnits!= null)&&this.numberCompanyUnits.equals(rhs.numberCompanyUnits))))&&((this.webAddress == rhs.webAddress)||((this.webAddress!= null)&&this.webAddress.equals(rhs.webAddress))))&&((this.preliminaryTaxRegDate == rhs.preliminaryTaxRegDate)||((this.preliminaryTaxRegDate!= null)&&this.preliminaryTaxRegDate.equals(rhs.preliminaryTaxRegDate))))&&((this.visitCounty == rhs.visitCounty)||((this.visitCounty!= null)&&this.visitCounty.equals(rhs.visitCounty))))&&((this.companyHolder == rhs.companyHolder)||((this.companyHolder!= null)&&this.companyHolder.equals(rhs.companyHolder))))&&((this.employerContributionReg == rhs.employerContributionReg)||((this.employerContributionReg!= null)&&this.employerContributionReg.equals(rhs.employerContributionReg))))&&((this.preliminaryTaxReg == rhs.preliminaryTaxReg)||((this.preliminaryTaxReg!= null)&&this.preliminaryTaxReg.equals(rhs.preliminaryTaxReg))))&&((this.statusTextDetailed == rhs.statusTextDetailed)||((this.statusTextDetailed!= null)&&this.statusTextDetailed.equals(rhs.statusTextDetailed))))&&((this.visitCommune == rhs.visitCommune)||((this.visitCommune!= null)&&this.visitCommune.equals(rhs.visitCommune))))&&((this.topDirectorFunction == rhs.topDirectorFunction)||((this.topDirectorFunction!= null)&&this.topDirectorFunction.equals(rhs.topDirectorFunction))))&&((this.companyId == rhs.companyId)||((this.companyId!= null)&&this.companyId.equals(rhs.companyId))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.legalGroupCode == rhs.legalGroupCode)||((this.legalGroupCode!= null)&&this.legalGroupCode.equals(rhs.legalGroupCode))))&&((this.visitTown == rhs.visitTown)||((this.visitTown!= null)&&this.visitTown.equals(rhs.visitTown))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.topDirectorName == rhs.topDirectorName)||((this.topDirectorName!= null)&&this.topDirectorName.equals(rhs.topDirectorName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.legalGroupText == rhs.legalGroupText)||((this.legalGroupText!= null)&&this.legalGroupText.equals(rhs.legalGroupText))))&&((this.visitAddress == rhs.visitAddress)||((this.visitAddress!= null)&&this.visitAddress.equals(rhs.visitAddress))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
