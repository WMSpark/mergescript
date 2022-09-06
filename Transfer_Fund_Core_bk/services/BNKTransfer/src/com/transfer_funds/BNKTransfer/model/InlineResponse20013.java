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
 * InlineResponse20013
 */

public class InlineResponse20013 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("geo_profile_code")
  private String geo_profile_code = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public InlineResponse20013 request(String request) {
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

  public InlineResponse20013 transac_id(String transac_id) {
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

  public InlineResponse20013 geo_profile_code(String geo_profile_code) {
    this.geo_profile_code = geo_profile_code;
    return this;
  }

   /**
   * Unique Identifier of geo profile
   * @return geo_profile_code
  **/
  public String getGeoProfileCode() {
    return geo_profile_code;
  }

  public void setGeoProfileCode(String geo_profile_code) {
    this.geo_profile_code = geo_profile_code;
  }

  public InlineResponse20013 card_client_code(String card_client_code) {
    this.card_client_code = card_client_code;
    return this;
  }

   /**
   * Reference id of the card
   * @return card_client_code
  **/
  public String getCardClientCode() {
    return card_client_code;
  }

  public void setCardClientCode(String card_client_code) {
    this.card_client_code = card_client_code;
  }

  public InlineResponse20013 entity_id(String entity_id) {
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
    InlineResponse20013 inline_response_200_13 = (InlineResponse20013) o;
    return Objects.equals(this.request, inline_response_200_13.request) &&
        Objects.equals(this.transac_id, inline_response_200_13.transac_id) &&
        Objects.equals(this.geo_profile_code, inline_response_200_13.geo_profile_code) &&
        Objects.equals(this.card_client_code, inline_response_200_13.card_client_code) &&
        Objects.equals(this.entity_id, inline_response_200_13.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, geo_profile_code, card_client_code, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    geo_profile_code: ").append(toIndentedString(geo_profile_code)).append("\n");
    sb.append("    card_client_code: ").append(toIndentedString(card_client_code)).append("\n");
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
