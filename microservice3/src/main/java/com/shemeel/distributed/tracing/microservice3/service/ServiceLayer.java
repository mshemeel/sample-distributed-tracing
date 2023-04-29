package com.shemeel.distributed.tracing.microservice3.service;

import com.shemeel.distributed.tracing.microservice3.dto.ApiDto;
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
                .uri("https://www.boredapi.com/api/activity")
                .retrieve()
                .bodyToMono(ApiDto.class)
                .block().getActivity();
    }
}
