package com.zhoudq.gateway.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a")
public interface ServiceAClient {

    @GetMapping("/hello")
    public String getHelloFromServiceA();
}
