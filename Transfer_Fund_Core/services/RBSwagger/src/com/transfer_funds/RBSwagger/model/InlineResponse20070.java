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
 * InlineResponse20070
 */

public class InlineResponse20070 {
  @JsonProperty("transaction_id")
  private String transaction_id = null;

  public InlineResponse20070 transaction_id(String transaction_id) {
    this.transaction_id = transaction_id;
    return this;
  }

   /**
   * Get transaction_id
   * @return transaction_id
  **/
  public String getTransactionId() {
    return transaction_id;
  }

  public void setTransactionId(String transaction_id) {
    this.transaction_id = transaction_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20070 inline_response_200_70 = (InlineResponse20070) o;
    return Objects.equals(this.transaction_id, inline_response_200_70.transaction_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20070 {\n");
    
    sb.append("    transaction_id: ").append(toIndentedString(transaction_id)).append("\n");
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
