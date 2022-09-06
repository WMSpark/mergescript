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
import com.transfer_funds.BNKTransfer.model.InlineResponse20040Transactions;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20067Entries
 */

public class InlineResponse20067Entries {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("balance_after")
  private Object balance_after = null;

  /**
   * -1 for debit and +1 for credit.
   */
  public enum DebitOrCreditEnum {
    _1("-1"),
    _1_1("1");

    private String value;

    DebitOrCreditEnum(String value) {
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
    public static DebitOrCreditEnum fromValue(String input) {
      for (DebitOrCreditEnum b : DebitOrCreditEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("debit_or_credit")
  private DebitOrCreditEnum debit_or_credit = null;

  @JsonProperty("virtual_account_ref")
  private String virtual_account_ref = null;

  @JsonProperty("description")
  private Object description = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("entry_date_time")
  private Object entry_date_time = null;

  @JsonProperty("reference")
  private Object reference = null;

  @JsonProperty("recipient")
  private String recipient = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("bank_operations")
  private List<Object> bank_operations = null;

  @JsonProperty("transaction")
  private List<InlineResponse20040Transactions> transaction = null;

  @JsonProperty("status")
  private Integer status = null;

  public InlineResponse20067Entries amount(String amount) {
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

  public InlineResponse20067Entries balance_after(Object balance_after) {
    this.balance_after = balance_after;
    return this;
  }

   /**
   * Get balance_after
   * @return balance_after
  **/
  public Object getBalanceAfter() {
    return balance_after;
  }

  public void setBalanceAfter(Object balance_after) {
    this.balance_after = balance_after;
  }

  public InlineResponse20067Entries debit_or_credit(DebitOrCreditEnum debit_or_credit) {
    this.debit_or_credit = debit_or_credit;
    return this;
  }

   /**
   * -1 for debit and +1 for credit.
   * @return debit_or_credit
  **/
  public DebitOrCreditEnum getDebitOrCredit() {
    return debit_or_credit;
  }

  public void setDebitOrCredit(DebitOrCreditEnum debit_or_credit) {
    this.debit_or_credit = debit_or_credit;
  }

  public InlineResponse20067Entries virtual_account_ref(String virtual_account_ref) {
    this.virtual_account_ref = virtual_account_ref;
    return this;
  }

   /**
   * Reference ID of the virtual account
   * @return virtual_account_ref
  **/
  public String getVirtualAccountRef() {
    return virtual_account_ref;
  }

  public void setVirtualAccountRef(String virtual_account_ref) {
    this.virtual_account_ref = virtual_account_ref;
  }

  public InlineResponse20067Entries description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public InlineResponse20067Entries type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Entry Types: 0: Load 1: Unload Adjustment 2: Transfer 3: Fees 4: Card Fee 5: Transfer 6: Unload 7: Funding 8: Reimbursement 9: Dist card fees 10: Load Adjustment 11: Refund 12: Regularisation 13: Monthly fees 14: Annual fees 15: Fee Reversal 16: Card FX fees 19: sepa_transfer_out 20: Client Credit 21: Client Debit 22: Clearing 23: Distributor fee 24: Card Chargeback 25: Chargeback 26: Scheme payment 27: Interchange Received 28: Represent 29: Scheme clearing 30: Interchange Paid 31: Network Fees 32: Card Discharge 34: Block 35: Debit
   * @return type
  **/
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public InlineResponse20067Entries entry_date_time(Object entry_date_time) {
    this.entry_date_time = entry_date_time;
    return this;
  }

   /**
   * Get entry_date_time
   * @return entry_date_time
  **/
  public Object getEntryDateTime() {
    return entry_date_time;
  }

  public void setEntryDateTime(Object entry_date_time) {
    this.entry_date_time = entry_date_time;
  }

  public InlineResponse20067Entries reference(Object reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  public Object getReference() {
    return reference;
  }

  public void setReference(Object reference) {
    this.reference = reference;
  }

  public InlineResponse20067Entries recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * For payments and transfers, this is the virtual account name. For card transactions, this is the card_client_code.
   * @return recipient
  **/
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public InlineResponse20067Entries id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entry ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse20067Entries bank_operations(List<Object> bank_operations) {
    this.bank_operations = bank_operations;
    return this;
  }

  public InlineResponse20067Entries addBankOperationsItem(Object bank_operationsItem) {
    if (this.bank_operations == null) {
      this.bank_operations = new ArrayList<>();
    }
    this.bank_operations.add(bank_operationsItem);
    return this;
  }

   /**
   * Get bank_operations
   * @return bank_operations
  **/
  public List<Object> getBankOperations() {
    return bank_operations;
  }

  public void setBankOperations(List<Object> bank_operations) {
    this.bank_operations = bank_operations;
  }

  public InlineResponse20067Entries transaction(List<InlineResponse20040Transactions> transaction) {
    this.transaction = transaction;
    return this;
  }

  public InlineResponse20067Entries addTransactionItem(InlineResponse20040Transactions transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  public List<InlineResponse20040Transactions> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<InlineResponse20040Transactions> transaction) {
    this.transaction = transaction;
  }

  public InlineResponse20067Entries status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Operation Status: 0: Pending 1: Commit 2: Processing 3: Refused 4: Canceled 5: Template 6: Failed 7: Bulk_Processing
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20067Entries inline_response_200_67_entries = (InlineResponse20067Entries) o;
    return Objects.equals(this.amount, inline_response_200_67_entries.amount) &&
        Objects.equals(this.balance_after, inline_response_200_67_entries.balance_after) &&
        Objects.equals(this.debit_or_credit, inline_response_200_67_entries.debit_or_credit) &&
        Objects.equals(this.virtual_account_ref, inline_response_200_67_entries.virtual_account_ref) &&
        Objects.equals(this.description, inline_response_200_67_entries.description) &&
        Objects.equals(this.type, inline_response_200_67_entries.type) &&
        Objects.equals(this.entry_date_time, inline_response_200_67_entries.entry_date_time) &&
        Objects.equals(this.reference, inline_response_200_67_entries.reference) &&
        Objects.equals(this.recipient, inline_response_200_67_entries.recipient) &&
        Objects.equals(this.id, inline_response_200_67_entries.id) &&
        Objects.equals(this.bank_operations, inline_response_200_67_entries.bank_operations) &&
        Objects.equals(this.transaction, inline_response_200_67_entries.transaction) &&
        Objects.equals(this.status, inline_response_200_67_entries.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance_after, debit_or_credit, virtual_account_ref, description, type, entry_date_time, reference, recipient, id, bank_operations, transaction, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20067Entries {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance_after: ").append(toIndentedString(balance_after)).append("\n");
    sb.append("    debit_or_credit: ").append(toIndentedString(debit_or_credit)).append("\n");
    sb.append("    virtual_account_ref: ").append(toIndentedString(virtual_account_ref)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entry_date_time: ").append(toIndentedString(entry_date_time)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bank_operations: ").append(toIndentedString(bank_operations)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
