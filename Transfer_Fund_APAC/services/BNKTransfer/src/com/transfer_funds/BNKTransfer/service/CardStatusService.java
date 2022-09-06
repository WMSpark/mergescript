package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CardRenewBody;
import com.transfer_funds.BNKTransfer.model.CardStatusactivateBody;
import com.transfer_funds.BNKTransfer.model.CardStatusblockBody;
import com.transfer_funds.BNKTransfer.model.CardStatuscancelBody;
import com.transfer_funds.BNKTransfer.model.CardStatusdamagedBody;
import com.transfer_funds.BNKTransfer.model.CardStatuslostBody;
import com.transfer_funds.BNKTransfer.model.CardStatusstolenBody;
import com.transfer_funds.BNKTransfer.model.CardStatusunblockBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20021;
import com.transfer_funds.BNKTransfer.model.InlineResponse20024;
import com.transfer_funds.BNKTransfer.model.InlineResponse20035;
import com.transfer_funds.BNKTransfer.model.InlineResponse20063;
import com.transfer_funds.BNKTransfer.model.InlineResponse20065;
import com.transfer_funds.BNKTransfer.model.InlineResponse2007;
import com.transfer_funds.BNKTransfer.model.InlineResponse20073;
import com.transfer_funds.BNKTransfer.model.InlineResponse2009;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CardStatusService {

  /**
   * Renew a previously ordered card. A new delivery address can be provided as part of the renew request.
   * 
    * @param body A successful call renews a previously ordered card. (required)
    * @param Signature  (required)
   * @return InlineResponse2009
   */
  @RequestLine("POST /card/renew")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2009 postCardRenew(CardRenewBody body, @Param("Signature") String Signature);

  /**
   * Activates a previously ordered card, pn_card_order for details on how to order a card.
   * 
    * @param body A successful call activates a previously ordered card. (required)
    * @param Signature  (required)
   * @return InlineResponse20035
   */
  @RequestLine("POST /card/status-activate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20035 postCardStatusActivate(CardStatusactivateBody body, @Param("Signature") String Signature);

  /**
   * Blocks a card using the specified card_client_code, to identify the card.
   * 
    * @param body A successful call blocks a specified card. (required)
    * @param Signature  (required)
   * @return InlineResponse20063
   */
  @RequestLine("POST /card/status-block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20063 postCardStatusBlock(CardStatusblockBody body, @Param("Signature") String Signature);

  /**
   * Sets the status of a card on the platform to \&quot;CANCEL\&quot;.
   * 
    * @param body A successful call sets a status of a card to &quot;CANCEL&quot;. (required)
    * @param Signature  (required)
   * @return InlineResponse20073
   */
  @RequestLine("POST /card/status-cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20073 postCardStatusCancel(CardStatuscancelBody body, @Param("Signature") String Signature);

  /**
   * Sets the status of a card on the platform to \&quot;DAMAGED\&quot;.
   * 
    * @param body A successful call sets a status of a card to &quot;DAMAGED&quot;. (required)
    * @param Signature  (required)
   * @return InlineResponse2007
   */
  @RequestLine("POST /card/status-damaged")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2007 postCardStatusDamaged(CardStatusdamagedBody body, @Param("Signature") String Signature);

  /**
   * Sets the status of a card on the platform to \&quot;LOST\&quot;.
   * 
    * @param body A successful call sets a status of a card to &quot;LOST&quot;. (required)
    * @param Signature  (required)
   * @return InlineResponse20021
   */
  @RequestLine("POST /card/status-lost")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20021 postCardStatusLost(CardStatuslostBody body, @Param("Signature") String Signature);

  /**
   * Sets the status of a card on the platform to \&quot;STOLEN\&quot;.
   * 
    * @param body A successful call sets a status of a card to &quot;STOLEN&quot;. (required)
    * @param Signature  (required)
   * @return InlineResponse20065
   */
  @RequestLine("POST /card/status-stolen")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20065 postCardStatusStolen(CardStatusstolenBody body, @Param("Signature") String Signature);

  /**
   * Unblocks a card using the specified card_client_code, to identify the card.
   * 
    * @param body A successful call unblocks a specified card. (required)
    * @param Signature  (required)
   * @return InlineResponse20024
   */
  @RequestLine("POST /card/status-unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20024 postCardStatusUnblock(CardStatusunblockBody body, @Param("Signature") String Signature);

}
