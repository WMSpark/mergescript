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
 * DirectdebitmandateSearchBody
 */

public class DirectdebitmandateSearchBody {
  @JsonProperty("funding_account_code")
  private Object funding_account_code = null;

  /**
   * If no present all mandates are returned irrespective of their state. True - return active mandates. False - return inactive mandates
   */
  public enum ActiveEnum {
    _0("0"),
    _1("1");

    private String value;

    ActiveEnum(String value) {
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
    public static ActiveEnum fromValue(String input) {
      for (ActiveEnum b : ActiveEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("active")
  private ActiveEnum active = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("client_code")
  private Object client_code = null;

  public DirectdebitmandateSearchBody funding_account_code(Object funding_account_code) {
    this.funding_account_code = funding_account_code;
    return this;
  }

   /**
   * Get funding_account_code
   * @return funding_account_code
  **/
  public Object getFundingAccountCode() {
    return funding_account_code;
  }

  public void setFundingAccountCode(Object funding_account_code) {
    this.funding_account_code = funding_account_code;
  }

  public DirectdebitmandateSearchBody active(ActiveEnum active) {
    this.active = active;
    return this;
  }

   /**
   * If no present all mandates are returned irrespective of their state. True - return active mandates. False - return inactive mandates
   * @return active
  **/
  public ActiveEnum getActive() {
    return active;
  }

  public void setActive(ActiveEnum active) {
    this.active = active;
  }

  public DirectdebitmandateSearchBody entity_id(String entity_id) {
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

  public DirectdebitmandateSearchBody client_code(Object client_code) {
    this.client_code = client_code;
    return this;
  }

   /**
   * Get client_code
   * @return client_code
  **/
  public Object getClientCode() {
    return client_code;
  }

  public void setClientCode(Object client_code) {
    this.client_code = client_code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectdebitmandateSearchBody directdebitmandate_search_body = (DirectdebitmandateSearchBody) o;
    return Objects.equals(this.funding_account_code, directdebitmandate_search_body.funding_account_code) &&
        Objects.equals(this.active, directdebitmandate_search_body.active) &&
        Objects.equals(this.entity_id, directdebitmandate_search_body.entity_id) &&
        Objects.equals(this.client_code, directdebitmandate_search_body.client_code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funding_account_code, active, entity_id, client_code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectdebitmandateSearchBody {\n");
    
    sb.append("    funding_account_code: ").append(toIndentedString(funding_account_code)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    client_code: ").append(toIndentedString(client_code)).append("\n");
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
