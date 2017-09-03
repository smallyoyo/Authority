package com.imooc.autority.entity;

import javax.persistence.*;

@Entity(name = "authFunction")
@Table(name = "auth_function")
public class authFunction {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Long parent_id;
  private String url;
  private Long serial_num;
  private Long accordion;
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

  public Long getParent_id() {
    return parent_id;
  }

  public void setParent_id(Long parent_id) {
    this.parent_id = parent_id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Long getSerial_num() {
    return serial_num;
  }

  public void setSerial_num(Long serial_num) {
    this.serial_num = serial_num;
  }

  public Long getAccordion() {
    return accordion;
  }

  public void setAccordion(Long accordion) {
    this.accordion = accordion;
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
