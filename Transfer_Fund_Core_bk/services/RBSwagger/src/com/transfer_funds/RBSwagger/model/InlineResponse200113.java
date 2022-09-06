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
import java.time.LocalDateTime;
/**
 * InlineResponse200113
 */

public class InlineResponse200113 {
  @JsonProperty("created_at")
  private LocalDateTime created_at = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("document_id")
  private String document_id = null;

  public InlineResponse200113 created_at(LocalDateTime created_at) {
    this.created_at = created_at;
    return this;
  }

   /**
   * Get created_at
   * @return created_at
  **/
  public LocalDateTime getCreatedAt() {
    return created_at;
  }

  public void setCreatedAt(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  public InlineResponse200113 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse200113 document_id(String document_id) {
    this.document_id = document_id;
    return this;
  }

   /**
   * Get document_id
   * @return document_id
  **/
  public String getDocumentId() {
    return document_id;
  }

  public void setDocumentId(String document_id) {
    this.document_id = document_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200113 inline_response_200_113 = (InlineResponse200113) o;
    return Objects.equals(this.created_at, inline_response_200_113.created_at) &&
        Objects.equals(this.description, inline_response_200_113.description) &&
        Objects.equals(this.document_id, inline_response_200_113.document_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created_at, description, document_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200113 {\n");
    
    sb.append("    created_at: ").append(toIndentedString(created_at)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    document_id: ").append(toIndentedString(document_id)).append("\n");
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
