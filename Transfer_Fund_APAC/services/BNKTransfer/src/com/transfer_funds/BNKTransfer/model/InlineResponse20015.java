/*
 * Bankable API
 * Bankable API description
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.BNKTransfer.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.transfer_funds.BNKTransfer.model.InlineResponse20015Addresses;
import com.transfer_funds.BNKTransfer.model.InlineResponse20015KybInfo;
import com.transfer_funds.BNKTransfer.model.InlineResponse20015SubCorporates;
import com.transfer_funds.BNKTransfer.model.InlineResponse20015VirtualAccounts;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20015
 */

public class InlineResponse20015 {
  @JsonProperty("parent_corporate")
  private Object parent_corporate = null;

  @JsonProperty("request")
  private String request = null;

  @JsonProperty("transac_id")
  private String transac_id = null;

  @JsonProperty("addresses")
  private List<InlineResponse20015Addresses> addresses = null;

  @JsonProperty("corporate_name")
  private String corporate_name = null;

  @JsonProperty("sub_corporates")
  private List<InlineResponse20015SubCorporates> sub_corporates = null;

  @JsonProperty("corporate_families")
  private String corporate_families = null;

  @JsonProperty("entity_id")
  private String entity_id = null;

  @JsonProperty("virtual_accounts")
  private List<InlineResponse20015VirtualAccounts> virtual_accounts = null;

  @JsonProperty("kyb_info")
  private InlineResponse20015KybInfo kyb_info = null;

  public InlineResponse20015 parent_corporate(Object parent_corporate) {
    this.parent_corporate = parent_corporate;
    return this;
  }

   /**
   * Get parent_corporate
   * @return parent_corporate
  **/
  public Object getParentCorporate() {
    return parent_corporate;
  }

  public void setParentCorporate(Object parent_corporate) {
    this.parent_corporate = parent_corporate;
  }

  public InlineResponse20015 request(String request) {
    this.request = request;
    return this;
  }

   /**
   * The command that was requested
   * @return request
  **/
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public InlineResponse20015 transac_id(String transac_id) {
    this.transac_id = transac_id;
    return this;
  }

   /**
   * Unique id of the request
   * @return transac_id
  **/
  public String getTransacId() {
    return transac_id;
  }

  public void setTransacId(String transac_id) {
    this.transac_id = transac_id;
  }

  public InlineResponse20015 addresses(List<InlineResponse20015Addresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public InlineResponse20015 addAddressesItem(InlineResponse20015Addresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  public List<InlineResponse20015Addresses> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<InlineResponse20015Addresses> addresses) {
    this.addresses = addresses;
  }

  public InlineResponse20015 corporate_name(String corporate_name) {
    this.corporate_name = corporate_name;
    return this;
  }

   /**
   * Corporate name
   * @return corporate_name
  **/
  public String getCorporateName() {
    return corporate_name;
  }

  public void setCorporateName(String corporate_name) {
    this.corporate_name = corporate_name;
  }

  public InlineResponse20015 sub_corporates(List<InlineResponse20015SubCorporates> sub_corporates) {
    this.sub_corporates = sub_corporates;
    return this;
  }

  public InlineResponse20015 addSubCorporatesItem(InlineResponse20015SubCorporates sub_corporatesItem) {
    if (this.sub_corporates == null) {
      this.sub_corporates = new ArrayList<>();
    }
    this.sub_corporates.add(sub_corporatesItem);
    return this;
  }

   /**
   * Get sub_corporates
   * @return sub_corporates
  **/
  public List<InlineResponse20015SubCorporates> getSubCorporates() {
    return sub_corporates;
  }

  public void setSubCorporates(List<InlineResponse20015SubCorporates> sub_corporates) {
    this.sub_corporates = sub_corporates;
  }

  public InlineResponse20015 corporate_families(String corporate_families) {
    this.corporate_families = corporate_families;
    return this;
  }

   /**
   * Identifier for corporate hierarchies, under which a family of corporates has been created.
   * @return corporate_families
  **/
  public String getCorporateFamilies() {
    return corporate_families;
  }

  public void setCorporateFamilies(String corporate_families) {
    this.corporate_families = corporate_families;
  }

  public InlineResponse20015 entity_id(String entity_id) {
    this.entity_id = entity_id;
    return this;
  }

   /**
   * Identity of the client
   * @return entity_id
  **/
  public String getEntityId() {
    return entity_id;
  }

  public void setEntityId(String entity_id) {
    this.entity_id = entity_id;
  }

  public InlineResponse20015 virtual_accounts(List<InlineResponse20015VirtualAccounts> virtual_accounts) {
    this.virtual_accounts = virtual_accounts;
    return this;
  }

  public InlineResponse20015 addVirtualAccountsItem(InlineResponse20015VirtualAccounts virtual_accountsItem) {
    if (this.virtual_accounts == null) {
      this.virtual_accounts = new ArrayList<>();
    }
    this.virtual_accounts.add(virtual_accountsItem);
    return this;
  }

   /**
   * Get virtual_accounts
   * @return virtual_accounts
  **/
  public List<InlineResponse20015VirtualAccounts> getVirtualAccounts() {
    return virtual_accounts;
  }

  public void setVirtualAccounts(List<InlineResponse20015VirtualAccounts> virtual_accounts) {
    this.virtual_accounts = virtual_accounts;
  }

  public InlineResponse20015 kyb_info(InlineResponse20015KybInfo kyb_info) {
    this.kyb_info = kyb_info;
    return this;
  }

   /**
   * Get kyb_info
   * @return kyb_info
  **/
  public InlineResponse20015KybInfo getKybInfo() {
    return kyb_info;
  }

  public void setKybInfo(InlineResponse20015KybInfo kyb_info) {
    this.kyb_info = kyb_info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inline_response_200_15 = (InlineResponse20015) o;
    return Objects.equals(this.parent_corporate, inline_response_200_15.parent_corporate) &&
        Objects.equals(this.request, inline_response_200_15.request) &&
        Objects.equals(this.transac_id, inline_response_200_15.transac_id) &&
        Objects.equals(this.addresses, inline_response_200_15.addresses) &&
        Objects.equals(this.corporate_name, inline_response_200_15.corporate_name) &&
        Objects.equals(this.sub_corporates, inline_response_200_15.sub_corporates) &&
        Objects.equals(this.corporate_families, inline_response_200_15.corporate_families) &&
        Objects.equals(this.entity_id, inline_response_200_15.entity_id) &&
        Objects.equals(this.virtual_accounts, inline_response_200_15.virtual_accounts) &&
        Objects.equals(this.kyb_info, inline_response_200_15.kyb_info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent_corporate, request, transac_id, addresses, corporate_name, sub_corporates, corporate_families, entity_id, virtual_accounts, kyb_info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    parent_corporate: ").append(toIndentedString(parent_corporate)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    transac_id: ").append(toIndentedString(transac_id)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    corporate_name: ").append(toIndentedString(corporate_name)).append("\n");
    sb.append("    sub_corporates: ").append(toIndentedString(sub_corporates)).append("\n");
    sb.append("    corporate_families: ").append(toIndentedString(corporate_families)).append("\n");
    sb.append("    entity_id: ").append(toIndentedString(entity_id)).append("\n");
    sb.append("    virtual_accounts: ").append(toIndentedString(virtual_accounts)).append("\n");
    sb.append("    kyb_info: ").append(toIndentedString(kyb_info)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
