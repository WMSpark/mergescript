package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CardBalanceBody;
import com.transfer_funds.BNKTransfer.model.CardFeeBody;
import com.transfer_funds.BNKTransfer.model.CardStatementBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20029;
import com.transfer_funds.BNKTransfer.model.InlineResponse20040;
import com.transfer_funds.BNKTransfer.model.InlineResponse20071;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CardFinancialService {

  /**
   * Returns the balance information of an active card.
   * 
    * @param body A successful call returns the balance information of an active card. (required)
    * @param Signature  (required)
   * @return InlineResponse20071
   */
  @RequestLine("POST /card/balance")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20071 postCardBalance(CardBalanceBody body, @Param("Signature") String Signature);

  /**
   * Applies a fee to a card account. The fee is credited to the specified virtual accountand the card account is debited. Fees will only be charged to the card account if the balance of the card account is sufficient. The endpoint allows the caller to a reason/description for the fee.
   * 
    * @param body A successful call applies a fee to a card account (required)
    * @param Signature  (required)
   * @return InlineResponse20029
   */
  @RequestLine("POST /card/fee")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20029 postCardFee(CardFeeBody body, @Param("Signature") String Signature);

  /**
   * Returns the transaction information for a card.
   * 
    * @param body A successful call returns the transaction information for a card. (required)
    * @param Signature  (required)
   * @return InlineResponse20040
   */
  @RequestLine("POST /card/statement")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20040 postCardStatement(CardStatementBody body, @Param("Signature") String Signature);

}
