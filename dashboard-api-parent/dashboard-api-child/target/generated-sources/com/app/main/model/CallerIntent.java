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
 * This is the CallerIntent model.
 */
@ApiModel(description = "This is the CallerIntent model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CallerIntent  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("callTransfer")
  private Integer callTransfer;

  @JsonProperty("GhostCALL")
  private Integer ghostCALL;

  @JsonProperty("CFT Call")
  private Integer cfTCall;

  @JsonProperty("Authenticated Call")
  private Integer authenticatedCall;

  public CallerIntent callTransfer(Integer callTransfer) {
    this.callTransfer = callTransfer;
    return this;
  }

  /**
   * The callTransfer.
   * @return callTransfer
  */
  @ApiModelProperty(value = "The callTransfer.")


  public Integer getCallTransfer() {
    return callTransfer;
  }

  public void setCallTransfer(Integer callTransfer) {
    this.callTransfer = callTransfer;
  }

  public CallerIntent ghostCALL(Integer ghostCALL) {
    this.ghostCALL = ghostCALL;
    return this;
  }

  /**
   * The GhostCALL.
   * @return ghostCALL
  */
  @ApiModelProperty(value = "The GhostCALL.")


  public Integer getGhostCALL() {
    return ghostCALL;
  }

  public void setGhostCALL(Integer ghostCALL) {
    this.ghostCALL = ghostCALL;
  }

  public CallerIntent cfTCall(Integer cfTCall) {
    this.cfTCall = cfTCall;
    return this;
  }

  /**
   * The CFT Call.
   * @return cfTCall
  */
  @ApiModelProperty(value = "The CFT Call.")


  public Integer getCfTCall() {
    return cfTCall;
  }

  public void setCfTCall(Integer cfTCall) {
    this.cfTCall = cfTCall;
  }

  public CallerIntent authenticatedCall(Integer authenticatedCall) {
    this.authenticatedCall = authenticatedCall;
    return this;
  }

  /**
   * The Authenticated Call.
   * @return authenticatedCall
  */
  @ApiModelProperty(value = "The Authenticated Call.")


  public Integer getAuthenticatedCall() {
    return authenticatedCall;
  }

  public void setAuthenticatedCall(Integer authenticatedCall) {
    this.authenticatedCall = authenticatedCall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallerIntent callerIntent = (CallerIntent) o;
    return Objects.equals(this.callTransfer, callerIntent.callTransfer) &&
        Objects.equals(this.ghostCALL, callerIntent.ghostCALL) &&
        Objects.equals(this.cfTCall, callerIntent.cfTCall) &&
        Objects.equals(this.authenticatedCall, callerIntent.authenticatedCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callTransfer, ghostCALL, cfTCall, authenticatedCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallerIntent {\n");
    
    sb.append("    callTransfer: ").append(toIndentedString(callTransfer)).append("\n");
    sb.append("    ghostCALL: ").append(toIndentedString(ghostCALL)).append("\n");
    sb.append("    cfTCall: ").append(toIndentedString(cfTCall)).append("\n");
    sb.append("    authenticatedCall: ").append(toIndentedString(authenticatedCall)).append("\n");
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

