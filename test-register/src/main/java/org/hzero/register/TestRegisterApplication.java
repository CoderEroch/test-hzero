package org.hzero.register;

import org.hzero.autoconfigure.register.EnableHZeroRegister;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EurekaServerAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@Import(EurekaServerAutoConfiguration.class)
/**
 * <p>
 * 服务注册中心启动类
 * </p>
 * 
 * @author 28948 2020/12/07 16:21
 */
public class TestRegisterApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(TestRegisterApplication.class, args);
        }

}