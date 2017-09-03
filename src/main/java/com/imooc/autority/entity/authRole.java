package com.imooc.autority.entity;

import javax.persistence.*;

@Entity(name="authRole")
@Table(name="auth_role")
public class authRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String createtime;
  private String updatetime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
