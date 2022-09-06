package com.transfer_funds.BNKTransfer.service;


import com.transfer_funds.BNKTransfer.model.*;
import com.transfer_funds.BNKTransfer.model.InlineResponse20030;
import com.transfer_funds.BNKTransfer.model.InlineResponse20033;
import com.transfer_funds.BNKTransfer.model.InlineResponse20045;
import com.transfer_funds.BNKTransfer.model.InlineResponse20051;
import com.transfer_funds.BNKTransfer.model.InlineResponse20059;
import com.transfer_funds.BNKTransfer.model.InlineResponse20074;
import com.transfer_funds.BNKTransfer.model.InlineResponse20079;
import com.transfer_funds.BNKTransfer.model.LimitUpdateBody;
import com.transfer_funds.BNKTransfer.model.ProfileCreateBody;
import com.transfer_funds.BNKTransfer.model.ProfileInfoBody;
import com.transfer_funds.BNKTransfer.model.ProfileUpdateBody;
import com.transfer_funds.BNKTransfer.model.RegionCreateBody;
import com.transfer_funds.BNKTransfer.model.RegionInfoBody;
import com.transfer_funds.BNKTransfer.model.VirtualaccountProfileapplyBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface LimitsService {

  /**
   * Update the existing spending limits for a card, account or card/account holder within the spending limit range of the associated limit profile.
   * 
    * @param body A successful call updates an existing spending limit profile. (required)
    * @param Signature  (required)
   * @return InlineResponse20033
   */
  @RequestLine("POST /limit/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20033 postLimitUpdate(LimitUpdateBody body, @Param("Signature") String Signature);

  /**
   * Create a spending limit profile on the platform.
   * 
    * @param body A successful call creates a spending limit profile. (required)
    * @param Signature  (required)
   * @return InlineResponse20059
   */
  @RequestLine("POST /profile/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20059 postProfileCreate(ProfileCreateBody body, @Param("Signature") String Signature);

  /**
   * Return the details of the specified profile (profile_code).
   * 
    * @param body A successful call returns details of a specified profile. (required)
    * @param Signature  (required)
   * @return InlineResponse20051
   */
  @RequestLine("POST /profile/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20051 postProfileInfo(ProfileInfoBody body, @Param("Signature") String Signature);

  /**
   * Update the spending limit rules of the limit profile. Updating a limit profile will automatically update the spending limits of all the cards, accounts and account holders associated with the profile. During a profile update, all accumulators are reset.
   * 
    * @param body A successful call updates a spending limit profile. (required)
    * @param Signature  (required)
   * @return InlineResponse20030
   */
  @RequestLine("POST /profile/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20030 postProfileUpdate(ProfileUpdateBody body, @Param("Signature") String Signature);

  /**
   * Create a region constraint based on the list of countries specified by their 2-letter ISO code.
   * 
    * @param body A successful call creates a region. (required)
    * @param Signature  (required)
   * @return InlineResponse20045
   */
  @RequestLine("POST /region/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20045 postRegionCreate(RegionCreateBody body, @Param("Signature") String Signature);

  /**
   * Retrieves the information of a previously created region, by region_name or region_code. NOTE: Using region_name may result in more than one set of region_information being returned.
   * 
    * @param body A successful call returns the information on a region. (required)
    * @param Signature  (required)
   * @return InlineResponse20074
   */
  @RequestLine("POST /region/info")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20074 postRegionInfo(RegionInfoBody body, @Param("Signature") String Signature);

  /**
   * Change the profile associated with a card holder or account. No changes are made to the profile during an upgrade. All accumulators are reset during an upgrade.
   * 
    * @param Signature  (required)
    * @param body A successful call changes the profile associated with an account or card holder. (optional)
   * @return InlineResponse20079
   */
  @RequestLine("POST /virtual-account/profile-apply")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Signature: {Signature}"  })
  InlineResponse20079 postVirtualAccountProfileApply(@Param("Signature") String Signature, VirtualaccountProfileapplyBody body);

}
