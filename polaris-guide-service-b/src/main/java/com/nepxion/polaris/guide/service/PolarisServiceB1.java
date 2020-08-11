package com.nepxion.polaris.guide.service;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.nepxion.polaris.framework.service.annotation.EnablePolarisService;

@EnablePolarisService
public class PolarisServiceB1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(PolarisServiceB1.class).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}