/*
 * Railsbank customer API
 * Public API for Railsbank customers
 *
 * OpenAPI spec version: api
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.RBSwagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * InlineResponse20098
 */

public class InlineResponse20098 {
  @JsonProperty("card_rule_meta")
  private Object card_rule_meta = null;

  @JsonProperty("card_rule_body")
  private String card_rule_body = null;

  /**
   * Type of the rule
   */
  public enum CardRuleTypeEnum {
    MAX_COUNT_PER_MONTH("card-max-count-per-month"),
    MAX_COUNT_PER_WEEK("card-max-count-per-week"),
    MID_BLACKLIST("card-mid-blacklist"),
    MAX_COUNT_PER_DAY("card-max-count-per-day"),
    MAX_SPEND_PER_WEEK("card-max-spend-per-week"),
    MAX_SPEND_PER_TRANSACTION("card-max-spend-per-transaction"),
    MCC_WHITELIST("card-mcc-whitelist"),
    MCC_BLACKLIST("card-mcc-blacklist"),
    MID_WHITELIST("card-mid-whitelist"),
    MAX_SPEND_PER_DAY("card-max-spend-per-day"),
    MAX_SPEND_PER_MONTH("card-max-spend-per-month");

    private String value;

    CardRuleTypeEnum(String value) {
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
    public static CardRuleTypeEnum fromValue(String input) {
      for (CardRuleTypeEnum b : CardRuleTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("card_rule_type")
  private CardRuleTypeEnum card_rule_type = null;

  @JsonProperty("card_rule_description")
  private String card_rule_description = null;

  @JsonProperty("card_rule_id")
  private String card_rule_id = null;

  @JsonProperty("card_rule_name")
  private String card_rule_name = null;

  public InlineResponse20098 card_rule_meta(Object card_rule_meta) {
    this.card_rule_meta = card_rule_meta;
    return this;
  }

   /**
   * Space for you to add the metadata you want to on your card rule.
   * @return card_rule_meta
  **/
  public Object getCardRuleMeta() {
    return card_rule_meta;
  }

  public void setCardRuleMeta(Object card_rule_meta) {
    this.card_rule_meta = card_rule_meta;
  }

  public InlineResponse20098 card_rule_body(String card_rule_body) {
    this.card_rule_body = card_rule_body;
    return this;
  }

   /**
   * This is where the rule is set. In &#x27;simple&#x27; rules this will just be the number, in other rules it may be an array of valid options
   * @return card_rule_body
  **/
  public String getCardRuleBody() {
    return card_rule_body;
  }

  public void setCardRuleBody(String card_rule_body) {
    this.card_rule_body = card_rule_body;
  }

  public InlineResponse20098 card_rule_type(CardRuleTypeEnum card_rule_type) {
    this.card_rule_type = card_rule_type;
    return this;
  }

   /**
   * Type of the rule
   * @return card_rule_type
  **/
  public CardRuleTypeEnum getCardRuleType() {
    return card_rule_type;
  }

  public void setCardRuleType(CardRuleTypeEnum card_rule_type) {
    this.card_rule_type = card_rule_type;
  }

  public InlineResponse20098 card_rule_description(String card_rule_description) {
    this.card_rule_description = card_rule_description;
    return this;
  }

   /**
   * A human readable description of the rule so others can understand the purpose/design of the rule.
   * @return card_rule_description
  **/
  public String getCardRuleDescription() {
    return card_rule_description;
  }

  public void setCardRuleDescription(String card_rule_description) {
    this.card_rule_description = card_rule_description;
  }

  public InlineResponse20098 card_rule_id(String card_rule_id) {
    this.card_rule_id = card_rule_id;
    return this;
  }

   /**
   * The rule&#x27;s uuid
   * @return card_rule_id
  **/
  public String getCardRuleId() {
    return card_rule_id;
  }

  public void setCardRuleId(String card_rule_id) {
    this.card_rule_id = card_rule_id;
  }

  public InlineResponse20098 card_rule_name(String card_rule_name) {
    this.card_rule_name = card_rule_name;
    return this;
  }

   /**
   * A human-readable name for the rule (a uuid will be provided once POSTed)
   * @return card_rule_name
  **/
  public String getCardRuleName() {
    return card_rule_name;
  }

  public void setCardRuleName(String card_rule_name) {
    this.card_rule_name = card_rule_name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20098 inline_response_200_98 = (InlineResponse20098) o;
    return Objects.equals(this.card_rule_meta, inline_response_200_98.card_rule_meta) &&
        Objects.equals(this.card_rule_body, inline_response_200_98.card_rule_body) &&
        Objects.equals(this.card_rule_type, inline_response_200_98.card_rule_type) &&
        Objects.equals(this.card_rule_description, inline_response_200_98.card_rule_description) &&
        Objects.equals(this.card_rule_id, inline_response_200_98.card_rule_id) &&
        Objects.equals(this.card_rule_name, inline_response_200_98.card_rule_name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card_rule_meta, card_rule_body, card_rule_type, card_rule_description, card_rule_id, card_rule_name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20098 {\n");
    
    sb.append("    card_rule_meta: ").append(toIndentedString(card_rule_meta)).append("\n");
    sb.append("    card_rule_body: ").append(toIndentedString(card_rule_body)).append("\n");
    sb.append("    card_rule_type: ").append(toIndentedString(card_rule_type)).append("\n");
    sb.append("    card_rule_description: ").append(toIndentedString(card_rule_description)).append("\n");
    sb.append("    card_rule_id: ").append(toIndentedString(card_rule_id)).append("\n");
    sb.append("    card_rule_name: ").append(toIndentedString(card_rule_name)).append("\n");
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
