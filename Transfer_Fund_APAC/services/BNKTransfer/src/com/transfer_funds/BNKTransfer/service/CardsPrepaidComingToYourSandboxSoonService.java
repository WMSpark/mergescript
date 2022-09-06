package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CardDischargeBody;
import com.transfer_funds.BNKTransfer.model.CardLoadBody;
import com.transfer_funds.BNKTransfer.model.CardRefundBody;
import com.transfer_funds.BNKTransfer.model.CardUnloadBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20010;
import com.transfer_funds.BNKTransfer.model.InlineResponse20014;
import com.transfer_funds.BNKTransfer.model.InlineResponse20027;
import com.transfer_funds.BNKTransfer.model.InlineResponse2004;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CardsPrepaidComingToYourSandboxSoonService {

  /**
   * Discharge funds from an unavailable card, this adjustment unload will succeed when the card isin an unavailable status (âLOSâ, âSTOâ, âCANâ, âEXPâ). Do not use for operational unload as some security features are disabled.
   * 
    * @param body A successful call discharge funds from an unavailable card (required)
    * @param Signature  (required)
   * @return InlineResponse2004
   */
  @RequestLine("POST /card/discharge")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2004 postCardDischarge(CardDischargeBody body, @Param("Signature") String Signature);

  /**
   * Load funds to a specified card from the specified account.
   * 
    * @param body A successful call load fund to a specified card from the specified account. (required)
    * @param Signature  (required)
   * @return InlineResponse20010
   */
  @RequestLine("POST /card/load")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20010 postCardLoad(CardLoadBody body, @Param("Signature") String Signature);

  /**
   * Request a fee reimbursement, this adjustment load will not increase the load limit, and no processor load fees will be taken.
   * 
    * @param body A successful call request a fee reimbursement. (required)
    * @param Signature  (required)
   * @return InlineResponse20014
   */
  @RequestLine("POST /card/refund")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20014 postCardRefund(CardRefundBody body, @Param("Signature") String Signature);

  /**
   * Unload funds from the specified card to the specified account.
   * 
    * @param body A successful call unload funds from the specified card to the specified account. (required)
    * @param Signature  (required)
   * @return InlineResponse20027
   */
  @RequestLine("POST /card/unload")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20027 postCardUnload(CardUnloadBody body, @Param("Signature") String Signature);

}
