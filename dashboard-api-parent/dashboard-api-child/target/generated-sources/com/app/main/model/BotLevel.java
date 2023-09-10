package com.app.main.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the BotLevel model.
 */
@ApiModel(description = "This is the BotLevel model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BotLevel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Refill")
  private Integer refill;

  @JsonProperty("OrderStatus")
  private Integer orderStatus;

  @JsonProperty("Balance &amp; Payment")
  private Integer balanceAmpersandPayment;

  @JsonProperty("Retail Call")
  private Integer retailCall;

  public BotLevel refill(Integer refill) {
    this.refill = refill;
    return this;
  }

  /**
   * The Refill.
   * @return refill
  */
  @ApiModelProperty(value = "The Refill.")


  public Integer getRefill() {
    return refill;
  }

  public void setRefill(Integer refill) {
    this.refill = refill;
  }

  public BotLevel orderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * The OrderStatus.
   * @return orderStatus
  */
  @ApiModelProperty(value = "The OrderStatus.")


  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

  public BotLevel balanceAmpersandPayment(Integer balanceAmpersandPayment) {
    this.balanceAmpersandPayment = balanceAmpersandPayment;
    return this;
  }

  /**
   * The Balance & Payment.
   * @return balanceAmpersandPayment
  */
  @ApiModelProperty(value = "The Balance & Payment.")


  public Integer getBalanceAmpersandPayment() {
    return balanceAmpersandPayment;
  }

  public void setBalanceAmpersandPayment(Integer balanceAmpersandPayment) {
    this.balanceAmpersandPayment = balanceAmpersandPayment;
  }

  public BotLevel retailCall(Integer retailCall) {
    this.retailCall = retailCall;
    return this;
  }

  /**
   * The Retail Call.
   * @return retailCall
  */
  @ApiModelProperty(value = "The Retail Call.")


  public Integer getRetailCall() {
    return retailCall;
  }

  public void setRetailCall(Integer retailCall) {
    this.retailCall = retailCall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotLevel botLevel = (BotLevel) o;
    return Objects.equals(this.refill, botLevel.refill) &&
        Objects.equals(this.orderStatus, botLevel.orderStatus) &&
        Objects.equals(this.balanceAmpersandPayment, botLevel.balanceAmpersandPayment) &&
        Objects.equals(this.retailCall, botLevel.retailCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refill, orderStatus, balanceAmpersandPayment, retailCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotLevel {\n");
    
    sb.append("    refill: ").append(toIndentedString(refill)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    balanceAmpersandPayment: ").append(toIndentedString(balanceAmpersandPayment)).append("\n");
    sb.append("    retailCall: ").append(toIndentedString(retailCall)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

