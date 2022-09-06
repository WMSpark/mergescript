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
 * CardFeeBody
 */

public class CardFeeBody {
  @JsonProperty("fee")
  private Object fee = null;

  @JsonProperty("virtual_account_ref")
  private String virtual_account_ref = null;

  @JsonProperty("description")
  private Object description = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public CardFeeBody fee(Object fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  public Object getFee() {
    return fee;
  }

  public void setFee(Object fee) {
    this.fee = fee;
  }

  public CardFeeBody virtual_account_ref(String virtual_account_ref) {
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

  public CardFeeBody description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public CardFeeBody card_client_code(String card_client_code) {
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

  public CardFeeBody currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency. ISO 3 characters code.
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CardFeeBody entity_id(String entity_id) {
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
    CardFeeBody card_fee_body = (CardFeeBody) o;
    return Objects.equals(this.fee, card_fee_body.fee) &&
        Objects.equals(this.virtual_account_ref, card_fee_body.virtual_account_ref) &&
        Objects.equals(this.description, card_fee_body.description) &&
        Objects.equals(this.card_client_code, card_fee_body.card_client_code) &&
        Objects.equals(this.currency, card_fee_body.currency) &&
        Objects.equals(this.entity_id, card_fee_body.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, virtual_account_ref, description, card_client_code, currency, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFeeBody {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    virtual_account_ref: ").append(toIndentedString(virtual_account_ref)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    card_client_code: ").append(toIndentedString(card_client_code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
