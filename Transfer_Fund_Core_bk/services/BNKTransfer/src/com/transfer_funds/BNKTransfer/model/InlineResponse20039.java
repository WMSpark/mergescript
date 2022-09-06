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
import com.transfer_funds.BNKTransfer.model.FxcardtransparencyinfoFeeDetails;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20039
 */

public class InlineResponse20039 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("fee_details")
  private List<FxcardtransparencyinfoFeeDetails> fee_details = null;

  @JsonProperty("secured_url")
  private String secured_url = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public InlineResponse20039 request(String request) {
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

  public InlineResponse20039 transac_id(String transac_id) {
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

  public InlineResponse20039 fee_details(List<FxcardtransparencyinfoFeeDetails> fee_details) {
    this.fee_details = fee_details;
    return this;
  }

  public InlineResponse20039 addFeeDetailsItem(FxcardtransparencyinfoFeeDetails fee_detailsItem) {
    if (this.fee_details == null) {
      this.fee_details = new ArrayList<>();
    }
    this.fee_details.add(fee_detailsItem);
    return this;
  }

   /**
   * Get fee_details
   * @return fee_details
  **/
  public List<FxcardtransparencyinfoFeeDetails> getFeeDetails() {
    return fee_details;
  }

  public void setFeeDetails(List<FxcardtransparencyinfoFeeDetails> fee_details) {
    this.fee_details = fee_details;
  }

  public InlineResponse20039 secured_url(String secured_url) {
    this.secured_url = secured_url;
    return this;
  }

   /**
   * The link contains a secure token that will be useable just one time and will expire in the next 15 minutes. The server will only accept a connection from the client with the correct Ipv4. For R action, when you perform a HTTP GET from this URL, the JSON returned will return the PIN details in card_pin format. For M action, the PIN data must be posted to the URL in the format of card_pin.
   * @return secured_url
  **/
  public String getSecuredUrl() {
    return secured_url;
  }

  public void setSecuredUrl(String secured_url) {
    this.secured_url = secured_url;
  }

  public InlineResponse20039 card_client_code(String card_client_code) {
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

  public InlineResponse20039 entity_id(String entity_id) {
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
    InlineResponse20039 inline_response_200_39 = (InlineResponse20039) o;
    return Objects.equals(this.request, inline_response_200_39.request) &&
        Objects.equals(this.transac_id, inline_response_200_39.transac_id) &&
        Objects.equals(this.fee_details, inline_response_200_39.fee_details) &&
        Objects.equals(this.secured_url, inline_response_200_39.secured_url) &&
        Objects.equals(this.card_client_code, inline_response_200_39.card_client_code) &&
        Objects.equals(this.entity_id, inline_response_200_39.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, fee_details, secured_url, card_client_code, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    fee_details: ").append(toIndentedString(fee_details)).append("\n");
    sb.append("    secured_url: ").append(toIndentedString(secured_url)).append("\n");
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
