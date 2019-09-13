/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Update a accounts multi settings. Properties that are null/undefined/missing are not updated
 */
@ApiModel(description = "Update a accounts multi settings. Properties that are null/undefined/missing are not updated")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class UpdateMultiSettings {
  @JsonProperty("officeOnline")
  private Boolean officeOnline = null;

  @JsonProperty("recycleBin")
  private Boolean recycleBin = null;

  @JsonProperty("versions")
  private Integer versions = null;

  /**
   * Permission for common root
   */
  public enum CommonRootPermissionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_99(99),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    CommonRootPermissionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CommonRootPermissionEnum fromValue(String text) {
      for (CommonRootPermissionEnum b : CommonRootPermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("commonRootPermission")
  private CommonRootPermissionEnum commonRootPermission = null;

  @JsonProperty("extendedPermissions")
  private Boolean extendedPermissions = null;

  @JsonProperty("allowShare")
  private Boolean allowShare = null;

  @JsonProperty("forceTwoFactor")
  private Boolean forceTwoFactor = null;

  public UpdateMultiSettings officeOnline(Boolean officeOnline) {
    this.officeOnline = officeOnline;
    return this;
  }

   /**
   * Enable Office Online for entire subscription
   * @return officeOnline
  **/
  @ApiModelProperty(value = "Enable Office Online for entire subscription")
  public Boolean isOfficeOnline() {
    return officeOnline;
  }

  public void setOfficeOnline(Boolean officeOnline) {
    this.officeOnline = officeOnline;
  }

  public UpdateMultiSettings recycleBin(Boolean recycleBin) {
    this.recycleBin = recycleBin;
    return this;
  }

   /**
   * Indicates if the recycle bin is enabled.
   * @return recycleBin
  **/
  @ApiModelProperty(value = "Indicates if the recycle bin is enabled.")
  public Boolean isRecycleBin() {
    return recycleBin;
  }

  public void setRecycleBin(Boolean recycleBin) {
    this.recycleBin = recycleBin;
  }

  public UpdateMultiSettings versions(Integer versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Number of versions keept in versioning.
   * @return versions
  **/
  @ApiModelProperty(value = "Number of versions keept in versioning.")
  public Integer getVersions() {
    return versions;
  }

  public void setVersions(Integer versions) {
    this.versions = versions;
  }

  public UpdateMultiSettings commonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
    return this;
  }

   /**
   * Permission for common root
   * @return commonRootPermission
  **/
  @ApiModelProperty(value = "Permission for common root")
  public CommonRootPermissionEnum getCommonRootPermission() {
    return commonRootPermission;
  }

  public void setCommonRootPermission(CommonRootPermissionEnum commonRootPermission) {
    this.commonRootPermission = commonRootPermission;
  }

  public UpdateMultiSettings extendedPermissions(Boolean extendedPermissions) {
    this.extendedPermissions = extendedPermissions;
    return this;
  }

   /**
   * Extended permissions in common
   * @return extendedPermissions
  **/
  @ApiModelProperty(value = "Extended permissions in common")
  public Boolean isExtendedPermissions() {
    return extendedPermissions;
  }

  public void setExtendedPermissions(Boolean extendedPermissions) {
    this.extendedPermissions = extendedPermissions;
  }

  public UpdateMultiSettings allowShare(Boolean allowShare) {
    this.allowShare = allowShare;
    return this;
  }

   /**
   * Allow share for all users
   * @return allowShare
  **/
  @ApiModelProperty(value = "Allow share for all users")
  public Boolean isAllowShare() {
    return allowShare;
  }

  public void setAllowShare(Boolean allowShare) {
    this.allowShare = allowShare;
  }

  public UpdateMultiSettings forceTwoFactor(Boolean forceTwoFactor) {
    this.forceTwoFactor = forceTwoFactor;
    return this;
  }

   /**
   * Force TwoFactor for all users
   * @return forceTwoFactor
  **/
  @ApiModelProperty(value = "Force TwoFactor for all users")
  public Boolean isForceTwoFactor() {
    return forceTwoFactor;
  }

  public void setForceTwoFactor(Boolean forceTwoFactor) {
    this.forceTwoFactor = forceTwoFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMultiSettings updateMultiSettings = (UpdateMultiSettings) o;
    return Objects.equals(this.officeOnline, updateMultiSettings.officeOnline) &&
        Objects.equals(this.recycleBin, updateMultiSettings.recycleBin) &&
        Objects.equals(this.versions, updateMultiSettings.versions) &&
        Objects.equals(this.commonRootPermission, updateMultiSettings.commonRootPermission) &&
        Objects.equals(this.extendedPermissions, updateMultiSettings.extendedPermissions) &&
        Objects.equals(this.allowShare, updateMultiSettings.allowShare) &&
        Objects.equals(this.forceTwoFactor, updateMultiSettings.forceTwoFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeOnline, recycleBin, versions, commonRootPermission, extendedPermissions, allowShare, forceTwoFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMultiSettings {\n");
    
    sb.append("    officeOnline: ").append(toIndentedString(officeOnline)).append("\n");
    sb.append("    recycleBin: ").append(toIndentedString(recycleBin)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    commonRootPermission: ").append(toIndentedString(commonRootPermission)).append("\n");
    sb.append("    extendedPermissions: ").append(toIndentedString(extendedPermissions)).append("\n");
    sb.append("    allowShare: ").append(toIndentedString(allowShare)).append("\n");
    sb.append("    forceTwoFactor: ").append(toIndentedString(forceTwoFactor)).append("\n");
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

