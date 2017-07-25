import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:
 */
@SpringBootApplication(scanBasePackages = "cn.medear.springcloud")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "cn.medear.springcloud.restclient")
public class UserConsumeFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumeFeignHystrixApplication.class, args);
    }
}
