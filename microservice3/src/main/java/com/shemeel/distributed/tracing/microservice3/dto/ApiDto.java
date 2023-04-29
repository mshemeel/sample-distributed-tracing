package com.shemeel.distributed.tracing.microservice3.dto;

import lombok.Data;

@Data
public class ApiDto {
    private String activity;
    private String type;
    private String key;
}
