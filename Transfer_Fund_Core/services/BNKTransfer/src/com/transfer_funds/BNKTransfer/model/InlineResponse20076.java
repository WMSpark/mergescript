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
 * InlineResponse20076
 */

public class InlineResponse20076 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("reject_reason")
  private String reject_reason = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("status")
  private String status = null;

  public InlineResponse20076 request(String request) {
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

  public InlineResponse20076 transac_id(String transac_id) {
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

  public InlineResponse20076 reject_reason(String reject_reason) {
    this.reject_reason = reject_reason;
    return this;
  }

   /**
   * String describing why the refund request was rejected. E.g. \&quot;Mandate Not Found\&quot;, \&quot;Transaction Not Found\&quot;, \&quot;Transaction older than 13 months\&quot;.
   * @return reject_reason
  **/
  public String getRejectReason() {
    return reject_reason;
  }

  public void setRejectReason(String reject_reason) {
    this.reject_reason = reject_reason;
  }

  public InlineResponse20076 entity_id(String entity_id) {
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

  public InlineResponse20076 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indication of whether the request was valid (true) or invalid (false)
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20076 inline_response_200_76 = (InlineResponse20076) o;
    return Objects.equals(this.request, inline_response_200_76.request) &&
        Objects.equals(this.transac_id, inline_response_200_76.transac_id) &&
        Objects.equals(this.reject_reason, inline_response_200_76.reject_reason) &&
        Objects.equals(this.entity_id, inline_response_200_76.entity_id) &&
        Objects.equals(this.status, inline_response_200_76.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, reject_reason, entity_id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20076 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    reject_reason: ").append(toIndentedString(reject_reason)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
