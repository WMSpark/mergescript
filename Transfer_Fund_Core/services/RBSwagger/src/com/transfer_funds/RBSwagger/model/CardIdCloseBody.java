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
 * CardIdCloseBody
 */

public class CardIdCloseBody {
  /**
   * Sets the reason why card was closed
   */
  public enum CloseReasonEnum {
    STOLEN("card-stolen"),
    DESTROYED("card-destroyed");

    private String value;

    CloseReasonEnum(String value) {
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
    public static CloseReasonEnum fromValue(String input) {
      for (CloseReasonEnum b : CloseReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("close_reason")
  private CloseReasonEnum close_reason = null;

  public CardIdCloseBody close_reason(CloseReasonEnum close_reason) {
    this.close_reason = close_reason;
    return this;
  }

   /**
   * Sets the reason why card was closed
   * @return close_reason
  **/
  public CloseReasonEnum getCloseReason() {
    return close_reason;
  }

  public void setCloseReason(CloseReasonEnum close_reason) {
    this.close_reason = close_reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardIdCloseBody card_id_close_body = (CardIdCloseBody) o;
    return Objects.equals(this.close_reason, card_id_close_body.close_reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(close_reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardIdCloseBody {\n");
    
    sb.append("    close_reason: ").append(toIndentedString(close_reason)).append("\n");
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
