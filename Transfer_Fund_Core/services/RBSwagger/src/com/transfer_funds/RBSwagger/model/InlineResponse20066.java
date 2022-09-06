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
 * InlineResponse20066
 */

public class InlineResponse20066 {
  @JsonProperty("temp_card_image_url")
  private String temp_card_image_url = null;

  public InlineResponse20066 temp_card_image_url(String temp_card_image_url) {
    this.temp_card_image_url = temp_card_image_url;
    return this;
  }

   /**
   * Get temp_card_image_url
   * @return temp_card_image_url
  **/
  public String getTempCardImageUrl() {
    return temp_card_image_url;
  }

  public void setTempCardImageUrl(String temp_card_image_url) {
    this.temp_card_image_url = temp_card_image_url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20066 inline_response_200_66 = (InlineResponse20066) o;
    return Objects.equals(this.temp_card_image_url, inline_response_200_66.temp_card_image_url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temp_card_image_url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20066 {\n");
    
    sb.append("    temp_card_image_url: ").append(toIndentedString(temp_card_image_url)).append("\n");
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
