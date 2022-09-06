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
import java.time.LocalDateTime;
/**
 * V1customerendusersenduserIdkycchecksEnduserIdv
 */

public class V1customerendusersenduserIdkycchecksEnduserIdv {
  /**
   * Status of idv check
   */
  public enum IdvStatusEnum {
    APPROVED("idv-status-approved"),
    DECLINED("idv-status-declined");

    private String value;

    IdvStatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static IdvStatusEnum fromValue(String input) {
      for (IdvStatusEnum b : IdvStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("idv_status")
  private IdvStatusEnum idv_status = null;

  @JsonProperty("created_at")
  private LocalDateTime created_at = null;

  @JsonProperty("last_modified_at")
  private LocalDateTime last_modified_at = null;

  public V1customerendusersenduserIdkycchecksEnduserIdv idv_status(IdvStatusEnum idv_status) {
    this.idv_status = idv_status;
    return this;
  }

   /**
   * Status of idv check
   * @return idv_status
  **/
  public IdvStatusEnum getIdvStatus() {
    return idv_status;
  }

  public void setIdvStatus(IdvStatusEnum idv_status) {
    this.idv_status = idv_status;
  }

  public V1customerendusersenduserIdkycchecksEnduserIdv created_at(LocalDateTime created_at) {
    this.created_at = created_at;
    return this;
  }

   /**
   * Get created_at
   * @return created_at
  **/
  public LocalDateTime getCreatedAt() {
    return created_at;
  }

  public void setCreatedAt(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  public V1customerendusersenduserIdkycchecksEnduserIdv last_modified_at(LocalDateTime last_modified_at) {
    this.last_modified_at = last_modified_at;
    return this;
  }

   /**
   * Get last_modified_at
   * @return last_modified_at
  **/
  public LocalDateTime getLastModifiedAt() {
    return last_modified_at;
  }

  public void setLastModifiedAt(LocalDateTime last_modified_at) {
    this.last_modified_at = last_modified_at;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1customerendusersenduserIdkycchecksEnduserIdv v1customerendusersenduser_idkycchecks_enduser_idv = (V1customerendusersenduserIdkycchecksEnduserIdv) o;
    return Objects.equals(this.idv_status, v1customerendusersenduser_idkycchecks_enduser_idv.idv_status) &&
        Objects.equals(this.created_at, v1customerendusersenduser_idkycchecks_enduser_idv.created_at) &&
        Objects.equals(this.last_modified_at, v1customerendusersenduser_idkycchecks_enduser_idv.last_modified_at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idv_status, created_at, last_modified_at);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1customerendusersenduserIdkycchecksEnduserIdv {\n");
    
    sb.append("    idv_status: ").append(toIndentedString(idv_status)).append("\n");
    sb.append("    created_at: ").append(toIndentedString(created_at)).append("\n");
    sb.append("    last_modified_at: ").append(toIndentedString(last_modified_at)).append("\n");
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
