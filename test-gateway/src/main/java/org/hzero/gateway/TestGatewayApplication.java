package org.hzero.gateway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.WebApplicationType;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroGateway
@EnableDiscoveryClient

public class TestGatewayApplication {
    
        public static void main(String[] args) {
            try {
                new SpringApplicationBuilder(TestGatewayApplication.class)
                    .web(WebApplicationType.REACTIVE)
                    .run(args);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

}