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
 * InlineResponse200116
 */

public class InlineResponse200116 {
  @JsonProperty("beneficiary_id")
  private String beneficiary_id = null;

  @JsonProperty("comments")
  private List<V1customerquarantineendusersComments> comments = null;

  @JsonProperty("compliance_firewall_result")
  private Object compliance_firewall_result = null;

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

  /**
   * Gets or Sets beneficiary_status
   */
  public enum BeneficiaryStatusEnum {
    QUARANTINE("beneficiary-status-quarantine"),
    PENDING("beneficiary-status-pending"),
    OK("beneficiary-status-ok"),
    MISSING_DATA("beneficiary-status-missing-data"),
    DECLINED("beneficiary-status-declined");

    private String value;

    BeneficiaryStatusEnum(String value) {
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
    public static BeneficiaryStatusEnum fromValue(String input) {
      for (BeneficiaryStatusEnum b : BeneficiaryStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("beneficiary_status")
  private BeneficiaryStatusEnum beneficiary_status = null;

  public InlineResponse200116 beneficiary_id(String beneficiary_id) {
    this.beneficiary_id = beneficiary_id;
    return this;
  }

   /**
   * The receiving Railsbank Beneficiary ID
   * @return beneficiary_id
  **/
  public String getBeneficiaryId() {
    return beneficiary_id;
  }

  public void setBeneficiaryId(String beneficiary_id) {
    this.beneficiary_id = beneficiary_id;
  }

  public InlineResponse200116 comments(List<V1customerquarantineendusersComments> comments) {
    this.comments = comments;
    return this;
  }

  public InlineResponse200116 addCommentsItem(V1customerquarantineendusersComments commentsItem) {
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

  public InlineResponse200116 compliance_firewall_result(Object compliance_firewall_result) {
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

  public InlineResponse200116 fw_result(Object fw_result) {
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

  public InlineResponse200116 qr_status(QrStatusEnum qr_status) {
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

  public InlineResponse200116 qr_created_at(LocalDateTime qr_created_at) {
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

  public InlineResponse200116 qr_resolved_at(LocalDateTime qr_resolved_at) {
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

  public InlineResponse200116 beneficiary_status(BeneficiaryStatusEnum beneficiary_status) {
    this.beneficiary_status = beneficiary_status;
    return this;
  }

   /**
   * Get beneficiary_status
   * @return beneficiary_status
  **/
  public BeneficiaryStatusEnum getBeneficiaryStatus() {
    return beneficiary_status;
  }

  public void setBeneficiaryStatus(BeneficiaryStatusEnum beneficiary_status) {
    this.beneficiary_status = beneficiary_status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200116 inline_response_200_116 = (InlineResponse200116) o;
    return Objects.equals(this.beneficiary_id, inline_response_200_116.beneficiary_id) &&
        Objects.equals(this.comments, inline_response_200_116.comments) &&
        Objects.equals(this.compliance_firewall_result, inline_response_200_116.compliance_firewall_result) &&
        Objects.equals(this.fw_result, inline_response_200_116.fw_result) &&
        Objects.equals(this.qr_status, inline_response_200_116.qr_status) &&
        Objects.equals(this.qr_created_at, inline_response_200_116.qr_created_at) &&
        Objects.equals(this.qr_resolved_at, inline_response_200_116.qr_resolved_at) &&
        Objects.equals(this.beneficiary_status, inline_response_200_116.beneficiary_status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary_id, comments, compliance_firewall_result, fw_result, qr_status, qr_created_at, qr_resolved_at, beneficiary_status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200116 {\n");
    
    sb.append("    beneficiary_id: ").append(toIndentedString(beneficiary_id)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    compliance_firewall_result: ").append(toIndentedString(compliance_firewall_result)).append("\n");
    sb.append("    fw_result: ").append(toIndentedString(fw_result)).append("\n");
    sb.append("    qr_status: ").append(toIndentedString(qr_status)).append("\n");
    sb.append("    qr_created_at: ").append(toIndentedString(qr_created_at)).append("\n");
    sb.append("    qr_resolved_at: ").append(toIndentedString(qr_resolved_at)).append("\n");
    sb.append("    beneficiary_status: ").append(toIndentedString(beneficiary_status)).append("\n");
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
