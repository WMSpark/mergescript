package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CorporateAccountlistBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface CorporateService {

  /**
   * Retrieves the account information and status of all virtual accounts linked to a corporate.
   * 
    * @param body A successful call retrieves all virtual accounts linked to a corporate. (required)
    * @param Signature  (required)
   * @return InlineResponse20022
   */
  @RequestLine("POST /corporate/account-list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20022 postCorporateAccountList(CorporateAccountlistBody body, @Param("Signature") String Signature);

}
