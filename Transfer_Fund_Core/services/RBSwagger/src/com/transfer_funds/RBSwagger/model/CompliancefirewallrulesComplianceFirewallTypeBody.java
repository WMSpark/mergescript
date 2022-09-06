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
 * CompliancefirewallrulesComplianceFirewallTypeBody
 */

public class CompliancefirewallrulesComplianceFirewallTypeBody {
  @JsonProperty("compliance_firewall_rules")
  private String compliance_firewall_rules = null;

  public CompliancefirewallrulesComplianceFirewallTypeBody compliance_firewall_rules(String compliance_firewall_rules) {
    this.compliance_firewall_rules = compliance_firewall_rules;
    return this;
  }

   /**
   * Get compliance_firewall_rules
   * @return compliance_firewall_rules
  **/
  public String getComplianceFirewallRules() {
    return compliance_firewall_rules;
  }

  public void setComplianceFirewallRules(String compliance_firewall_rules) {
    this.compliance_firewall_rules = compliance_firewall_rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompliancefirewallrulesComplianceFirewallTypeBody compliancefirewallrules_compliance_firewall_type_body = (CompliancefirewallrulesComplianceFirewallTypeBody) o;
    return Objects.equals(this.compliance_firewall_rules, compliancefirewallrules_compliance_firewall_type_body.compliance_firewall_rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compliance_firewall_rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompliancefirewallrulesComplianceFirewallTypeBody {\n");
    
    sb.append("    compliance_firewall_rules: ").append(toIndentedString(compliance_firewall_rules)).append("\n");
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
