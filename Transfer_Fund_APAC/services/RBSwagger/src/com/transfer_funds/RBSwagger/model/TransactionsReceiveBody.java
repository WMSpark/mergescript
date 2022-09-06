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
import java.math.BigDecimal;
/**
 * TransactionsReceiveBody
 */

public class TransactionsReceiveBody {
  @JsonProperty("bsb_number")
  private String bsb_number = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("account_number")
  private String account_number = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("uk_account_number")
  private String uk_account_number = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("routing_number")
  private String routing_number = null;

  @JsonProperty("uk_sort_code")
  private String uk_sort_code = null;

  public TransactionsReceiveBody bsb_number(String bsb_number) {
    this.bsb_number = bsb_number;
    return this;
  }

   /**
   * Get bsb_number
   * @return bsb_number
  **/
  public String getBsbNumber() {
    return bsb_number;
  }

  public void setBsbNumber(String bsb_number) {
    this.bsb_number = bsb_number;
  }

  public TransactionsReceiveBody reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public TransactionsReceiveBody account_number(String account_number) {
    this.account_number = account_number;
    return this;
  }

   /**
   * Get account_number
   * @return account_number
  **/
  public String getAccountNumber() {
    return account_number;
  }

  public void setAccountNumber(String account_number) {
    this.account_number = account_number;
  }

  public TransactionsReceiveBody amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionsReceiveBody uk_account_number(String uk_account_number) {
    this.uk_account_number = uk_account_number;
    return this;
  }

   /**
   * Get uk_account_number
   * @return uk_account_number
  **/
  public String getUkAccountNumber() {
    return uk_account_number;
  }

  public void setUkAccountNumber(String uk_account_number) {
    this.uk_account_number = uk_account_number;
  }

  public TransactionsReceiveBody iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public TransactionsReceiveBody routing_number(String routing_number) {
    this.routing_number = routing_number;
    return this;
  }

   /**
   * Get routing_number
   * @return routing_number
  **/
  public String getRoutingNumber() {
    return routing_number;
  }

  public void setRoutingNumber(String routing_number) {
    this.routing_number = routing_number;
  }

  public TransactionsReceiveBody uk_sort_code(String uk_sort_code) {
    this.uk_sort_code = uk_sort_code;
    return this;
  }

   /**
   * Get uk_sort_code
   * @return uk_sort_code
  **/
  public String getUkSortCode() {
    return uk_sort_code;
  }

  public void setUkSortCode(String uk_sort_code) {
    this.uk_sort_code = uk_sort_code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsReceiveBody transactions_receive_body = (TransactionsReceiveBody) o;
    return Objects.equals(this.bsb_number, transactions_receive_body.bsb_number) &&
        Objects.equals(this.reference, transactions_receive_body.reference) &&
        Objects.equals(this.account_number, transactions_receive_body.account_number) &&
        Objects.equals(this.amount, transactions_receive_body.amount) &&
        Objects.equals(this.uk_account_number, transactions_receive_body.uk_account_number) &&
        Objects.equals(this.iban, transactions_receive_body.iban) &&
        Objects.equals(this.routing_number, transactions_receive_body.routing_number) &&
        Objects.equals(this.uk_sort_code, transactions_receive_body.uk_sort_code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsb_number, reference, account_number, amount, uk_account_number, iban, routing_number, uk_sort_code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsReceiveBody {\n");
    
    sb.append("    bsb_number: ").append(toIndentedString(bsb_number)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    account_number: ").append(toIndentedString(account_number)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    uk_account_number: ").append(toIndentedString(uk_account_number)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    routing_number: ").append(toIndentedString(routing_number)).append("\n");
    sb.append("    uk_sort_code: ").append(toIndentedString(uk_sort_code)).append("\n");
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
