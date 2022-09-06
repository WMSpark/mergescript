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
 * V1customercardsAdditionalLedgers
 */

public class V1customercardsAdditionalLedgers {
  @JsonProperty("ledger_id")
  private String ledger_id = null;

  public V1customercardsAdditionalLedgers ledger_id(String ledger_id) {
    this.ledger_id = ledger_id;
    return this;
  }

   /**
   * Get ledger_id
   * @return ledger_id
  **/
  public String getLedgerId() {
    return ledger_id;
  }

  public void setLedgerId(String ledger_id) {
    this.ledger_id = ledger_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1customercardsAdditionalLedgers v1customercards_additional_ledgers = (V1customercardsAdditionalLedgers) o;
    return Objects.equals(this.ledger_id, v1customercards_additional_ledgers.ledger_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledger_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1customercardsAdditionalLedgers {\n");
    
    sb.append("    ledger_id: ").append(toIndentedString(ledger_id)).append("\n");
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
