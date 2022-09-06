/*
 * Bankable API
 * Bankable API description
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.BNKTransfer.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * CorporateCreateBody
 */

public class CorporateCreateBody {
  @JsonProperty("country_code")
  private String country_code = null;

  @JsonProperty("parent_corporate_client_code")
  private Object parent_corporate_client_code = null;

  @JsonProperty("corporate_name")
  private String corporate_name = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public CorporateCreateBody country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }

   /**
   * Two-character ISO alphabetic code. Examples: FR / GB. If left blank, the country of the client will be used.
   * @return country_code
  **/
  public String getCountryCode() {
    return country_code;
  }

  public void setCountryCode(String country_code) {
    this.country_code = country_code;
  }

  public CorporateCreateBody parent_corporate_client_code(Object parent_corporate_client_code) {
    this.parent_corporate_client_code = parent_corporate_client_code;
    return this;
  }

   /**
   * Get parent_corporate_client_code
   * @return parent_corporate_client_code
  **/
  public Object getParentCorporateClientCode() {
    return parent_corporate_client_code;
  }

  public void setParentCorporateClientCode(Object parent_corporate_client_code) {
    this.parent_corporate_client_code = parent_corporate_client_code;
  }

  public CorporateCreateBody corporate_name(String corporate_name) {
    this.corporate_name = corporate_name;
    return this;
  }

   /**
   * Corporate name
   * @return corporate_name
  **/
  public String getCorporateName() {
    return corporate_name;
  }

  public void setCorporateName(String corporate_name) {
    this.corporate_name = corporate_name;
  }

  public CorporateCreateBody entity_id(String entity_id) {
    this.entity_id = entity_id;
    return this;
  }

   /**
   * Identity of the client
   * @return entity_id
  **/
  public String getEntityId() {
    return entity_id;
  }

  public void setEntityId(String entity_id) {
    this.entity_id = entity_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateCreateBody corporate_create_body = (CorporateCreateBody) o;
    return Objects.equals(this.country_code, corporate_create_body.country_code) &&
        Objects.equals(this.parent_corporate_client_code, corporate_create_body.parent_corporate_client_code) &&
        Objects.equals(this.corporate_name, corporate_create_body.corporate_name) &&
        Objects.equals(this.entity_id, corporate_create_body.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country_code, parent_corporate_client_code, corporate_name, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateCreateBody {\n");
    
    sb.append("    country_code: ").append(toIndentedString(country_code)).append("\n");
    sb.append("    parent_corporate_client_code: ").append(toIndentedString(parent_corporate_client_code)).append("\n");
    sb.append("    corporate_name: ").append(toIndentedString(corporate_name)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
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
