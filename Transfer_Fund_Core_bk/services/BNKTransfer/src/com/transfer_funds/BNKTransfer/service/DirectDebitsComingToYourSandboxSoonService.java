package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.DirectdebitRefundBody;
import com.transfer_funds.BNKTransfer.model.DirectdebitRefusalBody;
import com.transfer_funds.BNKTransfer.model.DirectdebitmandateActivateBody;
import com.transfer_funds.BNKTransfer.model.DirectdebitmandateBlockBody;
import com.transfer_funds.BNKTransfer.model.DirectdebitmandateSearchBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20023;
import com.transfer_funds.BNKTransfer.model.InlineResponse20037;
import com.transfer_funds.BNKTransfer.model.InlineResponse2006;
import com.transfer_funds.BNKTransfer.model.InlineResponse20066;
import com.transfer_funds.BNKTransfer.model.InlineResponse20076;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface DirectDebitsComingToYourSandboxSoonService {

  /**
   * Activates a direct debit mandate that has been blocked.
   * 
    * @param body A successful call activates a blocked direct debit. (required)
    * @param Signature  (required)
   * @return InlineResponse2006
   */
  @RequestLine("POST /direct-debit-mandate/activate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2006 postDirectDebitMandateActivate(DirectdebitmandateActivateBody body, @Param("Signature") String Signature);

  /**
   * Blocks a direct debit mandate, when a mandate is blocked all collection requests will be rejected.
   * 
    * @param body A successful call blocks a direct debit mandate. (required)
    * @param Signature  (required)
   * @return InlineResponse20066
   */
  @RequestLine("POST /direct-debit-mandate/block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20066 postDirectDebitMandateBlock(DirectdebitmandateBlockBody body, @Param("Signature") String Signature);

  /**
   * The mandate information for a funding account, can be requested for a client (corporate or consumer).
   * 
    * @param body A successful call retrieves mandate information for a client. (required)
    * @param Signature  (required)
   * @return InlineResponse20023
   */
  @RequestLine("POST /direct-debit-mandate/search")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20023 postDirectDebitMandateSearch(DirectdebitmandateSearchBody body, @Param("Signature") String Signature);

  /**
   * Request the refund of funds, collected by direct debit, up to 13 months after collection.
   * 
    * @param body A successful call requests a direct debit refund. (required)
    * @param Signature  (required)
   * @return InlineResponse20037
   */
  @RequestLine("POST /direct-debit/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20037 postDirectDebitRefund(DirectdebitRefundBody body, @Param("Signature") String Signature);

  /**
   * Refuse a direct debit collection request. A refusal must be recieved on the day before collection.
   * 
    * @param body A successful call refuses a direct debit collection. (required)
    * @param Signature  (required)
   * @return InlineResponse20076
   */
  @RequestLine("POST /direct-debit/refusal")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20076 postDirectDebitRefusal(DirectdebitRefusalBody body, @Param("Signature") String Signature);

}
