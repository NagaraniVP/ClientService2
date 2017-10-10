package com.test.testclient2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Feign Interface for CLient2-RestControllerTest
 */
@FeignClient(value = "test-client1")
public interface TestFeignClient {
    @RequestMapping("/test/getString")
    public String returnString();

    @RequestMapping("/test/getList")
    public List<String> returnList();

}
