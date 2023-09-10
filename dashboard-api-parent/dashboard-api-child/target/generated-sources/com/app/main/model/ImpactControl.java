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
 * This is the ImpactControl model.
 */
@ApiModel(description = "This is the ImpactControl model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ImpactControl  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("businessUnit")
  private String businessUnit;

  @JsonProperty("dnis")
  private Integer dnis;

  public ImpactControl businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  /**
   * Business Unit name.
   * @return businessUnit
  */
  @ApiModelProperty(value = "Business Unit name.")


  public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public ImpactControl dnis(Integer dnis) {
    this.dnis = dnis;
    return this;
  }

  /**
   * DNIS.
   * @return dnis
  */
  @ApiModelProperty(value = "DNIS.")


  public Integer getDnis() {
    return dnis;
  }

  public void setDnis(Integer dnis) {
    this.dnis = dnis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpactControl impactControl = (ImpactControl) o;
    return Objects.equals(this.businessUnit, impactControl.businessUnit) &&
        Objects.equals(this.dnis, impactControl.dnis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnit, dnis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpactControl {\n");
    
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
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

