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
 * InlineResponse200103
 */

public class InlineResponse200103 {
  @JsonProperty("account_id")
  private String account_id = null;

  public InlineResponse200103 account_id(String account_id) {
    this.account_id = account_id;
    return this;
  }

   /**
   * Get account_id
   * @return account_id
  **/
  public String getAccountId() {
    return account_id;
  }

  public void setAccountId(String account_id) {
    this.account_id = account_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200103 inline_response_200_103 = (InlineResponse200103) o;
    return Objects.equals(this.account_id, inline_response_200_103.account_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200103 {\n");
    
    sb.append("    account_id: ").append(toIndentedString(account_id)).append("\n");
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
