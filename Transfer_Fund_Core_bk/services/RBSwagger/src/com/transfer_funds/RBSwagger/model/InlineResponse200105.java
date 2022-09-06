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
 * InlineResponse200105
 */

public class InlineResponse200105 {
  @JsonProperty("applicant_id")
  private String applicant_id = null;

  @JsonProperty("enduser_id")
  private String enduser_id = null;

  @JsonProperty("sdk_token")
  private String sdk_token = null;

  @JsonProperty("kyc_id")
  private String kyc_id = null;

  public InlineResponse200105 applicant_id(String applicant_id) {
    this.applicant_id = applicant_id;
    return this;
  }

   /**
   * Get applicant_id
   * @return applicant_id
  **/
  public String getApplicantId() {
    return applicant_id;
  }

  public void setApplicantId(String applicant_id) {
    this.applicant_id = applicant_id;
  }

  public InlineResponse200105 enduser_id(String enduser_id) {
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

  public InlineResponse200105 sdk_token(String sdk_token) {
    this.sdk_token = sdk_token;
    return this;
  }

   /**
   * Get sdk_token
   * @return sdk_token
  **/
  public String getSdkToken() {
    return sdk_token;
  }

  public void setSdkToken(String sdk_token) {
    this.sdk_token = sdk_token;
  }

  public InlineResponse200105 kyc_id(String kyc_id) {
    this.kyc_id = kyc_id;
    return this;
  }

   /**
   * Get kyc_id
   * @return kyc_id
  **/
  public String getKycId() {
    return kyc_id;
  }

  public void setKycId(String kyc_id) {
    this.kyc_id = kyc_id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200105 inline_response_200_105 = (InlineResponse200105) o;
    return Objects.equals(this.applicant_id, inline_response_200_105.applicant_id) &&
        Objects.equals(this.enduser_id, inline_response_200_105.enduser_id) &&
        Objects.equals(this.sdk_token, inline_response_200_105.sdk_token) &&
        Objects.equals(this.kyc_id, inline_response_200_105.kyc_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicant_id, enduser_id, sdk_token, kyc_id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200105 {\n");
    
    sb.append("    applicant_id: ").append(toIndentedString(applicant_id)).append("\n");
    sb.append("    enduser_id: ").append(toIndentedString(enduser_id)).append("\n");
    sb.append("    sdk_token: ").append(toIndentedString(sdk_token)).append("\n");
    sb.append("    kyc_id: ").append(toIndentedString(kyc_id)).append("\n");
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
