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
import com.transfer_funds.BNKTransfer.model.InlineResponse2003PendingStatementTransactionPendingFees;
/**
 * InlineResponse2003PendingStatementTransactionPending
 */

public class InlineResponse2003PendingStatementTransactionPending {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("fees")
  private InlineResponse2003PendingStatementTransactionPendingFees fees = null;

  public InlineResponse2003PendingStatementTransactionPending amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Maximum limit amount for the corporate. Decimal separator \&quot;.\&quot; (point). Thousand separator; none.
   * @return amount
  **/
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InlineResponse2003PendingStatementTransactionPending fees(InlineResponse2003PendingStatementTransactionPendingFees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  public InlineResponse2003PendingStatementTransactionPendingFees getFees() {
    return fees;
  }

  public void setFees(InlineResponse2003PendingStatementTransactionPendingFees fees) {
    this.fees = fees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003PendingStatementTransactionPending inline_response_200_3_pendingStatementTransaction_pending = (InlineResponse2003PendingStatementTransactionPending) o;
    return Objects.equals(this.amount, inline_response_200_3_pendingStatementTransaction_pending.amount) &&
        Objects.equals(this.fees, inline_response_200_3_pendingStatementTransaction_pending.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, fees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003PendingStatementTransactionPending {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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
