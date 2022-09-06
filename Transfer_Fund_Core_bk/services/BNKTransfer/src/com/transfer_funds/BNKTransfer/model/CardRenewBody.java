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
 * CardRenewBody
 */

public class CardRenewBody {
  @JsonProperty("delivery_address")
  private Object delivery_address = null;

  @JsonProperty("card_line_4")
  private String card_line_4 = null;

  @JsonProperty("card_name")
  private String card_name = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public CardRenewBody delivery_address(Object delivery_address) {
    this.delivery_address = delivery_address;
    return this;
  }

   /**
   * Get delivery_address
   * @return delivery_address
  **/
  public Object getDeliveryAddress() {
    return delivery_address;
  }

  public void setDeliveryAddress(Object delivery_address) {
    this.delivery_address = delivery_address;
  }

  public CardRenewBody card_line_4(String card_line_4) {
    this.card_line_4 = card_line_4;
    return this;
  }

   /**
   * Free text field. For line 4 variable data. A regular expression for control will put in place.
   * @return card_line_4
  **/
  public String getCardLine4() {
    return card_line_4;
  }

  public void setCardLine4(String card_line_4) {
    this.card_line_4 = card_line_4;
  }

  public CardRenewBody card_name(String card_name) {
    this.card_name = card_name;
    return this;
  }

   /**
   * The name to appear on the card. If omitted then the card name will be composed by: &lt;first_name&gt;&lt;&gt;&lt;last_name&gt; or if abbreviation is needed &lt;first letter of first_name&gt;&lt;&gt;&lt;last_name&gt;. The field length can vary depending on the card design and is also restricted to a maximum of 21 if the provider is Marqeta.
   * @return card_name
  **/
  public String getCardName() {
    return card_name;
  }

  public void setCardName(String card_name) {
    this.card_name = card_name;
  }

  public CardRenewBody card_client_code(String card_client_code) {
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

  public CardRenewBody entity_id(String entity_id) {
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
    CardRenewBody card_renew_body = (CardRenewBody) o;
    return Objects.equals(this.delivery_address, card_renew_body.delivery_address) &&
        Objects.equals(this.card_line_4, card_renew_body.card_line_4) &&
        Objects.equals(this.card_name, card_renew_body.card_name) &&
        Objects.equals(this.card_client_code, card_renew_body.card_client_code) &&
        Objects.equals(this.entity_id, card_renew_body.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivery_address, card_line_4, card_name, card_client_code, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRenewBody {\n");
    
    sb.append("    delivery_address: ").append(toIndentedString(delivery_address)).append("\n");
    sb.append("    card_line_4: ").append(toIndentedString(card_line_4)).append("\n");
    sb.append("    card_name: ").append(toIndentedString(card_name)).append("\n");
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
