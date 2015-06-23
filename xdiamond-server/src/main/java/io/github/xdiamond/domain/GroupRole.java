package io.github.xdiamond.domain;

import java.io.Serializable;

public class GroupRole implements Serializable {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column group_roles.groupId
   * @mbggenerated
   */
  private Integer groupId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column group_roles.roleId
   * @mbggenerated
   */
  private Integer roleId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table group_roles
   * @mbggenerated
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column group_roles.groupId
   * @return  the value of group_roles.groupId
   * @mbggenerated
   */
  public Integer getGroupId() {
    return groupId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column group_roles.groupId
   * @param groupId  the value for group_roles.groupId
   * @mbggenerated
   */
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column group_roles.roleId
   * @return  the value of group_roles.roleId
   * @mbggenerated
   */
  public Integer getRoleId() {
    return roleId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column group_roles.roleId
   * @param roleId  the value for group_roles.roleId
   * @mbggenerated
   */
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }
}