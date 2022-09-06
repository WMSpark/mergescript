/*
 * Railsbank customer API
 * Public API for Railsbank customers
 *
 * OpenAPI spec version: api
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.transfer_funds.RBSwagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.transfer_funds.RBSwagger.model.V1customerledgersPartnerCompany;
/**
 * V1customerledgersPartner
 */

public class V1customerledgersPartner {
  @JsonProperty("partner_ref")
  private String partner_ref = null;

  @JsonProperty("partner_id")
  private String partner_id = null;

  @JsonProperty("company")
  private V1customerledgersPartnerCompany company = null;

  public V1customerledgersPartner partner_ref(String partner_ref) {
    this.partner_ref = partner_ref;
    return this;
  }

   /**
   * Get partner_ref
   * @return partner_ref
  **/
  public String getPartnerRef() {
    return partner_ref;
  }

  public void setPartnerRef(String partner_ref) {
    this.partner_ref = partner_ref;
  }

  public V1customerledgersPartner partner_id(String partner_id) {
    this.partner_id = partner_id;
    return this;
  }

   /**
   * Get partner_id
   * @return partner_id
  **/
  public String getPartnerId() {
    return partner_id;
  }

  public void setPartnerId(String partner_id) {
    this.partner_id = partner_id;
  }

  public V1customerledgersPartner company(V1customerledgersPartnerCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  public V1customerledgersPartnerCompany getCompany() {
    return company;
  }

  public void setCompany(V1customerledgersPartnerCompany company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1customerledgersPartner v1customerledgers_partner = (V1customerledgersPartner) o;
    return Objects.equals(this.partner_ref, v1customerledgers_partner.partner_ref) &&
        Objects.equals(this.partner_id, v1customerledgers_partner.partner_id) &&
        Objects.equals(this.company, v1customerledgers_partner.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partner_ref, partner_id, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1customerledgersPartner {\n");
    
    sb.append("    partner_ref: ").append(toIndentedString(partner_ref)).append("\n");
    sb.append("    partner_id: ").append(toIndentedString(partner_id)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
