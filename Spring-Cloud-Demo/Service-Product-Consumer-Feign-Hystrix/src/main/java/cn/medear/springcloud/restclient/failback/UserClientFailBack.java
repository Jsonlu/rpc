package cn.medear.springcloud.restclient.failback;

import org.springframework.stereotype.Component;

import cn.medear.springcloud.entity.User;
import cn.medear.springcloud.restclient.UserClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:调用断路器
 */
@Slf4j
@Component
public class UserClientFailBack implements FallbackFactory<UserClient> {

    private static UserClient userClient = new UserClientFailBackWithInfo();

    /**
     * 错误返回内容配置
     */
    @Override
    public UserClient create(Throwable throwable) {
//    log.error("UserClient hystrix open,error is {}",throwable.getMessage());
        return userClient;
    }


    private static class UserClientFailBackWithInfo implements UserClient {
        @Override
        public User findById(Long id) {
            User user = new User();
            user.setId(0L);
            user.setUsername("失败用户");
            return user;
        }
    }
}
