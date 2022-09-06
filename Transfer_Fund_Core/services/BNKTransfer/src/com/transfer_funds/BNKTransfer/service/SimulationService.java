package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.InlineResponse2001;
import com.transfer_funds.BNKTransfer.model.InlineResponse20031;
import com.transfer_funds.BNKTransfer.model.InlineResponse404;
import com.transfer_funds.BNKTransfer.model.TestCardauthorizationBody;
import com.transfer_funds.BNKTransfer.model.TestInboundpaymentBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface SimulationService {

  /**
   * Simulates a marqeta cards basic authorization.
   * 
    * @param body A successful call creates a transaction with status pending and returns transaction token. (required)
    * @param Signature  (required)
   * @return InlineResponse20031
   */
  @RequestLine("POST /test/card-authorization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20031 postTestCardAuthorization(TestCardauthorizationBody body, @Param("Signature") String Signature);

  /**
   * Simulates a SWIFT Inbound-Payment and credits the funds into the account in relation to provided IBAN.
   * 
    * @param body A successful call credits the funds to the account related to the provided IBAN and returns the related Payment Id. (required)
    * @param Signature  (required)
   * @return InlineResponse2001
   */
  @RequestLine("POST /test/inbound-payment")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2001 postTestInboundPayment(TestInboundpaymentBody body, @Param("Signature") String Signature);

}
