package com.transfer_funds.RBSwagger.service;


import com.transfer_funds.RBSwagger.model.*;
import com.transfer_funds.RBSwagger.model.AccountsAccountIdBody;
import com.transfer_funds.RBSwagger.model.BeneficiariesBeneficiaryIdBody;
import com.transfer_funds.RBSwagger.model.BeneficiaryIdAccountsBody;
import com.transfer_funds.RBSwagger.model.BeneficiaryIdCommentsBody;
import com.transfer_funds.RBSwagger.model.BeneficiaryIdIdvchecksBody;
import com.transfer_funds.RBSwagger.model.BeneficiaryIdResolveBody;
import com.transfer_funds.RBSwagger.model.CardIdCloseBody;
import com.transfer_funds.RBSwagger.model.CardIdPinBody;
import com.transfer_funds.RBSwagger.model.CardIdReplaceBody;
import com.transfer_funds.RBSwagger.model.CardIdSuspendBody;
import com.transfer_funds.RBSwagger.model.CardsCardIdBody;
import com.transfer_funds.RBSwagger.model.CardsRulesBody;
import com.transfer_funds.RBSwagger.model.ComplianceFirewallTypeTestBody;
import com.transfer_funds.RBSwagger.model.CompliancefirewallrulesComplianceFirewallTypeBody;
import com.transfer_funds.RBSwagger.model.CustomerApikeysBody;
import com.transfer_funds.RBSwagger.model.CustomerBeneficiariesBody;
import com.transfer_funds.RBSwagger.model.CustomerCardsBody;
import com.transfer_funds.RBSwagger.model.CustomerCompliancecontactBody;
import com.transfer_funds.RBSwagger.model.CustomerCompliancefirewallstaticdataBody;
import com.transfer_funds.RBSwagger.model.CustomerEndusersBody;
import com.transfer_funds.RBSwagger.model.CustomerLedgersBody;
import com.transfer_funds.RBSwagger.model.CustomerTransactionsBody;
import com.transfer_funds.RBSwagger.model.CustomerWebhookBody;
import com.transfer_funds.RBSwagger.model.EnduserIdCommentsBody;
import com.transfer_funds.RBSwagger.model.EnduserIdCreditchecksBody;
import com.transfer_funds.RBSwagger.model.EnduserIdIdvchecksBody;
import com.transfer_funds.RBSwagger.model.EnduserIdIdvchecksBody1;
import com.transfer_funds.RBSwagger.model.EnduserIdKycchecksBody;
import com.transfer_funds.RBSwagger.model.EnduserIdKycinitiatecheckBody;
import com.transfer_funds.RBSwagger.model.EnduserIdResolveBody;
import com.transfer_funds.RBSwagger.model.EndusersEnduserIdBody;
import java.io.File;
import com.transfer_funds.RBSwagger.model.FxQuoteBody;
import com.transfer_funds.RBSwagger.model.InlineResponse200;
import com.transfer_funds.RBSwagger.model.InlineResponse2001;
import com.transfer_funds.RBSwagger.model.InlineResponse20010;
import com.transfer_funds.RBSwagger.model.InlineResponse200100;
import com.transfer_funds.RBSwagger.model.InlineResponse200101;
import com.transfer_funds.RBSwagger.model.InlineResponse200102;
import com.transfer_funds.RBSwagger.model.InlineResponse200103;
import com.transfer_funds.RBSwagger.model.InlineResponse200104;
import com.transfer_funds.RBSwagger.model.InlineResponse200105;
import com.transfer_funds.RBSwagger.model.InlineResponse200106;
import com.transfer_funds.RBSwagger.model.InlineResponse200107;
import com.transfer_funds.RBSwagger.model.InlineResponse200108;
import com.transfer_funds.RBSwagger.model.InlineResponse200109;
import com.transfer_funds.RBSwagger.model.InlineResponse20011;
import com.transfer_funds.RBSwagger.model.InlineResponse200110;
import com.transfer_funds.RBSwagger.model.InlineResponse200111;
import com.transfer_funds.RBSwagger.model.InlineResponse200112;
import com.transfer_funds.RBSwagger.model.InlineResponse200113;
import com.transfer_funds.RBSwagger.model.InlineResponse200114;
import com.transfer_funds.RBSwagger.model.InlineResponse200115;
import com.transfer_funds.RBSwagger.model.InlineResponse200116;
import com.transfer_funds.RBSwagger.model.InlineResponse200117;
import com.transfer_funds.RBSwagger.model.InlineResponse200118;
import com.transfer_funds.RBSwagger.model.InlineResponse200119;
import com.transfer_funds.RBSwagger.model.InlineResponse20012;
import com.transfer_funds.RBSwagger.model.InlineResponse200120;
import com.transfer_funds.RBSwagger.model.InlineResponse200121;
import com.transfer_funds.RBSwagger.model.InlineResponse200122;
import com.transfer_funds.RBSwagger.model.InlineResponse200123;
import com.transfer_funds.RBSwagger.model.InlineResponse200124;
import com.transfer_funds.RBSwagger.model.InlineResponse20013;
import com.transfer_funds.RBSwagger.model.InlineResponse20014;
import com.transfer_funds.RBSwagger.model.InlineResponse20015;
import com.transfer_funds.RBSwagger.model.InlineResponse20016;
import com.transfer_funds.RBSwagger.model.InlineResponse20017;
import com.transfer_funds.RBSwagger.model.InlineResponse20018;
import com.transfer_funds.RBSwagger.model.InlineResponse20019;
import com.transfer_funds.RBSwagger.model.InlineResponse2002;
import com.transfer_funds.RBSwagger.model.InlineResponse20020;
import com.transfer_funds.RBSwagger.model.InlineResponse20021;
import com.transfer_funds.RBSwagger.model.InlineResponse20022;
import com.transfer_funds.RBSwagger.model.InlineResponse20023;
import com.transfer_funds.RBSwagger.model.InlineResponse20024;
import com.transfer_funds.RBSwagger.model.InlineResponse20025;
import com.transfer_funds.RBSwagger.model.InlineResponse20026;
import com.transfer_funds.RBSwagger.model.InlineResponse20027;
import com.transfer_funds.RBSwagger.model.InlineResponse20028;
import com.transfer_funds.RBSwagger.model.InlineResponse20029;
import com.transfer_funds.RBSwagger.model.InlineResponse2003;
import com.transfer_funds.RBSwagger.model.InlineResponse20030;
import com.transfer_funds.RBSwagger.model.InlineResponse20031;
import com.transfer_funds.RBSwagger.model.InlineResponse20032;
import com.transfer_funds.RBSwagger.model.InlineResponse20033;
import com.transfer_funds.RBSwagger.model.InlineResponse20034;
import com.transfer_funds.RBSwagger.model.InlineResponse20035;
import com.transfer_funds.RBSwagger.model.InlineResponse20036;
import com.transfer_funds.RBSwagger.model.InlineResponse20037;
import com.transfer_funds.RBSwagger.model.InlineResponse20038;
import com.transfer_funds.RBSwagger.model.InlineResponse2004;
import com.transfer_funds.RBSwagger.model.InlineResponse20040;
import com.transfer_funds.RBSwagger.model.InlineResponse20041;
import com.transfer_funds.RBSwagger.model.InlineResponse20042;
import com.transfer_funds.RBSwagger.model.InlineResponse20043;
import com.transfer_funds.RBSwagger.model.InlineResponse20044;
import com.transfer_funds.RBSwagger.model.InlineResponse20045;
import com.transfer_funds.RBSwagger.model.InlineResponse20046;
import com.transfer_funds.RBSwagger.model.InlineResponse20047;
import com.transfer_funds.RBSwagger.model.InlineResponse20048;
import com.transfer_funds.RBSwagger.model.InlineResponse20049;
import com.transfer_funds.RBSwagger.model.InlineResponse2005;
import com.transfer_funds.RBSwagger.model.InlineResponse20050;
import com.transfer_funds.RBSwagger.model.InlineResponse20051;
import com.transfer_funds.RBSwagger.model.InlineResponse20052;
import com.transfer_funds.RBSwagger.model.InlineResponse20053;
import com.transfer_funds.RBSwagger.model.InlineResponse20054;
import com.transfer_funds.RBSwagger.model.InlineResponse20055;
import com.transfer_funds.RBSwagger.model.InlineResponse20056;
import com.transfer_funds.RBSwagger.model.InlineResponse20057;
import com.transfer_funds.RBSwagger.model.InlineResponse20058;
import com.transfer_funds.RBSwagger.model.InlineResponse20059;
import com.transfer_funds.RBSwagger.model.InlineResponse2006;
import com.transfer_funds.RBSwagger.model.InlineResponse20060;
import com.transfer_funds.RBSwagger.model.InlineResponse20062;
import com.transfer_funds.RBSwagger.model.InlineResponse20063;
import com.transfer_funds.RBSwagger.model.InlineResponse20064;
import com.transfer_funds.RBSwagger.model.InlineResponse20065;
import com.transfer_funds.RBSwagger.model.InlineResponse20066;
import com.transfer_funds.RBSwagger.model.InlineResponse20067;
import com.transfer_funds.RBSwagger.model.InlineResponse20068;
import com.transfer_funds.RBSwagger.model.InlineResponse20069;
import com.transfer_funds.RBSwagger.model.InlineResponse2007;
import com.transfer_funds.RBSwagger.model.InlineResponse20070;
import com.transfer_funds.RBSwagger.model.InlineResponse20072;
import com.transfer_funds.RBSwagger.model.InlineResponse20073;
import com.transfer_funds.RBSwagger.model.InlineResponse20074;
import com.transfer_funds.RBSwagger.model.InlineResponse20075;
import com.transfer_funds.RBSwagger.model.InlineResponse20076;
import com.transfer_funds.RBSwagger.model.InlineResponse20077;
import com.transfer_funds.RBSwagger.model.InlineResponse20078;
import com.transfer_funds.RBSwagger.model.InlineResponse20079;
import com.transfer_funds.RBSwagger.model.InlineResponse2008;
import com.transfer_funds.RBSwagger.model.InlineResponse20080;
import com.transfer_funds.RBSwagger.model.InlineResponse20081;
import com.transfer_funds.RBSwagger.model.InlineResponse20082;
import com.transfer_funds.RBSwagger.model.InlineResponse20083;
import com.transfer_funds.RBSwagger.model.InlineResponse20084;
import com.transfer_funds.RBSwagger.model.InlineResponse20085;
import com.transfer_funds.RBSwagger.model.InlineResponse20086;
import com.transfer_funds.RBSwagger.model.InlineResponse20087;
import com.transfer_funds.RBSwagger.model.InlineResponse20088;
import com.transfer_funds.RBSwagger.model.InlineResponse20089;
import com.transfer_funds.RBSwagger.model.InlineResponse2009;
import com.transfer_funds.RBSwagger.model.InlineResponse20090;
import com.transfer_funds.RBSwagger.model.InlineResponse20091;
import com.transfer_funds.RBSwagger.model.InlineResponse20092;
import com.transfer_funds.RBSwagger.model.InlineResponse20093;
import com.transfer_funds.RBSwagger.model.InlineResponse20094;
import com.transfer_funds.RBSwagger.model.InlineResponse20095;
import com.transfer_funds.RBSwagger.model.InlineResponse20096;
import com.transfer_funds.RBSwagger.model.InlineResponse20097;
import com.transfer_funds.RBSwagger.model.InlineResponse20098;
import com.transfer_funds.RBSwagger.model.InlineResponse20099;
import com.transfer_funds.RBSwagger.model.InlineResponse412;
import com.transfer_funds.RBSwagger.model.InterledgerBulkBody;
import com.transfer_funds.RBSwagger.model.InterledgerTryBody;
import com.transfer_funds.RBSwagger.model.LedgerIdAssignBody;
import com.transfer_funds.RBSwagger.model.LedgersLedgerIdBody;
import com.transfer_funds.RBSwagger.model.LedgersVirtualBody;
import java.time.LocalDateTime;
import com.transfer_funds.RBSwagger.model.PaymentTokenIdCloseBody;
import com.transfer_funds.RBSwagger.model.PaymentTokenIdSuspendBody;
import com.transfer_funds.RBSwagger.model.ProductsOnfidoIDV1Body;
import com.transfer_funds.RBSwagger.model.ProductsPartnerProductBody;
import com.transfer_funds.RBSwagger.model.RulesCardRuleIdBody;
import com.transfer_funds.RBSwagger.model.TransactionIdCommentsBody;
import com.transfer_funds.RBSwagger.model.TransactionIdResolveBody;
import com.transfer_funds.RBSwagger.model.TransactionsBulkBody;
import com.transfer_funds.RBSwagger.model.TransactionsFxBody;
import com.transfer_funds.RBSwagger.model.TransactionsInterledgerBody;
import com.transfer_funds.RBSwagger.model.TransactionsManualcreditBody;
import com.transfer_funds.RBSwagger.model.TransactionsManualdebitBody;
import com.transfer_funds.RBSwagger.model.TransactionsTransactionIdBody;
import com.transfer_funds.RBSwagger.model.TransactionsTryBody;
import com.transfer_funds.RBSwagger.model.WebhookUpdatesecretBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CustomerService {

  /**
   * Delete your webhook settings
   * Delete your webhook settings
   */
  @RequestLine("DELETE /v1/customer/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void dELETEV1CustomerWebhook();

  /**
   * Get list of customer&#x27;s api keys
   * 
   * @return List&lt;InlineResponse20073&gt;
   */
  @RequestLine("GET /v1/customer/api-keys")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20073> gETV1CustomerApiKeys();

  /**
   * List all beneficiaries in customer environment, filtered by optional holder - enduser or customer himself
   * List all beneficiaries in customer environment, filtered by optional holder - enduser or customer himself.                  GET v1/customer/beneficiaries list all beneficiaries in customer environment - owned either by himself or by any of his endusers.                  GET v1/customer/beneficiaries?holder_id&#x3D;UUID list beneficiaries owned by supplied holder, enduser or customer himself.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param holder_id  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse2006&gt;
   */
  @RequestLine("GET /v1/customer/beneficiaries?holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse2006> gETV1CustomerBeneficiaries(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("holder_id") String holder_id, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all beneficiaries in customer environment, filtered by optional holder - enduser or customer himself
     * List all beneficiaries in customer environment, filtered by optional holder - enduser or customer himself.                  GET v1/customer/beneficiaries list all beneficiaries in customer environment - owned either by himself or by any of his endusers.                  GET v1/customer/beneficiaries?holder_id&#x3D;UUID list beneficiaries owned by supplied holder, enduser or customer himself.
     * Note, this is equivalent to the other <code>gETV1CustomerBeneficiaries</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerBeneficiariesQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>holder_id -  (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse2006&gt;
     */
    @RequestLine("GET /v1/customer/beneficiaries?holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse2006> gETV1CustomerBeneficiaries
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch the beneficiary entity
   * Fetch the beneficiary entity.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse20044
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20044 gETV1CustomerBeneficiariesBeneficiaryId(@Param("beneficiary_id") String beneficiary_id);

  /**
   * Return all accounts for given for beneficiary
   * Return all accounts for given for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return List&lt;InlineResponse20089&gt;
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/accounts")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20089> gETV1CustomerBeneficiariesBeneficiaryIdAccounts(@Param("beneficiary_id") String beneficiary_id);

  /**
   * Return account for beneficiary (if you dont want to povide beneficiary-id there is endpoint that require only account-id)
   * Return account for beneficiary (if you dont want to povide beneficiary-id there is endpoint that require only account-id).
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param account_id  (required)
   * @return InlineResponse200102
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/accounts/{account_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200102 gETV1CustomerBeneficiariesBeneficiaryIdAccountsAccountId(@Param("beneficiary_id") String beneficiary_id, @Param("account_id") String account_id);

  /**
   * Fetch latest firewall calculation report for beneficiary
   * Fetch latest firewall calculation report for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/compliance-firewall-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerBeneficiariesBeneficiaryIdComplianceFirewallCalculation(@Param("beneficiary_id") String beneficiary_id);

  /**
   * DEPRECATED! Fetch latest firewall calculation report for beneficiary
   * &lt;strong&gt;DEPRECATED!&lt;/strong&gt; Use /v1/customer/beneficiaries/{beneficiary-id}/compliance-firewall-calculation instead&lt;br/&gt;Fetch latest firewall calculation report for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/fw-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerBeneficiariesBeneficiaryIdFwCalculation(@Param("beneficiary_id") String beneficiary_id);

  /**
   * Fetch all identity verification checks associated the beneficiary
   * Fetch all identity verification checks associated the beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param show_outdated  (optional)
    * @param partner_product  (optional)
   * @return List&lt;InlineResponse20024&gt;
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/idv-checks?show_outdated={show_outdated}&partner_product={partner_product}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20024> gETV1CustomerBeneficiariesBeneficiaryIdIdvChecks(@Param("beneficiary_id") String beneficiary_id, @Param("show_outdated") Boolean show_outdated, @Param("partner_product") String partner_product);


    /**
     * Fetch all identity verification checks associated the beneficiary
     * Fetch all identity verification checks associated the beneficiary.
     * Note, this is equivalent to the other <code>gETV1CustomerBeneficiariesBeneficiaryIdIdvChecks</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerBeneficiariesBeneficiaryIdIdvChecksQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>show_outdated -  (optional)</li>
     *   <li>partner_product -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20024&gt;
     */
    @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/idv-checks?show_outdated={show_outdated}&partner_product={partner_product}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20024> gETV1CustomerBeneficiariesBeneficiaryIdIdvChecks
    (@Param("beneficiary_id") String beneficiary_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetches list of identity verification documents uploaded and required to be uploaded for beneficiary
   * Fetches list of identity verification documents uploaded and required to be uploaded for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param idv_check_scenario  (required)
    * @param partner_product  (optional)
   * @return InlineResponse20010
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/idv-docs?idv_check_scenario={idv_check_scenario}&partner_product={partner_product}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20010 gETV1CustomerBeneficiariesBeneficiaryIdIdvDocs(@Param("beneficiary_id") String beneficiary_id, @Param("idv_check_scenario") String idv_check_scenario, @Param("partner_product") String partner_product);


    /**
     * Fetches list of identity verification documents uploaded and required to be uploaded for beneficiary
     * Fetches list of identity verification documents uploaded and required to be uploaded for beneficiary.
     * Note, this is equivalent to the other <code>gETV1CustomerBeneficiariesBeneficiaryIdIdvDocs</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerBeneficiariesBeneficiaryIdIdvDocsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>idv_check_scenario -  (required)</li>
     *   <li>partner_product -  (optional)</li>
     *   </ul>
     * @return InlineResponse20010
     */
    @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/idv-docs?idv_check_scenario={idv_check_scenario}&partner_product={partner_product}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20010 gETV1CustomerBeneficiariesBeneficiaryIdIdvDocs
    (@Param("beneficiary_id") String beneficiary_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Waits until beneficiary will be in final state
   * 
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse20042
   */
  @RequestLine("GET /v1/customer/beneficiaries/{beneficiary_id}/wait")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20042 gETV1CustomerBeneficiariesBeneficiaryIdWait(@Param("beneficiary_id") String beneficiary_id);

  /**
   * Return account for beneficiary
   * Return account for beneficiary.
    * @param account_id  (required)
   * @return InlineResponse20083
   */
  @RequestLine("GET /v1/customer/beneficiary-accounts/{account_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20083 gETV1CustomerBeneficiaryAccountsAccountId(@Param("account_id") String account_id);

  /**
   * 
   * 
   */
  @RequestLine("GET /v1/customer/billing/export-csv")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerBillingExportCsv();

  /**
   * List cards
   * 
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param ledger_id Filter cards by their ledger. (optional)
    * @param holder_id Filter cards by their holder. Card holder is the same as the holder of card&#x27;s ledger. (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20034&gt;
   */
  @RequestLine("GET /v1/customer/cards?ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20034> gETV1CustomerCards(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("ledger_id") String ledger_id, @Param("holder_id") String holder_id, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List cards
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerCards</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerCardsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>ledger_id - Filter cards by their ledger. (optional)</li>
     *   <li>holder_id - Filter cards by their holder. Card holder is the same as the holder of card&#x27;s ledger. (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20034&gt;
     */
    @RequestLine("GET /v1/customer/cards?ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20034> gETV1CustomerCards
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get card details from token
   * 
    * @param card_token Enduser facing card identifier printed on the card. Unique per card programme. Shorter than card_id. (required)
   * @return InlineResponse20082
   */
  @RequestLine("GET /v1/customer/cards/by-token/{card_token}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20082 gETV1CustomerCardsByTokenCardToken(@Param("card_token") String card_token);

  /**
   * Get card details.
   * 
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
   * @return InlineResponse200111
   */
  @RequestLine("GET /v1/customer/cards/{card_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200111 gETV1CustomerCardsCardId(@Param("card_id") String card_id);

  /**
   * Get card image. The temporary image url is valid for 10 minutes
   * 
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
   * @return InlineResponse20066
   */
  @RequestLine("GET /v1/customer/cards/{card_id}/image")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20066 gETV1CustomerCardsCardIdImage(@Param("card_id") String card_id);

  /**
   * Get PIN for the Physical Card
   * Get PIN for the Physical Card
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
   * @return InlineResponse20029
   */
  @RequestLine("GET /v1/customer/cards/{card_id}/pin")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20029 gETV1CustomerCardsCardIdPin(@Param("card_id") String card_id);

  /**
   * List card rules
   * 
    * @param items_per_page  (optional)
    * @param starting_at_date  (optional)
    * @param last_seen_id  (optional)
   * @return List&lt;InlineResponse20021&gt;
   */
  @RequestLine("GET /v1/customer/cards/rules?items_per_page={items_per_page}&starting_at_date={starting_at_date}&last_seen_id={last_seen_id}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20021> gETV1CustomerCardsRules(@Param("items_per_page") Integer items_per_page, @Param("starting_at_date") LocalDateTime starting_at_date, @Param("last_seen_id") String last_seen_id);


    /**
     * List card rules
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerCardsRules</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerCardsRulesQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (optional)</li>
     *   <li>starting_at_date -  (optional)</li>
     *   <li>last_seen_id -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20021&gt;
     */
    @RequestLine("GET /v1/customer/cards/rules?items_per_page={items_per_page}&starting_at_date={starting_at_date}&last_seen_id={last_seen_id}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20021> gETV1CustomerCardsRules
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get card rule details
   * 
    * @param card_rule_id The rule&#x27;s uuid (required)
   * @return InlineResponse20098
   */
  @RequestLine("GET /v1/customer/cards/rules/{card_rule_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20098 gETV1CustomerCardsRulesCardRuleId(@Param("card_rule_id") String card_rule_id);

  /**
   * Get contact information for customer&#x27;s compliance officer
   * Get contact information for customer&#x27;s compliance officer.
   * @return InlineResponse20049
   */
  @RequestLine("GET /v1/customer/compliance-contact")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20049 gETV1CustomerComplianceContact();

  /**
   * Get firewall rules, optionally at some specific point in time
   * Get firewall rules, optionally at some specific point in time.                  The firewall rules are coded in special lisp-like syntax                  and are executed whenever customer creates new enduser or new transaction. The                  firewall type configures, which of these options the firewall should verify.
    * @param compliance_firewall_type  (required)
    * @param at_time  (optional)
   * @return InlineResponse200123
   */
  @RequestLine("GET /v1/customer/compliance-firewall-rules/{compliance_firewall_type}?at_time={at_time}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200123 gETV1CustomerComplianceFirewallRulesComplianceFirewallType(@Param("compliance_firewall_type") String compliance_firewall_type, @Param("at_time") LocalDateTime at_time);


    /**
     * Get firewall rules, optionally at some specific point in time
     * Get firewall rules, optionally at some specific point in time.                  The firewall rules are coded in special lisp-like syntax                  and are executed whenever customer creates new enduser or new transaction. The                  firewall type configures, which of these options the firewall should verify.
     * Note, this is equivalent to the other <code>gETV1CustomerComplianceFirewallRulesComplianceFirewallType</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerComplianceFirewallRulesComplianceFirewallTypeQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param compliance_firewall_type  (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>at_time -  (optional)</li>
     *   </ul>
     * @return InlineResponse200123
     */
    @RequestLine("GET /v1/customer/compliance-firewall-rules/{compliance_firewall_type}?at_time={at_time}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse200123 gETV1CustomerComplianceFirewallRulesComplianceFirewallType
    (@Param("compliance_firewall_type") String compliance_firewall_type, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get firewall rules history
   * Get firewall rules history. The firewall rules are coded in special lisp-like syntax                 and are executed whenever customer creates new enduser or new transaction. The                 firewall type configures, which of these options the firewall should verify.
    * @param compliance_firewall_type  (required)
   * @return List&lt;InlineResponse20078&gt;
   */
  @RequestLine("GET /v1/customer/compliance-firewall-rules/{compliance_firewall_type}/history")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20078> gETV1CustomerComplianceFirewallRulesComplianceFirewallTypeHistory(@Param("compliance_firewall_type") String compliance_firewall_type);

  /**
   * Read firewall dataset
   * Read firewall dataset. The dataset should consist of CSV data in a string. Rows       and columns can be used to query individual data in the dataset. The dataset is       accesible by the given name, which must be unique for semantically different       datasets.
    * @param dataset_id  (required)
   * @return InlineResponse2002
   */
  @RequestLine("GET /v1/customer/compliance-firewall-static-data/{dataset_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse2002 gETV1CustomerComplianceFirewallStaticDataDatasetId(@Param("dataset_id") String dataset_id);

  /**
   * Get compliance manual that includes all the firewalls and related data,                  optionally at some specific point in time
   * Get compliance manual that includes all the firewalls and related data,                  optionally at some specific point in time.                  The firewall rules are coded in special lisp-like syntax                  and are executed whenever customer creates new enduser or new transaction. The                  firewall type configures, which of these options the firewall should verify.
    * @param at_time  (optional)
   * @return List&lt;InlineResponse20054&gt;
   */
  @RequestLine("GET /v1/customer/compliance-manual?at_time={at_time}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20054> gETV1CustomerComplianceManual(@Param("at_time") LocalDateTime at_time);


    /**
     * Get compliance manual that includes all the firewalls and related data,                  optionally at some specific point in time
     * Get compliance manual that includes all the firewalls and related data,                  optionally at some specific point in time.                  The firewall rules are coded in special lisp-like syntax                  and are executed whenever customer creates new enduser or new transaction. The                  firewall type configures, which of these options the firewall should verify.
     * Note, this is equivalent to the other <code>gETV1CustomerComplianceManual</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerComplianceManualQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>at_time -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20054&gt;
     */
    @RequestLine("GET /v1/customer/compliance-manual?at_time={at_time}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20054> gETV1CustomerComplianceManual
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * List all mandates in a customer environment with optional filters applied.                 Filters that can be applied:                 No filter: GET v1/customer/debit/mandates - list all mandates in customer environment - owned either by himself or by any of his endusers.                 By ledger : GET v1/customer/debit/mandates?ledger_id&#x3D;UUID list mandates connected with supplied ledger.                 By ledger holder: GET v1/customer/debit/mandates?holder_id&#x3D;UUID list mandates owned by supplied holder, enduser or customer himself.
   * 
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param ledger_id  (optional)
    * @param holder_id  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse200120&gt;
   */
  @RequestLine("GET /v1/customer/debit/mandates?ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse200120> gETV1CustomerDebitMandates(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("ledger_id") String ledger_id, @Param("holder_id") String holder_id, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all mandates in a customer environment with optional filters applied.                 Filters that can be applied:                 No filter: GET v1/customer/debit/mandates - list all mandates in customer environment - owned either by himself or by any of his endusers.                 By ledger : GET v1/customer/debit/mandates?ledger_id&#x3D;UUID list mandates connected with supplied ledger.                 By ledger holder: GET v1/customer/debit/mandates?holder_id&#x3D;UUID list mandates owned by supplied holder, enduser or customer himself.
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerDebitMandates</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerDebitMandatesQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>ledger_id -  (optional)</li>
     *   <li>holder_id -  (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse200120&gt;
     */
    @RequestLine("GET /v1/customer/debit/mandates?ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse200120> gETV1CustomerDebitMandates
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch a mandate by ID
   * 
    * @param debit_mandate_id  (required)
   * @return InlineResponse20053
   */
  @RequestLine("GET /v1/customer/debit/mandates/{debit_mandate_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20053 gETV1CustomerDebitMandatesDebitMandateId(@Param("debit_mandate_id") String debit_mandate_id);

  /**
   * Fetch a mandate by ID
   * 
    * @param mandate_id  (required)
   * @return InlineResponse20088
   */
  @RequestLine("GET /v1/customer/debit/mandates/{mandate_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20088 gETV1CustomerDebitMandatesMandateId(@Param("mandate_id") String mandate_id);

  /**
   * List all direct debit payments in a customer environment with optional filters applied.                 Filters that can be applied:                 No filter: GET v1/customer/debit/mandates - list all direct debit payments in customer environment - owned either by himself or by any of his endusers.                 By mandate : GET v1/customer/debit/mandates?mandate_id&#x3D;UUID list payments by mandate                 By ledger : GET v1/customer/debit/mandates?ledger_id&#x3D;UUID list debit payments connected with supplied ledger.                 By ledger holder: GET v1/customer/debit/mandates?holder_id&#x3D;UUID list debit payments by supplied holder, enduser or customer himself.
   * 
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param debit_mandate_id  (optional)
    * @param ledger_id  (optional)
    * @param holder_id  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20067&gt;
   */
  @RequestLine("GET /v1/customer/debit/payments?debit_mandate_id={debit_mandate_id}&ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20067> gETV1CustomerDebitPayments(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("debit_mandate_id") String debit_mandate_id, @Param("ledger_id") String ledger_id, @Param("holder_id") String holder_id, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all direct debit payments in a customer environment with optional filters applied.                 Filters that can be applied:                 No filter: GET v1/customer/debit/mandates - list all direct debit payments in customer environment - owned either by himself or by any of his endusers.                 By mandate : GET v1/customer/debit/mandates?mandate_id&#x3D;UUID list payments by mandate                 By ledger : GET v1/customer/debit/mandates?ledger_id&#x3D;UUID list debit payments connected with supplied ledger.                 By ledger holder: GET v1/customer/debit/mandates?holder_id&#x3D;UUID list debit payments by supplied holder, enduser or customer himself.
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerDebitPayments</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerDebitPaymentsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>debit_mandate_id -  (optional)</li>
     *   <li>ledger_id -  (optional)</li>
     *   <li>holder_id -  (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20067&gt;
     */
    @RequestLine("GET /v1/customer/debit/payments?debit_mandate_id={debit_mandate_id}&ledger_id={ledger_id}&holder_id={holder_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20067> gETV1CustomerDebitPayments
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch a debit payment by ID
   * 
    * @param debit_payment_id  (required)
   * @return InlineResponse200115
   */
  @RequestLine("GET /v1/customer/debit/payments/{debit_payment_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200115 gETV1CustomerDebitPaymentsDebitPaymentId(@Param("debit_payment_id") String debit_payment_id);

  /**
   * List all endusers created by the given customer
   * List all endusers created by the given customer.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20084&gt;
   */
  @RequestLine("GET /v1/customer/endusers?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20084> gETV1CustomerEndusers(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all endusers created by the given customer
     * List all endusers created by the given customer.
     * Note, this is equivalent to the other <code>gETV1CustomerEndusers</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerEndusersQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20084&gt;
     */
    @RequestLine("GET /v1/customer/endusers?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20084> gETV1CustomerEndusers
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch enduser entity
   * Fetch enduser entity.
    * @param enduser_id  (required)
   * @return InlineResponse20057
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20057 gETV1CustomerEndusersEnduserId(@Param("enduser_id") String enduser_id);

  /**
   * Fetch latest firewall calculation report for enduser
   * Fetch latest firewall calculation report for enduser.
    * @param enduser_id  (required)
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/compliance-firewall-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerEndusersEnduserIdComplianceFirewallCalculation(@Param("enduser_id") String enduser_id);

  /**
   * Get credit details for enduser
   * Get credit details for enduser.
    * @param enduser_id  (required)
    * @param credit_details_id  (required)
   * @return InlineResponse200117
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/credit-checks/{credit_details_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200117 gETV1CustomerEndusersEnduserIdCreditChecksCreditDetailsId(@Param("enduser_id") String enduser_id, @Param("credit_details_id") String credit_details_id);

  /**
   * DEPRECATED! Fetch latest firewall calculation report for enduser
   * &lt;strong&gt;DEPRECATED!&lt;/strong&gt; Use /v1/customer/endusers/{enduser-id}/compliance-firewall-calculation instead&lt;br/&gt;Fetch latest firewall calculation report for enduser.
    * @param enduser_id  (required)
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/fw-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerEndusersEnduserIdFwCalculation(@Param("enduser_id") String enduser_id);

  /**
   * Fetch all identity verification checks associated the enduser
   * Fetch all identity verification checks associated the enduser.
    * @param enduser_id  (required)
    * @param body  (optional)
    * @param show_outdated  (optional)
    * @param partner_product  (optional)
   * @return List&lt;InlineResponse20026&gt;
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/idv-checks?show_outdated={show_outdated}&partner_product={partner_product}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20026> gETV1CustomerEndusersEnduserIdIdvChecks(@Param("enduser_id") String enduser_id, EnduserIdIdvchecksBody body, @Param("show_outdated") Boolean show_outdated, @Param("partner_product") String partner_product);


    /**
     * Fetch all identity verification checks associated the enduser
     * Fetch all identity verification checks associated the enduser.
     * Note, this is equivalent to the other <code>gETV1CustomerEndusersEnduserIdIdvChecks</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerEndusersEnduserIdIdvChecksQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param enduser_id  (required)
     * @param body  (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>show_outdated -  (optional)</li>
     *   <li>partner_product -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20026&gt;
     */
    @RequestLine("GET /v1/customer/endusers/{enduser_id}/idv-checks?show_outdated={show_outdated}&partner_product={partner_product}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20026> gETV1CustomerEndusersEnduserIdIdvChecks
    (@Param("enduser_id") String enduser_id, EnduserIdIdvchecksBody body, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetches list of identity verification documents uploaded and required to be uploaded for enduser
   * Fetches list of identity verification documents uploaded and required to be uploaded for enduser.
    * @param enduser_id  (required)
    * @param idv_check_scenario  (required)
    * @param partner_product  (optional)
   * @return InlineResponse20016
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/idv-docs?idv_check_scenario={idv_check_scenario}&partner_product={partner_product}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20016 gETV1CustomerEndusersEnduserIdIdvDocs(@Param("enduser_id") String enduser_id, @Param("idv_check_scenario") String idv_check_scenario, @Param("partner_product") String partner_product);


    /**
     * Fetches list of identity verification documents uploaded and required to be uploaded for enduser
     * Fetches list of identity verification documents uploaded and required to be uploaded for enduser.
     * Note, this is equivalent to the other <code>gETV1CustomerEndusersEnduserIdIdvDocs</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerEndusersEnduserIdIdvDocsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param enduser_id  (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>idv_check_scenario -  (required)</li>
     *   <li>partner_product -  (optional)</li>
     *   </ul>
     * @return InlineResponse20016
     */
    @RequestLine("GET /v1/customer/endusers/{enduser_id}/idv-docs?idv_check_scenario={idv_check_scenario}&partner_product={partner_product}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20016 gETV1CustomerEndusersEnduserIdIdvDocs
    (@Param("enduser_id") String enduser_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch all kyc checks for enduser
   * Fetch all kyc checks for enduser
    * @param enduser_id  (required)
    * @param items_per_page  (optional)
    * @param offset  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse200104&gt;
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/kyc-checks?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse200104> gETV1CustomerEndusersEnduserIdKycChecks(@Param("enduser_id") String enduser_id, @Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * Fetch all kyc checks for enduser
     * Fetch all kyc checks for enduser
     * Note, this is equivalent to the other <code>gETV1CustomerEndusersEnduserIdKycChecks</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerEndusersEnduserIdKycChecksQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param enduser_id  (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (optional)</li>
     *   <li>offset -  (optional)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse200104&gt;
     */
    @RequestLine("GET /v1/customer/endusers/{enduser_id}/kyc-checks?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse200104> gETV1CustomerEndusersEnduserIdKycChecks
    (@Param("enduser_id") String enduser_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch kyc check entity
   * Fetch kyc check entity
    * @param enduser_id  (required)
    * @param kyc_id  (required)
   * @return InlineResponse20051
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/kyc-checks/{kyc_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20051 gETV1CustomerEndusersEnduserIdKycChecksKycId(@Param("enduser_id") String enduser_id, @Param("kyc_id") String kyc_id);

  /**
   * Waits until enduser will be in final state
   * 
    * @param enduser_id  (required)
   * @return InlineResponse200109
   */
  @RequestLine("GET /v1/customer/endusers/{enduser_id}/wait")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200109 gETV1CustomerEndusersEnduserIdWait(@Param("enduser_id") String enduser_id);

  /**
   * List all ledgers in a customer environment with an optional filters applied
   * List all ledgers in a customer environment with an optional filters applied.                  No filter: GET v1/customer/ledgers list all ledgers in customer environment - owned either by himself or by any of his endusers.                  By account number:  v1/customer/ledgers?account_number&#x3D;ACCOUNT-NUMBER finds a particular ledger based on its account number (for any product).                  By ledger holder: GET v1/customer/ledgers?holder_id&#x3D;UUID list ledgers owned by supplied holder, enduser or customer himself.                  By product: GET v1/customer/ledgers?partner_product&#x3D;PRODUCT filters ledgers by their product.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param holder_id  (optional)
    * @param partner_product  (optional)
    * @param account_number  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20012&gt;
   */
  @RequestLine("GET /v1/customer/ledgers?holder_id={holder_id}&partner_product={partner_product}&account_number={account_number}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20012> gETV1CustomerLedgers(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("holder_id") String holder_id, @Param("partner_product") String partner_product, @Param("account_number") String account_number, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all ledgers in a customer environment with an optional filters applied
     * List all ledgers in a customer environment with an optional filters applied.                  No filter: GET v1/customer/ledgers list all ledgers in customer environment - owned either by himself or by any of his endusers.                  By account number:  v1/customer/ledgers?account_number&#x3D;ACCOUNT-NUMBER finds a particular ledger based on its account number (for any product).                  By ledger holder: GET v1/customer/ledgers?holder_id&#x3D;UUID list ledgers owned by supplied holder, enduser or customer himself.                  By product: GET v1/customer/ledgers?partner_product&#x3D;PRODUCT filters ledgers by their product.
     * Note, this is equivalent to the other <code>gETV1CustomerLedgers</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>holder_id -  (optional)</li>
     *   <li>partner_product -  (optional)</li>
     *   <li>account_number -  (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20012&gt;
     */
    @RequestLine("GET /v1/customer/ledgers?holder_id={holder_id}&partner_product={partner_product}&account_number={account_number}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20012> gETV1CustomerLedgers
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * DEPRECATED! Instead, use /v1/customer/ledgers?account_number&#x3D;iban, which is generic across all products
   * 
    * @param iban  (required)
   * @return InlineResponse20092
   */
  @RequestLine("GET /v1/customer/ledgers/by-iban?iban={iban}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20092 gETV1CustomerLedgersByIban(@Param("iban") String iban);


    /**
     * DEPRECATED! Instead, use /v1/customer/ledgers?account_number&#x3D;iban, which is generic across all products
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersByIban</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersByIbanQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>iban -  (required)</li>
     *   </ul>
     * @return InlineResponse20092
     */
    @RequestLine("GET /v1/customer/ledgers/by-iban?iban={iban}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20092 gETV1CustomerLedgersByIban
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * DEPRECATED! Instead, use /v1/customer/ledgers?account_number&#x3D;uk-account-number, which is generic across all products
   * 
    * @param uk_account_number  (required)
    * @param uk_sort_code  (required)
   * @return InlineResponse20015
   */
  @RequestLine("GET /v1/customer/ledgers/by-uk-bank-account?uk_account_number={uk_account_number}&uk_sort_code={uk_sort_code}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20015 gETV1CustomerLedgersByUkBankAccount(@Param("uk_account_number") String uk_account_number, @Param("uk_sort_code") String uk_sort_code);


    /**
     * DEPRECATED! Instead, use /v1/customer/ledgers?account_number&#x3D;uk-account-number, which is generic across all products
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersByUkBankAccount</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersByUkBankAccountQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>uk_account_number -  (required)</li>
     *   <li>uk_sort_code -  (required)</li>
     *   </ul>
     * @return InlineResponse20015
     */
    @RequestLine("GET /v1/customer/ledgers/by-uk-bank-account?uk_account_number={uk_account_number}&uk_sort_code={uk_sort_code}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20015 gETV1CustomerLedgersByUkBankAccount
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get list of ledgers that were modified from the time specified
   * Get list of ledgers that were modified from the time specified. Note that this call                 is optimized to be quite fast - you can call it frequently to check out, if there                 are some changes on any ledgers. Interval which we query is closed in from-time                 and returned next-request-date. That mean if ledger amount has beet updated at                 exact moment of next-request-date this ledger will be included in previous and next answer.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (required)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return InlineResponse20060
   */
  @RequestLine("GET /v1/customer/ledgers/changed?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20060 gETV1CustomerLedgersChanged(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * Get list of ledgers that were modified from the time specified
     * Get list of ledgers that were modified from the time specified. Note that this call                 is optimized to be quite fast - you can call it frequently to check out, if there                 are some changes on any ledgers. Interval which we query is closed in from-time                 and returned next-request-date. That mean if ledger amount has beet updated at                 exact moment of next-request-date this ledger will be included in previous and next answer.
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersChanged</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersChangedQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (required)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return InlineResponse20060
     */
    @RequestLine("GET /v1/customer/ledgers/changed?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20060 gETV1CustomerLedgersChanged
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch ledger entity.
   * Fetches all details for a particular ledger. Also possible to apply ‘at-time’ param                   to fetch historical ledger details, from which ‘amount’ can be used to construct                   ledger statements
    * @param ledger_id  (required)
    * @param at_time  (optional)
   * @return InlineResponse20075
   */
  @RequestLine("GET /v1/customer/ledgers/{ledger_id}?at_time={at_time}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20075 gETV1CustomerLedgersLedgerId(@Param("ledger_id") String ledger_id, @Param("at_time") LocalDateTime at_time);


    /**
     * Fetch ledger entity.
     * Fetches all details for a particular ledger. Also possible to apply ‘at-time’ param                   to fetch historical ledger details, from which ‘amount’ can be used to construct                   ledger statements
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersLedgerId</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersLedgerIdQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param ledger_id  (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>at_time -  (optional)</li>
     *   </ul>
     * @return InlineResponse20075
     */
    @RequestLine("GET /v1/customer/ledgers/{ledger_id}?at_time={at_time}")
    @Headers({
    "Accept: application/json",    })
    InlineResponse20075 gETV1CustomerLedgersLedgerId
    (@Param("ledger_id") String ledger_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get ledger entries in a specified time range
   * Get ledger entries in a specified time range. This can be used to paginate through                 all transactions affecting the given user.
    * @param ledger_id  (required)
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
    * @param ledger_entry_event_type  (optional)
   * @return List&lt;InlineResponse2005&gt;
   */
  @RequestLine("GET /v1/customer/ledgers/{ledger_id}/entries?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}&ledger_entry_event_type={ledger_entry_event_type}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse2005> gETV1CustomerLedgersLedgerIdEntries(@Param("ledger_id") String ledger_id, @Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order, @Param("ledger_entry_event_type") String ledger_entry_event_type);


    /**
     * Get ledger entries in a specified time range
     * Get ledger entries in a specified time range. This can be used to paginate through                 all transactions affecting the given user.
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersLedgerIdEntries</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersLedgerIdEntriesQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param ledger_id  (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   <li>ledger_entry_event_type -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse2005&gt;
     */
    @RequestLine("GET /v1/customer/ledgers/{ledger_id}/entries?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}&ledger_entry_event_type={ledger_entry_event_type}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse2005> gETV1CustomerLedgersLedgerIdEntries
    (@Param("ledger_id") String ledger_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Waits until ledger will be in final state
   * 
    * @param ledger_id  (required)
   * @return InlineResponse20072
   */
  @RequestLine("GET /v1/customer/ledgers/{ledger_id}/wait")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20072 gETV1CustomerLedgersLedgerIdWait(@Param("ledger_id") String ledger_id);

  /**
   * Get list of ledgers that customer is able to assign to holders
   * Get list of ledgers that customer is able to assign to holders.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse200&gt;
   */
  @RequestLine("GET /v1/customer/ledgers/unassigned?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse200> gETV1CustomerLedgersUnassigned(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * Get list of ledgers that customer is able to assign to holders
     * Get list of ledgers that customer is able to assign to holders.
     * Note, this is equivalent to the other <code>gETV1CustomerLedgersUnassigned</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerLedgersUnassignedQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse200&gt;
     */
    @RequestLine("GET /v1/customer/ledgers/unassigned?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse200> gETV1CustomerLedgersUnassigned
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Get customer&#x27;s own information
   * 
   * @return InlineResponse20043
   */
  @RequestLine("GET /v1/customer/me")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20043 gETV1CustomerMe();

  /**
   * Get list of authorised banks for this customer
   * Get list of authorised banks for this customer. The returned                 names / slugs can be used interchangeably to identify partner bank throughout the whole application.
   * @return List&lt;InlineResponse20059&gt;
   */
  @RequestLine("GET /v1/customer/my/partners")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20059> gETV1CustomerMyPartners();

  /**
   * Get list of products enabled for customer
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /v1/customer/my/products")
  @Headers({
    "Accept: application/json",  })
  List<String> gETV1CustomerMyProducts();

  /**
   * List card programs assigned I can use with specific product.
   * 
    * @param partner_product Human readable identifier of the Railsbank product that provides card functionality. (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /v1/customer/my/products/{partner_product}/card-programmes")
  @Headers({
    "Accept: application/json",  })
  List<String> gETV1CustomerMyProductsPartnerProductCardProgrammes(@Param("partner_product") String partner_product);

  /**
   * List card programs assigned i can use with specific product.
   * 
    * @param partner_product  (required)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /v1/customer/my/products/{partner_product}/card-programs")
  @Headers({
    "Accept: application/json",  })
  List<String> gETV1CustomerMyProductsPartnerProductCardPrograms(@Param("partner_product") String partner_product);

  /**
   * Return list of notifications created between dates
   * 
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;Object&gt;
   */
  @RequestLine("GET /v1/customer/notifications?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<Object> gETV1CustomerNotifications(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * Return list of notifications created between dates
     * 
     * Note, this is equivalent to the other <code>gETV1CustomerNotifications</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerNotificationsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;Object&gt;
     */
    @RequestLine("GET /v1/customer/notifications?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<Object> gETV1CustomerNotifications
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch the payment token entity details by token. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token  (required)
   * @return InlineResponse200118
   */
  @RequestLine("GET /v1/customer/payment-tokens/by-token/{payment_token}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200118 gETV1CustomerPaymentTokensByTokenPaymentToken(@Param("payment_token") String payment_token);

  /**
   * Fetch the payment token entity details. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token_id Payment token ID (required)
   * @return InlineResponse20094
   */
  @RequestLine("GET /v1/customer/payment-tokens/{payment_token_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20094 gETV1CustomerPaymentTokensPaymentTokenId(@Param("payment_token_id") String payment_token_id);

  /**
   * Fetch the payment token activation code details. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token_id Payment token ID (required)
   * @return InlineResponse200101
   */
  @RequestLine("GET /v1/customer/payment-tokens/{payment_token_id}/activation-code")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200101 gETV1CustomerPaymentTokensPaymentTokenIdActivationCode(@Param("payment_token_id") String payment_token_id);

  /**
   * List all objects (transactions, endusers) in the quarantine
   * List all objects (transactions, endusers) in the quarantine.
   * @return InlineResponse20036
   */
  @RequestLine("GET /v1/customer/quarantine")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20036 gETV1CustomerQuarantine();

  /**
   * List all beneficiaries in the quarantine, ordered by entity creation date
   * List all beneficiaries in the quarantine, ordered by entity creation date
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20046&gt;
   */
  @RequestLine("GET /v1/customer/quarantine/beneficiaries?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20046> gETV1CustomerQuarantineBeneficiaries(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all beneficiaries in the quarantine, ordered by entity creation date
     * List all beneficiaries in the quarantine, ordered by entity creation date
     * Note, this is equivalent to the other <code>gETV1CustomerQuarantineBeneficiaries</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerQuarantineBeneficiariesQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20046&gt;
     */
    @RequestLine("GET /v1/customer/quarantine/beneficiaries?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20046> gETV1CustomerQuarantineBeneficiaries
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch quarantine for beneficiary
   * Fetch quarantine for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse200116
   */
  @RequestLine("GET /v1/customer/quarantine/beneficiaries/{beneficiary_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200116 gETV1CustomerQuarantineBeneficiariesBeneficiaryId(@Param("beneficiary_id") String beneficiary_id);

  /**
   * List all endusers in the quarantine, ordered by entity creation date
   * List all endusers in the quarantine, ordered by entity creation date
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse20040&gt;
   */
  @RequestLine("GET /v1/customer/quarantine/endusers?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20040> gETV1CustomerQuarantineEndusers(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all endusers in the quarantine, ordered by entity creation date
     * List all endusers in the quarantine, ordered by entity creation date
     * Note, this is equivalent to the other <code>gETV1CustomerQuarantineEndusers</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerQuarantineEndusersQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20040&gt;
     */
    @RequestLine("GET /v1/customer/quarantine/endusers?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20040> gETV1CustomerQuarantineEndusers
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch quarantine for enduser
   * Fetch quarantine for enduser.
    * @param enduser_id  (required)
   * @return InlineResponse20080
   */
  @RequestLine("GET /v1/customer/quarantine/endusers/{enduser_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20080 gETV1CustomerQuarantineEndusersEnduserId(@Param("enduser_id") String enduser_id);

  /**
   * List all transactions in the quarantine, ordered by entity creation date
   * List all transactions in the quarantine, ordered by entity creation date
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;InlineResponse200119&gt;
   */
  @RequestLine("GET /v1/customer/quarantine/transactions?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse200119> gETV1CustomerQuarantineTransactions(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * List all transactions in the quarantine, ordered by entity creation date
     * List all transactions in the quarantine, ordered by entity creation date
     * Note, this is equivalent to the other <code>gETV1CustomerQuarantineTransactions</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerQuarantineTransactionsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse200119&gt;
     */
    @RequestLine("GET /v1/customer/quarantine/transactions?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse200119> gETV1CustomerQuarantineTransactions
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch quarantine for transaction
   * Fetch quarantine for transaction.
    * @param transaction_id  (required)
   * @return InlineResponse2004
   */
  @RequestLine("GET /v1/customer/quarantine/transactions/{transaction_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse2004 gETV1CustomerQuarantineTransactionsTransactionId(@Param("transaction_id") String transaction_id);

  /**
   * Fetch all transactions in specified time range
   * Fetch all transactions in specified time range.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param ledger_id  (optional)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
    * @param show_released_reservations  (optional)
   * @return List&lt;InlineResponse20064&gt;
   */
  @RequestLine("GET /v1/customer/transactions?ledger_id={ledger_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}&show_released_reservations={show_released_reservations}")
  @Headers({
    "Accept: application/json",  })
  List<InlineResponse20064> gETV1CustomerTransactions(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("ledger_id") String ledger_id, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order, @Param("show_released_reservations") Boolean show_released_reservations);


    /**
     * Fetch all transactions in specified time range
     * Fetch all transactions in specified time range.
     * Note, this is equivalent to the other <code>gETV1CustomerTransactions</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerTransactionsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>ledger_id -  (optional)</li>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   <li>show_released_reservations -  (optional)</li>
     *   </ul>
     * @return List&lt;InlineResponse20064&gt;
     */
    @RequestLine("GET /v1/customer/transactions?ledger_id={ledger_id}&items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}&show_released_reservations={show_released_reservations}")
    @Headers({
    "Accept: application/json",    })
    List<InlineResponse20064> gETV1CustomerTransactions
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Fetch the transaction object
   * Fetch the transaction object. This is mostly important to see, whether the                 transaction was correctly settled or whether it was declined for some reason.
    * @param transaction_id  (required)
   * @return InlineResponse20069
   */
  @RequestLine("GET /v1/customer/transactions/{transaction_id}")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20069 gETV1CustomerTransactionsTransactionId(@Param("transaction_id") String transaction_id);

  /**
   * Fetch latest firewall calculation report for transaction
   * Fetch latest firewall calculation report for transaction.
    * @param transaction_id  (required)
   */
  @RequestLine("GET /v1/customer/transactions/{transaction_id}/compliance-firewall-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerTransactionsTransactionIdComplianceFirewallCalculation(@Param("transaction_id") String transaction_id);

  /**
   * DEPRECATED! Fetch latest firewall calculation report for transaction
   * &lt;strong&gt;DEPRECATED!&lt;/strong&gt; Use /v1/customer/transactions/{transaction-id}/compliance-firewall-calculation instead&lt;br/&gt;Fetch latest firewall calculation report for transaction.
    * @param transaction_id  (required)
   */
  @RequestLine("GET /v1/customer/transactions/{transaction_id}/fw-calculation")
  @Headers({
    "Accept: ",  })
  void gETV1CustomerTransactionsTransactionIdFwCalculation(@Param("transaction_id") String transaction_id);

  /**
   * Returns version of API
   * 
   * @return InlineResponse20018
   */
  @RequestLine("GET /v1/customer/version")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20018 gETV1CustomerVersion();

  /**
   * Get your webhook information
   * Get your webhook information.
   * @return InlineResponse200122
   */
  @RequestLine("GET /v1/customer/webhook")
  @Headers({
    "Accept: application/json",  })
  InlineResponse200122 gETV1CustomerWebhook();

  /**
   * Get your failed webhook deliveries information
   * Get your failed webhook deliveries information.
    * @param items_per_page  (required)
    * @param offset  (required)
    * @param from_date  (optional)
    * @param to_date  (optional)
    * @param order  (optional)
   * @return List&lt;Object&gt;
   */
  @RequestLine("GET /v1/customer/webhook/failed-to-deliver?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
  @Headers({
    "Accept: application/json",  })
  List<Object> gETV1CustomerWebhookFailedToDeliver(@Param("items_per_page") Integer items_per_page, @Param("offset") Integer offset, @Param("from_date") LocalDateTime from_date, @Param("to_date") LocalDateTime to_date, @Param("order") String order);


    /**
     * Get your failed webhook deliveries information
     * Get your failed webhook deliveries information.
     * Note, this is equivalent to the other <code>gETV1CustomerWebhookFailedToDeliver</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETV1CustomerWebhookFailedToDeliverQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>items_per_page -  (required)</li>
     *   <li>offset -  (required)</li>
     *   <li>from_date -  (optional)</li>
     *   <li>to_date -  (optional)</li>
     *   <li>order -  (optional)</li>
     *   </ul>
     * @return List&lt;Object&gt;
     */
    @RequestLine("GET /v1/customer/webhook/failed-to-deliver?items_per_page={items_per_page}&offset={offset}&from_date={from_date}&to_date={to_date}&order={order}")
    @Headers({
    "Accept: application/json",    })
    List<Object> gETV1CustomerWebhookFailedToDeliver
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Check system health
   * Check system healh - if the system is working and responsive it will generate {\&quot;status\&quot;:\&quot;ok\&quot;}
   * @return InlineResponse20087
   */
  @RequestLine("GET /v1/health")
  @Headers({
    "Accept: application/json",  })
  InlineResponse20087 gETV1Health();

  /**
   * Create new customer api key
   * 
    * @param body  (optional)
   * @return InlineResponse20074
   */
  @RequestLine("POST /v1/customer/api-keys")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20074 pOSTV1CustomerApiKeys(CustomerApikeysBody body);

  /**
   * Disable customer&#x27;s api key
   * 
    * @param api_key_id  (required)
   */
  @RequestLine("POST /v1/customer/api-keys/{api_key_id}/disable")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTV1CustomerApiKeysApiKeyIdDisable(@Param("api_key_id") String api_key_id);

  /**
   * Creates new beneficiary
   * Creates new beneficiary. This represents the entity where money can be sent.                 Every transaction must point to an existing beneficiary. The customer&#x27;s                 compliance firewall will be run against the newly created entity.                 if some attributes / documents are missing, this will be reflected by beneficiary status                 and quarantine attribute.
    * @param body  (optional)
   * @return InlineResponse2007
   */
  @RequestLine("POST /v1/customer/beneficiaries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse2007 pOSTV1CustomerBeneficiaries(CustomerBeneficiariesBody body);

  /**
   * Creates new account for beneficiary
   * Creates new account for beneficiary. Beneficiary can have multiple account with different currencies                  or with different addresses(eur account with iban and bic-swift, gbp account with account number and sort code, ...)
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param body  (optional)
   * @return InlineResponse20090
   */
  @RequestLine("POST /v1/customer/beneficiaries/{beneficiary_id}/accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20090 pOSTV1CustomerBeneficiariesBeneficiaryIdAccounts(@Param("beneficiary_id") String beneficiary_id, BeneficiaryIdAccountsBody body);

  /**
   * DEPRECATED in favour of &#x60;/v1/customer/beneficiaries/{beneficiary_id}/idv-docs&#x60; endpoint
   * DEPRECATED in favour of &#x60;/v1/customer/beneficiaries/{beneficiary_id}/idv-docs&#x60; endpoint.                  Upload new identity verification document for beneficiary.
    * @param file  (required)
    * @param idv_document_type  (required)
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse200108
   */
  @RequestLine("POST /v1/customer/beneficiaries/{beneficiary_id}/identity-verification-documents")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",  })
  InlineResponse200108 pOSTV1CustomerBeneficiariesBeneficiaryIdIdentityVerificationDocuments(@Param("file") File file, @Param("idv_document_type") String idv_document_type, @Param("beneficiary_id") String beneficiary_id);

  /**
   * Create new identity verification check for beneficiary
   * Create new identity verification check for beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param body  (optional)
   * @return InlineResponse20025
   */
  @RequestLine("POST /v1/customer/beneficiaries/{beneficiary_id}/idv-checks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20025 pOSTV1CustomerBeneficiariesBeneficiaryIdIdvChecks(@Param("beneficiary_id") String beneficiary_id, BeneficiaryIdIdvchecksBody body);

  /**
   * Upload new identity verification document for beneficiary
   * Upload new identity verification document for beneficiary.                  Returns list of identity verification documents uploaded and required to be uploaded for beneficiary.
    * @param file  (required)
    * @param idv_document_type  (required)
    * @param partner_product  (required)
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse20011
   */
  @RequestLine("POST /v1/customer/beneficiaries/{beneficiary_id}/idv-docs")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",  })
  InlineResponse20011 pOSTV1CustomerBeneficiariesBeneficiaryIdIdvDocs(@Param("file") File file, @Param("idv_document_type") String idv_document_type, @Param("partner_product") String partner_product, @Param("beneficiary_id") String beneficiary_id);

  /**
   * Move existing beneficiary from missing data to state which will rerun firewalls
   * Move existing beneficiary from missing data to state which will rerun firewalls.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
   * @return InlineResponse2001
   */
  @RequestLine("POST /v1/customer/beneficiaries/{beneficiary_id}/rerun-firewall")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse2001 pOSTV1CustomerBeneficiariesBeneficiaryIdRerunFirewall(@Param("beneficiary_id") String beneficiary_id);

  /**
   * Adds a new virtual or physical card to the ledger
   * Adds a new virtual or physical card to the ledger.
    * @param body  (optional)
   * @return InlineResponse20035
   */
  @RequestLine("POST /v1/customer/cards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20035 pOSTV1CustomerCards(CustomerCardsBody body);

  /**
   * Activate card
   * 
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
   * @return InlineResponse200110
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/activate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200110 pOSTV1CustomerCardsCardIdActivate(@Param("card_id") String card_id);

  /**
   * Close card
   * 
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
    * @param body  (optional)
   * @return InlineResponse20077
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/close")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20077 pOSTV1CustomerCardsCardIdClose(@Param("card_id") String card_id, CardIdCloseBody body);

  /**
   * Disable card
   * 
    * @param card_id Railsbank ID of the card. Unique across all the other Railsbank IDs. (required)
   * @return InlineResponse2008
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/disable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse2008 pOSTV1CustomerCardsCardIdDisable(@Param("card_id") String card_id);

  /**
   * Resets PIN for card
   * Resets PIN for card. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
   * @return InlineResponse20020
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/pin/reset")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20020 pOSTV1CustomerCardsCardIdPinReset(@Param("card_id") String card_id);

  /**
   * Replaces old virtual or physical card by the new one
   * Replaces old virtual or physical card by the new one.
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
    * @param body  (optional)
   * @return InlineResponse20048
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/replace")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20048 pOSTV1CustomerCardsCardIdReplace(@Param("card_id") String card_id, CardIdReplaceBody body);

  /**
   * Suspend card
   * 
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
    * @param body  (optional)
   * @return InlineResponse20062
   */
  @RequestLine("POST /v1/customer/cards/{card_id}/suspend")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20062 pOSTV1CustomerCardsCardIdSuspend(@Param("card_id") String card_id, CardIdSuspendBody body);

  /**
   * Create new card rule and return its id
   * 
    * @param body  (optional)
   * @return InlineResponse20022
   */
  @RequestLine("POST /v1/customer/cards/rules")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20022 pOSTV1CustomerCardsRules(CardsRulesBody body);

  /**
   * Disable card rule
   * Disable card rule. Only rule not assigned to any card can be disabled.
    * @param card_rule_id The rule&#x27;s uuid (required)
   * @return InlineResponse20031
   */
  @RequestLine("POST /v1/customer/cards/rules/{card_rule_id}/disable")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20031 pOSTV1CustomerCardsRulesCardRuleIdDisable(@Param("card_rule_id") String card_rule_id);

  /**
   * Set contact information for customer&#x27;s compliance officer
   * Set contact information for customer&#x27;s compliance officer.
    * @param body  (optional)
   * @return InlineResponse20050
   */
  @RequestLine("POST /v1/customer/compliance-contact")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20050 pOSTV1CustomerComplianceContact(CustomerCompliancecontactBody body);

  /**
   * Set/update firewall rules
   * Set/update firewall rules. The firewall rules are coded in special lisp-like syntax                 and are executed whenever customer creates new enduser or new transaction. The                 firewall type configures, which of these options the firewall should verify.                 Please keep in mind that any update of rules, even submitting the same data, leads to use of all current datasets.                 This can lead to different firewall results, even if the rules themselves have not been altered
    * @param compliance_firewall_type  (required)
    * @param body  (optional)
   * @return InlineResponse200124
   */
  @RequestLine("POST /v1/customer/compliance-firewall-rules/{compliance_firewall_type}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200124 pOSTV1CustomerComplianceFirewallRulesComplianceFirewallType(@Param("compliance_firewall_type") String compliance_firewall_type, CompliancefirewallrulesComplianceFirewallTypeBody body);

  /**
   * Applies most recent firewall rules with current datasets
   * Applies most recent firewall rules with current datasets.                 Please keep in mind that reloading the rules leads to use of all current datasets.                 This can lead to different firewall results.
    * @param compliance_firewall_type  (required)
   * @return InlineResponse20028
   */
  @RequestLine("POST /v1/customer/compliance-firewall-rules/{compliance_firewall_type}/reload")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20028 pOSTV1CustomerComplianceFirewallRulesComplianceFirewallTypeReload(@Param("compliance_firewall_type") String compliance_firewall_type);

  /**
   * Test firewall rules
   * Test firewall rules. The firewall rules are coded in special lisp-like syntax.      This endpoint doesn&#x27;t affect existing firewalls and is safe to run against any transaction,      enduser, ledger. Result of firewall is returned to user. Currently works only for transaction.
    * @param compliance_firewall_type  (required)
    * @param body  (optional)
   */
  @RequestLine("POST /v1/customer/compliance-firewall-rules/{compliance_firewall_type}/test")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTV1CustomerComplianceFirewallRulesComplianceFirewallTypeTest(@Param("compliance_firewall_type") String compliance_firewall_type, ComplianceFirewallTypeTestBody body);

  /**
   * Create firewall dataset
   * Create firewall dataset. The dataset should consist of CSV data in a string. Rows       and columns can be used to query individual data in the dataset. The dataset is       accesible by the given name, which must be unique for semantically different       datasets.
    * @param body  (optional)
   * @return InlineResponse20079
   */
  @RequestLine("POST /v1/customer/compliance-firewall-static-data")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20079 pOSTV1CustomerComplianceFirewallStaticData(CustomerCompliancefirewallstaticdataBody body);

  /**
   * Add new enduser
   * Add new enduser. Customer&#x27;s firewall will be run against the newly created entity;                 if some attributes / documents are missing, this will be reflected by endusers status                 and quarantine attribute.                 &#x60;full_name&#x60; object or &#x60;name&#x60; field is mandatory to be filled for creating new enduser                 type: &#x60;person&#x60;.                 Additional notes:                 &#x60;full_name&#x60; object will be fully replacing &#x60;name&#x60; field when creating new enduser                 type: &#x60;person&#x60;. Field &#x60;name&#x60; will stay as backwards compatible for existing customers,                 but might be Deprecated at some point in the future.
    * @param body  (optional)
   * @return InlineResponse20085
   */
  @RequestLine("POST /v1/customer/endusers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20085 pOSTV1CustomerEndusers(CustomerEndusersBody body);

  /**
   * Run a credit check for enduser
   * Run a credit check for enduser.
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse20023
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/credit-checks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20023 pOSTV1CustomerEndusersEnduserIdCreditChecks(@Param("enduser_id") String enduser_id, EnduserIdCreditchecksBody body);

  /**
   * Accept credit offer for enduser
   * Accept credit offer for enduser.
    * @param enduser_id  (required)
    * @param credit_details_id  (required)
   * @return InlineResponse20014
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/credit-checks/{credit_details_id}/accept")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20014 pOSTV1CustomerEndusersEnduserIdCreditChecksCreditDetailsIdAccept(@Param("enduser_id") String enduser_id, @Param("credit_details_id") String credit_details_id);

  /**
   * DEPRECATED in favour of &#x60;/v1/customer/endusers/{enduser_id}/idv-docs&#x60; endpoint
   * DEPRECATED in favour of &#x60;/v1/customer/endusers/{enduser_id}/idv-docs&#x60; endpoint.                  Upload new identity verification document for enduser.
    * @param file  (required)
    * @param idv_document_type  (required)
    * @param enduser_id  (required)
   * @return InlineResponse20093
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/identity-verification-documents")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",  })
  InlineResponse20093 pOSTV1CustomerEndusersEnduserIdIdentityVerificationDocuments(@Param("file") File file, @Param("idv_document_type") String idv_document_type, @Param("enduser_id") String enduser_id);

  /**
   * Create new identity verification check for enduser
   * Create new identity verification check for enduser.
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse20027
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/idv-checks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20027 pOSTV1CustomerEndusersEnduserIdIdvChecks(@Param("enduser_id") String enduser_id, EnduserIdIdvchecksBody1 body);

  /**
   * Upload new identity verification document for enduser
   * Upload new identity verification document for enduser.                  Returns list of identity verification documents uploaded and required to be uploaded for enduser.
    * @param file  (required)
    * @param idv_document_type  (required)
    * @param partner_product  (required)
    * @param enduser_id  (required)
   * @return InlineResponse20017
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/idv-docs")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",  })
  InlineResponse20017 pOSTV1CustomerEndusersEnduserIdIdvDocs(@Param("file") File file, @Param("idv_document_type") String idv_document_type, @Param("partner_product") String partner_product, @Param("enduser_id") String enduser_id);

  /**
   * Initiate new kyc check for enduser
   * Initiate new kyc check for enduser
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse200105
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/kyc-checks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200105 pOSTV1CustomerEndusersEnduserIdKycChecks(@Param("enduser_id") String enduser_id, EnduserIdKycchecksBody body);

  /**
   * Confirm kyc process completion
   * Confirm kyc process completion
    * @param enduser_id  (required)
    * @param body  (optional)
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/kyc-initiate-check")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTV1CustomerEndusersEnduserIdKycInitiateCheck(@Param("enduser_id") String enduser_id, EnduserIdKycinitiatecheckBody body);

  /**
   * Move existing enduser from missing data to state which will rerun firewalls
   * Move existing enduser from missing data to state which will rerun firewalls.
    * @param enduser_id  (required)
   * @return InlineResponse200114
   */
  @RequestLine("POST /v1/customer/endusers/{enduser_id}/rerun-firewall")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200114 pOSTV1CustomerEndusersEnduserIdRerunFirewall(@Param("enduser_id") String enduser_id);

  /**
   * Add new ledger for a given holder
   * Add new ledger for a given holder. This ledger is used for banking of the given                 enduser with the given partner bank in the given currency. Creating ledger entity is                 subjected to partner-bank&#x27;s firewall rules. Furthermore, ledger can associated with                 an iban with another call.
    * @param body  (optional)
   * @return InlineResponse20013
   */
  @RequestLine("POST /v1/customer/ledgers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20013 pOSTV1CustomerLedgers(CustomerLedgersBody body);

  /**
   * Assign ledger to holder
   * Assign ledger to holder.
    * @param ledger_id  (required)
    * @param body  (optional)
   * @return InlineResponse20097
   */
  @RequestLine("POST /v1/customer/ledgers/{ledger_id}/assign")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20097 pOSTV1CustomerLedgersLedgerIdAssign(@Param("ledger_id") String ledger_id, LedgerIdAssignBody body);

  /**
   * Will assign iban and bic for given ledger
   * Will assign iban and bic for given ledger.                  This may happen synchronously(seconds) or it may take some time(hours) depending on                  partner bank for which the ledger is created.
    * @param ledger_id  (required)
   * @return InlineResponse20068
   */
  @RequestLine("POST /v1/customer/ledgers/{ledger_id}/assign-iban")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20068 pOSTV1CustomerLedgersLedgerIdAssignIban(@Param("ledger_id") String ledger_id);

  /**
   * Close ledger
   * Close ledger. Currently supported for products: PayrNet-GBP-1, PayrNet-GBP-2, PayrNet-EUR-1, PayrNet-SGD-1, PayrNet-SGD-2, PayrNet-USD-1, PayrNet-USD-2, ExampleBank-GBP-1, ExampleBank-EUR-1. ExampleBank-SGD-1, ExampleBank-SGD-2, ExampleBank-USD-1.
    * @param ledger_id  (required)
   * @return InlineResponse20063
   */
  @RequestLine("POST /v1/customer/ledgers/{ledger_id}/close")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20063 pOSTV1CustomerLedgersLedgerIdClose(@Param("ledger_id") String ledger_id);

  /**
   * Move existing ledger from missing data to state which will rerun firewalls
   * Move existing ledger from missing data to state which will rerun firewalls.
    * @param ledger_id  (required)
   * @return InlineResponse20047
   */
  @RequestLine("POST /v1/customer/ledgers/{ledger_id}/rerun-firewall")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20047 pOSTV1CustomerLedgersLedgerIdRerunFirewall(@Param("ledger_id") String ledger_id);

  /**
   * Add new virtual ledger for a given holder
   * Add new virtual ledger for a given holder. This ledger is used for accounting      custom assets for your own internal use, not backed by real bank. Supports only manual      and inter-ledger transactions.
    * @param body  (optional)
   * @return InlineResponse20055
   */
  @RequestLine("POST /v1/customer/ledgers/virtual")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20055 pOSTV1CustomerLedgersVirtual(LedgersVirtualBody body);

  /**
   * Activate the payment token entity. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token_id Payment token ID (required)
   * @return String
   */
  @RequestLine("POST /v1/customer/payment-tokens/{payment_token_id}/activate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  String pOSTV1CustomerPaymentTokensPaymentTokenIdActivate(@Param("payment_token_id") String payment_token_id);

  /**
   * Close the payment token entity. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token_id Payment token ID (required)
    * @param body  (optional)
   * @return String
   */
  @RequestLine("POST /v1/customer/payment-tokens/{payment_token_id}/close")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  String pOSTV1CustomerPaymentTokensPaymentTokenIdClose(@Param("payment_token_id") String payment_token_id, PaymentTokenIdCloseBody body);

  /**
   * Suspend the payment token entity. Limitation: Railsbank-Debit-Card-2 or Railsbank-Debit-Card-3 products only.
   * 
    * @param payment_token_id Payment token ID (required)
    * @param body  (optional)
   * @return String
   */
  @RequestLine("POST /v1/customer/payment-tokens/{payment_token_id}/suspend")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  String pOSTV1CustomerPaymentTokensPaymentTokenIdSuspend(@Param("payment_token_id") String payment_token_id, PaymentTokenIdSuspendBody body);

  /**
   * Comment beneficiary in quarantine (transaction, enduser)
   * Comment beneficiary in quarantine (transaction, enduser). The object stays in the quarantine state.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param body  (optional)
   * @return InlineResponse20086
   */
  @RequestLine("POST /v1/customer/quarantine/beneficiaries/{beneficiary_id}/comments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20086 pOSTV1CustomerQuarantineBeneficiariesBeneficiaryIdComments(@Param("beneficiary_id") String beneficiary_id, BeneficiaryIdCommentsBody body);

  /**
   * Resolve object beneficiary in quarantine
   * Resolve object beneficiary in quarantine. If set to &#x27;pass&#x27;, the object                 will continue standard transition path. There is a possibility to add any comment to                 the entity.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param body  (optional)
   * @return InlineResponse20041
   */
  @RequestLine("POST /v1/customer/quarantine/beneficiaries/{beneficiary_id}/resolve")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20041 pOSTV1CustomerQuarantineBeneficiariesBeneficiaryIdResolve(@Param("beneficiary_id") String beneficiary_id, BeneficiaryIdResolveBody body);

  /**
   * Comment enduser in quarantine (transaction, enduser)
   * Comment enduser in quarantine (transaction, enduser). The object stays in the quarantine state.
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse2009
   */
  @RequestLine("POST /v1/customer/quarantine/endusers/{enduser_id}/comments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse2009 pOSTV1CustomerQuarantineEndusersEnduserIdComments(@Param("enduser_id") String enduser_id, EnduserIdCommentsBody body);

  /**
   * Resolve object enduser in quarantine
   * Resolve object enduser in quarantine. If set to &#x27;pass&#x27;, the object                 will continue standard transition path. There is a possibility to add any comment to                 the entity.
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse20019
   */
  @RequestLine("POST /v1/customer/quarantine/endusers/{enduser_id}/resolve")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20019 pOSTV1CustomerQuarantineEndusersEnduserIdResolve(@Param("enduser_id") String enduser_id, EnduserIdResolveBody body);

  /**
   * Comment transaction in quarantine (transaction, enduser)
   * Comment transaction in quarantine (transaction, enduser). The object stays in the quarantine state.
    * @param transaction_id  (required)
    * @param body  (optional)
   * @return InlineResponse200100
   */
  @RequestLine("POST /v1/customer/quarantine/transactions/{transaction_id}/comments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200100 pOSTV1CustomerQuarantineTransactionsTransactionIdComments(@Param("transaction_id") String transaction_id, TransactionIdCommentsBody body);

  /**
   * Resolve transaction in quarantine
   * Resolve transaction in quarantine. If set to &#x27;pass&#x27;, the object                 will continue standard transition path. There is a possibility to add any comment to                 the entity.
    * @param transaction_id  (required)
    * @param body  (optional)
   * @return InlineResponse20032
   */
  @RequestLine("POST /v1/customer/quarantine/transactions/{transaction_id}/resolve")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20032 pOSTV1CustomerQuarantineTransactionsTransactionIdResolve(@Param("transaction_id") String transaction_id, TransactionIdResolveBody body);

  /**
   * Creates new transaction
   * Creates new transaction. The assets are sent from specific endusers ledger to the                 given beneficiary. Note that the transaction may take some time (days in some cases)                 to pass through all stages of processing. During this time out can fetch the                 transaction and see if it is already in the &#x27;done&#x27; state.
    * @param body  (optional)
   * @return InlineResponse20065
   */
  @RequestLine("POST /v1/customer/transactions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20065 pOSTV1CustomerTransactions(CustomerTransactionsBody body);

  /**
   * Creates multiple send transactions atomically
   * Creates multiple send transactions atomically.
    * @param body  (optional)
   * @return List&lt;InlineResponse200107&gt;
   */
  @RequestLine("POST /v1/customer/transactions/bulk")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  List<InlineResponse200107> pOSTV1CustomerTransactionsBulk(List<TransactionsBulkBody> body);

  /**
   * Creates new fx transaction
   * Creates new fx transaction. The assets are sent from specific endusers ledger to the      given beneficiary. Note that the transaction may take some time (days in some cases)      to pass through all stages of processing. During this time out can fetch the      transaction and see if it is already in the &#x27;done&#x27; state.
    * @param body  (optional)
   * @return InlineResponse20095
   */
  @RequestLine("POST /v1/customer/transactions/fx")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20095 pOSTV1CustomerTransactionsFx(TransactionsFxBody body);

  /**
   * Creates new inter ledger transaction
   * Creates new inter ledger transaction. The assets are sent from specific endusers ledger to the      another enduser ledger. Note that the transaction may take some time (few seconds if everything is ok)      to pass through all stages of processing. During this time out can fetch the      transaction and see if it is already in the &#x27;done&#x27; state.
    * @param body  (optional)
   * @return InlineResponse200121
   */
  @RequestLine("POST /v1/customer/transactions/inter-ledger")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200121 pOSTV1CustomerTransactionsInterLedger(TransactionsInterledgerBody body);

  /**
   * Creates multiple new inter ledger transactions atomically
   * Creates multiple new inter ledger transactions atomically.
    * @param body  (optional)
   * @return List&lt;InlineResponse2003&gt;
   */
  @RequestLine("POST /v1/customer/transactions/inter-ledger/bulk")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  List<InlineResponse2003> pOSTV1CustomerTransactionsInterLedgerBulk(List<InterledgerBulkBody> body);

  /**
   * Try if inter ledger transaction is valid and if it&#x27;s missing any data needed in customer/partner firewall
   * Try if inter ledger transaction is valid and if it&#x27;s missing any data needed in customer/partner firewall.                 Transaction is not created you just get information if it would be ok if you submit it.                 You may need to call this multiple times because after you fill in some data that you currently                 miss we can discover that you need another data.
    * @param body  (optional)
   * @return InlineResponse20091
   */
  @RequestLine("POST /v1/customer/transactions/inter-ledger/try")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20091 pOSTV1CustomerTransactionsInterLedgerTry(InterledgerTryBody body);

  /**
   * Will credit the specified virtual ledger with the set amount
   * Will credit the specified virtual ledger with the set amount.
    * @param body  (optional)
   * @return InlineResponse20037
   */
  @RequestLine("POST /v1/customer/transactions/manual-credit")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20037 pOSTV1CustomerTransactionsManualCredit(TransactionsManualcreditBody body);

  /**
   * Will debit the specified virtual ledger with the set amount
   * Will debit the specified virtual ledger with the set amount.
    * @param body  (optional)
   * @return InlineResponse20056
   */
  @RequestLine("POST /v1/customer/transactions/manual-debit")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20056 pOSTV1CustomerTransactionsManualDebit(TransactionsManualdebitBody body);

  /**
   * Upload invoice or other proofing document for transaction
   * 
    * @param file  (required)
    * @param description  (required)
    * @param transaction_id  (required)
   * @return InlineResponse200113
   */
  @RequestLine("POST /v1/customer/transactions/{transaction_id}/invoices")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",  })
  InlineResponse200113 pOSTV1CustomerTransactionsTransactionIdInvoices(@Param("file") File file, @Param("description") String description, @Param("transaction_id") String transaction_id);

  /**
   * Move existing transaction from missing data to state which will rereun firewalls
   * Move existing transaction from missing data to state which will rereun firewalls.
    * @param transaction_id  (required)
   * @return InlineResponse20033
   */
  @RequestLine("POST /v1/customer/transactions/{transaction_id}/rerun-firewall")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20033 pOSTV1CustomerTransactionsTransactionIdRerunFirewall(@Param("transaction_id") String transaction_id);

  /**
   * Try if transaction is valid and if it&#x27;s missing any data needed in customer/partner firewall
   * Try if transaction is valid and if it&#x27;s missing any data needed in customer/partner firewall.                 Transaction is not created you just get information if it would be ok if you submit it.                 You may need to call this multiple times because after you fill in some data that you currently                 miss we can discover that you need another data.
    * @param body  (optional)
   * @return InlineResponse20081
   */
  @RequestLine("POST /v1/customer/transactions/try")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20081 pOSTV1CustomerTransactionsTry(TransactionsTryBody body);

  /**
   * Set your webhook url (only https) and secret
   * Set your webhook url (only https) and secret. Secret will be sent with every event
    * @param body  (optional)
   */
  @RequestLine("POST /v1/customer/webhook")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTV1CustomerWebhook(CustomerWebhookBody body);

  /**
   * Update your webhook secret
   * Update your webhook secret. Secret will be sent with every event
    * @param body  (optional)
   */
  @RequestLine("POST /v1/customer/webhook/update-secret")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTV1CustomerWebhookUpdateSecret(WebhookUpdatesecretBody body);

  /**
   * Update existing beneficiary
   * Update existing beneficiary. Customer&#x27;s firewall will be run against the newly created entity       only if previous state was pending.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param body  (optional)
   * @return InlineResponse20045
   */
  @RequestLine("PUT /v1/customer/beneficiaries/{beneficiary_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20045 pUTV1CustomerBeneficiariesBeneficiaryId(@Param("beneficiary_id") String beneficiary_id, BeneficiariesBeneficiaryIdBody body);

  /**
   * Update existing account for beneficiary
   * Update existing account for beneficiary. You can update all data about beneficiary account except currency.     Updating data is not recommnded and instead you should create new account and stop using old accounts.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param account_id  (required)
    * @param body  (optional)
   * @return InlineResponse200103
   */
  @RequestLine("PUT /v1/customer/beneficiaries/{beneficiary_id}/accounts/{account_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200103 pUTV1CustomerBeneficiariesBeneficiaryIdAccountsAccountId(@Param("beneficiary_id") String beneficiary_id, @Param("account_id") String account_id, AccountsAccountIdBody body);

  /**
   * Change default account of beneficiary
   * Change default account of beneficiary.
    * @param beneficiary_id The receiving Railsbank Beneficiary ID (required)
    * @param account_id  (required)
   * @return InlineResponse20096
   */
  @RequestLine("PUT /v1/customer/beneficiaries/{beneficiary_id}/accounts/{account_id}/make-default")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20096 pUTV1CustomerBeneficiariesBeneficiaryIdAccountsAccountIdMakeDefault(@Param("beneficiary_id") String beneficiary_id, @Param("account_id") String account_id);

  /**
   * Update card data
   * Update card data.                  Currently only card rules can be changed.                  Set card_rules to empty array to remove card rules from card.
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
    * @param body  (optional)
   * @return InlineResponse200112
   */
  @RequestLine("PUT /v1/customer/cards/{card_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200112 pUTV1CustomerCardsCardId(@Param("card_id") String card_id, CardsCardIdBody body);

  /**
   * Set PIN for the Physical Card
   * Set PIN for the Physical Card
    * @param card_id Railsbank&#x27;s unique identifier for the card. (required)
    * @param body  (optional)
   * @return InlineResponse20030
   */
  @RequestLine("PUT /v1/customer/cards/{card_id}/pin")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20030 pUTV1CustomerCardsCardIdPin(@Param("card_id") String card_id, CardIdPinBody body);

  /**
   * Update active card rule attributes
   * Update active card rule attributes.                  Rule type and rule body cannot be updated. If you need to change them, create a new rule instead
    * @param card_rule_id The rule&#x27;s uuid (required)
    * @param body  (optional)
   * @return InlineResponse20099
   */
  @RequestLine("PUT /v1/customer/cards/rules/{card_rule_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20099 pUTV1CustomerCardsRulesCardRuleId(@Param("card_rule_id") String card_rule_id, RulesCardRuleIdBody body);

  /**
   * Cancel a mandate
   * 
    * @param debit_mandate_id  (required)
   * @return InlineResponse200106
   */
  @RequestLine("PUT /v1/customer/debit/mandates/{debit_mandate_id}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse200106 pUTV1CustomerDebitMandatesDebitMandateIdCancel(@Param("debit_mandate_id") String debit_mandate_id);

  /**
   * Cancel a mandate
   * 
    * @param mandate_id  (required)
   * @return InlineResponse20038
   */
  @RequestLine("PUT /v1/customer/debit/mandates/{mandate_id}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20038 pUTV1CustomerDebitMandatesMandateIdCancel(@Param("mandate_id") String mandate_id);

  /**
   * Update existing enduser
   * Update existing enduser. Customer&#x27;s firewall will be run against the newly created entity                  only if previous state was pennding.
    * @param enduser_id  (required)
    * @param body  (optional)
   * @return InlineResponse20058
   */
  @RequestLine("PUT /v1/customer/endusers/{enduser_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20058 pUTV1CustomerEndusersEnduserId(@Param("enduser_id") String enduser_id, EndusersEnduserIdBody body);

  /**
   * Update ledger
   * Update ledger. Currently only change of metadata is supported.
    * @param ledger_id  (required)
    * @param body  (optional)
   * @return InlineResponse20076
   */
  @RequestLine("PUT /v1/customer/ledgers/{ledger_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20076 pUTV1CustomerLedgersLedgerId(@Param("ledger_id") String ledger_id, LedgersLedgerIdBody body);

  /**
   * Set product specific properties for Onfido-IDV-1.
   * 
    * @param body  (optional)
   */
  @RequestLine("PUT /v1/customer/my/products/Onfido-IDV-1")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pUTV1CustomerMyProductsOnfidoIDV1(ProductsOnfidoIDV1Body body);

  /**
   * Do not use, deprecated endpoint.
   * 
    * @param partner_product  (required)
    * @param body  (optional)
   */
  @RequestLine("PUT /v1/customer/my/products/{partner_product}")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pUTV1CustomerMyProductsPartnerProduct(@Param("partner_product") String partner_product, ProductsPartnerProductBody body);

  /**
   * Get quote for currency pair exchange
   * Get quote for currency pair exchange.
    * @param body  (optional)
   * @return InlineResponse20052
   */
  @RequestLine("PUT /v1/customer/transactions/fx/quote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20052 pUTV1CustomerTransactionsFxQuote(FxQuoteBody body);

  /**
   * Update existing transaction metadata
   * Update existing transaction metadata. Customer&#x27;s firewall will be run against the updated transaction                  only if previous state was missing-data.
    * @param transaction_id  (required)
    * @param body  (optional)
   * @return InlineResponse20070
   */
  @RequestLine("PUT /v1/customer/transactions/{transaction_id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20070 pUTV1CustomerTransactionsTransactionId(@Param("transaction_id") String transaction_id, TransactionsTransactionIdBody body);

}
