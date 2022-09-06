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
import com.transfer_funds.BNKTransfer.model.InlineResponse20074RegionDetails;
/**
 * InlineResponse20074
 */

public class InlineResponse20074 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("region_details")
  private InlineResponse20074RegionDetails region_details = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public InlineResponse20074 request(String request) {
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

  public InlineResponse20074 transac_id(String transac_id) {
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

  public InlineResponse20074 region_details(InlineResponse20074RegionDetails region_details) {
    this.region_details = region_details;
    return this;
  }

   /**
   * Get region_details
   * @return region_details
  **/
  public InlineResponse20074RegionDetails getRegionDetails() {
    return region_details;
  }

  public void setRegionDetails(InlineResponse20074RegionDetails region_details) {
    this.region_details = region_details;
  }

  public InlineResponse20074 entity_id(String entity_id) {
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
    InlineResponse20074 inline_response_200_74 = (InlineResponse20074) o;
    return Objects.equals(this.request, inline_response_200_74.request) &&
        Objects.equals(this.transac_id, inline_response_200_74.transac_id) &&
        Objects.equals(this.region_details, inline_response_200_74.region_details) &&
        Objects.equals(this.entity_id, inline_response_200_74.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, region_details, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20074 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    region_details: ").append(toIndentedString(region_details)).append("\n");
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
