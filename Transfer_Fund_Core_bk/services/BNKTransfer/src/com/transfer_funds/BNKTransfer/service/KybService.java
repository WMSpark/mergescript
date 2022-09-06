package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CorporateKybupdateBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20061;
import com.transfer_funds.BNKTransfer.model.InlineResponse20064;
import com.transfer_funds.BNKTransfer.model.InlineResponse20068;
import com.transfer_funds.BNKTransfer.model.InlineResponse20072;
import com.transfer_funds.BNKTransfer.model.SuspendedpaymentInfoBody;
import com.transfer_funds.BNKTransfer.model.SuspendedpaymentReleaseBody;
import com.transfer_funds.BNKTransfer.model.SuspendedpaymentReturnBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface KybService {

  /**
   * Set a corporates KYB status and risk level on the Bankable platform.
   * 
    * @param body A successful call set a corporates KYB status and risk level on the Bankable platform. (required)
    * @param Signature  (required)
   * @return InlineResponse20061
   */
  @RequestLine("POST /corporate/kyb-update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20061 postCorporateKybUpdate(CorporateKybupdateBody body, @Param("Signature") String Signature);

  /**
   * Retrieve a list of all inbound payments for a distributor that have been suspended for reasons such as - a KYB breach.
   * 
    * @param body A successful call retrieve a list of all inbound payments for a distributor that have been suspended for reasons such as - a KYB breach. (required)
    * @param Signature  (required)
   * @return InlineResponse20072
   */
  @RequestLine("POST /suspended-payment/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20072 postSuspendedPaymentInfo(SuspendedpaymentInfoBody body, @Param("Signature") String Signature);

  /**
   * Release inbound payments, which have  been  suspended  due  to  KYB  reasons, back to specified destination account.
   * 
    * @param body A successful call release inbound payments, which have  been  suspended  due  to  KYB  reasons, back to specified destination account. (required)
    * @param Signature  (required)
   * @return InlineResponse20068
   */
  @RequestLine("POST /suspended-payment/release")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20068 postSuspendedPaymentRelease(SuspendedpaymentReleaseBody body, @Param("Signature") String Signature);

  /**
   * Return inbound payments, which have been suspended due to KYB reasons, back to a physical address on the scheme that they originated from or an account specified by the originator
   * 
    * @param body A successful call return inbound payments, which have been suspended due to KYB reasons, back to a physical address on the scheme that they originated from or an account specified by the originator (required)
    * @param Signature  (required)
   * @return InlineResponse20064
   */
  @RequestLine("POST /suspended-payment/return")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20064 postSuspendedPaymentReturn(SuspendedpaymentReturnBody body, @Param("Signature") String Signature);

}
