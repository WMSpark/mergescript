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
 * DirectdebitRefusalBody
 */

public class DirectdebitRefusalBody {
  @JsonProperty("transaction_id")
  private Object transaction_id = null;

  @JsonProperty("mandate_id")
  private Object mandate_id = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("client_code")
  private Object client_code = null;

  public DirectdebitRefusalBody transaction_id(Object transaction_id) {
    this.transaction_id = transaction_id;
    return this;
  }

   /**
   * Get transaction_id
   * @return transaction_id
  **/
  public Object getTransactionId() {
    return transaction_id;
  }

  public void setTransactionId(Object transaction_id) {
    this.transaction_id = transaction_id;
  }

  public DirectdebitRefusalBody mandate_id(Object mandate_id) {
    this.mandate_id = mandate_id;
    return this;
  }

   /**
   * Get mandate_id
   * @return mandate_id
  **/
  public Object getMandateId() {
    return mandate_id;
  }

  public void setMandateId(Object mandate_id) {
    this.mandate_id = mandate_id;
  }

  public DirectdebitRefusalBody entity_id(String entity_id) {
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

  public DirectdebitRefusalBody client_code(Object client_code) {
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
    DirectdebitRefusalBody directdebit_refusal_body = (DirectdebitRefusalBody) o;
    return Objects.equals(this.transaction_id, directdebit_refusal_body.transaction_id) &&
        Objects.equals(this.mandate_id, directdebit_refusal_body.mandate_id) &&
        Objects.equals(this.entity_id, directdebit_refusal_body.entity_id) &&
        Objects.equals(this.client_code, directdebit_refusal_body.client_code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction_id, mandate_id, entity_id, client_code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectdebitRefusalBody {\n");
    
    sb.append("    transaction_id: ").append(toIndentedString(transaction_id)).append("\n");
    sb.append("    mandate_id: ").append(toIndentedString(mandate_id)).append("\n");
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
