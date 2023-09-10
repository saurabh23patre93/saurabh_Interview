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
 * This is the Containment model.
 */
@ApiModel(description = "This is the Containment model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Containment  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("contained")
  private Integer contained;

  @JsonProperty("notContained")
  private Integer notContained;

  public Containment total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The ID of Containment.
   * @return total
  */
  @ApiModelProperty(value = "The ID of Containment.")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Containment contained(Integer contained) {
    this.contained = contained;
    return this;
  }

  /**
   * The dnis.
   * @return contained
  */
  @ApiModelProperty(value = "The dnis.")


  public Integer getContained() {
    return contained;
  }

  public void setContained(Integer contained) {
    this.contained = contained;
  }

  public Containment notContained(Integer notContained) {
    this.notContained = notContained;
    return this;
  }

  /**
   * The dnis.
   * @return notContained
  */
  @ApiModelProperty(value = "The dnis.")


  public Integer getNotContained() {
    return notContained;
  }

  public void setNotContained(Integer notContained) {
    this.notContained = notContained;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Containment containment = (Containment) o;
    return Objects.equals(this.total, containment.total) &&
        Objects.equals(this.contained, containment.contained) &&
        Objects.equals(this.notContained, containment.notContained);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, contained, notContained);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Containment {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    contained: ").append(toIndentedString(contained)).append("\n");
    sb.append("    notContained: ").append(toIndentedString(notContained)).append("\n");
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

