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
 * InlineResponse2003MetaData
 */

public class InlineResponse2003MetaData {
  @JsonProperty("from_date_time")
  private Object from_date_time = null;

  @JsonProperty("accountReference")
  private String accountReference = null;

  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("numTransactionsRequested")
  private Object numTransactionsRequested = null;

  @JsonProperty("to_date_time")
  private Object to_date_time = null;

  public InlineResponse2003MetaData from_date_time(Object from_date_time) {
    this.from_date_time = from_date_time;
    return this;
  }

   /**
   * Get from_date_time
   * @return from_date_time
  **/
  public Object getFromDateTime() {
    return from_date_time;
  }

  public void setFromDateTime(Object from_date_time) {
    this.from_date_time = from_date_time;
  }

  public InlineResponse2003MetaData accountReference(String accountReference) {
    this.accountReference = accountReference;
    return this;
  }

   /**
   * Reference ID of the virtual account
   * @return accountReference
  **/
  public String getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }

  public InlineResponse2003MetaData nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Token for accessing the next page of the statement
   * @return nextPageToken
  **/
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public InlineResponse2003MetaData numTransactionsRequested(Object numTransactionsRequested) {
    this.numTransactionsRequested = numTransactionsRequested;
    return this;
  }

   /**
   * Get numTransactionsRequested
   * @return numTransactionsRequested
  **/
  public Object getNumTransactionsRequested() {
    return numTransactionsRequested;
  }

  public void setNumTransactionsRequested(Object numTransactionsRequested) {
    this.numTransactionsRequested = numTransactionsRequested;
  }

  public InlineResponse2003MetaData to_date_time(Object to_date_time) {
    this.to_date_time = to_date_time;
    return this;
  }

   /**
   * Get to_date_time
   * @return to_date_time
  **/
  public Object getToDateTime() {
    return to_date_time;
  }

  public void setToDateTime(Object to_date_time) {
    this.to_date_time = to_date_time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003MetaData inline_response_200_3_metaData = (InlineResponse2003MetaData) o;
    return Objects.equals(this.from_date_time, inline_response_200_3_metaData.from_date_time) &&
        Objects.equals(this.accountReference, inline_response_200_3_metaData.accountReference) &&
        Objects.equals(this.nextPageToken, inline_response_200_3_metaData.nextPageToken) &&
        Objects.equals(this.numTransactionsRequested, inline_response_200_3_metaData.numTransactionsRequested) &&
        Objects.equals(this.to_date_time, inline_response_200_3_metaData.to_date_time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from_date_time, accountReference, nextPageToken, numTransactionsRequested, to_date_time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003MetaData {\n");
    
    sb.append("    from_date_time: ").append(toIndentedString(from_date_time)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    numTransactionsRequested: ").append(toIndentedString(numTransactionsRequested)).append("\n");
    sb.append("    to_date_time: ").append(toIndentedString(to_date_time)).append("\n");
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
