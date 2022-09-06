package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.ConsumerAccountlistBody;
import com.transfer_funds.BNKTransfer.model.ConsumerCreateBody;
import com.transfer_funds.BNKTransfer.model.ConsumerInfoBody;
import com.transfer_funds.BNKTransfer.model.ConsumerUpdateBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse2002;
import com.transfer_funds.BNKTransfer.model.InlineResponse20020;
import com.transfer_funds.BNKTransfer.model.InlineResponse20049;
import com.transfer_funds.BNKTransfer.model.InlineResponse20060;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ConsumerService {

  /**
   * Retrieves the account information and status of all virtual accounts linked to a consumer.
   * 
    * @param body A successful call retrieves all virtual accounts linked to a consumer. (required)
    * @param Signature  (required)
   * @return InlineResponse20060
   */
  @RequestLine("POST /consumer/account-list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20060 postConsumerAccountList(ConsumerAccountlistBody body, @Param("Signature") String Signature);

  /**
   * Create a consumer that can be linked to a card or a virtual account using the ch_client_code returned in the response message if a consumer has successfully been created.
   * 
    * @param body A successful call creates a consumer and reutrns ch_client_code. (required)
    * @param Signature  (required)
   * @return InlineResponse2002
   */
  @RequestLine("POST /consumer/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2002 postConsumerCreate(ConsumerCreateBody body, @Param("Signature") String Signature);

  /**
   * Retrieves a consumer&#x27;s details.
   * 
    * @param body A successful call retrieves all the details about a consumer. (required)
    * @param Signature  (required)
   * @return InlineResponse20020
   */
  @RequestLine("POST /consumer/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20020 postConsumerInfo(ConsumerInfoBody body, @Param("Signature") String Signature);

  /**
   * Updates or changes a consumer&#x27;s details using ch_client_code.
   * 
    * @param body A successful call updates a consumer. (required)
    * @param Signature  (required)
   * @return InlineResponse20049
   */
  @RequestLine("POST /consumer/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20049 postConsumerUpdate(ConsumerUpdateBody body, @Param("Signature") String Signature);

}
