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
 * CardPininfolinkBody
 */

public class CardPininfolinkBody {
  /**
   *      - R: for retrieve - M: for modify (default is retrieve)
   */
  public enum ActionEnum {
    R("R"),
    M("M");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ActionEnum fromValue(String input) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("card_client_code")
  private String card_client_code = null;

  @JsonProperty("client_ip")
  private String client_ip = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  public CardPininfolinkBody action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   *      - R: for retrieve - M: for modify (default is retrieve)
   * @return action
  **/
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public CardPininfolinkBody card_client_code(String card_client_code) {
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

  public CardPininfolinkBody client_ip(String client_ip) {
    this.client_ip = client_ip;
    return this;
  }

   /**
   * IPV4 of the client. Format example a.b.c.d
   * @return client_ip
  **/
  public String getClientIp() {
    return client_ip;
  }

  public void setClientIp(String client_ip) {
    this.client_ip = client_ip;
  }

  public CardPininfolinkBody entity_id(String entity_id) {
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
    CardPininfolinkBody card_pininfolink_body = (CardPininfolinkBody) o;
    return Objects.equals(this.action, card_pininfolink_body.action) &&
        Objects.equals(this.card_client_code, card_pininfolink_body.card_client_code) &&
        Objects.equals(this.client_ip, card_pininfolink_body.client_ip) &&
        Objects.equals(this.entity_id, card_pininfolink_body.entity_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, card_client_code, client_ip, entity_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPininfolinkBody {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    card_client_code: ").append(toIndentedString(card_client_code)).append("\n");
    sb.append("    client_ip: ").append(toIndentedString(client_ip)).append("\n");
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
