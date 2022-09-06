package com.transfer_funds.RBSwagger.service;


import com.transfer_funds.RBSwagger.model.*;
import com.transfer_funds.RBSwagger.model.InlineResponse20039;
import com.transfer_funds.RBSwagger.model.InlineResponse20061;
import com.transfer_funds.RBSwagger.model.InlineResponse20071;
import com.transfer_funds.RBSwagger.model.LedgerIdIbanBody;
import com.transfer_funds.RBSwagger.model.ReceiveFullsimulationBody;
import com.transfer_funds.RBSwagger.model.TransactionsReceiveBody;
import com.transfer_funds.RBSwagger.model.WebhookTestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface DevtoolsCustomerService {

  /**
   * Add iban for specific ledger
   * 
    * @param ledger_id  (required)
    * @param body  (optional)
   * @return InlineResponse20071
   */
  @RequestLine("POST /dev/customer/ledgers/{ledger_id}/iban")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20071 pOSTDevCustomerLedgersLedgerIdIban(@Param("ledger_id") String ledger_id, LedgerIdIbanBody body);

  /**
   * Simulates crediting a ledger with funds for testing purposes
   * Simulates crediting a ledger with funds for testing purposes.
    * @param body  (optional)
   * @return InlineResponse20039
   */
  @RequestLine("POST /dev/customer/transactions/receive")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20039 pOSTDevCustomerTransactionsReceive(TransactionsReceiveBody body);

  /**
   * DEPRECATED! Use dev/customer/transactions/receive instead
   * DEPRECATED! Use dev/customer/transactions/receive instead.                             Simulates crediting a ledger with funds — for testing purposes.                             Only supports ExampleBank-EUR-1 product.
    * @param body  (optional)
   * @return InlineResponse20061
   */
  @RequestLine("POST /dev/customer/transactions/receive/fullsimulation")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  InlineResponse20061 pOSTDevCustomerTransactionsReceiveFullsimulation(ReceiveFullsimulationBody body);

  /**
   * This will send event over webhook with ledger id that you provided
   * This will send event over webhook with ledger id that you provided.
    * @param body  (optional)
   */
  @RequestLine("POST /dev/customer/webhook/test")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void pOSTDevCustomerWebhookTest(WebhookTestBody body);

}
