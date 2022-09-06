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
import com.transfer_funds.RBSwagger.model.V1customerquarantineendusersComments;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20080
 */

public class InlineResponse20080 {
  /**
   * Gets or Sets enduser_kyc_status
   */
  public enum EnduserKycStatusEnum {
    ERROR("enduser-kyc-status-error"),
    STARTED("enduser-kyc-status-started"),
    APPROVED("enduser-kyc-status-approved"),
    DECLINED("enduser-kyc-status-declined");

    private String value;

    EnduserKycStatusEnum(String value) {
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
    public static EnduserKycStatusEnum fromValue(String input) {
      for (EnduserKycStatusEnum b : EnduserKycStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enduser_kyc_status")
  private EnduserKycStatusEnum enduser_kyc_status = null;

  /**
   * Gets or Sets enduser_status
   */
  public enum EnduserStatusEnum {
    DECLINED("enduser-status-declined"),
    PENDING("enduser-status-pending"),
    OK("enduser-status-ok"),
    MISSING_DATA("enduser-status-missing-data"),
    QUARANTINE("enduser-status-quarantine");

    private String value;

    EnduserStatusEnum(String value) {
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
    public static EnduserStatusEnum fromValue(String input) {
      for (EnduserStatusEnum b : EnduserStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enduser_status")
  private EnduserStatusEnum enduser_status = null;

  @JsonProperty("comments")
  private List<V1customerquarantineendusersComments> comments = null;

  @JsonProperty("compliance_firewall_result")
  private Object compliance_firewall_result = null;

  @JsonProperty("enduser_id")
  private String enduser_id = null;

  @JsonProperty("fw_result")
  private Object fw_result = null;

  /**
   * Gets or Sets qr_status
   */
  public enum QrStatusEnum {
    DECLINE("decline"),
    PASS("pass");

    private String value;

    QrStatusEnum(String value) {
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
    public static QrStatusEnum fromValue(String input) {
      for (QrStatusEnum b : QrStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("qr_status")
  private QrStatusEnum qr_status = null;

  @JsonProperty("qr_created_at")
  private LocalDateTime qr_created_at = null;

  @JsonProperty("qr_resolved_at")
  private LocalDateTime qr_resolved_at = null;

  public InlineResponse20080 enduser_kyc_status(EnduserKycStatusEnum enduser_kyc_status) {
    this.enduser_kyc_status = enduser_kyc_status;
    return this;
  }

   /**
   * Get enduser_kyc_status
   * @return enduser_kyc_status
  **/
  public EnduserKycStatusEnum getEnduserKycStatus() {
    return enduser_kyc_status;
  }

  public void setEnduserKycStatus(EnduserKycStatusEnum enduser_kyc_status) {
    this.enduser_kyc_status = enduser_kyc_status;
  }

  public InlineResponse20080 enduser_status(EnduserStatusEnum enduser_status) {
    this.enduser_status = enduser_status;
    return this;
  }

   /**
   * Get enduser_status
   * @return enduser_status
  **/
  public EnduserStatusEnum getEnduserStatus() {
    return enduser_status;
  }

  public void setEnduserStatus(EnduserStatusEnum enduser_status) {
    this.enduser_status = enduser_status;
  }

  public InlineResponse20080 comments(List<V1customerquarantineendusersComments> comments) {
    this.comments = comments;
    return this;
  }

  public InlineResponse20080 addCommentsItem(V1customerquarantineendusersComments commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  public List<V1customerquarantineendusersComments> getComments() {
    return comments;
  }

  public void setComments(List<V1customerquarantineendusersComments> comments) {
    this.comments = comments;
  }

  public InlineResponse20080 compliance_firewall_result(Object compliance_firewall_result) {
    this.compliance_firewall_result = compliance_firewall_result;
    return this;
  }

   /**
   * Get compliance_firewall_result
   * @return compliance_firewall_result
  **/
  public Object getComplianceFirewallResult() {
    return compliance_firewall_result;
  }

  public void setComplianceFirewallResult(Object compliance_firewall_result) {
    this.compliance_firewall_result = compliance_firewall_result;
  }

  public InlineResponse20080 enduser_id(String enduser_id) {
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

  public InlineResponse20080 fw_result(Object fw_result) {
    this.fw_result = fw_result;
    return this;
  }

   /**
   * DEPRECATED Field was replaced by compliance-firewall-result
   * @return fw_result
  **/
  public Object getFwResult() {
    return fw_result;
  }

  public void setFwResult(Object fw_result) {
    this.fw_result = fw_result;
  }

  public InlineResponse20080 qr_status(QrStatusEnum qr_status) {
    this.qr_status = qr_status;
    return this;
  }

   /**
   * Get qr_status
   * @return qr_status
  **/
  public QrStatusEnum getQrStatus() {
    return qr_status;
  }

  public void setQrStatus(QrStatusEnum qr_status) {
    this.qr_status = qr_status;
  }

  public InlineResponse20080 qr_created_at(LocalDateTime qr_created_at) {
    this.qr_created_at = qr_created_at;
    return this;
  }

   /**
   * Get qr_created_at
   * @return qr_created_at
  **/
  public LocalDateTime getQrCreatedAt() {
    return qr_created_at;
  }

  public void setQrCreatedAt(LocalDateTime qr_created_at) {
    this.qr_created_at = qr_created_at;
  }

  public InlineResponse20080 qr_resolved_at(LocalDateTime qr_resolved_at) {
    this.qr_resolved_at = qr_resolved_at;
    return this;
  }

   /**
   * Get qr_resolved_at
   * @return qr_resolved_at
  **/
  public LocalDateTime getQrResolvedAt() {
    return qr_resolved_at;
  }

  public void setQrResolvedAt(LocalDateTime qr_resolved_at) {
    this.qr_resolved_at = qr_resolved_at;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20080 inline_response_200_80 = (InlineResponse20080) o;
    return Objects.equals(this.enduser_kyc_status, inline_response_200_80.enduser_kyc_status) &&
        Objects.equals(this.enduser_status, inline_response_200_80.enduser_status) &&
        Objects.equals(this.comments, inline_response_200_80.comments) &&
        Objects.equals(this.compliance_firewall_result, inline_response_200_80.compliance_firewall_result) &&
        Objects.equals(this.enduser_id, inline_response_200_80.enduser_id) &&
        Objects.equals(this.fw_result, inline_response_200_80.fw_result) &&
        Objects.equals(this.qr_status, inline_response_200_80.qr_status) &&
        Objects.equals(this.qr_created_at, inline_response_200_80.qr_created_at) &&
        Objects.equals(this.qr_resolved_at, inline_response_200_80.qr_resolved_at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enduser_kyc_status, enduser_status, comments, compliance_firewall_result, enduser_id, fw_result, qr_status, qr_created_at, qr_resolved_at);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20080 {\n");
    
    sb.append("    enduser_kyc_status: ").append(toIndentedString(enduser_kyc_status)).append("\n");
    sb.append("    enduser_status: ").append(toIndentedString(enduser_status)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    compliance_firewall_result: ").append(toIndentedString(compliance_firewall_result)).append("\n");
    sb.append("    enduser_id: ").append(toIndentedString(enduser_id)).append("\n");
    sb.append("    fw_result: ").append(toIndentedString(fw_result)).append("\n");
    sb.append("    qr_status: ").append(toIndentedString(qr_status)).append("\n");
    sb.append("    qr_created_at: ").append(toIndentedString(qr_created_at)).append("\n");
    sb.append("    qr_resolved_at: ").append(toIndentedString(qr_resolved_at)).append("\n");
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
