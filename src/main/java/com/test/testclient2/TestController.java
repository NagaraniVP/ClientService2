package com.test.testclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller to interact with Service "Client1" using @Feignclient & Eureka Server
 */
@RestController
public class TestController {
    @Autowired
    private TestFeignClient testFeign;


    @RequestMapping("/test/returnString")
    public String getString()
    {
        String result=testFeign.returnString();
       return result;
    }

    //Method returns Prop from Cloud Config server
    @RequestMapping("/test/propList")
    public List<String> returnPropList() {
        return testFeign.returnList();
    }

}
