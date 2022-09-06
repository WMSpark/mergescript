package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.IbanAccountlistBody;
import com.transfer_funds.BNKTransfer.model.IbanConsumeraddBody;
import com.transfer_funds.BNKTransfer.model.IbanCurrencyaddBody;
import com.transfer_funds.BNKTransfer.model.IbanProfileupgradeBody;
import com.transfer_funds.BNKTransfer.model.IbanStatusblockBody;
import com.transfer_funds.BNKTransfer.model.IbanStatuscancelBody;
import com.transfer_funds.BNKTransfer.model.IbanStatusunblockBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20028;
import com.transfer_funds.BNKTransfer.model.InlineResponse20041;
import com.transfer_funds.BNKTransfer.model.InlineResponse20044;
import com.transfer_funds.BNKTransfer.model.InlineResponse20046;
import com.transfer_funds.BNKTransfer.model.InlineResponse20048;
import com.transfer_funds.BNKTransfer.model.InlineResponse20058;
import com.transfer_funds.BNKTransfer.model.InlineResponse20077;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface IbanManagementService {

  /**
   * Retrieves the account information and status of all virtual accounts linked to an IBAN.
   * 
    * @param body A successful call retrieves all information related to all virtual accounts linked to a specific IBAN. (required)
    * @param Signature  (required)
   * @return InlineResponse20046
   */
  @RequestLine("POST /iban/account-list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20046 postIbanAccountList(IbanAccountlistBody body, @Param("Signature") String Signature);

  /**
   * Assigns additional consumers to jointly own an already created virtual account, specified by IBAN.
   * 
    * @param body A successful call assigns an additional consumer to an already created virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20077
   */
  @RequestLine("POST /iban/consumer-add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20077 postIbanConsumerAdd(IbanConsumeraddBody body, @Param("Signature") String Signature);

  /**
   * Adds an authorised currency to an existing IBAN.
   * 
    * @param body A successful call adds an authorised currency to an existing IBAN. (required)
    * @param Signature  (required)
   * @return InlineResponse20058
   */
  @RequestLine("POST /iban/currency-add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20058 postIbanCurrencyAdd(IbanCurrencyaddBody body, @Param("Signature") String Signature);

  /**
   * Changes the profile associated with a multicurrency account (specified by IBAN). No changes are made to the profile during an upgrade.
   * 
    * @param body A successful call updates the profile associated with the multicurrency account. (required)
    * @param Signature  (required)
   * @return InlineResponse20028
   */
  @RequestLine("POST /iban/profile-upgrade")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20028 postIbanProfileUpgrade(IbanProfileupgradeBody body, @Param("Signature") String Signature);

  /**
   * Blocks a set of virtual accounts by BIC/IBAN and prevents them from being able to send/receive payments. Other functions are still allowed, based on the block type selected (i.e. BLI - BLO - BLK).
   * 
    * @param body A successful call blocks a set of virtual accounts by BIC/IBAN. (required)
    * @param Signature  (required)
   * @return InlineResponse20044
   */
  @RequestLine("POST /iban/status-block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20044 postIbanStatusBlock(IbanStatusblockBody body, @Param("Signature") String Signature);

  /**
   * Cancels a set of virtual accounts by BIC/IBAN and prevents them from being able to send/receive payments permanently. No further functions will be allowed on these accounts.
   * 
    * @param body A successful call cancels a set of virtual accounts by BIC/IBAN. (required)
    * @param Signature  (required)
   * @return InlineResponse20041
   */
  @RequestLine("POST /iban/status-cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20041 postIbanStatusCancel(IbanStatuscancelBody body, @Param("Signature") String Signature);

  /**
   * Unblocks a set of virtual accounts by BIC/IBAN and allows them to be able to send/receive payments. Other functions are still allowed, based on the block type selected (i.e. BLI - BLO - BLK).
   * 
    * @param body A successful call unblocks a set of virtual accounts by BIC/IBAN. (required)
    * @param Signature  (required)
   * @return InlineResponse20048
   */
  @RequestLine("POST /iban/status-unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20048 postIbanStatusUnblock(IbanStatusunblockBody body, @Param("Signature") String Signature);

}
