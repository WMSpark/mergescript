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
 * InlineResponse20056
 */

public class InlineResponse20056 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("country_code")
  private Object country_code = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public InlineResponse20056 request(String request) {
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

  public InlineResponse20056 country_code(Object country_code) {
    this.country_code = country_code;
    return this;
  }

   /**
   * Get country_code
   * @return country_code
  **/
  public Object getCountryCode() {
    return country_code;
  }

  public void setCountryCode(Object country_code) {
    this.country_code = country_code;
  }

  public InlineResponse20056 transac_id(String transac_id) {
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

  public InlineResponse20056 card_client_code(String card_client_code) {
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

  public InlineResponse20056 entity_id(String entity_id) {
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
    InlineResponse20056 inline_response_200_56 = (InlineResponse20056) o;
    return Objects.equals(this.request, inline_response_200_56.request) &&
        Objects.equals(this.country_code, inline_response_200_56.country_code) &&
        Objects.equals(this.transac_id, inline_response_200_56.transac_id) &&
        Objects.equals(this.card_client_code, inline_response_200_56.card_client_code) &&
        Objects.equals(this.entity_id, inline_response_200_56.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, country_code, transac_id, card_client_code, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20056 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    country_code: ").append(toIndentedString(country_code)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
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
