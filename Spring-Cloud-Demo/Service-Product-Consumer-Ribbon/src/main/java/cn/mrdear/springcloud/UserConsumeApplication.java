package cn.mrdear.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumeApplication.class, args);
    }

}
