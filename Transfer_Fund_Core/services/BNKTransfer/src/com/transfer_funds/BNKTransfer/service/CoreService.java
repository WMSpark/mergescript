package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CoreStatusBody;
import com.transfer_funds.BNKTransfer.model.CoreTransaccheckBody;
import com.transfer_funds.BNKTransfer.model.CoreTransacclearBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20017;
import com.transfer_funds.BNKTransfer.model.InlineResponse20055;
import com.transfer_funds.BNKTransfer.model.InlineResponse2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CoreService {

  /**
   * Allows clients to verify the API availability, it does not provide status for the services behind the API. If the API is available, the response will be returned. If it is unavailable, the call will timeout.
   * 
    * @param body A successful call verifies API availability. (required)
    * @param Signature  (required)
   * @return InlineResponse20017
   */
  @RequestLine("POST /core/status")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20017 postCoreStatus(CoreStatusBody body, @Param("Signature") String Signature);

  /**
   * Retrieves the request and response of a client transaction based on a previous unique client_transac_id of the transaction.
   * 
    * @param body A successful call retrieves a client transaction request and response. (required)
    * @param Signature  (required)
   * @return InlineResponse2008
   */
  @RequestLine("POST /core/transac-check")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse2008 postCoreTransacCheck(CoreTransaccheckBody body, @Param("Signature") String Signature);

  /**
   * For each call to the Bankable API, a client can optionally include a client_transac_id to uniquely identify the API call being made. Should you wish to reuse a client_transac_id, you will need to clear it as these IDs are unique and duplicates will be rejected.
   * 
    * @param body A successful call clears a client_transac_id in order for it to be reused. (required)
    * @param Signature  (required)
   * @return InlineResponse20055
   */
  @RequestLine("POST /core/transac-clear")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20055 postCoreTransacClear(CoreTransacclearBody body, @Param("Signature") String Signature);

}
