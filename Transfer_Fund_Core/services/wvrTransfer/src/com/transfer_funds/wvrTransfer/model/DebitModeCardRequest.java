/*
 * Weavr Multi Product API
 * Weavr Multi API provides a simple and flexible way to issue cards and accounts to your customers.  By integrating Weavr Multi API in your application you can embed banking capabilities within your app and provide a seamless experience for our customers.   # Authentication Each request to the Multi API needs to be signed with an `api_key` that represents your account. You can obtain an API Key by registering for a Multi account [here](https://portal.weavr.io).  Almost all endpoints require a secondary authentication token `Authorization` that represents the user for whom the request is being executed.   <!-- ReDoc-Inject: <security-definitions> --> 
 *
 * OpenAPI spec version: 3.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.wvrTransfer.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * DebitModeCardRequest
 */

public class DebitModeCardRequest extends ManagedCardRequest {
  @JsonProperty("parentManagedAccountId")
  private String parentManagedAccountId = null;

  public DebitModeCardRequest parentManagedAccountId(String parentManagedAccountId) {
    this.parentManagedAccountId = parentManagedAccountId;
    return this;
  }

   /**
   * Id of the managed account holding funds which the managed card will access, up to a configurable spend limit.
   * @return parentManagedAccountId
  **/
  public String getParentManagedAccountId() {
    return parentManagedAccountId;
  }

  public void setParentManagedAccountId(String parentManagedAccountId) {
    this.parentManagedAccountId = parentManagedAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitModeCardRequest DebitModeCardRequest = (DebitModeCardRequest) o;
    return Objects.equals(this.parentManagedAccountId, DebitModeCardRequest.parentManagedAccountId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentManagedAccountId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitModeCardRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parentManagedAccountId: ").append(toIndentedString(parentManagedAccountId)).append("\n");
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
