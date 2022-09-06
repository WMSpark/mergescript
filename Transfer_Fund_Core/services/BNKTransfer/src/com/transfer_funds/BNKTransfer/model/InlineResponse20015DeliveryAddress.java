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
/**
 * InlineResponse20015DeliveryAddress
 */

public class InlineResponse20015DeliveryAddress {
  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("line3")
  private String line3 = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("line1")
  private String line1 = null;

  public InlineResponse20015DeliveryAddress zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip or Postal Code
   * @return zip
  **/
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public InlineResponse20015DeliveryAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Two-character ISO alphabetic code. Examples: FR / GB. If left blank, the country of the client will be used.
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InlineResponse20015DeliveryAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City or Town
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public InlineResponse20015DeliveryAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State, District or full Country name
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InlineResponse20015DeliveryAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Further address lines, as required
   * @return line3
  **/
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public InlineResponse20015DeliveryAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Further address lines, as required
   * @return line2
  **/
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public InlineResponse20015DeliveryAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * First Line of the address
   * @return line1
  **/
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015DeliveryAddress inline_response_200_15_delivery_address = (InlineResponse20015DeliveryAddress) o;
    return Objects.equals(this.zip, inline_response_200_15_delivery_address.zip) &&
        Objects.equals(this.country, inline_response_200_15_delivery_address.country) &&
        Objects.equals(this.city, inline_response_200_15_delivery_address.city) &&
        Objects.equals(this.state, inline_response_200_15_delivery_address.state) &&
        Objects.equals(this.line3, inline_response_200_15_delivery_address.line3) &&
        Objects.equals(this.line2, inline_response_200_15_delivery_address.line2) &&
        Objects.equals(this.line1, inline_response_200_15_delivery_address.line1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zip, country, city, state, line3, line2, line1);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015DeliveryAddress {\n");
    
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
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
