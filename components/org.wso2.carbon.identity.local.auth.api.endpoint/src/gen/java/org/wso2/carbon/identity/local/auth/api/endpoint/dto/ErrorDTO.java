package org.wso2.carbon.identity.local.auth.api.endpoint.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
public class ErrorDTO  {
  
  
  
  private String code = null;
  
  
  private String message = null;
  
  
  private String description = null;
  private String redirectURL = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("redirectURL")
  public String getRedirectURL() {
    return redirectURL;
  }
  public void setRedirectURL(String description) {
    this.redirectURL = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDTO {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  redirectURL: ").append(redirectURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
