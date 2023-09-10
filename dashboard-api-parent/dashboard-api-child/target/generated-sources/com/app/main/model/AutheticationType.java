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
 * This is the AutheticationType model.
 */
@ApiModel(description = "This is the AutheticationType model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AutheticationType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("FullyAuth")
  private Integer fullyAuth;

  @JsonProperty("PartialAuth")
  private Integer partialAuth;

  @JsonProperty("NoAuth")
  private Integer noAuth;

  @JsonProperty("Authenticated Call")
  private Integer authenticatedCall;

  public AutheticationType fullyAuth(Integer fullyAuth) {
    this.fullyAuth = fullyAuth;
    return this;
  }

  /**
   * The fullyAuth.
   * @return fullyAuth
  */
  @ApiModelProperty(value = "The fullyAuth.")


  public Integer getFullyAuth() {
    return fullyAuth;
  }

  public void setFullyAuth(Integer fullyAuth) {
    this.fullyAuth = fullyAuth;
  }

  public AutheticationType partialAuth(Integer partialAuth) {
    this.partialAuth = partialAuth;
    return this;
  }

  /**
   * The partialAuth.
   * @return partialAuth
  */
  @ApiModelProperty(value = "The partialAuth.")


  public Integer getPartialAuth() {
    return partialAuth;
  }

  public void setPartialAuth(Integer partialAuth) {
    this.partialAuth = partialAuth;
  }

  public AutheticationType noAuth(Integer noAuth) {
    this.noAuth = noAuth;
    return this;
  }

  /**
   * The noAuth.
   * @return noAuth
  */
  @ApiModelProperty(value = "The noAuth.")


  public Integer getNoAuth() {
    return noAuth;
  }

  public void setNoAuth(Integer noAuth) {
    this.noAuth = noAuth;
  }

  public AutheticationType authenticatedCall(Integer authenticatedCall) {
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
    AutheticationType autheticationType = (AutheticationType) o;
    return Objects.equals(this.fullyAuth, autheticationType.fullyAuth) &&
        Objects.equals(this.partialAuth, autheticationType.partialAuth) &&
        Objects.equals(this.noAuth, autheticationType.noAuth) &&
        Objects.equals(this.authenticatedCall, autheticationType.authenticatedCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullyAuth, partialAuth, noAuth, authenticatedCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutheticationType {\n");
    
    sb.append("    fullyAuth: ").append(toIndentedString(fullyAuth)).append("\n");
    sb.append("    partialAuth: ").append(toIndentedString(partialAuth)).append("\n");
    sb.append("    noAuth: ").append(toIndentedString(noAuth)).append("\n");
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

