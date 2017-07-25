package cn.mrdear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
