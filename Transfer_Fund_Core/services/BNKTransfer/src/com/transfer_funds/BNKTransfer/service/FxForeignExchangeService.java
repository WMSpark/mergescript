package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.FxCardtransparencyinfoBody;
import com.transfer_funds.BNKTransfer.model.FxExchangeBody;
import com.transfer_funds.BNKTransfer.model.FxIndicativequoteBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20018;
import com.transfer_funds.BNKTransfer.model.InlineResponse20032;
import com.transfer_funds.BNKTransfer.model.InlineResponse20062;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface FxForeignExchangeService {

  /**
   * Reports FX transparency information for an FX exchange on the card scheme.
   * 
    * @param body A successful call reports FX transparency information for an FX exchange on the card scheme. (required)
    * @param Signature  (required)
   * @return InlineResponse20032
   */
  @RequestLine("POST /fx/card-transparency-info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20032 postFxCardTransparencyInfo(FxCardtransparencyinfoBody body, @Param("Signature") String Signature);

  /**
   * Exchange an amount of a currency from sell side virtual account to the currency of the buy side virtual account.
   * 
    * @param body A successful call exchange an amount of a currency from sell side virtual account to the currency of the buy side virtual account. (required)
    * @param Signature  (required)
   * @return InlineResponse20062
   */
  @RequestLine("POST /fx/exchange")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20062 postFxExchange(FxExchangeBody body, @Param("Signature") String Signature);

  /**
   * Reports the indicative value of the fx exchange rate.
   * 
    * @param body A successful call reports the indicative value of the fx exchange rate. (required)
    * @param Signature  (required)
   * @return InlineResponse20018
   */
  @RequestLine("POST /fx/indicative-quote")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20018 postFxIndicativeQuote(FxIndicativequoteBody body, @Param("Signature") String Signature);

}
