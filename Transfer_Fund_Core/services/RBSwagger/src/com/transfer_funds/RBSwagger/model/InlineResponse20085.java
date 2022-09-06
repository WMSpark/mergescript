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
 * InlineResponse20085
 */

public class InlineResponse20085 {
  @JsonProperty("enduser_id")
  private String enduser_id = null;

  public InlineResponse20085 enduser_id(String enduser_id) {
    this.enduser_id = enduser_id;
    return this;
  }

   /**
   * Get enduser_id
   * @return enduser_id
  **/
  public String getEnduserId() {
    return enduser_id;
  }

  public void setEnduserId(String enduser_id) {
    this.enduser_id = enduser_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20085 inline_response_200_85 = (InlineResponse20085) o;
    return Objects.equals(this.enduser_id, inline_response_200_85.enduser_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enduser_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20085 {\n");
    
    sb.append("    enduser_id: ").append(toIndentedString(enduser_id)).append("\n");
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
