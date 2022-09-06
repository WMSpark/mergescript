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
import com.transfer_funds.BNKTransfer.model.InlineResponse20072SuspendedPayments;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20072
 */

public class InlineResponse20072 {
  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("suspended_payments")
  private List<InlineResponse20072SuspendedPayments> suspended_payments = null;

  public InlineResponse20072 request(String request) {
    this.request = request;
    return this;
  }

   /**
   * The command that was requested
   * @return request
  **/
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public InlineResponse20072 transac_id(String transac_id) {
    this.transac_id = transac_id;
    return this;
  }

   /**
   * Unique id of the request
   * @return transac_id
  **/
  public String getTransacId() {
    return transac_id;
  }

  public void setTransacId(String transac_id) {
    this.transac_id = transac_id;
  }

  public InlineResponse20072 entity_id(String entity_id) {
    this.entity_id = entity_id;
    return this;
  }

   /**
   * Identity of the client
   * @return entity_id
  **/
  public String getEntityId() {
    return entity_id;
  }

  public void setEntityId(String entity_id) {
    this.entity_id = entity_id;
  }

  public InlineResponse20072 suspended_payments(List<InlineResponse20072SuspendedPayments> suspended_payments) {
    this.suspended_payments = suspended_payments;
    return this;
  }

  public InlineResponse20072 addSuspendedPaymentsItem(InlineResponse20072SuspendedPayments suspended_paymentsItem) {
    if (this.suspended_payments == null) {
      this.suspended_payments = new ArrayList<>();
    }
    this.suspended_payments.add(suspended_paymentsItem);
    return this;
  }

   /**
   * Get suspended_payments
   * @return suspended_payments
  **/
  public List<InlineResponse20072SuspendedPayments> getSuspendedPayments() {
    return suspended_payments;
  }

  public void setSuspendedPayments(List<InlineResponse20072SuspendedPayments> suspended_payments) {
    this.suspended_payments = suspended_payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20072 inline_response_200_72 = (InlineResponse20072) o;
    return Objects.equals(this.request, inline_response_200_72.request) &&
        Objects.equals(this.transac_id, inline_response_200_72.transac_id) &&
        Objects.equals(this.entity_id, inline_response_200_72.entity_id) &&
        Objects.equals(this.suspended_payments, inline_response_200_72.suspended_payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, transac_id, entity_id, suspended_payments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20072 {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    suspended_payments: ").append(toIndentedString(suspended_payments)).append("\n");
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
