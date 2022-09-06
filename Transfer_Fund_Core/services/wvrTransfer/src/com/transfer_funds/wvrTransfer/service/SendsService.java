package com.transfer_funds.wvrTransfer.service;


import com.transfer_funds.wvrTransfer.model.*;
import com.transfer_funds.wvrTransfer.model.Error;
import com.transfer_funds.wvrTransfer.model.InlineResponse2008;
import com.transfer_funds.wvrTransfer.model.InlineResponse40914;
import com.transfer_funds.wvrTransfer.model.Send;
import com.transfer_funds.wvrTransfer.model.SendsBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface SendsService {

  /**
   * Create send transaction
   * Sends funds between managed accounts and managed cards belonging to *different* corporate or consumer identities.  The Send Profile (configured in the Multi Portal) specified determines the behaviour and restrictions of the transaction (for example, fees). 
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return Send
   */
  @RequestLine("POST /sends")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  Send sendCreate(SendsBody body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get send transaction
   * Retrieve the send transaction identified by the &#x60;id&#x60; path parameter.
    * @param id The unique identifier of the Send transaction. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return Send
   */
  @RequestLine("GET /sends/{id}")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  Send sendGet(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get send transactions
   * Retrieves all the send transactions performed by the logged-in identity.
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
    * @param paging The offset and number of results to return. Leave out to fetch the first page of results. (optional)
    * @param profileId Filter by the Send profile. Leave out to fetch all entries. (optional)
    * @param instrumentId Filter by the source instrument id. (optional)
    * @param state Filter by the Send transaction state. Leave out to fetch all states. (optional)
    * @param createdFrom Filter for send transactions created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all Send transactions. (optional)
    * @param createdTo Filter for send transactions created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all Send transactions. (optional)
    * @param tag Filter by the send tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all entries. (optional)
   * @return InlineResponse2008
   */
  @RequestLine("GET /sends?paging={paging}&profileId={profileId}&instrumentId={instrumentId}&state={state}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  InlineResponse2008 sendsGet(@Param("idempotency_ref") String idempotency_ref, @Param("paging") Object paging, @Param("profileId") String profileId, @Param("instrumentId") Object instrumentId, @Param("state") List state, @Param("createdFrom") Long createdFrom, @Param("createdTo") Long createdTo, @Param("tag") String tag);


    /**
     * Get send transactions
     * Retrieves all the send transactions performed by the logged-in identity.
     * Note, this is equivalent to the other <code>sendsGet</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link SendsGetQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>paging - The offset and number of results to return. Leave out to fetch the first page of results. (optional)</li>
     *   <li>profileId - Filter by the Send profile. Leave out to fetch all entries. (optional)</li>
     *   <li>instrumentId - Filter by the source instrument id. (optional)</li>
     *   <li>state - Filter by the Send transaction state. Leave out to fetch all states. (optional)</li>
     *   <li>createdFrom - Filter for send transactions created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all Send transactions. (optional)</li>
     *   <li>createdTo - Filter for send transactions created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all Send transactions. (optional)</li>
     *   <li>tag - Filter by the send tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all entries. (optional)</li>
     *   </ul>
     * @return InlineResponse2008
     */
    @RequestLine("GET /sends?paging={paging}&profileId={profileId}&instrumentId={instrumentId}&state={state}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
    @Headers({
    "Accept: application/json",
        "idempotency-ref: {idempotency_ref}"    })
    InlineResponse2008 sendsGet
    (@Param("idempotency_ref") String idempotency_ref, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
