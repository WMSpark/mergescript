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
import java.util.ArrayList;
import java.util.List;
/**
 * CustomerLedgersBody
 */

public class CustomerLedgersBody {
  @JsonProperty("credit_details_id")
  private String credit_details_id = null;

  /**
   * Gets or Sets ledger_who_owns_assets
   */
  public enum LedgerWhoOwnsAssetsEnum {
    ME("ledger-assets-owned-by-me"),
    OTHER("ledger-assets-owned-by-other");

    private String value;

    LedgerWhoOwnsAssetsEnum(String value) {
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
    public static LedgerWhoOwnsAssetsEnum fromValue(String input) {
      for (LedgerWhoOwnsAssetsEnum b : LedgerWhoOwnsAssetsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ledger_who_owns_assets")
  private LedgerWhoOwnsAssetsEnum ledger_who_owns_assets = null;

  @JsonProperty("ledger_t_and_cs_country_of_jurisdiction")
  private String ledger_t_and_cs_country_of_jurisdiction = null;

  /**
   * Gets or Sets asset_class
   */
  public enum AssetClassEnum {
    COMMODITY("commodity"),
    CURRENCY("currency");

    private String value;

    AssetClassEnum(String value) {
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
    public static AssetClassEnum fromValue(String input) {
      for (AssetClassEnum b : AssetClassEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("asset_class")
  private AssetClassEnum asset_class = null;

  @JsonProperty("holder_id")
  private String holder_id = null;

  /**
   * Gets or Sets asset_type
   */
  public enum AssetTypeEnum {
    PLN("pln"),
    AUD("aud"),
    CHF("chf"),
    CAD("cad"),
    SEK("sek"),
    GOLDBLOC("goldbloc"),
    USD("usd"),
    NOK("nok"),
    WHISKY("whisky"),
    VIRTUAL_CURRENCY("virtual-currency"),
    JPY("jpy"),
    HUF("huf"),
    NZD("nzd"),
    GOLD("gold"),
    CZK("czk"),
    SGD("sgd"),
    RON("ron"),
    GBP("gbp"),
    HRK("hrk"),
    EUR("eur");

    private String value;

    AssetTypeEnum(String value) {
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
    public static AssetTypeEnum fromValue(String input) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("asset_type")
  private AssetTypeEnum asset_type = null;

  /**
   * Gets or Sets ledger_primary_use_types
   */
  public enum LedgerPrimaryUseTypesEnum {
    DEPOSIT("ledger-primary-use-types-deposit"),
    PAYMENTS("ledger-primary-use-types-payments"),
    SETTLEMENT("ledger-primary-use-types-settlement"),
    FLOAT("ledger-primary-use-types-float"),
    FEES("ledger-primary-use-types-fees"),
    INVESTMENT("ledger-primary-use-types-investment"),
    COLLATERAL("ledger-primary-use-types-collateral"),
    ESCROW("ledger-primary-use-types-escrow");

    private String value;

    LedgerPrimaryUseTypesEnum(String value) {
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
    public static LedgerPrimaryUseTypesEnum fromValue(String input) {
      for (LedgerPrimaryUseTypesEnum b : LedgerPrimaryUseTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ledger_primary_use_types")
  private List<LedgerPrimaryUseTypesEnum> ledger_primary_use_types = new ArrayList<>();

  /**
   * Gets or Sets ledger_type
   */
  public enum LedgerTypeEnum {
    SINGLE_USER("ledger-type-single-user"),
    OMNIBUS("ledger-type-omnibus");

    private String value;

    LedgerTypeEnum(String value) {
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
    public static LedgerTypeEnum fromValue(String input) {
      for (LedgerTypeEnum b : LedgerTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ledger_type")
  private LedgerTypeEnum ledger_type = null;

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

  @JsonProperty("ledger_meta")
  private Object ledger_meta = null;

  public CustomerLedgersBody credit_details_id(String credit_details_id) {
    this.credit_details_id = credit_details_id;
    return this;
  }

   /**
   * Get credit_details_id
   * @return credit_details_id
  **/
  public String getCreditDetailsId() {
    return credit_details_id;
  }

  public void setCreditDetailsId(String credit_details_id) {
    this.credit_details_id = credit_details_id;
  }

  public CustomerLedgersBody ledger_who_owns_assets(LedgerWhoOwnsAssetsEnum ledger_who_owns_assets) {
    this.ledger_who_owns_assets = ledger_who_owns_assets;
    return this;
  }

   /**
   * Get ledger_who_owns_assets
   * @return ledger_who_owns_assets
  **/
  public LedgerWhoOwnsAssetsEnum getLedgerWhoOwnsAssets() {
    return ledger_who_owns_assets;
  }

  public void setLedgerWhoOwnsAssets(LedgerWhoOwnsAssetsEnum ledger_who_owns_assets) {
    this.ledger_who_owns_assets = ledger_who_owns_assets;
  }

  public CustomerLedgersBody ledger_t_and_cs_country_of_jurisdiction(String ledger_t_and_cs_country_of_jurisdiction) {
    this.ledger_t_and_cs_country_of_jurisdiction = ledger_t_and_cs_country_of_jurisdiction;
    return this;
  }

   /**
   * Get ledger_t_and_cs_country_of_jurisdiction
   * @return ledger_t_and_cs_country_of_jurisdiction
  **/
  public String getLedgerTAndCsCountryOfJurisdiction() {
    return ledger_t_and_cs_country_of_jurisdiction;
  }

  public void setLedgerTAndCsCountryOfJurisdiction(String ledger_t_and_cs_country_of_jurisdiction) {
    this.ledger_t_and_cs_country_of_jurisdiction = ledger_t_and_cs_country_of_jurisdiction;
  }

  public CustomerLedgersBody asset_class(AssetClassEnum asset_class) {
    this.asset_class = asset_class;
    return this;
  }

   /**
   * Get asset_class
   * @return asset_class
  **/
  public AssetClassEnum getAssetClass() {
    return asset_class;
  }

  public void setAssetClass(AssetClassEnum asset_class) {
    this.asset_class = asset_class;
  }

  public CustomerLedgersBody holder_id(String holder_id) {
    this.holder_id = holder_id;
    return this;
  }

   /**
   * Get holder_id
   * @return holder_id
  **/
  public String getHolderId() {
    return holder_id;
  }

  public void setHolderId(String holder_id) {
    this.holder_id = holder_id;
  }

  public CustomerLedgersBody asset_type(AssetTypeEnum asset_type) {
    this.asset_type = asset_type;
    return this;
  }

   /**
   * Get asset_type
   * @return asset_type
  **/
  public AssetTypeEnum getAssetType() {
    return asset_type;
  }

  public void setAssetType(AssetTypeEnum asset_type) {
    this.asset_type = asset_type;
  }

  public CustomerLedgersBody ledger_primary_use_types(List<LedgerPrimaryUseTypesEnum> ledger_primary_use_types) {
    this.ledger_primary_use_types = ledger_primary_use_types;
    return this;
  }

  public CustomerLedgersBody addLedgerPrimaryUseTypesItem(LedgerPrimaryUseTypesEnum ledger_primary_use_typesItem) {
    this.ledger_primary_use_types.add(ledger_primary_use_typesItem);
    return this;
  }

   /**
   * Get ledger_primary_use_types
   * @return ledger_primary_use_types
  **/
  public List<LedgerPrimaryUseTypesEnum> getLedgerPrimaryUseTypes() {
    return ledger_primary_use_types;
  }

  public void setLedgerPrimaryUseTypes(List<LedgerPrimaryUseTypesEnum> ledger_primary_use_types) {
    this.ledger_primary_use_types = ledger_primary_use_types;
  }

  public CustomerLedgersBody ledger_type(LedgerTypeEnum ledger_type) {
    this.ledger_type = ledger_type;
    return this;
  }

   /**
   * Get ledger_type
   * @return ledger_type
  **/
  public LedgerTypeEnum getLedgerType() {
    return ledger_type;
  }

  public void setLedgerType(LedgerTypeEnum ledger_type) {
    this.ledger_type = ledger_type;
  }

  public CustomerLedgersBody partner_product(PartnerProductEnum partner_product) {
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

  public CustomerLedgersBody ledger_meta(Object ledger_meta) {
    this.ledger_meta = ledger_meta;
    return this;
  }

   /**
   * Get ledger_meta
   * @return ledger_meta
  **/
  public Object getLedgerMeta() {
    return ledger_meta;
  }

  public void setLedgerMeta(Object ledger_meta) {
    this.ledger_meta = ledger_meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLedgersBody customer_ledgers_body = (CustomerLedgersBody) o;
    return Objects.equals(this.credit_details_id, customer_ledgers_body.credit_details_id) &&
        Objects.equals(this.ledger_who_owns_assets, customer_ledgers_body.ledger_who_owns_assets) &&
        Objects.equals(this.ledger_t_and_cs_country_of_jurisdiction, customer_ledgers_body.ledger_t_and_cs_country_of_jurisdiction) &&
        Objects.equals(this.asset_class, customer_ledgers_body.asset_class) &&
        Objects.equals(this.holder_id, customer_ledgers_body.holder_id) &&
        Objects.equals(this.asset_type, customer_ledgers_body.asset_type) &&
        Objects.equals(this.ledger_primary_use_types, customer_ledgers_body.ledger_primary_use_types) &&
        Objects.equals(this.ledger_type, customer_ledgers_body.ledger_type) &&
        Objects.equals(this.partner_product, customer_ledgers_body.partner_product) &&
        Objects.equals(this.ledger_meta, customer_ledgers_body.ledger_meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit_details_id, ledger_who_owns_assets, ledger_t_and_cs_country_of_jurisdiction, asset_class, holder_id, asset_type, ledger_primary_use_types, ledger_type, partner_product, ledger_meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLedgersBody {\n");
    
    sb.append("    credit_details_id: ").append(toIndentedString(credit_details_id)).append("\n");
    sb.append("    ledger_who_owns_assets: ").append(toIndentedString(ledger_who_owns_assets)).append("\n");
    sb.append("    ledger_t_and_cs_country_of_jurisdiction: ").append(toIndentedString(ledger_t_and_cs_country_of_jurisdiction)).append("\n");
    sb.append("    asset_class: ").append(toIndentedString(asset_class)).append("\n");
    sb.append("    holder_id: ").append(toIndentedString(holder_id)).append("\n");
    sb.append("    asset_type: ").append(toIndentedString(asset_type)).append("\n");
    sb.append("    ledger_primary_use_types: ").append(toIndentedString(ledger_primary_use_types)).append("\n");
    sb.append("    ledger_type: ").append(toIndentedString(ledger_type)).append("\n");
    sb.append("    partner_product: ").append(toIndentedString(partner_product)).append("\n");
    sb.append("    ledger_meta: ").append(toIndentedString(ledger_meta)).append("\n");
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
