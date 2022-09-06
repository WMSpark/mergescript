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
 * InlineResponse20048
 */

public class InlineResponse20048 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("bic")
  private String bic = null;

  public InlineResponse20048 request(String request) {
    this.request = request;
    return this;
  }

   /**
   * The command that was requested
   * @return request
  **/
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public InlineResponse20048 transac_id(String transac_id) {
    this.transac_id = transac_id;
    return this;
  }

   /**
   * Unique id of the request
   * @return transac_id
  **/
  public String getTransacId() {
    return transac_id;
  }

  public void setTransacId(String transac_id) {
    this.transac_id = transac_id;
  }

  public InlineResponse20048 iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number.
   * @return iban
  **/
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public InlineResponse20048 entity_id(String entity_id) {
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

  public InlineResponse20048 bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The BIC code of the Bank where the account is held.
   * @return bic
  **/
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20048 inline_response_200_48 = (InlineResponse20048) o;
    return Objects.equals(this.request, inline_response_200_48.request) &&
        Objects.equals(this.transac_id, inline_response_200_48.transac_id) &&
        Objects.equals(this.iban, inline_response_200_48.iban) &&
        Objects.equals(this.entity_id, inline_response_200_48.entity_id) &&
        Objects.equals(this.bic, inline_response_200_48.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, iban, entity_id, bic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20048 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
