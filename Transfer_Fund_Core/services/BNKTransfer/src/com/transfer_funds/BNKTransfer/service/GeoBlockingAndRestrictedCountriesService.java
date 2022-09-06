package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.CardCountryblockBody;
import com.transfer_funds.BNKTransfer.model.CardCountryinfoBody;
import com.transfer_funds.BNKTransfer.model.CardCountryunblockBody;
import com.transfer_funds.BNKTransfer.model.CardGeoprofileremoveBody;
import com.transfer_funds.BNKTransfer.model.CardGeoprofilesetBody;
import com.transfer_funds.BNKTransfer.model.GeoprofileCreateBody;
import com.transfer_funds.BNKTransfer.model.InlineResponse20013;
import com.transfer_funds.BNKTransfer.model.InlineResponse20053;
import com.transfer_funds.BNKTransfer.model.InlineResponse20054;
import com.transfer_funds.BNKTransfer.model.InlineResponse20056;
import com.transfer_funds.BNKTransfer.model.InlineResponse20069;
import com.transfer_funds.BNKTransfer.model.InlineResponse20075;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface GeoBlockingAndRestrictedCountriesService {

  /**
   * Allows a user/distributor to block a list of countries, preventing any card transactions in the country list
   * 
    * @param body A successful call allows a user/distributor to block a list of countries, preventing any card transactions in the country list (required)
    * @param Signature  (required)
   * @return InlineResponse20069
   */
  @RequestLine("POST /card/country-block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20069 postCardCountryBlock(CardCountryblockBody body, @Param("Signature") String Signature);

  /**
   * Return the block, active and restricted status for all countries for a card.
   * 
    * @param body A successful call return the block, active and restricted status for all countries for a card. (required)
    * @param Signature  (required)
   * @return InlineResponse20075
   */
  @RequestLine("POST /card/country-info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20075 postCardCountryInfo(CardCountryinfoBody body, @Param("Signature") String Signature);

  /**
   * Allows a user/distributor to unblock a list countries, enabling card payments in these countries if they are not on the restricted list.
   * 
    * @param body A successful call allows a user/distributor to unblock a list countries, enabling card payments in these countries if they are not on the restricted list. (required)
    * @param Signature  (required)
   * @return InlineResponse20056
   */
  @RequestLine("POST /card/country-unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20056 postCardCountryUnblock(CardCountryunblockBody body, @Param("Signature") String Signature);

  /**
   * Remove a restricted region from a card
   * 
    * @param body A successful call remove a restricted region from a card (required)
    * @param Signature  (required)
   * @return InlineResponse20013
   */
  @RequestLine("POST /card/geo-profile-remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20013 postCardGeoProfileRemove(CardGeoprofileremoveBody body, @Param("Signature") String Signature);

  /**
   * Link a restricted region to a card.
   * 
    * @param body A successful call link a restricted region to a card. (required)
    * @param Signature  (required)
   * @return InlineResponse20054
   */
  @RequestLine("POST /card/geo-profile-set")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20054 postCardGeoProfileSet(CardGeoprofilesetBody body, @Param("Signature") String Signature);

  /**
   * Used to create a restricted region
   * 
    * @param body A successful call create a restricted region (required)
    * @param Signature  (required)
   * @return InlineResponse20053
   */
  @RequestLine("POST /geo-profile/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20053 postGeoProfileCreate(GeoprofileCreateBody body, @Param("Signature") String Signature);

}
