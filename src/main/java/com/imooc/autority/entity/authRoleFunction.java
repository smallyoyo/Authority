package com.imooc.autority.entity;


import javax.persistence.*;

@Entity(name="authRoleFunction")
@Table(name="auth_role_function")
public class authRoleFunction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long role_id;
  private Long function_id;
  private Long status;
  private String createtime;
  private String updatetime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public Long getFunction_id() {
    return function_id;
  }

  public void setFunction_id(Long function_id) {
    this.function_id = function_id;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }
}
