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
import com.transfer_funds.RBSwagger.model.InlineResponse20057Beneficiaries;
import com.transfer_funds.RBSwagger.model.InlineResponse20057Person;
import com.transfer_funds.RBSwagger.model.V1customerbeneficiariesCompany;
import com.transfer_funds.RBSwagger.model.V1customercardsAdditionalLedgers;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200109
 */

public class InlineResponse200109 {
  @JsonProperty("missing_data")
  private List<String> missing_data = null;

  /**
   * Gets or Sets enduser_kyc_status
   */
  public enum EnduserKycStatusEnum {
    ERROR("enduser-kyc-status-error"),
    STARTED("enduser-kyc-status-started"),
    APPROVED("enduser-kyc-status-approved"),
    DECLINED("enduser-kyc-status-declined");

    private String value;

    EnduserKycStatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EnduserKycStatusEnum fromValue(String input) {
      for (EnduserKycStatusEnum b : EnduserKycStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enduser_kyc_status")
  private EnduserKycStatusEnum enduser_kyc_status = null;

  @JsonProperty("enduser_id")
  private String enduser_id = null;

  @JsonProperty("ledgers")
  private List<V1customercardsAdditionalLedgers> ledgers = null;

  @JsonProperty("created_at")
  private LocalDateTime created_at = null;

  @JsonProperty("last_modified_at")
  private LocalDateTime last_modified_at = null;

  /**
   * Gets or Sets enduser_status
   */
  public enum EnduserStatusEnum {
    DECLINED("enduser-status-declined"),
    PENDING("enduser-status-pending"),
    OK("enduser-status-ok"),
    MISSING_DATA("enduser-status-missing-data"),
    QUARANTINE("enduser-status-quarantine");

    private String value;

    EnduserStatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EnduserStatusEnum fromValue(String input) {
      for (EnduserStatusEnum b : EnduserStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enduser_status")
  private EnduserStatusEnum enduser_status = null;

  /**
   * Gets or Sets entity_type
   */
  public enum EntityTypeEnum {
    PERSON("person"),
    COMPANY("company");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EntityTypeEnum fromValue(String input) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("entity_type")
  private EntityTypeEnum entity_type = null;

  @JsonProperty("screening_monitored_search")
  private Boolean screening_monitored_search = null;

  @JsonProperty("person")
  private InlineResponse20057Person person = null;

  @JsonProperty("company")
  private V1customerbeneficiariesCompany company = null;

  @JsonProperty("enduser_meta")
  private Object enduser_meta = null;

  @JsonProperty("beneficiaries")
  private List<InlineResponse20057Beneficiaries> beneficiaries = null;

  public InlineResponse200109 missing_data(List<String> missing_data) {
    this.missing_data = missing_data;
    return this;
  }

  public InlineResponse200109 addMissingDataItem(String missing_dataItem) {
    if (this.missing_data == null) {
      this.missing_data = new ArrayList<>();
    }
    this.missing_data.add(missing_dataItem);
    return this;
  }

   /**
   * Get missing_data
   * @return missing_data
  **/
  public List<String> getMissingData() {
    return missing_data;
  }

  public void setMissingData(List<String> missing_data) {
    this.missing_data = missing_data;
  }

  public InlineResponse200109 enduser_kyc_status(EnduserKycStatusEnum enduser_kyc_status) {
    this.enduser_kyc_status = enduser_kyc_status;
    return this;
  }

   /**
   * Get enduser_kyc_status
   * @return enduser_kyc_status
  **/
  public EnduserKycStatusEnum getEnduserKycStatus() {
    return enduser_kyc_status;
  }

  public void setEnduserKycStatus(EnduserKycStatusEnum enduser_kyc_status) {
    this.enduser_kyc_status = enduser_kyc_status;
  }

  public InlineResponse200109 enduser_id(String enduser_id) {
    this.enduser_id = enduser_id;
    return this;
  }

   /**
   * Get enduser_id
   * @return enduser_id
  **/
  public String getEnduserId() {
    return enduser_id;
  }

  public void setEnduserId(String enduser_id) {
    this.enduser_id = enduser_id;
  }

  public InlineResponse200109 ledgers(List<V1customercardsAdditionalLedgers> ledgers) {
    this.ledgers = ledgers;
    return this;
  }

  public InlineResponse200109 addLedgersItem(V1customercardsAdditionalLedgers ledgersItem) {
    if (this.ledgers == null) {
      this.ledgers = new ArrayList<>();
    }
    this.ledgers.add(ledgersItem);
    return this;
  }

   /**
   * Get ledgers
   * @return ledgers
  **/
  public List<V1customercardsAdditionalLedgers> getLedgers() {
    return ledgers;
  }

  public void setLedgers(List<V1customercardsAdditionalLedgers> ledgers) {
    this.ledgers = ledgers;
  }

  public InlineResponse200109 created_at(LocalDateTime created_at) {
    this.created_at = created_at;
    return this;
  }

   /**
   * Get created_at
   * @return created_at
  **/
  public LocalDateTime getCreatedAt() {
    return created_at;
  }

  public void setCreatedAt(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  public InlineResponse200109 last_modified_at(LocalDateTime last_modified_at) {
    this.last_modified_at = last_modified_at;
    return this;
  }

   /**
   * Get last_modified_at
   * @return last_modified_at
  **/
  public LocalDateTime getLastModifiedAt() {
    return last_modified_at;
  }

  public void setLastModifiedAt(LocalDateTime last_modified_at) {
    this.last_modified_at = last_modified_at;
  }

  public InlineResponse200109 enduser_status(EnduserStatusEnum enduser_status) {
    this.enduser_status = enduser_status;
    return this;
  }

   /**
   * Get enduser_status
   * @return enduser_status
  **/
  public EnduserStatusEnum getEnduserStatus() {
    return enduser_status;
  }

  public void setEnduserStatus(EnduserStatusEnum enduser_status) {
    this.enduser_status = enduser_status;
  }

  public InlineResponse200109 entity_type(EntityTypeEnum entity_type) {
    this.entity_type = entity_type;
    return this;
  }

   /**
   * Get entity_type
   * @return entity_type
  **/
  public EntityTypeEnum getEntityType() {
    return entity_type;
  }

  public void setEntityType(EntityTypeEnum entity_type) {
    this.entity_type = entity_type;
  }

  public InlineResponse200109 screening_monitored_search(Boolean screening_monitored_search) {
    this.screening_monitored_search = screening_monitored_search;
    return this;
  }

   /**
   * Get screening_monitored_search
   * @return screening_monitored_search
  **/
  public Boolean isScreeningMonitoredSearch() {
    return screening_monitored_search;
  }

  public void setScreeningMonitoredSearch(Boolean screening_monitored_search) {
    this.screening_monitored_search = screening_monitored_search;
  }

  public InlineResponse200109 person(InlineResponse20057Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  public InlineResponse20057Person getPerson() {
    return person;
  }

  public void setPerson(InlineResponse20057Person person) {
    this.person = person;
  }

  public InlineResponse200109 company(V1customerbeneficiariesCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  public V1customerbeneficiariesCompany getCompany() {
    return company;
  }

  public void setCompany(V1customerbeneficiariesCompany company) {
    this.company = company;
  }

  public InlineResponse200109 enduser_meta(Object enduser_meta) {
    this.enduser_meta = enduser_meta;
    return this;
  }

   /**
   * Get enduser_meta
   * @return enduser_meta
  **/
  public Object getEnduserMeta() {
    return enduser_meta;
  }

  public void setEnduserMeta(Object enduser_meta) {
    this.enduser_meta = enduser_meta;
  }

  public InlineResponse200109 beneficiaries(List<InlineResponse20057Beneficiaries> beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  public InlineResponse200109 addBeneficiariesItem(InlineResponse20057Beneficiaries beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * Get beneficiaries
   * @return beneficiaries
  **/
  public List<InlineResponse20057Beneficiaries> getBeneficiaries() {
    return beneficiaries;
  }

  public void setBeneficiaries(List<InlineResponse20057Beneficiaries> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200109 inline_response_200_109 = (InlineResponse200109) o;
    return Objects.equals(this.missing_data, inline_response_200_109.missing_data) &&
        Objects.equals(this.enduser_kyc_status, inline_response_200_109.enduser_kyc_status) &&
        Objects.equals(this.enduser_id, inline_response_200_109.enduser_id) &&
        Objects.equals(this.ledgers, inline_response_200_109.ledgers) &&
        Objects.equals(this.created_at, inline_response_200_109.created_at) &&
        Objects.equals(this.last_modified_at, inline_response_200_109.last_modified_at) &&
        Objects.equals(this.enduser_status, inline_response_200_109.enduser_status) &&
        Objects.equals(this.entity_type, inline_response_200_109.entity_type) &&
        Objects.equals(this.screening_monitored_search, inline_response_200_109.screening_monitored_search) &&
        Objects.equals(this.person, inline_response_200_109.person) &&
        Objects.equals(this.company, inline_response_200_109.company) &&
        Objects.equals(this.enduser_meta, inline_response_200_109.enduser_meta) &&
        Objects.equals(this.beneficiaries, inline_response_200_109.beneficiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missing_data, enduser_kyc_status, enduser_id, ledgers, created_at, last_modified_at, enduser_status, entity_type, screening_monitored_search, person, company, enduser_meta, beneficiaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200109 {\n");
    
    sb.append("    missing_data: ").append(toIndentedString(missing_data)).append("\n");
    sb.append("    enduser_kyc_status: ").append(toIndentedString(enduser_kyc_status)).append("\n");
    sb.append("    enduser_id: ").append(toIndentedString(enduser_id)).append("\n");
    sb.append("    ledgers: ").append(toIndentedString(ledgers)).append("\n");
    sb.append("    created_at: ").append(toIndentedString(created_at)).append("\n");
    sb.append("    last_modified_at: ").append(toIndentedString(last_modified_at)).append("\n");
    sb.append("    enduser_status: ").append(toIndentedString(enduser_status)).append("\n");
    sb.append("    entity_type: ").append(toIndentedString(entity_type)).append("\n");
    sb.append("    screening_monitored_search: ").append(toIndentedString(screening_monitored_search)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    enduser_meta: ").append(toIndentedString(enduser_meta)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
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
