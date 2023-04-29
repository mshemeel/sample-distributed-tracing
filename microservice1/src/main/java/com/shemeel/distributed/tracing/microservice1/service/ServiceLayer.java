package com.shemeel.distributed.tracing.microservice1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ServiceLayer {

    private final WebClient.Builder webClientBuilder;

    public ServiceLayer(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }


    public String callNextApi() {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8082/api/ms2")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
