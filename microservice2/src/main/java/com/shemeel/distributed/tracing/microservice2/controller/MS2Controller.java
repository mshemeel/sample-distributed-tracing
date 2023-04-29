package com.shemeel.distributed.tracing.microservice2.controller;


import com.shemeel.distributed.tracing.microservice2.service.ServiceLayer;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Data
public class MS2Controller {
    private final ServiceLayer serviceLayer;
    @GetMapping("/ms2")
    public String getData(){
        return serviceLayer.callNextApi();
    }
}
