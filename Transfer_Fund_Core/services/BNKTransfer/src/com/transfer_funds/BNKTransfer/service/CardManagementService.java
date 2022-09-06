package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CardInfoBody;
import com.transfer_funds.BNKTransfer.model.CardOrderBody;
import com.transfer_funds.BNKTransfer.model.CardPininfolinkBody;
import com.transfer_funds.BNKTransfer.model.CardPininfosmsBody;
import com.transfer_funds.BNKTransfer.model.CardStatusinfoBody;
import com.transfer_funds.BNKTransfer.model.CardUpdateBody;
import com.transfer_funds.BNKTransfer.model.CardholderInfoBody;
import com.transfer_funds.BNKTransfer.model.CardholderUpdateBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse200;
import com.transfer_funds.BNKTransfer.model.InlineResponse20011;
import com.transfer_funds.BNKTransfer.model.InlineResponse20034;
import com.transfer_funds.BNKTransfer.model.InlineResponse20039;
import com.transfer_funds.BNKTransfer.model.InlineResponse20042;
import com.transfer_funds.BNKTransfer.model.InlineResponse2005;
import com.transfer_funds.BNKTransfer.model.InlineResponse20050;
import com.transfer_funds.BNKTransfer.model.InlineResponse20070;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CardManagementService {

  /**
   * Returns the cards, fees and limits associated with a card holder.
   * 
    * @param body A successful call retrieves all the details associated with a card holder. (required)
    * @param Signature  (required)
   * @return InlineResponse200
   */
  @RequestLine("POST /card-holder/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse200 postCardHolderInfo(CardholderInfoBody body, @Param("Signature") String Signature);

  /**
   * Updates the card and client information for a specified card holder.
   * 
    * @param body A successful call updates a cardholder. (required)
    * @param Signature  (required)
   * @return InlineResponse20050
   */
  @RequestLine("POST /card-holder/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20050 postCardHolderUpdate(CardholderUpdateBody body, @Param("Signature") String Signature);

  /**
   * Retrieve the detailed information relating to a specific card.
   * 
    * @param body A successful call retrieves card information. (required)
    * @param Signature  (required)
   * @return InlineResponse20042
   */
  @RequestLine("POST /card/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20042 postCardInfo(CardInfoBody body, @Param("Signature") String Signature);

  /**
   * Order a new card. The response will return the unique reference of the new card if the order was successful. Use pn_card_activate to activate the new card.
   * 
    * @param body A successful call orders a new card (required)
    * @param Signature  (required)
   * @return InlineResponse20070
   */
  @RequestLine("POST /card/order")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20070 postCardOrder(CardOrderBody body, @Param("Signature") String Signature);

  /**
   * Provides a secured link to deliver virtual card details for a specific Ipv4 IP.
   * 
    * @param body A successful call provides a secure link. (required)
    * @param Signature  (required)
   * @return InlineResponse20039
   */
  @RequestLine("POST /card/pin-info-link")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20039 postCardPinInfoLink(CardPininfolinkBody body, @Param("Signature") String Signature);

  /**
   * Retrieves the unencrypted \&quot;PIN code\&quot; via SMS to the specified mobile number. If no number is sent, the message would be sent to the card holder mobile registered at creation time.
   * 
    * @param body A successful call retrieves an unencrypted PIN code via SMS. (required)
    * @param Signature  (required)
   * @return InlineResponse2005
   */
  @RequestLine("POST /card/pin-info-sms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2005 postCardPinInfoSms(CardPininfosmsBody body, @Param("Signature") String Signature);

  /**
   * This API is available only for FIS processing. Returns the status of the card after a status refresh from the processor.
   * 
    * @param body A successful call returns the status of the card (required)
    * @param Signature  (required)
   * @return InlineResponse20034
   */
  @RequestLine("POST /card/status-info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20034 postCardStatusInfo(CardStatusinfoBody body, @Param("Signature") String Signature);

  /**
   * Allows cardholders to update the parameters of the card.
   * 
    * @param body A successful call updates a card (required)
    * @param Signature  (required)
   * @return InlineResponse20011
   */
  @RequestLine("POST /card/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20011 postCardUpdate(CardUpdateBody body, @Param("Signature") String Signature);

}
