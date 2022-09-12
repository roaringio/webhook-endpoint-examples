using System.Text.Json.Serialization;

namespace WebhookExample.Models.PayloadRequest.SE.OverviewCompany
{
    public class OverviewCompanySe
    {
        [JsonPropertyName("address")]
        public string Address { get; set; }

        [JsonPropertyName("changeDate")]
        public string ChangeDate { get; set; }

        [JsonPropertyName("coAddress")]
        public string CoAddress { get; set; }

        [JsonPropertyName("commune")]
        public string Commune { get; set; }

        [JsonPropertyName("communeCode")]
        public string CommuneCode { get; set; }

        [JsonPropertyName("companyDeregistrationDate")]
        public string CompanyDeregistrationDate { get; set; }

        [JsonPropertyName("companyHolder")]
        public string CompanyHolder { get; set; }

        [JsonPropertyName("companyId")]
        public string CompanyId { get; set; }

        [JsonPropertyName("companyName")]
        public string CompanyName { get; set; }

        [JsonPropertyName("companyRegistrationDate")]
        public string CompanyRegistrationDate { get; set; }

        [JsonPropertyName("county")]
        public string County { get; set; }

        [JsonPropertyName("email")]
        public string Email { get; set; }

        [JsonPropertyName("employerContributionReg")]
        public bool EmployerContributionReg { get; set; }

        [JsonPropertyName("employerContributionRegDate")]
        public string EmployerContributionRegDate { get; set; }

        [JsonPropertyName("faxNumber")]
        public string FaxNumber { get; set; }

        [JsonPropertyName("industryCode")]
        public string IndustryCode { get; set; }

        [JsonPropertyName("industryText")]
        public string IndustryText { get; set; }

        [JsonPropertyName("legalGroupCode")]
        public string LegalGroupCode { get; set; }

        [JsonPropertyName("legalGroupText")]
        public string LegalGroupText { get; set; }

        [JsonPropertyName("numberCompanyUnits")]
        public int NumberCompanyUnits { get; set; }

        [JsonPropertyName("numberEmployeesInterval")]
        public string NumberEmployeesInterval { get; set; }

        [JsonPropertyName("phoneNumber")]
        public string PhoneNumber { get; set; }

        [JsonPropertyName("preliminaryTaxReg")]
        public bool PreliminaryTaxReg { get; set; }

        [JsonPropertyName("preliminaryTaxRegDate")]
        public string PreliminaryTaxRegDate { get; set; }

        [JsonPropertyName("severalCompanyName")]
        public bool SeveralCompanyName { get; set; }

        [JsonPropertyName("statusCode")]
        public string StatusCode { get; set; }

        [JsonPropertyName("statusDateFrom")]
        public string StatusDateFrom { get; set; }

        [JsonPropertyName("statusTextDetailed")]
        public string StatusTextDetailed { get; set; }

        [JsonPropertyName("statusTextHigh")]
        public string StatusTextHigh { get; set; }

        [JsonPropertyName("topDirectorFunction")]
        public string TopDirectorFunction { get; set; }

        [JsonPropertyName("topDirectorName")]
        public string TopDirectorName { get; set; }

        [JsonPropertyName("town")]
        public string Town { get; set; }

        [JsonPropertyName("vatReg")]
        public bool VatReg { get; set; }

        [JsonPropertyName("vatRegDate")]
        public string VatRegDate { get; set; }

        [JsonPropertyName("visitAddress")]
        public string VisitAddress { get; set; }

        [JsonPropertyName("visitCommune")]
        public string VisitCommune { get; set; }

        [JsonPropertyName("visitCounty")]
        public string VisitCounty { get; set; }

        [JsonPropertyName("visitStreet")]
        public string VisitStreet { get; set; }

        [JsonPropertyName("visitTown")]
        public string VisitTown { get; set; }

        [JsonPropertyName("visitZipCode")]
        public string VisitZipCode { get; set; }

        [JsonPropertyName("webAddress")]
        public string WebAddress { get; set; }

        [JsonPropertyName("zipCode")]
        public string ZipCode { get; set; }
    }
}