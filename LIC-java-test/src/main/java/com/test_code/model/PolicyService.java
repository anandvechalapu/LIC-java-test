package com.test_code.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyService {

  @Id
  private Long id;
  private String serviceType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

}