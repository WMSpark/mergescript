/*
 * Railsbank customer API
 * Public API for Railsbank customers
 *
 * OpenAPI spec version: api
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.RBSwagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.transfer_funds.RBSwagger.model.V1customerbeneficiariesCompany1;
import com.transfer_funds.RBSwagger.model.V1customerbeneficiariesPerson1;
import com.transfer_funds.RBSwagger.model.V1customerbeneficiariesbeneficiaryIdDefaultAccount;
/**
 * BeneficiariesBeneficiaryIdBody
 */

public class BeneficiariesBeneficiaryIdBody {
  @JsonProperty("uk_account_number")
  private String uk_account_number = null;

  @JsonProperty("person")
  private V1customerbeneficiariesPerson1 person = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("bank_name")
  private String bank_name = null;

  @JsonProperty("bank_country")
  private String bank_country = null;

  @JsonProperty("company")
  private V1customerbeneficiariesCompany1 company = null;

  @JsonProperty("beneficiary_meta")
  private Object beneficiary_meta = null;

  @JsonProperty("default_account")
  private V1customerbeneficiariesbeneficiaryIdDefaultAccount default_account = null;

  @JsonProperty("bic_swift")
  private String bic_swift = null;

  @JsonProperty("uk_sort_code")
  private String uk_sort_code = null;

  public BeneficiariesBeneficiaryIdBody uk_account_number(String uk_account_number) {
    this.uk_account_number = uk_account_number;
    return this;
  }

   /**
   * Get uk_account_number
   * @return uk_account_number
  **/
  public String getUkAccountNumber() {
    return uk_account_number;
  }

  public void setUkAccountNumber(String uk_account_number) {
    this.uk_account_number = uk_account_number;
  }

  public BeneficiariesBeneficiaryIdBody person(V1customerbeneficiariesPerson1 person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  public V1customerbeneficiariesPerson1 getPerson() {
    return person;
  }

  public void setPerson(V1customerbeneficiariesPerson1 person) {
    this.person = person;
  }

  public BeneficiariesBeneficiaryIdBody iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public BeneficiariesBeneficiaryIdBody bank_name(String bank_name) {
    this.bank_name = bank_name;
    return this;
  }

   /**
   * Get bank_name
   * @return bank_name
  **/
  public String getBankName() {
    return bank_name;
  }

  public void setBankName(String bank_name) {
    this.bank_name = bank_name;
  }

  public BeneficiariesBeneficiaryIdBody bank_country(String bank_country) {
    this.bank_country = bank_country;
    return this;
  }

   /**
   * Get bank_country
   * @return bank_country
  **/
  public String getBankCountry() {
    return bank_country;
  }

  public void setBankCountry(String bank_country) {
    this.bank_country = bank_country;
  }

  public BeneficiariesBeneficiaryIdBody company(V1customerbeneficiariesCompany1 company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  public V1customerbeneficiariesCompany1 getCompany() {
    return company;
  }

  public void setCompany(V1customerbeneficiariesCompany1 company) {
    this.company = company;
  }

  public BeneficiariesBeneficiaryIdBody beneficiary_meta(Object beneficiary_meta) {
    this.beneficiary_meta = beneficiary_meta;
    return this;
  }

   /**
   * Get beneficiary_meta
   * @return beneficiary_meta
  **/
  public Object getBeneficiaryMeta() {
    return beneficiary_meta;
  }

  public void setBeneficiaryMeta(Object beneficiary_meta) {
    this.beneficiary_meta = beneficiary_meta;
  }

  public BeneficiariesBeneficiaryIdBody default_account(V1customerbeneficiariesbeneficiaryIdDefaultAccount default_account) {
    this.default_account = default_account;
    return this;
  }

   /**
   * Get default_account
   * @return default_account
  **/
  public V1customerbeneficiariesbeneficiaryIdDefaultAccount getDefaultAccount() {
    return default_account;
  }

  public void setDefaultAccount(V1customerbeneficiariesbeneficiaryIdDefaultAccount default_account) {
    this.default_account = default_account;
  }

  public BeneficiariesBeneficiaryIdBody bic_swift(String bic_swift) {
    this.bic_swift = bic_swift;
    return this;
  }

   /**
   * Get bic_swift
   * @return bic_swift
  **/
  public String getBicSwift() {
    return bic_swift;
  }

  public void setBicSwift(String bic_swift) {
    this.bic_swift = bic_swift;
  }

  public BeneficiariesBeneficiaryIdBody uk_sort_code(String uk_sort_code) {
    this.uk_sort_code = uk_sort_code;
    return this;
  }

   /**
   * Get uk_sort_code
   * @return uk_sort_code
  **/
  public String getUkSortCode() {
    return uk_sort_code;
  }

  public void setUkSortCode(String uk_sort_code) {
    this.uk_sort_code = uk_sort_code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficiariesBeneficiaryIdBody beneficiaries_beneficiary_id_body = (BeneficiariesBeneficiaryIdBody) o;
    return Objects.equals(this.uk_account_number, beneficiaries_beneficiary_id_body.uk_account_number) &&
        Objects.equals(this.person, beneficiaries_beneficiary_id_body.person) &&
        Objects.equals(this.iban, beneficiaries_beneficiary_id_body.iban) &&
        Objects.equals(this.bank_name, beneficiaries_beneficiary_id_body.bank_name) &&
        Objects.equals(this.bank_country, beneficiaries_beneficiary_id_body.bank_country) &&
        Objects.equals(this.company, beneficiaries_beneficiary_id_body.company) &&
        Objects.equals(this.beneficiary_meta, beneficiaries_beneficiary_id_body.beneficiary_meta) &&
        Objects.equals(this.default_account, beneficiaries_beneficiary_id_body.default_account) &&
        Objects.equals(this.bic_swift, beneficiaries_beneficiary_id_body.bic_swift) &&
        Objects.equals(this.uk_sort_code, beneficiaries_beneficiary_id_body.uk_sort_code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uk_account_number, person, iban, bank_name, bank_country, company, beneficiary_meta, default_account, bic_swift, uk_sort_code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiariesBeneficiaryIdBody {\n");
    
    sb.append("    uk_account_number: ").append(toIndentedString(uk_account_number)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bank_name: ").append(toIndentedString(bank_name)).append("\n");
    sb.append("    bank_country: ").append(toIndentedString(bank_country)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    beneficiary_meta: ").append(toIndentedString(beneficiary_meta)).append("\n");
    sb.append("    default_account: ").append(toIndentedString(default_account)).append("\n");
    sb.append("    bic_swift: ").append(toIndentedString(bic_swift)).append("\n");
    sb.append("    uk_sort_code: ").append(toIndentedString(uk_sort_code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
