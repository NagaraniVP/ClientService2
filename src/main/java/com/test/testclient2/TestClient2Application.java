package com.test.testclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class TestClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestClient2Application.class, args);
	}
}
/*@Configuration
class config
{
	@Bean @LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}*/