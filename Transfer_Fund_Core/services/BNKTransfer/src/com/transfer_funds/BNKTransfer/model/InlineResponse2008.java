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
 * InlineResponse2008
 */

public class InlineResponse2008 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("response_data")
  private String response_data = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("request_data")
  private String request_data = null;

  public InlineResponse2008 request(String request) {
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

  public InlineResponse2008 transac_id(String transac_id) {
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

  public InlineResponse2008 response_data(String response_data) {
    this.response_data = response_data;
    return this;
  }

   /**
   * Escaped json with the request data of the call with client_transac_id_check in client_transac_id. If empty this call is still running.
   * @return response_data
  **/
  public String getResponseData() {
    return response_data;
  }

  public void setResponseData(String response_data) {
    this.response_data = response_data;
  }

  public InlineResponse2008 entity_id(String entity_id) {
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

  public InlineResponse2008 request_data(String request_data) {
    this.request_data = request_data;
    return this;
  }

   /**
   * Escaped json with the request data of the call with client_transac_id_check in client_transac_id
   * @return request_data
  **/
  public String getRequestData() {
    return request_data;
  }

  public void setRequestData(String request_data) {
    this.request_data = request_data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inline_response_200_8 = (InlineResponse2008) o;
    return Objects.equals(this.request, inline_response_200_8.request) &&
        Objects.equals(this.transac_id, inline_response_200_8.transac_id) &&
        Objects.equals(this.response_data, inline_response_200_8.response_data) &&
        Objects.equals(this.entity_id, inline_response_200_8.entity_id) &&
        Objects.equals(this.request_data, inline_response_200_8.request_data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, response_data, entity_id, request_data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    response_data: ").append(toIndentedString(response_data)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    request_data: ").append(toIndentedString(request_data)).append("\n");
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
