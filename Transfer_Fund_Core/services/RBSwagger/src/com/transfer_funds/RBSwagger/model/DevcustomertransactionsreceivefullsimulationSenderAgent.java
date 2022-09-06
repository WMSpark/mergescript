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
/**
 * DevcustomertransactionsreceivefullsimulationSenderAgent
 */

public class DevcustomertransactionsreceivefullsimulationSenderAgent {
  @JsonProperty("bic")
  private String bic = null;

  public DevcustomertransactionsreceivefullsimulationSenderAgent bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevcustomertransactionsreceivefullsimulationSenderAgent devcustomertransactionsreceivefullsimulation_sender_agent = (DevcustomertransactionsreceivefullsimulationSenderAgent) o;
    return Objects.equals(this.bic, devcustomertransactionsreceivefullsimulation_sender_agent.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevcustomertransactionsreceivefullsimulationSenderAgent {\n");
    
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
