package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.InlineResponse20016;
import com.transfer_funds.BNKTransfer.model.InlineResponse20019;
import com.transfer_funds.BNKTransfer.model.InlineResponse20025;
import com.transfer_funds.BNKTransfer.model.InlineResponse20026;
import com.transfer_funds.BNKTransfer.model.InlineResponse2003;
import com.transfer_funds.BNKTransfer.model.InlineResponse20038;
import com.transfer_funds.BNKTransfer.model.InlineResponse20043;
import com.transfer_funds.BNKTransfer.model.InlineResponse20047;
import com.transfer_funds.BNKTransfer.model.InlineResponse20052;
import com.transfer_funds.BNKTransfer.model.InlineResponse20057;
import com.transfer_funds.BNKTransfer.model.InlineResponse20067;
import com.transfer_funds.BNKTransfer.model.InlineResponse20078;
import com.transfer_funds.BNKTransfer.model.VirtualaccountBalanceBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountConsumeraddBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountCreateBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountCurrentstatementBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountInfoBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountPaymentBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountSettledstatementBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountStatementBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountStatusblockBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountStatuscancelBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountStatusunblockBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountTransferBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface VirtualAccountsService {

  /**
   * Returns the current balance of a virtual account.
   * 
    * @param body A successful call returns the current balance of a virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20019
   */
  @RequestLine("POST /virtual-account/balance")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20019 postVirtualAccountBalance(VirtualaccountBalanceBody body, @Param("Signature") String Signature);

  /**
   * Assigns additional consumers to jointly own an already created consumer virtual account, specified by reference.
   * 
    * @param body A successful call assigns an additional consumer to an already created consumer virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20043
   */
  @RequestLine("POST /virtual-account/consumer-add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20043 postVirtualAccountConsumerAdd(VirtualaccountConsumeraddBody body, @Param("Signature") String Signature);

  /**
   * Creates a virtual account as either a corporate, or consumer account.
   * 
    * @param body A successful call creates an account belonging to a consumer within a corporate or directly to a corporate. To create a corporate account, the corporate_id of the desired corporate should be provided and the ch_client_code field should be left blank. In order to create a consumer account belonging to a consumer within a corporate, the corporate_id of the parent corporate and the ch_client_code should be provided. If no corporate_id is provided in either the creation of a corporate account or consumer account, the default corporate of the distributor will be assumed as the corporate owner of the virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20025
   */
  @RequestLine("POST /virtual-account/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20025 postVirtualAccountCreate(VirtualaccountCreateBody body, @Param("Signature") String Signature);

  /**
   * List all current and settled transactions for a given period together with the opening and closing balance for that period.
   * 
    * @param body A successful call returns a statement of current and settled account activity. (required)
    * @param Signature  (required)
   * @return InlineResponse20016
   */
  @RequestLine("POST /virtual-account/current-statement")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20016 postVirtualAccountCurrentStatement(VirtualaccountCurrentstatementBody body, @Param("Signature") String Signature);

  /**
   * Retrieves the account information and state of a virtual account.
   * 
    * @param body A successful call retrieves information on a virtual account and the account state. (required)
    * @param Signature  (required)
   * @return InlineResponse20047
   */
  @RequestLine("POST /virtual-account/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20047 postVirtualAccountInfo(VirtualaccountInfoBody body, @Param("Signature") String Signature);

  /**
   * Make outbound payments (to external accounts) for FPS and SEPA.
   * 
    * @param body A successful call makes an outbound payment. (required)
    * @param Signature  (required)
   * @return InlineResponse20057
   */
  @RequestLine("POST /virtual-account/payment")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20057 postVirtualAccountPayment(VirtualaccountPaymentBody body, @Param("Signature") String Signature);

  /**
   * List all settled transactions for a given period together with the opening and closing balance for that period.
   * 
    * @param body A successful call returns a statement of settled account activity. (required)
    * @param Signature  (required)
   * @return InlineResponse2003
   */
  @RequestLine("POST /virtual-account/settled-statement")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2003 postVirtualAccountSettledStatement(VirtualaccountSettledstatementBody body, @Param("Signature") String Signature);

  /**
   * Returns a list of all account activity for a given time window and/or a given number of transactions.
   * 
    * @param body A successful call returns a statement of all account activity. (required)
    * @param Signature  (required)
   * @return InlineResponse20067
   */
  @RequestLine("POST /virtual-account/statement")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20067 postVirtualAccountStatement(VirtualaccountStatementBody body, @Param("Signature") String Signature);

  /**
   * Temporarily blocks a virtual account from making and/or recieving payments.
   * 
    * @param body A successful call instates a block on an account to prevent the account making and/or recieving payments. Other functions can still be allowed depending on the block type selected. (required)
    * @param Signature  (required)
   * @return InlineResponse20038
   */
  @RequestLine("POST /virtual-account/status-block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20038 postVirtualAccountStatusBlock(VirtualaccountStatusblockBody body, @Param("Signature") String Signature);

  /**
   * Cancel a virtual account.
   * 
    * @param body A successful call cancels a virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20078
   */
  @RequestLine("POST /virtual-account/status-cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20078 postVirtualAccountStatusCancel(VirtualaccountStatuscancelBody body, @Param("Signature") String Signature);

  /**
   * Unblocks a blocked virtual account and sets the account status to active.
   * 
    * @param body A successful call sets the status of a blocked account to active (ACT). (required)
    * @param Signature  (required)
   * @return InlineResponse20052
   */
  @RequestLine("POST /virtual-account/status-unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20052 postVirtualAccountStatusUnblock(VirtualaccountStatusunblockBody body, @Param("Signature") String Signature);

  /**
   * Transfer funds between two accounts on platform where the accounts can be held by different companies.
   * 
    * @param body A successful call makes a transfer between two virtual accounts. (required)
    * @param Signature  (required)
   * @return InlineResponse20026
   */
  @RequestLine("POST /virtual-account/transfer")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20026 postVirtualAccountTransfer(VirtualaccountTransferBody body, @Param("Signature") String Signature);

}
