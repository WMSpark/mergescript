package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CorporateCreateBody;
import com.transfer_funds.BNKTransfer.model.CorporateInfoBody;
import com.transfer_funds.BNKTransfer.model.CorporateUpdateBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20012;
import com.transfer_funds.BNKTransfer.model.InlineResponse20015;
import com.transfer_funds.BNKTransfer.model.InlineResponse20036;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CorporatesService {

  /**
   * Creates a corporate
   * 
    * @param body A successful call returns the corporate_client_code of the new corporate (required)
    * @param Signature  (required)
   * @return InlineResponse20012
   */
  @RequestLine("POST /corporate/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20012 postCorporateCreate(CorporateCreateBody body, @Param("Signature") String Signature);

  /**
   * Retrieves the details of a corporate using the unique identifier corporate_client_code.
   * 
    * @param body A successful call retrieves full details for a corporate that is uniquely identified by the corporate_client_code. (required)
    * @param Signature  (required)
   * @return InlineResponse20015
   */
  @RequestLine("POST /corporate/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20015 postCorporateInfo(CorporateInfoBody body, @Param("Signature") String Signature);

  /**
   * Updates the active address of a corporate.
   * 
    * @param body A successful call updates the active address for a corporate that is uniquely identified by the corporate_client_code. (required)
    * @param Signature  (required)
   * @return InlineResponse20036
   */
  @RequestLine("POST /corporate/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20036 postCorporateUpdate(CorporateUpdateBody body, @Param("Signature") String Signature);

}
