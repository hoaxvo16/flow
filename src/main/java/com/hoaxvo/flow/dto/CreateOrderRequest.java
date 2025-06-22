package com.hoaxvo.flow.dto;

import lombok.Data;

@Data
public class CreateOrderRequest {
  private String requestId;
  private String cusNo;
  private String companyId;
}
