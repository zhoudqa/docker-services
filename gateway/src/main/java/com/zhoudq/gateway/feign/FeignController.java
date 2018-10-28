package com.zhoudq.gateway.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private ServiceAClient serviceAClient;

    @GetMapping("/hello")
    public String getHelloFromServiceA(){
        return "This is a hello greeting i got from service a:"+serviceAClient.getHelloFromServiceA();
    }
}
