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
 * InlineResponse20052
 */

public class InlineResponse20052 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("virtual_account_ref")
  private String virtual_account_ref = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public InlineResponse20052 request(String request) {
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

  public InlineResponse20052 transac_id(String transac_id) {
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

  public InlineResponse20052 virtual_account_ref(String virtual_account_ref) {
    this.virtual_account_ref = virtual_account_ref;
    return this;
  }

   /**
   * Reference ID of the virtual account
   * @return virtual_account_ref
  **/
  public String getVirtualAccountRef() {
    return virtual_account_ref;
  }

  public void setVirtualAccountRef(String virtual_account_ref) {
    this.virtual_account_ref = virtual_account_ref;
  }

  public InlineResponse20052 entity_id(String entity_id) {
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
    InlineResponse20052 inline_response_200_52 = (InlineResponse20052) o;
    return Objects.equals(this.request, inline_response_200_52.request) &&
        Objects.equals(this.transac_id, inline_response_200_52.transac_id) &&
        Objects.equals(this.virtual_account_ref, inline_response_200_52.virtual_account_ref) &&
        Objects.equals(this.entity_id, inline_response_200_52.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, virtual_account_ref, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20052 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    virtual_account_ref: ").append(toIndentedString(virtual_account_ref)).append("\n");
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
