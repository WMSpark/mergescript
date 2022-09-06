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
 * EnduserIdCreditchecksBody
 */

public class EnduserIdCreditchecksBody {
  /**
   * Gets or Sets partner_product
   */
  public enum PartnerProductEnum {
    EXAMPLEBANK_SGD_2("ExampleBank-SGD-2"),
    PAYRNET_SGD_2("PayrNet-SGD-2"),
    BANKING_AUD_1("Banking-AUD-1"),
    PAYRNET_SGD_1("PayrNet-SGD-1"),
    EXAMPLEBANK_SGD_1("ExampleBank-SGD-1"),
    PAYRNET_GBP_DEBIT_SEND("PayrNet-GBP-Debit-Send"),
    PAYRNET_GBP_2("PayrNet-GBP-2"),
    EXAMPLEBANK_USD_1("ExampleBank-USD-1"),
    RAILSBANK_KYC_4("Railsbank-KYC-4"),
    EXAMPLEBANK_AUD_1("ExampleBank-AUD-1"),
    EXAMPLEBANK_FX_1("ExampleBank-FX-1"),
    PAYRNET_USD_1("PayrNet-USD-1"),
    EXAMPLEBANK_USD_2("ExampleBank-USD-2"),
    EXAMPLEBANK_EUR_3("ExampleBank-EUR-3"),
    RAILSBANK_KYC_1("Railsbank-KYC-1"),
    EXAMPLEBANK_GBP_2("ExampleBank-GBP-2"),
    PAYRNET_MULTI_CCY_1("PayrNet-Multi-CCY-1"),
    RAILSBANK_CREDIT_CARD_1("Railsbank-Credit-Card-1"),
    GOLDBLOC_CONVERSION_1("Goldbloc-Conversion-1"),
    RAILSBANK_AML_SCREENING_1("Railsbank-AML-Screening-1"),
    PAYRNET_EUR_3("PayrNet-EUR-3"),
    RAILSBANK_USD_CREDIT_1("Railsbank-USD-Credit-1"),
    ONFIDO_IDV_1("Onfido-IDV-1"),
    EXAMPLEBANK_EUR_1("ExampleBank-EUR-1"),
    PAYRNET_USD_2("PayrNet-USD-2"),
    RAILSBANK_DEBIT_CARD_3("Railsbank-Debit-Card-3"),
    PAYRNET_EUR_1("PayrNet-EUR-1"),
    RAILSBANK_CONVERSION_1("Railsbank-Conversion-1"),
    PAYRNET_GBP_1("PayrNet-GBP-1"),
    RAILSBANK_DEBIT_CARD_1("Railsbank-Debit-Card-1"),
    RAILSBANK_VIRTUAL_1("Railsbank-Virtual-1"),
    RAILSBANK_KYC_2("Railsbank-KYC-2"),
    EXAMPLEBANK_USD_CREDIT_1("ExampleBank-USD-Credit-1"),
    EXAMPLEBANK_GBP_DEBIT_SEND("ExampleBank-GBP-Debit-Send"),
    EXAMPLEBANK_GBP_1("ExampleBank-GBP-1"),
    RAILSBANK_IDENTITY_AND_VERIFICATION_SERVICE_1("Railsbank-Identity-and-Verification-Service-1"),
    RAILSBANK_DEBIT_CARD_2("Railsbank-Debit-Card-2"),
    PAYRNET_FX_1("PayrNet-FX-1");

    private String value;

    PartnerProductEnum(String value) {
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
    public static PartnerProductEnum fromValue(String input) {
      for (PartnerProductEnum b : PartnerProductEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("partner_product")
  private PartnerProductEnum partner_product = null;

  public EnduserIdCreditchecksBody partner_product(PartnerProductEnum partner_product) {
    this.partner_product = partner_product;
    return this;
  }

   /**
   * Get partner_product
   * @return partner_product
  **/
  public PartnerProductEnum getPartnerProduct() {
    return partner_product;
  }

  public void setPartnerProduct(PartnerProductEnum partner_product) {
    this.partner_product = partner_product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnduserIdCreditchecksBody enduser_id_creditchecks_body = (EnduserIdCreditchecksBody) o;
    return Objects.equals(this.partner_product, enduser_id_creditchecks_body.partner_product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partner_product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnduserIdCreditchecksBody {\n");
    
    sb.append("    partner_product: ").append(toIndentedString(partner_product)).append("\n");
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
